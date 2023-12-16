package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7wq  reason: invalid class name and case insensitive filesystem */
public final class C165297wq implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C166057y4[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String A0a = AnonymousClass0x2.A0a(parcel);
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = "pincode";
        }
        return new C166057y4(A0a, readString, readString2);
    }
}
