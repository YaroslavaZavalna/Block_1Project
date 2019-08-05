package client_database;

import booking_characteristics.Booking;
import movie_characteristics.Cinema;
import movie_characteristics.Placement;

public class ClientAccount {
    private Booking booking;
    private String login;
    private String password;
    private Placement placement;

    public ClientAccount(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public Placement getPlacement() {
        return placement;
    }

    public void setPlacement(Placement placement) {
        this.placement = placement;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "login: '" + login + '\'' +
                ", password: " + "*******"+
                ", bookings: "+ booking;
    }
}
