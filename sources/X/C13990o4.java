package X;

import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: X.0o4  reason: invalid class name and case insensitive filesystem */
public class C13990o4 extends LinkedBlockingDeque<Runnable> {
    public /* bridge */ /* synthetic */ boolean offer(Object obj) {
        if (!isEmpty() || !super.offer(obj)) {
            return false;
        }
        return true;
    }
}
