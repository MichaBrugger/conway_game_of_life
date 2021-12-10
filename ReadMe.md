# Conway's Game of Life

I started looking into Cellular Automata and Genetic Algorithms and thought recreating Conway's Game might be a good start to get to try out the absolute basics.

## What is Conway's Game of Life?

Conway's Game of Life is a Cellular Automaton (basically a grid of cells that, in our simple case here, can either be dead or alive). Each generation the game determines if a cell is dead or alive based on a set of rules. 

## What are the rules?

I snacked the rules straight from Wikipedia, but if you'd liek to know more, there is a plethora of really interesting sources (I linked some I liked below). That being said, the rules of the game are pretty simple:

- Any live cell with fewer than two live neighbours dies, as if by underpopulation.
- Any live cell with two or three live neighbours lives on to the next generation.
- Any live cell with more than three live neighbours dies, as if by overpopulation.
- Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.


It's honestly pretty fascinating to see how from such a simple set, very complex structures can evolve.


## Sources
- Numberphile: [Inventing Game of Life (John Conway)](https://www.youtube.com/watch?v=R9Plq-D1gEk)
- Klayton Kowalski: [Game Development Tutorial | Cellular Automata and Procedural Map Generation](https://www.youtube.com/watch?v=slTEz6555Ts)
- The Coding Train: [Coding Challenge #85: The Game of Life](https://www.youtube.com/watch?v=FWSR_7kZuYg)
- Wikipedia (of course): [Conway's Game of Life](https://en.wikipedia.org/w/index.php?title=Conway%27s_Game_of_Life&oldid=1058957622)
