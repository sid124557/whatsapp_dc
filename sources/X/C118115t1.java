package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;

/* renamed from: X.5t1  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C118115t1 implements AnonymousClass4GP {
    public final /* synthetic */ C90164gp A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public final Object invoke() {
        C90164gp r0 = this.A00;
        String str = this.A01;
        String str2 = this.A02;
        C149847Od r4 = r0.A01;
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass36K.A0P(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r4.A03, A0s);
        String str3 = r4.A04;
        if (!TextUtils.isEmpty(str3)) {
            AnonymousClass36K.A0P("reason", str3, A0s);
        }
        AnonymousClass36K.A0P("catalog_session_id", r4.A05, A0s);
        if (str2 != null) {
            AnonymousClass36K.A0P("direct_connection_encrypted_info", str2, A0s);
        }
        AnonymousClass39V[] r10 = new AnonymousClass39V[2];
        boolean A0F = AnonymousClass39V.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "report_product", r10);
        r10[1] = new AnonymousClass39V((Jid) r4.A02, "biz_jid");
        AnonymousClass36K r3 = new AnonymousClass36K("request", r10, C18280x3.A1a(A0s, A0F ? 1 : 0));
        AnonymousClass39V[] r2 = new AnonymousClass39V[4];
        AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, r2, A0F);
        AnonymousClass39V.A0B("xmlns", "fb:thrift_iq", r2, 1);
        AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", r2, 2);
        return AnonymousClass36K.A0C(C135206kI.A00, r3, r2);
    }

    public /* synthetic */ C118115t1(C90164gp r1, String str, String str2) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
    }
}
