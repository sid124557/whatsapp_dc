package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1aj  reason: invalid class name and case insensitive filesystem */
public final class C25571aj extends AnonymousClass3ZG {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public String A08;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(10, this.A01);
        r3.Blb(1, this.A03);
        r3.Blb(6, this.A00);
        r3.Blb(3, this.A04);
        r3.Blb(8, this.A05);
        r3.Blb(5, this.A06);
        r3.Blb(9, this.A02);
        r3.Blb(7, this.A07);
        r3.Blb(4, this.A08);
    }

    public C25571aj() {
        super(2496, AnonymousClass0x9.A0T(1000, SearchActionVerificationClientService.NOTIFICATION_ID, 20000), 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        AnonymousClass3ZG.A0I(A0r, 2);
        A0r.put(C18270x1.A0G(C18270x1.A0J(C18270x1.A0L(C18270x1.A0H(C18270x1.A0K(C18270x1.A0F(C18270x1.A0I(C18270x1.A0D(AnonymousClass0x7.A0h(), this.A01, A0r), this.A03, A0r), this.A00, A0r), this.A04, A0r), this.A05, A0r), this.A06, A0r), this.A02, A0r), this.A07, A0r), this.A08);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamReceiptStanzaReceive {");
        AnonymousClass3ZG.A0H(C18270x1.A0T(this.A01), A0o);
        C57292tP.A00(A0o, "receiptStanzaDuration", this.A03);
        C57292tP.A00(A0o, "receiptStanzaHasOrphaned", this.A00);
        C57292tP.A00(A0o, "receiptStanzaOfflineCount", this.A04);
        C57292tP.A00(A0o, "receiptStanzaProcessedCount", this.A05);
        C57292tP.A00(A0o, "receiptStanzaRetryVer", this.A06);
        C57292tP.A00(A0o, "receiptStanzaStage", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "receiptStanzaTotalCount", this.A07);
        return AnonymousClass3ZG.A0G(this.A08, "receiptStanzaType", A0o);
    }
}
