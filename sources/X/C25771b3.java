package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1b3  reason: invalid class name and case insensitive filesystem */
public final class C25771b3 extends AnonymousClass3ZG {
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

    public C25771b3() {
        super(2884, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(11, this.A00);
        r3.Blb(12, this.A01);
        r3.Blb(13, this.A02);
        r3.Blb(14, this.A03);
        r3.Blb(1, this.A04);
        r3.Blb(6, this.A05);
        r3.Blb(9, this.A06);
        r3.Blb(8, this.A07);
        r3.Blb(5, this.A08);
        r3.Blb(3, this.A09);
        r3.Blb(15, this.A0A);
        r3.Blb(2, this.A0B);
        r3.Blb(7, this.A0C);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0K(C18270x1.A0L(C18270x1.A0I(C18270x1.A0D(C18270x1.A0Q(C18270x1.A0P(C18270x1.A0O(AnonymousClass0x2.A0P(AnonymousClass0x2.A0O(C18300x5.A0Z(), this.A00, A0r), (Object) null, A0r), (Object) null, A0r), this.A01, A0r), this.A02, A0r), this.A03, A0r), this.A04, A0r), this.A05, A0r), this.A06, A0r), this.A07);
        AnonymousClass3ZG.A0I(A0r, 10);
        A0r.put(C18270x1.A0J(C18270x1.A0E(AnonymousClass0x2.A0N(C18270x1.A0F(C18290x4.A0c(), this.A08, A0r), this.A09, A0r), this.A0A, A0r), this.A0B, A0r), this.A0C);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamStickerDailyAggregatedEvent {");
        C57292tP.A00(A0o, "stickerAddToFavoriteCount", this.A00);
        C57292tP.A00(A0o, "stickerPackDeleteCount", this.A01);
        C57292tP.A00(A0o, "stickerPickerOpenedCount", this.A02);
        C57292tP.A00(A0o, "stickerSearchOpenedCount", this.A03);
        C57292tP.A00(A0o, "stickerSendCount", this.A04);
        C57292tP.A00(A0o, "stickerSendCountForward", this.A05);
        C57292tP.A00(A0o, "stickerSendCountIsAnimated", this.A06);
        C57292tP.A00(A0o, "stickerSendCountIsFirstParty", this.A07);
        C57292tP.A00(A0o, "stickerSendCountStickerPickerTabEmotion", this.A08);
        C57292tP.A00(A0o, "stickerSendCountStickerPickerTabFavorites", this.A09);
        C57292tP.A00(A0o, "stickerSendCountStickerPickerTabPack", this.A0A);
        C57292tP.A00(A0o, "stickerSendCountStickerPickerTabRecents", this.A0B);
        return AnonymousClass3ZG.A0G(this.A0C, "stickerSendCountStickerSearch", A0o);
    }
}
