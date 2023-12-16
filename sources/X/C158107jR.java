package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7jR  reason: invalid class name and case insensitive filesystem */
public class C158107jR {
    public static C158107jR A03;
    public String A00;
    public final Context A01;
    public final File A02;

    public Set A02(int i) {
        String str;
        int length;
        Object value;
        Map map;
        File A012 = A01(C154747dg.A00(i));
        if (!A012.isDirectory()) {
            map = Collections.emptyMap();
        } else {
            if (i == 103 || i == 104) {
                str = "__version__";
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                map = Collections.singletonMap(A012, (Object) null);
            } else {
                String[] split = str.split("/");
                HashMap A0t = AnonymousClass001.A0t();
                HashMap A0t2 = AnonymousClass001.A0t();
                A0t.put(A012, (Object) null);
                for (String equals : split) {
                    boolean equals2 = equals.equals((Object) null);
                    Iterator A0u = AnonymousClass001.A0u(A0t);
                    while (A0u.hasNext()) {
                        Map.Entry A0w = AnonymousClass001.A0w(A0u);
                        File[] listFiles = ((File) A0w.getKey()).listFiles();
                        if (listFiles != null && (length = listFiles.length) != 0) {
                            int i2 = 0;
                            do {
                                File file = listFiles[i2];
                                if (file.isDirectory()) {
                                    if (equals2) {
                                        value = file.getName();
                                    } else {
                                        value = A0w.getValue();
                                    }
                                    A0t2.put(file, value);
                                }
                                i2++;
                            } while (i2 < length);
                        }
                    }
                    A0t.clear();
                    A0t.putAll(A0t2);
                    A0t2.clear();
                }
                map = A0t;
            }
        }
        return map.keySet();
    }

    public C158107jR(Context context) {
        this.A01 = context.getApplicationContext();
        this.A02 = A00(context);
    }

    public static File A00(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null && !TextUtils.isEmpty(applicationInfo.dataDir)) {
            return AnonymousClass002.A0B(applicationInfo.dataDir);
        }
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            return cacheDir.getParentFile();
        }
        throw AnonymousClass001.A0e("Path Factory initialised without a valid path");
    }

    public File A01(Pair pair) {
        File file;
        switch (C18280x3.A03(pair)) {
            case -1:
                throw AnonymousClass001.A0e("Invalid source path");
            case 0:
            case 1:
                file = this.A02;
                break;
            case 2:
                file = this.A01.getFilesDir();
                break;
            case 3:
                file = this.A01.getCacheDir();
                break;
            case 4:
                file = this.A01.getExternalFilesDir((String) null);
                break;
            case 5:
                file = this.A01.getExternalCacheDir();
                break;
            default:
                throw AnonymousClass001.A0c("Cask path factory cannot handle this location");
        }
        if (file == null) {
            String str = this.A00;
            if (str == null) {
                str = C18280x3.A0Y();
            }
            this.A00 = str;
            File file2 = this.A02;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("cache/tmp_invalid_path/");
            file = C18270x1.A0A(file2, str, A0o);
        }
        int A032 = C18280x3.A03(pair);
        if (A032 != 0) {
            if (A032 == 1) {
                File file3 = this.A02;
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("app_");
                return C18270x1.A0A(file3, (String) pair.second, A0o2);
            } else if (!(A032 == 2 || A032 == 3 || A032 == 4 || A032 == 5)) {
                StringBuilder A0o3 = AnonymousClass001.A0o();
                A0o3.append("Cask path factory cannot handle this location = ");
                throw AnonymousClass000.A0F((String) pair.second, A0o3);
            }
        }
        return AnonymousClass002.A0A(file, (String) pair.second);
    }
}
