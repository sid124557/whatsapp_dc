package com.whatsapp.product.newsletterenforcements.newsletterguidelines;

import X.AnonymousClass1VX;
import X.AnonymousClass340;
import X.AnonymousClass66R;
import X.C106715a2;
import X.C154517dI;
import X.C162457s7;
import X.C53602nM;
import X.C79293wO;
import X.C79303wP;
import X.C79313wQ;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

public final class NewsletterGuidelinesFragment extends Hilt_NewsletterGuidelinesFragment {
    public C53602nM A00;
    public AnonymousClass1VX A01;
    public C106715a2 A02;
    public final AnonymousClass66R A03 = AnonymousClass340.A00(this, "show-what-this-means-section");
    public final AnonymousClass66R A04 = AnonymousClass340.A00(this, "show-what-you-can-do-section");
    public final AnonymousClass66R A05 = AnonymousClass340.A00(this, "show-what-you-need-to-know-section");
    public final AnonymousClass66R A06 = C154517dI.A01(new C79293wO(this));
    public final AnonymousClass66R A07 = C154517dI.A01(new C79303wP(this));
    public final AnonymousClass66R A08 = C154517dI.A01(new C79313wQ(this));

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0153, code lost:
        if ((r2 instanceof X.C137396oc) != false) goto L_0x0155;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0w(android.os.Bundle r12, android.view.View r13) {
        /*
            r11 = this;
            r0 = 0
            X.C162457s7.A0J(r13, r0)
            r0 = 2131431743(0x7f0b113f, float:1.8485224E38)
            android.view.View r1 = X.C18290x4.A0M(r13, r0)
            X.66R r5 = r11.A03
            boolean r0 = X.C18270x1.A1V(r5)
            r3 = 0
            int r0 = X.AnonymousClass001.A08(r0)
            r1.setVisibility(r0)
            r0 = 2131431745(0x7f0b1141, float:1.8485228E38)
            android.view.View r1 = X.C18290x4.A0M(r13, r0)
            X.66R r4 = r11.A04
            boolean r0 = X.C18270x1.A1V(r4)
            int r0 = X.AnonymousClass001.A08(r0)
            r1.setVisibility(r0)
            r0 = 2131431747(0x7f0b1143, float:1.8485232E38)
            android.view.View r2 = X.C18290x4.A0M(r13, r0)
            X.66R r1 = r11.A05
            boolean r0 = X.C18270x1.A1V(r1)
            if (r0 != 0) goto L_0x003e
            r3 = 8
        L_0x003e:
            r2.setVisibility(r3)
            boolean r0 = X.C18270x1.A1V(r5)
            if (r0 == 0) goto L_0x005e
            r0 = 2131431744(0x7f0b1140, float:1.8485226E38)
            android.widget.TextView r3 = X.AnonymousClass002.A09(r13, r0)
            X.66R r0 = r11.A08
            java.lang.Object r2 = r0.getValue()
            boolean r0 = r2 instanceof X.C137386ob
            if (r0 == 0) goto L_0x015a
            r0 = 2131891082(0x7f12138a, float:1.9416874E38)
        L_0x005b:
            r3.setText(r0)
        L_0x005e:
            boolean r0 = X.C18270x1.A1V(r4)
            if (r0 == 0) goto L_0x0086
            r0 = 2131431746(0x7f0b1142, float:1.848523E38)
            android.widget.TextView r3 = X.AnonymousClass002.A09(r13, r0)
            X.66R r0 = r11.A08
            java.lang.Object r2 = r0.getValue()
            boolean r0 = r2 instanceof X.C137386ob
            if (r0 == 0) goto L_0x0111
            X.66R r0 = r11.A07
            boolean r2 = X.C18270x1.A1V(r0)
            r0 = 2131891021(0x7f12134d, float:1.941675E38)
            if (r2 == 0) goto L_0x0083
            r0 = 2131891086(0x7f12138e, float:1.9416882E38)
        L_0x0083:
            r3.setText(r0)
        L_0x0086:
            boolean r0 = X.C18270x1.A1V(r1)
            if (r0 == 0) goto L_0x0110
            r0 = 2131431784(0x7f0b1168, float:1.8485307E38)
            android.widget.TextView r6 = X.AnonymousClass002.A09(r13, r0)
            X.5a2 r4 = r11.A02
            if (r4 == 0) goto L_0x0189
            X.03q r3 = r11.A0Q()
            r2 = 2131891079(0x7f121387, float:1.9416868E38)
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r0 = 0
            java.lang.String r5 = "bottom-sheet-span"
            java.lang.String r1 = X.AnonymousClass0x7.A0n(r11, r5, r1, r0, r2)
            r0 = 44
            X.3bp r0 = X.C71263bp.A00(r11, r0)
            android.text.SpannableStringBuilder r0 = r4.A05(r3, r0, r1, r5)
            r6.setText(r0)
            X.1VX r0 = r11.A01
            if (r0 == 0) goto L_0x0184
            X.C18270x1.A0q(r6, r0)
            r0 = 2131431723(0x7f0b112b, float:1.8485183E38)
            android.widget.TextView r4 = X.AnonymousClass002.A09(r13, r0)
            X.5a2 r3 = r11.A02
            if (r3 == 0) goto L_0x017d
            X.03q r2 = r11.A0Q()
            r0 = 2131891077(0x7f121385, float:1.9416864E38)
            java.lang.String r1 = X.C18310x6.A0m(r11, r5, r0)
            r0 = 45
            X.3bp r0 = X.C71263bp.A00(r11, r0)
            android.text.SpannableStringBuilder r0 = r3.A05(r2, r0, r1, r5)
            r4.setText(r0)
            X.1VX r0 = r11.A01
            if (r0 == 0) goto L_0x0178
            X.C18270x1.A0q(r4, r0)
            r0 = 2131431735(0x7f0b1137, float:1.8485208E38)
            android.widget.TextView r4 = X.AnonymousClass002.A09(r13, r0)
            X.5a2 r3 = r11.A02
            if (r3 == 0) goto L_0x0171
            X.03q r2 = r11.A0Q()
            r0 = 2131891078(0x7f121386, float:1.9416866E38)
            java.lang.String r1 = X.C18310x6.A0m(r11, r5, r0)
            r0 = 46
            X.3bp r0 = X.C71263bp.A00(r11, r0)
            android.text.SpannableStringBuilder r0 = r3.A05(r2, r0, r1, r5)
            r4.setText(r0)
            X.1VX r0 = r11.A01
            if (r0 == 0) goto L_0x016c
            X.C18270x1.A0q(r4, r0)
        L_0x0110:
            return
        L_0x0111:
            boolean r0 = r2 instanceof X.C137406od
            if (r0 == 0) goto L_0x0151
            X.66R r0 = r11.A06
            boolean r0 = X.C18270x1.A1V(r0)
            if (r0 != 0) goto L_0x0155
            X.5a2 r5 = r11.A02
            if (r5 == 0) goto L_0x0195
            X.03q r6 = r11.A0Q()
            r4 = 2131889655(0x7f120df7, float:1.941398E38)
            java.lang.Object[] r2 = X.AnonymousClass002.A0L()
            r0 = 0
            java.lang.String r9 = "bottom-sheet-span"
            java.lang.String r8 = X.AnonymousClass0x7.A0n(r11, r9, r2, r0, r4)
            X.03q r0 = r11.A0Q()
            int r10 = X.C18290x4.A00(r0)
            r0 = 47
            X.3bp r7 = X.C71263bp.A00(r11, r0)
            android.text.SpannableStringBuilder r0 = r5.A06(r6, r7, r8, r9, r10)
            r3.setText(r0)
            X.1VX r0 = r11.A01
            if (r0 == 0) goto L_0x0190
            X.C18270x1.A0q(r3, r0)
            goto L_0x0086
        L_0x0151:
            boolean r0 = r2 instanceof X.C137396oc
            if (r0 == 0) goto L_0x0086
        L_0x0155:
            r0 = 2131891087(0x7f12138f, float:1.9416884E38)
            goto L_0x0083
        L_0x015a:
            boolean r0 = r2 instanceof X.C137406od
            if (r0 == 0) goto L_0x0163
            r0 = 2131889658(0x7f120dfa, float:1.9413986E38)
            goto L_0x005b
        L_0x0163:
            boolean r0 = r2 instanceof X.C137396oc
            if (r0 == 0) goto L_0x019c
            r0 = 2131891083(0x7f12138b, float:1.9416876E38)
            goto L_0x005b
        L_0x016c:
            java.lang.RuntimeException r0 = X.C18270x1.A0R()
            throw r0
        L_0x0171:
            java.lang.String r0 = "linkifier"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0178:
            java.lang.RuntimeException r0 = X.C18270x1.A0R()
            throw r0
        L_0x017d:
            java.lang.String r0 = "linkifier"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0184:
            java.lang.RuntimeException r0 = X.C18270x1.A0R()
            throw r0
        L_0x0189:
            java.lang.String r0 = "linkifier"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0190:
            java.lang.RuntimeException r0 = X.C18270x1.A0R()
            throw r0
        L_0x0195:
            java.lang.String r0 = "linkifier"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x019c:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.product.newsletterenforcements.newsletterguidelines.NewsletterGuidelinesFragment.A0w(android.os.Bundle, android.view.View):void");
    }
}
