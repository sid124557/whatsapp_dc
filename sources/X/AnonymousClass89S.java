package X;

import android.os.Parcel;

/* renamed from: X.89S  reason: invalid class name */
public final /* synthetic */ class AnonymousClass89S implements C180878lm {
    public final /* synthetic */ C126986Qe A00;
    public final /* synthetic */ AnonymousClass6UX A01;

    public final void AwC(Object obj, Object obj2) {
        AnonymousClass6UX r2 = this.A01;
        AnonymousClass6WX r1 = new AnonymousClass6WX((C152017Xf) obj2);
        C163067tD r5 = (C163067tD) ((C160847oP) obj).A02();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(r5.A01);
        boolean A1Q = AnonymousClass6C8.A1Q(r1, obtain);
        r2.writeToParcel(obtain, A1Q ? 1 : 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            r5.A00.transact(1, obtain, obtain2, A1Q);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    public /* synthetic */ AnonymousClass89S(C126986Qe r1, AnonymousClass6UX r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
