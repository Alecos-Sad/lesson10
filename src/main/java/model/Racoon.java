package model;

import java.util.Arrays;

public class Racoon {

    private String name;
    private Owner[] owners;

    public Racoon(String name, Owner[] owners) {
        this.name = name;
        this.owners = owners;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Owner[] getOwners() {
        return owners;
    }

    public void setOwners(Owner[] owners) {
        this.owners = owners;
    }

    @Override
    public String toString() {
        StringBuilder ownerList = new StringBuilder();
        if (owners != null && owners.length > 0) {
            for (Owner owner : owners) {
                ownerList
                        .append("\t")
                        .append(owner)
                        .append("\n");
            }
        } else {
            ownerList.append("No masters");
        }

        ownerList.setLength(ownerList.length() - 1);

        return "Racoon: " + name + "\n" + ownerList;
    }
}
