package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.Iterator;

/* renamed from: X.5n8  reason: invalid class name and case insensitive filesystem */
public class C114495n8 implements AnonymousClass4EN {
    public long A00;
    public AnonymousClass667 A01;
    public final C69263Wi A02;
    public final C29441ip A03;
    public final C56612sH A04;
    public final C989153s A05;
    public final C53682nU A06;
    public final AnonymousClass5GR A07;
    public final AnonymousClass8E9 A08;
    public final AnonymousClass5PS A09;
    public final AnonymousClass4FS A0A;

    public void A00() {
        if (!this.A03.A0F()) {
            A02(-1);
            return;
        }
        this.A0A.BkM(new C71533cG((Object) this, 6));
        this.A00 = System.currentTimeMillis();
    }

    public final void A01() {
        AnonymousClass8E9 r2 = this.A08;
        long j = this.A00;
        r2.BKK((Integer) null, Long.valueOf(j), Long.valueOf(AnonymousClass0x9.A05(j)), (String) null, (String) null, (String) null, "xwa_linked_business_account_posts");
    }

    public final void A02(int i) {
        this.A02.A0S(new C117705sM((Object) this, i, 38));
        A01();
    }

    public void AyP(AnonymousClass2SI r6) {
        Object obj;
        if (r6.A00 != 0 || (obj = r6.A03.A00) == null) {
            A02(2);
            return;
        }
        C989153s r3 = this.A05;
        AnonymousClass5SB r4 = (AnonymousClass5SB) obj;
        UserJid userJid = this.A06.A03;
        synchronized (r3) {
            AnonymousClass5RQ r1 = r4.A00;
            if (r1 != null) {
                r3.A00.put(userJid, r1);
            }
            AnonymousClass5RQ r12 = r4.A01;
            if (r12 != null) {
                r3.A02.put(userJid, r12);
            }
            String str = r4.A02;
            if (str != null) {
                r3.A01.put(userJid, str);
            }
        }
        this.A02.A0S(new C71533cG((Object) this, 5));
        A01();
    }

    public void BQq(IOException iOException) {
        Log.d(AnonymousClass000.A0a("LinkedAccountMediaGraphQLService/onDeliveryFailure: ", AnonymousClass001.A0o(), iOException));
        A02(1);
    }

    public void BSB(Exception exc) {
        if (exc instanceof AnonymousClass244) {
            A02(2);
            C618532n r2 = ((AnonymousClass244) exc).error;
            AnonymousClass5PS r1 = this.A09;
            Integer valueOf = Integer.valueOf(r2.A01);
            Integer valueOf2 = Integer.valueOf(r2.A00);
            Iterator A0j = AnonymousClass0x2.A0j(r1.A00);
            while (A0j.hasNext()) {
                ((C111525iE) A0j.next()).BKM(valueOf, valueOf2, (Integer) null, "xwa_linked_business_account_posts", (String) null, (String) null, 0);
            }
        }
        A02(3);
    }

    public C114495n8(C69263Wi r3, C29441ip r4, C56612sH r5, C989153s r6, AnonymousClass667 r7, C53682nU r8, AnonymousClass5GS r9, AnonymousClass8E9 r10, AnonymousClass5PS r11, AnonymousClass4FS r12) {
        this.A04 = r5;
        this.A06 = r8;
        this.A02 = r3;
        this.A01 = r7;
        this.A0A = r12;
        this.A05 = r6;
        this.A09 = r11;
        Object A0i = AnonymousClass001.A0i(r9.A00, 1);
        C626936e.A06(A0i);
        this.A07 = (AnonymousClass5GR) A0i;
        this.A08 = r10;
        this.A03 = r4;
    }
}
