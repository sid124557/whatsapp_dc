package X;

import android.text.TextUtils;
import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3TI  reason: invalid class name */
public class AnonymousClass3TI implements AnonymousClass4EZ {
    public AnonymousClass4CN A00;
    public final UserJid A01;
    public final AnonymousClass31C A02;

    public void A00(AnonymousClass4CN r12) {
        this.A00 = r12;
        AnonymousClass31C r4 = this.A02;
        String A03 = r4.A03();
        AnonymousClass39V[] r2 = new AnonymousClass39V[1];
        boolean A0F = AnonymousClass39V.A0F("jid", this.A01.getRawString(), r2);
        AnonymousClass36K A0I = AnonymousClass36K.A0I("public_key", r2);
        AnonymousClass39V[] r22 = new AnonymousClass39V[5];
        AnonymousClass39V.A0E(r22, A0F ? 1 : 0);
        AnonymousClass39V.A09("xmlns", "w:biz:catalog", r22);
        AnonymousClass39V.A07("smax_id", "52", r22);
        AnonymousClass39V.A08(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A03, r22);
        r4.A0D(this, AnonymousClass36K.A0G(A0I, r22), A03, 283, 32000);
    }

    public AnonymousClass3TI(UserJid userJid, AnonymousClass31C r2) {
        this.A01 = userJid;
        this.A02 = r2;
    }

    public void BQs(String str) {
        C18260x0.A0t("GetBusinessPublicKeyProtocol/delivery-error with iqId ", str, AnonymousClass001.A0o());
        AnonymousClass4CN r1 = this.A00;
        if (r1 != null) {
            r1.BTw(this.A01);
        }
    }

    public void BSN(AnonymousClass36K r4, String str) {
        C18260x0.A0t("GetBusinessPublicKeyProtocol/onError with iqId ", str, AnonymousClass001.A0o());
        Pair A022 = C57492tj.A02(r4);
        if (A022 != null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("GetBusinessPublicKeyProtocol/onError error_code=");
            C18270x1.A17(A022.first, A0o);
        }
        AnonymousClass4CN r1 = this.A00;
        if (r1 != null) {
            r1.BTw(this.A01);
        }
    }

    public void BdM(AnonymousClass36K r6, String str) {
        AnonymousClass36K A0l;
        String str2;
        String str3;
        AnonymousClass36K A0l2 = r6.A0l("public_key");
        if (!(A0l2 == null || (A0l = A0l2.A0l("pem")) == null)) {
            String A0n = A0l.A0n();
            if (!TextUtils.isEmpty(A0n)) {
                AnonymousClass36K A0l3 = r6.A0l("public_key_with_signature");
                String str4 = null;
                if (A0l3 != null) {
                    AnonymousClass36K A0l4 = A0l3.A0l("public_key_pem");
                    if (A0l4 != null) {
                        str3 = A0l4.A0n();
                    } else {
                        str3 = null;
                    }
                    AnonymousClass36K A0l5 = A0l3.A0l("public_key_signature");
                    if (A0l5 != null) {
                        str4 = A0l5.A0n();
                    }
                    str2 = str4;
                    str4 = str3;
                } else {
                    str2 = null;
                }
                AnonymousClass4CN r1 = this.A00;
                if (r1 != null) {
                    UserJid userJid = this.A01;
                    C626936e.A06(A0n);
                    r1.BTx(userJid, A0n, str4, str2);
                    return;
                }
                return;
            }
        }
        AnonymousClass4CN r12 = this.A00;
        if (r12 != null) {
            r12.BTw(this.A01);
        }
    }
}
