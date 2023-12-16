package X;

/* renamed from: X.2me  reason: invalid class name and case insensitive filesystem */
public final class C53162me {
    public final long A00;
    public final C50662iZ A01;
    public final C95814uZ A02;
    public final C624134x A03;
    public final String A04;

    public C53162me(C624134x r6) {
        C162457s7.A0J(r6, 1);
        AnonymousClass2z0 r0 = r6.A1J;
        C95814uZ r4 = r0.A00;
        String str = r0.A01;
        C162457s7.A0C(str);
        long j = r6.A1L;
        C50662iZ r02 = new C50662iZ();
        this.A03 = r6;
        this.A02 = r4;
        this.A04 = str;
        this.A00 = j;
        this.A01 = r02;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53162me) {
                C53162me r8 = (C53162me) obj;
                if (!C162457s7.A0P(this.A03, r8.A03) || !C162457s7.A0P(this.A02, r8.A02) || !C162457s7.A0P(this.A04, r8.A04) || this.A00 != r8.A00 || !C162457s7.A0P(this.A01, r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, AnonymousClass000.A00(AnonymousClass0x2.A07(this.A04, (C18300x5.A04(this.A03) + AnonymousClass000.A07(this.A02)) * 31), this.A00));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("FlowsLoggingContext(originalMessage=");
        A0o.append(this.A03);
        A0o.append(", businessJid=");
        A0o.append(this.A02);
        A0o.append(", messageId=");
        A0o.append(this.A04);
        A0o.append(", messageRowId=");
        A0o.append(this.A00);
        A0o.append(", entrypointMetadata=");
        return C18260x0.A04(this.A01, A0o);
    }
}
