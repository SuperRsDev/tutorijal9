package ba.unsa.etf.rs.tutorijal9.DAO;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

import java.time.LocalDate;

public class Driver {
    private SimpleStringProperty name;
    private SimpleStringProperty surename;
    private SimpleStringProperty jmbg;
    private SimpleObjectProperty<LocalDate> birthDay;
    private SimpleObjectProperty<LocalDate> employeementDay;

    public Driver(String name, String surename, String jmb, LocalDate birthDay, LocalDate employeementDay) {
        this.name = new SimpleStringProperty(name);
        this.surename = new SimpleStringProperty(surename);
        this.jmbg = new SimpleStringProperty(jmb);
        this.birthDay = new SimpleObjectProperty<>(birthDay);
        this.employeementDay = new SimpleObjectProperty<>(employeementDay);
    }


    @Override
    public boolean equals(Object o) {

        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Driver)) {
            return false;
        }

        // typecast o to Complex so that we can compare data members
        Driver c = (Driver) o;

        // Compare the data members and return accordingly
        return this.jmbg.equals(c.jmbg);
    }

    @Override
    public String toString() {
        return String.format("%s %s ( %s )",
                this.name.getValue(), this.surename.getValue(), this.jmbg.getValue());
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getSurename() {
        return surename.get();
    }

    public SimpleStringProperty surenameProperty() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename.set(surename);
    }

    public String getJmbg() {
        return jmbg.get();
    }

    public SimpleStringProperty jmbgProperty() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg.set(jmbg);
    }

    public LocalDate getBirthDay() {
        return birthDay.get();
    }

    public SimpleObjectProperty<LocalDate> birthDayProperty() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay.set(birthDay);
    }

    public LocalDate getEmployeementDay() {
        return employeementDay.get();
    }

    public SimpleObjectProperty<LocalDate> employeementDayProperty() {
        return employeementDay;
    }

    public void setEmployeementDay(LocalDate employeementDay) {
        this.employeementDay.set(employeementDay);
    }
}
