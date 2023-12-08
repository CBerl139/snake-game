import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GUI extends Application {
    private Stage stage;
    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;
        stage.setTitle("Snake game");

        startGame();
    }
    public static void main(String[] args){
        launch(args);
    }

    public void startGame(){
        GamePage gamePage = new GamePage(this);
        stage.setScene(gamePage.getScene());

        gamePage.startTimer();

        stage.show();
    }
    public void finishGame(){
        FinishPage finishPage = new FinishPage(this);
        stage.setScene(finishPage.getScene());

        stage.show();
    }
}
