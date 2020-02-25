package Day02.com.annotations;

public class Credentials {

    @Length(min = 6, max = 12)
    private String userName;

    @Length(min = 8, max = 8)
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}