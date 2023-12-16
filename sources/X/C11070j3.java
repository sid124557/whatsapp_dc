package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.0j3  reason: invalid class name and case insensitive filesystem */
public class C11070j3 implements Runnable {
    public final /* synthetic */ RecyclerView A00;

    public C11070j3(RecyclerView recyclerView) {
        this.A00 = recyclerView;
    }

    public void run() {
        RecyclerView recyclerView = this.A00;
        AnonymousClass0UY r0 = recyclerView.A0R;
        if (r0 != null) {
            r0.A08();
        }
        recyclerView.A0o = false;
    }
}
