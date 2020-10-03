package Assignment6;

@SuppressWarnings("serial")
public class OutOfRangeException extends Exception {
	OutOfRangeException(int subject){
		super(subject+":  Marks are out of range");
	}
}
