package com.whatsapp.crash.upload;

import X.AnonymousClass002;
import X.AnonymousClass3YV;
import X.AnonymousClass4GJ;
import X.AnonymousClass5JI;
import X.AnonymousClass5KE;
import X.AnonymousClass5KR;
import X.AnonymousClass5Z1;
import X.C005105f;
import X.C103575Nn;
import X.C106965aS;
import X.C107695bk;
import X.C22031Ec;
import X.C49782h5;
import X.C64323Da;
import X.C64333Db;
import X.C64723Er;

public class ExceptionsUploadService extends C005105f implements AnonymousClass4GJ {
    public AnonymousClass5KR A00;
    public C106965aS A01;
    public AnonymousClass5Z1 A02;
    public AnonymousClass5KE A03;
    public AnonymousClass5JI A04;
    public C103575Nn A05;
    public C49782h5 A06;
    public C64723Er A07;
    public boolean A08;
    public final Object A09;
    public volatile AnonymousClass3YV A0A;

    /* JADX WARNING: Can't wrap try/catch for region: R(16:11|12|13|14|(2:15|16)|19|20|21|(2:23|(2:25|(2:27|28)))|29|30|31|32|33|34|(10:49|50|51|(1:55)|56|(6:57|58|59|60|61|62)|72|(1:74)|75|328)) */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0356, code lost:
        if (r1 != false) goto L_0x0358;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00d9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0101 */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x03a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(android.content.Intent r32) {
        /*
            r31 = this;
            java.lang.String r0 = "app_version_changed"
            r4 = 0
            r1 = r32
            boolean r21 = r1.getBooleanExtra(r0, r4)
            r0 = r31
            X.5KE r3 = r0.A03
            X.2oU r14 = r3.A01
            android.content.Context r13 = r14.A00
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()
            java.io.File r2 = r13.getFilesDir()
            java.lang.String r1 = "crash_sentinel"
            java.io.File r2 = X.AnonymousClass002.A0A(r2, r1)
            r1 = 0
            X.AnonymousClass0x2.A1F(r2, r1, r10)
            java.lang.String r2 = "account_switching"
            java.lang.String r1 = "unknown_process_name"
            java.lang.String[] r9 = new java.lang.String[]{r2, r1}
            int r8 = r9.length
            r7 = 0
        L_0x002d:
            if (r7 >= r8) goto L_0x0049
            r6 = r9[r7]
            java.io.File r5 = r13.getFilesDir()
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "crash_sentinel_"
            java.lang.String r1 = X.AnonymousClass000.A0V(r1, r6, r2)
            java.io.File r1 = X.AnonymousClass002.A0A(r5, r1)
            X.AnonymousClass0x2.A1F(r1, r6, r10)
            int r7 = r7 + 1
            goto L_0x002d
        L_0x0049:
            java.util.Iterator r16 = r10.iterator()
            r22 = 0
        L_0x004f:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x023f
            java.lang.Object r2 = r16.next()
            android.util.Pair r2 = (android.util.Pair) r2
            java.lang.Object r1 = r2.first
            java.io.File r1 = (java.io.File) r1
            boolean r1 = r1.exists()
            if (r1 == 0) goto L_0x004f
            java.lang.Object r10 = r2.first
            java.io.File r10 = (java.io.File) r10
            java.lang.Object r5 = r2.second
            java.lang.String r5 = (java.lang.String) r5
            java.io.FileInputStream r12 = new java.io.FileInputStream     // Catch:{ IOException | ClassNotFoundException -> 0x0101 }
            r12.<init>(r10)     // Catch:{ IOException | ClassNotFoundException -> 0x0101 }
            java.io.ObjectInputStream r15 = new java.io.ObjectInputStream     // Catch:{ all -> 0x00f7 }
            r15.<init>(r12)     // Catch:{ all -> 0x00f7 }
            boolean r30 = r15.readBoolean()     // Catch:{ all -> 0x00ed }
            r15.readLong()     // Catch:{ all -> 0x00ed }
            java.lang.Object r9 = r15.readObject()     // Catch:{ all -> 0x00ed }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x00ed }
            java.lang.Object r11 = r15.readObject()     // Catch:{ all -> 0x00ed }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x00ed }
            java.lang.Object r8 = r15.readObject()     // Catch:{ all -> 0x00ed }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x00ed }
            java.lang.String r1 = ""
            java.lang.Object r7 = r15.readObject()     // Catch:{ EOFException -> 0x0099 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ EOFException -> 0x0099 }
            goto L_0x009a
        L_0x0099:
            r7 = r1
        L_0x009a:
            java.lang.String r25 = "3.0.0.0"
            int r6 = r11.length()     // Catch:{ all -> 0x00ed }
            r1 = 22
            r28 = 0
            if (r6 <= r1) goto L_0x00d9
            java.lang.String r6 = r11.substring(r1)     // Catch:{ all -> 0x00ed }
            java.lang.String r1 = "(2\\.[\\d\\.]+)[-(].*\n"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)     // Catch:{ all -> 0x00ed }
            java.util.regex.Matcher r1 = r1.matcher(r6)     // Catch:{ all -> 0x00ed }
            boolean r11 = r1.matches()     // Catch:{ all -> 0x00ed }
            if (r11 == 0) goto L_0x00d9
            r11 = 1
            java.lang.String r25 = r1.group(r11)     // Catch:{ all -> 0x00ed }
            int r1 = r25.length()     // Catch:{ all -> 0x00ed }
            int r1 = r1 + 1
            java.lang.String r6 = r6.substring(r1)     // Catch:{ all -> 0x00ed }
            java.lang.String r1 = ")"
            int r1 = r6.indexOf(r1)     // Catch:{ all -> 0x00ed }
            if (r1 <= r11) goto L_0x00d9
            java.lang.String r1 = r6.substring(r4, r1)     // Catch:{ NumberFormatException -> 0x00d9 }
            long r28 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x00d9 }
        L_0x00d9:
            X.5KD r1 = new X.5KD     // Catch:{ all -> 0x00ed }
            r23 = r1
            r24 = r9
            r26 = r8
            r27 = r7
            r23.<init>(r24, r25, r26, r27, r28, r30)     // Catch:{ all -> 0x00ed }
            r15.close()     // Catch:{ all -> 0x00f7 }
            r12.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0101 }
            goto L_0x0139
        L_0x00ed:
            r6 = move-exception
            r15.close()     // Catch:{ all -> 0x00f2 }
            goto L_0x00f6
        L_0x00f2:
            r1 = move-exception
            r6.addSuppressed(r1)     // Catch:{ all -> 0x00f7 }
        L_0x00f6:
            throw r6     // Catch:{ all -> 0x00f7 }
        L_0x00f7:
            r6 = move-exception
            r12.close()     // Catch:{ all -> 0x00fc }
            goto L_0x0100
        L_0x00fc:
            r1 = move-exception
            r6.addSuppressed(r1)     // Catch:{ IOException | ClassNotFoundException -> 0x0101 }
        L_0x0100:
            throw r6     // Catch:{ IOException | ClassNotFoundException -> 0x0101 }
        L_0x0101:
            byte[] r6 = X.C382926u.A00(r10)     // Catch:{ Exception -> 0x0230 }
            java.lang.String r1 = new java.lang.String     // Catch:{ Exception -> 0x0230 }
            r1.<init>(r6)     // Catch:{ Exception -> 0x0230 }
            org.json.JSONObject r6 = X.AnonymousClass0x9.A1H(r1)     // Catch:{ Exception -> 0x0230 }
            java.lang.String r1 = "isOom"
            boolean r30 = r6.getBoolean(r1)     // Catch:{ Exception -> 0x0230 }
            java.lang.String r1 = "deepestThrowable"
            java.lang.String r24 = r6.getString(r1)     // Catch:{ Exception -> 0x0230 }
            java.lang.String r1 = "versionName"
            java.lang.String r25 = r6.getString(r1)     // Catch:{ Exception -> 0x0230 }
            java.lang.String r1 = "mobileBuildId"
            long r28 = r6.getLong(r1)     // Catch:{ Exception -> 0x0230 }
            java.lang.String r1 = "stacktrace"
            java.lang.String r26 = r6.getString(r1)     // Catch:{ Exception -> 0x0230 }
            java.lang.String r1 = "sessionId"
            java.lang.String r27 = r6.getString(r1)     // Catch:{ Exception -> 0x0230 }
            X.5KD r1 = new X.5KD     // Catch:{ Exception -> 0x0230 }
            r23 = r1
            r23.<init>(r24, r25, r26, r27, r28, r30)     // Catch:{ Exception -> 0x0230 }
        L_0x0139:
            X.5aS r6 = r3.A03
            r17 = r6
            java.util.Map r8 = r17.A02()
            X.4sK r6 = new X.4sK
            r6.<init>()
            boolean r7 = r1.A05
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.A01 = r7
            java.lang.Long r7 = X.AnonymousClass0x2.A0U()
            r6.A02 = r7
            java.lang.String r7 = r1.A01
            r6.A06 = r7
            java.lang.String r11 = r1.A03
            r6.A05 = r11
            r6.A08 = r5
            java.lang.String r12 = r1.A02
            boolean r5 = r12.isEmpty()
            if (r5 != 0) goto L_0x0182
            boolean r5 = r8.containsKey(r12)
            if (r5 == 0) goto L_0x0182
            java.lang.Object r5 = r8.get(r12)
            java.io.File r5 = (java.io.File) r5
            X.5IU r7 = X.C106965aS.A00(r5)
            java.lang.String r5 = r7.A02
            r6.A03 = r5
            java.lang.String r5 = r7.A01
            r6.A07 = r5
            java.lang.Integer r5 = r7.A00
            r6.A00 = r5
        L_0x0182:
            java.lang.String r15 = r1.A04
            r6.A04 = r15
            java.lang.String r5 = "JavaExceptionsUploadHelper/write java wam crash event"
            com.whatsapp.util.Log.d((java.lang.String) r5)
            X.4FV r5 = r3.A05
            r5.BhA(r6)
            r10 = 1
            android.content.Context r5 = r14.A00
            java.io.File r6 = r5.getCacheDir()
            java.lang.String r5 = "java_stack_trace"
            java.io.File r9 = X.AnonymousClass002.A0A(r6, r5)
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()
            long r5 = r1.A00
            java.lang.StringBuilder r15 = X.AnonymousClass000.A0l(r15)
            java.lang.String r1 = "("
            r15.append(r1)
            r15.append(r5)
            java.lang.String r6 = X.AnonymousClass000.A0e(r15)
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "### begin stack trace "
            r5.append(r1)
            r5.append(r6)
            java.lang.String r1 = "\n"
            X.C18270x1.A1C(r1, r5, r7)
            X.C18270x1.A1C(r11, r7, r8)
            java.lang.String r1 = "### end stack trace"
            r8.append(r1)
            java.io.FileWriter r1 = new java.io.FileWriter     // Catch:{ IOException -> 0x01ef }
            r1.<init>(r9)     // Catch:{ IOException -> 0x01ef }
            java.io.BufferedWriter r6 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x01ef }
            r6.<init>(r1)     // Catch:{ IOException -> 0x01ef }
            java.lang.String r1 = r8.toString()     // Catch:{ all -> 0x01e5 }
            r6.write(r1)     // Catch:{ all -> 0x01e5 }
            r6.close()     // Catch:{ IOException -> 0x01ef }
            goto L_0x01f9
        L_0x01e5:
            r5 = move-exception
            r6.close()     // Catch:{ all -> 0x01ea }
            goto L_0x01ee
        L_0x01ea:
            r1 = move-exception
            r5.addSuppressed(r1)     // Catch:{ IOException -> 0x01ef }
        L_0x01ee:
            throw r5     // Catch:{ IOException -> 0x01ef }
        L_0x01ef:
            r6 = move-exception
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "JavaExceptionsUploadHelper/file write failed: "
            X.C18260x0.A1Q(r5, r1, r6)
        L_0x01f9:
            java.lang.String r1 = "JavaExceptionUploadHelper/get exception attachment file creation"
            com.whatsapp.util.Log.d((java.lang.String) r1)
            java.util.HashMap r7 = X.AnonymousClass001.A0t()
            java.lang.String r1 = "attachment"
            java.lang.String r6 = "JavaExceptionsUpload"
            boolean r1 = X.AnonymousClass5Z1.A01(r13, r9, r1, r6, r7)
            if (r1 == 0) goto L_0x0222
            java.util.Map r1 = r17.A02()
            X.AnonymousClass5Z1.A00(r13, r12, r6, r1, r7)
            X.5Z1 r5 = r3.A04
            java.lang.String r1 = "java"
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.util.HashSet r1 = X.AnonymousClass0x9.A15(r1)
            r5.A02(r6, r1, r7, r10)
        L_0x0222:
            java.lang.Object r1 = r2.first
            java.io.File r1 = (java.io.File) r1
            r1.delete()
            r9.delete()
            r22 = 1
            goto L_0x004f
        L_0x0230:
            r5 = move-exception
            java.lang.String r1 = "javacrash/deserializeCrashData: could not deserialize stored crash data"
            com.whatsapp.util.Log.w(r1, r5)
            java.lang.Object r1 = r2.first
            java.io.File r1 = (java.io.File) r1
            r1.delete()
            goto L_0x004f
        L_0x023f:
            X.5Z1 r1 = r0.A02
            X.2oU r1 = r1.A01
            android.content.Context r1 = r1.A00
            java.io.File r2 = r1.getCacheDir()
            java.lang.String r1 = "crash_upload"
            java.io.File r2 = X.AnonymousClass002.A0A(r2, r1)
            boolean r1 = r2.exists()     // Catch:{ SecurityException -> 0x0262 }
            if (r1 == 0) goto L_0x025c
            boolean r1 = r2.isDirectory()     // Catch:{ SecurityException -> 0x0262 }
            if (r1 == 0) goto L_0x025c
            goto L_0x0262
        L_0x025c:
            r2.delete()     // Catch:{ SecurityException -> 0x0262 }
            r2.mkdirs()     // Catch:{ SecurityException -> 0x0262 }
        L_0x0262:
            X.5aS r1 = r0.A01
            r1.A02()
            X.5KE r3 = r0.A03
            X.2oU r1 = r3.A01
            android.content.Context r1 = r1.A00
            java.io.File r2 = r1.getFilesDir()
            java.lang.String r1 = "crash_in_video_sentinel"
            java.io.File r7 = X.AnonymousClass002.A0A(r2, r1)
            boolean r1 = r7.exists()
            if (r1 == 0) goto L_0x02c9
            if (r22 != 0) goto L_0x02c6
            if (r21 != 0) goto L_0x02c6
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ IOException -> 0x029d }
            r2.<init>(r7)     // Catch:{ IOException -> 0x029d }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x029d }
            r1.<init>(r2)     // Catch:{ IOException -> 0x029d }
            java.lang.String r6 = r1.readLine()     // Catch:{ all -> 0x0293 }
            r1.close()     // Catch:{ IOException -> 0x029d }
            goto L_0x02a2
        L_0x0293:
            r2 = move-exception
            r1.close()     // Catch:{ all -> 0x0298 }
            goto L_0x029c
        L_0x0298:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ IOException -> 0x029d }
        L_0x029c:
            throw r2     // Catch:{ IOException -> 0x029d }
        L_0x029d:
            r1 = move-exception
            java.lang.String r6 = r1.toString()
        L_0x02a2:
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 == 0) goto L_0x02aa
            java.lang.String r6 = "process killed"
        L_0x02aa:
            X.5Z1 r5 = r3.A04
            r1 = 5
            r3 = 1
            X.4sK r2 = new X.4sK
            r2.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.A01 = r1
            r2.A06 = r6
            java.lang.Long r1 = X.AnonymousClass0x9.A0m(r3)
            r2.A02 = r1
            X.4FV r1 = r5.A02
            r1.BhA(r2)
        L_0x02c6:
            r7.delete()
        L_0x02c9:
            X.5Nn r5 = r0.A05
            X.2oU r3 = r5.A00
            android.content.Context r8 = r3.A00
            java.lang.String r1 = "minidumps"
            r7 = 0
            java.io.File r1 = r8.getDir(r1, r4)
            java.io.File[] r6 = r1.listFiles()
            if (r6 == 0) goto L_0x02e7
            int r2 = r6.length
        L_0x02dd:
            if (r7 >= r2) goto L_0x02e7
            r1 = r6[r7]
            r1.delete()
            int r7 = r7 + 1
            goto L_0x02dd
        L_0x02e7:
            java.io.File r2 = X.AnonymousClass5A5.A00(r8)
            r8 = 1
            X.6Ab r1 = new X.6Ab
            r1.<init>(r8)
            java.io.File[] r9 = r2.listFiles(r1)
            r12 = 0
            if (r9 == 0) goto L_0x0346
            int r10 = r9.length
            if (r10 == 0) goto L_0x0346
            r2 = 2
            X.6A6 r1 = new X.6A6
            r1.<init>(r2)
            java.util.Arrays.sort(r9, r1)
            X.5aS r1 = r5.A01
            java.util.Map r7 = r1.A02()
            r1 = 10
            r20 = 1
            boolean r13 = X.C18280x3.A1U(r10, r1)
            r6 = 1
            r11 = 0
            r16 = 0
        L_0x0316:
            if (r6 >= r10) goto L_0x0349
            r2 = r9[r6]
            boolean r1 = r2.delete()
            if (r1 != 0) goto L_0x0326
            boolean r1 = r2.exists()
            if (r1 != 0) goto L_0x0331
        L_0x0326:
            int r11 = r11 + 1
            if (r13 != 0) goto L_0x0331
            r1 = r9[r6]
            r5.A00(r1, r7)
            r16 = 1
        L_0x0331:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "NativeExceptionsUploadHelper/delete other old minidumps: "
            r2.append(r1)
            r1 = r9[r6]
            java.lang.String r1 = r1.getPath()
            X.C18260x0.A1J(r2, r1)
            int r6 = r6 + 1
            goto L_0x0316
        L_0x0346:
            r20 = 0
            goto L_0x036f
        L_0x0349:
            java.lang.String r10 = "native"
            if (r13 == 0) goto L_0x035a
            X.5Z1 r6 = r5.A02
            if (r11 >= r8) goto L_0x05ca
            r1 = 0
        L_0x0352:
            if (r16 != 0) goto L_0x0358
            r16 = 0
            if (r1 == 0) goto L_0x035a
        L_0x0358:
            r16 = 1
        L_0x035a:
            r6 = r9[r4]
            if (r21 == 0) goto L_0x0568
            boolean r1 = r6.delete()
            if (r1 != 0) goto L_0x036a
            boolean r1 = r6.exists()
            if (r1 != 0) goto L_0x05c6
        L_0x036a:
            r1 = r9[r4]
            r5.A00(r1, r7)
        L_0x036f:
            X.5KR r13 = r0.A00
            X.2oU r1 = r13.A02
            r26 = r1
            java.io.File[] r19 = X.AnonymousClass329.A00(r26)
            r1 = r19
            int r1 = r1.length
            r25 = r1
            r10 = 0
        L_0x037f:
            r1 = r25
            if (r12 >= r1) goto L_0x05e5
            r11 = r19[r12]
            if (r21 == 0) goto L_0x039a
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "anr-helper/discarding anr report: "
            java.lang.String r1 = X.AnonymousClass0x7.A0p(r11, r1, r2)
            X.C18260x0.A1L(r2, r1)
            r11.delete()
        L_0x0397:
            int r12 = r12 + 1
            goto L_0x037f
        L_0x039a:
            r4 = 0
            if (r11 != 0) goto L_0x03aa
            java.lang.String r1 = "ANRExceptionUploadHelper/file/no traces file found"
        L_0x039f:
            com.whatsapp.util.Log.i((java.lang.String) r1)
        L_0x03a2:
            r1 = 0
        L_0x03a3:
            if (r10 != 0) goto L_0x03a8
            r10 = 0
            if (r1 == 0) goto L_0x0397
        L_0x03a8:
            r10 = 1
            goto L_0x0397
        L_0x03aa:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "ANRExceptionUploadHelper/file/name="
            java.lang.String r1 = X.AnonymousClass0x7.A0p(r11, r1, r2)
            r2.append(r1)
            java.lang.String r1 = "; canRead="
            r2.append(r1)
            boolean r1 = r11.canRead()
            X.C18260x0.A1V(r2, r1)
            boolean r1 = r11.canRead()
            if (r1 == 0) goto L_0x03a2
            java.lang.String r2 = r11.getName()
            java.lang.String r1 = ".stacktrace"
            boolean r18 = r2.endsWith(r1)
            long r2 = r11.lastModified()
            X.33p r1 = r13.A03
            r24 = r1
            java.lang.String r17 = "anr_file_timestamp"
            android.content.SharedPreferences r5 = X.AnonymousClass0x2.A0F(r24)
            r1 = r17
            long r14 = X.AnonymousClass0x2.A0A(r5, r1)
            if (r18 != 0) goto L_0x0450
            r5 = 0
            int r1 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x03a2
            int r1 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r1 == 0) goto L_0x03a2
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ IOException -> 0x0441 }
            r1.<init>(r11)     // Catch:{ IOException -> 0x0441 }
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0441 }
            r6.<init>(r1)     // Catch:{ IOException -> 0x0441 }
            java.lang.String r1 = "Cmd line: (\\S+)"
            java.util.regex.Pattern r7 = java.util.regex.Pattern.compile(r1)     // Catch:{ all -> 0x0437 }
        L_0x0403:
            java.lang.String r1 = r6.readLine()     // Catch:{ all -> 0x0437 }
            if (r1 == 0) goto L_0x0433
            java.util.regex.Matcher r9 = r7.matcher(r1)     // Catch:{ all -> 0x0437 }
            boolean r1 = r9.find()     // Catch:{ all -> 0x0437 }
            if (r1 == 0) goto L_0x0403
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0437 }
            java.lang.String r1 = "ANRExceptionUploadHelper/cmdline/"
            r5.append(r1)     // Catch:{ all -> 0x0437 }
            java.lang.String r1 = r9.group(r8)     // Catch:{ all -> 0x0437 }
            X.C18260x0.A1J(r5, r1)     // Catch:{ all -> 0x0437 }
            java.lang.String r5 = "com.whatsapp"
            java.lang.String r1 = r9.group(r8)     // Catch:{ all -> 0x0437 }
            boolean r1 = r5.equals(r1)     // Catch:{ all -> 0x0437 }
            if (r1 == 0) goto L_0x0403
            r6.close()     // Catch:{ IOException -> 0x0441 }
            goto L_0x0450
        L_0x0433:
            r6.close()     // Catch:{ IOException -> 0x0441 }
            goto L_0x0447
        L_0x0437:
            r4 = move-exception
            r6.close()     // Catch:{ all -> 0x043c }
            goto L_0x0440
        L_0x043c:
            r1 = move-exception
            r4.addSuppressed(r1)     // Catch:{ IOException -> 0x0441 }
        L_0x0440:
            throw r4     // Catch:{ IOException -> 0x0441 }
        L_0x0441:
            r4 = move-exception
            java.lang.String r1 = "ANRExceptionUploadHelper/failed to parse system anr file "
            com.whatsapp.util.Log.e(r1, r4)
        L_0x0447:
            r4 = r24
            r1 = r17
            X.C18260x0.A0M(r4, r1, r2)
            goto L_0x03a2
        L_0x0450:
            X.1ip r1 = r13.A01
            X.2hc r1 = r1.A0A()
            if (r1 == 0) goto L_0x0564
            boolean r1 = r1.A05
            if (r1 != 0) goto L_0x0564
            X.5aS r1 = r13.A04
            java.util.Map r9 = r1.A02()
            if (r18 == 0) goto L_0x0561
            java.lang.String r7 = r11.getName()
        L_0x0468:
            X.4sK r6 = new X.4sK
            r6.<init>()
            java.lang.Integer r1 = X.C18290x4.A0d()
            r6.A01 = r1
            java.lang.Long r1 = X.AnonymousClass0x2.A0U()
            r6.A02 = r1
            java.lang.String r16 = "anr"
            r1 = r16
            r6.A06 = r1
            if (r7 == 0) goto L_0x04cc
            java.lang.String r5 = "_"
            int r14 = r7.indexOf(r5)
            if (r14 <= 0) goto L_0x0491
            java.lang.String r1 = r7.substring(r4, r14)
            if (r1 == 0) goto L_0x0491
            r6.A04 = r1
        L_0x0491:
            int r4 = r14 + 1
            r14 = 0
            if (r4 < r8) goto L_0x04a4
            int r1 = r7.indexOf(r5, r4)
            if (r1 >= 0) goto L_0x0525
            java.lang.String r1 = "."
            int r1 = r7.indexOf(r1, r4)
            if (r1 >= 0) goto L_0x0525
        L_0x04a4:
            java.lang.StringBuilder r15 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "ANRExceptionUploadHelper/reportANRsCrashWamEvent no tombstone for sessionId:"
            r15.append(r1)
            r15.append(r14)
        L_0x04b0:
            X.AnonymousClass0x2.A18(r15)
            r14 = 0
            if (r4 < r8) goto L_0x04ca
            int r1 = r7.indexOf(r5, r4)
            int r4 = r1 + 1
            if (r4 < r8) goto L_0x04ca
            java.lang.String r1 = "."
            int r1 = r7.indexOf(r1, r4)
            if (r1 < 0) goto L_0x04ca
            java.lang.String r14 = r7.substring(r4, r1)
        L_0x04ca:
            r6.A08 = r14
        L_0x04cc:
            X.4FV r1 = r13.A06
            r1.BhA(r6)
            java.util.HashMap r14 = X.AnonymousClass001.A0t()
            r1 = r26
            android.content.Context r15 = r1.A00
            java.lang.String r1 = "android_anr"
            java.lang.String r7 = "ANRExceptionUploadHelper"
            boolean r1 = X.AnonymousClass5Z1.A01(r15, r11, r1, r7, r14)
            if (r1 == 0) goto L_0x0510
            java.lang.String r6 = r11.getName()
            java.lang.String r1 = "_"
            int r4 = r6.indexOf(r1)
            int r5 = r4 + 1
            r4 = 0
            if (r5 < r8) goto L_0x0500
            int r1 = r6.indexOf(r1, r5)
            if (r1 >= 0) goto L_0x0520
            java.lang.String r1 = "."
            int r1 = r6.indexOf(r1, r5)
            if (r1 >= 0) goto L_0x0520
        L_0x0500:
            X.AnonymousClass5Z1.A00(r15, r4, r7, r9, r14)
            X.5Z1 r4 = r13.A05
            java.util.List r1 = java.util.Collections.singletonList(r16)
            java.util.HashSet r1 = X.AnonymousClass0x9.A15(r1)
            r4.A02(r7, r1, r14, r8)
        L_0x0510:
            if (r18 == 0) goto L_0x0518
            r11.delete()
        L_0x0515:
            r1 = 1
            goto L_0x03a3
        L_0x0518:
            r4 = r24
            r1 = r17
            X.C18260x0.A0M(r4, r1, r2)
            goto L_0x0515
        L_0x0520:
            java.lang.String r4 = r6.substring(r5, r1)
            goto L_0x0500
        L_0x0525:
            java.lang.String r14 = r7.substring(r4, r1)
            if (r14 == 0) goto L_0x04a4
            boolean r1 = r9.containsKey(r14)
            if (r1 == 0) goto L_0x04a4
            java.lang.Object r1 = r9.get(r14)
            java.io.File r1 = (java.io.File) r1
            X.5IU r14 = X.C106965aS.A00(r1)
            java.lang.String r1 = r14.A02
            r6.A03 = r1
            java.lang.String r1 = r14.A01
            r23 = r1
            r6.A07 = r1
            java.lang.Integer r14 = r14.A00
            r6.A00 = r14
            java.lang.StringBuilder r15 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "ANRExceptionUploadHelper/lastSurface:"
            r15.append(r1)
            r1 = r23
            r15.append(r1)
            java.lang.String r1 = " appState:"
            r15.append(r1)
            r15.append(r14)
            goto L_0x04b0
        L_0x0561:
            r7 = 0
            goto L_0x0468
        L_0x0564:
            java.lang.String r1 = "ANRExceptionUploadHelper/roamingorunknown/skip"
            goto L_0x039f
        L_0x0568:
            java.util.HashMap r9 = X.AnonymousClass001.A0t()
            android.content.Context r14 = r3.A00
            java.lang.String r13 = "upload_file_minidump"
            java.lang.String r4 = "NativeExceptionUploadHelper"
            boolean r1 = X.AnonymousClass5Z1.A01(r14, r6, r13, r4, r9)
            if (r1 == 0) goto L_0x0594
            java.lang.String r11 = r6.getName()
            java.lang.String r15 = "_"
            int r1 = r11.indexOf(r15)
            int r3 = r1 + 1
            r2 = 0
            if (r3 <= r8) goto L_0x0591
            int r1 = r11.indexOf(r15, r3)
            if (r1 < 0) goto L_0x0591
            java.lang.String r2 = r11.substring(r3, r1)
        L_0x0591:
            X.AnonymousClass5Z1.A00(r14, r2, r4, r7, r9)
        L_0x0594:
            boolean r1 = r9.containsKey(r13)
            if (r1 == 0) goto L_0x05c6
            X.5Z1 r2 = r5.A02
            java.util.List r1 = java.util.Collections.singletonList(r10)
            java.util.HashSet r1 = X.AnonymousClass0x9.A15(r1)
            r2.A02(r4, r1, r9, r12)
            boolean r1 = r6.delete()
            if (r1 != 0) goto L_0x05c1
            boolean r1 = r6.exists()
            if (r1 == 0) goto L_0x05c1
            r3 = 0
            r20 = r16
        L_0x05b6:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "NativeExceptionsUploadHelper/Dump file deleted: "
            X.C18260x0.A1D(r1, r2, r3)
            goto L_0x036f
        L_0x05c1:
            r3 = 1
            r5.A00(r6, r7)
            goto L_0x05b6
        L_0x05c6:
            r20 = r16
            goto L_0x036f
        L_0x05ca:
            X.4sK r2 = new X.4sK
            r2.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r2.A01 = r1
            r2.A06 = r10
            java.lang.Long r1 = X.AnonymousClass0x9.A0m(r11)
            r2.A02 = r1
            X.4FV r1 = r6.A02
            r1.BhA(r2)
            r1 = 1
            goto L_0x0352
        L_0x05e5:
            X.2h5 r4 = r0.A06
            r3 = r21
            r2 = r22
            r1 = r20
            r4.A01(r3, r2, r1, r10)
            X.5JI r9 = r0.A04
            java.lang.String r2 = "android_hprof"
            X.32A r4 = r9.A03
            android.content.Context r6 = r4.A00
            java.io.File r1 = r6.getCacheDir()
            java.lang.String r1 = r1.getPath()
            java.io.File r3 = X.AnonymousClass002.A0B(r1)
            X.5rA r1 = new X.5rA
            r1.<init>(r4)
            java.io.File[] r10 = r3.listFiles(r1)
            if (r10 == 0) goto L_0x074d
            int r5 = r10.length
            if (r5 == 0) goto L_0x074d
            java.lang.String r1 = "MemoryExceptionsUploadHelper/hprof file found"
            com.whatsapp.util.Log.d((java.lang.String) r1)
            X.1ip r7 = r9.A01
            int r1 = r7.A08(r8)
            if (r1 == r8) goto L_0x066e
            java.lang.String r1 = "MemoryExceptionsUploadHelper/no wifi connection; exit"
            com.whatsapp.util.Log.d((java.lang.String) r1)
            r3 = 0
        L_0x0625:
            r1 = r10[r3]
            r1.delete()
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.io.File r1 = r6.getCacheDir()
            java.lang.String r1 = r1.getPath()
            r4 = 0
            r2[r4] = r1
            java.lang.String r1 = "%s/dump.gz"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            java.io.File r2 = X.AnonymousClass002.A0B(r1)
            boolean r1 = r2.exists()
            if (r1 == 0) goto L_0x064a
            r2.delete()
        L_0x064a:
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.io.File r1 = r6.getCacheDir()
            java.lang.String r1 = r1.getPath()
            r2[r4] = r1
            java.lang.String r1 = "%s/dump.clean"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            java.io.File r2 = X.AnonymousClass002.A0B(r1)
            boolean r1 = r2.exists()
            if (r1 == 0) goto L_0x0669
            r2.delete()
        L_0x0669:
            int r3 = r3 + 1
            if (r3 >= r5) goto L_0x0769
            goto L_0x0625
        L_0x066e:
            r4 = 1
        L_0x066f:
            if (r4 >= r5) goto L_0x068b
            r1 = r10[r4]
            r1.delete()
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "MemoryExceptionsUploadHelper/delete other old file: "
            r3.append(r1)
            r1 = r10[r4]
            java.lang.String r1 = r1.getPath()
            X.C18260x0.A1J(r3, r1)
            int r4 = r4 + 1
            goto L_0x066f
        L_0x068b:
            r5 = 0
            r4 = r10[r5]
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.io.File r1 = r6.getCacheDir()
            java.lang.String r1 = r1.getPath()
            r3[r5] = r1
            java.lang.String r1 = "%s/dump.clean"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            java.io.File r3 = X.AnonymousClass002.A0B(r1)
            java.lang.String r1 = "MemoryExceptionsUploadHelper/cleaning PI from file"
            com.whatsapp.util.Log.d((java.lang.String) r1)
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "HprofPersonalInfoCleaner/run/file "
            r5.append(r1)
            java.lang.String r1 = r4.getPath()
            X.C18260x0.A1L(r5, r1)
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ Exception | OutOfMemoryError -> 0x0744 }
            java.lang.String r1 = "HprofPersonalInfoCleaner/pass1/starting on file "
            r5.append(r1)     // Catch:{ Exception | OutOfMemoryError -> 0x0744 }
            java.lang.String r1 = r4.getPath()     // Catch:{ Exception | OutOfMemoryError -> 0x0744 }
            X.C18260x0.A1L(r5, r1)     // Catch:{ Exception | OutOfMemoryError -> 0x0744 }
            X.5no r1 = new X.5no     // Catch:{ Exception | OutOfMemoryError -> 0x0744 }
            r1.<init>(r4)     // Catch:{ Exception | OutOfMemoryError -> 0x0744 }
            X.6lD r10 = new X.6lD     // Catch:{ Exception | OutOfMemoryError -> 0x0744 }
            r10.<init>(r1)     // Catch:{ Exception | OutOfMemoryError -> 0x0744 }
            r10.A02()     // Catch:{ Exception | OutOfMemoryError -> 0x0744 }
            r1.close()     // Catch:{ Exception | OutOfMemoryError -> 0x0744 }
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ Exception | OutOfMemoryError -> 0x0744 }
            java.lang.String r1 = "HprofPersonalInfoCleaner/pass1/finished on file "
            r5.append(r1)     // Catch:{ Exception | OutOfMemoryError -> 0x0744 }
            java.lang.String r1 = r4.getPath()     // Catch:{ Exception | OutOfMemoryError -> 0x0744 }
            X.C18260x0.A1L(r5, r1)     // Catch:{ Exception | OutOfMemoryError -> 0x0744 }
            X.7ED r11 = r10.A00     // Catch:{ Exception | OutOfMemoryError -> 0x0744 }
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ Exception | OutOfMemoryError -> 0x0744 }
            java.lang.String r1 = "HprofPersonalInfoCleaner/pass2/starting on file "
            r5.append(r1)     // Catch:{ Exception | OutOfMemoryError -> 0x0744 }
            java.lang.String r1 = r4.getPath()     // Catch:{ Exception | OutOfMemoryError -> 0x0744 }
            X.C18260x0.A1L(r5, r1)     // Catch:{ Exception | OutOfMemoryError -> 0x0744 }
            X.5no r10 = new X.5no     // Catch:{ Exception | OutOfMemoryError -> 0x0744 }
            r10.<init>(r4)     // Catch:{ Exception | OutOfMemoryError -> 0x0744 }
            java.io.FileOutputStream r1 = X.AnonymousClass0x9.A0h(r3)     // Catch:{ Exception | OutOfMemoryError -> 0x0744 }
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch:{ Exception | OutOfMemoryError -> 0x0744 }
            r5.<init>(r1)     // Catch:{ Exception | OutOfMemoryError -> 0x0744 }
            java.io.DataOutputStream r1 = new java.io.DataOutputStream     // Catch:{ Exception | OutOfMemoryError -> 0x0744 }
            r1.<init>(r5)     // Catch:{ Exception | OutOfMemoryError -> 0x0744 }
            X.8Hf r5 = new X.8Hf     // Catch:{ Exception | OutOfMemoryError -> 0x0744 }
            r5.<init>(r10, r1)     // Catch:{ Exception | OutOfMemoryError -> 0x0744 }
            X.6lE r1 = new X.6lE     // Catch:{ all -> 0x073f }
            r1.<init>(r11, r5)     // Catch:{ all -> 0x073f }
            r1.A02()     // Catch:{ all -> 0x073f }
            r5.close()     // Catch:{ Exception | OutOfMemoryError -> 0x0744 }
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ Exception | OutOfMemoryError -> 0x0744 }
            java.lang.String r1 = "HprofPersonalInfoCleaner/pass2/finished on file "
            r5.append(r1)     // Catch:{ Exception | OutOfMemoryError -> 0x0744 }
            java.lang.String r1 = r4.getPath()     // Catch:{ Exception | OutOfMemoryError -> 0x0744 }
            X.C18260x0.A1L(r5, r1)     // Catch:{ Exception | OutOfMemoryError -> 0x0744 }
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ Exception | OutOfMemoryError -> 0x0744 }
            java.lang.String r1 = "HprofPersonalInfoCleaner/pass2/Written clean copy to "
            r5.append(r1)     // Catch:{ Exception | OutOfMemoryError -> 0x0744 }
            java.lang.String r1 = r3.getPath()     // Catch:{ Exception | OutOfMemoryError -> 0x0744 }
            X.C18260x0.A1L(r5, r1)     // Catch:{ Exception | OutOfMemoryError -> 0x0744 }
            goto L_0x0753
        L_0x073f:
            r1 = move-exception
            r5.close()     // Catch:{ Exception | OutOfMemoryError -> 0x0744 }
            throw r1     // Catch:{ Exception | OutOfMemoryError -> 0x0744 }
        L_0x0744:
            r2 = move-exception
            java.lang.String r1 = "HprofPersonalInfoCleaner/run/error"
            com.whatsapp.util.Log.e(r1, r2)
            java.lang.String r1 = "MemoryExceptionsUploadHelper/failed to clean PI data from hprof"
            goto L_0x0760
        L_0x074d:
            java.lang.String r1 = "MemoryExceptionsUploadHelper/no files found; exit"
            com.whatsapp.util.Log.d((java.lang.String) r1)
            goto L_0x0769
        L_0x0753:
            java.lang.String r1 = "HprofPersonalInfoCleaner/run/Successfully cleaned"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            int r1 = r7.A08(r8)
            if (r1 == r8) goto L_0x07bd
            java.lang.String r1 = "MemoryExceptionsUploadHelper/lost connectivity, deleting and exiting"
        L_0x0760:
            com.whatsapp.util.Log.d((java.lang.String) r1)
            r4.delete()
            r3.delete()
        L_0x0769:
            X.5aS r4 = r0.A01
            boolean r1 = r4.A06
            if (r1 == 0) goto L_0x0791
            r3 = 0
        L_0x0770:
            java.lang.String r2 = java.lang.String.valueOf(r3)
            java.lang.String r1 = r4.A05
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0789
            java.io.File r2 = r4.A04
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.io.File r1 = X.AnonymousClass002.A0A(r2, r1)
            r1.delete()
        L_0x0789:
            int r3 = r3 + 1
            r1 = 5
            if (r3 < r1) goto L_0x0770
            r1 = 0
            r4.A02 = r1
        L_0x0791:
            X.5KE r2 = r0.A03
            X.33p r1 = r2.A02
            X.8qC r6 = r1.A01
            android.content.SharedPreferences r1 = X.C18300x5.A0B(r6)
            java.lang.String r5 = "crash_state_manager:system_exit"
            java.lang.String r4 = X.C18280x3.A0Z(r1, r5)
            if (r4 == 0) goto L_0x07b5
            X.2qk r3 = r2.A00
            java.lang.String r2 = "system_exit"
            r1 = 0
            r3.A0A(r2, r1, r4)
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass0x2.A0E(r6)
            r1.remove(r5)
            r1.apply()
        L_0x07b5:
            X.3Er r2 = r0.A07
            r0 = -1
            r2.A00(r0)
            return
        L_0x07bd:
            java.lang.Object[] r5 = new java.lang.Object[r8]
            java.io.File r1 = r6.getCacheDir()
            java.lang.String r1 = r1.getPath()
            r14 = 0
            r5[r14] = r1
            java.lang.String r1 = "%s/dump.gz"
            java.lang.String r1 = java.lang.String.format(r1, r5)
            java.io.File r5 = X.AnonymousClass002.A0B(r1)
            X.2qk r6 = r9.A00     // Catch:{ Exception | OutOfMemoryError -> 0x085a }
            java.lang.String r1 = r6.A06()     // Catch:{ Exception | OutOfMemoryError -> 0x085a }
            java.lang.String r7 = r6.A08(r1, r2, r8)     // Catch:{ Exception | OutOfMemoryError -> 0x085a }
            java.lang.String r1 = "no_upload"
            boolean r1 = r1.equals(r7)     // Catch:{ Exception | OutOfMemoryError -> 0x085a }
            if (r1 == 0) goto L_0x07f1
            r4.delete()     // Catch:{ Exception | OutOfMemoryError -> 0x085a }
            r5.delete()     // Catch:{ Exception | OutOfMemoryError -> 0x085a }
            r3.delete()     // Catch:{ Exception | OutOfMemoryError -> 0x085a }
            goto L_0x0769
        L_0x07f1:
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()     // Catch:{ Exception | OutOfMemoryError -> 0x085a }
            java.lang.String r1 = "MemoryExceptionsUploadHelper/Attempting to gzip file: "
            X.C18260x0.A1P(r7, r1, r3)     // Catch:{ Exception | OutOfMemoryError -> 0x085a }
            X.AnonymousClass32A.A00(r3, r5)     // Catch:{ Exception | OutOfMemoryError -> 0x085a }
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()     // Catch:{ Exception | OutOfMemoryError -> 0x085a }
            java.lang.String r1 = "MemoryExceptionsUploadHelper/Attempting to upload file; dumpFile="
            X.C18260x0.A1P(r7, r1, r5)     // Catch:{ Exception | OutOfMemoryError -> 0x085a }
            X.5nJ r10 = new X.5nJ     // Catch:{ Exception | OutOfMemoryError -> 0x085a }
            r10.<init>(r9, r4, r5, r3)     // Catch:{ Exception | OutOfMemoryError -> 0x085a }
            X.2cX r9 = r9.A02     // Catch:{ Exception | OutOfMemoryError -> 0x085a }
            java.lang.String r11 = "https://crashlogs.whatsapp.net/wa_clb_data"
            r13 = 11
            r12 = 0
            X.30q r7 = r9.A00(r10, r11, r12, r13, r14)     // Catch:{ Exception | OutOfMemoryError -> 0x085a }
            java.lang.String r8 = "access_token"
            java.lang.String r1 = "1063127757113399|745146ffa34413f9dbb5469f5370b7af"
            r7.A09(r8, r1)     // Catch:{ Exception | OutOfMemoryError -> 0x085a }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception | OutOfMemoryError -> 0x085a }
            r1.<init>(r5)     // Catch:{ Exception | OutOfMemoryError -> 0x085a }
            X.C614230q.A01(r7, r5, r1, r2)     // Catch:{ Exception | OutOfMemoryError -> 0x085a }
            java.lang.String r10 = "agent"
            r1 = r6
            X.1Ep r1 = (X.C22121Ep) r1     // Catch:{ Exception | OutOfMemoryError -> 0x085a }
            X.3FI r9 = r1.A0C     // Catch:{ Exception | OutOfMemoryError -> 0x085a }
            X.2oU r8 = r1.A07     // Catch:{ Exception | OutOfMemoryError -> 0x085a }
            java.lang.String r1 = X.AnonymousClass5V3.A00()     // Catch:{ Exception | OutOfMemoryError -> 0x085a }
            java.lang.String r1 = r9.A03(r8, r1, r14)     // Catch:{ Exception | OutOfMemoryError -> 0x085a }
            r7.A09(r10, r1)     // Catch:{ Exception | OutOfMemoryError -> 0x085a }
            java.lang.String r1 = "type"
            r7.A09(r1, r2)     // Catch:{ Exception | OutOfMemoryError -> 0x085a }
            java.lang.String r2 = "android_hprof_extras"
            java.lang.String r1 = "java.lang.OutOfMemoryError"
            java.lang.String r1 = r6.A07(r1)     // Catch:{ Exception | OutOfMemoryError -> 0x085a }
            r7.A09(r2, r1)     // Catch:{ Exception | OutOfMemoryError -> 0x085a }
            java.lang.String r6 = "build_id"
            r1 = 546598543(0x20946e8f, double:2.70055562E-315)
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception | OutOfMemoryError -> 0x085a }
            r7.A09(r6, r1)     // Catch:{ Exception | OutOfMemoryError -> 0x085a }
            r7.A03(r12)     // Catch:{ Exception | OutOfMemoryError -> 0x085a }
            goto L_0x0769
        L_0x085a:
            r2 = move-exception
            java.lang.String r1 = "MemoryExceptionsUploadHelper/Error Uploading file"
            com.whatsapp.util.Log.w(r1, r2)
            r4.delete()
            r3.delete()
            r5.delete()
            goto L_0x0769
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.crash.upload.ExceptionsUploadService.A08(android.content.Intent):void");
    }

    public final Object generatedComponent() {
        if (this.A0A == null) {
            synchronized (this.A09) {
                if (this.A0A == null) {
                    this.A0A = new AnonymousClass3YV(this);
                }
            }
        }
        return this.A0A.generatedComponent();
    }

    public void onCreate() {
        if (!this.A08) {
            this.A08 = true;
            C64333Db r2 = ((C22031Ec) ((C64323Da) generatedComponent())).A06;
            C107695bk r1 = r2.A00;
            this.A02 = (AnonymousClass5Z1) r1.A45.get();
            this.A03 = (AnonymousClass5KE) r1.A6g.get();
            this.A00 = (AnonymousClass5KR) r1.A04.get();
            this.A05 = (C103575Nn) r1.A7r.get();
            this.A04 = (AnonymousClass5JI) r1.A7M.get();
            this.A01 = (C106965aS) r1.ABl.get();
            this.A07 = (C64723Er) r2.AFX.get();
            this.A06 = (C49782h5) r1.ABm.get();
        }
        super.onCreate();
    }

    public ExceptionsUploadService(int i) {
        this.A09 = AnonymousClass002.A0D();
        this.A08 = false;
    }

    public ExceptionsUploadService() {
        this(0);
    }
}
