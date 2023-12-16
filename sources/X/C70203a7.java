package X;

/* renamed from: X.3a7  reason: invalid class name and case insensitive filesystem */
public class C70203a7 implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public C70203a7(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public static void A00(AnonymousClass4FS r1, Object obj, Object obj2, int i) {
        r1.BkM(new C70203a7(obj, i, obj2));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: X.4mM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v92, resolved type: X.1W9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v93, resolved type: X.1W8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: X.3Tu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v21, resolved type: X.2pi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v51, resolved type: X.2xQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v57, resolved type: X.2ch} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v24, resolved type: X.4mM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v130, resolved type: X.1W9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v131, resolved type: X.1W9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v25, resolved type: X.4mM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: X.4mM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: X.3ZH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v60, resolved type: X.2xQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v61, resolved type: X.2xQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v62, resolved type: X.2xQ} */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0331, code lost:
        r3.A01(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0334, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00c4, code lost:
        if (r5.A06 != -1) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03bc, code lost:
        if (r1 == 2) goto L_0x03be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00cb, code lost:
        if (r5.A06 == 0) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x045b, code lost:
        r1 = new X.C70203a7(r6, r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0460, code lost:
        r5.A0S(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0463, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x05c8, code lost:
        X.C53412n3.A00(r1, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x05cb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0747, code lost:
        r0.remove(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x074a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x011a, code lost:
        if (X.C155477ey.A00(r2) == false) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0071, code lost:
        r1 = new X.C69973Zj(r3, r0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r16 = this;
            r2 = r16
            int r0 = r2.A02
            switch(r0) {
                case 0: goto L_0x0464;
                case 1: goto L_0x0472;
                case 2: goto L_0x0482;
                case 3: goto L_0x048e;
                case 4: goto L_0x049e;
                case 5: goto L_0x04ac;
                case 6: goto L_0x0015;
                case 7: goto L_0x0007;
                case 8: goto L_0x0007;
                case 9: goto L_0x0007;
                case 10: goto L_0x04bc;
                case 11: goto L_0x04cc;
                case 12: goto L_0x002d;
                case 13: goto L_0x0516;
                case 14: goto L_0x0528;
                case 15: goto L_0x0045;
                case 16: goto L_0x005e;
                case 17: goto L_0x00ad;
                case 18: goto L_0x0536;
                case 19: goto L_0x00f8;
                case 20: goto L_0x054d;
                case 21: goto L_0x0562;
                case 22: goto L_0x05a9;
                case 23: goto L_0x05bc;
                case 24: goto L_0x0078;
                case 25: goto L_0x024c;
                case 26: goto L_0x0285;
                case 27: goto L_0x05cc;
                case 28: goto L_0x05f8;
                case 29: goto L_0x0617;
                case 30: goto L_0x0675;
                case 31: goto L_0x0703;
                case 32: goto L_0x074b;
                case 33: goto L_0x07b8;
                case 34: goto L_0x07cd;
                case 35: goto L_0x07e6;
                case 36: goto L_0x0817;
                case 37: goto L_0x0826;
                case 38: goto L_0x0834;
                case 39: goto L_0x0874;
                case 40: goto L_0x02c3;
                case 41: goto L_0x009f;
                case 42: goto L_0x02d9;
                case 43: goto L_0x0349;
                case 44: goto L_0x03a5;
                case 45: goto L_0x0886;
                case 46: goto L_0x03d5;
                case 47: goto L_0x0892;
                case 48: goto L_0x08ad;
                case 49: goto L_0x043f;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r2.A00
            X.2rx r0 = (X.C56422rx) r0
            java.lang.Object r1 = r2.A01
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.1in r0 = r0.A05
            r0.A0A(r1)
        L_0x0014:
            return
        L_0x0015:
            java.lang.Object r3 = r2.A00
            X.5Xd r3 = (X.C105975Xd) r3
            java.lang.Object r2 = r2.A01
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            X.3Gp r1 = r3.A02
            r0 = 0
            r1.A0M(r2, r0)
            X.3Wi r5 = r3.A00
            r0 = 47
            X.3Zi r1 = X.C69963Zi.A00(r3, r0)
            goto L_0x0460
        L_0x002d:
            java.lang.Object r3 = r2.A00
            X.2ch r3 = (X.C47092ch) r3
            java.lang.Object r2 = r2.A01
            X.3ZH r2 = (X.AnonymousClass3ZH) r2
            X.3Ex r1 = r3.A01
            X.1fH r0 = r3.A06
            r1.A0Q(r2, r0)
            X.3Cq r0 = r3.A05
            r0.A08()
            X.3Wi r5 = r3.A00
            r0 = 6
            goto L_0x0071
        L_0x0045:
            java.lang.Object r3 = r2.A00
            X.2xQ r3 = (X.C59752xQ) r3
            java.lang.Object r0 = r2.A01
            X.3Ex r1 = r3.A02
            java.util.List r0 = X.C18290x4.A12(r0)
            r1.A0c(r0)
            X.3Cq r0 = r3.A08
            r0.A08()
            X.3Wi r5 = r3.A00
            r0 = 9
            goto L_0x0071
        L_0x005e:
            java.lang.Object r3 = r2.A00
            X.2xQ r3 = (X.C59752xQ) r3
            java.lang.Object r2 = r2.A01
            java.util.Collection r2 = (java.util.Collection) r2
            X.3Gp r1 = r3.A01
            X.3d3 r0 = X.C72023d3.A00
            r1.A0L(r2, r0)
            X.3Wi r5 = r3.A00
            r0 = 8
        L_0x0071:
            X.3Zj r1 = new X.3Zj
            r1.<init>(r3, r0)
            goto L_0x0460
        L_0x0078:
            java.lang.Object r4 = r2.A00
            com.whatsapp.contact.picker.ContactPickerFragment r4 = (com.whatsapp.contact.picker.ContactPickerFragment) r4
            java.lang.Object r3 = r2.A01
            java.lang.Object[] r2 = X.AnonymousClass002.A0L()
            X.5ZU r1 = r4.A12
            X.3ZH r0 = r4.A1r
            X.C18290x4.A1K(r1, r0, r2)
            r1 = 2131891056(0x7f121370, float:1.9416821E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r4)
            java.lang.String r2 = r0.getString(r1, r2)
            X.3Wi r5 = r4.A0a
            r0 = 32
            X.5sN r1 = new X.5sN
            r1.<init>(r4, r3, r2, r0)
            goto L_0x0460
        L_0x009f:
            java.lang.Object r3 = r2.A00
            X.2nL r3 = (X.C53592nL) r3
            java.lang.Object r0 = r2.A01
            java.util.List r0 = (java.util.List) r0
            java.util.Set r1 = java.util.Collections.emptySet()
            goto L_0x0331
        L_0x00ad:
            java.lang.Object r4 = r2.A00
            X.2pi r4 = (X.C55052pi) r4
            java.lang.Object r6 = r2.A01
            X.4uZ r6 = (X.C95814uZ) r6
            X.3Ex r0 = r4.A04
            X.3ZH r5 = r0.A0A(r6)
            int r2 = r5.A05
            r8 = 1
            r1 = -1
            if (r2 != r1) goto L_0x00c6
            int r0 = r5.A06
            r3 = 1
            if (r0 == r1) goto L_0x00f6
        L_0x00c6:
            r3 = 0
            if (r2 != 0) goto L_0x00f6
            int r0 = r5.A06
            if (r0 != 0) goto L_0x00f6
        L_0x00cd:
            X.2ro r0 = r4.A06
            r0.A03(r5)
            r4.A00(r5, r1, r1)
            X.2aH r2 = r4.A0A
            java.lang.Class<X.4uZ> r0 = X.C95814uZ.class
            com.whatsapp.jid.Jid r1 = r5.A0I(r0)
            X.2jH r0 = r2.A01
            r0.A01(r1)
            X.2jH r0 = r2.A02
            r0.A01(r1)
            if (r3 != 0) goto L_0x0014
            X.3Wi r0 = r4.A02
            r7 = 9
            X.3cR r3 = new X.3cR
            r3.<init>(r4, r5, r6, r7, r8)
            r0.A0S(r3)
            return
        L_0x00f6:
            r8 = 0
            goto L_0x00cd
        L_0x00f8:
            java.lang.Object r6 = r2.A00
            X.2pi r6 = (X.C55052pi) r6
            java.lang.Object r9 = r2.A01
            X.2T0 r9 = (X.AnonymousClass2T0) r9
            X.3Ex r0 = r6.A04
            X.4uZ r2 = r9.A03
            X.3ZH r7 = r0.A0A(r2)
            X.5rC r1 = r6.A00
            boolean r0 = r1.A07()
            r12 = 1
            r13 = 0
            if (r0 == 0) goto L_0x011c
            r1.A04()
            boolean r0 = X.C155477ey.A00(r2)
            r15 = 1
            if (r0 != 0) goto L_0x011d
        L_0x011c:
            r15 = 0
        L_0x011d:
            int r11 = r9.A02
            r5 = 0
            if (r11 != r12) goto L_0x01ec
            byte[] r4 = r9.A00
        L_0x0124:
            r10 = 2
            if (r11 != r10) goto L_0x0129
            byte[] r5 = r9.A00
        L_0x0129:
            r6.A01(r7, r4, r5)
            int r2 = r7.A05
            java.lang.String r3 = " should be >= "
            if (r4 == 0) goto L_0x01ac
            int r2 = r9.A01
            r8 = r2
        L_0x0135:
            int r14 = r7.A06
            if (r5 == 0) goto L_0x0171
            r13 = r8
        L_0x013a:
            r6.A00(r7, r2, r13)
            X.2aH r0 = r6.A0A
            java.lang.Class<X.4uZ> r2 = X.C95814uZ.class
            com.whatsapp.jid.Jid r1 = r7.A0I(r2)
            if (r11 != r12) goto L_0x016e
            X.2jH r0 = r0.A01
        L_0x0149:
            r0.A01(r1)
            boolean r0 = r7.A0U()
            if (r0 == 0) goto L_0x0242
            if (r11 != r10) goto L_0x0242
            X.2rV r11 = r6.A09
            com.whatsapp.jid.Jid r2 = r7.A0I(r2)
            X.4uZ r2 = (X.C95814uZ) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "msgstore/last-photo-change/db/jid "
            X.C18260x0.A1P(r1, r0, r2)
            X.3dV r0 = r11.A06
            X.4GK r10 = r0.get()
            goto L_0x01ef
        L_0x016e:
            X.2jH r0 = r0.A02
            goto L_0x0149
        L_0x0171:
            if (r14 == r8) goto L_0x018c
            if (r8 >= r14) goto L_0x018e
            X.4uZ r0 = r7.A0H
            boolean r0 = r0 instanceof X.C95804uY
            if (r0 != 0) goto L_0x018e
            if (r15 != 0) goto L_0x018e
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ContactPhotoUpdater/writeProfilePhotoToDb received photo_thumb_id invalid, "
            r1.append(r0)
            r1.append(r8)
            X.C18260x0.A0x(r3, r1, r14)
        L_0x018c:
            r13 = r14
            goto L_0x013a
        L_0x018e:
            X.2ro r0 = r6.A06
            java.io.File r3 = r0.A01(r7)
            if (r3 == 0) goto L_0x013a
            boolean r0 = r3.exists()
            if (r0 == 0) goto L_0x013a
            boolean r0 = r3.delete()
            if (r0 != 0) goto L_0x013a
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ContactPhotoUpdater/writeProfilePhotoToDb failed to delete; file="
            X.C18260x0.A1Q(r1, r0, r3)
            goto L_0x013a
        L_0x01ac:
            int r8 = r9.A01
            if (r2 == r8) goto L_0x0135
            if (r8 >= r2) goto L_0x01cc
            X.4uZ r0 = r7.A0H
            boolean r0 = r0 instanceof X.C95804uY
            if (r0 != 0) goto L_0x01cc
            if (r15 != 0) goto L_0x01cc
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "received photo_full_id invalid, "
            r1.append(r0)
            r1.append(r8)
            X.C18260x0.A0x(r3, r1, r2)
            goto L_0x0135
        L_0x01cc:
            X.2ro r0 = r6.A06
            java.io.File r2 = r0.A00(r7)
            if (r2 == 0) goto L_0x01e9
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x01e9
            boolean r0 = r2.delete()
            if (r0 != 0) goto L_0x01e9
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "failed to delete; file="
            X.C18260x0.A1Q(r1, r0, r2)
        L_0x01e9:
            r2 = 0
            goto L_0x0135
        L_0x01ec:
            r4 = r5
            goto L_0x0124
        L_0x01ef:
            java.lang.String[] r3 = new java.lang.String[r12]     // Catch:{ all -> 0x08c5 }
            X.2sm r0 = r11.A01     // Catch:{ all -> 0x08c5 }
            X.C56922sm.A01(r0, r2, r3)     // Catch:{ all -> 0x08c5 }
            X.1VX r0 = r11.A07     // Catch:{ all -> 0x08c5 }
            boolean r0 = X.C56952sp.A0H(r0)     // Catch:{ all -> 0x08c5 }
            if (r0 == 0) goto L_0x0207
            java.lang.String r1 = X.C58122uk.A01     // Catch:{ all -> 0x08c5 }
        L_0x0200:
            java.lang.String r0 = "GET_LAST_PHOTO_CHANGE_MESSAGE_SQL"
            android.database.Cursor r3 = X.C56862sg.A03(r10, r1, r0, r3)     // Catch:{ all -> 0x08c5 }
            goto L_0x020a
        L_0x0207:
            java.lang.String r1 = X.C58122uk.A00     // Catch:{ all -> 0x08c5 }
            goto L_0x0200
        L_0x020a:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x08b9 }
            if (r0 == 0) goto L_0x0217
            X.2qz r0 = r11.A09     // Catch:{ all -> 0x08b9 }
            X.34x r2 = r0.A04(r3, r2)     // Catch:{ all -> 0x08b9 }
            goto L_0x0222
        L_0x0217:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x08b9 }
            java.lang.String r0 = "msgstore/last-photo-change/db no message for "
            X.C18260x0.A1R(r1, r0, r2)     // Catch:{ all -> 0x08b9 }
            r2 = 0
        L_0x0222:
            r3.close()     // Catch:{ all -> 0x08c5 }
            r10.close()
            X.1mI r2 = (X.C30341mI) r2
            boolean r0 = r2 instanceof X.C31331o7
            if (r0 == 0) goto L_0x0242
            r0 = r2
            X.1o7 r0 = (X.C31331o7) r0
            com.whatsapp.data.ProfilePhotoChange r1 = r0.A00
            if (r1 == 0) goto L_0x0242
            int r0 = r1.newPhotoId
            if (r0 != r8) goto L_0x0242
            byte[] r0 = r9.A00
            r1.newPhoto = r0
            X.3Lv r0 = r6.A08
            r0.A0Y(r2)
        L_0x0242:
            if (r4 != 0) goto L_0x0246
            if (r5 == 0) goto L_0x0014
        L_0x0246:
            X.3Wi r5 = r6.A02
            r0 = 18
            goto L_0x045b
        L_0x024c:
            java.lang.Object r6 = r2.A00
            com.whatsapp.contact.picker.ContactPickerFragment r6 = (com.whatsapp.contact.picker.ContactPickerFragment) r6
            java.lang.Object r5 = r2.A01
            X.2UJ r5 = (X.AnonymousClass2UJ) r5
            X.2dz r4 = r6.A0z
            com.whatsapp.jid.UserJid r3 = r5.A0D
            boolean r0 = r6.A2H(r3)
            if (r0 == 0) goto L_0x0282
            java.lang.String r2 = "ctwa"
        L_0x0260:
            r1 = 0
            X.2vg r0 = new X.2vg
            r0.<init>(r3, r2, r1)
            r4.A01(r0)
            com.whatsapp.jid.UserJid r1 = r5.A0D
            X.2rv r0 = r6.A2f
            int r3 = r0.A00(r1)
            r1 = 1
            r0 = 2
            if (r3 == r1) goto L_0x0277
            if (r3 != r0) goto L_0x0014
        L_0x0277:
            X.2Z2 r2 = r6.A2e
            r1 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A00(r0, r1, r3)
            return
        L_0x0282:
            java.lang.String r2 = "click_to_chat_link"
            goto L_0x0260
        L_0x0285:
            java.lang.Object r3 = r2.A00
            X.5PD r3 = (X.AnonymousClass5PD) r3
            java.lang.Object r0 = r2.A01
            java.util.Iterator r2 = X.C18320x8.A0q(r0)
        L_0x028f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r1 = r2.next()
            X.2z0 r1 = (X.AnonymousClass2z0) r1
            X.2qz r0 = r3.A0F
            X.34x r1 = r0.A05(r1)
            if (r1 == 0) goto L_0x028f
            boolean r0 = r1 instanceof X.AnonymousClass1n2
            if (r0 != 0) goto L_0x02af
            boolean r0 = r1 instanceof X.C31971pB
            if (r0 != 0) goto L_0x02af
            boolean r0 = r1 instanceof X.C31961pA
            if (r0 == 0) goto L_0x028f
        L_0x02af:
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x02bd
            boolean r0 = r3.A0N
            if (r0 != 0) goto L_0x02bd
            X.2mS r0 = r1.A0z()
            if (r0 == 0) goto L_0x028f
        L_0x02bd:
            X.108 r0 = r3.A0H
            r0.A0G(r1)
            goto L_0x028f
        L_0x02c3:
            java.lang.Object r6 = r2.A00
            X.3Tu r6 = (X.C68603Tu) r6
            java.lang.Object r7 = r2.A01
            X.3Gp r2 = r6.A01
            java.util.Set r1 = java.util.Collections.singleton(r7)
            r0 = 0
            r2.A0M(r1, r0)
            X.3Wi r5 = r6.A00
            r0 = 39
            goto L_0x045b
        L_0x02d9:
            java.lang.Object r3 = r2.A00
            X.2nL r3 = (X.C53592nL) r3
            java.lang.Object r5 = r2.A01
            java.util.Map r0 = r3.A00()
            X.8OQ r1 = X.AnonymousClass8OQ.copyOf((java.util.Map) r0)
            boolean r0 = r1.containsKey(r5)
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = "ContactDiscoveryLoggingHelper/logUserOpenChatEvent"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.2sH r0 = r3.A03
            long r6 = r0.A0H()
            java.lang.Object r0 = r1.get(r5)
            long r0 = X.C18310x6.A0B(r0)
            long r6 = X.C18280x3.A08(r6, r0)
            X.1VX r4 = r3.A04
            r0 = 1144(0x478, float:1.603E-42)
            X.2vE r2 = X.C58422vE.A02
            int r1 = r4.A0O(r2, r0)
            r0 = -1
            if (r1 == r0) goto L_0x0335
            X.2sr r0 = r3.A01
            boolean r0 = r0.A0Y()
            if (r0 != 0) goto L_0x0335
            X.1W8 r1 = new X.1W8
            r1.<init>()
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r1.A00 = r0
        L_0x0324:
            X.4FV r0 = r3.A05
            r0.BhD(r1)
        L_0x0329:
            java.util.List r0 = java.util.Collections.emptyList()
            java.util.Set r1 = java.util.Collections.singleton(r5)
        L_0x0331:
            r3.A01(r0, r1)
            return
        L_0x0335:
            r0 = 1665(0x681, float:2.333E-42)
            boolean r0 = r4.A0Y(r2, r0)
            if (r0 == 0) goto L_0x0329
            X.1W9 r1 = new X.1W9
            r1.<init>()
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r1.A00 = r0
            goto L_0x0324
        L_0x0349:
            java.lang.Object r3 = r2.A00
            X.2ci r3 = (X.C47102ci) r3
            java.lang.Object r4 = r2.A01
            X.3ZH r4 = (X.AnonymousClass3ZH) r4
            X.3Cq r5 = r3.A03
            X.2sr r0 = r5.A04
            boolean r0 = r0.A0Y()
            r1 = r0 ^ 1
            java.lang.String r0 = "ContactSyncMethods/outContactDiscoverySyncFor/out contacts should not be synced in companion mode"
            X.C626936e.A0F(r1, r0)
            com.whatsapp.jid.Jid r0 = X.AnonymousClass3ZH.A03(r4)
            if (r0 == 0) goto L_0x0014
            X.227 r7 = X.AnonymousClass227.A0K
            java.util.Set r8 = java.util.Collections.singleton(r0)
            X.2xW r6 = X.C59812xW.A0G
            r9 = 0
            r10 = r9
            X.3dJ r0 = r5.A02(r6, r7, r8, r9, r10)
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x08d0 }
            X.304 r0 = (X.AnonymousClass304) r0     // Catch:{ InterruptedException | ExecutionException -> 0x08d0 }
            boolean r0 = r0.A00()     // Catch:{ InterruptedException | ExecutionException -> 0x08d0 }
            if (r0 == 0) goto L_0x0014
            X.3Ex r2 = r3.A01     // Catch:{ InterruptedException | ExecutionException -> 0x08d0 }
            long r0 = r4.A0F()     // Catch:{ InterruptedException | ExecutionException -> 0x08d0 }
            X.3ZH r1 = r2.A04(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x08d0 }
            if (r1 == 0) goto L_0x0014
            boolean r0 = r1.A10     // Catch:{ InterruptedException | ExecutionException -> 0x08d0 }
            if (r0 == 0) goto L_0x0014
            java.util.List r0 = java.util.Collections.singletonList(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x08d0 }
            r5.A0B(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x08d0 }
            X.2nL r0 = r3.A02     // Catch:{ InterruptedException | ExecutionException -> 0x08d0 }
            X.1Vi r1 = new X.1Vi     // Catch:{ InterruptedException | ExecutionException -> 0x08d0 }
            r1.<init>()     // Catch:{ InterruptedException | ExecutionException -> 0x08d0 }
            X.4FV r0 = r0.A05     // Catch:{ InterruptedException | ExecutionException -> 0x08d0 }
            r0.BhD(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x08d0 }
            goto L_0x08cf
        L_0x03a5:
            java.lang.Object r0 = r2.A00
            X.3Cn r0 = (X.C64193Cn) r0
            java.lang.Object r2 = r2.A01
            X.304 r2 = (X.AnonymousClass304) r2
            X.8qC r0 = r0.A0U
            java.lang.Object r4 = r0.get()
            X.2zi r4 = (X.C61102zi) r4
            int r1 = r2.A00
            r0 = 3
            if (r1 == r0) goto L_0x03be
            r0 = 2
            r3 = 0
            if (r1 != r0) goto L_0x03bf
        L_0x03be:
            r3 = 1
        L_0x03bf:
            java.util.Set r2 = r2.A01
            java.util.Iterator r1 = X.C61102zi.A03(r4)
        L_0x03c5:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r1.next()
            X.4Cj r0 = (X.C84444Cj) r0
            r0.BPy(r2, r3)
            goto L_0x03c5
        L_0x03d5:
            java.lang.Object r1 = r2.A00
            X.3GM r1 = (X.AnonymousClass3GM) r1
            java.lang.Object r5 = r2.A01
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            X.1fH r5 = (X.C27981fH) r5
            X.311 r0 = r1.A0C
            r0.A04(r5)
            X.2sM r0 = r1.A0B
            com.whatsapp.jid.PhoneUserJid r6 = r0.A02(r5)
            X.4C1 r0 = r1.A0I
            java.lang.Object r2 = r0.get()
            X.3Gp r2 = (X.C65203Gp) r2
            X.2ss r0 = r2.A0V
            X.31A r0 = X.C56982ss.A00(r0, r5)
            if (r0 == 0) goto L_0x0407
            X.21b r1 = X.C371321b.USERNAME
            X.21b r0 = r0.A0Z
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0407
            r2.A0D()
        L_0x0407:
            X.2j3 r1 = r2.A0c
            java.lang.String r0 = "pnForLidChat"
            X.2sc r1 = r1.A00(r0)
            X.1Oa r1 = (X.C22431Oa) r1
            if (r1 == 0) goto L_0x043c
            if (r6 == 0) goto L_0x0014
            r0 = 0
            X.C162457s7.A0J(r5, r0)
            X.2sH r0 = r1.A00
            long r8 = r0.A0H()
            r4 = 0
            X.1SS r3 = new X.1SS
            r7 = r4
            r3.<init>(r4, r5, r6, r7, r8)
            java.util.Set r0 = java.util.Collections.singleton(r3)
            r2.A0K(r0)
        L_0x042e:
            X.3ZH r0 = new X.3ZH
            r0.<init>(r6)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            r0 = 1
            r2.A0M(r1, r0)
            return
        L_0x043c:
            if (r6 == 0) goto L_0x0014
            goto L_0x042e
        L_0x043f:
            java.lang.Object r6 = r2.A00
            X.4mM r6 = (X.C92264mM) r6
            java.lang.Object r7 = r2.A01
            X.33g r1 = r6.A06
            X.3ZH r0 = r6.A00
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass3ZH.A07(r0)
            X.5dt r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.A0V
            if (r0 == 0) goto L_0x0014
            X.3Wi r5 = r6.A06
            r0 = 48
        L_0x045b:
            X.3a7 r1 = new X.3a7
            r1.<init>(r6, r0, r7)
        L_0x0460:
            r5.A0S(r1)
            return
        L_0x0464:
            java.lang.Object r0 = r2.A00
            X.3Ex r0 = (X.C64773Ex) r0
            java.lang.Object r1 = r2.A01
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.1in r0 = r0.A06
            r0.A0B(r1)
            return
        L_0x0472:
            java.lang.Object r0 = r2.A00
            X.1vC r0 = (X.C34461vC) r0
            java.lang.Object r1 = r2.A01
            java.util.Collection r1 = (java.util.Collection) r1
            X.1hq r0 = X.C34461vC.A00(r0)
            r0.A08(r1)
            return
        L_0x0482:
            java.lang.Object r1 = r2.A00
            X.1vC r1 = (X.C34461vC) r1
            java.lang.Object r0 = r2.A01
            X.3ZH r0 = (X.AnonymousClass3ZH) r0
            r1.A0N(r0)
            return
        L_0x048e:
            java.lang.Object r0 = r2.A00
            X.1vC r0 = (X.C34461vC) r0
            java.lang.Object r1 = r2.A01
            java.util.Collection r1 = (java.util.Collection) r1
            X.1hq r0 = X.C34461vC.A00(r0)
            r0.A09(r1)
            return
        L_0x049e:
            java.lang.Object r0 = r2.A00
            X.5Xd r0 = (X.C105975Xd) r0
            java.lang.Object r2 = r2.A01
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.2n3 r1 = r0.A0B
            java.lang.String r0 = "contact_card"
            goto L_0x05c8
        L_0x04ac:
            java.lang.Object r0 = r2.A00
            X.5Xd r0 = (X.C105975Xd) r0
            java.lang.Object r2 = r2.A01
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.3Li r1 = r0.A07
            X.227 r0 = X.AnonymousClass227.A0D
            r1.A02(r0, r2)
            return
        L_0x04bc:
            java.lang.Object r0 = r2.A00
            X.2Tg r0 = (X.C43732Tg) r0
            java.lang.Object r1 = r2.A01
            android.content.Intent r1 = (android.content.Intent) r1
            X.481 r0 = r0.A03
            android.app.Activity r0 = (android.app.Activity) r0
            X.AnonymousClass0x2.A0m(r0, r1)
            return
        L_0x04cc:
            java.lang.Object r4 = r2.A00
            X.2qh r4 = (X.C55652qh) r4
            java.lang.Object r2 = r2.A01
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            X.33i r0 = r4.A0D     // Catch:{ Exception -> 0x04ee }
            X.5UR r0 = r0.A0R()     // Catch:{ Exception -> 0x04ee }
            java.lang.String r1 = "com.android.contacts"
            android.content.ContentResolver r0 = r0.A02()     // Catch:{ Exception -> 0x04ee }
            android.content.ContentProviderResult[] r0 = r0.applyBatch(r1, r2)     // Catch:{ Exception -> 0x04ee }
            X.C162457s7.A0D(r0)     // Catch:{ Exception -> 0x04ee }
            X.3Wi r1 = r4.A04     // Catch:{ Exception -> 0x04ee }
            r0 = 2
            X.C69263Wi.A02(r1, r4, r0)     // Catch:{ Exception -> 0x04ee }
            return
        L_0x04ee:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ContactFormSaveContactController: unable to save contact "
            X.C18260x0.A16(r0, r1, r2)
            X.2qk r3 = r4.A03
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Failed to save contact: "
            java.lang.String r2 = X.AnonymousClass000.A0a(r0, r1, r2)
            r1 = 0
            java.lang.String r0 = "ContactFormSaveContactController: unable to save contact"
            r3.A0A(r0, r1, r2)
            X.3Wi r2 = r4.A04
            X.4E4 r1 = r4.A0A
            java.util.Objects.requireNonNull(r1)
            r0 = 3
            X.C69263Wi.A02(r2, r1, r0)
            return
        L_0x0516:
            java.lang.Object r1 = r2.A00
            X.2xQ r1 = (X.C59752xQ) r1
            java.lang.Object r0 = r2.A01
            X.3Gp r2 = r1.A01
            X.3d3 r1 = X.C72023d3.A00
            java.util.List r0 = X.C18290x4.A12(r0)
            r2.A0L(r1, r0)
            return
        L_0x0528:
            java.lang.Object r0 = r2.A00
            X.2xQ r0 = (X.C59752xQ) r0
            java.lang.Object r1 = r2.A01
            X.3ZH r1 = (X.AnonymousClass3ZH) r1
            X.3Ex r0 = r0.A02
            r0.A0L(r1)
            return
        L_0x0536:
            java.lang.Object r1 = r2.A00
            X.2pi r1 = (X.C55052pi) r1
            java.lang.Object r2 = r2.A01
            X.3ZH r2 = (X.AnonymousClass3ZH) r2
            X.2ro r0 = r1.A06
            r0.A04(r2)
            X.1in r1 = r1.A05
            X.4uZ r0 = X.AnonymousClass3ZH.A01(r2)
            r1.A08(r0)
            return
        L_0x054d:
            java.lang.Object r3 = r2.A00
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r2.A01
            com.whatsapp.jid.GroupJid r2 = (com.whatsapp.jid.GroupJid) r2
            android.content.Context r1 = r3.getApplicationContext()
            r0 = 3
            android.content.Intent r0 = X.C627736r.A0V(r1, r2, r0)
            r3.startActivity(r0)
            return
        L_0x0562:
            java.lang.Object r3 = r2.A00
            com.whatsapp.contact.picker.ContactPickerFragment r3 = (com.whatsapp.contact.picker.ContactPickerFragment) r3
            java.lang.Object r0 = r2.A01
            X.3ZH r0 = (X.AnonymousClass3ZH) r0
            X.4uZ r2 = r0.A0H
            boolean r0 = r2 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x05a7
            X.8qC r0 = r3.A2j
            X.2sS r1 = X.C18320x8.A0I(r0)
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            X.8qC r0 = r1.A0A
            java.lang.Object r0 = r0.get()
            X.2ff r0 = (X.C48902ff) r0
            X.2o1 r0 = r0.A00(r2)
            if (r0 == 0) goto L_0x05a7
            java.lang.String r2 = r0.A08
        L_0x058c:
            X.1ZN r1 = new X.1ZN
            r1.<init>()
            r0 = 31
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            r1.A04 = r2
            java.lang.Integer r0 = X.C18290x4.A0d()
            r1.A02 = r0
            X.4FV r0 = r3.A1z
            r0.BhD(r1)
            return
        L_0x05a7:
            r2 = 0
            goto L_0x058c
        L_0x05a9:
            java.lang.Object r3 = r2.A00
            com.whatsapp.contact.picker.ContactPickerFragment r3 = (com.whatsapp.contact.picker.ContactPickerFragment) r3
            java.lang.Object r1 = r2.A01
            X.6zK r1 = (X.C143696zK) r1
            X.5TD r0 = r3.A2d
            r0.A02(r1)
            X.5hx r0 = r3.A19
            r0.A02()
            return
        L_0x05bc:
            java.lang.Object r0 = r2.A00
            com.whatsapp.contact.picker.ContactPickerFragment r0 = (com.whatsapp.contact.picker.ContactPickerFragment) r0
            java.lang.Object r2 = r2.A01
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.2n3 r1 = r0.A1Z
            java.lang.String r0 = "contact_search"
        L_0x05c8:
            X.C53412n3.A00(r1, r2, r0)
            return
        L_0x05cc:
            java.lang.Object r3 = r2.A00
            com.whatsapp.contact.picker.ListMembersSelector r3 = (com.whatsapp.contact.picker.ListMembersSelector) r3
            java.lang.Object r0 = r2.A01
            X.3ZH r0 = (X.AnonymousClass3ZH) r0
            X.5hX r1 = r3.A00
            android.content.Intent r0 = X.C627736r.A0N(r3, r0)
            r1.A0B(r3, r0)
            X.5rC r1 = r3.A01
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x05f4
            r1.A04()
            java.util.List r0 = r3.A0f
            r0.size()
            java.lang.String r0 = "logCreationSuccessAction"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x05f4:
            r3.finish()
            return
        L_0x05f8:
            java.lang.Object r0 = r2.A00
            com.whatsapp.contact.picker.PhoneContactsSelector r0 = (com.whatsapp.contact.picker.PhoneContactsSelector) r0
            java.lang.Object r4 = r2.A01
            X.5Qc r4 = (X.C104215Qc) r4
            X.2oU r6 = r0.A0Q
            X.3Ex r3 = r0.A0E
            X.33i r5 = r0.A08
            X.33j r7 = r0.A0S
            X.5Xx r1 = r0.A08
            X.33g r2 = r0.A0B
            X.2ML r9 = r0.A0W
            X.2q8 r8 = r0.A0T
            java.lang.String r0 = com.whatsapp.contact.picker.PhoneContactsSelector.A0C(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r4.A02 = r0
            return
        L_0x0617:
            java.lang.Object r8 = r2.A00
            X.12s r8 = (X.C198012s) r8
            java.lang.Object r3 = r2.A01
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r4 = r3.iterator()
        L_0x0623:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x066c
            java.lang.Object r2 = r4.next()
            X.2Qx r2 = (X.C43132Qx) r2
            X.0Ua r7 = r2.A04
            int r1 = r2.A00
            int r0 = r2.A01
            int r9 = r2.A02
            int r10 = r2.A03
            android.view.View r2 = r7.A0H
            int r9 = r9 - r1
            int r10 = r10 - r0
            r1 = 0
            if (r9 == 0) goto L_0x0647
            X.0Qv r0 = X.C06560Yg.A05(r2)
            r0.A06(r1)
        L_0x0647:
            if (r10 == 0) goto L_0x0650
            X.0Qv r0 = X.C06560Yg.A05(r2)
            r0.A07(r1)
        L_0x0650:
            X.0Qv r6 = X.C06560Yg.A05(r2)
            java.util.List r0 = r8.A04
            r0.add(r7)
            long r0 = r8.A05()
            r6.A08(r0)
            X.1PE r5 = new X.1PE
            r5.<init>(r6, r7, r8, r9, r10)
            r6.A0A(r5)
            r6.A02()
            goto L_0x0623
        L_0x066c:
            r3.clear()
            java.util.List r0 = r8.A05
            r0.remove(r3)
            return
        L_0x0675:
            java.lang.Object r5 = r2.A00
            X.12s r5 = (X.C198012s) r5
            java.lang.Object r6 = r2.A01
            java.util.List r6 = (java.util.List) r6
            java.util.Iterator r8 = r6.iterator()
        L_0x0681:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x06fd
            java.lang.Object r4 = r8.next()
            X.2bz r4 = (X.C46652bz) r4
            X.0Ua r0 = r4.A05
            r3 = 0
            if (r0 != 0) goto L_0x06fa
            r1 = r3
        L_0x0693:
            X.0Ua r0 = r4.A04
            if (r0 == 0) goto L_0x0699
            android.view.View r3 = r0.A0H
        L_0x0699:
            r7 = 0
            if (r1 == 0) goto L_0x06cf
            X.0Qv r2 = X.C06560Yg.A05(r1)
            long r0 = r5.A04()
            r2.A08(r0)
            java.util.List r1 = r5.A02
            X.0Ua r0 = r4.A05
            r1.add(r0)
            int r1 = r4.A02
            int r0 = r4.A00
            int r1 = r1 - r0
            float r0 = (float) r1
            r2.A06(r0)
            int r1 = r4.A03
            int r0 = r4.A01
            int r1 = r1 - r0
            float r0 = (float) r1
            r2.A07(r0)
            r2.A03(r7)
            r1 = 2
            X.4HA r0 = new X.4HA
            r0.<init>(r4, r2, r5, r1)
            r2.A0A(r0)
            r2.A02()
        L_0x06cf:
            if (r3 == 0) goto L_0x0681
            X.0Qv r2 = X.C06560Yg.A05(r3)
            java.util.List r1 = r5.A02
            X.0Ua r0 = r4.A04
            r1.add(r0)
            r2.A06(r7)
            r2.A07(r7)
            long r0 = r5.A04()
            r2.A08(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.A03(r0)
            X.1PD r0 = new X.1PD
            r0.<init>(r3, r2, r4, r5)
            r2.A0A(r0)
            r2.A02()
            goto L_0x0681
        L_0x06fa:
            android.view.View r1 = r0.A0H
            goto L_0x0693
        L_0x06fd:
            r6.clear()
            java.util.List r0 = r5.A03
            goto L_0x0747
        L_0x0703:
            java.lang.Object r5 = r2.A00
            X.12s r5 = (X.C198012s) r5
            java.lang.Object r6 = r2.A01
            java.util.List r6 = (java.util.List) r6
            java.util.Iterator r4 = r6.iterator()
        L_0x070f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0742
            java.lang.Object r3 = r4.next()
            X.0Ua r3 = (X.C05570Ua) r3
            android.view.View r0 = r3.A0H
            X.0Qv r2 = X.C06560Yg.A05(r0)
            java.util.List r0 = r5.A00
            r0.add(r3)
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.A04(r0)
            r2.A05(r0)
            long r0 = r5.A03()
            r2.A08(r0)
            r1 = 1
            X.4HA r0 = new X.4HA
            r0.<init>(r2, r3, r5, r1)
            r2.A0A(r0)
            r2.A02()
            goto L_0x070f
        L_0x0742:
            r6.clear()
            java.util.List r0 = r5.A01
        L_0x0747:
            r0.remove(r6)
            return
        L_0x074b:
            java.lang.Object r5 = r2.A00
            com.whatsapp.contact.picker.SharedTextPreviewDialogFragment r5 = (com.whatsapp.contact.picker.SharedTextPreviewDialogFragment) r5
            java.lang.Object r2 = r2.A01
            X.5S9 r2 = (X.AnonymousClass5S9) r2
            X.03q r0 = r5.A0Q()
            android.view.Window r0 = r0.getWindow()
            r6 = 1
            r0.setSoftInputMode(r6)
            boolean r0 = r2.A02()
            r4 = 0
            if (r0 == 0) goto L_0x077a
            X.33i r0 = r5.A0C
            android.view.inputmethod.InputMethodManager r1 = r0.A0Q()
            if (r1 == 0) goto L_0x0777
            com.whatsapp.mentions.MentionableEntry r0 = r5.A0G
            android.os.IBinder r0 = r0.getWindowToken()
            r1.hideSoftInputFromWindow(r0, r4)
        L_0x0777:
            r2.A01(r6)
        L_0x077a:
            com.whatsapp.mentions.MentionableEntry r0 = r5.A0G
            int r3 = r0.getSelectionStart()
            com.whatsapp.mentions.MentionableEntry r0 = r5.A0G
            int r2 = r0.getSelectionEnd()
            com.whatsapp.mentions.MentionableEntry r1 = r5.A0G
            java.lang.String r0 = r1.getStringText()
            r1.setText(r0)
            com.whatsapp.mentions.MentionableEntry r0 = r5.A0G
            r0.setSelection(r3, r2)
            r0 = 2
            int[] r2 = new int[r0]
            int[] r1 = new int[r0]
            com.whatsapp.mentions.MentionableEntry r0 = r5.A0G
            r0.getLocationOnScreen(r2)
            android.widget.RelativeLayout r0 = r5.A06
            r0.getLocationOnScreen(r1)
            com.whatsapp.mentions.MentionableEntry r5 = r5.A0G
            r4 = r2[r4]
            r3 = r2[r6]
            int r2 = r5.getWidth()
            int r2 = r2 + r4
            r1 = r1[r6]
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r4, r3, r2, r1)
            r5.A00 = r0
            return
        L_0x07b8:
            java.lang.Object r3 = r2.A00
            com.whatsapp.contact.picker.ContactPickerFragment r3 = (com.whatsapp.contact.picker.ContactPickerFragment) r3
            java.lang.Object r0 = r2.A01
            X.5UY r0 = (X.AnonymousClass5UY) r0
            r1 = 0
            android.view.View r0 = r0.A04()
            int r0 = r0.getHeight()
            r3.A1i(r0, r1)
            return
        L_0x07cd:
            java.lang.Object r3 = r2.A00
            android.app.ProgressDialog r3 = (android.app.ProgressDialog) r3
            java.lang.Object r2 = r2.A01
            android.content.Context r2 = (android.content.Context) r2
            r1 = 1
            r0 = 2131890537(0x7f121169, float:1.9415769E38)
            X.C18320x8.A0w(r3, r2, r0)
            r3.setIndeterminate(r1)
            r3.setCancelable(r1)
            r3.show()
            return
        L_0x07e6:
            java.lang.Object r3 = r2.A00
            X.2h3 r3 = (X.C49762h3) r3
            java.lang.Object r2 = r2.A01
            X.1aN r2 = (X.C25351aN) r2
            X.33i r1 = r3.A01
            X.5ZR r0 = r3.A02
            java.lang.Integer r0 = X.AnonymousClass25V.A00(r1, r0)
            if (r0 == 0) goto L_0x07fe
            java.lang.Long r0 = X.C18310x6.A0g(r0)
            r2.A05 = r0
        L_0x07fe:
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()
            X.3Ex r0 = r3.A00
            r0.A0b(r1)
            int r0 = r1.size()
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r2.A06 = r0
            X.4FV r0 = r3.A03
            r0.BhD(r2)
            return
        L_0x0817:
            java.lang.Object r0 = r2.A00
            X.3Qk r0 = (X.C67723Qk) r0
            java.lang.Object r2 = r2.A01
            X.2zz r2 = (X.C61272zz) r2
            X.3Cq r1 = r0.A0C
            r0 = 1
            r1.A03(r2, r0)
            return
        L_0x0826:
            java.lang.Object r0 = r2.A00
            X.3Qk r0 = (X.C67723Qk) r0
            java.lang.Object r1 = r2.A01
            X.4uZ r1 = (X.C95814uZ) r1
            X.1ib r0 = r0.A05
            r0.A08(r1)
            return
        L_0x0834:
            java.lang.Object r0 = r2.A00
            X.3Qk r0 = (X.C67723Qk) r0
            java.lang.Object r7 = r2.A01
            com.whatsapp.jid.UserJid r7 = (com.whatsapp.jid.UserJid) r7
            X.2pt r6 = r0.A0H
            X.1fY r0 = X.AnonymousClass1fY.A00
            if (r7 != r0) goto L_0x0847
            java.lang.String r0 = "deleting MeJid status from StatusMessageStore/deleteStatuses"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0847:
            java.util.List r5 = r6.A01(r7)
            java.util.Iterator r4 = r5.iterator()
        L_0x084f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0861
            X.34x r3 = X.C18300x5.A0T(r4)
            X.3Lv r2 = r6.A07
            r1 = 1
            r0 = 0
            r2.A0d(r3, r1, r0)
            goto L_0x084f
        L_0x0861:
            X.33e r0 = r6.A0H
            r0.A03(r7)
            X.2hU r0 = r6.A08
            android.os.Handler r2 = r0.A01
            r1 = 1
            X.3bx r0 = new X.3bx
            r0.<init>(r6, r1, r5)
            r2.post(r0)
            return
        L_0x0874:
            java.lang.Object r1 = r2.A00
            X.3Tu r1 = (X.C68603Tu) r1
            java.lang.Object r0 = r2.A01
            X.3ZH r0 = (X.AnonymousClass3ZH) r0
            X.1in r1 = r1.A03
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass3ZH.A07(r0)
            r1.A0B(r0)
            return
        L_0x0886:
            java.lang.Object r1 = r2.A00
            X.3Cn r1 = (X.C64193Cn) r1
            java.lang.Object r0 = r2.A01
            X.2zz r0 = (X.C61272zz) r0
            r1.A02(r0)
            return
        L_0x0892:
            java.lang.Object r0 = r2.A00
            com.whatsapp.conversation.CommentsBottomSheet r0 = (com.whatsapp.conversation.CommentsBottomSheet) r0
            java.lang.Object r2 = r2.A01
            com.whatsapp.mentions.MentionableEntry r2 = (com.whatsapp.mentions.MentionableEntry) r2
            X.66R r0 = r0.A0U
            java.lang.Object r1 = r0.getValue()
            X.10y r1 = (X.C194510y) r1
            java.lang.String r0 = r2.getStringText()
            X.C162457s7.A0D(r0)
            r1.A0F(r0)
            return
        L_0x08ad:
            java.lang.Object r1 = r2.A00
            X.4mM r1 = (X.C92264mM) r1
            java.lang.Object r0 = r2.A01
            android.view.Menu r0 = (android.view.Menu) r0
            r1.A07(r0)
            return
        L_0x08b9:
            r1 = move-exception
            if (r3 == 0) goto L_0x08c4
            r3.close()     // Catch:{ all -> 0x08c0 }
            goto L_0x08c4
        L_0x08c0:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x08c5 }
        L_0x08c4:
            throw r1     // Catch:{ all -> 0x08c5 }
        L_0x08c5:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x08ca }
            throw r1
        L_0x08ca:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x08cf:
            return
        L_0x08d0:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ContactDiscoverySyncHelper/sendContactDiscoveryRequestAndReportStalenessFor/exception "
            X.C18260x0.A1Q(r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70203a7.run():void");
    }
}
