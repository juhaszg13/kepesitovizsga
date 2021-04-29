package hu.nive.ujratervezes.kepesitovizsga.addigits;

public class AddDigits {
    public int addDigits(String input){
        if(input==null||input.isBlank()){
         return -1;
        }
        int sum=0;
        char[] chars=input.toCharArray();
        for(char c:chars){
            if (Character.isDigit(c)) {
                sum+=Integer.parseInt(Character.toString(c));
            }
        }
        return sum;
    }
}
