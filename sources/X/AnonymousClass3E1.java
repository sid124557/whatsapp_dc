package X;

import com.whatsapp.jid.UserJid;
import java.util.Map;

/* renamed from: X.3E1  reason: invalid class name */
public final class AnonymousClass3E1 implements AnonymousClass49B {
    public final /* synthetic */ AnonymousClass1QN A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ AnonymousClass1EU A02;
    public final /* synthetic */ AnonymousClass3ST A03;

    public AnonymousClass3E1(AnonymousClass1QN r1, UserJid userJid, AnonymousClass1EU r3, AnonymousClass3ST r4) {
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = userJid;
    }

    public void BLH() {
        long j;
        long j2;
        Map A012 = AnonymousClass31O.A01(C18300x5.A0j(C625235k.A00(this.A02).A0N()));
        String A0o = C18310x6.A0o("flow_version_id", A012);
        if (A0o != null) {
            j = Long.parseLong(A0o);
        } else {
            j = 0;
        }
        C18260x0.A10("ExtensionsLogger/ExtensionsV1Action/Pre-fetching layout for flowVersionId:", AnonymousClass001.A0o(), j);
        AnonymousClass1QN r7 = this.A00;
        C61252zx A013 = r7.A01.A01(j);
        if (A013 != null) {
            AnonymousClass3ST r9 = this.A03;
            UserJid userJid = this.A01;
            String A0o2 = C18310x6.A0o("flow_version_id", A012);
            if (A0o2 != null) {
                j2 = Long.parseLong(A0o2);
            } else {
                j2 = 0;
            }
            r7.A00.BkS(new C70703av(A013, r7, userJid, r9, C18310x6.A0o("flow_id", A012), j2));
        }
    }
}
