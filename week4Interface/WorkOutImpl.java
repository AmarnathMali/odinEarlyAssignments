package week4Interface;

public class WorkOutImpl implements IWorkOut {
	WorkOut[] workout = new WorkOut[5];
	WorkOut w = new WorkOut("cardio","dumbill","20","5","strength");
	WorkOut inst = w;
	int index = 0;
	@Override
	public String addWorkOut(WorkOut object, int index) {
		// TODO Auto-generated method stub
		workout[index] = w;
		index++;
		return null;
	}
	@Override
	public String displayMyWorkOut() {
		// TODO Auto-generated method stub
		System.out.println(w);
		return "w";
	}
}
