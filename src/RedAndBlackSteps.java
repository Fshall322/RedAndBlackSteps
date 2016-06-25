/**
 * Created by Frank Hall on 6/25/2016.
 */
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
@SuppressWarnings("serial")

public class RedAndBlackSteps extends JFrame
{
    public int startX, startY;
    public static int brickWidth, brickHeight, brickSpace;
    public static int numberOfRows;
    public RedAndBlackSteps()
    {
        super ("Pyramid");
        startX = 400;
        startY = 50;
        brickWidth = 50;
        brickHeight = 50;
        brickSpace = 2;
        numberOfRows = 5;
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        int currentX = startX;
        int currentY = startY;
        for (int i = 0; i < numberOfRows; i++) //for loop used to draw the bricks      building the steps
        {
            for (int j = 0; j <= i; j++)
            {
                g.setColor(Color.red);
            }
            g.fillRect(currentX, currentY, brickWidth, brickHeight);
            currentY = currentY + 50 + brickSpace;
            currentX = currentX - 50 + brickSpace;
        }
    }
    public static void main(String[] args) // main used to display GUI dialogue box
    {
        RedAndBlackSteps app = new RedAndBlackSteps();
        app.setSize(800, 400);
        app.setVisible(true);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //when user presses "X" the    dialogue box will close
    }
}
