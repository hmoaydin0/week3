package msku.ceng.madlab.week3;

import android.graphics.Bitmap;
import android.location.Location;

public class Post {
    private String massage;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    private Location location;
    private Bitmap image;
}
