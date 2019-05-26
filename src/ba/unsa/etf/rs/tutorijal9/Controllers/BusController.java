package ba.unsa.etf.rs.tutorijal9.Controllers;

import ba.unsa.etf.rs.tutorijal9.DAO.Bus;
import ba.unsa.etf.rs.tutorijal9.DAO.Driver;
import ba.unsa.etf.rs.tutorijal9.Models.TransportModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class BusController {

    public TextField unosProizvodjaca;
    public TextField unosSerije;
    public Spinner<Integer> unosSjedista;
    public TextField unosVozaca;

    public ListView<Bus> spisakAutobusa;
    private TransportModel model;


    public BusController(TransportModel korisnikModel) {
        model = korisnikModel;
    }

    public BusController() {
        model = new TransportModel();
        model.napuni();
    }

    @FXML
    public void initialize() {
        spisakAutobusa.setItems(model.getAutobusi());
        unosProizvodjaca.textProperty().bindBidirectional(model.getTrenutniAutobus().makerProperty());
        unosSerije.textProperty().bindBidirectional(model.getTrenutniAutobus().seriesProperty());
        unosSjedista.getValueFactory().valueProperty().bindBidirectional(model.getTrenutniAutobus().seatNumberProperty());
        unosVozaca.textProperty().bindBidirectional(model.getTrenutniAutobus().makerProperty());

        spisakAutobusa.getSelectionModel().selectedItemProperty().addListener((observableValue, noviBus, stariBus) -> {
            if(noviBus == null) {
                return;
            }
            unBindFieldsToProperties(stariBus);
            model.setTrenutniAutobus(noviBus);
            bindFieldsToProperties(noviBus);
        });
    }

    public void dodajAutobus(ActionEvent actionEvent) {
        // get a handle to the stage
        Bus bus = new Bus(unosProizvodjaca.getText(), unosSerije.getText(), unosSjedista.getValue());
        model.dodajAutobus(bus);
    }

    public void prodajAutobus(ActionEvent actionEvent) {
        Bus bus = model.getTrenutniAutobus();
        model.prodajAutobus(bus);
        Bus sljedeci = model.getNextBus(bus);
        model.setTrenutniAutobus(sljedeci);
    }

    private void bindFieldsToProperties(Bus novaOsoba) {
        if(novaOsoba == null) {
            return;
        }
        unosProizvodjaca.textProperty().bindBidirectional(model.getTrenutniAutobus().makerProperty());
        unosSerije.textProperty().bindBidirectional(model.getTrenutniAutobus().seriesProperty());
        unosSjedista.getValueFactory().valueProperty().bindBidirectional(model.getTrenutniAutobus().seatNumberProperty());
        unosVozaca.textProperty().bindBidirectional(model.getTrenutniAutobus().makerProperty());
    }

    private void unBindFieldsToProperties(Bus stariVozac) {
        if(stariVozac == null) {
            stariVozac = this.model.getTrenutniAutobus();
        }
        unosProizvodjaca.textProperty().unbindBidirectional(model.getTrenutniAutobus().makerProperty());
        unosSerije.textProperty().unbindBidirectional(model.getTrenutniAutobus().seriesProperty());
        unosSjedista.getValueFactory().valueProperty().unbindBidirectional(model.getTrenutniAutobus().seatNumberProperty());
        unosVozaca.textProperty().unbindBidirectional(model.getTrenutniAutobus().makerProperty());
    }

    private void clearFields() {
        unosProizvodjaca.textProperty().setValue("");
        unosSerije.textProperty().setValue("");
        unosSjedista.getValueFactory().setValue(null);
        unosVozaca.textProperty().setValue("");
    }
}
