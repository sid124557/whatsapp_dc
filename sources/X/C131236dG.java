package X;

import android.util.Log;
import android.util.Pair;
import java.util.List;

/* renamed from: X.6dG  reason: invalid class name and case insensitive filesystem */
public class C131236dG extends AnonymousClass7Uu {
    public final /* synthetic */ int A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ List A02;

    public C131236dG(List list, int i, String str) {
        this.A01 = str;
        this.A00 = i;
        this.A02 = list;
    }

    public /* bridge */ /* synthetic */ void A00(Object obj) {
        Pair A012 = C159387lk.A01((AnonymousClass84O) obj, new AnonymousClass8DA(this.A01));
        int A03 = C18290x4.A03(A012);
        if (A03 < 0) {
            Log.w("ComponentTree", "insertChildrenRelativeToId: No existing child found with specified ID in parent. New children have not been added to parent.");
        } else {
            ((List) A012.first).addAll(A03 + this.A00, C159387lk.A02(this.A02));
        }
    }
}
