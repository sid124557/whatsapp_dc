package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.5dA  reason: invalid class name and case insensitive filesystem */
public final class C108545dA implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C108205cc();
    public final int A00;
    public final int A01;
    public final C997958f A02;
    public final C996057h A03;
    public final String A04;
    public final ArrayList A05;

    public C108545dA(C997958f r2, C996057h r3, String str, ArrayList arrayList, int i, int i2) {
        AnonymousClass0x2.A1A(r2, 2, r3);
        this.A05 = arrayList;
        this.A02 = r2;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = r3;
        this.A04 = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        ArrayList arrayList = this.A05;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C108535d9) it.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.A02.name());
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A03.name());
        parcel.writeString(this.A04);
    }

    public int describeContents() {
        return 0;
    }
}
