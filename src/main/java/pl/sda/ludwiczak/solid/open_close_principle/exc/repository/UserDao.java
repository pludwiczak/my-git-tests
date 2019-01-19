package pl.sda.ludwiczak.solid.open_close_principle.exc.repository;

import pl.sda.ludwiczak.solid.open_close_principle.exc.exception.MyCheckedExc;

public interface UserDao { // Data Access Object

    String getUserFromDb() throws MyCheckedExc;

}