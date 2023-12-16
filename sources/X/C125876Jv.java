package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.6Jv  reason: invalid class name and case insensitive filesystem */
public final class C125876Jv extends AnonymousClass81M {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(9);
    public final String A00;
    public final String A01;

    public C125876Jv(String str, String str2) {
        super(str);
        this.A00 = null;
        this.A01 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C125876Jv.class != obj.getClass()) {
                return false;
            }
            C125876Jv r5 = (C125876Jv) obj;
            if (!this.A00.equals(r5.A00) || !Util.A0D(this.A00, r5.A00) || !Util.A0D(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass6C8.A04(this.A00.hashCode()) + C86624Kv.A04(this.A00)) * 31) + AnonymousClass6CA.A06(this.A01);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A00);
        A0o.append(": description=");
        A0o.append(this.A00);
        A0o.append(": value=");
        return AnonymousClass000.A0X(this.A01, A0o);
    }

    public C125876Jv(Parcel parcel) {
        super(parcel.readString());
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
