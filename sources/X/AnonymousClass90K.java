package X;

import android.media.Image;
import android.media.ImageReader;
import com.whatsapp.voipcalling.camera.VoipCamera;
import java.util.Iterator;
import java.util.Map;
import org.pjsip.PjCamera;

/* renamed from: X.90K  reason: invalid class name */
public class AnonymousClass90K implements ImageReader.OnImageAvailableListener {
    public Object A00;
    public final int A01;

    public AnonymousClass90K(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onImageAvailable(ImageReader imageReader) {
        ImageReader imageReader2 = imageReader;
        switch (this.A01) {
            case 0:
                ((C138506qU) this.A00).A02(imageReader2.acquireLatestImage());
                return;
            case 1:
                ImageReader.OnImageAvailableListener onImageAvailableListener = ((C171948Ja) this.A00).A01;
                if (onImageAvailableListener != null) {
                    onImageAvailableListener.onImageAvailable(imageReader2);
                    return;
                }
                return;
            case 2:
                C138516qV r3 = (C138516qV) this.A00;
                Image acquireLatestImage = imageReader2.acquireLatestImage();
                if (acquireLatestImage != null) {
                    Iterator A0q = AnonymousClass000.A0q(r3.virtualCameras);
                    while (A0q.hasNext()) {
                        Map.Entry A0w = AnonymousClass001.A0w(A0q);
                        if (((VoipCamera) A0w.getValue()).started) {
                            VoipCamera voipCamera = (VoipCamera) A0w.getValue();
                            r3.updateCameraCallbackCheck();
                            int length = acquireLatestImage.getPlanes().length;
                            Image.Plane plane = acquireLatestImage.getPlanes()[0];
                            if (length == 1) {
                                voipCamera.abgrFramePlaneCallback(acquireLatestImage.getWidth(), acquireLatestImage.getHeight(), plane.getBuffer(), plane.getRowStride());
                            } else {
                                Image.Plane plane2 = acquireLatestImage.getPlanes()[1];
                                Image.Plane plane3 = acquireLatestImage.getPlanes()[2];
                                voipCamera.framePlaneCallback(acquireLatestImage.getWidth(), acquireLatestImage.getHeight(), plane.getBuffer(), plane.getRowStride(), plane2.getBuffer(), plane2.getRowStride(), plane3.getBuffer(), plane3.getRowStride(), plane2.getPixelStride());
                            }
                        }
                    }
                    synchronized (r3.A0I) {
                        Image image = r3.A03;
                        if (image != null) {
                            image.close();
                        }
                        r3.A03 = acquireLatestImage;
                    }
                    return;
                }
                return;
            default:
                ((PjCamera) this.A00).imageAvailableListener(imageReader2);
                return;
        }
    }
}
