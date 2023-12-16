package X;

import android.os.Parcel;

/* renamed from: X.89O  reason: invalid class name */
public final /* synthetic */ class AnonymousClass89O implements C180878lm {
    public final /* synthetic */ C127036Qj A00;

    public final void AwC(Object obj, Object obj2) {
        AnonymousClass6VO r3 = new AnonymousClass6VO((C152017Xf) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
        obtain.writeStrongBinder(r3);
        ((C163077tE) ((C160847oP) obj).A02()).A00(11, obtain);
    }

    public /* synthetic */ AnonymousClass89O(C127036Qj r1) {
        this.A00 = r1;
    }
}
