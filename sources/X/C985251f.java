package X;

import android.content.Context;
import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.SerializableLocation;
import com.whatsapp.mediaview.PhotoView;
import com.whatsapp.newsletter.NewsletterLinkLauncher;

/* renamed from: X.51f  reason: invalid class name and case insensitive filesystem */
public final class C985251f extends C105395Ut {
    public AnonymousClass5NW A00;
    public boolean A01;
    public boolean A02;
    public final AnonymousClass1VX A03;
    public final C28071fd A04;
    public final C55852r1 A05;
    public final PhotoView A06;
    public final NewsletterLinkLauncher A07;
    public final AnonymousClass1n2 A08;
    public final C104835Sn A09;
    public final C33141sV A0A;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C985251f(X.C111095hX r12, X.C69263Wi r13, X.C620633i r14, X.C56612sH r15, X.C620733j r16, X.AnonymousClass1VX r17, X.C28071fd r18, X.C48132eP r19, X.C55852r1 r20, com.whatsapp.newsletter.NewsletterLinkLauncher r21, X.C624134x r22, X.C104035Pj r23, X.C33141sV r24) {
        /*
            r11 = this;
            r2 = r22
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r16
            r9 = r19
            r10 = r23
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0 = r17
            r11.A03 = r0
            r0 = r20
            r11.A05 = r0
            r0 = r18
            r11.A04 = r0
            r0 = r24
            r11.A0A = r0
            r0 = r21
            r11.A07 = r0
            X.1n2 r2 = (X.AnonymousClass1n2) r2
            r11.A08 = r2
            java.lang.String r1 = r2.A1w()
            X.4uZ r0 = r2.A0n()
            boolean r0 = r0 instanceof X.C135216kJ
            if (r0 == 0) goto L_0x005a
            r2 = 6750(0x1a5e, double:3.335E-320)
        L_0x0035:
            X.5Sn r0 = new X.5Sn
            r0.<init>(r15, r2)
            r11.A09 = r0
            android.content.Context r0 = r11.A03()
            X.4vW r1 = new X.4vW
            r1.<init>(r0, r11, r10)
            r0 = 0
            r1.A01 = r0
            r0 = 1
            r1.A0Y = r0
            r0 = 0
            r1.A0V = r0
            r1.setIsLongpressEnabled(r0)
            r0 = 2131433915(0x7f0b19bb, float:1.848963E38)
            r1.setId(r0)
            r11.A06 = r1
            return
        L_0x005a:
            X.2z0 r0 = r2.A1J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0082
            int r1 = X.AnonymousClass5VB.A00(r1)
            r0 = 89
            if (r1 < r0) goto L_0x0077
            java.lang.Integer r0 = X.AnonymousClass001.A0f()
        L_0x006c:
            long r2 = r0.longValue()
            r0 = 3000(0xbb8, double:1.482E-320)
            long r2 = r2 * r0
            r0 = 4500(0x1194, double:2.2233E-320)
            long r2 = r2 + r0
            goto L_0x0035
        L_0x0077:
            int r1 = r1 / r0
            double r0 = (double) r1
            double r0 = java.lang.Math.sqrt(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            goto L_0x006c
        L_0x0082:
            r2 = 4500(0x1194, double:2.2233E-320)
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C985251f.<init>(X.5hX, X.3Wi, X.33i, X.2sH, X.33j, X.1VX, X.1fd, X.2eP, X.2r1, com.whatsapp.newsletter.NewsletterLinkLauncher, X.34x, X.5Pj, X.1sV):void");
    }

    public long A02() {
        return this.A09.A00;
    }

    public void A07() {
        C105395Ut.A01(this.A09, this);
    }

    public void A08() {
        this.A09.A02();
        this.A02 = false;
    }

    public final void A0B(Context context, InteractiveAnnotation interactiveAnnotation) {
        AnonymousClass59N r7;
        Object obj = interactiveAnnotation.data;
        C162457s7.A0C(obj);
        Context context2 = context;
        if (obj instanceof SerializableLocation) {
            SerializableLocation serializableLocation = (SerializableLocation) obj;
            this.A04.A08(context2, serializableLocation.name, (String) null, serializableLocation.latitude, serializableLocation.longitude);
        } else if (obj instanceof C53042mS) {
            C53042mS r3 = (C53042mS) obj;
            C372721p r0 = r3.A02;
            boolean z = interactiveAnnotation.skipConfirmation;
            if (r0 != null) {
                int ordinal = r0.ordinal();
                if (ordinal == 0) {
                    r7 = AnonymousClass59N.FORWARDED_MESSAGE;
                } else if (ordinal == 1) {
                    r7 = AnonymousClass59N.STATUS_POST_TOOLTIP;
                } else if (ordinal != 2) {
                    return;
                } else {
                    if (z) {
                        r7 = AnonymousClass59N.STATUS_LINK_BUTTON;
                    } else {
                        r7 = AnonymousClass59N.STATUS_LINK_TOOLTIP;
                    }
                }
                this.A07.A03(context2, r3.A01, r7, 3, (long) r3.A00);
            }
        }
    }
}
