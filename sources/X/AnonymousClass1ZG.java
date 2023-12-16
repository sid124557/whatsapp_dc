package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1ZG  reason: invalid class name */
public final class AnonymousClass1ZG extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(4, this.A00);
        r3.Blb(2, this.A02);
        r3.Blb(3, this.A01);
        r3.Blb(1, this.A03);
    }

    public AnonymousClass1ZG() {
        super(2474, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0D(C18270x1.A0F(C18270x1.A0E(C18290x4.A0b(), this.A00, A0r), this.A02, A0r), this.A01, A0r), this.A03);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamUserNoticeError {");
        C57292tP.A00(A0o, "noticeType", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "userNoticeContentVersion", this.A02);
        C57292tP.A00(A0o, "userNoticeErrorEvent", C18270x1.A0T(this.A01));
        return AnonymousClass3ZG.A0G(this.A03, "userNoticeId", A0o);
    }
}
