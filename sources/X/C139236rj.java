package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Map;

/* renamed from: X.6rj  reason: invalid class name and case insensitive filesystem */
public class C139236rj extends C41022Iq implements C183418q0 {
    public String A00;
    public final int A01;

    public C139236rj(AnonymousClass36K r10, int i) {
        String str;
        this.A01 = i;
        AnonymousClass36K r2 = r10;
        String[] A1b = AnonymousClass6C7.A1b(r10, "group");
        Class<String> cls = String.class;
        if (i != 0) {
            str = "404";
        } else {
            str = "403";
        }
        C626836d.A0F(r10, cls, str, A1b);
        this.A00 = (String) C626836d.A06(r2, cls, 10L, 50L, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false);
        this.A00 = r10;
    }

    public void Aw2(C149057Kt r5) {
        String str;
        int i = this.A01;
        Map map = r5.A02;
        C27991fJ A04 = C627336j.A04(this.A00);
        if (i != 0) {
            C162457s7.A0D(A04);
            str = "404";
        } else {
            C162457s7.A0D(A04);
            str = "403";
        }
        map.put(A04, str);
    }
}
