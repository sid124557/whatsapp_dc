package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.39D  reason: invalid class name */
public final class AnonymousClass39D implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C629837m();
    public final Long A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A08);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        Long l = this.A00;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.A01;
        if (l2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeLong(l2.longValue());
    }

    public AnonymousClass39D(Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.A04 = str;
        this.A05 = str2;
        this.A08 = str3;
        this.A03 = str4;
        this.A02 = str5;
        this.A06 = str6;
        this.A07 = str7;
        this.A00 = l;
        this.A01 = l2;
    }

    public int describeContents() {
        return 0;
    }

    public AnonymousClass39D() {
        this((Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
    }
}
