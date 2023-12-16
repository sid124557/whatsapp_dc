package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.7Zp  reason: invalid class name and case insensitive filesystem */
public final class C152627Zp {
    public final int A00;
    public final AnonymousClass7Z9 A01;
    public final String A02;
    public final String A03;
    public final List A04;
    public final List A05;
    public final Map A06;

    public C152627Zp(AnonymousClass7Z9 r2, String str, String str2, List list, List list2, Map map, int i) {
        C162457s7.A0J(str, 1);
        C162457s7.A0J(str2, 6);
        this.A03 = str;
        this.A00 = i;
        this.A01 = r2;
        this.A04 = list;
        this.A05 = list2;
        this.A02 = str2;
        this.A06 = map;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C152627Zp) {
                C152627Zp r5 = (C152627Zp) obj;
                if (!C162457s7.A0P(this.A03, r5.A03) || this.A00 != r5.A00 || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A05, r5.A05) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A06, r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A06, AnonymousClass0x2.A07(this.A02, AnonymousClass000.A08(this.A05, AnonymousClass000.A08(this.A04, AnonymousClass000.A08(this.A01, (C18310x6.A09(this.A03) + this.A00) * 31)))));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AIBotEmbodimentBehaviorGraph(personaProfile=");
        A0o.append(this.A03);
        A0o.append(", version=");
        A0o.append(this.A00);
        A0o.append(", initialStatus=");
        A0o.append(this.A01);
        A0o.append(", introVideos=");
        A0o.append(this.A04);
        A0o.append(", prefetchVideos=");
        A0o.append(this.A05);
        A0o.append(", personaGlobalDefaultSentiment=");
        A0o.append(this.A02);
        A0o.append(", states=");
        return C18260x0.A04(this.A06, A0o);
    }
}
