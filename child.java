class Grandparent
{
 public string GrandfatherName;
 public string  GrandMotherName;
 public Grandparent( string a,string b)
{
GrandfatherName=a;
GrandMotherName=b;
System.out.println(GrandfatherName);
System.out.println(GrandMotherName);
  }
}
class parent extends Grandparent
{
string fathername ,mothername;
public parent(string a,string b,string c,string d)
{fathername=a ;mothername=b;}
public parent(string a,string b)
{super(a,b);}
}
class child extends parent
{
child(string a,string b,string c,string d)
{super(a,b,c,d);}
public static void main(String args [])
{child c1=new child();
child("father","mother","grandfATHER","GRndmother");}
}