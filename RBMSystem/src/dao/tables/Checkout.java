package dao.tables;

import java.util.Date;

public class Checkout {
    private Integer id;
    private Integer seatRotationId;
    private Date date;
    private Integer paymentTypes;
    private Integer currency;
    private Double amountsPayable;
    private Double actuallyPaid;
    private Double convertToRMB;
    private Double change;
    private Integer payeeId;

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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getPaymentTypes() {
        return paymentTypes;
    }

    public void setPaymentTypes(Integer paymentTypes) {
        this.paymentTypes = paymentTypes;
    }

    public Integer getCurrency() {
        return currency;
    }

    public void setCurrency(Integer currency) {
        this.currency = currency;
    }

    public Double getAmountsPayable() {
        return amountsPayable;
    }

    public void setAmountsPayable(Double amountsPayable) {
        this.amountsPayable = amountsPayable;
    }

    public Double getActuallyPaid() {
        return actuallyPaid;
    }

    public void setActuallyPaid(Double actuallyPaid) {
        this.actuallyPaid = actuallyPaid;
    }

    public Double getConvertToRMB() {
        return convertToRMB;
    }

    public void setConvertToRMB(Double convertToRMB) {
        this.convertToRMB = convertToRMB;
    }

    public Double getChange() {
        return change;
    }

    public void setChange(Double change) {
        this.change = change;
    }

    public Integer getPayeeId() {
        return payeeId;
    }

    public void setPayeeId(Integer payeeId) {
        this.payeeId = payeeId;
    }

    @Override
    public String toString() {
        return "Checkout [id=" + id + ", seatRotationId=" + seatRotationId + ", date=" + date + ", paymentTypes="
                + paymentTypes + ", currency=" + currency + ", amountsPayable=" + amountsPayable + ", actuallyPaid="
                + actuallyPaid + ", convertToRMB=" + convertToRMB + ", change=" + change + ", payeeId=" + payeeId + "]";
    }

}
