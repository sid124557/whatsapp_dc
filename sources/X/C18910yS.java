package X;

import android.os.Handler;
import android.os.Looper;
import com.whatsapp.Statistics$Data;
import java.io.File;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.0yS  reason: invalid class name and case insensitive filesystem */
public class C18910yS extends Handler implements AnonymousClass49Y {
    public Statistics$Data A00;
    public File A01;
    public File A02;
    public final CountDownLatch A03 = C18290x4.A14();
    public volatile boolean A04;
    public final /* synthetic */ C56492s4 A05;

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01e5, code lost:
        if (r5 != 4) goto L_0x020e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01e7, code lost:
        r11.A00.A0J += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01ef, code lost:
        r11.A00.A0D += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01f7, code lost:
        r11.A00.A0M += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01ff, code lost:
        r11.A00.A0G += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0207, code lost:
        r11.A00.A0E += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0085, code lost:
        X.C626936e.A06(r11.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r2 = new X.AnonymousClass202(r11.A05.A04.A00, r11.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.AnonymousClass0x2.A1L(r11.A00.A00(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r2.close();
        r11.A02.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00aa, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00af, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b4, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        com.whatsapp.util.Log.e("statistics/save: error saving", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x018a, code lost:
        if (r11.A04 == false) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x018c, code lost:
        r11.A00.A07 += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0193, code lost:
        if (r5 == 0) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0196, code lost:
        if (r5 == 1) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0199, code lost:
        if (r5 == 2) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x019c, code lost:
        if (r5 == 3) goto L_0x01a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x019f, code lost:
        if (r5 != 4) goto L_0x020e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01a1, code lost:
        r11.A00.A08 += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01a9, code lost:
        r11.A00.A00 += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01b1, code lost:
        r11.A00.A0B += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01b9, code lost:
        r11.A00.A03 += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01c1, code lost:
        r11.A00.A01 += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01d0, code lost:
        if (r11.A04 == false) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01d2, code lost:
        r11.A00.A0I += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01d9, code lost:
        if (r5 == 0) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01dc, code lost:
        if (r5 == 1) goto L_0x01ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01df, code lost:
        if (r5 == 2) goto L_0x01f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01e2, code lost:
        if (r5 == 3) goto L_0x01ef;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void handleMessage(android.os.Message r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            int r0 = r12.what     // Catch:{ all -> 0x0210 }
            r3 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L_0x0014;
                case 1: goto L_0x0085;
                case 2: goto L_0x01c9;
                case 3: goto L_0x0183;
                case 4: goto L_0x0176;
                case 5: goto L_0x0169;
                case 6: goto L_0x0136;
                case 7: goto L_0x00d6;
                case 8: goto L_0x00bd;
                case 9: goto L_0x007e;
                default: goto L_0x0008;
            }     // Catch:{ all -> 0x0210 }
        L_0x0008:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0210 }
            java.lang.String r0 = "statistics/stats-handler:unknown message:"
            X.C18260x0.A1Q(r1, r0, r12)     // Catch:{ all -> 0x0210 }
            goto L_0x020e
        L_0x0014:
            X.2s4 r0 = r11.A05     // Catch:{ all -> 0x0210 }
            X.2oU r0 = r0.A03     // Catch:{ all -> 0x0210 }
            android.content.Context r2 = r0.A00     // Catch:{ all -> 0x0210 }
            java.io.File r1 = r2.getFilesDir()     // Catch:{ all -> 0x0210 }
            java.lang.String r0 = "statistics"
            java.io.File r0 = X.AnonymousClass002.A0A(r1, r0)     // Catch:{ all -> 0x0210 }
            r11.A02 = r0     // Catch:{ all -> 0x0210 }
            java.io.File r1 = r2.getFilesDir()     // Catch:{ all -> 0x0210 }
            java.lang.String r0 = "statistics.json"
            java.io.File r0 = X.AnonymousClass002.A0A(r1, r0)     // Catch:{ all -> 0x0210 }
            r11.A01 = r0     // Catch:{ all -> 0x0210 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0210 }
            if (r0 == 0) goto L_0x005d
            java.io.File r0 = r11.A01     // Catch:{ Exception -> 0x004f }
            byte[] r1 = X.C382926u.A00(r0)     // Catch:{ Exception -> 0x004f }
            java.lang.String r0 = new java.lang.String     // Catch:{ Exception -> 0x004f }
            r0.<init>(r1)     // Catch:{ Exception -> 0x004f }
            org.json.JSONObject r0 = X.AnonymousClass0x9.A1H(r0)     // Catch:{ Exception -> 0x004f }
            com.whatsapp.Statistics$Data r1 = new com.whatsapp.Statistics$Data     // Catch:{ Exception -> 0x004f }
            r1.<init>((org.json.JSONObject) r0)     // Catch:{ Exception -> 0x004f }
            goto L_0x0062
        L_0x004f:
            r1 = move-exception
            java.lang.String r0 = "statistics/load: reset due to the error"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0210 }
            r0 = 1
            com.whatsapp.Statistics$Data r1 = new com.whatsapp.Statistics$Data     // Catch:{ all -> 0x0210 }
            r1.<init>((boolean) r0)     // Catch:{ all -> 0x0210 }
            goto L_0x0062
        L_0x005d:
            com.whatsapp.Statistics$Data r1 = new com.whatsapp.Statistics$Data     // Catch:{ all -> 0x0210 }
            r1.<init>((boolean) r3)     // Catch:{ all -> 0x0210 }
        L_0x0062:
            r11.A00 = r1     // Catch:{ all -> 0x0210 }
            java.util.concurrent.CountDownLatch r0 = r11.A03     // Catch:{ all -> 0x0210 }
            r0.countDown()     // Catch:{ all -> 0x0210 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0210 }
            java.lang.String r0 = "statistics/init: "
            r1.append(r0)     // Catch:{ all -> 0x0210 }
            com.whatsapp.Statistics$Data r0 = r11.A00     // Catch:{ all -> 0x0210 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0210 }
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x0210 }
            goto L_0x020e
        L_0x007e:
            com.whatsapp.Statistics$Data r0 = new com.whatsapp.Statistics$Data     // Catch:{ all -> 0x0210 }
            r0.<init>((boolean) r2)     // Catch:{ all -> 0x0210 }
            r11.A00 = r0     // Catch:{ all -> 0x0210 }
        L_0x0085:
            java.io.File r0 = r11.A01     // Catch:{ all -> 0x0210 }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x0210 }
            X.2s4 r0 = r11.A05     // Catch:{ Exception -> 0x00b4 }
            X.2eK r0 = r0.A04     // Catch:{ Exception -> 0x00b4 }
            java.io.File r1 = r11.A01     // Catch:{ Exception -> 0x00b4 }
            X.2gw r0 = r0.A00     // Catch:{ Exception -> 0x00b4 }
            X.202 r2 = new X.202     // Catch:{ Exception -> 0x00b4 }
            r2.<init>(r0, r1)     // Catch:{ Exception -> 0x00b4 }
            com.whatsapp.Statistics$Data r0 = r11.A00     // Catch:{ all -> 0x00aa }
            java.lang.String r0 = r0.A00()     // Catch:{ all -> 0x00aa }
            X.AnonymousClass0x2.A1L(r0, r2)     // Catch:{ all -> 0x00aa }
            r2.close()     // Catch:{ Exception -> 0x00b4 }
            java.io.File r0 = r11.A02     // Catch:{ Exception -> 0x00b4 }
            r0.delete()     // Catch:{ Exception -> 0x00b4 }
            goto L_0x020e
        L_0x00aa:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x00af }
            goto L_0x00b3
        L_0x00af:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x00b4 }
        L_0x00b3:
            throw r1     // Catch:{ Exception -> 0x00b4 }
        L_0x00b4:
            r1 = move-exception
            java.lang.String r0 = "statistics/save: error saving"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0210 }
            goto L_0x020e
        L_0x00bd:
            int r0 = r12.arg1     // Catch:{ all -> 0x0210 }
            if (r0 != r2) goto L_0x00c2
            r3 = 1
        L_0x00c2:
            r4 = 1
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0210 }
            if (r3 == 0) goto L_0x00cf
            long r0 = r2.A0N     // Catch:{ all -> 0x0210 }
            long r0 = r0 + r4
            r2.A0N = r0     // Catch:{ all -> 0x0210 }
            goto L_0x020e
        L_0x00cf:
            long r0 = r2.A0C     // Catch:{ all -> 0x0210 }
            long r0 = r0 + r4
            r2.A0C = r0     // Catch:{ all -> 0x0210 }
            goto L_0x020e
        L_0x00d6:
            android.os.Bundle r3 = r12.getData()     // Catch:{ all -> 0x0210 }
            java.lang.String r0 = "messageType"
            int r7 = r3.getInt(r0)     // Catch:{ all -> 0x0210 }
            java.lang.String r0 = "timestamp"
            long r1 = r3.getLong(r0)     // Catch:{ all -> 0x0210 }
            java.lang.String r0 = "isPayment"
            boolean r10 = r3.getBoolean(r0)     // Catch:{ all -> 0x0210 }
            X.2s4 r0 = r11.A05     // Catch:{ all -> 0x0210 }
            X.2sH r0 = r0.A02     // Catch:{ all -> 0x0210 }
            long r8 = X.C56612sH.A03(r0, r1)     // Catch:{ all -> 0x0210 }
            r1 = 1000(0x3e8, double:4.94E-321)
            r5 = 1
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x010b
            com.whatsapp.Statistics$Data r4 = r11.A00     // Catch:{ all -> 0x0210 }
            long r2 = r4.A04     // Catch:{ all -> 0x0210 }
            long r0 = r4.A05     // Catch:{ all -> 0x0210 }
            long r2 = r2 * r0
            long r2 = r2 + r8
            long r0 = r0 + r5
            r4.A05 = r0     // Catch:{ all -> 0x0210 }
            long r2 = r2 / r0
            r4.A04 = r2     // Catch:{ all -> 0x0210 }
        L_0x010b:
            r0 = 3
            if (r7 != r0) goto L_0x0116
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0210 }
            long r0 = r2.A09     // Catch:{ all -> 0x0210 }
            long r0 = r0 + r5
            r2.A09 = r0     // Catch:{ all -> 0x0210 }
            goto L_0x012b
        L_0x0116:
            r0 = 1
            if (r7 != r0) goto L_0x0121
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0210 }
            long r0 = r2.A0A     // Catch:{ all -> 0x0210 }
            long r0 = r0 + r5
            r2.A0A = r0     // Catch:{ all -> 0x0210 }
            goto L_0x012b
        L_0x0121:
            r0 = 2
            if (r7 != r0) goto L_0x012b
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0210 }
            long r0 = r2.A02     // Catch:{ all -> 0x0210 }
            long r0 = r0 + r5
            r2.A02 = r0     // Catch:{ all -> 0x0210 }
        L_0x012b:
            if (r10 == 0) goto L_0x020e
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0210 }
            long r0 = r2.A06     // Catch:{ all -> 0x0210 }
            long r0 = r0 + r5
            r2.A06 = r0     // Catch:{ all -> 0x0210 }
            goto L_0x020e
        L_0x0136:
            int r1 = r12.arg1     // Catch:{ all -> 0x0210 }
            int r0 = r12.arg2     // Catch:{ all -> 0x0210 }
            if (r0 != r2) goto L_0x013d
            r3 = 1
        L_0x013d:
            r0 = 3
            r4 = 1
            if (r1 != r0) goto L_0x014a
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0210 }
            long r0 = r2.A0K     // Catch:{ all -> 0x0210 }
            long r0 = r0 + r4
            r2.A0K = r0     // Catch:{ all -> 0x0210 }
            goto L_0x015e
        L_0x014a:
            if (r1 != r2) goto L_0x0154
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0210 }
            long r0 = r2.A0L     // Catch:{ all -> 0x0210 }
            long r0 = r0 + r4
            r2.A0L = r0     // Catch:{ all -> 0x0210 }
            goto L_0x015e
        L_0x0154:
            r0 = 2
            if (r1 != r0) goto L_0x015e
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0210 }
            long r0 = r2.A0F     // Catch:{ all -> 0x0210 }
            long r0 = r0 + r4
            r2.A0F = r0     // Catch:{ all -> 0x0210 }
        L_0x015e:
            if (r3 == 0) goto L_0x020e
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0210 }
            long r0 = r2.A0H     // Catch:{ all -> 0x0210 }
            long r0 = r0 + r4
            r2.A0H = r0     // Catch:{ all -> 0x0210 }
            goto L_0x020e
        L_0x0169:
            int r5 = r12.arg1     // Catch:{ all -> 0x0210 }
            android.os.Bundle r1 = r12.getData()     // Catch:{ all -> 0x0210 }
            java.lang.String r0 = "bytes"
            long r3 = r1.getLong(r0)     // Catch:{ all -> 0x0210 }
            goto L_0x0188
        L_0x0176:
            int r5 = r12.arg1     // Catch:{ all -> 0x0210 }
            android.os.Bundle r1 = r12.getData()     // Catch:{ all -> 0x0210 }
            java.lang.String r0 = "bytes"
            long r3 = r1.getLong(r0)     // Catch:{ all -> 0x0210 }
            goto L_0x01ce
        L_0x0183:
            int r5 = r12.arg1     // Catch:{ all -> 0x0210 }
            int r0 = r12.arg2     // Catch:{ all -> 0x0210 }
            long r3 = (long) r0     // Catch:{ all -> 0x0210 }
        L_0x0188:
            boolean r0 = r11.A04     // Catch:{ all -> 0x0210 }
            if (r0 == 0) goto L_0x0193
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0210 }
            long r0 = r2.A07     // Catch:{ all -> 0x0210 }
            long r0 = r0 + r3
            r2.A07 = r0     // Catch:{ all -> 0x0210 }
        L_0x0193:
            if (r5 == 0) goto L_0x01c1
            r0 = 1
            if (r5 == r0) goto L_0x01b9
            r0 = 2
            if (r5 == r0) goto L_0x01b1
            r0 = 3
            if (r5 == r0) goto L_0x01a9
            r0 = 4
            if (r5 != r0) goto L_0x020e
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0210 }
            long r0 = r2.A08     // Catch:{ all -> 0x0210 }
            long r0 = r0 + r3
            r2.A08 = r0     // Catch:{ all -> 0x0210 }
            goto L_0x020e
        L_0x01a9:
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0210 }
            long r0 = r2.A00     // Catch:{ all -> 0x0210 }
            long r0 = r0 + r3
            r2.A00 = r0     // Catch:{ all -> 0x0210 }
            goto L_0x020e
        L_0x01b1:
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0210 }
            long r0 = r2.A0B     // Catch:{ all -> 0x0210 }
            long r0 = r0 + r3
            r2.A0B = r0     // Catch:{ all -> 0x0210 }
            goto L_0x020e
        L_0x01b9:
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0210 }
            long r0 = r2.A03     // Catch:{ all -> 0x0210 }
            long r0 = r0 + r3
            r2.A03 = r0     // Catch:{ all -> 0x0210 }
            goto L_0x020e
        L_0x01c1:
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0210 }
            long r0 = r2.A01     // Catch:{ all -> 0x0210 }
            long r0 = r0 + r3
            r2.A01 = r0     // Catch:{ all -> 0x0210 }
            goto L_0x020e
        L_0x01c9:
            int r5 = r12.arg1     // Catch:{ all -> 0x0210 }
            int r0 = r12.arg2     // Catch:{ all -> 0x0210 }
            long r3 = (long) r0     // Catch:{ all -> 0x0210 }
        L_0x01ce:
            boolean r0 = r11.A04     // Catch:{ all -> 0x0210 }
            if (r0 == 0) goto L_0x01d9
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0210 }
            long r0 = r2.A0I     // Catch:{ all -> 0x0210 }
            long r0 = r0 + r3
            r2.A0I = r0     // Catch:{ all -> 0x0210 }
        L_0x01d9:
            if (r5 == 0) goto L_0x0207
            r0 = 1
            if (r5 == r0) goto L_0x01ff
            r0 = 2
            if (r5 == r0) goto L_0x01f7
            r0 = 3
            if (r5 == r0) goto L_0x01ef
            r0 = 4
            if (r5 != r0) goto L_0x020e
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0210 }
            long r0 = r2.A0J     // Catch:{ all -> 0x0210 }
            long r0 = r0 + r3
            r2.A0J = r0     // Catch:{ all -> 0x0210 }
            goto L_0x020e
        L_0x01ef:
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0210 }
            long r0 = r2.A0D     // Catch:{ all -> 0x0210 }
            long r0 = r0 + r3
            r2.A0D = r0     // Catch:{ all -> 0x0210 }
            goto L_0x020e
        L_0x01f7:
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0210 }
            long r0 = r2.A0M     // Catch:{ all -> 0x0210 }
            long r0 = r0 + r3
            r2.A0M = r0     // Catch:{ all -> 0x0210 }
            goto L_0x020e
        L_0x01ff:
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0210 }
            long r0 = r2.A0G     // Catch:{ all -> 0x0210 }
            long r0 = r0 + r3
            r2.A0G = r0     // Catch:{ all -> 0x0210 }
            goto L_0x020e
        L_0x0207:
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0210 }
            long r0 = r2.A0E     // Catch:{ all -> 0x0210 }
            long r0 = r0 + r3
            r2.A0E = r0     // Catch:{ all -> 0x0210 }
        L_0x020e:
            monitor-exit(r11)
            return
        L_0x0210:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18910yS.handleMessage(android.os.Message):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18910yS(Looper looper, C56492s4 r3, C29441ip r4) {
        super(looper);
        this.A05 = r3;
        r4.A06(this);
    }

    public void BPq(C59622xD r2) {
        this.A04 = r2.A02;
    }
}
