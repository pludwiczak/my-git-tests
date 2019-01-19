package pl.sda.ludwiczak.solid.open_close_principle.exc.service.impl;

import pl.sda.ludwiczak.solid.open_close_principle.exc.domain.User;
import pl.sda.ludwiczak.solid.open_close_principle.exc.exception.MyCheckedExc;
import pl.sda.ludwiczak.solid.open_close_principle.exc.repository.UserDao;
import pl.sda.ludwiczak.solid.open_close_principle.exc.service.UserService;
import java.util.Objects;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = Objects.requireNonNull(userDao);

    }

    @Override
    public User getUser() throws MyCheckedExc {
        System.out.println("Director hard work...");
        return new User (userDao.getUserFromDb());
    }

}
