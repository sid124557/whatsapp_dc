package X;

import java.io.File;

/* renamed from: X.329  reason: invalid class name */
public class AnonymousClass329 {
    public final C54292oU A00;

    public AnonymousClass329(C54292oU r1) {
        this.A00 = r1;
    }

    public static File[] A00(C54292oU r6) {
        File[] fileArr;
        File A0A = AnonymousClass002.A0A(C54292oU.A02(r6), "traces");
        if (!A0A.exists() || (fileArr = A0A.listFiles(new C86084It(0))) == null) {
            fileArr = new File[0];
        }
        if (fileArr.length > 0) {
            return fileArr;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("traces_");
        A0o.append("com.whatsapp");
        String[] strArr = {"traces.txt", AnonymousClass000.A0X(".txt", A0o)};
        int i = 0;
        do {
            File A04 = C18330xA.A04("/data/anr/", strArr[i]);
            if (A04.exists()) {
                return new File[]{A04};
            }
            i++;
        } while (i < 2);
        return new File[0];
    }
}
