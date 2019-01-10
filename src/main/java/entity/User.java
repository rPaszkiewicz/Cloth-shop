package entity;

public class User {
    private long id;
    private String login;
    private String password;

    public User(long id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public Long getId(){
        return id;
    }

    public String getLogin(){
        return login;
    }

    public String getPassword(){
        return password;
    }

    @Override
    public String toString() {
        return "User: " + "\n" +
                "  id: " +id + "\n" +
                "  login: " + login + "\n" +
                "  password: " + password;
    }
}
