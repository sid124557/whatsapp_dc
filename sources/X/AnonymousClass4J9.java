package X;

/* renamed from: X.4J9  reason: invalid class name */
public class AnonymousClass4J9 implements C181298mX {
    public final int A00;

    public AnonymousClass4J9(int i) {
        this.A00 = i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        if (r1 != 0) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r0 != null) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        r0 = X.AnonymousClass1AL.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r0 = r0.bitField0_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0126, code lost:
        if (r0 != null) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0128, code lost:
        r0 = X.AnonymousClass1AL.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x012a, code lost:
        r0 = r0.message_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x012c, code lost:
        if (r0 != null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0130, code lost:
        return X.AnonymousClass1EU.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        r1 = r0 & 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        r0 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x014a;
                case 1: goto L_0x0131;
                case 2: goto L_0x0122;
                case 3: goto L_0x0117;
                case 4: goto L_0x010a;
                case 5: goto L_0x0105;
                case 6: goto L_0x00f4;
                case 7: goto L_0x00ef;
                case 8: goto L_0x00e2;
                case 9: goto L_0x00dd;
                case 10: goto L_0x00d1;
                case 11: goto L_0x00cc;
                case 12: goto L_0x00b9;
                case 13: goto L_0x00ad;
                case 14: goto L_0x00a8;
                case 15: goto L_0x0097;
                case 16: goto L_0x0091;
                case 17: goto L_0x007e;
                case 18: goto L_0x0072;
                case 19: goto L_0x0066;
                case 20: goto L_0x004f;
                case 21: goto L_0x0043;
                case 22: goto L_0x0037;
                case 23: goto L_0x0031;
                case 24: goto L_0x0026;
                case 25: goto L_0x0020;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.1EU r3 = (X.AnonymousClass1EU) r3
            int r0 = r3.bitField1_
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x001a
            X.1AL r0 = r3.viewOnceMessageV2Extension_
        L_0x000f:
            if (r0 != 0) goto L_0x0013
            X.1AL r0 = X.AnonymousClass1AL.DEFAULT_INSTANCE
        L_0x0013:
            int r0 = r0.bitField0_
        L_0x0015:
            r1 = r0 & 1
        L_0x0017:
            r0 = 1
            if (r1 != 0) goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x001f:
            return r0
        L_0x0020:
            X.1EU r3 = (X.AnonymousClass1EU) r3
            X.1AL r0 = r3.viewOnceMessageV2_
            goto L_0x0126
        L_0x0026:
            X.1EU r3 = (X.AnonymousClass1EU) r3
            int r0 = r3.bitField1_
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x001a
            X.1AL r0 = r3.viewOnceMessageV2_
            goto L_0x000f
        L_0x0031:
            X.1EU r3 = (X.AnonymousClass1EU) r3
            X.1AL r0 = r3.viewOnceMessage_
            goto L_0x0126
        L_0x0037:
            X.1EU r3 = (X.AnonymousClass1EU) r3
            int r1 = r3.bitField0_
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x001a
            X.1AL r0 = r3.viewOnceMessage_
            goto L_0x000f
        L_0x0043:
            X.1EU r3 = (X.AnonymousClass1EU) r3
            X.1EM r0 = r3.protocolMessage_
            if (r0 != 0) goto L_0x004b
            X.1EM r0 = X.AnonymousClass1EM.DEFAULT_INSTANCE
        L_0x004b:
            X.1EU r0 = r0.editedMessage_
            goto L_0x012c
        L_0x004f:
            X.1EU r3 = (X.AnonymousClass1EU) r3
            int r0 = r3.bitField0_
            r0 = r0 & 2048(0x800, float:2.87E-42)
            boolean r0 = X.AnonymousClass000.A1S(r0)
            if (r0 == 0) goto L_0x001a
            X.1EM r0 = r3.protocolMessage_
            if (r0 != 0) goto L_0x0061
            X.1EM r0 = X.AnonymousClass1EM.DEFAULT_INSTANCE
        L_0x0061:
            int r0 = r0.bitField0_
            r1 = r0 & 1024(0x400, float:1.435E-42)
            goto L_0x0017
        L_0x0066:
            X.1EU r3 = (X.AnonymousClass1EU) r3
            X.1Dd r0 = r3.requestPaymentMessage_
            if (r0 != 0) goto L_0x006e
            X.1Dd r0 = X.C21781Dd.DEFAULT_INSTANCE
        L_0x006e:
            X.1EU r0 = r0.noteMessage_
            goto L_0x012c
        L_0x0072:
            X.1EU r3 = (X.AnonymousClass1EU) r3
            X.1CH r0 = r3.sendPaymentMessage_
            if (r0 != 0) goto L_0x007a
            X.1CH r0 = X.AnonymousClass1CH.DEFAULT_INSTANCE
        L_0x007a:
            X.1EU r0 = r0.noteMessage_
            goto L_0x012c
        L_0x007e:
            X.1EU r3 = (X.AnonymousClass1EU) r3
            int r1 = r3.bitField0_
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x001a
            X.1CH r0 = r3.sendPaymentMessage_
            if (r0 != 0) goto L_0x008e
            X.1CH r0 = X.AnonymousClass1CH.DEFAULT_INSTANCE
        L_0x008e:
            int r0 = r0.bitField0_
            goto L_0x0015
        L_0x0091:
            X.1EU r3 = (X.AnonymousClass1EU) r3
            X.1AL r0 = r3.ephemeralMessage_
            goto L_0x0126
        L_0x0097:
            X.1EU r3 = (X.AnonymousClass1EU) r3
            int r1 = r3.bitField0_
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1S(r1)
            if (r0 == 0) goto L_0x001a
            X.1AL r0 = r3.ephemeralMessage_
            goto L_0x000f
        L_0x00a8:
            X.1EU r3 = (X.AnonymousClass1EU) r3
            X.1AL r0 = r3.editedMessage_
            goto L_0x0126
        L_0x00ad:
            X.1EU r3 = (X.AnonymousClass1EU) r3
            int r0 = r3.bitField1_
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x001a
            X.1AL r0 = r3.editedMessage_
            goto L_0x000f
        L_0x00b9:
            X.1EU r3 = (X.AnonymousClass1EU) r3
            int r1 = r3.bitField0_
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x001a
            X.1Dd r0 = r3.requestPaymentMessage_
            if (r0 != 0) goto L_0x00c8
            X.1Dd r0 = X.C21781Dd.DEFAULT_INSTANCE
        L_0x00c8:
            int r0 = r0.bitField0_
            goto L_0x0015
        L_0x00cc:
            X.1EU r3 = (X.AnonymousClass1EU) r3
            X.1AL r0 = r3.documentWithCaptionMessage_
            goto L_0x0126
        L_0x00d1:
            X.1EU r3 = (X.AnonymousClass1EU) r3
            int r0 = r3.bitField1_
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x001a
            X.1AL r0 = r3.documentWithCaptionMessage_
            goto L_0x000f
        L_0x00dd:
            X.1EU r3 = (X.AnonymousClass1EU) r3
            X.1AL r0 = r3.lottieStickerMessage_
            goto L_0x0126
        L_0x00e2:
            X.1EU r3 = (X.AnonymousClass1EU) r3
            int r1 = r3.bitField1_
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x001a
            X.1AL r0 = r3.lottieStickerMessage_
            goto L_0x000f
        L_0x00ef:
            X.1EU r3 = (X.AnonymousClass1EU) r3
            X.1AL r0 = r3.botInvokeMessage_
            goto L_0x0126
        L_0x00f4:
            X.1EU r3 = (X.AnonymousClass1EU) r3
            int r1 = r3.bitField1_
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1S(r1)
            if (r0 == 0) goto L_0x001a
            X.1AL r0 = r3.botInvokeMessage_
            goto L_0x000f
        L_0x0105:
            X.1EU r3 = (X.AnonymousClass1EU) r3
            X.1AL r0 = r3.groupMentionedMessage_
            goto L_0x0126
        L_0x010a:
            X.1EU r3 = (X.AnonymousClass1EU) r3
            int r1 = r3.bitField1_
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x001a
            X.1AL r0 = r3.groupMentionedMessage_
            goto L_0x000f
        L_0x0117:
            X.1EU r3 = (X.AnonymousClass1EU) r3
            X.1C1 r0 = r3.deviceSentMessage_
            if (r0 != 0) goto L_0x011f
            X.1C1 r0 = X.AnonymousClass1C1.DEFAULT_INSTANCE
        L_0x011f:
            X.1EU r0 = r0.message_
            goto L_0x012c
        L_0x0122:
            X.1EU r3 = (X.AnonymousClass1EU) r3
            X.1AL r0 = r3.viewOnceMessageV2Extension_
        L_0x0126:
            if (r0 != 0) goto L_0x012a
            X.1AL r0 = X.AnonymousClass1AL.DEFAULT_INSTANCE
        L_0x012a:
            X.1EU r0 = r0.message_
        L_0x012c:
            if (r0 != 0) goto L_0x001f
            X.1EU r0 = X.AnonymousClass1EU.DEFAULT_INSTANCE
            return r0
        L_0x0131:
            X.1EU r3 = (X.AnonymousClass1EU) r3
            int r1 = r3.bitField0_
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1S(r1)
            if (r0 == 0) goto L_0x001a
            X.1C1 r0 = r3.deviceSentMessage_
            if (r0 != 0) goto L_0x0144
            X.1C1 r0 = X.AnonymousClass1C1.DEFAULT_INSTANCE
        L_0x0144:
            int r0 = r0.bitField0_
            r1 = r0 & 2
            goto L_0x0017
        L_0x014a:
            X.3ZH r3 = (X.AnonymousClass3ZH) r3
            X.C626936e.A06(r3)
            X.4uZ r0 = r3.A0H
            X.C626936e.A06(r0)
            X.4uZ r0 = r3.A0H
            java.lang.String r0 = r0.getRawString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4J9.apply(java.lang.Object):java.lang.Object");
    }
}
