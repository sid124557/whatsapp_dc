package com.facebook.quicklog.reliability;

import X.AnonymousClass000;

public class UserFlowJNIProvider {
    public static UserFlowLogger mUserFlowLogger;

    public static UserFlowLogger getUserFlowInstance() {
        return mUserFlowLogger;
    }

    public static synchronized boolean isInitialized() {
        boolean A1W;
        synchronized (UserFlowJNIProvider.class) {
            A1W = AnonymousClass000.A1W(mUserFlowLogger);
        }
        return A1W;
    }

    public static synchronized void setUserFlowLogger(UserFlowLogger userFlowLogger) {
        synchronized (UserFlowJNIProvider.class) {
            mUserFlowLogger = userFlowLogger;
        }
    }
}
