package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.7tN  reason: invalid class name and case insensitive filesystem */
public class C163167tN implements IInterface {
    public final IBinder A00;
    public final String A01;

    public final Parcel A00(Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            AnonymousClass000.A0w(this.A00, parcel, parcel, 1);
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.A00;
    }

    public C163167tN(IBinder iBinder, String str) {
        this.A00 = iBinder;
        this.A01 = str;
    }
}
