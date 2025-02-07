package dk.easv.bootstrapfx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import org.kordamp.bootstrapfx.BootstrapFX;

import java.io.IOException;

public class HelloController {
    @FXML private HBox hboxSnackbarP;

    @FXML
    protected void onHelloButtonClick() throws IOException {

       /** Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Hello");
        alert.setHeaderText("Hello");
        alert.setContentText("Hello World");
        alert.showAndWait();*/
        FXMLLoader loader = new FXMLLoader(getClass().getResource("snackbar.fxml"));
        Parent snackBar = loader.load();
        snackBar.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
        SnackbarController controller = loader.getController();
        double windowWidth = hboxSnackbarP.getScene().getWidth();
        hboxSnackbarP.getChildren().clear();
        hboxSnackbarP.getChildren().add(snackBar);
        //SnackbarController snackbarController = new SnackbarController();
        String txt = "This is a text";
        controller.setSnackBar(txt, null, 5, hboxSnackbarP, windowWidth, controller.getWARNING(), controller);
    }
}