package com.example.laboratoire4;

import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.util.Duration;

public class Etoile extends Group {
    public Etoile(int centreX, int centreY, Duration seconds) {
        super();
        this.setTranslateX(centreX);
        this.setTranslateY(centreY);

        Polygon etoile = new Polygon(0, 0, -8, 20, -30, 20, -10, 30, -22, 50, 0, 35,
                22, 50, 10, 30, 30, 20, 8, 20, 0, 0);
        etoile.setFill(Color.YELLOW);
        this.getChildren().add(etoile);
        FadeTransition trans = new FadeTransition(Duration.seconds(2), this);
        trans.setDelay(seconds);
        trans.setFromValue(1.0);
        trans.setToValue(0);
        trans.setCycleCount(Animation.INDEFINITE);
        trans.setAutoReverse(true);
        trans.play();
    }

}
