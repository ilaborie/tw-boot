package ui;

public class TitledMessage {
	
	private final String title;

	private final String message;

	public TitledMessage(String title, String message) {
		super();
		this.title = title;
		this.message = message;
	}

	public String getTitle() {
		return this.title;
	}

	public String getMessage() {
		return this.message;
	}

}