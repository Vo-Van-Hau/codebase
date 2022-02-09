package servlet.single-support;

import javax.servlet.http.HttpServletRequest;

public class Main {
    
    public static String getAgent(HttpServletRequest request) {
        return request.getHeader("USER-AGENT");
    }
}
