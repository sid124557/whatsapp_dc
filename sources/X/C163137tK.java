package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.7tK  reason: invalid class name and case insensitive filesystem */
public class C163137tK implements IInterface {
    public final IBinder A00;
    public final String A01;

    public final void A00(int i, Parcel parcel) {
        try {
            this.A00.transact(i, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.A00;
    }

    public C163137tK(IBinder iBinder, String str) {
        this.A00 = iBinder;
        this.A01 = str;
    }
}
