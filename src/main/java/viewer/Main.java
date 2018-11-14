package viewer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("A");
        Parent root = FXMLLoader.load(getClass().getResource("/viewer/viewer.fxml"));
        primaryStage.setTitle("Mandelbrot");
        primaryStage.setScene(new Scene(root, 1200, 900));
        primaryStage.show();
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int test[] = new int[18];
        for (int i=0; i< 18 ; i++){
            System.out.println("Entrer un entier entre 0 et 255");
            if (sc.nextInt() >= 0 && sc.nextInt() < 255)
                test[i] = sc.nextInt();
            else
                System.out.println("erreur recommencer");

        }

        Controller.setColor(0, Color.rgb(test[0],test[1],test[2]));
        Controller.setColor(0, Color.rgb(test[3],test[4],test[5]));
        Controller.setColor(0, Color.rgb(test[6],test[7],test[8]));
        Controller.setColor(0, Color.rgb(test[9],test[10],test[11]));
        Controller.setColor(0, Color.rgb(test[12],test[13],test[14]));
        Controller.setColor(0, Color.rgb(test[15],test[16],test[17]));

        launch(args);
    }
}
