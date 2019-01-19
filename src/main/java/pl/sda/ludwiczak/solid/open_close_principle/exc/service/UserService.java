package pl.sda.ludwiczak.solid.open_close_principle.exc.service;

import pl.sda.ludwiczak.solid.open_close_principle.exc.domain.User;
import pl.sda.ludwiczak.solid.open_close_principle.exc.exception.MyCheckedExc;

public interface UserService {

    User getUser() throws MyCheckedExc;

}
