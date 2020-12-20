package domain;

/**
 *
 * @author SC
 */
public class UserDTO {

    private int idUser;
    private String userName;
    private String password;

    public UserDTO() {
    }

    public UserDTO(int idUser) {
        this.idUser = idUser;
    }

    public UserDTO(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public UserDTO(int idUser, String userName, String password) {
        this.idUser = idUser;
        this.userName = userName;
        this.password = password;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nUser{idUser=").append(idUser);
        sb.append(", userName=").append(userName);
        sb.append(", password=").append(password);
        sb.append('}');
        return sb.toString();
    }

}
