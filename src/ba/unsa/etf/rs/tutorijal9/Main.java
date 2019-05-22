package ba.unsa.etf.rs.tutorijal9;
import ba.unsa.etf.rs.tutorijal9.Controllers.Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../../../../../resources/sample.fxml"));
        loader.setController(new Controller());
        Parent root = loader.load();
        primaryStage.setTitle("Elektrotehnicki prevoz");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}