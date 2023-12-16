package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Za  reason: invalid class name and case insensitive filesystem */
public final class C24861Za extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Long A04;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(4, this.A00);
        r3.Blb(6, this.A01);
        r3.Blb(3, this.A02);
        r3.Blb(2, this.A03);
        r3.Blb(1, this.A04);
    }

    public C24861Za() {
        super(1180, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0D(C18270x1.A0E(C18270x1.A0F(C18270x1.A0I(C18290x4.A0b(), this.A00, A0r), this.A01, A0r), this.A02, A0r), this.A03, A0r), this.A04);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamStatusReply {");
        C57292tP.A00(A0o, "isPosterBiz", this.A00);
        C57292tP.A00(A0o, "isPosterInAddressBook", this.A01);
        C57292tP.A00(A0o, "statusReplyMessageType", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "statusReplyResult", C18270x1.A0T(this.A03));
        return AnonymousClass3ZG.A0G(this.A04, "statusSessionId", A0o);
    }
}
