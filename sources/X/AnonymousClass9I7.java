package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.9I7  reason: invalid class name */
public final class AnonymousClass9I7 extends C41022Iq {
    public static final ArrayList A02 = C18260x0.A0C("pay_on_delivery", "pix_key");
    public final C138626qj A00;
    public final C192049Hz A01;

    public AnonymousClass9I7(AnonymousClass36K r10) {
        Object obj;
        AnonymousClass36K.A0N(r10, "custom_payment_method");
        Class<String> cls = String.class;
        C626836d.A0F(r10, cls, "BR", new String[]{"country"});
        C626836d.A05(r10, cls, AnonymousClass0x2.A0U(), AnonymousClass0x7.A0i(), (Object) null, new String[]{"created"}, false);
        AnonymousClass6C8.A13(r10, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A02);
        this.A01 = (C192049Hz) C205029qJ.A00(r10, 17);
        try {
            obj = C626836d.A04(r10, new C205029qJ(18), new String[0]);
        } catch (AnonymousClass24Y unused) {
            obj = null;
        }
        this.A00 = (C138626qj) obj;
        this.A00 = r10;
    }
}
