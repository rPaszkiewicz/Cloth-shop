package service;

import entity.User;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class UserServiceTest {

    @Test
    public void testGetAllUsers(){
        List<User> users = new ArrayList<User>();
        users.add(new User(1L,"Pablo","escobar123"));
        users.add(new User(2L,"Omar","Shariff123"));

        UserServiceImpl userService = new UserServiceImpl(users);
        List<User> usersFromTestClass = userService.getAllUsers();

        Assert.assertEquals(users,usersFromTestClass);
    }

    @Test
    public void testAddUser(){
        List<User> users = new ArrayList<User>();
        User user = new User(1L,"admin","admin");
        users.add(user);

        UserServiceImpl userService = new UserServiceImpl();
        userService.addUser(user);
        List<User> usersFromTestClass = userService.getAllUsers();

        Assert.assertEquals(users,usersFromTestClass);
    }

    @Test
    public void testRemoveUsers(){
        List<User> users = new ArrayList<User>();
        User admin = new User(1L,"admin","admin");
        User pablo = new User(2L,"Pablo","Pablo");
        users.add(admin);
        users.add(pablo);

        UserServiceImpl userService = new UserServiceImpl(users);
        userService.removeUserById(1L);
        users.remove(admin);
        List<User> usersFromTestClass = userService.getAllUsers();

        Assert.assertEquals(users,usersFromTestClass);

    }
}
