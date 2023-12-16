package X;

import java.io.File;

/* renamed from: X.7LF  reason: invalid class name */
public class AnonymousClass7LF {
    public final File A00;
    public final File A01;
    public final Object A02 = AnonymousClass002.A0D();

    public AnonymousClass7LF(File file) {
        this.A01 = file;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(file.getPath());
        this.A00 = AnonymousClass6C7.A0S(".bak", A0o);
    }
}
