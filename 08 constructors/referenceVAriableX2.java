class demo4
{
    int x;
    int y;
    char a;

    // User defined constructor
        demo4()
        {
            System.out.println("running user defined constructor");
            x=125;
            y=33;
            a='v';
        }

    void display()
    {
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
    }
}

class referenceVAriableX2
{
    public static void main(String[] args)
    {
        demo4 D1 = new demo4();
        System.out.println(D1.x);
        System.out.println(D1.y);
        System.out.println(D1.a);
    }
}

