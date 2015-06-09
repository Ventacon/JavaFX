package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

/**
 * @author Bogachan
 *
 */
public class Client extends Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		BorderPane pane = new BorderPane();

		Scene scene = new Scene(pane);

		stage.setTitle("Hier ist der Titel!");
		stage.centerOnScreen();
		stage.setHeight(720);
		stage.setWidth(1020);
		stage.setScene(scene);
		stage.show();
	}
}
