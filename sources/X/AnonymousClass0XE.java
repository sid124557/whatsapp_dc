package X;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.0XE  reason: invalid class name */
public final class AnonymousClass0XE {
    public static final AnonymousClass0XE A00 = new AnonymousClass0XE();

    public static final void A02(Context context) {
        C162457s7.A0J(context, 0);
        AnonymousClass0XE r3 = A00;
        File A002 = A00(context);
        if (Build.VERSION.SDK_INT >= 23 && A002.exists()) {
            C06240Wu A003 = C06240Wu.A00();
            String str = C03390Jy.A00;
            A003.A04(str, "Migrating WorkDatabase to the no-backup directory");
            Iterator A0q = AnonymousClass000.A0q(r3.A03(context));
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                File file = (File) A0w.getKey();
                File file2 = (File) A0w.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        C06240Wu.A00();
                        Log.w(str, AnonymousClass000.A0P(file2, "Over-writing contents of ", AnonymousClass001.A0o()));
                    }
                    boolean renameTo = file.renameTo(file2);
                    StringBuilder A0o = AnonymousClass001.A0o();
                    if (renameTo) {
                        A0o.append("Migrated ");
                        A0o.append(file);
                        A0o.append("to ");
                        A0o.append(file2);
                    } else {
                        A0o.append("Renaming ");
                        A0o.append(file);
                        A0o.append(" to ");
                        A0o.append(file2);
                        A0o.append(" failed");
                    }
                    C06240Wu.A00().A04(str, A0o.toString());
                }
            }
        }
    }

    public static final File A00(Context context) {
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        C162457s7.A0D(databasePath);
        return databasePath;
    }

    public final Map A03(Context context) {
        if (Build.VERSION.SDK_INT < 23) {
            return C73813g7.A0A();
        }
        File A002 = A00(context);
        File A01 = A01(context);
        int A0I = AnonymousClass8UG.A0I(r5);
        if (A0I < 16) {
            A0I = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0I);
        for (String str : C03390Jy.A01) {
            AnonymousClass3Z6 A003 = AnonymousClass2A3.A00(AnonymousClass002.A0B(AnonymousClass000.A0V(A002.getPath(), str, AnonymousClass001.A0o())), AnonymousClass002.A0B(AnonymousClass000.A0V(A01.getPath(), str, AnonymousClass001.A0o())));
            linkedHashMap.put(A003.A0D(), A003.A0E());
        }
        return C73813g7.A0E(linkedHashMap, AnonymousClass2A3.A00(A002, A01));
    }

    public static final File A01(Context context) {
        return AnonymousClass002.A0A(C03090Iu.A00(context), "androidx.work.workdb");
    }
}
