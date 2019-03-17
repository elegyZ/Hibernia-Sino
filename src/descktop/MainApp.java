package descktop;

import java.io.IOException;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model.Claim;
import test.TestCase;

public class MainApp extends Application 
{
	private TestCase testcase = new TestCase();
	private Stage primaryStage;
    private BorderPane rootLayout;
    private ObservableList<Claim> claimData = FXCollections.observableArrayList();
    
    public MainApp()
    {
    	testcase.addClaimList(claimData);
    }
    
    public ObservableList<Claim> getClaimData() 
    {
        return claimData;
    }
    
	@Override
	public void start(Stage primaryStage) 
	{
		this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Hibernia-Sino");
        
        initRootLayout();
        showClaimAffairView();
	}
	
	public void initRootLayout() 
	{
        try 
        {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("../view/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();            
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	public void showClaimAffairView() 
	{
        try 
        {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("../view/ClaimAffairView.fxml"));
            AnchorPane claimAffairView = (AnchorPane) loader.load();
            claimAffairView.setStyle("-fx-background-color: white;");
            rootLayout.setCenter(claimAffairView);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	public static void main(String[] args) 
	{
		launch(args);
	}
}
