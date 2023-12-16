package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4rP  reason: invalid class name and case insensitive filesystem */
public final class C94484rP extends AnonymousClass3ZG {
    public Integer A00;
    public Long A01;
    public Long A02;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(2, this.A00);
        r3.Blb(3, this.A01);
        r3.Blb(1, this.A02);
    }

    public C94484rP() {
        super(1250, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0D(C18270x1.A0F(C18280x3.A0S(), this.A00, A0r), this.A01, A0r), this.A02);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamStatusRevoke {");
        C57292tP.A00(A0o, "mediaType", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "statusLifeT", this.A01);
        return AnonymousClass3ZG.A0G(this.A02, "statusSessionId", A0o);
    }
}
