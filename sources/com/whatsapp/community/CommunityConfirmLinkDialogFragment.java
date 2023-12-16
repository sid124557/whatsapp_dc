package com.whatsapp.community;

import X.AnonymousClass001;
import X.AnonymousClass58H;
import X.AnonymousClass5ZU;
import X.AnonymousClass66R;
import X.C154517dI;
import X.C162457s7;
import X.C370220q;
import X.C56982ss;
import X.C80193xq;
import X.C81343zj;
import X.C84374Cc;
import android.content.Context;

public final class CommunityConfirmLinkDialogFragment extends Hilt_CommunityConfirmLinkDialogFragment {
    public C84374Cc A00;
    public AnonymousClass5ZU A01;
    public C56982ss A02;
    public final AnonymousClass66R A03;
    public final AnonymousClass66R A04;

    public void A1G(Context context) {
        C162457s7.A0J(context, 0);
        super.A1G(context);
        if (context instanceof C84374Cc) {
            this.A00 = (C84374Cc) context;
            return;
        }
        throw AnonymousClass001.A0e("NewCommunityConfirmLinkDialogFragment requires a Listener as it's host");
    }

    public CommunityConfirmLinkDialogFragment() {
        AnonymousClass58H r2 = AnonymousClass58H.NONE;
        this.A04 = C154517dI.A00(r2, new C80193xq(this));
        this.A03 = C154517dI.A00(r2, new C81343zj(this, C370220q.DIRECT_LINK));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007a, code lost:
        if (r3 == X.C370220q.GROUP_UPGRADE) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A1J(android.os.Bundle r10) {
        /*
            r9 = this;
            X.0zH r6 = X.C18300x5.A0M(r9)
            X.66R r7 = r9.A04
            java.lang.Object r0 = r7.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r0.iterator()
        L_0x0014:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0033
            X.4uZ r1 = X.C18300x5.A0P(r2)
            X.2ss r0 = r9.A02
            if (r0 == 0) goto L_0x002c
            java.lang.String r0 = r0.A0D(r1)
            if (r0 == 0) goto L_0x0014
            r8.add(r0)
            goto L_0x0014
        L_0x002c:
            java.lang.String r0 = "chatsCache"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0033:
            int r1 = r8.size()
            r4 = 0
            r0 = 1
            if (r1 != r0) goto L_0x00c3
            android.content.Context r3 = r9.A0G()
            r2 = 2131890420(0x7f1210f4, float:1.9415531E38)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Object r0 = r8.get(r4)
            java.lang.String r0 = X.AnonymousClass002.A0F(r3, r0, r1, r4, r2)
        L_0x004c:
            X.C162457s7.A0G(r0)
            r6.setTitle(r0)
            android.content.Context r2 = r9.A1D()
            r1 = 2131624759(0x7f0e0337, float:1.8876707E38)
            r0 = 0
            android.view.View r5 = android.view.View.inflate(r2, r1, r0)
            r0 = 2131430997(0x7f0b0e55, float:1.848371E38)
            android.widget.TextView r4 = X.AnonymousClass002.A09(r5, r0)
            X.66R r8 = r9.A03
            java.lang.Object r3 = r8.getValue()
            X.1VX r2 = r9.A02
            r1 = 5021(0x139d, float:7.036E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x007c
            X.20q r0 = X.C370220q.GROUP_UPGRADE
            r1 = 1
            if (r3 != r0) goto L_0x007d
        L_0x007c:
            r1 = 0
        L_0x007d:
            android.content.res.Resources r3 = X.C18290x4.A0G(r4)
            java.lang.Object r2 = r8.getValue()
            X.20q r0 = X.C370220q.SUGGEST
            if (r1 == 0) goto L_0x00ba
            r1 = 2131755172(0x7f1000a4, float:1.9141216E38)
            if (r2 != r0) goto L_0x0091
            r1 = 2131755343(0x7f10014f, float:1.9141563E38)
        L_0x0091:
            java.lang.Object r0 = r7.getValue()
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            java.lang.CharSequence r0 = r3.getQuantityText(r1, r0)
            r4.setText(r0)
            r6.setView(r5)
            r1 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r0 = 39
            X.C85804Hr.A00(r6, r9, r0, r1)
            r1 = 2131891394(0x7f1214c2, float:1.9417507E38)
            r0 = 40
            X.C85804Hr.A01(r6, r9, r0, r1)
            X.043 r0 = X.C18300x5.A0H(r6)
            return r0
        L_0x00ba:
            r1 = 2131755171(0x7f1000a3, float:1.9141214E38)
            if (r2 != r0) goto L_0x0091
            r1 = 2131755342(0x7f10014e, float:1.914156E38)
            goto L_0x0091
        L_0x00c3:
            r5 = 2
            if (r1 != r5) goto L_0x00d8
            android.content.Context r2 = r9.A0G()
            r1 = 2131890421(0x7f1210f5, float:1.9415533E38)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            X.C18280x3.A1M(r8, r0)
            java.lang.String r0 = r2.getString(r1, r0)
            goto L_0x004c
        L_0x00d8:
            r0 = 3
            android.content.res.Resources r4 = X.C08310eF.A09(r9)
            if (r1 < r0) goto L_0x00f8
            r3 = 2131755169(0x7f1000a1, float:1.914121E38)
            int r2 = X.AnonymousClass0x9.A03(r8, r5)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            X.C18280x3.A1M(r8, r1)
            int r0 = X.AnonymousClass0x9.A03(r8, r5)
            X.AnonymousClass000.A1P(r1, r0, r5)
            java.lang.String r0 = r4.getQuantityString(r3, r2, r1)
            goto L_0x004c
        L_0x00f8:
            r1 = 2131755170(0x7f1000a2, float:1.9141212E38)
            java.lang.Object r0 = r7.getValue()
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            java.lang.String r0 = r4.getQuantityString(r1, r0)
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.CommunityConfirmLinkDialogFragment.A1J(android.os.Bundle):android.app.Dialog");
    }
}
