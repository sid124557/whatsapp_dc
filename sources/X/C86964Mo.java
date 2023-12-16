package X;

import android.text.method.LinkMovementMethod;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.4Mo  reason: invalid class name and case insensitive filesystem */
public class C86964Mo extends LinkMovementMethod {
    public AnonymousClass8r4 A00;
    public Runnable A01 = null;
    public final AnonymousClass1VX A02;

    public static void A00(AnonymousClass1VX r1, TextEmojiLabel textEmojiLabel) {
        textEmojiLabel.setLinkHandler(new C86964Mo(r1));
        textEmojiLabel.setAutoLinkMask(0);
        textEmojiLabel.setLinksClickable(false);
        textEmojiLabel.setFocusable(false);
        textEmojiLabel.setClickable(false);
        textEmojiLabel.setLongClickable(false);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.widget.TextView r22, android.text.Spannable r23, android.view.MotionEvent r24) {
        /*
            r21 = this;
            r18 = r24
            int r7 = r18.getAction()
            r0 = 3
            r6 = r21
            r20 = r22
            if (r7 != r0) goto L_0x0018
            X.8r4 r2 = r6.A00
            if (r2 == 0) goto L_0x0018
            r1 = r18
            r0 = r20
            r2.BeF(r1, r0)
        L_0x0018:
            r5 = 1
            r9 = 0
            if (r7 == r5) goto L_0x001f
            if (r7 == 0) goto L_0x001f
        L_0x001e:
            return r9
        L_0x001f:
            float r0 = r18.getX()
            int r12 = (int) r0
            int r0 = r20.getTotalPaddingLeft()
            int r12 = r12 - r0
            int r0 = r20.getScrollX()
            int r12 = r12 + r0
            float r0 = r18.getY()
            int r1 = (int) r0
            int r0 = r20.getTotalPaddingTop()
            int r1 = r1 - r0
            int r0 = r20.getScrollY()
            int r1 = r1 + r0
            android.text.Layout r11 = r20.getLayout()
            int r10 = r11.getLineForVertical(r1)
            int r8 = r11.getLineStart(r10)
            int r4 = r11.getLineEnd(r10)
            java.lang.Class<X.8r4> r17 = X.AnonymousClass8r4.class
            r19 = r23
            r1 = r17
            r0 = r19
            java.lang.Object[] r3 = r0.getSpans(r8, r4, r1)
            X.8r4[] r3 = (X.AnonymousClass8r4[]) r3
            int r0 = r3.length
            r16 = r0
            if (r0 == 0) goto L_0x001e
            int r14 = r4 - r8
            java.lang.String r13 = "/"
            java.lang.String r2 = "linktouchmovementmethod/"
            r0 = 256(0x100, float:3.59E-43)
            if (r14 > r0) goto L_0x0093
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            X.C18270x1.A19(r2, r13, r0, r14)
            r0.append(r9)
        L_0x0074:
            X.AnonymousClass0x2.A18(r0)
            X.1VX r1 = r6.A02
            r0 = 6823(0x1aa7, float:9.561E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x00dc
            float r1 = (float) r12
            float r0 = r11.getLineLeft(r10)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x001e
            float r0 = r11.getLineRight(r10)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00dc
            return r9
        L_0x0093:
            r1 = 0
        L_0x0094:
            if (r8 >= r4) goto L_0x00d1
            r0 = r19
            char r15 = r0.charAt(r8)     // Catch:{ all -> 0x0103 }
            r0 = 8206(0x200e, float:1.1499E-41)
            if (r15 == r0) goto L_0x00bc
            r0 = 8207(0x200f, float:1.15E-41)
            if (r15 == r0) goto L_0x00bc
            r0 = 1564(0x61c, float:2.192E-42)
            if (r15 == r0) goto L_0x00bc
            r0 = 1807(0x70f, float:2.532E-42)
            if (r15 == r0) goto L_0x00bc
            r0 = 8234(0x202a, float:1.1538E-41)
            if (r15 < r0) goto L_0x00ce
            r0 = 8238(0x202e, float:1.1544E-41)
            if (r15 <= r0) goto L_0x00bc
            r0 = 8294(0x2066, float:1.1622E-41)
            if (r15 < r0) goto L_0x00ce
            r0 = 8297(0x2069, float:1.1627E-41)
            if (r15 > r0) goto L_0x00ce
        L_0x00bc:
            int r1 = r1 + 1
            r0 = 256(0x100, float:3.59E-43)
            if (r1 <= r0) goto L_0x00ce
            java.lang.StringBuilder r0 = X.C18270x1.A0W(r14, r2)
            X.C18260x0.A0w(r13, r0, r1)
            r0 = r16
            if (r0 <= r5) goto L_0x00eb
            return r9
        L_0x00ce:
            int r8 = r8 + 1
            goto L_0x0094
        L_0x00d1:
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            X.C18270x1.A19(r2, r13, r0, r14)
            r0.append(r1)
            goto L_0x0074
        L_0x00dc:
            float r0 = (float) r12
            int r2 = r11.getOffsetForHorizontal(r10, r0)
            r1 = r17
            r0 = r19
            java.lang.Object[] r3 = r0.getSpans(r2, r2, r1)
            X.8r4[] r3 = (X.AnonymousClass8r4[]) r3
        L_0x00eb:
            int r0 = r3.length
            if (r0 == 0) goto L_0x001e
            java.lang.Runnable r0 = r6.A01
            if (r0 == 0) goto L_0x00f7
            if (r7 != r5) goto L_0x00f7
            r0.run()
        L_0x00f7:
            r2 = r3[r9]
            r6.A00 = r2
            r1 = r18
            r0 = r20
            r2.BeF(r1, r0)
            return r5
        L_0x0103:
            r3 = move-exception
            java.lang.StringBuilder r0 = X.C18270x1.A0W(r14, r2)
            X.C18260x0.A0w(r13, r0, r1)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86964Mo.onTouchEvent(android.widget.TextView, android.text.Spannable, android.view.MotionEvent):boolean");
    }

    public C86964Mo(AnonymousClass1VX r2) {
        this.A02 = r2;
    }
}
