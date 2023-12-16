package X;

/* renamed from: X.3OK  reason: invalid class name */
public abstract class AnonymousClass3OK implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AyD(X.C55032pg r9, X.C624134x r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C30871nL
            if (r0 == 0) goto L_0x019c
            X.1nL r10 = (X.C30871nL) r10
            java.lang.String r2 = r10.A00
            X.1EM r0 = X.AnonymousClass1EM.DEFAULT_INSTANCE
            X.6c9 r5 = r0.A0G()
            X.19x r5 = (X.C209419x) r5
            X.23O r0 = X.AnonymousClass23O.PEER_DATA_OPERATION_REQUEST_RESPONSE_MESSAGE
            r5.A09(r0)
            X.1CD r0 = X.AnonymousClass1CD.DEFAULT_INSTANCE
            X.6c9 r4 = r0.A0G()
            X.19c r4 = (X.C207319c) r4
            boolean r0 = r10 instanceof X.AnonymousClass1OS
            if (r0 == 0) goto L_0x00c8
            r0 = 0
        L_0x0022:
            X.23F r0 = X.AnonymousClass23F.A00(r0)
            X.6cX r1 = X.C18320x8.A0C(r4)
            X.1CD r1 = (X.AnonymousClass1CD) r1
            int r0 = r0.value
            r1.peerDataOperationRequestType_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
        L_0x0036:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x004d
            X.6cX r1 = X.C18320x8.A0C(r4)
            X.1CD r1 = (X.AnonymousClass1CD) r1
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.stanzaId_ = r2
        L_0x004d:
            boolean r0 = r8 instanceof X.AnonymousClass1OW
            if (r0 == 0) goto L_0x00d6
            X.1OS r10 = (X.AnonymousClass1OS) r10
            java.util.Map r0 = r10.A00
            java.util.Iterator r7 = X.AnonymousClass000.A0q(r0)
        L_0x0059:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0181
            java.util.Map$Entry r1 = X.AnonymousClass001.A0w(r7)
            X.1Cm r0 = X.C21611Cm.DEFAULT_INSTANCE
            X.6c9 r6 = r0.A0G()
            X.19d r6 = (X.C207419d) r6
            java.lang.Object r0 = r1.getValue()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.first
            X.23E r0 = (X.AnonymousClass23E) r0
            r6.A09(r0)
            java.lang.Object r0 = r1.getValue()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            X.1EA r0 = (X.AnonymousClass1EA) r0
            if (r0 == 0) goto L_0x0096
            X.6cX r1 = X.C18320x8.A0C(r6)
            X.1Cm r1 = (X.C21611Cm) r1
        L_0x008a:
            r1.stickerMessage_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r4.A09(r6)
            goto L_0x0059
        L_0x0096:
            X.1EA r0 = X.AnonymousClass1EA.DEFAULT_INSTANCE
            X.6c9 r3 = r0.A0G()
            X.19o r3 = (X.C208519o) r3
            java.lang.String r0 = X.C18310x6.A0q(r1)
            r2 = 0
            byte[] r1 = android.util.Base64.decode(r0, r2)
            int r0 = r1.length
            X.8Lq r2 = X.C172548Lq.A02(r1, r2, r0)
            X.1EA r1 = X.C18300x5.A0S(r3)
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.fileSha256_ = r2
            X.6cX r1 = X.C18320x8.A0C(r6)
            X.1Cm r1 = (X.C21611Cm) r1
            X.6cX r0 = r3.A06()
            X.1EA r0 = (X.AnonymousClass1EA) r0
            r0.getClass()
            goto L_0x008a
        L_0x00c8:
            boolean r0 = r10 instanceof X.AnonymousClass1OP
            if (r0 != 0) goto L_0x0036
            boolean r0 = r10 instanceof X.AnonymousClass1OQ
            if (r0 == 0) goto L_0x00d3
            r0 = 4
            goto L_0x0022
        L_0x00d3:
            r0 = 2
            goto L_0x0022
        L_0x00d6:
            boolean r0 = r8 instanceof X.AnonymousClass1OV
            if (r0 != 0) goto L_0x0181
            boolean r0 = r8 instanceof X.AnonymousClass1OU
            if (r0 == 0) goto L_0x0116
            r0 = 0
            X.C162457s7.A0J(r4, r0)
            boolean r0 = r10 instanceof X.AnonymousClass1OQ
            if (r0 == 0) goto L_0x0181
            X.1OQ r10 = (X.AnonymousClass1OQ) r10
            if (r10 == 0) goto L_0x0181
            java.util.List r0 = r10.A00
            java.util.Iterator r6 = r0.iterator()
        L_0x00f0:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0181
            java.lang.Object r3 = r6.next()
            X.6cX r2 = X.C18320x8.A0C(r4)
            X.1CD r2 = (X.AnonymousClass1CD) r2
            r3.getClass()
            X.8ya r1 = r2.peerDataOperationResult_
            r0 = r1
            X.8T6 r0 = (X.AnonymousClass8T6) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0112
            X.8ya r1 = X.C130786cX.A07(r1)
            r2.peerDataOperationResult_ = r1
        L_0x0112:
            r1.add(r3)
            goto L_0x00f0
        L_0x0116:
            X.1OR r10 = (X.AnonymousClass1OR) r10
            java.util.Map r0 = r10.A00
            java.util.Iterator r7 = X.AnonymousClass000.A0q(r0)
        L_0x011e:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0181
            java.util.Map$Entry r1 = X.AnonymousClass001.A0w(r7)
            X.1Cm r0 = X.C21611Cm.DEFAULT_INSTANCE
            X.6c9 r6 = r0.A0G()
            X.19d r6 = (X.C207419d) r6
            java.lang.Object r0 = r1.getValue()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.first
            X.23E r0 = (X.AnonymousClass23E) r0
            r6.A09(r0)
            java.lang.Object r0 = r1.getValue()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            X.1Dj r0 = (X.C21841Dj) r0
            if (r0 == 0) goto L_0x015b
            X.6cX r1 = X.C18320x8.A0C(r6)
            X.1Cm r1 = (X.C21611Cm) r1
        L_0x014f:
            r1.linkPreviewResponse_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r4.A09(r6)
            goto L_0x011e
        L_0x015b:
            X.1Dj r0 = X.C21841Dj.DEFAULT_INSTANCE
            X.6c9 r3 = r0.A0G()
            java.lang.String r2 = X.C18310x6.A0q(r1)
            X.1Dj r1 = X.AnonymousClass0x7.A0W(r3, r2)
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.url_ = r2
            X.6cX r1 = X.C18320x8.A0C(r6)
            X.1Cm r1 = (X.C21611Cm) r1
            X.6cX r0 = r3.A06()
            X.1Dj r0 = (X.C21841Dj) r0
            r0.getClass()
            goto L_0x014f
        L_0x0181:
            X.1EM r1 = X.C18310x6.A0W(r5)
            X.6cX r0 = r4.A06()
            X.1CD r0 = (X.AnonymousClass1CD) r0
            r0.getClass()
            r1.peerDataOperationRequestResponseMessage_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r1.bitField0_ = r0
            X.1A4 r0 = r9.A00
            r0.A0D(r5)
            return
        L_0x019c:
            java.lang.String r0 = "FMessagePeerDataOperationRequestResponseSerializer can't handle message"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3OK.AyD(X.2pg, X.34x):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        if (r0 != 4) goto L_0x0037;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0040 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(X.C55962rC r2) {
        /*
            X.23O r1 = X.C385428c.A00(r2)
            X.23O r0 = X.AnonymousClass23O.PEER_DATA_OPERATION_REQUEST_RESPONSE_MESSAGE
            if (r1 != r0) goto L_0x0041
            X.1EM r0 = X.C55962rC.A00(r2)
            X.1CD r1 = r0.peerDataOperationRequestResponseMessage_
            if (r1 != 0) goto L_0x0012
            X.1CD r1 = X.AnonymousClass1CD.DEFAULT_INSTANCE
        L_0x0012:
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            int r0 = r1.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0037
            int r0 = r1.peerDataOperationRequestType_
            X.23F r0 = X.AnonymousClass23F.A00(r0)
            if (r0 != 0) goto L_0x0026
            X.23F r0 = X.AnonymousClass23F.UPLOAD_STICKER
        L_0x0026:
            int r0 = r0.value
            r1 = 0
            if (r0 == 0) goto L_0x0038
            r1 = 1
            if (r0 == r1) goto L_0x0038
            r1 = 2
            if (r0 == r1) goto L_0x0038
            r1 = 3
            if (r0 == r1) goto L_0x0038
            r1 = 4
            if (r0 == r1) goto L_0x0038
        L_0x0037:
            r1 = -1
        L_0x0038:
            java.util.Set r0 = X.C38952Ac.A00
            boolean r0 = X.C18300x5.A1X(r0, r1)
            if (r0 == 0) goto L_0x0041
            return r1
        L_0x0041:
            r1 = -1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3OK.A00(X.2rC):int");
    }

    public static String A01(C55962rC r1) {
        AnonymousClass1CD r12 = C55962rC.A00(r1).peerDataOperationRequestResponseMessage_;
        if (r12 == null) {
            r12 = AnonymousClass1CD.DEFAULT_INSTANCE;
        }
        if ((r12.bitField0_ & 2) != 0) {
            return r12.stanzaId_;
        }
        return null;
    }
}
