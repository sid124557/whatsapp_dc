package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.MimeTypeMap;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.5bf  reason: invalid class name and case insensitive filesystem */
public class C107655bf {
    public static int A00 = -1;
    public static String A01;
    public static final BitmapFactory.Options A02;
    public static final DecimalFormat A03 = new DecimalFormat("0000", new DecimalFormatSymbols(Locale.US));
    public static final byte[] A04 = {-1, -39};

    static {
        BitmapFactory.Options options = new BitmapFactory.Options();
        A02 = options;
        options.inDither = true;
        options.inInputShareable = true;
        options.inPurgeable = true;
    }

    public static Bitmap A0I(Bitmap bitmap, Matrix matrix, int i, int i2) {
        String str;
        Matrix matrix2 = matrix;
        Bitmap bitmap2 = bitmap;
        if (matrix != null) {
            Log.i("sample_rotate_image/rotate");
            try {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix2, true);
                if (bitmap2 != createBitmap) {
                    bitmap2.recycle();
                }
                bitmap2 = createBitmap;
            } catch (OutOfMemoryError e) {
                e = e;
                str = "sample_rotate_image/rotate/out-of-memory";
                Log.e(str);
                bitmap2.recycle();
                throw e;
            }
        }
        if (i2 <= 0 || (bitmap2.getWidth() <= i2 && bitmap2.getHeight() <= i2)) {
            return bitmap2;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        C86614Ku.A17(bitmap2, "sample_rotate_image/scale/", A0o);
        A0o.append(" | ");
        C18260x0.A1G(A0o, bitmap2.getHeight());
        float f = (float) i;
        float max = Math.max(((float) bitmap2.getWidth()) / f, ((float) bitmap2.getHeight()) / f);
        Rect rect = new Rect(0, 0, (int) (((float) bitmap2.getWidth()) / max), (int) (((float) bitmap2.getHeight()) / max));
        rect.right = Math.max(rect.right, 1);
        rect.bottom = Math.max(rect.bottom, 1);
        Rect rect2 = new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight());
        Bitmap.Config config = bitmap2.getConfig();
        try {
            int width = rect.width();
            int height = rect.height();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap2 = Bitmap.createBitmap(width, height, config);
            Canvas A06 = AnonymousClass4L0.A06(createBitmap2);
            Paint A0Z = C86664Kz.A0Z();
            A0Z.setAntiAlias(true);
            A0Z.setFilterBitmap(true);
            A0Z.setDither(true);
            A06.drawBitmap(bitmap2, rect2, rect, A0Z);
            bitmap2.recycle();
            return createBitmap2;
        } catch (OutOfMemoryError e2) {
            e = e2;
            str = "sample_rotate_image/scale/out-of-memory";
            Log.e(str);
            bitmap2.recycle();
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00cc, code lost:
        if (r12 == X.C633138t.A0X) goto L_0x00ce;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File A0O(X.C64393Dh r10, X.C60152y5 r11, X.C633138t r12, X.C369320h r13, java.lang.String r14, java.lang.String r15, int r16, int r17, boolean r18, boolean r19, boolean r20) {
        /*
            r3 = r15
            r2 = r14
            java.lang.String r1 = "."
            r5 = r10
            if (r18 == 0) goto L_0x001c
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = A0U()
            java.lang.String r1 = X.AnonymousClass000.A0U(r0, r1, r15, r2)
            java.io.File r0 = r10.A0I()
            java.io.File r1 = X.C64393Dh.A03(r0, r1)
        L_0x001b:
            return r1
        L_0x001c:
            if (r13 == 0) goto L_0x0040
            X.20h r0 = X.C369320h.ACCOUNT
            if (r13 != r0) goto L_0x0031
            X.2oU r0 = r10.A01
            android.content.Context r0 = r0.A00
            java.io.File r1 = r0.getFilesDir()
            java.lang.String r0 = "gdpr.zip"
        L_0x002c:
            java.io.File r1 = X.AnonymousClass002.A0A(r1, r0)
            return r1
        L_0x0031:
            X.20h r0 = X.C369320h.NEWSLETTER
            if (r13 != r0) goto L_0x0040
            X.2oU r0 = r10.A01
            android.content.Context r0 = r0.A00
            java.io.File r1 = r0.getFilesDir()
            java.lang.String r0 = "channels_gdpr.zip"
            goto L_0x002c
        L_0x0040:
            if (r19 == 0) goto L_0x0047
            java.io.File r1 = r10.A09()
            return r1
        L_0x0047:
            X.38t r0 = X.C633138t.A0L
            r7 = r12
            if (r12 != r0) goto L_0x0073
            X.2oU r0 = r10.A01
            android.content.Context r0 = r0.A00
            java.io.File r2 = r0.getFilesDir()
            java.lang.String r0 = X.C64393Dh.A07
            java.io.File r4 = X.AnonymousClass002.A0A(r2, r0)
            r0 = 0
            X.C64393Dh.A07(r4, r0)
            java.lang.String r0 = "HIST_SYNC"
            java.lang.String r2 = X.C64393Dh.A06(r4, r0)
        L_0x0064:
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 != 0) goto L_0x006e
            java.lang.String r2 = X.C18260x0.A06(r2, r1, r15)
        L_0x006e:
            java.io.File r1 = X.AnonymousClass002.A0A(r4, r2)
            return r1
        L_0x0073:
            if (r20 == 0) goto L_0x0087
            X.2UN r0 = r10.A08()
            java.io.File r4 = r0.A08
            java.lang.String r2 = r12.A01
            java.lang.String r0 = "View Once media must have a filePrefix in its MmsType"
            X.C626936e.A07(r2, r0)
            java.lang.String r2 = X.C64393Dh.A06(r4, r2)
            goto L_0x0064
        L_0x0087:
            boolean r0 = X.C106695a0.A03(r12)
            java.lang.String r8 = ""
            r6 = r8
            r4 = 0
            if (r0 == 0) goto L_0x00ca
            if (r14 == 0) goto L_0x00c8
            java.lang.String r0 = "[?:\\\\/*\"<>|\n\t\r]"
            java.lang.String r0 = r14.replaceAll(r0, r8)
            java.lang.String r2 = X.C627536m.A09(r0)
            java.lang.String r3 = X.C627536m.A08(r0)
        L_0x00a1:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x00ce
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x00ce
            r3 = r8
        L_0x00ae:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x00b8
            java.lang.String r8 = X.AnonymousClass000.A0T(r1, r3)
        L_0x00b8:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r9 = r16
            r10 = r17
            if (r0 == 0) goto L_0x00d0
            r6 = r11
            java.io.File r1 = A0Q(r5, r6, r7, r8, r9, r10)
            return r1
        L_0x00c8:
            r2 = r4
            goto L_0x00a1
        L_0x00ca:
            X.38t r0 = X.C633138t.A0X
            if (r12 != r0) goto L_0x00ae
        L_0x00ce:
            r4 = r2
            goto L_0x00ae
        L_0x00d0:
            r3 = 0
        L_0x00d1:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0l(r4)
            if (r3 != 0) goto L_0x00f3
            r0 = r6
        L_0x00d8:
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r8, r2)
            byte r0 = r12.A00
            java.io.File r0 = r5.A0K(r0, r9, r10)
            java.io.File r1 = X.AnonymousClass002.A0A(r0, r1)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x001b
            int r3 = r3 + 1
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r3 >= r0) goto L_0x001b
            goto L_0x00d1
        L_0x00f3:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "-"
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r3)
            goto L_0x00d8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107655bf.A0O(X.3Dh, X.2y5, X.38t, X.20h, java.lang.String, java.lang.String, int, int, boolean, boolean, boolean):java.io.File");
    }

    public static File A0P(C64393Dh r6, C60152y5 r7, C633138t r8, File file, int i) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(".");
        return A0Q(r6, r7, r8, AnonymousClass000.A0X(C627536m.A08(file.getAbsolutePath()), A0o), i, 3);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:210)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static java.io.File A0Q(X.C64393Dh r8, X.C60152y5 r9, X.C633138t r10, java.lang.String r11, int r12, int r13) {
        /*
            r2 = 0
        L_0x0001:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.Class<X.5bf> r7 = X.C107655bf.class
            monitor-enter(r7)
            A0Z(r8, r9)     // Catch:{ all -> 0x008c }
            java.lang.String r0 = X.C58152un.A0A     // Catch:{ all -> 0x008c }
            android.content.SharedPreferences$Editor r5 = X.C60152y5.A00(r9, r0)     // Catch:{ all -> 0x008c }
            java.util.Date r1 = new java.util.Date     // Catch:{ all -> 0x008c }
            r1.<init>()     // Catch:{ all -> 0x008c }
            java.lang.String r0 = "yyyyMMdd"
            java.text.SimpleDateFormat r0 = X.AnonymousClass0x7.A0u(r0)     // Catch:{ all -> 0x008c }
            java.lang.String r1 = r0.format(r1)     // Catch:{ all -> 0x008c }
            java.lang.String r0 = A01     // Catch:{ all -> 0x008c }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x008c }
            if (r0 != 0) goto L_0x0032
            r0 = 0
            A00 = r0     // Catch:{ all -> 0x008c }
            A01 = r1     // Catch:{ all -> 0x008c }
            java.lang.String r0 = "file_date"
            r5.putString(r0, r1)     // Catch:{ all -> 0x008c }
        L_0x0032:
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x008c }
            java.lang.String r0 = r10.A01     // Catch:{ all -> 0x008c }
            r6.append(r0)     // Catch:{ all -> 0x008c }
            java.lang.String r0 = "-"
            r6.append(r0)     // Catch:{ all -> 0x008c }
            java.lang.String r0 = A01     // Catch:{ all -> 0x008c }
            r6.append(r0)     // Catch:{ all -> 0x008c }
            java.lang.String r0 = "-WA"
            r6.append(r0)     // Catch:{ all -> 0x008c }
            java.text.DecimalFormat r3 = A03     // Catch:{ all -> 0x008c }
            int r0 = A00     // Catch:{ all -> 0x008c }
            long r0 = (long) r0     // Catch:{ all -> 0x008c }
            java.lang.String r0 = r3.format(r0)     // Catch:{ all -> 0x008c }
            java.lang.String r3 = X.AnonymousClass000.A0X(r0, r6)     // Catch:{ all -> 0x008c }
            int r0 = A00     // Catch:{ all -> 0x008c }
            int r1 = r0 + 1
            A00 = r1     // Catch:{ all -> 0x008c }
            java.lang.String r0 = "file_index"
            r5.putInt(r0, r1)     // Catch:{ all -> 0x008c }
            r5.apply()     // Catch:{ all -> 0x008c }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x008c }
            java.lang.String r0 = "mediafileutils/readablefilename/"
            X.C18260x0.A0s(r0, r3, r1)     // Catch:{ all -> 0x008c }
            monitor-exit(r7)
            java.lang.String r1 = X.AnonymousClass000.A0V(r3, r11, r4)
            byte r0 = r10.A00
            java.io.File r0 = r8.A0K(r0, r12, r13)
            java.io.File r1 = X.AnonymousClass002.A0A(r0, r1)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x008b
            int r2 = r2 + 1
            r0 = 100
            if (r2 >= r0) goto L_0x008b
            goto L_0x0001
        L_0x008b:
            return r1
        L_0x008c:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107655bf.A0Q(X.3Dh, X.2y5, X.38t, java.lang.String, int, int):java.io.File");
    }

    public static FileInputStream A0T(C55682qk r5, File file) {
        int i = 0;
        while (true) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                if (i <= 0) {
                    return fileInputStream;
                }
                C18260x0.A0w("mediafileutils/openFile/opened at attempt ", AnonymousClass001.A0o(), i);
                r5.A0A("mediafileutils/openFile/opened at attempt", true, String.valueOf(i));
                return fileInputStream;
            } catch (FileNotFoundException e) {
                if (!e.getMessage().contains("Permission denied") || i == 1) {
                    throw e;
                }
                i = 1;
            }
        }
        throw e;
    }

    public static byte A0A(String str) {
        if (str == null) {
            return -1;
        }
        if (str.startsWith("audio")) {
            return 2;
        }
        if (str.startsWith("video")) {
            return 3;
        }
        if (str.startsWith("image")) {
            return 1;
        }
        if (str.startsWith("text/x-vcard") || str.startsWith("text/vcard")) {
            return 4;
        }
        if (str.startsWith("text")) {
            return 0;
        }
        return 9;
    }

    public static int A0C(Uri uri, AnonymousClass5UR r2) {
        ParcelFileDescriptor A05 = r2.A05(uri, "r");
        if (A05 == null) {
            return 0;
        }
        try {
            if (A05.getFileDescriptor() == null) {
                A05.close();
                return 0;
            }
            int A0G = new AnonymousClass0YU(A05.getFileDescriptor()).A0G(1);
            A05.close();
            return A0G;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public static int A0D(C64393Dh r1, C633138t r2, int i, int i2, int i3) {
        A00 = i;
        return Math.max(i, A0E(r1, r2, A01, i2, i3));
    }

    public static int A0E(C64393Dh r8, C633138t r9, String str, int i, int i2) {
        File A0K = r8.A0K(r9.A00, i, i2);
        int i3 = -1;
        int i4 = 0;
        if (A0K.exists()) {
            File[] listFiles = A0K.listFiles();
            StringBuilder A0o = AnonymousClass001.A0o();
            if (listFiles != null) {
                A0o.append(r9.A01);
                A0o.append("-");
                A0o.append(str);
                String A0X = AnonymousClass000.A0X("-WA", A0o);
                int length = listFiles.length;
                while (i4 < length) {
                    String name = listFiles[i4].getName();
                    if (name.startsWith(A0X) && name.length() > 19) {
                        try {
                            int parseInt = Integer.parseInt(name.substring(15, 19));
                            if (parseInt > i3) {
                                i3 = parseInt;
                            }
                        } catch (NumberFormatException e) {
                            Log.i(AnonymousClass000.A0V("mediafileutils/findlargestfileindex/nfe:", name, AnonymousClass001.A0o()), e);
                        }
                    }
                    i4++;
                }
                i4 = length;
            } else {
                C18260x0.A1R(A0o, "mediafileutils/findlargestfileindex/no files for mmsType:", r9);
            }
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("mediafileutils/findlargestfileindex mmsType:");
        A0o2.append(r9);
        A0o2.append(" fileIndex:");
        A0o2.append(i3);
        C18260x0.A0y(" total:", A0o2, i4);
        return i3;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:13|14|15|16|17|18|19|20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0054, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0055, code lost:
        com.whatsapp.util.Log.e("getmediadurationseconds", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005a, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005b, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005c, code lost:
        if (r1 == null) goto L_0x0061;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0030 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long A0G(java.io.File r5) {
        /*
            r2 = 0
            if (r5 == 0) goto L_0x0061
            boolean r0 = r5.exists()
            if (r0 == 0) goto L_0x0061
            java.lang.String r1 = r5.getName()
            java.lang.String r0 = ".opus"
            boolean r0 = r1.endsWith(r0)
            if (r0 == 0) goto L_0x002c
            r1 = 0
            r0 = 3
            X.5ZQ r1 = X.AnonymousClass5ZQ.A00(r1, r1, r1, r5, r0)     // Catch:{ IOException -> 0x005c, all -> 0x0025 }
            r1.A05()     // Catch:{ IOException -> 0x005c, all -> 0x0025 }
            int r0 = r1.A03()     // Catch:{ IOException -> 0x005c, all -> 0x0025 }
            long r2 = (long) r0     // Catch:{ IOException -> 0x005c, all -> 0x0025 }
            goto L_0x005e
        L_0x0025:
            r0 = move-exception
            if (r1 == 0) goto L_0x002b
            r1.A06()
        L_0x002b:
            throw r0
        L_0x002c:
            X.C172218Kd.A04(r5)     // Catch:{ IOException -> 0x0030 }
            goto L_0x005b
        L_0x0030:
            X.6DM r4 = new X.6DM     // Catch:{ Exception -> 0x0054 }
            r4.<init>()     // Catch:{ Exception -> 0x0054 }
            java.lang.String r0 = r5.getAbsolutePath()     // Catch:{ all -> 0x004a }
            r4.setDataSource(r0)     // Catch:{ all -> 0x004a }
            r0 = 9
            java.lang.String r0 = r4.extractMetadata(r0)     // Catch:{ all -> 0x004a }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ all -> 0x004a }
            r4.close()     // Catch:{ Exception -> 0x0054 }
            return r0
        L_0x004a:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x004f }
            goto L_0x0053
        L_0x004f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x0054 }
        L_0x0053:
            throw r1     // Catch:{ Exception -> 0x0054 }
        L_0x0054:
            r1 = move-exception
            java.lang.String r0 = "getmediadurationseconds"
            com.whatsapp.util.Log.e(r0, r1)
            return r2
        L_0x005b:
            return r2
        L_0x005c:
            if (r1 == 0) goto L_0x0061
        L_0x005e:
            r1.A06()
        L_0x0061:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107655bf.A0G(java.io.File):long");
    }

    public static Bitmap A0H(Bitmap bitmap, float f, int i) {
        Rect rect;
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas A06 = AnonymousClass4L0.A06(createBitmap);
        Paint A0Z = C86664Kz.A0Z();
        float f2 = (float) i;
        RectF rectF = new RectF(0.0f, 0.0f, f2, f2);
        int width = (bitmap.getWidth() - bitmap.getHeight()) / 2;
        if (width > 0) {
            rect = new Rect(width, 0, bitmap.getWidth() - width, bitmap.getHeight());
        } else {
            rect = new Rect(0, -width, bitmap.getWidth(), bitmap.getHeight() + width);
        }
        A0Z.setAntiAlias(true);
        A0Z.setDither(true);
        A0Z.setFilterBitmap(true);
        A06.drawARGB(0, 0, 0, 0);
        A0Z.setColor(-1);
        if (f >= 0.0f) {
            A06.drawRoundRect(rectF, f, f, A0Z);
        } else {
            A06.drawArc(rectF, 0.0f, 360.0f, true, A0Z);
        }
        C86634Kw.A18(A0Z, PorterDuff.Mode.SRC_IN);
        A06.drawBitmap(bitmap, rect, rectF, A0Z);
        return createBitmap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003c, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0046, code lost:
        r1.setValues(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0049, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0039, code lost:
        r1.setRotate(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Matrix A0J(int r1) {
        /*
            r0 = 9
            switch(r1) {
                case 2: goto L_0x003d;
                case 3: goto L_0x0033;
                case 4: goto L_0x0029;
                case 5: goto L_0x001f;
                case 6: goto L_0x0018;
                case 7: goto L_0x000e;
                case 8: goto L_0x0007;
                default: goto L_0x0005;
            }
        L_0x0005:
            r1 = 0
            return r1
        L_0x0007:
            android.graphics.Matrix r1 = X.AnonymousClass002.A05()
            r0 = 1132920832(0x43870000, float:270.0)
            goto L_0x0039
        L_0x000e:
            android.graphics.Matrix r1 = X.AnonymousClass002.A05()
            float[] r0 = new float[r0]
            r0 = {0, -1082130432, 0, -1082130432, 0, 0, 0, 0, 1065353216} // fill-array
            goto L_0x0046
        L_0x0018:
            android.graphics.Matrix r1 = X.AnonymousClass002.A05()
            r0 = 1119092736(0x42b40000, float:90.0)
            goto L_0x0039
        L_0x001f:
            android.graphics.Matrix r1 = X.AnonymousClass002.A05()
            float[] r0 = new float[r0]
            r0 = {0, 1065353216, 0, 1065353216, 0, 0, 0, 0, 1065353216} // fill-array
            goto L_0x0046
        L_0x0029:
            android.graphics.Matrix r1 = X.AnonymousClass002.A05()
            float[] r0 = new float[r0]
            r0 = {1065353216, 0, 0, 0, -1082130432, 0, 0, 0, 1065353216} // fill-array
            goto L_0x0046
        L_0x0033:
            android.graphics.Matrix r1 = X.AnonymousClass002.A05()
            r0 = 1127481344(0x43340000, float:180.0)
        L_0x0039:
            r1.setRotate(r0)
            return r1
        L_0x003d:
            android.graphics.Matrix r1 = X.AnonymousClass002.A05()
            float[] r0 = new float[r0]
            r0 = {-1082130432, 0, 0, 0, 1065353216, 0, 0, 0, 1065353216} // fill-array
        L_0x0046:
            r1.setValues(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107655bf.A0J(int):android.graphics.Matrix");
    }

    public static Matrix A0K(Uri uri, AnonymousClass5UR r5) {
        int parseInt;
        if (uri == null || TextUtils.isEmpty(uri.toString())) {
            throw new FileNotFoundException(AnonymousClass000.A0P(uri, "No file ", AnonymousClass001.A0o()));
        }
        Matrix A0J = A0J(A0B(uri, r5));
        if (uri.getQueryParameter("flip-h") != null) {
            Matrix A05 = AnonymousClass002.A05();
            A05.setValues(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
            if (A0J == null) {
                A0J = A05;
            } else {
                A0J.postConcat(A05);
            }
        }
        if (uri.getQueryParameter("flip-v") != null) {
            Matrix A052 = AnonymousClass002.A05();
            A052.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
            if (A0J == null) {
                A0J = A052;
            } else {
                A0J.postConcat(A052);
            }
        }
        String queryParameter = uri.getQueryParameter("rotation");
        if (!(queryParameter == null || (parseInt = Integer.parseInt(queryParameter)) == 0)) {
            if (A0J == null) {
                A0J = AnonymousClass002.A05();
            }
            A0J.postRotate((float) parseInt);
        }
        return A0J;
    }

    public static Pair A0L(File file) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        return C18290x4.A0K(Integer.valueOf(options.outHeight), options.outWidth);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair A0M(java.io.File r3) {
        /*
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options
            r2.<init>()
            r0 = 1
            r2.inJustDecodeBounds = r0
            java.lang.String r0 = r3.getAbsolutePath()
            android.graphics.BitmapFactory.decodeFile(r0, r2)
            boolean r0 = r3.exists()
            if (r0 == 0) goto L_0x002a
            java.lang.String r0 = r3.getAbsolutePath()     // Catch:{ IOException -> 0x0024 }
            X.0YU r1 = new X.0YU     // Catch:{ IOException -> 0x0024 }
            r1.<init>((java.lang.String) r0)     // Catch:{ IOException -> 0x0024 }
            r0 = 1
            int r1 = r1.A0G(r0)     // Catch:{ IOException -> 0x0024 }
            goto L_0x002b
        L_0x0024:
            r1 = move-exception
            java.lang.String r0 = "failure retrieving exif, io exception"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x002a:
            r1 = 0
        L_0x002b:
            r0 = 6
            if (r1 == r0) goto L_0x003f
            r0 = 8
            if (r1 == r0) goto L_0x003f
            int r0 = r2.outWidth
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r2.outHeight
        L_0x003a:
            android.util.Pair r0 = X.C18290x4.A0K(r1, r0)
            return r0
        L_0x003f:
            int r0 = r2.outHeight
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r2.outWidth
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107655bf.A0M(java.io.File):android.util.Pair");
    }

    public static Pair A0N(File file) {
        Pair pair;
        int i;
        AnonymousClass6DM r5 = new AnonymousClass6DM();
        int i2 = 0;
        try {
            r5.setDataSource(file.getAbsolutePath());
            String extractMetadata = r5.extractMetadata(18);
            String extractMetadata2 = r5.extractMetadata(19);
            try {
                i = Integer.parseInt(extractMetadata);
                try {
                    i2 = Integer.parseInt(extractMetadata2);
                } catch (Exception e) {
                    e = e;
                }
            } catch (Exception e2) {
                e = e2;
                i = 0;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("getVideoHeightWidth/cannot parse width (");
                A0o.append(extractMetadata);
                A0o.append(") or height (");
                A0o.append(i2);
                A0o.append(") ");
                C18260x0.A14(file.getAbsolutePath(), A0o, e);
                pair = Pair.create(Integer.valueOf(i2), Integer.valueOf(i));
                r5.close();
                return pair;
            }
            pair = Pair.create(Integer.valueOf(i2), Integer.valueOf(i));
        } catch (Exception unused) {
            pair = Pair.create(0, 0);
        } catch (Throwable th) {
            try {
                r5.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        r5.close();
        return pair;
    }

    public static String A0W(Uri uri, AnonymousClass5UR r2) {
        if (r2 == null) {
            Log.w("media-file-utils/get-media-mime cr=null");
        } else {
            String type = AnonymousClass5UR.A00(r2, uri).getType(uri);
            if (type != null) {
                return type;
            }
        }
        return A0X(A0V(uri));
    }

    public static String A0X(String str) {
        String str2;
        Locale locale = Locale.US;
        String lowerCase = str.toLowerCase(locale);
        switch (lowerCase.hashCode()) {
            case 96323:
                if (lowerCase.equals("aac")) {
                    return "audio/aac";
                }
                break;
            case 96710:
                if (lowerCase.equals("amr")) {
                    return "audio/amr";
                }
                break;
            case 98822:
                if (lowerCase.equals("csv")) {
                    return "text/csv";
                }
                break;
            case 99640:
                if (lowerCase.equals("doc")) {
                    return "application/msword";
                }
                break;
            case 105441:
                str2 = "jpg";
                break;
            case 106458:
                if (lowerCase.equals("m4a")) {
                    return "audio/mp4";
                }
                break;
            case 108272:
                if (lowerCase.equals("mp3")) {
                    return "audio/mpeg";
                }
                break;
            case 108273:
                if (lowerCase.equals("mp4")) {
                    return "video/mp4";
                }
                break;
            case 110834:
                if (lowerCase.equals("pdf")) {
                    return "application/pdf";
                }
                break;
            case 111145:
                if (lowerCase.equals("png")) {
                    return "image/png";
                }
                break;
            case 111220:
                if (lowerCase.equals("ppt")) {
                    return "application/vnd.ms-powerpoint";
                }
                break;
            case 113252:
                if (lowerCase.equals("rtf")) {
                    return "application/rtf";
                }
                break;
            case 115312:
                if (lowerCase.equals("txt")) {
                    return "text/plain";
                }
                break;
            case 117484:
                if (lowerCase.equals("wav")) {
                    return "audio/x-wav";
                }
                break;
            case 117835:
                if (lowerCase.equals("wma")) {
                    return "audio/x-ms-wma";
                }
                break;
            case 118783:
                if (lowerCase.equals("xls")) {
                    return "application/vnd.ms-excel";
                }
                break;
            case 3088960:
                if (lowerCase.equals("docx")) {
                    return "application/vnd.openxmlformats-officedocument.wordprocessingml.document";
                }
                break;
            case 3268712:
                str2 = "jpeg";
                break;
            case 3418175:
                if (lowerCase.equals("opus")) {
                    return "audio/ogg; codecs=opus";
                }
                break;
            case 3447940:
                if (lowerCase.equals("pptx")) {
                    return "application/vnd.openxmlformats-officedocument.presentationml.presentation";
                }
                break;
            case 3682393:
                if (lowerCase.equals("xlsx")) {
                    return "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
                }
                break;
        }
        if (lowerCase.equals(str2)) {
            return "image/jpeg";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str.toLowerCase(locale));
        if (mimeTypeFromExtension == null) {
            return "application/octet-stream";
        }
        return mimeTypeFromExtension;
    }

    public static void A0Y(Context context, Uri uri) {
        context.sendBroadcast(AnonymousClass0x9.A09("android.intent.action.MEDIA_SCANNER_SCAN_FILE").setData(uri));
    }

    public static synchronized void A0Z(C64393Dh r13, C60152y5 r14) {
        synchronized (C107655bf.class) {
            if (A00 < 0) {
                SharedPreferences A032 = r14.A03(C58152un.A0A);
                A00 = A032.getInt("file_index", -1);
                String A0Z = C18280x3.A0Z(A032, "file_date");
                A01 = A0Z;
                if (A00 < 0 || TextUtils.isEmpty(A0Z)) {
                    String format = AnonymousClass0x7.A0u("yyyyMMdd").format(new Date());
                    A01 = format;
                    long currentTimeMillis = System.currentTimeMillis();
                    A00 = -1;
                    C633138t r2 = C633138t.A05;
                    int max = Math.max(-1, A0E(r13, r2, format, 0, 1));
                    A00 = max;
                    int max2 = Math.max(max, A0E(r13, r2, A01, 0, 2));
                    A00 = max2;
                    int max3 = Math.max(max2, A0E(r13, r2, A01, 0, 3));
                    A00 = max3;
                    String str = A01;
                    C633138t r1 = C633138t.A0J;
                    int A0D = A0D(r13, r1, A0D(r13, r1, Math.max(max3, A0E(r13, r1, str, 1, 1)), 1, 2), 1, 3);
                    A00 = A0D;
                    String str2 = A01;
                    C633138t r12 = C633138t.A0g;
                    int A0D2 = A0D(r13, r12, A0D(r13, r12, Math.max(A0D, A0E(r13, r12, str2, 0, 1)), 0, 2), 0, 3);
                    A00 = A0D2;
                    String str3 = A01;
                    C633138t r15 = C633138t.A0C;
                    int A0D3 = A0D(r13, r15, A0D(r13, r15, Math.max(A0D2, A0E(r13, r15, str3, 0, 1)), 0, 2), 0, 3);
                    A00 = A0D3;
                    String str4 = A01;
                    C633138t r16 = C633138t.A09;
                    A00 = A0D(r13, r16, A0D(r13, r16, Math.max(A0D3, A0E(r13, r16, str4, 0, 1)), 0, 2), 0, 3) + 1;
                    SharedPreferences.Editor edit = A032.edit();
                    edit.putInt("file_index", A00);
                    edit.putString("file_date", A01);
                    edit.apply();
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("mediafileutils/initfilecounter file_index:");
                    A0o.append(A00);
                    A0o.append(" | file_date:");
                    A0o.append(A01);
                    A0o.append(" |  time:");
                    C18260x0.A1I(A0o, AnonymousClass0x9.A05(currentTimeMillis));
                } else {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("mediafileutils/initfilecounter file_index:");
                    A0o2.append(A00);
                    A0o2.append(" | file_date:");
                    C18260x0.A1L(A0o2, A01);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ac, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b0, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cc, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0b(java.io.File r9) {
        /*
            java.lang.String r6 = "Xmp"
            if (r9 == 0) goto L_0x00e0
            X.0YU r5 = new X.0YU     // Catch:{ IOException -> 0x00da }
            r5.<init>((java.io.File) r9)     // Catch:{ IOException -> 0x00da }
            java.lang.String r1 = r5.A0H(r6)     // Catch:{ IOException -> 0x00da }
            if (r1 == 0) goto L_0x00cd
            boolean r0 = r1.isEmpty()     // Catch:{ IOException -> 0x00da }
            if (r0 != 0) goto L_0x00cd
            java.lang.String r2 = "trainedAlgorithmicMedia"
            javax.xml.parsers.DocumentBuilderFactory r0 = javax.xml.parsers.DocumentBuilderFactory.newInstance()     // Catch:{ IOException -> 0x00da }
            java.io.StringReader r3 = new java.io.StringReader     // Catch:{ IOException -> 0x00da }
            r3.<init>(r1)     // Catch:{ IOException -> 0x00da }
            javax.xml.parsers.DocumentBuilder r1 = r0.newDocumentBuilder()     // Catch:{ ParserConfigurationException -> 0x00b8, SAXException -> 0x00bf, TransformerException -> 0x00b1 }
            org.xml.sax.InputSource r0 = new org.xml.sax.InputSource     // Catch:{ ParserConfigurationException -> 0x00b8, SAXException -> 0x00bf, TransformerException -> 0x00b1 }
            r0.<init>(r3)     // Catch:{ ParserConfigurationException -> 0x00b8, SAXException -> 0x00bf, TransformerException -> 0x00b1 }
            org.w3c.dom.Document r7 = r1.parse(r0)     // Catch:{ ParserConfigurationException -> 0x00b8, SAXException -> 0x00bf, TransformerException -> 0x00b1 }
            X.C162457s7.A0H(r7)     // Catch:{ ParserConfigurationException -> 0x00b8, SAXException -> 0x00bf, TransformerException -> 0x00b1 }
            java.lang.String r0 = "rdf:Description"
            org.w3c.dom.Element r8 = r7.createElement(r0)     // Catch:{ ParserConfigurationException -> 0x00b8, SAXException -> 0x00bf, TransformerException -> 0x00b1 }
            java.lang.String r1 = "xmlns:iptcExt"
            java.lang.String r0 = "http://iptc.org/std/Iptc4xmpExt/2008-02-29/"
            r8.setAttribute(r1, r0)     // Catch:{ ParserConfigurationException -> 0x00b8, SAXException -> 0x00bf, TransformerException -> 0x00b1 }
            java.lang.String r0 = "iptcExt:DigitalSourceType"
            r8.setAttribute(r0, r2)     // Catch:{ ParserConfigurationException -> 0x00b8, SAXException -> 0x00bf, TransformerException -> 0x00b1 }
            java.lang.String r9 = "rdf:RDF"
            org.w3c.dom.NodeList r1 = r7.getElementsByTagName(r9)     // Catch:{ ParserConfigurationException -> 0x00b8, SAXException -> 0x00bf, TransformerException -> 0x00b1 }
            int r0 = r1.getLength()     // Catch:{ ParserConfigurationException -> 0x00b8, SAXException -> 0x00bf, TransformerException -> 0x00b1 }
            r4 = 0
            r2 = 1
            if (r0 != r2) goto L_0x0061
            org.w3c.dom.Node r0 = r1.item(r4)     // Catch:{ ParserConfigurationException -> 0x00b8, SAXException -> 0x00bf, TransformerException -> 0x00b1 }
            r0.appendChild(r8)     // Catch:{ ParserConfigurationException -> 0x00b8, SAXException -> 0x00bf, TransformerException -> 0x00b1 }
        L_0x0057:
            javax.xml.transform.TransformerFactory r0 = javax.xml.transform.TransformerFactory.newInstance()     // Catch:{ ParserConfigurationException -> 0x00b8, SAXException -> 0x00bf, TransformerException -> 0x00b1 }
            java.io.StringWriter r4 = new java.io.StringWriter     // Catch:{ ParserConfigurationException -> 0x00b8, SAXException -> 0x00bf, TransformerException -> 0x00b1 }
            r4.<init>()     // Catch:{ ParserConfigurationException -> 0x00b8, SAXException -> 0x00bf, TransformerException -> 0x00b1 }
            goto L_0x0083
        L_0x0061:
            java.lang.String r0 = "x:xmpmeta"
            org.w3c.dom.NodeList r1 = r7.getElementsByTagName(r0)     // Catch:{ ParserConfigurationException -> 0x00b8, SAXException -> 0x00bf, TransformerException -> 0x00b1 }
            int r0 = r1.getLength()     // Catch:{ ParserConfigurationException -> 0x00b8, SAXException -> 0x00bf, TransformerException -> 0x00b1 }
            if (r0 != r2) goto L_0x0057
            org.w3c.dom.Node r4 = r1.item(r4)     // Catch:{ ParserConfigurationException -> 0x00b8, SAXException -> 0x00bf, TransformerException -> 0x00b1 }
            org.w3c.dom.Element r2 = r7.createElement(r9)     // Catch:{ ParserConfigurationException -> 0x00b8, SAXException -> 0x00bf, TransformerException -> 0x00b1 }
            java.lang.String r1 = "xmlns:rdf"
            java.lang.String r0 = "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
            r2.setAttribute(r1, r0)     // Catch:{ ParserConfigurationException -> 0x00b8, SAXException -> 0x00bf, TransformerException -> 0x00b1 }
            r2.appendChild(r8)     // Catch:{ ParserConfigurationException -> 0x00b8, SAXException -> 0x00bf, TransformerException -> 0x00b1 }
            r4.appendChild(r2)     // Catch:{ ParserConfigurationException -> 0x00b8, SAXException -> 0x00bf, TransformerException -> 0x00b1 }
            goto L_0x0057
        L_0x0083:
            javax.xml.transform.Transformer r2 = r0.newTransformer()     // Catch:{ all -> 0x00aa }
            X.C162457s7.A0D(r2)     // Catch:{ all -> 0x00aa }
            java.lang.String r1 = "omit-xml-declaration"
            java.lang.String r0 = "yes"
            r2.setOutputProperty(r1, r0)     // Catch:{ all -> 0x00aa }
            javax.xml.transform.dom.DOMSource r1 = new javax.xml.transform.dom.DOMSource     // Catch:{ all -> 0x00aa }
            r1.<init>(r7)     // Catch:{ all -> 0x00aa }
            javax.xml.transform.stream.StreamResult r0 = new javax.xml.transform.stream.StreamResult     // Catch:{ all -> 0x00aa }
            r0.<init>(r4)     // Catch:{ all -> 0x00aa }
            r2.transform(r1, r0)     // Catch:{ all -> 0x00aa }
            java.lang.StringBuffer r0 = r4.getBuffer()     // Catch:{ all -> 0x00aa }
            java.lang.String r0 = X.C18290x4.A0o(r0)     // Catch:{ all -> 0x00aa }
            r4.close()     // Catch:{ ParserConfigurationException -> 0x00b8, SAXException -> 0x00bf, TransformerException -> 0x00b1 }
            goto L_0x00d0
        L_0x00aa:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)     // Catch:{ ParserConfigurationException -> 0x00b8, SAXException -> 0x00bf, TransformerException -> 0x00b1 }
            throw r0     // Catch:{ ParserConfigurationException -> 0x00b8, SAXException -> 0x00bf, TransformerException -> 0x00b1 }
        L_0x00b1:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x00c6 }
            r1.<init>(r0)     // Catch:{ all -> 0x00c6 }
            goto L_0x00c5
        L_0x00b8:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x00c6 }
            r1.<init>(r0)     // Catch:{ all -> 0x00c6 }
            goto L_0x00c5
        L_0x00bf:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x00c6 }
            r1.<init>(r0)     // Catch:{ all -> 0x00c6 }
        L_0x00c5:
            throw r1     // Catch:{ all -> 0x00c6 }
        L_0x00c6:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c8 }
        L_0x00c8:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ IOException -> 0x00da }
            throw r0     // Catch:{ IOException -> 0x00da }
        L_0x00cd:
            java.lang.String r0 = "<?xpacket begin=\"\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?><x:xmpmeta xmlns:x=\"adobe:ns:meta/\" x:xmptk=\"XMP Core 4.4.0-Exiv2\"><rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"><rdf:Description rdf:about=\"\" xmlns:iptcExt=\"http://iptc.org/std/Iptc4xmpExt/2008-02-29/\" iptcExt:DigitalSourceType=\"trainedAlgorithmicMedia\"/></rdf:RDF></x:xmpmeta>"
            goto L_0x00d3
        L_0x00d0:
            r3.close()     // Catch:{ IOException -> 0x00da }
        L_0x00d3:
            r5.A0Z(r6, r0)     // Catch:{ IOException -> 0x00da }
            r5.A0I()     // Catch:{ IOException -> 0x00da }
            return
        L_0x00da:
            r1 = move-exception
            java.lang.String r0 = "BaseMediaFileUtils/addXmpDataTrainedAlgorithmicMedia Failed to add XMP Data"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107655bf.A0b(java.io.File):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:19|20|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x008c, code lost:
        if (r2 != null) goto L_0x008e;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0051 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A0B(android.net.Uri r10, X.AnonymousClass5UR r11) {
        /*
            java.io.File r0 = X.C627536m.A04(r10)
            r6 = r11
            if (r0 == 0) goto L_0x000d
            int r3 = A0C(r10, r11)     // Catch:{ FileNotFoundException -> 0x00a1 }
            goto L_0x00af
        L_0x000d:
            java.lang.String r1 = r10.getScheme()
            java.lang.String r0 = "content"
            boolean r0 = r0.equals(r1)
            r5 = 0
            if (r0 == 0) goto L_0x009f
            java.lang.String r4 = "_data"
            java.lang.String r3 = "orientation"
            java.lang.String[] r8 = new java.lang.String[]{r4, r3}
            android.net.Uri$Builder r0 = r10.buildUpon()
            r9 = 0
            android.net.Uri$Builder r0 = r0.query(r9)
            android.net.Uri r7 = r0.build()
            if (r11 == 0) goto L_0x009a
            r11 = r9
            r10 = r9
            android.database.Cursor r2 = r6.A03(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0092 }
            if (r2 == 0) goto L_0x008b
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0081 }
            if (r0 == 0) goto L_0x007b
            int r1 = r2.getColumnCount()     // Catch:{ all -> 0x0081 }
            r0 = 2
            if (r1 != r0) goto L_0x0075
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r2, r4)     // Catch:{ all -> 0x0081 }
            if (r0 == 0) goto L_0x005c
            int r5 = A0C(r7, r6)     // Catch:{ FileNotFoundException -> 0x0051 }
            goto L_0x0071
        L_0x0051:
            X.0YU r1 = new X.0YU     // Catch:{ all -> 0x0081 }
            r1.<init>((java.lang.String) r0)     // Catch:{ all -> 0x0081 }
            r0 = 1
            int r5 = r1.A0G(r0)     // Catch:{ all -> 0x0081 }
            goto L_0x0071
        L_0x005c:
            int r1 = X.AnonymousClass0x2.A04(r2, r3)     // Catch:{ all -> 0x0081 }
            r0 = 90
            if (r1 == r0) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            r5 = 6
            goto L_0x0071
        L_0x0067:
            r0 = 180(0xb4, float:2.52E-43)
            if (r1 == r0) goto L_0x0073
            r0 = 270(0x10e, float:3.78E-43)
            if (r1 != r0) goto L_0x0071
            r5 = 8
        L_0x0071:
            r3 = r5
            goto L_0x008e
        L_0x0073:
            r5 = 3
            goto L_0x0071
        L_0x0075:
            java.lang.String r0 = "sample_rotate_image/no_orientation_info"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0081 }
            goto L_0x008b
        L_0x007b:
            java.lang.String r0 = "sample_rotate_image/cursor_is_empty"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0081 }
            goto L_0x008b
        L_0x0081:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0086 }
            goto L_0x008a
        L_0x0086:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x0092 }
        L_0x008a:
            throw r1     // Catch:{ Exception -> 0x0092 }
        L_0x008b:
            r3 = 0
            if (r2 == 0) goto L_0x00af
        L_0x008e:
            r2.close()     // Catch:{ Exception -> 0x0092 }
            goto L_0x00af
        L_0x0092:
            r1 = move-exception
            java.lang.String r0 = "sample_rotate_image/query_orientation_info"
            com.whatsapp.util.Log.w(r0, r1)
            r3 = r5
            goto L_0x00af
        L_0x009a:
            java.lang.String r0 = "media-file-utils/get-exiff-orientation cr=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x009f:
            r3 = 0
            goto L_0x00af
        L_0x00a1:
            java.lang.String r0 = r0.getPath()
            X.0YU r1 = new X.0YU
            r1.<init>((java.lang.String) r0)
            r0 = 1
            int r3 = r1.A0G(r0)
        L_0x00af:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "sample_rotate_image/orientation "
            X.C18260x0.A0y(r0, r1, r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107655bf.A0B(android.net.Uri, X.5UR):int");
    }

    public static int A0F(File file) {
        long A0G = A0G(file);
        int A0B = (int) C18290x4.A0B(A0G);
        if (A0B != 0 || A0G == 0) {
            return A0B;
        }
        return 1;
    }

    public static File A0R(C64393Dh r2, String str) {
        return C64393Dh.A00(r2, AnonymousClass000.A0X(".doodle", AnonymousClass000.A0l(str)));
    }

    public static File A0S(File file, String str) {
        File A0A = AnonymousClass002.A0A(file, str);
        if (!A0A.exists()) {
            return A0A;
        }
        for (int i = 1; i <= 100; i++) {
            File A0A2 = AnonymousClass002.A0A(file, AnonymousClass000.A0Y("-", AnonymousClass000.A0l(str), i));
            if (!A0A2.exists()) {
                return A0A2;
            }
        }
        return C18270x1.A0A(file, C18280x3.A0Y(), AnonymousClass000.A0m(str, "-"));
    }

    public static String A0U() {
        return C18280x3.A0Y().replace("-", "");
    }

    public static String A0V(Uri uri) {
        int lastIndexOf;
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null || (lastIndexOf = lastPathSegment.lastIndexOf(46)) == -1) {
            return "";
        }
        return lastPathSegment.substring(lastIndexOf + 1);
    }

    public static void A0a(AnonymousClass33C r2, File file) {
        Pair A0M = A0M(file);
        r2.A08 = C18280x3.A03(A0M);
        r2.A06 = C18290x4.A03(A0M);
    }

    public static boolean A0c(C56512s6 r3, File file, File file2) {
        String str;
        StringBuilder sb;
        String str2;
        File A032 = r3.A03(file);
        if (file2.renameTo(A032)) {
            if (!file.renameTo(file2)) {
                boolean renameTo = A032.renameTo(file2);
                boolean delete = file.delete();
                if (!renameTo) {
                    if (!delete) {
                        C18260x0.A1K(AnonymousClass000.A0l("failed to delete "), file.getAbsolutePath());
                    }
                    if (!A032.delete()) {
                        C18260x0.A1K(AnonymousClass000.A0l("failed to delete "), A032.getAbsolutePath());
                    }
                    str = "restore input file failed";
                    Log.e(str);
                    return false;
                } else if (delete) {
                    return false;
                } else {
                    sb = AnonymousClass000.A0l("failed to delete ");
                    str2 = file.getAbsolutePath();
                }
            } else if (A032.delete()) {
                return true;
            } else {
                C18260x0.A1K(AnonymousClass000.A0l("failed to delete "), A032.getAbsolutePath());
                return true;
            }
        } else if (A032.delete()) {
            return false;
        } else {
            sb = AnonymousClass000.A0l("failed to delete ");
            str2 = A032.getAbsolutePath();
        }
        str = AnonymousClass000.A0X(str2, sb);
        Log.e(str);
        return false;
    }
}
