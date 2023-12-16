package X;

import com.whatsapp.R;
import com.whatsapp.xfamily.crossposting.ui.ShareToFacebookActivity;

/* renamed from: X.5Pn  reason: invalid class name and case insensitive filesystem */
public final class C104075Pn {
    public final /* synthetic */ C48792fU A00;
    public final /* synthetic */ ShareToFacebookActivity A01;

    public C104075Pn(C48792fU r1, ShareToFacebookActivity shareToFacebookActivity) {
        this.A01 = shareToFacebookActivity;
        this.A00 = r1;
    }

    public void A00() {
        ShareToFacebookActivity shareToFacebookActivity = this.A01;
        C111135hb A74 = shareToFacebookActivity.A74();
        C183538qC r0 = shareToFacebookActivity.A05;
        if (r0 != null) {
            C56042rK A0g = C86654Ky.A0g(r0);
            AnonymousClass21S r2 = ShareToFacebookActivity.A06;
            A74.A06("final_auto_setting", Boolean.valueOf(C86624Kv.A1Y(A0g, r2)));
            shareToFacebookActivity.A74().A05("SEE_UNLINK_SUCCESS");
            shareToFacebookActivity.A74().A01();
            this.A00.A00();
            C183538qC r02 = shareToFacebookActivity.A05;
            if (r02 == null) {
                throw C18270x1.A0S("fbAccountManagerLazy");
            } else if (!C86654Ky.A0g(r02).A05(r2)) {
                C18290x4.A18(shareToFacebookActivity);
            }
        } else {
            throw C18270x1.A0S("fbAccountManagerLazy");
        }
    }

    public void A01(C1000759i r8) {
        ShareToFacebookActivity shareToFacebookActivity = this.A01;
        C111135hb A74 = shareToFacebookActivity.A74();
        C183538qC r0 = shareToFacebookActivity.A05;
        if (r0 != null) {
            A74.A06("final_auto_setting", Boolean.valueOf(C86624Kv.A1Y(C86654Ky.A0g(r0), ShareToFacebookActivity.A06)));
            C111135hb A742 = shareToFacebookActivity.A74();
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Class: ");
            Class<?> cls = r8.getClass();
            A0o.append(cls);
            A742.A07("SEE_UNLINK_ERROR", AnonymousClass000.A0a(", message: ", A0o, r8));
            this.A00.A00();
            boolean A0P = C162457s7.A0P(cls, AnonymousClass57L.class);
            C105945Xa r1 = shareToFacebookActivity.A03;
            if (r1 != null) {
                int i = R.string.f11nameremoved;
                if (A0P) {
                    i = R.string.f11nameremoved;
                }
                r1.A01((C109665ez) null, "share_to_fb_activity", i, 0, false);
                return;
            }
            throw C18270x1.A0S("crosspostSnackbarManager");
        }
        throw C18270x1.A0S("fbAccountManagerLazy");
    }
}
