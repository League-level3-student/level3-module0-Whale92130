package _05_Pixel_Art;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GridPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private int windowWidth;
	private int windowHeight;
	private int pixelWidth;
	private int pixelHeight;
	private int rows;
	private int cols;

	// 1. Create a 2D array of pixels. Do not initialize it yet.
	Pixel[][] pixels;
	private Color color;

	public GridPanel(int w, int h, int r, int c) {
		this.windowWidth = w;
		this.windowHeight = h;
		this.rows = r;
		this.cols = c;

		this.pixelWidth = windowWidth / cols;
		this.pixelHeight = windowHeight / rows;

		color = Color.BLACK;

		setPreferredSize(new Dimension(windowWidth, windowHeight));

		// 2. Initialize the pixel array using the rows and cols variables.
		
		pixels = new Pixel[rows][cols];

		// 3. Iterate through the array and initialize each element to a new pixel.
		for (int i = 0; i < rows; i++) {

			for (int o = 0; o < cols; o++) {
				pixels[i][o] = new Pixel(i, o);
			}
		}

	}

	public void setColor(Color c) {
		color = c;
	}

	public void clickPixel(int mouseX, int mouseY) {
		// 5. Use the mouseX and mouseY variables to change the color
		// of the pixel that was clicked. *HINT* Use the pixel's dimensions.
		for (int i = 0; i < rows; i++) {
			for (int o = 0; o < cols; o++) {
				if(mouseX/pixelWidth>= 0 && mouseX/pixelWidth <= windowWidth) {
					if (mouseY/pixelHeight >= 0 && mouseY/pixelHeight <= windowHeight) {
						pixels[mouseX/pixelWidth][mouseY/pixelHeight].color = color;
					}
					else {
						System.out.println("fail Y");
					}
				}
				else {
					System.out.println("fail X");
				}
			}
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		// 4. Iterate through the array.
		// For every pixel in the list, fill in a rectangle using the pixel's color.
		// Then, use drawRect to add a grid pattern to your display.
		for (int i = 0; i < rows; i++) {
			for (int o = 0; o < cols; o++) {
				g.setColor(pixels[i][o].color);
				g.fillRect(0+pixelWidth*i, 0+pixelHeight*o, pixelHeight, pixelWidth);

			}
		}
		for (int i = 0; i < rows; i++) {
			for (int o = 0; o < cols; o++) {
				g.setColor(Color.BLACK);
				g.drawRect(0+pixelWidth*i, 0+pixelHeight*o, pixelHeight, pixelWidth);
			}
		}

	}
}
