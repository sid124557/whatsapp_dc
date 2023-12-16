package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.util.Iterator;

/* renamed from: X.3Ng  reason: invalid class name and case insensitive filesystem */
public class C66913Ng implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public void AyD(C55032pg r8, C624134x r9) {
        C18270x1.A16(r9, "Unexpected message type ", AnonymousClass001.A0o(), r9 instanceof C30891nN);
        C30891nN r92 = (C30891nN) r9;
        int i = r92.A00;
        C209419x r4 = (C209419x) AnonymousClass1EM.DEFAULT_INSTANCE.A0G();
        r4.A09(AnonymousClass23O.PEER_DATA_OPERATION_REQUEST_MESSAGE);
        C130546c9 A0G = AnonymousClass1DF.DEFAULT_INSTANCE.A0G();
        if (i != -1) {
            AnonymousClass23F A00 = AnonymousClass23F.A00(i);
            AnonymousClass1DF r1 = (AnonymousClass1DF) C18320x8.A0C(A0G);
            r1.peerDataOperationRequestType_ = A00.value;
            r1.bitField0_ |= 1;
            if (i == 0) {
                Iterator it = r92.A01.iterator();
                while (it.hasNext()) {
                    String A0m = AnonymousClass001.A0m(it);
                    C130546c9 A0K = C18300x5.A0K(AnonymousClass1AS.DEFAULT_INSTANCE);
                    AnonymousClass1AS r12 = (AnonymousClass1AS) A0K.A00;
                    A0m.getClass();
                    r12.bitField0_ |= 1;
                    r12.fileSha256_ = A0m;
                    AnonymousClass1DF r3 = (AnonymousClass1DF) C18320x8.A0C(A0G);
                    C130786cX A06 = A0K.A06();
                    A06.getClass();
                    C188248ya r13 = r3.requestStickerReupload_;
                    if (!((AnonymousClass8T6) r13).A00) {
                        r13 = C130786cX.A07(r13);
                        r3.requestStickerReupload_ = r13;
                    }
                    r13.add(A06);
                }
            }
        }
        AnonymousClass1EM A0W = C18310x6.A0W(r4);
        AnonymousClass1DF r0 = (AnonymousClass1DF) A0G.A06();
        r0.getClass();
        A0W.peerDataOperationRequestMessage_ = r0;
        A0W.bitField0_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
        r8.A00.A0D(r4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
        if (r0 != 4) goto L_0x003b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C624134x BgW(X.C55962rC r9) {
        /*
            r8 = this;
            X.23O r1 = X.C385428c.A00(r9)
            X.23O r0 = X.AnonymousClass23O.PEER_DATA_OPERATION_REQUEST_MESSAGE
            if (r1 != r0) goto L_0x013e
            X.1EU r3 = r9.A0B
            X.1EM r0 = r3.protocolMessage_
            if (r0 != 0) goto L_0x0010
            X.1EM r0 = X.AnonymousClass1EM.DEFAULT_INSTANCE
        L_0x0010:
            X.1DF r1 = r0.peerDataOperationRequestMessage_
            if (r1 != 0) goto L_0x0016
            X.1DF r1 = X.AnonymousClass1DF.DEFAULT_INSTANCE
        L_0x0016:
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            int r0 = r1.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x003b
            int r0 = r1.peerDataOperationRequestType_
            X.23F r0 = X.AnonymousClass23F.A00(r0)
            if (r0 != 0) goto L_0x002a
            X.23F r0 = X.AnonymousClass23F.UPLOAD_STICKER
        L_0x002a:
            int r0 = r0.value
            r7 = 0
            if (r0 == 0) goto L_0x003c
            r7 = 1
            if (r0 == r7) goto L_0x003c
            r7 = 2
            if (r0 == r7) goto L_0x003c
            r7 = 3
            if (r0 == r7) goto L_0x003c
            r7 = 4
            if (r0 == r7) goto L_0x003c
        L_0x003b:
            r7 = -1
        L_0x003c:
            X.2z0 r2 = r9.A0D
            long r0 = r9.A05
            X.1nN r5 = new X.1nN
            r5.<init>(r2, r0)
            r5.A00 = r7
            X.1EM r0 = r3.protocolMessage_
            if (r0 != 0) goto L_0x004d
            X.1EM r0 = X.AnonymousClass1EM.DEFAULT_INSTANCE
        L_0x004d:
            X.1DF r1 = r0.peerDataOperationRequestMessage_
            if (r1 != 0) goto L_0x0053
            X.1DF r1 = X.AnonymousClass1DF.DEFAULT_INSTANCE
        L_0x0053:
            java.util.HashSet r4 = X.AnonymousClass002.A0K()
            java.lang.Integer r3 = X.C18320x8.A0X()
            if (r7 != 0) goto L_0x0093
            X.8ya r0 = r1.requestStickerReupload_
            int r0 = r0.size()
            if (r0 == 0) goto L_0x008b
            X.8ya r0 = r1.requestStickerReupload_
            java.util.Iterator r2 = r0.iterator()
        L_0x006b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00ec
            java.lang.Object r1 = r2.next()
            X.1AS r1 = (X.AnonymousClass1AS) r1
            int r0 = r1.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0083
            java.lang.String r0 = r1.fileSha256_
            r4.add(r0)
            goto L_0x006b
        L_0x0083:
            java.lang.String r0 = "missing sticker fileHash"
            X.24W r0 = X.AnonymousClass24W.A01(r3, r0)
            throw r0
        L_0x008b:
            java.lang.String r0 = "missing sticker request msg"
            X.24W r0 = X.AnonymousClass24W.A01(r3, r0)
            throw r0
        L_0x0093:
            r6 = 2
            if (r7 != r6) goto L_0x00d2
            X.8ya r0 = r1.requestUrlPreview_
            int r0 = r0.size()
            if (r0 == 0) goto L_0x00ca
            X.8ya r0 = r1.requestUrlPreview_
            java.util.Iterator r2 = r0.iterator()
        L_0x00a4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00ec
            java.lang.Object r1 = r2.next()
            X.1BN r1 = (X.AnonymousClass1BN) r1
            int r0 = r1.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x00c2
            byte[] r0 = r1.A0F()
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r6)
            r4.add(r0)
            goto L_0x00a4
        L_0x00c2:
            java.lang.String r0 = "missing link preview url"
            X.24W r0 = X.AnonymousClass24W.A01(r3, r0)
            throw r0
        L_0x00ca:
            java.lang.String r0 = "missing url request msg"
            X.24W r0 = X.AnonymousClass24W.A01(r3, r0)
            throw r0
        L_0x00d2:
            r0 = 3
            if (r7 != r0) goto L_0x00ef
            int r0 = r1.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0126
            X.1DE r0 = r1.historySyncOnDemandRequest_
            if (r0 != 0) goto L_0x00e1
            X.1DE r0 = X.AnonymousClass1DE.DEFAULT_INSTANCE
        L_0x00e1:
            byte[] r0 = r0.A0F()
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r6)
            r4.add(r0)
        L_0x00ec:
            r5.A01 = r4
        L_0x00ee:
            return r5
        L_0x00ef:
            r0 = 4
            if (r7 != r0) goto L_0x00ee
            X.8ya r0 = r1.placeholderMessageResendRequest_
            int r0 = r0.size()
            if (r0 == 0) goto L_0x0136
            X.8ya r0 = r1.placeholderMessageResendRequest_
            java.util.Iterator r2 = r0.iterator()
        L_0x0100:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00ec
            java.lang.Object r1 = r2.next()
            X.1AR r1 = (X.AnonymousClass1AR) r1
            int r0 = r1.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x012e
            X.1ET r0 = r1.messageKey_
            if (r0 != 0) goto L_0x011a
            X.1ET r0 = X.AnonymousClass1ET.DEFAULT_INSTANCE
            if (r0 == 0) goto L_0x012e
        L_0x011a:
            byte[] r0 = r0.A0F()
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r6)
            r4.add(r0)
            goto L_0x0100
        L_0x0126:
            java.lang.String r0 = "missing history sync on demand payload"
            X.24W r0 = X.AnonymousClass24W.A01(r3, r0)
            throw r0
        L_0x012e:
            java.lang.String r0 = "missing message key in placeholder resend request"
            X.24W r0 = X.AnonymousClass24W.A01(r3, r0)
            throw r0
        L_0x0136:
            java.lang.String r0 = "missing placeholder resend request"
            X.24W r0 = X.AnonymousClass24W.A01(r3, r0)
            throw r0
        L_0x013e:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66913Ng.BgW(X.2rC):X.34x");
    }
}
