package X;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* renamed from: X.6DY  reason: invalid class name */
public abstract class AnonymousClass6DY extends Binder implements IInterface {
    public final IBinder asBinder() {
        return this;
    }

    public AnonymousClass6DY(String str) {
        attachInterface(this, str);
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        C148737Jn r3;
        Object r2;
        if (i <= 16777215) {
            AnonymousClass6C8.A0w(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        if (this instanceof C128566Wp) {
            C128566Wp r1 = (C128566Wp) this;
            if (i != 1) {
                return false;
            }
            r1.A00.BnG(AnonymousClass6C7.A0Q(parcel, C127906Tu.CREATOR));
            r1.A00 = null;
            return true;
        } else if (this instanceof C128596Ws) {
            C128596Ws r12 = (C128596Ws) this;
            if (i != 1) {
                return false;
            }
            Location location = (Location) AnonymousClass6C7.A0Q(parcel, Location.CREATOR);
            synchronized (r12) {
                C148737Jn r4 = r12.A00;
                AnonymousClass8MF.A01(r4, new AnonymousClass89K(location), r4.A00, 36);
            }
            return true;
        } else if (this instanceof C128586Wr) {
            C128586Wr r13 = (C128586Wr) this;
            if (i == 1) {
                r3 = r13.A00;
                r2 = new AnonymousClass89I((LocationResult) AnonymousClass6C7.A0Q(parcel, LocationResult.CREATOR));
            } else if (i != 2) {
                return false;
            } else {
                r3 = r13.A00;
                r2 = new AnonymousClass89J((LocationAvailability) AnonymousClass6C7.A0Q(parcel, LocationAvailability.CREATOR));
            }
            AnonymousClass8MF.A01(r3, r2, r3.A00, 36);
            return true;
        } else {
            C128576Wq r14 = (C128576Wq) this;
            if (i == 1) {
                r14.Btf((C127896Tt) AnonymousClass6C7.A0Q(parcel, C127896Tt.CREATOR));
                return true;
            } else if (i != 2) {
                return false;
            } else {
                r14.Btn();
                return true;
            }
        }
    }
}
