package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7xL  reason: invalid class name and case insensitive filesystem */
public final class C165607xL implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C162457s7.A0J(parcel, 0);
        boolean booleanValue = AnonymousClass29S.A00(parcel).booleanValue();
        String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = "";
        }
        return new C166467yj(readString, booleanValue, readString2);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C166467yj[i];
    }
}
