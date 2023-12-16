package X;

import android.view.MenuItem;

/* renamed from: X.69o  reason: invalid class name and case insensitive filesystem */
public class C1237369o implements MenuItem.OnMenuItemClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C1237369o(C89644eZ r1, AnonymousClass3ZH r2, int i) {
        this.A02 = i;
        if (i != 0) {
            this.A00 = r1;
            this.A01 = r2;
            return;
        }
        this.A00 = r2;
        this.A01 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        X.C86604Kt.A18(X.AnonymousClass002.A08(), r2, r4, "arg_contact_jid");
        X.AnonymousClass344.A01(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0058, code lost:
        r2.startActivity(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onMenuItemClick(android.view.MenuItem r8) {
        /*
            r7 = this;
            int r0 = r7.A02
            switch(r0) {
                case 0: goto L_0x002a;
                case 1: goto L_0x003f;
                case 2: goto L_0x004c;
                case 3: goto L_0x005c;
                case 4: goto L_0x00a5;
                case 5: goto L_0x00e7;
                case 6: goto L_0x0005;
                case 7: goto L_0x00b4;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r7.A00
            X.5OB r1 = (X.AnonymousClass5OB) r1
            java.lang.Object r4 = r7.A01
            com.whatsapp.jid.Jid r4 = (com.whatsapp.jid.Jid) r4
            r0 = 1
            X.C162457s7.A0J(r4, r0)
            X.4eZ r0 = r1.A02
            X.0df r3 = r0.getSupportFragmentManager()
            com.whatsapp.newsletter.multiadmin.DismissNewsletterAdminDialogFragment r2 = new com.whatsapp.newsletter.multiadmin.DismissNewsletterAdminDialogFragment
            r2.<init>()
        L_0x001c:
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "arg_contact_jid"
            X.C86604Kt.A18(r1, r2, r4, r0)
            X.AnonymousClass344.A01(r2, r3)
        L_0x0028:
            r0 = 1
            return r0
        L_0x002a:
            java.lang.Object r1 = r7.A00
            X.3ZH r1 = (X.AnonymousClass3ZH) r1
            java.lang.Object r2 = r7.A01
            android.content.Context r2 = (android.content.Context) r2
            X.2k5 r0 = r1.A0F
            if (r0 == 0) goto L_0x0028
            X.36r r0 = X.C86664Kz.A1B()
            android.content.Intent r0 = r0.A1K(r2, r1)
            goto L_0x0058
        L_0x003f:
            java.lang.Object r2 = r7.A00
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r0 = r7.A01
            X.3ZH r0 = (X.AnonymousClass3ZH) r0
            android.content.Intent r0 = X.C627736r.A0N(r2, r0)
            goto L_0x0058
        L_0x004c:
            java.lang.Object r2 = r7.A00
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r0 = r7.A01
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            android.content.Intent r0 = X.C627736r.A0j(r2, r0)
        L_0x0058:
            r2.startActivity(r0)
            goto L_0x0028
        L_0x005c:
            java.lang.Object r0 = r7.A00
            X.5Kr r0 = (X.C102895Kr) r0
            java.lang.Object r6 = r7.A01
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            com.whatsapp.community.CommunityMembersViewModel r5 = r0.A05
            r0 = 0
            X.C162457s7.A0J(r6, r0)
            X.1ip r0 = r5.A09
            boolean r0 = r0.A0F()
            if (r0 == 0) goto L_0x008e
            X.4Gp r4 = r5.A0P
        L_0x0074:
            java.lang.Object r3 = r4.getValue()
            X.60d r2 = new X.60d
            r2.<init>(r5)
            X.5wd r1 = new X.5wd
            r1.<init>(r5)
            X.4kx r0 = new X.4kx
            r0.<init>(r6, r1, r2)
            boolean r0 = r4.AzD(r3, r0)
            if (r0 == 0) goto L_0x0074
            goto L_0x0028
        L_0x008e:
            X.4Gp r3 = r5.A0P
        L_0x0090:
            java.lang.Object r2 = r3.getValue()
            X.5we r1 = new X.5we
            r1.<init>(r5)
            X.4kv r0 = new X.4kv
            r0.<init>(r1)
            boolean r0 = r3.AzD(r2, r0)
            if (r0 == 0) goto L_0x0090
            goto L_0x0028
        L_0x00a5:
            java.lang.Object r0 = r7.A00
            X.5Kr r0 = (X.C102895Kr) r0
            java.lang.Object r1 = r7.A01
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.2bx r0 = r0.A04
            r0.A00(r1)
            goto L_0x0028
        L_0x00b4:
            java.lang.Object r3 = r7.A00
            X.5OB r3 = (X.AnonymousClass5OB) r3
            java.lang.Object r4 = r7.A01
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            r0 = 1
            X.C162457s7.A0J(r4, r0)
            X.2ml r2 = r3.A04
            java.lang.String r1 = "newsletter_multi_admin"
            r0 = 0
            boolean r0 = r2.A02(r0, r1)
            r0 = r0 ^ 1
            X.4eZ r1 = r3.A02
            if (r0 == 0) goto L_0x00da
            X.0df r3 = r1.getSupportFragmentManager()
            com.whatsapp.newsletter.multiadmin.NewsletterSendAdminInviteSheet r2 = new com.whatsapp.newsletter.multiadmin.NewsletterSendAdminInviteSheet
            r2.<init>()
            goto L_0x001c
        L_0x00da:
            boolean r0 = r1 instanceof com.whatsapp.newsletter.NewsletterInfoActivity
            if (r0 == 0) goto L_0x0028
            com.whatsapp.newsletter.NewsletterInfoActivity r1 = (com.whatsapp.newsletter.NewsletterInfoActivity) r1
            if (r1 == 0) goto L_0x0028
            r1.BUk(r4)
            goto L_0x0028
        L_0x00e7:
            java.lang.Object r2 = r7.A00
            X.0eF r2 = (X.C08310eF) r2
            java.lang.Object r1 = r7.A01
            X.5Ia r1 = (X.C102245Ia) r1
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            android.content.Intent r1 = r1.A00
            r0 = 91
            r2.startActivityForResult(r1, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1237369o.onMenuItemClick(android.view.MenuItem):boolean");
    }

    public C1237369o(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }
}
