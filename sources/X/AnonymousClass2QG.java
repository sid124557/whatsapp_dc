package X;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2QG  reason: invalid class name */
public class AnonymousClass2QG {
    public final long A00;
    public final File A01;
    public final AtomicBoolean A02;
    public final AtomicInteger A03 = new AtomicInteger();

    public AnonymousClass2QG(File file, boolean z) {
        this.A01 = file;
        this.A02 = new AtomicBoolean(z);
        long length = file.length();
        this.A00 = length;
        if (length == 0 && !file.exists()) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "mediafilereference/file does not exist: ", file);
        }
    }
}
