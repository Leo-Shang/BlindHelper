package application;
	
import org.opencv.core.Core;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	public static int newSceneWidth = 1200;
	public static int newSceneHeight = 800; 
	public static Scene scene;
	//public static Scene thisScene;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("MainWindow.fxml"));
			BorderPane root = (BorderPane)loader.load();
			scene = new Scene(root, 1200, 800);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			//thisScene = scene;
//			scene.widthProperty().addListener(new ChangeListener<Number>() {
//			    @Override public void changed(ObservableValue<? extends Number> observableValue, Number oldSceneWidth, Number newSceneWidth) {
//			        //Controller.imageView.setFitHeight(newSceneHeight * 0.7);
//			    	//Controller.resetWidth();
//			    	//imageView.setFitWidth(Main.newSceneWidth * 0.1);
//			    	Main.newSceneWidth = newSceneWidth.intValue();
//			    	System.out.println("Width: " + newSceneWidth);
//			    }
//			});
//			scene.heightProperty().addListener(new ChangeListener<Number>() {
//			    @Override public void changed(ObservableValue<? extends Number> observableValue, Number oldSceneHeight, Number newSceneHeight) {
//			    	//Controller.imageView.setFitWidth(Main.newSceneWidth * 0.7);
//			    	Main.newSceneHeight = newSceneHeight.intValue();
//			    	System.out.println("Height: "+ newSceneHeight);
//			    }
//			});
			primaryStage.setTitle("Blind Helper");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		launch(args);
	}
}
