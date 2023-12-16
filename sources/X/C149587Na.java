package X;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;

/* renamed from: X.7Na  reason: invalid class name and case insensitive filesystem */
public class C149587Na {
    public long A00 = 0;
    public HandlerThread A01;
    public Surface A02;
    public C162777sk A03;
    public final /* synthetic */ AnonymousClass7BA A04;

    public C149587Na(AnonymousClass7BA r5) {
        this.A04 = r5;
        AnonymousClass7QP r0 = r5.A00;
        r0.getClass();
        SurfaceTexture surfaceTexture = r0.A02;
        surfaceTexture.getClass();
        this.A03 = new C162777sk(surfaceTexture);
        HandlerThread handlerThread = new HandlerThread("videotranscoder-framecallback", -19);
        this.A01 = handlerThread;
        handlerThread.start();
        C162777sk r2 = this.A03;
        Looper looper = this.A01.getLooper();
        looper.getClass();
        surfaceTexture.setOnFrameAvailableListener(r2, new Handler(looper));
        this.A02 = new Surface(surfaceTexture);
    }
}
