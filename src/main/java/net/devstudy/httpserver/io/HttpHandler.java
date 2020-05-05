package net.devstudy.httpserver.io;

import java.io.IOException;

public interface HttpHandler {
	void handle(HttpServerContext context, HttpRequest request, HttpResponse response) throws IOException;

}
