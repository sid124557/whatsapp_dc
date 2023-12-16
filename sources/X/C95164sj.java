package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4sj  reason: invalid class name and case insensitive filesystem */
public final class C95164sj extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Double A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public Integer A0C;
    public Integer A0D;
    public Long A0E;
    public Long A0F;
    public Long A0G;
    public String A0H;

    public C95164sj() {
        super(3664, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A07);
        r3.Blb(2, this.A00);
        r3.Blb(3, this.A08);
        r3.Blb(4, this.A0E);
        r3.Blb(5, this.A0H);
        r3.Blb(18, this.A09);
        r3.Blb(6, this.A0A);
        r3.Blb(7, this.A01);
        r3.Blb(16, this.A0F);
        r3.Blb(8, this.A02);
        r3.Blb(17, this.A0B);
        r3.Blb(9, this.A03);
        r3.Blb(10, this.A04);
        r3.Blb(11, this.A0C);
        r3.Blb(12, this.A0D);
        r3.Blb(13, this.A06);
        r3.Blb(14, this.A05);
        r3.Blb(15, this.A0G);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(AnonymousClass0x2.A0N(C18270x1.A0Q(C18270x1.A0P(C18270x1.A0O(C18270x1.A0N(C18270x1.A0M(C18270x1.A0L(AnonymousClass0x2.A0P(C18270x1.A0K(AnonymousClass0x2.A0O(C18270x1.A0J(C18270x1.A0I(AnonymousClass0x2.A0Q(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A07, A0r), this.A00, A0r), this.A08, A0r), this.A0E, A0r), this.A0H, A0r), this.A09, A0r), this.A0A, A0r), this.A01, A0r), this.A0F, A0r), this.A02, A0r), this.A0B, A0r), this.A03, A0r), this.A04, A0r), this.A0C, A0r), this.A0D, A0r), this.A06, A0r), this.A05, A0r), this.A0G);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamCameraCaptureFlow {");
        C57292tP.A00(A0o, "cameraCaptureDirection", C18270x1.A0T(this.A07));
        C57292tP.A00(A0o, "cameraCaptureUserCancelled", this.A00);
        C57292tP.A00(A0o, "cameraEntryPoint", C18270x1.A0T(this.A08));
        C57292tP.A00(A0o, "cameraErrorCode", this.A0E);
        C57292tP.A00(A0o, "cameraErrorDomain", this.A0H);
        C57292tP.A00(A0o, "cameraEventName", C18270x1.A0T(this.A09));
        C57292tP.A00(A0o, "cameraFlashMode", C18270x1.A0T(this.A0A));
        C57292tP.A00(A0o, "cameraGalleryBrowserClosed", this.A01);
        C57292tP.A00(A0o, "cameraGalleryBrowserMediaItemCount", this.A0F);
        C57292tP.A00(A0o, "cameraGalleryBrowserMediaUsed", this.A02);
        C57292tP.A00(A0o, "cameraGalleryBrowserSelectionType", C18270x1.A0T(this.A0B));
        C57292tP.A00(A0o, "cameraGalleryStripMediaUsed", this.A03);
        C57292tP.A00(A0o, "cameraLowLight", this.A04);
        C57292tP.A00(A0o, "cameraMediaType", C18270x1.A0T(this.A0C));
        C57292tP.A00(A0o, "cameraOrientation", C18270x1.A0T(this.A0D));
        C57292tP.A00(A0o, "cameraVideoCaptureDuration", this.A06);
        C57292tP.A00(A0o, "cameraZoomUsed", this.A05);
        return AnonymousClass3ZG.A0G(this.A0G, "mediaFlowSessionId", A0o);
    }
}
