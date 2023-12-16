package X;

/* renamed from: X.7O0  reason: invalid class name */
public final class AnonymousClass7O0 {
    public String A00;
    public final C141576vn A01;
    public final C141586vo A02;
    public final C141816wB A03;
    public final String A04;

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008f, code lost:
        if (r2.equals("close") != false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0093, code lost:
        if (r16 == false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0095, code lost:
        r1 = X.C141816wB.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00db, code lost:
        if (r2.equals("back") == false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x010f, code lost:
        if (r0 == null) goto L_0x004c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass7O0(X.C152677Zw r13, java.lang.String r14, java.util.Map r15, boolean r16) {
        /*
            r12 = this;
            r9 = 1
            r12.<init>()
            r5 = 0
            if (r15 == 0) goto L_0x0135
            java.lang.String r0 = "style"
            java.lang.Object r1 = r15.get(r0)
        L_0x000d:
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L_0x0132
            java.util.Map r1 = (java.util.Map) r1
        L_0x0013:
            java.lang.String r6 = "on_back_params"
            java.lang.String r4 = "modal_type"
            java.lang.String r3 = "on_back"
            java.lang.String r2 = "button_style"
            java.lang.String r8 = "type"
            if (r1 == 0) goto L_0x0116
            java.util.LinkedHashMap r7 = X.C18320x8.A0r()
            java.lang.Object r0 = r1.get(r8)
            r7.put(r8, r0)
            java.lang.Object r0 = r1.get(r4)
            r7.put(r4, r0)
            java.lang.String r0 = "leading_button_config"
            java.lang.Object r11 = r1.get(r0)
            boolean r0 = r11 instanceof java.util.Map
            r10 = 0
            if (r0 == 0) goto L_0x0113
            r0 = r11
            java.util.Map r0 = (java.util.Map) r0
        L_0x003f:
            if (r11 == 0) goto L_0x010f
            if (r0 != 0) goto L_0x0059
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FcsStateMachine/extractPresentationStyle/unexpected format for presentation.style.leading_button_config: "
            X.C18260x0.A1Q(r1, r0, r11)
        L_0x004c:
            r0 = 2
            X.3Z6[] r0 = new X.AnonymousClass3Z6[r0]
            X.AnonymousClass3Z6.A04(r2, r10, r0)
            X.AnonymousClass3Z6.A09(r3, r10, r0, r9)
            java.util.Map r0 = X.C73813g7.A0F(r0)
        L_0x0059:
            r7.putAll(r0)
        L_0x005c:
            if (r16 == 0) goto L_0x00fb
            X.6vo r9 = X.C141586vo.MODAL
        L_0x0060:
            r12.A02 = r9
            X.6vo r8 = X.C141586vo.MODAL
            if (r9 != r8) goto L_0x00f8
            if (r16 == 0) goto L_0x00e4
            if (r13 == 0) goto L_0x00e1
            X.7Zx r0 = r13.A05
            X.6vn r0 = r0.A00
        L_0x006e:
            r12.A01 = r0
            java.lang.String r2 = X.C18310x6.A0o(r2, r7)
            if (r2 == 0) goto L_0x0091
            int r1 = r2.hashCode()
            r0 = 3015911(0x2e04e7, float:4.226191E-39)
            if (r1 == r0) goto L_0x00d5
            r0 = 3387192(0x33af38, float:4.746467E-39)
            if (r1 == r0) goto L_0x00ca
            r0 = 94756344(0x5a5ddf8, float:1.5598064E-35)
            if (r1 != r0) goto L_0x0091
            java.lang.String r0 = "close"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0095
        L_0x0091:
            if (r9 != r8) goto L_0x00de
            if (r16 != 0) goto L_0x00de
        L_0x0095:
            X.6wB r1 = X.C141816wB.CLOSE
        L_0x0097:
            r12.A03 = r1
            X.6wB r0 = X.C141816wB.BACK
            if (r1 != r0) goto L_0x00ad
            java.lang.String r2 = X.C18310x6.A0o(r3, r7)
            if (r2 == 0) goto L_0x00ad
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r14)
            r0 = 58
            java.lang.String r5 = X.AnonymousClass0x2.A0e(r2, r1, r0)
        L_0x00ad:
            r12.A04 = r5
            java.lang.Object r1 = r7.get(r6)
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L_0x00c9
            boolean r0 = r1 instanceof X.C834348j
            if (r0 == 0) goto L_0x00bf
            boolean r0 = r1 instanceof X.AnonymousClass4GZ
            if (r0 == 0) goto L_0x00c9
        L_0x00bf:
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L_0x00c9
            java.lang.String r0 = X.C18280x3.A0d(r1)
            r12.A00 = r0
        L_0x00c9:
            return
        L_0x00ca:
            java.lang.String r0 = "none"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0091
            X.6wB r1 = X.C141816wB.NONE
            goto L_0x0097
        L_0x00d5:
            java.lang.String r0 = "back"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00de
            goto L_0x0091
        L_0x00de:
            X.6wB r1 = X.C141816wB.BACK
            goto L_0x0097
        L_0x00e1:
            X.6vn r0 = X.C141576vn.FULL_SCREEN
            goto L_0x006e
        L_0x00e4:
            java.lang.Object r1 = r7.get(r4)
            java.lang.String r0 = "bottom_sheet"
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x00f4
            X.6vn r0 = X.C141576vn.BOTTOM_SHEET
            goto L_0x006e
        L_0x00f4:
            X.6vn r0 = X.C141576vn.FULL_SCREEN
            goto L_0x006e
        L_0x00f8:
            r0 = r5
            goto L_0x006e
        L_0x00fb:
            java.lang.Object r1 = r7.get(r8)
            java.lang.String r0 = "modal"
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x010b
            X.6vo r9 = X.C141586vo.MODAL
            goto L_0x0060
        L_0x010b:
            X.6vo r9 = X.C141586vo.PUSH
            goto L_0x0060
        L_0x010f:
            if (r0 != 0) goto L_0x0059
            goto L_0x004c
        L_0x0113:
            r0 = r10
            goto L_0x003f
        L_0x0116:
            r0 = 5
            X.3Z6[] r1 = new X.AnonymousClass3Z6[r0]
            r0 = 0
            X.AnonymousClass3Z6.A09(r8, r5, r1, r0)
            X.AnonymousClass3Z6.A09(r2, r5, r1, r9)
            r0 = 2
            X.AnonymousClass3Z6.A09(r3, r5, r1, r0)
            r0 = 3
            X.AnonymousClass3Z6.A09(r4, r5, r1, r0)
            r0 = 4
            X.AnonymousClass3Z6.A09(r6, r5, r1, r0)
            java.util.Map r7 = X.C73813g7.A0F(r1)
            goto L_0x005c
        L_0x0132:
            r1 = r5
            goto L_0x0013
        L_0x0135:
            r1 = r5
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7O0.<init>(X.7Zw, java.lang.String, java.util.Map, boolean):void");
    }
}
