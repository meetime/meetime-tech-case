package controllers;

import controllers.forms.CreateCompanyForm;
import models.Company;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import services.CompanyService;

import javax.inject.Inject;

public class CompanyController extends Controller {

    private CompanyService companyService;
    private FormFactory formFactory;

    @Inject
    public CompanyController(CompanyService companyService, FormFactory formFactory) {
        this.companyService = companyService;
        this.formFactory = formFactory;
    }

    public Result createCompany(Http.Request request) {
        Form<CreateCompanyForm> createCompanyFormForm = formFactory.form(CreateCompanyForm.class)
                .bindFromRequest(request);
        Long companyId = companyService.createCompany(createCompanyFormForm.get());
        return ok()
                .withHeader("Location", "/companies/" + companyId);
    }

    public Result retrieveCompany(Long id) {
        Company company = companyService.getCompanyById(id);
        return ok(Json.toJson(company));
    }

    public Result updateCompany() {
        companyService.updateCompany();
        return ok();
    }

    public Result deleteCompany(Long id) {
        companyService.deleteCompany(id);
        return ok();
    }
}
