package net.devstudy.httpserver.io.exception;

public class HttpVersionNotSupportedException extends AbstractRequestParseFailedException {

	private static final long serialVersionUID = -1725479430373902357L;

	public HttpVersionNotSupportedException(String message, String startingLine) {
		super(message, startingLine);
		setStatusCode(505);
	}
}

