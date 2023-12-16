package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0ZR  reason: invalid class name */
public class AnonymousClass0ZR implements Parcelable {
    public static final Parcelable.Creator CREATOR = C17960wW.A00(10);
    public C17210v9 A00;

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            C17210v9 r0 = this.A00;
            if (r0 == null) {
                r0 = new AnonymousClass01W(this);
                this.A00 = r0;
            }
            parcel.writeStrongBinder(r0.asBinder());
        }
    }

    public int describeContents() {
        return 0;
    }

    public AnonymousClass0ZR(Parcel parcel) {
        C17210v9 r1;
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            r1 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(C17210v9.A00);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C17210v9)) {
                r1 = new AnonymousClass0Zo(readStrongBinder);
            } else {
                r1 = (C17210v9) queryLocalInterface;
            }
        }
        this.A00 = r1;
    }
}
