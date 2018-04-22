package dao.tables;

public class RawMaterial {
    private Integer id;
    private Integer rawMId;
    private Integer dishId;
    private String rawMName;
    private String rawMType;
    private String rawMBrand;
    private String rawMOrigin;
    private String norm;
    private Integer last;
    private String purchaseUnit;
    private String consumptionUnit;
    private Integer price;
    private Integer supplierId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRawMId() {
        return rawMId;
    }

    public void setRawMId(Integer rawMId) {
        this.rawMId = rawMId;
    }

    public Integer getDishId() {
        return dishId;
    }

    public void setDishId(Integer dishId) {
        this.dishId = dishId;
    }

    public String getRawMName() {
        return rawMName;
    }

    public void setRawMName(String rawMName) {
        this.rawMName = rawMName;
    }

    public String getRawMType() {
        return rawMType;
    }

    public void setRawMType(String rawMType) {
        this.rawMType = rawMType;
    }

    public String getRawMBrand() {
        return rawMBrand;
    }

    public void setRawMBrand(String rawMBrand) {
        this.rawMBrand = rawMBrand;
    }

    public String getRawMOrigin() {
        return rawMOrigin;
    }

    public void setRawMOrigin(String rawMOrigin) {
        this.rawMOrigin = rawMOrigin;
    }

    public String getNorm() {
        return norm;
    }

    public void setNorm(String norm) {
        this.norm = norm;
    }

    public Integer getLast() {
        return last;
    }

    public void setLast(Integer last) {
        this.last = last;
    }

    public String getPurchaseUnit() {
        return purchaseUnit;
    }

    public void setPurchaseUnit(String purchaseUnit) {
        this.purchaseUnit = purchaseUnit;
    }

    public String getConsumptionUnit() {
        return consumptionUnit;
    }

    public void setConsumptionUnit(String consumptionUnit) {
        this.consumptionUnit = consumptionUnit;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    @Override
    public String toString() {
        return "RawMaterial [id=" + id + ", rawMId=" + rawMId + ", dishId=" + dishId + ", rawMName=" + rawMName
                + ", rawMType=" + rawMType + ", rawMBrand=" + rawMBrand + ", rawMOrigin=" + rawMOrigin + ", norm="
                + norm + ", last=" + last + ", purchaseUnit=" + purchaseUnit + ", consumptionUnit=" + consumptionUnit
                + ", price=" + price + ", supplierId=" + supplierId + "]";
    }

}
