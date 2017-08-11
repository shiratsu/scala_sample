import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafxml.core.{FXMLView, NoDependencyResolver}


object TestApp extends JFXApp {

  val resource = getClass.getResource("TestApp.fxml")
  val root = FXMLView(resource, NoDependencyResolver)

  stage = new JFXApp.PrimaryStage() {
    title = "Test App"
    scene = new Scene(root)
  }
}