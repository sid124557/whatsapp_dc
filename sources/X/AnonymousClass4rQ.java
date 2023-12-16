package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4rQ  reason: invalid class name */
public final class AnonymousClass4rQ extends AnonymousClass3ZG {
    public Long A00;
    public Long A01;
    public String A02;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(5, this.A02);
        r3.Blb(2, this.A00);
        r3.Blb(1, this.A01);
    }

    public AnonymousClass4rQ() {
        super(1172, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0E(C18290x4.A0c(), this.A02, A0r), this.A00);
        AnonymousClass3ZG.A0I(A0r, 3);
        A0r.put(AnonymousClass001.A0f(), this.A01);
        AnonymousClass3ZG.A0I(A0r, 4);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamStatusTabOpen {");
        C57292tP.A00(A0o, "psaCampaigns", this.A02);
        C57292tP.A00(A0o, "statusAvailableUpdatesCount", this.A00);
        return AnonymousClass3ZG.A0G(this.A01, "statusSessionId", A0o);
    }
}
