package X;

import android.media.ImageReader;
import android.os.Handler;
import android.view.Surface;

/* renamed from: X.9Zg  reason: invalid class name and case insensitive filesystem */
public class C195719Zg implements C203439nh {
    public ImageReader A00;
    public final int A01;
    public final ImageReader.OnImageAvailableListener A02 = new C204039oi(this, 0);
    public volatile C193819Qe A03;

    public Surface BDP() {
        ImageReader imageReader = this.A00;
        if (imageReader != null) {
            return imageReader.getSurface();
        }
        return null;
    }

    public void BFo(int i, int i2, int i3) {
        this.A00 = ImageReader.newInstance(i, i2, this.A01, 1);
    }

    public void BhJ(Handler handler, C193819Qe r4) {
        if (this.A00 != null) {
            this.A03 = r4;
            this.A00.setOnImageAvailableListener(this.A02, handler);
        }
    }

    public void release() {
        ImageReader imageReader = this.A00;
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener((ImageReader.OnImageAvailableListener) null, (Handler) null);
            this.A00.close();
            this.A00 = null;
        }
        this.A03 = null;
    }

    public C195719Zg(int i) {
        this.A01 = i;
    }

    public int B8F() {
        return this.A01;
    }
}
