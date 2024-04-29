package models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import controllers.forms.CreateUserForm;
import io.ebean.Model;
import io.ebean.annotation.CreatedTimestamp;
import io.ebean.annotation.UpdatedTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "users")
public class User extends Model {

    @Id
    private Long id;
    private String name;
    private String email;
    @ManyToOne
    @JsonBackReference
    private Company company;
    @UpdatedTimestamp
    private Instant updatedAt;
    @CreatedTimestamp
    private Instant createdAt;

    public User() {
    }

    public static User from(CreateUserForm createUserForm) {
        User user = new User();
        user.setName(createUserForm.getName());
        user.setEmail(createUserForm.getEmail());
        return user;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }
}
