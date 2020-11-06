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

    String sel1 = "";
    String sel2 = "";
    int num1=0;
    int num2=0;
    
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
		comboBox.setValue("����δ� ����, 15,000��");
		comboBox.setItems(comboBoxList);
	
	}
    
    @FXML
    void onClickbombo(ActionEvent event) {
    	String sel = comboBox.getValue() ;
    	sel1 += sel ;
    	if(sel.equals("����δ� ����, 15,000��"))
    		num1 = 15000;
    	else if(sel.equals("�������� ����, 15,000��"))
    		num1 = 15000;
    	else if(sel.equals("�Ұ�� ����, 18,000��"))
    		num1 = 18000;
    	else if(sel.equals("�޺� ����, 20,000��"))
    		num1 = 20000;
    	
    }
    
    @FXML
    void onClickb1(ActionEvent event) {
    	ta.appendText(sel1+"\n");
    	ta.appendText(sel2);
    	ta.appendText("\ntotal = "+(num1+num2) +"�� �Դϴ�.");
    }

    @FXML
    void onClickb2(ActionEvent event) {
    	sel1="";
    	sel2="";
    	ta.setText("");
    	if(ch1.isSelected())
    		ch1.fire();
    	if(ch2.isSelected())
    		ch2.fire();
    	if(ch3.isSelected())
    		ch3.fire();
    	num1=0;
    	num2=0;
   
 
    }
    @FXML
    
    void onClickb3(ActionEvent event) {
    	System.exit(0);
    }

    @FXML
    void onClickch1(ActionEvent event) {
    	if(ch1.isSelected()) {
    		sel2 += ch1.getText() + "\n";
    		num2+=2000;
    	}
    }

    @FXML
    void onClickch2(ActionEvent event) {
    	if(ch2.isSelected()) {
    		sel2 += ch2.getText() + "\n";
    		num2+=1000;
    	}
    }

    @FXML
    void onClickch3(ActionEvent event) {
    	if(ch3.isSelected()) {
    		sel2 += ch3.getText() + "\n";
    		num2+=500;
    	}
    }
	
}
