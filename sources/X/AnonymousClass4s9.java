package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4s9  reason: invalid class name */
public final class AnonymousClass4s9 extends AnonymousClass3ZG {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(2, this.A00);
        r3.Blb(5, this.A01);
        r3.Blb(3, this.A02);
        r3.Blb(1, this.A03);
        r3.Blb(4, this.A04);
        r3.Blb(6, this.A05);
    }

    public AnonymousClass4s9() {
        super(1502, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        AnonymousClass3ZG.A0I(A0r, 7);
        A0r.put(C18270x1.A0I(C18270x1.A0G(C18270x1.A0D(C18270x1.A0F(C18270x1.A0H(C18280x3.A0S(), this.A00, A0r), this.A01, A0r), this.A02, A0r), this.A03, A0r), this.A04, A0r), this.A05);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamUserActivitySessionSummary {");
        C57292tP.A00(A0o, "userActivityDuration", this.A00);
        C57292tP.A00(A0o, "userActivityForeground", this.A01);
        C57292tP.A00(A0o, "userActivitySessionsLength", this.A02);
        C57292tP.A00(A0o, "userActivityStartTime", this.A03);
        C57292tP.A00(A0o, "userActivityTimeChange", this.A04);
        return AnonymousClass3ZG.A0G(this.A05, "userSessionSummarySequence", A0o);
    }
}
