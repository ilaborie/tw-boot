package ui;

public class Notice {

	public static Notice info(String message) {
		return new Notice(Kind.info, message);
	}

	public static Notice success(String message) {
		return new Notice(Kind.success, message);
	}

	public static Notice warn(String message) {
		return new Notice(Kind.warn, message);
	}
	public static Notice danger(String message) {
		return new Notice(Kind.danger, message);
	}

	public static Notice error(String message) {
		return new Notice(Kind.error, message);
	}

	private static enum Kind {
		info, success, warn, error,danger;
	}

	private final Kind kind;
	private final String message;

	private Notice(Kind kind, String message) {
		super();
		this.kind = kind;
		this.message = message;
	}

	public Kind getKind() {
		return kind;
	}

	public String getMessage() {
		return message;
	}

}
