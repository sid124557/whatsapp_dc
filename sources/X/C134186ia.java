package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6ia  reason: invalid class name and case insensitive filesystem */
public final class C134186ia extends AnonymousClass3ZG {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;
    public Long A0G;
    public Long A0H;
    public Long A0I;
    public String A0J;

    public C134186ia() {
        super(4778, new AnonymousClass5ZC(1, 1, 1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A01);
        r3.Blb(2, this.A0C);
        r3.Blb(3, this.A02);
        r3.Blb(4, this.A0D);
        r3.Blb(5, this.A03);
        r3.Blb(6, this.A04);
        r3.Blb(7, this.A0E);
        r3.Blb(8, this.A05);
        r3.Blb(9, this.A0F);
        r3.Blb(10, this.A06);
        r3.Blb(11, this.A07);
        r3.Blb(12, this.A0G);
        r3.Blb(13, this.A08);
        r3.Blb(14, this.A00);
        r3.Blb(15, this.A09);
        r3.Blb(16, this.A0H);
        r3.Blb(17, this.A0A);
        r3.Blb(18, this.A0I);
        r3.Blb(19, this.A0B);
        r3.Blb(20, this.A0J);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C86634Kw.A0t(AnonymousClass6C8.A0a(AnonymousClass0x2.A0Q(AnonymousClass0x2.A0P(AnonymousClass0x2.A0O(AnonymousClass0x2.A0N(C18270x1.A0Q(C18270x1.A0P(C18270x1.A0O(C18270x1.A0N(C18270x1.A0M(C18270x1.A0L(C18270x1.A0K(C18270x1.A0J(C18270x1.A0I(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A01, A0r), this.A0C, A0r), this.A02, A0r), this.A0D, A0r), this.A03, A0r), this.A04, A0r), this.A0E, A0r), this.A05, A0r), this.A0F, A0r), this.A06, A0r), this.A07, A0r), this.A0G, A0r), this.A08, A0r), this.A00, A0r), this.A09, A0r), this.A0H, A0r), this.A0A, A0r), this.A0I, A0r), this.A0B, A0r), this.A0J);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamEphemeralSyncResponseSend {");
        C57292tP.A00(A0o, "clientDisappearingModeInitiator", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "clientEphemeralityDuration", this.A0C);
        C57292tP.A00(A0o, "clientEphemeralityInitiator", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "clientEphemeralitySettingTimestamp", this.A0D);
        C57292tP.A00(A0o, "clientEphemeralityTriggerAction", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "esrDisappearingModeInitiator", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "esrEphemeralityDuration", this.A0E);
        C57292tP.A00(A0o, "esrEphemeralityInitiator", C18270x1.A0T(this.A05));
        C57292tP.A00(A0o, "esrEphemeralitySettingTimestamp", this.A0F);
        C57292tP.A00(A0o, "esrEphemeralityTriggerAction", C18270x1.A0T(this.A06));
        C57292tP.A00(A0o, "esrFailureReason", C18270x1.A0T(this.A07));
        C57292tP.A00(A0o, "esrSendAttempt", this.A0G);
        C57292tP.A00(A0o, "esrSendResult", C18270x1.A0T(this.A08));
        C57292tP.A00(A0o, "isAGroup", this.A00);
        C57292tP.A00(A0o, "messageDisappearingModeInitiator", C18270x1.A0T(this.A09));
        C57292tP.A00(A0o, "messageEphemeralityDuration", this.A0H);
        C57292tP.A00(A0o, "messageEphemeralityInitiator", C18270x1.A0T(this.A0A));
        C57292tP.A00(A0o, "messageEphemeralitySettingTimestamp", this.A0I);
        C57292tP.A00(A0o, "messageEphemeralityTriggerAction", C18270x1.A0T(this.A0B));
        return AnonymousClass3ZG.A0G(this.A0J, "threadId", A0o);
    }
}
