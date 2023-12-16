package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6nl  reason: invalid class name and case insensitive filesystem */
public class C137086nl extends C165817xg {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(118);
    public final boolean A00;

    public C137086nl(String str, boolean z) {
        super(str, "WEBVIEW");
        this.A00 = z;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeByte(this.A00 ? (byte) 1 : 0);
    }
}
