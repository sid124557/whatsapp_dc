package X;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/* renamed from: X.856  reason: invalid class name */
public class AnonymousClass856 implements C185588tv {
    public final C180598lK A00;
    public final File A01;

    public Collection B4P() {
        String[] list = this.A01.list();
        if (list == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(list);
    }

    public boolean BJF(String str) {
        return false;
    }

    public long BJN(String str) {
        return AnonymousClass002.A0A(this.A01, str).lastModified();
    }

    public long BJO(String str) {
        return C159247lV.A00(AnonymousClass002.A0A(this.A01, str));
    }

    public boolean Bj4(String str) {
        return this.A00.B1O(AnonymousClass002.A0A(this.A01, str));
    }

    public AnonymousClass856(C180598lK r1, File file) {
        this.A00 = r1;
        this.A01 = file;
    }
}
