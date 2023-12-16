package X;

import android.os.Build;
import com.facebook.profilo.logger.MultiBufferLogger;

/* renamed from: X.2g6  reason: invalid class name and case insensitive filesystem */
public class C49172g6 {
    public final MultiBufferLogger A00;
    public final C620633i A01;
    public final C60152y5 A02;

    public void A00() {
        A01("os_ver", Build.VERSION.RELEASE, 8126483);
        A01("os_sdk", Integer.toString(Build.VERSION.SDK_INT), 8126537);
        A01("device_type", Build.MODEL, 8126478);
        A01("brand", Build.BRAND, 8126479);
        A01("manufacturer", Build.MANUFACTURER, 8126480);
        A01("year_class", Integer.toString(AnonymousClass34G.A02(this.A01, this.A02)), 8126481);
    }

    public final void A01(String str, String str2, int i) {
        MultiBufferLogger multiBufferLogger = this.A00;
        int writeStandardEntry = multiBufferLogger.writeStandardEntry(7, 52, 0, 0, i, 0, 0);
        if (str != null) {
            writeStandardEntry = multiBufferLogger.writeBytesEntry(1, 56, writeStandardEntry, str);
        }
        multiBufferLogger.writeBytesEntry(1, 57, writeStandardEntry, str2);
    }

    public C49172g6(MultiBufferLogger multiBufferLogger, C620633i r2, C60152y5 r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = multiBufferLogger;
    }
}
