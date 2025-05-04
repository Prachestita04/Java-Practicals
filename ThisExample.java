public class ThisExample {
{
//    String name;
//    int rollno;
    ThisExample(String name,int rollno)  //Constructor
    {
        this.name=name;
        this.rollno=rollno;
    }
    public static void main(String[] args)
    {
        ThisExample s1=new ThisExample("vijayabhaskar",101);
        ThisExample s2=new ThisExample("bhaskar",102);
    }
}
}
