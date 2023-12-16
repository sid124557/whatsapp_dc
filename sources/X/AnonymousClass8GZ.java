package X;

import android.net.Uri;
import java.io.File;

/* renamed from: X.8GZ  reason: invalid class name */
public abstract class AnonymousClass8GZ implements C186058ug {
    public Long A00;
    public final long A01;
    public final Uri A02;
    public final C30471mV A03;
    public final File A04;

    public AnonymousClass8GZ(C30471mV r7, File file, long j) {
        this(Uri.fromFile(file), r7, file, j);
    }

    public final Uri B3d() {
        return this.A02;
    }

    public final long B6l() {
        return this.A01;
    }

    public /* synthetic */ long B7A() {
        if (this instanceof C134326ip) {
            return ((C134326ip) this).A00;
        }
        if (this instanceof C134316io) {
            return ((C134316io) this).A00;
        }
        if (this instanceof C134306in) {
            return ((C134306in) this).A00;
        }
        return 0;
    }

    public final long getContentLength() {
        long j;
        Long l = this.A00;
        if (l == null) {
            File file = this.A04;
            if (file != null) {
                j = file.length();
            } else {
                j = 0;
            }
            l = Long.valueOf(j);
            this.A00 = l;
        }
        return l.longValue();
    }

    public AnonymousClass8GZ(Uri uri, C30471mV r2, File file, long j) {
        this.A04 = file;
        this.A02 = uri;
        this.A01 = j;
        this.A03 = r2;
    }
}
