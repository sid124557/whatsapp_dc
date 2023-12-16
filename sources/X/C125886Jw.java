package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.6Jw  reason: invalid class name and case insensitive filesystem */
public final class C125886Jw extends AnonymousClass81M {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(7);
    public final String A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C125886Jw.class != obj.getClass()) {
                return false;
            }
            C125886Jw r5 = (C125886Jw) obj;
            if (!Util.A0D(this.A00, r5.A00) || !Util.A0D(this.A01, r5.A01) || !Util.A0D(this.A02, r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public C125886Jw(String str, String str2) {
        super("COMM");
        this.A01 = "und";
        this.A00 = str;
        this.A02 = str2;
    }

    public int hashCode() {
        return ((AnonymousClass6C8.A04(C86624Kv.A04(this.A01)) + C86624Kv.A04(this.A00)) * 31) + AnonymousClass6CA.A06(this.A02);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A00);
        A0o.append(": language=");
        AnonymousClass6C8.A1E(A0o, this.A01);
        return AnonymousClass000.A0X(this.A00, A0o);
    }

    public C125886Jw(Parcel parcel) {
        super("COMM");
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A02 = parcel.readString();
    }
}
