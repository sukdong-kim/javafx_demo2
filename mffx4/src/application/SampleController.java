package application;

import javafx.scene.control.ComboBox;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;

public class SampleController implements Initializable {
	ObservableList<String> comboBoxList = 
			FXCollections.observableArrayList("����δ� ����, 15,000��","�������� ����, 15,000��","�Ұ�� ����, 18,000��","�޺� ����, 20,000��");
    @FXML
    private ComboBox<String> comboBox;

    @FXML
    private CheckBox ch1;

    @FXML
    private CheckBox ch2;

    @FXML
    private CheckBox ch3;

    @FXML
    private Button b1;

    @FXML
    private Button b2;

    @FXML
    private Button b3;

    @FXML
    private TextArea ta;

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
		comboBox.setValue("����δ� ����, 15,000��");
		comboBox.setItems(comboBoxList);
	
	}
    
 
    
    @FXML
    void onClickb1(ActionEvent event) {

    }

    @FXML
    void onClickb2(ActionEvent event) {

    }

    @FXML
    void onClickb3(ActionEvent event) {

    }

    @FXML
    void onClickch1(ActionEvent event) {

    }

    @FXML
    void onClickch2(ActionEvent event) {

    }

    @FXML
    void onClickch3(ActionEvent event) {

    }
	
}
