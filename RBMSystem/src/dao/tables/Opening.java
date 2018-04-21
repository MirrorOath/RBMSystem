package dao.tables;

import java.util.Date;

public class Opening {
    private Integer id;
    private Integer seatRotationId;
    private Integer receptionNumber;
    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSeatRotationId() {
        return seatRotationId;
    }

    public void setSeatRotationId(Integer seatRotationId) {
        this.seatRotationId = seatRotationId;
    }

    public Integer getReceptionNumber() {
        return receptionNumber;
    }

    public void setReceptionNumber(Integer receptionNumber) {
        this.receptionNumber = receptionNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Opening [id=" + id + ", seatRotationId=" + seatRotationId + ", receptionNumber=" + receptionNumber
                + ", date=" + date + "]";
    }

}
