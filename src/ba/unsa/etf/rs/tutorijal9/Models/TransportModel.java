package ba.unsa.etf.rs.tutorijal9.Models;

import ba.unsa.etf.rs.tutorijal9.DAO.Bus;
import ba.unsa.etf.rs.tutorijal9.DAO.Driver;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.time.LocalDate;
import java.util.Scanner;

public class TransportModel {
    private ObservableList<Driver> vozaci = FXCollections.observableArrayList();
    private SimpleObjectProperty<Driver> trenutniVozac = new SimpleObjectProperty<>();
    private ObservableList<Bus> autobusi = FXCollections.observableArrayList();
    private SimpleObjectProperty<Bus> trenutniAutobus = new SimpleObjectProperty<>();

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

    public void dodajAutobus(Bus bus) {
        this.autobusi.add(bus);
    }

    public void dodajVozaca(Driver vozac) {
        this.vozaci.add(vozac);
    }

    public void otpustiVozaca(Driver vozac) {
        vozaci.remove(vozac);
    }

    public void prodajAutobus(Bus bus) {
        autobusi.remove(bus);
    }

    public Driver getNextDriver(Driver driver) {
        int index = vozaci.indexOf(driver);
        int total = vozaci.size();
        if(index + 1 < total)
        {
            return vozaci.get(index + 1);
        }
        return null;
    }

    public Bus getNextBus(Bus driver) {
        int index = autobusi.indexOf(driver);
        int total = autobusi.size();
        if(index + 1 < total)
        {
            return autobusi.get(index + 1);
        }
        return null;
    }

    /*
    private static void dodijeliAutobusVozacu(Scanner tok) {
        System.out.println("Odaberite vozača: ");
        for (int i = 0; i < dao.getDrivers().size(); i++) {
            System.out.println((i+1)+". "+dao.getDrivers().get(i));
        }
        System.out.print("Index: ");
        int driverIndex = tok.nextInt()-1;
        Driver driver = dao.getDrivers().get(driverIndex);
        System.out.println("Odaberite autobus: ");
        for (int i = 0; i < dao.getBusses().size(); i++) {
            System.out.println((i+1)+". "+dao.getBusses().get(i));
        }
        System.out.print("Index: ");
        int busIndex = tok.nextInt()-1;
        Bus bus = dao.getBusses().get(busIndex);
        int which = 1;
        if(bus.getDriverOne()!=null && bus.getDriverTwo()!=null){
            System.out.print("Umjesto kojeg vozača želite postaviti trenutnog(1 ili 2): ");
            which = tok.nextInt();
        }else if(bus.getDriverOne()!=null){
            which = 2;
        }
        dao.dodijeliVozacuAutobus(driver,bus,which);
    }*/
}
