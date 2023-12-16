package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2qD  reason: invalid class name and case insensitive filesystem */
public class C55352qD {
    public final AnonymousClass1VX A00;
    public final List A01 = AnonymousClass001.A0s();
    public final List A02 = AnonymousClass001.A0s();
    public final List A03 = AnonymousClass001.A0s();

    public List A00() {
        ArrayList A0J;
        synchronized (this) {
            List list = this.A01;
            list.size();
            A0J = AnonymousClass002.A0J(list);
        }
        return A0J;
    }

    public List A01() {
        ArrayList A0J;
        synchronized (this) {
            List list = this.A02;
            list.size();
            A0J = AnonymousClass002.A0J(list);
        }
        return A0J;
    }

    public List A02() {
        ArrayList A0J;
        synchronized (this) {
            List list = this.A03;
            list.size();
            A0J = AnonymousClass002.A0J(list);
        }
        return A0J;
    }

    public void A03() {
        synchronized (this) {
            List list = this.A01;
            list.size();
            List list2 = this.A03;
            list2.size();
            List list3 = this.A02;
            list3.size();
            list.clear();
            list2.clear();
            list3.clear();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r2.A02.size() > 0) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.List r0 = r2.A01     // Catch:{ all -> 0x001d }
            int r0 = r0.size()     // Catch:{ all -> 0x001d }
            if (r0 > 0) goto L_0x001a
            java.util.List r0 = r2.A03     // Catch:{ all -> 0x001d }
            int r0 = r0.size()     // Catch:{ all -> 0x001d }
            if (r0 > 0) goto L_0x001a
            java.util.List r0 = r2.A02     // Catch:{ all -> 0x001d }
            int r1 = r0.size()     // Catch:{ all -> 0x001d }
            r0 = 0
            if (r1 <= 0) goto L_0x001b
        L_0x001a:
            r0 = 1
        L_0x001b:
            monitor-exit(r2)     // Catch:{ all -> 0x001d }
            return r0
        L_0x001d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55352qD.A04():boolean");
    }

    public C55352qD(AnonymousClass1VX r2) {
        this.A00 = r2;
    }
}
