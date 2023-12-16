package X;

import android.view.View;

/* renamed from: X.5pG  reason: invalid class name and case insensitive filesystem */
public class C115805pG implements C1226165b {
    public View A00;
    public final C623534r A01;

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x030a, code lost:
        if (X.AnonymousClass75J.A00(r0.A06, r1) != false) goto L_0x030c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x018f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View BEK(android.content.Context r29, android.view.View r30, android.view.ViewGroup r31, X.C105365Uq r32, java.util.List r33, java.util.List r34, java.util.List r35, java.util.List r36, boolean r37) {
        /*
            r28 = this;
            r17 = r30
            if (r30 != 0) goto L_0x0038
            r3 = r29
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r3)
            r0 = 2131626117(0x7f0e0885, float:1.8879461E38)
            r2 = r31
            android.view.View r17 = X.AnonymousClass001.A0R(r1, r2, r0)
            X.3Db r1 = X.C389229y.A01(r3)
            X.4Yw r9 = new X.4Yw
            r2 = r32
            r0 = r17
            r9.<init>(r3, r0, r1, r2)
            r0.setTag(r9)
        L_0x0023:
            r1 = r28
            r0 = r17
            r1.A00 = r0
            X.34r r0 = r1.A01
            r27 = r0
            com.whatsapp.jid.UserJid r10 = r0.A0A
            r9.A06 = r10
            int r0 = r27.A02()
            r9.A01 = r0
            goto L_0x003f
        L_0x0038:
            java.lang.Object r9 = r17.getTag()
            X.4Yw r9 = (X.C88474Yw) r9
            goto L_0x0023
        L_0x003f:
            X.3Db r0 = r9.A0E     // Catch:{ all -> 0x0558 }
            r26 = r0
            X.4C1 r0 = r0.AWi     // Catch:{ all -> 0x0558 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0558 }
            X.2pt r1 = (X.C55152pt) r1     // Catch:{ all -> 0x0558 }
            com.whatsapp.jid.UserJid r0 = r9.A06     // Catch:{ all -> 0x0558 }
            X.34x r8 = r1.A00(r0)     // Catch:{ all -> 0x0558 }
            X.1fY r7 = X.AnonymousClass1fY.A00
            boolean r0 = X.AnonymousClass000.A1Y(r10, r7)
            r12 = 1
            r6 = 8
            r5 = 0
            if (r0 == 0) goto L_0x03b3
            X.5YB r11 = r9.A0G
            com.whatsapp.TextEmojiLabel r4 = r11.A02
            r0 = 2131890906(0x7f1212da, float:1.9416517E38)
            r4.setText(r0)
            r4.A0E()
            android.widget.FrameLayout r1 = r9.A09
            if (r8 == 0) goto L_0x03ae
            android.content.Context r3 = r9.A07
            r0 = 2131890907(0x7f1212db, float:1.941652E38)
            X.C18300x5.A13(r3, r1, r0)
            r0 = 42
            X.C634139d.A00(r1, r9, r0)
            r1.setVisibility(r5)
            android.widget.ImageView r2 = r9.A0A
            r0 = 2131232445(0x7f0806bd, float:1.8081E38)
            r2.setImageResource(r0)
            boolean r1 = r33.isEmpty()
            r0 = 2131102498(0x7f060b22, float:1.7817436E38)
            if (r1 == 0) goto L_0x0099
            r1 = 2130970714(0x7f04085a, float:1.7550146E38)
            r0 = 2131102503(0x7f060b27, float:1.7817446E38)
            int r0 = X.AnonymousClass5Yj.A02(r3, r1, r0)
        L_0x0099:
            int r1 = X.AnonymousClass0Y8.A04(r3, r0)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.setColorFilter(r1, r0)
        L_0x00a2:
            com.whatsapp.jid.UserJid r0 = r9.A06
            boolean r0 = r0 instanceof X.C135216kJ
            if (r0 != 0) goto L_0x0398
            android.widget.TextView r3 = r9.A0D
            r3.setVisibility(r5)
            r3.setCompoundDrawablesWithIntrinsicBounds(r5, r5, r5, r5)
            android.content.Context r2 = r9.A07
            r1 = 2130969995(0x7f04058b, float:1.7548688E38)
            r0 = 2131101335(0x7f060697, float:1.7815077E38)
            X.AnonymousClass5Yj.A0B(r2, r4, r1, r0)
            r4.A0E()
        L_0x00be:
            java.lang.String r12 = ""
            if (r8 == 0) goto L_0x0333
            com.whatsapp.jid.UserJid r0 = r9.A06
            boolean r0 = r0 instanceof X.C135216kJ
            if (r0 == 0) goto L_0x025e
            android.widget.ImageView r11 = r9.A0C
            r11.setTag(r12)
            X.5UX r1 = X.C86614Ku.A0R(r26)
            X.3Ex r0 = X.C64333Db.A26(r26)
            X.2ev r0 = r0.A04
            X.8qC r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.3ZH r0 = (X.AnonymousClass3ZH) r0
            r1.A07(r11, r0)
        L_0x00e2:
            int r13 = r33.size()
            int r12 = r34.size()
            int r11 = r35.size()
            int r1 = r13 + r12
            int r1 = r1 + r11
            boolean r0 = X.AnonymousClass000.A1Y(r10, r7)
            if (r0 == 0) goto L_0x0212
            if (r1 == 0) goto L_0x0212
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()
            r16 = 1
            if (r13 <= 0) goto L_0x011b
            android.content.res.Resources r0 = r9.A08
            r14 = r0
            r0 = r16
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r18 = r0
            X.AnonymousClass000.A1P(r0, r13, r5)
            r0 = 2131755121(0x7f100071, float:1.9141112E38)
            r15 = r14
            r14 = r0
            r0 = r18
            java.lang.String r0 = r15.getQuantityString(r14, r13, r0)
            r1.add(r0)
        L_0x011b:
            if (r12 <= 0) goto L_0x0131
            android.content.res.Resources r0 = r9.A08
            r14 = r0
            r0 = r16
            java.lang.Object[] r15 = new java.lang.Object[r0]
            X.AnonymousClass000.A1P(r15, r12, r5)
            r0 = 2131755311(0x7f10012f, float:1.9141498E38)
            java.lang.String r0 = r14.getQuantityString(r0, r12, r15)
            r1.add(r0)
        L_0x0131:
            if (r11 <= 0) goto L_0x013f
            android.content.res.Resources r12 = r9.A08
            r0 = 2131755069(0x7f10003d, float:1.9141007E38)
            java.lang.String r0 = X.AnonymousClass0x2.A0Y(r12, r11, r5, r0)
            r1.add(r0)
        L_0x013f:
            int r11 = r1.size()
            r14 = 2
            r0 = 3
            if (r11 != r0) goto L_0x01fc
            r12 = 2131894341(0x7f122045, float:1.9423484E38)
            java.lang.Object[] r11 = new java.lang.Object[r0]
            X.C18280x3.A1M(r1, r11)
            java.lang.Object r0 = r1.get(r14)
            r11[r14] = r0
        L_0x0155:
            java.lang.String r0 = r2.getString(r12, r11)
        L_0x0159:
            r3.setText(r0)
            if (r13 == 0) goto L_0x015f
            r5 = 1
        L_0x015f:
            r0 = 2131233221(0x7f0809c5, float:1.8082573E38)
            android.graphics.drawable.Drawable r1 = X.C107335b8.A01(r2, r0)
            if (r5 == 0) goto L_0x016f
            r0 = 2131233170(0x7f080992, float:1.808247E38)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass0RP.A00(r2, r0)
        L_0x016f:
            X.33j r0 = r26.BsW()
            X.6dx r11 = new X.6dx
            r11.<init>(r1, r0)
            X.33j r0 = r26.BsW()
            boolean r0 = X.C102805Ki.A00(r0)
            r5 = 0
            r1 = r11
            if (r0 == 0) goto L_0x0185
            r1 = r5
        L_0x0185:
            X.33j r0 = r26.BsW()
            boolean r0 = X.C102805Ki.A00(r0)
            if (r0 != 0) goto L_0x0190
            r11 = r5
        L_0x0190:
            r3.setCompoundDrawablesWithIntrinsicBounds(r1, r5, r11, r5)
        L_0x0193:
            android.widget.ImageView r1 = r9.A0C
            boolean r12 = r1 instanceof com.whatsapp.wds.components.profilephoto.WDSProfilePhoto
            if (r12 == 0) goto L_0x01f6
            r5 = r1
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r5 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r5
            r0 = 0
            r5.setProfileBadge(r0)
        L_0x01a0:
            X.1R1 r5 = X.C86634Kw.A0p(r26)
            com.whatsapp.jid.UserJid r0 = r9.A06
            boolean r11 = r5.A0j(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r11 == 0) goto L_0x01b0
            r0 = 1056964608(0x3f000000, float:0.5)
        L_0x01b0:
            r4.setAlpha(r0)
            r3.setAlpha(r0)
            r1.setAlpha(r0)
            boolean r0 = r1 instanceof com.whatsapp.status.ContactStatusThumbnail
            if (r0 == 0) goto L_0x03fa
            r4 = 0
            if (r11 == 0) goto L_0x01ed
            r3 = 0
        L_0x01c1:
            r0 = r1
            com.whatsapp.status.ContactStatusThumbnail r0 = (com.whatsapp.status.ContactStatusThumbnail) r0
            java.util.Map r5 = r0.A06
            r5.clear()
            r0.A08(r4, r3)
            if (r11 != 0) goto L_0x0482
            boolean r0 = X.AnonymousClass000.A1Y(r10, r7)
            if (r0 == 0) goto L_0x0482
            java.util.Iterator r4 = r33.iterator()
        L_0x01d8:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x03e1
            java.lang.Object r3 = r4.next()
            r0 = 2131102498(0x7f060b22, float:1.7817436E38)
            int r0 = X.AnonymousClass0Y8.A04(r2, r0)
            X.C18280x3.A1D(r3, r5, r0)
            goto L_0x01d8
        L_0x01ed:
            int r3 = r27.A02()
            int r4 = r27.A03()
            goto L_0x01c1
        L_0x01f6:
            android.widget.ImageView r0 = r9.A0B
            r0.setVisibility(r6)
            goto L_0x01a0
        L_0x01fc:
            int r0 = r1.size()
            if (r0 != r14) goto L_0x020c
            r12 = 2131894542(0x7f12210e, float:1.9423892E38)
            java.lang.Object[] r11 = new java.lang.Object[r14]
            X.C18280x3.A1M(r1, r11)
            goto L_0x0155
        L_0x020c:
            java.lang.String r0 = X.C86664Kz.A1M(r1, r5)
            goto L_0x0159
        L_0x0212:
            r26.Bqh()
            X.33j r12 = r26.BsW()
            X.2sH r11 = r26.Bqh()
            long r0 = r27.A05()
            java.lang.CharSequence r13 = X.C107565bW.A00(r11, r12, r0)
            r3.setText(r13)
            r3.setCompoundDrawablesWithIntrinsicBounds(r5, r5, r5, r5)
            int r14 = r27.A03()
            int r12 = r27.A02()
            r11 = 1
            android.content.res.Resources r1 = r9.A08
            if (r14 <= 0) goto L_0x0256
            r0 = 2131755366(0x7f100166, float:1.914161E38)
            java.lang.String r5 = X.AnonymousClass0x2.A0Y(r1, r14, r5, r0)
        L_0x023f:
            java.lang.StringBuilder r1 = X.C18290x4.A0v(r13)
            java.lang.String r0 = " "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r5, r1)
            r3.setContentDescription(r0)
            r3.setImportantForAccessibility(r11)
            r0 = 2131894317(0x7f12202d, float:1.9423435E38)
            r9.A00 = r0
            goto L_0x0193
        L_0x0256:
            r0 = 2131755367(0x7f100167, float:1.9141611E38)
            java.lang.String r5 = X.AnonymousClass0x2.A0Y(r1, r12, r5, r0)
            goto L_0x023f
        L_0x025e:
            boolean r0 = r8 instanceof X.C30721mu
            if (r0 == 0) goto L_0x027b
            boolean r0 = r9.A0L
            if (r0 == 0) goto L_0x027b
            r0 = r8
            X.1mu r0 = (X.C30721mu) r0
            int r0 = X.AnonymousClass75C.A00(r2, r0)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass5C2.A00(r2, r0)
            android.widget.ImageView r0 = r9.A0C
            r0.setTag(r12)
            r0.setImageDrawable(r1)
            goto L_0x00e2
        L_0x027b:
            boolean r0 = r8 instanceof X.C30471mV
            if (r0 == 0) goto L_0x02a7
            r13 = r8
            X.1mV r13 = (X.C30471mV) r13
            X.33C r12 = X.C30471mV.A00(r13)
            if (r37 == 0) goto L_0x0299
            r0 = r26
            X.3Db r0 = r0.AcK
            X.5bk r0 = r0.A00
            X.4C1 r0 = r0.ABJ
            java.lang.Object r0 = r0.get()
            X.5Nt r0 = (X.C103635Nt) r0
            r0.A00(r8)
        L_0x0299:
            X.4FS r11 = r9.A0J
            r1 = 9
            X.3aN r0 = new X.3aN
            r0.<init>(r9, r12, r13, r1)
            r11.BkP(r0)
            goto L_0x00e2
        L_0x02a7:
            byte r1 = r8.A1I
            if (r1 == 0) goto L_0x02bd
            r0 = 27
            if (r1 == r0) goto L_0x02bd
            android.widget.ImageView r1 = r9.A0C
            r1.setTag(r12)
            int r0 = X.AnonymousClass5C1.A00(r8)
            r1.setImageResource(r0)
            goto L_0x00e2
        L_0x02bd:
            android.widget.ImageView r11 = r9.A0C
            r11.setTag(r12)
            X.5Zz r0 = X.C86634Kw.A0m(r26)
            java.lang.String r12 = X.C107415bH.A06(r0, r8)
            r0 = r8
            X.1mW r0 = (X.C30481mW) r0
            com.whatsapp.TextData r1 = r0.A02
            android.graphics.drawable.Drawable r0 = r11.getDrawable()
            X.5Y0 r23 = X.C64333Db.A3o(r26)
            X.33i r22 = X.C64333Db.A2o(r26)
            X.2y5 r24 = X.C64333Db.A74(r26)
            int r14 = r12.length()
            r13 = 700(0x2bc, float:9.81E-43)
            if (r14 <= r13) goto L_0x02eb
            java.lang.String r12 = r12.substring(r5, r13)
        L_0x02eb:
            X.C162457s7.A0J(r2, r5)
            if (r1 == 0) goto L_0x032d
            int r13 = r1.fontStyle
            android.graphics.Typeface r20 = X.C107415bH.A04(r2, r13)
        L_0x02f6:
            boolean r13 = r0 instanceof X.C86814Ly
            if (r13 == 0) goto L_0x031f
            X.4Ly r0 = (X.C86814Ly) r0
            java.lang.CharSequence r13 = r0.A07
            boolean r13 = X.AnonymousClass75J.A00(r13, r12)
            if (r13 == 0) goto L_0x031f
            com.whatsapp.TextData r13 = r0.A06
            boolean r13 = X.AnonymousClass75J.A00(r13, r1)
            if (r13 == 0) goto L_0x031f
        L_0x030c:
            boolean r1 = r11 instanceof com.whatsapp.status.ContactStatusThumbnail
            if (r1 == 0) goto L_0x031a
            r1 = r11
            com.whatsapp.components.button.ThumbnailButton r1 = (com.whatsapp.components.button.ThumbnailButton) r1
            float r12 = r1.A01
            r1 = 1073741824(0x40000000, float:2.0)
            float r12 = r12 / r1
            r0.A00 = r12
        L_0x031a:
            r11.setImageDrawable(r0)
            goto L_0x00e2
        L_0x031f:
            X.4Ly r0 = new X.4Ly
            r19 = r2
            r21 = r1
            r25 = r12
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            goto L_0x030c
        L_0x032d:
            android.graphics.Typeface r20 = android.graphics.Typeface.SANS_SERIF
            X.C162457s7.A0F(r20)
            goto L_0x02f6
        L_0x0333:
            android.widget.ImageView r1 = r9.A0C
            r1.setTag(r12)
            boolean r0 = X.AnonymousClass000.A1Y(r10, r7)
            if (r0 == 0) goto L_0x0380
            X.2sr r0 = r26.BL4()
            X.1RR r11 = X.C56972sr.A01(r0)
            if (r11 == 0) goto L_0x034d
            X.5Uq r0 = r9.A0H
            r0.A08(r1, r11)
        L_0x034d:
            android.widget.ImageView r13 = r9.A0B
            boolean r11 = X.C1001059l.A03
            r0 = 2131233272(0x7f0809f8, float:1.8082677E38)
            if (r11 == 0) goto L_0x0359
            r0 = 2131233273(0x7f0809f9, float:1.8082679E38)
        L_0x0359:
            r13.setBackgroundResource(r0)
            boolean r12 = r1 instanceof com.whatsapp.wds.components.profilephoto.WDSProfilePhoto
            if (r12 == 0) goto L_0x037c
            r11 = r1
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r11 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r11
            X.7gJ r0 = r9.A0K
            r11.setProfileBadge(r0)
        L_0x0368:
            r0 = 2131886375(0x7f120127, float:1.9407327E38)
            r3.setText(r0)
            r0 = 2
            r3.setImportantForAccessibility(r0)
            r0 = 2131894316(0x7f12202c, float:1.9423433E38)
            r9.A00 = r0
        L_0x0377:
            r3.setCompoundDrawablesWithIntrinsicBounds(r5, r5, r5, r5)
            goto L_0x01a0
        L_0x037c:
            r13.setVisibility(r5)
            goto L_0x0368
        L_0x0380:
            r11 = 0
            r1.setImageDrawable(r11)
            r3.setText(r12)
            boolean r12 = r1 instanceof com.whatsapp.wds.components.profilephoto.WDSProfilePhoto
            if (r12 == 0) goto L_0x0392
            r0 = r1
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r0 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r0
            r0.setProfileBadge(r11)
            goto L_0x0377
        L_0x0392:
            android.widget.ImageView r0 = r9.A0B
            r0.setVisibility(r6)
            goto L_0x0377
        L_0x0398:
            android.content.Context r2 = r9.A07
            r0 = 2130969996(0x7f04058c, float:1.754869E38)
            int r0 = X.AnonymousClass34K.A01(r2, r0)
            X.AnonymousClass0x2.A0q(r2, r4, r0)
            android.widget.TextView r3 = r9.A0D
            r3.setVisibility(r6)
            r11.A06(r12)
            goto L_0x00be
        L_0x03ae:
            r1.setVisibility(r6)
            goto L_0x00a2
        L_0x03b3:
            X.3Ex r1 = X.C64333Db.A26(r26)
            com.whatsapp.jid.UserJid r0 = r9.A06
            X.3ZH r1 = r1.A0A(r0)
            X.5ZU r0 = X.C64333Db.A28(r26)
            java.lang.String r2 = r0.A0L(r1)
            X.5YB r11 = r9.A0G
            r0 = r36
            r11.A0B(r0, r2)
            android.widget.FrameLayout r0 = r9.A09
            r0.setVisibility(r6)
            android.content.Context r1 = r9.A07
            r0 = 2131894320(0x7f122030, float:1.9423441E38)
            java.lang.String r0 = X.AnonymousClass0x2.A0X(r1, r2, r12, r0)
            com.whatsapp.TextEmojiLabel r4 = r11.A02
            r4.setContentDescription(r0)
            goto L_0x00a2
        L_0x03e1:
            java.util.Iterator r4 = r34.iterator()
        L_0x03e5:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0482
            java.lang.Object r3 = r4.next()
            r0 = 2131102502(0x7f060b26, float:1.7817444E38)
            int r0 = X.AnonymousClass0Y8.A04(r2, r0)
            X.C18280x3.A1D(r3, r5, r0)
            goto L_0x03e5
        L_0x03fa:
            if (r12 == 0) goto L_0x0482
            r12 = 0
            if (r11 == 0) goto L_0x043b
            r11 = 0
            r14 = 0
        L_0x0401:
            java.util.HashSet r13 = X.AnonymousClass0x9.A15(r33)
            java.util.HashSet r5 = X.AnonymousClass0x9.A15(r34)
            r4 = r1
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r4 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r4
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            r2 = 0
        L_0x0411:
            if (r2 >= r11) goto L_0x0474
            boolean r0 = X.AnonymousClass000.A1Y(r10, r7)
            if (r0 == 0) goto L_0x0427
            boolean r0 = X.C86624Kv.A1a(r13, r2)
            if (r0 == 0) goto L_0x0427
            X.593 r0 = X.AnonymousClass593.ERROR
        L_0x0421:
            r3.add(r0)
            int r2 = r2 + 1
            goto L_0x0411
        L_0x0427:
            boolean r0 = X.AnonymousClass000.A1Y(r10, r7)
            if (r0 == 0) goto L_0x0436
            boolean r0 = X.C86624Kv.A1a(r5, r2)
            if (r0 == 0) goto L_0x0436
        L_0x0433:
            X.593 r0 = X.AnonymousClass593.UNSEEN
            goto L_0x0421
        L_0x0436:
            if (r2 < r14) goto L_0x0433
            X.593 r0 = X.AnonymousClass593.SEEN
            goto L_0x0421
        L_0x043b:
            int r11 = r27.A02()
            r0 = 32
            if (r11 <= r0) goto L_0x046f
            int r0 = r27.A03()
            if (r0 > 0) goto L_0x046c
            int r0 = r34.size()
            if (r0 > 0) goto L_0x046c
            int r0 = r33.size()
            if (r0 <= 0) goto L_0x0469
            X.593 r3 = X.AnonymousClass593.ERROR
        L_0x0457:
            r2 = r1
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r2 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r2
            int r0 = r27.A02()
            boolean r0 = X.AnonymousClass001.A1W(r0)
            r2.setStatusIndicatorEnabled(r0)
            X.AnonymousClass576.A00(r2, r3)
            goto L_0x0482
        L_0x0469:
            X.593 r3 = X.AnonymousClass593.SEEN
            goto L_0x0457
        L_0x046c:
            X.593 r3 = X.AnonymousClass593.UNSEEN
            goto L_0x0457
        L_0x046f:
            int r14 = r27.A03()
            goto L_0x0401
        L_0x0474:
            X.577 r0 = new X.577
            r0.<init>(r3)
            r4.setProfileStatus(r0)
            if (r11 <= 0) goto L_0x047f
            r12 = 1
        L_0x047f:
            r4.setStatusIndicatorEnabled(r12)
        L_0x0482:
            boolean r2 = X.AnonymousClass000.A1Y(r10, r7)
            X.5Se r0 = X.C86634Kw.A0s(r26)
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x054c
            if (r2 == 0) goto L_0x053d
            if (r8 == 0) goto L_0x053d
            android.view.View r0 = r9.A02
            if (r0 != 0) goto L_0x04a6
            android.view.View r2 = r9.A0H
            r0 = 2131429229(0x7f0b076d, float:1.8480125E38)
            android.view.View r0 = X.C86614Ku.A0F(r2, r0)
            r9.A02 = r0
            r0.setVisibility(r6)
        L_0x04a6:
            android.view.View r0 = r9.A05
            if (r0 != 0) goto L_0x04b8
            android.view.View r2 = r9.A0H
            r0 = 2131429233(0x7f0b0771, float:1.8480133E38)
            android.view.View r0 = X.C86614Ku.A0F(r2, r0)
            r9.A05 = r0
            r0.setVisibility(r6)
        L_0x04b8:
            X.5Se r0 = X.C86634Kw.A0s(r26)
            X.1VX r2 = r0.A01
            X.2vE r3 = X.C58422vE.A01
            r0 = 6759(0x1a67, float:9.471E-42)
            boolean r0 = r2.A0Y(r3, r0)
            if (r0 == 0) goto L_0x04da
            android.view.View r0 = r9.A03
            if (r0 != 0) goto L_0x04da
            android.view.View r2 = r9.A0H
            r0 = 2131429231(0x7f0b076f, float:1.8480129E38)
            android.view.View r0 = X.C86614Ku.A0F(r2, r0)
            r9.A03 = r0
            r0.setVisibility(r6)
        L_0x04da:
            X.5Se r0 = X.C86634Kw.A0s(r26)
            X.1VX r2 = r0.A01
            r0 = 6456(0x1938, float:9.047E-42)
            boolean r0 = r2.A0Y(r3, r0)
            if (r0 == 0) goto L_0x04fa
            android.view.View r0 = r9.A04
            if (r0 != 0) goto L_0x04fa
            android.view.View r2 = r9.A0H
            r0 = 2131429230(0x7f0b076e, float:1.8480127E38)
            android.view.View r0 = X.C86614Ku.A0F(r2, r0)
            r9.A04 = r0
            r0.setVisibility(r6)
        L_0x04fa:
            r0 = r26
            X.3Db r0 = r0.AcK
            X.5bk r2 = r0.A00
            X.4C1 r0 = r2.ACM
            X.8qC r0 = X.C72343dZ.A00(r0)
            java.lang.Object r4 = r0.get()
            X.5YA r4 = (X.AnonymousClass5YA) r4
            X.4C1 r0 = r2.ACM
            X.8qC r0 = X.C72343dZ.A00(r0)
            java.lang.Object r3 = r0.get()
            X.5YA r3 = (X.AnonymousClass5YA) r3
            X.5Se r0 = X.C86634Kw.A0s(r26)
            X.5qs r2 = new X.5qs
            r2.<init>(r9, r3, r0)
            X.8qC r0 = r4.A08
            java.lang.Object r0 = r0.get()
            X.5Tr r0 = (X.C105125Tr) r0
            r0.A00 = r2
        L_0x052b:
            android.view.View r3 = r1.getRootView()
            android.view.View r2 = r1.getRootView()
            r1 = 3
            X.67b r0 = new X.67b
            r0.<init>(r3, r1, r9)
            X.C06560Yg.A0O(r2, r0)
            return r17
        L_0x053d:
            android.view.View r0 = r9.A02
            if (r0 == 0) goto L_0x0544
            r0.setVisibility(r6)
        L_0x0544:
            android.view.View r0 = r9.A05
            if (r0 == 0) goto L_0x052b
            r0.setVisibility(r6)
            goto L_0x052b
        L_0x054c:
            r0 = r26
            X.4C1 r0 = r0.A7Q
            X.8qC r0 = X.C72343dZ.A00(r0)
            r0.get()
            goto L_0x052b
        L_0x0558:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C115805pG.BEK(android.content.Context, android.view.View, android.view.ViewGroup, X.5Uq, java.util.List, java.util.List, java.util.List, java.util.List, boolean):android.view.View");
    }

    public C115805pG(C623534r r1) {
        this.A01 = r1;
    }
}
