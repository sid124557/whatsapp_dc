package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.7yQ  reason: invalid class name and case insensitive filesystem */
public class C166277yQ implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(110);
    public final ArrayList A00;
    public final boolean A01;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.A01 ? (byte) 1 : 0);
        parcel.writeStringList(this.A00);
    }

    public C166277yQ(ArrayList arrayList, boolean z) {
        this.A01 = z;
        this.A00 = arrayList;
    }

    public C166277yQ(Parcel parcel) {
        this.A01 = AnonymousClass000.A1S(parcel.readByte());
        this.A00 = parcel.createStringArrayList();
    }
}
