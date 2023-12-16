package com.whatsapp.util;

import X.AnonymousClass001;
import X.C18280x3;
import android.system.ErrnoException;
import android.system.Os;
import java.io.File;

public class BaseMediaFileUtils$OsRename {
    public static int attempt(File file, File file2) {
        try {
            Os.rename(file.getAbsolutePath(), file2.getAbsolutePath());
            return -1;
        } catch (ErrnoException e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("MMS Os.rename also failed, errno=");
            A0o.append(e.errno);
            C18280x3.A1C(A0o, e);
            return e.errno;
        }
    }
}
