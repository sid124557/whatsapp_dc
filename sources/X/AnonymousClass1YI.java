package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1YI  reason: invalid class name */
public final class AnonymousClass1YI extends AnonymousClass3ZG {
    public Integer A00;
    public Long A01;
    public String A02;

    public AnonymousClass1YI() {
        super(2880, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(2, this.A00);
        r3.Blb(28, this.A01);
        r3.Blb(1, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0P(C18320x8.A0W(), (Object) null, A0r), (Object) null);
        AnonymousClass0x2.A1H((Object) null, A0r, 16);
        A0r.put(C18270x1.A0G(C18270x1.A0F(C18270x1.A0N(C18270x1.A0O(C18270x1.A0L(C18270x1.A0M(C18270x1.A0J(C18270x1.A0K(AnonymousClass0x9.A0j(), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null);
        AnonymousClass0x2.A1H((Object) null, A0r, 29);
        AnonymousClass0x2.A1H((Object) null, A0r, 30);
        AnonymousClass0x2.A1H((Object) null, A0r, 31);
        AnonymousClass0x2.A1H((Object) null, A0r, 26);
        A0r.put(C18270x1.A0E(27, (Object) null, A0r), this.A00);
        A0r.put(AnonymousClass3ZG.A0A(AnonymousClass3ZG.A0D(C18270x1.A0I(32, (Object) null, A0r), (Object) null, A0r), this.A01, A0r), (Object) null);
        A0r.put(C18270x1.A0H(C18270x1.A0D(33, (Object) null, A0r), this.A02, A0r), (Object) null);
        AnonymousClass0x2.A1H((Object) null, A0r, 25);
        AnonymousClass0x2.A1H((Object) null, A0r, 18);
        AnonymousClass0x2.A1H((Object) null, A0r, 19);
        AnonymousClass0x2.A1H((Object) null, A0r, 20);
        AnonymousClass0x2.A1H((Object) null, A0r, 21);
        AnonymousClass0x2.A1H((Object) null, A0r, 22);
        AnonymousClass0x2.A1H((Object) null, A0r, 23);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamDirectoryBusinessOnboardingSmbClient {");
        String str = null;
        C162457s7.A0J("directoryActions", 1);
        Integer num = this.A00;
        if (num != null) {
            str = num.toString();
        }
        C57292tP.A00(A0o, "directoryEntryPoint", str);
        C162457s7.A0J("directoryEntrypointVersion", 1);
        C162457s7.A0J("directoryNotificationType", 1);
        C57292tP.A00(A0o, "directoryOnboardingLoggingVersion", this.A01);
        return AnonymousClass3ZG.A0G(this.A02, "directorySessionId", A0o);
    }
}
