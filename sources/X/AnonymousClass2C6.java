package X;

import android.net.Uri;

/* renamed from: X.2C6  reason: invalid class name */
public class AnonymousClass2C6 {
    public static final Uri A00;
    public static final Uri A01;
    public static final Uri A02;
    public static final String A03;

    static {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("com.whatsapp");
        String A0X = AnonymousClass000.A0X(".provider.migrate.ios", A0o);
        A03 = A0X;
        Uri build = new Uri.Builder().scheme("content").authority(A0X).build();
        A00 = build;
        A02 = Uri.withAppendedPath(build, "files");
        A01 = Uri.withAppendedPath(build, "file");
    }
}
