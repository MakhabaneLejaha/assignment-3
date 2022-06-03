package com.example.makhaban;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        Pane root = new Pane();
        Scene scene = new Scene(root, 600, 500);
        scene.setFill(Color.valueOf("#008B8B"));




        ImageView techno1 = createTechno1(scene);

        ImageView tech = createTech(scene);
        ImageView wet = createWet(scene);
        ImageView ship = createShip(scene);
        ImageView techno = createTechno(scene);

        root.getChildren().addAll(ship,tech,wet,techno,techno1);

        scene.addEventFilter(KeyEvent.KEY_PRESSED, event -> {
            double x = ship.getX();
            double y = ship.getY();

            switch (event.getCode()){
                case UP -> ship.setY(y - 5);
                case DOWN -> ship.setY(y + 5);
            }
            if(ship.getBoundsInParent().intersects(techno1.getBoundsInParent())){
                System.out.println("Objects Clashed");
                scene.addEventFilter(KeyEvent.KEY_PRESSED,event1->{
                    double x1 = ship.getX();
                    double y1 = ship.getY();
                    switch (event.getCode()){
                        case UP->ship.setY(y-0);
                        case DOWN -> ship.setY(y+0);
                    }
                });


            }


          /*  if(event.getCode() == KeyCode.SPACE){
                Circle bullet = new Circle(3);
                bullet.setCenterX(x + (ship.getFitWidth() / 2));
                bullet.setCenterY(y);

                TranslateTransition moveEnemy = new TranslateTransition(Duration.millis(2000), bullet);
                moveEnemy.setByY(scene.getHeight() * -1);
                moveEnemy.play();


                root.getChildren().add(bullet);
            }*/
        });

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    private ImageView createTechno1(Scene scene) {
        ImageView image5 = new ImageView(new Image("cloud.png"));

        image5.setFitWidth(100);
        image5.setFitHeight(100);
        image5.setX(1000);
        image5.setY(50);

        TranslateTransition tt = new TranslateTransition(Duration.millis(7500), image5);
        tt.setByX(-1200);
        tt.setCycleCount(Integer.MAX_VALUE);


        tt.play();

        return image5;
    }

    private ImageView createTechno(Scene scene) {
        ImageView image4 = new ImageView(new Image("cloud.png"));

        image4.setFitWidth(100);
        image4.setFitHeight(100);
        image4.setX(800);
        image4.setY(300);



        TranslateTransition transi= new TranslateTransition(Duration.millis(7000),image4);
        transi.setByX(-1300);
        transi.setCycleCount(Integer.MAX_VALUE);

        transi.play();


        return image4;

    }
    private ImageView createTech(Scene scene) {
        ImageView image2 = new ImageView(new Image("cloud.png"));

        image2.setFitWidth(100);
        image2.setFitHeight(100);
        image2.setX(800);
        image2.setY(500);



        TranslateTransition trans= new TranslateTransition(Duration.millis(4500),image2);
        trans.setByX(-1250);
        trans.setCycleCount(Integer.MAX_VALUE);

        trans.play();


        return image2;

    }
    private ImageView createWet(Scene scene){
        ImageView image3 = new ImageView(new Image("cloud.png"));
        image3.setFitWidth(100);
        image3.setFitHeight(100);
        image3.setX(900);
        image3.setY(300);
        TranslateTransition wett= new TranslateTransition(Duration.millis(8000),image3);
        wett.setByX(-1400);

        wett.setCycleCount(Integer.MAX_VALUE);

        wett.play();



        return image3;
    }

    private ImageView createShip(Scene scene) {
        ImageView image = new ImageView(new Image("ship2.png"));
        ImageView image2 = new ImageView(new Image("tech.png"));
        image.setFitWidth(100);
        image.setFitHeight(100);
        image.setY(scene.getHeight() - image.getFitHeight());

        return image;
    }

    public static void main(String[] args) {
        launch();
    }
}