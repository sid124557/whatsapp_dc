package X;

import android.util.LruCache;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.File;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.0hA  reason: invalid class name and case insensitive filesystem */
public final class C10040hA implements C187478xH {
    public final LruCache A00;
    public final HashMap A01 = AnonymousClass001.A0t();
    public final HashMap A02 = AnonymousClass001.A0t();
    public final List A03 = new CopyOnWriteArrayList();

    public synchronized NavigableSet AwW(C184778sV r2, String str) {
        throw AnonymousClass002.A0G("MemoryCache does not support key listeners");
    }

    public synchronized void AzA(File file) {
    }

    public synchronized void AzB(C172488Li r2, byte[] bArr) {
        A04(r2, bArr);
    }

    public synchronized long B52() {
        return (long) this.A00.size();
    }

    public synchronized NavigableSet B55(String str) {
        TreeSet treeSet;
        TreeSet treeSet2 = (TreeSet) this.A01.get(str);
        if (treeSet2 == null) {
            treeSet = null;
        } else {
            treeSet = new TreeSet(treeSet2);
        }
        return treeSet;
    }

    public synchronized Set B8z() {
        return new HashSet(this.A01.keySet());
    }

    public synchronized long BDo(String str) {
        long j;
        Long l = (Long) this.A02.get(str);
        if (l == null) {
            j = -1;
        } else {
            j = l.longValue();
        }
        return j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0057, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean BH8(java.lang.String r11, long r12, long r14) {
        /*
            r10 = this;
            monitor-enter(r10)
            java.util.HashMap r0 = r10.A01     // Catch:{ all -> 0x0058 }
            java.lang.Object r6 = r0.get(r11)     // Catch:{ all -> 0x0058 }
            java.util.TreeSet r6 = (java.util.TreeSet) r6     // Catch:{ all -> 0x0058 }
            r8 = 0
            if (r6 == 0) goto L_0x0056
            X.8Li r0 = X.C162087rC.A02(r11, r12)     // Catch:{ all -> 0x0058 }
            java.lang.Object r5 = r6.floor(r0)     // Catch:{ all -> 0x0058 }
            X.8Li r5 = (X.C172488Li) r5     // Catch:{ all -> 0x0058 }
            if (r5 == 0) goto L_0x0056
            long r1 = r5.A05     // Catch:{ all -> 0x0058 }
            long r3 = r5.A04     // Catch:{ all -> 0x0058 }
            long r1 = r1 + r3
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0056
            long r12 = r12 + r14
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x002b
            boolean r0 = r10.A05(r5)     // Catch:{ all -> 0x0058 }
            goto L_0x0054
        L_0x002b:
            java.util.NavigableSet r0 = r6.tailSet(r5, r8)     // Catch:{ all -> 0x0058 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x0058 }
        L_0x0033:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0058 }
            if (r0 == 0) goto L_0x0056
            java.lang.Object r7 = r9.next()     // Catch:{ all -> 0x0058 }
            X.8Li r7 = (X.C172488Li) r7     // Catch:{ all -> 0x0058 }
            long r5 = r7.A05     // Catch:{ all -> 0x0058 }
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0056
            long r3 = r7.A04     // Catch:{ all -> 0x0058 }
            long r5 = r5 + r3
            long r1 = java.lang.Math.max(r1, r5)     // Catch:{ all -> 0x0058 }
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x0033
            boolean r0 = r10.A05(r7)     // Catch:{ all -> 0x0058 }
        L_0x0054:
            monitor-exit(r10)
            return r0
        L_0x0056:
            monitor-exit(r10)
            return r8
        L_0x0058:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10040hA.BH8(java.lang.String, long, long):boolean");
    }

    public synchronized byte[] BiN(C172488Li r3) {
        return (byte[]) this.A00.get(A00(r3));
    }

    public synchronized void Bip(C172488Li r1) {
    }

    public synchronized void BjD(C184778sV r2, String str) {
        throw AnonymousClass002.A0G("MemoryCache does not support key listeners");
    }

    public synchronized void BjO(C172488Li r2) {
        BjP(r2, "not_provided");
    }

    public synchronized void BjP(C172488Li r2, String str) {
        A03(r2);
    }

    public synchronized void Bnd(String str, long j) {
        this.A02.put(str, Long.valueOf(j));
    }

    public synchronized File Bpd(String str, long j, long j2) {
        return null;
    }

    public synchronized C172488Li Bpt(C140846uc r2, String str, long j, long j2) {
        return A02(C162087rC.A02(str, j));
    }

    public synchronized C172488Li Bpu(C140846uc r2, String str, long j) {
        return A02(C162087rC.A02(str, j));
    }

    public synchronized C172488Li Bpv(C140846uc r2, String str, long j) {
        return A02(C162087rC.A02(str, j));
    }

    public final C172488Li A01(C172488Li r10) {
        String str = r10.A07;
        long j = r10.A05;
        TreeSet treeSet = (TreeSet) this.A01.get(str);
        if (treeSet != null) {
            C172488Li r6 = (C172488Li) treeSet.floor(r10);
            if (r6 != null) {
                long j2 = r6.A05;
                if (j2 <= j && j < j2 + r6.A04) {
                    if (A05(r6)) {
                        return r6;
                    }
                    return A01(r10);
                }
            }
            C172488Li r0 = (C172488Li) treeSet.ceiling(r10);
            if (r0 != null) {
                return C162087rC.A04(str, j, r0.A05 - j);
            }
        }
        return C162087rC.A03(str, j);
    }

    public final void A03(C172488Li r4) {
        HashMap hashMap = this.A01;
        String str = r4.A07;
        AbstractCollection abstractCollection = (AbstractCollection) hashMap.get(str);
        if (abstractCollection != null) {
            abstractCollection.remove(r4);
            if (abstractCollection.isEmpty()) {
                hashMap.remove(str);
                this.A02.remove(str);
            }
        }
        this.A00.remove(A00(r4));
    }

    public final void A04(C172488Li r4, byte[] bArr) {
        HashMap hashMap = this.A01;
        String str = r4.A07;
        AbstractCollection abstractCollection = (AbstractCollection) hashMap.get(str);
        if (abstractCollection == null) {
            abstractCollection = new TreeSet();
            hashMap.put(str, abstractCollection);
        }
        abstractCollection.add(r4);
        this.A00.put(A00(r4), bArr);
    }

    public C10040hA(int i) {
        int i2 = i * EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
        AnonymousClass02H r0 = new AnonymousClass02H(this, i2);
        this.A00 = r0;
        r0.maxSize();
    }

    public static final String A00(C172488Li r3) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(r3.A07);
        A0o.append(".");
        return AnonymousClass001.A0k(A0o, r3.A05);
    }

    public final C172488Li A02(C172488Li r2) {
        return A01(r2);
    }

    public final boolean A05(C172488Li r3) {
        if (this.A00.get(A00(r3)) != null) {
            return true;
        }
        ((AbstractCollection) this.A01.get(r3.A07)).remove(r3);
        return false;
    }

    public boolean BH9(String str, long j, long j2) {
        return BH8(str, j, j2);
    }

    public void AwX(String str) {
    }

    public boolean BHz(String str) {
        return true;
    }
}
