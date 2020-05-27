import java.util.List;

public class CalculateImpl implements Calculate{
    private int a,b;
    private String c;

    public CalculateImpl(String[] list) {
       this.a=Integer.parseInt(list[0]);
       this.b=Integer.parseInt(list[2]);
       this.c=list[1];
        }

    public int getResult() {
        if(c.equals("+"))return add(a,b);
        if(c.equals("-"))return subtract(a,b);
        if(c.equals("*"))return multiplicat(a,b);
        if(c.equals("/"))return division(a,b);
        throw new IllegalArgumentException();
    }

    @Override
    public int add(int a,int b) {
        return a+b;
    }

    @Override
    public int subtract(int a,int b) {
        return a-b;
    }

    @Override
    public int division(int a,int b) {
        return a/b;
    }

    @Override
    public int multiplicat(int a,int b) {
        return a*b;
    }

    @Override
    public int ostatok(int a, int b) {
        return 0;
    }
}
