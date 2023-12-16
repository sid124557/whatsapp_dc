package X;

import java.util.Collections;
import java.util.Map;

/* renamed from: X.2ln  reason: invalid class name and case insensitive filesystem */
public final class C52632ln {
    public final long A00;
    public final String A01;
    public final Map A02;

    public static Map A00(Object obj, String str) {
        AnonymousClass3Z6 r0 = new AnonymousClass3Z6(obj, new C52632ln(str, (Map) null, -1));
        Map singletonMap = Collections.singletonMap(r0.first, r0.second);
        C162457s7.A0D(singletonMap);
        return singletonMap;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52632ln) {
                C52632ln r8 = (C52632ln) obj;
                if (this.A00 != r8.A00 || !C162457s7.A0P(this.A01, r8.A01) || !C162457s7.A0P(this.A02, r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass0x2.A02(this.A00) + C18270x1.A00(this.A01)) * 31) + C18310x6.A07(this.A02);
    }

    public C52632ln(String str, Map map, long j) {
        this.A00 = j;
        this.A01 = str;
        this.A02 = map;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("FdsError(errorCode=");
        A0o.append(this.A00);
        A0o.append(", errorMessage=");
        A0o.append(this.A01);
        A0o.append(", params=");
        return C18260x0.A04(this.A02, A0o);
    }
}
