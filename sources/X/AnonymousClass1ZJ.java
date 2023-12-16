package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1ZJ  reason: invalid class name */
public final class AnonymousClass1ZJ extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public String A03;
    public String A04;

    public AnonymousClass1ZJ() {
        super(4292, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(6, this.A03);
        r3.Blb(1, this.A00);
        r3.Blb(3, this.A01);
        r3.Blb(4, this.A02);
        r3.Blb(5, this.A04);
    }

    public static void A00(AnonymousClass1ZJ r4, C61132zl r5, C53212mj r6, int i, int i2) {
        Integer valueOf = Integer.valueOf(i);
        r4.A02 = valueOf;
        Integer valueOf2 = Integer.valueOf(i2);
        r4.A00 = valueOf2;
        r4.A01 = Integer.valueOf(C61132zl.A00(r6.A01));
        r4.A04 = r6.A04;
        AnonymousClass4FV r1 = r5.A01;
        r1.BhD(r4);
        C24901Ze r0 = new C24901Ze();
        r0.A02 = valueOf;
        r0.A00 = valueOf2;
        r5.A01(r0, r6);
        r1.BhD(r0);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0D(C18290x4.A0d(), this.A03, A0r), this.A00);
        AnonymousClass3ZG.A0I(A0r, 2);
        A0r.put(C18270x1.A0H(C18270x1.A0G(C18290x4.A0a(), this.A01, A0r), this.A02, A0r), this.A04);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamAceSurveyUserEngagement {");
        C57292tP.A00(A0o, "aceSurveyDebugInfo", this.A03);
        C57292tP.A00(A0o, "aceSurveyEntryPoint", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "aceSurveyTrigger", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "aceSurveyUserEvent", C18270x1.A0T(this.A02));
        return AnonymousClass3ZG.A0G(this.A04, "aceSurveyUserSessionId", A0o);
    }
}
