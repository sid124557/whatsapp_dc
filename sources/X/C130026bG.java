package X;

/* renamed from: X.6bG  reason: invalid class name and case insensitive filesystem */
public class C130026bG extends C157127hm {
    public final C152607Zn A00;
    public final Character A01;
    public transient C157127hm A02;

    public void A00(Appendable appendable, byte[] bArr, int i, int i2) {
        C162187rP.A03(i, i + i2, bArr.length);
        C152607Zn r5 = this.A00;
        int i3 = r5.A01;
        int i4 = 0;
        C162187rP.A06(AnonymousClass6C8.A1P(i2, i3));
        long j = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            j = (j | ((long) (bArr[i + i5] & 255))) << 8;
        }
        int i6 = r5.A00;
        int i7 = ((i2 + 1) * 8) - i6;
        while (i4 < i2 * 8) {
            appendable.append(r5.A06[((int) (j >>> (i7 - i4))) & r5.A03]);
            i4 += i6;
        }
        Character ch = this.A01;
        if (ch != null) {
            while (i4 < i3 * 8) {
                appendable.append(ch.charValue());
                i4 += i6;
            }
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C130026bG)) {
            return false;
        }
        C130026bG r4 = (C130026bG) obj;
        if (!this.A00.equals(r4.A00) || !C1447372t.A00(this.A01, r4.A01)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A00.hashCode() ^ C18310x6.A08(this.A01, AnonymousClass002.A0L(), 0);
    }

    public String toString() {
        String str;
        StringBuilder A0A = C18330xA.A0A("BaseEncoding.");
        C152607Zn r0 = this.A00;
        AnonymousClass000.A1B(r0, A0A);
        if (8 % r0.A00 != 0) {
            Character ch = this.A01;
            if (ch == null) {
                str = ".omitPadding()";
            } else {
                A0A.append(".withPadChar('");
                A0A.append(ch);
                str = "')";
            }
            A0A.append(str);
        }
        return A0A.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r1[r2] == -1) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C130026bG(X.C152607Zn r4, java.lang.Character r5) {
        /*
            r3 = this;
            r3.<init>()
            r3.A00 = r4
            if (r5 == 0) goto L_0x0016
            char r2 = r5.charValue()
            byte[] r1 = r4.A05
            int r0 = r1.length
            if (r2 >= r0) goto L_0x0016
            byte r2 = r1[r2]
            r1 = -1
            r0 = 0
            if (r2 != r1) goto L_0x0017
        L_0x0016:
            r0 = 1
        L_0x0017:
            java.lang.String r1 = "Padding character %s was already in alphabet"
            if (r0 == 0) goto L_0x001e
            r3.A01 = r5
            return
        L_0x001e:
            java.lang.Object[] r0 = X.AnonymousClass000.A1b(r5)
            java.lang.String r0 = com.google.common.base.Strings.A00(r1, r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C130026bG.<init>(X.7Zn, java.lang.Character):void");
    }
}
