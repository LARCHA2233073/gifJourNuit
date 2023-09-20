package com.example.laboratoire4;

import javafx.animation.*;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.QuadCurve;
import javafx.util.Duration;


public class Oiseau extends Group {

    public Oiseau(int centreOiseauX, int centreOiseauY) {
        super();
        this.setTranslateX(centreOiseauX);
        this.setTranslateY(centreOiseauY);

        //l'aile s'appelle quadCurveGauche car si elle s'apelle aileGI elle marche pas... je sais pas pourquoi :(
        QuadCurve quadCurveGauche = new QuadCurve(0, 15, -15, -15 ,-30, 30);
        quadCurveGauche.setStrokeWidth(3);
        quadCurveGauche.setFill(Color.TRANSPARENT);
        quadCurveGauche.setStroke(Color.BLACK);

        QuadCurve aileDI = new QuadCurve(0,15,  15, -15, 30, 30 );
        aileDI.setStrokeWidth(3);
        aileDI.setFill(Color.TRANSPARENT);
        aileDI.setStroke(Color.BLACK);

        this.getChildren().addAll(quadCurveGauche, aileDI);

        //animation
        Timeline temps = new Timeline();

        KeyValue kv1 = new KeyValue(quadCurveGauche.endYProperty(), -5, Interpolator.EASE_BOTH);
        KeyValue kv2 = new KeyValue(aileDI.endYProperty(), -5, Interpolator.EASE_BOTH);

        KeyValue kv5 = new KeyValue(quadCurveGauche.startYProperty(), 5, Interpolator.EASE_BOTH);
        KeyValue kv6 = new KeyValue(aileDI.startYProperty(), 5, Interpolator.EASE_BOTH);

        KeyValue kv3 = new KeyValue(quadCurveGauche.endYProperty(), 30, Interpolator.EASE_BOTH);
        KeyValue kv4 = new KeyValue(aileDI.endYProperty(), 30, Interpolator.EASE_BOTH);

        KeyValue kv7 = new KeyValue(quadCurveGauche.startYProperty(), 15, Interpolator.EASE_BOTH);
        KeyValue kv8 = new KeyValue(aileDI.startYProperty(), 15, Interpolator.EASE_BOTH);

        temps.getKeyFrames().addAll(new KeyFrame(Duration.seconds(1), kv1, kv2, kv5, kv6), new KeyFrame(Duration.seconds(2), kv3, kv4, kv7, kv8));

        temps.setCycleCount(Animation.INDEFINITE);
        temps.setAutoReverse(true);
        temps.play();

    }

}
