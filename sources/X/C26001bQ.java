package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1bQ  reason: invalid class name and case insensitive filesystem */
public final class C26001bQ extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Integer A0A;
    public Integer A0B;
    public Integer A0C;
    public Integer A0D;
    public Integer A0E;
    public Integer A0F;
    public Integer A0G;
    public Integer A0H;
    public Integer A0I;
    public Integer A0J;
    public Integer A0K;
    public Long A0L;
    public Long A0M;
    public Long A0N;
    public Long A0O;
    public Long A0P;
    public Long A0Q;
    public Long A0R;
    public Long A0S;
    public Long A0T;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(28, this.A0A);
        r3.Blb(37, this.A0B);
        r3.Blb(16, this.A0L);
        r3.Blb(10, this.A0C);
        r3.Blb(14, this.A0D);
        r3.Blb(25, this.A0E);
        r3.Blb(13, this.A0M);
        r3.Blb(26, this.A0F);
        r3.Blb(27, this.A0G);
        r3.Blb(36, this.A00);
        r3.Blb(19, this.A01);
        r3.Blb(18, this.A02);
        r3.Blb(24, this.A03);
        r3.Blb(9, this.A04);
        r3.Blb(4, this.A05);
        r3.Blb(23, this.A06);
        r3.Blb(5, this.A07);
        r3.Blb(2, this.A0H);
        r3.Blb(6, this.A0N);
        r3.Blb(7, this.A0O);
        r3.Blb(1, this.A0I);
        r3.Blb(8, this.A08);
        r3.Blb(30, this.A0P);
        r3.Blb(22, this.A0Q);
        r3.Blb(17, this.A0R);
        r3.Blb(12, this.A0S);
        r3.Blb(20, this.A0J);
        r3.Blb(11, this.A0T);
        r3.Blb(29, this.A09);
        r3.Blb(21, this.A0K);
    }

    public C26001bQ() {
        super(450, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(28, this.A0A);
        A0r.put(AnonymousClass3ZG.A0C(AnonymousClass3ZG.A0B(C18270x1.A0P(C18290x4.A0f(C18270x1.A0Q(C18270x1.A0M(AnonymousClass0x2.A0O(37, this.A0B, A0r), this.A0L, A0r), this.A0C, A0r), this.A0D, A0r), this.A0E, A0r), this.A0M, A0r), this.A0F, A0r), this.A0G);
        A0r.put(C18270x1.A0L(AnonymousClass3ZG.A0A(AnonymousClass0x2.A0Q(AnonymousClass3ZG.A05(36, this.A00, A0r), this.A01, A0r), this.A02, A0r), this.A03, A0r), this.A04);
        A0r.put(33, (Object) null);
        A0r.put(C18270x1.A0E(C18270x1.A0H(AnonymousClass3ZG.A09(C18270x1.A0G(34, (Object) null, A0r), this.A05, A0r), this.A06, A0r), this.A07, A0r), this.A0H);
        AnonymousClass3ZG.A0I(A0r, 15);
        A0r.put(C18270x1.A0K(C18270x1.A0D(C18270x1.A0J(C18290x4.A0d(), this.A0N, A0r), this.A0O, A0r), this.A0I, A0r), this.A08);
        AnonymousClass3ZG.A0I(A0r, 3);
        A0r.put(C18270x1.A0N(AnonymousClass3ZG.A06(C18270x1.A0O(AnonymousClass0x2.A0P(AnonymousClass3ZG.A08(30, this.A0P, A0r), this.A0Q, A0r), this.A0R, A0r), this.A0S, A0r), this.A0J, A0r), this.A0T);
        AnonymousClass3ZG.A0I(A0r, 35);
        A0r.put(29, this.A09);
        A0r.put(31, (Object) null);
        AnonymousClass0x2.A1H((Object) null, A0r, 32);
        A0r.put(21, this.A0K);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamMessageReceive {");
        C57292tP.A00(A0o, "agentEngagementType", C18270x1.A0T(this.A0A));
        C57292tP.A00(A0o, "botType", C18270x1.A0T(this.A0B));
        C57292tP.A00(A0o, "deviceCount", this.A0L);
        C57292tP.A00(A0o, "deviceSizeBucket", C18270x1.A0T(this.A0C));
        C57292tP.A00(A0o, "disappearingChatInitiator", C18270x1.A0T(this.A0D));
        C57292tP.A00(A0o, "editType", C18270x1.A0T(this.A0E));
        C57292tP.A00(A0o, "ephemeralityDuration", this.A0M);
        C57292tP.A00(A0o, "ephemeralityInitiator", C18270x1.A0T(this.A0F));
        C57292tP.A00(A0o, "ephemeralityTriggerAction", C18270x1.A0T(this.A0G));
        C57292tP.A00(A0o, "isAComment", this.A00);
        C57292tP.A00(A0o, "isAReply", this.A01);
        C57292tP.A00(A0o, "isForwardedForward", this.A02);
        C57292tP.A00(A0o, "isLid", this.A03);
        C57292tP.A00(A0o, "isViewOnce", this.A04);
        C57292tP.A00(A0o, "messageIsInternational", this.A05);
        C57292tP.A00(A0o, "messageIsInvisible", this.A06);
        C57292tP.A00(A0o, "messageIsOffline", this.A07);
        C57292tP.A00(A0o, "messageMediaType", C18270x1.A0T(this.A0H));
        C57292tP.A00(A0o, "messageReceiveT0", this.A0N);
        C57292tP.A00(A0o, "messageReceiveT1", this.A0O);
        AnonymousClass3ZG.A0H(C18270x1.A0T(this.A0I), A0o);
        C57292tP.A00(A0o, "mutedGroupMessage", this.A08);
        C57292tP.A00(A0o, "offlineCount", this.A0P);
        C57292tP.A00(A0o, "paddingBytesSize", this.A0Q);
        C57292tP.A00(A0o, "participantCount", this.A0R);
        C57292tP.A00(A0o, "receiverDefaultDisappearingDuration", this.A0S);
        C57292tP.A00(A0o, "revokeType", C18270x1.A0T(this.A0J));
        C57292tP.A00(A0o, "senderDefaultDisappearingDuration", this.A0T);
        C57292tP.A00(A0o, "stickerIsAi", this.A09);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A0K), "typeOfGroup", A0o);
    }
}
