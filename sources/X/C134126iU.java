package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6iU  reason: invalid class name and case insensitive filesystem */
public final class C134126iU extends AnonymousClass3ZG {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public String A0D;

    public C134126iU() {
        super(4780, new AnonymousClass5ZC(1, 1, 1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A01);
        r3.Blb(2, this.A09);
        r3.Blb(3, this.A02);
        r3.Blb(4, this.A0A);
        r3.Blb(5, this.A03);
        r3.Blb(6, this.A04);
        r3.Blb(7, this.A0B);
        r3.Blb(8, this.A05);
        r3.Blb(9, this.A0C);
        r3.Blb(10, this.A06);
        r3.Blb(11, this.A07);
        r3.Blb(12, this.A08);
        r3.Blb(13, this.A00);
        r3.Blb(14, this.A0D);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0Q(C18270x1.A0P(C18270x1.A0O(C18270x1.A0N(C18270x1.A0M(C18270x1.A0L(C18270x1.A0K(C18270x1.A0J(C18270x1.A0I(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A01, A0r), this.A09, A0r), this.A02, A0r), this.A0A, A0r), this.A03, A0r), this.A04, A0r), this.A0B, A0r), this.A05, A0r), this.A0C, A0r), this.A06, A0r), this.A07, A0r), this.A08, A0r), this.A00, A0r), this.A0D);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamEphemeralSyncResponseReceive {");
        C57292tP.A00(A0o, "clientDisappearingModeInitiator", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "clientEphemeralityDuration", this.A09);
        C57292tP.A00(A0o, "clientEphemeralityInitiator", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "clientEphemeralitySettingTimestamp", this.A0A);
        C57292tP.A00(A0o, "clientEphemeralityTriggerAction", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "esrDisappearingModeInitiator", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "esrEphemeralityDuration", this.A0B);
        C57292tP.A00(A0o, "esrEphemeralityInitiator", C18270x1.A0T(this.A05));
        C57292tP.A00(A0o, "esrEphemeralitySettingTimestamp", this.A0C);
        C57292tP.A00(A0o, "esrEphemeralityTriggerAction", C18270x1.A0T(this.A06));
        C57292tP.A00(A0o, "esrFailureReason", C18270x1.A0T(this.A07));
        C57292tP.A00(A0o, "esrResolveResult", C18270x1.A0T(this.A08));
        C57292tP.A00(A0o, "isAGroup", this.A00);
        return AnonymousClass3ZG.A0G(this.A0D, "threadId", A0o);
    }
}
