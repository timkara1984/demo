import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {
    public static String[] readValue() throws IOException {
        String[]list;
        String[]listvalue=new String[3];
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String s=reader.readLine();
        if(!Cheker.chekData(s)) throw new IllegalArgumentException();
        list=s.split("[\\+\\-*/]");
        String operation=s.substring(list[0].length(),list[0].length()+1);
        if(s.contains("V")||s.contains("I")||s.contains("X")){
            listvalue[0]= String.valueOf(RomanNumeral.romanToArabic(list[0]));
            listvalue[2]= String.valueOf(RomanNumeral.romanToArabic(list[1]));
            listvalue[1]=operation;
            Solution.whatNumbers=false;
        }
        else{
        listvalue[0]=list[0];
        listvalue[1]=operation;
        listvalue[2]=list[1];
        Solution.whatNumbers=true;
        }
        //for (String a:listvalue) System.out.println(a);
        return listvalue;
    }


}
