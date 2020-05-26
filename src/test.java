import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {
    public static void main(String[] args) throws IOException {
        String[]list;
        String[]listvalue=new String[3];
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String s=reader.readLine();
        list=s.split("[\\+\\-*/]");
        String operation=s.substring(list[0].length(),list[0].length()+1);
        listvalue[0]=list[0];
        listvalue[1]=operation;
        listvalue[2]=list[1];
        for(String a:listvalue) System.out.println(a);
    }
}
