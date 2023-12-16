package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7uR  reason: invalid class name and case insensitive filesystem */
public final class C163827uR implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C142996y9[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        try {
            return C142996y9.A00(readString);
        } catch (C143246yZ e) {
            throw C18330xA.A09(e);
        }
    }
}
