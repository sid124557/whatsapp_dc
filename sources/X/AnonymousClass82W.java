package X;

import android.os.Build;
import android.os.Handler;
import android.view.Window;
import java.lang.ref.WeakReference;

/* renamed from: X.82W  reason: invalid class name */
public class AnonymousClass82W implements C183738qX {
    public boolean A00 = false;
    public final Handler A01;
    public final Window.OnFrameMetricsAvailableListener A02;
    public final WeakReference A03;

    public void B1e() {
        if (this.A00) {
            this.A00 = false;
            Window window = (Window) this.A03.get();
            if (window != null && Build.VERSION.SDK_INT >= 24) {
                window.removeOnFrameMetricsAvailableListener(this.A02);
            }
        }
    }

    public void B2L() {
        if (!this.A00) {
            this.A00 = true;
            Window window = (Window) this.A03.get();
            if (window != null && Build.VERSION.SDK_INT >= 24) {
                window.addOnFrameMetricsAvailableListener(this.A02, this.A01);
            }
        }
    }

    public AnonymousClass82W(Handler handler, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener, Window window) {
        this.A01 = handler;
        this.A03 = AnonymousClass0x9.A14(window);
        this.A02 = onFrameMetricsAvailableListener;
    }
}
