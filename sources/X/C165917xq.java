package X;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7xq  reason: invalid class name and case insensitive filesystem */
public class C165917xq implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C164977wK();
    public Messenger A00;

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.A00.getBinder().equals(((C165917xq) obj).A00.getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return this.A00.getBinder().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.A00.getBinder());
    }

    public C165917xq(IBinder iBinder) {
        this.A00 = new Messenger(iBinder);
    }
}
