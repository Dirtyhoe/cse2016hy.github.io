
import java.awt.*;
import javax.swing.*;
/** Frame2c shows a frame with whose label displays the number of times
    its button is pushed */
public class Frame2cApplet extends JApplet
{ private Counter count;  // address of model object
  private JLabel label = new JLabel("count = 0");  // label for the frame

  /** Constructor  Frame2c creates a frame with a label and button
    * @param c - the model object, a counter */
  public void init()
  { // These instructions were once found in the  main  method:
    //    Counter model = new Counter(0);
    //    Frame2c view = new Frame2c(model);
    // We replace them with this:
    count = new Counter(0);

    Container cp = getContentPane();
      cp.setLayout(new FlowLayout());
      cp.add(label);
      cp.add(new CountButton("OK", count, this)); // the button-controller
    // setTitle("Example2");
    // setSize(200, 60);
    // setVisible(true);
  }

  /** update revises the view */
  public void update()
  { label.setText("count = " + count.countOf()); }
}


