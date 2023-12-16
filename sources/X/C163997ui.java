package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7ui  reason: invalid class name and case insensitive filesystem */
public final class C163997ui implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C166347yX[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return C166347yX.A00(parcel.readInt());
        } catch (C143216yW e) {
            throw C18330xA.A09(e);
        }
    }
}
