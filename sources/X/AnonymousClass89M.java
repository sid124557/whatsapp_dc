package X;

import android.os.Parcel;

/* renamed from: X.89M  reason: invalid class name */
public final /* synthetic */ class AnonymousClass89M implements C180878lm {
    public final /* synthetic */ C127006Qg A00;

    public final void AwC(Object obj, Object obj2) {
        C163057tC r4 = (C163057tC) ((C160847oP) obj).A02();
        AnonymousClass6Ua r1 = new AnonymousClass6Ua((C152017Xf) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        obtain.writeStrongBinder(r1.asBinder());
        Parcel obtain2 = Parcel.obtain();
        try {
            AnonymousClass000.A0w(r4.A00, obtain, obtain2, 1);
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    public /* synthetic */ AnonymousClass89M(C127006Qg r1) {
        this.A00 = r1;
    }
}
