package X;

import com.whatsapp.ShareCatalogLinkActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.6BF  reason: invalid class name */
public class AnonymousClass6BF implements C181628n4 {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass6BF(ShareCatalogLinkActivity shareCatalogLinkActivity, UserJid userJid, int i) {
        this.A02 = i;
        this.A00 = shareCatalogLinkActivity;
        this.A01 = userJid;
    }

    public final void BJw() {
        int i;
        int i2 = this.A02;
        ShareCatalogLinkActivity shareCatalogLinkActivity = (ShareCatalogLinkActivity) this.A00;
        UserJid userJid = (UserJid) this.A01;
        C105145Tt r2 = shareCatalogLinkActivity.A01;
        AnonymousClass5P6 A002 = AnonymousClass5P6.A00(r2);
        C105145Tt r0 = shareCatalogLinkActivity.A01;
        switch (i2) {
            case 0:
                AnonymousClass5P6.A04(A002, r0);
                AnonymousClass5P6.A02(A002, 22);
                i = 39;
                break;
            case 1:
                AnonymousClass5P6.A04(A002, r0);
                AnonymousClass5P6.A02(A002, 24);
                i = 41;
                break;
            default:
                AnonymousClass5P6.A04(A002, r0);
                AnonymousClass5P6.A02(A002, 19);
                i = 36;
                break;
        }
        AnonymousClass5P6.A03(A002, i);
        A002.A00 = userJid;
        r2.A03(A002);
    }
}
