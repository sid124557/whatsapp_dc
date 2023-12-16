package X;

/* renamed from: X.5TN  reason: invalid class name */
public final class AnonymousClass5TN {
    public final int A00;
    public final AnonymousClass1VX A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r6 == 2) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        if (r5.A0X(5317) == false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5TN(X.AnonymousClass1VX r5, int r6, boolean r7, boolean r8, boolean r9, boolean r10, boolean r11, boolean r12) {
        /*
            r4 = this;
            r0 = 1
            r4.<init>()
            r4.A01 = r5
            r4.A03 = r7
            r4.A02 = r8
            r4.A00 = r6
            r4.A04 = r9
            r4.A0C = r10
            r4.A08 = r11
            r4.A05 = r12
            r3 = 0
            if (r6 == r0) goto L_0x001b
            r0 = 2
            r2 = 0
            if (r6 != r0) goto L_0x001c
        L_0x001b:
            r2 = 1
        L_0x001c:
            r4.A06 = r2
            if (r2 == 0) goto L_0x0029
            r0 = 5317(0x14c5, float:7.451E-42)
            boolean r1 = r5.A0X(r0)
            r0 = 1
            if (r1 != 0) goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            r4.A07 = r0
            if (r2 == 0) goto L_0x0034
            r0 = 5292(0x14ac, float:7.416E-42)
            boolean r3 = X.C56952sp.A0K(r5, r0, r3)
        L_0x0034:
            r4.A09 = r3
            r0 = 6091(0x17cb, float:8.535E-42)
            boolean r0 = r5.A0X(r0)
            r4.A0B = r0
            r0 = 6089(0x17c9, float:8.533E-42)
            boolean r0 = r5.A0X(r0)
            r4.A0A = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5TN.<init>(X.1VX, int, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5TN) {
                AnonymousClass5TN r5 = (AnonymousClass5TN) obj;
                if (!(C162457s7.A0P(this.A01, r5.A01) && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A00 == r5.A00 && this.A04 == r5.A04 && this.A0C == r5.A0C && this.A08 == r5.A08 && this.A05 == r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass0x2.A01((AnonymousClass0x2.A01(AnonymousClass0x2.A01(C18300x5.A04(this.A01), this.A03), this.A02) + this.A00) * 31, this.A04), this.A0C), this.A08), this.A05);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PushToRecordConfig(abProps=");
        A0o.append(this.A01);
        A0o.append(", canSendVoiceMessages=");
        A0o.append(this.A03);
        A0o.append(", canSendPushToVideoMessages=");
        A0o.append(this.A02);
        A0o.append(", conversationEntryActionButtonTapAction=");
        A0o.append(this.A00);
        A0o.append(", isCameraButtonEntryEnabled=");
        A0o.append(this.A04);
        A0o.append(", recorderModeMenuHasTitle=");
        A0o.append(this.A0C);
        A0o.append(", isConversationEntryActionButtonRecorderModeChangedTooltipEnabled=");
        A0o.append(this.A08);
        A0o.append(", isCameraButtonInstantLock=");
        return C18260x0.A0A(A0o, this.A05);
    }
}
