package X;

import android.os.Bundle;
import android.util.Log;

/* renamed from: X.7ay  reason: invalid class name and case insensitive filesystem */
public abstract class C153277ay {
    public final int A00;
    public final int A01;
    public final Bundle A02;
    public final C152017Xf A03 = new C152017Xf();

    public final void A01(C143496yy r6) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(r6);
            StringBuilder A0o = AnonymousClass6C7.A0o(valueOf.length() + 14, valueOf2);
            A0o.append("Failing ");
            A0o.append(valueOf);
            AnonymousClass6C7.A1G(" with ", valueOf2, "MessengerIpcClient", A0o);
        }
        this.A03.A00.A03(r6);
    }

    public final void A02(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(obj);
            StringBuilder A0o = AnonymousClass6C7.A0o(valueOf.length() + 16, valueOf2);
            A0o.append("Finishing ");
            A0o.append(valueOf);
            AnonymousClass6C7.A1G(" with ", valueOf2, "MessengerIpcClient", A0o);
        }
        this.A03.A00(obj);
    }

    public void A00(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        A02(bundle2);
    }

    public String toString() {
        boolean z;
        int i = this.A01;
        int i2 = this.A00;
        if (this instanceof C130136bR) {
            z = false;
        } else {
            z = true;
        }
        StringBuilder A0Y = AnonymousClass6CA.A0Y(55);
        A0Y.append("Request { what=");
        A0Y.append(i);
        A0Y.append(" id=");
        A0Y.append(i2);
        A0Y.append(" oneWay=");
        A0Y.append(z);
        return AnonymousClass000.A0g(A0Y);
    }

    public C153277ay(Bundle bundle, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = bundle;
    }
}
