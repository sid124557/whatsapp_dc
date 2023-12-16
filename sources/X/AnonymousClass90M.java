package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;

/* renamed from: X.90M  reason: invalid class name */
public class AnonymousClass90M implements SurfaceTexture.OnFrameAvailableListener {
    public Object A00;
    public final int A01;

    public AnonymousClass90M(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.A01) {
            case 0:
                AnonymousClass7EZ r0 = ((AnonymousClass7U1) this.A00).A05;
                if (r0 != null) {
                    ((C203659o6) r0.A00.A06.B5j(C203659o6.A00)).BjT((Long) null);
                    return;
                }
                return;
            case 1:
                C132906gD r5 = (C132906gD) this.A00;
                AnonymousClass0OZ r1 = r5.A0D;
                if (r1 == null || r5.A03 == null || r5.A0E == null || r5.A0C == null || !r5.A0P) {
                    Log.d("cameraview/draw-video-frame skipping after shutdown");
                    return;
                }
                r1.A00();
                r5.A03.updateTexImage();
                SurfaceTexture surfaceTexture2 = r5.A03;
                float[] fArr = r5.A0Z;
                surfaceTexture2.getTransformMatrix(fArr);
                GLES20.glViewport(0, 0, r5.getWidth(), r5.getHeight());
                r5.A0C.A00(r5.A02, fArr);
                AnonymousClass0OZ r12 = r5.A0D;
                AnonymousClass0W2 r02 = r12.A02;
                if (!EGL14.eglSwapBuffers(r02.A02, r12.A00)) {
                    android.util.Log.d("Grafika", "WARNING: swapBuffers() failed");
                }
                r5.A0E.A00();
                AnonymousClass0OZ r13 = r5.A0E;
                AnonymousClass0W2 r03 = r13.A02;
                EGLSurface eGLSurface = r13.A00;
                int[] A0E = C18330xA.A0E();
                EGL14.eglQuerySurface(r03.A02, eGLSurface, 12375, A0E, 0);
                int i = A0E[0];
                AnonymousClass0OZ r14 = r5.A0E;
                AnonymousClass0W2 r04 = r14.A02;
                EGLSurface eGLSurface2 = r14.A00;
                int[] A0E2 = C18330xA.A0E();
                EGL14.eglQuerySurface(r04.A02, eGLSurface2, 12374, A0E2, 0);
                GLES20.glViewport(0, 0, i, A0E2[0]);
                r5.A0C.A00(r5.A02, AnonymousClass0X6.A00);
                AnonymousClass0OZ r15 = r5.A0E;
                AnonymousClass0W2 r05 = r15.A02;
                if (!EGL14.eglSwapBuffers(r05.A02, r15.A00)) {
                    android.util.Log.d("Grafika", "WARNING: swapBuffers() failed");
                    return;
                }
                return;
            default:
                ((VoipPhysicalCamera) this.A00).notifyFrameAvailable();
                return;
        }
    }
}
