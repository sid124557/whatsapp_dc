package X;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7nM  reason: invalid class name and case insensitive filesystem */
public class C160277nM {
    public static final int A05 = ((int) Math.pow(2.0d, 15.0d));
    public static final int A06 = ((int) Math.pow(2.0d, 16.0d));
    public int A00;
    public ByteBuffer A01;
    public List[] A02 = new List[0];
    public boolean[] A03 = new boolean[0];
    public final List A04 = AnonymousClass001.A0s();

    public static ByteBuffer A00(ByteBuffer byteBuffer, List list) {
        float f = 1.0f;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            float f2 = 1.0f;
            while (it.hasNext()) {
                it.next();
                f2 *= 1.0f;
            }
            if (f2 <= 1.0f) {
                f = f2;
            }
        }
        boolean isNaN = Float.isNaN(f);
        boolean isNaN2 = Float.isNaN(1.0f);
        if (!isNaN) {
            if (!isNaN2 && AnonymousClass002.A00(1.0f, f) < 1.0E-5f) {
                return byteBuffer;
            }
        } else if (isNaN2) {
            return byteBuffer;
        }
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.clear();
        while (byteBuffer.hasRemaining()) {
            duplicate.putShort((short) ((int) (((float) byteBuffer.getShort()) * f)));
        }
        duplicate.flip();
        return duplicate;
    }
}
