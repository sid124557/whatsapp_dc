package X;

import android.view.View;
import java.util.Comparator;

/* renamed from: X.0n7  reason: invalid class name and case insensitive filesystem */
public class C13400n7 implements Comparator {
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        float A02 = AnonymousClass0YZ.A02((View) obj);
        float A022 = AnonymousClass0YZ.A02((View) obj2);
        if (A02 <= A022) {
            return AnonymousClass001.A1V((A02 > A022 ? 1 : (A02 == A022 ? 0 : -1))) ? 1 : 0;
        }
        return -1;
    }
}
