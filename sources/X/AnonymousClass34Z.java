package X;

import android.content.Context;
import com.facebook.soloader.SoLoader;
import com.facebook.superpack.AssetDecompressor;
import com.whatsapp.AbstractAppShellDelegate;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.34Z  reason: invalid class name */
public class AnonymousClass34Z {
    public static final Integer[] A08 = {0, 1};
    public String A00;
    public String A01;
    public boolean A02 = false;
    public final C63793Ax A03;
    public final AnonymousClass4FS A04;
    public final HashMap A05 = AnonymousClass001.A0t();
    public final Set A06 = AnonymousClass002.A0K();
    public final AtomicBoolean A07 = new AtomicBoolean(true);

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        if (r7.contains("libvlc.so") != false) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03(android.content.Context r10, java.lang.String r11, int r12, boolean r13, boolean r14) {
        /*
            r9 = this;
            r4 = r9
            boolean r0 = r9.A02
            X.C626936e.A0C(r0)
            r5 = r10
            java.io.File r0 = r10.getFilesDir()
            java.lang.String r1 = "decompressed"
            java.io.File r0 = X.AnonymousClass002.A0A(r0, r1)
            java.io.File r6 = X.AnonymousClass002.A0A(r0, r11)
            java.io.File r0 = r10.getFilesDir()
            java.io.File r1 = X.AnonymousClass002.A0A(r0, r1)
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x0030
            boolean r0 = r1.mkdir()
            if (r0 != 0) goto L_0x0030
            java.lang.String r0 = "Could not create decompressed assets directory"
            java.lang.RuntimeException r0 = X.AnonymousClass002.A0E(r0)
            throw r0
        L_0x0030:
            boolean r0 = r6.exists()
            if (r0 != 0) goto L_0x0039
            r6.mkdir()
        L_0x0039:
            if (r13 != 0) goto L_0x007f
            boolean r0 = r9.A02(r10, r11)
            if (r0 == 0) goto L_0x007f
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Decompressed assets up to date for archive "
            X.C18260x0.A0q(r0, r11, r1)
            X.C155137eL.A00(r10)
        L_0x0051:
            if (r12 != 0) goto L_0x0076
            java.lang.String r1 = A00(r9)
            java.lang.String r0 = "armeabi-v7a"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0070
            java.lang.String r0 = "libwhatsapp.so"
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L_0x0070
            java.lang.String r0 = "libvlc.so"
            boolean r0 = r7.contains(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0071
        L_0x0070:
            r1 = 1
        L_0x0071:
            java.lang.String r0 = "libvlc.so needs to be co-located in armv7 builds, to avoid setting off a bug on some older x86 devices"
            X.C626936e.A0F(r1, r0)
        L_0x0076:
            int r0 = r7.size()
            boolean r0 = X.AnonymousClass001.A1W(r0)
            return r0
        L_0x007f:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "compressed/"
            r1.append(r0)
            if (r12 == 0) goto L_0x00a5
            java.lang.String r0 = "strings"
        L_0x008d:
            r1.append(r0)
            java.lang.String r0 = "/"
            java.lang.String r2 = X.AnonymousClass000.A0V(r0, r11, r1)
            java.lang.String r0 = "."
            int r0 = r11.lastIndexOf(r0)
            int r0 = r0 + 1
            java.lang.String r3 = r11.substring(r0)
            if (r14 != 0) goto L_0x00b7
            goto L_0x00aa
        L_0x00a5:
            java.lang.String r0 = A00(r9)
            goto L_0x008d
        L_0x00aa:
            android.content.res.AssetManager r1 = r10.getAssets()     // Catch:{ AssetDecompressionException -> 0x00f7 }
            java.lang.String r0 = r6.getAbsolutePath()     // Catch:{ AssetDecompressionException -> 0x00f7 }
            java.lang.String[] r0 = com.facebook.superpack.AssetDecompressor.decompress(r1, r2, r3, r0)     // Catch:{ AssetDecompressionException -> 0x00f7 }
            goto L_0x00cc
        L_0x00b7:
            android.content.res.AssetManager r0 = r10.getAssets()
            java.io.InputStream r2 = r0.open(r2)
            java.lang.String r0 = r6.getAbsolutePath()     // Catch:{ AssetDecompressionException -> 0x00e5 }
            java.lang.String[] r0 = com.facebook.superpack.AssetDecompressor.decompress_legacy(r2, r3, r0)     // Catch:{ AssetDecompressionException -> 0x00e5 }
            if (r2 == 0) goto L_0x00cc
            r2.close()
        L_0x00cc:
            java.util.ArrayList r7 = X.AnonymousClass0x2.A0i(r0)
            X.4FS r0 = r9.A04     // Catch:{ all -> 0x00e3 }
            r8 = 16
            X.3ac r3 = new X.3ac     // Catch:{ all -> 0x00e3 }
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00e3 }
            r0.BkM(r3)     // Catch:{ all -> 0x00e3 }
            java.util.Set r0 = r9.A06
            r0.add(r11)
            goto L_0x0051
        L_0x00e3:
            r1 = move-exception
            throw r1
        L_0x00e5:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C18330xA.A09(r0)     // Catch:{ all -> 0x00eb }
            throw r0     // Catch:{ all -> 0x00eb }
        L_0x00eb:
            r1 = move-exception
            if (r2 == 0) goto L_0x00fc
            r2.close()     // Catch:{ all -> 0x00f2 }
            throw r1
        L_0x00f2:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x00f7:
            r0 = move-exception
            java.lang.RuntimeException r1 = X.C18330xA.A09(r0)
        L_0x00fc:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass34Z.A03(android.content.Context, java.lang.String, int, boolean, boolean):boolean");
    }

    public static String A00(AnonymousClass34Z r5) {
        String str = r5.A00;
        if (str != null) {
            return str;
        }
        String str2 = new String[]{"arm64-v8a", "armeabi-v7a", "x86", "x86_64"}[AssetDecompressor.get_architecture()];
        r5.A00 = str2;
        return str2;
    }

    public static boolean A01(Context context, String str) {
        String str2;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("lib");
        A0o.append(str);
        if (!C18300x5.A1V(AnonymousClass002.A0A(AnonymousClass002.A0A(context.getFilesDir(), "decompressed"), AbstractAppShellDelegate.COMPRESSED_LIBS_ARCHIVE_NAME), AnonymousClass000.A0X(".so", A0o))) {
            C18260x0.A0t("whatsappassetdecompressor/load-library-from-archive File missing: ", str, AnonymousClass001.A0o());
            return false;
        }
        try {
            boolean A062 = SoLoader.A06(str);
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("whatsappassetdecompressor/load-library-from-archive ");
            A0o2.append(str);
            if (A062) {
                str2 = " loaded";
            } else {
                str2 = " failed";
            }
            C18260x0.A1J(A0o2, str2);
            return A062;
        } catch (UnsatisfiedLinkError e) {
            C18260x0.A0v("whatsappassetdecompressor/load-library-from-archive error: ", str, AnonymousClass001.A0o(), e);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007e, code lost:
        if (r0 == false) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(android.content.Context r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.util.HashMap r4 = r6.A05
            java.lang.Object r0 = r4.get(r8)
            boolean r0 = r2.equals(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0019
            boolean r0 = r6.A02
            if (r0 != 0) goto L_0x001a
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r4.put(r8, r0)
            r1 = 0
        L_0x0019:
            return r1
        L_0x001a:
            java.util.Set r0 = r6.A06
            boolean r0 = r0.contains(r8)
            if (r0 == 0) goto L_0x0026
            r4.put(r8, r2)
            return r1
        L_0x0026:
            java.io.File r1 = r7.getFilesDir()     // Catch:{ IOException -> 0x006f }
            java.lang.String r0 = "decompressed"
            java.io.File r0 = X.AnonymousClass002.A0A(r1, r0)     // Catch:{ IOException -> 0x006f }
            java.io.File r1 = X.AnonymousClass002.A0A(r0, r8)     // Catch:{ IOException -> 0x006f }
            java.lang.String r0 = ".superpack_version"
            java.io.File r3 = X.AnonymousClass002.A0A(r1, r0)     // Catch:{ IOException -> 0x006f }
            long r1 = r3.length()     // Catch:{ IOException -> 0x006f }
            int r0 = (int) r1     // Catch:{ IOException -> 0x006f }
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x006f }
            r5.<init>(r0)     // Catch:{ IOException -> 0x006f }
            java.io.FileInputStream r3 = X.AnonymousClass0x9.A0g(r3)     // Catch:{ IOException -> 0x006f }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r0]     // Catch:{ all -> 0x0065 }
        L_0x004c:
            int r1 = r3.read(r2)     // Catch:{ all -> 0x0065 }
            r0 = -1
            if (r1 == r0) goto L_0x0058
            r0 = 0
            r5.write(r2, r0, r1)     // Catch:{ all -> 0x0065 }
            goto L_0x004c
        L_0x0058:
            r3.close()     // Catch:{ IOException -> 0x006f }
            byte[] r0 = r5.toByteArray()     // Catch:{ IOException -> 0x006f }
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x006f }
            r1.<init>(r0)     // Catch:{ IOException -> 0x006f }
            goto L_0x0071
        L_0x0065:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x006a }
            goto L_0x006e
        L_0x006a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x006f }
        L_0x006e:
            throw r1     // Catch:{ IOException -> 0x006f }
        L_0x006f:
            java.lang.String r1 = ""
        L_0x0071:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0080
            java.lang.String r0 = r6.A01
            boolean r0 = r1.equals(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0081
        L_0x0080:
            r1 = 0
        L_0x0081:
            X.AnonymousClass000.A1C(r8, r4, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass34Z.A02(android.content.Context, java.lang.String):boolean");
    }

    public AnonymousClass34Z(C63793Ax r3, AnonymousClass4FS r4) {
        this.A04 = r4;
        this.A03 = r3;
    }
}
