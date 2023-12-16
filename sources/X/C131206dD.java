package X;

import android.util.Log;
import android.util.Pair;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6dD  reason: invalid class name and case insensitive filesystem */
public class C131206dD extends AnonymousClass7Uu {
    public final /* synthetic */ String A00;
    public final /* synthetic */ String A01;

    public C131206dD(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public /* bridge */ /* synthetic */ void A00(Object obj) {
        String str;
        Pair A012 = C159387lk.A01((AnonymousClass84O) obj, new AnonymousClass8DA(this.A01));
        List list = (List) A012.first;
        int A03 = C18290x4.A03(A012);
        int A002 = C159387lk.A00(new AnonymousClass8DA(this.A00), list);
        if (A03 == -1) {
            str = "removeChildren: The starting id doesn't exist. No children have been removed.";
        } else if (A002 == -1) {
            str = "removeChildren: The ending id doesn't exist. No children have been removed.";
        } else if (A03 > A002) {
            str = "removeChildren: The starting index is larger than the ending index. No children have been removed.";
        } else {
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                it.next();
                if (i > A03 && i < A002) {
                    it.remove();
                }
                i++;
            }
            return;
        }
        Log.w("ComponentTree", str);
    }
}
