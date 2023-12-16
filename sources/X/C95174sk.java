package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4sk  reason: invalid class name and case insensitive filesystem */
public final class C95174sk extends AnonymousClass3ZG {
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

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(34, this.A00);
        r3.Blb(36, this.A01);
        r3.Blb(37, this.A02);
        r3.Blb(1, this.A03);
        r3.Blb(2, this.A04);
        r3.Blb(4, this.A05);
        r3.Blb(5, this.A06);
        r3.Blb(6, this.A07);
        r3.Blb(7, this.A08);
        r3.Blb(8, this.A09);
        r3.Blb(9, this.A0A);
        r3.Blb(10, this.A0B);
        r3.Blb(13, this.A0C);
        r3.Blb(14, this.A0D);
        r3.Blb(15, this.A0E);
        r3.Blb(16, this.A0F);
        r3.Blb(17, this.A0G);
        r3.Blb(20, this.A0H);
        r3.Blb(21, this.A0I);
    }

    public C95174sk() {
        super(4224, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(34, this.A00);
        AnonymousClass3ZG.A0I(A0r, 35);
        A0r.put(36, this.A01);
        A0r.put(37, this.A02);
        AnonymousClass3ZG.A0I(A0r, 38);
        A0r.put(C18270x1.A0E(AnonymousClass001.A0f(), this.A03, A0r), this.A04);
        AnonymousClass3ZG.A0I(A0r, 3);
        A0r.put(C18270x1.A0L(C18270x1.A0K(C18270x1.A0J(C18270x1.A0I(C18270x1.A0H(C18290x4.A0b(), this.A05, A0r), this.A06, A0r), this.A07, A0r), this.A08, A0r), this.A09, A0r), this.A0A);
        AnonymousClass3ZG.A0I(A0r, 39);
        A0r.put(AnonymousClass0x2.A0Q(AnonymousClass0x2.A0P(AnonymousClass0x2.A0O(AnonymousClass0x2.A0N(C18270x1.A0Q(C18270x1.A0P(C18270x1.A0O(C18270x1.A0N(AnonymousClass0x7.A0h(), this.A0B, A0r), (Object) null, A0r), (Object) null, A0r), this.A0C, A0r), this.A0D, A0r), this.A0E, A0r), this.A0F, A0r), this.A0G, A0r), (Object) null);
        AnonymousClass0x2.A1H((Object) null, A0r, 19);
        A0r.put(C86634Kw.A0u(20, this.A0H, A0r), this.A0I);
        AnonymousClass3ZG.A0I(A0r, 22);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamScreenShareInfo {");
        C57292tP.A00(A0o, "audShareDialogCount", this.A00);
        C57292tP.A00(A0o, "audShareIssue", this.A01);
        C57292tP.A00(A0o, "audShareLastIssue", this.A02);
        C57292tP.A00(A0o, "ssAvgCaptureFps", this.A03);
        C57292tP.A00(A0o, "ssFreezeCount", this.A04);
        C57292tP.A00(A0o, "ssIssue", this.A05);
        C57292tP.A00(A0o, "ssLastIssue", this.A06);
        C57292tP.A00(A0o, "ssPermission", this.A07);
        C57292tP.A00(A0o, "ssPinchToZoom", this.A08);
        C57292tP.A00(A0o, "ssReceiverLandscapeDuration", this.A09);
        C57292tP.A00(A0o, "ssReceiverPipDuration", this.A0A);
        C57292tP.A00(A0o, "ssSharerPipDuration", this.A0B);
        C57292tP.A00(A0o, "ssSharerStopReason", this.A0C);
        C57292tP.A00(A0o, "ssStartDuration", this.A0D);
        C57292tP.A00(A0o, "ssStopDuration", this.A0E);
        C57292tP.A00(A0o, "ssTimeToFirstFrame", this.A0F);
        C57292tP.A00(A0o, "ssUserOpenedPickerCount", this.A0G);
        C57292tP.A00(A0o, "ssUserStartScreenShareCount", this.A0H);
        return AnonymousClass3ZG.A0G(this.A0I, "ssUserStopScreenShareCount", A0o);
    }
}
