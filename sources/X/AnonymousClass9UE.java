package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.9UE  reason: invalid class name */
public class AnonymousClass9UE {
    public static boolean A00(AnonymousClass1VX r6, AnonymousClass4FV r7, C186568vZ r8, String str) {
        String str2;
        boolean z;
        String A0Q = r6.A0Q(1854);
        String str3 = "";
        if (A0Q != null) {
            str2 = A0Q.trim();
        } else {
            str2 = str3;
        }
        String A0Q2 = r6.A0Q(1855);
        if (A0Q2 != null) {
            str3 = A0Q2.trim();
        }
        HashSet A0K = AnonymousClass002.A0K();
        if (!TextUtils.isEmpty(str2)) {
            A0K.addAll(Arrays.asList(str2.split(",")));
        }
        HashSet A0K2 = AnonymousClass002.A0K();
        if (!TextUtils.isEmpty(str3)) {
            A0K2.addAll(Arrays.asList(str3.split(",")));
        }
        if (A0K.isEmpty() && A0K2.isEmpty()) {
            return false;
        }
        HashSet hashSet = new HashSet(A0K);
        hashSet.addAll(A0K2);
        r8.markerStart(185477621);
        r8.markerAnnotate(185477621, "categories", hashSet.toString());
        r8.markerAnnotate(185477621, "checkLocation", str);
        HashMap A0t = AnonymousClass001.A0t();
        if (!A0K.isEmpty()) {
            Iterator it = A0K.iterator();
            z = true;
            while (it.hasNext()) {
                String A0m = AnonymousClass001.A0m(it);
                try {
                    A0t.put(A0m, Boolean.valueOf(A01(A0m)));
                } catch (Exception e) {
                    Log.e((Throwable) e);
                    z = false;
                }
            }
            AnonymousClass99W r1 = new AnonymousClass99W();
            r1.A02 = str;
            r1.A01 = (Boolean) A0t.get("su_exists");
            r1.A00 = (Boolean) A0t.get("rw_paths");
            r7.BhD(r1);
        } else {
            z = true;
        }
        Iterator it2 = A0K2.iterator();
        boolean z2 = false;
        while (it2.hasNext()) {
            String A0m2 = AnonymousClass001.A0m(it2);
            if (!A0t.containsKey(A0m2) || !Boolean.TRUE.equals(A0t.get(A0m2))) {
                try {
                    if (A01(A0m2)) {
                    }
                } catch (Exception e2) {
                    Log.e((Throwable) e2);
                    z = false;
                }
            }
            z2 = true;
        }
        short s = 576;
        if (z) {
            s = 575;
        }
        r8.markerEnd(185477621, s);
        return z2;
    }

    public static boolean A01(String str) {
        BufferedReader bufferedReader;
        if (str.equals("rw_paths")) {
            return AnonymousClass9UV.A00();
        }
        if (str.equals("su_exists")) {
            Process process = null;
            try {
                Process exec = Runtime.getRuntime().exec(new String[]{"which", "su"});
                if (exec == null) {
                    return false;
                }
                try {
                    InputStreamReader inputStreamReader = new InputStreamReader(exec.getInputStream());
                    try {
                        bufferedReader = new BufferedReader(inputStreamReader);
                        boolean A1W = AnonymousClass000.A1W(bufferedReader.readLine());
                        bufferedReader.close();
                        inputStreamReader.close();
                        exec.destroy();
                        return A1W;
                    } catch (Throwable th) {
                        inputStreamReader.close();
                        throw th;
                    }
                } catch (Exception unused) {
                    exec.destroy();
                    return false;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            } catch (Throwable unused2) {
                if (process == null) {
                    return false;
                }
                process.destroy();
                return false;
            }
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Unknown check category: ");
            throw AnonymousClass000.A0F(str, A0o);
        }
        throw th;
    }
}
