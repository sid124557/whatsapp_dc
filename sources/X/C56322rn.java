package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.2rn  reason: invalid class name and case insensitive filesystem */
public class C56322rn {
    public AnonymousClass2Y5 A00;
    public final C623334p A01;
    public final C72303dV A02;
    public final AnonymousClass4FS A03;

    public C53312mt A04(String str) {
        boolean containsKey;
        C53312mt A012;
        C53312mt r0;
        if (str == null) {
            return null;
        }
        AnonymousClass2Y5 r6 = this.A00;
        HashMap hashMap = r6.A00;
        synchronized (hashMap) {
            containsKey = hashMap.containsKey(str);
        }
        if (containsKey) {
            synchronized (hashMap) {
                r0 = (C53312mt) hashMap.get(str);
            }
            return r0;
        }
        AnonymousClass4GK A032 = this.A02.get();
        try {
            Cursor A0E = ((AnonymousClass3H0) A032).A03.A0E("SELECT call_id, call_log_row_id, joinable_video_call, group_jid_row_id FROM joinable_call_log WHERE call_id = ? ", "joinable_call_log_store/GET_JOINABLE_CALL_LOG_BY_CALL_ID", C18270x1.A1b(str));
            try {
                if (!A0E.moveToLast() || (A012 = A01(A0E)) == null) {
                    synchronized (hashMap) {
                        hashMap.put(str, (Object) null);
                    }
                    A0E.close();
                    A032.close();
                    return null;
                }
                r6.A00(A012);
                A0E.close();
                A032.close();
                return A012;
            } catch (Throwable th) {
                if (A0E != null) {
                    A0E.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            try {
                A032.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public C53312mt A01(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("call_log_row_id");
        if (columnIndex == -1 || cursor.isNull(columnIndex)) {
            return null;
        }
        long j = cursor.getLong(columnIndex);
        return new C53312mt(AnonymousClass32V.A00(this.A01.A08(AnonymousClass0x2.A0C(cursor, "group_jid_row_id"))), AnonymousClass0x2.A0Z(cursor, "call_id"), j, AnonymousClass001.A1W(AnonymousClass0x2.A04(cursor, "joinable_video_call")));
    }

    public C53312mt A02(GroupJid groupJid) {
        C53312mt r0;
        HashMap hashMap = this.A00.A01;
        synchronized (hashMap) {
            r0 = (C53312mt) hashMap.get(groupJid);
        }
        return r0;
    }

    public C53312mt A03(GroupJid groupJid) {
        boolean containsKey;
        C53312mt r0;
        C53312mt r02;
        AnonymousClass2Y5 r7 = this.A00;
        HashMap hashMap = r7.A01;
        synchronized (hashMap) {
            containsKey = hashMap.containsKey(groupJid);
        }
        if (containsKey) {
            synchronized (hashMap) {
                r02 = (C53312mt) hashMap.get(groupJid);
            }
            return r02;
        }
        AnonymousClass4GK A032 = this.A02.get();
        try {
            C56862sg r4 = ((AnonymousClass3H0) A032).A03;
            String[] A1Y = AnonymousClass0x9.A1Y();
            C18260x0.A1X(A1Y, this.A01.A05(groupJid));
            Cursor A0E = r4.A0E("SELECT call_id, call_log_row_id, joinable_video_call, group_jid_row_id FROM joinable_call_log WHERE group_jid_row_id = ? ", "joinable_call_log_store/GET_JOINABLE_CALL_LOG_BY_GROUP_JID", A1Y);
            try {
                if (!A0E.moveToLast() || (r0 = A01(A0E)) == null) {
                    synchronized (hashMap) {
                        r0 = null;
                        hashMap.put(groupJid, (Object) null);
                    }
                } else {
                    r7.A00(r0);
                }
                A0E.close();
                A032.close();
                return r0;
            } catch (Throwable th) {
                if (A0E != null) {
                    A0E.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            try {
                A032.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public void A06(C53312mt r7) {
        C69833Yo Axl;
        C85284Fq A04 = this.A02.A04();
        try {
            Axl = A04.Axl();
            ((AnonymousClass3H0) A04).A03.A09("joinable_call_log", "joinable_call_log_store/insert", A00(r7));
            this.A00.A00(r7);
            r7.A02 = false;
            Axl.A00();
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("JoinableCallLogStore/insertOnCurrentThread/inserted; joinableCallLog.callId=");
            C18260x0.A1L(A0o, r7.A03);
            Axl.close();
            A04.close();
            return;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public boolean A07(GroupJid groupJid) {
        boolean containsKey;
        HashMap hashMap = this.A00.A01;
        synchronized (hashMap) {
            containsKey = hashMap.containsKey(groupJid);
        }
        return containsKey;
    }

    public C56322rn(C623334p r1, AnonymousClass2Y5 r2, C72303dV r3, AnonymousClass4FS r4) {
        this.A01 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r2;
    }

    public final ContentValues A00(C53312mt r4) {
        long j;
        ContentValues A06 = AnonymousClass0x9.A06();
        A06.put("call_log_row_id", Long.valueOf(r4.A00));
        A06.put("call_id", r4.A03);
        A06.put("joinable_video_call", Boolean.valueOf(r4.A04));
        GroupJid groupJid = r4.A01;
        if (groupJid != null) {
            j = this.A01.A05(groupJid);
        } else {
            j = 0;
        }
        A06.put("group_jid_row_id", Long.valueOf(j));
        return A06;
    }

    public List A05() {
        Cursor A012;
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass4GK A032 = this.A02.get();
        try {
            A012 = C56862sg.A01(((AnonymousClass3H0) A032).A03, "SELECT call_id, call_log_row_id, joinable_video_call, group_jid_row_id FROM joinable_call_log", "joinable_call_log_store/GET_ALL_JOINABLE_CALL_LOG");
            while (A012.moveToNext()) {
                A0s.add(C627436k.A07(AnonymousClass0x2.A0Z(A012, "call_id")));
            }
            A012.close();
            A032.close();
            return A0s;
        } catch (Throwable th) {
            try {
                A032.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }
}
