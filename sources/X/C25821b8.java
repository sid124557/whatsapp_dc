package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1b8  reason: invalid class name and case insensitive filesystem */
public final class C25821b8 extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
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

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(21, this.A05);
        r3.Blb(18, this.A0C);
        r3.Blb(24, this.A06);
        r3.Blb(25, this.A07);
        r3.Blb(22, this.A00);
        r3.Blb(14, this.A01);
        r3.Blb(26, this.A08);
        r3.Blb(9, this.A02);
        r3.Blb(2, this.A09);
        r3.Blb(1, this.A0A);
        r3.Blb(20, this.A0D);
        r3.Blb(19, this.A0E);
        r3.Blb(23, this.A0B);
        r3.Blb(16, this.A03);
        r3.Blb(17, this.A04);
    }

    public C25821b8() {
        super(1728, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18290x4.A0f(AnonymousClass3ZG.A0A(AnonymousClass0x2.A0Q(C18270x1.A0N(C18270x1.A0O(21, this.A05, A0r), (Object) null, A0r), (Object) null, A0r), this.A0C, A0r), this.A06, A0r), this.A07);
        AnonymousClass3ZG.A0I(A0r, 5);
        A0r.put(C18270x1.A0Q(22, this.A00, A0r), this.A01);
        AnonymousClass3ZG.A0I(A0r, 10);
        A0r.put(C18270x1.A0E(C18270x1.A0L(C18270x1.A0F(C18270x1.A0I(C18270x1.A0G(C18320x8.A0X(), this.A08, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), this.A02, A0r), this.A09);
        AnonymousClass3ZG.A0I(A0r, 13);
        A0r.put(AnonymousClass0x2.A0P(AnonymousClass0x2.A0O(AnonymousClass3ZG.A09(AnonymousClass3ZG.A05(C18270x1.A0J(C18270x1.A0K(AnonymousClass3ZG.A06(AnonymousClass001.A0f(), this.A0A, A0r), this.A0D, A0r), (Object) null, A0r), (Object) null, A0r), this.A0E, A0r), this.A0B, A0r), this.A03, A0r), this.A04);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamForwardSend {");
        C57292tP.A00(A0o, "disappearingChatInitiator", C18270x1.A0T(this.A05));
        C57292tP.A00(A0o, "ephemeralityDuration", this.A0C);
        C57292tP.A00(A0o, "ephemeralityInitiator", C18270x1.A0T(this.A06));
        C57292tP.A00(A0o, "ephemeralityTriggerAction", C18270x1.A0T(this.A07));
        C57292tP.A00(A0o, "isForwardedForward", this.A00);
        C57292tP.A00(A0o, "isFrequentlyForwarded", this.A01);
        C57292tP.A00(A0o, "messageBizType", C18270x1.A0T(this.A08));
        C57292tP.A00(A0o, "messageIsInternational", this.A02);
        C57292tP.A00(A0o, "messageMediaType", C18270x1.A0T(this.A09));
        AnonymousClass3ZG.A0H(C18270x1.A0T(this.A0A), A0o);
        C57292tP.A00(A0o, "receiverDefaultDisappearingDuration", this.A0D);
        C57292tP.A00(A0o, "senderDefaultDisappearingDuration", this.A0E);
        C57292tP.A00(A0o, "typeOfGroup", C18270x1.A0T(this.A0B));
        C57292tP.A00(A0o, "wouldBeFrequentlyForwardedAt3", this.A03);
        return AnonymousClass3ZG.A0G(this.A04, "wouldBeFrequentlyForwardedAt4", A0o);
    }
}
