package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5oN  reason: invalid class name and case insensitive filesystem */
public final class C115255oN implements AnonymousClass4EZ {
    public final /* synthetic */ C102815Kj A00;
    public final /* synthetic */ C35721xK A01;

    public void BdM(AnonymousClass36K r13, String str) {
        C162457s7.A0J(r13, 1);
        C35721xK r1 = this.A01;
        AnonymousClass36K.A0N(r13, "iq");
        AnonymousClass36K r3 = r1.A00;
        C95814uZ r4 = (C95814uZ) C626836d.A05(r13, UserJid.class, AnonymousClass0x2.A0R(), AnonymousClass0x2.A0S(), (Object) null, new String[]{"invite", "sender", PublicKeyCredentialControllerUtility.JSON_KEY_USER}, false);
        C626836d.A04(r13, new AnonymousClass92Z(r3, 31), new String[0]);
        if (r4 != null) {
            C102815Kj r5 = this.A00;
            if (!r5.A03.A0L(r4)) {
                C56832sd r12 = r5.A07;
                r5.A04.A0V(new C31041ne(AnonymousClass35J.A01(r4, r12.A02), r5.A01.A0H()));
                C18270x1.A0j(C18270x1.A03(r5.A02), "1on1_invite_sender", r4.getRawString());
            }
        }
        C18270x1.A0g(C18270x1.A03(this.A00.A02), "1on1_invite_code_from_referrer");
    }

    public C115255oN(C102815Kj r1, C35721xK r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BQs(String str) {
        this.A00.A00 = false;
    }

    public void BSN(AnonymousClass36K r3, String str) {
        C18270x1.A0g(C18270x1.A03(this.A00.A02), "1on1_invite_code_from_referrer");
    }
}
