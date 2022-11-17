class shape
{
void draw()
{
System.out.println("we are draving the shape here ");
}
void erase()
{
System.out.println("we are erasing   the shape here ");
}
}
class circle extends shape
{
void draw()
{
System.out.println("we are draving circle shape here ");
}
void erase()
{System.out.println("we are erasing circle  shape here ");}
}
class tringle extends shape
{
void draw()
{System.out.println("we are draving the tringle shape here ");}
void erase()
{System.out.println("we are erasing tringle the shape here ");}
}
class square extends shape
{
void draw()
{System.out.println("we are draving squre  shape here ");}
void erase()
{System.out.println("we are erasing square the shape here ");}
}
class run
{
public static void main(String args[])
{
shape c= new circle();
shape t=new tringle();
shape s=new square();
c.draw();
c.erase();
t.draw();
t.erase();
s.draw();
s.erase();
}
}