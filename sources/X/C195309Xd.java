package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: X.9Xd  reason: invalid class name and case insensitive filesystem */
public class C195309Xd implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C204589pb(11);
    public final String A00;
    public final List A01;

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeStringList(this.A01);
    }

    public C195309Xd(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }

    public int describeContents() {
        return 0;
    }

    public C195309Xd(Parcel parcel) {
        String readString = parcel.readString();
        Objects.requireNonNull(readString);
        this.A00 = readString;
        ArrayList A0s = AnonymousClass001.A0s();
        this.A01 = A0s;
        parcel.readStringList(A0s);
    }
}
