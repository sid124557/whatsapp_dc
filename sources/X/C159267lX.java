package X;

import android.os.Build;
import android.os.Process;
import com.facebook.systrace.Systrace;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* renamed from: X.7lX  reason: invalid class name and case insensitive filesystem */
public final class C159267lX {
    static {
        C1443871j r3 = new C1443871j();
        C157417iG r2 = C161617q6.A01;
        synchronized (r2.A01) {
            r2.A02.add(r3);
            if (r2.A00) {
                A00();
            }
        }
    }

    public static void A00() {
        BufferedReader bufferedReader;
        if ((64 & C161617q6.A02) != 0) {
            Systrace.A02("thread_name", Process.myTid(), Thread.currentThread().getName());
        }
        if ((1 & C161617q6.A02) != 0) {
            StringBuilder A0Y = AnonymousClass6CA.A0Y(127);
            A0Y.append("Android trace tags: ");
            A0Y.append(C159907mf.A00("debug.atrace.tags.enableflags"));
            A0Y.append(", Facebook trace tags: ");
            Systrace.A02("process_labels", 0, AnonymousClass001.A0k(A0Y, C161617q6.A02));
        }
        if ((64 & C161617q6.A02) != 0) {
            try {
                FileReader fileReader = new FileReader("/proc/self/cmdline");
                try {
                    bufferedReader = new BufferedReader(fileReader);
                    String readLine = bufferedReader.readLine();
                    int indexOf = readLine.indexOf(0);
                    if (indexOf >= 0) {
                        readLine = readLine.substring(0, indexOf);
                    }
                    bufferedReader.close();
                    fileReader.close();
                    Systrace.A02("process_name", 0, readLine);
                    String A01 = C159907mf.A01("dalvik.vm.heapgrowthlimit");
                    String A012 = C159907mf.A01("dalvik.vm.heapmaxfree");
                    String A013 = C159907mf.A01("dalvik.vm.heapminfree");
                    String A014 = C159907mf.A01("dalvik.vm.heapstartsize");
                    String A015 = C159907mf.A01("dalvik.vm.heaptargetutilization");
                    Object[] objArr = new Object[6];
                    objArr[0] = Build.MODEL;
                    AnonymousClass000.A11(A01, A014, A012, A013, objArr);
                    objArr[5] = A015;
                    Systrace.A02("process_labels", 0, String.format("device=%s,heapgrowthlimit=%s,heapstartsize=%s,heapminfree=%s,heapmaxfree=%s,heaptargetutilization=%s", objArr));
                    return;
                } catch (Throwable th) {
                    fileReader.close();
                    throw th;
                }
            } catch (IOException e) {
                throw C18330xA.A09(e);
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            return;
        }
        throw th;
    }
}
