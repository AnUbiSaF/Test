package com.example.register;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Controller {
    public TextField textName;
    public TextField textNum;
    public TextField textMail;
    public PasswordField textPass;
    public Button btnCA;
    public Label lblPass;
    public Label lblMail;
    public Label lblLogin;
    public Button btnLogin;
    public TextField textFieldPassLogin;
    public TextField txtFieldMailLogin;
    public Stage mainStage;
    public Stage primaryStage;
    ArrayList<Account> accounts = new ArrayList<>();
    MainController mainController;

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void setMainStage(Stage mainStage) {
        this.mainStage = mainStage;
    }

    public void textNameHandler(ActionEvent actionEvent){
    }
    public void textNumHandler(ActionEvent actionEvent){
    }
    public void textMailHandler(ActionEvent actionEvent){
    }
    public void textPassHandler(ActionEvent actionEvent){
    }
    public void btnCAHandler(ActionEvent actionEvent){
        accounts.add(new Account(textName.getText(), textNum.getText(), textMail.getText(), textPass.getText()));
        textName.clear();
        textNum.clear();
        textMail.clear();
        textPass.clear();

    }

    public void btnLoginHandler(ActionEvent actionEvent) {
        if (accessCheck(txtFieldMailLogin.getText(), textFieldPassLogin.getText())) {

            ArrayList<String> stringAccounts = accountsToString(accounts);
            mainController.getListViewAccs().getItems().setAll(stringAccounts);
            // this.primaryStage.hide();
            mainStage.show();
        }
    }

    public ArrayList<String> accountsToString(ArrayList<Account> accounts){
        ArrayList<String> stringAccs = new ArrayList<>();

        for (int i = 0; i < accounts.size(); i++) {
            stringAccs.add(accounts.get(i).getName() + "        " + accounts.get(i).getMail() + "       " + accounts.get(i).getNum());
        }
        return stringAccs;
    }
    public boolean accessCheck(String mail, String pass){
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getMail().equals(mail) && accounts.get(i).getPass().equals(pass)){
                return true;
            }
        }
        return false;
    }
}