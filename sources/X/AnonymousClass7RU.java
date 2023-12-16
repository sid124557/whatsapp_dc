package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.7RU  reason: invalid class name */
public class AnonymousClass7RU {
    public final /* synthetic */ C151767Wf A00;

    public AnonymousClass7RU(C151767Wf r1) {
        this.A00 = r1;
    }

    public void A00() {
        ArrayList A0I;
        LinkedHashMap linkedHashMap = this.A00.A03;
        synchronized (linkedHashMap) {
            A0I = AnonymousClass002.A0I(linkedHashMap.size());
            Iterator A10 = C18290x4.A10(linkedHashMap);
            while (A10.hasNext()) {
                Runnable runnable = (Runnable) A10.next();
                if (runnable != null) {
                    A0I.add(runnable);
                }
            }
            linkedHashMap.clear();
        }
        Iterator it = A0I.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }
}
