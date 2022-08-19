package com.techelevator.projects.dao;

import com.techelevator.projects.model.Timesheet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.*;

public class JdbcTimesheetDaoTests extends BaseDaoTests {

    private static final Timesheet TIMESHEET_1 = new Timesheet(1, 1, 1,
            LocalDate.parse("2021-01-01"), 1.0, true, "Timesheet 1");
    private static final Timesheet TIMESHEET_2 = new Timesheet(2, 1, 1,
            LocalDate.parse("2021-01-02"), 1.5, true, "Timesheet 2");
    private static final Timesheet TIMESHEET_3 = new Timesheet(3, 2, 1,
            LocalDate.parse("2021-01-01"), 0.25, true, "Timesheet 3");
    private static final Timesheet TIMESHEET_4 = new Timesheet(4, 2, 2,
            LocalDate.parse("2021-02-01"), 2.0, false, "Timesheet 4");
    
    private JdbcTimesheetDao sut;
    private Timesheet testTimesheet;


    @Before
    public void setup() {
        sut = new JdbcTimesheetDao(dataSource);
        testTimesheet = new Timesheet(5, 1, 2, LocalDate.parse("2022-01-03"), 0.0, false,
                "Timesheet 5");
    }

    @Test
    public void getTimesheet_returns_correct_timesheet_for_id() {
        Timesheet  timesheet = sut.getTimesheet(1);
        assertTimesheetsMatch(TIMESHEET_1, timesheet);

        timesheet = sut.getTimesheet(2);
        assertTimesheetsMatch(TIMESHEET_2, timesheet);
    }

    @Test
    public void getTimesheet_returns_null_when_id_not_found() {
        Timesheet timesheet = sut.getTimesheet(99);
        assertNull(timesheet);
    }

    @Test
    public void getTimesheetsByEmployeeId_returns_list_of_all_timesheets_for_employee(){
        List<Timesheet> timesheets = sut.getTimesheetsByEmployeeId(1);
        Assert.assertEquals(2, timesheets.size());
        assertTimesheetsMatch(TIMESHEET_1, timesheets.get(0));
        assertTimesheetsMatch(TIMESHEET_2, timesheets.get(1));

        timesheets = sut.getTimesheetsByEmployeeId(2);
        Assert.assertEquals(2, timesheets.size());
        assertTimesheetsMatch(TIMESHEET_3, timesheets.get(0));
        assertTimesheetsMatch(TIMESHEET_4, timesheets.get(1));
    }

    @Test
    public void getTimesheetsByProjectId_returns_list_of_all_timesheets_for_project() {
        List<Timesheet> timesheets = sut.getTimesheetsByProjectId(1);
        Assert.assertEquals(3, timesheets.size());
        assertTimesheetsMatch(TIMESHEET_1, timesheets.get(0));
        assertTimesheetsMatch(TIMESHEET_2, timesheets.get(1));
        assertTimesheetsMatch(TIMESHEET_3, timesheets.get(2));

    timesheets = sut.getTimesheetsByProjectId(2);
        Assert.assertEquals(1, timesheets.size());
        assertTimesheetsMatch(TIMESHEET_4, timesheets.get(0));
}
    @Test
    public void createTimesheet_returns_timesheet_with_id_and_expected_values() {
        Timesheet createdTimesheet = sut.createTimesheet(testTimesheet);

        Integer newId = createdTimesheet.getTimesheetId();
        Assert.assertTrue(newId > 0);

        testTimesheet.setTimesheetId(newId);
        assertTimesheetsMatch(testTimesheet, createdTimesheet);
    }


    @Test
    public void created_timesheet_has_expected_values_when_retrieved() {
    Timesheet createdTimesheet = sut.createTimesheet(testTimesheet);

    Integer newId = createdTimesheet.getTimesheetId();
    Timesheet retrievedCity = sut.getTimesheet(newId);

   assertTimesheetsMatch(createdTimesheet, retrievedCity);
}
    @Test
    public void updated_timesheet_has_expected_values_when_retrieved() {
        Timesheet timesheetToUpdate = sut.getTimesheet(1);

        timesheetToUpdate.setEmployeeId(2);
        timesheetToUpdate.setProjectId(1);
        timesheetToUpdate.setDateWorked(LocalDate.parse("2022-01-03"));
        timesheetToUpdate.setHoursWorked(2.5);
        timesheetToUpdate.setBillable(false);
        timesheetToUpdate.setDescription("Timesheet 10");

        sut.updateTimesheet(timesheetToUpdate);

        Timesheet retrievedTimesheet = sut.getTimesheet(1);
        assertTimesheetsMatch(timesheetToUpdate, retrievedTimesheet);
    }

    @Test
    public void deleted_timesheet_cant_be_retrieved() {
        sut.deleteTimesheet(1);

        Timesheet retrievedTimesheet = sut.getTimesheet(1);
        Assert.assertNull(retrievedTimesheet);

        List<Timesheet> timesheets = sut.getTimesheetsByEmployeeId(1);
        Assert.assertEquals(1, timesheets.size());
        assertTimesheetsMatch(TIMESHEET_2, timesheets.get(0));
    }

    @Test
    public void getBillableHours_returns_correct_total() {
        double totalBillableHours = sut.getBillableHours(1, 1);
        Assert.assertEquals(2.5, totalBillableHours, 0.01);
        totalBillableHours = sut.getBillableHours(2, 1);
        Assert.assertEquals(0.25, totalBillableHours, 0.01);
        totalBillableHours = sut.getBillableHours(2, 2);
        Assert.assertEquals(0.0, totalBillableHours, 0.01);

    }

    private void assertTimesheetsMatch(Timesheet expected, Timesheet actual) {
        assertEquals(expected.getTimesheetId(), actual.getTimesheetId());
        assertEquals(expected.getEmployeeId(), actual.getEmployeeId());
        assertEquals(expected.getProjectId(), actual.getProjectId());
        assertEquals(expected.getDateWorked(), actual.getDateWorked());
        assertEquals(expected.getHoursWorked(), actual.getHoursWorked(), 0.001);
        assertEquals(expected.isBillable(), actual.isBillable());
        assertEquals(expected.getDescription(), actual.getDescription());
    }

}
