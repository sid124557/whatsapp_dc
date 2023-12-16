package X;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;

/* renamed from: X.6WL  reason: invalid class name */
public abstract class AnonymousClass6WL extends AnonymousClass6DX implements IObjectWrapper {
    public AnonymousClass6WL() {
        super("com.google.android.gms.dynamic.IObjectWrapper");
    }

    public static IObjectWrapper A02(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        if (queryLocalInterface instanceof IObjectWrapper) {
            return (IObjectWrapper) queryLocalInterface;
        }
        return new AnonymousClass6WI(iBinder);
    }
}
