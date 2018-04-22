package dao.tables;

import java.util.Date;

public class EmployeeAttendance {
    private Integer id;
    private Integer employeeId;
    private Date start;
    private Date end;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "EmployeeAttendance [id=" + id + ", employeeId=" + employeeId + ", start=" + start + ", end=" + end
                + "]";
    }

}
