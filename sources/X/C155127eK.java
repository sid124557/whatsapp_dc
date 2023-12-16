package X;

import android.graphics.Bitmap;
import com.whatsapp.superpack.WhatsAppObiInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.7eK  reason: invalid class name and case insensitive filesystem */
public class C155127eK {
    public static final AnonymousClass7WO A00 = new AnonymousClass7WO();

    public static Bitmap A00(AnonymousClass7WO r5, WhatsAppObiInputStream whatsAppObiInputStream) {
        ByteBuffer order = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        if (whatsAppObiInputStream.read(order.array()) == 8) {
            int i = order.getInt();
            int i2 = order.getInt();
            if (i <= 0 || i2 <= 0) {
                throw AnonymousClass002.A0C("Metadata height/width is zero or less");
            } else if (i > 4096 || i2 > 4096) {
                throw AnonymousClass002.A0C("Metadata height/width bigger than max value");
            } else {
                int i3 = i * i2 * 4;
                if (i3 <= 16777216) {
                    ByteBuffer A002 = r5.A00(i3);
                    try {
                        if (AnonymousClass6CA.A03(whatsAppObiInputStream, A002.array(), i3) == i3) {
                            Bitmap A0Y = C86664Kz.A0Y(i, i2);
                            A0Y.copyPixelsFromBuffer(A002);
                            return A0Y;
                        }
                        throw AnonymousClass002.A0C("Bytes read from stream not equal metadata size in bytes");
                    } finally {
                        r5.A01(A002);
                    }
                } else {
                    throw AnonymousClass002.A0C("Metadata has more bytes than max allowed");
                }
            }
        } else {
            throw AnonymousClass002.A0C("Dim bytes read not 8");
        }
    }
}
