package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.nio.charset.Charset;

/* renamed from: X.79X  reason: invalid class name */
public final class AnonymousClass79X {
    public static final Charset A00;
    public static final Charset A01;
    public static final Charset A02;
    public static final Charset A03;
    public static final Charset A04;
    public static final Charset A05;

    static {
        Charset forName = Charset.forName(DefaultCrypto.UTF_8);
        C162457s7.A0D(forName);
        A05 = forName;
        Charset forName2 = Charset.forName("UTF-16");
        C162457s7.A0D(forName2);
        A02 = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        C162457s7.A0D(forName3);
        A03 = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        C162457s7.A0D(forName4);
        A04 = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        C162457s7.A0D(forName5);
        A01 = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        C162457s7.A0D(forName6);
        A00 = forName6;
    }
}
