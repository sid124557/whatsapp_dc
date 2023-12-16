package X;

import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.32h  reason: invalid class name and case insensitive filesystem */
public class C618032h {
    public static C618032h A07;
    public static final long A08 = TimeUnit.MINUTES.toMillis(2);
    public long A00;
    public final Lock A01 = new ReentrantLock();
    public volatile StatFs A02 = null;
    public volatile StatFs A03 = null;
    public volatile File A04;
    public volatile File A05;
    public volatile boolean A06 = false;

    public static final StatFs A00(StatFs statFs, File file) {
        if (file != null && file.exists()) {
            if (statFs == null) {
                try {
                    return new StatFs(file.getAbsolutePath());
                } catch (IllegalArgumentException unused) {
                } catch (Throwable th) {
                    Class cls = Error.class;
                    if (!cls.isInstance(th)) {
                        cls = RuntimeException.class;
                        if (!cls.isInstance(th)) {
                            throw C18330xA.A09(th);
                        }
                    }
                    throw ((Throwable) cls.cast(th));
                }
            } else {
                statFs.restat(file.getAbsolutePath());
                return statFs;
            }
        }
        return null;
    }

    public long A01() {
        if (!this.A06) {
            Lock lock = this.A01;
            lock.lock();
            try {
                if (!this.A06) {
                    this.A05 = Environment.getDataDirectory();
                    this.A04 = Environment.getExternalStorageDirectory();
                    this.A03 = A00(this.A03, this.A05);
                    this.A02 = A00(this.A02, this.A04);
                    this.A00 = SystemClock.uptimeMillis();
                    this.A06 = true;
                }
            } finally {
                lock.unlock();
            }
        }
        Lock lock2 = this.A01;
        if (lock2.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - this.A00 > A08) {
                    this.A03 = A00(this.A03, this.A05);
                    this.A02 = A00(this.A02, this.A04);
                    this.A00 = SystemClock.uptimeMillis();
                }
            } finally {
                lock2.unlock();
            }
        }
        StatFs statFs = this.A03;
        if (statFs != null) {
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        }
        return 0;
    }
}
