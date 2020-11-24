package pojo;

import java.util.Date;

public class User {
//    id INT NOT NULL AUTO_INCREMENT
    private String id;
//    username VARCHAR(50)
    private String username;
//    password VARCHAR(50)
    private String password;
//    birthday VARCHAR(50)
    private String birthday;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
