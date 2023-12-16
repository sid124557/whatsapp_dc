package X;

import android.text.TextUtils;
import com.whatsapp.R;

/* renamed from: X.9V1  reason: invalid class name */
public class AnonymousClass9V1 {
    public static final C193349Od A01 = new C193349Od("HDFC", R.drawable.hdfc_watermark);
    public static final C193349Od A02 = new C193349Od("ICICI", R.drawable.icici_watermark);
    public final AnonymousClass9W6 A00;

    public AnonymousClass9V1(AnonymousClass9W6 r1) {
        this.A00 = r1;
    }

    public C193349Od A00(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            switch (str.hashCode()) {
                case 73456:
                    if (str.equals("JIO")) {
                        return new C193349Od("JIO", R.drawable.jio_watermark);
                    }
                    break;
                case 81882:
                    if (str.equals("SBI")) {
                        return new C193349Od("SBI", R.drawable.sbi_watermark);
                    }
                    break;
                case 2023329:
                    if (str.equals("AXIS")) {
                        return new C193349Od("AXIS", R.drawable.axis_watermark);
                    }
                    break;
                case 2212537:
                    if (str.equals("HDFC")) {
                        return new C193349Od("HDFC", R.drawable.hdfc_watermark);
                    }
                    break;
            }
        }
        if (this.A00.A08(str2)) {
            return A01;
        }
        return A02;
    }
}
