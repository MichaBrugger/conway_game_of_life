package src.mainloop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import src.Reference;
import src.window.Window;
import src.world.World;

public class MainLoop implements ActionListener {

  private Timer timer;

  private World world;

  public MainLoop() {
    this.timer = new Timer(Reference.TIMER_DELAY, this);
    this.world = new World();
  }

  public void start() {
    this.timer.start();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Window.updateBoard(world);
    this.world.update();
  }

}
