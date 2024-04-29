package controllers.forms;

import play.data.validation.Constraints;

public class CreateUserForm {

    @Constraints.Required
    @Constraints.MinLength(3)
    private String name;
    @Constraints.Required
    private String email;
    @Constraints.Required
    private Long companyId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }
}
