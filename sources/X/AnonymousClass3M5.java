package X;

import com.whatsapp.email.UpdateEmailActivity;

/* renamed from: X.3M5  reason: invalid class name */
public final class AnonymousClass3M5 implements C184348re {
    public final /* synthetic */ UpdateEmailActivity A00;
    public final /* synthetic */ String A01;

    public AnonymousClass3M5(UpdateEmailActivity updateEmailActivity, String str) {
        this.A00 = updateEmailActivity;
        this.A01 = str;
    }

    public void BSq(Integer num) {
        C18260x0.A1Q(AnonymousClass001.A0o(), "UpdateEmailActivity/executeSetEmailRequest/onFailure/error code: ", num);
        UpdateEmailActivity updateEmailActivity = this.A00;
        C69253Wh r2 = updateEmailActivity.A07;
        if (r2 != null) {
            r2.BkS(new C71343bx(updateEmailActivity, 31, num));
            return;
        }
        throw C18270x1.A0S("mainThreadHandler");
    }

    public void BdJ(boolean z) {
        C18260x0.A1E("UpdateEmailActivity/executeSetEmailRequest/onSuccess/verifyEmail: ", AnonymousClass001.A0o(), z);
        UpdateEmailActivity updateEmailActivity = this.A00;
        C69253Wh r3 = updateEmailActivity.A07;
        if (r3 != null) {
            r3.BkS(new C70303aH(updateEmailActivity, this.A01, 4, z));
            return;
        }
        throw C18270x1.A0S("mainThreadHandler");
    }
}
