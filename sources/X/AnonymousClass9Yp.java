package X;

import com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProviderConfiguration$FaceTrackerErrorHandler;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.9Yp  reason: invalid class name */
public class AnonymousClass9Yp implements FaceTrackerDataProviderConfiguration$FaceTrackerErrorHandler {
    public final /* synthetic */ AnonymousClass9PB A00;
    public final /* synthetic */ AnonymousClass7XK A01;

    public AnonymousClass9Yp(AnonymousClass9PB r1, AnonymousClass7XK r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void handleLoadError(String str) {
        long j;
        C192919Mg r7 = this.A00.A02;
        IOException A0C = AnonymousClass002.A0C(str);
        HashMap hashMap = this.A01.A0B;
        StringBuilder A0l = AnonymousClass000.A0l("onFaceTrackerLoadModelFailed");
        for (Object next : hashMap.keySet()) {
            String A0e = C18320x8.A0e(next, hashMap);
            if (A0e != null) {
                File file = new File(A0e);
                if (file.exists()) {
                    j = file.length();
                } else {
                    j = 0;
                }
            } else {
                j = -1;
            }
            A0l.append(" ");
            A0l.append(C18320x8.A0e(next, hashMap));
            A0l.append(":");
            A0l.append(j);
        }
        r7.A00.A00("FbMsqrdRendererModelLoaderCallback", A0l.toString(), A0C);
    }
}
