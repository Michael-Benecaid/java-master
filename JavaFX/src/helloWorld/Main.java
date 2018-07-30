package helloWorld;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
//			BorderPane root = new BorderPane();
			
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
//			GridPane root = new GridPane();
//			root.setAlignment(Pos.CENTER);
//			root.setVgap(10);
//			root.setHgap(10);
			
			Parent root = FXMLLoader.load(getClass().getResource("helloWorld.fxml"));
			Scene scene = new Scene(root,400,400);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Hello JavaFX!");
			primaryStage.show();

//			Label greeting = new Label("Welcome to JavaFX!");
//			greeting.setTextFill(Color.GREEN);
//			greeting.setFont(Font.font("Times New Roman", FontWeight.BOLD, 70));
//			
//			root.getChildren().add(greeting);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
