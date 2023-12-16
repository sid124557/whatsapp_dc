package org.npci.upi.security.pinactivitycomponent;

import X.AnonymousClass002;
import X.C124596Dd;
import X.C19350zK;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class CLRemoteServiceImpl extends Service {
    public C124596Dd A00 = null;
    public C19350zK A01 = null;

    public IBinder onBind(Intent intent) {
        if (this.A00 == null) {
            this.A00 = new C124596Dd(getBaseContext(), this);
        }
        try {
            this.A01 = new C19350zK(getBaseContext());
            return this.A00;
        } catch (Exception unused) {
            throw AnonymousClass002.A0E("Could not initialize service provider");
        }
    }
}
