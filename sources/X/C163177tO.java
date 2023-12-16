package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.7tO  reason: invalid class name and case insensitive filesystem */
public class C163177tO implements IInterface {
    public final IBinder A00;
    public final String A01;

    public final IBinder asBinder() {
        return this.A00;
    }

    public C163177tO(IBinder iBinder, String str) {
        this.A00 = iBinder;
        this.A01 = str;
    }

    public final Parcel A00() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        return obtain;
    }

    public final Parcel A01(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            AnonymousClass000.A0w(this.A00, parcel, parcel, i);
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public final void A02(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            AnonymousClass000.A0w(this.A00, parcel, obtain, i);
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
