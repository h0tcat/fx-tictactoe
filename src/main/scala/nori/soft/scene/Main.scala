package nori.soft.scene

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.image.Image
import javafx.scene.{Parent, Scene}
import javafx.stage.Stage

object Main extends App {
  var sceneStage: Stage = _
  Application.launch(classOf[Main], args: _*)
}

class Main extends Application {
  override def start(stage: Stage) {
    val parentRoot: Parent = FXMLLoader.load(getClass.getResource("/Form.fxml"))

    Main.sceneStage = stage

    stage.setScene(new Scene(parentRoot))

    stage.show()
  }
}
