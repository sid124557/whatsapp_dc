package X;

/* renamed from: X.1gS  reason: invalid class name */
public class AnonymousClass1gS extends C56202rb {
    public int A00 = 1;
    public long A01;
    public boolean A02;
    public final int A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1gS(X.C55682qk r16, X.C56612sH r17, X.AnonymousClass4FV r18, X.C55892r5 r19, java.lang.Integer r20, java.lang.Integer r21, java.lang.String r22, int r23, long r24, long r26, boolean r28, boolean r29, boolean r30) {
        /*
            r15 = this;
            r0 = 1
            r10 = 0
            r13 = r26
            r4 = r17
            r2 = r15
            r3 = r16
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r11 = r24
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r13)
            r1 = r23
            r15.A03 = r1
            r1 = r30
            r15.A05 = r1
            r1 = r28
            r15.A04 = r1
            r1 = r29
            r15.A06 = r1
            r15.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1gS.<init>(X.2qk, X.2sH, X.4FV, X.2r5, java.lang.Integer, java.lang.Integer, java.lang.String, int, long, long, boolean, boolean, boolean):void");
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        C18310x6.A1O(A0o, "LoggableMessageStanza");
        A0o.append(super.toString());
        A0o.append("; messageType=");
        A0o.append(this.A03);
        A0o.append("; hasSenderKeyDistributionMessage=");
        A0o.append(this.A05);
        A0o.append("; ephemeral=");
        A0o.append(this.A04);
        A0o.append("; revoke=");
        A0o.append(this.A06);
        A0o.append("; decryptionSuccess=");
        A0o.append(this.A02);
        A0o.append("; mediaType=");
        A0o.append(this.A00);
        A0o.append("; decryptQueueSize=");
        A0o.append(this.A01);
        return AnonymousClass000.A0e(A0o);
    }
}
