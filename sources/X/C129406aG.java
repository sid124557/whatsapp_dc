package X;

import java.util.Comparator;

/* renamed from: X.6aG  reason: invalid class name and case insensitive filesystem */
public class C129406aG extends C162027r4 {
    public C129406aG() {
        super((C129406aG) null);
    }

    public C162027r4 classify(int i) {
        if (i < 0) {
            return C162027r4.LESS;
        }
        if (i > 0) {
            return C162027r4.GREATER;
        }
        return C162027r4.ACTIVE;
    }

    public C162027r4 compareFalseFirst(boolean z, boolean z2) {
        int i;
        if (z == z2) {
            i = 0;
        } else {
            i = -1;
            if (z) {
                i = 1;
            }
        }
        return classify(i);
    }

    public C162027r4 compareTrueFirst(boolean z, boolean z2) {
        int i;
        if (z2 == z) {
            i = 0;
        } else {
            i = -1;
            if (z2) {
                i = 1;
            }
        }
        return classify(i);
    }

    public int result() {
        return 0;
    }

    public C162027r4 compare(Object obj, Object obj2, Comparator comparator) {
        return classify(comparator.compare(obj, obj2));
    }

    public C162027r4 compare(int i, int i2) {
        int A1W;
        if (i < i2) {
            A1W = -1;
        } else {
            A1W = C86624Kv.A1W(i, i2);
        }
        return classify(A1W);
    }
}
