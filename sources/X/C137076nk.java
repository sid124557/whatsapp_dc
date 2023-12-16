package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6nk  reason: invalid class name and case insensitive filesystem */
public class C137076nk extends C165817xg {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(117);

    public C137076nk(String str) {
        super(str, "DOC_UPLOAD");
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
    }
}
