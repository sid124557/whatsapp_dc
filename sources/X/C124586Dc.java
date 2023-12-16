package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.6Dc  reason: invalid class name and case insensitive filesystem */
public abstract class C124586Dc extends Binder implements IInterface {
    public static C178588hm zzc;

    public abstract boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2);

    public IBinder asBinder() {
        return this;
    }

    public C124586Dc(String str) {
        attachInterface(this, str);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            AnonymousClass6C8.A0w(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return dispatchTransaction(i, parcel, parcel2, i2);
    }
}
