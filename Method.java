Class Shape
{
void draw()
{
system.out.println("drawing shape");}
void erase()
{
system.out.printl/n("erasing shape");}
class circle extends shape {
void draw()
{
system.out.println("drawing circle");}
}
void erase()
{
system.out.println("erasing circle");}
}
class traingle extends shape{
void draw()
{
system.out.println("drawing triangle");}
}
void erase()
{
system.out.println("erasing triangle");}
}
class square extends shape{
void draw()
{
system.out.println("drawing square");}
class Method {
public static void main(string args[]){
shape c=new circle();
shape t=new triangle();
shape s=new square();
c.draw();
c.erase();
t.draw();
t.erase();
s.draw();
s.error();
  }
}


