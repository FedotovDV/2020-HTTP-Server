package net.devstudy.httpserver.io;

import java.util.Map;

public interface HtmlTemplateManager {
	
	String processTemplate(String templateName, Map<String, Object> args);

}
