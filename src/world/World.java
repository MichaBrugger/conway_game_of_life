package src.world;

import java.awt.Graphics;

import src.Reference;
import src.utils.MathHelper;

public class World {

  private Cell[][] grid;

  public World() {
    this.grid = new Cell[Reference.WORLD_WIDTH][Reference.WORLD_HEIGHT];
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        this.grid[i][j] = MathHelper.randomBoolean() ? Cell.ALIVE : Cell.DEAD;
      }
    }
  }

  public void draw(Graphics graphics) {
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        graphics.setColor(grid[i][j].getColor());
        graphics.fillRect(i * Reference.CELL_SIZE, j * Reference.CELL_SIZE, Reference.CELL_SIZE, Reference.CELL_SIZE);
      }
    }
  }

  public void update() {
    int aliveCount;
    Cell[][] gridCopy = new Cell[Reference.WORLD_WIDTH][Reference.WORLD_HEIGHT];

    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {

        aliveCount = this.countAliveNeighbors(i, j);

        if (grid[i][j] == Cell.ALIVE) {
          if (aliveCount < 2)
            gridCopy[i][j] = Cell.DEAD;
          else if (aliveCount > 3)
            gridCopy[i][j] = Cell.DEAD;
          else
            gridCopy[i][j] = Cell.ALIVE;
        } else {
          if (aliveCount == 3)
            gridCopy[i][j] = Cell.ALIVE;
          else
            gridCopy[i][j] = Cell.DEAD;
        }
      }
    }
    this.grid = gridCopy;
  }

  private int countAliveNeighbors(int ci, int cj) {
    int aliveCount = 0;
    for (int i = ci - 1; i <= ci + 1; i++) {
      for (int j = cj - 1; j <= cj + 1; j++) {
        try {
          if (grid[i][j] == Cell.ALIVE)
            aliveCount++;
        } catch (ArrayIndexOutOfBoundsException e) {
          continue;
        }
      }
    }
    if (grid[ci][cj] == Cell.ALIVE)
      return aliveCount - 1;
    else
      return aliveCount;
  }
}
