package X;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: X.6DR  reason: invalid class name */
public abstract class AnonymousClass6DR extends Binder implements IInterface {
    public AnonymousClass6DR() {
        attachInterface(this, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks");
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Object createFromParcel;
        if (i <= 16777215) {
            AnonymousClass6C8.A0w(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        AnonymousClass6WX r4 = (AnonymousClass6WX) this;
        if (i != 1) {
            return false;
        }
        Status status = (Status) AnonymousClass6C7.A0Q(parcel, Status.CREATOR);
        Parcelable.Creator creator = PendingIntent.CREATOR;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = creator.createFromParcel(parcel);
        }
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            AnonymousClass72I.A00(status, r4.A00, createFromParcel);
            return true;
        }
        throw new BadParcelableException(AnonymousClass000.A0Y("Parcel data not fully consumed, unread size: ", AnonymousClass001.A0o(), dataAvail));
    }
}
