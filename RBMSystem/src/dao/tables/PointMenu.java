package dao.tables;

public class PointMenu {
    private Integer id;
    private Integer numbering;
    private Integer seatRotationId;
    private Integer meals;
    private Integer peopleCount;
    private String dishName;
    private Integer isPlaceOrder;
    private Integer isGive;
    private Integer isReturn;
    private Double price;
    private Double discount;
    private Integer cookingId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumbering() {
        return numbering;
    }

    public void setNumbering(Integer numbering) {
        this.numbering = numbering;
    }

    public Integer getSeatRotationId() {
        return seatRotationId;
    }

    public void setSeatRotationId(Integer seatRotationId) {
        this.seatRotationId = seatRotationId;
    }

    public Integer getMeals() {
        return meals;
    }

    public void setMeals(Integer meals) {
        this.meals = meals;
    }

    public Integer getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(Integer peopleCount) {
        this.peopleCount = peopleCount;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public Integer getIsPlaceOrder() {
        return isPlaceOrder;
    }

    public void setIsPlaceOrder(Integer isPlaceOrder) {
        this.isPlaceOrder = isPlaceOrder;
    }

    public Integer getIsGive() {
        return isGive;
    }

    public void setIsGive(Integer isGive) {
        this.isGive = isGive;
    }

    public Integer getIsReturn() {
        return isReturn;
    }

    public void setIsReturn(Integer isReturn) {
        this.isReturn = isReturn;
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

    public Integer getCookingId() {
        return cookingId;
    }

    public void setCookingId(Integer cookingId) {
        this.cookingId = cookingId;
    }

    @Override
    public String toString() {
        return "PointMenu [id=" + id + ", numbering=" + numbering + ", seatRotationId=" + seatRotationId + ", meals="
                + meals + ", peopleCount=" + peopleCount + ", dishName=" + dishName + ", isPlaceOrder=" + isPlaceOrder
                + ", isGive=" + isGive + ", isReturn=" + isReturn + ", price=" + price + ", discount=" + discount
                + ", cookingId=" + cookingId + "]";
    }

}
