package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4sn  reason: invalid class name and case insensitive filesystem */
public final class C95204sn extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
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

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(24, this.A00);
        r3.Blb(25, this.A01);
        r3.Blb(16, this.A08);
        r3.Blb(22, this.A02);
        r3.Blb(4, this.A09);
        r3.Blb(10, this.A0A);
        r3.Blb(3, this.A0B);
        r3.Blb(11, this.A0C);
        r3.Blb(18, this.A0D);
        r3.Blb(26, this.A03);
        r3.Blb(14, this.A04);
        r3.Blb(2, this.A0E);
        r3.Blb(5, this.A0F);
        r3.Blb(12, this.A0G);
        r3.Blb(15, this.A0H);
        r3.Blb(13, this.A0I);
        r3.Blb(1, this.A05);
        r3.Blb(31, this.A0J);
        r3.Blb(32, this.A0K);
        r3.Blb(23, this.A0L);
        r3.Blb(27, this.A06);
        r3.Blb(30, this.A0M);
        r3.Blb(17, this.A0N);
        r3.Blb(28, this.A07);
    }

    public C95204sn() {
        super(1038, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(AnonymousClass3ZG.A0B(AnonymousClass0x2.A0Q(C18270x1.A0N(C18270x1.A0F(C18270x1.A0M(C18270x1.A0G(AnonymousClass3ZG.A08(AnonymousClass0x2.A0O(C18290x4.A0f(24, this.A00, A0r), this.A01, A0r), this.A08, A0r), this.A02, A0r), this.A09, A0r), this.A0A, A0r), this.A0B, A0r), this.A0C, A0r), this.A0D, A0r), this.A03);
        AnonymousClass0x2.A1H(C86634Kw.A0x(A0r, 19), A0r, 20);
        A0r.put(C18320x8.A0W(), this.A04);
        AnonymousClass3ZG.A0I(A0r, 21);
        A0r.put(C18270x1.A0H(C18280x3.A0S(), this.A0E, A0r), this.A0F);
        AnonymousClass3ZG.A0I(A0r, 29);
        A0r.put(C18270x1.A0D(C18270x1.A0P(AnonymousClass0x2.A0N(12, this.A0G, A0r), this.A0H, A0r), this.A0I, A0r), this.A05);
        A0r.put(31, this.A0J);
        A0r.put(AnonymousClass3ZG.A0D(AnonymousClass0x2.A0P(AnonymousClass3ZG.A0F(AnonymousClass3ZG.A0C(AnonymousClass3ZG.A09(32, this.A0K, A0r), this.A0L, A0r), this.A06, A0r), this.A0M, A0r), this.A0N, A0r), this.A07);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamMediaPicker {");
        C57292tP.A00(A0o, "audienceSelectorClicked", this.A00);
        C57292tP.A00(A0o, "audienceSelectorUpdated", this.A01);
        C57292tP.A00(A0o, "chatRecipients", this.A08);
        C57292tP.A00(A0o, "isViewOnce", this.A02);
        C57292tP.A00(A0o, "mediaPickerChanged", this.A09);
        C57292tP.A00(A0o, "mediaPickerCroppedRotated", this.A0A);
        C57292tP.A00(A0o, "mediaPickerDeleted", this.A0B);
        C57292tP.A00(A0o, "mediaPickerDrawing", this.A0C);
        C57292tP.A00(A0o, "mediaPickerFilter", this.A0D);
        C57292tP.A00(A0o, "mediaPickerHasLocationSticker", this.A03);
        C57292tP.A00(A0o, "mediaPickerOrigin", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "mediaPickerSent", this.A0E);
        C57292tP.A00(A0o, "mediaPickerSentUnchanged", this.A0F);
        C57292tP.A00(A0o, "mediaPickerStickers", this.A0G);
        C57292tP.A00(A0o, "mediaPickerT", this.A0H);
        C57292tP.A00(A0o, "mediaPickerText", this.A0I);
        C57292tP.A00(A0o, "mediaType", C18270x1.A0T(this.A05));
        C57292tP.A00(A0o, "motionPhotoImpressionCount", this.A0J);
        C57292tP.A00(A0o, "motionPhotoSentCount", this.A0K);
        C57292tP.A00(A0o, "photoGalleryDurationT", this.A0L);
        C57292tP.A00(A0o, "photoQualitySetting", C18270x1.A0T(this.A06));
        C57292tP.A00(A0o, "pickerSessionId", this.A0M);
        C57292tP.A00(A0o, "statusRecipients", this.A0N);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A07), "videoQualitySetting", A0o);
    }
}
