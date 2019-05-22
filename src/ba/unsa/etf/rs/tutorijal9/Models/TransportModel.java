package ba.unsa.etf.rs.tutorijal9.Models;

import ba.unsa.etf.rs.tutorijal9.DAO.Bus;
import ba.unsa.etf.rs.tutorijal9.DAO.Driver;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.time.LocalDate;

public class TransportModel {
    private ObservableList<Driver> vozaci = FXCollections.observableArrayList();
    private SimpleObjectProperty<Driver> trenutniVozac = new SimpleObjectProperty<>();

    public ObservableList<Bus> getAutobusi() {
        return autobusi;
    }

    public void setAutobusi(ObservableList<Bus> autobusi) {
        this.autobusi = autobusi;
    }

    public Bus getTrenutniAutobus() {
        return trenutniAutobus.get();
    }

    public SimpleObjectProperty<Bus> trenutniAutobusProperty() {
        return trenutniAutobus;
    }

    public void setTrenutniAutobus(Bus trenutniAutobus) {
        this.trenutniAutobus.set(trenutniAutobus);
    }

    private ObservableList<Bus> autobusi = FXCollections.observableArrayList();
    private SimpleObjectProperty<Bus> trenutniAutobus = new SimpleObjectProperty<>();

    public void napuni() {
        this.vozaci.add(new Driver("Vedran", "Ljubovic", "12345678901234", LocalDate.now(), LocalDate.now()));
        this.setTrenutniVozac(this.vozaci.get(0));

        this.autobusi.add(new Bus("MAN", "Big", 20));
        this.setTrenutniAutobus(this.autobusi.get(0));
    }

    public ObservableList<Driver> getVozaci() {
        return vozaci;
    }

    public void setVozaci(ObservableList<Driver> vozaci) {
        this.vozaci = vozaci;
    }

    public Driver getTrenutniVozac() {
        return trenutniVozac.get();
    }

    public SimpleObjectProperty<Driver> trenutniVozacProperty() {
        return trenutniVozac;
    }

    public void setTrenutniVozac(Driver trenutniVozac) {
        this.trenutniVozac.set(trenutniVozac);
    }
}
