package X;

import android.database.Cursor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.339  reason: invalid class name */
public class AnonymousClass339 {
    public static final byte[] A0D = "WhatsApp Patch Integrity".getBytes(C58152un.A0D);
    public final C55682qk A00;
    public final C56972sr A01;
    public final C66663Mh A02;
    public final C64663Ek A03;
    public final C613730l A04;
    public final C58442vG A05;
    public final C56792sZ A06;
    public final C56612sH A07;
    public final AnonymousClass34c A08;
    public final C56272ri A09;
    public final C623934v A0A;
    public final AnonymousClass1VX A0B;
    public final AnonymousClass4FS A0C;

    public static byte[] A00(List list, byte[] bArr, byte[] bArr2, boolean z) {
        int i;
        C626936e.A0E(AnonymousClass000.A1U(bArr.length, 128), "Current hash array must be of size 128");
        byte[] bArr3 = new byte[128];
        System.arraycopy(bArr, 0, bArr3, 0, 128);
        ByteBuffer wrap = ByteBuffer.wrap(bArr3);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        for (Object next : list) {
            C626936e.A06(next);
            ByteBuffer wrap2 = ByteBuffer.wrap(AnonymousClass31Q.A00((byte[]) next, bArr2, 128));
            wrap2.order(ByteOrder.LITTLE_ENDIAN);
            wrap.mark();
            while (wrap.hasRemaining()) {
                int position = wrap.position();
                short s = wrap.getShort() & 65535;
                short s2 = wrap2.getShort() & 65535;
                if (z) {
                    i = s + s2;
                } else {
                    i = s - s2;
                }
                int position2 = wrap.position();
                wrap.position(position);
                wrap.putShort((short) (((short) i) & 65535));
                wrap.position(position2);
            }
            wrap.reset();
        }
        return wrap.array();
    }

    public final String A01(byte[] bArr) {
        if (bArr == null) {
            return "NULL";
        }
        String A062 = C627236i.A06(bArr);
        int length = A062.length();
        if (length <= 16 || this.A0B.A0Y(C58422vE.A02, 624)) {
            return A062;
        }
        return A062.substring(length - 16);
    }

    public final void A02(int i, String str) {
        Cursor A012;
        Cursor A013;
        C56272ri r0 = this.A09;
        HashMap A0t = AnonymousClass001.A0t();
        AnonymousClass4GK A0B2 = r0.A00.get();
        try {
            A012 = C56862sg.A01(((AnonymousClass3H0) A0B2).A03, "SELECT collection_name, lt_hash FROM collection_versions", "CollectionVersionsTable.GET_ALL_LT_HASHES");
            while (A012.moveToNext()) {
                String A0Z = AnonymousClass0x2.A0Z(A012, "collection_name");
                byte[] A1Z = C18280x3.A1Z(A012, "lt_hash");
                if (A1Z == null) {
                    A1Z = new byte[128];
                }
                A0t.put(A0Z, A1Z);
            }
            A012.close();
            A0B2.close();
            C623934v r02 = this.A0A;
            HashMap A0t2 = AnonymousClass001.A0t();
            AnonymousClass4GK A014 = C18630y0.A01(r02);
            try {
                A013 = C56862sg.A01(((AnonymousClass3H0) A014).A03, "SELECT collection_name, mutation_mac FROM syncd_mutations", "SyncdMutationsStore.SELECT_COLLECTION_NAME_AND_MUTATION_MAC");
                int columnIndexOrThrow = A013.getColumnIndexOrThrow("collection_name");
                int columnIndexOrThrow2 = A013.getColumnIndexOrThrow("mutation_mac");
                while (A013.moveToNext()) {
                    String string = A013.getString(columnIndexOrThrow);
                    C18280x3.A0k(string, A0t2).add(A013.getBlob(columnIndexOrThrow2));
                }
                A013.close();
                A014.close();
                HashSet A0K = AnonymousClass002.A0K();
                if (str == null) {
                    A0K.addAll(A0t.keySet());
                    A0K.addAll(A0t2.keySet());
                } else {
                    A0K.add(str);
                }
                Iterator it = A0K.iterator();
                while (it.hasNext()) {
                    String A0m = AnonymousClass001.A0m(it);
                    List list = (List) A0t2.get(A0m);
                    if (list == null) {
                        list = Collections.emptyList();
                    }
                    byte[] A002 = A00(list, new byte[128], A0D, true);
                    byte[] bArr = (byte[]) A0t.get(A0m);
                    if (!Arrays.equals(A002, bArr)) {
                        this.A03.A08(i, A0m);
                    }
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("SyncEncryptionHelper/checkLtHashConsistency collection=");
                    A0o.append(A0m);
                    A0o.append("\nltHashFromMutations: ");
                    A0o.append(A01(A002));
                    A0o.append("\nltHashFromDb: ");
                    C18260x0.A1J(A0o, A01(bArr));
                }
                return;
            } catch (Throwable th) {
                th = th;
                try {
                    A014.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
            throw th;
            throw th;
        } catch (Throwable th3) {
            th = th3;
            A0B2.close();
            throw th;
        }
    }

    public final byte[] A03(AnonymousClass2S5 r12, String str, StringBuilder sb, List list, Map map, Set set, byte[] bArr, String[] strArr) {
        String str2;
        Cursor A0E;
        C623934v r1 = this.A0A;
        HashMap A0t = AnonymousClass001.A0t();
        String[] strArr2 = strArr;
        if (strArr2.length != 0) {
            ArrayList A0s = AnonymousClass001.A0s();
            AnonymousClass4GK A012 = C18630y0.A01(r1);
            try {
                C71923ct r7 = new C71923ct(strArr2, 975);
                while (r7.hasNext()) {
                    String[] A013 = C71923ct.A01(r7);
                    A0s.clear();
                    A0s.add(str);
                    A0s.addAll(Arrays.asList(A013));
                    C56862sg r3 = ((AnonymousClass3H0) A012).A03;
                    int length = A013.length;
                    StringBuilder A0o = AnonymousClass001.A0o();
                    C57212tH.A02("SELECT mutation_index, mutation_mac FROM syncd_mutations WHERE collection_name = ? AND mutation_index IN ", A0o, length);
                    A0E = r3.A0E(A0o.toString(), "SyncdMutationsStore.getMutationsMac", (String[]) A0s.toArray(C58152un.A0N));
                    int columnIndexOrThrow = A0E.getColumnIndexOrThrow("mutation_index");
                    int columnIndexOrThrow2 = A0E.getColumnIndexOrThrow("mutation_mac");
                    while (A0E.moveToNext()) {
                        String string = A0E.getString(columnIndexOrThrow);
                        byte[] blob = A0E.getBlob(columnIndexOrThrow2);
                        if (blob != null) {
                            A0t.put(string, blob);
                        } else {
                            C18260x0.A0r("SyncdMutationsStore/getLatestMutationsMac: Should never be null for index:", string, AnonymousClass001.A0o());
                        }
                    }
                    A0E.close();
                }
                A012.close();
            } catch (Throwable th) {
                try {
                    A012.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        if (this.A0B.A0Y(C58422vE.A02, 624)) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("SyncEncryptionHelper/calculateLtHash mutationIndices=");
            C18260x0.A1J(A0o2, Arrays.toString(strArr2));
        }
        HashSet A0K = AnonymousClass002.A0K();
        Set set2 = set;
        if (set != null) {
            sb.append("macsToRemove:\n");
            Iterator A0u = AnonymousClass001.A0u(A0t);
            while (A0u.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0u);
                Map map2 = map;
                if (map2.containsKey(A0w.getKey())) {
                    str2 = A01((byte[]) AnonymousClass0x7.A0k(A0w, map2));
                } else {
                    str2 = "";
                }
                StringBuilder A0l = AnonymousClass000.A0l(str2);
                A0l.append(": ");
                A0l.append(A01((byte[]) A0w.getValue()));
                String A0X = AnonymousClass000.A0X("\n", A0l);
                if (set2.contains(str2)) {
                    A0K.add(A0X);
                } else {
                    sb.append(A0X);
                }
            }
            sb.append("macsToOverwrite:\n");
            Iterator it = A0K.iterator();
            while (it.hasNext()) {
                sb.append(AnonymousClass001.A0m(it));
            }
        }
        ArrayList A0J = AnonymousClass002.A0J(A0t.values());
        byte[] bArr2 = A0D;
        byte[] bArr3 = bArr;
        byte[] A002 = A00(A0J, bArr3, bArr2, false);
        byte[] A003 = A00(list, A002, bArr2, true);
        if (r12 != null) {
            r12.A03 = bArr3;
            r12.A04 = A002;
            r12.A00 = list.size();
            r12.A02 = A0t.size() - A0K.size();
            r12.A01 = A0K.size();
        }
        StringBuilder A0o3 = AnonymousClass001.A0o();
        A0o3.append("preLtHash=");
        A0o3.append(A01(bArr3));
        A0o3.append("; newLtHash=");
        C18260x0.A1J(sb, AnonymousClass000.A0X(A01(A003), A0o3));
        return A003;
        throw th;
    }

    public AnonymousClass339(C55682qk r1, C56972sr r2, C66663Mh r3, C64663Ek r4, C613730l r5, C58442vG r6, C56792sZ r7, C56612sH r8, AnonymousClass34c r9, C56272ri r10, C623934v r11, AnonymousClass1VX r12, AnonymousClass4FS r13) {
        this.A07 = r8;
        this.A0B = r12;
        this.A00 = r1;
        this.A01 = r2;
        this.A0C = r13;
        this.A02 = r3;
        this.A06 = r7;
        this.A03 = r4;
        this.A0A = r11;
        this.A09 = r10;
        this.A08 = r9;
        this.A04 = r5;
        this.A05 = r6;
    }
}
