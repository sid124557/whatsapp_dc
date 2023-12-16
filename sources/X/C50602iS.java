package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDiskIOException;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: X.2iS  reason: invalid class name and case insensitive filesystem */
public class C50602iS {
    public final C116985rC A00;
    public final C49712gy A01;
    public final AnonymousClass0N6 A02;
    public final C64773Ex A03;
    public final C64223Cq A04;
    public final C40392Fq A05;
    public final C56542sA A06;
    public final C55062pj A07;
    public final C84474Cm A08;
    public final C55412qJ A09;
    public final C46412ba A0A;
    public final C56892sj A0B;
    public final AnonymousClass2W1 A0C;
    public final C55272q5 A0D;
    public final C56082rO A0E;
    public final C620233e A0F;
    public final C56522s7 A0G;
    public final AnonymousClass1VX A0H;
    public final C66493Lq A0I;
    public final C40532Gt A0J;
    public final C43642Sx A0K;
    public final C45342Zq A0L;
    public final AnonymousClass5UP A0M;
    public final C56842se A0N;
    public final C40712Hl A0O;
    public final C55952rB A0P;
    public final AnonymousClass4FS A0Q;

    public void A00() {
        C69833Yo Axl;
        C85284Fq A042;
        long longValue;
        Cursor A0E2;
        Long l;
        int i;
        Cursor A012;
        long j;
        this.A06.A08(false);
        C56522s7 r10 = this.A0G;
        C85284Fq A043 = r10.A01.A04();
        try {
            C69833Yo Axl2 = A043.Axl();
            try {
                C54652p4 r5 = r10.A02;
                C85284Fq A044 = r5.A01.A04();
                try {
                    Axl = A044.Axl();
                    ((AnonymousClass3H0) A044).A03.A07("user_device_info", (String) null, "CLEAR_ALL_USER_DEVICE_INFO_TABLE", (String[]) null);
                    Axl.A00();
                    Log.d("UserDeviceInfoStore/insertOrUpdateUserDeviceInfo/clearAll");
                    A044.B25(C69983Zk.A00(r5, 29));
                    Axl.close();
                    A044.close();
                    C55432qL r52 = r10.A05;
                    A044 = r52.A02.A04();
                    Axl = A044.Axl();
                    ((AnonymousClass3H0) A044).A03.A07("user_device", (String) null, "CLEAR_ALL_USER_DEVICE_TABLE", (String[]) null);
                    Axl.A00();
                    AnonymousClass2G1 r2 = r52.A04;
                    Objects.requireNonNull(r2);
                    A044.B25(C69983Zk.A00(r2, 33));
                    Axl.close();
                    A044.close();
                    Axl2.A00();
                    Axl2.close();
                    A043.close();
                    this.A0D.A02();
                    C40392Fq r22 = this.A05;
                    Log.i("BroadcastListChatStore/getBroadcastLists");
                    ArrayList A0s = AnonymousClass001.A0s();
                    try {
                        AnonymousClass4GK A032 = r22.A00.get();
                        try {
                            A012 = C56862sg.A01(((AnonymousClass3H0) A032).A03, "SELECT raw_string_jid, subject, created_timestamp FROM chat_view WHERE raw_string_jid LIKE '%@broadcast' AND (chat_view.hidden IS NULL OR hidden=0)", "GET_BROADCAST_LISTS_SQL");
                            int columnIndexOrThrow = A012.getColumnIndexOrThrow("raw_string_jid");
                            int columnIndexOrThrow2 = A012.getColumnIndexOrThrow("subject");
                            int columnIndexOrThrow3 = A012.getColumnIndexOrThrow("created_timestamp");
                            while (A012.moveToNext()) {
                                AnonymousClass1fI A002 = AnonymousClass27Y.A00(A012.getString(columnIndexOrThrow));
                                if (A002 == null) {
                                    Log.w("BroadcastListChatStore/getBroadcastLists/jid is null or invalid!");
                                } else {
                                    String string = A012.getString(columnIndexOrThrow2);
                                    if (!A012.isNull(columnIndexOrThrow3)) {
                                        j = A012.getLong(columnIndexOrThrow3);
                                    } else {
                                        j = 0;
                                    }
                                    A0s.add(new C42192Nd(A002, string, j));
                                }
                            }
                            A012.close();
                            A032.close();
                            C64773Ex r14 = this.A03;
                            Log.i("contactmanager/populateNamesFromBroadcasts");
                            Iterator it = A0s.iterator();
                            while (it.hasNext()) {
                                C42192Nd r1 = (C42192Nd) it.next();
                                r14.A05(r1.A01, r1.A02, "pn", r1.A00);
                            }
                            C55412qJ r23 = this.A09;
                            Log.i("msgstore/getPersistedGroupInfo");
                            ArrayList A0s2 = AnonymousClass001.A0s();
                            try {
                                AnonymousClass4GK A033 = r23.A05.get();
                                try {
                                    A0E2 = ((AnonymousClass3H0) A033).A03.A0E("SELECT raw_string_jid, subject, created_timestamp, ephemeral_expiration FROM chat_view WHERE raw_string_jid LIKE '%@g.us' AND (chat_view.hidden IS NULL OR chat_view.hidden = 0)", "GET_GROUP_CHAT_INFO_SQL", new String[0]);
                                    int columnIndexOrThrow4 = A0E2.getColumnIndexOrThrow("raw_string_jid");
                                    int columnIndexOrThrow5 = A0E2.getColumnIndexOrThrow("subject");
                                    int columnIndexOrThrow6 = A0E2.getColumnIndexOrThrow("created_timestamp");
                                    int columnIndexOrThrow7 = A0E2.getColumnIndexOrThrow("ephemeral_expiration");
                                    while (A0E2.moveToNext()) {
                                        String string2 = A0E2.getString(columnIndexOrThrow4);
                                        String string3 = A0E2.getString(columnIndexOrThrow5);
                                        if (!A0E2.isNull(columnIndexOrThrow6)) {
                                            l = C18280x3.A0T(A0E2, columnIndexOrThrow6);
                                        } else {
                                            l = null;
                                        }
                                        if (!A0E2.isNull(columnIndexOrThrow7)) {
                                            i = A0E2.getInt(columnIndexOrThrow7);
                                        } else {
                                            i = 0;
                                        }
                                        C27991fJ A045 = AnonymousClass34R.A04(string2);
                                        if (A045 != null) {
                                            A0s2.add(new C42842Ps(A045, l, string3, i));
                                        }
                                    }
                                    A0E2.close();
                                    A033.close();
                                    Log.i("contactmanager/populateNamesFromBroadcasts");
                                    Iterator it2 = A0s2.iterator();
                                    while (it2.hasNext()) {
                                        C42842Ps r3 = (C42842Ps) it2.next();
                                        AnonymousClass3ZH r15 = new AnonymousClass3ZH(r3.A01);
                                        String str = r3.A03;
                                        Long l2 = r3.A02;
                                        if (l2 == null) {
                                            longValue = Long.MIN_VALUE;
                                        } else {
                                            longValue = l2.longValue();
                                        }
                                        r14.A0T(r15, (UserJid) null, C60912zN.A05, str, "pn", r3.A00, 0, longValue, false, false, false, false, false, false, false, false, false, false, false);
                                    }
                                    C56892sj r24 = this.A0B;
                                    C85284Fq A046 = r24.A07.A04();
                                    try {
                                        C69833Yo Axl3 = A046.Axl();
                                        try {
                                            C620533h r4 = r24.A09;
                                            Log.i("participant-user-store/resetSentSenderKeyForAllParticipants");
                                            C85284Fq A022 = C620533h.A02(r4);
                                            try {
                                                C69833Yo Axl4 = A022.Axl();
                                                try {
                                                    C54772pG r32 = r4.A0B;
                                                    Log.i("participant-device-store/resetSentSenderKeyForAllParticipants");
                                                    ContentValues A072 = AnonymousClass0x9.A07(1);
                                                    A072.put("sent_sender_key", C18290x4.A0Z());
                                                    A042 = r32.A03.A04();
                                                    ((AnonymousClass3H0) A042).A03.A05(A072, "group_participant_device", (String) null, "resetSentSenderKeyForAllParticipants/UPDATE_GROUP_PARTICIPANT_DEVICE", (String[]) null);
                                                    A042.close();
                                                    C46412ba r33 = r4.A08;
                                                    Iterator it3 = C18310x6.A0s(r33.A04).iterator();
                                                    while (it3.hasNext()) {
                                                        C620833k A003 = r33.A00((C28011fL) it3.next());
                                                        if (A003 != null) {
                                                            r4.A0G(A003);
                                                        }
                                                    }
                                                    Axl4.A00();
                                                    Axl4.close();
                                                    A022.close();
                                                    Axl3.A00();
                                                    Axl3.close();
                                                    A046.close();
                                                    this.A07.A00();
                                                    this.A08.Bhd();
                                                    this.A0E.A02("async_init_migration_start_time");
                                                    C625835r A0N2 = AnonymousClass0x7.A0N(this.A02);
                                                    A0N2.A0G.A11(512);
                                                    if (A0N2.A0Z.A0Y(C58422vE.A02, 2660)) {
                                                        A0N2.A0j.BkM(C69983Zk.A00(A0N2, 23));
                                                        return;
                                                    }
                                                    return;
                                                } catch (Throwable th) {
                                                    Axl4.close();
                                                    throw th;
                                                }
                                            } catch (Throwable th2) {
                                                A022.close();
                                                throw th2;
                                            }
                                        } catch (Throwable th3) {
                                            Axl3.close();
                                            throw th3;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        try {
                                            A046.close();
                                            throw th;
                                        } catch (Throwable th5) {
                                            th.addSuppressed(th5);
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th6) {
                                    A033.close();
                                    throw th6;
                                }
                            } catch (SQLiteDiskIOException e) {
                                Log.e("msgstore/groupinfo/error ", e);
                            } catch (Throwable th7) {
                                th6.addSuppressed(th7);
                            }
                        } catch (Throwable th8) {
                            A032.close();
                            throw th8;
                        }
                    } catch (SQLiteDiskIOException e2) {
                        Log.e("BroadcastListChatStore/getBroadcastLists/error ", e2);
                    } catch (Throwable th9) {
                        th8.addSuppressed(th9);
                    }
                    throw th;
                    throw th;
                    throw th;
                    throw th;
                } catch (Throwable th10) {
                    A044.close();
                    throw th10;
                }
            } catch (Throwable th11) {
                Axl2.close();
                throw th11;
            }
        } catch (Throwable th12) {
            th = th12;
            A043.close();
            throw th;
        }
    }

    public void A01() {
        this.A04.A05();
        this.A0A.A04.clear();
        this.A0I.A0C(3, false);
        this.A0L.A00();
        this.A0N.A02();
        AnonymousClass4FS r2 = this.A0Q;
        r2.BkM(new C70033Zp(this, 28));
        r2.BkM(new C70033Zp(this, 29));
    }

    public C50602iS(C116985rC r2, C49712gy r3, AnonymousClass0N6 r4, C64773Ex r5, C64223Cq r6, C40392Fq r7, C56542sA r8, C55062pj r9, C84474Cm r10, C55412qJ r11, C46412ba r12, C56892sj r13, AnonymousClass2W1 r14, C55272q5 r15, C56082rO r16, C620233e r17, C56522s7 r18, AnonymousClass1VX r19, C66493Lq r20, C40532Gt r21, C43642Sx r22, C45342Zq r23, AnonymousClass5UP r24, C56842se r25, C40712Hl r26, C55952rB r27, AnonymousClass4FS r28) {
        this.A0H = r19;
        this.A0Q = r28;
        this.A06 = r8;
        this.A0F = r17;
        this.A01 = r3;
        this.A02 = r4;
        this.A0G = r18;
        this.A03 = r5;
        this.A09 = r11;
        this.A0I = r20;
        this.A0M = r24;
        this.A0K = r22;
        this.A0N = r25;
        this.A0E = r16;
        this.A04 = r6;
        this.A0L = r23;
        this.A0J = r21;
        this.A0A = r12;
        this.A00 = r2;
        this.A05 = r7;
        this.A07 = r9;
        this.A0B = r13;
        this.A0C = r14;
        this.A0P = r27;
        this.A0D = r15;
        this.A0O = r26;
        this.A08 = r10;
    }
}
