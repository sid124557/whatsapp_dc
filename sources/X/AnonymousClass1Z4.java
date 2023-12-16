package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Z4  reason: invalid class name */
public final class AnonymousClass1Z4 extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A02);
        r3.Blb(3, this.A00);
        r3.Blb(2, this.A01);
        r3.Blb(4, this.A03);
    }

    public AnonymousClass1Z4() {
        super(2180, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0F(AnonymousClass001.A0f(), this.A02, A0r), this.A00);
        AnonymousClass3ZG.A0I(A0r, 5);
        A0r.put(C18280x3.A0S(), this.A01);
        AnonymousClass3ZG.A0I(A0r, 6);
        A0r.put(C18290x4.A0b(), this.A03);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamMdDeviceSyncAck {");
        C57292tP.A00(A0o, "chatType", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "isLid", this.A00);
        C57292tP.A00(A0o, "revoke", this.A01);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A03), "typeOfGroup", A0o);
    }
}
