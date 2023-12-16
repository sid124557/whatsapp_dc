package X;

import android.os.Parcel;

/* renamed from: X.89L  reason: invalid class name */
public final /* synthetic */ class AnonymousClass89L implements C180878lm {
    public final /* synthetic */ C127316Rm A00;

    /* JADX INFO: finally extract failed */
    public final void AwC(Object obj, Object obj2) {
        C127316Rm r4 = this.A00;
        C152017Xf r7 = (C152017Xf) obj2;
        C163107tH r1 = (C163107tH) ((C160847oP) obj).A02();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(r1.A01);
        obtain.writeInt(1);
        r4.writeToParcel(obtain, 0);
        try {
            r1.A00.transact(1, obtain, (Parcel) null, 1);
            obtain.recycle();
            r7.A00((Object) null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public /* synthetic */ AnonymousClass89L(C127316Rm r1) {
        this.A00 = r1;
    }
}
