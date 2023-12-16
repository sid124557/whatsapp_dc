package X;

import android.app.ActivityManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.DeadObjectException;
import android.os.Debug;
import com.whatsapp.util.Log;

/* renamed from: X.2e2  reason: invalid class name and case insensitive filesystem */
public class C47912e2 {
    public final C620633i A00;

    public void A00() {
        NetworkInfo[] networkInfoArr;
        String str;
        ConnectivityManager A0H = this.A00.A0H();
        if (A0H == null) {
            Log.w("app/log-network-info cm=null");
            return;
        }
        try {
            networkInfoArr = A0H.getAllNetworkInfo();
        } catch (RuntimeException e) {
            if (e.getCause() instanceof DeadObjectException) {
                networkInfoArr = null;
            } else {
                throw e;
            }
        }
        StringBuilder A0A = C18330xA.A0A("network/info");
        if (networkInfoArr != null) {
            boolean z = false;
            for (NetworkInfo networkInfo : networkInfoArr) {
                if (networkInfo.getState() != NetworkInfo.State.UNKNOWN) {
                    C18270x1.A1H(A0A, "\n", networkInfo);
                    A0A.append(", type: ");
                    A0A.append(networkInfo.getType());
                    A0A.append(", subtype: ");
                    A0A.append(networkInfo.getSubtype());
                    z = true;
                }
            }
            if (z) {
                str = A0A.toString();
            } else {
                str = "app/log-network-info/all_network_states_unknown";
            }
            Log.i(str);
            return;
        }
        Log.e("app/log-network-info/unavailable");
    }

    public C47912e2(C620633i r1) {
        this.A00 = r1;
    }

    public void A01() {
        C626936e.A00();
        C620633i r14 = this.A00;
        ActivityManager A06 = r14.A06();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (A06 == null) {
            Log.w("device/memory am=null");
        } else {
            A06.getMemoryInfo(memoryInfo);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("device/memory/system/available ");
            AnonymousClass0x9.A1M(A0o, memoryInfo.availMem, 1024);
            A0o.append(" kiB (");
            AnonymousClass0x9.A1M(A0o, memoryInfo.threshold, 1024);
            A0o.append(" kiB) lowMemory=");
            C18260x0.A1V(A0o, memoryInfo.lowMemory);
        }
        long freeMemory = Runtime.getRuntime().freeMemory();
        long j = Runtime.getRuntime().totalMemory();
        long nativeHeapFreeSize = Debug.getNativeHeapFreeSize();
        long nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize();
        long j2 = C58152un.A00;
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("device/memory/max ");
        AnonymousClass0x9.A1M(A0o2, j2, 1024);
        A0o2.append(" kiB (~");
        A0o2.append(AnonymousClass34L.A00(r14));
        C18260x0.A1L(A0o2, " memory class)");
        StringBuilder A0o3 = AnonymousClass001.A0o();
        A0o3.append("device/memory/native/size ");
        AnonymousClass0x9.A1M(A0o3, nativeHeapFreeSize + nativeHeapAllocatedSize, 1024);
        A0o3.append(" kiB/allocated ");
        AnonymousClass0x9.A1M(A0o3, nativeHeapAllocatedSize, 1024);
        A0o3.append(" kiB/free ");
        AnonymousClass0x9.A1M(A0o3, nativeHeapFreeSize, 1024);
        C18260x0.A1L(A0o3, " kiB");
        StringBuilder A0o4 = AnonymousClass001.A0o();
        A0o4.append("device/memory/dalvik/size ");
        AnonymousClass0x9.A1M(A0o4, j, 1024);
        A0o4.append(" kiB/allocated ");
        AnonymousClass0x9.A1M(A0o4, j - freeMemory, 1024);
        A0o4.append(" kiB/free ");
        AnonymousClass0x9.A1M(A0o4, freeMemory, 1024);
        C18260x0.A1L(A0o4, " kiB");
    }
}
