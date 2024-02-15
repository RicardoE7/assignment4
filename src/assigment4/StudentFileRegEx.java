package assigment4;

public class StudentFileRegEx {
	public boolean compSciMatch (String input) {
		return input.matches("COMPSCI.+");
	}
	public boolean statMatch (String input) {
		return input.matches("STAT.+");
	}
	public boolean apmthMatch (String input) {
		return input.matches("APMTH.+");
	}
}
