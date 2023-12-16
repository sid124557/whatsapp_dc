package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.Mp4Ops;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6iT  reason: invalid class name and case insensitive filesystem */
public final class C134116iT extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Integer A02;
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

    public static void A01(C134116iT r2, Integer num, Long l) {
        r2.A00 = 1;
        r2.A07 = l;
        r2.A08 = l;
        r2.A09 = l;
        r2.A0A = l;
        r2.A0B = l;
        r2.A0C = Long.valueOf(System.nanoTime());
        r2.A02 = num;
        r2.A01 = Integer.valueOf(Mp4Ops.getMp4opsImpl());
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A03);
        r3.Blb(2, this.A04);
        r3.Blb(3, this.A05);
        r3.Blb(4, this.A06);
        r3.Blb(5, this.A00);
        r3.Blb(12, this.A07);
        r3.Blb(6, this.A08);
        r3.Blb(7, this.A09);
        r3.Blb(8, this.A01);
        r3.Blb(13, this.A0A);
        r3.Blb(9, this.A0B);
        r3.Blb(10, this.A0C);
        r3.Blb(11, this.A02);
    }

    public C134116iT() {
        super(4644, new AnonymousClass5ZC(1, 1000, SearchActionVerificationClientService.NOTIFICATION_ID, false), 2, 113760892);
    }

    public static void A00(C134116iT r2, File file, Long l) {
        r2.A03 = l;
        r2.A04 = l;
        r2.A05 = Long.valueOf(file.length());
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0N(C18270x1.A0M(C18270x1.A0L(C18270x1.A0P(C18270x1.A0K(C18270x1.A0J(C18270x1.A0I(C18270x1.A0O(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A03, A0r), this.A04, A0r), this.A05, A0r), this.A06, A0r), this.A00, A0r), this.A07, A0r), this.A08, A0r), this.A09, A0r), this.A01, A0r), this.A0A, A0r), this.A0B, A0r), this.A0C, A0r), this.A02);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamWamediaImgopsEvent {");
        C57292tP.A00(A0o, "wamediaImgopsContentLength", this.A03);
        C57292tP.A00(A0o, "wamediaImgopsErrorTolerance", this.A04);
        C57292tP.A00(A0o, "wamediaImgopsFileSize", this.A05);
        C57292tP.A00(A0o, "wamediaImgopsFileSizeOut", this.A06);
        C57292tP.A00(A0o, "wamediaImgopsFileType", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "wamediaImgopsFrameDurationMs", this.A07);
        C57292tP.A00(A0o, "wamediaImgopsImageHeight", this.A08);
        C57292tP.A00(A0o, "wamediaImgopsImageWidth", this.A09);
        C57292tP.A00(A0o, "wamediaImgopsImpl", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "wamediaImgopsNumFrames", this.A0A);
        C57292tP.A00(A0o, "wamediaImgopsReturnValue", this.A0B);
        C57292tP.A00(A0o, "wamediaImgopsTimeElapsedNs", this.A0C);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A02), "wamediaImgopsType", A0o);
    }
}
