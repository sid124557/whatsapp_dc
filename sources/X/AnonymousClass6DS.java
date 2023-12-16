package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: X.6DS  reason: invalid class name */
public abstract class AnonymousClass6DS extends Binder implements IInterface {
    public final IBinder asBinder() {
        return this;
    }

    public AnonymousClass6DS() {
        attachInterface(this, "com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        BasePendingResult basePendingResult;
        C180828lh r0;
        if (i <= 16777215) {
            AnonymousClass6C8.A0w(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        AnonymousClass6XI r3 = (AnonymousClass6XI) this;
        if (i == 1) {
            Status status = (Status) AnonymousClass6C7.A0Q(parcel, Status.CREATOR);
            C127236Re r1 = (C127236Re) AnonymousClass6C7.A0Q(parcel, C127236Re.CREATOR);
            if (r3 instanceof AnonymousClass6XG) {
                basePendingResult = ((AnonymousClass6XG) r3).A00;
                r0 = new AnonymousClass8B9(status, r1);
            } else {
                throw C18320x8.A0m();
            }
        } else if (i == 2) {
            parcel.readString();
            throw C18320x8.A0m();
        } else if (i == 3) {
            AnonymousClass6C7.A0Q(parcel, Status.CREATOR);
            AnonymousClass6C7.A0Q(parcel, AnonymousClass6TZ.CREATOR);
            throw C18320x8.A0m();
        } else if (i == 4) {
            AnonymousClass6C7.A0Q(parcel, Status.CREATOR);
            parcel.readInt();
            throw C18320x8.A0m();
        } else if (i == 6) {
            AnonymousClass6C7.A0Q(parcel, Status.CREATOR);
            AnonymousClass6C7.A0Q(parcel, C127246Rf.CREATOR);
            throw C18320x8.A0m();
        } else if (i == 8) {
            Status status2 = (Status) AnonymousClass6C7.A0Q(parcel, Status.CREATOR);
            AnonymousClass6SN r12 = (AnonymousClass6SN) AnonymousClass6C7.A0Q(parcel, AnonymousClass6SN.CREATOR);
            if (r3 instanceof AnonymousClass6XH) {
                basePendingResult = ((AnonymousClass6XH) r3).A00;
                r0 = new AnonymousClass8BA(status2, r12);
            } else {
                throw C18320x8.A0m();
            }
        } else if (i == 10) {
            AnonymousClass6C7.A0Q(parcel, Status.CREATOR);
            parcel.readInt();
            throw C18320x8.A0m();
        } else if (i == 11) {
            AnonymousClass6C7.A0Q(parcel, Status.CREATOR);
            throw C18320x8.A0m();
        } else if (i == 15) {
            AnonymousClass6C7.A0Q(parcel, Status.CREATOR);
            AnonymousClass6C7.A0Q(parcel, C127346Rp.CREATOR);
            throw C18320x8.A0m();
        } else if (i != 16) {
            return false;
        } else {
            AnonymousClass6C7.A0Q(parcel, Status.CREATOR);
            parcel.readString();
            parcel.readInt();
            throw C18320x8.A0m();
        }
        basePendingResult.A05(r0);
        return true;
    }
}
