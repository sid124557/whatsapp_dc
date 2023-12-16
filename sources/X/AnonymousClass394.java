package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.394  reason: invalid class name */
public class AnonymousClass394 implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass4IW.A00(16);
    public final C85184Fg A00;
    public final String A01;

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }

    public AnonymousClass394(Parcel parcel) {
        this.A01 = C18310x6.A0l(parcel);
        this.A00 = (C85184Fg) C18280x3.A0C(parcel, C85184Fg.class);
    }

    public int describeContents() {
        return 0;
    }

    public AnonymousClass394(C85184Fg r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }
}
