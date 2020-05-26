import java.util.regex.Pattern;

public class Cheker {
    public static boolean chekData(String s){
        int a;
        int b;
        String [] list=s.split("[\\+\\-*/]");
        Pattern pattern1=Pattern.compile("\\d");
        Pattern patternI=Pattern.compile("[IXV]");
        Pattern patternV=Pattern.compile("[^IXV\\d\\+\\-*/]");
        if(pattern1.matcher(list[0]).find()&&patternI.matcher(list[1]).find()) return false;
        if(patternI.matcher(list[0]).find()&&pattern1.matcher(list[1]).find()) return false;
        if(patternV.matcher(s).find())return false;
        //if(!Pattern.compile("\\+\\-*/").matcher(s).find()) return false;
        if(patternI.matcher(list[0]).find()){
            a=RomanNumeral.romanToArabic(list[0]);
            b=RomanNumeral.romanToArabic(list[1]);
            if(a<=0||a>10||b<=0||b>10)return false;
        }
        if(pattern1.matcher(list[0]).find()){
            a=Integer.parseInt(list[0]);
            b=Integer.parseInt(list[1]);
            if(a<=0||a>10||b<=0||b>10)return false;
        }


        return true;
    }
}
