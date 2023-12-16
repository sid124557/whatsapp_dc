package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.1wg  reason: invalid class name and case insensitive filesystem */
public final class C35321wg extends C35561x4 {
    public static final ArrayList A00 = C18260x0.A0C("614665046147756", "994766073959253");
    public static final ArrayList A01 = C18260x0.A0C("fbns", "gcm");
    public static final ArrayList A02 = AnonymousClass0x2.A0i(new String[]{"0", "1", "2"});

    public C35321wg(Long l, Long l2, String str, String str2, String str3, String str4) {
        C56052rL A04 = C56052rL.A04("config");
        if (C626836d.A0M(str, 1, 1024, false)) {
            C56052rL.A0D(A04, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        }
        if (l != null && C626836d.A0K(l, true)) {
            C56052rL.A0A(A04, l, "app_mute");
        }
        String str5 = str2;
        if (str2 != null && C626836d.A0M(str5, 1, 64, true)) {
            C56052rL.A0D(A04, "pkey", str2);
        }
        Long l3 = l2;
        if (l2 != null && C626836d.A0J(l3, 0, 5, true)) {
            C56052rL.A0A(A04, l2, "num_acc");
        }
        A04.A0L(str3, "platform", A01);
        A04.A0K(str4, "voip_payload_type", A02);
        C41032Ir.A0A(A04, this);
    }
}
