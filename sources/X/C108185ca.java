package X;

import android.media.MediaScannerConnection;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.5ca  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C108185ca implements MediaScannerConnection.OnScanCompletedListener {
    public final /* synthetic */ Runnable A00;
    public final /* synthetic */ AtomicInteger A01;

    public final void onScanCompleted(String str, Uri uri) {
        AtomicInteger atomicInteger = this.A01;
        Runnable runnable = this.A00;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("fmessageio/rescan/scan completed: file=");
        A0o.append(str);
        C18260x0.A1R(A0o, " uri=", uri);
        if (atomicInteger.decrementAndGet() <= 0 && runnable != null) {
            runnable.run();
        }
    }

    public /* synthetic */ C108185ca(Runnable runnable, AtomicInteger atomicInteger) {
        this.A01 = atomicInteger;
        this.A00 = runnable;
    }
}
