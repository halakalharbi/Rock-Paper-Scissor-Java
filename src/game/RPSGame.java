
import java.io.IOException;
import java.util.Random;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
// HALA KHALEEL ALHARBI 2005629 SEA
public class RPSGame extends Application{

    
    @Override
    public void start(Stage primaryStage) throws IOException {
       Parent parent = FXMLLoader.load(getClass().getResource("RPSGame.fxml"));
        
        Scene scene = new Scene(parent);
        
        primaryStage.setTitle("Rock, Paper, Scissors Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
