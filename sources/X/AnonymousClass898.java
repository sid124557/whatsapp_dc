package X;

import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.898  reason: invalid class name */
public class AnonymousClass898 implements C187778xn, C187788xo {
    public final /* synthetic */ C159027ky A00;

    public AnonymousClass898(C159027ky r1) {
        this.A00 = r1;
    }

    public void onConnected(Bundle bundle) {
        C159027ky r6 = this.A00;
        if (r6.A07.A05()) {
            C626936e.A06(r6.A02);
            Iterator A0v = AnonymousClass001.A0v(r6.A02);
            while (A0v.hasNext()) {
                AnonymousClass8B2 r4 = (AnonymousClass8B2) A0v.next();
                LocationRequest A002 = C159027ky.A00(r4);
                try {
                    C159087l6 r2 = r6.A01;
                    C162177rO.A03(Looper.myLooper(), "Calling thread must be a prepared Looper thread.");
                    r2.A01(new C128616Wu(r2, r4, A002));
                } catch (SecurityException e) {
                    Log.w("FusedLocationManager/GmsConnectionCallbacks/onConnected/unable to request location updates", e);
                }
            }
            if (r6.A02.isEmpty()) {
                C626936e.A06(r6.A01);
                r6.A01.A02();
            }
        }
    }

    public void onConnectionFailed(C127866Tp r1) {
    }

    public void onConnectionSuspended(int i) {
    }
}
