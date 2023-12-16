package X;

import com.whatsapp.jid.Jid;
import java.util.Arrays;

/* renamed from: X.2ns  reason: invalid class name and case insensitive filesystem */
public final class C53912ns {
    public final int A00;
    public final long A01;
    public final Jid A02;
    public final Jid A03;
    public final AnonymousClass2z0 A04;
    public final AnonymousClass2z0 A05;
    public final Long A06;
    public final byte[] A07;
    public final byte[] A08;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0060, code lost:
        if (java.util.Arrays.equals(r1, r0) != false) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r6 = 1
            if (r7 == r8) goto L_0x0080
            java.lang.Class<X.2ns> r1 = X.C53912ns.class
            if (r8 == 0) goto L_0x007b
            java.lang.Class r0 = r8.getClass()
        L_0x000b:
            boolean r0 = r1.equals(r0)
            r5 = 0
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.data.orphan.MessageOrphan"
            X.C162457s7.A0K(r8, r0)
            X.2ns r8 = (X.C53912ns) r8
            java.lang.Long r1 = r7.A06
            java.lang.Long r0 = r8.A06
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x0062
            X.2z0 r1 = r7.A04
            X.2z0 r0 = r8.A04
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x0062
            com.whatsapp.jid.Jid r1 = r7.A03
            com.whatsapp.jid.Jid r0 = r8.A03
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x0062
            X.2z0 r1 = r7.A05
            X.2z0 r0 = r8.A05
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x0062
            com.whatsapp.jid.Jid r1 = r7.A02
            com.whatsapp.jid.Jid r0 = r8.A02
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x0062
            long r3 = r7.A01
            long r1 = r8.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0062
            byte[] r1 = r7.A07
            byte[] r0 = r8.A07
            if (r1 == 0) goto L_0x0063
            if (r0 == 0) goto L_0x0062
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 != 0) goto L_0x0066
        L_0x0062:
            return r5
        L_0x0063:
            if (r0 == 0) goto L_0x0066
            return r5
        L_0x0066:
            int r1 = r7.A00
            int r0 = r8.A00
            if (r1 != r0) goto L_0x0062
            byte[] r1 = r7.A08
            byte[] r0 = r8.A08
            if (r1 == 0) goto L_0x007d
            if (r0 == 0) goto L_0x0062
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 != 0) goto L_0x0080
            return r5
        L_0x007b:
            r0 = 0
            goto L_0x000b
        L_0x007d:
            if (r0 == 0) goto L_0x0080
            return r5
        L_0x0080:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53912ns.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        int A002 = AnonymousClass000.A00((((((AnonymousClass000.A08(this.A04, C18280x3.A04(this.A06) * 31) + C18280x3.A04(this.A03)) * 31) + C18280x3.A04(this.A05)) * 31) + C18280x3.A04(this.A02)) * 31, this.A01);
        byte[] bArr = this.A07;
        if (bArr != null) {
            i = Arrays.hashCode(bArr);
        } else {
            i = 0;
        }
        int i3 = (((A002 + i) * 31) + this.A00) * 31;
        byte[] bArr2 = this.A08;
        if (bArr2 != null) {
            i2 = Arrays.hashCode(bArr2);
        }
        return i3 + i2;
    }

    public C53912ns(Jid jid, Jid jid2, AnonymousClass2z0 r3, AnonymousClass2z0 r4, Long l, byte[] bArr, byte[] bArr2, int i, long j) {
        this.A06 = l;
        this.A04 = r3;
        this.A03 = jid;
        this.A05 = r4;
        this.A02 = jid2;
        this.A01 = j;
        this.A07 = bArr;
        this.A00 = i;
        this.A08 = bArr2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MessageOrphan(rowId=");
        A0o.append(this.A06);
        A0o.append(", key=");
        A0o.append(this.A04);
        A0o.append(", senderJid=");
        A0o.append(this.A03);
        A0o.append(", parentMessageKey=");
        A0o.append(this.A05);
        A0o.append(", parentMessageSenderJid=");
        C18310x6.A1J(this.A02, A0o);
        A0o.append(this.A01);
        A0o.append(", orphanMessageData=");
        C18280x3.A1J(A0o, this.A07);
        A0o.append(", orphanMessageType=");
        A0o.append(this.A00);
        A0o.append(", orphanMessageStanzaData=");
        return C18260x0.A07(Arrays.toString(this.A08), A0o);
    }
}
