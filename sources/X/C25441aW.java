package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1aW  reason: invalid class name and case insensitive filesystem */
public final class C25441aW extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;

    public C25441aW() {
        super(4026, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(3, this.A02);
        r3.Blb(1, this.A03);
        r3.Blb(2, this.A00);
        r3.Blb(9, this.A04);
        r3.Blb(5, this.A05);
        r3.Blb(6, this.A01);
        r3.Blb(10, this.A06);
        r3.Blb(8, this.A07);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0K(C18270x1.A0M(C18270x1.A0I(C18270x1.A0H(C18270x1.A0L(C18270x1.A0E(C18270x1.A0G(C18270x1.A0J(C18270x1.A0D(C18290x4.A0a(), this.A02, A0r), this.A03, A0r), (Object) null, A0r), (Object) null, A0r), this.A00, A0r), this.A04, A0r), this.A05, A0r), this.A01, A0r), this.A06, A0r), this.A07);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamSelfServeHelp {");
        C57292tP.A00(A0o, "bloksScreenName", this.A02);
        C57292tP.A00(A0o, "contentId", this.A03);
        C57292tP.A00(A0o, "helpEventType", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "mediaGroupId", this.A04);
        C57292tP.A00(A0o, "supportBloksLaunchErrorMessage", this.A05);
        C57292tP.A00(A0o, "supportBloksLaunchErrorType", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "supportVideoLocale", this.A06);
        return AnonymousClass3ZG.A0G(this.A07, "videoUrl", A0o);
    }
}
