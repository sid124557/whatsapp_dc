package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.6re  reason: invalid class name and case insensitive filesystem */
public final class C139186re extends C41022Iq implements C179938jx {
    public final C138756qw A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C139186re(AnonymousClass36K r18) {
        AnonymousClass36K r3 = r18;
        String[] A0Z = AnonymousClass36K.A0Z(r3, "state");
        Class<String> cls = String.class;
        Long A0R = AnonymousClass0x2.A0R();
        Long A0S = AnonymousClass0x2.A0S();
        C626836d.A06(r3, cls, A0R, A0S, "resource", A0Z, false);
        this.A02 = (String) C626836d.A06(r3, cls, A0R, A0S, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false);
        Long A0T = AnonymousClass0x2.A0T();
        AnonymousClass36K r10 = r3;
        Class<String> cls2 = cls;
        this.A05 = (String) C626836d.A05(r10, cls2, A0T, 10000L, (Object) null, new String[]{"parameters"}, false);
        this.A03 = (String) C626836d.A05(r3, cls, A0R, A0S, (Object) null, new String[]{"merge"}, false);
        this.A04 = (String) C626836d.A05(r10, cls2, A0T, 10000L, (Object) null, new String[]{"merge_param"}, false);
        this.A01 = (String) C626836d.A05(r3, cls, A0R, A0S, (Object) null, new String[]{"catch"}, false);
        this.A00 = (C138756qw) C1896292a.A0L(r3, 67, 0);
        this.A00 = r3;
    }
}
