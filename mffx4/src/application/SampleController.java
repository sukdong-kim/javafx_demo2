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
       	ta.appendText(sel+"�� ���� \n");
    	if(sel.equals("����δ� ����, 15,000��"))
    		num1 += 15000;
    	else if(sel.equals("�������� ����, 15,000��"))
    		num1 += 15000;
    	else if(sel.equals("�Ұ�� ����, 18,000��"))
    		num1 += 18000;
    	else if(sel.equals("�޺� ����, 20,000��"))
    		num1 += 20000;
    	sel1+=sel +"\n";
    }
    
    @FXML
    void onClickb1(ActionEvent event) {
    	ta.appendText("\n\n"+ sel1 + sel2 +"\n");
    	ta.appendText("\n total = "+(num1+num2) +"�� �Դϴ�.\n");
    }

    @FXML
    void onClickb2(ActionEvent event) {

    	if(ch1.isSelected())
    		ch1.fire();
    	if(ch2.isSelected())
    		ch2.fire();
    	if(ch3.isSelected())
    		ch3.fire();
    	sel1="";
    	sel2="";
    	num1=0;
    	num2=0;
    	ta.setText("");
 
    }
    @FXML
    
    void onClickb3(ActionEvent event) {
    	System.exit(0);
    }

    @FXML
    void onClickch1(ActionEvent event) {
    	if(ch1.isSelected()) {
    		ta.appendText(ch1.getText()+"�� ���� \n");
    		num2+=2000;
        	sel2+=ch1.getText()+"�� ����\n";
    	}
    	if(ch1.isSelected()== false) {
    		ta.appendText(ch1.getText()+"�� ��� \n");
    		num2-=2000;
        	sel2+=ch1.getText()+"�� ���\n";
    	}
    }

    @FXML
    void onClickch2(ActionEvent event) {
    	if(ch2.isSelected()) {
    		ta.appendText(ch2.getText()+"�� ���� \n");
    		num2+=1000;
        	sel2+=ch2.getText()+"�� ����\n";
    	}
    	if(ch2.isSelected()== false) {
    		ta.appendText(ch2.getText()+"�� ��� \n");
    		num2-=1000;
        	sel2+=ch2.getText()+"�� ���\n";
    	}
    }

    @FXML
    void onClickch3(ActionEvent event) {
    	if(ch3.isSelected()) {
    		ta.appendText(ch3.getText()+"�� ���� \n");
    		num2+=500;
        	sel2+=ch3.getText()+"�� ����\n";
    	}
    	if(ch3.isSelected()== false) {
    		ta.appendText(ch3.getText()+"�� ��� \n");
    		num2-=500;
        	sel2+=ch3.getText()+"�� ���\n";
    	}

    }
	
}
