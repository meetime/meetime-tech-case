package models.repositories;

import io.ebean.DB;
import models.Company;

public class EbeanCompanyRepository {

    public void createCompany(Company company) {
        company.save();
    }

    public Company getCompanyById(Long id) {
        return DB.find(Company.class)
                .where()
                .eq("id", id)
                .findOne();
    }

    public void deleteCompany(Long id) {
        DB.find(Company.class)
                .where()
                .eq("id", id)
                .delete();
    }
}
