package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1XJ  reason: invalid class name */
public final class AnonymousClass1XJ extends AnonymousClass3ZG {
    public Integer A00;
    public Long A01;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(3, this.A01);
        r3.Blb(1, this.A00);
    }

    public AnonymousClass1XJ() {
        super(1034, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0N(C18270x1.A0K(C18270x1.A0L(C18270x1.A0D(C18270x1.A0M(C18270x1.A0E(C18270x1.A0J(C18270x1.A0G(C18270x1.A0H(C18270x1.A0I(C18290x4.A0a(), this.A01, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), this.A00, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamForwardPicker {");
        C57292tP.A00(A0o, "forwardPickerContactsSelected", this.A01);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A00), "forwardPickerResult", A0o);
    }
}
