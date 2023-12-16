package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.799  reason: invalid class name */
public class AnonymousClass799 {
    public static final C13570nO A00;
    public static final Charset A01 = Charset.forName("US-ASCII");
    public static final Charset[] A02 = {Charset.forName(DefaultCrypto.UTF_8), Charset.forName("UTF-16BE")};

    static {
        List asList = Arrays.asList(new String[]{"AO", "CV", "GQ", "FR", "GW", "LU", "MO", "MZ", "PT", "ST", "CH", "TL"});
        C13570nO r0 = new C13570nO(0);
        if (asList != null) {
            r0.addAll(asList);
        }
        A00 = r0;
    }
}
