package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Yy  reason: invalid class name and case insensitive filesystem */
public final class C24841Yy extends AnonymousClass3ZG {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Long A03;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(4, this.A01);
        r3.Blb(1, this.A02);
        r3.Blb(3, this.A03);
        r3.Blb(2, this.A00);
    }

    public C24841Yy() {
        super(894, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0E(C18270x1.A0F(C18270x1.A0D(C18290x4.A0b(), this.A01, A0r), this.A02, A0r), this.A03, A0r), this.A00);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamE2eRetryAfterDelivery {");
        C57292tP.A00(A0o, "deviceType", C18270x1.A0T(this.A01));
        AnonymousClass3ZG.A0H(C18270x1.A0T(this.A02), A0o);
        C57292tP.A00(A0o, "msgRetryCount", this.A03);
        return AnonymousClass3ZG.A0G(this.A00, "retryRevoke", A0o);
    }
}
