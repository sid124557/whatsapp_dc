package X;

import android.os.Parcel;

/* renamed from: X.89Q  reason: invalid class name */
public final /* synthetic */ class AnonymousClass89Q implements C180878lm {
    public final AnonymousClass6SM A00;

    public final void AwC(Object obj, Object obj2) {
        AnonymousClass6SM r6 = this.A00;
        C160847oP r8 = (C160847oP) obj;
        AnonymousClass89H r0 = new AnonymousClass89H((C152017Xf) obj2);
        r8.A04();
        C128566Wp r4 = new C128566Wp();
        r4.A00 = r0;
        C163157tM r3 = (C163157tM) ((C187248wq) r8.A02());
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(r3.A01);
        obtain.writeInt(1);
        r6.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(r4.asBinder());
        obtain.writeString((String) null);
        r3.A01(63, obtain);
    }

    public AnonymousClass89Q(AnonymousClass6SM r1) {
        this.A00 = r1;
    }
}
