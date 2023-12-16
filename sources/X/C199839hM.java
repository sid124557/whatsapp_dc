package X;

import java.util.List;

/* renamed from: X.9hM  reason: invalid class name and case insensitive filesystem */
public class C199839hM implements Runnable {
    public final /* synthetic */ AnonymousClass9RS A00;
    public final /* synthetic */ List A01;

    public C199839hM(AnonymousClass9RS r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public void run() {
        List list = this.A01;
        if (0 < list.size()) {
            list.get(0);
            throw AnonymousClass001.A0g("onPreviewStopped");
        }
    }
}
