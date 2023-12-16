package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1aq  reason: invalid class name and case insensitive filesystem */
public final class C25641aq extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Long A07;
    public Long A08;
    public Long A09;

    public C25641aq() {
        super(2244, new AnonymousClass5ZC(1, 1, 100, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(6, this.A03);
        r3.Blb(14, this.A00);
        r3.Blb(3, this.A07);
        r3.Blb(1, this.A04);
        r3.Blb(2, this.A08);
        r3.Blb(11, this.A09);
        r3.Blb(10, this.A01);
        r3.Blb(4, this.A05);
        r3.Blb(9, this.A06);
        r3.Blb(5, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18290x4.A0d(), this.A03);
        AnonymousClass3ZG.A0I(A0r, 12);
        A0r.put(C18320x8.A0W(), this.A00);
        AnonymousClass3ZG.A0I(A0r, 13);
        A0r.put(C18270x1.A0H(C18270x1.A0L(C18270x1.A0G(C18270x1.A0M(C18270x1.A0N(C18270x1.A0E(C18270x1.A0D(C18290x4.A0a(), this.A07, A0r), this.A04, A0r), this.A08, A0r), this.A09, A0r), this.A01, A0r), this.A05, A0r), this.A06, A0r), this.A02);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamPsBufferUpload {");
        C57292tP.A00(A0o, "applicationState", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "isUserSampled", this.A00);
        C57292tP.A00(A0o, "psBufferUploadHttpResponseCode", this.A07);
        C57292tP.A00(A0o, "psBufferUploadResult", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "psBufferUploadT", this.A08);
        C57292tP.A00(A0o, "psDitheredT", this.A09);
        C57292tP.A00(A0o, "psForceUpload", this.A01);
        C57292tP.A00(A0o, "psTokenNotReadyReason", C18270x1.A0T(this.A05));
        C57292tP.A00(A0o, "psUploadReason", C18270x1.A0T(this.A06));
        return AnonymousClass3ZG.A0G(this.A02, "waConnectedToChatd", A0o);
    }
}
