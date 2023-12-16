package X;

import android.net.Uri;
import com.whatsapp.GifHelper;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.53q  reason: invalid class name and case insensitive filesystem */
public class C988953q extends C107655bf {
    public final C620633i A00;
    public final AnonymousClass306 A01;

    public byte A00(Uri uri) {
        AnonymousClass5UR A0R = this.A00.A0R();
        String A0W = C107655bf.A0W(uri, A0R);
        try {
            if ("image/gif".equals(A0W)) {
                AnonymousClass306 r0 = this.A01;
                try {
                    C172218Kd.A02(uri, r0, A0R);
                    if (!C172218Kd.A02(uri, r0, A0R).A02) {
                        return 1;
                    }
                    return 13;
                } catch (IOException unused) {
                }
            }
        } catch (IOException e) {
            Log.e("Media file cannot be read", e);
        }
        byte A0A = C107655bf.A0A(A0W);
        if (A0A == 0) {
            return 9;
        }
        return A0A;
    }

    public C988953q(C620633i r3, AnonymousClass306 r4) {
        this.A00 = r3;
        this.A01 = r4;
        r4.A02.add("com.whatsapp.provider.MigrationContentProvider");
    }

    public byte A01(AnonymousClass5YF r3) {
        byte A02 = A02(r3);
        r3.A0F(Byte.valueOf(A02));
        return A02;
    }

    public byte A02(AnonymousClass5YF r4) {
        Byte A08 = r4.A08();
        if (A08 == null) {
            byte A002 = A00(r4.A0G);
            A08 = Byte.valueOf(A002);
            if (A002 == 3 && GifHelper.A01(r4.A07())) {
                A08 = (byte) 13;
            }
        }
        return A08.byteValue();
    }
}
