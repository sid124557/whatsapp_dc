package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1ZN  reason: invalid class name */
public final class AnonymousClass1ZN extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public String A03;
    public String A04;

    public AnonymousClass1ZN() {
        super(4630, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(4, this.A03);
        r3.Blb(7, this.A01);
        r3.Blb(5, this.A04);
        r3.Blb(6, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0G(AnonymousClass001.A0f(), this.A00, A0r), this.A03);
        AnonymousClass3ZG.A0I(A0r, 2);
        A0r.put(C18270x1.A0I(C18270x1.A0H(AnonymousClass0x7.A0g(), this.A01, A0r), this.A04, A0r), this.A02);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamBotJourney {");
        C57292tP.A00(A0o, "actionType", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "aiDiscoveryTab", this.A03);
        C57292tP.A00(A0o, "botEntryPoint", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "botPersonaId", this.A04);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A02), "uiSurface", A0o);
    }
}
