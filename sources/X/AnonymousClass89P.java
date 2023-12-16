package X;

import android.os.Parcel;

/* renamed from: X.89P  reason: invalid class name */
public final /* synthetic */ class AnonymousClass89P implements C180878lm {
    public final /* synthetic */ C127036Qj A00;

    public final void AwC(Object obj, Object obj2) {
        AnonymousClass6VN r3 = new AnonymousClass6VN((C152017Xf) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
        obtain.writeStrongBinder(r3);
        ((C163077tE) ((C160847oP) obj).A02()).A00(2, obtain);
    }

    public /* synthetic */ AnonymousClass89P(C127036Qj r1) {
        this.A00 = r1;
    }
}
