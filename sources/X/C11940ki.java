package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.0ki  reason: invalid class name and case insensitive filesystem */
public class C11940ki implements Runnable {
    public final /* synthetic */ C06580Yj A00;
    public final /* synthetic */ AnonymousClass09T A01;

    public C11940ki(C06580Yj r1, AnonymousClass09T r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void run() {
        AnonymousClass09T r4 = this.A01;
        RecyclerView recyclerView = r4.A0K;
        if (recyclerView != null && recyclerView.A0j) {
            C06580Yj r1 = this.A00;
            if (!r1.A05 && r1.A0C.A01() != -1) {
                AnonymousClass0UY r0 = recyclerView.A0R;
                if (r0 == null || !r0.A0A()) {
                    List list = r4.A0M;
                    int size = list.size();
                    int i = 0;
                    while (i < size) {
                        if (((C06580Yj) list.get(i)).A03) {
                            i++;
                        }
                    }
                    return;
                }
                r4.A0K.post(this);
            }
        }
    }
}
