package X;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: X.8CH  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8CH implements C181288mW {
    public static final /* synthetic */ AnonymousClass8CH A00 = new AnonymousClass8CH();

    public final Object Avt(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
        if (!(queryLocalInterface instanceof C187238wo)) {
            return new C129096Ze(iBinder);
        }
        return queryLocalInterface;
    }
}
