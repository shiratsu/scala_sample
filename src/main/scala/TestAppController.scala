import scalafx.Includes._
import scalafx.scene.canvas.{Canvas, GraphicsContext}
import scalafx.scene.control.Button
import scalafx.scene.input.MouseEvent
import scalafx.scene.paint.{Color, Paint}
import scalafx.scene.shape.ArcType
import scalafxml.core.macros.sfxml

@sfxml
class TestAppController(
                         private val clearButton: Button,
                         private val canvas: Canvas
                       ) {
  val gc: GraphicsContext = canvas.graphicsContext2D
  clearCanvas()

  canvas.onMouseDragged = (e: MouseEvent) => {
    gc.fill = Color.Black
    gc.fillArc(e.x - 2, e.y - 2, 4, 4, 0, 360, ArcType.Open)
  }

  clearButton.onMouseClicked = (e: MouseEvent) => {
    clearCanvas()
  }

  def clearCanvas(): Unit = {
    gc.fill = Color.White
    gc.fillRect(0, 0, canvas.width(), canvas.height())
  }
}