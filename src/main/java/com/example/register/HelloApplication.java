package com.example.register;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {

    ArrayList<Account> accounts = new ArrayList<>();
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Parent root = loader.load();
        stage.setTitle("Registration Form");
        Scene scene = new Scene(root, 450, 410);
        stage.setScene(scene);
        stage.show();

        Controller controller = loader.getController();

        loader = new FXMLLoader(getClass().getResource("Main.fxml"));
        root = loader.load();
        Scene scene1 = new Scene(root);
        Stage window = new Stage();
        window.setTitle("List of Accounts");
        window.setScene(scene1);
        window.hide();

        MainController mainController = loader.getController();

        controller.setPrimaryStage(controller.primaryStage);
        controller.setMainStage(window);
        controller.setAccounts(accounts);
        controller.setMainController(mainController);

        mainController.setMainStage(window);
        mainController.setPrimaryStage(controller.primaryStage);
        controller.setAccounts(accounts);

    }

    public static void main(String[] args) {
        launch();
    }
}