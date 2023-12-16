package X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.9kP  reason: invalid class name and case insensitive filesystem */
public class C201599kP implements AnonymousClass4C1 {
    public final C193229Nq A00;

    public C201599kP(File file) {
        try {
            String canonicalPath = file.getCanonicalPath();
            AnonymousClass9U6.A00(file);
            this.A00 = new C193229Nq(this, canonicalPath);
        } catch (IOException e) {
            throw new RuntimeException("Unable to get canonical path", e);
        }
    }

    public /* bridge */ /* synthetic */ Object get() {
        return this.A00;
    }
}
