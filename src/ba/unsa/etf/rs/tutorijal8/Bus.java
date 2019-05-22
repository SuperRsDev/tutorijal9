package ba.unsa.etf.rs.tutorijal8;

import java.util.ArrayList;

public class Bus {
    private String maker;
    private String series;
    private int seatNumber;
    private Driver driverOne;
    private Driver driverTwo;

    public Bus(String man, String serija, int i) {
        maker = man;
        series = serija;
        seatNumber = i;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setDriverOne(Driver d) {
        this.driverOne = d;
    }

    public void setDriverTwo(Driver d) {
        this.driverTwo = d;
    }

    public Driver getDriverOne() {
        return driverOne;
    }

    public Driver getDriverTwo() {
        return driverTwo;
    }

    @Override
    public String toString() {
        return String.format("%s %s ( seats: %s ) - (%s) - (%s)", this.maker, this.series, this.seatNumber, this.driverOne, this.driverTwo);
    }
}
