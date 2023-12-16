package X;

import com.whatsapp.registration.EULA;
import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: X.54R  reason: invalid class name */
public class AnonymousClass54R extends AnonymousClass5ZM {
    public final /* synthetic */ EULA A00;

    public AnonymousClass54R(EULA eula) {
        this.A00 = eula;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        try {
            return this.A00.A0X.A01(TimeUnit.SECONDS, 10);
        } catch (Exception e) {
            Log.w("EULA/exception while waiting on task killers thread to finish during onCreate ", e);
            return null;
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        int i;
        AnonymousClass5I5 r3 = (AnonymousClass5I5) obj;
        EULA eula = this.A00;
        eula.A0W = r3;
        if (r3 != null && r3.A00 != null) {
            i = 6;
        } else if (C627236i.A0C()) {
            i = 8;
        } else {
            return;
        }
        C621433s.A01(eula, i);
    }
}
