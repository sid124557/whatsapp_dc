package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Sr  reason: invalid class name and case insensitive filesystem */
public final class C68313Sr implements AnonymousClass4EZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C84424Ch A01;
    public final /* synthetic */ C58642va A02;
    public final /* synthetic */ C35721xK A03;

    public void BSN(AnonymousClass36K r4, String str) {
        String A0L;
        C162457s7.A0J(r4, 1);
        List A0s = r4.A0s("error");
        C162457s7.A0D(A0s);
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            AnonymousClass36K A0Y = C18310x6.A0Y(it);
            if (!(A0Y == null || (A0L = AnonymousClass36K.A0L(A0Y, "code")) == null)) {
                this.A01.onError(Integer.parseInt(A0L));
            }
        }
    }

    public void BdM(AnonymousClass36K r23, String str) {
        AnonymousClass36K r6 = r23;
        C162457s7.A0J(r6, 1);
        AnonymousClass36K A022 = C41032Ir.A02(r6, this.A03);
        String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_TYPE};
        Class<String> cls = String.class;
        Long A0R = AnonymousClass0x2.A0R();
        Long A0S = AnonymousClass0x2.A0S();
        C626836d.A06(r6, cls, A0R, A0S, "result", strArr, false);
        String[] A1b = AnonymousClass0x9.A1b();
        Class<C27991fJ> cls2 = C27991fJ.class;
        C626836d.A06(r6, cls2, A0R, A0S, C626836d.A06(A022, cls2, A0R, A0S, (Object) null, new String[]{"to"}, false), A1b, true);
        C626836d.A06(r6, cls, A0R, A0S, C626836d.A06(A022, cls, A0R, A0S, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false), new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, true);
        C626836d.A03(r6, C86304Jp.A00(38), new String[]{"group"});
        C58642va r5 = this.A02;
        C84424Ch r4 = this.A01;
        C57482ti.A01(r5.A00, r5.A01, new AnonymousClass334((String) null, this.A00), r6);
        r4.onSuccess();
    }

    public C68313Sr(C84424Ch r1, C58642va r2, C35721xK r3, int i) {
        this.A03 = r3;
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
    }

    public void BQs(String str) {
    }
}
