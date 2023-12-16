package X;

/* renamed from: X.1Tl  reason: invalid class name and case insensitive filesystem */
public final class C23491Tl extends C47712dh {
    public final AnonymousClass2UW A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C23491Tl(X.AnonymousClass2UW r3, java.lang.Integer r4, java.lang.String r5, int r6) {
        /*
            r2 = this;
            r1 = 0
            r0 = r6 & 1
            if (r0 == 0) goto L_0x0006
            r5 = r1
        L_0x0006:
            r0 = r6 & 2
            if (r0 == 0) goto L_0x000b
            r4 = r1
        L_0x000b:
            r0 = r6 & 8
            if (r0 == 0) goto L_0x0025
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "title-"
            r1.append(r0)
            r1.append(r5)
            r0 = 45
            r1.append(r0)
            java.lang.String r1 = X.AnonymousClass000.A0R(r4, r1)
        L_0x0025:
            r2.<init>((X.AnonymousClass2UW) r3, (java.lang.Integer) r4, (java.lang.String) r5, (java.lang.String) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23491Tl.<init>(X.2UW, java.lang.Integer, java.lang.String, int):void");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23491Tl) {
                C23491Tl r5 = (C23491Tl) obj;
                if (!C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A08(this.A02, AnonymousClass000.A08(this.A00, ((C18270x1.A00(this.A03) * 31) + C18310x6.A07(this.A01)) * 31));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Title(title=");
        A0o.append(this.A03);
        A0o.append(", titleResource=");
        A0o.append(this.A01);
        A0o.append(", section=");
        A0o.append(this.A00);
        A0o.append(", id=");
        return C18260x0.A07(this.A02, A0o);
    }

    public C23491Tl(AnonymousClass2UW r2, Integer num, String str, String str2) {
        C18270x1.A11(r2, 3, str2);
        this.A03 = str;
        this.A01 = num;
        this.A00 = r2;
        this.A02 = str2;
    }
}
