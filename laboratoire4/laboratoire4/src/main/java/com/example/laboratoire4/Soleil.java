package com.example.laboratoire4;

import javafx.animation.Animation;
import javafx.animation.FillTransition;
import javafx.animation.RotateTransition;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.util.Duration;

public class Soleil extends Group {
    private int centreSoleilX;

    private int centreSoleilY;

    public Soleil (int centreSoleilX, int centreSoleilY) {
        this.centreSoleilX = centreSoleilX;
        this.centreSoleilY = centreSoleilY;

    }
    public Group create () {
        Circle soleil = new Circle(centreSoleilX, centreSoleilY, 50 );
        soleil.setFill(Color.YELLOW);

        FillTransition transition = new FillTransition(Duration.seconds(2), soleil, Color.YELLOW, Color.DARKORANGE);
        transition.setAutoReverse(true);
        transition.setCycleCount(Animation.INDEFINITE);
        transition.play();

        Group rayons = new Group();
        //rayon 1 vers le nord
        Line rayon1 = new Line(centreSoleilX, centreSoleilY - 55, centreSoleilX, centreSoleilY - 110);
        rayon1.setStroke(Color.YELLOW);
        rayon1.setStrokeWidth(2);
        //rayon2 vers le sud
        Line rayon2 = new Line(centreSoleilX, centreSoleilY + 55, centreSoleilX, centreSoleilY + 110);
        rayon2.setStroke(Color.YELLOW);
        rayon2.setStrokeWidth(2);

        rayons.getChildren().addAll(rayon1, rayon2);

        //rayon3 vers l'ouest
        Line rayon3 = new Line(centreSoleilX - 55, centreSoleilY, centreSoleilX - 110, centreSoleilY);
        rayon3.setStroke(Color.YELLOW);
        rayon3.setStrokeWidth(2);
        //rayon4 vers l'est
        Line rayon4 = new Line(centreSoleilX + 55, centreSoleilY, centreSoleilX + 110, centreSoleilY);
        rayon4.setStroke(Color.YELLOW);
        rayon4.setStrokeWidth(2);
        rayons.getChildren().addAll(rayon3, rayon4);

        //rayon5 vers sud-est
        Line rayon5 = new Line(centreSoleilX + 40, centreSoleilY + 40, centreSoleilX + 72, centreSoleilY + 72);
        rayon5.setStrokeWidth(2);
        rayon5.setStroke(Color.YELLOW);
        //rayon 6 nord-ouest
        Line rayon6 = new Line(centreSoleilX - 40, centreSoleilY - 40, centreSoleilX - 72, centreSoleilY - 72);
        rayon6.setStroke(Color.YELLOW);
        rayon6.setStrokeWidth(2);
        //rayon 7 sud-ouest
        Line rayon7 = new Line(centreSoleilX - 40, centreSoleilY + 40, centreSoleilX - 72, centreSoleilY + 72);
        rayon7.setStrokeWidth(2);
        rayon7.setStroke(Color.YELLOW);
        //rayon 8 nord-est
        Line rayon8 = new Line(centreSoleilX + 40, centreSoleilY - 40, centreSoleilX + 72, centreSoleilY - 72);
        rayon8.setStroke(Color.YELLOW);
        rayon8.setStrokeWidth(2);

        rayons.getChildren().addAll(rayon5, rayon6, rayon7, rayon8);
        RotateTransition rotate = new RotateTransition(Duration.seconds(7), rayons);
        rotate.setByAngle(360);
        rotate.setCycleCount(Animation.INDEFINITE);
        //rotate.setAutoReverse(true);
        rotate.play();
        return new Group(soleil, rayons);
    }
}
