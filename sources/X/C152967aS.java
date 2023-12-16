package X;

import android.widget.ImageView;
import java.io.File;
import java.util.Set;

/* renamed from: X.7aS  reason: invalid class name and case insensitive filesystem */
public class C152967aS {
    public boolean A00 = false;
    public final C151257Ua A01;
    public final AnonymousClass7SV A02;
    public final Set A03;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ae, code lost:
        if (r23 != null) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(android.widget.ImageView r20, X.C108815db r21, X.C181758nH r22, X.C148087Gw r23, X.C181768nI r24, X.C181778nJ r25, int r26) {
        /*
            r19 = this;
            r4 = 0
            r3 = r19
            r5 = r23
            if (r23 == 0) goto L_0x00ad
            X.7Cg r0 = r5.A00
            if (r0 == 0) goto L_0x00ad
            X.7SV r4 = r3.A02
            int r1 = r0.A00
            X.2pA r0 = r4.A00
            int r0 = r0.A00(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.concurrent.ConcurrentHashMap r0 = r4.A01
            r0.put(r2, r1)
        L_0x0022:
            com.whatsapp.jid.UserJid r4 = r5.A01
        L_0x0024:
            X.8Ef r10 = new X.8Ef
            r0 = r25
            r10.<init>(r0, r3, r4, r2)
            r0 = 0
            X.90S r8 = new X.90S
            r1 = r22
            r8.<init>(r1, r0, r3)
            X.8Ec r9 = new X.8Ec
            r7 = r21
            r14 = r24
            r11 = r26
            r12 = r9
            r13 = r7
            r15 = r3
            r16 = r4
            r17 = r2
            r18 = r11
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r12 = 2147483647(0x7fffffff, float:NaN)
            X.8EI r5 = new X.8EI
            r6 = r20
            r13 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r0 = r5.BE7()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x006f
            if (r24 == 0) goto L_0x006e
            if (r4 == 0) goto L_0x006b
            if (r2 == 0) goto L_0x006b
            X.7SV r1 = r3.A02
            int r0 = r2.intValue()
            r1.A00(r4, r0)
        L_0x006b:
            r14.BVU(r5)
        L_0x006e:
            return
        L_0x006f:
            X.7Ua r4 = r3.A01
            X.1LX r0 = r4.A02
            if (r0 == 0) goto L_0x006e
            android.widget.ImageView r3 = r5.B8H()
            if (r3 == 0) goto L_0x00a6
            r1 = 2131430680(0x7f0b0d18, float:1.8483068E38)
            X.5db r0 = r5.A05
            java.lang.String r0 = r0.A04
            r3.setTag(r1, r0)
            r1 = 2131430684(0x7f0b0d1c, float:1.8483076E38)
            int r0 = r5.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.setTag(r1, r0)
            java.lang.String r2 = r5.BE7()
            r1 = 2131431075(0x7f0b0ea3, float:1.8483869E38)
            java.lang.Object r0 = r3.getTag(r1)
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00a6
            r0 = 0
            r3.setTag(r1, r0)
        L_0x00a6:
            X.1LX r1 = r4.A02
            r0 = 1
            r1.A02(r5, r0)
            return
        L_0x00ad:
            r2 = r4
            if (r23 == 0) goto L_0x0024
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C152967aS.A01(android.widget.ImageView, X.5db, X.8nH, X.7Gw, X.8nI, X.8nJ, int):void");
    }

    public void A02(ImageView imageView, C108815db r10, C181758nH r11, C181778nJ r12, int i) {
        A01(imageView, r10, r11, (C148087Gw) null, (C181768nI) null, r12, i);
    }

    public void A00() {
        AnonymousClass1LX r1;
        if (!this.A00) {
            Set<AnonymousClass8EI> set = this.A03;
            for (AnonymousClass8EI A002 : set) {
                this.A01.A00(A002);
            }
            set.clear();
            C151257Ua r2 = this.A01;
            int i = r2.A00 - 1;
            r2.A00 = i;
            if (i == 0 && (r1 = r2.A02) != null) {
                r1.A03(false);
                r2.A02 = null;
            }
            this.A00 = true;
        }
    }

    public C152967aS(C151257Ua r13, AnonymousClass7SV r14) {
        this.A01 = r13;
        this.A02 = r14;
        this.A03 = AnonymousClass002.A0K();
        if (r13.A00 == 0) {
            File A0A = AnonymousClass002.A0A(r13.A06.A00.getCacheDir(), "product_catalog_images");
            AnonymousClass8ED r3 = new AnonymousClass8ED(r13.A01);
            AnonymousClass1LX r0 = new AnonymousClass1LX(r13.A03, r13.A04, r3, r13.A05, r13.A07, r13.A08, r13.A09, r13.A0A, A0A, "catalog-imager", 4);
            r13.A02 = r0;
            r3.A00 = r0;
        }
        r13.A00++;
    }

    public void finalize() {
        super.finalize();
    }
}
