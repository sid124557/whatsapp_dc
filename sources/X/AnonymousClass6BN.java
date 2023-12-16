package X;

import com.whatsapp.ShareProductLinkActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.6BN  reason: invalid class name */
public class AnonymousClass6BN implements C181628n4 {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public AnonymousClass6BN(ShareProductLinkActivity shareProductLinkActivity, UserJid userJid, String str, int i) {
        this.A03 = i;
        this.A00 = shareProductLinkActivity;
        this.A02 = str;
        this.A01 = userJid;
    }

    public final void BJw() {
        int i;
        int i2 = this.A03;
        ShareProductLinkActivity shareProductLinkActivity = (ShareProductLinkActivity) this.A00;
        String str = this.A02;
        UserJid userJid = (UserJid) this.A01;
        C105145Tt r2 = shareProductLinkActivity.A00;
        AnonymousClass5P6 A002 = AnonymousClass5P6.A00(r2);
        C105145Tt r0 = shareProductLinkActivity.A00;
        switch (i2) {
            case 0:
                AnonymousClass5P6.A04(A002, r0);
                AnonymousClass5P6.A02(A002, 23);
                i = 40;
                break;
            case 1:
                AnonymousClass5P6.A04(A002, r0);
                AnonymousClass5P6.A02(A002, 25);
                i = 42;
                break;
            default:
                AnonymousClass5P6.A04(A002, r0);
                AnonymousClass5P6.A02(A002, 20);
                i = 37;
                break;
        }
        AnonymousClass5P6.A03(A002, i);
        A002.A06(shareProductLinkActivity.A01.A0D(str));
        A002.A0G = str;
        A002.A00 = userJid;
        r2.A03(A002);
    }
}
