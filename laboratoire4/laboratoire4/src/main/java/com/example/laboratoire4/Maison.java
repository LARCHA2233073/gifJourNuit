package com.example.laboratoire4;
import javafx.scene.Group;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;


public class Maison extends Group {
    public Maison(int coinSuperieurGaucheX, int coinSuperieurGaucheY, boolean jour) {
        Rectangle maison = new Rectangle(coinSuperieurGaucheX, coinSuperieurGaucheY, 100, 55);
        maison.setFill(Color.WHITESMOKE);

        Rectangle porte = new Rectangle(coinSuperieurGaucheX + 15, coinSuperieurGaucheY + 20, 20, 35);
        porte.setFill(Color.BROWN);
        Circle poignee = new Circle(coinSuperieurGaucheX + 31, coinSuperieurGaucheY + 38, 4);
        poignee.setFill(Color.GOLD);

        Rectangle fenetre = new Rectangle(coinSuperieurGaucheX + 55, coinSuperieurGaucheY + 12, 35, 22);
        fenetre.setFill(Color.LIGHTBLUE);

        Line ligne1 = new Line(coinSuperieurGaucheX + 55,coinSuperieurGaucheY + 12,coinSuperieurGaucheX + 90,coinSuperieurGaucheY +  12);
        ligne1.setStroke(Color.GRAY);
        ligne1.setStrokeWidth(2);

        Line ligne2 = new Line(coinSuperieurGaucheX + 55,coinSuperieurGaucheY + 34,coinSuperieurGaucheX + 90,coinSuperieurGaucheY +  34);
        ligne2.setStrokeWidth(2);
        ligne2.setStroke(Color.GRAY);

        Line ligne5 = new Line(coinSuperieurGaucheX + 55, coinSuperieurGaucheY + 23, coinSuperieurGaucheX + 90, coinSuperieurGaucheY + 23);
        ligne5.setStrokeWidth(2);
        ligne5.setStroke(Color.GRAY);

        Line ligne3 = new Line(coinSuperieurGaucheX + 55, coinSuperieurGaucheY + 12, coinSuperieurGaucheX + 55, coinSuperieurGaucheY + 34);
        ligne3.setStroke(Color.GRAY);
        ligne3.setStrokeWidth(2);

        Line ligne4 = new Line(coinSuperieurGaucheX + 90, coinSuperieurGaucheY + 12, coinSuperieurGaucheX + 90, coinSuperieurGaucheY + 34);
        ligne4.setStroke(Color.GRAY);
        ligne4.setStrokeWidth(2);

        Line ligne6 = new Line(coinSuperieurGaucheX + 72.5, coinSuperieurGaucheY + 12, coinSuperieurGaucheX + 72.5, coinSuperieurGaucheY + 34);
        ligne6.setStroke(Color.GRAY);
        ligne6.setStrokeWidth(2);

        Polygon toit = new Polygon(coinSuperieurGaucheX - 2.5, coinSuperieurGaucheY , coinSuperieurGaucheX + 50, coinSuperieurGaucheY - 50,
                coinSuperieurGaucheX + 102.5, coinSuperieurGaucheY);
        toit.setFill(Color.DARKRED);

        if (jour) {
            DropShadow ombre = new DropShadow(20, 5, 10, Color.BLACK);
            maison.setEffect(ombre);
        }
        this.getChildren().addAll(maison, porte, fenetre, toit, ligne1, ligne2, ligne3, ligne4, poignee, ligne5, ligne6);

    }
}