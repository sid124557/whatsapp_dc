package X;

import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.123  reason: invalid class name */
public class AnonymousClass123 extends AnonymousClass0R6 implements AnonymousClass4AL {
    public int A00;
    public AnonymousClass4AK A01;
    public C49872hE A02;
    public final C620633i A03;
    public final AnonymousClass4FV A04;
    public final C106095Xp A05;
    public final AnonymousClass4AK A06 = new AnonymousClass262(this, 1);
    public final C60152y5 A07;

    public synchronized int A0G() {
        int i;
        C49872hE r0 = this.A02;
        i = 0;
        if (r0 != null) {
            int size = r0.A04.size();
            C49872hE r02 = this.A02;
            if (!(r02 == null || r02.A00 == null)) {
                i = 1;
            }
            i += size;
        }
        return i;
    }

    public final synchronized void A0K(C49872hE r3) {
        C49872hE r0 = this.A02;
        if (r0 != null) {
            r0.A03.remove(this);
        }
        this.A02 = r3;
        if (r3 != null) {
            r3.A03.add(this);
            List list = r3.A04;
            if (C18310x6.A1X(list)) {
                BaV(r3);
            }
            this.A00 = list.size();
        }
        A05();
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        C106095Xp r4 = this.A05;
        AnonymousClass4FV r3 = this.A04;
        return new C95424td(viewGroup, this.A03, r3, r4, this.A06, this.A07);
    }

    public /* bridge */ /* synthetic */ void A0H(C05570Ua r2) {
        AnonymousClass4Z6 r22 = (AnonymousClass4Z6) r2;
        C162457s7.A0J(r22, 0);
        r22.A07();
    }

    public /* bridge */ /* synthetic */ void A0I(C05570Ua r2) {
        AnonymousClass4Z6 r22 = (AnonymousClass4Z6) r2;
        C162457s7.A0J(r22, 0);
        r22.A08();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r6.A01(r6.A00) != false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void BNf(X.C05570Ua r11, int r12) {
        /*
            r10 = this;
            X.4td r11 = (X.C95424td) r11
            r9 = r10
            monitor-enter(r9)
            r0 = 0
            X.C162457s7.A0J(r11, r0)     // Catch:{ all -> 0x0044 }
            X.2hE r6 = r10.A02     // Catch:{ all -> 0x0044 }
            if (r6 == 0) goto L_0x0042
            java.util.List r0 = r6.A04     // Catch:{ all -> 0x0044 }
            int r1 = r0.size()     // Catch:{ all -> 0x0044 }
            r0 = 0
            if (r12 >= r1) goto L_0x0040
            int r0 = r12 + 1
            double r3 = (double) r0     // Catch:{ all -> 0x0044 }
            java.util.List r5 = r6.A04     // Catch:{ all -> 0x0044 }
            int r0 = r5.size()     // Catch:{ all -> 0x0044 }
            double r1 = (double) r0     // Catch:{ all -> 0x0044 }
            r7 = 4604930618986332160(0x3fe8000000000000, double:0.75)
            double r1 = r1 * r7
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x003a
            boolean r0 = r6.A02     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x003a
            boolean r0 = r6.A01     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = r6.A00     // Catch:{ all -> 0x0044 }
            boolean r1 = r6.A01(r0)     // Catch:{ all -> 0x0044 }
            r0 = 0
            if (r1 == 0) goto L_0x0038
        L_0x0037:
            r0 = 1
        L_0x0038:
            r6.A02 = r0     // Catch:{ all -> 0x0044 }
        L_0x003a:
            java.lang.Object r0 = r5.get(r12)     // Catch:{ all -> 0x0044 }
            X.7yG r0 = (X.C166177yG) r0     // Catch:{ all -> 0x0044 }
        L_0x0040:
            r11.A01 = r0     // Catch:{ all -> 0x0044 }
        L_0x0042:
            monitor-exit(r9)
            return
        L_0x0044:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass123.BNf(X.0Ua, int):void");
    }

    public void BaV(C49872hE r5) {
        if (C162457s7.A0P(r5, this.A02)) {
            int i = this.A00;
            List list = r5.A04;
            if (i >= list.size()) {
                A05();
            } else {
                A09(this.A00, list.size() - this.A00);
            }
            this.A00 = list.size();
        }
    }

    public AnonymousClass123(C620633i r3, AnonymousClass4FV r4, C106095Xp r5, AnonymousClass4AK r6, C60152y5 r7) {
        C18260x0.A0V(r5, r4, r3);
        C162457s7.A0J(r7, 5);
        this.A05 = r5;
        this.A04 = r4;
        this.A03 = r3;
        this.A01 = r6;
        this.A07 = r7;
    }
}
