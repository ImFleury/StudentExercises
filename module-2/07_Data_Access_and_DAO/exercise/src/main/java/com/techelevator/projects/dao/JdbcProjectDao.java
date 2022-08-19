package com.techelevator.projects.dao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.techelevator.projects.model.Department;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Project;

public class JdbcProjectDao implements ProjectDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcProjectDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Project getProject(int projectId) {
		Project project = null;
		String sql = "SELECT project_id, name, from_date, to_date " +
					 "From project " +
					 "WHERE project_id = ?;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, projectId);
		if (results.next()) {
			project = mapRowToProject(results);
		}
		return project;
	}

	@Override
	public List<Project> getAllProjects() {
		List<Project> projects= new ArrayList<>();
		SqlRowSet results = jdbcTemplate.queryForRowSet("SELECT * " +
				"FROM project");
		while (results.next()) {
			projects.add(mapRowToProject(results));
		}
		return projects;
	}

	@Override
	public Project createProject(Project newProject) {
		String sql = "INSERT INTO project (project_id, name, from_date, to_date) " +
					 "VALUES (?, ?, ?, ?) RETURNING project_id;";
		Integer newId = jdbcTemplate.queryForObject(sql, Integer.class, newProject.getId(), newProject.getName(), //(What is Integer.class and why is it needed)
				newProject.getFromDate(), newProject.getToDate());

		return getProject(newId);
	}

	@Override
	public void deleteProject(int projectId) {
		String sql = "DELETE FROM timesheet WHERE project_id = ?;";
		String sql2 = "DELETE FROM project_employee WHERE project_id = ?;";
		String sql3 = "DELETE FROM project WHERE project_id = ?;";
		jdbcTemplate.update(sql, projectId);
		jdbcTemplate.update(sql2, projectId);
		jdbcTemplate.update(sql3, projectId);
	}
	private Project mapRowToProject(SqlRowSet rowSet) {
		Project project = new Project();
		project.setId(rowSet.getInt("project_id"));
		project.setName(rowSet.getString("name"));
		/*Date fromDate = rowSet.getDate("from_date");
		if (fromDate != null) {                           (Why doesnt this code work)(returns wrong date)
			project.setFromDate(fromDate.toLocalDate());
		}*/
		if(rowSet.getDate("from_date") != null){
			project.setFromDate(rowSet.getDate("from_date").toLocalDate());
		}
		/*Date toDate = rowSet.getDate("to_date");
		if (toDate != null) {
			project.setFromDate(toDate.toLocalDate());  (Why doesnt this code work)(returns wrong date)
		}*/
		if(rowSet.getDate("to_date") != null){
			project.setToDate(rowSet.getDate("to_date").toLocalDate());
		}
		return project;
	}
	

}
