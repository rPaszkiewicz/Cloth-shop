package dao;

import api.UserDao;
import entity.User;
import entity.parser.UserParser;
import utils.FileUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    private final String fileName;

    public UserDaoImpl(String fileName)throws IOException{
        this.fileName = fileName;
        FileUtils.createNewFile(fileName);
    }

    public void saveUser(User user)throws IOException{
        List<User> saveUsers = getAllUsers();
        saveUsers.add(user);
        saveUsers(saveUsers);

    }
    public void saveUsers(List<User> users)throws IOException{
        FileUtils.clearFile(fileName);
        PrintWriter printWriter = new PrintWriter(new FileOutputStream(fileName,true));
        for (User user : users) {
            printWriter.println(user);
        }
        printWriter.close();
    }
    public List<User>  getAllUsers()throws IOException{
        List<User> users = new ArrayList<User>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

        String lineReader = bufferedReader.readLine();
        while(lineReader!=null){
            User user = UserParser.stringToUser(lineReader);
            if (user != null)
                users.add(user);
        }
        bufferedReader.close();
        return users;
    }
    public User getUserByLogin(String userLogin)throws IOException{
        List<User> users = getAllUsers();
        for (User user : users)
            if (user.getLogin().equals(userLogin))
                return user;
            return null;
    }
    public User getUserById(Long userId)throws IOException{
        List<User> users = getAllUsers();
        for (User user : users)
            if (user.getId().equals(userId))
                return user;
            return null;
    }
    public void removeUserByLogin(String userLogin)throws IOException{
        List<User> users = getAllUsers();
        for (User user : users)
            if (user.getLogin().equals(userLogin))
                users.remove(user);
    }

    public void removeUserById(Long userId)throws IOException{
        List<User> users = getAllUsers();
        for (User user : users)
            if (user.getId().equals(userId))
                users.remove(user);
    }
}
