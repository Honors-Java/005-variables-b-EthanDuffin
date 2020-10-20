int var1 = random(25, 400);
int var2 = random(25, 400);
int var3 = random(25, 400);
int var4 = random(25, 400);

int r1 = random(1,255);
int g1 = random(1,255);
int b1 = random(1,255);

void setup() {
	size(500, 500);
  ellipseMode(CENTER);
  rectMode(CENTER);
  frameRate(60);
}

void mousePressed(){
var1 = (int) random(0, 500);
var2 = (int) random(0, 500);
var3 = (int) random(50, 400);
var4 = (int) random(50, 400);
background(250);
r1 = (int) random(1,255);
g1 = (int) random(1,255);
b1 = (int) random(1,255);
}

void draw() {
stroke(0);
fill(r1, g1, b1);
rect(var1, var2, var3, var4);
fill((int) random(0, 255), (int) random(0, 255), (int) random(0, 255));
ellipse(mouseX + (int) random(-30, 30), mouseY + (int) random(-30, 30), 10, 10);
}
