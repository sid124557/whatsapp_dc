package X;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0WF  reason: invalid class name */
public class AnonymousClass0WF {
    public final C116985rC A00;
    public final C55682qk A01;
    public final AnonymousClass310 A02;
    public final C54292oU A03;
    public final AnonymousClass33p A04;
    public final C613830m A05;
    public final AnonymousClass319 A06;
    public final AnonymousClass1VX A07;

    public static String A00(Context context, C55682qk r2, AnonymousClass310 r3, String str) {
        if (str.startsWith("_INTERNAL_FILES_") || str.startsWith("_INTERNAL_DATABASES_")) {
            return AnonymousClass0YV.A05(context, r2, str);
        }
        try {
            return r3.A07(str).getCanonicalPath();
        } catch (IOException unused) {
            return null;
        }
    }

    public long A03(C04450Oi r17, boolean z) {
        long j;
        long j2 = 0;
        if (z) {
            j = 16;
        } else {
            j = 0;
        }
        AnonymousClass33M r3 = new AnonymousClass33M();
        r3.A0A("gdrive/backup/quota/calculateBackupSize");
        int A0N = this.A07.A0N(5250);
        Long l = null;
        while (true) {
            Cursor A09 = this.A06.A09(l, A05(), (long) A0N);
            try {
                HashSet A0K = AnonymousClass002.A0K();
                int columnIndexOrThrow = A09.getColumnIndexOrThrow("file_path");
                int columnIndexOrThrow2 = A09.getColumnIndexOrThrow("message_row_id");
                Long l2 = l;
                while (A09.moveToNext()) {
                    j2 += A02(r17, A09.getString(columnIndexOrThrow), A0K, j);
                    l2 = Long.valueOf(A09.getLong(columnIndexOrThrow2));
                }
                A09.close();
                if (AnonymousClass75J.A00(l2, l)) {
                    break;
                }
                l = l2;
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
        C116985rC r2 = this.A00;
        if (r2.A07()) {
            new AnonymousClass33M().A0A("gdrive/backup/quota/calculatePremiumMessageMediaBackupSize");
            r2.A04();
            throw AnonymousClass001.A0g("getReferencedMediaPaths");
        }
        r3.A07();
        return j2;
    }

    public long A04(Set set) {
        AnonymousClass1VX r3 = this.A07;
        long A0N = ((long) r3.A0N(1239)) * SearchActionVerificationClientService.MS_TO_NS;
        return this.A06.A02(set, ((long) r3.A0N(1240)) * SearchActionVerificationClientService.MS_TO_NS, A0N);
    }

    public void A06(C04450Oi r15, AnonymousClass0YL r16, List list, List list2, Map map) {
        List list3;
        List list4;
        AnonymousClass33M r3 = new AnonymousClass33M();
        r3.A0A("gdrive/backup/quota/getMostRecentMediaList");
        Map map2 = map;
        HashSet hashSet = new HashSet(map2.keySet());
        int A0N = this.A07.A0N(5251);
        Long l = null;
        while (true) {
            HashSet A0K = AnonymousClass002.A0K();
            Cursor A09 = this.A06.A09(l, A05(), (long) A0N);
            try {
                int columnIndexOrThrow = A09.getColumnIndexOrThrow("file_path");
                int columnIndexOrThrow2 = A09.getColumnIndexOrThrow("message_row_id");
                Long l2 = l;
                while (true) {
                    list3 = list;
                    if (!A09.moveToNext()) {
                        break;
                    }
                    A08(A09.getString(columnIndexOrThrow), list3, map2, A0K, hashSet);
                    l2 = Long.valueOf(A09.getLong(columnIndexOrThrow2));
                }
                A09.close();
                list4 = list2;
                A01(r16, r3, list3, list4, A0K);
                if (AnonymousClass75J.A00(l2, l)) {
                    break;
                }
                l = l2;
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
        C116985rC r2 = this.A00;
        if (r2.A07()) {
            new AnonymousClass33M().A0A("gdrive/backup/quota/getMostRecentPremiumMessageMediaList");
            r2.A04();
            throw AnonymousClass001.A0g("getReferencedMediaPaths");
        }
        A07(r15, list4, hashSet, map2);
        r3.A07();
    }

    public final void A08(String str, List list, Map map, Set set, Set set2) {
        if (str != null) {
            AnonymousClass310 r1 = this.A02;
            File A072 = r1.A07(str);
            if (!A072.isDirectory()) {
                String A062 = AnonymousClass0YV.A06(this.A03.A06(), r1, A072);
                if (!TextUtils.isEmpty(A062)) {
                    C626936e.A06(A062);
                    if (!set.contains(A072)) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (((AnonymousClass0UO) it.next()).A06.equals(A062)) {
                                return;
                            }
                        }
                        if (set2.contains(A062) || !map.containsKey(A062)) {
                            set.add(A072);
                            set2.remove(A062);
                        }
                    }
                }
            }
        }
    }

    public AnonymousClass0WF(C116985rC r1, C55682qk r2, AnonymousClass310 r3, C54292oU r4, AnonymousClass33p r5, C613830m r6, AnonymousClass319 r7, AnonymousClass1VX r8) {
        this.A07 = r8;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A06 = r7;
        this.A04 = r5;
        this.A05 = r6;
        this.A00 = r1;
    }

    public static final void A01(AnonymousClass0YL r0, AnonymousClass33M r1, List list, List list2, Set set) {
        if (!r0.A0Q(set, list, list2)) {
            Log.e("gdrive/backup/quota/getMostRecentMediaList processing media files failed");
            r1.A07();
            throw new AnonymousClass0EH();
        }
    }

    public final long A02(C04450Oi r6, String str, Set set, long j) {
        long length;
        if (!set.add(str) || str == null) {
            return 0;
        }
        File A072 = this.A02.A07(str);
        if (A072.isDirectory() || !A072.exists()) {
            return 0;
        }
        String A022 = C06520Ya.A02(A072);
        if (!r6.A01(A022)) {
            length = A072.length();
        } else if (!r6.A00(A072, A022)) {
            return 0;
        } else {
            length = A072.length() + j;
        }
        return 0 + length;
    }

    public Set A05() {
        HashSet A0K = AnonymousClass002.A0K();
        AnonymousClass001.A1O(A0K, (byte) 2);
        AnonymousClass001.A1O(A0K, (byte) 9);
        AnonymousClass001.A1O(A0K, (byte) 26);
        AnonymousClass001.A1O(A0K, (byte) 20);
        AnonymousClass001.A1O(A0K, (byte) 13);
        AnonymousClass001.A1O(A0K, (byte) 29);
        AnonymousClass001.A1O(A0K, (byte) 1);
        AnonymousClass001.A1O(A0K, (byte) 25);
        if (this.A04.A27()) {
            AnonymousClass001.A1O(A0K, (byte) 3);
            AnonymousClass001.A1O(A0K, (byte) 28);
            AnonymousClass001.A1O(A0K, (byte) 81);
        }
        return A0K;
    }

    public void A07(C04450Oi r6, Collection collection, Collection collection2, Map map) {
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            if (map.containsKey(A0m)) {
                if (r6.A01(A00(this.A03.A06(), this.A01, this.A02, A0m))) {
                    collection.add(map.get(A0m));
                    map.remove(A0m);
                }
            }
        }
    }
}
