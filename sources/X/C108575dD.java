package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5dD  reason: invalid class name and case insensitive filesystem */
public final class C108575dD implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C108225ce();
    public final String A00;
    public final String A01;
    public final List A02;
    public final List A03;
    public final List A04;
    public final List A05;
    public final int[] A06;

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeIntArray(this.A06);
        parcel.writeStringList(this.A02);
        List list = this.A03;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0w = AnonymousClass0x7.A0w(parcel, list);
            while (A0w.hasNext()) {
                ((C108555dB) A0w.next()).writeToParcel(parcel, i);
            }
        }
        List list2 = this.A04;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0w2 = AnonymousClass0x7.A0w(parcel, list2);
            while (A0w2.hasNext()) {
                ((C108525d8) A0w2.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.A00);
        parcel.writeStringList(this.A05);
        parcel.writeString(this.A01);
    }

    public int describeContents() {
        return 0;
    }

    public C108575dD(String str, String str2, List list, List list2, List list3, List list4, int[] iArr) {
        this.A06 = iArr;
        this.A02 = list;
        this.A03 = list2;
        this.A04 = list3;
        this.A00 = str;
        this.A05 = list4;
        this.A01 = str2;
    }
}
