package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.7tH  reason: invalid class name and case insensitive filesystem */
public class C163107tH implements IInterface {
    public final IBinder A00;
    public final String A01;

    public final IBinder asBinder() {
        return this.A00;
    }

    public C163107tH(IBinder iBinder, String str) {
        this.A00 = iBinder;
        this.A01 = str;
    }

    public final void A00(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            AnonymousClass000.A0w(this.A00, parcel, obtain, i);
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
