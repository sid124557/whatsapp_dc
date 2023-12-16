package X;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;

/* renamed from: X.89X  reason: invalid class name */
public final /* synthetic */ class AnonymousClass89X implements C180878lm {
    public final /* synthetic */ Account A00;
    public final /* synthetic */ Bundle A01;
    public final /* synthetic */ C127056Ql A02;

    public final void AwC(Object obj, Object obj2) {
        Account account = this.A00;
        Bundle bundle = this.A01;
        C163147tL r3 = (C163147tL) ((C160847oP) obj).A02();
        C128066Uq r1 = new C128066Uq((C152017Xf) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(r3.A01);
        obtain.writeStrongBinder(r1.asBinder());
        obtain.writeInt(1);
        account.writeToParcel(obtain, 0);
        obtain.writeString("oauth2:https://www.googleapis.com/auth/drive.appdata");
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        r3.A01(1, obtain);
    }

    public /* synthetic */ AnonymousClass89X(Account account, Bundle bundle, C127056Ql r3) {
        this.A02 = r3;
        this.A00 = account;
        this.A01 = bundle;
    }
}
