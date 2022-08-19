package model;

public class EmployeeJob {
    private int id;
    private String name;
    public double salary;
    public String jobName;

    @Override
    public String toString() {
        return "EmployeeJob{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", jobName='" + jobName + '\'' +
                '}';
    }

    public EmployeeJob(int id, String name, double salary, String jobName) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.jobName = jobName;
    }

    public EmployeeJob() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
}
