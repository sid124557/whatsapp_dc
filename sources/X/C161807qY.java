package X;

import java.util.Comparator;

/* renamed from: X.7qY  reason: invalid class name and case insensitive filesystem */
public abstract class C161807qY {
    public static AnonymousClass7XX hashKeys(int i) {
        C160937oh.checkNonnegative(8, "expectedKeys");
        return new C129776ar(8);
    }

    public static AnonymousClass7XX treeKeys(Comparator comparator) {
        return new C129786as(comparator);
    }

    public /* synthetic */ C161807qY(C129776ar r1) {
        this();
    }

    public C161807qY() {
    }

    public static AnonymousClass7XX hashKeys() {
        return hashKeys(8);
    }

    public static AnonymousClass7XX treeKeys() {
        return treeKeys(AnonymousClass8NS.natural());
    }
}
