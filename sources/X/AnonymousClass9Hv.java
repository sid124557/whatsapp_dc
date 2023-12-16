package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;

/* renamed from: X.9Hv  reason: invalid class name */
public final class AnonymousClass9Hv extends C41022Iq {
    public final Jid A00;

    public AnonymousClass9Hv(AnonymousClass36K r22, AnonymousClass36K r23) {
        AnonymousClass36K r2 = r22;
        String[] A0Z = AnonymousClass36K.A0Z(r2, "iq");
        Class<String> cls = String.class;
        Long A0R = AnonymousClass0x2.A0R();
        Long A0S = AnonymousClass0x2.A0S();
        C626836d.A06(r2, cls, A0R, A0S, "result", A0Z, false);
        String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
        AnonymousClass36K r9 = r23;
        Long l = A0R;
        Long l2 = A0S;
        Long l3 = A0R;
        Long l4 = A0S;
        C626836d.A06(r2, cls, l3, l4, C626836d.A06(r9, cls, l, l2, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false), strArr, true);
        Class<Jid> cls2 = Jid.class;
        AnonymousClass36K r14 = r2;
        Class<Jid> cls3 = cls2;
        this.A00 = (Jid) C626836d.A06(r14, cls3, l3, l4, C626836d.A06(r9, cls2, l, l2, (Object) null, new String[]{"to"}, false), new String[]{"from"}, true);
        this.A00 = r2;
    }
}
