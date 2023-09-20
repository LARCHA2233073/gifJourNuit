package com.example.laboratoire4;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;


public class HelloApplication extends Application {
    Group root = new Group();
    @Override
    public void start(Stage stage) {
        Rectangle rectNoir = new Rectangle(500, 600);
        rectNoir.setTranslateX(500);
        Soleil soleil = new Soleil(420, 75);
        Group soleil1 = soleil.create();

        soleil1.setScaleX(0.5);
        soleil1.setScaleY(0.5);

        Label jour = new Label("Jour");
        jour.setTextFill(Color.BLACK);
        jour.setTranslateX(235);
        jour.setTranslateY(500);
        jour.setScaleX(3);
        jour.setScaleY(3);
        Label nuit = new Label("Nuit");
        nuit.setTextFill(Color.WHITE);
        nuit.setTranslateX(735);
        nuit.setTranslateY(500);
        nuit.setScaleY(3);
        nuit.setScaleX(3);

        Rectangle gazon = new Rectangle(500, 200);
        gazon.setTranslateY(400);
        gazon.setFill(Color.GREEN);
        gazon.setOpacity(0.5);

        Rectangle coucherSoleil = new Rectangle(500, 400);
        Stop[] stops = new Stop[] {
                new Stop(0.16, Color.ORANGERED),
                new Stop(0.33, Color.ORANGE),
                new Stop(0.5, Color.YELLOW),
                new Stop(0.67, Color.LIGHTGOLDENRODYELLOW),
                new Stop(0.83, Color.YELLOWGREEN),
                new Stop(1, Color.GREEN)
        };
        LinearGradient linearGradient = new LinearGradient(0, 0, 1, 1, true, CycleMethod.NO_CYCLE, stops);
        coucherSoleil.setFill(linearGradient);
        coucherSoleil.setOpacity(0.4);

        root.getChildren().addAll(rectNoir, new Etoile(800, 100, Duration.seconds(1)),
                new Etoile(550, 130, Duration.seconds(2)),
                new Etoile(725, 170, Duration.seconds(3)),
                new Etoile(650, 90, Duration.seconds(4)),
                new Etoile(570, 50, Duration.seconds(5)));



        root.getChildren().addAll(new Lune(940, 60), soleil1, nuit, gazon, jour, coucherSoleil);
        root.getChildren().addAll(new Oiseau(200, 100), new Oiseau(100, 150));
        root.getChildren().addAll(new Maison(200, 400, true), new Maison(700, 400, false));

        stage.setMinHeight(600);
        stage.setMaxHeight(600);
        stage.setMinWidth(1000);
        stage.setMaxWidth(1000);
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}