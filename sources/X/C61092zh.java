package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.2zh  reason: invalid class name and case insensitive filesystem */
public class C61092zh {
    public final AnonymousClass1RI A00;

    public boolean A04(GroupJid groupJid, Collection collection) {
        Cursor A0E;
        try {
            AnonymousClass1RI r1 = this.A00;
            C85284Fq A0C = r1.A0C();
            try {
                C69833Yo Axl = A0C.Axl();
                try {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        C52882mC A0O = AnonymousClass0x7.A0O(it);
                        GroupJid groupJid2 = A0O.A02;
                        String str = A0O.A03;
                        long j = A0O.A01;
                        String rawString = groupJid2.getRawString();
                        boolean z = true;
                        String[] strArr = new String[1];
                        C18280x3.A0w(groupJid2, strArr, 0);
                        AnonymousClass4GK A0B = r1.get();
                        try {
                            A0E = ((AnonymousClass3H0) A0B).A03.A0E("SELECT subject_ts FROM subgroup_info WHERE subgroup_raw_jid = ?", "GET_TIMESTAMP_FROM_JID", strArr);
                            if (A0E.moveToFirst()) {
                                if (AnonymousClass0x2.A0C(A0E, "subject_ts") <= j) {
                                    z = false;
                                }
                                A0E.close();
                                A0B.close();
                                if (z) {
                                }
                            } else {
                                A0E.close();
                                A0B.close();
                            }
                            ContentValues A0E2 = C18290x4.A0E();
                            A0E2.put("subgroup_raw_jid", rawString);
                            A0E2.put("subject", str);
                            C18270x1.A0c(A0E2, "subject_ts", j);
                            C56862sg A01 = AnonymousClass3H0.A01(A0E2, A0C, "group_type", A0O.A00);
                            if (A01.A05(A0E2, "subgroup_info", "subgroup_raw_jid = ?", "subgroup_info.insertSubgroups", new String[]{rawString}) == 0) {
                                A01.A08("subgroup_info", "subgroup_info.insertSubgroups", A0E2);
                            }
                            ContentValues A09 = C18280x3.A09();
                            AnonymousClass0x2.A0n(A09, groupJid, "parent_raw_jid");
                            A09.put("subgroup_raw_id", rawString);
                            if (A01.A05(A09, "group_relationship", "subgroup_raw_id = ?", "group_relationship.insertSubgroups", new String[]{rawString}) == 0) {
                                A01.A08("group_relationship", "group_relationship.insertSubgroups", A09);
                            }
                        } catch (Throwable th) {
                            A0B.close();
                            throw th;
                        }
                    }
                    Axl.A00();
                    Axl.close();
                    A0C.close();
                    return true;
                    throw th;
                } catch (Throwable th2) {
                    Axl.close();
                    throw th2;
                }
            } catch (Throwable th3) {
                A0C.close();
                throw th3;
            }
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e((Throwable) e);
            return false;
        } catch (Error | RuntimeException e2) {
            Log.e(e2);
            throw e2;
        } catch (Throwable th4) {
            th3.addSuppressed(th4);
        }
    }

    public int A01(GroupJid groupJid) {
        C69833Yo Axl;
        try {
            C85284Fq A0C = this.A00.A0C();
            try {
                Axl = A0C.Axl();
                String rawString = groupJid.getRawString();
                String[] strArr = new String[1];
                C56862sg A04 = AnonymousClass3H0.A04(rawString, A0C, strArr, 0);
                A04.A07("subgroup_info", "subgroup_raw_jid = ?", "subgroup_info.removeSubgroup", strArr);
                A04.A07("group_relationship", "subgroup_raw_id = ?", "group_relationship.removeSubgroup", new String[]{rawString});
                Axl.A00();
                Axl.close();
                A0C.close();
                return 1;
            } catch (Throwable th) {
                A0C.close();
                throw th;
            }
            throw th;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e((Throwable) e);
            return -1;
        } catch (Error | RuntimeException e2) {
            Log.e(e2);
            throw e2;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public C61092zh(AnonymousClass1RI r1) {
        this.A00 = r1;
    }

    public static final C52882mC A00(Cursor cursor) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("subject");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("subject_ts");
        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("subgroup_raw_jid");
        int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("group_type");
        try {
            return new C52882mC(AnonymousClass34R.A05(cursor.getString(columnIndexOrThrow3)), cursor.getString(columnIndexOrThrow), cursor.getInt(columnIndexOrThrow4), cursor.getLong(columnIndexOrThrow2));
        } catch (AnonymousClass24P e) {
            Log.e("SubgroupStore/invalid subgroup jid", e);
            return null;
        }
    }

    public C27991fJ A02(C27991fJ r6) {
        Cursor A0E;
        try {
            AnonymousClass4GK A0B = this.A00.get();
            try {
                A0E = ((AnonymousClass3H0) A0B).A03.A0E("SELECT parent_raw_jid FROM group_relationship WHERE subgroup_raw_id = ?", "subgroupStore/getParentGroupJid", C18270x1.A1a(r6));
                if (A0E.moveToFirst()) {
                    C27991fJ A04 = AnonymousClass34R.A04(AnonymousClass0x2.A0Z(A0E, "parent_raw_jid"));
                    A0E.close();
                    A0B.close();
                    return A04;
                }
                A0E.close();
                A0B.close();
                return null;
            } catch (Throwable th) {
                A0B.close();
                throw th;
            }
            throw th;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e("subgroupStore/getParentGroupJid", e);
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public void A03(GroupJid groupJid, Collection collection) {
        Cursor A0E;
        A04(groupJid, collection);
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            A0s.add(AnonymousClass0x7.A0O(it).A02);
        }
        C27991fJ A01 = AnonymousClass34R.A01(groupJid);
        ArrayList A0s2 = AnonymousClass001.A0s();
        String[] A1Y = AnonymousClass0x9.A1Y();
        C18280x3.A0w(A01, A1Y, 0);
        AnonymousClass4GK A0B = this.A00.get();
        try {
            A0E = ((AnonymousClass3H0) A0B).A03.A0E("SELECT subgroups.subgroup_raw_jid, subject, subject_ts, group_type FROM subgroup_info subgroups INNER JOIN group_relationship relationship ON subgroups.subgroup_raw_jid = relationship.subgroup_raw_id WHERE relationship.parent_raw_jid = ?", "GET_SUBGROUPS_WITH_PARENT_JID_SQL", A1Y);
            while (A0E.moveToNext()) {
                C52882mC A002 = A00(A0E);
                if (A002 != null) {
                    A0s2.add(A002);
                }
            }
            A0E.close();
            ArrayList A0n = C18320x8.A0n(A0B);
            Iterator it2 = A0s2.iterator();
            while (it2.hasNext()) {
                A0n.add(AnonymousClass0x7.A0O(it2).A02);
            }
            Iterator it3 = A0n.iterator();
            while (it3.hasNext()) {
                GroupJid groupJid2 = (GroupJid) it3.next();
                if (!A0s.contains(groupJid2)) {
                    A01(groupJid2);
                }
            }
            return;
        } catch (Throwable th) {
            try {
                A0B.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }
}
