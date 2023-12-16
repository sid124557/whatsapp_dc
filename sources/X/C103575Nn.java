package X;

import java.io.File;
import java.util.Map;

/* renamed from: X.5Nn  reason: invalid class name and case insensitive filesystem */
public class C103575Nn {
    public final C54292oU A00;
    public final C106965aS A01;
    public final AnonymousClass5Z1 A02;
    public final AnonymousClass4FV A03;

    public C103575Nn(C54292oU r1, C106965aS r2, AnonymousClass5Z1 r3, AnonymousClass4FV r4) {
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void A00(File file, Map map) {
        int indexOf;
        String substring;
        String A0r;
        String name = file.getName();
        C94934sK r2 = new C94934sK();
        r2.A01 = C18290x4.A0Z();
        r2.A02 = AnonymousClass0x2.A0U();
        r2.A06 = "native";
        int indexOf2 = name.indexOf("_");
        if (indexOf2 > 0 && (A0r = AnonymousClass0x7.A0r(name, indexOf2)) != null) {
            r2.A04 = A0r;
        }
        int i = indexOf2 + 1;
        if (i > 1 && (indexOf = name.indexOf("_", i)) >= 0 && (substring = name.substring(i, indexOf)) != null && map.containsKey(substring)) {
            AnonymousClass5IU A002 = C106965aS.A00((File) map.get(substring));
            r2.A03 = A002.A02;
            r2.A07 = A002.A01;
            r2.A00 = A002.A00;
        }
        this.A03.BhA(r2);
    }
}
