package game;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.stage.Stage;


public class Main extends Application {

    private static final String TITLE = "Schneek";

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
        primaryStage.setTitle(TITLE);
        primaryStage.setScene(new Scene(root));

        Canvas canvas = new Canvas(512, 512);
        root.getChildren().addAll(canvas);

        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
