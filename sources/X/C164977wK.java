package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7wK  reason: invalid class name and case insensitive filesystem */
public final class C164977wK implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C165917xq[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            return new C165917xq(readStrongBinder);
        }
        return null;
    }
}
