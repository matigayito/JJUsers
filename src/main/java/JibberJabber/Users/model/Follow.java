package JibberJabber.Users.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Follow {
    @Id
    private float id;

    private UUID follower;
    private UUID followee;

    public float getId() {
        return id;
    }

    public UUID getFolower() {
        return follower;
    }

    public UUID getFolowee() {
        return followee;
    }

    public void setId(float id) {
        this.id = id;
    }

    public void setFolower(UUID folower) {
        this.follower = folower;
    }

    public void setFolowee(UUID folowee) {
        this.followee = folowee;
    }
}
