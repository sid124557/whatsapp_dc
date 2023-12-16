package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7yo  reason: invalid class name and case insensitive filesystem */
public class C166517yo implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(17);
    public String A00;
    public String A01;
    public Map A02;
    public final C166517yo A03;
    public final String A04;
    public final String A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C166517yo r5 = (C166517yo) obj;
            if (!AnonymousClass71A.A00(this.A01, r5.A01) || !AnonymousClass71A.A00(this.A03, r5.A03)) {
                return false;
            }
        }
        return true;
    }

    public C166517yo(C166517yo r4) {
        Map map;
        this.A05 = "i";
        this.A04 = "BloksImageComponent";
        this.A01 = AnonymousClass000.A0V(":", "BloksImageComponent", AnonymousClass000.A0l("i"));
        this.A03 = r4;
        if (r4 != null && (map = r4.A02) != null) {
            this.A02 = new HashMap(map);
        }
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        String str = this.A00;
        if (str != null) {
            return str;
        }
        String str2 = this.A01;
        this.A00 = str2;
        C166517yo r0 = this.A03;
        if (r0 == null) {
            return str2;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1B(r0, A0o);
        A0o.append('/');
        String A0X = AnonymousClass000.A0X(this.A00, A0o);
        this.A00 = A0X;
        return A0X;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A03, i);
    }

    public int hashCode() {
        return AnonymousClass0x7.A08(this.A01, super.hashCode() * 31);
    }

    public C166517yo(Parcel parcel) {
        this.A05 = parcel.readString();
        this.A04 = parcel.readString();
        this.A01 = parcel.readString();
        this.A03 = (C166517yo) C18280x3.A0C(parcel, C166517yo.class);
    }
}
