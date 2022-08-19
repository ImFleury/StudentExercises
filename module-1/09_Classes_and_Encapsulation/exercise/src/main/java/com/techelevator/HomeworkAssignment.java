package com.techelevator;

public class HomeworkAssignment {

    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;
 //   private String letterGrade;

    public String getLetterGrade () {
        if (((1.0 * earnedMarks / possibleMarks) * 100) >= 90) {
            return "A";
        } else if ((((double)earnedMarks / possibleMarks) * 100) >= 80) {
            return "B";
        } else if (((1.0 * earnedMarks / possibleMarks) * 100) >= 70) {
            return "C";
        } else if (((1.0 * earnedMarks / possibleMarks) * 100) >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
    public HomeworkAssignment (int possibleMarks, String submitterNames) {
        this.possibleMarks = possibleMarks;
        this.earnedMarks = earnedMarks;
        this.submitterName = submitterNames;
    }

    public  int getEarnedMarks(){
        return this.earnedMarks;
    }
    public void setEarnedMarks(int earnedMarks){
        this.earnedMarks = earnedMarks;
    }
    public int getPossibleMarks(){
        return this.possibleMarks;
    }
    public String getSubmitterName(){
        return this.submitterName;
    }



}
   /* public long getEmployeeId() {
        return this.employeeId;
    }
    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }*/
