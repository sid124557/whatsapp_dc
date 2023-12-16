package X;

import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.logger.BufferLogger;
import com.facebook.profilo.mmapbuf.core.Buffer;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.841  reason: invalid class name */
public class AnonymousClass841 implements C187558xP {
    public void BZ6(C166567yu r16, int i) {
        C152167Xu r0 = ProvidersRegistry.A00;
        HashSet A0K = AnonymousClass002.A0K();
        ArrayList arrayList = r0.A01;
        synchronized (arrayList) {
            Iterator it = arrayList.iterator();
            int i2 = 1;
            while (it.hasNext()) {
                Object next = it.next();
                if ((i2 & i) != 0) {
                    A0K.add(next);
                }
                i2 <<= 1;
            }
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        Iterator it2 = A0K.iterator();
        while (it2.hasNext()) {
            String A0m = AnonymousClass001.A0m(it2);
            if (A0o.length() != 0) {
                C18320x8.A1K(A0o);
            }
            A0o.append(A0m);
        }
        Buffer buffer = r16.A09;
        BufferLogger.writeBytesEntry(buffer, 0, 57, BufferLogger.writeBytesEntry(buffer, 0, 56, BufferLogger.writeStandardEntry(buffer, 6, 52, 0, 0, 8126514, 0, 0), "Active providers"), A0o.toString());
    }

    public void BeI(C166567yu r1) {
    }

    public void BeK(C166567yu r1) {
    }

    public void BeL(C166567yu r1) {
    }

    public void BeM(C166567yu r1) {
    }

    public void BeO(C166567yu r1) {
    }

    public void BeQ(C166567yu r1) {
    }

    public boolean AyV(C166567yu r2, File file) {
        return true;
    }

    public void BZ5(C166567yu r14) {
        long nanoTime = System.nanoTime();
        Buffer buffer = r14.A09;
        BufferLogger.writeBytesEntry(buffer, 0, 83, BufferLogger.writeStandardEntry(buffer, 4, 21, nanoTime, 0, 0, 0, 0), "Profilo.ProvidersInitialized");
        BufferLogger.writeStandardEntry(buffer, 4, 22, nanoTime, 0, 0, 0, 0);
    }

    public void BeN(C166567yu r1, int i) {
    }

    public void BeP(C166567yu r1, Throwable th) {
    }

    public void BeJ(int i, int i2, int i3, int i4) {
    }
}
