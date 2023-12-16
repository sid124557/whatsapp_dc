package X;

import android.app.ActivityManager;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;

/* renamed from: X.2Zo  reason: invalid class name and case insensitive filesystem */
public class C45322Zo {
    public long A00;
    public final C620633i A01;
    public final C56612sH A02;

    public C45322Zo(C620633i r1, C56612sH r2) {
        this.A02 = r2;
        this.A01 = r1;
    }

    public Long A00() {
        ActivityManager A06;
        if (SystemClock.uptimeMillis() - this.A00 > 300000 && (A06 = this.A01.A06()) != null) {
            int[] A0E = C18330xA.A0E();
            A0E[0] = Process.myPid();
            Debug.MemoryInfo[] processMemoryInfo = A06.getProcessMemoryInfo(A0E);
            this.A00 = SystemClock.uptimeMillis();
            if (processMemoryInfo != null && processMemoryInfo.length > 0) {
                return AnonymousClass0x9.A0m(processMemoryInfo[0].getTotalPrivateDirty());
            }
        }
        return null;
    }
}
