package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* renamed from: X.5dp  reason: invalid class name and case insensitive filesystem */
public class C108945dp implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass91V(C627136h.A03);
    public int A00;
    public int A01;
    public int A02;
    public String A03;
    public boolean A04 = false;
    public boolean A05;

    public int describeContents() {
        return 0;
    }

    public String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[6];
        AnonymousClass000.A1L(objArr, this.A01);
        AnonymousClass000.A1M(objArr, this.A00);
        AnonymousClass000.A1N(objArr, this.A02);
        objArr[3] = this.A03;
        objArr[4] = Boolean.valueOf(this.A05);
        objArr[5] = Boolean.valueOf(this.A04);
        return String.format(locale, "ImageListParam{loc=%s,inc=%d,sort=%d,bucket=%s,empty=%b,favorite=%b}", objArr);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
    }

    public C108945dp(Parcel parcel) {
        boolean z = false;
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A03 = parcel.readString();
        this.A05 = AnonymousClass000.A1S(parcel.readInt());
        this.A04 = parcel.readInt() != 0 ? true : z;
    }

    public C108945dp() {
    }
}
