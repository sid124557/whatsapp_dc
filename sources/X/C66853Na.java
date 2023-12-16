package X;

import com.whatsapp.util.Log;

/* renamed from: X.3Na  reason: invalid class name and case insensitive filesystem */
public final class C66853Na implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public void AyD(C55032pg r7, C624134x r8) {
        AnonymousClass22f r0;
        C18260x0.A0O(r8, r7);
        if (r8 instanceof C30231m7) {
            C49742h1 r5 = ((C30231m7) r8).A00;
            if (r5 != null) {
                AnonymousClass1A4 r3 = r7.A00;
                C21581Cj r02 = ((AnonymousClass1EU) r3.A00).bcallMessage_;
                if (r02 == null) {
                    r02 = C21581Cj.DEFAULT_INSTANCE;
                }
                C130546c9 A0H = r02.A0H();
                int i = r5.A00;
                if (i == 1) {
                    r0 = AnonymousClass22f.AUDIO;
                } else if (i != 2) {
                    r0 = AnonymousClass22f.UNKNOWN;
                } else {
                    r0 = AnonymousClass22f.VIDEO;
                }
                C21581Cj r1 = (C21581Cj) C18320x8.A0C(A0H);
                r1.mediaType_ = r0.value;
                r1.bitField0_ |= 2;
                String str = r5.A03;
                C21581Cj r12 = (C21581Cj) C18320x8.A0C(A0H);
                r12.bitField0_ |= 1;
                r12.sessionId_ = str;
                C172548Lq A09 = C18270x1.A09(A0H, r5.A04);
                C21581Cj r13 = (C21581Cj) A0H.A00;
                r13.bitField0_ |= 4;
                r13.masterKey_ = A09;
                String str2 = r5.A02;
                if (str2 != null) {
                    C21581Cj r14 = (C21581Cj) C18320x8.A0C(A0H);
                    r14.bitField0_ |= 8;
                    r14.caption_ = str2;
                }
                C21581Cj r03 = (C21581Cj) A0H.A06();
                AnonymousClass1EU A0L = AnonymousClass0x2.A0L(r3, r03);
                A0L.bcallMessage_ = r03;
                A0L.bitField1_ |= 67108864;
                return;
            }
            Log.e("FMessageBCallProtobuf/session is null");
            return;
        }
        throw AnonymousClass001.A0c("FMessageBCallProtobuf/not supported message");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C624134x BgW(X.C55962rC r12) {
        /*
            r11 = this;
            X.1EU r2 = X.C55962rC.A01(r12)
            int r1 = r2.bitField1_
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0062
            X.1Cj r2 = r2.bcallMessage_
            if (r2 != 0) goto L_0x0011
            X.1Cj r2 = X.C21581Cj.DEFAULT_INSTANCE
        L_0x0011:
            int r0 = r2.bitField0_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0057
            java.lang.String r5 = r2.sessionId_
            X.C162457s7.A0D(r5)
            int r1 = r2.mediaType_
            if (r1 == 0) goto L_0x0054
            r0 = 1
            if (r1 == r0) goto L_0x0051
            r0 = 2
            if (r1 != r0) goto L_0x0054
            X.22f r0 = X.AnonymousClass22f.VIDEO
        L_0x0028:
            X.C162457s7.A0D(r0)
            int r0 = r0.ordinal()
            r8 = 1
            if (r0 == r8) goto L_0x0036
            r8 = 2
            if (r0 == r8) goto L_0x0036
            r8 = 0
        L_0x0036:
            X.8Lq r0 = r2.masterKey_
            byte[] r7 = r0.A07()
            java.lang.String r6 = r2.caption_
            r9 = -1
            X.2h1 r4 = new X.2h1
            r4.<init>(r5, r6, r7, r8, r9)
            X.2z0 r3 = r12.A0D
            long r1 = r12.A05
            X.1m7 r0 = new X.1m7
            r0.<init>(r3, r1)
            r0.A00 = r4
            return r0
        L_0x0051:
            X.22f r0 = X.AnonymousClass22f.AUDIO
            goto L_0x0028
        L_0x0054:
            X.22f r0 = X.AnonymousClass22f.UNKNOWN
            goto L_0x0028
        L_0x0057:
            java.lang.Integer r1 = X.C18300x5.A0Z()
            java.lang.String r0 = "bcall message doesn't have master key"
            X.24W r0 = X.AnonymousClass24W.A01(r1, r0)
            throw r0
        L_0x0062:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66853Na.BgW(X.2rC):X.34x");
    }
}
