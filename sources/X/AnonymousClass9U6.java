package X;

import java.io.File;

/* renamed from: X.9U6  reason: invalid class name */
public final class AnonymousClass9U6 {
    public static final boolean A01(File file) {
        if (file != null && file.exists()) {
            if (!file.isDirectory()) {
                return true;
            }
            String[] list = file.list();
            return (list == null || list.length == 0) ? false : true;
        }
    }

    public static final void A00(File file) {
        boolean isFile = file.isFile();
        boolean A01 = A01(file);
        if (isFile) {
            if (A01) {
                C162457s7.A0H(file);
            } else {
                return;
            }
        } else if (A01 && file.isDirectory()) {
            String[] list = file.list();
            if (list != null) {
                for (String file2 : list) {
                    A00(new File(file, file2));
                }
            }
        } else {
            return;
        }
        file.delete();
    }
}
