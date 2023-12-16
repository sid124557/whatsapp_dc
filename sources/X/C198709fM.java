package X;

import java.util.List;

/* renamed from: X.9fM  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C198709fM implements Runnable {
    public final /* synthetic */ AnonymousClass9WQ A00;

    public final void run() {
        List list = this.A00.A0L.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((AnonymousClass9QW) list.get(i)).A00();
        }
    }

    public /* synthetic */ C198709fM(AnonymousClass9WQ r1) {
        this.A00 = r1;
    }
}
