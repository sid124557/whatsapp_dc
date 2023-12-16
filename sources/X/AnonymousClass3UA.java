package X;

import android.os.Process;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.3UA  reason: invalid class name */
public class AnonymousClass3UA implements AnonymousClass4GE {
    public final C56612sH A00;
    public final C385728f A01;

    public AnonymousClass3UA(C56612sH r1, C385728f r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public String B9C() {
        return "cpu_stats";
    }

    public boolean BIm() {
        return false;
    }

    public void BRu(AnonymousClass30Y r9) {
        r9.A03(Integer.valueOf(Process.getThreadPriority(Process.myTid())), "cpu_stats", "stop_pri");
        ConcurrentHashMap concurrentHashMap = r9.A0A;
        Serializable serializable = (Serializable) concurrentHashMap.get(AnonymousClass0x9.A0C("cpu_stats", "start_ps_cpu_ms"));
        if (serializable != null) {
            try {
                r9.A03(C18310x6.A0f(Process.getElapsedCpuTime(), C18310x6.A0B(serializable)), "cpu_stats", "ps_cpu_ms");
            } catch (RuntimeException unused) {
                Log.e("QPL: CpuMetadataProvider/onEnd processCpuTimeMsStart is not a number");
            }
            concurrentHashMap.remove(AnonymousClass0x9.A0C("cpu_stats", "start_ps_cpu_ms"));
        }
        Serializable serializable2 = (Serializable) concurrentHashMap.get(AnonymousClass0x9.A0C("cpu_stats", "start_th_cpu_ms"));
        if (serializable2 != null) {
            try {
                r9.A03(C18310x6.A0f(SystemClock.currentThreadTimeMillis(), C18310x6.A0B(serializable2)), "cpu_stats", "th_cpu_ms");
            } catch (RuntimeException unused2) {
                Log.e("QPL: CpuMetadataProvider/onEnd threadCpuTimeMsStart is not a number");
            }
            concurrentHashMap.remove(AnonymousClass0x9.A0C("cpu_stats", "start_th_cpu_ms"));
        }
    }

    public void Bc8(AnonymousClass30Y r4) {
        r4.A03(Integer.valueOf(Process.getThreadPriority(Process.myTid())), "cpu_stats", "start_pri");
        r4.A03(Long.valueOf(Process.getElapsedCpuTime()), "cpu_stats", "start_ps_cpu_ms");
        r4.A03(Long.valueOf(SystemClock.currentThreadTimeMillis()), "cpu_stats", "start_th_cpu_ms");
    }
}
