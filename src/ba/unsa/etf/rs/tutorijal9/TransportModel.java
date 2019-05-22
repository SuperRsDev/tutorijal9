package ba.unsa.etf.rs.tutorijal9;

import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.time.LocalDate;

public class TransportModel {
    private ObservableList<Driver> vozaci = FXCollections.observableArrayList();
    private SimpleObjectProperty<Driver> trenutniVozac = new SimpleObjectProperty<>();


    public void napuni() {
        this.vozaci.add(new Driver("Vedran", "Ljubovic", "12345678901234", LocalDate.now(), LocalDate.now()));
        this.setTrenutniVozac(this.vozaci.get(0));
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
