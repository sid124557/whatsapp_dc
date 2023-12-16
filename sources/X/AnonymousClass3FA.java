package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* renamed from: X.3FA  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3FA implements C182328oE {
    public final /* synthetic */ AnonymousClass67A A00;
    public final /* synthetic */ AnonymousClass1Q1 A01;
    public final /* synthetic */ C624134x A02;

    public final void BUt(C108785dY r11) {
        AnonymousClass1Q1 r5 = this.A01;
        AnonymousClass67A r4 = this.A00;
        C624134x r7 = this.A02;
        if (r11 != null) {
            String str = r11.A03;
            JSONObject A1G = AnonymousClass0x9.A1G();
            A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r11.A02);
            r5.A00.A0T(new C71613cO(r4, r5, A1G.put("description", r11.A00), r7, str, 3), 400);
        }
    }

    public /* synthetic */ AnonymousClass3FA(AnonymousClass67A r1, AnonymousClass1Q1 r2, C624134x r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
