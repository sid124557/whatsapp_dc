package X;

import android.app.Activity;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallState;

/* renamed from: X.4ID  reason: invalid class name */
public class AnonymousClass4ID implements C185958uW {
    public Object A00;
    public final int A01;

    public AnonymousClass4ID(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public /* synthetic */ void BO1(AnonymousClass3ZF r1) {
    }

    public void BOB(AnonymousClass3ZF r2) {
        if (this.A01 == 0) {
            Log.i("voipnotallowedactivity/onCallStarted finish this activity");
            ((Activity) this.A00).finish();
        }
    }

    public /* synthetic */ void BOC(C95814uZ r3, CallState callState, String str) {
        AnonymousClass39J r0;
        String str2;
        if (this.A01 != 0) {
            C162457s7.A0J(str, 0);
            C18260x0.A0Q(r3, callState);
            C22691Pe r1 = (C22691Pe) this.A00;
            AnonymousClass3ZF r02 = r1.getFMessage().A01;
            if (r02 != null && (r0 = r02.A0E) != null && (str2 = r0.A02) != null && str.equals(C627436k.A07(str2))) {
                r1.A22();
            }
        }
    }

    public /* synthetic */ void Bbe() {
    }

    public /* synthetic */ void BO8(AnonymousClass3ZF r1, boolean z) {
    }

    public /* synthetic */ void BO9(long j, boolean z, boolean z2, boolean z3, boolean z4) {
    }
}
