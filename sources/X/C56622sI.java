package X;

import android.database.Cursor;
import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.2sI  reason: invalid class name and case insensitive filesystem */
public class C56622sI {
    public final Map A00 = AnonymousClass001.A0t();
    public final Map A01 = C18320x8.A0r();
    public final Map A02 = AnonymousClass001.A0t();
    public final Map A03 = AnonymousClass001.A0t();
    public final Map A04 = AnonymousClass001.A0t();

    public void A08(C56862sg r14, String str) {
        String replaceAll;
        Cursor A012;
        TreeMap treeMap = new TreeMap(new AnonymousClass4IU(15));
        treeMap.putAll(this.A04);
        TreeMap treeMap2 = new TreeMap(new AnonymousClass4IU(15));
        try {
            A012 = C56862sg.A01(r14, "select name, sql from sqlite_master where type='trigger';", "GET_TRIGGER_SQL");
            int columnIndexOrThrow = A012.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            int columnIndexOrThrow2 = A012.getColumnIndexOrThrow("sql");
            while (A012.moveToNext()) {
                treeMap2.put(A012.getString(columnIndexOrThrow), A012.getString(columnIndexOrThrow2));
            }
            A012.close();
        } catch (Exception e) {
            Log.e("schema-registry/scanExistingTriggers", e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        Iterator A0u = AnonymousClass001.A0u(treeMap2);
        while (A0u.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0u);
            Object key = A0w.getKey();
            String A0e = C18320x8.A0e(key, treeMap);
            if (A0e != null) {
                String A12 = AnonymousClass0x9.A12(A0w);
                String replaceAll2 = A0e.toLowerCase(Locale.getDefault()).replaceAll("\\s*", "");
                if (A12 == null) {
                    replaceAll = null;
                } else {
                    replaceAll = A12.toLowerCase(Locale.getDefault()).replaceAll("\\s*", "");
                }
                if (replaceAll2.equalsIgnoreCase(replaceAll)) {
                    A0s2.add(key);
                }
            }
            A0s.add(String.format("DROP TRIGGER %s;", new Object[]{key}));
        }
        Iterator it = A0s2.iterator();
        while (it.hasNext()) {
            treeMap.remove(it.next());
        }
        Iterator A0u2 = AnonymousClass001.A0u(treeMap);
        while (A0u2.hasNext()) {
            A0s.add(AnonymousClass0x2.A0W(A0u2));
        }
        Iterator it2 = A0s.iterator();
        while (it2.hasNext()) {
            r14.A0H(AnonymousClass001.A0m(it2), AnonymousClass000.A0X("/schema-registry/createTriggers", AnonymousClass000.A0l(str)));
        }
        return;
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r4.A03.containsKey(r6) != false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(X.C838049v r5, java.lang.String r6) {
        /*
            r4 = this;
            java.util.Map r3 = r4.A02
            boolean r0 = r3.containsKey(r6)
            if (r0 != 0) goto L_0x0011
            java.util.Map r0 = r4.A03
            boolean r0 = r0.containsKey(r6)
            r2 = 1
            if (r0 == 0) goto L_0x0012
        L_0x0011:
            r2 = 0
        L_0x0012:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r6)
            java.lang.String r0 = " table alread registered"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            X.C626936e.A0D(r2, r0)
            r3.put(r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56622sI.A09(X.49v, java.lang.String):void");
    }

    public void A0A(String str, String str2) {
        if (this.A00.put(str, str2) != null) {
            StringBuilder A0l = AnonymousClass000.A0l(str);
            A0l.append(" index already registered");
            C18270x1.A0z(A0l);
        }
    }

    public void A0B(String str, String str2) {
        if (this.A01.put(str, str2) != null) {
            StringBuilder A0l = AnonymousClass000.A0l(str);
            A0l.append(" index already registered");
            C18270x1.A0z(A0l);
        }
    }

    public void A0C(String str, String str2) {
        if (this.A04.put(str, str2) != null) {
            StringBuilder A0l = AnonymousClass000.A0l(str);
            A0l.append(" trigger already registered");
            C18270x1.A0z(A0l);
        }
    }

    public void A0D(String str, List list, List list2) {
        if (this.A03.put(str, new C41502Km(list, list2)) != null) {
            StringBuilder A0l = AnonymousClass000.A0l(str);
            A0l.append(" table already registered");
            C18270x1.A0z(A0l);
        }
    }

    public static void A00(C56622sI r2, String str) {
        Pair A002 = C57222tI.A00("message", str, "message_row_id=old._id");
        r2.A0C((String) A002.first, (String) A002.second);
    }

    public static void A01(C56622sI r2, String str) {
        Pair A002 = C57222tI.A00("message_quoted", str, "message_row_id=old.message_row_id");
        r2.A0C((String) A002.first, (String) A002.second);
    }

    public static void A02(C56622sI r2, String str) {
        Pair A002 = C57222tI.A00("message_system", str, "message_row_id=old.message_row_id");
        r2.A0C((String) A002.first, (String) A002.second);
    }

    public static void A03(C56622sI r2, String str, String str2, String str3) {
        Pair A002 = C57222tI.A00(str, str2, str3);
        r2.A0C((String) A002.first, (String) A002.second);
    }

    public static void A04(C56622sI r2, String str, String str2, String str3) {
        Pair A002 = C57222tI.A00(str, str2, str3);
        C162457s7.A0H(A002);
        r2.A0C((String) A002.first, (String) A002.second);
    }

    public static void A05(C56622sI r2, String str, String str2, String str3) {
        Pair A002 = C57222tI.A00(str, str2, str3);
        r2.A0C((String) A002.first, (String) A002.second);
    }

    public void A06(C56862sg r5, C41492Kl r6) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("schema-registry/createTables/generated tables: ");
        Map map = this.A03;
        C18260x0.A1F(A0o, map.size());
        Iterator A0q = AnonymousClass000.A0q(this.A02);
        while (A0q.hasNext()) {
            ((C838049v) AnonymousClass0x2.A0W(A0q)).B17(r5, r6);
        }
        Iterator A0q2 = AnonymousClass000.A0q(map);
        while (A0q2.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q2);
            C41502Km r0 = (C41502Km) A0w.getValue();
            C626235v.A06(r5, C18310x6.A0q(A0w), r0.A00, r0.A01);
        }
    }

    public void A07(C56862sg r5, String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("schema-registry/createIndexes/generated: ");
        Map map = this.A01;
        C18260x0.A1F(A0o, map.size());
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            r5.A0H((String) AnonymousClass0x2.A0W(A0q), AnonymousClass000.A0X("/schema-registry/createIndexes", AnonymousClass000.A0l(str)));
        }
    }

    public /* synthetic */ void A0E(String str, C59422wt... r4) {
        A0D(str, Arrays.asList(r4), Collections.emptyList());
    }
}
