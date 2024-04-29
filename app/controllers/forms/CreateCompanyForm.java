package controllers.forms;

import play.data.validation.Constraints;

public class CreateCompanyForm {

    @Constraints.Required
    @Constraints.MaxLength(3)
    private String name;
    @Constraints.Required
    @Constraints.Pattern("[0-9]{2}.[0-9]{3}.[0-9]{3}/[0-9]{4}-[0-9]{2}")
    private String cnpj;
    private String address;
    @Constraints.Pattern("[0-9]{2} [0-9]{5}-[0-9]{4}")
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
