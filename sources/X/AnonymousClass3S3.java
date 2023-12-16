package X;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3S3  reason: invalid class name */
public class AnonymousClass3S3 implements C188008yA {
    public final Handler A00 = AnonymousClass000.A0A();
    public final C29301ib A01;
    public final C56642sK A02;
    public final AnonymousClass33S A03;
    public final AnonymousClass4FS A04;
    public final HashMap A05 = AnonymousClass001.A0t();
    public final HashMap A06 = AnonymousClass001.A0t();
    public final Set A07 = AnonymousClass002.A0K();

    public static /* synthetic */ void A00(C95814uZ r6, C41662Lc r7, AnonymousClass3S3 r8) {
        HashMap hashMap = r8.A06;
        AnonymousClass2SS r0 = (AnonymousClass2SS) hashMap.get(r6);
        if ((r0 == null || r0.A02 != 1) && r7 != null) {
            AnonymousClass33S r2 = r8.A03;
            byte[] bArr = r7.A00;
            C29411im r1 = r2.A02;
            if (!r1.A06 || !AnonymousClass000.A1U(r1.A04, 2)) {
                r8.A07.add(r6);
                return;
            }
            C18260x0.A1R(AnonymousClass001.A0o(), "app/send-presence-subscription jid=", r6);
            AnonymousClass31C r3 = r2.A04;
            Message A0J = C18290x4.A0J(12, r6);
            if (bArr != null) {
                A0J.getData().putByteArray("tctoken", bArr);
            }
            r3.A0J(A0J);
            C18290x4.A0R(r6, hashMap).A02 = 1;
            r8.A07.remove(r6);
        }
    }

    public int A01(C95814uZ r8, UserJid userJid) {
        C41642La r6;
        AnonymousClass2SS r62 = (AnonymousClass2SS) this.A06.get(r8);
        if (r62 == null) {
            return -1;
        }
        if (userJid == null || !C627336j.A0K(r8)) {
            long j = r62.A03;
            if (j == 0 || j + 25000 <= SystemClock.elapsedRealtime()) {
                return -1;
            }
            return r62.A00;
        }
        HashMap hashMap = r62.A05;
        if (hashMap == null || (r6 = (C41642La) hashMap.get(userJid)) == null) {
            return -1;
        }
        long j2 = r6.A01;
        if (j2 == 0 || j2 + 25000 <= SystemClock.elapsedRealtime()) {
            return -1;
        }
        return r6.A00;
    }

    public long A02(C95814uZ r3) {
        AnonymousClass2SS r0 = (AnonymousClass2SS) this.A06.get(r3);
        if (r0 == null) {
            return 0;
        }
        return r0.A04;
    }

    public GroupJid A03(C95814uZ r6, int i, long j) {
        HashMap hashMap;
        C41642La r0;
        HashMap hashMap2 = this.A06;
        AnonymousClass2SS A0R = C18290x4.A0R(r6, hashMap2);
        if (j == 0) {
            A0R.A04 = 0;
        } else {
            A0R.A04 = j;
        }
        A0R.A03 = 0;
        A0R.A01 = i;
        Iterator A0u = AnonymousClass001.A0u(hashMap2);
        while (A0u.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0u);
            if (C627336j.A0K(AnonymousClass0x9.A0R(A0w)) && (hashMap = ((AnonymousClass2SS) A0w.getValue()).A05) != null && (r0 = (C41642La) hashMap.get(r6)) != null) {
                r0.A01 = 0;
                return AnonymousClass32V.A00(AnonymousClass0x9.A0R(A0w));
            }
        }
        return null;
    }

    public void A04() {
        HashMap hashMap = this.A06;
        HashSet A15 = AnonymousClass0x9.A15(hashMap.keySet());
        hashMap.clear();
        HashMap hashMap2 = this.A05;
        Iterator A10 = C18290x4.A10(hashMap2);
        while (A10.hasNext()) {
            this.A00.removeCallbacks((C70353aM) A10.next());
        }
        hashMap2.clear();
        Iterator it = A15.iterator();
        while (it.hasNext()) {
            this.A01.A08(C18300x5.A0P(it));
        }
    }

    public void A06(C95814uZ r4) {
        if (!(r4 instanceof AnonymousClass1fS) && !(r4 instanceof AnonymousClass1fW) && !(r4 instanceof C135216kJ) && !(r4 instanceof C28001fK) && !(r4 instanceof C95804uY)) {
            this.A04.BkO(new C33341sq(r4, this), new Void[0]);
        }
    }

    public void A07(C95814uZ r6, UserJid userJid) {
        String A032;
        AnonymousClass2SS A0R = C18290x4.A0R(r6, this.A06);
        if (userJid != null && C627336j.A0K(r6)) {
            HashMap hashMap = A0R.A05;
            if (hashMap == null) {
                hashMap = AnonymousClass001.A0t();
                A0R.A05 = hashMap;
            }
            C41642La r1 = (C41642La) hashMap.get(userJid);
            if (r1 == null) {
                r1 = new C41642La();
                A0R.A05.put(userJid, r1);
            }
            r1.A01 = 0;
        }
        A0R.A03 = 0;
        if (userJid == null) {
            A032 = r6.getRawString();
        } else {
            A032 = C18260x0.A03(userJid, r6.getRawString(), AnonymousClass001.A0o());
        }
        C70353aM r12 = (C70353aM) this.A05.get(A032);
        if (r12 != null) {
            this.A00.removeCallbacks(r12);
        }
    }

    public AnonymousClass3S3(C29301ib r2, C56642sK r3, AnonymousClass33S r4, AnonymousClass4FS r5) {
        this.A04 = r5;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void A05(C95814uZ r8) {
        AnonymousClass2SS r6;
        HashMap hashMap;
        if (C627336j.A0K(r8) && (r6 = (AnonymousClass2SS) this.A06.get(r8)) != null && (hashMap = r6.A05) != null) {
            Iterator A0u = AnonymousClass001.A0u(hashMap);
            while (A0u.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0u);
                Jid A0R = AnonymousClass0x9.A0R(A0w);
                ((C41642La) A0w.getValue()).A01 = 0;
                C70353aM r1 = (C70353aM) this.A05.get(C18260x0.A03(A0R, r8.getRawString(), AnonymousClass001.A0o()));
                if (r1 != null) {
                    this.A00.removeCallbacks(r1);
                }
            }
            r6.A03 = 0;
        }
    }
}
