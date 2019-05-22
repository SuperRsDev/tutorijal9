package ba.unsa.etf.rs.tutorijal9.Controllers;

import ba.unsa.etf.rs.tutorijal9.DAO.Driver;
import ba.unsa.etf.rs.tutorijal9.Models.TransportModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class DriverController {
    public TextField unosImena;
    public TextField unosPrezimena;
    public TextField unosJMB;
    public DatePicker unosRodjenja;
    public DatePicker unosZaposlenja;

    public ListView<Driver> spisakVozaca;
    private TransportModel model;

    @FXML
    private javafx.scene.control.Button closeButton;

    public DriverController(TransportModel korisnikModel) {
        model = korisnikModel;
    }

    public DriverController() {
        model = new TransportModel();
        model.napuni();
    }

    @FXML
    public void initialize() {
        spisakVozaca.setItems(model.getVozaci());
        unosImena.textProperty().bindBidirectional(model.getTrenutniVozac().nameProperty());
        unosPrezimena.textProperty().bindBidirectional(model.getTrenutniVozac().surenameProperty());
        unosJMB.textProperty().bindBidirectional(model.getTrenutniVozac().jmbgProperty());
        unosRodjenja.valueProperty().bindBidirectional(model.getTrenutniVozac().birthDayProperty());
        unosZaposlenja.valueProperty().bindBidirectional(model.getTrenutniVozac().employeementDayProperty());

        spisakVozaca.getSelectionModel().selectedItemProperty().addListener((observableValue, noviVozac, stariVozac) -> {
            unBindFieldsToProperties(stariVozac);
            model.setTrenutniVozac(noviVozac);
            bindFieldsToProperties(noviVozac);
        });
    }

    public void dodajVozaca(ActionEvent actionEvent) {
        // get a handle to the stage
        Stage stage = (Stage) closeButton.getScene().getWindow();
        // do what you have to do
        stage.close();
    }

    public void otpustiVozaca(ActionEvent actionEvent) {
        // get a handle to the stage
        Stage stage = (Stage) closeButton.getScene().getWindow();
        // do what you have to do
        stage.close();
    }

    private void bindFieldsToProperties(Driver novaOsoba) {
        if(novaOsoba == null) {
            return;
        }
        unosImena.textProperty().bindBidirectional(novaOsoba.nameProperty());
        unosPrezimena.textProperty().bindBidirectional(novaOsoba.surenameProperty());
        unosJMB.textProperty().bindBidirectional(novaOsoba.jmbgProperty());
        unosRodjenja.valueProperty().bindBidirectional(novaOsoba.birthDayProperty());
        unosZaposlenja.valueProperty().bindBidirectional(novaOsoba.employeementDayProperty());
    }

    private void unBindFieldsToProperties(Driver stariVozac) {
        if(stariVozac == null) {
            stariVozac = this.model.getTrenutniVozac();
        }
        unosImena.textProperty().unbindBidirectional(stariVozac.nameProperty());
        unosPrezimena.textProperty().unbindBidirectional(stariVozac.surenameProperty());
        unosJMB.textProperty().unbindBidirectional(stariVozac.jmbgProperty());
        unosRodjenja.valueProperty().unbindBidirectional(stariVozac.birthDayProperty());
        unosZaposlenja.valueProperty().unbindBidirectional(stariVozac.employeementDayProperty());
    }
}
