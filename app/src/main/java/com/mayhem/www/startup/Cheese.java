package com.mayhem.www.startup;

/**
 * Created by hp on 12/15/2017.
 */

public class Cheese {
    public String Name;
    public String Description;

    public Cheese(String name, String description) {
        Name = name;
        Description = description;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
