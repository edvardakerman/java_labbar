import java.util.Scanner;

class personnummer {
    public static void main(String arg[]){

        String strPnr = getString();

        if (isValidPNR(strPnr)) {
            System.out.println("Giltigt nummer.");
        } else {
            System.out.println("Ej ett giltigt nummer.");
        }

    }

    // Metod för att hämta data från consolen, (personnummer)
    public static String getString() {

		Scanner input = new Scanner(System.in);

		System.out.print("Mata in personnummer: ");
		String number = input.nextLine();
		
		input.close();

		return number;
	}

    // Metod för att kontrolleran om personnummer är korrekt
    public static Boolean isValidPNR(String strPnr) {

        int produkt = 0;

        // loopar igenom personnumrets alla siffror
        for (int i = 0; i < strPnr.length(); i++) {
            
            // om i är jämnt
            if (i % 2 == 0) {
                
                if (Character.getNumericValue(strPnr.charAt(i)) * 2 >= 10){
                    String s = Integer.toString(Character.getNumericValue(strPnr.charAt(i)) * 2);
                    produkt += Character.getNumericValue(s.charAt(0)) + Character.getNumericValue(s.charAt(1));
                } else {
                   produkt += Character.getNumericValue(strPnr.charAt(i)) * 2;
                }
                
            // om i är udda
            } else {
                produkt += Character.getNumericValue(strPnr.charAt(i)) * 1;
            }
            
        }

        if (produkt % 10 == 0) {
            return true;
        } else {
            return false;
        }
	}

}