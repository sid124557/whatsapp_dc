package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1a1  reason: invalid class name and case insensitive filesystem */
public final class C25131a1 extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public String A06;

    public C25131a1() {
        super(4628, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(2, this.A01);
        r3.Blb(11, this.A02);
        r3.Blb(10, this.A05);
        r3.Blb(7, this.A03);
        r3.Blb(8, this.A04);
        r3.Blb(9, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0L(C18270x1.A0K(C18270x1.A0J(C18270x1.A0M(C18270x1.A0N(C18270x1.A0E(AnonymousClass001.A0f(), this.A00, A0r), this.A01, A0r), this.A02, A0r), this.A05, A0r), this.A03, A0r), this.A04, A0r), this.A06);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamBotInteraction {");
        C57292tP.A00(A0o, "agentEngagementType", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "botInteractionStage", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "botType", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "interactionTs", this.A05);
        C57292tP.A00(A0o, "messageMediaType", C18270x1.A0T(this.A03));
        AnonymousClass3ZG.A0H(C18270x1.A0T(this.A04), A0o);
        return AnonymousClass3ZG.A0G(this.A06, "requestId", A0o);
    }
}
