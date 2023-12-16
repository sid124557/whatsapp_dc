package X;

import android.util.Log;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

/* renamed from: X.9VZ  reason: invalid class name */
public class AnonymousClass9VZ {
    public final AnonymousClass2XV A00 = new AnonymousClass2XV();
    public final HashMap A01 = AnonymousClass001.A0t();
    public final Stack A02 = new Stack();

    public C52792m3 A01(C131266dJ r3, C835248t r4, String str) {
        C52792m3 r1 = new C52792m3(r3, r4, this.A00);
        this.A01.put(str, r1);
        return r1;
    }

    public void A03(boolean z) {
        AnonymousClass2XV r3 = this.A00;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BloksCallbackQueue/setActive(");
        A0o.append(z);
        A0o.append(")/queue size=");
        Queue queue = r3.A01;
        Log.d("Whatsapp", AnonymousClass000.A0h(A0o, queue.size()));
        r3.A00 = z;
        if (z) {
            while (!queue.isEmpty()) {
                Runnable runnable = (Runnable) queue.poll();
                if (runnable != null) {
                    runnable.run();
                } else {
                    throw AnonymousClass001.A0g("");
                }
            }
        }
    }

    public static final void A00(HashMap hashMap) {
        Iterator A0u = AnonymousClass001.A0u(hashMap);
        while (A0u.hasNext()) {
            ((C52792m3) AnonymousClass0x2.A0W(A0u)).A00 = false;
        }
        hashMap.clear();
    }

    public void A02(Map map) {
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            Stack stack = this.A02;
            if (stack.peek() != null) {
                C18270x1.A1N((AbstractMap) stack.peek(), A0w);
            }
        }
    }
}
