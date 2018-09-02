package com.scorecard.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("ScorecardService")
public interface ScorecardService extends RemoteService {
    // Sample interface method of remote interface
    String getMessage(String msg);

    /**
     * Utility/Convenience class.
     * Use ScorecardService.App.getInstance() to access static instance of ScorecardServiceAsync
     */
    public static class App {
        private static ScorecardServiceAsync ourInstance = GWT.create(ScorecardService.class);

        public static synchronized ScorecardServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
