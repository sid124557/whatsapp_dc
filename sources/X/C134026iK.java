package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6iK  reason: invalid class name and case insensitive filesystem */
public final class C134026iK extends AnonymousClass3ZG {
    public Boolean A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public String A08;
    public String A09;

    public C134026iK() {
        super(3782, new AnonymousClass5ZC(1, 1000, 2000, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(2, this.A08);
        r3.Blb(12, this.A01);
        r3.Blb(3, this.A02);
        r3.Blb(13, this.A03);
        r3.Blb(7, this.A09);
        r3.Blb(14, this.A04);
        r3.Blb(8, this.A05);
        r3.Blb(9, this.A06);
        r3.Blb(11, this.A07);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0L(C18270x1.A0K(C18270x1.A0Q(C18270x1.A0J(C18270x1.A0P(C18270x1.A0F(C18270x1.A0O(C18270x1.A0E(AnonymousClass001.A0f(), this.A00, A0r), this.A08, A0r), this.A01, A0r), this.A02, A0r), this.A03, A0r), this.A09, A0r), this.A04, A0r), this.A05, A0r), this.A06);
        AnonymousClass3ZG.A0I(A0r, 10);
        A0r.put(11, this.A07);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamMexEvent {");
        C57292tP.A00(A0o, "isMex", this.A00);
        C57292tP.A00(A0o, "mexEventData", this.A08);
        C57292tP.A00(A0o, "mexEventDurationT", this.A01);
        C57292tP.A00(A0o, "mexEventEndTime", this.A02);
        C57292tP.A00(A0o, "mexEventEnvelopeResponseStatus", this.A03);
        C57292tP.A00(A0o, "mexEventOperation", this.A09);
        C57292tP.A00(A0o, "mexEventPayloadResponseStatus", this.A04);
        C57292tP.A00(A0o, "mexEventRequestSize", this.A05);
        C57292tP.A00(A0o, "mexEventResponseSize", this.A06);
        return AnonymousClass3ZG.A0G(this.A07, "mexEventStartTime", A0o);
    }
}
