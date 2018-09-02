package com.scorecard.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface ScorecardServiceAsync {
    void getMessage(String msg, AsyncCallback<String> async);
}
