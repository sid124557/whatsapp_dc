package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: X.6DP  reason: invalid class name */
public abstract class AnonymousClass6DP extends Binder implements IInterface {
    public AnonymousClass6DP() {
        attachInterface(this, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            AnonymousClass6C8.A0w(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        AnonymousClass6Ua r1 = (AnonymousClass6Ua) this;
        if (i != 1) {
            return false;
        }
        AnonymousClass72I.A00((Status) AnonymousClass6C7.A0Q(parcel, Status.CREATOR), r1.A00, (Object) null);
        return true;
    }
}
