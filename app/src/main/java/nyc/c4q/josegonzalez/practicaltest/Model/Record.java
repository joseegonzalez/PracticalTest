package nyc.c4q.josegonzalez.practicaltest.Model;

/**
 * Created by mathcore on 12/10/16.
 */

public class Record {

    private String username;
    private String profileBackground;
    private int liked;

    public int getLiked() {
        return liked;
    }

    public void setLiked(int liked) {
        this.liked = liked;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProfileBackground() {
        return profileBackground;
    }

    public void setProfileBackground(String profileBackground) {
        this.profileBackground = profileBackground;
    }
}
