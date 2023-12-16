package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.2qQ  reason: invalid class name and case insensitive filesystem */
public final class C55482qQ {
    public C95804uY A00;
    public Runnable A01;
    public Runnable A02;
    public final C49712gy A03;
    public final C56612sH A04;
    public final AnonymousClass1VX A05;
    public final AnonymousClass4FS A06;
    public final Set A07 = AnonymousClass0x9.A17();
    public final ConcurrentHashMap A08 = AnonymousClass0x9.A1D();

    public final synchronized void A01() {
        if (this.A02 == null && !this.A08.isEmpty()) {
            this.A02 = this.A06.Bkn(new C70023Zo(this, 33), "NewsletterViewReceiptManager/scheduleTheNewRunIfNeeded", C56952sp.A06(this.A05, 4648));
        }
    }

    public final synchronized void A02() {
        if (this.A01 == null) {
            this.A01 = this.A06.Bkn(new C70023Zo(this, 34), "NewsletterViewReceiptManager/scheduleTheReceiptSendIfNeeded", 10000);
        }
    }

    public final synchronized void A04(boolean z) {
        this.A02 = null;
        ConcurrentHashMap concurrentHashMap = this.A08;
        if (!concurrentHashMap.isEmpty()) {
            Map A0D = C73813g7.A0D(concurrentHashMap);
            ArrayList A0s = AnonymousClass001.A0s();
            long uptimeMillis = SystemClock.uptimeMillis();
            Iterator A0q = AnonymousClass000.A0q(A0D);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                if (C18310x6.A0B(A0w.getValue()) < uptimeMillis) {
                    Set set = this.A07;
                    set.add(A0w.getKey());
                    AnonymousClass0x7.A1J(A0s, A0w);
                    if (set.size() > 20) {
                        A00();
                    }
                }
            }
            if (z) {
                A00();
                concurrentHashMap.clear();
            } else {
                Object[] array = A0s.toArray(new C624134x[0]);
                C162457s7.A0J(array, 1);
                for (Object remove : array) {
                    concurrentHashMap.remove(remove);
                }
            }
            A01();
        }
    }

    public final void A00() {
        Set set = this.A07;
        if (!set.isEmpty()) {
            List A0F = C73723fy.A0F(set);
            C95804uY r2 = this.A00;
            if (r2 != null) {
                set.clear();
                C70353aM.A00(this.A06, this, r2, A0F, 19);
            }
        }
    }

    public C55482qQ(C49712gy r2, C56612sH r3, AnonymousClass1VX r4, AnonymousClass4FS r5) {
        C18260x0.A0c(r3, r4, r5, r2);
        this.A04 = r3;
        this.A05 = r4;
        this.A06 = r5;
        this.A03 = r2;
    }

    public final void A03(C30471mV r3) {
        C95814uZ r1 = C624134x.A07(r3).A00;
        if (r1 instanceof C95804uY) {
            C162457s7.A0K(r1, "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid");
            C95804uY r12 = (C95804uY) r1;
            if (!C162457s7.A0P(r12, this.A00)) {
                A04(true);
                this.A00 = r12;
            }
            this.A07.add(r3);
            A02();
        }
    }
}
