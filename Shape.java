public class Shape
{
  private int my_id;
  private int my_size;
  private int my_x1, my_x2, my_x3, my_x4;
  private int my_y1, my_y2, my_y3, my_y4;

  // Shape to size 2
  Shape(int id, int size, int x1, int y1, int x2, int y2)
  {
    my_id = id;
    my_size = size;
    my_x1 = x1;
    my_x2 = x2;
    my_y1 = y1;
    my_y2 = y2;
  }

  // shape of size 3
  Shape(int id, int size, int x1, int y1, int x2, int y2, int x3, int y3)
  {
    my_id = id;
    my_size = size;
    my_x1 = x1;
    my_x2 = x2;
    my_x3 = x3;
    my_y1 = y1;
    my_y2 = y2;
    my_y3 = y3;
  }

  Shape(int id, int size, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4)
  {
    my_id = id;
    my_size = size;
    my_x1 = x1;
    my_x2 = x2;
    my_x3 = x3;
    my_x4 = x4;
    my_y1 = y1;
    my_y2 = y2;
    my_y3 = y3;
    my_y4 = y4;
  }

  public int getID()   { return my_id;}
  public int getSize() { return my_size;}
  
  public int getX1()   { return my_x1; }
  public int getX2()   { return my_x2; }
  public int getX3()   { return my_x3; }
  public int getX4()   { return my_x4; }

  public int getY1()   { return my_y1; }
  public int getY2()   { return my_y2;}
  public int getY3()   { return my_y3;}
  public int getY4()   { return my_y4; }

}
