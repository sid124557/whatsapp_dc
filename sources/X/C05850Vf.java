package X;

import android.util.Log;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.0Vf  reason: invalid class name and case insensitive filesystem */
public final class C05850Vf {
    public static final ReentrantLock A02 = new ReentrantLock();
    public static volatile C05850Vf A03;
    public Set A00 = C73833g9.A04();
    public final C16100sT A01 = A00();

    public static final C08820fA A00() {
        ClassLoader classLoader;
        if (C08820fA.A05 == null) {
            ReentrantLock reentrantLock = C08820fA.A04;
            reentrantLock.lock();
            try {
                if (C08820fA.A05 == null) {
                    C08840fC r5 = null;
                    AnonymousClass0Y1 r2 = C08840fC.A03;
                    Integer A002 = AnonymousClass0Y1.A00();
                    if (A002 != null && A002.intValue() >= 1 && AnonymousClass0Y1.A05() && (classLoader = C16100sT.class.getClassLoader()) != null) {
                        ActivityEmbeddingComponent A06 = r2.A06();
                        r5 = new C08840fC(new AnonymousClass0Q7(classLoader), new AnonymousClass0UX(new AnonymousClass0P6(classLoader)), A06);
                        C08820fA.A05 = new C08820fA(r5);
                    }
                    Log.d("EmbeddingBackend", "No supported embedding extension found");
                    C08820fA.A05 = new C08820fA(r5);
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
            reentrantLock.unlock();
        }
        C08820fA r0 = C08820fA.A05;
        C162457s7.A0H(r0);
        return r0;
    }
}
