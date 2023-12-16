package X;

import android.text.TextUtils;
import android.util.JsonWriter;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: X.0Ya  reason: invalid class name and case insensitive filesystem */
public final class C06520Ya {
    public static C05580Ub A01(C04710Qi r2, AnonymousClass0Y7 r3, String str, String str2) {
        try {
            return (C05580Ub) AnonymousClass0X8.A01(new AnonymousClass0w1(r3, str, 1), r2, str2);
        } catch (AnonymousClass0EI unused) {
            return null;
        }
    }

    public static String A03(Map map) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            A07(jsonWriter, map);
            jsonWriter.close();
            return stringWriter.toString();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public static Map A05(C04710Qi r6, C05580Ub r7) {
        HashMap hashMap = new HashMap(1000);
        String str = null;
        do {
            Pair pair = (Pair) AnonymousClass0X8.A01(new C17700w0(r7, str, 0), r6, "gdrive/v2/load-files");
            if (pair == null) {
                return null;
            }
            str = (String) pair.second;
            for (AnonymousClass0UI r1 : (List) pair.first) {
                hashMap.put(r1.A01(), r1);
            }
        } while (str != null);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("gdrive/v2/load-files result ");
        Log.i(AnonymousClass000.A0h(A0o, hashMap.size()));
        return Collections.unmodifiableMap(hashMap);
    }

    public static Map A06(C04710Qi r8, C05580Ub r9, List list) {
        HashMap hashMap = new HashMap(1000);
        String str = null;
        do {
            Pair pair = (Pair) AnonymousClass0X8.A01(new C17700w0(r9, str, 1), r8, "gdrive/v2/load-files");
            if (pair == null) {
                return null;
            }
            str = (String) pair.second;
            for (AnonymousClass0UI r3 : (List) pair.first) {
                String A01 = r3.A01();
                AnonymousClass0UI r1 = (AnonymousClass0UI) hashMap.put(A01, r3);
                if (r1 != null) {
                    if (A01.equals(r3.A06)) {
                        list.add(r3);
                        hashMap.put(r1.A01(), r1);
                    } else {
                        list.add(r1);
                    }
                }
            }
        } while (str != null);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("gdrive/v2/load-files result ");
        Log.i(AnonymousClass000.A0h(A0o, hashMap.size()));
        return Collections.unmodifiableMap(hashMap);
    }

    public static boolean A0A(C16400tD r3, C04710Qi r4, AnonymousClass0Y7 r5, AnonymousClass0UI r6, File file) {
        AnonymousClass0Dy r2 = new AnonymousClass0Dy(r3, r4, r5, r6, file);
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A10(file, "restore>gdrive/restore/file ", A0o);
        Boolean bool = (Boolean) AnonymousClass0X8.A01(r2, r4, A0o.toString());
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public static boolean A0B(C04710Qi r8, C05580Ub r9, C56612sH r10, long j, long j2) {
        return AnonymousClass000.A1Y(AnonymousClass0X8.A01(new AnonymousClass0Dv(r9, r10, j, j2), r8, "gdrive/backup/files"), Boolean.TRUE);
    }

    public static boolean A0C(C04710Qi r3, AnonymousClass0Y7 r4) {
        Boolean bool = (Boolean) AnonymousClass0X8.A02(new AnonymousClass0Dp(r4), r3, "gdrive-backup-util/fetch-token", 14);
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public static boolean A0G(AnonymousClass1VX r1) {
        return r1.A0X(916);
    }

    public static boolean A0H(AnonymousClass1VX r1) {
        return r1.A0X(4775);
    }

    public static boolean A0I(AnonymousClass1VX r1) {
        return r1.A0X(6178);
    }

    public static int A00(AnonymousClass0UI r9, AnonymousClass310 r10, AnonymousClass5ZR r11, String str) {
        long j;
        String str2;
        File A0B = AnonymousClass002.A0B(str);
        if (!A0B.exists()) {
            return 1;
        }
        if (r9 == null) {
            return 2;
        }
        long length = A0B.length();
        AnonymousClass0UF r3 = r9.A02;
        if (r3 != null) {
            j = r3.A00;
        } else {
            j = r9.A00;
        }
        if (length != j) {
            return 4;
        }
        String A07 = AnonymousClass0YV.A07(r10, r11, A0B);
        if (A07 == null) {
            Log.i(AnonymousClass000.A0P(A0B, "gdrive/v2/utils/is-local-same-as-remote/md5-is-null/ ", AnonymousClass001.A0o()));
            return 1;
        }
        if (r3 != null) {
            str2 = r3.A03;
        } else {
            str2 = r9.A03;
        }
        if (A07.equals(str2)) {
            return 3;
        }
        return 4;
    }

    public static String A02(File file) {
        try {
            return file.getCanonicalPath();
        } catch (IOException e) {
            Log.e(AnonymousClass000.A0P(file, "gdrive/backup/failed to get canonical path for ", AnonymousClass001.A0o()), e);
            return null;
        }
    }

    public static List A04(Map map) {
        ArrayList A0s = AnonymousClass001.A0s();
        if (!map.isEmpty()) {
            Pattern compile = Pattern.compile("msgstore.db.crypt(\\d+)|msgstore-increment-(\\d+).db.crypt(\\d+)");
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                String A0m = AnonymousClass001.A0m(it);
                String[] split = A0m.split(File.separator);
                if (compile.matcher(split[split.length - 1]).matches()) {
                    A0s.add(map.get(A0m));
                }
            }
        }
        return A0s;
    }

    public static void A07(JsonWriter jsonWriter, Map map) {
        jsonWriter.beginObject();
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            jsonWriter.name((String) A0w.getKey());
            Object value = A0w.getValue();
            if (value instanceof Number) {
                jsonWriter.value((Number) value);
            } else if (value instanceof String) {
                jsonWriter.value((String) value);
            } else if (value instanceof Boolean) {
                jsonWriter.value(AnonymousClass001.A1Z(value));
            } else if (value instanceof Map) {
                A07(jsonWriter, (Map) value);
            } else if (value instanceof Set) {
                jsonWriter.beginArray();
                for (Object obj : ((Set) value).toArray()) {
                    jsonWriter.value((String) obj);
                }
                jsonWriter.endArray();
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Unexpected value type ");
                A0o.append(value);
                A0o.append(" for ");
                throw AnonymousClass000.A0F((String) A0w.getKey(), A0o);
            }
        }
        jsonWriter.endObject();
    }

    public static void A08(AnonymousClass0WN r2, Collection collection) {
        boolean z;
        if (r2.A0G()) {
            Iterator it = collection.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!A0D((AnonymousClass0UI) it.next())) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            r2.A0F(z);
        }
    }

    public static boolean A09(AnonymousClass0U8 r10, AnonymousClass1VX r11) {
        boolean z = r10.A01().getBoolean("_new_user", false);
        boolean A0I = A0I(r11);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("gdrive/backup/axolotlMode/result1= ");
        A0o.append(z);
        Log.i(AnonymousClass000.A0b(" & ", A0o, A0I));
        if (z && A0I) {
            return true;
        }
        long j = r10.A01().getLong("bg_gpb_eligible_timestamp", -1);
        boolean z2 = true;
        if (j != -1 && System.currentTimeMillis() <= j + 2592000000L) {
            z2 = false;
        }
        boolean A0H = A0H(r11);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("gdrive/backup/axolotlMode/result2= ");
        A0o2.append(z2);
        Log.i(AnonymousClass000.A0b(" & ", A0o2, A0H));
        if (!z2 || !A0H) {
            return false;
        }
        r10.A02();
        return true;
    }

    public static boolean A0D(AnonymousClass0UI r7) {
        for (AnonymousClass22O r3 : AnonymousClass22O.values()) {
            String str = r7.A06;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(".crypt");
            if (str.endsWith(AnonymousClass000.A0h(A0o, r3.A05()))) {
                return true;
            }
        }
        return r7.A06.endsWith(".mcrypt1");
    }

    public static boolean A0E(AnonymousClass33p r5) {
        String A0X = r5.A0X();
        if (TextUtils.isEmpty(A0X) || r5.A0R(A0X) == 0) {
            return false;
        }
        return true;
    }

    public static boolean A0F(AnonymousClass33p r2) {
        int A07 = r2.A07();
        if (A07 == 11 || A07 == 31 || A07 == 30 || A07 == 28 || A07 == 29) {
            return true;
        }
        return false;
    }
}
