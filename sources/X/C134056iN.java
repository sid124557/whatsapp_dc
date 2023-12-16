package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6iN  reason: invalid class name and case insensitive filesystem */
public final class C134056iN extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
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

    public C134056iN() {
        super(1914, new AnonymousClass5ZC(1, 1000, 2000, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(3, this.A02);
        r3.Blb(6, this.A03);
        r3.Blb(10, this.A04);
        r3.Blb(12, this.A05);
        r3.Blb(5, this.A06);
        r3.Blb(9, this.A07);
        r3.Blb(11, this.A08);
        r3.Blb(4, this.A09);
        r3.Blb(8, this.A0A);
        r3.Blb(7, this.A00);
        r3.Blb(1, this.A01);
        r3.Blb(2, this.A0B);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0E(C18270x1.A0D(C18270x1.A0J(C18270x1.A0K(C18270x1.A0G(C18270x1.A0N(C18270x1.A0L(C18270x1.A0H(C18270x1.A0O(C18270x1.A0M(C18270x1.A0I(C18290x4.A0a(), this.A02, A0r), this.A03, A0r), this.A04, A0r), this.A05, A0r), this.A06, A0r), this.A07, A0r), this.A08, A0r), this.A09, A0r), this.A0A, A0r), this.A00, A0r), this.A01, A0r), this.A0B);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamAndroidMediaFileScanEvent {");
        C57292tP.A00(A0o, "analyzeT", this.A02);
        C57292tP.A00(A0o, "bytesAnalyzed", this.A03);
        C57292tP.A00(A0o, "bytesMerged", this.A04);
        C57292tP.A00(A0o, "bytesRelinked", this.A05);
        C57292tP.A00(A0o, "filesAnalyzed", this.A06);
        C57292tP.A00(A0o, "filesMerged", this.A07);
        C57292tP.A00(A0o, "filesRelinked", this.A08);
        C57292tP.A00(A0o, "filesScanned", this.A09);
        C57292tP.A00(A0o, "filesToAnalyze", this.A0A);
        C57292tP.A00(A0o, "mediaType", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "origin", C18270x1.A0T(this.A01));
        return AnonymousClass3ZG.A0G(this.A0B, "scanT", A0o);
    }
}
