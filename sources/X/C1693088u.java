package X;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.88u  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1693088u implements C180808lf {
    public final /* synthetic */ Account A00;
    public final /* synthetic */ Bundle A01;

    public final Object BtH(IBinder iBinder) {
        Object r3;
        Account account = this.A00;
        Bundle bundle = this.A01;
        if (iBinder == null) {
            r3 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            if (queryLocalInterface instanceof C187098wV) {
                r3 = (C187098wV) queryLocalInterface;
            } else {
                r3 = new C128026Um(iBinder);
            }
        }
        C163147tL r32 = (C163147tL) r3;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(r32.A01);
        obtain.writeInt(1);
        account.writeToParcel(obtain, 0);
        obtain.writeString("oauth2:https://www.googleapis.com/auth/drive.appdata");
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        Parcel A002 = r32.A00(5, obtain);
        Bundle bundle2 = (Bundle) AnonymousClass6C7.A0Q(A002, Bundle.CREATOR);
        A002.recycle();
        if (bundle2 != null) {
            return C162297re.A00(bundle2);
        }
        throw AnonymousClass002.A0C("Service call returned null");
    }

    public /* synthetic */ C1693088u(Account account, Bundle bundle) {
        this.A00 = account;
        this.A01 = bundle;
    }
}
