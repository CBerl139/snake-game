import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class FinishPage{
    private GUI parentGui;
    private Scene scene;
    public FinishPage(GUI gui){
        parentGui = gui;

        Group root = new Group();
        Pane pane = new Pane(root);

        scene = new Scene(pane,16 * 30,16 * 30,true);
        scene.setFill(Color.BLACK);

        Text finishText = new Text(100,200,"GAME OVER !!!");
        finishText.setFont(new Font("Liberation Mono",45));
        finishText.setFill(Color.WHITE);
        pane.getChildren().add(finishText);

        Button button = new Button("RESTART GAME");
        button.setMinSize(50,50);
        button.relocate(175,275);
        pane.getChildren().add(button);
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e){
                restartGame();
            }
        };

        button.setOnAction(event);
    }
    public Scene getScene(){
        return scene;
    }
    public void restartGame(){
        parentGui.startGame();
    }
}
