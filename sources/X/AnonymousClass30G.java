package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.30G  reason: invalid class name */
public class AnonymousClass30G {
    public final C116985rC A00;
    public final C55682qk A01;
    public final C56972sr A02;
    public final C56612sH A03;
    public final C52852m9 A04;
    public final C56542sA A05;
    public final C56922sm A06;
    public final C56982ss A07;
    public final C66543Lv A08;
    public final AnonymousClass313 A09;
    public final C47972e8 A0A;
    public final C47982e9 A0B;
    public final C55762qs A0C;
    public final C50012hU A0D;
    public final AnonymousClass35R A0E;
    public final C623334p A0F;
    public final C56562sC A0G;
    public final C613830m A0H;
    public final C54762pF A0I;
    public final C61142zm A0J;
    public final C66483Lp A0K;
    public final C51532jy A0L;
    public final C29431io A0M;
    public final C72303dV A0N;
    public final C51552k0 A0O;
    public final C55282q6 A0P;
    public final C54012o2 A0Q;
    public final C620233e A0R;
    public final AnonymousClass302 A0S;
    public final C612830a A0T;
    public final C614530v A0U;
    public final C56662sM A0V;
    public final C620333f A0W;
    public final C59412ws A0X;
    public final AnonymousClass1VX A0Y;
    public final AnonymousClass4FV A0Z;
    public final AnonymousClass2YF A0a;
    public final C620133d A0b;
    public final AnonymousClass33Y A0c;
    public final C49132g2 A0d;
    public final C45012Yi A0e;
    public final C49682gv A0f;
    public final C55832qz A0g;
    public final C183538qC A0h;
    public final C183538qC A0i;
    public final Object A0j = AnonymousClass002.A0D();

    public static String A00(C624134x r1) {
        if (r1 instanceof C30441mS) {
            return ((C30441mS) r1).A01;
        }
        if (r1 instanceof C30971nX) {
            return ((C30971nX) r1).A02;
        }
        return null;
    }

    public AnonymousClass2TJ A01(Cursor cursor) {
        Jid A0B2;
        Jid A0B3;
        String A0Z2 = AnonymousClass0x2.A0Z(cursor, "key_id");
        boolean A1W = AnonymousClass001.A1W((AnonymousClass0x2.A0C(cursor, "from_me") > 0 ? 1 : (AnonymousClass0x2.A0C(cursor, "from_me") == 0 ? 0 : -1)));
        C95814uZ A0B4 = this.A06.A0B(AnonymousClass0x2.A0C(cursor, "chat_row_id"));
        if (A0B4 == null) {
            return null;
        }
        cursor.getLong(AnonymousClass0x7.A02(cursor));
        AnonymousClass2z0 A052 = AnonymousClass2z0.A05(A0B4, A0Z2, A1W);
        Class<C95814uZ> cls = C95814uZ.class;
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("sender_jid_row_id");
        if (cursor.isNull(columnIndexOrThrow)) {
            A0B2 = null;
        } else {
            A0B2 = this.A0F.A0B(cls, cursor.getLong(columnIndexOrThrow));
        }
        C95814uZ r4 = (C95814uZ) A0B2;
        long A0C2 = AnonymousClass0x2.A0C(cursor, "timestamp");
        int A042 = AnonymousClass0x2.A04(cursor, "message_type");
        String A0Z3 = AnonymousClass0x2.A0Z(cursor, "revoked_key_id");
        Class<UserJid> cls2 = UserJid.class;
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("admin_jid_row_id");
        if (cursor.isNull(columnIndexOrThrow2)) {
            A0B3 = null;
        } else {
            A0B3 = this.A0F.A0B(cls2, cursor.getLong(columnIndexOrThrow2));
        }
        return new AnonymousClass2TJ(r4, (UserJid) A0B3, A052, A0Z3, C18280x3.A1Z(cursor, "orphan_message_data"), A042, AnonymousClass0x2.A04(cursor, "retry_count"), A0C2);
    }

    public void A02(AnonymousClass2TJ r19) {
        String l;
        Cursor A0E2;
        long j;
        AnonymousClass2TJ A012;
        AnonymousClass2TJ r7 = r19;
        AnonymousClass2z0 r4 = r7.A05;
        C18260x0.A1P(AnonymousClass001.A0o(), "EditMessageStore/storeOrphanedEditMessage ", r4);
        C56922sm r12 = this.A06;
        C95814uZ A013 = AnonymousClass2z0.A01(r4);
        String l2 = Long.toString(r12.A07(A013));
        C95814uZ r10 = r7.A03;
        if (r10 == null) {
            l = "";
        } else {
            l = Long.toString(this.A0F.A05(r10));
        }
        C85284Fq A042 = this.A0N.A04();
        try {
            C69833Yo Axl = A042.Axl();
            try {
                C56862sg r6 = ((AnonymousClass3H0) A042).A03;
                String[] strArr = new String[4];
                String str = r4.A01;
                int i = 0;
                strArr[0] = str;
                boolean z = r4.A02;
                C18280x3.A1Q(strArr, AnonymousClass000.A1S(z ? 1 : 0) ? 1 : 0, 1);
                AnonymousClass001.A1H(l2, l, strArr);
                A0E2 = r6.A0E("SELECT _id, key_id, from_me, chat_row_id, sender_jid_row_id, timestamp, message_type, revoked_key_id, retry_count, admin_jid_row_id, orphan_message_data  FROM message_orphaned_edit WHERE key_id = ? AND from_me = ? AND chat_row_id = ? AND sender_jid_row_id = ?", "GET_ORPHANED_MESSAGE_BY_KEY_SQL", strArr);
                Long l3 = null;
                if (!A0E2.moveToLast() || (A012 = A01(A0E2)) == null || (A012.A01 == 1 && r7.A01 == 0)) {
                    ContentValues A062 = AnonymousClass0x9.A06();
                    A062.put("key_id", str);
                    if (z) {
                        i = 1;
                    }
                    C18270x1.A0b(A062, "from_me", i);
                    C626936e.A06(A013);
                    C18270x1.A0c(A062, "chat_row_id", r12.A07(A013));
                    if (r10 == null) {
                        j = 0;
                    } else {
                        j = this.A0F.A05(r10);
                    }
                    C18270x1.A0c(A062, "sender_jid_row_id", j);
                    C18270x1.A0c(A062, "timestamp", r7.A02);
                    C18270x1.A0b(A062, "message_type", r7.A01);
                    A062.put("revoked_key_id", r7.A06);
                    C18270x1.A0b(A062, "retry_count", r7.A00);
                    UserJid userJid = r7.A04;
                    if (userJid != null) {
                        l3 = C623334p.A03(this.A0F, userJid);
                    }
                    A062.put("admin_jid_row_id", l3);
                    A062.put("orphan_message_data", r7.A07);
                    r6.A0A("message_orphaned_edit", "INSERT_MESSAGE_ORPHANED_EDIT_SQL", A062);
                    C18260x0.A1P(AnonymousClass001.A0o(), "EditMessageStore/storeOrphanedEditMessage/orphan inserted", r4);
                } else {
                    C18260x0.A1R(AnonymousClass001.A0o(), "EditMessageStore/storeOrphanedEditMessage/skipping-edit-store old message exists; msg.key=", r4);
                }
                Axl.A00();
                A0E2.close();
                Axl.close();
                A042.close();
                return;
            } catch (Throwable th) {
                Axl.close();
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                A042.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public void A03(C624134x r4, boolean z) {
        this.A04.A01(new C117665sI(this, r4, 25, z), 31);
    }

    public boolean A05(C624134x r5, boolean z) {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass2z0 A082 = C624134x.A08(r5, "msgstore/edit/revoke ", A0o);
        if (A082.A02) {
            str = AnonymousClass000.A0b("send deleteMedia=", AnonymousClass001.A0o(), z);
        } else {
            str = "recv";
        }
        A0o.append(str);
        C18260x0.A1R(A0o, " key=", A082);
        return A04(r5, -1, true, z);
    }

    public AnonymousClass30G(C116985rC r2, C55682qk r3, C56972sr r4, C56612sH r5, C52852m9 r6, C56542sA r7, C56922sm r8, C56982ss r9, C66543Lv r10, AnonymousClass313 r11, C47972e8 r12, C47982e9 r13, C55762qs r14, C50012hU r15, AnonymousClass35R r16, C623334p r17, C56562sC r18, C613830m r19, C54762pF r20, C61142zm r21, C66483Lp r22, C51532jy r23, C29431io r24, C72303dV r25, C51552k0 r26, C55282q6 r27, C54012o2 r28, C620233e r29, AnonymousClass302 r30, C612830a r31, C614530v r32, C56662sM r33, C620333f r34, C59412ws r35, AnonymousClass1VX r36, AnonymousClass4FV r37, AnonymousClass2YF r38, C620133d r39, AnonymousClass33Y r40, C49132g2 r41, C45012Yi r42, C49682gv r43, C55832qz r44, C183538qC r45, C183538qC r46) {
        this.A03 = r5;
        this.A0Y = r36;
        this.A0F = r17;
        this.A06 = r8;
        this.A01 = r3;
        this.A02 = r4;
        this.A07 = r9;
        this.A0Z = r37;
        this.A05 = r7;
        this.A0R = r29;
        this.A0c = r40;
        this.A0i = r45;
        this.A0D = r15;
        this.A0Q = r28;
        this.A0V = r33;
        this.A08 = r10;
        this.A0g = r44;
        this.A0G = r18;
        this.A0M = r24;
        this.A0O = r26;
        this.A0U = r32;
        this.A04 = r6;
        this.A0W = r34;
        this.A0I = r20;
        this.A0J = r21;
        this.A0N = r25;
        this.A0f = r43;
        this.A0b = r39;
        this.A0L = r23;
        this.A0S = r30;
        this.A0B = r13;
        this.A0T = r31;
        this.A09 = r11;
        this.A0H = r19;
        this.A0e = r42;
        this.A0X = r35;
        this.A0E = r16;
        this.A0C = r14;
        this.A0h = r46;
        this.A0P = r27;
        this.A0a = r38;
        this.A0A = r12;
        this.A0K = r22;
        this.A00 = r2;
        this.A0d = r41;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x023d, code lost:
        if (r6.A0l() != 1) goto L_0x023f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0061, code lost:
        if (r7 == 83) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0393, code lost:
        if (X.C624134x.A0b(r7) != false) goto L_0x0395;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0812, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0813, code lost:
        X.AnonymousClass2A8.A00(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d4, code lost:
        if (r6 != null) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0106, code lost:
        if (X.C624134x.A0b(r6) != false) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0181, code lost:
        if (r5.A1W == false) goto L_0x01a8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x028b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02bf A[SYNTHETIC, Splitter:B:145:0x02bf] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A04(X.C624134x r32, int r33, boolean r34, boolean r35) {
        /*
            r31 = this;
            r5 = r32
            java.lang.String r0 = A00(r5)
            r4 = 0
            if (r0 != 0) goto L_0x0020
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "msgstore/revoke/missing-old-id "
            X.C624134x.A0S(r5, r0, r1)
            java.lang.String r0 = " from="
            X.C624134x.A0R(r5, r0, r1)
            java.lang.String r0 = r1.toString()
        L_0x001c:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x001f:
            return r4
        L_0x0020:
            X.2z0 r8 = r5.A1J
            X.4uZ r2 = r8.A00
            r3 = r31
            X.8qC r0 = r3.A0i
            r30 = r0
            r30.get()
            boolean r0 = X.C624134x.A0b(r5)
            if (r0 == 0) goto L_0x00a7
            r1 = 0
        L_0x0034:
            java.lang.String r0 = A00(r5)
            X.2z0 r9 = X.AnonymousClass2z0.A05(r2, r0, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "msgstore/revoke/ old="
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = " new="
            X.C18260x0.A1P(r1, r0, r8)
            boolean r11 = r2 instanceof X.C95804uY
            X.2sr r0 = r3.A02
            r29 = r0
            boolean r16 = X.C627636p.A0N(r0, r5)
            byte r7 = r5.A1I
            r0 = 64
            if (r7 == r0) goto L_0x0063
            r0 = 83
            r10 = 0
            if (r7 != r0) goto L_0x0064
        L_0x0063:
            r10 = 1
        L_0x0064:
            X.2qz r12 = r3.A0g
            X.34x r6 = r12.A05(r8)
            r2 = 1
            if (r6 == 0) goto L_0x008d
            if (r11 != 0) goto L_0x008d
            r30.get()
            boolean r0 = X.C624134x.A0b(r6)
            if (r0 != 0) goto L_0x008d
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "msgstore/revoking/has-placeholder "
            X.C624134x.A0Q(r6, r0, r1)
            boolean r0 = X.C626635z.A09(r6)
            if (r0 == 0) goto L_0x00aa
            X.3Lv r0 = r3.A08
            r0.A0d(r6, r2, r4)
        L_0x008d:
            X.34x r6 = r12.A05(r9)
            if (r11 == 0) goto L_0x00b2
            if (r6 != 0) goto L_0x00d6
            X.4uZ r6 = r9.A00
            boolean r0 = r9.A02
            r1 = r0 ^ 1
            java.lang.String r0 = r9.A01
            X.34x r6 = X.C55832qz.A01(r6, r12, r0, r1)
            if (r6 != 0) goto L_0x00d6
            java.lang.String r0 = "editmessagestore/newsletter/original message not found"
            goto L_0x001c
        L_0x00a7:
            boolean r1 = r8.A02
            goto L_0x0034
        L_0x00aa:
            if (r16 == 0) goto L_0x001f
            X.33Y r0 = r3.A0c
            r0.A04(r5)
            return r4
        L_0x00b2:
            if (r6 != 0) goto L_0x00d6
            X.2jy r0 = r3.A0L
            android.database.Cursor r9 = r0.A00(r9)
            if (r9 == 0) goto L_0x090c
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x00d1
            X.34x r6 = r12.A03(r9)     // Catch:{ all -> 0x00c7 }
            goto L_0x00d1
        L_0x00c7:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x00cc }
            throw r1
        L_0x00cc:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x00d1:
            r9.close()
            if (r6 == 0) goto L_0x090c
        L_0x00d6:
            X.2Ou r0 = r6.A11()
            if (r0 == 0) goto L_0x00ed
            X.2Ou r0 = r6.A11()
            X.2z0 r0 = r0.A02
            java.lang.String r1 = r0.A01
            boolean r0 = r5 instanceof X.C30441mS
            if (r0 == 0) goto L_0x0901
            r0 = r5
            X.1mS r0 = (X.C30441mS) r0
            r0.A01 = r1
        L_0x00ed:
            X.2sM r9 = r3.A0V
            com.whatsapp.jid.UserJid r1 = r6.A0o()
            com.whatsapp.jid.UserJid r0 = r5.A0o()
            boolean r0 = r9.A0B(r1, r0)
            if (r0 != 0) goto L_0x0108
            if (r10 != 0) goto L_0x0108
            r30.get()
            boolean r0 = X.C624134x.A0b(r6)
            if (r0 == 0) goto L_0x090c
        L_0x0108:
            X.2z0 r0 = r6.A1J
            r28 = r0
            X.4uZ r15 = r0.A00
            boolean r0 = r15 instanceof X.C135166kE
            r17 = r0
            if (r0 == 0) goto L_0x0146
            r0 = r28
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0146
            boolean r0 = r6 instanceof X.C30471mV
            if (r0 == 0) goto L_0x0126
            X.33d r1 = r3.A0b
            r0 = r6
            X.1mV r0 = (X.C30471mV) r0
            r1.A0B(r0)
        L_0x0126:
            X.3Lv r0 = r3.A08
            r0.A0d(r6, r2, r2)
            X.33Y r0 = r3.A0c
            r0.A04(r5)
            X.2hU r0 = r3.A0D
            android.os.Handler r4 = r0.A01
            r0 = 30
            X.3Zw r1 = new X.3Zw
            r1.<init>(r3, r0, r6)
        L_0x013b:
            r4.post(r1)
        L_0x013e:
            X.2pF r1 = r3.A0I
            r0 = r28
            r1.A03(r0)
        L_0x0145:
            return r2
        L_0x0146:
            boolean r0 = X.C627636p.A0l(r5)
            if (r0 == 0) goto L_0x013e
            long r0 = r5.A0K
            long r9 = r6.A0K
            long r0 = r0 - r9
            boolean r9 = r6 instanceof X.C30441mS
            r13 = 259200000(0xf731400, double:1.280618154E-315)
            int r10 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            boolean r18 = X.AnonymousClass001.A1W(r10)
            java.lang.String r0 = r6.A15
            boolean r14 = X.C18320x8.A1U(r0)
            r0 = 83
            boolean r10 = X.AnonymousClass000.A1U(r7, r0)
            r0 = r28
            boolean r13 = r0.A02
            if (r13 == 0) goto L_0x0183
            r0 = 64
            if (r7 != r0) goto L_0x01a8
            r0 = r5
            X.1nV r0 = (X.C30961nV) r0
            com.whatsapp.jid.UserJid r1 = r0.A00
            r0 = r29
            boolean r0 = r0.A0a(r1)
            if (r0 == 0) goto L_0x0183
            boolean r0 = r5.A1W
            if (r0 == 0) goto L_0x01a8
        L_0x0183:
            if (r14 != 0) goto L_0x0189
            if (r18 != 0) goto L_0x0189
            if (r9 == 0) goto L_0x01a8
        L_0x0189:
            if (r10 != 0) goto L_0x01a8
            if (r11 != 0) goto L_0x01a8
            if (r14 == 0) goto L_0x0198
            X.33Y r1 = r3.A0c
            java.lang.String r0 = "revoke-drop-payment"
        L_0x0194:
            r1.A06(r5, r0)
            goto L_0x013e
        L_0x0198:
            if (r18 == 0) goto L_0x01a0
            X.33Y r1 = r3.A0c
            java.lang.String r0 = "revoke-drop-old"
            goto L_0x0194
        L_0x01a0:
            if (r9 == 0) goto L_0x013e
            X.33Y r1 = r3.A0c
            java.lang.String r0 = "revoke-drop-terminal"
            goto L_0x0194
        L_0x01a8:
            boolean r9 = r5 instanceof X.C30441mS
            if (r9 == 0) goto L_0x02b1
            r10 = r5
            X.1mS r10 = (X.C30441mS) r10
            boolean r0 = r10 instanceof X.C30951nU
            if (r0 == 0) goto L_0x02a6
            long r0 = r10.A0K
            X.1nU r7 = new X.1nU
            r7.<init>((X.AnonymousClass2z0) r8, (X.C30441mS) r10, (long) r0)
        L_0x01ba:
            long r0 = r6.A0K
            r7.A0K = r0
            long r0 = r5.A0I
            r7.A0I = r0
            long r0 = r5.A1O
            r7.A1O = r0
            long r0 = r6.A1L
            r7.A1L = r0
            if (r11 == 0) goto L_0x02a2
            long r0 = r6.A1M
            r10 = -1
            int r8 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r8 != 0) goto L_0x02a2
            long r0 = r5.A1M
        L_0x01d6:
            r7.A1M = r0
            java.lang.String r0 = r6.A14
            r7.A14 = r0
            r7.A1H(r2)
            int r0 = r6.A05
            r7.A1E(r0)
            java.lang.Long r0 = r6.A0r
            r7.A0r = r0
            r7.A07 = r4
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            int r0 = r6.A0A
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)
            if (r0 == 0) goto L_0x028b
            r7.A1B(r1)
            X.2pu r0 = r6.A0t()
            r7.A1N(r0)
        L_0x01ff:
            boolean r0 = r5.A1W
            if (r0 == 0) goto L_0x0205
            r7.A1W = r2
        L_0x0205:
            if (r9 == 0) goto L_0x0270
            r8 = r7
            X.1mS r8 = (X.C30441mS) r8
            r0 = r5
            X.1mS r0 = (X.C30441mS) r0
            long r0 = r0.A00
            r8.A00 = r0
            X.4uZ r0 = r6.A0n()
            r7.A1J(r0)
        L_0x0218:
            X.2z0 r8 = r7.A1J
            X.4uZ r0 = r8.A00
            r21 = r0
            r1 = r29
            boolean r0 = r1.A0a(r0)
            if (r0 == 0) goto L_0x0266
            r0 = 13
        L_0x0228:
            r7.A1G(r0)
        L_0x022b:
            java.lang.String r10 = "message_row_id=?"
            java.lang.String r9 = "message_row_id = ?"
            int r0 = r7.A0l()
            r11 = 0
            if (r0 != r2) goto L_0x023f
            int r0 = r6.A0l()
            r1 = 1
            if (r0 == r2) goto L_0x0240
        L_0x023f:
            r1 = 0
        L_0x0240:
            X.C626936e.A0B(r1)
            int r0 = r6.A0j()
            if (r0 != r2) goto L_0x0254
            int r0 = r6.A05
            if (r0 <= 0) goto L_0x0254
            r6.A07 = r4
            X.313 r0 = r3.A09
            r0.A0B(r6)
        L_0x0254:
            X.5rC r0 = r3.A00
            boolean r1 = r0.A07()
            if (r1 == 0) goto L_0x02bf
            r0.A04()
            java.lang.String r0 = "beforeRemoveAllLabelsFromMessage"
            java.lang.NullPointerException r1 = X.AnonymousClass001.A0g(r0)
            throw r1
        L_0x0266:
            boolean r0 = r7.A1W
            if (r0 != 0) goto L_0x026e
            if (r13 == 0) goto L_0x022b
            if (r16 == 0) goto L_0x022b
        L_0x026e:
            r0 = 4
            goto L_0x0228
        L_0x0270:
            boolean r0 = r7 instanceof X.C30971nX
            if (r0 == 0) goto L_0x0218
            r8 = r7
            X.1mX r8 = (X.C30491mX) r8
            boolean r0 = r6 instanceof X.AnonymousClass1nW
            if (r0 == 0) goto L_0x0218
            r1 = r6
            X.1mX r1 = (X.C30491mX) r1
            java.lang.String r0 = r1.A02
            r8.A02 = r0
            int r0 = r1.A00
            r8.A00 = r0
            long r0 = r1.A01
            r8.A01 = r0
            goto L_0x0218
        L_0x028b:
            if (r9 == 0) goto L_0x01ff
            int r0 = r5.A0A
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)
            if (r0 == 0) goto L_0x01ff
            r7.A1B(r1)
            X.2pu r0 = r5.A0t()
            r7.A1N(r0)
            goto L_0x01ff
        L_0x02a2:
            long r0 = r6.A1M
            goto L_0x01d6
        L_0x02a6:
            X.1nV r10 = (X.C30961nV) r10
            long r0 = r10.A0K
            X.1nV r7 = new X.1nV
            r7.<init>((X.AnonymousClass2z0) r8, (X.C30961nV) r10, (long) r0)
            goto L_0x01ba
        L_0x02b1:
            boolean r0 = r5 instanceof X.C30971nX
            if (r0 == 0) goto L_0x0949
            r0 = r5
            X.1nX r0 = (X.C30971nX) r0
            X.1nX r7 = new X.1nX
            r7.<init>((X.AnonymousClass2z0) r8, (X.C30971nX) r0)
            goto L_0x01ba
        L_0x02bf:
            X.3dV r0 = r3.A0N     // Catch:{ IOException -> 0x08d3 }
            X.4Fq r19 = r0.A04()     // Catch:{ IOException -> 0x08d3 }
            X.3Yo r18 = r19.Axl()     // Catch:{ all -> 0x08c9 }
            X.1VX r0 = r3.A0Y     // Catch:{ all -> 0x08bf }
            r27 = r0
            r13 = 6440(0x1928, float:9.024E-42)
            X.2vE r20 = X.C58422vE.A02     // Catch:{ all -> 0x08bf }
            r1 = r0
            r0 = r20
            boolean r0 = r1.A0Y(r0, r13)     // Catch:{ all -> 0x08bf }
            if (r0 == 0) goto L_0x032e
            boolean r0 = r6 instanceof X.C30471mV     // Catch:{ all -> 0x08bf }
            if (r0 == 0) goto L_0x02e7
            X.33d r1 = r3.A0b     // Catch:{ all -> 0x08bf }
            r0 = r6
            X.1mV r0 = (X.C30471mV) r0     // Catch:{ all -> 0x08bf }
            r1.A0E(r0, r2, r4)     // Catch:{ all -> 0x08bf }
            r11 = 1
        L_0x02e7:
            int r0 = r6.A0l()     // Catch:{ all -> 0x08bf }
            if (r0 != r2) goto L_0x02f2
            X.3Lv r0 = r3.A08     // Catch:{ all -> 0x08bf }
            r0.A0d(r6, r11, r2)     // Catch:{ all -> 0x08bf }
        L_0x02f2:
            r7.A1F = r4     // Catch:{ all -> 0x08bf }
            r7.A1B = r4     // Catch:{ all -> 0x08bf }
            r9 = 0
            r7.A0d = r9     // Catch:{ all -> 0x08bf }
            r0 = 0
            r7.A0H = r0     // Catch:{ all -> 0x08bf }
            r7.A0J = r0     // Catch:{ all -> 0x08bf }
            r7.A1e(r9)     // Catch:{ all -> 0x08bf }
            boolean r0 = r7 instanceof X.C30481mW     // Catch:{ all -> 0x08bf }
            if (r0 == 0) goto L_0x0324
            r0 = r7
            X.1mW r0 = (X.C30481mW) r0     // Catch:{ all -> 0x08bf }
            r0.A05 = r9     // Catch:{ all -> 0x08bf }
        L_0x030b:
            r7.A1F(r4)     // Catch:{ all -> 0x08bf }
            r0 = 0
            boolean r10 = r7 instanceof X.C30361mK     // Catch:{ all -> 0x08bf }
            if (r10 == 0) goto L_0x031b
            r10 = r7
            X.1mK r10 = (X.C30361mK) r10     // Catch:{ all -> 0x08bf }
            r10.A00 = r0     // Catch:{ all -> 0x08bf }
            r10.A01 = r0     // Catch:{ all -> 0x08bf }
        L_0x031b:
            r7.A18 = r9     // Catch:{ all -> 0x08bf }
            r7.A15 = r9     // Catch:{ all -> 0x08bf }
            r12.A06(r7)     // Catch:{ all -> 0x08bf }
            goto L_0x06e3
        L_0x0324:
            boolean r0 = r7 instanceof X.C30471mV     // Catch:{ all -> 0x08bf }
            if (r0 == 0) goto L_0x030b
            r0 = r7
            X.1mV r0 = (X.C30471mV) r0     // Catch:{ all -> 0x08bf }
            r0.A05 = r9     // Catch:{ all -> 0x08bf }
            goto L_0x030b
        L_0x032e:
            boolean r0 = r6 instanceof X.C30471mV     // Catch:{ all -> 0x08bf }
            if (r0 == 0) goto L_0x0341
            r1 = r6
            X.1mV r1 = (X.C30471mV) r1     // Catch:{ all -> 0x08bf }
            X.33d r0 = r3.A0b     // Catch:{ all -> 0x08bf }
            r0.A0E(r1, r2, r4)     // Catch:{ all -> 0x08bf }
            X.30m r0 = r3.A0H     // Catch:{ all -> 0x08bf }
            r11 = r35
            r0.A09(r1, r11, r4)     // Catch:{ all -> 0x08bf }
        L_0x0341:
            X.30w r0 = r6.A0y()     // Catch:{ all -> 0x08bf }
            if (r0 == 0) goto L_0x034c
            X.30a r0 = r3.A0T     // Catch:{ all -> 0x08bf }
            r0.A02(r6)     // Catch:{ all -> 0x08bf }
        L_0x034c:
            r1 = 4096(0x1000, float:5.74E-42)
            int r0 = r6.A0A     // Catch:{ all -> 0x08bf }
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)     // Catch:{ all -> 0x08bf }
            if (r0 == 0) goto L_0x035e
            X.2q6 r11 = r3.A0P     // Catch:{ all -> 0x08bf }
            long r0 = r6.A1L     // Catch:{ all -> 0x08bf }
            r11.A01(r0)     // Catch:{ all -> 0x08bf }
        L_0x035e:
            X.33f r0 = r3.A0W     // Catch:{ all -> 0x08bf }
            long r11 = r6.A1L     // Catch:{ all -> 0x08bf }
            X.3Ll r0 = r0.A0P     // Catch:{ all -> 0x08bf }
            X.3dV r0 = r0.A03     // Catch:{ all -> 0x08bf }
            X.4Fq r1 = r0.A04()     // Catch:{ all -> 0x08bf }
            java.lang.String[] r13 = new java.lang.String[r2]     // Catch:{ all -> 0x08b5 }
            X.AnonymousClass0x2.A1S(r13, r4, r11)     // Catch:{ all -> 0x08b5 }
            java.lang.String r14 = "message_add_on.parent_message_row_id = ?"
            r0 = r1
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x08b5 }
            X.2sg r12 = r0.A03     // Catch:{ all -> 0x08b5 }
            java.lang.String r11 = "message_add_on"
            java.lang.String r0 = "MessageAddOnStore/deleteMessageAddOnsForParentMessage"
            r12.A07(r11, r14, r0, r13)     // Catch:{ all -> 0x08b5 }
            r1.close()     // Catch:{ all -> 0x08bf }
            X.2zm r1 = r3.A0J     // Catch:{ all -> 0x08bf }
            r0 = r19
            r1.A02(r0, r6, r2, r2)     // Catch:{ all -> 0x08bf }
            boolean r0 = r8.A02     // Catch:{ all -> 0x08bf }
            if (r0 == 0) goto L_0x0395
            r30.get()     // Catch:{ all -> 0x08bf }
            boolean r0 = X.C624134x.A0b(r7)     // Catch:{ all -> 0x08bf }
            r14 = 1
            if (r0 == 0) goto L_0x0396
        L_0x0395:
            r14 = 0
        L_0x0396:
            X.2sC r13 = r3.A0G     // Catch:{ all -> 0x08bf }
            X.3dV r0 = r13.A05     // Catch:{ all -> 0x08bf }
            X.4Fq r1 = r0.A04()     // Catch:{ all -> 0x08bf }
            android.content.ContentValues r0 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x08b5 }
            java.lang.String r12 = r8.A01     // Catch:{ all -> 0x08b5 }
            java.lang.String r11 = "key_id"
            r0.put(r11, r12)     // Catch:{ all -> 0x08b5 }
            java.lang.Long r12 = X.AnonymousClass0x2.A0T()     // Catch:{ all -> 0x08b5 }
            java.lang.String r11 = "starred"
            r0.put(r11, r12)     // Catch:{ all -> 0x08b5 }
            int r11 = r7.A0D     // Catch:{ all -> 0x08b5 }
            X.C18280x3.A0m(r0, r11)     // Catch:{ all -> 0x08b5 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x08b5 }
            java.lang.String r11 = "broadcast"
            r0.put(r11, r12)     // Catch:{ all -> 0x08b5 }
            java.lang.String r12 = "participant_hash"
            java.lang.String r11 = r7.A14     // Catch:{ all -> 0x08b5 }
            X.C621833x.A02(r0, r12, r11)     // Catch:{ all -> 0x08b5 }
            X.C624134x.A0E(r0, r7)     // Catch:{ all -> 0x08b5 }
            long r11 = r7.A0I     // Catch:{ all -> 0x08b5 }
            X.C621833x.A00(r0, r7, r11)     // Catch:{ all -> 0x08b5 }
            X.C624134x.A0J(r0, r7)     // Catch:{ all -> 0x08b5 }
            X.C624134x.A0G(r0, r7)     // Catch:{ all -> 0x08b5 }
            X.2pu r11 = r7.A0t()     // Catch:{ all -> 0x08b5 }
            if (r11 == 0) goto L_0x03ef
            X.2pu r11 = r7.A0t()     // Catch:{ all -> 0x08b5 }
            boolean r11 = r11 instanceof X.C30211m5     // Catch:{ all -> 0x08b5 }
            if (r11 == 0) goto L_0x03ef
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x08b5 }
            java.lang.String r11 = "view_mode"
            r0.put(r11, r12)     // Catch:{ all -> 0x08b5 }
        L_0x03ef:
            java.lang.String[] r11 = X.AnonymousClass0x9.A1a()     // Catch:{ all -> 0x08b5 }
            X.2sm r13 = r13.A03     // Catch:{ all -> 0x08b5 }
            X.C626936e.A06(r21)     // Catch:{ all -> 0x08b5 }
            r12 = r21
            X.C56922sm.A02(r13, r12, r11, r4)     // Catch:{ all -> 0x08b5 }
            if (r14 == 0) goto L_0x0402
            java.lang.String r12 = "1"
            goto L_0x0404
        L_0x0402:
            java.lang.String r12 = "0"
        L_0x0404:
            r11[r2] = r12     // Catch:{ all -> 0x08b5 }
            r12 = r28
            java.lang.String r13 = r12.A01     // Catch:{ all -> 0x08b5 }
            r12 = 2
            X.2sg r21 = X.AnonymousClass3H0.A04(r13, r1, r11, r12)     // Catch:{ all -> 0x08b5 }
            java.lang.String r23 = "message"
            java.lang.String r24 = "chat_row_id = ? AND from_me = ? AND key_id = ?"
            java.lang.String r25 = "REVOKE_MAIN_MESSAGE_SQL"
            r22 = r0
            r26 = r11
            r21.A05(r22, r23, r24, r25, r26)     // Catch:{ all -> 0x08b5 }
            r1.close()     // Catch:{ all -> 0x08bf }
            boolean r0 = r7 instanceof X.C30441mS     // Catch:{ all -> 0x08bf }
            if (r0 == 0) goto L_0x042b
            X.2gv r1 = r3.A0f     // Catch:{ all -> 0x08bf }
            r0 = r7
            X.1mS r0 = (X.C30441mS) r0     // Catch:{ all -> 0x08bf }
            r1.A01(r0)     // Catch:{ all -> 0x08bf }
        L_0x042b:
            boolean r0 = r6 instanceof X.AnonymousClass4FG     // Catch:{ all -> 0x08bf }
            if (r0 == 0) goto L_0x044e
            X.302 r0 = r3.A0S     // Catch:{ all -> 0x08bf }
            long r11 = r6.A1L     // Catch:{ all -> 0x08bf }
            X.3dV r0 = r0.A01     // Catch:{ all -> 0x08bf }
            X.4Fq r1 = r0.A04()     // Catch:{ all -> 0x08bf }
            r0 = r1
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x08b5 }
            X.2sg r14 = r0.A03     // Catch:{ all -> 0x08b5 }
            java.lang.String r13 = "message_template"
            java.lang.String[] r0 = new java.lang.String[r2]     // Catch:{ all -> 0x08b5 }
            X.AnonymousClass0x2.A1S(r0, r4, r11)     // Catch:{ all -> 0x08b5 }
            java.lang.String r11 = "DELETE_MESSAGE_TEMPLATE_BY_MESSAGE_ID"
            r14.A07(r13, r9, r11, r0)     // Catch:{ all -> 0x08b5 }
            r1.close()     // Catch:{ all -> 0x08bf }
        L_0x044e:
            r0 = r19
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x08bf }
            X.2sg r12 = r0.A03     // Catch:{ all -> 0x08bf }
            java.lang.String r11 = "message_media"
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch:{ all -> 0x08bf }
            X.C624134x.A0Y(r6, r1, r4)     // Catch:{ all -> 0x08bf }
            java.lang.String r0 = "revokeMessageOnCurrentThread/DELETE_MESSAGE_MEDIA"
            r12.A07(r11, r9, r0, r1)     // Catch:{ all -> 0x08bf }
            java.lang.String r11 = "message_streaming_sidecar"
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch:{ all -> 0x08bf }
            X.C624134x.A0Y(r6, r1, r4)     // Catch:{ all -> 0x08bf }
            java.lang.String r0 = "revokeMessageOnCurrentThread/DELETE_MESSAGE_STREAMING_SIDECAR"
            r12.A07(r11, r9, r0, r1)     // Catch:{ all -> 0x08bf }
            java.lang.String r11 = "mms_thumbnail_metadata"
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch:{ all -> 0x08bf }
            X.C624134x.A0Y(r6, r1, r4)     // Catch:{ all -> 0x08bf }
            java.lang.String r0 = "revokeMessageOnCurrentThread/DELETE_MMS_THUMBNAIL_METADATA"
            r12.A07(r11, r9, r0, r1)     // Catch:{ all -> 0x08bf }
            java.lang.String r11 = "audio_data"
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch:{ all -> 0x08bf }
            X.C624134x.A0Y(r6, r1, r4)     // Catch:{ all -> 0x08bf }
            java.lang.String r0 = "revokeMessageOnCurrentThread/DELETE_AUDIO_DATA"
            r12.A07(r11, r9, r0, r1)     // Catch:{ all -> 0x08bf }
            java.lang.String r11 = "message_location"
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch:{ all -> 0x08bf }
            X.C624134x.A0Y(r6, r1, r4)     // Catch:{ all -> 0x08bf }
            java.lang.String r0 = "revokeMessageOnCurrentThread/DELETE_MESSAGE_LOCATION"
            r12.A07(r11, r9, r0, r1)     // Catch:{ all -> 0x08bf }
            java.lang.String r11 = "message_template"
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch:{ all -> 0x08bf }
            X.C624134x.A0Y(r6, r1, r4)     // Catch:{ all -> 0x08bf }
            java.lang.String r0 = "revokeMessageOnCurrentThread/DELETE_MESSAGE_TEMPLATE"
            r12.A07(r11, r9, r0, r1)     // Catch:{ all -> 0x08bf }
            java.lang.String r11 = "message_template_button"
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch:{ all -> 0x08bf }
            X.C624134x.A0Y(r6, r1, r4)     // Catch:{ all -> 0x08bf }
            java.lang.String r0 = "revokeMessageOnCurrentThread/DELETE_MESSAGE_TEMPLATE_BUTTON"
            r12.A07(r11, r9, r0, r1)     // Catch:{ all -> 0x08bf }
            java.lang.String r11 = "message_quoted"
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch:{ all -> 0x08bf }
            X.C624134x.A0Y(r6, r1, r4)     // Catch:{ all -> 0x08bf }
            java.lang.String r0 = "revokeMessageOnCurrentThread/DELETE_MESSAGE_QUOTED"
            r12.A07(r11, r9, r0, r1)     // Catch:{ all -> 0x08bf }
            java.lang.String r11 = "message_mentions"
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch:{ all -> 0x08bf }
            X.C624134x.A0Y(r6, r1, r4)     // Catch:{ all -> 0x08bf }
            java.lang.String r0 = "revokeMessageOnCurrentThread/DELETE_MESSAGE_MENTIONS"
            r12.A07(r11, r9, r0, r1)     // Catch:{ all -> 0x08bf }
            java.lang.String r11 = "message_product"
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch:{ all -> 0x08bf }
            X.C624134x.A0Y(r6, r1, r4)     // Catch:{ all -> 0x08bf }
            java.lang.String r0 = "revokeMessageOnCurrentThread/DELETE_MESSAGE_PRODUCT"
            r12.A07(r11, r10, r0, r1)     // Catch:{ all -> 0x08bf }
            java.lang.String r11 = "message_link"
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch:{ all -> 0x08bf }
            X.C624134x.A0Y(r6, r1, r4)     // Catch:{ all -> 0x08bf }
            java.lang.String r0 = "revokeMessageOnCurrentThread/DELETE_MESSAGE_LINK"
            r12.A07(r11, r9, r0, r1)     // Catch:{ all -> 0x08bf }
            java.lang.String r11 = "message_future"
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch:{ all -> 0x08bf }
            X.C624134x.A0Y(r6, r1, r4)     // Catch:{ all -> 0x08bf }
            java.lang.String r0 = "revokeMessageOnCurrentThread/DELETE_MESSAGE_FUTURE"
            r12.A07(r11, r9, r0, r1)     // Catch:{ all -> 0x08bf }
            java.lang.String r11 = "message_system"
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch:{ all -> 0x08bf }
            X.C624134x.A0Y(r6, r1, r4)     // Catch:{ all -> 0x08bf }
            java.lang.String r0 = "revokeMessageOnCurrentThread/DELETE_MESSAGE_SYSTEM"
            r12.A07(r11, r9, r0, r1)     // Catch:{ all -> 0x08bf }
            java.lang.String r11 = "message_text"
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch:{ all -> 0x08bf }
            X.C624134x.A0Y(r6, r1, r4)     // Catch:{ all -> 0x08bf }
            java.lang.String r0 = "revokeMessageOnCurrentThread/DELETE_MESSAGE_TEXT"
            r12.A07(r11, r9, r0, r1)     // Catch:{ all -> 0x08bf }
            java.lang.String r11 = "message_send_count"
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch:{ all -> 0x08bf }
            X.C624134x.A0Y(r6, r1, r4)     // Catch:{ all -> 0x08bf }
            java.lang.String r0 = "revokeMessageOnCurrentThread/DELETE_MESSAGE_SEND_COUNT"
            r12.A07(r11, r9, r0, r1)     // Catch:{ all -> 0x08bf }
            java.lang.String r11 = "message_ephemeral_setting"
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch:{ all -> 0x08bf }
            X.C624134x.A0Y(r6, r1, r4)     // Catch:{ all -> 0x08bf }
            java.lang.String r0 = "revokeMessageOnCurrentThread/DELETE_MESSAGE_EPHEMERAL_SETTING"
            r12.A07(r11, r9, r0, r1)     // Catch:{ all -> 0x08bf }
            java.lang.String r13 = "message_ftsv2"
            java.lang.String r11 = "docid = ?"
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch:{ all -> 0x08bf }
            X.C624134x.A0X(r6, r1)     // Catch:{ all -> 0x08bf }
            java.lang.String r0 = "revokeMessageOnCurrentThread/DELETE_MESSAGE_FTS"
            r12.A07(r13, r11, r0, r1)     // Catch:{ all -> 0x08bf }
            java.lang.String r11 = "played_self_receipt"
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch:{ all -> 0x08bf }
            X.C624134x.A0Y(r6, r1, r4)     // Catch:{ all -> 0x08bf }
            java.lang.String r0 = "revokeMessageOnCurrentThread/DELETE_PLAYED_SELF_RECEIPT"
            r12.A07(r11, r10, r0, r1)     // Catch:{ all -> 0x08bf }
            java.lang.String r11 = "message_poll"
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch:{ all -> 0x08bf }
            X.C624134x.A0Y(r6, r1, r4)     // Catch:{ all -> 0x08bf }
            java.lang.String r0 = "revokeMessageOnCurrentThread/DELETE_MESSAGE_POLL"
            r12.A07(r11, r10, r0, r1)     // Catch:{ all -> 0x08bf }
            java.lang.String r11 = "message_secret"
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch:{ all -> 0x08bf }
            X.C624134x.A0Y(r6, r1, r4)     // Catch:{ all -> 0x08bf }
            java.lang.String r0 = "revokeMessageOnCurrentThread/DELETE_MESSAGE_SECRET"
            r12.A07(r11, r10, r0, r1)     // Catch:{ all -> 0x08bf }
            java.lang.String r11 = "message_view_once_media"
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch:{ all -> 0x08bf }
            X.C624134x.A0Y(r6, r1, r4)     // Catch:{ all -> 0x08bf }
            java.lang.String r0 = "revokeMessageOnCurrentThread/DELETE_MESSAGE_VIEW_ONCE"
            r12.A07(r11, r10, r0, r1)     // Catch:{ all -> 0x08bf }
            java.lang.String r11 = "message_event"
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch:{ all -> 0x08bf }
            X.C624134x.A0Y(r6, r1, r4)     // Catch:{ all -> 0x08bf }
            java.lang.String r0 = "revokeMessageOnCurrentThread/DELETE_MESSAGE_EVENT"
            r12.A07(r11, r10, r0, r1)     // Catch:{ all -> 0x08bf }
            X.35R r10 = r3.A0E     // Catch:{ all -> 0x08bf }
            long r0 = r6.A1L     // Catch:{ all -> 0x08bf }
            X.3dV r12 = r10.A01     // Catch:{ all -> 0x08bf }
            X.4Fq r14 = r12.A04()     // Catch:{ all -> 0x08bf }
            r10 = r14
            X.3H0 r10 = (X.AnonymousClass3H0) r10     // Catch:{ all -> 0x08b0 }
            X.2sg r13 = r10.A03     // Catch:{ all -> 0x08b0 }
            java.lang.String r11 = "DELETE FROM message_ui_elements WHERE message_row_id = ?"
            java.lang.String[] r10 = new java.lang.String[r2]     // Catch:{ all -> 0x08b0 }
            X.C18280x3.A1R(r10, r4, r0)     // Catch:{ all -> 0x08b0 }
            java.lang.String r0 = "DELETE_MESSAGE_UI_ELEMENTS_BY_MESSAGE_ROW_IS_SQL"
            r13.A0I(r11, r0, r10)     // Catch:{ all -> 0x08b0 }
            r14.close()     // Catch:{ all -> 0x08bf }
            byte r10 = r6.A1I     // Catch:{ all -> 0x08bf }
            r0 = 4
            if (r10 == r0) goto L_0x062e
            r0 = 14
            if (r10 == r0) goto L_0x062e
            r0 = 24
            if (r10 == r0) goto L_0x0614
            r0 = 44
            if (r10 == r0) goto L_0x05f9
            r0 = 46
            if (r10 == r0) goto L_0x05e2
            r0 = 94
            if (r10 != r0) goto L_0x0684
            X.2g2 r0 = r3.A0d     // Catch:{ all -> 0x08bf }
            java.lang.String[] r13 = new java.lang.String[r2]     // Catch:{ all -> 0x08bf }
            X.C624134x.A0Y(r6, r13, r4)     // Catch:{ all -> 0x08bf }
            java.lang.String r12 = "message_row_id = ? "
            X.3dV r0 = r0.A02     // Catch:{ all -> 0x08bf }
            X.4Fq r11 = r0.A04()     // Catch:{ all -> 0x08bf }
            r0 = r11
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x05e0 }
            X.2sg r10 = r0.A03     // Catch:{ all -> 0x05e0 }
            java.lang.String r1 = "message_newsletter_admin_invite"
            java.lang.String r0 = "DELETE_NEWSLETTER_ADMIN_INVITE_MESSAGE_BY_ROW_ID_SQL"
            r10.A07(r1, r12, r0, r13)     // Catch:{ all -> 0x05e0 }
            r11.close()     // Catch:{ all -> 0x08bf }
            goto L_0x0684
        L_0x05e0:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0812 }
        L_0x05e2:
            X.4Fq r13 = r12.A04()     // Catch:{ all -> 0x08bf }
            r0 = r13
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x06ab }
            X.2sg r11 = r0.A03     // Catch:{ all -> 0x06ab }
            java.lang.String r10 = "DELETE FROM message_ui_elements_reply WHERE message_row_id = ?"
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch:{ all -> 0x06ab }
            X.C624134x.A0X(r6, r1)     // Catch:{ all -> 0x06ab }
            java.lang.String r0 = "DELETE_REPLY_MESSAGE_BY_ROW_ID_SQL"
            r11.A0I(r10, r0, r1)     // Catch:{ all -> 0x06ab }
            goto L_0x0681
        L_0x05f9:
            X.2k0 r0 = r3.A0O     // Catch:{ all -> 0x08bf }
            X.3dV r0 = r0.A01     // Catch:{ all -> 0x08bf }
            X.4Fq r13 = r0.A04()     // Catch:{ all -> 0x08bf }
            r0 = r13
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x06ab }
            X.2sg r11 = r0.A03     // Catch:{ all -> 0x06ab }
            java.lang.String r10 = "message_order"
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch:{ all -> 0x06ab }
            X.C624134x.A0X(r6, r1)     // Catch:{ all -> 0x06ab }
            java.lang.String r0 = "DELETE_ORDER_MESSAGE_BY_ROW_ID_SQL"
            r11.A07(r10, r9, r0, r1)     // Catch:{ all -> 0x06ab }
            goto L_0x0681
        L_0x0614:
            X.2qs r0 = r3.A0C     // Catch:{ all -> 0x08bf }
            X.3dV r0 = r0.A02     // Catch:{ all -> 0x08bf }
            X.4Fq r13 = r0.A04()     // Catch:{ all -> 0x08bf }
            r0 = r13
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x06ab }
            X.2sg r11 = r0.A03     // Catch:{ all -> 0x06ab }
            java.lang.String r10 = "DELETE FROM message_group_invite WHERE message_row_id = ?"
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch:{ all -> 0x06ab }
            X.C624134x.A0X(r6, r1)     // Catch:{ all -> 0x06ab }
            java.lang.String r0 = "DELETE_GROUP_INVITE_MESSAGE_BY_ROW_ID_SQL"
            r11.A0I(r10, r0, r1)     // Catch:{ all -> 0x06ab }
            goto L_0x0681
        L_0x062e:
            X.30v r1 = r3.A0U     // Catch:{ all -> 0x08bf }
            r0 = 4
            if (r10 == r0) goto L_0x0641
            r0 = 14
            if (r10 == r0) goto L_0x0641
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x08bf }
            java.lang.String r0 = "VCardMessageStore/deleteVcardData attempted to deleteVcardData for non-contact message type="
            X.C18260x0.A0x(r0, r1, r10)     // Catch:{ all -> 0x08bf }
            goto L_0x0684
        L_0x0641:
            X.3dV r0 = r1.A0A     // Catch:{ all -> 0x08bf }
            X.4Fq r1 = r0.A04()     // Catch:{ all -> 0x08bf }
            X.3Yo r13 = r1.Axl()     // Catch:{ all -> 0x08b5 }
            r0 = r1
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x08a6 }
            X.2sg r12 = r0.A03     // Catch:{ all -> 0x08a6 }
            java.lang.String r11 = "message_vcard"
            java.lang.String[] r10 = new java.lang.String[r2]     // Catch:{ all -> 0x08a6 }
            X.C624134x.A0Y(r6, r10, r4)     // Catch:{ all -> 0x08a6 }
            java.lang.String r0 = "DELETE_VCARD_MESSAGE_BY_ROW_ID_SQL"
            r12.A07(r11, r9, r0, r10)     // Catch:{ all -> 0x08a6 }
            java.lang.String r11 = "message_media_vcard_count"
            java.lang.String[] r10 = new java.lang.String[r2]     // Catch:{ all -> 0x08a6 }
            X.C624134x.A0Y(r6, r10, r4)     // Catch:{ all -> 0x08a6 }
            java.lang.String r0 = "DELETE_BY_ROW_ID_SQL"
            r12.A07(r11, r9, r0, r10)     // Catch:{ all -> 0x08a6 }
            java.lang.String r11 = "message_vcard_jid"
            java.lang.String[] r10 = new java.lang.String[r2]     // Catch:{ all -> 0x08a6 }
            X.C624134x.A0Y(r6, r10, r4)     // Catch:{ all -> 0x08a6 }
            java.lang.String r0 = "DELETE_VCARD_JID_BY_MESSAGE_ROW_ID"
            r12.A07(r11, r9, r0, r10)     // Catch:{ all -> 0x08a6 }
            r13.A00()     // Catch:{ all -> 0x08a6 }
            r13.close()     // Catch:{ all -> 0x08b5 }
            r1.close()     // Catch:{ all -> 0x08bf }
            goto L_0x0684
        L_0x0681:
            r13.close()     // Catch:{ all -> 0x08bf }
        L_0x0684:
            r1 = 1024(0x400, float:1.435E-42)
            int r0 = r6.A0A     // Catch:{ all -> 0x08bf }
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)     // Catch:{ all -> 0x08bf }
            if (r0 == 0) goto L_0x06b4
            X.2e8 r10 = r3.A0A     // Catch:{ all -> 0x08bf }
            long r0 = r6.A1L     // Catch:{ all -> 0x08bf }
            X.3dV r10 = r10.A00     // Catch:{ all -> 0x08bf }
            X.4Fq r13 = r10.A04()     // Catch:{ all -> 0x08bf }
            r10 = r13
            X.3H0 r10 = (X.AnonymousClass3H0) r10     // Catch:{ all -> 0x06ab }
            X.2sg r12 = r10.A03     // Catch:{ all -> 0x06ab }
            java.lang.String r11 = "DELETE FROM message_external_ad_content WHERE message_row_id=?"
            java.lang.String[] r10 = new java.lang.String[r2]     // Catch:{ all -> 0x06ab }
            X.C18280x3.A1R(r10, r4, r0)     // Catch:{ all -> 0x06ab }
            java.lang.String r0 = "DELETE_EXTERNAL_AD_CONTENT_INFO_FOR_ROW_ID_SQL"
            r12.A0I(r11, r0, r10)     // Catch:{ all -> 0x06ab }
            goto L_0x06b1
        L_0x06ab:
            r4 = move-exception
            r13.close()     // Catch:{ all -> 0x08ba }
            goto L_0x08be
        L_0x06b1:
            r13.close()     // Catch:{ all -> 0x08bf }
        L_0x06b4:
            int r0 = r6.A0A     // Catch:{ all -> 0x08bf }
            r0 = r0 & 1
            boolean r0 = X.AnonymousClass000.A1U(r0, r2)     // Catch:{ all -> 0x08bf }
            if (r0 == 0) goto L_0x06e3
            X.2e9 r10 = r3.A0B     // Catch:{ all -> 0x08bf }
            long r0 = r6.A1L     // Catch:{ all -> 0x08bf }
            X.3dV r10 = r10.A00     // Catch:{ all -> 0x08bf }
            X.4Fq r13 = r10.A04()     // Catch:{ all -> 0x08bf }
            r10 = r13
            X.3H0 r10 = (X.AnonymousClass3H0) r10     // Catch:{ all -> 0x06da }
            X.2sg r12 = r10.A03     // Catch:{ all -> 0x06da }
            java.lang.String r11 = "message_forwarded"
            java.lang.String[] r10 = new java.lang.String[r2]     // Catch:{ all -> 0x06da }
            X.C18280x3.A1R(r10, r4, r0)     // Catch:{ all -> 0x06da }
            java.lang.String r0 = "DELETE_FORWARDING_SCORE_FOR_ROW_ID_SQL"
            r12.A07(r11, r9, r0, r10)     // Catch:{ all -> 0x06da }
            goto L_0x06e0
        L_0x06da:
            r4 = move-exception
            r13.close()     // Catch:{ all -> 0x08ba }
            goto L_0x08be
        L_0x06e0:
            r13.close()     // Catch:{ all -> 0x08bf }
        L_0x06e3:
            boolean r0 = r7 instanceof X.C30441mS     // Catch:{ all -> 0x08bf }
            if (r0 == 0) goto L_0x06ff
            if (r16 == 0) goto L_0x06ff
            boolean r0 = X.C624134x.A0g(r7)     // Catch:{ all -> 0x08bf }
            if (r0 == 0) goto L_0x06ff
            X.2pu r0 = r7.A0t()     // Catch:{ all -> 0x08bf }
            if (r0 == 0) goto L_0x06ff
            java.lang.String r0 = "EditMessageStore/inserting extra comment info data/to link revoke to thread"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x08bf }
            X.2zm r0 = r3.A0J     // Catch:{ all -> 0x08bf }
            r0.A03(r7)     // Catch:{ all -> 0x08bf }
        L_0x06ff:
            X.2sS r0 = X.C18320x8.A0I(r30)     // Catch:{ all -> 0x08bf }
            boolean r13 = r0.A05(r6)     // Catch:{ all -> 0x08bf }
            X.2kf r0 = r6.A0q()     // Catch:{ all -> 0x08bf }
            if (r0 == 0) goto L_0x07a0
            r30.get()     // Catch:{ all -> 0x08bf }
            boolean r1 = r6 instanceof X.C30481mW     // Catch:{ all -> 0x08bf }
            if (r1 == 0) goto L_0x0785
            boolean r1 = X.C57322tS.A00(r6)     // Catch:{ all -> 0x08bf }
            if (r1 == 0) goto L_0x0785
            X.2nF r1 = r6.A0r()     // Catch:{ all -> 0x08bf }
            if (r1 == 0) goto L_0x0785
            X.2kf r1 = r6.A0q()     // Catch:{ all -> 0x08bf }
            if (r1 == 0) goto L_0x0785
            X.2nF r1 = r6.A0r()     // Catch:{ all -> 0x08bf }
            if (r1 == 0) goto L_0x0730
            X.21g r1 = r1.A00     // Catch:{ all -> 0x08bf }
            if (r1 != 0) goto L_0x0785
        L_0x0730:
            X.8qC r1 = r3.A0h     // Catch:{ all -> 0x08bf }
            java.lang.Object r10 = r1.get()     // Catch:{ all -> 0x08bf }
            X.2hl r10 = (X.C50182hl) r10     // Catch:{ all -> 0x08bf }
            java.lang.String r11 = r0.A01     // Catch:{ all -> 0x08bf }
            X.2sS r1 = X.C18320x8.A0I(r30)     // Catch:{ all -> 0x08bf }
            java.util.Objects.requireNonNull(r1)     // Catch:{ all -> 0x08bf }
            r0 = 9
            X.4Jv r9 = new X.4Jv     // Catch:{ all -> 0x08bf }
            r9.<init>(r1, r0)     // Catch:{ all -> 0x08bf }
            java.util.List r0 = r10.A00(r11)     // Catch:{ all -> 0x08bf }
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x08bf }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ all -> 0x08bf }
        L_0x0754:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x08bf }
            if (r0 == 0) goto L_0x076c
            java.lang.Object r0 = r12.next()     // Catch:{ all -> 0x08bf }
            java.lang.Object r11 = r9.invoke(r0)     // Catch:{ all -> 0x08bf }
            boolean r11 = X.AnonymousClass001.A1Z(r11)     // Catch:{ all -> 0x08bf }
            if (r11 == 0) goto L_0x0754
            r1.add(r0)     // Catch:{ all -> 0x08bf }
            goto L_0x0754
        L_0x076c:
            java.util.ArrayList r1 = X.AnonymousClass002.A0J(r1)     // Catch:{ all -> 0x08bf }
            java.util.Iterator r9 = r1.iterator()     // Catch:{ all -> 0x08bf }
        L_0x0774:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x08bf }
            if (r0 == 0) goto L_0x079b
            X.34x r0 = X.C18300x5.A0T(r9)     // Catch:{ all -> 0x08bf }
            X.C162457s7.A0H(r0)     // Catch:{ all -> 0x08bf }
            r10.A01(r0)     // Catch:{ all -> 0x08bf }
            goto L_0x0774
        L_0x0785:
            X.2sS r0 = X.C18320x8.A0I(r30)     // Catch:{ all -> 0x08bf }
            boolean r0 = r0.A06(r6)     // Catch:{ all -> 0x08bf }
            if (r0 == 0) goto L_0x07a0
            X.8qC r0 = r3.A0h     // Catch:{ all -> 0x08bf }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x08bf }
            X.2hl r0 = (X.C50182hl) r0     // Catch:{ all -> 0x08bf }
            r0.A01(r6)     // Catch:{ all -> 0x08bf }
            goto L_0x07a0
        L_0x079b:
            X.3Lv r0 = r10.A06     // Catch:{ all -> 0x08bf }
            r0.A0l(r1, r4)     // Catch:{ all -> 0x08bf }
        L_0x07a0:
            boolean r0 = r8.A02     // Catch:{ all -> 0x08bf }
            if (r0 != 0) goto L_0x082b
            r0 = r29
            boolean r0 = X.C627636p.A0R(r0, r7)     // Catch:{ all -> 0x08bf }
            if (r0 != 0) goto L_0x082b
            byte r1 = r7.A1I     // Catch:{ all -> 0x08bf }
            r0 = 83
            if (r1 != r0) goto L_0x07bd
            X.4uZ r1 = r7.A0Q     // Catch:{ all -> 0x08bf }
            r0 = r29
            boolean r0 = r0.A0a(r1)     // Catch:{ all -> 0x08bf }
            if (r0 == 0) goto L_0x07bd
            goto L_0x082b
        L_0x07bd:
            if (r13 != 0) goto L_0x082b
            X.33Y r0 = r3.A0c     // Catch:{ all -> 0x08bf }
            r0.A04(r5)     // Catch:{ all -> 0x08bf }
            r5 = 6440(0x1928, float:9.024E-42)
            r1 = r27
            r0 = r20
            boolean r0 = r1.A0Y(r0, r5)     // Catch:{ all -> 0x08bf }
            if (r0 != 0) goto L_0x0891
            X.2sA r5 = r3.A05     // Catch:{ all -> 0x08bf }
            boolean r0 = r15.equals(r15)     // Catch:{ all -> 0x08bf }
            if (r0 != 0) goto L_0x07ec
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x08bf }
            java.lang.String r0 = "msgstore/onMessageDeletedInChat/unequalchatjid/"
            r1.append(r0)     // Catch:{ all -> 0x08bf }
            r1.append(r15)     // Catch:{ all -> 0x08bf }
            java.lang.String r0 = "/"
            X.C18260x0.A1S(r1, r0, r15)     // Catch:{ all -> 0x08bf }
            goto L_0x0891
        L_0x07ec:
            X.2ss r0 = r5.A00     // Catch:{ all -> 0x08bf }
            X.31A r8 = r0.A0A(r15, r4)     // Catch:{ all -> 0x08bf }
            if (r8 == 0) goto L_0x0891
            X.8qC r1 = r5.A02     // Catch:{ all -> 0x08bf }
            X.2UO r0 = X.C18310x6.A0Q(r1)     // Catch:{ all -> 0x08bf }
            X.2Xz r0 = r0.A0A     // Catch:{ all -> 0x08bf }
            boolean r0 = r0.A00(r6)     // Catch:{ all -> 0x08bf }
            if (r0 != 0) goto L_0x0891
            r1.get()     // Catch:{ all -> 0x08bf }
            int r0 = r8.A08     // Catch:{ all -> 0x08bf }
            if (r0 <= 0) goto L_0x0818
            int r0 = r0 + -1
            monitor-enter(r8)     // Catch:{ all -> 0x08bf }
            r8.A08 = r0     // Catch:{ all -> 0x080f }
            goto L_0x0817
        L_0x080f:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x08bf }
            goto L_0x0816
        L_0x0812:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r11, r1)     // Catch:{ all -> 0x08bf }
        L_0x0816:
            throw r0     // Catch:{ all -> 0x08bf }
        L_0x0817:
            monitor-exit(r8)     // Catch:{ all -> 0x08bf }
        L_0x0818:
            X.2UO r0 = X.C18310x6.A0Q(r1)     // Catch:{ all -> 0x08bf }
            X.2m9 r4 = r0.A09     // Catch:{ all -> 0x08bf }
            r0 = 13
            X.3Zw r1 = new X.3Zw     // Catch:{ all -> 0x08bf }
            r1.<init>(r5, r0, r8)     // Catch:{ all -> 0x08bf }
            r0 = 55
            r4.A01(r1, r0)     // Catch:{ all -> 0x08bf }
            goto L_0x0891
        L_0x082b:
            if (r17 == 0) goto L_0x083b
            java.lang.String r0 = "deleted self status, calling refreshMyStatusAndNotifyAboutStatusDeletion"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x08bf }
            X.3Lv r1 = r3.A08     // Catch:{ all -> 0x08bf }
            java.util.List r0 = java.util.Collections.singletonList(r7)     // Catch:{ all -> 0x08bf }
            r1.A0j(r0)     // Catch:{ all -> 0x08bf }
        L_0x083b:
            if (r16 != 0) goto L_0x083e
            goto L_0x0840
        L_0x083e:
            r4 = 0
            goto L_0x084d
        L_0x0840:
            X.2pF r0 = r3.A0I     // Catch:{ all -> 0x08bf }
            java.util.Map r0 = r0.A02     // Catch:{ all -> 0x08bf }
            r0.put(r8, r7)     // Catch:{ all -> 0x08bf }
            X.3Lp r0 = r3.A0K     // Catch:{ all -> 0x08bf }
            java.util.Set r4 = r0.A05(r7)     // Catch:{ all -> 0x08bf }
        L_0x084d:
            X.2o2 r1 = r3.A0Q     // Catch:{ all -> 0x08bf }
            r1.A01(r6)     // Catch:{ all -> 0x08bf }
            if (r4 == 0) goto L_0x085d
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x08bf }
            if (r0 != 0) goto L_0x085d
            r1.A02(r7, r4)     // Catch:{ all -> 0x08bf }
        L_0x085d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x08bf }
            java.lang.String r0 = "msgstore/revoke/outgoing-message original="
            r1.append(r0)     // Catch:{ all -> 0x08bf }
            r0 = r28
            r1.append(r0)     // Catch:{ all -> 0x08bf }
            java.lang.String r0 = "; editMessage="
            X.C18260x0.A1P(r1, r0, r8)     // Catch:{ all -> 0x08bf }
            if (r34 == 0) goto L_0x0891
            if (r16 == 0) goto L_0x0891
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x08bf }
            java.lang.String r0 = "msgstore/revoke/incoming-message ack the revoke message from peer or admin, key="
            r1.append(r0)     // Catch:{ all -> 0x08bf }
            r1.append(r8)     // Catch:{ all -> 0x08bf }
            java.lang.String r0 = "; media_wa_type="
            r1.append(r0)     // Catch:{ all -> 0x08bf }
            byte r0 = r7.A1I     // Catch:{ all -> 0x08bf }
            X.C18260x0.A1F(r1, r0)     // Catch:{ all -> 0x08bf }
            X.33Y r0 = r3.A0c     // Catch:{ all -> 0x08bf }
            r0.A04(r5)     // Catch:{ all -> 0x08bf }
        L_0x0891:
            r18.A00()     // Catch:{ all -> 0x08bf }
            r0 = 4
            X.3aL r1 = new X.3aL     // Catch:{ all -> 0x08bf }
            r1.<init>(r3, r6, r7, r0)     // Catch:{ all -> 0x08bf }
            r0 = r19
            r0.B25(r1)     // Catch:{ all -> 0x08bf }
            r18.close()     // Catch:{ all -> 0x08c9 }
            r19.close()     // Catch:{ IOException -> 0x08d3 }
            goto L_0x08de
        L_0x08a6:
            r4 = move-exception
            r13.close()     // Catch:{ all -> 0x08ab }
            goto L_0x08af
        L_0x08ab:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch:{ all -> 0x08b5 }
        L_0x08af:
            throw r4     // Catch:{ all -> 0x08b5 }
        L_0x08b0:
            r4 = move-exception
            r14.close()     // Catch:{ all -> 0x08ba }
            goto L_0x08be
        L_0x08b5:
            r4 = move-exception
            r1.close()     // Catch:{ all -> 0x08ba }
            goto L_0x08be
        L_0x08ba:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch:{ all -> 0x08bf }
        L_0x08be:
            throw r4     // Catch:{ all -> 0x08bf }
        L_0x08bf:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x08c4 }
            goto L_0x08c8
        L_0x08c4:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x08c9 }
        L_0x08c8:
            throw r1     // Catch:{ all -> 0x08c9 }
        L_0x08c9:
            r1 = move-exception
            r19.close()     // Catch:{ all -> 0x08ce }
            goto L_0x08d2
        L_0x08ce:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x08d3 }
        L_0x08d2:
            throw r1     // Catch:{ IOException -> 0x08d3 }
        L_0x08d3:
            r4 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "msgstore/revoke: Failed to re-insert revoked message:"
            X.C18260x0.A16(r0, r1, r4)
        L_0x08de:
            X.2ss r1 = r3.A07
            r0 = r29
            X.C627636p.A0F(r0, r1, r6)
            X.2hU r4 = r3.A0D
            android.os.Handler r1 = r4.A00
            r0 = 5
            r5 = r33
            X.C18300x5.A16(r1, r7, r0, r5)
            android.os.Handler r1 = r4.A01
            r0 = 31
            X.C70093Zw.A00(r1, r3, r6, r0)
            android.os.Handler r4 = r4.A02
            r0 = 32
            X.3Zw r1 = new X.3Zw
            r1.<init>(r3, r0, r7)
            goto L_0x013b
        L_0x0901:
            boolean r0 = r5 instanceof X.C30971nX
            if (r0 == 0) goto L_0x00ed
            r0 = r5
            X.1nX r0 = (X.C30971nX) r0
            r0.A02 = r1
            goto L_0x00ed
        L_0x090c:
            if (r16 == 0) goto L_0x0145
            if (r34 == 0) goto L_0x0145
            X.4uZ r10 = r5.A0n()
            boolean r0 = r10 instanceof X.AnonymousClass1fX
            if (r0 != 0) goto L_0x0145
            boolean r0 = r10 instanceof X.AnonymousClass1fY
            if (r0 != 0) goto L_0x0145
            boolean r0 = r5 instanceof X.C30961nV
            if (r0 == 0) goto L_0x0947
            r0 = r5
            X.1nV r0 = (X.C30961nV) r0
            com.whatsapp.jid.UserJid r6 = r0.A00
        L_0x0925:
            long r0 = r5.A0K
            java.lang.String r13 = A00(r5)
            r14 = 0
            X.2TJ r9 = new X.2TJ
            r16 = r4
            r11 = r6
            r12 = r8
            r15 = r4
            r17 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r3.A02(r9)
            boolean r0 = r5.A1o()
            if (r0 != 0) goto L_0x0145
            X.33Y r0 = r3.A0c
            r0.A04(r5)
            return r2
        L_0x0947:
            r6 = 0
            goto L_0x0925
        L_0x0949:
            java.lang.String r0 = "FMessageRevokedFactory/cloneMessageAndReplacingOriginalMessage message type not supported"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A0c(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass30G.A04(X.34x, int, boolean, boolean):boolean");
    }
}
