package X;

import android.media.ImageReader;
import android.os.Handler;
import android.view.Surface;

/* renamed from: X.9Zf  reason: invalid class name and case insensitive filesystem */
public class C195709Zf implements C203439nh {
    public ImageReader A00;
    public C193819Qe A01;
    public final ImageReader.OnImageAvailableListener A02 = new C204039oi(this, 2);

    public Surface BDP() {
        ImageReader imageReader = this.A00;
        if (imageReader != null) {
            return imageReader.getSurface();
        }
        return null;
    }

    public void BFo(int i, int i2, int i3) {
        this.A00 = ImageReader.newInstance(i, i2, 35, 1);
    }

    public void BhJ(Handler handler, C193819Qe r4) {
        ImageReader imageReader = this.A00;
        if (imageReader != null) {
            this.A01 = r4;
            imageReader.setOnImageAvailableListener(this.A02, handler);
        }
    }

    public void release() {
        ImageReader imageReader = this.A00;
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener((ImageReader.OnImageAvailableListener) null, (Handler) null);
            this.A00.close();
            this.A00 = null;
        }
        this.A01 = null;
    }

    public int B8F() {
        return 35;
    }
}
