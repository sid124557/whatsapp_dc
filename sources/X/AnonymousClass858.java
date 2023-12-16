package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.858  reason: invalid class name */
public final class AnonymousClass858 implements C180578lI, C180598lK, C180548lF, C183808qg, C180588lJ, C180568lH {
    public Executor A00;
    public Executor A01;
    public Executor A02;
    public final Context A03;
    public final SharedPreferences A04;

    public synchronized Executor B7T(C141406vW r3) {
        Executor executor;
        int ordinal = r3.ordinal();
        if (ordinal == 0) {
            executor = this.A00;
            if (executor == null) {
                executor = A00(r3);
                this.A00 = executor;
            }
        } else if (ordinal != 1) {
            executor = this.A01;
            if (executor == null) {
                executor = A00(r3);
                this.A01 = executor;
            }
        } else {
            executor = this.A02;
            if (executor == null) {
                executor = A00(r3);
                this.A02 = executor;
            }
        }
        Objects.requireNonNull(executor);
        return executor;
    }

    public AnonymousClass858(Context context) {
        this.A03 = context.getApplicationContext();
        this.A04 = context.getSharedPreferences("default-cask-metadata", 0);
    }

    public static Executor A00(C141406vW r3) {
        ExecutorService newCachedThreadPool;
        C173238Ov r2 = new C173238Ov(r3);
        int ordinal = r3.ordinal();
        if (ordinal == 0 || ordinal != 1) {
            newCachedThreadPool = Executors.newCachedThreadPool(r2);
        } else {
            newCachedThreadPool = Executors.newSingleThreadExecutor(r2);
        }
        Objects.requireNonNull(newCachedThreadPool);
        return newCachedThreadPool;
    }

    public C158107jR B4Y() {
        C158107jR r0;
        Context context = this.A03;
        synchronized (C158107jR.class) {
            r0 = C158107jR.A03;
            if (r0 == null) {
                r0 = new C158107jR(context);
                C158107jR.A03 = r0;
            }
        }
        return r0;
    }

    public Context B4Z() {
        return this.A03;
    }

    public C54372oc BDL(String str) {
        return new C54372oc(this.A04, str);
    }

    public boolean BI1() {
        C618032h r0;
        synchronized (C618032h.class) {
            r0 = C618032h.A07;
            if (r0 == null) {
                r0 = new C618032h();
                C618032h.A07 = r0;
            }
        }
        return AnonymousClass001.A1V((r0.A01() > 419430400 ? 1 : (r0.A01() == 419430400 ? 0 : -1)));
    }

    public boolean BJL() {
        C618032h r0;
        synchronized (C618032h.class) {
            r0 = C618032h.A07;
            if (r0 == null) {
                r0 = new C618032h();
                C618032h.A07 = r0;
            }
        }
        return AnonymousClass001.A1V((r0.A01() > 104857600 ? 1 : (r0.A01() == 104857600 ? 0 : -1)));
    }

    public static void A01(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    A01(file2);
                }
                file2.delete();
            }
        }
    }

    public boolean B1O(File file) {
        if (file.isDirectory()) {
            A01(file);
        }
        return file.delete();
    }
}
