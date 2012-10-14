import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 
 * @author Shi Yan
 *
 */
public class BoardGame {

	/**
	 * @param args
	 * @throws IOException 
	 */
	private static String position;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		int x = 0;
		int y = 0;
		String d = "";
		boolean gotinstruction = true;
		while (gotinstruction){
			input = br.readLine();
			
			
			StringTokenizer st = new StringTokenizer(input);
			st.nextToken();
			x = Integer.parseInt(st.nextToken());		
			y = Integer.parseInt(st.nextToken());		
			d =st.nextToken();
			if (x>=0 && x<=9 && y>=0 && y<=9) {				
				if (d.equals("EAST")||d.equals("EAST")||d.equals("SOUTH")||d.equals("NORTH")){
					break;
				}
				else {
					System.err.println("Wrong direction.");
				}
			} else {
				System.err.println("Position out of range. Please choose two numbers between 0~9");
			}
			
		}
		
		
		
		
		Chess newgame = new Chess(y,x,d);
		while(true){
			  input = br.readLine();
			  if (input.equals("EXIT")){
				  break;
			  } else {
				  switch(input){
				  case "FORWARD":
					  newgame.forward();
					  break;
				  case "TURN LEFT":
					  newgame.turnleft();
					  break;
				  case "TURN RIGHT":
					  newgame.turnright();
					  break;
				  case "STATUS" :
				  {
					  position= Arrays.toString(newgame.getposition());
					  
					  System.out.println("Avator is at "+position+" facing "+newgame.getdirection());
				  }
					  
					  break;
				  default:
					  System.out.println("Invalid instruction");
				  
				  }
			  }
			  
		}
		System.exit(0);
	}
	

}
