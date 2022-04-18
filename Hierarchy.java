package ExceptionHandling;

class OutOfMemoryError extends Error{
	private String message = "Memory Limit Exceeded";
	
	public OutOfMemoryError( String message) {
		super(message);
	}

	public OutOfMemoryError() {
		super("Memory Limit Exceeded");
	}

	
	
}
class InternalError extends Error{
	private String message;
	public InternalError(String message) {
		super(message);
	}
	public InternalError() {
		super("An Internal Error Occured");
	}
}
class IOException extends Exception{
	private String message;
	public IOException(String message) {
		super(message);
	}
	public IOException() {
		super("An Input-Output Exception Occured");
	}
}
class RuntimeException extends Exception{
	private String meesage;
	public RuntimeException(String message) {
		super(message);
	}
	public RuntimeException() {
		super();
	}
}
class ArithmeticException extends Exception{
	public ArithmeticException() {
		super("An Arithmetic Exception Occured...");
	}
	public ArithmeticException(String message) {
		super(message);
	}
}
class ArrayStoreException extends Exception{
	public ArrayStoreException() {
		super("An ArrayStore Exception Occured");
	}
	public ArrayStoreException(String message) {
		super(message);
	}
}
class NullPointerException extends Exception{
	public NullPointerException() {
		super("A null pointer exception occured");
		
	}
	public NullPointerException(String message) {
		super(message);
	}
}