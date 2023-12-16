package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4rM  reason: invalid class name and case insensitive filesystem */
public final class C94454rM extends AnonymousClass3ZG {
    public Integer A00;
    public String A01;
    public String A02;

    public C94454rM() {
        super(3456, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, (Object) null);
        r3.Blb(2, this.A01);
        r3.Blb(7, this.A02);
        r3.Blb(8, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        AnonymousClass3ZG.A0I(A0r, 1);
        A0r.put(C18270x1.A0O(C18270x1.A0M(C18270x1.A0L(C18270x1.A0N(C18270x1.A0K(C18270x1.A0J(C18270x1.A0I(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18280x3.A0S(), this.A01, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), this.A02, A0r), this.A00, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamOrderDetailsActionsSmb {");
        C162457s7.A0J("acceptedPayMethods", 1);
        C57292tP.A00(A0o, "actionCategory", this.A01);
        C57292tP.A00(A0o, "orderDetailEntryPoint", this.A02);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A00), "orderDetailsCreationAction", A0o);
    }
}
