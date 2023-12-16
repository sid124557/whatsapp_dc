package com.whatsapp.workers.ntp;

import X.AnonymousClass1VX;
import X.C03070Is;
import X.C103525Nh;
import X.C389229y;
import X.C56612sH;
import X.C64333Db;
import X.C64733Es;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.whatsapp.util.Log;

public class NtpSyncWorker extends Worker {
    public static volatile long A05;
    public final Context A00;
    public final C56612sH A01;
    public final C64733Es A02;
    public final AnonymousClass1VX A03;
    public final C103525Nh A04;

    public C03070Is A0C() {
        return A00(this.A00, this.A01, this.A02, this.A03, this.A04);
    }

    public NtpSyncWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.A00 = context;
        Log.d("ntpsync/hilt");
        C64333Db A002 = C389229y.A00(context);
        this.A01 = A002.Bqh();
        this.A03 = A002.Avy();
        this.A02 = (C64733Es) A002.A8Y.get();
        this.A04 = (C103525Nh) A002.AcK.A00.A8J.get();
    }

    /* JADX WARNING: Removed duplicated region for block: B:129:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02f0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0138 A[SYNTHETIC, Splitter:B:48:0x0138] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01ef A[Catch:{ UnknownHostException -> 0x02ce, all -> 0x02f3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C03070Is A00(android.content.Context r22, X.C56612sH r23, X.C64733Es r24, X.AnonymousClass1VX r25, X.C103525Nh r26) {
        /*
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r0 = A05
            long r5 = r5 - r0
            long r3 = A05
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0021
            r1 = 21600000(0x1499700, double:1.0671818E-316)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0021
            java.lang.String r0 = "NtpSyncWorker/executeNtpSync(); another sync happened recently, skipping..."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0Ap r2 = new X.0Ap
            r2.<init>()
            return r2
        L_0x0021:
            java.lang.String r0 = "/ntp/started"
            r13 = r26
            r13.A00(r0)
            java.lang.String r4 = " at resolved address "
            android.content.res.Resources r5 = r22.getResources()
            android.content.res.Resources r2 = android.content.res.Resources.getSystem()
            java.lang.String r1 = "android:string/config_ntpServer"
            r0 = 0
            int r0 = r2.getIdentifier(r1, r0, r0)
            java.lang.String r3 = "2.android.pool.ntp.org"
            if (r0 == 0) goto L_0x0055
            java.lang.String r1 = r5.getString(r0)     // Catch:{ NotFoundException -> 0x004d }
            boolean r0 = r1.isEmpty()     // Catch:{ NotFoundException -> 0x004d }
            if (r0 == 0) goto L_0x0054
            java.lang.String r0 = "NtpSyncWorker/ntp-server; empty ntp server configuration"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ NotFoundException -> 0x004d }
            goto L_0x0055
        L_0x004d:
            r1 = move-exception
            java.lang.String r0 = "NtpSyncWorker/ntp-server; unresolvable ntp server configuration"
            com.whatsapp.util.Log.w(r0, r1)
            goto L_0x0055
        L_0x0054:
            r3 = r1
        L_0x0055:
            r0 = 4
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ all -> 0x02f3 }
            r0 = r24
            X.2vo r0 = r0.A00(r3)     // Catch:{ UnknownHostException -> 0x02ce }
            java.net.InetAddress[] r0 = r0.A04     // Catch:{ UnknownHostException -> 0x02ce }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ UnknownHostException -> 0x02ce }
            r22 = 0
            r21 = r22
            r20 = 0
            java.util.Iterator r19 = r0.iterator()     // Catch:{ all -> 0x02f3 }
        L_0x006f:
            boolean r0 = r19.hasNext()     // Catch:{ all -> 0x02f3 }
            if (r0 == 0) goto L_0x014e
            java.lang.Object r5 = r19.next()     // Catch:{ all -> 0x02f3 }
            java.net.InetAddress r5 = (java.net.InetAddress) r5     // Catch:{ all -> 0x02f3 }
            java.net.DatagramSocket r9 = new java.net.DatagramSocket     // Catch:{ SocketTimeoutException -> 0x0123, IOException -> 0x010f }
            r9.<init>()     // Catch:{ SocketTimeoutException -> 0x0123, IOException -> 0x010f }
            r21 = r9
            r0 = 20000(0x4e20, float:2.8026E-41)
            r9.setSoTimeout(r0)     // Catch:{ SocketTimeoutException -> 0x0123, IOException -> 0x010f }
            r20 = 1
            r2 = 123(0x7b, float:1.72E-43)
            X.2os r6 = new X.2os     // Catch:{ SocketTimeoutException -> 0x0123, IOException -> 0x010f }
            r6.<init>()     // Catch:{ SocketTimeoutException -> 0x0123, IOException -> 0x010f }
            byte[] r12 = r6.A00     // Catch:{ SocketTimeoutException -> 0x0123, IOException -> 0x010f }
            r18 = 0
            byte r0 = r12[r18]     // Catch:{ SocketTimeoutException -> 0x0123, IOException -> 0x010f }
            r1 = r0 & 248(0xf8, float:3.48E-43)
            r0 = 3
            r0 = r0 | r1
            byte r0 = (byte) r0     // Catch:{ SocketTimeoutException -> 0x0123, IOException -> 0x010f }
            r12[r18] = r0     // Catch:{ SocketTimeoutException -> 0x0123, IOException -> 0x010f }
            r1 = r0 & 199(0xc7, float:2.79E-43)
            r0 = 24
            r0 = r0 | r1
            byte r0 = (byte) r0     // Catch:{ SocketTimeoutException -> 0x0123, IOException -> 0x010f }
            r12[r18] = r0     // Catch:{ SocketTimeoutException -> 0x0123, IOException -> 0x010f }
            java.net.DatagramPacket r11 = r6.A00()     // Catch:{ SocketTimeoutException -> 0x0123, IOException -> 0x010f }
            r11.setAddress(r5)     // Catch:{ SocketTimeoutException -> 0x0123, IOException -> 0x010f }
            r11.setPort(r2)     // Catch:{ SocketTimeoutException -> 0x0123, IOException -> 0x010f }
            X.2os r8 = new X.2os     // Catch:{ SocketTimeoutException -> 0x0123, IOException -> 0x010f }
            r8.<init>()     // Catch:{ SocketTimeoutException -> 0x0123, IOException -> 0x010f }
            java.net.DatagramPacket r10 = r8.A00()     // Catch:{ SocketTimeoutException -> 0x0123, IOException -> 0x010f }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ SocketTimeoutException -> 0x0123, IOException -> 0x010f }
            r6 = 2085978496000(0x1e5ae01dc00, double:1.030610312837E-311)
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00cc
            r18 = 1
            r6 = -2208988800000(0xfffffdfdae01dc00, double:NaN)
        L_0x00cc:
            long r0 = r0 - r6
            r16 = 1000(0x3e8, double:4.94E-321)
            long r14 = r0 / r16
            long r0 = r0 % r16
            r6 = 4294967296(0x100000000, double:2.121995791E-314)
            long r0 = r0 * r6
            long r0 = r0 / r16
            if (r18 == 0) goto L_0x00e3
            r6 = 2147483648(0x80000000, double:1.0609978955E-314)
            long r14 = r14 | r6
        L_0x00e3:
            r2 = 32
            long r14 = r14 << r2
            long r0 = r0 | r14
            X.5rJ r2 = new X.5rJ     // Catch:{ SocketTimeoutException -> 0x0123, IOException -> 0x010f }
            r2.<init>(r0)     // Catch:{ SocketTimeoutException -> 0x0123, IOException -> 0x010f }
            long r1 = r2.ntpTime     // Catch:{ SocketTimeoutException -> 0x0123, IOException -> 0x010f }
            r15 = 7
        L_0x00ef:
            int r14 = r15 + 40
            r6 = 255(0xff, double:1.26E-321)
            long r6 = r6 & r1
            int r0 = (int) r6     // Catch:{ SocketTimeoutException -> 0x0123, IOException -> 0x010f }
            byte r0 = (byte) r0     // Catch:{ SocketTimeoutException -> 0x0123, IOException -> 0x010f }
            r12[r14] = r0     // Catch:{ SocketTimeoutException -> 0x0123, IOException -> 0x010f }
            r0 = 8
            long r1 = r1 >>> r0
            int r15 = r15 + -1
            if (r15 >= 0) goto L_0x00ef
            r9.send(r11)     // Catch:{ SocketTimeoutException -> 0x0123, IOException -> 0x010f }
            r9.receive(r10)     // Catch:{ SocketTimeoutException -> 0x0123, IOException -> 0x010f }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ SocketTimeoutException -> 0x0123, IOException -> 0x010f }
            X.5KO r11 = new X.5KO     // Catch:{ SocketTimeoutException -> 0x0123, IOException -> 0x010f }
            r11.<init>(r8, r0)     // Catch:{ SocketTimeoutException -> 0x0123, IOException -> 0x010f }
            goto L_0x0141
        L_0x010f:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0145 }
            java.lang.String r0 = "NtpSyncWorker/sync; unable to retrieve ntp time from "
            X.AnonymousClass001.A1K(r0, r3, r4, r1)     // Catch:{ all -> 0x0145 }
            java.lang.String r0 = X.AnonymousClass000.A0R(r5, r1)     // Catch:{ all -> 0x0145 }
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ all -> 0x0145 }
            if (r20 == 0) goto L_0x006f
            goto L_0x0136
        L_0x0123:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0145 }
            java.lang.String r0 = "NtpSyncWorker/sync; socket timeout occurred while retrieving ntp time from "
            X.AnonymousClass001.A1K(r0, r3, r4, r1)     // Catch:{ all -> 0x0145 }
            java.lang.String r0 = X.AnonymousClass000.A0R(r5, r1)     // Catch:{ all -> 0x0145 }
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ all -> 0x0145 }
            if (r20 == 0) goto L_0x006f
        L_0x0136:
            if (r21 == 0) goto L_0x013b
            r21.close()     // Catch:{ all -> 0x02f3 }
        L_0x013b:
            r21 = r22
            r20 = 0
            goto L_0x006f
        L_0x0141:
            r9.close()     // Catch:{ all -> 0x02f3 }
            goto L_0x014f
        L_0x0145:
            r0 = move-exception
            if (r20 == 0) goto L_0x014d
            if (r21 == 0) goto L_0x014d
            r21.close()     // Catch:{ all -> 0x02f3 }
        L_0x014d:
            throw r0     // Catch:{ all -> 0x02f3 }
        L_0x014e:
            r11 = 0
        L_0x014f:
            if (r11 != 0) goto L_0x0161
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x02f3 }
            java.lang.String r0 = "NtpSyncWorker/sync; unable to retrieve ntp time from any of the resolved addresses for "
            X.C18260x0.A0t(r0, r3, r1)     // Catch:{ all -> 0x02f3 }
            X.0An r2 = new X.0An     // Catch:{ all -> 0x02f3 }
            r2.<init>()     // Catch:{ all -> 0x02f3 }
            goto L_0x02dd
        L_0x0161:
            boolean r0 = r11.A03     // Catch:{ all -> 0x02f3 }
            if (r0 != 0) goto L_0x023e
            r0 = 1
            r11.A03 = r0     // Catch:{ all -> 0x02f3 }
            java.util.List r3 = r11.A02     // Catch:{ all -> 0x02f3 }
            if (r3 != 0) goto L_0x0172
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x02f3 }
            r11.A02 = r3     // Catch:{ all -> 0x02f3 }
        L_0x0172:
            X.2os r4 = r11.A05     // Catch:{ all -> 0x02f3 }
            r0 = 24
            X.5rJ r2 = r4.A01(r0)     // Catch:{ all -> 0x02f3 }
            long r0 = r2.ntpTime     // Catch:{ all -> 0x02f3 }
            long r6 = X.C117055rJ.A00(r0)     // Catch:{ all -> 0x02f3 }
            r0 = 32
            X.5rJ r12 = r4.A01(r0)     // Catch:{ all -> 0x02f3 }
            long r0 = r12.ntpTime     // Catch:{ all -> 0x02f3 }
            long r20 = X.C117055rJ.A00(r0)     // Catch:{ all -> 0x02f3 }
            r0 = 40
            X.5rJ r10 = r4.A01(r0)     // Catch:{ all -> 0x02f3 }
            long r8 = r10.ntpTime     // Catch:{ all -> 0x02f3 }
            long r4 = X.C117055rJ.A00(r8)     // Catch:{ all -> 0x02f3 }
            long r0 = r2.ntpTime     // Catch:{ all -> 0x02f3 }
            r18 = 0
            int r2 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r2 != 0) goto L_0x01aa
            int r0 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x01a6
            goto L_0x0231
        L_0x01a6:
            java.lang.String r0 = "Error: zero orig time -- cannot compute delay/offset"
            goto L_0x023b
        L_0x01aa:
            long r1 = r12.ntpTime     // Catch:{ all -> 0x02f3 }
            java.lang.String r0 = "Error: OrigTime > DestRcvTime"
            int r14 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r14 == 0) goto L_0x01f0
            int r1 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r1 == 0) goto L_0x01f0
            long r1 = r11.A04     // Catch:{ all -> 0x02f3 }
            long r16 = r1 - r6
            int r8 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r8 >= 0) goto L_0x01c4
            java.lang.String r8 = "Error: xmitTime < rcvTime"
        L_0x01c0:
            r3.add(r8)     // Catch:{ all -> 0x02f3 }
            goto L_0x01dd
        L_0x01c4:
            long r14 = r4 - r20
            int r8 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r8 > 0) goto L_0x01cd
            long r18 = r16 - r14
            goto L_0x01e5
        L_0x01cd:
            long r14 = r14 - r16
            r9 = 1
            int r8 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x01da
            int r8 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r8 == 0) goto L_0x01dd
            goto L_0x01e0
        L_0x01da:
            java.lang.String r8 = "Warning: processing time > total network time"
            goto L_0x01c0
        L_0x01dd:
            r18 = r16
            goto L_0x01e5
        L_0x01e0:
            java.lang.String r8 = "Info: processing time > total network time by 1 ms -> assume zero delay"
            r3.add(r8)     // Catch:{ all -> 0x02f3 }
        L_0x01e5:
            java.lang.Long r3 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x02f3 }
            r11.A00 = r3     // Catch:{ all -> 0x02f3 }
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0221
            goto L_0x021c
        L_0x01f0:
            java.lang.String r1 = "Warning: zero rcvNtpTime or xmitNtpTime"
            r3.add(r1)     // Catch:{ all -> 0x02f3 }
            long r2 = r11.A04     // Catch:{ all -> 0x02f3 }
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0207
            java.util.List r1 = r11.A02     // Catch:{ all -> 0x02f3 }
            r1.add(r0)     // Catch:{ all -> 0x02f3 }
        L_0x0200:
            long r0 = r12.ntpTime     // Catch:{ all -> 0x02f3 }
            int r8 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r8 == 0) goto L_0x0211
            goto L_0x020e
        L_0x0207:
            java.lang.Long r0 = X.C18310x6.A0f(r2, r6)     // Catch:{ all -> 0x02f3 }
            r11.A00 = r0     // Catch:{ all -> 0x02f3 }
            goto L_0x0200
        L_0x020e:
            long r20 = r20 - r6
            goto L_0x022a
        L_0x0211:
            long r6 = r10.ntpTime     // Catch:{ all -> 0x02f3 }
            int r0 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x023e
            java.lang.Long r0 = X.C18310x6.A0f(r4, r2)     // Catch:{ all -> 0x02f3 }
            goto L_0x022e
        L_0x021c:
            java.util.List r3 = r11.A02     // Catch:{ all -> 0x02f3 }
            r3.add(r0)     // Catch:{ all -> 0x02f3 }
        L_0x0221:
            long r20 = r20 - r6
            long r4 = r4 - r1
            long r20 = r20 + r4
            r0 = 2
            long r20 = r20 / r0
        L_0x022a:
            java.lang.Long r0 = java.lang.Long.valueOf(r20)     // Catch:{ all -> 0x02f3 }
        L_0x022e:
            r11.A01 = r0     // Catch:{ all -> 0x02f3 }
            goto L_0x023e
        L_0x0231:
            long r0 = r11.A04     // Catch:{ all -> 0x02f3 }
            java.lang.Long r0 = X.C18310x6.A0f(r4, r0)     // Catch:{ all -> 0x02f3 }
            r11.A01 = r0     // Catch:{ all -> 0x02f3 }
            java.lang.String r0 = "Error: zero orig time -- cannot compute delay"
        L_0x023b:
            r3.add(r0)     // Catch:{ all -> 0x02f3 }
        L_0x023e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x02f3 }
            java.lang.String r0 = "NtpSyncWorker/sync; computed NTP offset "
            r1.append(r0)     // Catch:{ all -> 0x02f3 }
            java.lang.Long r0 = r11.A01     // Catch:{ all -> 0x02f3 }
            r1.append(r0)     // Catch:{ all -> 0x02f3 }
            java.lang.String r0 = " and delay "
            r1.append(r0)     // Catch:{ all -> 0x02f3 }
            java.lang.Long r0 = r11.A00     // Catch:{ all -> 0x02f3 }
            X.C18260x0.A0m(r0, r1)     // Catch:{ all -> 0x02f3 }
            java.lang.Long r0 = r11.A01     // Catch:{ all -> 0x02f3 }
            if (r0 != 0) goto L_0x0265
            java.lang.String r0 = "NtpSyncWorker/sync; NTP offset is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x02f3 }
            X.0An r2 = new X.0An     // Catch:{ all -> 0x02f3 }
            r2.<init>()     // Catch:{ all -> 0x02f3 }
            goto L_0x02dd
        L_0x0265:
            long r4 = r11.A04     // Catch:{ all -> 0x02f3 }
            long r2 = r0.longValue()     // Catch:{ all -> 0x02f3 }
            long r4 = r4 + r2
            r8 = r23
            long r6 = r8.A0D()     // Catch:{ all -> 0x02f3 }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02f3 }
            long r0 = r4 - r6
            long r6 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x02f3 }
            r9 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x02a8
            long r0 = r4 - r11
            long r6 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x02f3 }
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x02a8
            r1 = 2225(0x8b1, float:3.118E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ all -> 0x02f3 }
            r6 = r25
            boolean r0 = r6.A0Y(r0, r1)     // Catch:{ all -> 0x02f3 }
            if (r0 == 0) goto L_0x02a8
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x02f3 }
            java.lang.String r0 = "NtpSyncWorker/sync; NTP time too far from server or device time; ntpTimeMs="
            X.C18270x1.A1B(r0, r1, r4)     // Catch:{ all -> 0x02f3 }
            X.0An r2 = new X.0An     // Catch:{ all -> 0x02f3 }
            r2.<init>()     // Catch:{ all -> 0x02f3 }
            goto L_0x02dd
        L_0x02a8:
            r8.A0J(r2)     // Catch:{ all -> 0x02f3 }
            X.2og r0 = r8.A01     // Catch:{ all -> 0x02f3 }
            android.content.SharedPreferences r4 = r0.A01     // Catch:{ all -> 0x02f3 }
            android.content.SharedPreferences$Editor r1 = r4.edit()     // Catch:{ all -> 0x02f3 }
            java.lang.String r0 = "client_ntp_time_diff"
            X.C18270x1.A0i(r1, r0, r2)     // Catch:{ all -> 0x02f3 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02f3 }
            android.content.SharedPreferences$Editor r1 = r4.edit()     // Catch:{ all -> 0x02f3 }
            java.lang.String r0 = "last_ntp_client_time"
            X.C18270x1.A0i(r1, r0, r2)     // Catch:{ all -> 0x02f3 }
            android.net.TrafficStats.clearThreadStatsTag()
            X.0Ap r2 = new X.0Ap
            r2.<init>()
            goto L_0x02e0
        L_0x02ce:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x02f3 }
            java.lang.String r0 = "NtpSyncWorker/sync; unable to resolve ntp server "
            X.C18260x0.A0v(r0, r3, r1, r2)     // Catch:{ all -> 0x02f3 }
            X.0An r2 = new X.0An     // Catch:{ all -> 0x02f3 }
            r2.<init>()     // Catch:{ all -> 0x02f3 }
        L_0x02dd:
            android.net.TrafficStats.clearThreadStatsTag()
        L_0x02e0:
            boolean r0 = r2 instanceof X.C01410Ap
            if (r0 == 0) goto L_0x02f0
            long r0 = android.os.SystemClock.elapsedRealtime()
            A05 = r0
            java.lang.String r0 = "/ntp/succeeded"
        L_0x02ec:
            r13.A00(r0)
            return r2
        L_0x02f0:
            java.lang.String r0 = "/ntp/failed"
            goto L_0x02ec
        L_0x02f3:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.workers.ntp.NtpSyncWorker.A00(android.content.Context, X.2sH, X.3Es, X.1VX, X.5Nh):X.0Is");
    }
}
