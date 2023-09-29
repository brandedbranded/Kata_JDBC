package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private final static UserService userService = new UserServiceImpl();
    public static void main(String[] args) {
        userService.createUsersTable();
        userService.saveUser("Bob","Bobov", (byte) 12);
        userService.saveUser("Shmel","Shmelev", (byte) 15);
        userService.saveUser("Zob","Zobov", (byte) 17);
        userService.saveUser("Bred","Bredov", (byte) 20);
        userService.getAllUsers();
        userService.removeUserById(2);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }


}
