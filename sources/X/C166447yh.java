package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7yh  reason: invalid class name and case insensitive filesystem */
public class C166447yh implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(88);
    public final String A00;
    public final String A01;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C166447yh)) {
            return false;
        }
        C166447yh r4 = (C166447yh) obj;
        if (!this.A00.equals(r4.A00) || !this.A01.equals(r4.A01)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A08(this.A01, C18310x6.A09(this.A00));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public C166447yh(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BizCategory:{'id'='");
        A0o.append(this.A00);
        A0o.append("', 'name'='");
        A0o.append(this.A01);
        return AnonymousClass000.A0X("'}", A0o);
    }

    public C166447yh(Parcel parcel) {
        String readString = parcel.readString();
        C626936e.A05(readString);
        this.A00 = readString;
        String readString2 = parcel.readString();
        C626936e.A05(readString2);
        this.A01 = readString2;
    }
}
