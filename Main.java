/**
 * Program description.
 * @author Jihei Boun
 */
public class Main
{
	public static void main(String[] args)
	{
		//DECLARATION + INITIALIZATION SECTION
		String surname = "SPECIMEN";
		String givenName = "TEST V";

		String uscisNumber = "000-000-725";
		String category = "C09";
		String cardNumber = "SRC0000000725";

		String countryOfBirth = "Ethiopia";

		String termAndConditions = "None";

		String dateOfBirth = "01 JAN 1920";
		char sex = 'M';

		String validForm = "01/01/80";
		String cardExpires = "05/10/11";

		//INPUT SECTION
		// N/A
		
		//CALCULATION SECTION
		
		//OUTPUT SECTION
		System.out.println("╔══════════════════════════════════════════════════════════════════════");
		System.out.println("║         UNITED STATES OF AMERICA");
		System.out.println("║                                  EMPLOYMENT AUTHORIZATION CARD");
		System.out.println("║                       Surname");
		System.out.println("║                       " + surname);
		System.out.println("║  .----.    .----.     Given Name");
		System.out.println("║ (   ^  \\  /  ^   )    " + givenName);
		System.out.println("║        |  |           USCIS#         Category   Card#");
		System.out.println("║       _/  \\_          " + uscisNumber + "    " + category + "        " + cardNumber);
		System.out.println("║      (_    _)         Country of Birth");
		System.out.println("║   ,    `--`    ,      " + countryOfBirth);
		System.out.println("║   \\'-.______.-'/      Terms and Conditions");
		System.out.println("║    \\          /       " + termAndConditions);
		System.out.println("║     '.--..--.'        Date of Birth   Sex");
		System.out.println("║       `\"\"\"\"\"`         " + dateOfBirth + "     " + sex);
		System.out.println("║                       Valid From:     " + validForm);
		System.out.println("║                       Card Expires:   " + cardExpires);
		System.out.println("║ ascii art by: jgs     NOT VALID FOR REENTRY TO U.S.");
		System.out.println("╚══════════════════════════════════════════════════════════════════════");
		//ascii art credit: http://www.oocities.org/spunk1111/bodypart.htm
	}
}
