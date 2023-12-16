package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7um  reason: invalid class name and case insensitive filesystem */
public final class C164037um implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C142946y4[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int readInt = parcel.readInt();
        try {
            for (C142946y4 r1 : C142946y4.values()) {
                if (readInt == r1.zzb) {
                    return r1;
                }
            }
            throw new C143226yX(readInt);
        } catch (C143226yX e) {
            throw new IllegalArgumentException(e);
        }
    }
}
