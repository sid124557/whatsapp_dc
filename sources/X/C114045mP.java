package X;

import com.whatsapp.registration.RegisterEmail;

/* renamed from: X.5mP  reason: invalid class name and case insensitive filesystem */
public final class C114045mP implements C184348re {
    public final /* synthetic */ RegisterEmail A00;
    public final /* synthetic */ String A01;

    public C114045mP(RegisterEmail registerEmail, String str) {
        this.A00 = registerEmail;
        this.A01 = str;
    }

    public void BSq(Integer num) {
        C18260x0.A1Q(AnonymousClass001.A0o(), "RegisterEmail/executeSetEmailRequest/onFailure/error code: ", num);
        RegisterEmail registerEmail = this.A00;
        C69253Wh r2 = registerEmail.A08;
        if (r2 != null) {
            r2.BkS(new C70143a1(registerEmail, 2, num));
            return;
        }
        throw C18270x1.A0S("mainThreadHandler");
    }

    public void BdJ(boolean z) {
        C18260x0.A1E("RegisterEmail/executeSetEmailRequest/onSuccess/verifyEmail: ", AnonymousClass001.A0o(), z);
        RegisterEmail registerEmail = this.A00;
        C69253Wh r3 = registerEmail.A08;
        if (r3 != null) {
            r3.BkS(new C70303aH(registerEmail, this.A01, 6, z));
            return;
        }
        throw C18270x1.A0S("mainThreadHandler");
    }
}
