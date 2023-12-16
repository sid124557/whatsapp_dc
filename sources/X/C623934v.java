package X;

import android.database.Cursor;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;

/* renamed from: X.34v  reason: invalid class name and case insensitive filesystem */
public class C623934v {
    public final C55682qk A00;
    public final AnonymousClass1RE A01;
    public final C50962j3 A02;

    public AnonymousClass33W A05(AnonymousClass33J r11, String str, String str2, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, boolean z) {
        try {
            C60642yt r4 = C60642yt.A03;
            if (!Arrays.equals(r4.A01, bArr2)) {
                r4 = C60642yt.A02;
                if (!Arrays.equals(r4.A01, bArr2)) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Incorrect operation bytes: ");
                    throw AnonymousClass000.A0I(new String(bArr2), A0o);
                }
            }
            AnonymousClass35M r3 = new AnonymousClass35M(r4, r11, str2, bArr, bArr3, i);
            C56822sc A002 = this.A02.A00(r3.A06[0]);
            if (A002 != null && A002.A0C()) {
                AnonymousClass33W A022 = A002.A02(r3, str, z);
                if (A022 != null) {
                    A022.A02 = r3.A05;
                }
                return A022;
            }
        } catch (C377523w | AnonymousClass6u5 | IllegalArgumentException | JSONException e) {
            Log.e("sync-mutation/from-key-value couldn't create sync action data", e);
        }
        return null;
    }

    public static final AnonymousClass33J A00(Cursor cursor) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("device_id");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("epoch");
        if (cursor.isNull(columnIndexOrThrow) || cursor.isNull(columnIndexOrThrow2)) {
            return null;
        }
        return new AnonymousClass33J(cursor.getInt(columnIndexOrThrow), cursor.getInt(columnIndexOrThrow2));
    }

    public static final void A01(C56862sg r5, String[] strArr) {
        C626936e.A0B(r5.A00.inTransaction());
        C71923ct A002 = C71923ct.A00(strArr);
        while (A002.hasNext()) {
            String[] A012 = C71923ct.A01(A002);
            int length = A012.length;
            StringBuilder A0o = AnonymousClass001.A0o();
            C18270x1.A1A("DELETE FROM pending_mutations WHERE _id IN ( ", A0o, length);
            r5.A0I(AnonymousClass000.A0X(" )", A0o), "SyncdMutationsStore.deletePendingMutations", A012);
        }
    }

    public static final void A02(C56862sg r5, String[] strArr) {
        C626936e.A0B(r5.A00.inTransaction());
        C71923ct A002 = C71923ct.A00(strArr);
        while (A002.hasNext()) {
            String[] A012 = C71923ct.A01(A002);
            int length = A012.length;
            StringBuilder A0o = AnonymousClass001.A0o();
            C57212tH.A02("DELETE FROM syncd_mutations WHERE mutation_index IN ", A0o, length);
            r5.A0I(A0o.toString(), "SyncdMutationsStore.deleteStoredMutations", A012);
        }
    }

    public final AnonymousClass33W A03(Cursor cursor) {
        boolean A1T = AnonymousClass000.A1T((AnonymousClass0x2.A0C(cursor, "are_dependencies_missing") > 1 ? 1 : (AnonymousClass0x2.A0C(cursor, "are_dependencies_missing") == 1 ? 0 : -1)));
        String A0Z = AnonymousClass0x2.A0Z(cursor, "_id");
        return A05(A00(cursor), A0Z, AnonymousClass0x2.A0Z(cursor, "mutation_index"), C18280x3.A1Z(cursor, "mutation_value"), C18280x3.A1Z(cursor, "operation"), (byte[]) null, AnonymousClass0x2.A04(cursor, "mutation_version"), A1T);
    }

    public final AnonymousClass33W A04(Cursor cursor) {
        boolean A1T = AnonymousClass000.A1T((AnonymousClass0x2.A0C(cursor, "are_dependencies_missing") > 1 ? 1 : (AnonymousClass0x2.A0C(cursor, "are_dependencies_missing") == 1 ? 0 : -1)));
        AnonymousClass33J A002 = A00(cursor);
        C626936e.A06(A002);
        return A05(A002, (String) null, AnonymousClass0x2.A0Z(cursor, "mutation_index"), C18280x3.A1Z(cursor, "mutation_value"), C60642yt.A03.A01, C18280x3.A1Z(cursor, "mutation_mac"), AnonymousClass0x2.A04(cursor, "mutation_version"), A1T);
    }

    public final void A0D(C56862sg r7, AnonymousClass33J r8, C95814uZ r9, String str, String str2, String str3, byte[] bArr, byte[] bArr2, int i, boolean z) {
        byte[] bArr3 = r8.A00;
        if (C18290x4.A07(bArr3, bArr3[2], 2) == 0) {
            this.A00.A0A("syncdMutationStore/insertOrReplaceMutation unexpected key", true, AnonymousClass000.A0P(r8, "keyId=", AnonymousClass001.A0o()));
        }
        C56702sQ A0G = r7.A0G("INSERT OR REPLACE INTO syncd_mutations (mutation_index, mutation_value, mutation_version, collection_name, are_dependencies_missing, device_id, epoch, mutation_mac, chat_jid, mutation_name) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", "SyncdMutationsTable.INSERT_OR_REPLACE");
        A0G.A02();
        A0G.A07(1, str);
        if (bArr == null) {
            A0G.A05(2);
        } else {
            A0G.A08(2, bArr);
        }
        A0G.A06(3, (long) i);
        A0G.A07(4, str2);
        A0G.A06(5, C18290x4.A09(z ? 1 : 0));
        A0G.A06(6, (long) r8.A00());
        A0G.A06(7, (long) C18290x4.A07(bArr3, bArr3[2], 2));
        A0G.A08(8, bArr2);
        if (r9 == null) {
            A0G.A05(9);
        } else {
            A0G.A07(9, r9.getRawString());
        }
        A0G.A07(10, str3);
        if (A0G.A01() == -1) {
            Log.e("SyncdMutationsStore/insertOrReplaceMutation was unsuccessful");
        }
    }

    public final void A0E(C56862sg r17, Collection collection) {
        byte[] A0F;
        C95814uZ r8;
        C56862sg r6 = r17;
        C626936e.A0B(r6.A00.inTransaction());
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass33W A0K = C18320x8.A0K(it);
            C60642yt r2 = A0K.A05;
            if (r2 == C60642yt.A03) {
                A0s.add(A0K);
            } else if (r2 == C60642yt.A02) {
                A0s2.add(A0K);
            } else {
                throw AnonymousClass000.A0H(r2, "Incorrect operation: ", AnonymousClass001.A0o());
            }
        }
        A02(r6, AnonymousClass34E.A02(A0s2));
        Iterator it2 = A0s.iterator();
        while (it2.hasNext()) {
            AnonymousClass33W A0K2 = C18320x8.A0K(it2);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("SyncdMutationsStore/addSyncMutations collection=");
            String str = A0K2.A06;
            A0o.append(str);
            A0o.append("; keyId=");
            C18260x0.A0m(A0K2.A00, A0o);
            String A08 = A0K2.A08();
            AnonymousClass1EO A07 = A0K2.A07();
            if (A07 == null) {
                A0F = null;
            } else {
                A0F = A07.A0F();
            }
            int i = A0K2.A03;
            boolean A0B = A0K2.A0B();
            AnonymousClass33J r7 = A0K2.A00;
            C626936e.A06(r7);
            byte[] bArr = A0K2.A02;
            C626936e.A06(bArr);
            if (A0K2 instanceof C837649r) {
                r8 = ((C837649r) A0K2).getChatJid();
            } else {
                r8 = null;
            }
            A0D(r6, r7, r8, A08, str, A0K2.A09(), A0F, bArr, i, A0B);
        }
    }

    public void A0F(AnonymousClass33W r7) {
        C69833Yo Axl;
        C85284Fq A0C = this.A01.A0C();
        try {
            Axl = A0C.Axl();
            C56862sg r3 = ((AnonymousClass3H0) A0C).A03;
            String[] A1Y = AnonymousClass0x9.A1Y();
            A1Y[0] = r7.A07;
            A01(r3, A1Y);
            Axl.A00();
            Axl.close();
            A0C.close();
            return;
        } catch (Throwable th) {
            try {
                A0C.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A0G(Collection collection) {
        C69833Yo Axl;
        C85284Fq A0C = this.A01.A0C();
        try {
            Axl = A0C.Axl();
            A0I(A0C(collection));
            Axl.A00();
            Axl.close();
            A0C.close();
            return;
        } catch (Throwable th) {
            try {
                A0C.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A0H(Collection collection) {
        C69833Yo Axl;
        C85284Fq A0C = this.A01.A0C();
        try {
            Axl = A0C.Axl();
            A0E(((AnonymousClass3H0) A0C).A03, collection);
            Axl.A00();
            Axl.close();
            A0C.close();
            return;
        } catch (Throwable th) {
            try {
                A0C.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public boolean A0K(Set set) {
        C56862sg BEc = this.A01.BEc();
        int size = set.size();
        StringBuilder A0o = AnonymousClass001.A0o();
        C57212tH.A02("SELECT _id FROM syncd_mutations WHERE collection_name IN ", A0o, size);
        Cursor A0E = BEc.A0E(AnonymousClass000.A0X(" LIMIT 1", A0o), "SyncdMutationsTable.buildSelectAnyMutationFromAnyCollection", (String[]) set.toArray(C58152un.A0N));
        try {
            boolean z = false;
            if (A0E.moveToNext() && AnonymousClass0x2.A0Z(A0E, "_id") != null) {
                z = true;
            }
            A0E.close();
            return z;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public C623934v(C55682qk r1, AnonymousClass1RE r2, C50962j3 r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public AnonymousClass33W A06(String str) {
        Cursor A0E;
        AnonymousClass4GK A012 = C18630y0.A01(this);
        try {
            A0E = ((AnonymousClass3H0) A012).A03.A0E("SELECT _id, mutation_index, mutation_value, mutation_version, operation, device_id, epoch, are_dependencies_missing FROM pending_mutations WHERE mutation_index = ?", "PendingMutationsTable.SELECT_BY_KEY", C18270x1.A1b(str));
            if (!A0E.moveToNext()) {
                A0E.close();
                A012.close();
                return null;
            }
            AnonymousClass33W A03 = A03(A0E);
            A0E.close();
            A012.close();
            return A03;
        } catch (Throwable th) {
            try {
                A012.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public AnonymousClass33W A07(String str) {
        Cursor A0E;
        AnonymousClass4GK A012 = C18630y0.A01(this);
        try {
            A0E = ((AnonymousClass3H0) A012).A03.A0E("SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE mutation_index = ? ", "SyncdMutationsTable.SELECT_MUTATION_WITH_INDEX", C18270x1.A1b(str));
            if (!A0E.moveToNext()) {
                A0E.close();
                A012.close();
                return null;
            }
            AnonymousClass33W A04 = A04(A0E);
            A0E.close();
            A012.close();
            return A04;
        } catch (Throwable th) {
            try {
                A012.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public final List A08(C837949u r5, String str, String str2, String[] strArr) {
        Cursor A03;
        AnonymousClass33W A04;
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass4GK A012 = C18630y0.A01(this);
        try {
            A03 = C56862sg.A03(A012, str, str2, strArr);
            while (A03.moveToNext()) {
                if (r5.B23(AnonymousClass0x2.A0Z(A03, "mutation_index")) && (A04 = A04(A03)) != null) {
                    A0s.add(A04);
                }
            }
            A03.close();
            A012.close();
            return A0s;
        } catch (Throwable th) {
            try {
                A012.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public List A09(C95814uZ r8, Set set, boolean z) {
        String obj;
        String str;
        Cursor A0E;
        AnonymousClass33W r0;
        ArrayList A0s = AnonymousClass001.A0s();
        if (set.isEmpty()) {
            return A0s;
        }
        ArrayList A0s2 = AnonymousClass001.A0s();
        A0s2.add(r8.getRawString());
        A0s2.addAll(set);
        AnonymousClass4GK A012 = C18630y0.A01(this);
        try {
            C56862sg r4 = ((AnonymousClass3H0) A012).A03;
            if (z) {
                int size = set.size();
                StringBuilder A0o = AnonymousClass001.A0o();
                C57212tH.A02("SELECT _id, mutation_index, mutation_value, mutation_version, operation, device_id, epoch, are_dependencies_missing FROM pending_mutations WHERE chat_jid = ?  AND mutation_name IN ", A0o, size);
                obj = A0o.toString();
            } else {
                int size2 = set.size();
                StringBuilder A0o2 = AnonymousClass001.A0o();
                C57212tH.A02("SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE chat_jid = ?  AND mutation_name IN ", A0o2, size2);
                obj = A0o2.toString();
            }
            String[] strArr = (String[]) A0s2.toArray(C58152un.A0N);
            if (z) {
                str = "PendingMutationsTable.buildSelectMutationsByChatIdAndMutationNames";
            } else {
                str = "SyncdMutationsTable.buildSelectMutationsByChatIdAndMutationNames";
            }
            A0E = r4.A0E(obj, str, strArr);
            while (A0E.moveToNext()) {
                if (z) {
                    r0 = A03(A0E);
                } else {
                    r0 = A04(A0E);
                }
                if (r0 != null) {
                    A0s.add(r0);
                }
            }
            A0E.close();
            A012.close();
            return A0s;
        } catch (Throwable th) {
            try {
                A012.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public final List A0A(String str, boolean z) {
        String str2;
        Cursor A0E;
        AnonymousClass33W r0;
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass4GK A012 = C18630y0.A01(this);
        try {
            C56862sg r3 = ((AnonymousClass3H0) A012).A03;
            if (z) {
                str2 = "SELECT _id, mutation_index, mutation_value, mutation_version, operation, device_id, epoch, are_dependencies_missing FROM pending_mutations WHERE mutation_name = ?";
            } else {
                str2 = "SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE mutation_name = ?";
            }
            A0E = r3.A0E(str2, "syncd_mutations.SELECT_MUTATIONS_BY_MUTATION_NAME", C18270x1.A1b(str));
            while (A0E.moveToNext()) {
                if (z) {
                    r0 = A03(A0E);
                } else {
                    r0 = A04(A0E);
                }
                if (r0 != null) {
                    A0s.add(r0);
                }
            }
            A0E.close();
            A012.close();
            return A0s;
        } catch (Throwable th) {
            try {
                A012.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public List A0B(Set set, int i) {
        Cursor A0E;
        ArrayList A0J = AnonymousClass002.A0J(set);
        AnonymousClass0x7.A1I(A0J, i);
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass4GK A012 = C18630y0.A01(this);
        try {
            C56862sg r4 = ((AnonymousClass3H0) A012).A03;
            int size = set.size();
            StringBuilder A0o = AnonymousClass001.A0o();
            C57212tH.A02("SELECT _id, mutation_index, mutation_value, mutation_version, operation, device_id, epoch, are_dependencies_missing FROM pending_mutations WHERE collection_name IN ", A0o, size);
            A0o.append(" OR ");
            A0o.append("collection_name");
            A0o.append(" IS NULL  ORDER BY ");
            A0o.append("_id");
            A0E = r4.A0E(AnonymousClass000.A0X(" ASC  LIMIT ?", A0o), "PendingMutationsTable.buildSelectMutationsByCollections", (String[]) A0J.toArray(C58152un.A0N));
            while (A0E.moveToNext()) {
                A0s.add(A03(A0E));
            }
            A0E.close();
            A012.close();
            return A0s;
        } catch (Throwable th) {
            try {
                A012.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public Set A0C(Collection collection) {
        C69833Yo Axl;
        boolean z;
        byte[] bArr;
        byte[] bArr2;
        HashSet A0K = AnonymousClass002.A0K();
        C85284Fq A0C = this.A01.A0C();
        try {
            Axl = A0C.Axl();
            C56702sQ A0G = ((AnonymousClass3H0) A0C).A03.A0G("INSERT OR REPLACE INTO pending_mutations (mutation_index, mutation_value, mutation_version, operation, device_id, epoch, is_ready_to_sync, collection_name, are_dependencies_missing, mutation_name, chat_jid) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", "PendingMutationsTable.INSERT_OR_REPLACE");
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                AnonymousClass33W A0K2 = C18320x8.A0K(it);
                C50962j3 r4 = this.A02;
                String A09 = A0K2.A09();
                C162457s7.A0J(A09, 0);
                C56822sc A002 = r4.A00(A09);
                if (A002 != null) {
                    z = A002.A0C();
                } else {
                    z = false;
                }
                if (z) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("SyncdMutationsStore/addOrUpdatePendingMutationsNotReadyToSync collection=");
                    String str = A0K2.A06;
                    A0o.append(str);
                    A0o.append("; keyId");
                    C18260x0.A0m(A0K2.A00, A0o);
                    A0G.A02();
                    A0G.A07(1, A0K2.A08());
                    AnonymousClass1EO A07 = A0K2.A07();
                    if (A07 == null) {
                        bArr = null;
                    } else {
                        bArr = A07.A0F();
                    }
                    if (bArr != null) {
                        AnonymousClass1EO A072 = A0K2.A07();
                        if (A072 == null) {
                            bArr2 = null;
                        } else {
                            bArr2 = A072.A0F();
                        }
                        A0G.A08(2, bArr2);
                    } else {
                        A0G.A05(2);
                    }
                    A0G.A06(3, (long) A0K2.A03);
                    A0G.A08(4, A0K2.A05.A01);
                    AnonymousClass33J r0 = A0K2.A00;
                    if (r0 == null) {
                        A0G.A05(5);
                        A0G.A05(6);
                    } else {
                        A0G.A06(5, (long) r0.A00());
                        byte[] bArr3 = A0K2.A00.A00;
                        A0G.A06(6, (long) C18290x4.A07(bArr3, bArr3[2], 2));
                    }
                    long j = 0;
                    A0G.A06(7, 0);
                    A0G.A07(8, str);
                    if (A0K2.A0B()) {
                        j = 1;
                    }
                    A0G.A06(9, j);
                    A0G.A07(10, A0K2.A09());
                    if (A0K2 instanceof C837649r) {
                        A0G.A07(11, ((C837649r) A0K2).getChatJid().getRawString());
                    } else {
                        A0G.A05(11);
                    }
                    C18280x3.A1K(A0K, A0G.A01());
                }
            }
            Axl.A00();
            Axl.close();
            A0C.close();
            return A0K;
        } catch (Throwable th) {
            try {
                A0C.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A0I(Set set) {
        C69833Yo Axl;
        if (!set.isEmpty()) {
            C85284Fq A0C = this.A01.A0C();
            try {
                Axl = A0C.Axl();
                C71923ct A002 = C71923ct.A00((String[]) set.toArray(C58152un.A0N));
                while (A002.hasNext()) {
                    String[] A012 = C71923ct.A01(A002);
                    C56862sg r3 = ((AnonymousClass3H0) A0C).A03;
                    int length = A012.length;
                    StringBuilder A0o = AnonymousClass001.A0o();
                    C18270x1.A1A("UPDATE pending_mutations SET is_ready_to_sync = 1 WHERE _id IN ( ", A0o, length);
                    r3.A0I(AnonymousClass000.A0X(" )", A0o), "SyncdMutationsStore.markPendingMutationsReadyToSync", A012);
                }
                Axl.A00();
                Axl.close();
                A0C.close();
                return;
            } catch (Throwable th) {
                try {
                    A0C.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } else {
            return;
        }
        throw th;
    }

    public boolean A0J() {
        Cursor A012;
        AnonymousClass4GK A013 = C18630y0.A01(this);
        try {
            A012 = C56862sg.A01(((AnonymousClass3H0) A013).A03, "SELECT _id FROM syncd_mutations LIMIT 1", "SyncdMutationsTable.SELECT_ANY_MUTATION");
            boolean z = false;
            if (A012.moveToNext() && AnonymousClass0x2.A0Z(A012, "_id") != null) {
                z = true;
            }
            A012.close();
            A013.close();
            return z;
        } catch (Throwable th) {
            try {
                A013.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }
}
