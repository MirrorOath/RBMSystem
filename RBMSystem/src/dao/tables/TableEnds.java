package dao.tables;

import java.util.Date;

public class TableEnds {
    private Integer id;
    private Integer streamId;
    private Date date;
    private String typeOfCoin;
    private String nameOfCoin;
    private Double shouldPay;
    private Double payActually;
    private Double convertToRMB;
    private Double changeMoney;
    private Integer payeeId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStreamId() {
        return streamId;
    }

    public void setStreamId(Integer streamId) {
        this.streamId = streamId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTypeOfCoin() {
        return typeOfCoin;
    }

    public void setTypeOfCoin(String typeOfCoin) {
        this.typeOfCoin = typeOfCoin;
    }

    public String getNameOfCoin() {
        return nameOfCoin;
    }

    public void setNameOfCoin(String nameOfCoin) {
        this.nameOfCoin = nameOfCoin;
    }

    public Double getShouldPay() {
        return shouldPay;
    }

    public void setShouldPay(Double shouldPay) {
        this.shouldPay = shouldPay;
    }

    public Double getPayActually() {
        return payActually;
    }

    public void setPayActually(Double payActually) {
        this.payActually = payActually;
    }

    public Double getConvertToRMB() {
        return convertToRMB;
    }

    public void setConvertToRMB(Double convertToRMB) {
        this.convertToRMB = convertToRMB;
    }

    public Double getChangeMoney() {
        return changeMoney;
    }

    public void setChangeMoney(Double changeMoney) {
        this.changeMoney = changeMoney;
    }

    public Integer getPayeeId() {
        return payeeId;
    }

    public void setPayeeId(Integer payeeId) {
        this.payeeId = payeeId;
    }

    @Override
    public String toString() {
        return "TableEnds [id=" + id + ", streamId=" + streamId + ", date=" + date + ", typeOfCoin=" + typeOfCoin
                + ", nameOfCoin=" + nameOfCoin + ", shouldPay=" + shouldPay + ", payActually=" + payActually
                + ", convertToRMB=" + convertToRMB + ", changeMoney=" + changeMoney + ", payeeId=" + payeeId + "]";
    }

}
