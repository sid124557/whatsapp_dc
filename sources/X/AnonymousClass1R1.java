package X;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1R1  reason: invalid class name */
public class AnonymousClass1R1 extends C56772sX implements C84924Eg {
    public AnonymousClass1RG A00;
    public AnonymousClass35T A01;
    public Set A02;
    public final C55682qk A03;
    public final C69263Wi A04;
    public final C56972sr A05;
    public final C29301ib A06;
    public final C46342bT A07;
    public final C64773Ex A08;
    public final C29421in A09;
    public final AnonymousClass5ZU A0A;
    public final C56512s6 A0B;
    public final C620633i A0C;
    public final C56612sH A0D;
    public final C54292oU A0E;
    public final AnonymousClass5ZR A0F;
    public final AnonymousClass33p A0G;
    public final C48502f0 A0H;
    public final C56982ss A0I;
    public final C66473Lo A0J;
    public final C28891hw A0K;
    public final C60972zT A0L;
    public final C45932ao A0M;
    public final AnonymousClass1VX A0N;
    public final AnonymousClass3LP A0O;
    public final C29241iV A0P;
    public final C619632y A0Q;
    public final C29081iF A0R;
    public final C48772fR A0S;
    public final C622634i A0T;
    public final C187958y5 A0U;
    public final AnonymousClass2X6 A0V;
    public final Object A0W;
    public final String A0X;
    public final Map A0Y;
    public final boolean A0Z;

    public synchronized AnonymousClass1RG A0G() {
        if (this.A00 == null) {
            C54292oU r4 = this.A0E;
            AnonymousClass1RG r2 = new AnonymousClass1RG(this.A03, r4, this.A0L, this.A0M, this.A0X);
            this.A00 = r2;
            if (this.A0Z) {
                AnonymousClass35T r1 = this.A01;
                AnonymousClass3ZU r0 = r2.A03;
                C626936e.A06(r1);
                r0.A01.add(r1);
            }
        }
        return this.A00;
    }

    public Long A0N(C95814uZ r4) {
        return A0P(r4, 0, false);
    }

    public Map A0Q() {
        Cursor A012;
        LinkedHashMap A0C2 = C18330xA.A0C(3);
        synchronized (this.A0W) {
            try {
                AnonymousClass4GK A022 = C18630y0.A02(this);
                try {
                    A012 = C56862sg.A01(((AnonymousClass3H0) A022).A03, "SELECT jid, pinned_time FROM settings WHERE pinned != 0 ORDER BY pinned_time DESC", "getPinnedJids/QUERY_CHAT_SETTINGS");
                    int columnIndex = A012.getColumnIndex("jid");
                    int columnIndex2 = A012.getColumnIndex("pinned_time");
                    while (A012.moveToNext()) {
                        C95814uZ A0K2 = AnonymousClass0x2.A0K(A012, columnIndex);
                        long j = A012.getLong(columnIndex2);
                        if (A0K2 != null) {
                            AnonymousClass0x2.A1J(A0K2, A0C2, j);
                        }
                    }
                    A012.close();
                    A022.close();
                    if (this.A0N.A0Y(C58422vE.A01, 6045)) {
                        this.A02 = A0C2.keySet();
                    }
                } catch (Throwable th) {
                    A022.close();
                    throw th;
                }
            } catch (SQLiteDatabaseCorruptException e) {
                Log.i("chat-settings-store/get-pinned-jids", e);
                A0T();
                throw e;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        return A0C2;
        throw th;
    }

    public synchronized void A0W() {
        AnonymousClass1RG r0 = this.A00;
        if (r0 != null) {
            r0.close();
            if (this.A0Z) {
                AnonymousClass1RG r02 = this.A00;
                AnonymousClass35T r1 = this.A01;
                AnonymousClass3ZU r03 = r02.A03;
                C626936e.A06(r1);
                r03.A01.remove(r1);
            }
            this.A00 = null;
        }
    }

    public AnonymousClass1R1(C55682qk r2, C69263Wi r3, C56972sr r4, C29301ib r5, C46342bT r6, C64773Ex r7, C29421in r8, AnonymousClass5ZU r9, C56512s6 r10, C620633i r11, C56612sH r12, C54292oU r13, AnonymousClass5ZR r14, AnonymousClass33p r15, C48502f0 r16, C42822Pq r17, C56982ss r18, C66473Lo r19, C28891hw r20, C60972zT r21, C45932ao r22, AnonymousClass1VX r23, AnonymousClass3LP r24, C29241iV r25, C619632y r26, C29081iF r27, C48772fR r28, C622634i r29, C187958y5 r30, AnonymousClass2X6 r31, String str, boolean z) {
        super(r17);
        this.A0Y = AnonymousClass0x9.A1D();
        this.A02 = null;
        this.A0W = AnonymousClass002.A0D();
        this.A0E = r13;
        this.A0D = r12;
        this.A0N = r23;
        this.A04 = r3;
        this.A03 = r2;
        this.A0T = r29;
        this.A05 = r4;
        this.A0I = r18;
        this.A0O = r24;
        this.A0M = r22;
        this.A08 = r7;
        this.A0U = r30;
        this.A0C = r11;
        this.A0A = r9;
        this.A0H = r16;
        this.A07 = r6;
        this.A09 = r8;
        this.A0B = r10;
        this.A06 = r5;
        this.A0R = r27;
        this.A0F = r14;
        this.A0G = r15;
        this.A0K = r20;
        this.A0V = r31;
        this.A0L = r21;
        this.A0S = r28;
        this.A0Q = r26;
        this.A0J = r19;
        this.A0P = r25;
        this.A0X = str;
        this.A0Z = z;
        A0V();
    }

    public static final boolean A02(C56802sa r6) {
        String str = r6.A0E;
        if ("group_chat_defaults".equals(str) || "individual_chat_defaults".equals(str) || r6.A04 != 0 || r6.A0K || r6.A0J) {
            return false;
        }
        C56802sa A022 = r6.A02();
        if (!TextUtils.equals(r6.A07(), A022.A07()) || !TextUtils.equals(r6.A08(), A022.A08()) || !TextUtils.equals(r6.A06(), A022.A06()) || !TextUtils.equals(r6.A05(), A022.A05()) || !TextUtils.equals(r6.A03(), A022.A03()) || !TextUtils.equals(r6.A04(), A022.A04()) || r6.A0A() != A022.A0A() || r6.A01 != 0 || r6.A02().A0G != A022.A02().A0G || r6.A07 != null || r6.A06 != null || r6.A0H || r6.A00 != 0 || r6.A02 != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0251, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        com.whatsapp.util.Log.e("chat-settings-store/backup failed", r2);
        r2 = new X.C60882zK("chat-settings");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0269, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x026a, code lost:
        r16.A0G().A0D();
        r8.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0274, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0251 A[ExcHandler: IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException (r2v2 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x00a4] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C60882zK A06(X.AnonymousClass22O r53) {
        /*
            r52 = this;
            r13 = r52
            X.2oU r12 = r13.A0E
            X.2sH r0 = r13.A0D
            r27 = r0
            X.1VX r0 = r13.A0N
            r38 = r0
            X.3Wi r0 = r13.A04
            r51 = r0
            X.2qk r0 = r13.A03
            r50 = r0
            X.34i r0 = r13.A0T
            r44 = r0
            X.2sr r0 = r13.A05
            r49 = r0
            X.2ss r0 = r13.A0I
            r21 = r0
            X.3LP r0 = r13.A0O
            r20 = r0
            X.2ao r0 = r13.A0M
            r19 = r0
            X.3Ex r0 = r13.A08
            r22 = r0
            X.8y5 r0 = r13.A0U
            r18 = r0
            X.33i r0 = r13.A0C
            r17 = r0
            X.5ZU r0 = r13.A0A
            r16 = r0
            X.2f0 r0 = r13.A0H
            r31 = r0
            X.2bT r15 = r13.A07
            X.1in r14 = r13.A09
            X.2s6 r0 = r13.A0B
            r25 = r0
            X.1ib r11 = r13.A06
            X.1iF r10 = r13.A0R
            X.5ZR r9 = r13.A0F
            X.33p r8 = r13.A0G
            X.1hw r7 = r13.A0K
            X.2X6 r6 = r13.A0V
            X.2zT r5 = r13.A0L
            X.2fR r0 = r13.A0S
            r43 = r0
            X.32y r4 = r13.A0Q
            X.3Lo r3 = r13.A0J
            X.1iV r2 = r13.A0P
            X.2Pq r1 = r13.A03
            java.lang.String r47 = "chatsettingsbackup.db"
            r48 = 0
            X.1R1 r0 = new X.1R1
            r23 = r14
            r24 = r16
            r26 = r17
            r28 = r12
            r29 = r9
            r30 = r8
            r32 = r1
            r33 = r21
            r34 = r3
            r35 = r7
            r36 = r5
            r37 = r19
            r39 = r20
            r40 = r2
            r41 = r4
            r42 = r10
            r45 = r18
            r46 = r6
            r16 = r0
            r17 = r50
            r18 = r51
            r19 = r49
            r20 = r11
            r21 = r15
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            X.1RG r1 = r13.A0G()
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r1.A05
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r8 = r1.writeLock()
            r8.lock()
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            java.lang.String r1 = "chat-settings-store/copy "
            r4.append(r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            X.1RG r3 = r13.A0G()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            X.2oU r1 = r3.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            android.content.Context r2 = r1.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            java.lang.String r1 = r3.A04     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            java.io.File r1 = r2.getDatabasePath(r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            r4.append(r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            java.lang.String r1 = " -> "
            r4.append(r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            X.1RG r3 = r0.A0G()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            X.2oU r1 = r3.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            android.content.Context r2 = r1.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            java.lang.String r1 = r3.A04     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            java.io.File r1 = r2.getDatabasePath(r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            X.C18260x0.A0o(r1, r4)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            X.4Fq r7 = X.C18630y0.A06(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0237, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            X.3Yo r6 = r7.Axl()     // Catch:{ all -> 0x022d }
            X.4GK r5 = X.C18630y0.A02(r13)     // Catch:{ all -> 0x0223 }
            r1 = r5
            X.3H0 r1 = (X.AnonymousClass3H0) r1     // Catch:{ all -> 0x0219 }
            X.2sg r3 = r1.A03     // Catch:{ all -> 0x0219 }
            java.lang.String r2 = X.C39332Bo.A00     // Catch:{ all -> 0x0219 }
            java.lang.String r1 = "copyChatSettingsDb/QUERY_CHAT_SETTINGS"
            android.database.Cursor r4 = X.C56862sg.A01(r3, r2, r1)     // Catch:{ all -> 0x0219 }
            r4.getCount()     // Catch:{ all -> 0x020d }
        L_0x00f0:
            boolean r1 = r4.moveToNext()     // Catch:{ all -> 0x020d }
            if (r1 == 0) goto L_0x0115
            X.2sa r3 = r13.A0K(r4)     // Catch:{ all -> 0x020d }
            java.lang.String r1 = r3.A0E     // Catch:{ all -> 0x020d }
            if (r1 == 0) goto L_0x010b
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x020d }
            java.lang.String r1 = "chat-settings-store/copy-chat-settings "
            X.C18260x0.A1R(r2, r1, r3)     // Catch:{ all -> 0x020d }
            r0.A0a(r3)     // Catch:{ all -> 0x020d }
            goto L_0x00f0
        L_0x010b:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x020d }
            java.lang.String r1 = "chat-settings-store/backup/null-jid/skipped "
            X.C18260x0.A1Q(r2, r1, r3)     // Catch:{ all -> 0x020d }
            goto L_0x00f0
        L_0x0115:
            r6.A00()     // Catch:{ all -> 0x020d }
            r4.close()     // Catch:{ all -> 0x0219 }
            r5.close()     // Catch:{ all -> 0x0223 }
            r6.close()     // Catch:{ all -> 0x022d }
            r7.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0237, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            java.lang.String r1 = "chat-settings-store/backup/close-backup-db"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            X.1RG r1 = r0.A0G()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            r1.A0E()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            X.1RG r1 = r0.A0G()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            r1.close()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            boolean r1 = r25.A06()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            if (r1 == 0) goto L_0x014b
            java.lang.String r1 = "chat-settings-store/backup/skip no media or read-only media"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            java.lang.String r1 = "chat-settings"
            X.2zK r2 = new X.2zK     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            r2.<init>(r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            goto L_0x025e
        L_0x014b:
            X.22O r1 = X.AnonymousClass22O.CRYPT13     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            r7 = r53
            if (r7 != r1) goto L_0x017d
            X.310 r1 = r13.A02     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            java.io.File r2 = r1.A02()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            java.lang.String r1 = "chatsettingsbackup.db.crypt1"
            java.io.File r5 = X.AnonymousClass002.A0A(r2, r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
        L_0x015d:
            java.io.File r1 = r13.A07(r7)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            java.util.ArrayList r1 = r13.A09(r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            java.util.Iterator r3 = r1.iterator()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
        L_0x0169:
            boolean r1 = r3.hasNext()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            if (r1 == 0) goto L_0x01a2
            java.io.File r2 = X.AnonymousClass0x9.A0f(r3)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            boolean r1 = r2.equals(r5)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            if (r1 != 0) goto L_0x0169
            X.C18270x1.A0x(r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            goto L_0x0169
        L_0x017d:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            java.lang.String r1 = "chatsettingsbackup.db.crypt"
            r2.append(r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            int r1 = r7.version     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            java.lang.String r2 = X.AnonymousClass000.A0h(r2, r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            X.22O r1 = X.AnonymousClass22O.UNENCRYPTED     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            if (r7 != r1) goto L_0x0197
            X.2eK r1 = r13.A04     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            java.io.File r5 = r1.A01(r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            goto L_0x015d
        L_0x0197:
            X.310 r1 = r13.A02     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            java.io.File r1 = r1.A02()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            java.io.File r5 = X.AnonymousClass002.A0A(r1, r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            goto L_0x015d
        L_0x01a2:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            java.lang.String r1 = "chat-settings-store/backup/to "
            X.C18260x0.A1R(r2, r1, r5)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            X.0WN r2 = r13.A01     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            X.2eK r1 = r13.A04     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            r4 = 0
            r24 = r4
            r14 = r49
            r15 = r4
            r16 = r2
            r17 = r25
            r18 = r31
            r19 = r1
            r20 = r43
            r21 = r7
            r22 = r44
            r23 = r5
            X.0UR r6 = X.AnonymousClass0S7.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            android.content.Context r1 = r12.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            boolean r1 = r6.A07(r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            if (r1 != 0) goto L_0x01df
            java.lang.String r1 = "chat-settings-store/backup/prepare for backup failed"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            java.lang.String r1 = "chat-settings"
            X.2zK r2 = new X.2zK     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            r2.<init>(r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            goto L_0x025e
        L_0x01df:
            X.1RG r3 = r0.A0G()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            X.2oU r1 = r3.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            android.content.Context r2 = r1.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            java.lang.String r1 = r3.A04     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            java.io.File r1 = r2.getDatabasePath(r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            r6.A06(r4, r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            java.io.File r1 = r13.A07(r7)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            long r13 = r13.A04(r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            java.lang.String r12 = "chat-settings"
            r15 = 1
            X.2zK r9 = new X.2zK     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            r10 = r5
            r11 = r4
            r9.<init>(r10, r11, r12, r13, r15)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            X.1RG r0 = r0.A0G()
            r0.A0D()
            r8.unlock()
            return r9
        L_0x020d:
            r2 = move-exception
            if (r4 == 0) goto L_0x0218
            r4.close()     // Catch:{ all -> 0x0214 }
            goto L_0x0218
        L_0x0214:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ all -> 0x0219 }
        L_0x0218:
            throw r2     // Catch:{ all -> 0x0219 }
        L_0x0219:
            r2 = move-exception
            r5.close()     // Catch:{ all -> 0x021e }
            goto L_0x0222
        L_0x021e:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ all -> 0x0223 }
        L_0x0222:
            throw r2     // Catch:{ all -> 0x0223 }
        L_0x0223:
            r2 = move-exception
            r6.close()     // Catch:{ all -> 0x0228 }
            goto L_0x022c
        L_0x0228:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ all -> 0x022d }
        L_0x022c:
            throw r2     // Catch:{ all -> 0x022d }
        L_0x022d:
            r2 = move-exception
            r7.close()     // Catch:{ all -> 0x0232 }
            goto L_0x0236
        L_0x0232:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0237, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
        L_0x0236:
            throw r2     // Catch:{ SQLiteDatabaseCorruptException -> 0x0237, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
        L_0x0237:
            r2 = move-exception
            java.lang.String r1 = "chat-settings-store/copy"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            java.lang.String r1 = "chat-settings-store/backup/failed-to-copy"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            X.1RG r1 = r0.A0G()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            r1.close()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            java.lang.String r1 = "chat-settings"
            X.2zK r2 = new X.2zK     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            r2.<init>(r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0251 }
            goto L_0x025e
        L_0x0251:
            r2 = move-exception
            java.lang.String r1 = "chat-settings-store/backup failed"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ all -> 0x0269 }
            java.lang.String r1 = "chat-settings"
            X.2zK r2 = new X.2zK     // Catch:{ all -> 0x0269 }
            r2.<init>(r1)     // Catch:{ all -> 0x0269 }
        L_0x025e:
            X.1RG r0 = r0.A0G()
            r0.A0D()
            r8.unlock()
            return r2
        L_0x0269:
            r1 = move-exception
            X.1RG r0 = r0.A0G()
            r0.A0D()
            r8.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1R1.A06(X.22O):X.2zK");
    }

    public C56802sa A0H() {
        C56802sa A0M2 = A0M("group_chat_defaults");
        if (A0M2.A0C == null) {
            A0M2.A0C = Settings.System.DEFAULT_NOTIFICATION_URI.toString();
        }
        if (TextUtils.isEmpty(A0M2.A0D)) {
            A0M2.A0D = "1";
        }
        if (TextUtils.isEmpty(A0M2.A0B)) {
            A0M2.A0B = Integer.toString(0);
        }
        if (TextUtils.isEmpty(A0M2.A0A)) {
            A0M2.A0A = "FFFFFF";
        }
        return A0M2;
    }

    public C56802sa A0I() {
        C56802sa A0M2 = A0M("individual_chat_defaults");
        if (A0M2.A0C == null) {
            A0M2.A0C = Settings.System.DEFAULT_NOTIFICATION_URI.toString();
        }
        if (TextUtils.isEmpty(A0M2.A0D)) {
            A0M2.A0D = "1";
        }
        if (TextUtils.isEmpty(A0M2.A0B)) {
            A0M2.A0B = Integer.toString(0);
        }
        if (TextUtils.isEmpty(A0M2.A0A)) {
            A0M2.A0A = "FFFFFF";
        }
        if (A0M2.A08 == null) {
            A0M2.A08 = Settings.System.DEFAULT_RINGTONE_URI.toString();
        }
        if (TextUtils.isEmpty(A0M2.A09)) {
            A0M2.A09 = "1";
        }
        return A0M2;
    }

    public final C56802sa A0J() {
        if (Build.VERSION.SDK_INT >= 26) {
            return new C32501qy(this.A0C, this.A0D, this.A0F, this, this.A01);
        }
        return new C56802sa(this.A0C, this.A0D, this.A0F, this);
    }

    public C56802sa A0L(C95814uZ r3) {
        return (C56802sa) this.A0Y.get(r3.getRawString());
    }

    public final C56802sa A0M(String str) {
        Cursor A0E2;
        Map map = this.A0Y;
        C56802sa r0 = (C56802sa) map.get(str);
        if (r0 == null) {
            try {
                AnonymousClass4GK A022 = C18630y0.A02(this);
                try {
                    A0E2 = ((AnonymousClass3H0) A022).A03.A0E(C39332Bo.A01, "loadChatSettings/QUERY_CHAT_SETTINGS", C18270x1.A1b(str));
                    if (A0E2.moveToNext()) {
                        r0 = A0K(A0E2);
                        A0E2.close();
                        A022.close();
                    } else {
                        A0E2.close();
                        A022.close();
                        r0 = A0J();
                    }
                    r0.A0E = str;
                    map.put(str, r0);
                } catch (Throwable th) {
                    A022.close();
                    throw th;
                }
            } catch (SQLiteDatabaseCorruptException e) {
                Log.e("chat-settings-store/get", e);
                A0T();
                throw e;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        return r0;
        throw th;
    }

    public Long A0O(C95814uZ r6, long j) {
        C626936e.A0D(AnonymousClass001.A1W((j > 0 ? 1 : (j == 0 ? 0 : -1))), "Pinned time should be strictly positive");
        return A0P(r6, j, true);
    }

    public final Long A0P(C95814uZ r19, long j, boolean z) {
        C85284Fq A062;
        long j2 = j;
        C95814uZ r8 = r19;
        boolean z2 = z;
        if (z) {
            this.A07.A00(r8, 7);
        }
        C56802sa A002 = A00(r8, this);
        boolean z3 = A002.A0H;
        long j3 = A002.A05;
        try {
            A062 = C18630y0.A06(this);
            A002.A0H = z2;
            if (!z) {
                j2 = 0;
            }
            A002.A05 = j2;
            ContentValues A092 = C18280x3.A09();
            AnonymousClass0x2.A0o(A092, "pinned", A002.A0H);
            C56862sg A022 = AnonymousClass3H0.A02(A092, A062, "pinned_time", A002.A05);
            boolean z4 = true;
            String[] strArr = new String[1];
            C18280x3.A0v(r8, strArr);
            if (A022.A05(A092, "settings", "jid =?", "ChatSettingsStore/setPin/UPDATE_CHAT_SETTINGS", strArr) == 0) {
                AnonymousClass0x2.A0n(A092, r8, "jid");
                A022.A08("settings", "ChatSettingsStore/setPin/INSERT_CHAT_SETTINGS", A092);
            }
            if (z3 == z2 && j3 == A002.A05) {
                z4 = false;
            }
            A062.close();
            this.A0K.A08();
            if (z4 && this.A0N.A0Y(C58422vE.A01, 6045)) {
                new LinkedHashSet(A0Q().keySet());
            }
            if (z4) {
                return Long.valueOf(j3);
            }
            return null;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.i("chat-settings-store/set-pin", e);
            A0T();
            throw e;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    @Deprecated
    public Set A0R() {
        Set set = this.A02;
        if (set == null) {
            return new LinkedHashSet(A0Q().keySet());
        }
        return set;
    }

    public void A0T() {
        this.A0Y.clear();
        A0G().A0D();
        A0W();
        A0V();
    }

    public void A0U() {
        String A012;
        if (AnonymousClass2BF.A00) {
            C85284Fq A062 = C18630y0.A06(this);
            try {
                NotificationManager A0A2 = this.A0C.A0A();
                C626936e.A06(A0A2);
                for (NotificationChannel notificationChannel : AnonymousClass354.A01(A0A2)) {
                    if (!AnonymousClass327.A01.contains(notificationChannel.getId()) && !"miscellaneous".equals(notificationChannel.getId()) && this.A01.A0J(notificationChannel, A062) && (A012 = AnonymousClass35T.A0L.A01(notificationChannel.getId())) != null) {
                        this.A0Y.remove(A012);
                    }
                }
                A062.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
    }

    public final void A0V() {
        C56612sH r5 = this.A0D;
        C69263Wi r1 = this.A04;
        C54292oU r6 = this.A0E;
        C56982ss r9 = this.A0I;
        C620633i r4 = this.A0C;
        AnonymousClass5ZU r3 = this.A0A;
        this.A01 = new AnonymousClass35T(r1, this.A09, r3, r4, r5, r6, this.A0F, this.A0G, r9, this.A0J, this.A0K, this.A0P, this.A0V);
    }

    public void A0X(AnonymousClass33p r9, AnonymousClass2LG r10) {
        if (Build.VERSION.SDK_INT >= 30 && C18280x3.A02(AnonymousClass0x2.A0F(r9), "notification_channel_upgrade_version") != 1) {
            Iterator it = A0S().iterator();
            while (it.hasNext()) {
                C95814uZ A0P2 = C18300x5.A0P(it);
                A0a(A00(A0P2, this));
                AnonymousClass3ZH A072 = this.A08.A07(A0P2);
                AnonymousClass3DP r2 = r10.A01;
                Context context = r10.A00;
                r2.A07(A0P2);
                if (A072 != null) {
                    r2.A04(context, A072, (String) null);
                }
            }
            C18260x0.A0L(r9, "notification_channel_upgrade_version", 1);
        }
    }

    public void A0Z(C56802sa r3) {
        if (!r3.A0K) {
            r3 = r3.A02();
        }
        A0d(r3.A0E, Settings.System.DEFAULT_NOTIFICATION_URI.toString());
        Log.i("chat-settings-store/set-underlying-message-tone-to-default updated message tone to default");
    }

    public boolean A0f() {
        String A0Z2;
        AnonymousClass1VX r7 = this.A0N;
        C58422vE r6 = C58422vE.A02;
        if (!r7.A0Y(r6, 3354)) {
            return false;
        }
        if (r7.A0Y(r6, 5418)) {
            C183538qC r3 = this.A0G.A01;
            int i = C18300x5.A0B(r3).getInt("push_to_video_sending_enabled", -1);
            if (i == 0) {
                return false;
            }
            if (i != 1) {
                int A0O2 = r7.A0O(r6, 5419);
                if (A0O2 == -1) {
                    return false;
                }
                if (!(A0O2 == 0 || (A0Z2 = C18280x3.A0Z(C18300x5.A0B(r3), "push_to_video_sending_enabled_default_info")) == null)) {
                    boolean z = !A0Z2.endsWith("0");
                    if (Boolean.valueOf(z) == null || z) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
        }
        return true;
    }

    public boolean A0i(C95814uZ r2) {
        Set set = this.A02;
        if (set != null) {
            return set.contains(r2);
        }
        return A00(r2, this).A0H;
    }

    public final boolean A0n(String str) {
        if (!AnonymousClass2BF.A00) {
            return false;
        }
        C85284Fq A062 = C18630y0.A06(this);
        try {
            C55222q0 r3 = AnonymousClass35T.A0L;
            String A002 = r3.A00(str);
            if (A002 != null) {
                NotificationManager A0A2 = this.A0C.A0A();
                C626936e.A06(A0A2);
                if (this.A01.A0J(AnonymousClass354.A00(A0A2, A002), A062)) {
                    this.A0Y.remove(r3.A01(A002));
                    A062.close();
                    return true;
                }
            }
            A062.close();
            return false;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public AnonymousClass2P1 BES(C95814uZ r2, boolean z) {
        C56802sa A002;
        if (r2 == null) {
            A002 = A0I();
        } else {
            A002 = A00(r2, this);
        }
        if (z) {
            return A002.A06;
        }
        return A002.A07;
    }

    public void Bkl(C95814uZ r2, AnonymousClass2P1 r3, boolean z) {
        C56802sa A002;
        if (r2 == null) {
            A002 = A0I();
        } else {
            A002 = A00(r2, this);
        }
        if (z) {
            A002.A06 = r3;
        } else {
            A002.A07 = r3;
        }
        A0a(A002);
    }

    public static C56802sa A00(Jid jid, AnonymousClass1R1 r1) {
        return r1.A0M(jid.getRawString());
    }

    public static void A01(AnonymousClass1R1 r2, String str, boolean z) {
        C56802sa A0M2 = r2.A0M(str);
        if (z != A0M2.A0F) {
            A0M2.A0F = z;
            r2.A0a(A0M2);
        }
    }

    public final C56802sa A0K(Cursor cursor) {
        C56802sa A0J2 = A0J();
        A0J2.A0E = AnonymousClass0x2.A0Z(cursor, "jid");
        A0J2.A04 = AnonymousClass0x2.A0C(cursor, "mute_end");
        boolean z = true;
        A0J2.A0I = AnonymousClass000.A1U(AnonymousClass0x2.A04(cursor, "muted_notifications"), 1);
        A0J2.A0K = C18260x0.A1Z(cursor, "use_custom_notifications");
        A0J2.A0C = AnonymousClass0x2.A0Z(cursor, "message_tone");
        A0J2.A0D = AnonymousClass0x2.A0Z(cursor, "message_vibrate");
        A0J2.A0B = AnonymousClass0x2.A0Z(cursor, "message_popup");
        A0J2.A0A = AnonymousClass0x2.A0Z(cursor, "message_light");
        A0J2.A08 = AnonymousClass0x2.A0Z(cursor, "call_tone");
        A0J2.A09 = AnonymousClass0x2.A0Z(cursor, "call_vibrate");
        A0J2.A0J = C18260x0.A1Z(cursor, "status_muted");
        A0J2.A0H = C18260x0.A1Z(cursor, "pinned");
        A0J2.A05 = AnonymousClass0x2.A0C(cursor, "pinned_time");
        A0J2.A0F = C18260x0.A1Z(cursor, "low_pri_notifications");
        A0J2.A01 = AnonymousClass0x2.A04(cursor, "media_visibility");
        if (AnonymousClass0x2.A04(cursor, "mute_reactions") != 1) {
            z = false;
        }
        A0J2.A0G = z;
        if ("0".equals(A0J2.A0A)) {
            A0J2.A0A = "000000";
        }
        String A0Z2 = AnonymousClass0x2.A0Z(cursor, "wallpaper_light_type");
        if (A0Z2 != null) {
            A0J2.A07 = new AnonymousClass2P1(0, A0Z2, AnonymousClass0x2.A0Z(cursor, "wallpaper_light_value"));
        }
        String A0Z3 = AnonymousClass0x2.A0Z(cursor, "wallpaper_dark_type");
        if (A0Z3 != null) {
            A0J2.A06 = new AnonymousClass2P1(Integer.valueOf(AnonymousClass0x2.A04(cursor, "wallpaper_dark_opacity")), A0Z3, AnonymousClass0x2.A0Z(cursor, "wallpaper_dark_value"));
        }
        A0J2.A00 = AnonymousClass0x2.A04(cursor, "notifications_auto_muted");
        A0J2.A02 = AnonymousClass0x2.A04(cursor, "push_recording_button_mode");
        return A0J2;
    }

    public final Set A0S() {
        Cursor A012;
        LinkedHashSet A17 = AnonymousClass0x9.A17();
        try {
            AnonymousClass4GK A022 = C18630y0.A02(this);
            try {
                A012 = C56862sg.A01(((AnonymousClass3H0) A022).A03, "SELECT jid FROM settings WHERE use_custom_notifications != 0", "getCustomNotificationJids/QUERY_CHAT_SETTINGS");
                int A013 = AnonymousClass0x9.A01(A012);
                while (A012.moveToNext()) {
                    C95814uZ A0K2 = AnonymousClass0x2.A0K(A012, A013);
                    if (A0K2 != null) {
                        A17.add(A0K2);
                    }
                }
                A012.close();
                A022.close();
                return A17;
            } catch (Throwable th) {
                A022.close();
                throw th;
            }
            throw th;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.i("chat-settings-store/get-pinned-jids", e);
            A0T();
            throw e;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public void A0Y(C95814uZ r15, boolean z) {
        C56802sa A002 = A00(r15, this);
        if (AnonymousClass2BF.A00 && A002.A0K) {
            this.A01.A0I(r15.getRawString());
        }
        C85284Fq A062 = C18630y0.A06(this);
        if (z) {
            try {
                if (A002.A0K) {
                    A002.A03 = System.currentTimeMillis();
                    ContentValues A072 = AnonymousClass0x9.A07(1);
                    C56862sg A022 = AnonymousClass3H0.A02(A072, A062, "deleted", A002.A03);
                    String[] strArr = new String[1];
                    C18280x3.A0w(r15, strArr, 0);
                    A022.A05(A072, "settings", "jid = ?", "setChatDeleted/UPDATE_CHAT_SETTINGS", strArr);
                } else {
                    this.A0Y.remove(r15.getRawString());
                    C56862sg r4 = ((AnonymousClass3H0) A062).A03;
                    String[] strArr2 = new String[1];
                    C18280x3.A0w(r15, strArr2, 0);
                    r4.A07("settings", "jid = ?", "setChatDeleted/DELETE_CHAT_SETTINGS", strArr2);
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
        A062.close();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0117, code lost:
        if (r1.A01() == 0) goto L_0x0119;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0a(X.C56802sa r18) {
        /*
            r17 = this;
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "chat-settings-store/save-chat-settings "
            r1 = r18
            X.C18260x0.A1P(r2, r0, r1)
            r0 = 8
            android.content.ContentValues r10 = X.AnonymousClass0x9.A07(r0)
            boolean r0 = r1.A0K
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "use_custom_notifications"
            r10.put(r0, r2)
            java.lang.String r2 = "message_tone"
            java.lang.String r0 = r1.A07()
            r10.put(r2, r0)
            java.lang.String r2 = "message_vibrate"
            java.lang.String r0 = r1.A08()
            r10.put(r2, r0)
            java.lang.String r2 = "message_popup"
            java.lang.String r0 = r1.A06()
            r10.put(r2, r0)
            java.lang.String r2 = "message_light"
            java.lang.String r0 = r1.A05()
            r10.put(r2, r0)
            java.lang.String r2 = "call_tone"
            java.lang.String r0 = r1.A03()
            r10.put(r2, r0)
            java.lang.String r2 = "call_vibrate"
            java.lang.String r0 = r1.A04()
            r10.put(r2, r0)
            boolean r0 = r1.A0H
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "pinned"
            r10.put(r0, r2)
            long r2 = r1.A05
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r0 = "pinned_time"
            r10.put(r0, r2)
            boolean r0 = r1.A0J
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "status_muted"
            r10.put(r0, r2)
            boolean r0 = r1.A0A()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "low_pri_notifications"
            r10.put(r0, r2)
            int r0 = r1.A01
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "media_visibility"
            r10.put(r0, r2)
            X.2sa r0 = r1.A02()
            boolean r0 = r0.A0G
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "mute_reactions"
            r10.put(r0, r2)
            int r0 = r1.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "notifications_auto_muted"
            r10.put(r0, r2)
            int r0 = r1.A02
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "push_recording_button_mode"
            r10.put(r0, r2)
            X.2P1 r0 = r1.A07
            java.lang.String r3 = "wallpaper_light_value"
            java.lang.String r2 = "wallpaper_light_type"
            r5 = 0
            if (r0 == 0) goto L_0x012f
            java.lang.String r0 = r0.A01
            r10.put(r2, r0)
            X.2P1 r0 = r1.A07
            java.lang.String r0 = r0.A02
            r10.put(r3, r0)
        L_0x00d2:
            X.2P1 r0 = r1.A06
            java.lang.String r4 = "wallpaper_dark_opacity"
            java.lang.String r3 = "wallpaper_dark_value"
            java.lang.String r2 = "wallpaper_dark_type"
            if (r0 == 0) goto L_0x0125
            java.lang.String r0 = r0.A01
            r10.put(r2, r0)
            X.2P1 r0 = r1.A06
            java.lang.String r0 = r0.A02
            r10.put(r3, r0)
            X.2P1 r0 = r1.A06
            java.lang.Integer r0 = r0.A00
            r10.put(r4, r0)
        L_0x00f2:
            long r4 = r1.A01()
            r2 = 0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0136
            long r2 = r1.A01()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r0 = "mute_end"
            r10.put(r0, r2)
            boolean r0 = r1.A0I
            if (r0 != 0) goto L_0x0119
            long r5 = r1.A01()
            r3 = 0
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            r0 = 0
            if (r2 != 0) goto L_0x011a
        L_0x0119:
            r0 = 1
        L_0x011a:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "muted_notifications"
            r10.put(r0, r2)
            goto L_0x0136
        L_0x0125:
            r10.put(r2, r5)
            r10.put(r3, r5)
            r10.put(r4, r5)
            goto L_0x00f2
        L_0x012f:
            r10.put(r2, r5)
            r10.put(r3, r5)
            goto L_0x00d2
        L_0x0136:
            r2 = r17
            X.4Fq r8 = X.C18630y0.A06(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0204 }
            boolean r0 = A02(r1)     // Catch:{ all -> 0x01fa }
            java.lang.String r11 = "settings"
            r7 = 0
            r6 = 1
            if (r0 == 0) goto L_0x0148
            goto L_0x01bf
        L_0x0148:
            r0 = r8
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x01fa }
            X.2sg r9 = r0.A03     // Catch:{ all -> 0x01fa }
            java.lang.String r12 = "jid = ?"
            java.lang.String[] r14 = new java.lang.String[r6]     // Catch:{ all -> 0x01fa }
            java.lang.String r0 = r1.A0E     // Catch:{ all -> 0x01fa }
            r14[r7] = r0     // Catch:{ all -> 0x01fa }
            java.lang.String r13 = "saveChatSettings/UPDATE_CHAT_SETTINGS"
            int r0 = r9.A05(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x01fa }
            if (r0 != 0) goto L_0x016b
            java.lang.String r3 = "jid"
            java.lang.String r0 = r1.A0E     // Catch:{ all -> 0x01fa }
            r10.put(r3, r0)     // Catch:{ all -> 0x01fa }
            java.lang.String r0 = "saveChatSettings/INSERT_CHAT_SETTINGS"
            r9.A08(r11, r0, r10)     // Catch:{ all -> 0x01fa }
        L_0x016b:
            boolean r0 = X.AnonymousClass2BF.A00     // Catch:{ all -> 0x01fa }
            if (r0 == 0) goto L_0x01ef
            java.lang.String r0 = "individual_chat_defaults"
            java.lang.String r12 = r1.A0E     // Catch:{ all -> 0x01fa }
            boolean r0 = r0.equals(r12)     // Catch:{ all -> 0x01fa }
            if (r0 != 0) goto L_0x019d
            java.lang.String r0 = "group_chat_defaults"
            boolean r0 = r0.equals(r12)     // Catch:{ all -> 0x01fa }
            if (r0 != 0) goto L_0x019d
            boolean r0 = r1.A0K     // Catch:{ all -> 0x01fa }
            if (r0 != 0) goto L_0x019d
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01fa }
            java.lang.String r0 = "chat-setting-store/save-notification-settings deleting channel for jid:"
            r3.append(r0)     // Catch:{ all -> 0x01fa }
            java.lang.String r0 = X.C627336j.A08(r12)     // Catch:{ all -> 0x01fa }
            X.C18260x0.A1J(r3, r0)     // Catch:{ all -> 0x01fa }
            X.35T r3 = r2.A01     // Catch:{ all -> 0x01fa }
            java.lang.String r0 = r1.A0E     // Catch:{ all -> 0x01fa }
            r3.A0I(r0)     // Catch:{ all -> 0x01fa }
            goto L_0x01ef
        L_0x019d:
            X.35T r9 = r2.A01     // Catch:{ all -> 0x01fa }
            java.lang.CharSequence r11 = r9.A06(r12)     // Catch:{ all -> 0x01fa }
            java.lang.String r13 = r1.A05()     // Catch:{ all -> 0x01fa }
            java.lang.String r14 = r1.A08()     // Catch:{ all -> 0x01fa }
            java.lang.String r0 = r1.A07()     // Catch:{ all -> 0x01fa }
            android.net.Uri r10 = android.net.Uri.parse(r0)     // Catch:{ all -> 0x01fa }
            boolean r15 = r1.A0A()     // Catch:{ all -> 0x01fa }
            boolean r0 = r1.A0K     // Catch:{ all -> 0x01fa }
            r16 = r0
            r9.A0E(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x01fa }
            goto L_0x01ef
        L_0x01bf:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01fa }
            java.lang.String r0 = "chat-settings-store/save-chat-settings deleting row for id:"
            r3.append(r0)     // Catch:{ all -> 0x01fa }
            java.lang.String r0 = r1.A0E     // Catch:{ all -> 0x01fa }
            java.lang.String r0 = X.C627336j.A08(r0)     // Catch:{ all -> 0x01fa }
            X.C18260x0.A1L(r3, r0)     // Catch:{ all -> 0x01fa }
            r0 = r8
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x01fa }
            X.2sg r5 = r0.A03     // Catch:{ all -> 0x01fa }
            java.lang.String r4 = "jid = ?"
            java.lang.String[] r3 = new java.lang.String[r6]     // Catch:{ all -> 0x01fa }
            java.lang.String r0 = r1.A0E     // Catch:{ all -> 0x01fa }
            r3[r7] = r0     // Catch:{ all -> 0x01fa }
            java.lang.String r0 = "saveChatSettings/DELETE_CHAT_SETTINGS"
            r5.A07(r11, r4, r0, r3)     // Catch:{ all -> 0x01fa }
            boolean r0 = X.AnonymousClass2BF.A00     // Catch:{ all -> 0x01fa }
            if (r0 == 0) goto L_0x01ef
            X.35T r3 = r2.A01     // Catch:{ all -> 0x01fa }
            java.lang.String r0 = r1.A0E     // Catch:{ all -> 0x01fa }
            r3.A0I(r0)     // Catch:{ all -> 0x01fa }
        L_0x01ef:
            java.util.Map r3 = r2.A0Y     // Catch:{ all -> 0x01fa }
            java.lang.String r0 = r1.A0E     // Catch:{ all -> 0x01fa }
            r3.remove(r0)     // Catch:{ all -> 0x01fa }
            r8.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0204 }
            return
        L_0x01fa:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x01ff }
            goto L_0x0203
        L_0x01ff:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0204 }
        L_0x0203:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x0204 }
        L_0x0204:
            r1 = move-exception
            java.lang.String r0 = "chat-settings-store/save"
            com.whatsapp.util.Log.i(r0, r1)
            r2.A0T()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1R1.A0a(X.2sa):void");
    }

    public final void A0b(String str, String str2) {
        C56802sa A0M2 = A0M(str);
        if (!TextUtils.equals(str2, A0M2.A0A)) {
            A0M2.A0A = str2;
            A0a(A0M2);
        }
    }

    public final void A0c(String str, String str2) {
        C56802sa A0M2 = A0M(str);
        if (!TextUtils.equals(str2, A0M2.A0B)) {
            A0M2.A0B = str2;
            A0a(A0M2);
        }
    }

    public final void A0d(String str, String str2) {
        C56802sa A0M2 = A0M(str);
        if (!TextUtils.equals(str2, A0M2.A0C)) {
            A0M2.A0C = str2;
            A0a(A0M2);
        }
    }

    public final void A0e(String str, String str2) {
        C56802sa A0M2 = A0M(str);
        if (!TextUtils.equals(str2, A0M2.A0D)) {
            A0M2.A0D = str2;
            A0a(A0M2);
        }
    }

    public boolean A0g(C95814uZ r7) {
        boolean z;
        NotificationChannel A032;
        C56802sa A002 = A00(r7, this);
        if (!AnonymousClass2BF.A00 || !A002.A0K || (A032 = this.A01.A03(r7.getRawString())) == null || A032.getImportance() >= 3) {
            z = false;
        } else {
            Log.i("chat-settings-store//cancelMute unmuting channel");
            this.A01.A0D(A032, r7.getRawString(), AnonymousClass35T.A00(A002.A0A()));
            z = true;
        }
        boolean A0k = A0k(r7, 0);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("chat-settings-store//cancelMute for jid:");
        A0o.append(r7);
        A0o.append(" channelChanged:");
        A0o.append(z);
        C18260x0.A1E(" dbchanged:", A0o, A0k);
        if (z || A0k) {
            return true;
        }
        return false;
    }

    public boolean A0h(C95814uZ r6) {
        return AnonymousClass000.A1S((A00(r6, this).A00() > 0 ? 1 : (A00(r6, this).A00() == 0 ? 0 : -1)));
    }

    public boolean A0j(C95814uZ r2) {
        return A00(r2, this).A0J;
    }

    public boolean A0k(C95814uZ r14, long j) {
        C85284Fq A062;
        C56802sa A002 = A00(r14, this);
        long j2 = j;
        if (j == A002.A04) {
            return false;
        }
        try {
            A062 = C18630y0.A06(this);
            A002.A04 = j;
            if (A02(A002)) {
                C56862sg r5 = ((AnonymousClass3H0) A062).A03;
                String[] strArr = new String[1];
                C18280x3.A0w(r14, strArr, 0);
                r5.A07("settings", "jid = ?", "ChatSettingsStore/setMute/DELETE_CHAT_SETTINGS", strArr);
                this.A0Y.remove(r14.getRawString());
            } else {
                A002.A0I = false;
                ContentValues A092 = C18280x3.A09();
                C18270x1.A0c(A092, "mute_end", j2);
                A092.put("muted_notifications", Boolean.FALSE);
                C56862sg r7 = ((AnonymousClass3H0) A062).A03;
                String[] strArr2 = new String[1];
                C18280x3.A0w(r14, strArr2, 0);
                if (r7.A05(A092, "settings", "jid = ?", "ChatSettingsStore/setMute/UPDATE_CHAT_SETTINGS", strArr2) == 0) {
                    AnonymousClass0x2.A0n(A092, r14, "jid");
                    r7.A08("settings", "ChatSettingsStore/setMute/INSERT_CHAT_SETTINGS", A092);
                }
            }
            A062.close();
            C69263Wi.A05(this.A04, this, r14, 40);
            return true;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.i("chat-settings-store/setmute", e);
            A0T();
            throw e;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public boolean A0l(UserJid userJid) {
        C56802sa A002 = A00(userJid, this);
        if (!A002.A0J) {
            return false;
        }
        A002.A0J = false;
        A0a(A002);
        C69263Wi.A05(this.A04, this, userJid, 39);
        return true;
    }

    public boolean A0m(UserJid userJid) {
        C56802sa A002 = A00(userJid, this);
        if (A002.A0J) {
            return false;
        }
        A002.A0J = true;
        A0a(A002);
        C69263Wi.A05(this.A04, this, userJid, 39);
        return true;
    }

    public Set B4T() {
        Cursor A0E2;
        String str;
        String str2;
        HashSet A0K2 = AnonymousClass002.A0K();
        C56802sa A0I2 = A0I();
        AnonymousClass2P1 r1 = A0I2.A06;
        if (!(r1 == null || !"USER_PROVIDED".equalsIgnoreCase(r1.A01) || (str2 = r1.A02) == null)) {
            A0K2.add(str2);
        }
        AnonymousClass2P1 r12 = A0I2.A07;
        if (!(r12 == null || !"USER_PROVIDED".equalsIgnoreCase(r12.A01) || (str = r12.A02) == null)) {
            A0K2.add(str);
        }
        try {
            AnonymousClass4GK A022 = C18630y0.A02(this);
            try {
                A0E2 = ((AnonymousClass3H0) A022).A03.A0E("SELECT wallpaper_light_value FROM settings WHERE wallpaper_light_type = ?", "getSettings/QUERY_WALLPAPER", new String[]{"USER_PROVIDED"});
                while (A0E2.moveToNext()) {
                    A0K2.add(AnonymousClass0x2.A0Z(A0E2, "wallpaper_light_value"));
                }
                A0E2.close();
                A022.close();
                return A0K2;
            } catch (Throwable th) {
                A022.close();
                throw th;
            }
            throw th;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e("chat-settings-store/get-wallpaper-files", e);
            throw e;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1R1(X.C55682qk r34, X.C69263Wi r35, X.C56972sr r36, X.C29301ib r37, X.C46342bT r38, X.C64773Ex r39, X.C29421in r40, X.AnonymousClass5ZU r41, X.C56512s6 r42, X.C620633i r43, X.C56612sH r44, X.C54292oU r45, X.AnonymousClass5ZR r46, X.AnonymousClass33p r47, X.C48502f0 r48, X.C42822Pq r49, X.C56982ss r50, X.C66473Lo r51, X.C28891hw r52, X.C60972zT r53, X.C45932ao r54, X.AnonymousClass1VX r55, X.AnonymousClass3LP r56, X.C29241iV r57, X.C619632y r58, X.C29081iF r59, X.C48772fR r60, X.C622634i r61, X.C187958y5 r62, X.AnonymousClass2X6 r63) {
        /*
            r33 = this;
            java.lang.String r31 = "chatsettings.db"
            r32 = 1
            r28 = r61
            r27 = r60
            r2 = r35
            r5 = r38
            r6 = r39
            r7 = r40
            r8 = r41
            r9 = r42
            r10 = r43
            r11 = r44
            r12 = r45
            r3 = r36
            r29 = r62
            r0 = r33
            r4 = r37
            r30 = r63
            r1 = r34
            r13 = r46
            r14 = r47
            r15 = r48
            r16 = r49
            r17 = r50
            r18 = r51
            r19 = r52
            r20 = r53
            r21 = r54
            r22 = r55
            r23 = r56
            r24 = r57
            r25 = r58
            r26 = r59
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1R1.<init>(X.2qk, X.3Wi, X.2sr, X.1ib, X.2bT, X.3Ex, X.1in, X.5ZU, X.2s6, X.33i, X.2sH, X.2oU, X.5ZR, X.33p, X.2f0, X.2Pq, X.2ss, X.3Lo, X.1hw, X.2zT, X.2ao, X.1VX, X.3LP, X.1iV, X.32y, X.1iF, X.2fR, X.34i, X.8y5, X.2X6):void");
    }
}
