package X;

import android.util.Log;
import android.util.Pair;
import java.util.List;

/* renamed from: X.6dE  reason: invalid class name and case insensitive filesystem */
public class C131216dE extends AnonymousClass7Uu {
    public final /* synthetic */ String A00;
    public final /* synthetic */ List A01;

    public C131216dE(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }

    public /* bridge */ /* synthetic */ void A00(Object obj) {
        Pair A012 = C159387lk.A01((AnonymousClass84O) obj, new AnonymousClass8DA(this.A00));
        int A03 = C18290x4.A03(A012);
        if (A03 < 0) {
            Log.w("ComponentTreeMutator", "replaceChildrenAfter: No existing child found with specified ID in parent. New children have not been added to parent.");
            return;
        }
        List list = (List) A012.first;
        int size = list.size();
        while (true) {
            size--;
            if (size > A03) {
                list.remove(size);
            } else {
                list.addAll(A03 + 1, C159387lk.A02(this.A01));
                return;
            }
        }
    }
}
