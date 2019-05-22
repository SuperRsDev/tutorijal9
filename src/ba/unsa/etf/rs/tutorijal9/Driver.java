package ba.unsa.etf.rs.tutorijal9;

import java.time.LocalDate;

public class Driver {
    private String name;
    private String surename;
    private String jmbg;
    private LocalDate birthDay;
    private LocalDate employeementDay;

    public Driver(String name, String surename, String jmb, LocalDate birthDay, LocalDate employeementDay) {
        this.name = name;
        this.surename = surename;
        this.jmbg = jmb;
        this.birthDay = birthDay;
        this.employeementDay = employeementDay;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public LocalDate getBirthday() {
        return birthDay;
    }

    public void setBirthday(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public LocalDate getEmployeementDay() {
        return employeementDay;
    }

    public void setEmployeementDay(LocalDate employeementDay) {
        this.employeementDay = employeementDay;
    }

    @Override
    public String toString() {
        return String.format("%s %s ( %s )", this.name, this.surename, this.jmbg);
    }
}
