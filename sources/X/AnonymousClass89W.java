package X;

import android.os.Parcel;

/* renamed from: X.89W  reason: invalid class name */
public final /* synthetic */ class AnonymousClass89W implements C180878lm {
    public final /* synthetic */ C127306Rl A00;
    public final /* synthetic */ C127036Qj A01;

    public final void AwC(Object obj, Object obj2) {
        C127306Rl r4 = this.A00;
        AnonymousClass6VM r3 = new AnonymousClass6VM((C152017Xf) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
        r4.writeToParcel(obtain, AnonymousClass6C8.A1Q(r3, obtain) ? 1 : 0);
        ((C163077tE) ((C160847oP) obj).A02()).A00(10, obtain);
    }

    public /* synthetic */ AnonymousClass89W(C127306Rl r1, C127036Qj r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
