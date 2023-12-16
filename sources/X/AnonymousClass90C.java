package X;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

/* renamed from: X.90C  reason: invalid class name */
public class AnonymousClass90C extends AnonymousClass7VL {
    public final int A00;

    public AnonymousClass90C(int i) {
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ Object A00() {
        String str;
        switch (this.A00) {
            case 0:
                str = "yyyy-MM-dd HH:mm:ss.SSSZ";
                break;
            case 3:
                str = "MMM dd, yyyy";
                break;
            case 4:
                str = "yyyy-MM-dd";
                break;
            default:
                return new GregorianCalendar();
        }
        return new SimpleDateFormat(str, Locale.US);
    }
}
