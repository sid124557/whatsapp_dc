package X;

import java.io.File;
import java.nio.channels.FileChannel;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.0TB  reason: invalid class name */
public final class AnonymousClass0TB {
    public static final Map A03 = AnonymousClass001.A0t();
    public FileChannel A00;
    public final File A01;
    public final Lock A02;

    public AnonymousClass0TB(File file, String str) {
        Lock lock;
        File A0A = AnonymousClass002.A0A(file, AnonymousClass000.A0X(".lck", AnonymousClass000.A0l(str)));
        this.A01 = A0A;
        String absolutePath = A0A.getAbsolutePath();
        C162457s7.A0D(absolutePath);
        Map map = A03;
        synchronized (map) {
            Object obj = map.get(absolutePath);
            if (obj == null) {
                obj = new ReentrantLock();
                map.put(absolutePath, obj);
            }
            lock = (Lock) obj;
        }
        this.A02 = lock;
    }
}
