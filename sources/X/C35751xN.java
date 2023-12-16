package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;

/* renamed from: X.1xN  reason: invalid class name and case insensitive filesystem */
public final class C35751xN extends C34771vn {
    public final Jid A00;
    public final AnonymousClass36K A01;
    public final C35011wB A02;
    public final String A03;

    public C35751xN(AnonymousClass36K r24, C35701xI r25) {
        AnonymousClass36K r4 = r24;
        AnonymousClass36K A022 = C41032Ir.A02(r4, r25);
        String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_TYPE};
        Class<String> cls = String.class;
        Long A0R = AnonymousClass0x2.A0R();
        Long A0S = AnonymousClass0x2.A0S();
        C626836d.A06(r4, cls, A0R, A0S, "result", strArr, false);
        C626836d.A06(r4, cls, A0R, A0S, "true", new String[]{"list", "matched"}, false);
        String[] A1b = AnonymousClass0x9.A1b();
        Class<Jid> cls2 = Jid.class;
        Long l = A0R;
        Long l2 = A0S;
        Long l3 = A0R;
        Long l4 = A0S;
        this.A00 = (Jid) C626836d.A06(r4, cls2, l3, l4, C626836d.A06(A022, cls2, l, l2, (Object) null, new String[]{"to"}, false), A1b, true);
        String[] strArr2 = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
        C626836d.A06(r4, cls, l3, l4, C626836d.A06(A022, cls, l, l2, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false), strArr2, true);
        this.A03 = (String) C626836d.A06(r4, cls, AnonymousClass0x2.A0T(), AnonymousClass0x7.A0i(), (Object) null, new String[]{"list", "dhash"}, false);
        this.A02 = (C35011wB) C626836d.A04(r4, C86304Jp.A00(6), new String[]{"list", "item"});
        this.A00 = r4;
        this.A01 = (AnonymousClass36K) C626836d.A0C(r4, new String[]{"list"}, 7).get(0);
    }
}
