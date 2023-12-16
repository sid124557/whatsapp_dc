package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.0ms  reason: invalid class name and case insensitive filesystem */
public class C13250ms implements Runnable {
    public static final String A03 = C06240Wu.A01("StopWorkRunnable");
    public final C03440Kd A00;
    public final C06310Xb A01;
    public final boolean A02;

    public void run() {
        boolean z;
        C13340n1 r1;
        boolean z2 = this.A02;
        C09020fW r8 = this.A01.A03;
        C03440Kd r12 = this.A00;
        String str = r12.A00.A01;
        if (z2) {
            synchronized (r8.A0A) {
                C06240Wu A002 = C06240Wu.A00();
                String str2 = C09020fW.A0C;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Processor stopping foreground work ");
                C06240Wu.A03(A002, str, str2, A0o);
                r1 = (C13340n1) r8.A07.remove(str);
                if (r1 != null) {
                    r8.A08.remove(str);
                }
            }
            z = C09020fW.A00(r1, str);
        } else {
            synchronized (r8.A0A) {
                C13340n1 r6 = (C13340n1) r8.A06.remove(str);
                if (r6 == null) {
                    C06240Wu A003 = C06240Wu.A00();
                    String str3 = C09020fW.A0C;
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("WorkerWrapper could not be found for ");
                    C06240Wu.A03(A003, str, str3, A0o2);
                } else {
                    Map map = r8.A08;
                    Set set = (Set) map.get(str);
                    if (set != null && set.contains(r12)) {
                        C06240Wu A004 = C06240Wu.A00();
                        String str4 = C09020fW.A0C;
                        StringBuilder A0o3 = AnonymousClass001.A0o();
                        A0o3.append("Processor stopping background work ");
                        C06240Wu.A03(A004, str, str4, A0o3);
                        map.remove(str);
                        z = C09020fW.A00(r6, str);
                    }
                }
                z = false;
            }
        }
        C06240Wu A005 = C06240Wu.A00();
        String str5 = A03;
        StringBuilder A0o4 = AnonymousClass001.A0o();
        A0o4.append("StopWorkRunnable for ");
        A0o4.append(str);
        A005.A04(str5, AnonymousClass000.A0b("; Processor.stopWork = ", A0o4, z));
    }

    public C13250ms(C03440Kd r1, C06310Xb r2, boolean z) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = z;
    }
}
