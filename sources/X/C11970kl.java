package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.0kl  reason: invalid class name and case insensitive filesystem */
public class C11970kl implements Runnable {
    public final int A00;
    public final RecyclerView A01;

    public void run() {
        this.A01.A0a(this.A00);
    }

    public C11970kl(RecyclerView recyclerView, int i) {
        this.A00 = i;
        this.A01 = recyclerView;
    }
}
