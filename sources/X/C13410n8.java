package X;

import android.view.View;
import java.util.Comparator;

/* renamed from: X.0n8  reason: invalid class name and case insensitive filesystem */
public class C13410n8 implements Comparator {
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        AnonymousClass02a r1 = (AnonymousClass02a) ((View) obj).getLayoutParams();
        AnonymousClass02a r3 = (AnonymousClass02a) ((View) obj2).getLayoutParams();
        boolean z = r1.A04;
        if (z == r3.A04) {
            return r1.A03 - r3.A03;
        }
        if (z) {
            return 1;
        }
        return -1;
    }
}
