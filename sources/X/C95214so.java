package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4so  reason: invalid class name and case insensitive filesystem */
public final class C95214so extends AnonymousClass3ZG {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;
    public Long A0G;
    public Long A0H;
    public Long A0I;
    public Long A0J;
    public Long A0K;
    public Long A0L;
    public Long A0M;
    public Long A0N;
    public Long A0O;
    public Long A0P;
    public Long A0Q;

    public C95214so() {
        super(2938, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(9, this.A00);
        r3.Blb(8, this.A01);
        r3.Blb(7, this.A02);
        r3.Blb(15, this.A03);
        r3.Blb(14, this.A04);
        r3.Blb(13, this.A05);
        r3.Blb(21, this.A06);
        r3.Blb(20, this.A07);
        r3.Blb(19, this.A08);
        r3.Blb(12, this.A09);
        r3.Blb(11, this.A0A);
        r3.Blb(10, this.A0B);
        r3.Blb(29, this.A0C);
        r3.Blb(30, this.A0D);
        r3.Blb(31, this.A0E);
        r3.Blb(22, this.A0F);
        r3.Blb(23, this.A0G);
        r3.Blb(24, this.A0H);
        r3.Blb(18, this.A0I);
        r3.Blb(17, this.A0J);
        r3.Blb(16, this.A0K);
        r3.Blb(3, this.A0L);
        r3.Blb(2, this.A0M);
        r3.Blb(1, this.A0N);
        r3.Blb(6, this.A0O);
        r3.Blb(5, this.A0P);
        r3.Blb(4, this.A0Q);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0J(C18270x1.A0K(C18300x5.A0Y(), this.A00, A0r), this.A01, A0r), this.A02);
        AnonymousClass3ZG.A0I(A0r, 32);
        A0r.put(C18270x1.A0P(C18270x1.A0Q(AnonymousClass0x9.A0j(), this.A03, A0r), this.A04, A0r), this.A05);
        AnonymousClass3ZG.A0I(A0r, 33);
        A0r.put(C86634Kw.A0t(21, this.A06, A0r), this.A07);
        A0r.put(19, this.A08);
        AnonymousClass3ZG.A0I(A0r, 34);
        A0r.put(C18270x1.A0M(C18270x1.A0N(12, this.A09, A0r), this.A0A, A0r), this.A0B);
        AnonymousClass3ZG.A0I(A0r, 35);
        A0r.put(AnonymousClass3ZG.A0F(29, this.A0C, A0r), this.A0D);
        A0r.put(31, this.A0E);
        AnonymousClass3ZG.A0I(A0r, 36);
        A0r.put(AnonymousClass3ZG.A09(22, this.A0F, A0r), this.A0G);
        A0r.put(24, this.A0H);
        AnonymousClass3ZG.A0I(A0r, 37);
        A0r.put(AnonymousClass0x2.A0O(AnonymousClass0x2.A0P(18, this.A0I, A0r), this.A0J, A0r), this.A0K);
        AnonymousClass3ZG.A0I(A0r, 38);
        A0r.put(C18270x1.A0D(C18270x1.A0E(C18290x4.A0a(), this.A0L, A0r), this.A0M, A0r), this.A0N);
        AnonymousClass3ZG.A0I(A0r, 39);
        A0r.put(C18270x1.A0G(C18270x1.A0H(C18290x4.A0d(), this.A0O, A0r), this.A0P, A0r), this.A0Q);
        Object A0x = C86634Kw.A0x(A0r, 40);
        AnonymousClass0x2.A1H(A0x, A0r, 25);
        AnonymousClass0x2.A1H(A0x, A0r, 26);
        AnonymousClass0x2.A1H(A0x, A0r, 27);
        AnonymousClass0x2.A1H(A0x, A0r, 41);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamPttDaily {");
        C57292tP.A00(A0o, "pttCancelBroadcast", this.A00);
        C57292tP.A00(A0o, "pttCancelGroup", this.A01);
        C57292tP.A00(A0o, "pttCancelIndividual", this.A02);
        C57292tP.A00(A0o, "pttDraftReviewBroadcast", this.A03);
        C57292tP.A00(A0o, "pttDraftReviewGroup", this.A04);
        C57292tP.A00(A0o, "pttDraftReviewIndividual", this.A05);
        C57292tP.A00(A0o, "pttFastplaybackBroadcast", this.A06);
        C57292tP.A00(A0o, "pttFastplaybackGroup", this.A07);
        C57292tP.A00(A0o, "pttFastplaybackIndividual", this.A08);
        C57292tP.A00(A0o, "pttLockBroadcast", this.A09);
        C57292tP.A00(A0o, "pttLockGroup", this.A0A);
        C57292tP.A00(A0o, "pttLockIndividual", this.A0B);
        C57292tP.A00(A0o, "pttOutOfChatBroadcast", this.A0C);
        C57292tP.A00(A0o, "pttOutOfChatGroup", this.A0D);
        C57292tP.A00(A0o, "pttOutOfChatIndividual", this.A0E);
        C57292tP.A00(A0o, "pttPausedRecordBroadcast", this.A0F);
        C57292tP.A00(A0o, "pttPausedRecordGroup", this.A0G);
        C57292tP.A00(A0o, "pttPausedRecordIndividual", this.A0H);
        C57292tP.A00(A0o, "pttPlaybackBroadcast", this.A0I);
        C57292tP.A00(A0o, "pttPlaybackGroup", this.A0J);
        C57292tP.A00(A0o, "pttPlaybackIndividual", this.A0K);
        C57292tP.A00(A0o, "pttRecordBroadcast", this.A0L);
        C57292tP.A00(A0o, "pttRecordGroup", this.A0M);
        C57292tP.A00(A0o, "pttRecordIndividual", this.A0N);
        C57292tP.A00(A0o, "pttSendBroadcast", this.A0O);
        C57292tP.A00(A0o, "pttSendGroup", this.A0P);
        return AnonymousClass3ZG.A0G(this.A0Q, "pttSendIndividual", A0o);
    }
}
