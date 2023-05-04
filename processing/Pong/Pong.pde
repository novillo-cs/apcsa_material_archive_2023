Ball ball; 

Paddle paddleLeft;
Paddle paddleRight;

int scoreLeft = 0;
int scoreRight = 0;

void setup(){
  size(800,600);
  ball = new Ball(width/2, height/2, 50); //create a new ball (center of the window)
  ball.speedX = 5; // Giving the ball speed in x-axis
  ball.speedY = random(-3,3); // Giving the ball speed in y-axis
  
  paddleLeft = new Paddle(15, height/2, 30,200);
  paddleRight = new Paddle(width-15, height/2, 30,200);

}

void draw(){
  background(0); //clear canvas
  
  ball.move(); //calculate a new location for the ball
  ball.display(); // Draw the ball on the window
  
  paddleLeft.move();
  paddleLeft.display();
  paddleRight.move();
  paddleRight.display();
  
  if (ball.right() > width) {
    // INCREASE scoreLeft
    
    // UPDATE BALL x and y coordinates
    
    // UPDATE BALL X SPEED. YOU MAY USE THIS FUNCTION Math.signum(ball.speedX) AND MULTIPLY
    // BY A CONSTANT VALUE SUCH AS 5 (PLAY WITH OTHER VALUES AND SEE WHAT HAHPPENS)

    // UPDATE BALL Y SPEED -  PICK A RANDOM NUMBER BETWEEN -3 AND 3
    
  }
  
  if (ball.left() < 0) {
      // INCREASE scoreRight
    
    // UPDATE BALL x and y coordinates
    
    // UPDATE BALL X SPEED. YOU MAY USE THIS FUNCTION Math.signum(ball.speedX) AND MULTIPLY
    // BY A CONSTANT VALUE SUCH AS 5 (PLAY WITH OTHER VALUES AND SEE WHAT HAHPPENS)

    // UPDATE BALL Y SPEED -  PICK A RANDOM NUMBER BETWEEN -3 AND 3
  }
  
  if (ball.bottom() > height) {
    // UPDATE BALL Y SPEED
  }
  
  if (ball.top() < 0) {
     // UPDATE BALL Y SPEED
  }
  
  if (paddleLeft.bottom() > height) {
    // UPDATE paddleLeft
    // HINT: height-paddleLeft.h/2;
  }

  if (paddleLeft.top() < 0) {
     // UPDATE paddleLeft
    // HINT: paddleLeft.h/2;

  }
    
  if (paddleRight.bottom() > height) {
    // UPDATE paddleRight
  }

  if (paddleRight.top() < 0) {
     // UPDATE paddleRight
  }
  
  
  // If the ball gets behind the paddle 
  // AND if the ball is int the area of the paddle (between paddle top and bottom)
  // bounce the ball to other direction
  // If the ball touch the paddle in the extremity of the paddle, speedY of the ball is -10 or 10
  // if the ball touch the paddle in the middle of the paddle, speedY of the ball is 0
  // Hint: use map function - Re-maps a number from one range to another.
  
  if ( ball.left() < paddleLeft.right() && ball.y > paddleLeft.top() && ball.y < paddleLeft.bottom()){
   
  }

  if ( ball.right() > paddleRight.left() && ball.y > paddleRight.top() && ball.y < paddleRight.bottom()) {

  }
  
  
  
  // Write the score of the game, on top of the display
  
  
}

void keyPressed(){
  if(keyCode == UP){
    paddleRight.speedY=-3;
  }
  if(keyCode == DOWN){
    paddleRight.speedY=3;
  }
  if(key == 'a'){
    paddleLeft.speedY=-3;
  }
  if(key == 'z'){
    paddleLeft.speedY=3;
  }
}

void keyReleased(){
  if(keyCode == UP){
    paddleRight.speedY=0;
  }
  if(keyCode == DOWN){
    paddleRight.speedY=0;
  }
  if(key == 'a'){
    paddleLeft.speedY=0;
  }
  if(key == 'z'){
    paddleLeft.speedY=0;
  }
}
