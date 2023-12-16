package X;

import com.whatsapp.voipcalling.CallLinkInfo;
import java.util.List;

/* renamed from: X.6rd  reason: invalid class name and case insensitive filesystem */
public final class C139176rd extends C41022Iq implements C179938jx {
    public final C138756qw A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public C139176rd(AnonymousClass36K r16) {
        AnonymousClass36K r1 = r16;
        String[] A0Z = AnonymousClass36K.A0Z(r1, "state");
        Class<String> cls = String.class;
        Long A0R = AnonymousClass0x2.A0R();
        Long A0S = AnonymousClass0x2.A0S();
        C626836d.A06(r1, cls, A0R, A0S, "choice", A0Z, false);
        AnonymousClass36K r8 = r1;
        Class<String> cls2 = cls;
        Long l = A0R;
        Long l2 = A0S;
        this.A02 = (String) C626836d.A06(r8, cls2, l, l2, (Object) null, new String[]{CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID}, false);
        this.A01 = (String) C626836d.A05(r8, cls2, l, l2, (Object) null, new String[]{"catch"}, false);
        this.A00 = (C138756qw) C1896292a.A0L(r1, 56, 0);
        this.A03 = C626836d.A0B(r1, C1896292a.A00(57), new String[]{"choice"}, 0, Long.MAX_VALUE);
        this.A00 = r1;
    }
}
