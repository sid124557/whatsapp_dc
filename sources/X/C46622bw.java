package X;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.2bw  reason: invalid class name and case insensitive filesystem */
public final class C46622bw {
    public C49402gT A00;
    public final C29411im A01;
    public final AnonymousClass1VX A02;
    public final C56732sT A03;
    public final Set A04;
    public final ConcurrentHashMap A05 = AnonymousClass0x9.A1D();

    public final void A00(String str, int i) {
        StringBuilder A0o;
        String str2;
        C29411im r1 = this.A01;
        if (!r1.A06 || !AnonymousClass000.A1U(r1.A04, 2)) {
            A0o = AnonymousClass001.A0o();
            str2 = "VoiceChatAcceptPingManager/sendPing: XMPP connection state is not connected: callId = ";
        } else if (!this.A04.add(str)) {
            A0o = AnonymousClass001.A0o();
            str2 = "VoiceChatAcceptPingManager/sendPing: already sent ping for the call: callId = ";
        } else {
            AnonymousClass1VX r3 = this.A02;
            C58422vE r12 = C58422vE.A02;
            if ((r3.A0O(r12, 6008) & i) == 0) {
                A0o = AnonymousClass001.A0o();
                A0o.append("VoiceChatAcceptPingManager/sendPing: ping is not enabled: callId = ");
                A0o.append(str);
                A0o.append(", settings = ");
                A0o.append(r3.A0O(r12, 6008));
                A0o.append(", flag = ");
                A0o.append(i);
                AnonymousClass0x2.A19(A0o);
            }
            C56732sT r6 = this.A03;
            AnonymousClass4KL r5 = new AnonymousClass4KL(1, str, this);
            long A06 = C56952sp.A06(r3, 6009);
            if (1000 > A06 || A06 >= 32001) {
                A06 = 8000;
            }
            r6.A08(r5, A06);
            return;
        }
        A0o.append(str2);
        A0o.append(str);
        AnonymousClass0x2.A19(A0o);
    }

    public C46622bw(C29411im r2, C49402gT r3, AnonymousClass1VX r4, C56732sT r5) {
        C18260x0.A0c(r4, r2, r5, r3);
        this.A02 = r4;
        this.A01 = r2;
        this.A03 = r5;
        this.A00 = r3;
        Set newSetFromMap = Collections.newSetFromMap(AnonymousClass0x9.A1D());
        C162457s7.A0D(newSetFromMap);
        this.A04 = newSetFromMap;
    }
}
