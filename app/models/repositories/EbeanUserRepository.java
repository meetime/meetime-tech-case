package models.repositories;

import models.User;

public class EbeanUserRepository {

    public void createUser(User user) {
        user.save();
    }
}
