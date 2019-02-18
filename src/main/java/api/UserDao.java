package api;

import entity.User;

import java.io.IOException;
import java.util.List;

public interface UserDao {

   void saveUser(User user)throws IOException;
   void saveUsers(List<User> users)throws IOException ;
   List<User>  getAllUsers()throws IOException;
   User getUserByLogin(String userLogin)throws IOException;
   User getUserById(Long userId)throws IOException;
   void removeUserByLogin(String userLogin)throws IOException;
   void removeUserById(Long userId)throws IOException;
}
