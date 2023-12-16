package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Zi  reason: invalid class name and case insensitive filesystem */
public final class C24941Zi extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public String A05;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A03);
        r3.Blb(2, this.A05);
        r3.Blb(7, this.A04);
        r3.Blb(5, this.A00);
        r3.Blb(3, this.A01);
        r3.Blb(8, this.A02);
    }

    public C24941Zi() {
        super(2450, new AnonymousClass5ZC(1000, 1000, SearchActionVerificationClientService.NOTIFICATION_ID, false), 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0J(C18270x1.A0E(AnonymousClass001.A0f(), this.A03, A0r), this.A05, A0r), this.A04);
        AnonymousClass3ZG.A0I(A0r, 6);
        A0r.put(C18270x1.A0F(C18290x4.A0c(), this.A00, A0r), this.A01);
        AnonymousClass3ZG.A0I(A0r, 4);
        A0r.put(C18310x6.A0e(), this.A02);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamDbPerf {");
        C57292tP.A00(A0o, "androidPerfDuration", this.A03);
        C57292tP.A00(A0o, "androidPerfName", this.A05);
        C57292tP.A00(A0o, "dbSizeInMb", this.A04);
        C57292tP.A00(A0o, "isMainMessageStoreMigrationCompleted", this.A00);
        C57292tP.A00(A0o, "onMainThread", this.A01);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A02), "startupStage", A0o);
    }
}
