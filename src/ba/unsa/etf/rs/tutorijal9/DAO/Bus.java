package ba.unsa.etf.rs.tutorijal9.DAO;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

public class Bus {
    public String getMaker() {
        return maker.get();
    }

    public SimpleStringProperty makerProperty() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker.set(maker);
    }

    public String getSeries() {
        return series.get();
    }

    public SimpleStringProperty seriesProperty() {
        return series;
    }

    public void setSeries(String series) {
        this.series.set(series);
    }

    public int getSeatNumber() {
        return seatNumber.get();
    }

    public SimpleObjectProperty seatNumberProperty() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber.set(seatNumber);
    }

    public Driver getDriverOne() {
        return driverOne;
    }

    public void setDriverOne(Driver driverOne) {
        this.driverOne = driverOne;
    }

    public Driver getDriverTwo() {
        return driverTwo;
    }

    public void setDriverTwo(Driver driverTwo) {
        this.driverTwo = driverTwo;
    }

    private SimpleStringProperty maker;
    private SimpleStringProperty series;
    private SimpleObjectProperty<Integer> seatNumber;
    private Driver driverOne;
    private Driver driverTwo;

    public Bus(String man, String serija, int seatNum) {
        maker = new SimpleStringProperty(man);
        series = new SimpleStringProperty(serija);
        seatNumber = new SimpleObjectProperty<>(seatNum);
    }

    @Override
    public String toString() {
        return String.format("%s %s ( seats: %s ) - (%s) - (%s)",
                this.maker.getValue(), this.series.getValue(), this.seatNumber.getValue(), this.driverOne, this.driverTwo);
    }
}
