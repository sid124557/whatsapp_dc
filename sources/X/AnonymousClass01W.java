package X;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.01W  reason: invalid class name */
public class AnonymousClass01W extends Binder implements C17210v9 {
    public final /* synthetic */ AnonymousClass0ZR A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass01W(AnonymousClass0ZR r1) {
        this();
        this.A00 = r1;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = C17210v9.A00;
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface(str);
                if (i == 1) {
                    parcel.readInt();
                    Parcelable.Creator creator = Bundle.CREATOR;
                    if (parcel.readInt() != 0) {
                        creator.createFromParcel(parcel);
                    }
                    return true;
                }
            } else if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }

    public AnonymousClass01W() {
        attachInterface(this, C17210v9.A00);
    }
}
