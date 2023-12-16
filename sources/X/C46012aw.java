package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.2aw  reason: invalid class name and case insensitive filesystem */
public class C46012aw {
    public final C69263Wi A00;
    public final AnonymousClass31C A01;
    public final C49952hM A02;
    public final AnonymousClass4FS A03;

    public C46012aw(C69263Wi r1, AnonymousClass31C r2, C49952hM r3, AnonymousClass4FS r4) {
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void A00(AnonymousClass4ER r12, String str, String str2, boolean z, boolean z2) {
        String str3;
        C18260x0.A1E("ChatSupportTicketManager/contactSupport called, shouldUploadLogs=", AnonymousClass001.A0o(), z);
        C68243Sk r5 = new C68243Sk(this.A00, new AnonymousClass2OG(r12, this, z), this.A01);
        AnonymousClass31C r4 = r5.A02;
        String A032 = r4.A03();
        if (z2) {
            str3 = "payment";
        } else {
            str3 = "general";
        }
        C56052rL A012 = C56052rL.A01();
        C56052rL.A0D(A012, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032);
        C56052rL.A0E(A012, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
        C56052rL.A0D(A012, "xmlns", "fb:thrift_iq");
        C56052rL.A0D(A012, "smax_id", "3");
        C56052rL A04 = C56052rL.A04("additional_attributes");
        C56052rL.A0D(A04, "context_flow", str3);
        C56052rL.A07(A04, A012);
        A012.A0H(new AnonymousClass36K("description", str, (AnonymousClass39V[]) null));
        if (!TextUtils.isEmpty(str2)) {
            A012.A0H(new AnonymousClass36K("debug_information_json", str2, (AnonymousClass39V[]) null));
        }
        r4.A0K(r5, A012.A0F(), A032, 256, 32000);
    }
}
