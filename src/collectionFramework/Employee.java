package collectionFramework;

public class Employee implements Comparable<Employee>{
    private Integer employeeId;
    private String employeeName;
    private Float employeeSalary;

    public Employee() {
    }

    public Employee(Integer employeeId, String employeeName, Float employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Float getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(Float employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSalary=" + employeeSalary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
//        return (int)(this.employeeSalary- o.employeeSalary);
        return this.getEmployeeName().compareTo(o.getEmployeeName());
    }
}
