package com.google.android.gms.vision.clearcut;

import X.C156917hQ;
import android.content.Context;

public class VisionClearcutLogger {
    public final C156917hQ zza;
    public boolean zzb = true;

    /* JADX WARNING: Can't wrap try/catch for region: R(7:166|167|(4:170|171|172|168)|271|181|(1:183)(2:187|(3:189|190|191))|184) */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0218, code lost:
        if (r1 != false) goto L_0x021a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:?, code lost:
        r11 = java.util.ServiceLoader.load(r10, r9).iterator();
        r10 = X.AnonymousClass001.A0s();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0339, code lost:
        if (r11.hasNext() != false) goto L_0x033b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:?, code lost:
        r11.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0344, code lost:
        throw X.AnonymousClass001.A0g("zza");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0377, code lost:
        if (r10.size() == 1) goto L_0x0379;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0379, code lost:
        r9 = (X.C161287pM) r10.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x037f, code lost:
        X.C161287pM.A03 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0383, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0388, code lost:
        if (r10.size() != 0) goto L_0x038a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:?, code lost:
        r9 = (X.C161287pM) X.AnonymousClass001.A0r(r2, java.util.Collection.class, "combine", new java.lang.Class[1], 0).invoke((java.lang.Object) null, new java.lang.Object[]{r10});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x039f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:?, code lost:
        r1 = new java.lang.IllegalStateException(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03a6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x03a7, code lost:
        r1 = new java.lang.IllegalStateException(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x03ad, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x03ae, code lost:
        r1 = new java.lang.IllegalStateException(r0);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:166:0x0329 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(int r21, X.C128706Xd r22) {
        /*
            r20 = this;
            r5 = r22
            int r7 = r5.zzc     // Catch:{ IOException -> 0x0486 }
            r0 = -1
            if (r7 != r0) goto L_0x0011
            X.8v1 r0 = X.AnonymousClass6C9.A0U(r5)     // Catch:{ IOException -> 0x0486 }
            int r7 = r0.BtX(r5)     // Catch:{ IOException -> 0x0486 }
            r5.zzc = r7     // Catch:{ IOException -> 0x0486 }
        L_0x0011:
            byte[] r3 = new byte[r7]     // Catch:{ IOException -> 0x0486 }
            X.6Xs r2 = new X.6Xs     // Catch:{ IOException -> 0x0486 }
            r2.<init>(r3, r7)     // Catch:{ IOException -> 0x0486 }
            X.7iC r8 = X.C157377iC.A02     // Catch:{ IOException -> 0x0486 }
            java.lang.Class r0 = r5.getClass()     // Catch:{ IOException -> 0x0486 }
            X.8v1 r1 = r8.A00(r0)     // Catch:{ IOException -> 0x0486 }
            X.8B0 r0 = r2.A01     // Catch:{ IOException -> 0x0486 }
            if (r0 != 0) goto L_0x002b
            X.8B0 r0 = new X.8B0     // Catch:{ IOException -> 0x0486 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x0486 }
        L_0x002b:
            r1.BtS(r0, r5)     // Catch:{ IOException -> 0x0486 }
            int r1 = r2.A02     // Catch:{ IOException -> 0x0486 }
            int r0 = r2.A00     // Catch:{ IOException -> 0x0486 }
            int r1 = r1 - r0
            if (r1 != 0) goto L_0x047f
            r6 = 1
            r5 = 0
            r2 = r21
            if (r21 < 0) goto L_0x0467
            r0 = 3
            if (r2 > r0) goto L_0x0467
            r1 = r20
            boolean r0 = r1.zzb     // Catch:{ Exception -> 0x040c }
            if (r0 == 0) goto L_0x02ad
            X.7hQ r0 = r1.zza     // Catch:{ Exception -> 0x040c }
            X.7MH r1 = new X.7MH     // Catch:{ Exception -> 0x040c }
            r1.<init>(r0, r3)     // Catch:{ Exception -> 0x040c }
            X.6WC r9 = r1.A02     // Catch:{ Exception -> 0x040c }
            r9.A00 = r2     // Catch:{ Exception -> 0x040c }
            boolean r0 = r1.A01     // Catch:{ Exception -> 0x040c }
            if (r0 != 0) goto L_0x02a0
            r1.A01 = r6     // Catch:{ Exception -> 0x040c }
            X.7hQ r8 = r1.A03     // Catch:{ Exception -> 0x040c }
            java.lang.String r3 = r8.A06     // Catch:{ Exception -> 0x040c }
            int r2 = r8.A01     // Catch:{ Exception -> 0x040c }
            r4 = 0
            X.6yD r1 = r1.A00     // Catch:{ Exception -> 0x040c }
            X.6Tl r0 = new X.6Tl     // Catch:{ Exception -> 0x040c }
            r0.<init>(r1, r3, r2)     // Catch:{ Exception -> 0x040c }
            X.6Tk r7 = new X.6Tk     // Catch:{ Exception -> 0x040c }
            r7.<init>(r9, r0)     // Catch:{ Exception -> 0x040c }
            X.8hM r2 = r8.A03     // Catch:{ Exception -> 0x040c }
            X.88w r2 = (X.C1693288w) r2     // Catch:{ Exception -> 0x040c }
            X.6Tl r0 = r7.A00     // Catch:{ Exception -> 0x040c }
            java.lang.String r3 = r0.A04     // Catch:{ Exception -> 0x040c }
            int r1 = r0.A02     // Catch:{ Exception -> 0x040c }
            X.6WC r0 = r7.A08     // Catch:{ Exception -> 0x040c }
            if (r0 == 0) goto L_0x0083
            int r10 = r0.A00     // Catch:{ Exception -> 0x040c }
        L_0x0078:
            X.7qI r0 = X.C1693288w.A03     // Catch:{ Exception -> 0x040c }
            java.lang.Object r0 = r0.A03()     // Catch:{ Exception -> 0x040c }
            boolean r0 = X.AnonymousClass001.A1Z(r0)     // Catch:{ Exception -> 0x040c }
            goto L_0x0085
        L_0x0083:
            r10 = 0
            goto L_0x0078
        L_0x0085:
            if (r0 != 0) goto L_0x008b
            if (r3 == 0) goto L_0x0285
            goto L_0x011e
        L_0x008b:
            if (r3 == 0) goto L_0x008e
            goto L_0x0097
        L_0x008e:
            if (r1 < 0) goto L_0x018c
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x040c }
            if (r3 == 0) goto L_0x018c
            goto L_0x009d
        L_0x0097:
            boolean r0 = r3.isEmpty()     // Catch:{ Exception -> 0x040c }
            if (r0 != 0) goto L_0x008e
        L_0x009d:
            android.content.Context r9 = r2.A00     // Catch:{ Exception -> 0x040c }
            if (r9 != 0) goto L_0x00f7
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ Exception -> 0x040c }
        L_0x00a5:
            java.util.Iterator r19 = r0.iterator()     // Catch:{ Exception -> 0x040c }
        L_0x00a9:
            boolean r0 = r19.hasNext()     // Catch:{ Exception -> 0x040c }
            if (r0 == 0) goto L_0x018c
            java.lang.Object r11 = r19.next()     // Catch:{ Exception -> 0x040c }
            X.6W0 r11 = (X.AnonymousClass6W0) r11     // Catch:{ Exception -> 0x040c }
            int r0 = r11.zzbb     // Catch:{ Exception -> 0x040c }
            r0 = r0 & 1
            if (r0 != r6) goto L_0x00c1
            int r0 = r11.zzya     // Catch:{ Exception -> 0x040c }
            if (r0 == 0) goto L_0x00c1
            if (r0 != r10) goto L_0x00a9
        L_0x00c1:
            java.lang.String r2 = r11.zzbis     // Catch:{ Exception -> 0x040c }
            long r0 = X.C1693288w.A01(r9)     // Catch:{ Exception -> 0x040c }
            long r17 = X.C1693288w.A02(r2, r0)     // Catch:{ Exception -> 0x040c }
            long r2 = r11.zzbit     // Catch:{ Exception -> 0x040c }
            long r0 = r11.zzbiu     // Catch:{ Exception -> 0x040c }
            r12 = 0
            int r11 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r11 < 0) goto L_0x00a9
            int r11 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x00a9
            int r11 = (r17 > r12 ? 1 : (r17 == r12 ? 0 : -1))
            if (r11 < 0) goto L_0x00e0
            long r17 = r17 % r0
            goto L_0x00f2
        L_0x00e0:
            r15 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r13 = r15 % r0
            r11 = 1
            long r13 = r13 + r11
            long r17 = r17 & r15
            long r17 = r17 % r0
            long r13 = r13 + r17
            long r17 = r13 % r0
        L_0x00f2:
            int r0 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0290
            goto L_0x00a9
        L_0x00f7:
            java.util.concurrent.ConcurrentHashMap r12 = X.C1693288w.A08     // Catch:{ Exception -> 0x040c }
            java.lang.Object r11 = r12.get(r3)     // Catch:{ Exception -> 0x040c }
            X.7qI r11 = (X.C161707qI) r11     // Catch:{ Exception -> 0x040c }
            if (r11 != 0) goto L_0x0115
            X.7Jx r2 = X.C1693288w.A04     // Catch:{ Exception -> 0x040c }
            X.6Vx r1 = X.C128396Vx.zzbir     // Catch:{ Exception -> 0x040c }
            X.8hg r0 = X.AnonymousClass8AO.A00     // Catch:{ Exception -> 0x040c }
            X.6VZ r11 = new X.6VZ     // Catch:{ Exception -> 0x040c }
            r11.<init>(r0, r2, r1, r3)     // Catch:{ Exception -> 0x040c }
            java.lang.Object r0 = r12.putIfAbsent(r3, r11)     // Catch:{ Exception -> 0x040c }
            X.7qI r0 = (X.C161707qI) r0     // Catch:{ Exception -> 0x040c }
            if (r0 == 0) goto L_0x0115
            r11 = r0
        L_0x0115:
            java.lang.Object r0 = r11.A03()     // Catch:{ Exception -> 0x040c }
            X.6Vx r0 = (X.C128396Vx) r0     // Catch:{ Exception -> 0x040c }
            X.8yY r0 = r0.zzbiq     // Catch:{ Exception -> 0x040c }
            goto L_0x00a5
        L_0x011e:
            boolean r0 = r3.isEmpty()     // Catch:{ Exception -> 0x040c }
            if (r0 != 0) goto L_0x0285
        L_0x0124:
            android.content.Context r9 = r2.A00     // Catch:{ Exception -> 0x040c }
            if (r9 == 0) goto L_0x018c
            java.lang.Boolean r0 = X.C1693288w.A01     // Catch:{ Exception -> 0x040c }
            if (r0 != 0) goto L_0x0142
            X.7BQ r0 = X.C159987mq.A00(r9)     // Catch:{ Exception -> 0x040c }
            java.lang.String r1 = "com.google.android.providers.gsf.permission.READ_GSERVICES"
            android.content.Context r0 = r0.A00     // Catch:{ Exception -> 0x040c }
            int r0 = r0.checkCallingOrSelfPermission(r1)     // Catch:{ Exception -> 0x040c }
            boolean r0 = X.AnonymousClass000.A1T(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x040c }
            X.C1693288w.A01 = r0     // Catch:{ Exception -> 0x040c }
        L_0x0142:
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x040c }
            if (r0 == 0) goto L_0x018c
            java.util.HashMap r2 = X.C1693288w.A07     // Catch:{ Exception -> 0x040c }
            java.lang.Object r1 = r2.get(r3)     // Catch:{ Exception -> 0x040c }
            X.7qI r1 = (X.C161707qI) r1     // Catch:{ Exception -> 0x040c }
            if (r1 != 0) goto L_0x015c
            X.7Jx r0 = X.C1693288w.A05     // Catch:{ Exception -> 0x040c }
            X.6VY r1 = new X.6VY     // Catch:{ Exception -> 0x040c }
            r1.<init>(r0, r3)     // Catch:{ Exception -> 0x040c }
            r2.put(r3, r1)     // Catch:{ Exception -> 0x040c }
        L_0x015c:
            java.lang.Object r11 = r1.A03()     // Catch:{ Exception -> 0x040c }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x040c }
            if (r11 == 0) goto L_0x018c
            r0 = 44
            int r0 = r11.indexOf(r0)     // Catch:{ Exception -> 0x040c }
            r2 = 0
            if (r0 < 0) goto L_0x0281
            java.lang.String r13 = r11.substring(r5, r0)     // Catch:{ Exception -> 0x040c }
            int r2 = r0 + 1
        L_0x0173:
            r0 = 47
            int r1 = r11.indexOf(r0, r2)     // Catch:{ Exception -> 0x040c }
            java.lang.String r10 = "LogSamplerImpl"
            if (r1 > 0) goto L_0x01a3
            int r0 = r11.length()     // Catch:{ Exception -> 0x040c }
            java.lang.String r1 = "Failed to parse the rule: "
            if (r0 == 0) goto L_0x019d
            java.lang.String r0 = r1.concat(r11)     // Catch:{ Exception -> 0x040c }
        L_0x0189:
            android.util.Log.e(r10, r0)     // Catch:{ Exception -> 0x040c }
        L_0x018c:
            X.8hN r2 = r8.A04     // Catch:{ Exception -> 0x040c }
            X.6Qk r2 = (X.C127046Qk) r2     // Catch:{ Exception -> 0x040c }
            X.7l6 r0 = r2.A05     // Catch:{ Exception -> 0x040c }
            X.6Qw r1 = new X.6Qw     // Catch:{ Exception -> 0x040c }
            r1.<init>(r7, r0)     // Catch:{ Exception -> 0x040c }
            r0 = 2
            r2.A03(r1, r0)     // Catch:{ Exception -> 0x040c }
            goto L_0x028f
        L_0x019d:
            java.lang.String r0 = new java.lang.String     // Catch:{ Exception -> 0x040c }
            r0.<init>(r1)     // Catch:{ Exception -> 0x040c }
            goto L_0x0189
        L_0x01a3:
            java.lang.String r0 = r11.substring(r2, r1)     // Catch:{ NumberFormatException -> 0x0269 }
            long r2 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0269 }
            java.lang.String r0 = X.AnonymousClass6C9.A0c(r1, r11)     // Catch:{ NumberFormatException -> 0x0269 }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0269 }
            r14 = 0
            int r11 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r11 < 0) goto L_0x0253
            int r11 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r11 < 0) goto L_0x0253
            X.6W0 r11 = X.AnonymousClass6W0.zzbiv     // Catch:{ Exception -> 0x040c }
            r10 = 5
            java.lang.Object r11 = r11.A06(r10)     // Catch:{ Exception -> 0x040c }
            X.6Vb r11 = (X.C128176Vb) r11     // Catch:{ Exception -> 0x040c }
            X.6Vw r11 = (X.C128386Vw) r11     // Catch:{ Exception -> 0x040c }
            r11.A00()     // Catch:{ Exception -> 0x040c }
            X.6Va r12 = r11.A00     // Catch:{ Exception -> 0x040c }
            X.6W0 r12 = (X.AnonymousClass6W0) r12     // Catch:{ Exception -> 0x040c }
            r13.getClass()     // Catch:{ Exception -> 0x040c }
            int r10 = r12.zzbb     // Catch:{ Exception -> 0x040c }
            r10 = r10 | 2
            r12.zzbb = r10     // Catch:{ Exception -> 0x040c }
            r12.zzbis = r13     // Catch:{ Exception -> 0x040c }
            r11.A00()     // Catch:{ Exception -> 0x040c }
            X.6Va r12 = r11.A00     // Catch:{ Exception -> 0x040c }
            X.6W0 r12 = (X.AnonymousClass6W0) r12     // Catch:{ Exception -> 0x040c }
            int r10 = r12.zzbb     // Catch:{ Exception -> 0x040c }
            r10 = r10 | 4
            r12.zzbb = r10     // Catch:{ Exception -> 0x040c }
            r12.zzbit = r2     // Catch:{ Exception -> 0x040c }
            r11.A00()     // Catch:{ Exception -> 0x040c }
            X.6Va r3 = r11.A00     // Catch:{ Exception -> 0x040c }
            X.6W0 r3 = (X.AnonymousClass6W0) r3     // Catch:{ Exception -> 0x040c }
            int r2 = r3.zzbb     // Catch:{ Exception -> 0x040c }
            r2 = r2 | 8
            r3.zzbb = r2     // Catch:{ Exception -> 0x040c }
            r3.zzbiu = r0     // Catch:{ Exception -> 0x040c }
            X.8xr r3 = r11.Btk()     // Catch:{ Exception -> 0x040c }
            X.6Va r3 = (X.C128166Va) r3     // Catch:{ Exception -> 0x040c }
            java.lang.Object r0 = r3.A06(r6)     // Catch:{ Exception -> 0x040c }
            java.lang.Byte r0 = (java.lang.Byte) r0     // Catch:{ Exception -> 0x040c }
            byte r0 = r0.byteValue()     // Catch:{ Exception -> 0x040c }
            if (r0 == r6) goto L_0x021a
            if (r0 == 0) goto L_0x02a7
            X.8v0 r0 = X.AnonymousClass6C8.A0Y(r3)     // Catch:{ Exception -> 0x040c }
            boolean r1 = r0.BuI(r3)     // Catch:{ Exception -> 0x040c }
            r0 = 2
            r3.A06(r0)     // Catch:{ Exception -> 0x040c }
            if (r1 == 0) goto L_0x02a7
        L_0x021a:
            X.6W0 r3 = (X.AnonymousClass6W0) r3     // Catch:{ Exception -> 0x040c }
            if (r3 == 0) goto L_0x018c
            java.lang.String r2 = r3.zzbis     // Catch:{ Exception -> 0x040c }
            long r0 = X.C1693288w.A01(r9)     // Catch:{ Exception -> 0x040c }
            long r17 = X.C1693288w.A02(r2, r0)     // Catch:{ Exception -> 0x040c }
            long r1 = r3.zzbit     // Catch:{ Exception -> 0x040c }
            long r9 = r3.zzbiu     // Catch:{ Exception -> 0x040c }
            int r0 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x018c
            int r0 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x018c
            int r0 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x023b
            long r17 = r17 % r9
            goto L_0x024d
        L_0x023b:
            r15 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r13 = r15 % r9
            r11 = 1
            long r13 = r13 + r11
            long r17 = r17 & r15
            long r17 = r17 % r9
            long r13 = r13 + r17
            long r17 = r13 % r9
        L_0x024d:
            int r0 = (r17 > r1 ? 1 : (r17 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0290
            goto L_0x018c
        L_0x0253:
            r4 = 72
            java.lang.StringBuilder r6 = X.AnonymousClass6CA.A0Y(r4)     // Catch:{ Exception -> 0x040c }
            java.lang.String r4 = "negative values not supported: "
            r6.append(r4)     // Catch:{ Exception -> 0x040c }
            r6.append(r2)     // Catch:{ Exception -> 0x040c }
            java.lang.String r2 = "/"
            java.lang.String r0 = X.AnonymousClass000.A0Z(r2, r6, r0)     // Catch:{ Exception -> 0x040c }
            goto L_0x0189
        L_0x0269:
            r2 = move-exception
            int r0 = r11.length()     // Catch:{ Exception -> 0x040c }
            java.lang.String r1 = "parseLong() failed while parsing: "
            if (r0 == 0) goto L_0x027b
            java.lang.String r0 = r1.concat(r11)     // Catch:{ Exception -> 0x040c }
        L_0x0276:
            android.util.Log.e(r10, r0, r2)     // Catch:{ Exception -> 0x040c }
            goto L_0x018c
        L_0x027b:
            java.lang.String r0 = new java.lang.String     // Catch:{ Exception -> 0x040c }
            r0.<init>(r1)     // Catch:{ Exception -> 0x040c }
            goto L_0x0276
        L_0x0281:
            java.lang.String r13 = ""
            goto L_0x0173
        L_0x0285:
            if (r1 < 0) goto L_0x018c
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x040c }
            if (r3 == 0) goto L_0x018c
            goto L_0x0124
        L_0x028f:
            return
        L_0x0290:
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.A09     // Catch:{ Exception -> 0x040c }
            java.lang.String r0 = "Result must not be null"
            X.C162177rO.A03(r1, r0)     // Catch:{ Exception -> 0x040c }
            X.6Qx r0 = new X.6Qx     // Catch:{ Exception -> 0x040c }
            r0.<init>(r4)     // Catch:{ Exception -> 0x040c }
            r0.A05(r1)     // Catch:{ Exception -> 0x040c }
            return
        L_0x02a0:
            java.lang.String r0 = "do not reuse LogEventBuilder"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ Exception -> 0x040c }
            goto L_0x02ac
        L_0x02a7:
            X.8RQ r0 = new X.8RQ     // Catch:{ Exception -> 0x040c }
            r0.<init>()     // Catch:{ Exception -> 0x040c }
        L_0x02ac:
            throw r0     // Catch:{ Exception -> 0x040c }
        L_0x02ad:
            X.6Xd r0 = X.C128706Xd.zzi     // Catch:{ Exception -> 0x040c }
            X.6XT r4 = X.C128766Xj.A01(r0)     // Catch:{ Exception -> 0x040c }
            X.6YA r4 = (X.AnonymousClass6YA) r4     // Catch:{ Exception -> 0x040c }
            X.7pM r9 = X.C161287pM.A03     // Catch:{ Exception -> 0x0403 }
            if (r9 != 0) goto L_0x03b7
            java.lang.Class<X.7pM> r2 = X.C161287pM.class
            monitor-enter(r2)     // Catch:{ Exception -> 0x0403 }
            X.7pM r9 = X.C161287pM.A03     // Catch:{ all -> 0x03b4 }
            if (r9 != 0) goto L_0x0381
            java.lang.Class<X.7dx> r10 = X.C154917dx.class
            java.lang.ClassLoader r9 = r10.getClassLoader()     // Catch:{ all -> 0x03b4 }
            boolean r0 = r2.equals(r2)     // Catch:{ all -> 0x03b4 }
            if (r0 == 0) goto L_0x02cf
            java.lang.String r0 = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader"
            goto L_0x02f7
        L_0x02cf:
            java.lang.Package r1 = r2.getPackage()     // Catch:{ all -> 0x03b4 }
            java.lang.Package r0 = r10.getPackage()     // Catch:{ all -> 0x03b4 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x03b4 }
            if (r0 == 0) goto L_0x036a
            java.lang.Object[] r1 = X.AnonymousClass002.A0M()     // Catch:{ all -> 0x03b4 }
            java.lang.Package r0 = r2.getPackage()     // Catch:{ all -> 0x03b4 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x03b4 }
            r1[r5] = r0     // Catch:{ all -> 0x03b4 }
            java.lang.String r0 = r2.getSimpleName()     // Catch:{ all -> 0x03b4 }
            r1[r6] = r0     // Catch:{ all -> 0x03b4 }
            java.lang.String r0 = "%s.BlazeGenerated%sLoader"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ all -> 0x03b4 }
        L_0x02f7:
            java.lang.Class r1 = java.lang.Class.forName(r0, r6, r9)     // Catch:{ ClassNotFoundException -> 0x0329 }
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch:{ NoSuchMethodException -> 0x031b, InstantiationException -> 0x0314, IllegalAccessException -> 0x0322, InvocationTargetException -> 0x030d }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x031b, InstantiationException -> 0x0314, IllegalAccessException -> 0x0322, InvocationTargetException -> 0x030d }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ NoSuchMethodException -> 0x031b, InstantiationException -> 0x0314, IllegalAccessException -> 0x0322, InvocationTargetException -> 0x030d }
            r1.newInstance(r0)     // Catch:{ NoSuchMethodException -> 0x031b, InstantiationException -> 0x0314, IllegalAccessException -> 0x0322, InvocationTargetException -> 0x030d }
            java.lang.String r0 = "zza"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)     // Catch:{ ClassNotFoundException -> 0x0329 }
            throw r0     // Catch:{ ClassNotFoundException -> 0x0329 }
        L_0x030d:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ ClassNotFoundException -> 0x0329 }
            r1.<init>(r0)     // Catch:{ ClassNotFoundException -> 0x0329 }
            goto L_0x0328
        L_0x0314:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ ClassNotFoundException -> 0x0329 }
            r1.<init>(r0)     // Catch:{ ClassNotFoundException -> 0x0329 }
            goto L_0x0328
        L_0x031b:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ ClassNotFoundException -> 0x0329 }
            r1.<init>(r0)     // Catch:{ ClassNotFoundException -> 0x0329 }
            goto L_0x0328
        L_0x0322:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ ClassNotFoundException -> 0x0329 }
            r1.<init>(r0)     // Catch:{ ClassNotFoundException -> 0x0329 }
        L_0x0328:
            throw r1     // Catch:{ ClassNotFoundException -> 0x0329 }
        L_0x0329:
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r10, r9)     // Catch:{ all -> 0x03b4 }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ all -> 0x03b4 }
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x03b4 }
        L_0x0335:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x03b4 }
            if (r0 == 0) goto L_0x0373
            r11.next()     // Catch:{ ServiceConfigurationError -> 0x0345 }
            java.lang.String r0 = "zza"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)     // Catch:{ ServiceConfigurationError -> 0x0345 }
            throw r0     // Catch:{ ServiceConfigurationError -> 0x0345 }
        L_0x0345:
            r17 = move-exception
            java.util.logging.Logger r12 = X.C154917dx.A00     // Catch:{ all -> 0x03b4 }
            java.util.logging.Level r13 = java.util.logging.Level.SEVERE     // Catch:{ all -> 0x03b4 }
            java.lang.String r14 = "com.google.protobuf.GeneratedExtensionRegistryLoader"
            java.lang.String r15 = "load"
            java.lang.String r9 = r2.getSimpleName()     // Catch:{ all -> 0x03b4 }
            int r0 = r9.length()     // Catch:{ all -> 0x03b4 }
            java.lang.String r1 = "Unable to load "
            if (r0 == 0) goto L_0x0364
            java.lang.String r0 = r1.concat(r9)     // Catch:{ all -> 0x03b4 }
        L_0x035e:
            r16 = r0
            r12.logp(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x03b4 }
            goto L_0x0335
        L_0x0364:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x03b4 }
            r0.<init>(r1)     // Catch:{ all -> 0x03b4 }
            goto L_0x035e
        L_0x036a:
            java.lang.String r0 = r2.getName()     // Catch:{ all -> 0x03b4 }
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A0c(r0)     // Catch:{ all -> 0x03b4 }
            goto L_0x03b3
        L_0x0373:
            int r0 = r10.size()     // Catch:{ all -> 0x03b4 }
            if (r0 != r6) goto L_0x0383
            java.lang.Object r9 = r10.get(r5)     // Catch:{ all -> 0x03b4 }
            X.7pM r9 = (X.C161287pM) r9     // Catch:{ all -> 0x03b4 }
        L_0x037f:
            X.C161287pM.A03 = r9     // Catch:{ all -> 0x03b4 }
        L_0x0381:
            monitor-exit(r2)     // Catch:{ all -> 0x03b4 }
            goto L_0x03b7
        L_0x0383:
            int r0 = r10.size()     // Catch:{ all -> 0x03b4 }
            r9 = 0
            if (r0 == 0) goto L_0x037f
            java.lang.String r11 = "combine"
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch:{ NoSuchMethodException -> 0x03a6, IllegalAccessException -> 0x039f, InvocationTargetException -> 0x03ad }
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            java.lang.reflect.Method r1 = X.AnonymousClass001.A0r(r2, r0, r11, r1, r5)     // Catch:{ NoSuchMethodException -> 0x03a6, IllegalAccessException -> 0x039f, InvocationTargetException -> 0x03ad }
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ NoSuchMethodException -> 0x03a6, IllegalAccessException -> 0x039f, InvocationTargetException -> 0x03ad }
            r0[r5] = r10     // Catch:{ NoSuchMethodException -> 0x03a6, IllegalAccessException -> 0x039f, InvocationTargetException -> 0x03ad }
            java.lang.Object r9 = r1.invoke(r9, r0)     // Catch:{ NoSuchMethodException -> 0x03a6, IllegalAccessException -> 0x039f, InvocationTargetException -> 0x03ad }
            X.7pM r9 = (X.C161287pM) r9     // Catch:{ NoSuchMethodException -> 0x03a6, IllegalAccessException -> 0x039f, InvocationTargetException -> 0x03ad }
            goto L_0x037f
        L_0x039f:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x03b4 }
            r1.<init>(r0)     // Catch:{ all -> 0x03b4 }
            goto L_0x03b3
        L_0x03a6:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x03b4 }
            r1.<init>(r0)     // Catch:{ all -> 0x03b4 }
            goto L_0x03b3
        L_0x03ad:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x03b4 }
            r1.<init>(r0)     // Catch:{ all -> 0x03b4 }
        L_0x03b3:
            throw r1     // Catch:{ all -> 0x03b4 }
        L_0x03b4:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x03b4 }
            goto L_0x03f8
        L_0x03b7:
            boolean r0 = r4.A01     // Catch:{ Exception -> 0x0403 }
            if (r0 == 0) goto L_0x03c0
            r4.A02()     // Catch:{ Exception -> 0x0403 }
            r4.A01 = r5     // Catch:{ Exception -> 0x0403 }
        L_0x03c0:
            X.6Xj r0 = r4.A00     // Catch:{ 6ty -> 0x03f9, IndexOutOfBoundsException -> 0x03fb, IOException -> 0x03f1 }
            java.lang.Class r0 = r0.getClass()     // Catch:{ 6ty -> 0x03f9, IndexOutOfBoundsException -> 0x03fb, IOException -> 0x03f1 }
            X.8v1 r8 = r8.A00(r0)     // Catch:{ 6ty -> 0x03f9, IndexOutOfBoundsException -> 0x03fb, IOException -> 0x03f1 }
            X.6Xj r1 = r4.A00     // Catch:{ 6ty -> 0x03f9, IndexOutOfBoundsException -> 0x03fb, IOException -> 0x03f1 }
            X.7gu r0 = new X.7gu     // Catch:{ 6ty -> 0x03f9, IndexOutOfBoundsException -> 0x03fb, IOException -> 0x03f1 }
            r0.<init>(r9)     // Catch:{ 6ty -> 0x03f9, IndexOutOfBoundsException -> 0x03fb, IOException -> 0x03f1 }
            r9 = r0
            r10 = r1
            r11 = r3
            r12 = r5
            r13 = r7
            r8.BtT(r9, r10, r11, r12, r13)     // Catch:{ 6ty -> 0x03f9, IndexOutOfBoundsException -> 0x03fb, IOException -> 0x03f1 }
            java.lang.String r3 = "Would have logged:\n%s"
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0403 }
            X.AnonymousClass0x7.A1E(r4, r2, r5)     // Catch:{ Exception -> 0x0403 }
            r0 = 6
            java.lang.String r1 = "Vision"
            boolean r0 = android.util.Log.isLoggable(r1, r0)     // Catch:{ Exception -> 0x0403 }
            if (r0 == 0) goto L_0x047e
            java.lang.String r0 = java.lang.String.format(r3, r2)     // Catch:{ Exception -> 0x0403 }
            android.util.Log.e(r1, r0)     // Catch:{ Exception -> 0x0403 }
            return
        L_0x03f1:
            r1 = move-exception
            java.lang.String r0 = "Reading from byte array should not throw IOException."
            java.lang.RuntimeException r0 = X.AnonymousClass6CA.A0Q(r0, r1)     // Catch:{ Exception -> 0x0403 }
        L_0x03f8:
            throw r0     // Catch:{ Exception -> 0x0403 }
        L_0x03f9:
            r1 = move-exception
            goto L_0x0402
        L_0x03fb:
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.6ty r1 = new X.6ty     // Catch:{ Exception -> 0x0403 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0403 }
        L_0x0402:
            throw r1     // Catch:{ Exception -> 0x0403 }
        L_0x0403:
            r2 = move-exception
            java.lang.String r1 = "Parsing error"
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x040c }
            X.C1445872d.A00(r1, r2, r0)     // Catch:{ Exception -> 0x040c }
            return
        L_0x040c:
            r6 = move-exception
            X.7Qi r1 = X.C1457176z.A00
            boolean r0 = r1 instanceof X.AnonymousClass6XR
            if (r0 != 0) goto L_0x045c
            boolean r0 = r1 instanceof X.AnonymousClass6XS
            if (r0 == 0) goto L_0x045c
            X.6XS r1 = (X.AnonymousClass6XS) r1
            r6.printStackTrace()
            X.7GM r3 = r1.A00
            java.lang.ref.ReferenceQueue r2 = r3.A00
        L_0x0420:
            java.lang.ref.Reference r1 = r2.poll()
            if (r1 == 0) goto L_0x042c
            java.util.concurrent.ConcurrentHashMap r0 = r3.A01
            r0.remove(r1)
            goto L_0x0420
        L_0x042c:
            X.8SL r1 = new X.8SL
            r1.<init>(r6)
            java.util.concurrent.ConcurrentHashMap r0 = r3.A01
            java.lang.Object r4 = r0.get(r1)
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L_0x045f
            monitor-enter(r4)
            java.util.Iterator r3 = r4.iterator()     // Catch:{ all -> 0x0459 }
        L_0x0440:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0459 }
            if (r0 == 0) goto L_0x0457
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0459 }
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch:{ all -> 0x0459 }
            java.io.PrintStream r1 = java.lang.System.err     // Catch:{ all -> 0x0459 }
            java.lang.String r0 = "Suppressed: "
            r1.print(r0)     // Catch:{ all -> 0x0459 }
            r2.printStackTrace()     // Catch:{ all -> 0x0459 }
            goto L_0x0440
        L_0x0457:
            monitor-exit(r4)     // Catch:{ all -> 0x0459 }
            goto L_0x045f
        L_0x0459:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0459 }
            throw r0
        L_0x045c:
            r6.printStackTrace()
        L_0x045f:
            java.lang.String r1 = "Failed to log"
            java.lang.Object[] r0 = new java.lang.Object[r5]
            X.C1445872d.A00(r1, r6, r0)
            return
        L_0x0467:
            java.lang.Object[] r3 = new java.lang.Object[r6]
            X.AnonymousClass000.A1P(r3, r2, r5)
            java.lang.String r2 = "Illegal event code: %d"
            r0 = 4
            java.lang.String r1 = "Vision"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L_0x047e
            java.lang.String r0 = java.lang.String.format(r2, r3)
            android.util.Log.i(r1, r0)
        L_0x047e:
            return
        L_0x047f:
            java.lang.String r0 = "Did not write as much data as expected."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ IOException -> 0x0486 }
            throw r0     // Catch:{ IOException -> 0x0486 }
        L_0x0486:
            r4 = move-exception
            java.lang.String r3 = X.AnonymousClass000.A0O(r5)
            int r0 = r3.length()
            int r0 = r0 + 62
            java.lang.String r2 = "byte array"
            java.lang.StringBuilder r1 = X.AnonymousClass6C7.A0o(r0, r2)
            java.lang.String r0 = "Serializing "
            r1.append(r0)
            r1.append(r3)
            java.lang.RuntimeException r0 = X.AnonymousClass6C7.A0f(r2, r1, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.vision.clearcut.VisionClearcutLogger.zza(int, X.6Xd):void");
    }

    public VisionClearcutLogger(Context context) {
        this.zza = new C156917hQ(context);
    }
}
