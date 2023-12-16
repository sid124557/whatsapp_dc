package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.5Wx  reason: invalid class name and case insensitive filesystem */
public class C105915Wx {
    public final AnonymousClass1VX A00;
    public final AnonymousClass31C A01;

    public void A01(AnonymousClass4EZ r8, AnonymousClass36K r9, String str, int i) {
        try {
            AnonymousClass4EZ r1 = r8;
            String str2 = str;
            if (this.A00.A0X(1319)) {
                A00(r8, str);
            } else {
                this.A01.A0D(r1, r9, str2, i, 32000);
            }
        } catch (AnonymousClass24Y e) {
            Log.e(e.getMessage());
        }
    }

    public void A02(AnonymousClass4EZ r8, AnonymousClass36K r9, String str, int i) {
        try {
            AnonymousClass4EZ r1 = r8;
            String str2 = str;
            if (this.A00.A0X(1319)) {
                A00(r8, str);
            } else {
                this.A01.A0E(r1, r9, str2, i, 32000);
            }
        } catch (AnonymousClass24Y e) {
            Log.e(e.getMessage());
        }
    }

    public C105915Wx(AnonymousClass1VX r1, AnonymousClass31C r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static final boolean A00(AnonymousClass4EZ r6, String str) {
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new AnonymousClass36K("error", new AnonymousClass39V[]{new AnonymousClass39V("code", 451), new AnonymousClass39V("text", "commerce-features-disabled")}));
        AnonymousClass39V[] r3 = new AnonymousClass39V[1];
        AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "IQErrorResponse", r3, 0);
        r6.BSN(new AnonymousClass36K("iq", r3, C18280x3.A1a(A0s, 0)), str);
        return false;
    }
}
