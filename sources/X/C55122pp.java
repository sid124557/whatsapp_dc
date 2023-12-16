package X;

import android.database.Cursor;
import com.whatsapp.util.Log;
import java.util.Date;
import java.util.Map;

/* renamed from: X.2pp  reason: invalid class name and case insensitive filesystem */
public class C55122pp {
    public final C55682qk A00;
    public final C56612sH A01;
    public final C50632iV A02;
    public final C56922sm A03;
    public final C56982ss A04;
    public final C49472ga A05;
    public final C56562sC A06;
    public final C52342lK A07;
    public final C72303dV A08;
    public final AnonymousClass1VX A09;
    public final C54102oB A0A;
    public final AnonymousClass4FS A0B;
    public final Map A0C;
    public final AnonymousClass66R A0D;

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0071, code lost:
        if (r7 > r0) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0085, code lost:
        if (r7 > r0) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0099, code lost:
        if (r7 > r0) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ad, code lost:
        if (r7 <= r0) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00af, code lost:
        r0 = X.C56982ss.A00(r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b3, code lost:
        if (r0 == null) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b5, code lost:
        r3 = r0.A0g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b7, code lost:
        if (r3 == null) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b9, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("\"");
        r1.append(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00cd, code lost:
        if (r3.contains(X.AnonymousClass000.A0X("\"", r1)) == false) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00cf, code lost:
        if (r15 == false) goto L_0x014b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C624134x A02(android.database.Cursor r13, X.C95814uZ r14, boolean r15) {
        /*
            r12 = this;
            r1 = 0
            r3 = 1
            int r0 = r13.getColumnCount()
            if (r0 != r3) goto L_0x0011
            long r0 = r13.getLong(r1)
            X.34x r0 = r12.A01(r0)
        L_0x0010:
            return r0
        L_0x0011:
            java.lang.String r0 = "key_id"
            java.lang.String r2 = X.AnonymousClass0x2.A0Z(r13, r0)
            java.lang.String r0 = "from_me"
            int r0 = X.AnonymousClass0x2.A04(r13, r0)
            r1 = 1
            if (r0 == r3) goto L_0x0021
            r1 = 0
        L_0x0021:
            if (r2 == 0) goto L_0x003c
            java.lang.String r0 = "-1"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x003c
            X.2z0 r5 = X.AnonymousClass2z0.A05(r14, r2, r1)
        L_0x002f:
            r4 = 0
            if (r5 != 0) goto L_0x0047
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageDatabaseRetrieverImpl/getMessage/can't read key; jid="
            X.C18260x0.A1S(r1, r0, r14)
            return r4
        L_0x003c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MainMessageStore/getMessage/id is null or no messages for jid="
            X.C18260x0.A1S(r1, r0, r14)
            r5 = 0
            goto L_0x002f
        L_0x0047:
            X.34x r0 = r12.A04(r5)
            if (r0 != 0) goto L_0x0010
            X.34x r6 = r12.A03(r13, r5)
            if (r6 == 0) goto L_0x014b
            X.2z0 r10 = r6.A1J
            X.4uZ r3 = X.AnonymousClass2z0.A01(r10)
            byte r2 = r6.A1I
            r0 = 8
            if (r2 == r0) goto L_0x0087
            boolean r0 = r6.A1F
            if (r0 != 0) goto L_0x0073
            long r7 = r6.A1M
            X.2ss r0 = r12.A04
            X.31A r0 = X.C56982ss.A00(r0, r3)
            if (r0 != 0) goto L_0x00f9
            r0 = -9223372036854775808
        L_0x006f:
            int r9 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r9 <= 0) goto L_0x00cf
        L_0x0073:
            boolean r0 = r6.A1F
            if (r0 == 0) goto L_0x0087
            long r7 = r6.A1M
            X.2ss r0 = r12.A04
            X.31A r0 = X.C56982ss.A00(r0, r3)
            if (r0 != 0) goto L_0x00f6
            r0 = -9223372036854775808
        L_0x0083:
            int r9 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r9 <= 0) goto L_0x00cf
        L_0x0087:
            boolean r0 = r6.A1F
            if (r0 != 0) goto L_0x009b
            long r7 = r6.A1M
            X.2ss r9 = r12.A04
            X.31A r0 = X.C56982ss.A00(r9, r3)
            if (r0 != 0) goto L_0x00f3
            r0 = -9223372036854775808
        L_0x0097:
            int r11 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r11 <= 0) goto L_0x00af
        L_0x009b:
            boolean r0 = r6.A1F
            if (r0 == 0) goto L_0x00d1
            long r7 = r6.A1M
            X.2ss r9 = r12.A04
            X.31A r0 = X.C56982ss.A00(r9, r3)
            if (r0 != 0) goto L_0x00f0
            r0 = -9223372036854775808
        L_0x00ab:
            int r11 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r11 > 0) goto L_0x00d1
        L_0x00af:
            X.31A r0 = X.C56982ss.A00(r9, r3)
            if (r0 == 0) goto L_0x00cf
            java.lang.String r3 = r0.A0g
            if (r3 == 0) goto L_0x00cf
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "\""
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L_0x00d1
        L_0x00cf:
            if (r15 == 0) goto L_0x014b
        L_0x00d1:
            X.1VX r8 = r12.A09
            r0 = 4788(0x12b4, float:6.71E-42)
            X.2vE r7 = X.C58422vE.A02
            boolean r0 = r8.A0Y(r7, r0)
            if (r0 == 0) goto L_0x012d
            X.2oB r0 = r12.A0A
            X.66R r1 = r0.A0D
            boolean r0 = X.C53662nS.A01(r1, r2)
            if (r0 == 0) goto L_0x012d
            X.48B r0 = X.C53662nS.A00(r1, r2)
            boolean r0 = r0 instanceof X.AnonymousClass4BT
            if (r0 == 0) goto L_0x012d
            goto L_0x00fd
        L_0x00f0:
            long r0 = r0.A0E
            goto L_0x00ab
        L_0x00f3:
            long r0 = r0.A0D
            goto L_0x0097
        L_0x00f6:
            long r0 = r0.A0G
            goto L_0x0083
        L_0x00f9:
            long r0 = r0.A0F
            goto L_0x006f
        L_0x00fd:
            X.66R r0 = r12.A0D     // Catch:{ IllegalStateException -> 0x010a }
            java.lang.Object r1 = r0.getValue()     // Catch:{ IllegalStateException -> 0x010a }
            X.2cF r1 = (X.C46812cF) r1     // Catch:{ IllegalStateException -> 0x010a }
            r0 = 0
            r1.A00(r13, r10, r4, r0)     // Catch:{ IllegalStateException -> 0x010a }
            goto L_0x012d
        L_0x010a:
            r4 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "message cannot be read from the database, message_type="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", stack="
            java.lang.String r3 = X.AnonymousClass000.A0a(r0, r1, r4)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageDatabaseRetrieverImpl/fillMessageInternal; "
            X.C18260x0.A0t(r0, r3, r1)
            X.2qk r1 = r12.A00
            java.lang.String r0 = "fmessage-database-mismatch"
            r1.A09(r0, r3, r4)
        L_0x012d:
            r0 = 4789(0x12b5, float:6.711E-42)
            boolean r0 = r8.A0Y(r7, r0)
            if (r0 == 0) goto L_0x014f
            X.2oB r3 = r12.A0A
            X.66R r1 = r3.A0D
            boolean r0 = X.C53662nS.A01(r1, r2)
            if (r0 == 0) goto L_0x014f
            X.48B r0 = X.C53662nS.A00(r1, r2)
            boolean r0 = r0 instanceof X.AnonymousClass4BT
            if (r0 == 0) goto L_0x014f
            r3.A00(r6)
        L_0x014a:
            r4 = r6
        L_0x014b:
            X.2lK r2 = r12.A07
            monitor-enter(r2)
            goto L_0x0155
        L_0x014f:
            X.2iV r0 = r12.A02
            r0.A00(r6)
            goto L_0x014a
        L_0x0155:
            X.34x r1 = r12.A04(r5)     // Catch:{ all -> 0x016a }
            r0 = 0
            if (r1 == 0) goto L_0x015d
            goto L_0x0167
        L_0x015d:
            if (r4 == 0) goto L_0x0165
            X.2z0 r0 = r4.A1J     // Catch:{ all -> 0x016a }
            r2.A01(r4, r0)     // Catch:{ all -> 0x016a }
            goto L_0x0168
        L_0x0165:
            r4 = r0
            goto L_0x0168
        L_0x0167:
            r4 = r1
        L_0x0168:
            monitor-exit(r2)
            return r4
        L_0x016a:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55122pp.A02(android.database.Cursor, X.4uZ, boolean):X.34x");
    }

    public final C624134x A03(Cursor cursor, AnonymousClass2z0 r10) {
        String str;
        C624134x A012 = this.A06.A01(cursor, r10);
        if (A012 != null) {
            return A012;
        }
        int columnIndex = cursor.getColumnIndex("message_type");
        if (columnIndex < 0) {
            columnIndex = -1;
        }
        int columnIndex2 = cursor.getColumnIndex("timestamp");
        if (columnIndex2 >= 0) {
            str = AnonymousClass0x7.A0u("yyyy-MM-dd").format(new Date(cursor.getLong(columnIndex2)));
        } else {
            str = null;
        }
        Log.d("FMessageDatabaseRetrieverImpl/getMessage/message is null");
        C55682qk r2 = this.A00;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("key=");
        A0o.append(r10);
        A0o.append(", date=");
        A0o.append(str);
        r2.A0A("FMessageDatabaseRetrieverImpl/getMessage/message is null", true, AnonymousClass000.A0Y(", type=", A0o, columnIndex));
        return null;
    }

    public static C624134x A00(C55832qz r0, long j) {
        return r0.A02.A01(j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0045, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.AnonymousClass2A8.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0049, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        X.AnonymousClass2A8.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0050, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C624134x A01(long r11) {
        /*
            r10 = this;
            java.lang.String r6 = "CachedMessageStore/getMessage/rowId"
            long r2 = android.os.SystemClock.uptimeMillis()
            X.3dV r0 = r10.A08     // Catch:{ all -> 0x0051 }
            X.4GK r8 = r0.get()     // Catch:{ all -> 0x0051 }
            r0 = r8
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x004a }
            X.2sg r5 = r0.A03     // Catch:{ all -> 0x004a }
            java.lang.String r4 = X.C58162uo.A0C     // Catch:{ all -> 0x004a }
            java.lang.String[] r1 = X.C18260x0.A1b(r11)     // Catch:{ all -> 0x004a }
            java.lang.String r0 = "GET_MESSAGE_BY_ROW_ID_SQL"
            android.database.Cursor r9 = r5.A0E(r4, r0, r1)     // Catch:{ all -> 0x004a }
            boolean r0 = r9.moveToLast()     // Catch:{ all -> 0x0043 }
            r7 = 0
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = "chat_row_id"
            long r4 = X.AnonymousClass0x2.A0C(r9, r0)     // Catch:{ all -> 0x0043 }
            X.2sm r0 = r10.A03     // Catch:{ all -> 0x0043 }
            X.4uZ r1 = r0.A0B(r4)     // Catch:{ all -> 0x0043 }
            if (r1 == 0) goto L_0x0037
            r0 = 0
            X.34x r7 = r10.A02(r9, r1, r0)     // Catch:{ all -> 0x0043 }
        L_0x0037:
            r9.close()     // Catch:{ all -> 0x004a }
            r8.close()     // Catch:{ all -> 0x0051 }
            X.2ga r0 = r10.A05
            X.C49472ga.A00(r0, r6, r2)
            return r7
        L_0x0043:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r9, r1)     // Catch:{ all -> 0x004a }
            throw r0     // Catch:{ all -> 0x004a }
        L_0x004a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004c }
        L_0x004c:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r8, r1)     // Catch:{ all -> 0x0051 }
            throw r0     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r1 = move-exception
            X.2ga r0 = r10.A05
            X.C49472ga.A00(r0, r6, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55122pp.A01(long):X.34x");
    }

    public final C624134x A04(AnonymousClass2z0 r3) {
        AnonymousClass31A A002;
        C624134x A003 = this.A07.A00(r3);
        if (A003 == null && ((A002 = C56982ss.A00(this.A04, r3.A00)) == null || (A003 = A002.A0d) == null || !r3.equals(A003.A1J))) {
            return (C624134x) this.A0C.get(r3);
        }
        return A003;
    }

    public C55122pp(C55682qk r2, C56612sH r3, C50632iV r4, C56922sm r5, C56982ss r6, C49472ga r7, C56562sC r8, C54762pF r9, C72303dV r10, AnonymousClass1VX r11, C54102oB r12, AnonymousClass4FS r13, C183538qC r14) {
        C18260x0.A0f(r9, r14, r3, r11, r5);
        C18260x0.A0g(r2, r6, r8, r7, r10);
        C18260x0.A0Y(r4, r12, r13);
        this.A01 = r3;
        this.A09 = r11;
        this.A03 = r5;
        this.A00 = r2;
        this.A04 = r6;
        this.A06 = r8;
        this.A05 = r7;
        this.A08 = r10;
        this.A02 = r4;
        this.A0A = r12;
        this.A0B = r13;
        this.A07 = r9.A01;
        this.A0C = r9.A02;
        this.A0D = C154517dI.A01(new C81273zc(this, r14));
    }
}
