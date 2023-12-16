package X;

import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.util.DocumentWarningDialogFragment;
import java.io.File;
import java.util.Set;

/* renamed from: X.5ah  reason: invalid class name and case insensitive filesystem */
public final class C107105ah {
    public static final AnonymousClass5ZC A03 = new AnonymousClass5ZC(1, 1);
    public static final AnonymousClass5b1 A04 = new AnonymousClass5b1();
    public static final Object A05 = AnonymousClass002.A0D();
    public static final Set A06 = C73833g9.A03("wmv", "aif", "cda", "mpa", "opus", "ogg", "wlp", "amr", "mp3", "m4a", "aac", "wav", "wma");
    public static final Set A07 = C73833g9.A03("7z", "arj", "deb", "pkg", "rar", "rpm", "gz", "z", "zip");
    public static final Set A08 = C73833g9.A03("pdf", "doc", "docx", "ppt", "pptx", "xls", "xlsx", "txt", "rtf", "tex", "csv", "wpd");
    public static final Set A09 = C73833g9.A03("apk", "bat", "bin", "cgi", "pl", "com", "exe", "gadget", "jar", "msi", "py", "wsf");
    public static final Set A0A = C73833g9.A03("ai", "ico", "jpeg", "jpg", "png", "ps", "psd", "svg", "tif", "tiff");
    public static final Set A0B = C73833g9.A03("vcf", "vcard");
    public static final Set A0C = C73833g9.A03("3g2", "3gp", "avi", "flv", "h264", "m4v", "mkv", "mov", "mp4", "mpg", "mpeg", "rm", "vob");
    public final C54292oU A00;
    public final AnonymousClass1VX A01;
    public final C107085af A02;

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0062, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long A00(X.C620633i r14, java.util.List r15) {
        /*
            r0 = 0
            X.C162457s7.A0J(r14, r0)
            int r4 = r15.size()
            r6 = 0
            r3 = 0
        L_0x000b:
            if (r3 >= r4) goto L_0x006c
            java.lang.Object r9 = r15.get(r3)
            android.net.Uri r9 = (android.net.Uri) r9
            java.lang.String r2 = "document-utils/get-document-size/unexpected exception"
            r0 = 1
            X.C162457s7.A0J(r9, r0)
            java.io.File r0 = X.C627536m.A04(r9)
            if (r0 == 0) goto L_0x0029
            long r0 = r0.length()
        L_0x0023:
            float r2 = (float) r0
            long r0 = (long) r2
            long r6 = r6 + r0
            int r3 = r3 + 1
            goto L_0x000b
        L_0x0029:
            java.lang.String r1 = "_display_name"
            java.lang.String r0 = "_size"
            java.lang.String[] r10 = new java.lang.String[]{r1, r0}
            X.5UR r8 = r14.A0R()
            if (r8 != 0) goto L_0x003f
            java.lang.String r0 = "document-utils/get-document-size cr=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x003c:
            r0 = 0
            goto L_0x0023
        L_0x003f:
            r11 = 0
            r13 = r11
            r12 = r11
            android.database.Cursor r5 = r8.A03(r9, r10, r11, r12, r13)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x0067 }
            if (r5 == 0) goto L_0x003c
            int r1 = r5.getColumnIndex(r0)     // Catch:{ all -> 0x0060 }
            if (r1 < 0) goto L_0x005c
            boolean r0 = r5.moveToFirst()     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x005c
            long r0 = r5.getLong(r1)     // Catch:{ all -> 0x0060 }
            r5.close()     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x0067 }
            goto L_0x0023
        L_0x005c:
            r5.close()     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x0067 }
            goto L_0x003c
        L_0x0060:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0062 }
        L_0x0062:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x0067 }
            throw r0     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x0067 }
        L_0x0067:
            r0 = move-exception
            com.whatsapp.util.Log.w(r2, r0)
            goto L_0x003c
        L_0x006c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107105ah.A00(X.33i, java.util.List):long");
    }

    public static final String A01(C620733j r2, AnonymousClass1nF r3) {
        C162457s7.A0J(r2, 0);
        return AnonymousClass5b1.A03(r2, r3.A05, r3.A00);
    }

    public static final void A02(C111095hX r12, C55682qk r13, C89654ea r14, C69263Wi r15, C48042eF r16, AnonymousClass1nF r17, C105025Tg r18, C187958y5 r19, AnonymousClass4FS r20) {
        DocumentWarningDialogFragment documentWarningDialogFragment;
        Bundle A082;
        C105025Tg r5 = r18;
        C162457s7.A0J(r5, 0);
        C55682qk r9 = r13;
        C69263Wi r10 = r15;
        C18270x1.A10(r15, 1, r13);
        C89654ea r7 = r14;
        C48042eF r11 = r16;
        AnonymousClass4FS r132 = r20;
        C18260x0.A0b(r132, r11, r14, 3);
        C111095hX r8 = r12;
        AnonymousClass1nF r122 = r17;
        C18260x0.A0W(r122, r8, r19);
        AnonymousClass33C A002 = C30471mV.A00(r122);
        File file = A002.A0F;
        if (file == null || !file.exists()) {
            r5.A01(r14);
            return;
        }
        if (!r122.A1J.A02 && "apk".equalsIgnoreCase(C627536m.A08(file.getAbsolutePath()))) {
            long j = r122.A1L;
            documentWarningDialogFragment = new DocumentWarningDialogFragment();
            A082 = AnonymousClass002.A08();
            A082.putLong("message_id", j);
            A082.putInt("warning_id", R.string.f11nameremoved);
        } else if (A002.A07 == 3) {
            long j2 = r122.A1L;
            documentWarningDialogFragment = new DocumentWarningDialogFragment();
            A082 = AnonymousClass002.A08();
            A082.putLong("message_id", j2);
            A082.putInt("warning_id", R.string.f11nameremoved);
        } else {
            AnonymousClass5b1.A04(r7, r8, r9, r10, r11, r122, r132);
            return;
        }
        A082.putBoolean("allowed_to_open", true);
        documentWarningDialogFragment.A0u(A082);
        C86644Kx.A1D(documentWarningDialogFragment, r14);
    }

    public final boolean A03(String str) {
        if (str == null) {
            return false;
        }
        if ("application/pdf".equals(str) || "application/vnd.openxmlformats-officedocument.presentationml.presentation".equals(str) || "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet".equals(str) || "application/vnd.openxmlformats-officedocument.wordprocessingml.document".equals(str)) {
            return true;
        }
        if (this.A01.A0X(1258)) {
            return AnonymousClass5b1.A06(str) || C989053r.A08(str);
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0122, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        X.AnonymousClass2A8.A00(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0126, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x012d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        X.AnonymousClass2A8.A00(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0131, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] A04(java.io.File r16, java.lang.String r17, float r18, int r19) {
        /*
            r15 = this;
            r1 = 0
            r4 = r16
            if (r16 == 0) goto L_0x013f
            r3 = r17
            boolean r0 = r15.A03(r3)
            if (r0 == 0) goto L_0x013f
            java.lang.String r0 = "application/pdf"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x0139 }
            r2 = 480(0x1e0, float:6.73E-43)
            if (r0 == 0) goto L_0x003a
            float r0 = (float) r2     // Catch:{ Exception -> 0x0139 }
            float r18 = r18 * r0
            int r5 = X.C1222663s.A01(r18)     // Catch:{ Exception -> 0x0139 }
            java.lang.String r3 = r4.getAbsolutePath()     // Catch:{ Exception -> 0x0139 }
            X.C162457s7.A0D(r3)     // Catch:{ Exception -> 0x0139 }
            r2 = 0
            boolean r0 = X.C107535bT.A08()     // Catch:{ Exception -> 0x0139 }
            if (r0 != 0) goto L_0x013f
            android.graphics.Bitmap r2 = X.AnonymousClass5b1.A01(r3, r2, r2, r5, r2)     // Catch:{ Exception -> 0x0139 }
            if (r2 == 0) goto L_0x013f
            byte[] r0 = X.AnonymousClass5b1.A07(r2)     // Catch:{ Exception -> 0x0139 }
            r2.recycle()     // Catch:{ Exception -> 0x0139 }
            return r0
        L_0x003a:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.presentationml.presentation"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x0139 }
            if (r0 != 0) goto L_0x00a6
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x0139 }
            if (r0 != 0) goto L_0x00a6
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.wordprocessingml.document"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x0139 }
            if (r0 != 0) goto L_0x00a6
            X.1VX r2 = r15.A01     // Catch:{ Exception -> 0x0139 }
            r0 = 6003(0x1773, float:8.412E-42)
            int r0 = r2.A0N(r0)     // Catch:{ Exception -> 0x0139 }
            float r0 = (float) r0     // Catch:{ Exception -> 0x0139 }
            float r18 = r18 * r0
            int r6 = X.C1222663s.A01(r18)     // Catch:{ Exception -> 0x0139 }
            boolean r0 = X.AnonymousClass5b1.A06(r3)     // Catch:{ Exception -> 0x0139 }
            r7 = r19
            if (r0 == 0) goto L_0x0074
            X.5af r2 = r15.A02     // Catch:{ Exception -> 0x0139 }
            android.net.Uri r0 = android.net.Uri.fromFile(r4)     // Catch:{ Exception -> 0x0139 }
            byte[] r1 = r2.A05(r0, r6, r6, r7)     // Catch:{ Exception -> 0x0139 }
            return r1
        L_0x0074:
            boolean r0 = X.C989053r.A08(r3)     // Catch:{ Exception -> 0x0139 }
            if (r0 == 0) goto L_0x013f
            r3 = 0
            X.C172218Kd.A04(r4)     // Catch:{ IOException -> 0x007f }
            goto L_0x0081
        L_0x007f:
            r0 = 0
            goto L_0x0082
        L_0x0081:
            r0 = 1
        L_0x0082:
            if (r0 == 0) goto L_0x008d
            android.graphics.Bitmap r3 = X.C172218Kd.A00(r4)     // Catch:{ IOException | IllegalArgumentException -> 0x0089, Exception -> 0x009b }
            goto L_0x00a1
        L_0x0089:
            r2 = move-exception
            java.lang.String r0 = "mediafileutils/createGifThumbnail/gif file not read "
            goto L_0x009e
        L_0x008d:
            r8 = 0
            r10 = 0
            X.8HO r5 = new X.8HO     // Catch:{ Exception -> 0x0139 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x0139 }
            r11 = r10
            android.graphics.Bitmap r3 = X.C107085af.A00(r5, r6, r7, r8, r10, r11)     // Catch:{ Exception -> 0x0139 }
            goto L_0x00a1
        L_0x009b:
            r2 = move-exception
            java.lang.String r0 = "mediafileutils/createGifThumbnail/unexpected gif exception "
        L_0x009e:
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ Exception -> 0x0139 }
        L_0x00a1:
            byte[] r1 = X.C107085af.A03(r3, r6)     // Catch:{ Exception -> 0x0139 }
            return r1
        L_0x00a6:
            float r0 = (float) r2     // Catch:{ Exception -> 0x0139 }
            float r18 = r18 * r0
            int r6 = X.C1222663s.A01(r18)     // Catch:{ Exception -> 0x0139 }
            r7 = 0
            java.lang.String r0 = r4.getAbsolutePath()     // Catch:{ IOException -> 0x0132 }
            java.util.zip.ZipFile r3 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x0132 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x0132 }
            java.lang.String r0 = "docProps/thumbnail.jpeg"
            java.util.zip.ZipEntry r0 = r3.getEntry(r0)     // Catch:{ all -> 0x012b }
            if (r0 == 0) goto L_0x0127
            java.io.InputStream r4 = r3.getInputStream(r0)     // Catch:{ all -> 0x012b }
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x0120 }
            r2.<init>()     // Catch:{ all -> 0x0120 }
            r0 = 1
            r2.inDither = r0     // Catch:{ all -> 0x0120 }
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r4, r1, r2)     // Catch:{ all -> 0x0120 }
            if (r8 == 0) goto L_0x011a
            int r0 = r8.getWidth()     // Catch:{ all -> 0x0120 }
            if (r0 == 0) goto L_0x011a
            int r0 = r8.getHeight()     // Catch:{ all -> 0x0120 }
            if (r0 == 0) goto L_0x011a
            int r5 = r8.getWidth()     // Catch:{ all -> 0x0120 }
            int r0 = r8.getHeight()     // Catch:{ all -> 0x0120 }
            if (r5 >= r0) goto L_0x00e8
            r5 = r0
        L_0x00e8:
            if (r5 <= r6) goto L_0x0113
            r0 = 1065353216(0x3f800000, float:1.0)
            float r2 = (float) r6     // Catch:{ all -> 0x0120 }
            float r2 = r2 * r0
            float r0 = (float) r5     // Catch:{ all -> 0x0120 }
            float r2 = r2 / r0
            android.graphics.Matrix r13 = X.AnonymousClass002.A05()     // Catch:{ all -> 0x0120 }
            r13.setScale(r2, r2)     // Catch:{ all -> 0x0120 }
            r9 = 0
            int r11 = r8.getWidth()     // Catch:{ all -> 0x0120 }
            int r12 = r8.getHeight()     // Catch:{ all -> 0x0120 }
            r14 = 1
            r10 = r9
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0120 }
            X.C162457s7.A0D(r2)     // Catch:{ all -> 0x0120 }
            boolean r0 = r2.equals(r8)     // Catch:{ all -> 0x0120 }
            if (r0 != 0) goto L_0x0113
            r8.recycle()     // Catch:{ all -> 0x0120 }
            r8 = r2
        L_0x0113:
            byte[] r7 = X.AnonymousClass5b1.A07(r8)     // Catch:{ all -> 0x0120 }
            r8.recycle()     // Catch:{ all -> 0x0120 }
        L_0x011a:
            if (r4 == 0) goto L_0x0127
            r4.close()     // Catch:{ all -> 0x012b }
            goto L_0x0127
        L_0x0120:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0122 }
        L_0x0122:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r2)     // Catch:{ all -> 0x012b }
            throw r0     // Catch:{ all -> 0x012b }
        L_0x0127:
            r3.close()     // Catch:{ IOException -> 0x0132 }
            return r7
        L_0x012b:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x012d }
        L_0x012d:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r2)     // Catch:{ IOException -> 0x0132 }
            throw r0     // Catch:{ IOException -> 0x0132 }
        L_0x0132:
            r2 = move-exception
            java.lang.String r0 = "documentutils/openxmlthumb "
            com.whatsapp.util.Log.i(r0, r2)     // Catch:{ Exception -> 0x0139 }
            return r7
        L_0x0139:
            r2 = move-exception
            java.lang.String r0 = "documentutils/getthumbnail "
            com.whatsapp.util.Log.i(r0, r2)
        L_0x013f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107105ah.A04(java.io.File, java.lang.String, float, int):byte[]");
    }

    public C107105ah(C54292oU r1, AnonymousClass1VX r2, C107085af r3) {
        C18260x0.A0V(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
