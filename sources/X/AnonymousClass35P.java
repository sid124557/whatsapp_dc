package X;

import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.35P  reason: invalid class name */
public class AnonymousClass35P {
    public static final byte[] A04 = "endobj".getBytes();
    public static final byte[] A05 = "%FDF-".getBytes();
    public static final byte[] A06 = " obj".getBytes();
    public static final byte[] A07 = "%PDF-".getBytes();
    public static final byte[] A08 = "stream".getBytes();
    public static final String[] A09 = {"/RichMedia", "/JS", "/JavaScript", "/AA", "/Launch", "/RichMediaInstance"};
    public int A00;
    public AnonymousClass7SY A01 = new AnonymousClass7SY();
    public File A02;
    public boolean A03;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        throw new X.C143396yo();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04() {
        /*
            r7 = this;
            r5 = 0
            r7.A00 = r5
            r7.A03 = r5
            java.io.File r0 = r7.A02
            java.io.BufferedInputStream r3 = X.AnonymousClass0x7.A0c(r0)
            X.7SY r6 = r7.A01     // Catch:{ all -> 0x004b }
            byte[] r4 = r6.A01     // Catch:{ all -> 0x004b }
            java.util.Arrays.fill(r4, r5)     // Catch:{ all -> 0x004b }
            r2 = 0
        L_0x0013:
            int r0 = r3.read()     // Catch:{ all -> 0x004b }
            if (r0 < 0) goto L_0x0045
            byte r1 = (byte) r0     // Catch:{ all -> 0x004b }
            int r0 = r6.A00     // Catch:{ all -> 0x004b }
            r4[r0] = r1     // Catch:{ all -> 0x004b }
            int r1 = r0 + 1
            r6.A00 = r1     // Catch:{ all -> 0x004b }
            int r0 = r4.length     // Catch:{ all -> 0x004b }
            int r1 = r1 % r0
            r6.A00 = r1     // Catch:{ all -> 0x004b }
            byte[] r0 = A07     // Catch:{ all -> 0x004b }
            boolean r0 = r6.A00(r0)     // Catch:{ all -> 0x004b }
            if (r0 != 0) goto L_0x003d
            byte[] r0 = A05     // Catch:{ all -> 0x004b }
            boolean r0 = r6.A00(r0)     // Catch:{ all -> 0x004b }
            if (r0 != 0) goto L_0x003d
            int r2 = r2 + 1
            r0 = 1024(0x400, float:1.435E-42)
            if (r2 >= r0) goto L_0x0045
            goto L_0x0013
        L_0x003d:
            r0 = 1
            r7.A05(r3, r5, r0)     // Catch:{ all -> 0x004b }
            r3.close()
            return
        L_0x0045:
            X.6yo r0 = new X.6yo     // Catch:{ all -> 0x004b }
            r0.<init>()     // Catch:{ all -> 0x004b }
            throw r0     // Catch:{ all -> 0x004b }
        L_0x004b:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0050 }
            throw r1
        L_0x0050:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass35P.A04():void");
    }

    public static void A00(InputStream inputStream, int i) {
        int read;
        if (i > 500) {
            throw new C143396yo();
        }
        do {
            read = inputStream.read();
        } while (A02(read));
        if (read != -1) {
            while (true) {
                if (read == 40) {
                    while (true) {
                        int read2 = inputStream.read();
                        if (read2 != 92) {
                            if (read2 == 41 || read2 == -1) {
                                break;
                            }
                        } else {
                            inputStream.read();
                        }
                    }
                } else if (read == 60) {
                    do {
                    } while (inputStream.read() != 62);
                } else if (read == 91) {
                    A00(inputStream, i + 1);
                } else if (read == 93 || read == -1) {
                    return;
                }
                read = inputStream.read();
            }
        }
    }

    public static boolean A01(int i) {
        if (i == 47 || i == 60 || i == 62 || i == 91 || i == 93 || i == 40 || i == 41 || i == -1) {
            return true;
        }
        return false;
    }

    public static boolean A02(int i) {
        if (i == 0 || i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0070, code lost:
        if (r5 == 47) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0072, code lost:
        r1.append((char) r5);
        r5 = r8.read();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007e, code lost:
        if (A01(r5) == false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0084, code lost:
        if (A02(r5) != false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0086, code lost:
        r4 = r1.toString().trim();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map A03(java.io.InputStream r8, int r9) {
        /*
            r7 = this;
            r0 = 500(0x1f4, float:7.0E-43)
            if (r9 > r0) goto L_0x00c5
            java.util.HashMap r2 = X.AnonymousClass001.A0t()
        L_0x0008:
            int r5 = r8.read()
            boolean r0 = A02(r5)
            if (r0 == 0) goto L_0x0013
            goto L_0x0008
        L_0x0013:
            boolean r0 = A02(r5)
            if (r0 == 0) goto L_0x0024
        L_0x0019:
            int r5 = r8.read()
            boolean r0 = A02(r5)
            if (r0 == 0) goto L_0x0024
            goto L_0x0019
        L_0x0024:
            r6 = -1
            if (r5 == r6) goto L_0x0031
            r1 = 62
            if (r5 != r1) goto L_0x0032
            int r0 = r8.read()
            if (r0 != r1) goto L_0x0032
        L_0x0031:
            return r2
        L_0x0032:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
        L_0x0036:
            char r0 = (char) r5
            r3.append(r0)
            int r5 = r8.read()
            boolean r0 = A01(r5)
            if (r0 != 0) goto L_0x004a
            boolean r0 = A02(r5)
            if (r0 == 0) goto L_0x0036
        L_0x004a:
            boolean r0 = A02(r5)
            if (r0 == 0) goto L_0x005b
        L_0x0050:
            int r5 = r8.read()
            boolean r0 = A02(r5)
            if (r0 == 0) goto L_0x005b
            goto L_0x0050
        L_0x005b:
            if (r5 == r6) goto L_0x0031
            r0 = 40
            r4 = 0
            if (r5 == r0) goto L_0x00a8
            r0 = 60
            if (r5 == r0) goto L_0x009b
            r0 = 91
            if (r5 == r0) goto L_0x00bb
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            r0 = 47
            if (r5 != r0) goto L_0x007a
        L_0x0072:
            char r0 = (char) r5
            r1.append(r0)
            int r5 = r8.read()
        L_0x007a:
            boolean r0 = A01(r5)
            if (r0 == 0) goto L_0x0072
            boolean r0 = A02(r5)
            if (r0 != 0) goto L_0x0072
            java.lang.String r0 = r1.toString()
            java.lang.String r4 = r0.trim()
        L_0x008e:
            java.lang.String r0 = r3.toString()
            java.lang.String r0 = r0.trim()
            r2.put(r0, r4)
            goto L_0x0013
        L_0x009b:
            int r5 = r8.read()
            if (r5 != r0) goto L_0x008e
            int r0 = r9 + 1
            java.util.Map r4 = r7.A03(r8, r0)
            goto L_0x00c0
        L_0x00a8:
            int r1 = r8.read()
            r0 = 92
            if (r1 != r0) goto L_0x00b4
            r8.read()
            goto L_0x00a8
        L_0x00b4:
            r0 = 41
            if (r1 == r0) goto L_0x00c0
            if (r1 != r6) goto L_0x00a8
            goto L_0x00c0
        L_0x00bb:
            int r0 = r9 + 1
            A00(r8, r0)
        L_0x00c0:
            int r5 = r8.read()
            goto L_0x008e
        L_0x00c5:
            X.6yo r0 = new X.6yo
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass35P.A03(java.io.InputStream, int):java.util.Map");
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x000a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(java.io.InputStream r10, int r11, boolean r12) {
        /*
            r9 = this;
            r0 = 500(0x1f4, float:7.0E-43)
            if (r11 <= r0) goto L_0x000a
            X.6yo r0 = new X.6yo
            r0.<init>()
            throw r0
        L_0x000a:
            int r0 = r10.read()
            r3 = -1
            if (r0 == r3) goto L_0x001b
            if (r12 == 0) goto L_0x001c
            byte[] r0 = A06
            boolean r0 = r9.A08(r10, r0)
            if (r0 != 0) goto L_0x001c
        L_0x001b:
            return
        L_0x001c:
            int r2 = r10.read()
            boolean r0 = A02(r2)
            if (r0 != 0) goto L_0x001c
            if (r2 != r3) goto L_0x0029
            return
        L_0x0029:
            if (r2 == r3) goto L_0x00b2
            r1 = 60
            if (r2 != r1) goto L_0x00ac
            int r0 = r10.read()
            if (r0 != r1) goto L_0x00ac
            int r0 = r11 + 1
            java.util.Map r5 = r9.A03(r10, r0)
        L_0x003b:
            r9.A07(r5)
            if (r2 == r3) goto L_0x001b
            java.lang.String r0 = "/Type"
            java.lang.Object r2 = r5.get(r0)
            java.lang.String r0 = "/Pages"
            boolean r0 = r0.equals(r2)
            java.lang.String r6 = "pdfparser/numberformat/"
            r7 = 82
            r3 = 1
            if (r0 == 0) goto L_0x0083
            java.lang.String r0 = "/Parent"
            boolean r0 = r5.containsKey(r0)
            if (r0 != 0) goto L_0x0083
            java.lang.String r0 = "/Count"
            java.lang.Object r0 = r5.get(r0)
            if (r0 == 0) goto L_0x0083
            java.lang.String r4 = r0.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x009c
            int r0 = r4.length()
            int r0 = r0 - r3
            char r0 = r4.charAt(r0)
            if (r0 != r7) goto L_0x009c
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "pdfparser/indirectpagecount/"
            X.C18260x0.A0s(r0, r4, r1)
        L_0x0083:
            java.lang.String r0 = "/Length"
            java.lang.String r8 = X.C18310x6.A0o(r0, r5)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r4 = 0
            if (r0 != 0) goto L_0x00c1
            int r0 = r8.length()
            int r0 = r0 - r3
            char r0 = r8.charAt(r0)
            if (r0 == r7) goto L_0x00c1
            goto L_0x00b4
        L_0x009c:
            int r0 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x00a3 }
            r9.A00 = r0     // Catch:{ NumberFormatException -> 0x00a3 }
            goto L_0x0083
        L_0x00a3:
            r1 = move-exception
            java.lang.String r0 = X.AnonymousClass000.A0T(r6, r4)
            com.whatsapp.util.Log.i(r0, r1)
            goto L_0x0083
        L_0x00ac:
            int r2 = r10.read()
            goto L_0x0029
        L_0x00b2:
            r5 = 0
            goto L_0x003b
        L_0x00b4:
            int r6 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x00b9 }
            goto L_0x00c2
        L_0x00b9:
            r1 = move-exception
            java.lang.String r0 = X.AnonymousClass000.A0T(r6, r8)
            com.whatsapp.util.Log.i(r0, r1)
        L_0x00c1:
            r6 = 0
        L_0x00c2:
            java.lang.String r0 = "/ObjStm"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0114
            byte[] r0 = A08
            r9.A08(r10, r0)
            int r1 = r10.read()
            r0 = 13
            if (r1 != r0) goto L_0x00da
            r10.read()
        L_0x00da:
            X.6uE r2 = new X.6uE
            r2.<init>(r10, r6)
            java.lang.String r0 = "/Filter"
            java.lang.Object r1 = r5.get(r0)
            java.lang.String r0 = "/FlateDecode"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0114
            java.util.zip.InflaterInputStream r0 = new java.util.zip.InflaterInputStream     // Catch:{ ZipException -> 0x010a, IOException -> 0x0121 }
            r0.<init>(r2)     // Catch:{ ZipException -> 0x010a, IOException -> 0x0121 }
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ ZipException -> 0x010a, IOException -> 0x0121 }
            r2.<init>(r0)     // Catch:{ ZipException -> 0x010a, IOException -> 0x0121 }
            int r0 = r11 + 1
            r9.A05(r2, r0, r4)     // Catch:{ all -> 0x0100 }
            r2.close()     // Catch:{ ZipException -> 0x010a, IOException -> 0x0121 }
            goto L_0x0118
        L_0x0100:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0105 }
            goto L_0x0109
        L_0x0105:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ ZipException -> 0x010a, IOException -> 0x0121 }
        L_0x0109:
            throw r1     // Catch:{ ZipException -> 0x010a, IOException -> 0x0121 }
        L_0x010a:
            r1 = move-exception
            java.lang.String r0 = "pdfparser/parseInput marking file as suspicious"
            com.whatsapp.util.Log.e(r0, r1)
            r9.A03 = r3
            goto L_0x0118
        L_0x0114:
            long r0 = (long) r6
            r10.skip(r0)
        L_0x0118:
            if (r12 == 0) goto L_0x000a
            byte[] r0 = A04
            r9.A08(r10, r0)
            goto L_0x000a
        L_0x0121:
            r1 = move-exception
            java.lang.String r0 = "pdfparser/parseInput "
            com.whatsapp.util.Log.e(r0, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass35P.A05(java.io.InputStream, int, boolean):void");
    }

    public final void A07(Map map) {
        if (map != null) {
            Iterator A0q = AnonymousClass000.A0q(map);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                A06(C18310x6.A0q(A0w));
                Object value = A0w.getValue();
                if (value instanceof String) {
                    A06((String) value);
                } else if (value instanceof Map) {
                    A07((Map) value);
                }
            }
        }
    }

    public final boolean A08(InputStream inputStream, byte[] bArr) {
        AnonymousClass7SY r3 = this.A01;
        byte[] bArr2 = r3.A01;
        Arrays.fill(bArr2, (byte) 0);
        do {
            int read = inputStream.read();
            if (read < 0) {
                return false;
            }
            byte b = (byte) read;
            int i = r3.A00;
            bArr2[i] = b;
            int i2 = i + 1;
            r3.A00 = i2;
            r3.A00 = i2 % bArr2.length;
        } while (!r3.A00(bArr));
        return true;
    }

    public AnonymousClass35P(File file) {
        this.A02 = file;
    }

    public final void A06(String str) {
        if (!TextUtils.isEmpty(str)) {
            int i = 0;
            if (str.charAt(0) == '/' && str.indexOf(35) >= 0) {
                StringBuilder A0o = AnonymousClass001.A0o();
                int length = str.length();
                while (i < length) {
                    char charAt = str.charAt(i);
                    if (charAt != '#' || i > length - 3) {
                        A0o.append(charAt);
                    } else {
                        try {
                            A0o.append((char) Integer.parseInt(str.substring(i + 1, i + 3), 16));
                            i += 2;
                        } catch (NumberFormatException unused) {
                            A0o.append(charAt);
                        }
                    }
                    i++;
                }
                str = A0o.toString();
            }
        }
        for (String equals : A09) {
            if (equals.equals(str)) {
                this.A03 = true;
                C18260x0.A0s("pdfparser/checkname pdf contains suspicious name ", str, AnonymousClass001.A0o());
            }
        }
    }
}
