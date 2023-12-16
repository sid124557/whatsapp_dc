package X;

import java.util.Comparator;

/* renamed from: X.7r4  reason: invalid class name and case insensitive filesystem */
public abstract class C162027r4 {
    public static final C162027r4 ACTIVE = new C129406aG();
    public static final C162027r4 GREATER = new C129396aF(1);
    public static final C162027r4 LESS = new C129396aF(-1);

    public abstract C162027r4 compare(int i, int i2);

    public abstract C162027r4 compare(Object obj, Object obj2, Comparator comparator);

    public abstract C162027r4 compareFalseFirst(boolean z, boolean z2);

    public abstract C162027r4 compareTrueFirst(boolean z, boolean z2);

    public abstract int result();

    public static C162027r4 start() {
        return ACTIVE;
    }

    public /* synthetic */ C162027r4(C129406aG r1) {
        this();
    }

    public C162027r4() {
    }
}
