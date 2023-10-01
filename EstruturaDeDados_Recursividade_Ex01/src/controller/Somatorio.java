package controller;

public class Somatorio  {
	
	public int recursiva(int num) {
		if(num<0) {
			return 0;
		}
		if(num==0) {
			return num;
		}
		return num + recursiva(num-1);
	}
}
