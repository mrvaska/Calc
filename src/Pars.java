import java.io.*;

public class Pars {
    private static int i;
    private static int k;

    public int prs1(String res) throws Exception {
//        ras = res.replaceAll("\\s", "");
        String ras = res.trim();

        switch (ras) {
            case "I":
                ras = "1";
                i = 1;
               
                break;
            case "II":
                ras = "2";
                i = 1;
               
                break;
            case "III":
                ras = "3";
                i = 1;
              
                break;
            case "IV":
                ras = "4";
                i = 1;
              
                break;
            case "V":
                ras = "5";
                i = 1;
               
                break;

            case "VI":
                ras = "6";
                i = 1;
               
                break;
            case "VII":
                ras = "7";
                i = 1;
                
                break;
            case "VIII":
                ras = "8";
                i = 1;
                
                break;
            case "IX":
                ras = "9";
                i = 1;
               
                break;
            case "X":
                ras = "10";
                i = 1;
               
                break;
            default:
		k = 1; 
             
                break;

        }
        int a = Integer.parseInt(ras);

        if (a > 10) {
            throw new Exception("");
        }

        return a;


    }


    public  int sh() throws Exception {
         int c = 0; 
        if (k+i == 2) {
         throw new Exception();
        }
        c = 1+i;
        i = 0;
        k = 0;
        return c;
    }


        public String prs3(int input){
        String s = "";

        while (input >= 90) {
            s += "C";
            input -= 100;
        }
        while (input >= 90) {
            s += "XC";
            input -= 90;
        }
        while (input >= 50) {
            s += "L";
            input -= 50;
        }
        while (input >= 40) {
            s += "XL";
            input -= 40;
        }
        while (input >= 10) {
            s += "X";
            input -= 10;
        }
        while (input >= 9) {
            s += "IX";
            input -= 9;
        }
        while (input >= 5) {
            s += "V";
            input -= 5;
        }
        while (input >= 4) {
            s += "IV";
            input -= 4;
        }
        while (input >= 1) {
            s += "I";
            input -= 1;
        }
        switch (input) {
            case -1:
                s = "-I";
               
                break;
            case -2:
                s = "-II";
               
                break;
            case -3:
                s = "-III";
             
                break;
            case -4:
                s = "-IV";
               
                break;
            case -5:
                s = "-V";
                i += 1;
                break;

            case -6:
                s = "-VI";
              
                break;
            case -7:
                s = "-VII";
             
                break;
            case -8:
                s = "-VIII";
           
                break;
            case -9:
                s = "-IX";
          
                break;
            case -10:
                s = "-X";
               
                break;
            default:

                break;

        }
        return s;

    }


}
