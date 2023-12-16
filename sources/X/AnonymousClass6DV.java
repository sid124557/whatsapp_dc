package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: X.6DV  reason: invalid class name */
public abstract class AnonymousClass6DV extends Binder implements IInterface {
    public final IBinder asBinder() {
        return this;
    }

    public AnonymousClass6DV(String str) {
        attachInterface(this, str);
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Status status;
        Object A0P;
        C152017Xf r0;
        if (i <= 16777215) {
            AnonymousClass6C8.A0w(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        if (this instanceof AnonymousClass6VO) {
            AnonymousClass6VO r3 = (AnonymousClass6VO) this;
            if (i != 1) {
                return false;
            }
            status = (Status) AnonymousClass6C7.A0Q(parcel, Status.CREATOR);
            A0P = Boolean.valueOf(AnonymousClass6C7.A1W(parcel));
            r0 = r3.A00;
        } else if (this instanceof AnonymousClass6VN) {
            AnonymousClass6VN r32 = (AnonymousClass6VN) this;
            if (i != 1) {
                return false;
            }
            status = (Status) AnonymousClass6C7.A0Q(parcel, Status.CREATOR);
            A0P = parcel.createByteArray();
            r0 = r32.A00;
        } else {
            AnonymousClass6VM r33 = (AnonymousClass6VM) this;
            if (i != 1) {
                return false;
            }
            status = (Status) AnonymousClass6C7.A0Q(parcel, Status.CREATOR);
            A0P = AnonymousClass6CA.A0P(parcel);
            r0 = r33.A00;
        }
        AnonymousClass72I.A00(status, r0, A0P);
        return true;
    }
}
