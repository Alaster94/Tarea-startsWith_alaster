package sample;
//ALASTER NEHEMIAS ERAZO ARAGON
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Label txtNombre;

    @FXML
    private Label txtEdad;

    @FXML
    private Label txtApellido;

    @FXML
    private TextField txtBuscar;


//    private Persona buscar(ActionEvent event) {
//        return Persona.buscarPorPosicion(txtBuscar.getText());
//    }


    public void actionBuscar(ActionEvent event) {
        try {
           Persona.buscarPorPosicion(txtBuscar.getText());
//            txtNombre.setText(Buscar.nombre);
//            txtApellido.setText(Buscar.apellido);
//            txtEdad.setText(String.valueOf(Buscar.edad));

        } catch (NullPointerException e) {

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText(null);
            alert.setContentText("El Usuario   " + txtBuscar.getText() + "   No Existe");
            alert.show();

        }

    }

}
