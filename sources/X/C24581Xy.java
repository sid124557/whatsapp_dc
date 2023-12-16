package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Xy  reason: invalid class name and case insensitive filesystem */
public final class C24581Xy extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Long A02;

    public C24581Xy() {
        super(2170, AnonymousClass0x9.A0T(1, SearchActionVerificationClientService.NOTIFICATION_ID, 20000), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A02);
        r3.Blb(3, this.A00);
        r3.Blb(2, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        AnonymousClass3ZG.A0I(A0r, 11);
        A0r.put(AnonymousClass001.A0f(), this.A02);
        AnonymousClass3ZG.A0I(A0r, 9);
        A0r.put(C18270x1.A0E(C18270x1.A0K(C18270x1.A0G(C18270x1.A0H(C18270x1.A0J(C18270x1.A0I(C18290x4.A0a(), this.A00, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), this.A01);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamAndroidMessageTargetPerf {");
        C57292tP.A00(A0o, "durationReceiptT", this.A02);
        C57292tP.A00(A0o, "mediaType", C18270x1.A0T(this.A00));
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A01), "targetStage", A0o);
    }
}
