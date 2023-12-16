package X;

/* renamed from: X.3Nl  reason: invalid class name and case insensitive filesystem */
public class C66963Nl implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public void AyD(C55032pg r9, C624134x r10) {
        C374022m r0;
        if (r10 instanceof AnonymousClass1nW) {
            C30491mX r102 = (C30491mX) r10;
            int i = r102.A00;
            String str = r102.A02;
            long j = r102.A01;
            AnonymousClass1A4 r4 = r9.A00;
            AnonymousClass1CG r02 = ((AnonymousClass1EU) r4.A00).scheduledCallCreationMessage_;
            if (r02 == null) {
                r02 = AnonymousClass1CG.DEFAULT_INSTANCE;
            }
            C130546c9 A0H = r02.A0H();
            if (i == 0) {
                r0 = C374022m.UNKNOWN;
            } else if (i == 1) {
                r0 = C374022m.VOICE;
            } else if (i == 2) {
                r0 = C374022m.VIDEO;
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Unexpected type (");
                A0o.append(i);
                throw AnonymousClass000.A0F(")", A0o);
            }
            AnonymousClass1CG r1 = (AnonymousClass1CG) C18320x8.A0C(A0H);
            r1.callType_ = r0.value;
            r1.bitField0_ |= 2;
            AnonymousClass1CG r12 = (AnonymousClass1CG) C18320x8.A0C(A0H);
            str.getClass();
            r12.bitField0_ |= 4;
            r12.title_ = str;
            AnonymousClass1CG r13 = (AnonymousClass1CG) C18320x8.A0C(A0H);
            r13.bitField0_ |= 1;
            r13.scheduledTimestampMs_ = j;
            AnonymousClass1EU A0T = C18290x4.A0T(r4);
            AnonymousClass1CG r03 = (AnonymousClass1CG) A0H.A06();
            r03.getClass();
            A0T.scheduledCallCreationMessage_ = r03;
            A0T.bitField1_ |= 65536;
            return;
        }
        throw AnonymousClass001.A0c("FMessageScheduledCallProtobuf/not supported message");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C624134x BgW(X.C55962rC r8) {
        /*
            r7 = this;
            X.1EU r2 = r8.A0B
            int r1 = r2.bitField1_
            r0 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x007e
            X.1CG r5 = r2.scheduledCallCreationMessage_
            if (r5 != 0) goto L_0x000f
            X.1CG r5 = X.AnonymousClass1CG.DEFAULT_INSTANCE
        L_0x000f:
            X.C626936e.A06(r5)
            X.2z0 r2 = r8.A0D
            long r0 = r8.A05
            X.1nW r4 = new X.1nW
            r4.<init>(r2, r0)
            int r6 = r5.bitField0_
            boolean r0 = X.AnonymousClass0x2.A1X(r6)
            java.lang.Integer r3 = X.C18290x4.A0Z()
            if (r0 == 0) goto L_0x006b
            long r0 = r5.scheduledTimestampMs_
            r4.A01 = r0
            r0 = r6 & 2
            if (r0 == 0) goto L_0x0049
            int r1 = r5.callType_
            if (r1 == 0) goto L_0x0055
            r0 = 1
            if (r1 == r0) goto L_0x0052
            r0 = 2
            if (r1 != r0) goto L_0x0055
            X.22m r0 = X.C374022m.VIDEO
        L_0x003b:
            int r2 = r0.ordinal()
            r1 = 1
            r0 = 0
            if (r2 == r0) goto L_0x0047
            r0 = 2
            if (r2 != r1) goto L_0x0047
            r0 = 1
        L_0x0047:
            r4.A00 = r0
        L_0x0049:
            r0 = r6 & 4
            if (r0 == 0) goto L_0x0058
            java.lang.String r0 = r5.title_
            r4.A02 = r0
            return r4
        L_0x0052:
            X.22m r0 = X.C374022m.VOICE
            goto L_0x003b
        L_0x0055:
            X.22m r0 = X.C374022m.UNKNOWN
            goto L_0x003b
        L_0x0058:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageScheduledCall/missing title; message.key="
            X.2z0 r0 = X.C624134x.A08(r4, r0, r1)
            X.C18260x0.A0n(r0, r1)
            X.24W r0 = new X.24W
            r0.<init>(r3)
            throw r0
        L_0x006b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageScheduledCall/missing scheduledTimeStampMs; message.key="
            X.2z0 r0 = X.C624134x.A08(r4, r0, r1)
            X.C18260x0.A0n(r0, r1)
            X.24W r0 = new X.24W
            r0.<init>(r3)
            throw r0
        L_0x007e:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66963Nl.BgW(X.2rC):X.34x");
    }
}
