package controllers;

import controllers.forms.CreateUserForm;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import services.UserService;

import javax.inject.Inject;

public class UserController extends Controller {

    private FormFactory formFactory;
    private UserService userService;

    @Inject
    public UserController(FormFactory formFactory, UserService userService) {
        this.formFactory = formFactory;
        this.userService = userService;
    }

    public Result createUser(Http.Request request) {
        Form<CreateUserForm> createUserFormForm = formFactory.form(CreateUserForm.class)
                .bindFromRequest(request);
        userService.createUser(createUserFormForm.get());
        return ok();
    }

    public Result updateUser() {
        userService.updateUser();
        return ok();
    }

    public Result getUser(Long id) {
        userService.getUser(id);
        return ok();
    }

    public Result deleteUser() {
        userService.deleteUser();
        return ok();
    }
}
