package JibberJabber.Users.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "myuser")
public class User {

    @GeneratedValue
    @Id
    private Long id;
    private String username;
    private String password;
    @ElementCollection
    private List<Long> following;

    public User() {}

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public List<Long> getFollowing() {
        return following;
    }

    public void setFollowing(List<Long> following) {
        this.following = following;
    }
}
