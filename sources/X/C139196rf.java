package X;

import java.util.ArrayList;

/* renamed from: X.6rf  reason: invalid class name and case insensitive filesystem */
public final class C139196rf extends C41022Iq implements C179938jx {
    public static final ArrayList A05 = C18260x0.A0C("child", "embedded");
    public final C138756qw A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public C139196rf(AnonymousClass36K r19) {
        AnonymousClass36K r4 = r19;
        String[] A0Z = AnonymousClass36K.A0Z(r4, "state");
        Class<String> cls = String.class;
        Long A0R = AnonymousClass0x2.A0R();
        Long A0S = AnonymousClass0x2.A0S();
        C626836d.A06(r4, cls, A0R, A0S, "subflow", A0Z, false);
        this.A02 = (String) C626836d.A06(r4, cls, A0R, A0S, (Object) null, new String[]{"config"}, false);
        AnonymousClass36K r11 = r4;
        Class<String> cls2 = cls;
        this.A04 = (String) C626836d.A05(r11, cls2, AnonymousClass0x2.A0T(), 10000L, (Object) null, new String[]{"parameters"}, false);
        this.A01 = (String) C626836d.A05(r4, cls, A0R, A0S, (Object) null, new String[]{"catch"}, false);
        this.A03 = AnonymousClass6C9.A0d(r4, "launch_mode", A05);
        this.A00 = (C138756qw) C1896292a.A0L(r4, 86, 0);
        this.A00 = r4;
    }
}
