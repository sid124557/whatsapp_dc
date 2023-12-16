package X;

import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* renamed from: X.30s  reason: invalid class name and case insensitive filesystem */
public class C614330s {
    public final C116985rC A00;
    public final C55682qk A01;
    public final C56972sr A02;
    public final C49712gy A03;
    public final C44762Xj A04;
    public final C47862dx A05;
    public final C64663Ek A06;
    public final C64773Ex A07;
    public final C56642sK A08;
    public final C56612sH A09;
    public final C621133n A0A;
    public final C56762sW A0B;
    public final C56982ss A0C;
    public final C66543Lv A0D;
    public final C56892sj A0E;
    public final C61152zn A0F;
    public final C56382rt A0G;
    public final C56362rr A0H;
    public final C55152pt A0I;
    public final C620233e A0J;
    public final C61092zh A0K;
    public final C55302q8 A0L;
    public final C56662sM A0M;
    public final AnonymousClass311 A0N;
    public final C29041iB A0O;
    public final C53632nP A0P;
    public final C55802qw A0Q;
    public final C56302rl A0R;
    public final AnonymousClass1VX A0S;
    public final AnonymousClass4FV A0T;
    public final AnonymousClass30N A0U;
    public final C48092eK A0V;
    public final C52472lX A0W;
    public final C61232zv A0X;
    public final C620033c A0Y;
    public final AnonymousClass35J A0Z;
    public final C55832qz A0a;
    public final C183538qC A0b;
    public final C183538qC A0c;
    public final Random A0d = AnonymousClass0x9.A1C();

    public final C52952mJ A02(AnonymousClass33G r5) {
        boolean z;
        C371120z r0 = C371120z.FOR_COMPANION_SYNC;
        boolean z2 = false;
        C162457s7.A0J(r0, 0);
        C46002av r3 = new C46002av(r0);
        C59732xO r02 = r5.A06;
        if (r02 != null) {
            z2 = r02.A06;
        }
        r3.A03 = z2;
        if (r02 != null) {
            z = r02.A05;
        } else {
            z = false;
        }
        r3.A02 = z;
        r3.A00 = this.A0S.A0O(C58422vE.A02, 6050);
        return r3.A00();
    }

    public final void A05(C51442jp r18, String str, int i, int i2, int i3, long j, long j2, long j3, long j4) {
        int i4 = i;
        int i5 = i3;
        if (i == 0) {
            this.A0P.A01(false);
        } else {
            int i6 = 6;
            if (i4 == 6) {
                C47862dx r1 = this.A05;
                if (i5 != 5) {
                    i6 = 5;
                }
                r1.A00(Integer.valueOf(i6), str);
            }
        }
        this.A06.A0A(r18, i4, i2, i5, j, j2, j3, j4, 0);
    }

    public final void A06(C95814uZ r10, C209619z r11, long j, long j2) {
        AnonymousClass4GK r5;
        Throwable th;
        C374222o r0;
        C56362rr r6 = this.A0H;
        AnonymousClass31A A0A2 = r6.A02.A0A(r10, false);
        if (A0A2 != null) {
            if (A0A2.A0H == Long.MIN_VALUE) {
                String[] A1Y = AnonymousClass0x9.A1Y();
                C56922sm.A02(r6.A01, r10, A1Y, 0);
                r5 = r6.A04.get();
                Cursor A0E2 = ((AnonymousClass3H0) r5).A03.A0E("   SELECT sort_id FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8') ORDER BY sort_id ASC LIMIT 1", "GET_FIRST_SORT_REF_SQL", A1Y);
                try {
                    if (A0E2.moveToFirst()) {
                        A0A2.A0H = AnonymousClass0x2.A0C(A0E2, "sort_id");
                    } else {
                        C18260x0.A1S(AnonymousClass001.A0o(), "msgstore/getfirstsortref can't get value for ", r10);
                    }
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                try {
                    A0E2.close();
                    r5.close();
                } catch (Throwable th3) {
                    try {
                        r5.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            }
            long j3 = A0A2.A0H;
            if (j3 != Long.MIN_VALUE) {
                if (j3 >= j) {
                    r0 = C374222o.COMPLETE_AND_NO_MORE_MESSAGE_REMAIN_ON_PRIMARY;
                } else if (j3 < j2) {
                    C56382rt r1 = this.A0G;
                    String[] A1a = AnonymousClass0x9.A1a();
                    int A032 = C56922sm.A03(r1.A01, r10, A1a);
                    C18280x3.A1R(A1a, 1, j2);
                    C18280x3.A1R(A1a, 2, j);
                    r5 = r1.A05.get();
                    Cursor A0E3 = ((AnonymousClass3H0) r5).A03.A0E("SELECT COUNT(*) as count FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8') AND _id > ? AND _id <= ?", "GET_CHAT_MESSAGE_COUNT_RANGE_SQL", A1a);
                    try {
                        if (A0E3.moveToNext()) {
                            A032 = AnonymousClass0x2.A03(A0E3);
                            C18260x0.A0y("msgstore/getmessagesatid/pos:", AnonymousClass001.A0o(), A032);
                        } else {
                            C18260x0.A1R(AnonymousClass001.A0o(), "msgstore/getmessagesatid/db no message for ", r10);
                        }
                        A0E3.close();
                        r5.close();
                        if (A032 == 0) {
                            r0 = C374222o.COMPLETE_BUT_MORE_MESSAGES_REMAIN_ON_PRIMARY;
                        } else {
                            return;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        if (A0E3 != null) {
                            A0E3.close();
                        }
                        throw th;
                    }
                } else {
                    return;
                }
                r11.A09(r0);
            }
        }
    }

    public final void A07(AnonymousClass1A0 r10) {
        Cursor A0E2;
        C373822a r0;
        Log.d("history-sync-send-methods/attach-past-participants start");
        C61152zn r5 = this.A0F;
        String[] A1Z = AnonymousClass0x9.A1Z();
        C18260x0.A1W(A1Z, 1000, this.A09.A0H() - 5184000000L);
        AnonymousClass4GK A032 = r5.A01.get();
        try {
            A0E2 = ((AnonymousClass3H0) A032).A03.A0E("SELECT group_jid_row_id, user_jid_row_id, is_leave, timestamp FROM group_past_participant_user WHERE timestamp >= ? ORDER BY timestamp DESC LIMIT ?", "GET_ALL_GROUP_PAST_PARTICIPANT_USERS_SQL", A1Z);
            List A002 = C61152zn.A00(A0E2);
            if (A0E2 != null) {
                A0E2.close();
            }
            A032.close();
            Iterator A0q = AnonymousClass000.A0q(r5.A01(A002));
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                C130546c9 A0G2 = AnonymousClass1BV.DEFAULT_INSTANCE.A0G();
                String A0g = C18300x5.A0g(A0G2, AnonymousClass0x9.A0R(A0w));
                AnonymousClass1BV r1 = (AnonymousClass1BV) A0G2.A00;
                A0g.getClass();
                r1.bitField0_ |= 1;
                r1.groupJid_ = A0g;
                Iterator A0q2 = C18320x8.A0q(A0w.getValue());
                while (A0q2.hasNext()) {
                    C42852Pt r6 = (C42852Pt) A0q2.next();
                    C130546c9 A0G3 = AnonymousClass1CJ.DEFAULT_INSTANCE.A0G();
                    String A0g2 = C18300x5.A0g(A0G3, r6.A02);
                    AnonymousClass1CJ r12 = (AnonymousClass1CJ) A0G3.A00;
                    A0g2.getClass();
                    r12.bitField0_ |= 1;
                    r12.userJid_ = A0g2;
                    long A0B2 = C18290x4.A0B(r6.A00);
                    AnonymousClass1CJ r13 = (AnonymousClass1CJ) C18320x8.A0C(A0G3);
                    r13.bitField0_ |= 4;
                    r13.leaveTs_ = A0B2;
                    if (r6.A03) {
                        r0 = C373822a.LEFT;
                    } else {
                        r0 = C373822a.REMOVED;
                    }
                    AnonymousClass1CJ r14 = (AnonymousClass1CJ) C18320x8.A0C(A0G3);
                    r14.leaveReason_ = r0.value;
                    r14.bitField0_ |= 2;
                    C130786cX A062 = A0G3.A06();
                    AnonymousClass1BV r2 = (AnonymousClass1BV) C18320x8.A0C(A0G2);
                    A062.getClass();
                    C188248ya r15 = r2.pastParticipants_;
                    if (!((AnonymousClass8T6) r15).A00) {
                        r15 = C130786cX.A07(r15);
                        r2.pastParticipants_ = r15;
                    }
                    r15.add(A062);
                }
                C130786cX A063 = A0G2.A06();
                AnonymousClass1E2 r22 = (AnonymousClass1E2) C18320x8.A0C(r10);
                A063.getClass();
                C188248ya r16 = r22.pastParticipants_;
                if (!((AnonymousClass8T6) r16).A00) {
                    r16 = C130786cX.A07(r16);
                    r22.pastParticipants_ = r16;
                }
                r16.add(A063);
            }
            Log.d("history-sync-send-methods/attach-past-participants end");
            return;
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

    public final void A08(AnonymousClass1A0 r6) {
        ArrayList A042 = this.A0B.A04((C837249n) null, 0, 200);
        C18260x0.A1B("history-sync-send-methods/attachRecentCallLogsToHistorySync call log size = ", AnonymousClass001.A0o(), A042);
        Iterator it = A042.iterator();
        while (it.hasNext()) {
            AnonymousClass1E6 A022 = AnonymousClass35H.A02(this.A02, (AnonymousClass3ZF) it.next());
            AnonymousClass1E2 r2 = (AnonymousClass1E2) C18320x8.A0C(r6);
            A022.getClass();
            C188248ya r1 = r2.callLogRecords_;
            if (!((AnonymousClass8T6) r1).A00) {
                r1 = C130786cX.A07(r1);
                r2.callLogRecords_ = r1;
            }
            r1.add(A022);
        }
    }

    public final void A09(AnonymousClass1A0 r11) {
        long j;
        C183538qC r1 = this.A0c;
        List A0E2 = AnonymousClass0x9.A0a(r1).A0E();
        Map A0F2 = AnonymousClass0x9.A0a(r1).A0F();
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1H("history-sync-send-methods/sendNonBlockingDataMessages recent sticker msg size=", A0o, A0E2);
        AnonymousClass0x2.A18(A0o);
        Iterator it = A0E2.iterator();
        while (it.hasNext()) {
            Pair A0D2 = AnonymousClass0x9.A0D(it);
            AnonymousClass39M r3 = (AnonymousClass39M) A0D2.first;
            Number number = (Number) A0D2.second;
            C130546c9 A0G2 = C21961Dv.DEFAULT_INSTANCE.A0G();
            String str = r3.A0G;
            if (!TextUtils.isEmpty(str)) {
                C21961Dv r12 = (C21961Dv) C18320x8.A0C(A0G2);
                str.getClass();
                r12.bitField0_ |= 1;
                r12.url_ = str;
            }
            String str2 = r3.A0D;
            if (!TextUtils.isEmpty(str2)) {
                C172548Lq A082 = C18270x1.A08(A0G2, str2);
                C21961Dv r13 = (C21961Dv) A0G2.A00;
                r13.bitField0_ |= 2;
                r13.fileSha256_ = A082;
            }
            String str3 = r3.A08;
            if (!TextUtils.isEmpty(str3)) {
                C172548Lq A083 = C18270x1.A08(A0G2, str3);
                C21961Dv r14 = (C21961Dv) A0G2.A00;
                r14.bitField0_ |= 4;
                r14.fileEncSha256_ = A083;
            }
            String str4 = r3.A0B;
            if (!TextUtils.isEmpty(str4)) {
                C172548Lq A0H2 = C18280x3.A0H(A0G2, Base64.decode(str4, 1));
                C21961Dv r15 = (C21961Dv) A0G2.A00;
                r15.bitField0_ |= 8;
                r15.mediaKey_ = A0H2;
            }
            String str5 = r3.A06;
            if (!TextUtils.isEmpty(str5)) {
                C21961Dv r16 = (C21961Dv) C18320x8.A0C(A0G2);
                str5.getClass();
                r16.bitField0_ |= 128;
                r16.directPath_ = str5;
            }
            String str6 = r3.A0C;
            C21961Dv r17 = (C21961Dv) C18320x8.A0C(A0G2);
            str6.getClass();
            r17.bitField0_ |= 16;
            r17.mimetype_ = str6;
            int i = r3.A02;
            C21961Dv r18 = (C21961Dv) C18320x8.A0C(A0G2);
            r18.bitField0_ |= 32;
            r18.height_ = i;
            int i2 = r3.A03;
            C21961Dv r19 = (C21961Dv) C18320x8.A0C(A0G2);
            r19.bitField0_ |= 64;
            r19.width_ = i2;
            long j2 = (long) r3.A00;
            C21961Dv r32 = (C21961Dv) C18320x8.A0C(A0G2);
            r32.bitField0_ |= 256;
            r32.fileLength_ = j2;
            float floatValue = number.floatValue();
            C21961Dv r110 = (C21961Dv) C18320x8.A0C(A0G2);
            r110.bitField0_ |= 512;
            r110.weight_ = floatValue;
            if (str2 == null || !A0F2.containsKey(str2)) {
                j = 0;
            } else {
                j = C18290x4.A0C(str2, A0F2);
            }
            C21961Dv r111 = (C21961Dv) C18320x8.A0C(A0G2);
            r111.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
            r111.lastStickerSentTs_ = j;
            AnonymousClass1E2 r33 = (AnonymousClass1E2) C18320x8.A0C(r11);
            C130786cX A062 = A0G2.A06();
            A062.getClass();
            C188248ya r112 = r33.recentStickers_;
            if (!((AnonymousClass8T6) r112).A00) {
                r112 = C130786cX.A07(r112);
                r33.recentStickers_ = r112;
            }
            r112.add(A062);
        }
    }

    public C614330s(C116985rC r2, C55682qk r3, C56972sr r4, C49712gy r5, C44762Xj r6, C47862dx r7, C64663Ek r8, C64773Ex r9, C56642sK r10, C56612sH r11, C621133n r12, C56762sW r13, C56982ss r14, C66543Lv r15, C56892sj r16, C61152zn r17, C56382rt r18, C56362rr r19, C55152pt r20, C620233e r21, C61092zh r22, C55302q8 r23, C56662sM r24, AnonymousClass311 r25, C29041iB r26, C53632nP r27, C55802qw r28, C56302rl r29, AnonymousClass1VX r30, AnonymousClass4FV r31, AnonymousClass30N r32, C48092eK r33, C52472lX r34, C61232zv r35, C620033c r36, AnonymousClass35J r37, C55832qz r38, C183538qC r39, C183538qC r40) {
        this.A09 = r11;
        this.A0S = r30;
        this.A01 = r3;
        this.A02 = r4;
        this.A0C = r14;
        this.A0G = r18;
        this.A0T = r31;
        this.A0H = r19;
        this.A0J = r21;
        this.A03 = r5;
        this.A0K = r22;
        this.A07 = r9;
        this.A0c = r39;
        this.A0Z = r37;
        this.A0Y = r36;
        this.A0D = r15;
        this.A0a = r38;
        this.A0X = r35;
        this.A0M = r24;
        this.A06 = r8;
        this.A0B = r13;
        this.A0R = r29;
        this.A0A = r12;
        this.A0W = r34;
        this.A00 = r2;
        this.A0I = r20;
        this.A0U = r32;
        this.A08 = r10;
        this.A0b = r40;
        this.A0O = r26;
        this.A04 = r6;
        this.A0N = r25;
        this.A0Q = r28;
        this.A0E = r16;
        this.A0L = r23;
        this.A0F = r17;
        this.A0P = r27;
        this.A05 = r7;
        this.A0V = r33;
    }

    public static final AnonymousClass23J A00(int i) {
        switch (i) {
            case 0:
                return AnonymousClass23J.INITIAL_BOOTSTRAP;
            case 1:
                return AnonymousClass23J.INITIAL_STATUS_V3;
            case 2:
                return AnonymousClass23J.RECENT;
            case 3:
                return AnonymousClass23J.FULL;
            case 4:
                return AnonymousClass23J.PUSH_NAME;
            case 5:
                return AnonymousClass23J.NON_BLOCKING_DATA;
            case 6:
                return AnonymousClass23J.ON_DEMAND;
            default:
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Unexpected type (");
                A0o.append(i);
                throw AnonymousClass000.A0F(")", A0o);
        }
    }

    public void A04(C51442jp r34, DeviceJid deviceJid, String str, int i, boolean z) {
        DeviceJid deviceJid2 = deviceJid;
        C18260x0.A1P(AnonymousClass001.A0o(), "history-sync-send-methods/send-push-names: jid=", deviceJid2);
        int A0O2 = this.A0S.A0O(C58422vE.A02, 1181);
        try {
            ArrayList A0F2 = this.A07.A0F();
            AnonymousClass1A0 A0Z2 = AnonymousClass0x7.A0Z();
            A0Z2.A0D(AnonymousClass23J.PUSH_NAME);
            Iterator it = A0F2.iterator();
            int i2 = 0;
            while (true) {
                if (it.hasNext()) {
                    AnonymousClass3ZH A0R2 = C18310x6.A0R(it);
                    UserJid A072 = AnonymousClass3ZH.A07(A0R2);
                    if (A072 != null && !TextUtils.isEmpty(A0R2.A0b)) {
                        C203317o r3 = (C203317o) AnonymousClass1BW.DEFAULT_INSTANCE.A0G();
                        String A0g = C18300x5.A0g(r3, A072);
                        AnonymousClass1BW r1 = (AnonymousClass1BW) r3.A00;
                        A0g.getClass();
                        r1.bitField0_ |= 1;
                        r1.id_ = A0g;
                        String str2 = A0R2.A0b;
                        AnonymousClass1BW r12 = (AnonymousClass1BW) C18320x8.A0C(r3);
                        str2.getClass();
                        r12.bitField0_ |= 2;
                        r12.pushname_ = str2;
                        AnonymousClass1BW r32 = (AnonymousClass1BW) r3.A06();
                        AnonymousClass1E2 r2 = (AnonymousClass1E2) C18320x8.A0C(A0Z2);
                        r32.getClass();
                        C188248ya r13 = r2.pushnames_;
                        if (!((AnonymousClass8T6) r13).A00) {
                            r13 = C130786cX.A07(r13);
                            r2.pushnames_ = r13;
                        }
                        r13.add(r32);
                        i2++;
                        if (A0O2 > 0 && i2 >= A0O2) {
                            C18260x0.A0y("history-sync-send-methods/send-push-names reach limit=", AnonymousClass001.A0o(), A0O2);
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
            A01(r34, deviceJid2, A0Z2, (String) null, str, 1, 4, 100, i, 0, -1, -1, -1, 0, 0, -1, z);
        } catch (Exception e) {
            Log.e("history-sync-send-methods/send-push-names: error", e);
        }
    }

    public final long A01(C51442jp r67, DeviceJid deviceJid, AnonymousClass1A0 r69, String str, String str2, int i, int i2, int i3, int i4, long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("HistorySyncSendMethods/uploadAndSendPeerMessage send peer msg inlineSync=");
        A0o.append(z);
        int i5 = i2;
        C18260x0.A0w("; syncType=", A0o, i5);
        long j8 = j2;
        long j9 = j;
        int i6 = i4;
        int i7 = i3;
        long j10 = j6;
        long j11 = j5;
        String str3 = str2;
        C51442jp r10 = r67;
        long j12 = j3;
        DeviceJid deviceJid2 = deviceJid;
        AnonymousClass1A0 r13 = r69;
        long j13 = j4;
        String str4 = str;
        int i8 = i;
        if (!z || ((long) r13.A06().A0D((C186358vA) null)) >= C56952sp.A04(this.A0S, 3680)) {
            try {
                File A002 = this.A0V.A00.A00("");
                StringBuilder A0o2 = AnonymousClass001.A0o();
                C18260x0.A1J(A0o2, AnonymousClass0x7.A0o(A002, "history-sync-send-methods/data file: ", A0o2));
                C627536m.A0A(r13.A06(), A002);
                AnonymousClass32J A003 = AnonymousClass32J.A00(Uri.fromFile(A002), (AnonymousClass32B) null, (C151027Td) null, new C157497iO(false, false, true), C633138t.A0L, (AnonymousClass330) null, (String) null, 0, false, false, true);
                long length = A002.length();
                this.A06.A0B(r10, i5, i8, (long) i7, true, true);
                C620033c r3 = this.A0Y;
                AnonymousClass3QO A032 = r3.A03(A003, false);
                A032.A0W = "mms";
                r3.A0E(A032, (String) null);
                A032.A04(new AnonymousClass3X9(r10, deviceJid2, A032, this, r13, A002, str4, str3, i5, i7, i8, i6, j11, length, j8, j12, j13, j7, j9, j10), (Executor) null);
                return length;
            } catch (IOException e) {
                Log.e("history-sync-send-methods/save-to-file: failed", e);
                this.A06.A0B(r10, i5, i8, (long) i7, false, true);
                return 0;
            }
        } else {
            Log.d("HistorySyncSendMethods/uploadAndSendPeerMessage send inline payload start");
            this.A06.A0B(r10, i5, i8, (long) i7, true, false);
            if (i2 == 0) {
                this.A0P.A01(true);
            }
            A03(r10, deviceJid2, (AnonymousClass32B) null, r13, str4, str3, (String) null, (String) null, (String) null, i8, i5, i7, i6, j9, j8, j12, j13, j11, j10, 0, true);
            return 0;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void A03(C51442jp r29, DeviceJid deviceJid, AnonymousClass32B r31, AnonymousClass1A0 r32, String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, int i4, long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z) {
        String str6;
        long j8;
        long size;
        int i5;
        byte[] bArr;
        PhoneUserJid A042 = C56972sr.A04(this.A02);
        int i6 = i3;
        int i7 = i2;
        int i8 = i;
        long j9 = j7;
        long j10 = j5;
        String str7 = str;
        C51442jp r7 = r29;
        AnonymousClass1A0 r6 = r32;
        if (A042 == null) {
            Log.e("history-sync-send-methods/no my user id (unregistered?).");
            j8 = (long) i6;
            size = (long) ((AnonymousClass1E2) r6.A00).conversations_.size();
            i5 = 3;
        } else {
            String str8 = null;
            if (r29 != null) {
                str6 = r7.A01;
                str8 = r7.A00;
            } else {
                str6 = null;
            }
            AnonymousClass2z0 A012 = AnonymousClass35J.A01(A042, this.A0Z);
            C56612sH r10 = this.A09;
            AnonymousClass1nO r2 = new AnonymousClass1nO(A012, r10.A0H());
            DeviceJid deviceJid2 = deviceJid;
            r2.A00 = deviceJid2;
            r2.A00 = i8;
            r2.A01 = i6;
            r2.A03 = i7;
            r2.A02 = i4;
            r2.A08 = j2;
            r2.A09 = j4;
            r2.A06 = j3;
            r2.A0E = str2;
            r2.A04 = (long) ((AnonymousClass1E2) r6.A00).conversations_.size();
            r2.A07 = j10;
            r2.A0H = str6;
            r2.A0G = str8;
            r2.A0A = j6;
            r2.A0F = str7;
            if (z) {
                byte[] A1Z = C18290x4.A1Z(r6);
                Deflater deflater = new Deflater(1, false);
                ByteArrayOutputStream A0e = AnonymousClass0x9.A0e();
                DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(A0e, deflater);
                try {
                    deflaterOutputStream.write(A1Z);
                    deflaterOutputStream.close();
                    bArr = A0e.toByteArray();
                    deflater.end();
                } catch (IOException e) {
                    C18260x0.A1Q(AnonymousClass001.A0o(), "HistorySyncUtils/deflateData fails e=", e);
                    deflater.end();
                    Log.e("HistorySyncUtils/deflateData no result");
                    bArr = new byte[0];
                } catch (Throwable th) {
                    deflater.end();
                    throw th;
                }
                r2.A0I = bArr;
            } else {
                r2.A0B = str3;
                r2.A0D = str4;
                r2.A0C = str5;
                r2.A0J = r31.A01;
                r2.A05 = j9;
            }
            if (this.A0R.A00(r2) < 0) {
                Log.e("history-sync-send-methods/failed to add peer message");
                j8 = (long) i6;
                size = (long) ((AnonymousClass1E2) r6.A00).conversations_.size();
                i5 = 5;
            } else {
                C49712gy.A00(this.A03, deviceJid2, r2);
                if (i7 == 6) {
                    long A032 = C56612sH.A03(r10, j);
                    int i9 = 1;
                    boolean A1W = AnonymousClass001.A1W((A032 > C56952sp.A06(this.A0S, 3882) ? 1 : (A032 == C56952sp.A06(this.A0S, 3882) ? 0 : -1)));
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("HistorySyncSendMethods/sendPeerMessage on demand history sync isRequestTimeout = ");
                    A0o.append(A1W);
                    C18260x0.A12(", requestAgeMillis = ", A0o, A032);
                    C47862dx r1 = this.A05;
                    if (A1W) {
                        i9 = 7;
                    }
                    r1.A00(Integer.valueOf(i9), str7);
                    return;
                }
                return;
            }
        }
        A05(r7, str7, i7, i8, i5, j8, size, j10, j9);
    }
}
