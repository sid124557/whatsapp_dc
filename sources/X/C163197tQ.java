package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.7tQ  reason: invalid class name and case insensitive filesystem */
public final class C163197tQ implements IInterface, C187088wU {
    public final IBinder A00;

    public final IBinder asBinder() {
        return this.A00;
    }

    public C163197tQ(IBinder iBinder) {
        this.A00 = iBinder;
    }

    public final Parcel A00(int i, Parcel parcel) {
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
}
