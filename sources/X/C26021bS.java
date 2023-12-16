package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1bS  reason: invalid class name and case insensitive filesystem */
public final class C26021bS extends AnonymousClass3ZG {
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
    public Boolean A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Boolean A0D;
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
    public Long A0U;
    public Long A0V;
    public Long A0W;
    public Long A0X;
    public Long A0Y;

    public C26021bS() {
        super(1994, AnonymousClass0x9.A0T(1, 1000, 2000), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(16, this.A00);
        r3.Blb(36, this.A0L);
        r3.Blb(26, this.A0E);
        r3.Blb(11, this.A0M);
        r3.Blb(12, this.A0N);
        r3.Blb(1, this.A0O);
        r3.Blb(42, this.A0F);
        r3.Blb(15, this.A01);
        r3.Blb(21, this.A0P);
        r3.Blb(17, this.A0G);
        r3.Blb(33, this.A02);
        r3.Blb(27, this.A03);
        r3.Blb(41, this.A04);
        r3.Blb(9, this.A05);
        r3.Blb(8, this.A06);
        r3.Blb(24, this.A07);
        r3.Blb(29, this.A08);
        r3.Blb(18, this.A0Q);
        r3.Blb(3, this.A0H);
        r3.Blb(30, this.A09);
        r3.Blb(31, this.A0A);
        r3.Blb(4, this.A0I);
        r3.Blb(14, this.A0B);
        r3.Blb(37, this.A0R);
        r3.Blb(34, this.A0S);
        r3.Blb(28, this.A0C);
        r3.Blb(39, this.A0T);
        r3.Blb(13, this.A0U);
        r3.Blb(10, this.A0V);
        r3.Blb(2, this.A0J);
        r3.Blb(40, this.A0W);
        r3.Blb(23, this.A0X);
        r3.Blb(25, this.A0D);
        r3.Blb(19, this.A0Y);
        r3.Blb(38, this.A0K);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(16, this.A00);
        A0r.put(32, (Object) null);
        AnonymousClass0x2.A1H((Object) null, A0r, 35);
        A0r.put(C18270x1.A0D(C18270x1.A0O(C18270x1.A0N(AnonymousClass3ZG.A0B(36, this.A0L, A0r), this.A0E, A0r), this.A0M, A0r), this.A0N, A0r), this.A0O);
        A0r.put(AnonymousClass0x2.A0P(AnonymousClass3ZG.A07(AnonymousClass0x2.A0N(42, this.A0F, A0r), this.A01, A0r), this.A0P, A0r), this.A0G);
        A0r.put(AnonymousClass3ZG.A0C(33, this.A02, A0r), this.A03);
        A0r.put(AnonymousClass0x2.A0Q(AnonymousClass3ZG.A0E(AnonymousClass3ZG.A0A(C18270x1.A0K(C18270x1.A0L(41, this.A04, A0r), this.A05, A0r), this.A06, A0r), this.A07, A0r), this.A08, A0r), this.A0Q);
        AnonymousClass3ZG.A0I(A0r, 43);
        A0r.put(AnonymousClass3ZG.A0F(C18290x4.A0a(), this.A0H, A0r), this.A09);
        A0r.put(C18270x1.A0Q(C18270x1.A0G(31, this.A0A, A0r), this.A0I, A0r), this.A0B);
        A0r.put(37, this.A0R);
        A0r.put(AnonymousClass3ZG.A0D(34, this.A0S, A0r), this.A0C);
        A0r.put(C18270x1.A0E(C18270x1.A0M(C18270x1.A0P(39, this.A0T, A0r), this.A0U, A0r), this.A0V, A0r), this.A0J);
        A0r.put(C18290x4.A0f(AnonymousClass3ZG.A09(40, this.A0W, A0r), this.A0X, A0r), this.A0D);
        AnonymousClass3ZG.A0I(A0r, 20);
        A0r.put(19, this.A0Y);
        A0r.put(38, this.A0K);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamAndroidMessageSendPerf {");
        C57292tP.A00(A0o, "appRestart", this.A00);
        C57292tP.A00(A0o, "deviceCount", this.A0L);
        C57292tP.A00(A0o, "deviceSizeBucket", C18270x1.A0T(this.A0E));
        C57292tP.A00(A0o, "durationAbs", this.A0M);
        C57292tP.A00(A0o, "durationRelative", this.A0N);
        C57292tP.A00(A0o, "durationT", this.A0O);
        C57292tP.A00(A0o, "editType", C18270x1.A0T(this.A0F));
        C57292tP.A00(A0o, "fetchPrekeys", this.A01);
        C57292tP.A00(A0o, "fetchPrekeysPercentage", this.A0P);
        C57292tP.A00(A0o, "groupSizeBucket", C18270x1.A0T(this.A0G));
        C57292tP.A00(A0o, "isDirectedMessage", this.A02);
        C57292tP.A00(A0o, "isE2eBackfill", this.A03);
        C57292tP.A00(A0o, "isLid", this.A04);
        C57292tP.A00(A0o, "isMessageFanout", this.A05);
        C57292tP.A00(A0o, "isMessageForward", this.A06);
        C57292tP.A00(A0o, "isRevokeMessage", this.A07);
        C57292tP.A00(A0o, "isViewOnce", this.A08);
        C57292tP.A00(A0o, "jobsInQueue", this.A0Q);
        C57292tP.A00(A0o, "mediaType", C18270x1.A0T(this.A0H));
        C57292tP.A00(A0o, "messageIsFirstUserMessage", this.A09);
        C57292tP.A00(A0o, "messageIsInvisible", this.A0A);
        AnonymousClass3ZG.A0H(C18270x1.A0T(this.A0I), A0o);
        C57292tP.A00(A0o, "networkWasDisconnected", this.A0B);
        C57292tP.A00(A0o, "participantCount", this.A0R);
        C57292tP.A00(A0o, "phoneCores", this.A0S);
        C57292tP.A00(A0o, "prekeysEligibleForPrallelProcessing", this.A0C);
        C57292tP.A00(A0o, "receiverDeviceCount", this.A0T);
        C57292tP.A00(A0o, "sendCount", this.A0U);
        C57292tP.A00(A0o, "sendRetryCount", this.A0V);
        C57292tP.A00(A0o, "sendStage", C18270x1.A0T(this.A0J));
        C57292tP.A00(A0o, "senderDeviceCount", this.A0W);
        C57292tP.A00(A0o, "senderKeyDistributionCountPercentage", this.A0X);
        C57292tP.A00(A0o, "sessionsMissingWhenComposing", this.A0D);
        C57292tP.A00(A0o, "threadsInExecution", this.A0Y);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A0K), "typeOfGroup", A0o);
    }
}
