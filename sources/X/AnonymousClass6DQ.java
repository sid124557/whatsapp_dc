package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: X.6DQ  reason: invalid class name */
public abstract class AnonymousClass6DQ extends Binder implements IInterface {
    public AnonymousClass6DQ() {
        attachInterface(this, "com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            AnonymousClass6C8.A0w(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        C128266Vk r2 = (C128266Vk) this;
        switch (i) {
            case 1:
                ((AnonymousClass6WE) r2).A00.A05((Status) AnonymousClass6C7.A0Q(parcel, Status.CREATOR));
                return true;
            case 2:
                AnonymousClass6C7.A0Q(parcel, Status.CREATOR);
                throw C18320x8.A0m();
            case 3:
                AnonymousClass6C7.A0Q(parcel, Status.CREATOR);
                parcel.readLong();
                throw C18320x8.A0m();
            case 4:
                AnonymousClass6C7.A0Q(parcel, Status.CREATOR);
                throw C18320x8.A0m();
            case 5:
                AnonymousClass6C7.A0Q(parcel, Status.CREATOR);
                parcel.readLong();
                throw C18320x8.A0m();
            case 6:
                AnonymousClass6C7.A0Q(parcel, Status.CREATOR);
                parcel.createTypedArray(C127816Tk.CREATOR);
                throw C18320x8.A0m();
            case 7:
                AnonymousClass6C7.A0Q(parcel, DataHolder.CREATOR);
                throw C18320x8.A0m();
            case 8:
                AnonymousClass6C7.A0Q(parcel, Status.CREATOR);
                AnonymousClass6C7.A0Q(parcel, AnonymousClass6TA.CREATOR);
                throw C18320x8.A0m();
            case 9:
                AnonymousClass6C7.A0Q(parcel, Status.CREATOR);
                AnonymousClass6C7.A0Q(parcel, AnonymousClass6TA.CREATOR);
                throw C18320x8.A0m();
            default:
                return false;
        }
    }
}
