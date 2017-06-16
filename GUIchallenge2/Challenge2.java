import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.event.ActionEvent;

public class Challenge2
{
    private static TextField txtFieldMessage;
    
    public static void main(String args[])
    {
        launchFX();
    }
    private static void launchFX()
    {
        //Initialises JavaFX
        new JFXPanel();//Runs initialisation on the JavaFX thread
        Platform.runLater(() -> initialiseGUI());
    }
    public static void initialiseGUI()
    {
        Stage stage = new Stage();
        stage.setTitle("Hello World");
        stage.setResizable(false);
        Pane rootPane = new Pane();
        stage.setScene(new Scene(rootPane));
        stage.setWidth(1024);
        stage.setHeight(768);
        stage.show();
        
        txtFieldMessage = new TextField();
        txtFieldMessage.setLayoutX(400);
        txtFieldMessage.setLayoutY(250);
        txtFieldMessage.setPrefWidth(400);
        txtFieldMessage.setPromptText("Enter your messsage");
        rootPane.getChildren().add(txtFieldMessage);
        
        Button btn = new Button();
        btn.setText("Click Me!");
        btn.setLayoutX(350);
        btn.setLayoutY(50);
        btn.setOnAction((ActionEvent ae) -> printMessage());
        rootPane.getChildren().add(btn);
    }
    
    private static void printMessage()
    {
        String message = txtFieldMessage.getText();
        System.out.println(message);
    }
}