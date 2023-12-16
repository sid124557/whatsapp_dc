package com.google.android.gms.auth.api.signin;

import X.AnonymousClass6C9;
import X.C127976Uh;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public final class RevocationBoundService extends Service {
    public IBinder onBind(Intent intent) {
        if ("com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect".equals(intent.getAction()) || "com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState".equals(intent.getAction())) {
            if (Log.isLoggable("RevocationService", 2)) {
                Log.v("RevocationService", "RevocationBoundService handling ".concat(String.valueOf(intent.getAction())));
            }
            return new C127976Uh(this);
        }
        AnonymousClass6C9.A13("Unknown action sent to RevocationBoundService: ", String.valueOf(intent.getAction()), "RevocationService");
        return null;
    }
}
