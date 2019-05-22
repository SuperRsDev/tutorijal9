package ba.unsa.etf.rs.tutorijal9;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {
    public TextField unosImena;
    public TextField unosPrezimena;
    public TextField unosJMB;
    public DatePicker unosRodjenja;
    public DatePicker unosZaposlenja;

    public ListView<Driver> spisakVozaca;
    private MainModel model;

    @FXML
    private javafx.scene.control.Button closeButton;

    public Controller(MainModel korisnikModel) {
        model = korisnikModel;
    }

    @FXML
    public void initialize() {
        /*unosImena.textProperty().bindBidirectional(model.getTrenutniKorisnik().getImeProperty());
        unosPrezimena.textProperty().bindBidirectional(model.getTrenutniKorisnik().getPrezimeProperty());
        unosEmaila.textProperty().bindBidirectional(model.getTrenutniKorisnik().getEmailProperty());
        unosKorisnickogImena.textProperty().bindBidirectional(model.getTrenutniKorisnik().getKorisnickoImeProperty());
        unosLozinke.textProperty().bindBidirectional(model.getTrenutniKorisnik().getLozinkaProperty());*/

        /*spisakVozaca.getSelectionModel().selectedItemProperty().addListener((observableValue, korisnik, t1) -> {
            model.setTrenutniKorisnik(t1);
            unosImena.textProperty().bindBidirectional(model.getTrenutniKorisnik().getImeProperty());
            unosPrezimena.textProperty().bindBidirectional(model.getTrenutniKorisnik().getPrezimeProperty());
            unosEmaila.textProperty().bindBidirectional(model.getTrenutniKorisnik().getEmailProperty());
            unosKorisnickogImena.textProperty().bindBidirectional(model.getTrenutniKorisnik().getKorisnickoImeProperty());
            unosLozinke.textProperty().bindBidirectional(model.getTrenutniKorisnik().getLozinkaProperty());
        });*/
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
}
