package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import java.util.List;

/* renamed from: X.1xO  reason: invalid class name and case insensitive filesystem */
public final class C35761xO extends C34771vn {
    public final Jid A00;
    public final AnonymousClass36K A01;
    public final String A02;
    public final List A03;

    public C35761xO(AnonymousClass36K r25, C35701xI r26) {
        AnonymousClass36K r5 = r25;
        AnonymousClass36K A022 = C41032Ir.A02(r5, r26);
        String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_TYPE};
        Class<String> cls = String.class;
        Long A0R = AnonymousClass0x2.A0R();
        Long A0S = AnonymousClass0x2.A0S();
        C626836d.A06(r5, cls, A0R, A0S, "result", strArr, false);
        C626836d.A06(r5, cls, A0R, A0S, "false", new String[]{"list", "matched"}, false);
        String[] A1b = AnonymousClass0x9.A1b();
        Class<Jid> cls2 = Jid.class;
        Long l = A0R;
        Long l2 = A0S;
        Long l3 = A0R;
        Long l4 = A0S;
        this.A00 = (Jid) C626836d.A06(r5, cls2, l3, l4, C626836d.A06(A022, cls2, l, l2, (Object) null, new String[]{"to"}, false), A1b, true);
        String[] strArr2 = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
        Class<String> cls3 = cls;
        C626836d.A06(r5, cls, l3, l4, C626836d.A06(A022, cls3, l, l2, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false), strArr2, true);
        AnonymousClass36K r17 = r5;
        Class<String> cls4 = cls;
        C626836d.A05(r17, cls4, l3, l4, C626836d.A05(A022, cls3, l, l2, (Object) null, new String[]{"item", "dhash"}, false), new String[]{"list", "c_dhash"}, true);
        this.A02 = (String) C626836d.A06(r5, cls, AnonymousClass0x2.A0T(), AnonymousClass0x7.A0i(), (Object) null, new String[]{"list", "dhash"}, false);
        this.A03 = C626836d.A0B(r5, C86304Jp.A00(8), new String[]{"list", "item"}, 0, 64000);
        this.A00 = r5;
        this.A01 = (AnonymousClass36K) C626836d.A0C(r5, new String[]{"list"}, 9).get(0);
    }
}
