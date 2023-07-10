
// HALA KHALEEL ALHARBI 2005629
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RPSGameController implements Initializable {

    @FXML
    private ImageView userImage;
    @FXML
    private ImageView computerImage;
    @FXML
    private Button rockButton;
    @FXML
    private Button paperButton;
    @FXML
    private Button scissorsButton;
    @FXML
    private Label outputLabel;

    
    private Image paperImage;
    private Image scissorsImage;
    private Image rockImage;
    public void initialize() {
       paperImage=new Image("PAPER.jpeg");
       scissorsImage=new Image("SICSSORS.jpeg");
       rockImage=new Image("ROCK.jpeg");
    }    
    @FXML
    public void setRock(){
        userImage.setImage(rockImage);
        setComputerImage(1);
    }
    @FXML
    public void setPaper(){
        userImage.setImage(paperImage);
        setComputerImage(2);
    }
    @FXML
    public void setScissors(){
        userImage.setImage(scissorsImage);
        setComputerImage(3);
    }
    
    
    public void setComputerImage(int user){
        Random rc = new Random();
        int computer = rc.nextInt(3) + 1;
        if(computer==1){
            computerImage.setImage(rockImage);
        }else if(computer==2){
            computerImage.setImage(paperImage);
        }else{
            computerImage.setImage(scissorsImage);
        }
        if(user==computer){
            outputLabel.setText("It is a draw");
        }else{
          
            switch (user){
            case 1:
                if (computer == 3)
                    outputLabel.setText("You wins!");
                else
                    outputLabel.setText("Computer wins!");
                break;
            case 2:
                if (computer == 1)
                    outputLabel.setText("You wins!");
                else
                    outputLabel.setText("Computer wins!");
                break;
            case 3:
                if (computer == 2)
                    outputLabel.setText("You wins!");
                else
                    outputLabel.setText("Computer wins!");
                break;
           
                
            }
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

