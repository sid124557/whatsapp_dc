package X;

import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2fp  reason: invalid class name and case insensitive filesystem */
public class C49002fp {
    public final C72303dV A00;
    public final ThreadLocal A01 = new ThreadLocal();
    public final AtomicInteger A02 = new AtomicInteger(0);

    public C56702sQ A00(String str, String str2) {
        ThreadLocal threadLocal = this.A01;
        C49032fs r2 = (C49032fs) threadLocal.get();
        if (r2 == null) {
            r2 = new C49032fs(this.A00, this.A02.get());
            threadLocal.set(r2);
        }
        C56702sQ A002 = r2.A00(str, str2, this.A02.get());
        A002.A02();
        return A002;
    }

    public C49002fp(C72303dV r3) {
        this.A00 = r3;
    }

    public void A01() {
        Log.i("statementsmanager/resetstatements");
        this.A02.incrementAndGet();
        C49032fs r0 = (C49032fs) this.A01.get();
        if (r0 != null) {
            Map map = r0.A01;
            Iterator A0v = AnonymousClass001.A0v(map);
            while (A0v.hasNext()) {
                C56702sQ r02 = (C56702sQ) A0v.next();
                if (r02 != null) {
                    r02.A03();
                }
            }
            map.clear();
        }
    }
}
