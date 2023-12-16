package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Ze  reason: invalid class name and case insensitive filesystem */
public final class C24901Ze extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public String A04;
    public String A05;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(2, this.A04);
        r3.Blb(8, this.A05);
        r3.Blb(3, this.A00);
        r3.Blb(5, this.A01);
        r3.Blb(6, this.A02);
        r3.Blb(7, this.A03);
    }

    public C24901Ze() {
        super(4294, AnonymousClass3ZG.A04(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        AnonymousClass3ZG.A0I(A0r, 1);
        A0r.put(C18270x1.A0F(C18270x1.A0K(C18280x3.A0S(), this.A04, A0r), this.A05, A0r), this.A00);
        AnonymousClass3ZG.A0I(A0r, 4);
        A0r.put(C18270x1.A0J(C18270x1.A0I(C18290x4.A0c(), this.A01, A0r), this.A02, A0r), this.A03);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamAceSurveyUserResponse {");
        C57292tP.A00(A0o, "aceSurveyBusinessSessionId", this.A04);
        C57292tP.A00(A0o, "aceSurveyDebugInfo", this.A05);
        C57292tP.A00(A0o, "aceSurveyEntryPoint", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "aceSurveyTrigger", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "aceSurveyUserEvent", C18270x1.A0T(this.A02));
        return AnonymousClass3ZG.A0G(this.A03, "businessPhoneNumber", A0o);
    }
}
