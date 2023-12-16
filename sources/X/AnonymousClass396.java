package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.396  reason: invalid class name */
public class AnonymousClass396 implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass4IW.A00(30);
    public final String A00;
    public final List A01;

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeList(this.A01);
    }

    public AnonymousClass396(Parcel parcel) {
        this.A00 = parcel.readString();
        ArrayList A0s = AnonymousClass001.A0s();
        this.A01 = A0s;
        C18320x8.A12(parcel, AnonymousClass392.class, A0s);
    }

    public int describeContents() {
        return 0;
    }

    public AnonymousClass396(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }
}
