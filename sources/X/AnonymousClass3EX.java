package X;

import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;

/* renamed from: X.3EX  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3EX implements AnonymousClass49R {
    public final /* synthetic */ C614830y A00;
    public final /* synthetic */ String A01;

    public final void BUv(C53312mt r7) {
        C614830y r4 = this.A00;
        String str = this.A01;
        if (r7 != null) {
            String str2 = r7.A03;
            if (!str2.equals(str)) {
                r4.A00.A0A("linked-group-call/downgrade-ongoing-call", false, (String) null);
                C56762sW r2 = r4.A07;
                AnonymousClass3ZF A012 = r2.A01(r7.A00);
                if (A012 != null) {
                    r7.A02 = true;
                    r7.A01 = null;
                    A012.A0H((GroupJid) null);
                    A012.A0J(r7);
                    r2.A06(A012);
                    C18260x0.A0s("VoiceService/maybeClearCallLogWithSameGroupJid Cleaning up zombie call: ", str2, AnonymousClass001.A0o());
                    ArrayList A0s = AnonymousClass001.A0s();
                    A0s.add(C627436k.A07(str2));
                    r4.A03.A13.execute(new C70183a5(r4, 20, A0s));
                }
            }
        }
    }

    public /* synthetic */ AnonymousClass3EX(C614830y r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }
}
