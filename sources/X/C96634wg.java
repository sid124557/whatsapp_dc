package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.4wg  reason: invalid class name and case insensitive filesystem */
public class C96634wg extends AnonymousClass6mM {
    public final TextEmojiLabel A00;
    public final C105085Tn A01;
    public final AnonymousClass5OH A02;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r2 == r1) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A09(java.lang.Object r15) {
        /*
            r14 = this;
            X.4w8 r15 = (X.C96294w8) r15
            X.5Tn r0 = r14.A01
            X.5ZO r0 = r0.A01()
            if (r0 == 0) goto L_0x0013
            X.6wQ r2 = r15.A01
            X.6wQ r1 = X.C141966wQ.SECURITY_FOOTER
            r0 = 2131886700(0x7f12026c, float:1.9407986E38)
            if (r2 != r1) goto L_0x0016
        L_0x0013:
            r0 = 2131886699(0x7f12026b, float:1.9407984E38)
        L_0x0016:
            com.whatsapp.TextEmojiLabel r12 = r14.A00
            X.5OH r2 = r14.A02
            android.view.View r1 = r14.A0H
            java.lang.String r0 = X.C86624Kv.A0b(r1, r0)
            X.AnonymousClass5V5.A01(r12, r2, r0)
            android.content.Context r11 = r1.getContext()
            java.lang.CharSequence r0 = r12.getText()
            android.view.View$OnClickListener r13 = r15.A00
            java.lang.String r10 = "clear-search-location"
            android.text.SpannableStringBuilder r9 = X.C18330xA.A00(r0)
            int r1 = r9.length()
            java.lang.Class<android.text.style.URLSpan> r0 = android.text.style.URLSpan.class
            r8 = 0
            java.lang.Object[] r7 = r9.getSpans(r8, r1, r0)
            android.text.style.URLSpan[] r7 = (android.text.style.URLSpan[]) r7
            if (r7 == 0) goto L_0x0079
            int r6 = r7.length
        L_0x0043:
            if (r8 >= r6) goto L_0x0076
            r5 = r7[r8]
            java.lang.String r0 = r5.getURL()
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0073
            int r4 = r9.getSpanStart(r5)
            int r3 = r9.getSpanEnd(r5)
            int r2 = r9.getSpanFlags(r5)
            X.8zq r0 = new X.8zq
            r0.<init>((android.content.Context) r11, (android.view.View.OnClickListener) r13)
            r9.setSpan(r0, r4, r3, r2)
            r1 = 2132083075(0x7f150183, float:1.9806282E38)
            android.text.style.TextAppearanceSpan r0 = new android.text.style.TextAppearanceSpan
            r0.<init>(r11, r1)
            r9.setSpan(r0, r4, r3, r2)
            r9.removeSpan(r5)
        L_0x0073:
            int r8 = r8 + 1
            goto L_0x0043
        L_0x0076:
            r12.setText(r9)
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96634wg.A09(java.lang.Object):void");
    }

    public C96634wg(View view, C105085Tn r3, AnonymousClass5OH r4) {
        super(view);
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = AnonymousClass0x7.A0K(view, R.id.privacy_description);
    }
}
