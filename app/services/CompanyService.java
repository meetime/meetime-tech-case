package services;

import controllers.forms.CreateCompanyForm;
import models.Company;
import models.repositories.EbeanCompanyRepository;

import javax.inject.Inject;

public class CompanyService {

    private final EbeanCompanyRepository companyRepository;

    @Inject
    public CompanyService(EbeanCompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public void createCompany(CreateCompanyForm createCompanyForm) {
        Company company = Company.from(createCompanyForm);
        companyRepository.createCompany(company);
    }

    public Company getCompanyById(Long id) {
        return companyRepository.getCompanyById(id);
    }

    public Company getCompanyByUserId(Long id) {
        System.out.println("Company retrieved: " + id);
        return new Company();
    }

    public void updateCompany() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void deleteCompany(Long id) {
        companyRepository.deleteCompany(id);
    }
}
