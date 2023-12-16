package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

/* renamed from: X.7yL  reason: invalid class name and case insensitive filesystem */
public class C166227yL implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(102);
    public HashMap A00;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.A00);
    }

    public C166227yL(Parcel parcel) {
        HashMap hashMap = (HashMap) parcel.readSerializable();
        this.A00 = hashMap == null ? AnonymousClass001.A0t() : hashMap;
    }

    public C166227yL() {
        this.A00 = AnonymousClass001.A0t();
    }
}
