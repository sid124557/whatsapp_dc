package X;

import android.util.Log;
import android.util.Pair;
import java.util.List;

/* renamed from: X.6dF  reason: invalid class name and case insensitive filesystem */
public class C131226dF extends AnonymousClass7Uu {
    public final /* synthetic */ C181458mn A00;
    public final /* synthetic */ List A01;

    public C131226dF(C181458mn r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public /* bridge */ /* synthetic */ void A00(Object obj) {
        Pair A012 = C159387lk.A01((AnonymousClass84O) obj, this.A00);
        int A03 = C18290x4.A03(A012);
        if (A03 < 0) {
            Log.w("ComponentTree", "replaceChild: No existing child found with specified ID in parent. New children have not been added to parent.");
            return;
        }
        List list = (List) A012.first;
        list.remove(A03);
        list.addAll(A03, C159387lk.A02(this.A01));
    }
}
