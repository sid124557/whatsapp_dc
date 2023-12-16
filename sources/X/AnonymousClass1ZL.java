package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1ZL  reason: invalid class name */
public final class AnonymousClass1ZL extends AnonymousClass3ZG {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public String A03;
    public String A04;

    public AnonymousClass1ZL() {
        super(3602, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A01);
        r3.Blb(2, this.A02);
        r3.Blb(3, this.A03);
        r3.Blb(5, this.A00);
        r3.Blb(4, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0G(C18270x1.A0H(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A01, A0r), this.A02, A0r), this.A03, A0r), this.A00, A0r), this.A04);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamAvatarEdit {");
        C57292tP.A00(A0o, "avatarEditEntryPoint", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "avatarEditEvent", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "avatarEditorSessionId", this.A03);
        C57292tP.A00(A0o, "isAutogen", this.A00);
        return AnonymousClass3ZG.A0G(this.A04, "waAvatarSessionId", A0o);
    }
}
