package X;

import android.os.Parcel;

/* renamed from: X.89N  reason: invalid class name */
public final /* synthetic */ class AnonymousClass89N implements C180878lm {
    public final /* synthetic */ C127026Qi A00;

    public final void AwC(Object obj, Object obj2) {
        C127026Qi r0 = this.A00;
        AnonymousClass6R1 r4 = new AnonymousClass6R1((C152017Xf) obj2);
        C163097tG r3 = (C163097tG) ((C160847oP) obj).A02();
        String str = r0.A00;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(r3.A01);
        obtain.writeStrongBinder(r4.asBinder());
        obtain.writeString(str);
        r3.A00(2, obtain);
    }

    public /* synthetic */ AnonymousClass89N(C127026Qi r1) {
        this.A00 = r1;
    }
}
