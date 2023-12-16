package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.7KS  reason: invalid class name */
public class AnonymousClass7KS {
    public final RecyclerView A00;
    public final AnonymousClass4W5 A01 = new AnonymousClass4W5();
    public final C184148rK A02;

    public AnonymousClass7KS(RecyclerView recyclerView, C184148rK r4) {
        this.A00 = recyclerView;
        this.A02 = r4;
        RecyclerView recyclerView2 = this.A00;
        recyclerView2.setNestedScrollingEnabled(true);
        recyclerView2.setAdapter(this.A01);
    }
}
