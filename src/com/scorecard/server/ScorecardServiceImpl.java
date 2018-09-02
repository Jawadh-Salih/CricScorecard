package com.scorecard.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.scorecard.client.ScorecardService;

public class ScorecardServiceImpl extends RemoteServiceServlet implements ScorecardService {
    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}