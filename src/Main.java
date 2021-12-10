package src;

import src.mainloop.MainLoop;
import src.window.Window;

public class Main {
  public static void main(String[] args) {
    Window.create();
    new MainLoop().start();
  }
}