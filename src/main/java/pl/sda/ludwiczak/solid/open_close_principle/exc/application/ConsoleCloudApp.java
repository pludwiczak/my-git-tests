package pl.sda.ludwiczak.solid.open_close_principle.exc.application;

import pl.sda.ludwiczak.solid.open_close_principle.exc.controller.UserController;
import pl.sda.ludwiczak.solid.open_close_principle.exc.controller.impl.UserControllerImpl;
import pl.sda.ludwiczak.solid.open_close_principle.exc.repository.UserDao;
import pl.sda.ludwiczak.solid.open_close_principle.exc.repository.impl.CloudReader;
import pl.sda.ludwiczak.solid.open_close_principle.exc.service.UserService;
import pl.sda.ludwiczak.solid.open_close_principle.exc.service.impl.UserServiceImpl;

public class ConsoleCloudApp {

    public static void main(String[] args) {
        UserDao dbDao = new CloudReader(); // tylko tu sie rozni
        UserService userService = new UserServiceImpl(dbDao);
        UserController userController = new UserControllerImpl(userService);

        userController.renderUserPage();
    }


}
