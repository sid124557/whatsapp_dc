package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;

/* renamed from: X.1xP  reason: invalid class name and case insensitive filesystem */
public final class C35771xP extends C34771vn {
    public final C27991fJ A00;
    public final AnonymousClass36K A01;
    public final C34921w2 A02;
    public final List A03;

    public C35771xP(AnonymousClass36K r25, C35721xK r26) {
        Object obj;
        AnonymousClass36K r5 = r25;
        AnonymousClass36K A022 = C41032Ir.A02(r5, r26);
        String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_TYPE};
        Class<String> cls = String.class;
        Long A0R = AnonymousClass0x2.A0R();
        Long A0S = AnonymousClass0x2.A0S();
        C626836d.A06(r5, cls, A0R, A0S, "result", strArr, false);
        C626836d.A05(r5, cls, A0R, A0S, "true", new String[]{"remove", "linked_groups"}, false);
        String[] A1b = AnonymousClass0x9.A1b();
        Class<C27991fJ> cls2 = C27991fJ.class;
        Long l = A0R;
        Long l2 = A0S;
        Long l3 = A0R;
        Long l4 = A0S;
        this.A00 = (C27991fJ) C626836d.A06(r5, cls2, l3, l4, C626836d.A06(A022, cls2, l, l2, (Object) null, new String[]{"to"}, false), A1b, true);
        String[] strArr2 = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
        C626836d.A06(r5, cls, l3, l4, C626836d.A06(A022, cls, l, l2, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false), strArr2, true);
        try {
            obj = C626836d.A04(r5, C86304Jp.A00(47), new String[0]);
        } catch (AnonymousClass24Y unused) {
            obj = null;
        }
        this.A02 = (C34921w2) obj;
        this.A03 = C626836d.A0B(r5, C86304Jp.A00(48), new String[]{"remove", "participant"}, 1, 1024);
        this.A00 = r5;
        this.A01 = (AnonymousClass36K) C626836d.A0B(r5, C86304Jp.A00(49), new String[]{"remove"}, 1, 1).get(0);
    }
}
