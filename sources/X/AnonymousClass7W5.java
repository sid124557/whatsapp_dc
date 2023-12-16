package X;

import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.7W5  reason: invalid class name */
public final class AnonymousClass7W5 {
    public final String A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass7W5.class != obj.getClass()) {
                return false;
            }
            AnonymousClass7W5 r5 = (AnonymousClass7W5) obj;
            if (!Util.A0D(this.A01, r5.A01) || !Util.A0D(this.A02, r5.A02) || !Util.A0D(this.A00, r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((C86624Kv.A04(this.A01) * 31) + C86624Kv.A04(this.A02)) * 31) + AnonymousClass6CA.A06(this.A00);
    }

    public AnonymousClass7W5(String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }
}
