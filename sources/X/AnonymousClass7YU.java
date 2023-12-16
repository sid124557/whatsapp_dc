package X;

import java.io.File;

/* renamed from: X.7YU  reason: invalid class name */
public final class AnonymousClass7YU {
    public final int A00;
    public final File A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7YU) {
                AnonymousClass7YU r5 = (AnonymousClass7YU) obj;
                if (this.A00 != r5.A00 || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + AnonymousClass000.A07(this.A01);
    }

    public AnonymousClass7YU(File file, int i) {
        this.A00 = i;
        this.A01 = file;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AudioDecodeResult(code=");
        A0o.append(this.A00);
        A0o.append(", decodedFile=");
        return C18260x0.A04(this.A01, A0o);
    }
}
