package services;

import controllers.forms.CreateUserForm;
import models.User;
import models.repositories.EbeanUserRepository;

import javax.inject.Inject;

public class UserService {

    private final EbeanUserRepository userRepository;

    @Inject
    public UserService(EbeanUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(CreateUserForm createUserForm) {
        User user = User.from(createUserForm);
        userRepository.createUser(user);
    }

    public void updateUser() {
        throw new UnsupportedOperationException("Not implemented");
    }

    public void getUser(Long id) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public void deleteUser() {
        throw new UnsupportedOperationException("Not implemented");
    }
}
