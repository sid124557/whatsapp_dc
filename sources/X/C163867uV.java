package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7uV  reason: invalid class name and case insensitive filesystem */
public final class C163867uV implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C142926y2[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        try {
            for (C142926y2 r1 : C142926y2.values()) {
                if (readString.equals(r1.zze)) {
                    return r1;
                }
            }
            throw new C143266yb(readString);
        } catch (C143266yb e) {
            throw C18330xA.A09(e);
        }
    }
}
