package X;

import android.text.SpannableString;
import android.text.TextUtils;
import java.math.BigDecimal;

/* renamed from: X.5XF  reason: invalid class name */
public class AnonymousClass5XF {
    public final C116985rC A00;
    public final C64393Dh A01;
    public final C69263Wi A02;
    public final C56972sr A03;
    public final C621033m A04;
    public final C105145Tt A05;
    public final C56612sH A06;
    public final AnonymousClass5ZR A07;
    public final C620733j A08;
    public final C105255Ue A09;
    public final C55832qz A0A;
    public final AnonymousClass4FS A0B;

    public SpannableString A00(C30771mz r8) {
        String str;
        if (r8.A0A == null || TextUtils.isEmpty(r8.A03)) {
            str = r8.A04;
            if (str == null) {
                return null;
            }
        } else {
            C160617ny r5 = new C160617ny(r8.A03);
            BigDecimal bigDecimal = r8.A0B;
            BigDecimal bigDecimal2 = r8.A0A;
            C620733j r2 = this.A08;
            str = r5.A04(r2, bigDecimal2, true);
            if (!(bigDecimal == null || BigDecimal.ZERO.compareTo(bigDecimal) == 0 || bigDecimal.compareTo(bigDecimal2) >= 0)) {
                return C106945aQ.A02(str, r5.A04(r2, bigDecimal, true));
            }
        }
        return AnonymousClass4L0.A0A(str);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x000e: MOVE  (r3v0 int) = (r31v0 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0106  */
    public void A01(X.C89654ea r25, X.C152967aS r26, X.C95814uZ r27, com.whatsapp.jid.UserJid r28, java.util.List r29, int r30, int r31, long r32) {
        /*
            r24 = this;
            r5 = r29
            if (r29 == 0) goto L_0x00fc
            int r0 = r5.size()
            if (r0 == 0) goto L_0x00fc
            int r0 = r5.size()
            r3 = r31
            if (r3 >= r0) goto L_0x00fc
            r14 = r24
            r4 = r30
            if (r31 != 0) goto L_0x010e
            r0 = 1
            if (r4 == r0) goto L_0x010a
            r0 = 3
            if (r4 != r0) goto L_0x010e
            java.lang.String r7 = "Forward"
        L_0x0020:
            X.5Ue r6 = r14.A09
            r1 = 774779800(0x2e2e3398, float:3.9608844E-11)
            java.lang.String r0 = "CatalogUtils"
            java.lang.String r2 = "send_product_message_tag"
            r6.A02(r1, r2, r0)
            int r0 = r5.size()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "ProductsCount"
            r6.A05(r2, r0, r1)
            java.lang.String r0 = "EntryPoint"
            r6.A05(r2, r0, r7)
            r12 = 1
        L_0x003f:
            r0 = 1
            if (r4 == r0) goto L_0x0106
            r0 = 2
            r7 = 55
            if (r4 == r0) goto L_0x0049
            r7 = 66
        L_0x0049:
            X.5ZR r0 = r14.A07
            boolean r0 = r0.A0E()
            r13 = r25
            if (r0 != 0) goto L_0x0103
            r6 = 2131892498(0x7f121912, float:1.9419746E38)
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            r1 = 2131892497(0x7f121911, float:1.9419744E38)
            if (r2 < r0) goto L_0x0069
            r0 = 33
            r1 = 2131892500(0x7f121914, float:1.941975E38)
            if (r2 >= r0) goto L_0x0069
            r1 = 2131892499(0x7f121913, float:1.9419748E38)
        L_0x0069:
            com.whatsapp.RequestPermissionActivity.A0c(r13, r6, r1, r7)
            r0 = 0
        L_0x006d:
            r2 = 0
            java.lang.String r7 = "send_product_message_tag"
            if (r0 == 0) goto L_0x0111
            java.lang.Object r15 = r5.get(r3)
            X.5dw r15 = (X.C109015dw) r15
            boolean r0 = r15.A0H
            if (r0 == 0) goto L_0x0111
            X.2sr r0 = r14.A03
            r6 = r28
            boolean r0 = r0.A0a(r6)
            if (r0 == 0) goto L_0x00bc
            X.5Tt r1 = r14.A05
            java.lang.String r10 = r15.A0F
            r11 = 34
            X.5ZC r9 = r1.A09
            java.lang.String r0 = r1.A02
            boolean r0 = r9.A01(r0)
            if (r0 == 0) goto L_0x00bc
            X.4sZ r8 = new X.4sZ
            r8.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r8.A02 = r0
            java.lang.String r0 = r1.A02
            r8.A06 = r0
            r8.A0A = r10
            java.util.concurrent.atomic.AtomicInteger r0 = r1.A0C
            int r0 = r0.get()
            if (r0 == 0) goto L_0x00b5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.A03 = r0
        L_0x00b5:
            X.4FV r1 = r1.A07
            int r0 = r9.A01
            r1.BhE(r8, r0)
        L_0x00bc:
            if (r12 == 0) goto L_0x00cb
            X.5Ue r0 = r14.A09
            X.316 r1 = X.C105255Ue.A00(r0, r7)
            if (r1 != 0) goto L_0x00fd
            java.lang.String r0 = "BizQPLManager/startImageUploadBlock/pref tracker not found. Have you called startPrefTracker()?"
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x00cb:
            java.util.List r0 = r15.A07
            java.lang.Object r2 = r0.get(r2)
            X.5db r2 = (X.C108815db) r2
            X.5is r12 = new X.5is
            r16 = r26
            r17 = r27
            r22 = r32
            r20 = r3
            r21 = r4
            r18 = r6
            r19 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.5in r1 = new X.5in
            r1.<init>(r13, r5, r3)
            X.5io r0 = new X.5io
            r0.<init>(r13, r14)
            r4 = 0
            r10 = 3
            r3 = r16
            r5 = r2
            r6 = r1
            r7 = r4
            r8 = r0
            r9 = r12
            r3.A01(r4, r5, r6, r7, r8, r9, r10)
        L_0x00fc:
            return
        L_0x00fd:
            java.lang.String r0 = "image_upload"
            r1.A0A(r0)
            goto L_0x00cb
        L_0x0103:
            r0 = 1
            goto L_0x006d
        L_0x0106:
            r7 = 44
            goto L_0x0049
        L_0x010a:
            java.lang.String r7 = "Attachment"
            goto L_0x0020
        L_0x010e:
            r12 = 0
            goto L_0x003f
        L_0x0111:
            X.5Ue r0 = r14.A09
            r0.A06(r7, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5XF.A01(X.4ea, X.7aS, X.4uZ, com.whatsapp.jid.UserJid, java.util.List, int, int, long):void");
    }

    public AnonymousClass5XF(C116985rC r1, C64393Dh r2, C69263Wi r3, C56972sr r4, C621033m r5, C105145Tt r6, C56612sH r7, AnonymousClass5ZR r8, C620733j r9, C105255Ue r10, C55832qz r11, AnonymousClass4FS r12) {
        this.A06 = r7;
        this.A02 = r3;
        this.A03 = r4;
        this.A0B = r12;
        this.A01 = r2;
        this.A04 = r5;
        this.A09 = r10;
        this.A00 = r1;
        this.A08 = r9;
        this.A0A = r11;
        this.A07 = r8;
        this.A05 = r6;
    }
}
