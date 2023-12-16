package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.5dE  reason: invalid class name and case insensitive filesystem */
public final class C108585dE implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C108235cf();
    public final int A00;
    public final AnonymousClass57v A01;
    public final C108605dG A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final ArrayList A0B;

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A08);
        parcel.writeString(this.A06);
        parcel.writeString(this.A04);
        parcel.writeString(this.A09);
        parcel.writeString(this.A07);
        parcel.writeString(this.A03);
        parcel.writeString(this.A05);
        parcel.writeString(this.A0A);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A01.name());
        C108605dG r1 = this.A02;
        if (r1 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            r1.writeToParcel(parcel, i);
        }
        ArrayList arrayList = this.A0B;
        if (arrayList == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C108595dF) it.next()).writeToParcel(parcel, i);
        }
    }

    public C108585dE(AnonymousClass57v r2, C108605dG r3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ArrayList arrayList, int i) {
        C162457s7.A0J(r2, 10);
        this.A08 = str;
        this.A06 = str2;
        this.A04 = str3;
        this.A09 = str4;
        this.A07 = str5;
        this.A03 = str6;
        this.A05 = str7;
        this.A0A = str8;
        this.A00 = i;
        this.A01 = r2;
        this.A02 = r3;
        this.A0B = arrayList;
    }

    public int describeContents() {
        return 0;
    }
}
