package X;

import android.os.Debug;
import java.lang.ref.WeakReference;
import java.util.Set;

/* renamed from: X.2Un  reason: invalid class name and case insensitive filesystem */
public class C44062Un {
    public final Set A00 = AnonymousClass002.A0K();

    public void A00(String str) {
        String str2;
        Runtime runtime = Runtime.getRuntime();
        if (str != null) {
            str2 = AnonymousClass000.A0X("/", AnonymousClass000.A0l(str));
        } else {
            str2 = "";
        }
        StringBuilder A0A = C18330xA.A0A(str2);
        synchronized (this) {
            for (WeakReference weakReference : this.A00) {
                C835548w r1 = (C835548w) weakReference.get();
                if (!(r1 == null || r1.BDJ() == null)) {
                    AnonymousClass0x2.A1N(A0A, r1.BDJ());
                }
            }
        }
        A0A.append("m=");
        AnonymousClass0x9.A1M(A0A, runtime.freeMemory(), 1024);
        A0A.append("/");
        AnonymousClass0x9.A1M(A0A, runtime.totalMemory(), 1024);
        A0A.append("/");
        AnonymousClass0x9.A1M(A0A, runtime.maxMemory(), 1024);
        long nativeHeapFreeSize = Debug.getNativeHeapFreeSize();
        long nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize();
        A0A.append(" native=");
        AnonymousClass0x9.A1M(A0A, nativeHeapFreeSize, 1024);
        A0A.append("/");
        C18260x0.A1H(A0A, nativeHeapAllocatedSize / 1024);
    }
}
