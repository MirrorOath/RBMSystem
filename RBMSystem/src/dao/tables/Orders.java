package dao.tables;

public class Orders {
    private Integer id;
    private Integer streamNumber;
    private String dishType;
    private Integer dishNumber;
    private String dishName;
    private String isOrdered;
    private String isGifts;
    private String isBack;
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

    public String getDishType() {
        return dishType;
    }

    public void setDishType(String dishType) {
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

    public String getIsOrdered() {
        return isOrdered;
    }

    public void setIsOrdered(String isOrdered) {
        this.isOrdered = isOrdered;
    }

    public String getIsGifts() {
        return isGifts;
    }

    public void setIsGifts(String isGifts) {
        this.isGifts = isGifts;
    }

    public String getIsBack() {
        return isBack;
    }

    public void setIsBack(String isBack) {
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
