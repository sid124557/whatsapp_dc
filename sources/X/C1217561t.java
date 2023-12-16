package X;

import com.whatsapp.newsletter.NewsletterInfoActivity;

/* renamed from: X.61t  reason: invalid class name and case insensitive filesystem */
public final class C1217561t extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ NewsletterInfoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1217561t(NewsletterInfoActivity newsletterInfoActivity) {
        super(1);
        this.this$0 = newsletterInfoActivity;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r17) {
        /*
            r16 = this;
            r1 = r17
            X.5TC r1 = (X.AnonymousClass5TC) r1
            if (r1 == 0) goto L_0x014d
            r0 = r16
            com.whatsapp.newsletter.NewsletterInfoActivity r4 = r0.this$0
            r3 = 0
            r4.A5n(r3)
            X.3ZH r0 = r1.A02
            r4.A0S = r0
            com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout r0 = r4.A0L
            java.lang.String r7 = "rootLayout"
            if (r0 != 0) goto L_0x001d
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r7)
            throw r0
        L_0x001d:
            java.lang.String r5 = r1.A04
            r0.setTitleText(r5)
            com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout r2 = r4.A0L
            if (r2 != 0) goto L_0x002b
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r7)
            throw r0
        L_0x002b:
            boolean r0 = r1.A07
            r2.setTitleVerified(r0)
            X.5Tl r8 = r4.A0K
            if (r8 != 0) goto L_0x0079
            com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout r0 = r4.A0L
            if (r0 != 0) goto L_0x003d
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r7)
            throw r0
        L_0x003d:
            com.whatsapp.chatinfo.view.custom.NewsletterDetailsCard r10 = r0.A0I()
            if (r10 == 0) goto L_0x00b2
            r10.setVisibility(r3)
            X.5DZ r2 = r4.A0D
            if (r2 == 0) goto L_0x0084
            X.4sd r13 = r4.A0Y
            X.5sx r0 = r2.A00
            X.3Db r0 = r0.A03
            X.3Wi r9 = X.C64333Db.A04(r0)
            X.5sx r0 = r2.A00
            X.3Db r0 = r0.A03
            X.33i r11 = X.C64333Db.A2o(r0)
            X.33j r12 = X.C64333Db.A2t(r0)
            X.5bk r2 = r0.A00
            X.4C1 r0 = r2.A8E
            java.lang.Object r14 = r0.get()
            X.5m4 r14 = (X.C113835m4) r14
            X.4C1 r0 = r2.A8A
            java.lang.Object r15 = r0.get()
            X.5Pe r15 = (X.C103985Pe) r15
            X.5Tl r8 = new X.5Tl
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r4.A0K = r8
        L_0x0079:
            X.3ZH r0 = r4.A0S
            if (r0 != 0) goto L_0x008b
            java.lang.String r0 = "contact"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0084:
            java.lang.String r0 = "newsletterDetailsCardControllerFactory"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x008b:
            r8.A02(r0)
            X.5Tl r6 = r4.A0K
            if (r6 == 0) goto L_0x00b2
            r2 = 16
            X.5eW r0 = new X.5eW
            r0.<init>(r4, r2)
            com.whatsapp.chatinfo.view.custom.NewsletterDetailsCard r6 = r6.A02
            r6.setFollowUnfollowButton(r0)
            r2 = 17
            X.5eW r0 = new X.5eW
            r0.<init>(r4, r2)
            r6.setForwardClickListener(r0)
            r2 = 18
            X.5eW r0 = new X.5eW
            r0.<init>(r4, r2)
            r6.setShareClickListener(r0)
        L_0x00b2:
            r4.A7W()
            com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout r0 = r4.A0L
            if (r0 != 0) goto L_0x00be
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r7)
            throw r0
        L_0x00be:
            r0.setPushName(r5)
            X.5Tl r0 = r4.A0K
            if (r0 == 0) goto L_0x00dc
            com.whatsapp.chatinfo.view.custom.NewsletterDetailsCard r2 = r0.A02
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x00dc
            X.21q r0 = r1.A01
            int r1 = r0.ordinal()
            if (r1 == r3) goto L_0x00fc
            r0 = 1
            if (r1 == r0) goto L_0x00f8
            r0 = 2
            if (r1 == r0) goto L_0x00e7
            r0 = 3
            if (r1 == r0) goto L_0x00e7
        L_0x00dc:
            X.4Ok r0 = r4.A0d
            java.lang.String r6 = "newsletterMembersListAdapter"
            if (r0 != 0) goto L_0x0100
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r6)
            throw r0
        L_0x00e7:
            android.view.View r1 = r2.A01
            if (r1 != 0) goto L_0x00f2
            java.lang.String r0 = "followUnfollowButton"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00f2:
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x00dc
        L_0x00f8:
            r2.A06()
            goto L_0x00dc
        L_0x00fc:
            r2.A07()
            goto L_0x00dc
        L_0x0100:
            r0.notifyDataSetChanged()
            com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout r5 = r4.A0L
            if (r5 != 0) goto L_0x010c
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r7)
            throw r0
        L_0x010c:
            android.view.View r2 = r4.A02
            if (r2 != 0) goto L_0x0117
            java.lang.String r0 = "footerViews"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0117:
            android.widget.LinearLayout r1 = r4.A07
            if (r1 != 0) goto L_0x0122
            java.lang.String r0 = "footerPadding"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0122:
            X.4Ok r0 = r4.A0d
            if (r0 != 0) goto L_0x012b
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r6)
            throw r0
        L_0x012b:
            r5.A0D(r2, r1, r0)
            X.1RL r0 = r4.A7G()
            boolean r2 = r0.A0K
            r0 = 2131429393(0x7f0b0811, float:1.8480457E38)
            android.view.View r1 = r4.findViewById(r0)
            if (r1 == 0) goto L_0x0144
            int r0 = X.AnonymousClass001.A08(r2)
            r1.setVisibility(r0)
        L_0x0144:
            r4.A7c(r3, r3)
            r4.A7V()
            r4.A7X()
        L_0x014d:
            X.2wD r0 = X.C59022wD.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1217561t.invoke(java.lang.Object):java.lang.Object");
    }
}
