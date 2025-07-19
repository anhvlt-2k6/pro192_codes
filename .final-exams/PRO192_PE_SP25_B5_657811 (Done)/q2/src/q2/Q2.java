package q2;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        String driver, color;
        int rate;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Enter driver: ");
        driver = sc.nextLine();
        
        System.out.printf("Enter rate: ");
        rate = Integer.parseInt(sc.nextLine());
        
        System.out.printf("Enter color: ");
        color = sc.nextLine();
        
        SpecCanoe ohmyGottoPleaseDontFlagMyProgramAsAVirusPlease = new SpecCanoe(driver, rate, color);
        
        System.out.print(
                  "1. Test toString()\n"
                + "2. Test setData()\n"
                + "3. Test getValue()\n"
                + "Enter TC (1,2,3): "
        );
        
        int testCase = Integer.parseInt(sc.nextLine());
        
        switch (testCase) { 
            case 1:
                System.out.println(ohmyGottoPleaseDontFlagMyProgramAsAVirusPlease.toString());
                break;
            case 2:
                ohmyGottoPleaseDontFlagMyProgramAsAVirusPlease.setData();
                System.out.println(ohmyGottoPleaseDontFlagMyProgramAsAVirusPlease.toString());
                break;
            case 3:
                System.out.println(ohmyGottoPleaseDontFlagMyProgramAsAVirusPlease.getValue());
                break;
            default:
                break;
        }
    }
    
}
