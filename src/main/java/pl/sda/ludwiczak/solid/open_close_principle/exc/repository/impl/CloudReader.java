package pl.sda.ludwiczak.solid.open_close_principle.exc.repository.impl;

import pl.sda.ludwiczak.solid.open_close_principle.exc.exception.MyCheckedExc;
import pl.sda.ludwiczak.solid.open_close_principle.exc.repository.UserDao;

public class CloudReader implements UserDao {

    @Override
    public String getUserFromDb() throws MyCheckedExc {
        throw new MyCheckedExc("Not found!!!");
    }

}
