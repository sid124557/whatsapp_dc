package X;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.6Wj  reason: invalid class name and case insensitive filesystem */
public final class C128506Wj extends C163157tM implements C187248wq {
    public C128506Wj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    public final void BuH(AnonymousClass6SR r4) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        obtain.writeInt(1);
        r4.writeToParcel(obtain, 0);
        A01(59, obtain);
    }
}
