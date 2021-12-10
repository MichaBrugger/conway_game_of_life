package src.window;

import java.awt.Dimension;

import javax.swing.JFrame;

import src.Reference;
import src.world.World;

public class Window {

  private static JFrame window;
  private static Board board;

  public static void create() {
    window = new JFrame("Conway's Game of Life");
    window.setBounds(10, 10, 0, 0);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setResizable(false);

    board = new Board();
    board.setPreferredSize(
        new Dimension(Reference.WORLD_WIDTH * Reference.CELL_SIZE, Reference.WORLD_HEIGHT * Reference.CELL_SIZE));
    // board.setFocusable(true);
    window.setContentPane(board);
    window.pack();
    window.setVisible(true);
  }

  public static void updateBoard(World renderWorld) {
    board.update(renderWorld);
  }
}
