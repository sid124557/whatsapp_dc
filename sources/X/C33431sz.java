package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.1sz  reason: invalid class name and case insensitive filesystem */
public final class C33431sz extends AnonymousClass5ZM {
    public final Context A00;
    public final C29411im A01;
    public final C66523Lt A02;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        boolean z = false;
        try {
            if (this.A01.A06) {
                Log.i("MessageHandler/isCaptiveWifi awaiting captive wifi status");
                C66523Lt.A13.await();
                boolean z2 = C66523Lt.A15.get();
                C18260x0.A1E("MessageHandler/isCaptiveWifi status is ", AnonymousClass001.A0o(), z2);
                if (z2) {
                    z = true;
                }
            }
        } catch (InterruptedException unused) {
        }
        return Boolean.valueOf(z);
    }

    public C33431sz(Context context, C29411im r2, C66523Lt r3) {
        C18260x0.A0R(context, r3);
        this.A00 = context;
        this.A01 = r2;
        this.A02 = r3;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        if (AnonymousClass001.A1Z(obj)) {
            Context context = this.A00;
            Intent A07 = C18320x8.A07();
            A07.setClassName(context.getPackageName(), "com.whatsapp.messaging.CaptivePortalActivity");
            C18280x3.A0n(context, A07);
        }
    }
}
