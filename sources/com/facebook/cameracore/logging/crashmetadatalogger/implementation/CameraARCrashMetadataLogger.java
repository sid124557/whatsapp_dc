package com.facebook.cameracore.logging.crashmetadatalogger.implementation;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C162457s7;
import com.facebook.breakpad.BreakpadManager;
import java.util.HashSet;
import java.util.Iterator;

public final class CameraARCrashMetadataLogger {
    public HashSet loggedKeys = AnonymousClass002.A0K();

    public final synchronized void cleanupBreakpadData() {
        Iterator it = this.loggedKeys.iterator();
        while (it.hasNext()) {
            BreakpadManager.removeCustomData(AnonymousClass001.A0m(it));
        }
        this.loggedKeys.clear();
    }

    public final synchronized void setBreakpadData(String str, String str2) {
        C162457s7.A0J(str, 0);
        C162457s7.A0J(str2, 1);
        BreakpadManager.setCustomData(str, str2, new Object[0]);
        this.loggedKeys.add(str);
    }

    public final void setLoggedKeys(HashSet hashSet) {
        C162457s7.A0J(hashSet, 0);
        this.loggedKeys = hashSet;
    }

    public final HashSet getLoggedKeys() {
        return this.loggedKeys;
    }
}
