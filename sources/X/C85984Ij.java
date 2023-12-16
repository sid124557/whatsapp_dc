package X;

import com.whatsapp.email.UpdateEmailActivity;

/* renamed from: X.4Ij  reason: invalid class name and case insensitive filesystem */
public class C85984Ij implements C184328rc {
    public Object A00;
    public final int A01;

    public C85984Ij(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BSq(Integer num) {
        int i = this.A01;
        StringBuilder A0o = AnonymousClass001.A0o();
        if (i != 0) {
            C18260x0.A1Q(A0o, "EmailVerificationManager/maybeCallGetEmailRequestAndUpdateEmailSharedPrefsAfterReg/onFailure/error code: ", num);
            AnonymousClass33p r1 = ((C49842hB) this.A00).A01;
            r1.A1W((String) null);
            r1.A1y(false);
            return;
        }
        C18260x0.A1Q(A0o, "UpdateEmailActivity/executeGetEmailCall/onFailure/error code: ", num);
        UpdateEmailActivity updateEmailActivity = (UpdateEmailActivity) this.A00;
        C69253Wh r2 = updateEmailActivity.A07;
        if (r2 != null) {
            r2.BkS(new C71343bx(updateEmailActivity, 29, num));
            return;
        }
        throw C18270x1.A0S("mainThreadHandler");
    }

    public void BdF(String str, boolean z) {
        int i = this.A01;
        StringBuilder A0o = AnonymousClass001.A0o();
        if (i != 0) {
            C18260x0.A1E("EmailVerificationManager/maybeCallGetEmailRequestAndUpdateEmailSharedPrefsAfterReg/onSuccess/emailVerified: ", A0o, z);
            AnonymousClass33p r0 = ((C49842hB) this.A00).A01;
            r0.A1W(str);
            r0.A1y(z);
            return;
        }
        C18260x0.A1E("UpdateEmailActivity/executeGetEmailCall/onSuccess/emailVerified: ", A0o, z);
        UpdateEmailActivity updateEmailActivity = (UpdateEmailActivity) this.A00;
        C69253Wh r2 = updateEmailActivity.A07;
        if (r2 != null) {
            r2.BkS(new C70303aH(updateEmailActivity, str, 3, z));
            return;
        }
        throw C18270x1.A0S("mainThreadHandler");
    }
}
