package dao.tables;

public class Orders {
    private Integer id;
    private Integer streamNumber;
    private Integer dishType;
    private Integer dishNumber;
    private String dishName;
    private Integer isOrdered;
    private Integer isGifts;
    private Integer isBack;
    private Double price;
    private Double discount;
    private Integer producterId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStreamNumber() {
        return streamNumber;
    }

    public void setStreamNumber(Integer streamNumber) {
        this.streamNumber = streamNumber;
    }

    public Integer getDishType() {
        return dishType;
    }

    public void setDishType(Integer dishType) {
        this.dishType = dishType;
    }

    public Integer getDishNumber() {
        return dishNumber;
    }

    public void setDishNumber(Integer dishNumber) {
        this.dishNumber = dishNumber;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public Integer getIsOrdered() {
        return isOrdered;
    }

    public void setIsOrdered(Integer isOrdered) {
        this.isOrdered = isOrdered;
    }

    public Integer getIsGifts() {
        return isGifts;
    }

    public void setIsGifts(Integer isGifts) {
        this.isGifts = isGifts;
    }

    public Integer getIsBack() {
        return isBack;
    }

    public void setIsBack(Integer isBack) {
        this.isBack = isBack;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Integer getProducterId() {
        return producterId;
    }

    public void setProducterId(Integer producterId) {
        this.producterId = producterId;
    }

    @Override
    public String toString() {
        return "Orders [id=" + id + ", streamNumber=" + streamNumber + ", dishType=" + dishType + ", dishNumber="
                + dishNumber + ", dishName=" + dishName + ", isOrdered=" + isOrdered + ", isGifts=" + isGifts
                + ", isBack=" + isBack + ", price=" + price + ", discount=" + discount + ", producterId=" + producterId
                + "]";
    }

}
