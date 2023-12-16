package X;

import java.util.LinkedHashMap;
import java.util.PriorityQueue;

/* renamed from: X.3w0  reason: invalid class name and case insensitive filesystem */
public final class C79053w0 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C55532qV this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79053w0(C55532qV r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        LinkedHashMap A0r = C18320x8.A0r();
        for (C53722nY r3 : this.this$0.A04.A03()) {
            String str = r3.A06;
            Object obj = A0r.get(str);
            if (obj == null) {
                obj = new PriorityQueue(1);
            }
            PriorityQueue priorityQueue = (PriorityQueue) obj;
            priorityQueue.offer(Integer.valueOf(r3.A00));
            A0r.put(str, priorityQueue);
        }
        return A0r;
    }
}
