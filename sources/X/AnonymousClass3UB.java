package X;

import android.app.ActivityManager;
import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.3UB  reason: invalid class name */
public class AnonymousClass3UB implements AnonymousClass4GE {
    public final C620633i A00;
    public final C40852Hz A01;

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BRu(X.AnonymousClass30Y r11) {
        /*
            r10 = this;
            X.33i r0 = r10.A00
            android.app.ActivityManager r0 = r0.A06()
            if (r0 == 0) goto L_0x0070
            android.app.ActivityManager$MemoryInfo r4 = new android.app.ActivityManager$MemoryInfo
            r4.<init>()
            r0.getMemoryInfo(r4)
            long r0 = r4.availMem
            r8 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 / r8
            long r0 = r0 * r8
            java.lang.String r7 = "avail_mem"
            java.lang.String r6 = "memory_stats"
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r11.A03(r0, r6, r7)
            long r2 = r4.threshold
            long r2 = r2 / r8
            long r2 = r2 * r8
            java.lang.String r1 = "low_mem"
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r11.A03(r0, r6, r1)
            long r2 = r4.totalMem
            long r2 = r2 / r8
            long r2 = r2 * r8
            java.lang.String r1 = "total_mem"
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r11.A03(r0, r6, r1)
            long r3 = r4.availMem
            long r3 = r3 / r8
            long r3 = r3 * r8
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r7)     // Catch:{ RuntimeException -> 0x0070 }
            java.lang.String r0 = "_at_start"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ RuntimeException -> 0x0070 }
            java.util.concurrent.ConcurrentHashMap r1 = r11.A0A     // Catch:{ RuntimeException -> 0x0070 }
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r6, r0)     // Catch:{ RuntimeException -> 0x0070 }
            java.lang.Object r5 = r1.get(r0)     // Catch:{ RuntimeException -> 0x0070 }
            java.io.Serializable r5 = (java.io.Serializable) r5     // Catch:{ RuntimeException -> 0x0070 }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ RuntimeException -> 0x0070 }
            if (r5 == 0) goto L_0x0070
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r7)     // Catch:{  }
            java.lang.String r0 = "_delta"
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{  }
            long r0 = r5.longValue()     // Catch:{  }
            java.lang.Long r0 = X.C18310x6.A0f(r3, r0)     // Catch:{  }
            r11.A03(r0, r6, r2)     // Catch:{  }
        L_0x0070:
            X.2Hz r0 = r10.A01
            java.lang.Runtime r0 = r0.A00
            long r3 = r0.totalMemory()
            long r0 = r0.freeMemory()
            long r3 = r3 - r0
            java.lang.String r2 = "java_heap"
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r0
            long r3 = r3 * r0
            java.lang.String r6 = "memory_stats"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r2)     // Catch:{ RuntimeException -> 0x00b5 }
            java.lang.String r0 = "_at_start"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ RuntimeException -> 0x00b5 }
            java.util.concurrent.ConcurrentHashMap r1 = r11.A0A     // Catch:{ RuntimeException -> 0x00b5 }
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r6, r0)     // Catch:{ RuntimeException -> 0x00b5 }
            java.lang.Object r5 = r1.get(r0)     // Catch:{ RuntimeException -> 0x00b5 }
            java.io.Serializable r5 = (java.io.Serializable) r5     // Catch:{ RuntimeException -> 0x00b5 }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ RuntimeException -> 0x00b5 }
            if (r5 == 0) goto L_0x00b5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r2)     // Catch:{  }
            java.lang.String r0 = "_delta"
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{  }
            long r0 = r5.longValue()     // Catch:{  }
            java.lang.Long r0 = X.C18310x6.A0f(r3, r0)     // Catch:{  }
            r11.A03(r0, r6, r2)     // Catch:{  }
        L_0x00b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UB.BRu(X.30Y):void");
    }

    public void Bc8(AnonymousClass30Y r7) {
        ActivityManager A06 = this.A00.A06();
        if (A06 != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            A06.getMemoryInfo(memoryInfo);
            long j = (memoryInfo.availMem / SearchActionVerificationClientService.MS_TO_NS) * SearchActionVerificationClientService.MS_TO_NS;
            r7.A03(Long.valueOf(j), "memory_stats", AnonymousClass000.A0X("_at_start", AnonymousClass000.A0l("avail_mem")));
        }
        Runtime runtime = this.A01.A00;
        long freeMemory = ((runtime.totalMemory() - runtime.freeMemory()) / SearchActionVerificationClientService.MS_TO_NS) * SearchActionVerificationClientService.MS_TO_NS;
        r7.A03(Long.valueOf(freeMemory), "memory_stats", AnonymousClass000.A0X("_at_start", AnonymousClass000.A0l("java_heap")));
    }

    public AnonymousClass3UB(C620633i r1, C40852Hz r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final String B9C() {
        return "memory_stats";
    }

    public boolean BIm() {
        return true;
    }
}
