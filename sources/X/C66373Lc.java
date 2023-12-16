package X;

/* renamed from: X.3Lc  reason: invalid class name and case insensitive filesystem */
public final class C66373Lc implements AnonymousClass485 {
    public final C627036g A00;
    public final AnonymousClass2G6 A01;
    public final AnonymousClass2G7 A02;
    public final AnonymousClass2WD A03;
    public final AnonymousClass2G8 A04;
    public final AnonymousClass2G9 A05;
    public final AnonymousClass2GA A06;

    /* JADX WARNING: Code restructure failed: missing block: B:140:0x068e, code lost:
        if (java.util.Arrays.equals(r5.A1u(), r6.A1u()) != false) goto L_0x067b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0693, code lost:
        if (r0 != null) goto L_0x024b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0699, code lost:
        if (r0 != null) goto L_0x0239;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        if (r40 == null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0fa3, code lost:
        if (r3 == null) goto L_0x0fa5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01cb, code lost:
        if (r13 == null) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0204, code lost:
        if (r13 == null) goto L_0x0206;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x051e  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x05c1  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x064f  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0652  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x065f  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0691  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x0b7b  */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x0caa  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x0d27  */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x0d83  */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x0efc  */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x1055  */
    /* JADX WARNING: Removed duplicated region for block: B:416:0x0c84 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0416  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x04fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C624134x r39, X.C624134x r40, java.lang.String r41) {
        /*
            r38 = this;
            r5 = r39
            r6 = r40
            r7 = r41
            if (r5 == r6) goto L_0x105d
            r0 = 2
            r8 = 1
            r12 = 0
            if (r41 != 0) goto L_0x0029
            java.util.Locale r7 = java.util.Locale.getDefault()
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r2 = -1
            if (r39 == 0) goto L_0x069d
            long r0 = r5.A1L
        L_0x0019:
            X.AnonymousClass000.A1Q(r4, r12, r0)
            if (r40 == 0) goto L_0x0020
            long r2 = r6.A1L
        L_0x0020:
            X.AnonymousClass000.A1Q(r4, r8, r2)
            java.lang.String r0 = "Messages are not equal: expected message with rowId = %d, actual message with rowId = %d; "
            java.lang.String r7 = java.lang.String.format(r7, r0, r4)
        L_0x0029:
            r37 = r38
            r0 = r37
            X.36g r4 = r0.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r7)
            java.lang.String r0 = " null check."
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            if (r39 == 0) goto L_0x003e
            r0 = 1
            if (r40 != 0) goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            r4.A0e(r1, r0)
            r0 = 16
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>(r0)
            java.lang.String r0 = "remoteResourceDeprecated"
            r3.add(r0)
            java.lang.String r0 = "server_receipt_timestamp"
            r3.add(r0)
            java.lang.String r0 = "data"
            r3.add(r0)
            java.lang.String r0 = "dataBytes"
            r3.add(r0)
            java.lang.String r0 = "quotedMessage"
            r3.add(r0)
            java.lang.String r0 = "externalAdContentInfo"
            r3.add(r0)
            java.lang.String r11 = "mmsThumbnailMetadata"
            r3.add(r11)
            java.lang.String r0 = "audioData"
            r3.add(r0)
            java.lang.String r0 = "thumbnail"
            r3.add(r0)
            java.lang.String r10 = "paymentTransactionInfo"
            r3.add(r10)
            java.lang.String r0 = "mediaDataV2"
            r3.add(r0)
            java.lang.String r0 = "sidecar"
            r3.add(r0)
            java.lang.String r0 = "templateInfo"
            r3.add(r0)
            java.lang.String r0 = "profilePhotoChange"
            r3.add(r0)
            java.lang.String r0 = "dataLock"
            r3.add(r0)
            java.lang.String r0 = "multiElementContent"
            r3.add(r0)
            java.lang.String r0 = "interactiveMessageContent"
            r3.add(r0)
            java.lang.String r0 = "interactiveResponseMessageContent"
            r3.add(r0)
            java.lang.String r0 = "quoted_row_id"
            r3.add(r0)
            java.lang.String r0 = "messageDecorator"
            r3.add(r0)
            java.lang.String r2 = "customerLoggingData"
            r3.add(r2)
            java.lang.String r0 = "originalMsgRowId"
            r3.add(r0)
            java.lang.String r0 = "messageDetailsInfo"
            r3.add(r0)
            r4.A0a(r5, r6, r7, r3)
            boolean r0 = r5 instanceof X.C31351o9
            if (r0 == 0) goto L_0x0105
            boolean r0 = r6 instanceof X.C31351o9
            if (r0 == 0) goto L_0x0105
            r9 = r5
            X.1o9 r9 = (X.C31351o9) r9
            boolean r0 = r9.A1v()
            if (r0 == 0) goto L_0x00f1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r7)
            java.lang.String r0 = " Field: senderJid."
            java.lang.String r8 = X.AnonymousClass000.A0X(r0, r1)
            X.4uZ r1 = r5.A0n()
            X.4uZ r0 = r6.A0n()
            r4.A0Y(r1, r0, r8)
        L_0x00f1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r7)
            java.lang.String r0 = " Field: paymentAmount."
            java.lang.String r8 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r1 = r9.A03
            r0 = r6
            X.1o9 r0 = (X.C31351o9) r0
            java.lang.String r0 = r0.A03
            r4.A0c(r8, r1, r0)
        L_0x0105:
            boolean r0 = r5 instanceof X.C31331o7
            if (r0 == 0) goto L_0x0177
            boolean r0 = r6 instanceof X.C31331o7
            if (r0 == 0) goto L_0x0177
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r7)
            java.lang.String r0 = " Field: photoChangeObject."
            java.lang.String r14 = X.AnonymousClass000.A0X(r0, r1)
            r0 = r5
            X.1o7 r0 = (X.C31331o7) r0
            com.whatsapp.data.ProfilePhotoChange r13 = r0.A00
            r0 = r6
            X.1o7 r0 = (X.C31331o7) r0
            com.whatsapp.data.ProfilePhotoChange r9 = r0.A00
            if (r13 == r9) goto L_0x0177
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r14)
            java.lang.String r0 = " expected value is null."
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            r8 = 1
            boolean r0 = X.AnonymousClass000.A1W(r13)
            java.lang.StringBuilder r1 = X.C627036g.A06(r4, r1, r14, r0)
            java.lang.String r0 = " actual value is null."
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            if (r9 != 0) goto L_0x013f
            r8 = 0
        L_0x013f:
            java.lang.StringBuilder r1 = X.C627036g.A06(r4, r0, r14, r8)
            java.lang.String r0 = " Field: newPhotoId."
            java.lang.String r8 = X.AnonymousClass000.A0X(r0, r1)
            int r0 = r13.newPhotoId
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r9.newPhotoId
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.StringBuilder r1 = X.C627036g.A05(r4, r1, r0, r8, r14)
            java.lang.String r0 = " Field: newPhoto."
            java.lang.String r8 = X.AnonymousClass000.A0X(r0, r1)
            byte[] r1 = r13.newPhoto
            byte[] r0 = r9.newPhoto
            r4.A0f(r8, r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r14)
            java.lang.String r0 = " Field: oldPhoto."
            java.lang.String r8 = X.AnonymousClass000.A0X(r0, r1)
            byte[] r1 = r13.oldPhoto
            byte[] r0 = r9.oldPhoto
            r4.A0f(r8, r1, r0)
        L_0x0177:
            boolean r0 = r5 instanceof X.AnonymousClass4DV
            if (r0 == 0) goto L_0x0198
            boolean r0 = r6 instanceof X.AnonymousClass4DV
            if (r0 == 0) goto L_0x0198
            r0 = r37
            X.2WD r9 = r0.A03
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r7)
            java.lang.String r0 = " Field: multiElementContent."
            java.lang.String r8 = X.AnonymousClass000.A0X(r0, r1)
            X.39W r1 = X.AnonymousClass0x9.A0Y(r5)
            X.39W r0 = X.AnonymousClass0x9.A0Y(r6)
            r9.A00(r1, r0, r8)
        L_0x0198:
            boolean r0 = r5 instanceof X.C31901p2
            r16 = r0
            if (r0 == 0) goto L_0x022a
            boolean r0 = r6 instanceof X.C31901p2
            if (r0 == 0) goto L_0x022a
            r0 = r37
            X.2WD r1 = r0.A03
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0l(r7)
            java.lang.String r0 = " Field: content."
            java.lang.String r15 = X.AnonymousClass000.A0X(r0, r8)
            r0 = r5
            X.1p2 r0 = (X.C31901p2) r0
            X.39N r14 = r0.A00
            r0 = r6
            X.1p2 r0 = (X.C31901p2) r0
            X.39N r13 = r0.A00
            if (r14 == r13) goto L_0x022a
            X.36g r9 = r1.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r15)
            java.lang.String r0 = " responseContent null check."
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            if (r14 == 0) goto L_0x01cd
            r0 = 1
            if (r13 != 0) goto L_0x01ce
        L_0x01cd:
            r0 = 0
        L_0x01ce:
            java.lang.StringBuilder r1 = X.C627036g.A06(r9, r1, r15, r0)
            java.lang.String r0 = " Field: title."
            java.lang.String r8 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r1 = r14.A04
            java.lang.String r0 = r13.A04
            java.lang.StringBuilder r1 = X.C627036g.A04(r9, r1, r0, r8, r15)
            java.lang.String r0 = " Field: type."
            java.lang.String r8 = X.AnonymousClass000.A0X(r0, r1)
            int r0 = r14.A05
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r13.A05
            X.C627036g.A0R(r9, r1, r8, r0)
            X.397 r14 = r14.A01
            X.397 r13 = r13.A01
            if (r14 == r13) goto L_0x022a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r15)
            java.lang.String r0 = " NativeFlowResponse null check."
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            if (r14 == 0) goto L_0x0206
            r0 = 1
            if (r13 != 0) goto L_0x0207
        L_0x0206:
            r0 = 0
        L_0x0207:
            java.lang.StringBuilder r1 = X.C627036g.A06(r9, r1, r15, r0)
            java.lang.String r0 = " Field: name."
            java.lang.String r8 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r1 = r14.A00
            java.lang.String r0 = r13.A00
            java.lang.StringBuilder r1 = X.C627036g.A04(r9, r1, r0, r8, r15)
            java.lang.String r0 = " Field: params json."
            java.lang.String r8 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r1 = r14.A01
            java.lang.String r0 = r13.A01
            boolean r0 = X.C107575bX.A0G(r1, r0)
            r9.A0e(r8, r0)
        L_0x022a:
            boolean r0 = r5 instanceof X.C30341mI
            if (r0 == 0) goto L_0x0697
            r1 = r5
            X.1mI r1 = (X.C30341mI) r1
            boolean r0 = r1 instanceof X.C31891p1
            if (r0 == 0) goto L_0x023c
            X.1p1 r1 = (X.C31891p1) r1
            java.util.List r0 = r1.A01
        L_0x0239:
            java.util.Collections.sort(r0)
        L_0x023c:
            boolean r0 = r6 instanceof X.C30341mI
            if (r0 == 0) goto L_0x0691
            r1 = r6
            X.1mI r1 = (X.C30341mI) r1
            boolean r0 = r1 instanceof X.C31891p1
            if (r0 == 0) goto L_0x024e
            X.1p1 r1 = (X.C31891p1) r1
            java.util.List r0 = r1.A01
        L_0x024b:
            java.util.Collections.sort(r0)
        L_0x024e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r7)
            java.lang.String r0 = " Field: getStringForDatabaseFieldRemoteResource."
            java.lang.String r8 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r1 = r5.A15()
            java.lang.String r0 = r6.A15()
            r4.A0Y(r1, r0, r8)
            int r0 = r5.A02
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            if (r0 != 0) goto L_0x065f
            r1.append(r7)
            java.lang.String r0 = " Field: data."
            java.lang.String r8 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r1 = r5.A13()
            java.lang.String r0 = r6.A13()
            r4.A0c(r8, r1, r0)
        L_0x027f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r7)
            java.lang.String r0 = " Field: server_receipt_timestamp."
            java.lang.String r13 = X.AnonymousClass000.A0X(r0, r1)
            long r8 = r5.A0J
            long r0 = r6.A0J
            r17 = 0
            int r14 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r14 > 0) goto L_0x0652
            int r8 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            boolean r0 = X.AnonymousClass0x7.A1P(r8)
            r4.A0e(r13, r0)
        L_0x029c:
            java.util.Locale r9 = java.util.Locale.ENGLISH
            java.lang.Object[] r8 = X.AnonymousClass0x9.A1X()
            X.34x r0 = r5.A0w()
            r1 = -1
            if (r0 == 0) goto L_0x064f
            byte r0 = r0.A1I
        L_0x02ab:
            X.C18310x6.A1T(r8, r0, r12)
            X.34x r0 = r6.A0w()
            if (r0 == 0) goto L_0x02b6
            byte r1 = r0.A1I
        L_0x02b6:
            java.lang.Byte r0 = java.lang.Byte.valueOf(r1)
            r17 = 1
            r8[r17] = r0
            long r0 = r5.A0H
            r13 = 0
            int r12 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1W(r12)
            X.AnonymousClass001.A1S(r8, r0)
            java.lang.String r0 = "{before:type:%d}{after:type:%d}{before:quoted_row_id_gt_0:%s}"
            java.lang.String r8 = java.lang.String.format(r9, r0, r8)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r7)
            java.lang.String r0 = " Field: quotedMessage."
            java.lang.String r9 = X.AnonymousClass000.A0V(r0, r8, r1)
            X.34x r8 = r5.A0w()
            X.34x r1 = r6.A0w()
            r0 = r37
            r0.A00(r8, r1, r9)
            X.2G7 r8 = r0.A02
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r7)
            java.lang.String r0 = " Field: externalAdContentInfo."
            java.lang.String r14 = X.AnonymousClass000.A0X(r0, r1)
            X.2U8 r13 = r5.A0c
            X.2U8 r12 = r6.A0c
            if (r13 == r12) goto L_0x0410
            X.36g r9 = r8.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r14)
            java.lang.String r0 = " expected value is null."
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            r8 = 1
            boolean r0 = X.AnonymousClass000.A1W(r13)
            java.lang.StringBuilder r1 = X.C627036g.A06(r9, r1, r14, r0)
            java.lang.String r0 = " actual value is null."
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            if (r12 != 0) goto L_0x0319
            r8 = 0
        L_0x0319:
            java.lang.StringBuilder r1 = X.C627036g.A06(r9, r0, r14, r8)
            java.lang.String r0 = " Field: title."
            java.lang.String r8 = X.AnonymousClass000.A0X(r0, r1)
            X.C626936e.A06(r13)
            java.lang.String r1 = r13.A0A
            X.C626936e.A06(r12)
            java.lang.String r0 = r12.A0A
            java.lang.StringBuilder r1 = X.C627036g.A05(r9, r1, r0, r8, r14)
            java.lang.String r0 = " Field: body."
            java.lang.String r8 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r1 = r13.A02
            java.lang.String r0 = r12.A02
            java.lang.StringBuilder r1 = X.C627036g.A05(r9, r1, r0, r8, r14)
            java.lang.String r0 = " Field: mediaType."
            java.lang.String r8 = X.AnonymousClass000.A0X(r0, r1)
            int r0 = r13.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r12.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.StringBuilder r1 = X.C627036g.A05(r9, r1, r0, r8, r14)
            java.lang.String r0 = " Field: thumbnailUrl."
            java.lang.String r8 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r1 = r13.A09
            java.lang.String r0 = r12.A09
            java.lang.StringBuilder r1 = X.C627036g.A05(r9, r1, r0, r8, r14)
            java.lang.String r0 = " Field: mediaUrl."
            java.lang.String r8 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r1 = r13.A04
            java.lang.String r0 = r12.A04
            java.lang.StringBuilder r1 = X.C627036g.A05(r9, r1, r0, r8, r14)
            java.lang.String r0 = " Field: microThumbnail."
            java.lang.String r8 = X.AnonymousClass000.A0X(r0, r1)
            byte[] r1 = r13.A0F
            byte[] r0 = r12.A0F
            r9.A0f(r8, r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r14)
            java.lang.String r0 = " Field: fullThumbnail."
            java.lang.String r8 = X.AnonymousClass000.A0X(r0, r1)
            byte[] r1 = r13.A00
            byte[] r0 = r12.A00
            r9.A0f(r8, r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r14)
            java.lang.String r0 = " Field: sourceType."
            java.lang.String r8 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r1 = r13.A07
            java.lang.String r0 = r12.A07
            java.lang.StringBuilder r1 = X.C627036g.A05(r9, r1, r0, r8, r14)
            java.lang.String r0 = " Field: sourceId."
            java.lang.String r8 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r1 = r13.A06
            java.lang.String r0 = r12.A06
            java.lang.StringBuilder r1 = X.C627036g.A05(r9, r1, r0, r8, r14)
            java.lang.String r0 = " Field: sourceUrl."
            java.lang.String r8 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r1 = r13.A08
            java.lang.String r0 = r12.A08
            java.lang.StringBuilder r1 = X.C627036g.A05(r9, r1, r0, r8, r14)
            java.lang.String r0 = " Field: renderLargerThumbnail."
            java.lang.String r8 = X.AnonymousClass000.A0X(r0, r1)
            boolean r0 = r13.A0D
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r12.A0D
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.StringBuilder r1 = X.C627036g.A05(r9, r1, r0, r8, r14)
            java.lang.String r0 = " Field: showAdAttribution."
            java.lang.String r8 = X.AnonymousClass000.A0X(r0, r1)
            boolean r0 = r13.A0E
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r12.A0E
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.StringBuilder r1 = X.C627036g.A05(r9, r1, r0, r8, r14)
            java.lang.String r0 = " Field: hasIcebreakerAutoResponse."
            java.lang.String r8 = X.AnonymousClass000.A0X(r0, r1)
            boolean r0 = r13.A0C
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r12.A0C
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.StringBuilder r1 = X.C627036g.A05(r9, r1, r0, r8, r14)
            java.lang.String r0 = "Field: hasClickToCallAutoResponse."
            java.lang.String r8 = X.AnonymousClass000.A0X(r0, r1)
            boolean r0 = r13.A0B
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r12.A0B
            X.C627036g.A0S(r9, r1, r8, r0)
        L_0x0410:
            boolean r0 = r3.contains(r11)
            if (r0 != 0) goto L_0x04de
            r0 = r37
            X.2GA r8 = r0.A06
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r7)
            java.lang.String r0 = " Field: mmsThumbnailMetadata."
            java.lang.String r13 = X.AnonymousClass000.A0X(r0, r1)
            X.2qb r12 = r5.A0l
            X.2qb r11 = r6.A0l
            if (r12 == r11) goto L_0x04de
            X.36g r9 = r8.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r13)
            java.lang.String r0 = " expected value is null."
            java.lang.String r8 = X.AnonymousClass000.A0X(r0, r1)
            r1 = 1
            boolean r0 = X.AnonymousClass000.A1W(r12)
            java.lang.StringBuilder r8 = X.C627036g.A06(r9, r8, r13, r0)
            java.lang.String r0 = " actual value is null."
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r8)
            if (r11 != 0) goto L_0x0448
            r1 = 0
        L_0x0448:
            java.lang.StringBuilder r1 = X.C627036g.A06(r9, r0, r13, r1)
            java.lang.String r0 = " Field: directPath."
            java.lang.String r8 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r1 = r12.A04
            java.lang.String r0 = r11.A04
            java.lang.StringBuilder r1 = X.C627036g.A05(r9, r1, r0, r8, r13)
            java.lang.String r0 = " Field: mediaKey."
            java.lang.String r8 = X.AnonymousClass000.A0X(r0, r1)
            byte[] r1 = r12.A0A
            byte[] r0 = r11.A0A
            r9.A0f(r8, r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r13)
            java.lang.String r0 = " Field: mediaKeyTimestampMs."
            java.lang.String r8 = X.AnonymousClass000.A0X(r0, r1)
            long r0 = r12.A02
            java.lang.Long r14 = java.lang.Long.valueOf(r0)
            long r0 = r11.A02
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.StringBuilder r1 = X.C627036g.A05(r9, r14, r0, r8, r13)
            java.lang.String r0 = " Field: encThumbHash."
            java.lang.String r8 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r1 = r12.A05
            java.lang.String r0 = r11.A05
            java.lang.StringBuilder r1 = X.C627036g.A05(r9, r1, r0, r8, r13)
            java.lang.String r0 = " Field: thumbHash."
            java.lang.String r8 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r1 = r12.A08
            java.lang.String r0 = r11.A08
            java.lang.StringBuilder r0 = X.C627036g.A05(r9, r1, r0, r8, r13)
            java.lang.String r14 = " Field: thumbWidth."
            java.lang.String r8 = X.AnonymousClass000.A0X(r14, r0)
            byte[] r1 = r12.A0B
            byte[] r0 = r11.A0B
            r9.A0f(r8, r1, r0)
            java.lang.String r8 = X.AnonymousClass000.A0T(r13, r14)
            int r0 = r12.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r11.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.StringBuilder r0 = X.C627036g.A05(r9, r1, r0, r8, r13)
            java.lang.String r14 = " Field: thumbHeight."
            java.lang.String r8 = X.AnonymousClass000.A0X(r14, r0)
            int r0 = r12.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r11.A00
            X.C627036g.A0R(r9, r1, r8, r0)
            java.lang.String r8 = X.AnonymousClass000.A0T(r13, r14)
            boolean r0 = r12.A09
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r11.A09
            X.C627036g.A0S(r9, r1, r8, r0)
        L_0x04de:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r7)
            java.lang.String r0 = " Field: origin."
            java.lang.String r8 = X.AnonymousClass000.A0X(r0, r1)
            int r0 = r5.A09
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r6.A09
            X.C627036g.A0R(r4, r1, r8, r0)
            java.lang.String r0 = "lookupTablesFlags"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x0518
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r7)
            java.lang.String r0 = " Field: lookupTablesFlags"
            java.lang.String r9 = X.AnonymousClass000.A0X(r0, r1)
            long r0 = r5.A0m()
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            long r0 = r6.A0m()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A0Y(r8, r0, r9)
        L_0x0518:
            boolean r0 = r3.contains(r10)
            if (r0 != 0) goto L_0x05bd
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r7)
            java.lang.String r0 = " Field: paymentTransactionInfo."
            java.lang.String r9 = X.AnonymousClass000.A0X(r0, r1)
            X.34w r8 = r5.A0P
            X.34w r11 = r6.A0P
            if (r8 == r11) goto L_0x05bd
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r9)
            java.lang.String r0 = " expected value is null."
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            r13 = 1
            boolean r0 = X.AnonymousClass000.A1W(r8)
            java.lang.StringBuilder r1 = X.C627036g.A06(r4, r1, r9, r0)
            java.lang.String r0 = " actual value is null."
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            boolean r0 = X.AnonymousClass000.A1W(r11)
            java.lang.StringBuilder r1 = X.C627036g.A06(r4, r1, r9, r0)
            java.lang.String r0 = " Field: methods"
            java.lang.String r12 = X.AnonymousClass000.A0X(r0, r1)
            java.util.ArrayList r10 = r8.A0N
            java.util.ArrayList r1 = r11.A0N
            java.util.Set r0 = java.util.Collections.emptySet()
            r4.A0d(r12, r10, r1, r0)
            X.1S4 r10 = r8.A0A
            java.lang.String r12 = " Field: countryData"
            if (r10 == 0) goto L_0x063b
            X.1S4 r0 = r11.A0A
            if (r0 == 0) goto L_0x063b
            java.lang.String r10 = r10.A0N()
            X.1S4 r0 = r11.A0A
            java.lang.String r1 = r0.A0N()
            java.lang.String r0 = X.AnonymousClass000.A0T(r9, r12)
            r4.A0Y(r10, r1, r0)
        L_0x057b:
            java.util.HashSet r1 = X.AnonymousClass002.A0K()
            java.lang.String r0 = "initTs"
            r1.add(r0)
            java.lang.String r0 = "isDirty"
            r1.add(r0)
            java.lang.String r0 = "methods"
            r1.add(r0)
            java.lang.String r0 = "countryData"
            r1.add(r0)
            java.lang.String r0 = "msgKeyFromMe"
            r1.add(r0)
            r1.add(r2)
            r4.A0a(r8, r11, r9, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r9)
            java.lang.String r0 = " Field: initTs."
            java.lang.String r10 = X.AnonymousClass000.A0X(r0, r1)
            long r8 = r8.A05
            long r0 = r11.A05
            r11 = 0
            int r2 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r2 > 0) goto L_0x062f
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            boolean r0 = X.AnonymousClass0x7.A1P(r2)
            r4.A0e(r10, r0)
        L_0x05bd:
            boolean r0 = r5 instanceof X.C30471mV
            if (r0 == 0) goto L_0x0c88
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r7)
            java.lang.String r0 = " Field: streamingSidecar."
            java.lang.String r12 = X.AnonymousClass000.A0X(r0, r1)
            r9 = r5
            X.1mV r9 = (X.C30471mV) r9
            X.30d r2 = r9.A1v()
            r10 = r6
            X.1mV r10 = (X.C30471mV) r10
            X.30d r11 = r10.A1v()
            if (r2 == r11) goto L_0x06ed
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r12)
            java.lang.String r0 = " expected value is null."
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            r8 = 1
            boolean r0 = X.AnonymousClass000.A1W(r2)
            java.lang.StringBuilder r1 = X.C627036g.A06(r4, r1, r12, r0)
            java.lang.String r0 = " actual value is null."
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            if (r11 != 0) goto L_0x05f7
            r8 = 0
        L_0x05f7:
            java.lang.StringBuilder r1 = X.C627036g.A06(r4, r0, r12, r8)
            java.lang.String r0 = " Field: getMessage.key."
            java.lang.String r8 = X.AnonymousClass000.A0X(r0, r1)
            X.1mV r0 = r2.A04
            X.2z0 r1 = r0.A1J
            X.1mV r0 = r11.A04
            X.2z0 r0 = r0.A1J
            java.lang.StringBuilder r1 = X.C627036g.A05(r4, r1, r0, r8, r12)
            java.lang.String r0 = " Field: isLoaded."
            java.lang.String r8 = X.AnonymousClass000.A0X(r0, r1)
            boolean r0 = r2.A05()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r11.A05()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.StringBuilder r1 = X.C627036g.A05(r4, r1, r0, r8, r12)
            java.lang.String r0 = " Field: needsCommit."
            java.lang.String r8 = X.AnonymousClass000.A0X(r0, r1)
            monitor-enter(r2)
            goto L_0x06a1
        L_0x062f:
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A0Y(r2, r0, r10)
            goto L_0x05bd
        L_0x063b:
            java.lang.String r1 = X.AnonymousClass000.A0T(r9, r12)
            X.1S4 r0 = r11.A0A
            if (r10 == 0) goto L_0x064a
            if (r0 == 0) goto L_0x064d
        L_0x0645:
            r4.A0e(r1, r13)
            goto L_0x057b
        L_0x064a:
            if (r0 != 0) goto L_0x064d
            goto L_0x0645
        L_0x064d:
            r13 = 0
            goto L_0x0645
        L_0x064f:
            r0 = -1
            goto L_0x02ab
        L_0x0652:
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A0Y(r8, r0, r13)
            goto L_0x029c
        L_0x065f:
            r1.append(r7)
            java.lang.String r0 = " Field: dataBytes."
            java.lang.String r8 = X.AnonymousClass000.A0X(r0, r1)
            byte[] r0 = r5.A1u()
            r1 = 1
            if (r0 == 0) goto L_0x0672
            int r0 = r0.length
            if (r0 >= r1) goto L_0x0681
        L_0x0672:
            byte[] r0 = r6.A1u()
            if (r0 == 0) goto L_0x067b
            int r0 = r0.length
            if (r0 >= r1) goto L_0x0681
        L_0x067b:
            r1 = 1
        L_0x067c:
            r4.A0e(r8, r1)
            goto L_0x027f
        L_0x0681:
            byte[] r1 = r5.A1u()
            byte[] r0 = r6.A1u()
            boolean r0 = java.util.Arrays.equals(r1, r0)
            r1 = 0
            if (r0 == 0) goto L_0x067c
            goto L_0x067b
        L_0x0691:
            java.util.List r0 = r6.A19
            if (r0 == 0) goto L_0x024e
            goto L_0x024b
        L_0x0697:
            java.util.List r0 = r5.A19
            if (r0 == 0) goto L_0x023c
            goto L_0x0239
        L_0x069d:
            r0 = -1
            goto L_0x0019
        L_0x06a1:
            boolean r0 = r2.A01     // Catch:{ all -> 0x06ea }
            monitor-exit(r2)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            monitor-enter(r11)
            boolean r0 = r11.A01     // Catch:{ all -> 0x06e7 }
            monitor-exit(r11)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.StringBuilder r1 = X.C627036g.A05(r4, r1, r0, r8, r12)
            java.lang.String r0 = " Field: sidecar."
            java.lang.String r8 = X.AnonymousClass000.A0X(r0, r1)
            byte[] r1 = r2.A06()
            byte[] r0 = r11.A06()
            r4.A0f(r8, r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r12)
            java.lang.String r0 = " Field: chunkLengths."
            java.lang.String r8 = X.AnonymousClass000.A0X(r0, r1)
            int[] r2 = r2.A07()
            int[] r1 = r11.A07()
            if (r2 == r1) goto L_0x06ed
            boolean r0 = java.util.Arrays.equals(r2, r1)
            if (r0 != 0) goto L_0x06ed
            r4.A0Z(r2, r1, r8)
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0L()
            throw r0
        L_0x06e7:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        L_0x06ea:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x06ed:
            X.33C r10 = r10.A01
            X.33C r9 = r9.A01
            r0 = r37
            X.2G8 r2 = r0.A04
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r7)
            java.lang.String r0 = " Field: MediaDataV2."
            java.lang.String r11 = X.AnonymousClass000.A0X(r0, r1)
            if (r9 == r10) goto L_0x0c88
            X.36g r2 = r2.A00
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r11)
            java.lang.String r12 = " expected value is null."
            java.lang.String r8 = X.AnonymousClass000.A0X(r12, r0)
            r1 = 1
            boolean r0 = X.AnonymousClass000.A1W(r9)
            java.lang.StringBuilder r0 = X.C627036g.A06(r2, r8, r11, r0)
            java.lang.String r8 = " actual value is null."
            java.lang.String r0 = X.AnonymousClass000.A0X(r8, r0)
            if (r10 != 0) goto L_0x071f
            r1 = 0
        L_0x071f:
            r2.A0e(r0, r1)
            java.lang.String r0 = "MediaDataV2.transfering"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x073f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r11)
            java.lang.String r0 = " Field: transfering."
            java.lang.String r13 = X.AnonymousClass000.A0X(r0, r1)
            boolean r0 = r9.A0c
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r10.A0c
            X.C627036g.A0S(r2, r1, r13, r0)
        L_0x073f:
            java.lang.String r0 = "MediaDataV2.prefetching"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x075c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r11)
            java.lang.String r0 = " Field: prefetching."
            java.lang.String r13 = X.AnonymousClass000.A0X(r0, r1)
            boolean r0 = r9.A0a
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r10.A0a
            X.C627036g.A0S(r2, r1, r13, r0)
        L_0x075c:
            java.lang.String r0 = "MediaDataV2.dedupeDownload"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x0779
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r11)
            java.lang.String r0 = " Field: dedupeDownload."
            java.lang.String r13 = X.AnonymousClass000.A0X(r0, r1)
            boolean r0 = r9.A0Y
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r10.A0Y
            X.C627036g.A0S(r2, r1, r13, r0)
        L_0x0779:
            java.lang.String r0 = "MediaDataV2.streamViewable"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x0796
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r11)
            java.lang.String r0 = " Field: streamViewable."
            java.lang.String r13 = X.AnonymousClass000.A0X(r0, r1)
            boolean r0 = r9.A0b
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r10.A0b
            X.C627036g.A0S(r2, r1, r13, r0)
        L_0x0796:
            java.lang.String r0 = "MediaDataV2.transferred"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x07c4
            java.lang.StringBuilder r14 = X.AnonymousClass000.A0l(r11)
            java.lang.String r0 = " Field: transferred.{before:"
            r14.append(r0)
            boolean r13 = r9.A0R
            r14.append(r13)
            java.lang.String r0 = ", after:"
            r14.append(r0)
            boolean r1 = r10.A0R
            r14.append(r1)
            java.lang.String r0 = "}"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r14)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            X.C627036g.A0S(r2, r13, r0, r1)
        L_0x07c4:
            java.lang.String r0 = "MediaDataV2.progress"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x07e5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r11)
            java.lang.String r0 = " Field: progress."
            java.lang.String r13 = X.AnonymousClass000.A0X(r0, r1)
            long r0 = r9.A0C
            java.lang.Long r14 = java.lang.Long.valueOf(r0)
            long r0 = r10.A0C
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0Y(r14, r0, r13)
        L_0x07e5:
            java.lang.String r0 = "MediaDataV2.file"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x07fe
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r11)
            java.lang.String r0 = " Field: file."
            java.lang.String r13 = X.AnonymousClass000.A0X(r0, r1)
            java.io.File r1 = r9.A0F
            java.io.File r0 = r10.A0F
            r2.A0Y(r1, r0, r13)
        L_0x07fe:
            java.lang.String r0 = "MediaDataV2.fileSize"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x081f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r11)
            java.lang.String r0 = " Field: fileSize."
            java.lang.String r13 = X.AnonymousClass000.A0X(r0, r1)
            long r0 = r9.A0A
            java.lang.Long r14 = java.lang.Long.valueOf(r0)
            long r0 = r10.A0A
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0Y(r14, r0, r13)
        L_0x081f:
            java.lang.String r0 = "MediaDataV2.autodownloadRetryEnabled"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x083c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r11)
            java.lang.String r0 = " Field: autodownloadRetryEnabled."
            java.lang.String r13 = X.AnonymousClass000.A0X(r0, r1)
            boolean r0 = r9.A0M
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r10.A0M
            X.C627036g.A0S(r2, r1, r13, r0)
        L_0x083c:
            java.lang.String r0 = "MediaDataV2.transcoded"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x0859
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r11)
            java.lang.String r0 = " Field: transcoded."
            java.lang.String r13 = X.AnonymousClass000.A0X(r0, r1)
            boolean r0 = r9.A0Q
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r10.A0Q
            X.C627036g.A0S(r2, r1, r13, r0)
        L_0x0859:
            java.lang.String r0 = "MediaDataV2.suspiciousContent"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x0876
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r11)
            java.lang.String r0 = " Field: suspiciousContent."
            java.lang.String r13 = X.AnonymousClass000.A0X(r0, r1)
            int r0 = r9.A07
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r10.A07
            X.C627036g.A0R(r2, r1, r13, r0)
        L_0x0876:
            java.lang.String r0 = "MediaDataV2.trimFrom"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x0897
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r11)
            java.lang.String r0 = " Field: trimFrom."
            java.lang.String r13 = X.AnonymousClass000.A0X(r0, r1)
            long r0 = r9.A0D
            java.lang.Long r14 = java.lang.Long.valueOf(r0)
            long r0 = r10.A0D
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0Y(r14, r0, r13)
        L_0x0897:
            java.lang.String r0 = "MediaDataV2.trimTo"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x08b8
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r11)
            java.lang.String r0 = " Field: trimTo."
            java.lang.String r13 = X.AnonymousClass000.A0X(r0, r1)
            long r0 = r9.A0E
            java.lang.Long r14 = java.lang.Long.valueOf(r0)
            long r0 = r10.A0E
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0Y(r14, r0, r13)
        L_0x08b8:
            java.lang.String r0 = "MediaDataV2.faceX"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x08d5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r11)
            java.lang.String r0 = " Field: faceX."
            java.lang.String r13 = X.AnonymousClass000.A0X(r0, r1)
            int r0 = r9.A02
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r10.A02
            X.C627036g.A0R(r2, r1, r13, r0)
        L_0x08d5:
            java.lang.String r0 = "MediaDataV2.faceY"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x08f2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r11)
            java.lang.String r0 = " Field: faceY."
            java.lang.String r13 = X.AnonymousClass000.A0X(r0, r1)
            int r0 = r9.A03
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r10.A03
            X.C627036g.A0R(r2, r1, r13, r0)
        L_0x08f2:
            java.lang.String r0 = "MediaDataV2.mediaKey"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x090b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r11)
            java.lang.String r0 = " Field: mediaKey."
            java.lang.String r13 = X.AnonymousClass000.A0X(r0, r1)
            byte[] r1 = r9.A0W
            byte[] r0 = r10.A0W
            r2.A0f(r13, r1, r0)
        L_0x090b:
            java.lang.String r0 = "MediaDataV2.refKey"
            r3.contains(r0)
            java.lang.String r0 = "MediaDataV2.cipherKey"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x0929
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r11)
            java.lang.String r0 = " Field: cipherKey."
            java.lang.String r13 = X.AnonymousClass000.A0X(r0, r1)
            byte[] r1 = r9.A0S
            byte[] r0 = r10.A0S
            r2.A0f(r13, r1, r0)
        L_0x0929:
            java.lang.String r0 = "MediaDataV2.hmacKey"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x0942
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r11)
            java.lang.String r0 = " Field: hmacKey."
            java.lang.String r13 = X.AnonymousClass000.A0X(r0, r1)
            byte[] r1 = r9.A0U
            byte[] r0 = r10.A0U
            r2.A0f(r13, r1, r0)
        L_0x0942:
            java.lang.String r0 = "MediaDataV2.iv"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x095b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r11)
            java.lang.String r0 = " Field: iv."
            java.lang.String r13 = X.AnonymousClass000.A0X(r0, r1)
            byte[] r1 = r9.A0V
            byte[] r0 = r10.A0V
            r2.A0f(r13, r1, r0)
        L_0x095b:
            java.lang.String r0 = "MediaDataV2.width"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x0978
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r11)
            java.lang.String r0 = " Field: width."
            java.lang.String r13 = X.AnonymousClass000.A0X(r0, r1)
            int r0 = r9.A08
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r10.A08
            X.C627036g.A0R(r2, r1, r13, r0)
        L_0x0978:
            java.lang.String r0 = "MediaDataV2.height"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x0995
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r11)
            java.lang.String r0 = " Field: height."
            java.lang.String r13 = X.AnonymousClass000.A0X(r0, r1)
            int r0 = r9.A06
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r10.A06
            X.C627036g.A0R(r2, r1, r13, r0)
        L_0x0995:
            java.lang.String r0 = "MediaDataV2.doodleId"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x09ae
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r11)
            java.lang.String r0 = " Field: doodleId."
            java.lang.String r13 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r1 = r9.A0H
            java.lang.String r0 = r10.A0H
            r2.A0c(r13, r1, r0)
        L_0x09ae:
            java.lang.String r0 = "MediaDataV2.hasStreamingSidecar"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x09cb
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r11)
            java.lang.String r0 = " Field: hasStreamingSidecar."
            java.lang.String r13 = X.AnonymousClass000.A0X(r0, r1)
            boolean r0 = r9.A0N
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r10.A0N
            X.C627036g.A0S(r2, r1, r13, r0)
        L_0x09cb:
            java.lang.String r0 = "MediaDataV2.cachedDownloadedBytes"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x09ec
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r11)
            java.lang.String r0 = " Field: cachedDownloadedBytes."
            java.lang.String r13 = X.AnonymousClass000.A0X(r0, r1)
            long r0 = r9.A09
            java.lang.Long r14 = java.lang.Long.valueOf(r0)
            long r0 = r10.A09
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0Y(r14, r0, r13)
        L_0x09ec:
            java.lang.String r0 = "MediaDataV2.gifAttribution"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x0a09
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r11)
            java.lang.String r0 = " Field: gifAttribution."
            java.lang.String r13 = X.AnonymousClass000.A0X(r0, r1)
            int r0 = r9.A05
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r10.A05
            X.C627036g.A0R(r2, r1, r13, r0)
        L_0x0a09:
            java.lang.String r0 = "MediaDataV2.thumbnailHeightWidthRatio"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x0a42
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r11)
            java.lang.String r0 = " Field: thumbnailHeightWidthRatio."
            java.lang.String r13 = X.AnonymousClass000.A0X(r0, r1)
            float r1 = r9.A00
            float r0 = r10.A00
            r15 = 814313567(0x3089705f, float:1.0E-9)
            int r14 = java.lang.Float.compare(r1, r0)
            if (r14 == 0) goto L_0x0a42
            float r14 = r1 - r0
            float r14 = java.lang.Math.abs(r14)
            int r14 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r14 <= 0) goto L_0x0a42
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2.A0Z(r1, r0, r13)
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0L()
            throw r0
        L_0x0a42:
            java.lang.String r0 = "MediaDataV2.mediaJobUuid"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x0a5b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r11)
            java.lang.String r0 = " Field: mediaJobUuid."
            java.lang.String r13 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r1 = r9.A0I
            java.lang.String r0 = r10.A0I
            r2.A0c(r13, r1, r0)
        L_0x0a5b:
            java.lang.String r0 = "MediaDataV2.directPath"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x0a74
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r11)
            java.lang.String r0 = " Field: directPath."
            java.lang.String r13 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r1 = r9.A0G
            java.lang.String r0 = r10.A0G
            r2.A0c(r13, r1, r0)
        L_0x0a74:
            java.lang.String r0 = "MediaDataV2.interactiveAnnotations"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x0c88
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r11)
            java.lang.String r0 = " Field: interactiveAnnotations."
            java.lang.String r26 = X.AnonymousClass000.A0X(r0, r1)
            com.whatsapp.InteractiveAnnotation[] r0 = r9.A0X
            r25 = r0
            com.whatsapp.InteractiveAnnotation[] r0 = r10.A0X
            r24 = r0
            r1 = r25
            if (r1 == r0) goto L_0x0c88
            r0 = r26
            java.lang.String r1 = X.AnonymousClass000.A0T(r0, r12)
            r9 = 1
            r23 = 0
            boolean r0 = X.AnonymousClass000.A1W(r25)
            r2.A0e(r1, r0)
            r0 = r26
            java.lang.String r1 = X.AnonymousClass000.A0T(r0, r8)
            if (r24 != 0) goto L_0x0aab
            r9 = 0
        L_0x0aab:
            java.lang.StringBuilder r1 = X.C627036g.A06(r2, r1, r0, r9)
            java.lang.String r22 = " Field: length."
            r0 = r22
            java.lang.String r9 = X.AnonymousClass000.A0X(r0, r1)
            r0 = r25
            int r0 = r0.length
            r36 = r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r36)
            r0 = r24
            int r0 = r0.length
            X.C627036g.A0R(r2, r1, r9, r0)
        L_0x0ac6:
            r1 = r36
            r0 = r23
            if (r0 >= r1) goto L_0x0c88
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r26)
            java.lang.String r21 = " Field: value["
            r0 = r21
            r1.append(r0)
            r0 = r23
            r1.append(r0)
            java.lang.String r20 = "]."
            r0 = r20
            java.lang.String r13 = X.AnonymousClass000.A0X(r0, r1)
            r19 = r25[r23]
            r11 = r24[r23]
            r0 = r19
            if (r0 == r11) goto L_0x0c84
            java.lang.String r10 = X.AnonymousClass000.A0T(r13, r12)
            r9 = 1
            r1 = 0
            boolean r0 = X.AnonymousClass000.A1W(r19)
            r2.A0e(r10, r0)
            java.lang.String r0 = X.AnonymousClass000.A0T(r13, r8)
            if (r11 != 0) goto L_0x0b00
            r9 = 0
        L_0x0b00:
            r2.A0e(r0, r9)
            r0 = r19
            java.lang.Object r10 = r0.data
            boolean r9 = r10 instanceof X.C53042mS
            java.lang.String r0 = " Field: data."
            if (r9 == 0) goto L_0x0c0b
            java.lang.Object r9 = r11.data
            boolean r14 = r9 instanceof X.C53042mS
            if (r14 == 0) goto L_0x0c0b
            java.lang.String r1 = X.AnonymousClass000.A0T(r13, r0)
            X.2mS r10 = (X.C53042mS) r10
            X.2mS r9 = (X.C53042mS) r9
            if (r10 == r9) goto L_0x0b67
            java.lang.String r0 = X.AnonymousClass000.A0T(r1, r12)
            r15 = 1
            boolean r14 = X.AnonymousClass000.A1W(r10)
            r2.A0e(r0, r14)
            java.lang.String r0 = X.AnonymousClass000.A0T(r1, r8)
            if (r9 != 0) goto L_0x0b30
            r15 = 0
        L_0x0b30:
            java.lang.StringBuilder r14 = X.C627036g.A06(r2, r0, r1, r15)
            java.lang.String r0 = " Field: newsletterJid."
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r14)
            X.4uY r15 = r10.A01
            X.4uY r14 = r9.A01
            java.lang.StringBuilder r14 = X.C627036g.A05(r2, r15, r14, r0, r1)
            java.lang.String r0 = " Field: longitude."
            java.lang.String r18 = X.AnonymousClass000.A0X(r0, r14)
            int r0 = r10.A00
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
            int r0 = r9.A00
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
            r0 = r18
            java.lang.StringBuilder r1 = X.C627036g.A05(r2, r15, r14, r0, r1)
            java.lang.String r0 = " Field: name."
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r10 = r10.A03
            java.lang.String r0 = r9.A03
            r2.A0Y(r10, r0, r1)
        L_0x0b67:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r13)
            java.lang.String r0 = " Field: polygonVertices."
            java.lang.String r13 = X.AnonymousClass000.A0X(r0, r1)
            r0 = r19
            com.whatsapp.SerializablePoint[] r0 = r0.polygonVertices
            r19 = r0
            com.whatsapp.SerializablePoint[] r11 = r11.polygonVertices
            if (r0 == r11) goto L_0x0c84
            java.lang.String r10 = X.AnonymousClass000.A0T(r13, r12)
            r1 = 1
            r9 = 0
            boolean r0 = X.AnonymousClass000.A1W(r19)
            r2.A0e(r10, r0)
            java.lang.String r0 = X.AnonymousClass000.A0T(r13, r8)
            if (r11 != 0) goto L_0x0b8f
            r1 = 0
        L_0x0b8f:
            r2.A0e(r0, r1)
            r0 = r22
            java.lang.String r1 = X.AnonymousClass000.A0T(r13, r0)
            r0 = r19
            int r0 = r0.length
            r35 = r0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r35)
            int r0 = r11.length
            X.C627036g.A0R(r2, r10, r1, r0)
        L_0x0ba5:
            r0 = r35
            if (r9 >= r0) goto L_0x0c84
            r0 = r21
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r13, r0)
            r1.append(r9)
            r0 = r20
            java.lang.String r14 = X.AnonymousClass000.A0X(r0, r1)
            r15 = r19[r9]
            r10 = r11[r9]
            if (r15 == r10) goto L_0x0c08
            java.lang.String r1 = X.AnonymousClass000.A0T(r14, r12)
            r18 = 1
            boolean r0 = X.AnonymousClass000.A1W(r15)
            r2.A0e(r1, r0)
            java.lang.String r0 = X.AnonymousClass000.A0T(r14, r8)
            if (r10 != 0) goto L_0x0bd3
            r18 = 0
        L_0x0bd3:
            r1 = r0
            r0 = r18
            java.lang.StringBuilder r18 = X.C627036g.A06(r2, r1, r14, r0)
            java.lang.String r0 = " Field: x."
            r1 = r0
            r0 = r18
            java.lang.String r28 = X.AnonymousClass000.A0X(r1, r0)
            double r0 = r15.x
            r31 = r0
            double r0 = r10.x
            r27 = r2
            r29 = r31
            r31 = r0
            r27.A0b(r28, r29, r31)
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r14)
            java.lang.String r1 = " Field: y."
            java.lang.String r28 = X.AnonymousClass000.A0X(r1, r0)
            double r0 = r15.y
            r14 = r0
            double r0 = r10.y
            r29 = r14
            r31 = r0
            r27.A0b(r28, r29, r31)
        L_0x0c08:
            int r9 = r9 + 1
            goto L_0x0ba5
        L_0x0c0b:
            boolean r9 = r10 instanceof com.whatsapp.SerializableLocation
            if (r9 == 0) goto L_0x0c75
            java.lang.Object r9 = r11.data
            boolean r14 = r9 instanceof com.whatsapp.SerializableLocation
            if (r14 == 0) goto L_0x0c75
            java.lang.String r14 = X.AnonymousClass000.A0T(r13, r0)
            com.whatsapp.SerializableLocation r10 = (com.whatsapp.SerializableLocation) r10
            com.whatsapp.SerializableLocation r9 = (com.whatsapp.SerializableLocation) r9
            if (r10 == r9) goto L_0x0b67
            java.lang.String r0 = X.AnonymousClass000.A0T(r14, r12)
            r15 = 1
            boolean r1 = X.AnonymousClass000.A1W(r10)
            r2.A0e(r0, r1)
            java.lang.String r0 = X.AnonymousClass000.A0T(r14, r8)
            if (r9 != 0) goto L_0x0c32
            r15 = 0
        L_0x0c32:
            java.lang.StringBuilder r1 = X.C627036g.A06(r2, r0, r14, r15)
            java.lang.String r0 = " Field: latitude."
            java.lang.String r28 = X.AnonymousClass000.A0X(r0, r1)
            double r0 = r10.latitude
            r31 = r0
            double r0 = r9.latitude
            r27 = r2
            r29 = r31
            r31 = r0
            r27.A0b(r28, r29, r31)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r14)
            java.lang.String r0 = " Field: longitude."
            java.lang.String r28 = X.AnonymousClass000.A0X(r0, r1)
            double r0 = r10.longitude
            r31 = r0
            double r0 = r9.longitude
            r29 = r31
            r31 = r0
            r27.A0b(r28, r29, r31)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r14)
            java.lang.String r0 = " Field: name."
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r10 = r10.name
            java.lang.String r0 = r9.name
            r2.A0c(r1, r10, r0)
            goto L_0x0b67
        L_0x0c75:
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0l(r13)
            java.lang.String r0 = " Different classes"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r9)
            r2.A0e(r0, r1)
            goto L_0x0b67
        L_0x0c84:
            int r23 = r23 + 1
            goto L_0x0ac6
        L_0x0c88:
            boolean r0 = r5 instanceof X.C30721mu
            if (r0 == 0) goto L_0x0cdf
            boolean r0 = r6 instanceof X.C30721mu
            if (r0 == 0) goto L_0x0cdf
            r0 = r37
            X.2G6 r2 = r0.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r7)
            java.lang.String r0 = " Field: audioData."
            java.lang.String r11 = X.AnonymousClass000.A0X(r0, r1)
            r0 = r5
            X.1nC r0 = (X.C30811nC) r0
            X.2xx r10 = r0.A00
            r0 = r6
            X.1nC r0 = (X.C30811nC) r0
            X.2xx r9 = r0.A00
            if (r10 == r9) goto L_0x0cdf
            X.36g r8 = r2.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r11)
            java.lang.String r0 = " expected value is null."
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            r2 = 1
            boolean r0 = X.AnonymousClass000.A1W(r10)
            java.lang.StringBuilder r1 = X.C627036g.A06(r8, r1, r11, r0)
            java.lang.String r0 = " actual value is null."
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            if (r9 != 0) goto L_0x0cc8
            r2 = 0
        L_0x0cc8:
            java.lang.StringBuilder r1 = X.C627036g.A06(r8, r0, r11, r2)
            java.lang.String r0 = " Field: waveform."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            X.C626936e.A06(r10)
            byte[] r1 = r10.A02
            X.C626936e.A06(r9)
            byte[] r0 = r9.A02
            r8.A0f(r2, r1, r0)
        L_0x0cdf:
            boolean r0 = r5 instanceof X.AnonymousClass4FG
            if (r0 == 0) goto L_0x0d25
            boolean r0 = r6 instanceof X.AnonymousClass4FG
            if (r0 == 0) goto L_0x0d25
            java.util.HashSet r10 = X.AnonymousClass0x9.A15(r3)
            java.lang.String r0 = "templateButtons"
            r10.add(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r7)
            java.lang.String r0 = " Field: templateInfo."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            r9 = r5
            X.4FG r9 = (X.AnonymousClass4FG) r9
            X.2cm r1 = r9.BDY()
            r8 = r6
            X.4FG r8 = (X.AnonymousClass4FG) r8
            X.2cm r0 = r8.BDY()
            r4.A0a(r1, r0, r2, r10)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r7)
            java.lang.String r0 = " Field: templateInfo.templateButtons"
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            X.2cm r0 = r9.BDY()
            java.util.List r1 = r0.A06
            X.2cm r0 = r8.BDY()
            java.util.List r0 = r0.A06
            r4.A0d(r2, r1, r0, r3)
        L_0x0d25:
            if (r16 == 0) goto L_0x0d7f
            r0 = r5
            X.1p2 r0 = (X.C31901p2) r0
            X.39N r9 = r0.A00
            r0 = r6
            X.1p2 r0 = (X.C31901p2) r0
            X.39N r8 = r0.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r7)
            java.lang.String r0 = " contentExpected value is null."
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            boolean r0 = X.AnonymousClass000.A1W(r9)
            java.lang.StringBuilder r1 = X.C627036g.A06(r4, r1, r7, r0)
            java.lang.String r0 = " contentActual value is null."
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            if (r8 != 0) goto L_0x0d4d
            r17 = 0
        L_0x0d4d:
            r0 = r17
            r4.A0e(r1, r0)
            int r0 = r9.A05
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r0 = r8.A05
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "multi element response type"
            r4.A0Y(r2, r1, r0)
            java.lang.String r1 = r9.A04
            java.lang.String r0 = r8.A04
            java.lang.String r2 = "multi element response value"
            r4.A0Y(r1, r0, r2)
            java.lang.String r1 = r9.A02
            java.lang.String r0 = r8.A02
            r4.A0Y(r1, r0, r2)
            X.22W r2 = r9.A00
            X.22W r1 = r8.A00
            java.lang.String r0 = "multi element response body format"
            r4.A0Y(r2, r1, r0)
        L_0x0d7f:
            boolean r0 = r5 instanceof X.C31911p3
            if (r0 == 0) goto L_0x0d9f
            r9 = r5
            X.1p3 r9 = (X.C31911p3) r9
            java.lang.String r2 = r9.A00
            r8 = r6
            X.1p3 r8 = (X.C31911p3) r8
            java.lang.String r1 = r8.A00
            java.lang.String r0 = "Button response id"
            r4.A0Y(r2, r1, r0)
            java.lang.String r2 = r9.A13()
            java.lang.String r1 = r8.A13()
            java.lang.String r0 = "Button response value"
            r4.A0Y(r2, r1, r0)
        L_0x0d9f:
            boolean r0 = r5 instanceof X.C31711oj
            java.lang.String r10 = " Field: inviteUsed."
            java.lang.String r9 = " Field: paymentService."
            if (r0 == 0) goto L_0x0dcf
            boolean r0 = r6 instanceof X.C31711oj
            if (r0 == 0) goto L_0x0dcf
            java.lang.String r2 = X.AnonymousClass000.A0T(r7, r9)
            r11 = r5
            X.1o4 r11 = (X.C31301o4) r11
            int r0 = r11.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r8 = r6
            X.1o4 r8 = (X.C31301o4) r8
            int r0 = r8.A00
            X.C627036g.A0R(r4, r1, r2, r0)
            java.lang.String r2 = X.AnonymousClass000.A0T(r7, r10)
            boolean r0 = r11.A01
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r8.A01
            X.C627036g.A0S(r4, r1, r2, r0)
        L_0x0dcf:
            boolean r0 = r5 instanceof X.C31691oh
            if (r0 == 0) goto L_0x0dfb
            boolean r0 = r6 instanceof X.C31691oh
            if (r0 == 0) goto L_0x0dfb
            java.lang.String r2 = X.AnonymousClass000.A0T(r7, r9)
            r9 = r5
            X.1o4 r9 = (X.C31301o4) r9
            int r0 = r9.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r8 = r6
            X.1o4 r8 = (X.C31301o4) r8
            int r0 = r8.A00
            X.C627036g.A0R(r4, r1, r2, r0)
            java.lang.String r2 = X.AnonymousClass000.A0T(r7, r10)
            boolean r0 = r9.A01
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r8.A01
            X.C627036g.A0S(r4, r1, r2, r0)
        L_0x0dfb:
            boolean r0 = r5 instanceof X.C31211nv
            if (r0 == 0) goto L_0x0e22
            boolean r0 = r6 instanceof X.C31211nv
            if (r0 == 0) goto L_0x0e22
            java.lang.String r0 = "businessStateId"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x0e22
            r0 = r5
            X.1nv r0 = (X.C31211nv) r0
            int r0 = r0.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r0 = r6
            X.1nv r0 = (X.C31211nv) r0
            int r0 = r0.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "Business state id"
            r4.A0Y(r2, r1, r0)
        L_0x0e22:
            boolean r0 = r5 instanceof X.AnonymousClass1nW
            if (r0 == 0) goto L_0x0e6d
            boolean r0 = r6 instanceof X.AnonymousClass1nW
            if (r0 == 0) goto L_0x0e6d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r7)
            java.lang.String r0 = " Field: scheduledTimeStampMs."
            java.lang.String r9 = X.AnonymousClass000.A0X(r0, r1)
            r8 = r5
            X.1mX r8 = (X.C30491mX) r8
            long r0 = r8.A01
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            r3 = r6
            X.1mX r3 = (X.C30491mX) r3
            long r0 = r3.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.StringBuilder r1 = X.C627036g.A05(r4, r2, r0, r9, r7)
            java.lang.String r0 = " Field: callType."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            int r0 = r8.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r3.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.StringBuilder r1 = X.C627036g.A05(r4, r1, r0, r2, r7)
            java.lang.String r0 = " Field: title."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r1 = r8.A02
            java.lang.String r0 = r3.A02
            r4.A0Y(r1, r0, r2)
        L_0x0e6d:
            boolean r0 = r5 instanceof X.C31311o5
            if (r0 == 0) goto L_0x0eb8
            boolean r0 = r6 instanceof X.C31311o5
            if (r0 == 0) goto L_0x0eb8
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r7)
            java.lang.String r0 = " Field: creationMessageRowID."
            java.lang.String r9 = X.AnonymousClass000.A0X(r0, r1)
            r8 = r5
            X.1o5 r8 = (X.C31311o5) r8
            long r0 = r8.A01
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            r3 = r6
            X.1o5 r3 = (X.C31311o5) r3
            long r0 = r3.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.StringBuilder r1 = X.C627036g.A05(r4, r2, r0, r9, r7)
            java.lang.String r0 = " Field: callTimestampMs."
            java.lang.String r9 = X.AnonymousClass000.A0X(r0, r1)
            long r0 = r8.A00
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            long r0 = r3.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.StringBuilder r1 = X.C627036g.A05(r4, r2, r0, r9, r7)
            java.lang.String r0 = " Field: callTitle."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r1 = r8.A02
            java.lang.String r0 = r3.A02
            r4.A0Y(r1, r0, r2)
        L_0x0eb8:
            boolean r0 = r5 instanceof X.C31231nx
            java.lang.String r3 = " Field: originalMessageRowID."
            if (r0 == 0) goto L_0x0f03
            boolean r0 = r6 instanceof X.C31231nx
            if (r0 == 0) goto L_0x0f03
            java.lang.String r10 = X.AnonymousClass000.A0T(r7, r3)
            r8 = r5
            X.1nx r8 = (X.C31231nx) r8
            long r0 = r8.A00
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            r9 = r6
            X.1nx r9 = (X.C31231nx) r9
            long r0 = r9.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.StringBuilder r1 = X.C627036g.A05(r4, r2, r0, r10, r7)
            java.lang.String r0 = " Field: reminderTimestampMs."
            java.lang.String r10 = X.AnonymousClass000.A0X(r0, r1)
            long r0 = r8.A01
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            long r0 = r9.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.StringBuilder r1 = X.C627036g.A05(r4, r2, r0, r10, r7)
            java.lang.String r0 = " Field: reminderContent."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r1 = r8.A02
            if (r1 == 0) goto L_0x1055
            java.lang.String r0 = r9.A02
            if (r0 == 0) goto L_0x104d
            r4.A0Y(r1, r0, r2)
        L_0x0f03:
            boolean r0 = r5 instanceof X.C31221nw
            if (r0 == 0) goto L_0x0f36
            boolean r0 = r6 instanceof X.C31221nw
            if (r0 == 0) goto L_0x0f36
            java.lang.String r9 = X.AnonymousClass000.A0T(r7, r3)
            r8 = r5
            X.1nw r8 = (X.C31221nw) r8
            long r0 = r8.A00
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            r3 = r6
            X.1nw r3 = (X.C31221nw) r3
            long r0 = r3.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.StringBuilder r1 = X.C627036g.A05(r4, r2, r0, r9, r7)
            java.lang.String r0 = " Field: originalReminderContent."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r1 = r8.A01
            if (r1 == 0) goto L_0x1045
            java.lang.String r0 = r3.A01
            if (r0 == 0) goto L_0x103d
            r4.A0Y(r1, r0, r2)
        L_0x0f36:
            boolean r0 = r5 instanceof X.C30401mO
            if (r0 == 0) goto L_0x0f55
            boolean r0 = r6 instanceof X.C30401mO
            if (r0 == 0) goto L_0x0f55
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r7)
            java.lang.String r0 = " Field: callLog."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            r0 = r5
            X.1mO r0 = (X.C30401mO) r0
            X.3ZF r1 = r0.A01
            r0 = r6
            X.1mO r0 = (X.C30401mO) r0
            X.3ZF r0 = r0.A01
            r4.A0Y(r1, r0, r2)
        L_0x0f55:
            boolean r0 = r5 instanceof X.C30231m7
            if (r0 == 0) goto L_0x0f74
            boolean r0 = r6 instanceof X.C30231m7
            if (r0 == 0) goto L_0x0f74
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r7)
            java.lang.String r0 = " Field: BCall."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            r0 = r5
            X.1m7 r0 = (X.C30231m7) r0
            X.2h1 r1 = r0.A00
            r0 = r6
            X.1m7 r0 = (X.C30231m7) r0
            X.2h1 r0 = r0.A00
            r4.A0Y(r1, r0, r2)
        L_0x0f74:
            X.2Hu r3 = r5.A0x()
            X.2Hu r2 = r6.A0x()
            java.lang.String r1 = "Message Decorator"
            r0 = r37
            X.2G9 r0 = r0.A05
            if (r3 == r2) goto L_0x105d
            X.36g r7 = r0.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r1)
            java.lang.String r0 = " messageButtons null check."
            r1.append(r0)
            r1.toString()
            X.2Ot r4 = r3.A00
            X.2Ot r3 = r2.A00
            java.lang.String r6 = "Message buttons info"
            if (r4 == r3) goto L_0x105d
            java.lang.String r1 = X.AnonymousClass000.A0T(r6, r0)
            r8 = 1
            r5 = 0
            if (r4 == 0) goto L_0x0fa5
            r0 = 1
            if (r3 != 0) goto L_0x0fa6
        L_0x0fa5:
            r0 = 0
        L_0x0fa6:
            java.lang.StringBuilder r1 = X.C627036g.A06(r7, r1, r6, r0)
            java.lang.String r0 = " Field: content."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r1 = r4.A00
            java.lang.String r0 = r3.A00
            java.lang.StringBuilder r1 = X.C627036g.A05(r7, r1, r0, r2, r6)
            java.lang.String r0 = " Field: footer."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r1 = r4.A01
            java.lang.String r0 = r3.A01
            r7.A0Y(r1, r0, r2)
            java.util.List r4 = r4.A02
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r6)
            java.lang.String r0 = " messageButtons buttons size check."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            int r1 = r4.size()
            java.util.List r3 = r3.A02
            int r0 = r3.size()
            if (r1 == r0) goto L_0x0fde
            r8 = 0
        L_0x0fde:
            r7.A0e(r2, r8)
        L_0x0fe1:
            int r0 = r3.size()
            if (r5 >= r0) goto L_0x105d
            java.lang.Object r9 = r4.get(r5)
            X.2bn r9 = (X.C46532bn) r9
            java.lang.Object r8 = r3.get(r5)
            X.2bn r8 = (X.C46532bn) r8
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r6)
            java.lang.String r0 = " Field: id."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r1 = r9.A04
            java.lang.String r0 = r8.A04
            java.lang.StringBuilder r1 = X.C627036g.A05(r7, r1, r0, r2, r6)
            java.lang.String r0 = " Field: displayText."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r1 = r9.A03
            java.lang.String r0 = r8.A03
            java.lang.StringBuilder r1 = X.C627036g.A05(r7, r1, r0, r2, r6)
            java.lang.String r0 = " Field: selected."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            boolean r0 = r9.A00
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r8.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.StringBuilder r1 = X.C627036g.A05(r7, r1, r0, r2, r6)
            java.lang.String r0 = " Field: type."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            int r0 = r9.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r8.A01
            X.C627036g.A0R(r7, r1, r2, r0)
            int r5 = r5 + 1
            goto L_0x0fe1
        L_0x103d:
            java.lang.String r0 = "originalReminderContent"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x1045:
            java.lang.String r0 = "originalReminderContent"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x104d:
            java.lang.String r0 = "reminderContent"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x1055:
            java.lang.String r0 = "reminderContent"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x105d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66373Lc.A00(X.34x, X.34x, java.lang.String):void");
    }

    public C66373Lc(AnonymousClass26F r3) {
        C627036g r1 = new C627036g(r3);
        this.A00 = r1;
        this.A04 = new AnonymousClass2G8(r1);
        this.A03 = new AnonymousClass2WD(r1);
        this.A02 = new AnonymousClass2G7(r1);
        this.A06 = new AnonymousClass2GA(r1);
        this.A05 = new AnonymousClass2G9(r1);
        this.A01 = new AnonymousClass2G6(r1);
    }
}
