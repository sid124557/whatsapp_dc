package X;

import java.util.Queue;

/* renamed from: X.9RA  reason: invalid class name */
public class AnonymousClass9RA {
    public boolean A00 = false;
    public final Queue A01 = AnonymousClass0x9.A18();

    public void A00() {
        this.A00 = false;
        while (true) {
            Queue queue = this.A01;
            if (!queue.isEmpty()) {
                queue.remove();
            } else {
                return;
            }
        }
    }
}
