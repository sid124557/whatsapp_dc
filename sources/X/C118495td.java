package X;

import java.util.concurrent.LinkedTransferQueue;

/* renamed from: X.5td  reason: invalid class name and case insensitive filesystem */
public class C118495td extends LinkedTransferQueue<Runnable> {
    public /* bridge */ /* synthetic */ boolean offer(Object obj) {
        return tryTransfer(obj);
    }
}
