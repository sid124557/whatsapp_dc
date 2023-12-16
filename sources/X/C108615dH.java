package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.5dH  reason: invalid class name and case insensitive filesystem */
public final class C108615dH implements Parcelable {
    public static final C108615dH A04 = new C108615dH((Double) null, (Double) null, "", "");
    public static final Parcelable.Creator CREATOR = new AnonymousClass91V(93);
    public String A00;
    public String A01;
    public final Double A02;
    public final Double A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && AnonymousClass001.A1a(obj, C108615dH.class)) {
                C108615dH r8 = (C108615dH) obj;
                if (C162457s7.A0P(this.A00, r8.A00) && C162457s7.A0P(this.A01, r8.A01)) {
                    Double d = this.A02;
                    Double d2 = r8.A02;
                    if (d == null ? d2 == null : d2 != null && d.doubleValue() == d2.doubleValue()) {
                        Double d3 = this.A03;
                        Double d4 = r8.A03;
                        if (d3 == null) {
                            return d4 == null;
                        }
                        if (d4 == null || d3.doubleValue() != d4.doubleValue()) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        Double d = this.A02;
        if (d == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeDouble(d.doubleValue());
        }
        Double d2 = this.A03;
        if (d2 == null) {
            parcel.writeByte((byte) 0);
            return;
        }
        parcel.writeByte((byte) 1);
        parcel.writeDouble(d2.doubleValue());
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        int i = 0;
        int A07 = (AnonymousClass0x2.A07(this.A01, C18310x6.A09(this.A00)) + C18280x3.A04(this.A02)) * 31;
        Double d = this.A03;
        if (d != null) {
            i = d.hashCode();
        }
        return A07 + i;
    }

    public C108615dH(Double d, Double d2, String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = d;
        this.A03 = d2;
        this.A00 = str == null ? "" : str;
        this.A01 = str2 == null ? "" : str2;
    }
}
