package X;

import android.app.ActivityManager;
import com.whatsapp.util.Log;
import java.io.BufferedReader;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/* renamed from: X.35D  reason: invalid class name */
public final class AnonymousClass35D {
    public static final FileFilter A00 = new C69853Yq();

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x007d, code lost:
        if (r1 == 10) goto L_0x007f;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x00cb */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00() {
        /*
            r9 = 0
            r4 = -1
            r8 = 0
            r6 = -1
        L_0x0004:
            int r0 = A01()     // Catch:{ IOException -> 0x00dc, all -> 0x00da }
            if (r8 >= r0) goto L_0x005f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x00dc, all -> 0x00da }
            java.lang.String r0 = "/sys/devices/system/cpu/cpu"
            r1.append(r0)     // Catch:{ IOException -> 0x00dc, all -> 0x00da }
            r1.append(r8)     // Catch:{ IOException -> 0x00dc, all -> 0x00da }
            java.lang.String r0 = "/cpufreq/cpuinfo_max_freq"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ IOException -> 0x00dc, all -> 0x00da }
            java.io.File r1 = X.AnonymousClass002.A0B(r0)     // Catch:{ IOException -> 0x00dc, all -> 0x00da }
            boolean r0 = r1.exists()     // Catch:{ IOException -> 0x00dc, all -> 0x00da }
            if (r0 == 0) goto L_0x005c
            r0 = 128(0x80, float:1.794E-43)
            byte[] r7 = new byte[r0]     // Catch:{ IOException -> 0x00dc, all -> 0x00da }
            java.io.FileInputStream r5 = X.AnonymousClass0x9.A0g(r1)     // Catch:{ NumberFormatException -> 0x005c }
            int r3 = r5.read(r7)     // Catch:{ all -> 0x0052 }
            r2 = 0
        L_0x0033:
            byte r1 = r7[r2]     // Catch:{ all -> 0x0052 }
            r0 = 48
            if (r1 < r0) goto L_0x0042
            r0 = 57
            if (r1 > r0) goto L_0x0042
            if (r2 >= r3) goto L_0x0042
            int r2 = r2 + 1
            goto L_0x0033
        L_0x0042:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0052 }
            r0.<init>(r7, r9, r2)     // Catch:{ all -> 0x0052 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x0052 }
            if (r0 <= r6) goto L_0x004e
            r6 = r0
        L_0x004e:
            r5.close()     // Catch:{ NumberFormatException -> 0x005c }
            goto L_0x005c
        L_0x0052:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0057 }
            goto L_0x005b
        L_0x0057:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ NumberFormatException -> 0x005c }
        L_0x005b:
            throw r1     // Catch:{ NumberFormatException -> 0x005c }
        L_0x005c:
            int r8 = r8 + 1
            goto L_0x0004
        L_0x005f:
            if (r6 != r4) goto L_0x00d9
            java.lang.String r0 = "/proc/cpuinfo"
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00dc, all -> 0x00da }
            r5.<init>(r0)     // Catch:{ IOException -> 0x00dc, all -> 0x00da }
            java.lang.String r11 = "cpu MHz"
            r9 = 1024(0x400, float:1.435E-42)
            byte[] r8 = new byte[r9]     // Catch:{ all -> 0x00cf }
            int r10 = r5.read(r8)     // Catch:{ IOException | NumberFormatException -> 0x00cb }
            r3 = 0
        L_0x0073:
            if (r3 >= r10) goto L_0x00cb
            byte r1 = r8[r3]     // Catch:{ IOException | NumberFormatException -> 0x00cb }
            r0 = 10
            if (r1 == r0) goto L_0x007f
            if (r3 != 0) goto L_0x0099
            if (r1 != r0) goto L_0x0081
        L_0x007f:
            int r3 = r3 + 1
        L_0x0081:
            r7 = r3
        L_0x0082:
            if (r7 >= r10) goto L_0x0099
            int r2 = r7 - r3
            byte r1 = r8[r7]     // Catch:{ IOException | NumberFormatException -> 0x00cb }
            char r0 = r11.charAt(r2)     // Catch:{ IOException | NumberFormatException -> 0x00cb }
            if (r1 != r0) goto L_0x0099
            int r0 = r11.length()     // Catch:{ IOException | NumberFormatException -> 0x00cb }
            int r0 = r0 + -1
            if (r2 == r0) goto L_0x009c
            int r7 = r7 + 1
            goto L_0x0082
        L_0x0099:
            int r3 = r3 + 1
            goto L_0x0073
        L_0x009c:
            if (r7 >= r9) goto L_0x00cb
            byte r1 = r8[r7]     // Catch:{ IOException | NumberFormatException -> 0x00cb }
            r0 = 10
            if (r1 == r0) goto L_0x00cb
            r3 = 48
            if (r1 < r3) goto L_0x00b9
            r2 = 57
            if (r1 > r2) goto L_0x00b9
            int r1 = r7 + 1
        L_0x00ae:
            if (r1 >= r9) goto L_0x00bc
            byte r0 = r8[r1]     // Catch:{ IOException | NumberFormatException -> 0x00cb }
            if (r0 < r3) goto L_0x00bc
            if (r0 > r2) goto L_0x00bc
            int r1 = r1 + 1
            goto L_0x00ae
        L_0x00b9:
            int r7 = r7 + 1
            goto L_0x009c
        L_0x00bc:
            int r1 = r1 - r7
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException | NumberFormatException -> 0x00cb }
            r0.<init>(r8, r7, r1)     // Catch:{ IOException | NumberFormatException -> 0x00cb }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ IOException | NumberFormatException -> 0x00cb }
            int r0 = r0 * 1000
            if (r0 <= r6) goto L_0x00cb
            r6 = r0
        L_0x00cb:
            r5.close()     // Catch:{ IOException -> 0x00dc, all -> 0x00da }
            return r6
        L_0x00cf:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x00d4 }
            goto L_0x00d8
        L_0x00d4:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x00dc, all -> 0x00da }
        L_0x00d8:
            throw r1     // Catch:{ IOException -> 0x00dc, all -> 0x00da }
        L_0x00d9:
            return r6
        L_0x00da:
            r0 = move-exception
            throw r0
        L_0x00dc:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass35D.A00():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A01() {
        /*
            java.lang.String r0 = "/sys/devices/system/cpu/"
            java.io.File r1 = X.AnonymousClass002.A0B(r0)     // Catch:{ NullPointerException | SecurityException -> 0x0010, all -> 0x000e }
            java.io.FileFilter r0 = A00     // Catch:{ NullPointerException | SecurityException -> 0x0010, all -> 0x000e }
            java.io.File[] r0 = r1.listFiles(r0)     // Catch:{ NullPointerException | SecurityException -> 0x0010, all -> 0x000e }
            int r0 = r0.length     // Catch:{ NullPointerException | SecurityException -> 0x0010, all -> 0x000e }
            return r0
        L_0x000e:
            r0 = move-exception
            throw r0
        L_0x0010:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass35D.A01():int");
    }

    public static long A02(C620633i r2) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager A06 = r2.A06();
        if (A06 == null) {
            Log.w("deviceinfo/get-total-memory am=null");
            return -1;
        }
        A06.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    public static boolean A03(String str) {
        BufferedReader bufferedReader;
        String readLine;
        String A0z = AnonymousClass0x9.A0z(str);
        BufferedReader bufferedReader2 = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("/proc/cpuinfo");
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, C58152un.A0B));
            } catch (UnsupportedEncodingException e) {
                Log.i("searchFileForText/unsupported-encoding: UTF-8", e);
                bufferedReader = C18310x6.A0Z(fileInputStream);
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
            bufferedReader2 = bufferedReader;
            do {
                readLine = bufferedReader2.readLine();
                if (readLine == null) {
                    fileInputStream.close();
                    try {
                        return false;
                    } catch (Exception e2) {
                        Log.w("DeviceInfo/searchFileForText bufferedReader.close failed", e2);
                        return false;
                    }
                }
            } while (!AnonymousClass0x9.A0z(readLine).contains(A0z));
            fileInputStream.close();
            try {
                bufferedReader2.close();
                return true;
            } catch (Exception e3) {
                Log.w("DeviceInfo/searchFileForText bufferedReader.close failed", e3);
                return true;
            }
        } catch (Exception e4) {
            try {
                Log.w("DeviceInfo/searchFileForText read failed", e4);
            } finally {
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                        throw th;
                    } catch (Exception e5) {
                        Log.w("DeviceInfo/searchFileForText bufferedReader.close failed", e5);
                    }
                }
            }
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }
}
