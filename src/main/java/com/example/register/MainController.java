package com.example.register;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.util.ArrayList;

public class MainController {
    public Label lblLgOut;
    public Button btnLogOut;
    public ListView listViewAccs;
    public Stage mainStage;
    public Stage primaryStage;
    ArrayList<Account> accounts = new ArrayList<>();

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void setMainStage(Stage mainStage) {
        this.mainStage = mainStage;
    }

    public ListView getListViewAccs() {
        return listViewAccs;
    }

    public void btnLgOutHandler(ActionEvent actionEvent) {
        // primaryStage.show();
        mainStage.hide();
    }
}
