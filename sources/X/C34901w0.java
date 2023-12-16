package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.1w0  reason: invalid class name and case insensitive filesystem */
public final class C34901w0 extends C41022Iq {
    public final C138666qn A00;
    public final C138666qn A01;
    public final C84294Bu A02;
    public final Long A03;
    public final Long A04;
    public final String A05;
    public final String A06;

    public C34901w0(AnonymousClass36K r19) {
        Object obj;
        Object obj2;
        Object obj3;
        AnonymousClass36K r4 = r19;
        AnonymousClass36K.A0N(r4, "message");
        Class<String> cls = String.class;
        Long A0R = AnonymousClass0x2.A0R();
        Long A0S = AnonymousClass0x2.A0S();
        this.A06 = (String) C626836d.A05(r4, cls, A0R, A0S, "true", new String[]{"is_sender"}, false);
        this.A05 = (String) C626836d.A05(r4, cls, A0R, A0S, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false);
        Class<Long> cls2 = Long.class;
        this.A03 = (Long) C626836d.A06(r4, cls2, 99L, 2147476647L, (Object) null, new String[]{"server_id"}, false);
        Class<Long> cls3 = cls2;
        this.A04 = (Long) C626836d.A05(r4, cls3, AnonymousClass0x2.A0T(), A0S, (Object) null, new String[]{"t"}, false);
        try {
            obj = C626836d.A04(r4, C86304Jp.A00(61), new String[0]);
        } catch (AnonymousClass24Y unused) {
            obj = null;
        }
        this.A01 = (C138666qn) obj;
        try {
            obj2 = C626836d.A04(r4, C86304Jp.A00(62), new String[0]);
        } catch (AnonymousClass24Y unused2) {
            obj2 = null;
        }
        this.A00 = (C138666qn) obj2;
        try {
            obj3 = C626836d.A07(r4, "NewsletterEdit|NewsletterText|NewsletterMedia|NewsletterRevoke|NewsletterPollCreation", AnonymousClass0x2.A0i(new AnonymousClass4B7[]{C86304Jp.A00(63), C86304Jp.A00(64), C86304Jp.A00(65), C86304Jp.A00(66), C86304Jp.A00(67)}), new String[0]);
        } catch (AnonymousClass24Y unused3) {
            obj3 = null;
        }
        this.A02 = (C84294Bu) obj3;
        this.A00 = r4;
    }
}
