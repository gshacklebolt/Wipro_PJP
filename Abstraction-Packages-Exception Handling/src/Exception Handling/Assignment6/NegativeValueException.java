package Assignment6;

@SuppressWarnings("serial")
public class NegativeValueException extends Exception {
	NegativeValueException(int subject){
		super(subject+": Negative marks not allowed");
	}
}
