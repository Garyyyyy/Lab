package assignment2;

public class Restaurant {
    private String Name;
    private Address address;
    private Menu menu;
    private boolean isOpened;

    public Restaurant(String name, Address address, Menu menu, boolean isOpened) {
        Name = name;
        this.address = address;
        this.menu = menu;
        this.isOpened = isOpened;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public void setOpened(boolean opened) {
        isOpened = opened;
    }
}
