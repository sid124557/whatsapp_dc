package X;

import java.io.File;

/* renamed from: X.5QG  reason: invalid class name */
public class AnonymousClass5QG {
    public final long A00;
    public final long A01;
    public final File A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass5QG) || !this.A02.equals(((AnonymousClass5QG) obj).A02)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A07(this.A02);
    }

    public AnonymousClass5QG(File file) {
        this.A02 = file;
        this.A00 = file.lastModified();
        this.A01 = file.length();
        this.A03 = file.getName();
    }
}
