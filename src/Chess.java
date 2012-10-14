import java.util.ArrayList;



public class Chess {
	
	
	private int[] position = {0,0};
	private String direction;
	
	@SuppressWarnings("rawtypes")
	ArrayList Direction = new ArrayList();
	
	
	@SuppressWarnings("unchecked")
	public Chess(int horizontalposition, int verticalposition, String direction){
		
		this.direction = direction;
		position[0]=verticalposition;
		position[1]=horizontalposition;
		Direction.add(0, "EAST");
		Direction.add(1, "SOUTH");
		Direction.add(2, "WEST");
		Direction.add(3, "NORTH");
	}
	
	public void turnleft() {
		
		int index = Direction.indexOf(direction);
		if (index == 0) {
			index = 3;
		} else {
			index = index - 1;
		}
		direction = (String) Direction.get(index);
	}
	
	public void turnright() {
		
		int index = Direction.indexOf(direction);
		if (index == 3) {
			index = 0;
		} else {
			index = index + 1;
		}
		direction = (String) Direction.get(index);
	}
	
	public void forward() {
				
		switch (direction) {
		case "EAST":
			position[1] = position[1] + 1;
			break;
		case "WEST":
			position[1] = position[1] - 1;
			break;
		case "SOUTH":
			position[0] = position[0] - 1;
			break;
		case "NORTH":
			position[0] = position[0] + 1;
			break;
		}
		
		
		
	}
	
	public int[] getposition() {
		return position;
	}
	
	public String getdirection() {
		return direction;
	}
}
