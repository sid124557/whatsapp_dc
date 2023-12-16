package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;

/* renamed from: X.7uC  reason: invalid class name and case insensitive filesystem */
public final class C163677uC implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new Transport[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return Transport.A00(parcel.readString());
        } catch (C143186yT e) {
            throw C18330xA.A09(e);
        }
    }
}
