package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7uS  reason: invalid class name and case insensitive filesystem */
public final class C163837uS implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C142956y5[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        try {
            for (C142956y5 r1 : C142956y5.values()) {
                if (readString.equals(r1.zzb)) {
                    return r1;
                }
            }
            throw new C143256ya(readString);
        } catch (C143256ya e) {
            throw C18330xA.A09(e);
        }
    }
}
