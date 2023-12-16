package X;

/* renamed from: X.5Xg  reason: invalid class name and case insensitive filesystem */
public final class C106005Xg {
    public final C194509Te A00;
    public final C166557yt A01;
    public final C166557yt A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C106005Xg) {
                C106005Xg r5 = (C106005Xg) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A05, r5.A05) || !C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A06, r5.A06) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C194509Te A00() {
        return this.A00;
    }

    public int hashCode() {
        return ((AnonymousClass0x2.A07(this.A06, AnonymousClass0x2.A07(this.A04, AnonymousClass0x2.A07(this.A05, AnonymousClass0x2.A07(this.A03, C18300x5.A04(this.A00))))) + AnonymousClass000.A07(this.A02)) * 31) + C18310x6.A07(this.A01);
    }

    public C106005Xg(C194509Te r1, C166557yt r2, C166557yt r3, String str, String str2, String str3, String str4) {
        C18260x0.A0d(r1, str, str3, str4);
        this.A00 = r1;
        this.A03 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A06 = str4;
        this.A02 = r2;
        this.A01 = r3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("VoipAREffectParam(arEngineEffect=");
        A0o.append(this.A00);
        A0o.append(", maskId=");
        A0o.append(this.A03);
        A0o.append(", maskName=");
        A0o.append(this.A05);
        A0o.append(", maskInstanceId=");
        A0o.append(this.A04);
        A0o.append(", productSessionId=");
        A0o.append(this.A06);
        A0o.append(", fbId=");
        A0o.append(this.A02);
        A0o.append(", accessToken=");
        return C18260x0.A04(this.A01, A0o);
    }
}
