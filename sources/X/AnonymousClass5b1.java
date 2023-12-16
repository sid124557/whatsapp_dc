package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.whatsapp.R;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;

/* renamed from: X.5b1  reason: invalid class name */
public final class AnonymousClass5b1 {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        if (r3.equals(r0) == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        r0 = com.whatsapp.R.plurals.f9nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        if (r3.equals(r0) != false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        return "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        if (r3.equals("application/vnd.openxmlformats-officedocument.wordprocessingml.document") != false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        r0 = com.whatsapp.R.plurals.f9nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
        if (r3.equals(r0) == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        r0 = com.whatsapp.R.plurals.f9nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0047, code lost:
        r0 = X.C86604Kt.A0p(r2, r4, r0);
        X.C162457s7.A0D(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A03(X.C620733j r2, java.lang.String r3, int r4) {
        /*
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            java.lang.String r1 = ""
            if (r3 == 0) goto L_0x0011
            if (r4 == 0) goto L_0x0011
            int r0 = r3.hashCode()
            switch(r0) {
                case -1248334925: goto L_0x0015;
                case -1073633483: goto L_0x0012;
                case -1071817359: goto L_0x0018;
                case -1050893613: goto L_0x0030;
                case -366307023: goto L_0x0024;
                case 904647503: goto L_0x0027;
                case 1993842850: goto L_0x003c;
                default: goto L_0x0011;
            }
        L_0x0011:
            return r1
        L_0x0012:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.presentationml.presentation"
            goto L_0x001a
        L_0x0015:
            java.lang.String r0 = "application/pdf"
            goto L_0x0029
        L_0x0018:
            java.lang.String r0 = "application/vnd.ms-powerpoint"
        L_0x001a:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0011
            r0 = 2131755243(0x7f1000eb, float:1.914136E38)
            goto L_0x0047
        L_0x0024:
            java.lang.String r0 = "application/vnd.ms-excel"
            goto L_0x003e
        L_0x0027:
            java.lang.String r0 = "application/msword"
        L_0x0029:
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0038
            return r1
        L_0x0030:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.wordprocessingml.document"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0011
        L_0x0038:
            r0 = 2131755240(0x7f1000e8, float:1.9141354E38)
            goto L_0x0047
        L_0x003c:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
        L_0x003e:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0011
            r0 = 2131755242(0x7f1000ea, float:1.9141358E38)
        L_0x0047:
            java.lang.String r0 = X.C86604Kt.A0p(r2, r4, r0)
            X.C162457s7.A0D(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5b1.A03(X.33j, java.lang.String, int):java.lang.String");
    }

    public static final void A04(Context context, C111095hX r8, C55682qk r9, C69263Wi r10, C48042eF r11, AnonymousClass1nF r12, AnonymousClass4FS r13) {
        WeakReference A14 = AnonymousClass0x9.A14(context);
        r10.A0G(0, R.string.f11nameremoved);
        C124246Bn r2 = new C124246Bn(r10, A14, r8, r12, 1);
        AnonymousClass1I3 r1 = new AnonymousClass1I3(r9, r11, r12);
        r1.A04(r2, r10.A08);
        r13.BkM(r1);
    }

    public static final boolean A05(C56422rx r2, C95814uZ r3, int i) {
        C162457s7.A0J(r2, 0);
        if (i != 1 || r2.A03(AnonymousClass32Y.A03(r3))) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        X.AnonymousClass2A8.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ac, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A00(java.lang.String r7, java.util.zip.ZipFile r8) {
        /*
            java.lang.String r0 = "docProps/app.xml"
            java.util.zip.ZipEntry r2 = r8.getEntry(r0)
            r5 = 0
            if (r2 == 0) goto L_0x00b9
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            r0 = 60
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = "[^>]*>(.*)</"
            r1.append(r0)
            r1.append(r7)
            r0 = 62
            java.lang.String r1 = X.AnonymousClass001.A0j(r1, r0)
            r0 = 34
            java.util.regex.Pattern r7 = java.util.regex.Pattern.compile(r1, r0)
            java.io.InputStream r3 = r8.getInputStream(r2)
            X.C162457s7.A0H(r3)     // Catch:{ all -> 0x00ad }
            java.lang.String r0 = X.C58152un.A0B     // Catch:{ all -> 0x00ad }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ all -> 0x00ad }
            r6.<init>(r3, r0)     // Catch:{ all -> 0x00ad }
            java.io.StringWriter r4 = new java.io.StringWriter     // Catch:{ all -> 0x00a6 }
            r4.<init>()     // Catch:{ all -> 0x00a6 }
            r0 = 1000(0x3e8, float:1.401E-42)
            char[] r2 = new char[r0]     // Catch:{ all -> 0x00a6 }
        L_0x0040:
            int r1 = r6.read(r2)     // Catch:{ all -> 0x00a6 }
            r0 = -1
            if (r1 == r0) goto L_0x004b
            r4.write(r2, r5, r1)     // Catch:{ all -> 0x00a6 }
            goto L_0x0040
        L_0x004b:
            java.lang.String r0 = X.C18290x4.A0o(r4)     // Catch:{ all -> 0x00a6 }
            r6.close()     // Catch:{ all -> 0x00ad }
            java.util.regex.Matcher r1 = r7.matcher(r0)     // Catch:{ all -> 0x00ad }
            boolean r0 = r1.find()     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x00b4
            r0 = 1
            java.lang.String r7 = r1.group(r0)     // Catch:{ all -> 0x00ad }
            X.C626936e.A06(r7)     // Catch:{ all -> 0x00ad }
            X.C162457s7.A0D(r7)     // Catch:{ all -> 0x00ad }
            int r6 = r7.length()     // Catch:{ all -> 0x00ad }
            int r6 = r6 - r0
            r4 = 0
            r2 = 0
        L_0x006e:
            if (r4 > r6) goto L_0x0090
            r0 = r6
            if (r2 != 0) goto L_0x0074
            r0 = r4
        L_0x0074:
            char r1 = r7.charAt(r0)     // Catch:{ all -> 0x00ad }
            r0 = 32
            int r0 = X.C162457s7.A00(r1, r0)     // Catch:{ all -> 0x00ad }
            boolean r0 = X.AnonymousClass0x7.A1P(r0)
            if (r2 != 0) goto L_0x008b
            if (r0 != 0) goto L_0x0088
            r2 = 1
            goto L_0x006e
        L_0x0088:
            int r4 = r4 + 1
            goto L_0x006e
        L_0x008b:
            if (r0 == 0) goto L_0x0090
            int r6 = r6 + -1
            goto L_0x006e
        L_0x0090:
            int r0 = r6 + 1
            java.lang.CharSequence r0 = r7.subSequence(r4, r0)     // Catch:{ all -> 0x00ad }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00ad }
            int r5 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x009f }
            goto L_0x00b4
        L_0x009f:
            r1 = move-exception
            java.lang.String r0 = "documentutils/count "
            com.whatsapp.util.Log.i(r0, r1)     // Catch:{ all -> 0x00ad }
            goto L_0x00b4
        L_0x00a6:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a8 }
        L_0x00a8:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r6, r1)     // Catch:{ all -> 0x00ad }
            throw r0     // Catch:{ all -> 0x00ad }
        L_0x00ad:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00af }
        L_0x00af:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)
            throw r0
        L_0x00b4:
            if (r3 == 0) goto L_0x00b9
            r3.close()
        L_0x00b9:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5b1.A00(java.lang.String, java.util.zip.ZipFile):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x007c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x007d, code lost:
        if (r4 != null) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0087, code lost:
        throw r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002a A[Catch:{ all -> 0x0083, FileNotFoundException -> 0x000f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.Bitmap A01(java.lang.String r10, int r11, int r12, int r13, boolean r14) {
        /*
            java.lang.Object r9 = X.C107105ah.A05
            monitor-enter(r9)
            r7 = 0
            java.io.File r1 = X.AnonymousClass002.A0B(r10)     // Catch:{ FileNotFoundException -> 0x000f }
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r6 = android.os.ParcelFileDescriptor.open(r1, r0)     // Catch:{ FileNotFoundException -> 0x000f }
            goto L_0x0014
        L_0x000f:
            r0 = move-exception
            com.whatsapp.util.Log.w((java.lang.Throwable) r0)     // Catch:{ all -> 0x0090 }
            r6 = r7
        L_0x0014:
            if (r6 != 0) goto L_0x0018
            monitor-exit(r9)
            return r7
        L_0x0018:
            android.graphics.pdf.PdfRenderer r5 = new android.graphics.pdf.PdfRenderer     // Catch:{ IOException -> 0x0023, SecurityException -> 0x001e }
            r5.<init>(r6)     // Catch:{ IOException -> 0x0023, SecurityException -> 0x001e }
            goto L_0x0028
        L_0x001e:
            r0 = move-exception
            com.whatsapp.util.Log.w((java.lang.Throwable) r0)     // Catch:{ all -> 0x0090 }
            goto L_0x0027
        L_0x0023:
            r0 = move-exception
            com.whatsapp.util.Log.w((java.lang.Throwable) r0)     // Catch:{ all -> 0x0090 }
        L_0x0027:
            r5 = r7
        L_0x0028:
            if (r5 == 0) goto L_0x008b
            int r0 = r5.getPageCount()     // Catch:{ all -> 0x0090 }
            if (r0 <= 0) goto L_0x0088
            r0 = 0
            android.graphics.pdf.PdfRenderer$Page r4 = r5.openPage(r0)     // Catch:{ all -> 0x0090 }
            if (r11 <= 0) goto L_0x0039
            if (r12 > 0) goto L_0x0046
        L_0x0039:
            int r11 = r4.getWidth()     // Catch:{ all -> 0x007a }
            int r12 = r4.getHeight()     // Catch:{ all -> 0x007a }
            if (r11 <= r12) goto L_0x004b
            int r12 = r12 * r13
            int r12 = r12 / r11
            r11 = r13
        L_0x0046:
            android.graphics.Bitmap r8 = X.C86664Kz.A0Y(r11, r12)     // Catch:{ all -> 0x007a }
            goto L_0x004f
        L_0x004b:
            int r11 = r11 * r13
            int r11 = r11 / r12
            r12 = r13
            goto L_0x0046
        L_0x004f:
            if (r8 == 0) goto L_0x0073
            android.graphics.Canvas r1 = X.AnonymousClass4L0.A06(r8)     // Catch:{ all -> 0x007a }
            r0 = -1
            r1.drawColor(r0)     // Catch:{ all -> 0x007a }
            if (r14 == 0) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            r3 = r7
            goto L_0x006f
        L_0x005e:
            int r2 = r4.getWidth()     // Catch:{ all -> 0x007a }
            android.graphics.Matrix r3 = X.AnonymousClass002.A05()     // Catch:{ all -> 0x007a }
            float r1 = (float) r11     // Catch:{ all -> 0x007a }
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 * r0
            float r0 = (float) r2     // Catch:{ all -> 0x007a }
            float r1 = r1 / r0
            r3.setScale(r1, r1)     // Catch:{ all -> 0x007a }
        L_0x006f:
            r0 = 1
            r4.render(r8, r7, r3, r0)     // Catch:{ all -> 0x007a }
        L_0x0073:
            if (r4 == 0) goto L_0x0078
            r4.close()     // Catch:{ all -> 0x0090 }
        L_0x0078:
            r7 = r8
            goto L_0x0088
        L_0x007a:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x007c }
        L_0x007c:
            r1 = move-exception
            if (r4 == 0) goto L_0x0087
            r4.close()     // Catch:{ all -> 0x0083 }
            goto L_0x0087
        L_0x0083:
            r0 = move-exception
            X.C154507dH.A00(r2, r0)     // Catch:{ all -> 0x0090 }
        L_0x0087:
            throw r1     // Catch:{ all -> 0x0090 }
        L_0x0088:
            r5.close()     // Catch:{ all -> 0x0090 }
        L_0x008b:
            r6.close()     // Catch:{ IOException -> 0x008e }
        L_0x008e:
            monitor-exit(r9)
            return r7
        L_0x0090:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5b1.A01(java.lang.String, int, int, int, boolean):android.graphics.Bitmap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0051, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A02(android.net.Uri r7, X.C620633i r8) {
        /*
            java.lang.String r2 = "document-utils/get-document-title/unexpected exception"
            r0 = 0
            X.C162457s7.A0J(r8, r0)
            r0 = 1
            r4 = r7
            X.C162457s7.A0J(r7, r0)
            java.io.File r0 = X.C627536m.A04(r7)
            if (r0 == 0) goto L_0x0016
            java.lang.String r6 = r0.getName()
        L_0x0015:
            return r6
        L_0x0016:
            java.lang.String r1 = "_size"
            java.lang.String r0 = "_display_name"
            java.lang.String[] r5 = new java.lang.String[]{r0, r1}
            X.5UR r3 = r8.A0R()
            r6 = 0
            if (r3 != 0) goto L_0x002b
            java.lang.String r0 = "document-utils/get-document-title cr=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r6
        L_0x002b:
            r8 = r6
            r7 = r6
            android.database.Cursor r3 = r3.A03(r4, r5, r6, r7, r8)     // Catch:{ IllegalArgumentException -> 0x0066, UnsupportedOperationException -> 0x0061, SecurityException -> 0x005c, NullPointerException -> 0x0057, IllegalStateException -> 0x0052 }
            if (r3 == 0) goto L_0x0015
            int r1 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x004b }
            if (r1 < 0) goto L_0x0047
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x0047
            java.lang.String r0 = r3.getString(r1)     // Catch:{ all -> 0x004b }
            r3.close()     // Catch:{ IllegalArgumentException -> 0x0066, UnsupportedOperationException -> 0x0061, SecurityException -> 0x005c, NullPointerException -> 0x0057, IllegalStateException -> 0x0052 }
            return r0
        L_0x0047:
            r3.close()     // Catch:{ IllegalArgumentException -> 0x0066, UnsupportedOperationException -> 0x0061, SecurityException -> 0x005c, NullPointerException -> 0x0057, IllegalStateException -> 0x0052 }
            return r6
        L_0x004b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004d }
        L_0x004d:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ IllegalArgumentException -> 0x0066, UnsupportedOperationException -> 0x0061, SecurityException -> 0x005c, NullPointerException -> 0x0057, IllegalStateException -> 0x0052 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0066, UnsupportedOperationException -> 0x0061, SecurityException -> 0x005c, NullPointerException -> 0x0057, IllegalStateException -> 0x0052 }
        L_0x0052:
            r0 = move-exception
            com.whatsapp.util.Log.w(r2, r0)
            return r6
        L_0x0057:
            r0 = move-exception
            com.whatsapp.util.Log.w(r2, r0)
            return r6
        L_0x005c:
            r0 = move-exception
            com.whatsapp.util.Log.w(r2, r0)
            return r6
        L_0x0061:
            r0 = move-exception
            com.whatsapp.util.Log.w(r2, r0)
            return r6
        L_0x0066:
            r0 = move-exception
            com.whatsapp.util.Log.w(r2, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5b1.A02(android.net.Uri, X.33i):java.lang.String");
    }

    public static final boolean A06(String str) {
        if ("image/jpeg".equals(str) || "image/jpg".equals(str) || "image/gif".equals(str) || "image/png".equals(str) || "image/webp".equals(str)) {
            return true;
        }
        return false;
    }

    public static final byte[] A07(Bitmap bitmap) {
        byte[] byteArray;
        int i = 80;
        do {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
            byteArray = byteArrayOutputStream.toByteArray();
            C162457s7.A0D(byteArray);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("documentutils/docthumb ");
            int length = byteArray.length;
            A0o.append(length);
            A0o.append(' ');
            C18260x0.A1G(A0o, i);
            i -= 5;
            if (length <= 20480) {
                break;
            }
        } while (i > 0);
        return byteArray;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0077, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00cb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00cf, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A08(java.io.File r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.String r2 = "documentutils/getpagecount "
            r0 = 0
            X.C162457s7.A0J(r9, r0)
            java.lang.String r0 = "application/pdf"
            boolean r0 = r0.equals(r9)     // Catch:{ ZipException -> 0x013b, 6yo -> 0x0131, 6ym -> 0x012c, Exception -> 0x0126 }
            if (r0 == 0) goto L_0x0019
            X.35P r0 = new X.35P     // Catch:{ ZipException -> 0x013b, 6yo -> 0x0131, 6ym -> 0x012c, Exception -> 0x0126 }
            r0.<init>(r8)     // Catch:{ ZipException -> 0x013b, 6yo -> 0x0131, 6ym -> 0x012c, Exception -> 0x0126 }
            r0.A04()     // Catch:{ ZipException -> 0x013b, 6yo -> 0x0131, 6ym -> 0x012c, Exception -> 0x0126 }
            int r5 = r0.A00     // Catch:{ ZipException -> 0x013b, 6yo -> 0x0131, 6ym -> 0x012c, Exception -> 0x0126 }
            return r5
        L_0x0019:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.presentationml.presentation"
            boolean r0 = r0.equals(r9)     // Catch:{ ZipException -> 0x013b, 6yo -> 0x0131, 6ym -> 0x012c, Exception -> 0x0126 }
            if (r0 == 0) goto L_0x007c
            java.lang.String r3 = "documentutils/slidecount "
            java.lang.String r0 = r8.getAbsolutePath()     // Catch:{ IOException -> 0x0121 }
            java.util.zip.ZipFile r4 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x0121 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x0121 }
            java.lang.String r0 = "[Content_Types].xml"
            java.util.zip.ZipEntry r0 = r4.getEntry(r0)     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = "Slides"
            int r5 = A00(r0, r4)     // Catch:{ IOException -> 0x003d }
            if (r5 != 0) goto L_0x005e
            goto L_0x0042
        L_0x003d:
            r0 = move-exception
            com.whatsapp.util.Log.i(r3, r0)     // Catch:{ all -> 0x0075 }
            r5 = 0
        L_0x0042:
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = "ppt/slides/slide"
            r6.append(r0)     // Catch:{ all -> 0x0075 }
            int r1 = r5 + 1
            r6.append(r1)     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = ".xml"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r6)     // Catch:{ all -> 0x0075 }
            java.util.zip.ZipEntry r0 = r4.getEntry(r0)     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x005e
            r5 = r1
            goto L_0x0042
        L_0x005e:
            r4.close()     // Catch:{ IOException -> 0x0121 }
            return r5
        L_0x0062:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = "documentutils/no content types in "
            java.lang.String r0 = X.AnonymousClass0x7.A0p(r8, r0, r1)     // Catch:{ all -> 0x0075 }
            X.C18260x0.A1K(r1, r0)     // Catch:{ all -> 0x0075 }
            X.6ym r0 = new X.6ym     // Catch:{ all -> 0x0075 }
            r0.<init>()     // Catch:{ all -> 0x0075 }
            throw r0     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0077 }
        L_0x0077:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)     // Catch:{ IOException -> 0x0121 }
            throw r0     // Catch:{ IOException -> 0x0121 }
        L_0x007c:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
            boolean r0 = r0.equals(r9)     // Catch:{ ZipException -> 0x013b, 6yo -> 0x0131, 6ym -> 0x012c, Exception -> 0x0126 }
            if (r0 == 0) goto L_0x00d7
            java.lang.String r0 = r8.getAbsolutePath()     // Catch:{ IOException -> 0x00d0 }
            java.util.zip.ZipFile r4 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x00d0 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x00d0 }
            java.lang.String r0 = "[Content_Types].xml"
            java.util.zip.ZipEntry r0 = r4.getEntry(r0)     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x00b6
            r5 = 0
        L_0x0096:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = "xl/worksheets/sheet"
            r3.append(r0)     // Catch:{ all -> 0x00c9 }
            int r1 = r5 + 1
            r3.append(r1)     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = ".xml"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r3)     // Catch:{ all -> 0x00c9 }
            java.util.zip.ZipEntry r0 = r4.getEntry(r0)     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x00b2
            r5 = r1
            goto L_0x0096
        L_0x00b2:
            r4.close()     // Catch:{ IOException -> 0x00d0 }
            return r5
        L_0x00b6:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = "documentutils/no content types in "
            java.lang.String r0 = X.AnonymousClass0x7.A0p(r8, r0, r1)     // Catch:{ all -> 0x00c9 }
            X.C18260x0.A1K(r1, r0)     // Catch:{ all -> 0x00c9 }
            X.6ym r0 = new X.6ym     // Catch:{ all -> 0x00c9 }
            r0.<init>()     // Catch:{ all -> 0x00c9 }
            throw r0     // Catch:{ all -> 0x00c9 }
        L_0x00c9:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00cb }
        L_0x00cb:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)     // Catch:{ IOException -> 0x00d0 }
            throw r0     // Catch:{ IOException -> 0x00d0 }
        L_0x00d0:
            r1 = move-exception
            java.lang.String r0 = "documentutils/sheetcount "
            com.whatsapp.util.Log.i(r0, r1)     // Catch:{ ZipException -> 0x013b, 6yo -> 0x0131, 6ym -> 0x012c, Exception -> 0x0126 }
            throw r1     // Catch:{ ZipException -> 0x013b, 6yo -> 0x0131, 6ym -> 0x012c, Exception -> 0x0126 }
        L_0x00d7:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.wordprocessingml.document"
            boolean r0 = r0.equals(r9)     // Catch:{ ZipException -> 0x013b, 6yo -> 0x0131, 6ym -> 0x012c, Exception -> 0x0126 }
            if (r0 == 0) goto L_0x012a
            java.lang.String r4 = "documentutils/slidecount "
            java.lang.String r0 = r8.getAbsolutePath()     // Catch:{ IOException -> 0x011c }
            java.util.zip.ZipFile r3 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x011c }
            r3.<init>(r0)     // Catch:{ IOException -> 0x011c }
            java.lang.String r0 = "[Content_Types].xml"
            java.util.zip.ZipEntry r0 = r3.getEntry(r0)     // Catch:{ all -> 0x0115 }
            if (r0 == 0) goto L_0x0102
            java.lang.String r0 = "Pages"
            int r5 = A00(r0, r3)     // Catch:{ IOException -> 0x00f9 }
            goto L_0x00fe
        L_0x00f9:
            r0 = move-exception
            com.whatsapp.util.Log.i(r4, r0)     // Catch:{ all -> 0x0115 }
            r5 = 0
        L_0x00fe:
            r3.close()     // Catch:{ IOException -> 0x011c }
            return r5
        L_0x0102:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0115 }
            java.lang.String r0 = "documentutils/no content types in "
            java.lang.String r0 = X.AnonymousClass0x7.A0p(r8, r0, r1)     // Catch:{ all -> 0x0115 }
            X.C18260x0.A1K(r1, r0)     // Catch:{ all -> 0x0115 }
            X.6ym r0 = new X.6ym     // Catch:{ all -> 0x0115 }
            r0.<init>()     // Catch:{ all -> 0x0115 }
            throw r0     // Catch:{ all -> 0x0115 }
        L_0x0115:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0117 }
        L_0x0117:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ IOException -> 0x011c }
            throw r0     // Catch:{ IOException -> 0x011c }
        L_0x011c:
            r0 = move-exception
            com.whatsapp.util.Log.i(r4, r0)     // Catch:{ ZipException -> 0x013b, 6yo -> 0x0131, 6ym -> 0x012c, Exception -> 0x0126 }
            goto L_0x0125
        L_0x0121:
            r0 = move-exception
            com.whatsapp.util.Log.i(r3, r0)     // Catch:{ ZipException -> 0x013b, 6yo -> 0x0131, 6ym -> 0x012c, Exception -> 0x0126 }
        L_0x0125:
            throw r0     // Catch:{ ZipException -> 0x013b, 6yo -> 0x0131, 6ym -> 0x012c, Exception -> 0x0126 }
        L_0x0126:
            r0 = move-exception
            com.whatsapp.util.Log.i(r2, r0)
        L_0x012a:
            r5 = 0
            return r5
        L_0x012c:
            r0 = move-exception
            com.whatsapp.util.Log.i(r2, r0)
            throw r0
        L_0x0131:
            r0 = move-exception
            com.whatsapp.util.Log.i(r2, r0)
            X.6ym r0 = new X.6ym
            r0.<init>()
            throw r0
        L_0x013b:
            r0 = move-exception
            com.whatsapp.util.Log.i(r2, r0)
            X.6ym r0 = new X.6ym
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5b1.A08(java.io.File, java.lang.String):int");
    }
}
