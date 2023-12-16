package X;

import android.content.Context;
import android.os.Binder;
import android.os.IInterface;

/* renamed from: X.6Uh  reason: invalid class name and case insensitive filesystem */
public final class C127976Uh extends AnonymousClass6DT implements IInterface {
    public final Context A00;

    public final void A00() {
        if (!AnonymousClass72O.A00(this.A00, Binder.getCallingUid())) {
            int callingUid = Binder.getCallingUid();
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Calling UID ");
            A0o.append(callingUid);
            throw new SecurityException(AnonymousClass000.A0X(" is not Google Play services.", A0o));
        }
    }

    public C127976Uh(Context context) {
        this();
        this.A00 = context;
    }

    public C127976Uh() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }
}
