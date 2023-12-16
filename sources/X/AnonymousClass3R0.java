package X;

import java.io.File;

/* renamed from: X.3R0  reason: invalid class name */
public class AnonymousClass3R0 implements C83934Aj {
    public C50982j5 A00;

    public File getFile(String str) {
        File A01 = this.A00.A01(str);
        if (A01.exists()) {
            return A01;
        }
        C18260x0.A0r("MessagesImporter/Can't find file in unpacked archive: ", str, AnonymousClass001.A0o());
        throw C18330xA.A05(AnonymousClass000.A0V("Can't find file: ", str, AnonymousClass001.A0o()));
    }

    public AnonymousClass3R0(C50982j5 r1) {
        this.A00 = r1;
    }
}
