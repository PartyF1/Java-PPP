package main;

public class Runner {
	int num;
	double time;
	
	public Runner(int num, double time) {
		this.num = num;
		this.time = time;
	}
}

//Компаратор сравнения по времени
class RunnerComparator implements java.util.Comparator<Runner> {
	public int compare(Runner a, Runner b) {
		return Double.compare(a.time, b.time);
	}
}