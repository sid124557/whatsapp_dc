package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendPaymentInviteSetupJob;
import java.util.Map;

/* renamed from: X.9Sk  reason: invalid class name and case insensitive filesystem */
public class C194319Sk {
    public final C49712gy A00;
    public final C56612sH A01;
    public final C66543Lv A02;
    public final C620933l A03;
    public final AnonymousClass9U5 A04;
    public final C1907099n A05;
    public final AnonymousClass9U4 A06;
    public final AnonymousClass9NE A07;

    public synchronized void A00(UserJid userJid, int i, long j) {
        AnonymousClass9TC A042 = AnonymousClass9U4.A04(this.A06);
        C1907099n r6 = this.A05;
        if (!r6.A02() || A042 == null || !A042.A03.A0C()) {
            C620933l r5 = this.A03;
            Map A09 = r5.A09(r5.A03().getString("payments_inviter_jids_with_expiry", ""));
            Long l = (Long) A09.get(userJid);
            if (l == null || l.longValue() < j) {
                A09.put(userJid, Long.valueOf(j));
                C18270x1.A0j(C620933l.A00(r5), "payments_inviter_jids_with_expiry", C620933l.A02(A09));
            }
            if (!r6.A02()) {
                long A0H = this.A01.A0H();
                if (j < A0H) {
                    j = A0H + 7776000000L;
                }
                r5.A0F(0, j);
            }
        } else {
            A01(userJid, i, false);
        }
        AnonymousClass2YY r7 = this.A04.A0G.A04;
        String rawString = userJid.getRawString();
        synchronized (r7) {
            AnonymousClass7WN r52 = r7.A01;
            C161307pP A002 = r52.A00();
            A002.A00++;
            A002.A0E.add(rawString);
            r52.A01(A002);
        }
    }

    public final void A01(UserJid userJid, int i, boolean z) {
        this.A00.A02(new SendPaymentInviteSetupJob(userJid, i, z));
        C620933l r3 = this.A03;
        Map A09 = r3.A09(r3.A03().getString("payments_inviter_jids_with_expiry", ""));
        A09.remove(userJid);
        C18270x1.A0j(C620933l.A00(r3), "payments_inviter_jids_with_expiry", C620933l.A02(A09));
    }

    public C194319Sk(C49712gy r1, C56612sH r2, C66543Lv r3, C620933l r4, AnonymousClass9U5 r5, C1907099n r6, AnonymousClass9U4 r7, AnonymousClass9NE r8) {
        this.A01 = r2;
        this.A00 = r1;
        this.A06 = r7;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r6;
        this.A07 = r8;
    }
}
