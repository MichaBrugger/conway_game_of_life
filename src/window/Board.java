package src.window;

import java.awt.Graphics;

import javax.swing.JPanel;

import src.world.World;

public class Board extends JPanel {

  private static final long serialVersionUID = 1L;

  private World renderWorld;

  public void update(World renderWorld) {
    this.renderWorld = renderWorld;
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    if (renderWorld != null)
      this.renderWorld.draw(g);

    this.repaint();
  }
}
