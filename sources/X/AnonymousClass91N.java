package X;

import android.media.MediaPlayer;
import android.view.SurfaceHolder;
import com.whatsapp.util.Log;
import com.whatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.91N  reason: invalid class name */
public class AnonymousClass91N implements SurfaceHolder.Callback {
    public Object A00;
    public final int A01;

    public AnonymousClass91N(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0025, code lost:
        if (r2.A07 != r9) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void surfaceChanged(android.view.SurfaceHolder r6, int r7, int r8, int r9) {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x003e;
                case 1: goto L_0x004e;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "videoview/surfaceChanged: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = "x"
            X.C18260x0.A0y(r0, r1, r9)
            java.lang.Object r2 = r5.A00
            com.whatsapp.videoplayback.VideoSurfaceView r2 = (com.whatsapp.videoplayback.VideoSurfaceView) r2
            r2.A05 = r8
            r2.A04 = r9
            int r0 = r2.A08
            if (r0 != r8) goto L_0x0027
            int r0 = r2.A07
            r1 = 1
            if (r0 == r9) goto L_0x0028
        L_0x0027:
            r1 = 0
        L_0x0028:
            android.media.MediaPlayer r0 = r2.A0C
            if (r0 == 0) goto L_0x003d
            if (r1 == 0) goto L_0x003d
            int r0 = r2.A03
            if (r0 < 0) goto L_0x0035
            r2.seekTo(r0)
        L_0x0035:
            int r1 = r2.A06
            r0 = 3
            if (r1 != r0) goto L_0x003d
            r2.start()
        L_0x003d:
            return
        L_0x003e:
            java.lang.Object r0 = r5.A00
            X.7aH r0 = (X.C152857aH) r0
            X.8KC r1 = r0.A01
            if (r1 == 0) goto L_0x003d
            android.view.Surface r0 = r6.getSurface()
            r1.A0D(r0, r8, r9)
            return
        L_0x004e:
            java.lang.Object r4 = r5.A00
            X.6EW r4 = (X.AnonymousClass6EW) r4
            android.hardware.Camera r0 = r4.A03
            if (r0 != 0) goto L_0x0064
            android.os.Handler r0 = r4.A04
            if (r0 != 0) goto L_0x003d
            java.lang.String r0 = "qrview/surfacechanged: no camera"
        L_0x005c:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 1
            r4.A00(r0)
            return
        L_0x0064:
            android.view.SurfaceHolder r3 = r4.A0L
            android.view.Surface r0 = r3.getSurface()
            if (r0 != 0) goto L_0x006f
            java.lang.String r0 = "qrview/surfacechanged: no surface"
            goto L_0x005c
        L_0x006f:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "qrview/surfacechanged  format:"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " w:"
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " h:"
            X.C18260x0.A0w(r0, r1, r9)
            android.os.Handler r2 = r4.A04
            r1 = 40
            X.3a0 r0 = new X.3a0
            r0.<init>(r4, r1, r3)
            r2.post(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass91N.surfaceChanged(android.view.SurfaceHolder, int, int, int):void");
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        switch (this.A01) {
            case 0:
                C152857aH r2 = (C152857aH) this.A00;
                AnonymousClass8KC r1 = r2.A01;
                if (r1 != null) {
                    r1.A0B(surfaceHolder.getSurface());
                    r2.A01.setCornerRadius(r2.A00);
                    return;
                }
                return;
            case 1:
                Log.i("qrview/surfaceCreated");
                AnonymousClass6EW r3 = (AnonymousClass6EW) this.A00;
                r3.A04.post(new C70033Zp(r3, 0));
                return;
            default:
                VideoSurfaceView videoSurfaceView = (VideoSurfaceView) this.A00;
                videoSurfaceView.A0E = surfaceHolder;
                videoSurfaceView.A02();
                return;
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        switch (this.A01) {
            case 0:
                AnonymousClass8KC r1 = ((C152857aH) this.A00).A01;
                if (r1 != null) {
                    r1.A0C(surfaceHolder.getSurface());
                    return;
                }
                return;
            case 1:
                Log.i("qrview/surfacedestroyed");
                AnonymousClass6EW r3 = (AnonymousClass6EW) this.A00;
                r3.A04.post(new C70033Zp(r3, 2));
                return;
            default:
                VideoSurfaceView videoSurfaceView = (VideoSurfaceView) this.A00;
                videoSurfaceView.A03 = videoSurfaceView.getCurrentPosition();
                videoSurfaceView.A0E = null;
                MediaPlayer mediaPlayer = videoSurfaceView.A0C;
                if (mediaPlayer != null) {
                    mediaPlayer.reset();
                    videoSurfaceView.A0C.release();
                    videoSurfaceView.A0C = null;
                    videoSurfaceView.A02 = 0;
                    videoSurfaceView.A06 = 0;
                    return;
                }
                return;
        }
    }
}
