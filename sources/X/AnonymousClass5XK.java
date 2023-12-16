package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallState;

/* renamed from: X.5XK  reason: invalid class name */
public final class AnonymousClass5XK {
    public final int A00;
    public final int A01;
    public final AnonymousClass8OQ A02;
    public final C102995Lb A03;
    public final C27991fJ A04;
    public final UserJid A05;
    public final UserJid A06;
    public final CallState A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass5XK.class != obj.getClass()) {
                return false;
            }
            AnonymousClass5XK r5 = (AnonymousClass5XK) obj;
            if (!(this.A0E == r5.A0E && this.A0G == r5.A0G && this.A0K == r5.A0K && this.A0H == r5.A0H && this.A0J == r5.A0J && this.A0F == r5.A0F && this.A02.equals(r5.A02) && this.A07 == r5.A07 && AnonymousClass75J.A00(this.A03, r5.A03) && AnonymousClass75J.A00(this.A04, r5.A04) && AnonymousClass75J.A00(this.A06, r5.A06) && AnonymousClass75J.A00(this.A05, r5.A05) && this.A08.equals(r5.A08) && this.A00 == r5.A00 && this.A0D == r5.A0D && AnonymousClass75J.A00(this.A09, r5.A09) && AnonymousClass75J.A00(this.A0A, r5.A0A) && this.A0C == r5.A0C && this.A0B == r5.A0B && this.A0I == r5.A0I && this.A01 == r5.A01)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5XK(com.whatsapp.voipcalling.CallInfo r28) {
        /*
            r27 = this;
            r0 = r28
            java.util.Map r1 = r0.participants
            X.8OQ r6 = X.AnonymousClass8OQ.copyOf((java.util.Map) r1)
            boolean r17 = r0.isCallFull()
            boolean r4 = r0.isGroupCall
            com.whatsapp.voipcalling.CallState r11 = r0.callState
            boolean r3 = r0.videoEnabled
            boolean r20 = r0.isInLonelyState()
            X.5Lb r7 = r0.self
            com.whatsapp.jid.GroupJid r1 = r0.groupJid
            X.1fJ r8 = X.AnonymousClass34R.A01(r1)
            com.whatsapp.jid.UserJid r9 = r0.getPeerJid()
            java.lang.String r12 = r0.callId
            boolean r21 = r0.isSelfRequestingUpgrade()
            boolean r22 = r0.isEitherSideRequestingUpgrade()
            com.whatsapp.jid.UserJid r10 = r0.callLinkCreatorJid
            int r15 = r0.callLinkState
            boolean r2 = r0.callEnding
            java.lang.String r13 = r0.callLinkToken
            java.lang.String r14 = r0.scheduledId
            boolean r24 = r0.isAudioChat()
            boolean r1 = r0.canRingAll
            boolean r26 = r0.isPhashBasedCall()
            int r0 = r0.connectedLimit
            r5 = r27
            r23 = r2
            r25 = r1
            r18 = r4
            r19 = r3
            r16 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5XK.<init>(com.whatsapp.voipcalling.CallInfo):void");
    }

    public int hashCode() {
        Object[] objArr = new Object[21];
        objArr[0] = this.A02;
        AnonymousClass000.A1R(objArr, this.A0E);
        AnonymousClass001.A1S(objArr, this.A0G);
        objArr[3] = this.A07;
        objArr[4] = Boolean.valueOf(this.A0K);
        objArr[5] = Boolean.valueOf(this.A0H);
        objArr[6] = this.A03;
        objArr[7] = this.A04;
        objArr[8] = this.A06;
        objArr[9] = this.A08;
        objArr[10] = Boolean.valueOf(this.A0J);
        objArr[11] = Boolean.valueOf(this.A0F);
        objArr[12] = this.A05;
        objArr[13] = Integer.valueOf(this.A00);
        objArr[14] = Boolean.valueOf(this.A0D);
        objArr[15] = this.A09;
        objArr[16] = this.A0A;
        objArr[17] = Boolean.valueOf(this.A0C);
        objArr[18] = Boolean.valueOf(this.A0B);
        objArr[19] = Boolean.valueOf(this.A0I);
        return C18310x6.A08(Integer.valueOf(this.A01), objArr, 20);
    }

    public AnonymousClass5XK(AnonymousClass8OQ r2, C102995Lb r3, C27991fJ r4, UserJid userJid, UserJid userJid2, CallState callState, String str, String str2, String str3, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.A02 = r2;
        this.A0E = z;
        this.A0G = z2;
        this.A07 = callState;
        this.A0K = z3;
        this.A0H = z4;
        this.A03 = r3;
        this.A04 = r4;
        this.A06 = userJid;
        this.A08 = str;
        this.A0J = z5;
        this.A0F = z6;
        this.A05 = userJid2;
        this.A00 = i;
        this.A0D = z7;
        this.A09 = str2;
        this.A0A = str3;
        this.A0C = z8;
        this.A0B = z9;
        this.A0I = z10;
        this.A01 = i2;
    }
}
