package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4rk  reason: invalid class name and case insensitive filesystem */
public final class C94684rk extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Long A04;

    public C94684rk() {
        super(3022, AnonymousClass0x9.A0U(1, false), 2, 113760892);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A02);
        r3.Blb(3, this.A00);
        r3.Blb(4, this.A03);
        r3.Blb(5, this.A01);
        r3.Blb(2, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0E(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(AnonymousClass001.A0f(), this.A02, A0r), this.A00, A0r), this.A03, A0r), this.A01, A0r), this.A04);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamCtwaWelcomeMessage {");
        C57292tP.A00(A0o, "ctwaWelcomeMessageAction", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "ctwaWelcomeMessageContainsIcebreakers", this.A00);
        C57292tP.A00(A0o, "ctwaWelcomeMessageError", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "ctwaWelcomeMessageIcebreakersContainAutoreply", this.A01);
        return AnonymousClass3ZG.A0G(this.A04, "firstWelcomeMessageImpressionTime", A0o);
    }
}
