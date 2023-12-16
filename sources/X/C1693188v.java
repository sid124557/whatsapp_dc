package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.88v  reason: invalid class name and case insensitive filesystem */
public final class C1693188v implements C180808lf {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ String A01;

    public C1693188v(String str, Bundle bundle) {
        this.A01 = str;
        this.A00 = bundle;
    }

    public final /* bridge */ /* synthetic */ Object BtH(IBinder iBinder) {
        Object r4;
        if (iBinder == null) {
            r4 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            if (queryLocalInterface instanceof C187098wV) {
                r4 = (C187098wV) queryLocalInterface;
            } else {
                r4 = new C128026Um(iBinder);
            }
        }
        String str = this.A01;
        Bundle bundle = this.A00;
        C163147tL r42 = (C163147tL) r4;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(r42.A01);
        obtain.writeString(str);
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        Parcel A002 = r42.A00(2, obtain);
        Bundle bundle2 = (Bundle) AnonymousClass6C7.A0Q(A002, Bundle.CREATOR);
        A002.recycle();
        if (bundle2 != null) {
            String string = bundle2.getString("Error");
            if (bundle2.getBoolean("booleanResult")) {
                return null;
            }
            throw new C143906zf(string);
        }
        C162297re.A01.A01("Service call returned null.", new Object[0]);
        throw AnonymousClass002.A0C("Service unavailable.");
    }
}
