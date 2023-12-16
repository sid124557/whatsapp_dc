package X;

import com.whatsapp.voipcalling.CallLinkInfo;

/* renamed from: X.6rc  reason: invalid class name and case insensitive filesystem */
public final class C139166rc extends C41022Iq implements C179938jx {
    public final C34801vq A00;
    public final C138756qw A01;
    public final String A02;

    public C139166rc(AnonymousClass36K r10) {
        AnonymousClass36K r2 = r10;
        String[] A0Z = AnonymousClass36K.A0Z(r10, "state");
        Class<String> cls = String.class;
        Long A0R = AnonymousClass0x2.A0R();
        Long A0S = AnonymousClass0x2.A0S();
        C626836d.A06(r2, cls, A0R, A0S, "version_check", A0Z, false);
        this.A02 = (String) C626836d.A06(r2, cls, A0R, A0S, (Object) null, new String[]{CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID}, false);
        this.A00 = (C34801vq) AnonymousClass6C8.A0b(r10, C1896292a.A00(88), "choice");
        this.A01 = (C138756qw) C1896292a.A0L(r10, 89, 0);
        this.A00 = r10;
    }
}
