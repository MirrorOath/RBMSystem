package dao.tables;

public class Supplier {
    private Integer id;
    private Integer numbering;
    private String name;
    private String rawMaterialName;
    private String address;
    private String phoneNumber;
    private String rawMOrigin;
    private String fax;
    private String contacts;
    private String contactsNumber;
    private String consumptionUnit;
    private Integer contractId;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRawMaterialName() {
        return rawMaterialName;
    }

    public void setRawMaterialName(String rawMaterialName) {
        this.rawMaterialName = rawMaterialName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRawMOrigin() {
        return rawMOrigin;
    }

    public void setRawMOrigin(String rawMOrigin) {
        this.rawMOrigin = rawMOrigin;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getContactsNumber() {
        return contactsNumber;
    }

    public void setContactsNumber(String contactsNumber) {
        this.contactsNumber = contactsNumber;
    }

    public String getConsumptionUnit() {
        return consumptionUnit;
    }

    public void setConsumptionUnit(String consumptionUnit) {
        this.consumptionUnit = consumptionUnit;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    @Override
    public String toString() {
        return "Supplier [id=" + id + ", numbering=" + numbering + ", name=" + name + ", rawMaterialName="
                + rawMaterialName + ", address=" + address + ", phoneNumber=" + phoneNumber + ", rawMOrigin="
                + rawMOrigin + ", fax=" + fax + ", contacts=" + contacts + ", contactsNumber=" + contactsNumber
                + ", consumptionUnit=" + consumptionUnit + ", contractId=" + contractId + "]";
    }

}
