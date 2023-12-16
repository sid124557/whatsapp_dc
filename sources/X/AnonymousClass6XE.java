package X;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: X.6XE  reason: invalid class name */
public abstract class AnonymousClass6XE extends AnonymousClass6DZ implements C187148wa {
    public static C187148wa A00(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        if (queryLocalInterface instanceof C187148wa) {
            return (C187148wa) queryLocalInterface;
        }
        return new C128646Wx(iBinder);
    }
}
