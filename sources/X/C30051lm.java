package X;

import java.util.Map;

/* renamed from: X.1lm  reason: invalid class name and case insensitive filesystem */
public final class C30051lm extends AnonymousClass28P {
    public final String A00;
    public final Map A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C30051lm) {
                C30051lm r5 = (C30051lm) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (C18270x1.A00(this.A00) * 31) + C18310x6.A07(this.A01);
    }

    public C30051lm(String str, Map map) {
        this.A00 = str;
        this.A01 = map;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AvatarNoticeEvent(event=");
        A0o.append(this.A00);
        A0o.append(", params=");
        return C18260x0.A04(this.A01, A0o);
    }
}
