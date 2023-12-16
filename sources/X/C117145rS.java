package X;

import com.whatsapp.xfamily.crossposting.ui.ShareToFacebookActivity;

/* renamed from: X.5rS  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C117145rS implements Runnable {
    public final /* synthetic */ C48792fU A00;
    public final /* synthetic */ ShareToFacebookActivity A01;

    public final void run() {
        ShareToFacebookActivity shareToFacebookActivity = this.A01;
        C48792fU r1 = this.A00;
        C183538qC r0 = shareToFacebookActivity.A04;
        if (r0 != null) {
            C102415It r2 = (C102415It) r0.get();
            AnonymousClass21S r6 = ShareToFacebookActivity.A06;
            C104075Pn r3 = new C104075Pn(r1, shareToFacebookActivity);
            C162457s7.A0J(r6, 0);
            C183538qC r7 = r2.A01;
            C51132jK A002 = C86654Ky.A0g(r7).A00(r6);
            if (A002 != null) {
                AnonymousClass5JM r4 = (AnonymousClass5JM) C617031x.A00(new C120865zI(r2, A002));
                int i = r4.A02;
                if (i == -1) {
                    r3.A01(new AnonymousClass57L((String) null, (Throwable) null, (C378924l) null, 3));
                    return;
                } else if (i == 0) {
                    C106245Ye.A00("AccountLinkingLoginManager/unlinkCurrentFbUserEntity success");
                    C86654Ky.A0g(r7).A03(r6, false);
                } else if (i != 2) {
                    C106245Ye.A00("AccountLinkingLoginManager/unlinkCurrentFbUserEntity failed to logout, Generic error");
                    r3.A01(new C1000759i("Generic exception"));
                    return;
                } else if (r4.A00 == 190) {
                    C106245Ye.A00("AccountLinkingLoginManager/unlinkCurrentFbUserEntity already invalidated at server");
                    C86654Ky.A0g(r7).A03(r6, false);
                    r3.A00();
                    return;
                } else {
                    C106245Ye.A00("AccountLinkingLoginManager/unlinkCurrentFbUserEntity failed to logout");
                    r3.A01(new C1000759i("Generic exception"));
                    return;
                }
            }
            r3.A00();
            return;
        }
        throw C18270x1.A0S("accountLinkingLoginManagerLazy");
    }

    public /* synthetic */ C117145rS(C48792fU r1, ShareToFacebookActivity shareToFacebookActivity) {
        this.A01 = shareToFacebookActivity;
        this.A00 = r1;
    }
}
