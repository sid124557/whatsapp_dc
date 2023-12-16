package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3Sl  reason: invalid class name and case insensitive filesystem */
public class C68253Sl implements AnonymousClass4EZ {
    public final C35711xJ A00;
    public final Runnable A01;
    public final /* synthetic */ C56732sT A02;

    public C68253Sl(C56732sT r1, C35711xJ r2, Runnable runnable) {
        this.A02 = r1;
        this.A01 = runnable;
        this.A00 = r2;
    }

    public void BdM(AnonymousClass36K r19, String str) {
        AnonymousClass36K r4 = r19;
        AnonymousClass36K A022 = C41032Ir.A02(r4, this.A00);
        String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_TYPE};
        Class<String> cls = String.class;
        Long A0R = AnonymousClass0x2.A0R();
        Long A0S = AnonymousClass0x2.A0S();
        C626836d.A06(r4, cls, A0R, A0S, "result", strArr, false);
        Long l = A0R;
        Long l2 = A0S;
        C626836d.A06(r4, cls, A0R, A0S, C626836d.A06(A022, cls, l, l2, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false), new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, true);
        AnonymousClass36K r11 = r4;
        Class[] clsArr = new Class[2];
        clsArr[0] = Jid.class;
        C626836d.A00(r4, AnonymousClass0x9.A1A(UserJid.class, clsArr, 1), AnonymousClass0x9.A1b());
        C18260x0.A12("ClientPingManager/recv/onSuccess; timestamp=", AnonymousClass001.A0o(), ((Number) C626836d.A06(r11, Long.class, l, l2, (Object) null, new String[]{"t"}, false)).longValue());
        C56732sT r3 = this.A02;
        C70013Zn.A00(r3.A07, r3, 22);
        Runnable runnable = this.A01;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void BQs(String str) {
        C18260x0.A0s("ClientPingManager/recv/onDeliveryFailure id=", str, AnonymousClass001.A0o());
    }

    public void BSN(AnonymousClass36K r4, String str) {
        C18260x0.A0s("ClientPingManager/recv/onError id=", str, AnonymousClass001.A0o());
        C56732sT r2 = this.A02;
        C70013Zn.A00(r2.A07, r2, 22);
    }
}
