package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4rx  reason: invalid class name and case insensitive filesystem */
public final class C94814rx extends AnonymousClass3ZG {
    public Long A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;

    public C94814rx() {
        super(3982, new AnonymousClass5ZC(1, 1000, SearchActionVerificationClientService.NOTIFICATION_ID, false), 2, 0);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(5, this.A00);
        r3.Blb(1, this.A01);
        r3.Blb(2, this.A02);
        r3.Blb(3, this.A03);
        r3.Blb(4, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(C18270x1.A0D(C18290x4.A0c(), this.A00, A0r), this.A01, A0r), this.A02, A0r), this.A03, A0r), this.A04);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamXappCommunicationDetection {");
        C57292tP.A00(A0o, "buildId", this.A00);
        C57292tP.A00(A0o, "uriAuthority", this.A01);
        C57292tP.A00(A0o, "xappCommunicationOperation", this.A02);
        C57292tP.A00(A0o, "xappCommunicationScope", this.A03);
        return AnonymousClass3ZG.A0G(this.A04, "xappContext", A0o);
    }
}
