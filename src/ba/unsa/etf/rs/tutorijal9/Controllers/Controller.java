package ba.unsa.etf.rs.tutorijal9.Controllers;

import ba.unsa.etf.rs.tutorijal9.Models.TransportModel;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

public class Controller {
    @FXML
    private TabPane tabPane;
    // Inject tab content.
    @FXML private Tab vozacTab;
    // Inject controller
    @FXML private DriverController vozacTabPageController;

    // Inject tab content.
    @FXML private Tab autobusTab;
    // Inject controller
    @FXML private BusController autobusTabPageController;

    public Controller() {
        TransportModel model = new TransportModel();
        model.napuni();

        vozacTabPageController = new DriverController(model);
        autobusTabPageController = new BusController();
    }

    public void init() {
        tabPane.getSelectionModel().selectedItemProperty().addListener((ObservableValue<? extends Tab> observable,
                                                                        Tab oldValue, Tab newValue) -> {
            if (newValue == vozacTab) {
                System.out.println("Vozac Tab page");
            } else if (newValue == autobusTab) {
                System.out.println("Autobus Tab page");
            }
        });
    }
}
