package X;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;
import java.util.Date;

/* renamed from: X.5md  reason: invalid class name and case insensitive filesystem */
public class C114185md implements C186058ug, C188018yB {
    public final long A00;
    public final Uri A01;
    public final File A02;

    public Uri B3d() {
        return this.A01;
    }

    public long B6l() {
        return new Date(this.A02.lastModified()).getTime();
    }

    public /* synthetic */ long B7A() {
        return 0;
    }

    public File B7c() {
        return this.A02;
    }

    public byte B9d() {
        return 3;
    }

    public String B9l() {
        return "video/*";
    }

    public int BCL() {
        return 0;
    }

    public boolean BHc() {
        return false;
    }

    public Bitmap Bqg(int i) {
        File A0B;
        String path = this.A01.getPath();
        if (path == null) {
            A0B = null;
        } else {
            A0B = AnonymousClass002.A0B(path);
        }
        return C107085af.A01(A0B);
    }

    public long getContentLength() {
        return this.A00;
    }

    public int getType() {
        return 1;
    }

    public C114185md(File file) {
        Uri fromFile = Uri.fromFile(file);
        long length = file.length();
        this.A01 = fromFile;
        this.A00 = length;
        this.A02 = file;
    }
}
