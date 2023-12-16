package X;

import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.4T7  reason: invalid class name */
public class AnonymousClass4T7 extends AnonymousClass0Q3 {
    public final /* synthetic */ C111175hf A00;
    public final /* synthetic */ WeakReference A01;

    public AnonymousClass4T7(C111175hf r1, WeakReference weakReference) {
        this.A00 = r1;
        this.A01 = weakReference;
    }

    public void A00() {
        Log.i("AppAuthManager/authenticate: authentication failed");
        C1229066h r0 = (C1229066h) this.A01.get();
        if (r0 != null) {
            r0.BMy();
        }
    }

    public void A03(AnonymousClass0KL r3) {
        Log.i("AppAuthManager/authenticate: authentication succeeded");
        C1229066h r1 = (C1229066h) this.A01.get();
        if (r1 != null) {
            r1.BN1((byte[]) null);
        }
    }

    public void A01(int i, CharSequence charSequence) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AppAuthManager/authenticate: authentication error=");
        A0o.append(i);
        C18260x0.A1Q(A0o, " errString=", charSequence);
        C1229066h r0 = (C1229066h) this.A01.get();
        if (r0 != null) {
            r0.BMx(i, charSequence);
        }
    }

    public void A02(int i, CharSequence charSequence) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AppAuthManager/authenticate: authentication help=");
        A0o.append(i);
        C18260x0.A1R(A0o, " errString=", charSequence);
        C1229066h r0 = (C1229066h) this.A01.get();
        if (r0 != null) {
            r0.BN0(i, charSequence);
        }
    }
}
