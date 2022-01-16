/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte argümanlar açısından hız ve okunabilirlik durumu çözülebilmiştir. Ancak hala setColor ve move
    metotlarının parametreleri geçilecek değerler açısından bir fikir vermemektedir

    Örnekte detaylar gözardı edilmiştir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
    public static void main(String [] args)
    {
        SpaceGame game = new SpaceGame();

        game.run();
    }
}

class Color {
    //...
    public static final int RED = 0;
    public static final int GREEN = 1;
    public static final int BLUE = 2;
    public static final int WHITE = 3;
    public static final int BLACK = 4;
}

class Direction {
    //...
    public static final int RIGHT = 0;
    public static final int TOP = 1;
    public static final int LEFT = 2;
    public static final int BOTTOM = 3;
}

class SpaceGame {
    //...
    public void run()
    {
        Alien alien = new Alien(/*...*/);

        //...

        alien.setColor(Color.RED);

        //...
        alien.move(Direction.LEFT);
        alien.move(Direction.TOP);
        alien.move(Direction.BOTTOM);
        //...
    }
}

class Alien {
    private int m_color;
    //...
    public void setColor(int color)
    {
        //...
        m_color = color;
    }

    //...

    public void move(int direction)
    {
        //...
    }

    //...
}
