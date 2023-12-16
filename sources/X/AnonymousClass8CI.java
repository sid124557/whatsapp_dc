package X;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: X.8CI  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8CI implements C181288mW {
    public static final /* synthetic */ AnonymousClass8CI A00 = new AnonymousClass8CI();

    public final Object Avt(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
        if (!(queryLocalInterface instanceof C187228wn)) {
            return new C129086Zd(iBinder);
        }
        return queryLocalInterface;
    }
}
