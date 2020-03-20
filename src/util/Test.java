package util;

public class Test {

	public static void main(String[] args) {
		String s = "DDUUDDUU";
		int i = countingValleys(0, s);
	}
	
	static int countingValleys(int n, String s) {
		char[] steps = s.toCharArray();
		int height = 0;
		int valleyCount = 0;
		boolean valley = false;
		for(char step : steps) {
			if(step == 'D') {
				height--;
			} else if(step == 'U') {
				height++;
			}
			
			if(height < 0) {
				valley = true;
			}
			
			if(valley && height == 0) {
				valleyCount++;
				valley = false;
			}
		}
		
		return valleyCount;
	}
}
