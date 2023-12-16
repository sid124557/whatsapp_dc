package X;

import android.content.Context;
import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.7if  reason: invalid class name and case insensitive filesystem */
public class C157657if {
    public static final FilenameFilter A07 = new C1895891w(0);
    public static final FilenameFilter A08 = new C1895891w(1);
    public int A00 = 0;
    public long A01 = 0;
    public C150037Ox A02 = new C150037Ox();
    public File A03;
    public File A04;
    public File A05;
    public final File A06;

    public C157657if(Context context, File file) {
        if (file.exists() || file.mkdirs()) {
            this.A06 = file;
        } else {
            File A0A = AnonymousClass002.A0A(context.getFilesDir(), "profilo");
            this.A06 = A0A;
            File A0A2 = AnonymousClass002.A0A(context.getCacheDir(), "profilo");
            if (A0A2.exists()) {
                A0A2.renameTo(A0A);
            }
            if (!A0A.exists() && !A0A.mkdirs()) {
                throw AnonymousClass001.A0e("Unable to initialize Profilo folder");
            }
        }
        this.A05 = AnonymousClass002.A0A(this.A06, "upload");
        this.A03 = AnonymousClass002.A0A(this.A06, "crash_dumps");
        this.A04 = AnonymousClass002.A0A(this.A06, "mmap_buffer");
    }
}
