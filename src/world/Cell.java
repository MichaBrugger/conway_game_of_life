package src.world;

import java.awt.Color;

public enum Cell {

  DEAD(Color.WHITE),
  ALIVE(Color.BLACK);

  private Color color;

  Cell(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return color;
  }
}