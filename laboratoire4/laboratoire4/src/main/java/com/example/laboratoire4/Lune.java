package com.example.laboratoire4;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;

public class Lune extends Group {
    public Lune(int centreX, int centreY) {
        super();
        this.setTranslateX(centreX);
        this.setTranslateY(centreY);

        Circle lune = new Circle(0, 0, 25);
        lune.setFill(Color.BLACK);
        Stop[] stops = new Stop[] {
                new Stop(0, Color.LIGHTGRAY),
                new Stop(0.33, Color.GRAY),
                new Stop(0.67, Color.DARKGRAY),
                new Stop(1, Color.BLACK)
        };


        LinearGradient linearGradient = new LinearGradient(0,0 , 1,1 , true, CycleMethod.NO_CYCLE, stops);
        lune.setFill(linearGradient);
        this.getChildren().addAll(lune);
    }
}
