package X;

import android.util.Log;
import android.util.Pair;
import java.util.List;

/* renamed from: X.6dC  reason: invalid class name and case insensitive filesystem */
public class C131196dC extends AnonymousClass7Uu {
    public final /* synthetic */ String A00;

    public C131196dC(String str) {
        this.A00 = str;
    }

    public /* bridge */ /* synthetic */ void A00(Object obj) {
        Pair A01 = C159387lk.A01((AnonymousClass84O) obj, new AnonymousClass8DA(this.A00));
        int A03 = C18290x4.A03(A01);
        if (A03 < 0) {
            Log.w("ComponentTreeMutator", "removeChildById: No existing child found with specified ID in parent. No child has been removed from the parent.");
        } else {
            ((List) A01.first).remove(A03);
        }
    }
}
