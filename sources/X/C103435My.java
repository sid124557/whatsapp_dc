package X;

import java.io.File;

/* renamed from: X.5My  reason: invalid class name and case insensitive filesystem */
public final class C103435My {
    public C130666cL A00;
    public final C54292oU A01;

    public C103435My(C54292oU r2) {
        C162457s7.A0J(r2, 1);
        this.A01 = r2;
    }

    public File A00() {
        return AnonymousClass002.A0A(this.A01.A00.getFilesDir(), "secret_code.key");
    }
}
