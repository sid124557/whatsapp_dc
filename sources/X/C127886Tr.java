package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6Tr  reason: invalid class name and case insensitive filesystem */
public final class C127886Tr extends C1695389r implements Parcelable, C187348x3 {
    public static final Parcelable.Creator CREATOR = new C164607vj();
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C127886Tr) {
                C127886Tr r5 = (C127886Tr) obj;
                if (!this.A00.equals(r5.A00) || !AnonymousClass72K.A00(r5.A01, this.A01) || !AnonymousClass72K.A00(r5.A02, this.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        String str = this.A00;
        int i = 0;
        for (char c : str.toCharArray()) {
            i += c;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length > 25) {
            String substring = trim.substring(0, 10);
            String substring2 = trim.substring(length - 10, length);
            StringBuilder A0g = AnonymousClass6C8.A0g(AnonymousClass6C7.A06(substring) + 16 + AnonymousClass6C7.A06(substring2), substring);
            A0g.append("...");
            A0g.append(substring2);
            trim = AnonymousClass000.A0Y("::", A0g, i);
        }
        String str2 = this.A01;
        String str3 = this.A02;
        StringBuilder A0Y = AnonymousClass6CA.A0Y(AnonymousClass6C7.A06(trim) + 31 + AnonymousClass6C7.A06(str2) + AnonymousClass6C7.A06(str3));
        A0Y.append("Channel{token=");
        A0Y.append(trim);
        A0Y.append(", nodeId=");
        A0Y.append(str2);
        A0Y.append(", path=");
        A0Y.append(str3);
        return AnonymousClass000.A0g(A0Y);
    }

    public C127886Tr(String str, String str2, String str3) {
        C162177rO.A02(str);
        this.A00 = str;
        C162177rO.A02(str2);
        this.A01 = str2;
        C162177rO.A02(str3);
        this.A02 = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        boolean A07 = C1695389r.A07(parcel, this.A00);
        C162417s1.A0B(parcel, this.A01, 3, A07);
        C162417s1.A0B(parcel, this.A02, 4, A07);
        C162417s1.A06(parcel, A002);
    }
}
