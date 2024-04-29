package models;

import controllers.forms.CreateCompanyForm;
import io.ebean.Model;
import io.ebean.annotation.CreatedTimestamp;
import io.ebean.annotation.UpdatedTimestamp;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "companies")
public class Company extends Model {

    @Id
    private Long id;
    private String name;
    private String address;
    private String phone;
    @OneToMany(mappedBy = "company")
    private List<User> users;
    @CreatedTimestamp
    private Timestamp createdAt;
    @UpdatedTimestamp
    private Timestamp updatedAt;

    public Company() {
    }

    public static Company from(CreateCompanyForm createCompanyForm) {
        Company company = new Company();
        company.setName(createCompanyForm.getName());
        company.setAddress(createCompanyForm.getAddress());
        company.setPhone(createCompanyForm.getPhone());
        return company;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }
}
