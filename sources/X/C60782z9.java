package X;

import java.util.HashSet;

/* renamed from: X.2z9  reason: invalid class name and case insensitive filesystem */
public final class C60782z9 {
    public String A00;
    public boolean A01;
    public boolean A02;
    public final HashSet A03;

    public C60782z9(HashSet hashSet) {
        this.A01 = false;
        this.A02 = false;
        this.A00 = null;
        this.A03 = hashSet;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60782z9) {
                C60782z9 r5 = (C60782z9) obj;
                if (this.A01 != r5.A01 || this.A02 != r5.A02 || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A03, (AnonymousClass0x2.A01(AnonymousClass0x9.A04(this.A01), this.A02) + C18270x1.A00(this.A00)) * 31);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CtwaUserJourneyLogger(hasAdContext=");
        A0o.append(this.A01);
        A0o.append(", icebreakersShown=");
        A0o.append(this.A02);
        A0o.append(", adId=");
        A0o.append(this.A00);
        A0o.append(", performedAction=");
        return C18260x0.A04(this.A03, A0o);
    }

    public C60782z9() {
        this(AnonymousClass002.A0K());
    }
}
