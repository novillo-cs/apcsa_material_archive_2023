void setup(){
    size(1450,500);
    PImage car = loadImage("redcar.png");
    PImage output = car.copy();
    Kernel k = new Kernel( new float[][] {
      {-1, -1, -1},
      {-1, 8, -1},
      {-1, -1, -1}
    } );
    Kernel k2 = new Kernel( new float[][] {
      {.11, .11, .11},
      {.11, .11, .11},
      {.11, .11, .11}
    } );
    Kernel k3 = new Kernel( new float[][] {
      {0, -1, 0},
      {-1, 5, -1},
      {0, -1, 0}
    } );
    k3.apply(car,output);
    image(car,0,0);
    image(output,car.width,0);
 }
