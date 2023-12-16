package X;

import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.2zi  reason: invalid class name and case insensitive filesystem */
public abstract class C61102zi {
    public final AnonymousClass3ZU A00;

    public Iterable A05() {
        if (this instanceof C29451iq) {
            C626936e.A01();
        }
        AnonymousClass3ZU r1 = this.A00;
        synchronized (r1) {
        }
        return r1;
    }

    public C61102zi(C183538qC r2) {
        this.A00 = new AnonymousClass3ZU(r2);
    }

    public static Iterator A03(C61102zi r0) {
        return r0.A05().iterator();
    }

    public static Iterator A04(C61102zi r0, String str) {
        Log.d(str);
        return r0.A05().iterator();
    }

    public void A06(Object obj) {
        C626936e.A06(obj);
        AnonymousClass3ZU r3 = this.A00;
        synchronized (r3) {
            C626936e.A06(obj);
            ConcurrentLinkedQueue concurrentLinkedQueue = r3.A01;
            if (concurrentLinkedQueue.contains(obj)) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Observer ");
                A0o.append(obj);
                String A0X = AnonymousClass000.A0X(" is already registered.", A0o);
                StringBuilder A0o2 = AnonymousClass001.A0o();
                AnonymousClass000.A1A(this, A0o2);
                C18260x0.A0r(":", A0X, A0o2);
            } else {
                C626936e.A06(obj);
                concurrentLinkedQueue.add(obj);
            }
        }
    }

    public void A07(Object obj) {
        C626936e.A06(obj);
        AnonymousClass3ZU r2 = this.A00;
        synchronized (r2) {
            C626936e.A06(obj);
            if (!r2.A01.remove(obj)) {
                StringBuilder A0o = AnonymousClass001.A0o();
                AnonymousClass000.A1A(this, A0o);
                A0o.append(":Observer ");
                A0o.append(obj);
                C18260x0.A1K(A0o, " was not registered.");
            }
        }
    }

    public C61102zi() {
        this(C72333dY.A02());
    }
}
