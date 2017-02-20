
import java.math.*;
import java.util.*;

public class States {
	public static void main(String[] args) {
		int idx = 0, score = 0;
		boolean b;//randomizes asking for state or capital city
        Scanner sc = new Scanner(System.in);
        String answer;
        // This list is used to keep track of questions so they are not asked a second time.
        List<Integer> used = new ArrayList<Integer>();
        used.add(capList.length); //autoboxing
		
        int i=0;
		System.out.println("There are 10 questions. Enter the state or capitol city.");
		for (i=1; i<=10; i++) {
			idx = (int) Math.round(Math.random()*capList.length) - 1;
			b = new Random().nextBoolean();//randomizes asking for state or capital city

			if (used.contains(idx) | idx < 0) {
				i--; continue;
			}
			used.add(idx);
			if (b){
			System.out.println(i +". What is the capital of "+ capList[idx][0] + "?");}
			else{
				System.out.println(i +". "+ capList[idx][1] + " is the capital of what state?");}
			
			answer = sc.nextLine();
			if (b){
				if (answer.equalsIgnoreCase(capList[idx][1])){
					System.out.println("Correct");
					score++;
				} else {
					System.out.println("Wrong, its " + capList[idx][1]);
				}
			}
			else {
				if (answer.equalsIgnoreCase(capList[idx][0])){
					System.out.println("Correct");
					score++;
				} else {
					System.out.println("Wrong, its " + capList[idx][0]);
				}
			}	
		}	
		System.out.println("You got "+ score + " out of " + --i + " right!");   
		System.out.printf("Your score is %2.2f%%\n", (float)score/i*100 );
	}

	static final String [][] capList = 
		{ 	
		{"Alabama","Montgomery"},{"Alaska","Juneau"},{"Arizona","Phoenix"},{"Arkansas","Little Rock"},
		{"California","Sacramento"},{"Colorado","Denver"},{"Connecticut","Hartford"},{"Delaware","Dover"},
		{"Illinois","Springfield"},{"Indiana","Indianapolis"},{"Iowa","Des Moines"},{"Kansas","Topeka"},
		{"Kentucky","Frankfort"},{"Louisiana","Baton Rouge"},{"Maine","Augusta"},{"Maryland","Annapolis"},
		{"Massachusetts","Boston"},{"Michigan","Lansing"},{"Minnesota","Saint Paul"},{"Mississippi","Jackson"},
		{"Missouri","Jefferson City"},{"Montana","Helena"},{"Nebraska","Lincoln"},{"Nevada","Carson City"},
		{"New Hampshire","Concord"},{"New Jersey","Trenton"},{"New Mexico","Santa Fe"},{"New York","Albany"},
		{"North Carolina","Raleigh"},{"North Dakota","Bismarck"},{"Ohio","Columbus"},
		{"Oklahoma","Oklahoma City"},{"Oregon","Salem"},{"Pennsylvania","Harrisburg"},
		{"Rhode Island","Providence"},{"South Carolina","Columbia"},{"South Dakota","Pierre"},
		{"Tennessee","Nashville"},{"Texas","Austin"},{"Utah","Salt Lake City"},{"Vermont","Montpelier"},
		{"Virginia","Richmond"},{"Washington","Olympia"},{"West Virginia","Charleston"},{"Wisconsin","Madison"},
		{"Wyoming","Cheyenne"}
		};
}
