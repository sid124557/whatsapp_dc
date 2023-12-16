package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.99W  reason: invalid class name */
public final class AnonymousClass99W extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public String A02;

    public AnonymousClass99W() {
        super(3580, new AnonymousClass5ZC(1, 1, 1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A02);
        r3.Blb(3, this.A00);
        r3.Blb(4, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A02, linkedHashMap), (Object) null, linkedHashMap), this.A00, linkedHashMap), this.A01);
        return linkedHashMap;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamAndroidRootedDeviceCheck {");
        C57292tP.A00(A0o, "checkLocation", this.A02);
        C57292tP.A00(A0o, "rwPaths", this.A00);
        return AnonymousClass3ZG.A0G(this.A01, "suExists", A0o);
    }
}
