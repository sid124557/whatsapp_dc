package X;

import android.graphics.Rect;
import android.media.Image;
import android.util.Pair;
import java.nio.ByteBuffer;

/* renamed from: X.9S8  reason: invalid class name */
public class AnonymousClass9S8 {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public Rect A04;
    public Pair A05;
    public Float A06;
    public Long A07;
    public Long A08;
    public boolean A09;
    public byte[] A0A;
    public float[] A0B;
    public AnonymousClass9RE[] A0C;

    public void A00(Image image, Pair pair, Float f, Long l, Long l2, float[] fArr, boolean z, boolean z2) {
        int i;
        this.A09 = z;
        Image.Plane[] planes = image.getPlanes();
        AnonymousClass9RE[] r0 = this.A0C;
        if (r0 == null || r0.length != (i = planes.length)) {
            i = planes.length;
            this.A0C = new AnonymousClass9RE[i];
        }
        for (int i2 = 0; i2 < i; i2++) {
            AnonymousClass9RE[] r1 = this.A0C;
            if (r1[i2] == null) {
                r1[i2] = new AnonymousClass9RE();
            }
            AnonymousClass9RE r5 = r1[i2];
            ByteBuffer buffer = planes[i2].getBuffer();
            if (z2) {
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(buffer.capacity());
                buffer.rewind();
                allocateDirect.put(buffer);
                buffer.rewind();
                allocateDirect.flip();
                buffer = allocateDirect;
            }
            r5.A02 = buffer;
            this.A0C[i2].A00 = planes[i2].getPixelStride();
            this.A0C[i2].A01 = planes[i2].getRowStride();
        }
        this.A0B = fArr;
        this.A05 = pair;
        this.A08 = l;
        this.A06 = f;
        this.A07 = l2;
        this.A01 = image.getFormat();
        this.A03 = image.getTimestamp();
        this.A02 = image.getWidth();
        this.A00 = image.getHeight();
        this.A04 = image.getCropRect();
    }
}
