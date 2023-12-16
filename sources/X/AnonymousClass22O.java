package X;

import android.util.SparseArray;
import java.util.ArrayList;

/* renamed from: X.22O  reason: invalid class name */
public enum AnonymousClass22O {
    UNENCRYPTED(0),
    CRYPT12(12),
    CRYPT13(13),
    CRYPT14(14),
    CRYPT15(15);
    
    public static SparseArray A00;
    public static AnonymousClass22O A01;
    public static AnonymousClass22O A02;
    public final int version;

    public static synchronized AnonymousClass22O A00() {
        AnonymousClass22O r6;
        synchronized (AnonymousClass22O.class) {
            r6 = A01;
            if (r6 == null) {
                r6 = CRYPT15;
                for (AnonymousClass22O r2 : values()) {
                    if (r2.version > r6.version) {
                        r6 = r2;
                    }
                }
                A01 = r6;
            }
        }
        return r6;
    }

    public static synchronized AnonymousClass22O A01() {
        AnonymousClass22O r6;
        synchronized (AnonymousClass22O.class) {
            r6 = A02;
            if (r6 == null) {
                r6 = CRYPT12;
                for (AnonymousClass22O r2 : values()) {
                    if (r2.version < r6.version) {
                        r6 = r2;
                    }
                }
                A02 = r6;
            }
        }
        return r6;
    }

    public static synchronized AnonymousClass22O A02(int i) {
        AnonymousClass22O r0;
        synchronized (AnonymousClass22O.class) {
            if (A00 == null) {
                A03();
            }
            r0 = (AnonymousClass22O) A00.get(i);
        }
        return r0;
    }

    public static synchronized void A03() {
        synchronized (AnonymousClass22O.class) {
            A00 = new SparseArray(values().length);
            for (AnonymousClass22O r2 : values()) {
                A00.append(r2.version, r2);
            }
        }
    }

    public static synchronized AnonymousClass22O[] A04(AnonymousClass22O r6, AnonymousClass22O r7) {
        AnonymousClass22O[] r0;
        synchronized (AnonymousClass22O.class) {
            if (A00 == null) {
                A03();
            }
            ArrayList A0s = AnonymousClass001.A0s();
            int i = 0;
            while (true) {
                SparseArray sparseArray = A00;
                if (i < sparseArray.size()) {
                    int keyAt = sparseArray.keyAt(i);
                    if (keyAt >= r6.version && keyAt <= r7.version) {
                        A0s.add((AnonymousClass22O) A00.get(keyAt));
                    }
                    i++;
                } else {
                    AnonymousClass4IU.A00(A0s, 41);
                    r0 = (AnonymousClass22O[]) A0s.toArray(new AnonymousClass22O[0]);
                }
            }
        }
        return r0;
    }

    /* access modifiers changed from: public */
    AnonymousClass22O(int i) {
        this.version = i;
    }

    public int A05() {
        return this.version;
    }
}
