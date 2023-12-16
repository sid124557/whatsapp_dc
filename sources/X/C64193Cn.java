package X;

import android.os.Handler;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3Cn  reason: invalid class name and case insensitive filesystem */
public class C64193Cn implements AnonymousClass4F2 {
    public Handler A00;
    public final C116985rC A01;
    public final C55682qk A02;
    public final C69263Wi A03;
    public final C56972sr A04;
    public final C29411im A05;
    public final AnonymousClass338 A06;
    public final C620433g A07;
    public final C48372en A08;
    public final C29441ip A09;
    public final C64773Ex A0A;
    public final C623734t A0B;
    public final C56882si A0C;
    public final C60022xs A0D;
    public final C44832Xq A0E;
    public final C44842Xr A0F;
    public final C59172wT A0G;
    public final C54642p3 A0H;
    public final AnonymousClass314 A0I;
    public final C620633i A0J;
    public final C56612sH A0K;
    public final C54292oU A0L;
    public final AnonymousClass5ZR A0M;
    public final C61072zf A0N;
    public final AnonymousClass318 A0O;
    public final AnonymousClass1VX A0P;
    public final C1907099n A0Q;
    public final C56452s0 A0R;
    public final C51072jE A0S;
    public final C72173dI A0T;
    public final C183538qC A0U;
    public final Runnable A0V;
    public final Random A0W = AnonymousClass0x9.A1C();
    public final AtomicBoolean A0X = C18280x3.A0l();

    public final synchronized Handler A00() {
        Handler handler;
        handler = this.A00;
        if (handler == null) {
            handler = C18290x4.A0I("sync");
            this.A00 = handler;
        }
        return handler;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x012f, code lost:
        r20 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0133, code lost:
        if (r1.A0E == false) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0135, code lost:
        r20 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0139, code lost:
        if (r2.A09 != false) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x013b, code lost:
        r21 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x013f, code lost:
        if (r1.A09 == false) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0141, code lost:
        r21 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0145, code lost:
        if (r2.A0K != false) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0147, code lost:
        r22 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x014b, code lost:
        if (r1.A0K == false) goto L_0x014f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x014d, code lost:
        r22 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0151, code lost:
        if (r2.A0J != false) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0153, code lost:
        r23 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0157, code lost:
        if (r1.A0J == false) goto L_0x015b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0159, code lost:
        r23 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x015b, code lost:
        r0.A00 = new X.C59812xW(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23);
        r9 = r0.A02();
        r9.A00 = java.lang.Math.max(r2.A00, r1.A00);
        r2 = r2.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0172, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:?, code lost:
        r0 = X.AnonymousClass002.A0J(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0177, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
        r2 = r9.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x017a, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:?, code lost:
        r2.addAll(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x017e, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:?, code lost:
        r1 = r1.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0181, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:?, code lost:
        r0 = X.AnonymousClass002.A0J(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0186, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:?, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:?, code lost:
        r2.addAll(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x018b, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x018c, code lost:
        r2 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x018e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0192, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0196, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x019a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:?, code lost:
        r3 = X.AnonymousClass001.A0o();
        r3.append("these requests cannot be combined ");
        r3.append(r2);
        r0 = X.AnonymousClass000.A0H(r1, " and ", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x01b5, code lost:
        r9 = new X.C71243bn(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x01bc, code lost:
        if (r2.A01 == false) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x01be, code lost:
        A00().postDelayed(r9, 0);
        r3.A02(r2, r9, android.os.SystemClock.elapsedRealtime());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x01cf, code lost:
        r12 = r4.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x01d8, code lost:
        if (X.AnonymousClass000.A1U(r12.A04, 2) == false) goto L_0x0279;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x01e4, code lost:
        if (r4.A0P.A0Y(X.C58422vE.A02, 560) == false) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x01ea, code lost:
        if (r12.A0A() != false) goto L_0x0279;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        com.whatsapp.util.Log.i("ContactSyncRequestExecutor/combineRequests");
        r0 = r3.A00(r1);
        r5 = java.lang.Math.max(r0.A00 - android.os.SystemClock.elapsedRealtime(), 0);
        A00().removeCallbacks(r0.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x01ee, code lost:
        if (r5 < 0) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x01f0, code lost:
        A00().postDelayed(r9, r5);
        X.C18260x0.A12("ContactSyncRequestExecutor/delay/combine ", X.AnonymousClass001.A0o(), r5);
        r3.A02(r2, r9, android.os.SystemClock.elapsedRealtime() + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x020b, code lost:
        if (r2.A01 == false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x020d, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0210, code lost:
        r0 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0212, code lost:
        if (r0 != 0) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0214, code lost:
        r5 = r4.A0G.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x021a, code lost:
        A00().postDelayed(r9, r5);
        r7 = r4.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        if (r12 != r9) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0223, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0225, code lost:
        r5 = (1 << java.lang.Math.min(r0 * 2, 8)) * 1000;
        r5 = java.lang.Math.max(r5 + java.lang.Math.abs(r4.A0W.nextLong() % r5), r4.A0G.A00());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:?, code lost:
        r7.A00.addFirst(java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
        r4 = r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0260, code lost:
        if (r4.size() != X.C59172wT.A01.length) goto L_0x0265;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0262, code lost:
        r4.removeLast();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:?, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0266, code lost:
        X.C18260x0.A12("ContactSyncRequestExecutor/delay ", X.AnonymousClass001.A0o(), r5);
        r3.A02(r2, r9, android.os.SystemClock.elapsedRealtime() + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        if (r12 == r13) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0279, code lost:
        com.whatsapp.util.Log.i("ContactSyncRequestExecutor/freeze until connection returns");
        r3.A02(r2, r9, android.os.SystemClock.elapsedRealtime());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0288, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x028e, code lost:
        r1 = X.AnonymousClass001.A0o();
        X.AnonymousClass0x7.A1F(r1, "Context/Mode (", r13);
        r1.append(r11);
        r0 = X.AnonymousClass000.A0F(") do not represent a recognized SyncType", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (r12 == r9) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        if (r9 == null) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0057, code lost:
        if (r12 != null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        r12 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        r13 = r12.context;
        r11 = r9.context;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0063, code lost:
        if (r13.compareTo(r11) < 0) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0065, code lost:
        r13 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0066, code lost:
        r11 = r12.mode;
        r9 = r9.mode;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006e, code lost:
        if (r11.compareTo(r9) < 0) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0070, code lost:
        r11 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
        r15 = X.AnonymousClass227.values();
        r14 = r15.length;
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0078, code lost:
        r12 = r15[r9];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007c, code lost:
        if (r12.context != r13) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        if (r12.mode != r11) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0082, code lost:
        r0 = new X.C60982zU(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0089, code lost:
        if (r2.A01 != false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008b, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008e, code lost:
        if (r1.A01 == false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0091, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0093, code lost:
        if (r9 >= r14) goto L_0x028e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0096, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0097, code lost:
        r0.A02 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009b, code lost:
        if (r2.A07 == false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009d, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a0, code lost:
        if (r1.A07 != false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a2, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a3, code lost:
        r0.A03 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a7, code lost:
        if (r2.A08 == false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a9, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ac, code lost:
        if (r1.A08 != false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ae, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00af, code lost:
        r0.A04 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b3, code lost:
        if (r2.A06 != false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b5, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00b8, code lost:
        if (r1.A06 == false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ba, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00bb, code lost:
        r0.A01 = r9;
        X.C60982zU.A01(r0, r2.A04);
        X.C60982zU.A01(r0, r1.A04);
        r9 = r2.A05;
        r11 = r0.A07;
        r11.addAll(r9);
        r11.addAll(r1.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d5, code lost:
        if (r2.A0B != false) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00d7, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00da, code lost:
        if (r1.A0B == false) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00dc, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00df, code lost:
        if (r2.A0H != false) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00e1, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00e4, code lost:
        if (r1.A0H == false) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00e6, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00e9, code lost:
        if (r2.A0I != false) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00eb, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00ee, code lost:
        if (r1.A0I == false) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00f0, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00f3, code lost:
        if (r2.A0G != false) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00f5, code lost:
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00f8, code lost:
        if (r1.A0G == false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00fa, code lost:
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00fd, code lost:
        if (r2.A0A != false) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00ff, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0103, code lost:
        if (r1.A0A == false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0105, code lost:
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0109, code lost:
        if (r2.A0C != false) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x010b, code lost:
        r17 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x010f, code lost:
        if (r1.A0C == false) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0111, code lost:
        r17 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0115, code lost:
        if (r2.A0F != false) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0117, code lost:
        r18 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x011b, code lost:
        if (r1.A0F == false) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x011d, code lost:
        r18 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0121, code lost:
        if (r2.A0D != false) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0123, code lost:
        r19 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0127, code lost:
        if (r1.A0D == false) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0129, code lost:
        r19 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x012d, code lost:
        if (r2.A0E != false) goto L_0x0135;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:187:0x0265=Splitter:B:187:0x0265, B:156:0x019e=Splitter:B:156:0x019e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C61272zz r25) {
        /*
            r24 = this;
            r2 = r25
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ContactSyncRequestExecutor/queueRequest "
            X.C18260x0.A1R(r1, r0, r2)
            r4 = r24
            java.util.concurrent.atomic.AtomicBoolean r10 = r4.A0X
            monitor-enter(r10)
            X.2p3 r3 = r4.A0H     // Catch:{ all -> 0x02a1 }
            monitor-enter(r3)     // Catch:{ all -> 0x02a1 }
            java.util.Set r0 = r3.A02     // Catch:{ all -> 0x028b }
            monitor-exit(r3)     // Catch:{ all -> 0x02a1 }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x02a1 }
        L_0x001a:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x02a1 }
            r7 = 0
            if (r0 == 0) goto L_0x01b3
            java.lang.Object r1 = r5.next()     // Catch:{ all -> 0x02a1 }
            X.2zz r1 = (X.C61272zz) r1     // Catch:{ all -> 0x02a1 }
            X.227 r9 = r1.A02     // Catch:{ all -> 0x02a1 }
            X.227 r12 = r2.A02     // Catch:{ all -> 0x02a1 }
            if (r9 != r12) goto L_0x001a
            X.227 r13 = X.AnonymousClass227.A0M     // Catch:{ all -> 0x02a1 }
            if (r9 == r13) goto L_0x001a
            java.lang.String r0 = "ContactSyncRequestExecutor/combineRequests"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x02a1 }
            X.2KF r0 = r3.A00(r1)     // Catch:{ all -> 0x02a1 }
            long r5 = r0.A00     // Catch:{ all -> 0x02a1 }
            long r14 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x02a1 }
            long r5 = r5 - r14
            long r5 = java.lang.Math.max(r5, r7)     // Catch:{ all -> 0x02a1 }
            android.os.Handler r11 = r4.A00()     // Catch:{ all -> 0x02a1 }
            java.lang.Runnable r0 = r0.A01     // Catch:{ all -> 0x02a1 }
            r11.removeCallbacks(r0)     // Catch:{ all -> 0x02a1 }
            if (r12 != r9) goto L_0x019e
            if (r12 == r13) goto L_0x019e
            if (r12 == r9) goto L_0x0082
            if (r9 == 0) goto L_0x0082
            if (r12 != 0) goto L_0x005b
            r12 = r9
            goto L_0x0082
        L_0x005b:
            X.21x r13 = r12.context     // Catch:{ all -> 0x02a1 }
            X.21x r11 = r9.context     // Catch:{ all -> 0x02a1 }
            int r0 = r13.compareTo(r11)     // Catch:{ all -> 0x02a1 }
            if (r0 < 0) goto L_0x0066
            r13 = r11
        L_0x0066:
            X.21Z r11 = r12.mode     // Catch:{ all -> 0x02a1 }
            X.21Z r9 = r9.mode     // Catch:{ all -> 0x02a1 }
            int r0 = r11.compareTo(r9)     // Catch:{ all -> 0x02a1 }
            if (r0 < 0) goto L_0x0071
            r11 = r9
        L_0x0071:
            X.227[] r15 = X.AnonymousClass227.values()     // Catch:{ all -> 0x02a1 }
            int r14 = r15.length     // Catch:{ all -> 0x02a1 }
            r9 = 0
            goto L_0x0093
        L_0x0078:
            r12 = r15[r9]     // Catch:{ all -> 0x02a1 }
            X.21x r0 = r12.context     // Catch:{ all -> 0x02a1 }
            if (r0 != r13) goto L_0x0091
            X.21Z r0 = r12.mode     // Catch:{ all -> 0x02a1 }
            if (r0 != r11) goto L_0x0091
        L_0x0082:
            X.2zU r0 = new X.2zU     // Catch:{ all -> 0x02a1 }
            r0.<init>(r12)     // Catch:{ all -> 0x02a1 }
            boolean r9 = r2.A01     // Catch:{ all -> 0x02a1 }
            if (r9 != 0) goto L_0x0096
            boolean r11 = r1.A01     // Catch:{ all -> 0x02a1 }
            r9 = 0
            if (r11 == 0) goto L_0x0097
            goto L_0x0096
        L_0x0091:
            int r9 = r9 + 1
        L_0x0093:
            if (r9 >= r14) goto L_0x028e
            goto L_0x0078
        L_0x0096:
            r9 = 1
        L_0x0097:
            r0.A02 = r9     // Catch:{ all -> 0x02a1 }
            boolean r9 = r2.A07     // Catch:{ all -> 0x02a1 }
            if (r9 == 0) goto L_0x00a2
            boolean r11 = r1.A07     // Catch:{ all -> 0x02a1 }
            r9 = 1
            if (r11 != 0) goto L_0x00a3
        L_0x00a2:
            r9 = 0
        L_0x00a3:
            r0.A03 = r9     // Catch:{ all -> 0x02a1 }
            boolean r9 = r2.A08     // Catch:{ all -> 0x02a1 }
            if (r9 == 0) goto L_0x00ae
            boolean r11 = r1.A08     // Catch:{ all -> 0x02a1 }
            r9 = 1
            if (r11 != 0) goto L_0x00af
        L_0x00ae:
            r9 = 0
        L_0x00af:
            r0.A04 = r9     // Catch:{ all -> 0x02a1 }
            boolean r9 = r2.A06     // Catch:{ all -> 0x02a1 }
            if (r9 != 0) goto L_0x00ba
            boolean r11 = r1.A06     // Catch:{ all -> 0x02a1 }
            r9 = 0
            if (r11 == 0) goto L_0x00bb
        L_0x00ba:
            r9 = 1
        L_0x00bb:
            r0.A01 = r9     // Catch:{ all -> 0x02a1 }
            java.util.List r9 = r2.A04     // Catch:{ all -> 0x02a1 }
            X.C60982zU.A01(r0, r9)     // Catch:{ all -> 0x02a1 }
            java.util.List r9 = r1.A04     // Catch:{ all -> 0x02a1 }
            X.C60982zU.A01(r0, r9)     // Catch:{ all -> 0x02a1 }
            java.util.Set r9 = r2.A05     // Catch:{ all -> 0x02a1 }
            java.util.Set r11 = r0.A07     // Catch:{ all -> 0x02a1 }
            r11.addAll(r9)     // Catch:{ all -> 0x02a1 }
            java.util.Set r9 = r1.A05     // Catch:{ all -> 0x02a1 }
            r11.addAll(r9)     // Catch:{ all -> 0x02a1 }
            boolean r9 = r2.A0B     // Catch:{ all -> 0x02a1 }
            if (r9 != 0) goto L_0x00dc
            boolean r9 = r1.A0B     // Catch:{ all -> 0x02a1 }
            r12 = 0
            if (r9 == 0) goto L_0x00dd
        L_0x00dc:
            r12 = 1
        L_0x00dd:
            boolean r9 = r2.A0H     // Catch:{ all -> 0x02a1 }
            if (r9 != 0) goto L_0x00e6
            boolean r9 = r1.A0H     // Catch:{ all -> 0x02a1 }
            r13 = 0
            if (r9 == 0) goto L_0x00e7
        L_0x00e6:
            r13 = 1
        L_0x00e7:
            boolean r9 = r2.A0I     // Catch:{ all -> 0x02a1 }
            if (r9 != 0) goto L_0x00f0
            boolean r9 = r1.A0I     // Catch:{ all -> 0x02a1 }
            r14 = 0
            if (r9 == 0) goto L_0x00f1
        L_0x00f0:
            r14 = 1
        L_0x00f1:
            boolean r9 = r2.A0G     // Catch:{ all -> 0x02a1 }
            if (r9 != 0) goto L_0x00fa
            boolean r9 = r1.A0G     // Catch:{ all -> 0x02a1 }
            r15 = 0
            if (r9 == 0) goto L_0x00fb
        L_0x00fa:
            r15 = 1
        L_0x00fb:
            boolean r9 = r2.A0A     // Catch:{ all -> 0x02a1 }
            if (r9 != 0) goto L_0x0105
            boolean r9 = r1.A0A     // Catch:{ all -> 0x02a1 }
            r16 = 0
            if (r9 == 0) goto L_0x0107
        L_0x0105:
            r16 = 1
        L_0x0107:
            boolean r9 = r2.A0C     // Catch:{ all -> 0x02a1 }
            if (r9 != 0) goto L_0x0111
            boolean r9 = r1.A0C     // Catch:{ all -> 0x02a1 }
            r17 = 0
            if (r9 == 0) goto L_0x0113
        L_0x0111:
            r17 = 1
        L_0x0113:
            boolean r9 = r2.A0F     // Catch:{ all -> 0x02a1 }
            if (r9 != 0) goto L_0x011d
            boolean r9 = r1.A0F     // Catch:{ all -> 0x02a1 }
            r18 = 0
            if (r9 == 0) goto L_0x011f
        L_0x011d:
            r18 = 1
        L_0x011f:
            boolean r9 = r2.A0D     // Catch:{ all -> 0x02a1 }
            if (r9 != 0) goto L_0x0129
            boolean r9 = r1.A0D     // Catch:{ all -> 0x02a1 }
            r19 = 0
            if (r9 == 0) goto L_0x012b
        L_0x0129:
            r19 = 1
        L_0x012b:
            boolean r9 = r2.A0E     // Catch:{ all -> 0x02a1 }
            if (r9 != 0) goto L_0x0135
            boolean r9 = r1.A0E     // Catch:{ all -> 0x02a1 }
            r20 = 0
            if (r9 == 0) goto L_0x0137
        L_0x0135:
            r20 = 1
        L_0x0137:
            boolean r9 = r2.A09     // Catch:{ all -> 0x02a1 }
            if (r9 != 0) goto L_0x0141
            boolean r9 = r1.A09     // Catch:{ all -> 0x02a1 }
            r21 = 0
            if (r9 == 0) goto L_0x0143
        L_0x0141:
            r21 = 1
        L_0x0143:
            boolean r9 = r2.A0K     // Catch:{ all -> 0x02a1 }
            if (r9 != 0) goto L_0x014d
            boolean r9 = r1.A0K     // Catch:{ all -> 0x02a1 }
            r22 = 0
            if (r9 == 0) goto L_0x014f
        L_0x014d:
            r22 = 1
        L_0x014f:
            boolean r9 = r2.A0J     // Catch:{ all -> 0x02a1 }
            if (r9 != 0) goto L_0x0159
            boolean r9 = r1.A0J     // Catch:{ all -> 0x02a1 }
            r23 = 0
            if (r9 == 0) goto L_0x015b
        L_0x0159:
            r23 = 1
        L_0x015b:
            X.2xW r11 = new X.2xW     // Catch:{ all -> 0x02a1 }
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x02a1 }
            r0.A00 = r11     // Catch:{ all -> 0x02a1 }
            X.2zz r9 = r0.A02()     // Catch:{ all -> 0x02a1 }
            int r11 = r2.A00     // Catch:{ all -> 0x02a1 }
            int r0 = r1.A00     // Catch:{ all -> 0x02a1 }
            int r0 = java.lang.Math.max(r11, r0)     // Catch:{ all -> 0x02a1 }
            r9.A00 = r0     // Catch:{ all -> 0x02a1 }
            java.util.List r2 = r2.A03     // Catch:{ all -> 0x02a1 }
            monitor-enter(r2)     // Catch:{ all -> 0x02a1 }
            java.util.ArrayList r0 = X.AnonymousClass002.A0J(r2)     // Catch:{ all -> 0x019a }
            monitor-exit(r2)     // Catch:{ all -> 0x019a }
            java.util.List r2 = r9.A03     // Catch:{ all -> 0x02a1 }
            monitor-enter(r2)     // Catch:{ all -> 0x02a1 }
            r2.addAll(r0)     // Catch:{ all -> 0x0196 }
            monitor-exit(r2)     // Catch:{ all -> 0x0196 }
            java.util.List r1 = r1.A03     // Catch:{ all -> 0x02a1 }
            monitor-enter(r1)     // Catch:{ all -> 0x02a1 }
            java.util.ArrayList r0 = X.AnonymousClass002.A0J(r1)     // Catch:{ all -> 0x0192 }
            monitor-exit(r1)     // Catch:{ all -> 0x0192 }
            monitor-enter(r2)     // Catch:{ all -> 0x02a1 }
            r2.addAll(r0)     // Catch:{ all -> 0x018e }
            monitor-exit(r2)     // Catch:{ all -> 0x018e }
            r2 = r9
            goto L_0x01b5
        L_0x018e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x018e }
            goto L_0x02a0
        L_0x0192:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0192 }
            goto L_0x02a0
        L_0x0196:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0196 }
            goto L_0x02a0
        L_0x019a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x019a }
            goto L_0x02a0
        L_0x019e:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x02a1 }
            java.lang.String r0 = "these requests cannot be combined "
            r3.append(r0)     // Catch:{ all -> 0x02a1 }
            r3.append(r2)     // Catch:{ all -> 0x02a1 }
            java.lang.String r0 = " and "
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0H(r1, r0, r3)     // Catch:{ all -> 0x02a1 }
            goto L_0x02a0
        L_0x01b3:
            r5 = -1
        L_0x01b5:
            X.3bn r9 = new X.3bn     // Catch:{ all -> 0x02a1 }
            r9.<init>(r4, r2)     // Catch:{ all -> 0x02a1 }
            boolean r0 = r2.A01     // Catch:{ all -> 0x02a1 }
            if (r0 == 0) goto L_0x01cf
            android.os.Handler r0 = r4.A00()     // Catch:{ all -> 0x02a1 }
            r0.postDelayed(r9, r7)     // Catch:{ all -> 0x02a1 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x02a1 }
            r3.A02(r2, r9, r0)     // Catch:{ all -> 0x02a1 }
        L_0x01cc:
            monitor-exit(r10)     // Catch:{ all -> 0x02a1 }
            goto L_0x0287
        L_0x01cf:
            X.1im r12 = r4.A05     // Catch:{ all -> 0x02a1 }
            int r1 = r12.A04     // Catch:{ all -> 0x02a1 }
            r0 = 2
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)     // Catch:{ all -> 0x02a1 }
            if (r0 == 0) goto L_0x0279
            X.1VX r11 = r4.A0P     // Catch:{ all -> 0x02a1 }
            r1 = 560(0x230, float:7.85E-43)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ all -> 0x02a1 }
            boolean r0 = r11.A0Y(r0, r1)     // Catch:{ all -> 0x02a1 }
            if (r0 == 0) goto L_0x01ec
            boolean r0 = r12.A0A()     // Catch:{ all -> 0x02a1 }
            if (r0 != 0) goto L_0x0279
        L_0x01ec:
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0209
            android.os.Handler r0 = r4.A00()     // Catch:{ all -> 0x02a1 }
            r0.postDelayed(r9, r5)     // Catch:{ all -> 0x02a1 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x02a1 }
            java.lang.String r0 = "ContactSyncRequestExecutor/delay/combine "
            X.C18260x0.A12(r0, r1, r5)     // Catch:{ all -> 0x02a1 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x02a1 }
            long r0 = r0 + r5
            r3.A02(r2, r9, r0)     // Catch:{ all -> 0x02a1 }
            goto L_0x01cc
        L_0x0209:
            boolean r0 = r2.A01     // Catch:{ all -> 0x02a1 }
            if (r0 == 0) goto L_0x0210
            r5 = 0
            goto L_0x021a
        L_0x0210:
            int r0 = r2.A00     // Catch:{ all -> 0x02a1 }
            if (r0 != 0) goto L_0x0225
            X.2wT r0 = r4.A0G     // Catch:{ all -> 0x02a1 }
            long r5 = r0.A00()     // Catch:{ all -> 0x02a1 }
        L_0x021a:
            android.os.Handler r0 = r4.A00()     // Catch:{ all -> 0x02a1 }
            r0.postDelayed(r9, r5)     // Catch:{ all -> 0x02a1 }
            X.2wT r7 = r4.A0G     // Catch:{ all -> 0x02a1 }
            monitor-enter(r7)     // Catch:{ all -> 0x02a1 }
            goto L_0x024a
        L_0x0225:
            int r1 = r0 * 2
            r0 = 8
            int r0 = java.lang.Math.min(r1, r0)     // Catch:{ all -> 0x02a1 }
            r5 = 1
            long r5 = r5 << r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r0
            java.util.Random r0 = r4.A0W     // Catch:{ all -> 0x02a1 }
            long r0 = r0.nextLong()     // Catch:{ all -> 0x02a1 }
            long r0 = r0 % r5
            long r0 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x02a1 }
            long r5 = r5 + r0
            X.2wT r0 = r4.A0G     // Catch:{ all -> 0x02a1 }
            long r0 = r0.A00()     // Catch:{ all -> 0x02a1 }
            long r5 = java.lang.Math.max(r5, r0)     // Catch:{ all -> 0x02a1 }
            goto L_0x021a
        L_0x024a:
            java.util.LinkedList r4 = r7.A00     // Catch:{ all -> 0x0288 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0288 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0288 }
            r4.addFirst(r0)     // Catch:{ all -> 0x0288 }
            java.util.LinkedList r4 = r7.A00     // Catch:{ all -> 0x0288 }
            int r1 = r4.size()     // Catch:{ all -> 0x0288 }
            int[] r0 = X.C59172wT.A01     // Catch:{ all -> 0x0288 }
            int r0 = r0.length     // Catch:{ all -> 0x0288 }
            if (r1 != r0) goto L_0x0265
            r4.removeLast()     // Catch:{ all -> 0x0288 }
        L_0x0265:
            monitor-exit(r7)     // Catch:{ all -> 0x02a1 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x02a1 }
            java.lang.String r0 = "ContactSyncRequestExecutor/delay "
            X.C18260x0.A12(r0, r1, r5)     // Catch:{ all -> 0x02a1 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x02a1 }
            long r0 = r0 + r5
            r3.A02(r2, r9, r0)     // Catch:{ all -> 0x02a1 }
            goto L_0x01cc
        L_0x0279:
            java.lang.String r0 = "ContactSyncRequestExecutor/freeze until connection returns"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x02a1 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x02a1 }
            r3.A02(r2, r9, r0)     // Catch:{ all -> 0x02a1 }
            goto L_0x01cc
        L_0x0287:
            return
        L_0x0288:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x02a1 }
            goto L_0x02a0
        L_0x028b:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x02a1 }
            goto L_0x02a0
        L_0x028e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x02a1 }
            java.lang.String r0 = "Context/Mode ("
            X.AnonymousClass0x7.A1F(r1, r0, r13)     // Catch:{ all -> 0x02a1 }
            r1.append(r11)     // Catch:{ all -> 0x02a1 }
            java.lang.String r0 = ") do not represent a recognized SyncType"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r0, r1)     // Catch:{ all -> 0x02a1 }
        L_0x02a0:
            throw r0     // Catch:{ all -> 0x02a1 }
        L_0x02a1:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x02a1 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64193Cn.A02(X.2zz):void");
    }

    public void BUB() {
        if (!this.A0P.A0Y(C58422vE.A02, 560)) {
            Log.d("ContactSyncRequestExecutor/onHandlerConnected process");
            this.A0T.execute(new C69973Zj(this, 34));
        }
    }

    public void BUE() {
        if (this.A0P.A0Y(C58422vE.A02, 560)) {
            Log.d("ContactSyncRequestExecutor/onHandlerOfflineProcessComplete process");
            this.A0T.execute(new C69973Zj(this, 34));
        }
    }

    public C64193Cn(C116985rC r3, C55682qk r4, C69263Wi r5, C56972sr r6, C29411im r7, AnonymousClass338 r8, C620433g r9, C48372en r10, C29441ip r11, C64773Ex r12, C56332ro r13, C623734t r14, C56882si r15, C60022xs r16, C44832Xq r17, C44842Xr r18, AnonymousClass314 r19, C620633i r20, C56612sH r21, C54292oU r22, AnonymousClass5ZR r23, C61072zf r24, AnonymousClass318 r25, AnonymousClass1VX r26, C1907099n r27, C56452s0 r28, C51072jE r29, AnonymousClass4FS r30, C183538qC r31) {
        this.A0L = r22;
        this.A0K = r21;
        this.A0P = r26;
        this.A0E = r17;
        this.A03 = r5;
        this.A02 = r4;
        this.A04 = r6;
        this.A0N = r24;
        this.A0A = r12;
        this.A0J = r20;
        this.A05 = r7;
        this.A0F = r18;
        this.A0O = r25;
        this.A01 = r3;
        this.A0D = r16;
        this.A0R = r28;
        this.A0M = r23;
        this.A08 = r10;
        this.A0U = r31;
        this.A0I = r19;
        this.A0Q = r27;
        this.A07 = r9;
        this.A0S = r29;
        this.A09 = r11;
        this.A0C = r15;
        this.A0B = r14;
        this.A06 = r8;
        this.A0V = new C69973Zj(r13, 33);
        this.A0T = C72173dI.A00(r30);
        this.A0H = new C54642p3(r15);
        this.A0G = new C59172wT();
    }

    public final List A01(Set set) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C95814uZ A0P2 = C18300x5.A0P(it);
            AnonymousClass3ZH A072 = this.A0A.A07(A0P2);
            if (A072 == null) {
                C18260x0.A1P(AnonymousClass001.A0o(), "ContactSyncRequestExecutor/createContactListFromRequest contact not exists in db jid=", A0P2);
                A072 = new AnonymousClass3ZH(A0P2);
            }
            A0s.add(A072);
        }
        return A0s;
    }

    public final void A03(Collection collection) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ContactSyncRequestExecutor/queueRequests count=");
        C18260x0.A1G(A0o, collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            A02((C61272zz) it.next());
        }
    }

    public /* synthetic */ void BUC() {
    }

    public /* synthetic */ void BUD() {
    }

    public /* synthetic */ void BUF() {
    }
}
