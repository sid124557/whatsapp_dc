package X;

import android.view.SurfaceHolder;
import android.view.SurfaceView;

/* renamed from: X.6gA  reason: invalid class name and case insensitive filesystem */
public class C132886gA extends C152857aH {
    public final SurfaceHolder.Callback A00 = new AnonymousClass91N(this, 0);
    public final SurfaceView A01;

    public C132886gA(SurfaceView surfaceView) {
        this.A01 = surfaceView;
        surfaceView.getHolder().setFormat(1);
    }
}
