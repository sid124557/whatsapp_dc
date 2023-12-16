package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.99b  reason: invalid class name and case insensitive filesystem */
public final class C1905999b extends AnonymousClass3ZG {
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
    public String A0G;

    public C1905999b() {
        super(4454, new AnonymousClass5ZC(1, 1, 1, false), 2, 0);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A0G);
        r3.Blb(2, this.A00);
        r3.Blb(3, this.A01);
        r3.Blb(4, this.A02);
        r3.Blb(5, this.A03);
        r3.Blb(6, this.A04);
        r3.Blb(7, this.A05);
        r3.Blb(8, this.A06);
        r3.Blb(9, this.A07);
        r3.Blb(10, this.A08);
        r3.Blb(11, this.A09);
        r3.Blb(12, this.A0A);
        r3.Blb(13, this.A0B);
        r3.Blb(14, this.A0C);
        r3.Blb(15, this.A0D);
        r3.Blb(16, this.A0E);
        r3.Blb(17, this.A0F);
    }

    public Map getFieldsMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(C18270x1.A0J(C18270x1.A0I(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A0G, linkedHashMap), this.A00, linkedHashMap), this.A01, linkedHashMap), this.A02, linkedHashMap), this.A03, linkedHashMap), this.A04, linkedHashMap), this.A05);
        linkedHashMap.put(8, this.A06);
        linkedHashMap.put(C18300x5.A0Y(), this.A07);
        linkedHashMap.put(10, this.A08);
        linkedHashMap.put(11, this.A09);
        linkedHashMap.put(12, this.A0A);
        linkedHashMap.put(13, this.A0B);
        linkedHashMap.put(C18320x8.A0W(), this.A0C);
        linkedHashMap.put(15, this.A0D);
        linkedHashMap.put(16, this.A0E);
        linkedHashMap.put(17, this.A0F);
        return linkedHashMap;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamPaymentsAnonymousDaily {");
        C57292tP.A00(A0o, "bizQrCodePhotoReceived", this.A0G);
        C57292tP.A00(A0o, "invitedUserCnt", this.A00);
        C57292tP.A00(A0o, "invitedUserRegisteredCnt", this.A01);
        C57292tP.A00(A0o, "inviterUserCnt", this.A02);
        C57292tP.A00(A0o, "invitesReceivedToUserCnt", this.A03);
        C57292tP.A00(A0o, "invitesSentToUserCnt", this.A04);
        C57292tP.A00(A0o, "startTs", this.A05);
        C57292tP.A00(A0o, "totalOneTimeMandateCnt", this.A06);
        C57292tP.A00(A0o, "totalRecurringMandateCnt", this.A07);
        C57292tP.A00(A0o, "totalTransactionReceivedCnt", this.A08);
        C57292tP.A00(A0o, "totalTransactionSentCnt", this.A09);
        C57292tP.A00(A0o, "transactionReceivedWithBackgroundAndStickerCnt", this.A0A);
        C57292tP.A00(A0o, "transactionReceivedWithBackgroundCnt", this.A0B);
        C57292tP.A00(A0o, "transactionReceivedWithStickerCnt", this.A0C);
        C57292tP.A00(A0o, "transactionSentWithBackgroundAndStickerCnt", this.A0D);
        C57292tP.A00(A0o, "transactionSentWithBackgroundCnt", this.A0E);
        return AnonymousClass3ZG.A0G(this.A0F, "transactionSentWithStickerCnt", A0o);
    }
}
