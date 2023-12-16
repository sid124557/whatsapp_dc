package X;

import android.os.Parcel;

/* renamed from: X.89V  reason: invalid class name */
public final /* synthetic */ class AnonymousClass89V implements C180878lm {
    public final /* synthetic */ C127056Ql A00;
    public final /* synthetic */ AnonymousClass6TL A01;

    public final void AwC(Object obj, Object obj2) {
        AnonymousClass6TL r4 = this.A01;
        C163147tL r3 = (C163147tL) ((C160847oP) obj).A02();
        AnonymousClass6R2 r2 = new AnonymousClass6R2((C152017Xf) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(r3.A01);
        r4.writeToParcel(obtain, AnonymousClass6C8.A1Q(r2.asBinder(), obtain) ? 1 : 0);
        r3.A01(2, obtain);
    }

    public /* synthetic */ AnonymousClass89V(C127056Ql r1, AnonymousClass6TL r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
