package X;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.6as  reason: invalid class name and case insensitive filesystem */
public class C129786as extends AnonymousClass7XX {
    public final /* synthetic */ Comparator val$comparator;

    public C129786as(Comparator comparator) {
        this.val$comparator = comparator;
    }

    public Map createMap() {
        return new TreeMap(this.val$comparator);
    }
}
