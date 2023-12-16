package X;

import java.util.List;

/* renamed from: X.9fN  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C198719fN implements Runnable {
    public final /* synthetic */ AnonymousClass9WQ A00;

    public final void run() {
        List list = this.A00.A0M.A00;
        if (0 < list.size()) {
            list.get(0);
            throw AnonymousClass001.A0g("onPreviewStopped");
        }
    }

    public /* synthetic */ C198719fN(AnonymousClass9WQ r1) {
        this.A00 = r1;
    }
}
