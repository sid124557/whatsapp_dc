package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.01U  reason: invalid class name */
public abstract class AnonymousClass01U extends Binder implements IInterface {
    public static C15490rQ globalInterceptor;

    public static synchronized void installTransactionInterceptorPackagePrivate(C15490rQ r2) {
        synchronized (AnonymousClass01U.class) {
            if (r2 != null) {
                globalInterceptor = r2;
            } else {
                throw AnonymousClass001.A0c("null interceptor");
            }
        }
    }

    public IBinder asBinder() {
        return this;
    }

    public AnonymousClass01U(String str) {
        attachInterface(this, str);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        return dispatchTransaction(i, parcel, parcel2, i2);
    }

    public boolean routeToSuperOrEnforceInterface(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i > 16777215) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        parcel.enforceInterface(getInterfaceDescriptor());
        return false;
    }

    public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        return false;
    }
}
