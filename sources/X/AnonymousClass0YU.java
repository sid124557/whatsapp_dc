package X;

import android.content.res.AssetManager;
import android.system.OsConstants;
import android.util.Log;
import com.facebook.msys.mci.DefaultCrypto;
import java.io.Closeable;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* renamed from: X.0YU  reason: invalid class name */
public class AnonymousClass0YU {
    public static SimpleDateFormat A0J;
    public static SimpleDateFormat A0K;
    public static final Charset A0L;
    public static final HashMap A0M = AnonymousClass001.A0t();
    public static final HashSet A0N = new HashSet(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));
    public static final List A0O;
    public static final List A0P;
    public static final Pattern A0Q = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern A0R = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern A0S = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern A0T = Pattern.compile(".*[1-9].*");
    public static final boolean A0U = Log.isLoggable("ExifInterface", 3);
    public static final byte[] A0V = {65, 83, 67, 73, 73, 0, 0, 0};
    public static final byte[] A0W = {104, 101, 105, 99};
    public static final byte[] A0X = {109, 105, 102, 49};
    public static final byte[] A0Y = {102, 116, 121, 112};
    public static final byte[] A0Z;
    public static final byte[] A0a;
    public static final byte[] A0b = {-1, -40, -1};
    public static final byte[] A0c = {79, 76, 89, 77, 80, 0};
    public static final byte[] A0d = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] A0e = {101, 88, 73, 102};
    public static final byte[] A0f = {73, 69, 78, 68};
    public static final byte[] A0g = {73, 72, 68, 82};
    public static final byte[] A0h = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] A0i = "ANIM".getBytes(Charset.defaultCharset());
    public static final byte[] A0j = "ANMF".getBytes(Charset.defaultCharset());
    public static final byte[] A0k = {69, 88, 73, 70};
    public static final byte[] A0l = "VP8 ".getBytes(Charset.defaultCharset());
    public static final byte[] A0m = "VP8L".getBytes(Charset.defaultCharset());
    public static final byte[] A0n = "VP8X".getBytes(Charset.defaultCharset());
    public static final byte[] A0o = {82, 73, 70, 70};
    public static final byte[] A0p = {87, 69, 66, 80};
    public static final byte[] A0q = {-99, 1, 42};
    public static final int[] A0r = {8};
    public static final int[] A0s = {8, 8, 8};
    public static final int[] A0t = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final AnonymousClass0TF[] A0u;
    public static final AnonymousClass0TF[] A0v;
    public static final AnonymousClass0TF[] A0w;
    public static final AnonymousClass0TF[] A0x;
    public static final AnonymousClass0TF[] A0y;
    public static final AnonymousClass0TF[] A0z;
    public static final AnonymousClass0TF[] A10;
    public static final AnonymousClass0TF[] A11;
    public static final AnonymousClass0TF[] A12;
    public static final AnonymousClass0TF[] A13;
    public static final String[] A14 = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final HashMap[] A15 = new HashMap[10];
    public static final HashMap[] A16 = new HashMap[10];
    public static final AnonymousClass0TF[][] A17;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public AssetManager.AssetInputStream A08;
    public FileDescriptor A09;
    public String A0A;
    public ByteOrder A0B;
    public Set A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public byte[] A0H;
    public final HashMap[] A0I;

    public static AnonymousClass0XT A02(AnonymousClass0YU r3, int i) {
        return AnonymousClass0XT.A02(r3.A0B, new int[]{i});
    }

    public static String A05(byte[] bArr) {
        StringBuilder sb = new StringBuilder(r5 * 2);
        for (byte valueOf : bArr) {
            Object[] A0L2 = AnonymousClass002.A0L();
            A0L2[0] = Byte.valueOf(valueOf);
            sb.append(String.format("%02x", A0L2));
        }
        return sb.toString();
    }

    public static void A07(AnonymousClass0YU r5, Object obj, AbstractMap abstractMap) {
        abstractMap.put(obj, AnonymousClass0XT.A03(r5.A0B, new long[]{0}));
    }

    public static void A08(AnonymousClass0YU r6, String str) {
        if (r6.A0H(str) == null) {
            r6.A0I[0].put(str, AnonymousClass0XT.A03(r6.A0B, new long[]{0}));
        }
    }

    public final void A0K() {
        int i = 0;
        while (true) {
            HashMap[] hashMapArr = this.A0I;
            if (i < hashMapArr.length) {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("The size of tag group[");
                A0o2.append(i);
                A0o2.append("]: ");
                Log.d("ExifInterface", AnonymousClass000.A0h(A0o2, hashMapArr[i].size()));
                Iterator A0u2 = AnonymousClass001.A0u(hashMapArr[i]);
                while (A0u2.hasNext()) {
                    Map.Entry A0w2 = AnonymousClass001.A0w(A0u2);
                    AnonymousClass0XT r2 = (AnonymousClass0XT) A0w2.getValue();
                    StringBuilder A0o3 = AnonymousClass001.A0o();
                    A0o3.append("tagName: ");
                    A0o3.append((String) A0w2.getKey());
                    A0o3.append(", tagType: ");
                    AnonymousClass000.A1B(r2, A0o3);
                    A0o3.append(", tagValue: '");
                    A0o3.append(r2.A06(this.A0B));
                    Log.d("ExifInterface", AnonymousClass000.A0X("'", A0o3));
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void A0L() {
        A0M(0, 5);
        A0M(0, 4);
        A0M(5, 4);
        HashMap[] hashMapArr = this.A0I;
        Object obj = hashMapArr[1].get("PixelXDimension");
        Object obj2 = hashMapArr[1].get("PixelYDimension");
        if (!(obj == null || obj2 == null)) {
            hashMapArr[0].put("ImageWidth", obj);
            hashMapArr[0].put("ImageLength", obj2);
        }
        if (hashMapArr[4].isEmpty() && A0a(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = AnonymousClass001.A0t();
        }
        if (!A0a(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        A0N(0, "ThumbnailOrientation", "Orientation");
        A0N(0, "ThumbnailImageLength", "ImageLength");
        A0N(0, "ThumbnailImageWidth", "ImageWidth");
        A0N(5, "ThumbnailOrientation", "Orientation");
        A0N(5, "ThumbnailImageLength", "ImageLength");
        A0N(5, "ThumbnailImageWidth", "ImageWidth");
        A0N(4, "Orientation", "ThumbnailOrientation");
        A0N(4, "ImageLength", "ThumbnailImageLength");
        A0N(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final void A0R(AnonymousClass0FE r5, AnonymousClass0FB r6, byte[] bArr, byte[] bArr2) {
        String A0X2;
        while (true) {
            byte[] bArr3 = new byte[4];
            if (r5.read(bArr3) != 4) {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = A0L;
                A0o2.append(new String(bArr, charset));
                if (bArr2 == null) {
                    A0X2 = "";
                } else {
                    StringBuilder A0o3 = AnonymousClass001.A0o();
                    A0o3.append(" or ");
                    A0X2 = AnonymousClass000.A0X(new String(bArr2, charset), A0o3);
                }
                throw AnonymousClass002.A0C(AnonymousClass000.A0X(A0X2, A0o2));
            }
            int readInt = r5.readInt();
            r6.write(bArr3);
            r6.A00(readInt);
            if (readInt % 2 == 1) {
                readInt++;
            }
            A0C(r5, r6, readInt);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        r3 = A0h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x012d, code lost:
        if (r5 >= r3.length) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0133, code lost:
        if (r8[r5] != r3[r5]) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0136, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0139, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x013a, code lost:
        r0 = A0o;
        r7 = r0.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x013d, code lost:
        if (r3 < r7) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0143, code lost:
        if (r8[r3] == r0[r3]) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0145, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0148, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0149, code lost:
        r3 = A0p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x014c, code lost:
        if (r5 < r3.length) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0156, code lost:
        if (r8[(r7 + r5) + 4] == r3[r5]) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0158, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x015b, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x015d, code lost:
        r1 = 14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        r7 = "FUJIFILMCCD-RAW".getBytes(java.nio.charset.Charset.defaultCharset());
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0160, code lost:
        r1 = 13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0163, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0166, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0167, code lost:
        if (r7 == null) goto L_0x063d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x016e, code lost:
        r1 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r5 >= r7.length) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        if (r8[r5] == r7[r5]) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004f, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r5 = new X.AnonymousClass0FE(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r9 = (long) r5.readInt();
        r7 = new byte[4];
        r5.read(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        if (java.util.Arrays.equals(r7, A0Y) == false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006e, code lost:
        if (r9 != 1) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0070, code lost:
        r9 = r5.readLong();
        r11 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0078, code lost:
        if (r9 >= 16) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007b, code lost:
        r11 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007d, code lost:
        r0 = (long) 5000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:?, code lost:
        r0 = X.AnonymousClass002.A0C("Encountered corrupt WebP file.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0639, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x063a, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0646, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:?, code lost:
        r3 = A0U;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0080, code lost:
        if (r9 <= r0) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0649, code lost:
        if (r3 != false) goto L_0x064b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x064b, code lost:
        android.util.Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0652, code lost:
        A0J();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0655, code lost:
        if (r3 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x065b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x065c, code lost:
        A0J();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x0661, code lost:
        if (A0U != false) goto L_0x0663;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0663, code lost:
        A0K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0666, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0082, code lost:
        r9 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0083, code lost:
        r9 = r9 - r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0086, code lost:
        if (r9 < 8) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0088, code lost:
        r1 = new byte[4];
        r14 = 0;
        r13 = false;
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0094, code lost:
        if (r14 >= (r9 / 4)) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009a, code lost:
        if (r5.read(r1) != 4) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009e, code lost:
        if (r14 == 1) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a6, code lost:
        if (java.util.Arrays.equals(r1, A0X) == false) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a8, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b0, code lost:
        if (java.util.Arrays.equals(r1, A0W) == false) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b2, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b3, code lost:
        if (r13 == false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b5, code lost:
        if (r7 == false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b8, code lost:
        r14 = r14 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r5.close();
        r1 = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c2, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00c6, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c7, code lost:
        r7 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ca, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00cb, code lost:
        r7 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00cd, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d0, code lost:
        if (A0U != false) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00d2, code lost:
        android.util.Log.d("ExifInterface", "Exception parsing HEIF file type box.", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00d9, code lost:
        if (r7 != null) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00de, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        r5 = new X.AnonymousClass0FE(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r0 = A06(r5);
        r2.A0B = r0;
        r5.A01 = r0;
        r1 = r5.readShort();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00f8, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00fd, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0101, code lost:
        if (r3 != false) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0103, code lost:
        r1 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0105, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        r5 = new X.AnonymousClass0FE(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        r0 = A06(r5);
        r2.A0B = r0;
        r5.A01 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0119, code lost:
        if (r5.readShort() == 85) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x011b, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0120, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0124, code lost:
        if (r3 != false) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0126, code lost:
        r1 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0129, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x012f A[Catch:{ IOException | UnsupportedOperationException -> 0x0646 }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0163 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:69:0x00df] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0183 A[Catch:{ IOException | UnsupportedOperationException -> 0x0646 }] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0219 A[Catch:{ RuntimeException -> 0x02b2, all -> 0x02b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x024b A[Catch:{ RuntimeException -> 0x02b2, all -> 0x02b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x02a4 A[Catch:{ RuntimeException -> 0x02b2, all -> 0x02b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0341 A[Catch:{ IOException | UnsupportedOperationException -> 0x0646 }] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0401 A[Catch:{ IOException | UnsupportedOperationException -> 0x0646 }] */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0639 A[Catch:{ IOException | UnsupportedOperationException -> 0x0646 }, ExcHandler: all (th java.lang.Throwable), PHI: r5 
      PHI: (r5v12 X.0FE) = (r5v19 X.0FE), (r5v20 X.0FE) binds: [B:87:0x010b, B:71:0x00e4] A[DONT_GENERATE, DONT_INLINE], Splitter:B:71:0x00e4] */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x0646 A[ExcHandler: IOException | UnsupportedOperationException (r4v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:2:0x0004] */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x0160 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:368:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d2 A[Catch:{ all -> 0x0166 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00db A[SYNTHETIC, Splitter:B:66:0x00db] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x011b A[Catch:{ Exception -> 0x0120, all -> 0x0639 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0126  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:179:0x0291=Splitter:B:179:0x0291, B:250:0x0433=Splitter:B:250:0x0433, B:77:0x00f9=Splitter:B:77:0x00f9, B:124:0x0169=Splitter:B:124:0x0169, B:99:0x012a=Splitter:B:99:0x012a, B:91:0x011c=Splitter:B:91:0x011c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0W(java.io.InputStream r19) {
        /*
            r18 = this;
            r6 = 0
            r3 = 0
        L_0x0002:
            r2 = r18
            X.0TF[][] r0 = A17     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            int r0 = r0.length     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            if (r3 >= r0) goto L_0x0014
            java.util.HashMap[] r1 = r2.A0I     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            java.util.HashMap r0 = X.AnonymousClass001.A0t()     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r1[r3] = r0     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            int r3 = r3 + 1
            goto L_0x0002
        L_0x0014:
            r1 = 5000(0x1388, float:7.006E-42)
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r0 = r19
            r4.<init>(r0, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r4.mark(r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            byte[] r8 = new byte[r1]     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r4.read(r8)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r4.reset()     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r7 = 0
        L_0x0029:
            byte[] r5 = A0b     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            int r0 = r5.length     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            if (r7 >= r0) goto L_0x0171
            byte r3 = r8[r7]     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            byte r0 = r5[r7]     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            if (r3 == r0) goto L_0x004c
            java.lang.String r3 = "FUJIFILMCCD-RAW"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            byte[] r7 = r3.getBytes(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r5 = 0
        L_0x003f:
            int r0 = r7.length     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            if (r5 >= r0) goto L_0x016e
            byte r3 = r8[r5]     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            byte r0 = r7[r5]     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            if (r3 == r0) goto L_0x0049
            goto L_0x004f
        L_0x0049:
            int r5 = r5 + 1
            goto L_0x003f
        L_0x004c:
            int r7 = r7 + 1
            goto L_0x0029
        L_0x004f:
            r7 = 0
            X.0FE r5 = new X.0FE     // Catch:{ Exception -> 0x00cd }
            r5.<init>(r8)     // Catch:{ Exception -> 0x00cd }
            int r0 = r5.readInt()     // Catch:{ Exception -> 0x00ca, all -> 0x00c6 }
            long r9 = (long) r0     // Catch:{ Exception -> 0x00ca, all -> 0x00c6 }
            r3 = 4
            byte[] r7 = new byte[r3]     // Catch:{ Exception -> 0x00ca, all -> 0x00c6 }
            r5.read(r7)     // Catch:{ Exception -> 0x00ca, all -> 0x00c6 }
            byte[] r0 = A0Y     // Catch:{ Exception -> 0x00ca, all -> 0x00c6 }
            boolean r0 = java.util.Arrays.equals(r7, r0)     // Catch:{ Exception -> 0x00ca, all -> 0x00c6 }
            if (r0 == 0) goto L_0x00c2
            r13 = 8
            r16 = 1
            int r0 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x007b
            long r9 = r5.readLong()     // Catch:{ Exception -> 0x00ca, all -> 0x00c6 }
            r11 = 16
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x007d
            goto L_0x00c2
        L_0x007b:
            r11 = 8
        L_0x007d:
            long r0 = (long) r1     // Catch:{ Exception -> 0x00ca, all -> 0x00c6 }
            int r7 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x0083
            r9 = r0
        L_0x0083:
            long r9 = r9 - r11
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x00c2
            byte[] r1 = new byte[r3]     // Catch:{ Exception -> 0x00ca, all -> 0x00c6 }
            r14 = 0
            r13 = 0
            r7 = 0
        L_0x008e:
            r11 = 4
            long r11 = r9 / r11
            int r0 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c2
            int r0 = r5.read(r1)     // Catch:{ Exception -> 0x00ca, all -> 0x00c6 }
            if (r0 != r3) goto L_0x00c2
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x00b8
            byte[] r0 = A0X     // Catch:{ Exception -> 0x00ca, all -> 0x00c6 }
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ Exception -> 0x00ca, all -> 0x00c6 }
            if (r0 == 0) goto L_0x00aa
            r13 = 1
            goto L_0x00b5
        L_0x00aa:
            byte[] r0 = A0W     // Catch:{ Exception -> 0x00ca, all -> 0x00c6 }
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ Exception -> 0x00ca, all -> 0x00c6 }
            if (r0 == 0) goto L_0x00b3
            r7 = 1
        L_0x00b3:
            if (r13 == 0) goto L_0x00b8
        L_0x00b5:
            if (r7 == 0) goto L_0x00b8
            goto L_0x00bb
        L_0x00b8:
            long r14 = r14 + r16
            goto L_0x008e
        L_0x00bb:
            r5.close()     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r1 = 12
            goto L_0x0172
        L_0x00c2:
            r5.close()     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            goto L_0x00de
        L_0x00c6:
            r0 = move-exception
            r7 = r5
            goto L_0x0169
        L_0x00ca:
            r3 = move-exception
            r7 = r5
            goto L_0x00ce
        L_0x00cd:
            r3 = move-exception
        L_0x00ce:
            boolean r0 = A0U     // Catch:{ all -> 0x0166 }
            if (r0 == 0) goto L_0x00d9
            java.lang.String r1 = "ExifInterface"
            java.lang.String r0 = "Exception parsing HEIF file type box."
            android.util.Log.d(r1, r0, r3)     // Catch:{ all -> 0x0166 }
        L_0x00d9:
            if (r7 == 0) goto L_0x00de
            r7.close()     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
        L_0x00de:
            r3 = 0
            X.0FE r5 = new X.0FE     // Catch:{ Exception -> 0x0101, all -> 0x0163 }
            r5.<init>(r8)     // Catch:{ Exception -> 0x0101, all -> 0x0163 }
            java.nio.ByteOrder r0 = A06(r5)     // Catch:{ Exception -> 0x00fd, all -> 0x0639 }
            r2.A0B = r0     // Catch:{ Exception -> 0x00fd, all -> 0x0639 }
            r5.A01 = r0     // Catch:{ Exception -> 0x00fd, all -> 0x0639 }
            short r1 = r5.readShort()     // Catch:{ Exception -> 0x00fd, all -> 0x0639 }
            r0 = 20306(0x4f52, float:2.8455E-41)
            if (r1 == r0) goto L_0x00f8
            r0 = 21330(0x5352, float:2.989E-41)
            if (r1 != r0) goto L_0x00f9
        L_0x00f8:
            r3 = 1
        L_0x00f9:
            r5.close()     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            goto L_0x0101
        L_0x00fd:
            r5.close()     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            goto L_0x0105
        L_0x0101:
            if (r3 == 0) goto L_0x0105
            r1 = 7
            goto L_0x0172
        L_0x0105:
            r3 = 0
            X.0FE r5 = new X.0FE     // Catch:{ Exception -> 0x0124, all -> 0x0163 }
            r5.<init>(r8)     // Catch:{ Exception -> 0x0124, all -> 0x0163 }
            java.nio.ByteOrder r0 = A06(r5)     // Catch:{ Exception -> 0x0120, all -> 0x0639 }
            r2.A0B = r0     // Catch:{ Exception -> 0x0120, all -> 0x0639 }
            r5.A01 = r0     // Catch:{ Exception -> 0x0120, all -> 0x0639 }
            short r1 = r5.readShort()     // Catch:{ Exception -> 0x0120, all -> 0x0639 }
            r0 = 85
            if (r1 != r0) goto L_0x011c
            r3 = 1
        L_0x011c:
            r5.close()     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            goto L_0x0124
        L_0x0120:
            r5.close()     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            goto L_0x0129
        L_0x0124:
            if (r3 == 0) goto L_0x0129
            r1 = 10
            goto L_0x0172
        L_0x0129:
            r5 = 0
        L_0x012a:
            byte[] r3 = A0h     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            int r0 = r3.length     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            if (r5 >= r0) goto L_0x0160
            byte r1 = r8[r5]     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            byte r0 = r3[r5]     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            if (r1 == r0) goto L_0x0136
            goto L_0x0139
        L_0x0136:
            int r5 = r5 + 1
            goto L_0x012a
        L_0x0139:
            r3 = 0
        L_0x013a:
            byte[] r0 = A0o     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            int r7 = r0.length     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            if (r3 >= r7) goto L_0x0148
            byte r1 = r8[r3]     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            byte r0 = r0[r3]     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            if (r1 != r0) goto L_0x015b
            int r3 = r3 + 1
            goto L_0x013a
        L_0x0148:
            r5 = 0
        L_0x0149:
            byte[] r3 = A0p     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            int r0 = r3.length     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            if (r5 >= r0) goto L_0x015d
            int r0 = r7 + r5
            int r0 = r0 + 4
            byte r1 = r8[r0]     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            byte r0 = r3[r5]     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            if (r1 != r0) goto L_0x015b
            int r5 = r5 + 1
            goto L_0x0149
        L_0x015b:
            r1 = 0
            goto L_0x0172
        L_0x015d:
            r1 = 14
            goto L_0x0172
        L_0x0160:
            r1 = 13
            goto L_0x0172
        L_0x0163:
            r0 = move-exception
            goto L_0x063d
        L_0x0166:
            r0 = move-exception
            if (r7 == 0) goto L_0x063d
        L_0x0169:
            r7.close()     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            goto L_0x063d
        L_0x016e:
            r1 = 9
            goto L_0x0172
        L_0x0171:
            r1 = 4
        L_0x0172:
            r2.A00 = r1     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r0 = 4
            if (r1 == r0) goto L_0x0401
            r0 = 9
            if (r1 == r0) goto L_0x0401
            r0 = 13
            if (r1 == r0) goto L_0x0401
            r0 = 14
            if (r1 == r0) goto L_0x0401
            X.07f r5 = new X.07f     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r5.<init>((java.io.InputStream) r4)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            int r1 = r2.A00     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r0 = 12
            if (r1 != r0) goto L_0x02c7
            java.lang.String r7 = "yes"
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r0 = 28
            if (r1 < r0) goto L_0x02bf
            android.media.MediaMetadataRetriever r3 = new android.media.MediaMetadataRetriever     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r3.<init>()     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            X.01N r0 = new X.01N     // Catch:{ RuntimeException -> 0x02b2 }
            r0.<init>(r5, r2)     // Catch:{ RuntimeException -> 0x02b2 }
            X.AnonymousClass0IO.A00(r0, r3)     // Catch:{ RuntimeException -> 0x02b2 }
            r0 = 33
            java.lang.String r13 = r3.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x02b2 }
            r0 = 34
            java.lang.String r12 = r3.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x02b2 }
            r0 = 26
            java.lang.String r4 = r3.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x02b2 }
            r0 = 17
            java.lang.String r1 = r3.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x02b2 }
            boolean r0 = r7.equals(r4)     // Catch:{ RuntimeException -> 0x02b2 }
            if (r0 == 0) goto L_0x01d4
            r0 = 29
            java.lang.String r9 = r3.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x02b2 }
            r0 = 30
            java.lang.String r8 = r3.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x02b2 }
            r0 = 31
            java.lang.String r7 = r3.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x02b2 }
            goto L_0x01ec
        L_0x01d4:
            boolean r0 = r7.equals(r1)     // Catch:{ RuntimeException -> 0x02b2 }
            if (r0 == 0) goto L_0x0213
            r0 = 18
            java.lang.String r9 = r3.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x02b2 }
            r0 = 19
            java.lang.String r8 = r3.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x02b2 }
            r0 = 24
            java.lang.String r7 = r3.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x02b2 }
        L_0x01ec:
            if (r9 == 0) goto L_0x01ff
            java.util.HashMap[] r0 = r2.A0I     // Catch:{ RuntimeException -> 0x02b2 }
            r4 = r0[r6]     // Catch:{ RuntimeException -> 0x02b2 }
            java.lang.String r1 = "ImageWidth"
            int r0 = java.lang.Integer.parseInt(r9)     // Catch:{ RuntimeException -> 0x02b2 }
            X.0XT r0 = A02(r2, r0)     // Catch:{ RuntimeException -> 0x02b2 }
            r4.put(r1, r0)     // Catch:{ RuntimeException -> 0x02b2 }
        L_0x01ff:
            if (r8 == 0) goto L_0x0216
            java.util.HashMap[] r0 = r2.A0I     // Catch:{ RuntimeException -> 0x02b2 }
            r4 = r0[r6]     // Catch:{ RuntimeException -> 0x02b2 }
            java.lang.String r1 = "ImageLength"
            int r0 = java.lang.Integer.parseInt(r8)     // Catch:{ RuntimeException -> 0x02b2 }
            X.0XT r0 = A02(r2, r0)     // Catch:{ RuntimeException -> 0x02b2 }
            r4.put(r1, r0)     // Catch:{ RuntimeException -> 0x02b2 }
            goto L_0x0216
        L_0x0213:
            r9 = 0
            r8 = r9
            r7 = r9
        L_0x0216:
            r11 = 6
            if (r7 == 0) goto L_0x023d
            int r1 = java.lang.Integer.parseInt(r7)     // Catch:{ RuntimeException -> 0x02b2 }
            r0 = 90
            if (r1 == r0) goto L_0x022f
            r0 = 180(0xb4, float:2.52E-43)
            if (r1 == r0) goto L_0x022d
            r0 = 270(0x10e, float:3.78E-43)
            r10 = 8
            if (r1 == r0) goto L_0x0230
            r10 = 1
            goto L_0x0230
        L_0x022d:
            r10 = 3
            goto L_0x0230
        L_0x022f:
            r10 = 6
        L_0x0230:
            java.util.HashMap[] r0 = r2.A0I     // Catch:{ RuntimeException -> 0x02b2 }
            r4 = r0[r6]     // Catch:{ RuntimeException -> 0x02b2 }
            java.lang.String r1 = "Orientation"
            X.0XT r0 = A02(r2, r10)     // Catch:{ RuntimeException -> 0x02b2 }
            r4.put(r1, r0)     // Catch:{ RuntimeException -> 0x02b2 }
        L_0x023d:
            if (r13 == 0) goto L_0x026e
            if (r12 == 0) goto L_0x026e
            int r10 = java.lang.Integer.parseInt(r13)     // Catch:{ RuntimeException -> 0x02b2 }
            int r4 = java.lang.Integer.parseInt(r12)     // Catch:{ RuntimeException -> 0x02b2 }
            if (r4 <= r11) goto L_0x02a4
            long r0 = (long) r10     // Catch:{ RuntimeException -> 0x02b2 }
            r5.A01(r0)     // Catch:{ RuntimeException -> 0x02b2 }
            byte[] r1 = new byte[r11]     // Catch:{ RuntimeException -> 0x02b2 }
            int r0 = r5.read(r1)     // Catch:{ RuntimeException -> 0x02b2 }
            if (r0 != r11) goto L_0x029d
            int r10 = r10 + 6
            int r4 = r4 + -6
            byte[] r0 = A0Z     // Catch:{ RuntimeException -> 0x02b2 }
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ RuntimeException -> 0x02b2 }
            if (r0 == 0) goto L_0x0296
            byte[] r1 = new byte[r4]     // Catch:{ RuntimeException -> 0x02b2 }
            int r0 = r5.read(r1)     // Catch:{ RuntimeException -> 0x02b2 }
            if (r0 != r4) goto L_0x02ab
            A09(r2, r1, r10, r6)     // Catch:{ RuntimeException -> 0x02b2 }
        L_0x026e:
            boolean r0 = A0U     // Catch:{ RuntimeException -> 0x02b2 }
            if (r0 == 0) goto L_0x0291
            java.lang.String r4 = "ExifInterface"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ RuntimeException -> 0x02b2 }
            java.lang.String r0 = "Heif meta: "
            r1.append(r0)     // Catch:{ RuntimeException -> 0x02b2 }
            r1.append(r9)     // Catch:{ RuntimeException -> 0x02b2 }
            java.lang.String r0 = "x"
            r1.append(r0)     // Catch:{ RuntimeException -> 0x02b2 }
            r1.append(r8)     // Catch:{ RuntimeException -> 0x02b2 }
            java.lang.String r0 = ", rotation "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r7, r1)     // Catch:{ RuntimeException -> 0x02b2 }
            android.util.Log.d(r4, r0)     // Catch:{ RuntimeException -> 0x02b2 }
        L_0x0291:
            r3.release()     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            goto L_0x03f6
        L_0x0296:
            java.lang.String r0 = "Invalid identifier"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ RuntimeException -> 0x02b2 }
            goto L_0x02b1
        L_0x029d:
            java.lang.String r0 = "Can't read identifier"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ RuntimeException -> 0x02b2 }
            goto L_0x02b1
        L_0x02a4:
            java.lang.String r0 = "Invalid exif length"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ RuntimeException -> 0x02b2 }
            goto L_0x02b1
        L_0x02ab:
            java.lang.String r0 = "Can't read exif"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ RuntimeException -> 0x02b2 }
        L_0x02b1:
            throw r0     // Catch:{ RuntimeException -> 0x02b2 }
        L_0x02b2:
            java.lang.String r0 = "Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported."
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass002.A0G(r0)     // Catch:{ all -> 0x02b9 }
            throw r0     // Catch:{ all -> 0x02b9 }
        L_0x02b9:
            r0 = move-exception
            r3.release()     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            goto L_0x063d
        L_0x02bf:
            java.lang.String r0 = "Reading EXIF from HEIF files is supported from SDK 28 and above"
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass002.A0G(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            goto L_0x063d
        L_0x02c7:
            r3 = 7
            if (r1 != r3) goto L_0x0381
            r2.A0T(r5)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            java.util.HashMap[] r7 = r2.A0I     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r8 = 1
            r1 = r7[r8]     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            java.lang.String r0 = "MakerNote"
            X.0XT r0 = A03(r0, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            if (r0 == 0) goto L_0x03f6
            byte[] r0 = r0.A03     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            X.07f r4 = new X.07f     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r4.<init>((byte[]) r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            java.nio.ByteOrder r0 = r2.A0B     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r4.A01 = r0     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            byte[] r11 = A0c     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            int r0 = r11.length     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            byte[] r10 = new byte[r0]     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r4.readFully(r10)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r0 = 0
            r4.A01(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            byte[] r9 = A0d     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            int r0 = r9.length     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            byte[] r1 = new byte[r0]     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r4.readFully(r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            boolean r0 = java.util.Arrays.equals(r10, r11)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            if (r0 == 0) goto L_0x0303
            r0 = 8
            goto L_0x030b
        L_0x0303:
            boolean r0 = java.util.Arrays.equals(r1, r9)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            if (r0 == 0) goto L_0x030e
            r0 = 12
        L_0x030b:
            r4.A01(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
        L_0x030e:
            r0 = 6
            r2.A0U(r4, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r1 = r7[r3]     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            java.lang.String r0 = "PreviewImageStart"
            java.lang.Object r9 = r1.get(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r1 = r7[r3]     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            java.lang.String r0 = "PreviewImageLength"
            java.lang.Object r4 = r1.get(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            if (r9 == 0) goto L_0x0335
            if (r4 == 0) goto L_0x0335
            r3 = 5
            r1 = r7[r3]     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            java.lang.String r0 = "JPEGInterchangeFormat"
            r1.put(r0, r9)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r1 = r7[r3]     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            java.lang.String r0 = "JPEGInterchangeFormatLength"
            r1.put(r0, r4)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
        L_0x0335:
            r0 = 8
            r1 = r7[r0]     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            java.lang.String r0 = "AspectFrame"
            X.0XT r1 = A03(r0, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            if (r1 == 0) goto L_0x03f6
            java.nio.ByteOrder r0 = r2.A0B     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            java.lang.Object r9 = r1.A05(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            int[] r9 = (int[]) r9     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            if (r9 == 0) goto L_0x036a
            int r1 = r9.length     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r0 = 4
            if (r1 != r0) goto L_0x036a
            r0 = 2
            r4 = r9[r0]     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r3 = r9[r6]     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            if (r4 <= r3) goto L_0x03f6
            r0 = 3
            r1 = r9[r0]     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r0 = r9[r8]     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            if (r1 <= r0) goto L_0x03f6
            int r4 = r4 - r3
            int r4 = r4 + 1
            int r1 = r1 - r0
            int r3 = r1 + 1
            if (r4 >= r3) goto L_0x03d4
            int r4 = r4 + r3
            int r3 = r4 - r3
            int r4 = r4 - r3
            goto L_0x03d4
        L_0x036a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            java.lang.String r0 = "Invalid aspect frame values. frame="
            r1.append(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            java.lang.String r0 = java.util.Arrays.toString(r9)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            java.lang.String r0 = "ExifInterface"
            android.util.Log.w(r0, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            goto L_0x03f6
        L_0x0381:
            r0 = 10
            if (r1 != r0) goto L_0x03d0
            boolean r0 = A0U     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            if (r0 == 0) goto L_0x0398
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            java.lang.String r0 = "getRw2Attributes starting with: "
            java.lang.String r1 = X.AnonymousClass000.A0P(r5, r0, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            java.lang.String r0 = "ExifInterface"
            android.util.Log.d(r0, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
        L_0x0398:
            r2.A0T(r5)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            java.util.HashMap[] r8 = r2.A0I     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r1 = r8[r6]     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            java.lang.String r0 = "JpgFromRaw"
            X.0XT r1 = A03(r0, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            if (r1 == 0) goto L_0x03b5
            byte[] r0 = r1.A03     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            X.0FE r7 = new X.0FE     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r7.<init>(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            long r3 = r1.A02     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            int r1 = (int) r3     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r0 = 5
            r2.A0Q(r7, r1, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
        L_0x03b5:
            r1 = r8[r6]     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            java.lang.String r0 = "ISO"
            java.lang.Object r4 = r1.get(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r3 = 1
            r0 = r8[r3]     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            java.lang.String r1 = "PhotographicSensitivity"
            java.lang.Object r0 = r0.get(r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            if (r4 == 0) goto L_0x03f6
            if (r0 != 0) goto L_0x03f6
            r0 = r8[r3]     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r0.put(r1, r4)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            goto L_0x03f6
        L_0x03d0:
            r2.A0T(r5)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            goto L_0x03f6
        L_0x03d4:
            java.nio.ByteOrder r1 = r2.A0B     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            int[] r0 = new int[r8]     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r0[r6] = r4     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            X.0XT r4 = X.AnonymousClass0XT.A02(r1, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            java.nio.ByteOrder r1 = r2.A0B     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            int[] r0 = new int[r8]     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r0[r6] = r3     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            X.0XT r3 = X.AnonymousClass0XT.A02(r1, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r1 = r7[r6]     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            java.lang.String r0 = "ImageWidth"
            r1.put(r0, r4)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r1 = r7[r6]     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            java.lang.String r0 = "ImageLength"
            r1.put(r0, r3)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
        L_0x03f6:
            int r0 = r2.A01     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            long r0 = (long) r0     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r5.A01(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r2.A0P(r5)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            goto L_0x063e
        L_0x0401:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            X.0FE r7 = new X.0FE     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r7.<init>(r4, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            int r1 = r2.A00     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r0 = 4
            if (r1 != r0) goto L_0x0412
            r2.A0Q(r7, r6, r6)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            goto L_0x063e
        L_0x0412:
            r0 = 13
            if (r1 != r0) goto L_0x04e0
            boolean r0 = A0U     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            if (r0 == 0) goto L_0x0429
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            java.lang.String r0 = "getPngAttributes starting with: "
            java.lang.String r1 = X.AnonymousClass000.A0P(r7, r0, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            java.lang.String r0 = "ExifInterface"
            android.util.Log.d(r0, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
        L_0x0429:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r7.A01 = r0     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            byte[] r0 = A0h     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            int r9 = r0.length     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r7.A00(r9)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
        L_0x0433:
            int r1 = r7.readInt()     // Catch:{ EOFException -> 0x04d8, IOException | UnsupportedOperationException -> 0x0646 }
            r5 = 4
            int r4 = r9 + 4
            byte[] r3 = new byte[r5]     // Catch:{ EOFException -> 0x04d8, IOException | UnsupportedOperationException -> 0x0646 }
            int r0 = r7.read(r3)     // Catch:{ EOFException -> 0x04d8, IOException | UnsupportedOperationException -> 0x0646 }
            if (r0 != r5) goto L_0x04d1
            int r9 = r4 + 4
            r0 = 16
            if (r9 != r0) goto L_0x0458
            byte[] r0 = A0g     // Catch:{ EOFException -> 0x04d8, IOException | UnsupportedOperationException -> 0x0646 }
            boolean r0 = java.util.Arrays.equals(r3, r0)     // Catch:{ EOFException -> 0x04d8, IOException | UnsupportedOperationException -> 0x0646 }
            if (r0 != 0) goto L_0x0458
            java.lang.String r0 = "Encountered invalid PNG file--IHDR chunk should appearas the first chunk"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ EOFException -> 0x04d8, IOException | UnsupportedOperationException -> 0x0646 }
            goto L_0x04d7
        L_0x0458:
            byte[] r0 = A0f     // Catch:{ EOFException -> 0x04d8, IOException | UnsupportedOperationException -> 0x0646 }
            boolean r0 = java.util.Arrays.equals(r3, r0)     // Catch:{ EOFException -> 0x04d8, IOException | UnsupportedOperationException -> 0x0646 }
            if (r0 != 0) goto L_0x063e
            byte[] r0 = A0e     // Catch:{ EOFException -> 0x04d8, IOException | UnsupportedOperationException -> 0x0646 }
            boolean r0 = java.util.Arrays.equals(r3, r0)     // Catch:{ EOFException -> 0x04d8, IOException | UnsupportedOperationException -> 0x0646 }
            if (r0 == 0) goto L_0x0496
            byte[] r8 = new byte[r1]     // Catch:{ EOFException -> 0x04d8, IOException | UnsupportedOperationException -> 0x0646 }
            int r0 = r7.read(r8)     // Catch:{ EOFException -> 0x04d8, IOException | UnsupportedOperationException -> 0x0646 }
            if (r0 != r1) goto L_0x04bb
            int r5 = r7.readInt()     // Catch:{ EOFException -> 0x04d8, IOException | UnsupportedOperationException -> 0x0646 }
            java.util.zip.CRC32 r1 = new java.util.zip.CRC32     // Catch:{ EOFException -> 0x04d8, IOException | UnsupportedOperationException -> 0x0646 }
            r1.<init>()     // Catch:{ EOFException -> 0x04d8, IOException | UnsupportedOperationException -> 0x0646 }
            r1.update(r3)     // Catch:{ EOFException -> 0x04d8, IOException | UnsupportedOperationException -> 0x0646 }
            r1.update(r8)     // Catch:{ EOFException -> 0x04d8, IOException | UnsupportedOperationException -> 0x0646 }
            long r3 = r1.getValue()     // Catch:{ EOFException -> 0x04d8, IOException | UnsupportedOperationException -> 0x0646 }
            int r0 = (int) r3     // Catch:{ EOFException -> 0x04d8, IOException | UnsupportedOperationException -> 0x0646 }
            if (r0 != r5) goto L_0x049d
            A09(r2, r8, r9, r6)     // Catch:{ EOFException -> 0x04d8, IOException | UnsupportedOperationException -> 0x0646 }
            r2.A0L()     // Catch:{ EOFException -> 0x04d8, IOException | UnsupportedOperationException -> 0x0646 }
            X.0FE r0 = new X.0FE     // Catch:{ EOFException -> 0x04d8, IOException | UnsupportedOperationException -> 0x0646 }
            r0.<init>(r8)     // Catch:{ EOFException -> 0x04d8, IOException | UnsupportedOperationException -> 0x0646 }
            r2.A0P(r0)     // Catch:{ EOFException -> 0x04d8, IOException | UnsupportedOperationException -> 0x0646 }
            goto L_0x063e
        L_0x0496:
            int r0 = r1 + 4
            r7.A00(r0)     // Catch:{ EOFException -> 0x04d8, IOException | UnsupportedOperationException -> 0x0646 }
            int r9 = r9 + r0
            goto L_0x0433
        L_0x049d:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ EOFException -> 0x04d8, IOException | UnsupportedOperationException -> 0x0646 }
            java.lang.String r0 = "Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: "
            r3.append(r0)     // Catch:{ EOFException -> 0x04d8, IOException | UnsupportedOperationException -> 0x0646 }
            r3.append(r5)     // Catch:{ EOFException -> 0x04d8, IOException | UnsupportedOperationException -> 0x0646 }
            java.lang.String r0 = ", calculated CRC value: "
            r3.append(r0)     // Catch:{ EOFException -> 0x04d8, IOException | UnsupportedOperationException -> 0x0646 }
            long r0 = r1.getValue()     // Catch:{ EOFException -> 0x04d8, IOException | UnsupportedOperationException -> 0x0646 }
            java.lang.String r0 = X.AnonymousClass001.A0k(r3, r0)     // Catch:{ EOFException -> 0x04d8, IOException | UnsupportedOperationException -> 0x0646 }
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ EOFException -> 0x04d8, IOException | UnsupportedOperationException -> 0x0646 }
            goto L_0x04d7
        L_0x04bb:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ EOFException -> 0x04d8, IOException | UnsupportedOperationException -> 0x0646 }
            java.lang.String r0 = "Failed to read given length for given PNG chunk type: "
            r1.append(r0)     // Catch:{ EOFException -> 0x04d8, IOException | UnsupportedOperationException -> 0x0646 }
            java.lang.String r0 = A05(r3)     // Catch:{ EOFException -> 0x04d8, IOException | UnsupportedOperationException -> 0x0646 }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ EOFException -> 0x04d8, IOException | UnsupportedOperationException -> 0x0646 }
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ EOFException -> 0x04d8, IOException | UnsupportedOperationException -> 0x0646 }
            goto L_0x04d7
        L_0x04d1:
            java.lang.String r0 = "Encountered invalid length while parsing PNG chunktype"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ EOFException -> 0x04d8, IOException | UnsupportedOperationException -> 0x0646 }
        L_0x04d7:
            throw r0     // Catch:{ EOFException -> 0x04d8, IOException | UnsupportedOperationException -> 0x0646 }
        L_0x04d8:
            java.lang.String r0 = "Encountered corrupt PNG file."
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            goto L_0x063d
        L_0x04e0:
            r0 = 9
            if (r1 != r0) goto L_0x05a1
            boolean r10 = A0U     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            java.lang.String r8 = "ExifInterface"
            if (r10 == 0) goto L_0x04f3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            java.lang.String r0 = "getRafAttributes starting with: "
            X.AnonymousClass000.A19(r7, r0, r8, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
        L_0x04f3:
            r0 = 84
            r7.A00(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r3 = 4
            byte[] r0 = new byte[r3]     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            byte[] r1 = new byte[r3]     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            byte[] r3 = new byte[r3]     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r7.read(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r7.read(r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r7.read(r3)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            int r5 = r0.getInt()     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            int r1 = r0.getInt()     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r3)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            int r4 = r0.getInt()     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            byte[] r3 = new byte[r1]     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            int r0 = r7.A00     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            int r0 = r5 - r0
            r7.A00(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r7.read(r3)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            X.0FE r1 = new X.0FE     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r1.<init>(r3)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r0 = 5
            r2.A0Q(r1, r5, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            int r0 = r7.A00     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            int r4 = r4 - r0
            r7.A00(r4)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r7.A01 = r0     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            int r5 = r7.readInt()     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            if (r10 == 0) goto L_0x0552
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            java.lang.String r0 = "numberOfDirectoryEntry: "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r5)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            android.util.Log.d(r8, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
        L_0x0552:
            r4 = 0
        L_0x0553:
            if (r4 >= r5) goto L_0x063e
            int r3 = r7.readUnsignedShort()     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            int r1 = r7.readUnsignedShort()     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r0 = 273(0x111, float:3.83E-43)
            if (r3 != r0) goto L_0x0582
            short r9 = r7.readShort()     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            short r7 = r7.readShort()     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            X.0XT r5 = A02(r2, r9)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            X.0XT r4 = A02(r2, r7)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            java.util.HashMap[] r3 = r2.A0I     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r1 = r3[r6]     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            java.lang.String r0 = "ImageLength"
            r1.put(r0, r5)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r1 = r3[r6]     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            java.lang.String r0 = "ImageWidth"
            r1.put(r0, r4)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            goto L_0x0588
        L_0x0582:
            r7.A00(r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            int r4 = r4 + 1
            goto L_0x0553
        L_0x0588:
            if (r10 == 0) goto L_0x063e
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            java.lang.String r0 = "Updated to length: "
            r1.append(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r1.append(r9)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            java.lang.String r0 = ", width: "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r7)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            android.util.Log.d(r8, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            goto L_0x063e
        L_0x05a1:
            r0 = 14
            if (r1 != r0) goto L_0x063e
            boolean r0 = A0U     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            if (r0 == 0) goto L_0x05b8
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            java.lang.String r0 = "getWebpAttributes starting with: "
            java.lang.String r1 = X.AnonymousClass000.A0P(r7, r0, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            java.lang.String r0 = "ExifInterface"
            android.util.Log.d(r0, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
        L_0x05b8:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r7.A01 = r0     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            byte[] r0 = A0o     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            int r0 = r0.length     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r7.A00(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            int r0 = r7.readInt()     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            int r8 = r0 + 8
            byte[] r0 = A0p     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            int r0 = r0.length     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            r7.A00(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            int r3 = r0 + 8
            goto L_0x05d4
        L_0x05d1:
            r7.A00(r5)     // Catch:{ EOFException -> 0x0632, IOException | UnsupportedOperationException -> 0x0646 }
        L_0x05d4:
            r1 = 4
            byte[] r4 = new byte[r1]     // Catch:{ EOFException -> 0x0632, IOException | UnsupportedOperationException -> 0x0646 }
            int r0 = r7.read(r4)     // Catch:{ EOFException -> 0x0632, IOException | UnsupportedOperationException -> 0x0646 }
            if (r0 != r1) goto L_0x0615
            int r0 = r3 + 4
            int r5 = r7.readInt()     // Catch:{ EOFException -> 0x0632, IOException | UnsupportedOperationException -> 0x0646 }
            int r3 = r0 + 4
            byte[] r0 = A0k     // Catch:{ EOFException -> 0x0632, IOException | UnsupportedOperationException -> 0x0646 }
            boolean r0 = java.util.Arrays.equals(r0, r4)     // Catch:{ EOFException -> 0x0632, IOException | UnsupportedOperationException -> 0x0646 }
            if (r0 == 0) goto L_0x0601
            byte[] r1 = new byte[r5]     // Catch:{ EOFException -> 0x0632, IOException | UnsupportedOperationException -> 0x0646 }
            int r0 = r7.read(r1)     // Catch:{ EOFException -> 0x0632, IOException | UnsupportedOperationException -> 0x0646 }
            if (r0 != r5) goto L_0x061c
            A09(r2, r1, r3, r6)     // Catch:{ EOFException -> 0x0632, IOException | UnsupportedOperationException -> 0x0646 }
            X.0FE r0 = new X.0FE     // Catch:{ EOFException -> 0x0632, IOException | UnsupportedOperationException -> 0x0646 }
            r0.<init>(r1)     // Catch:{ EOFException -> 0x0632, IOException | UnsupportedOperationException -> 0x0646 }
            r2.A0P(r0)     // Catch:{ EOFException -> 0x0632, IOException | UnsupportedOperationException -> 0x0646 }
            goto L_0x063e
        L_0x0601:
            int r1 = r5 % 2
            r0 = 1
            if (r1 != r0) goto L_0x0608
            int r5 = r5 + 1
        L_0x0608:
            int r3 = r3 + r5
            if (r3 == r8) goto L_0x063e
            if (r3 > r8) goto L_0x060e
            goto L_0x05d1
        L_0x060e:
            java.lang.String r0 = "Encountered WebP file with invalid chunk size"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ EOFException -> 0x0632, IOException | UnsupportedOperationException -> 0x0646 }
            goto L_0x0631
        L_0x0615:
            java.lang.String r0 = "Encountered invalid length while parsing WebP chunktype"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ EOFException -> 0x0632, IOException | UnsupportedOperationException -> 0x0646 }
            goto L_0x0631
        L_0x061c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ EOFException -> 0x0632, IOException | UnsupportedOperationException -> 0x0646 }
            java.lang.String r0 = "Failed to read given length for given PNG chunk type: "
            r1.append(r0)     // Catch:{ EOFException -> 0x0632, IOException | UnsupportedOperationException -> 0x0646 }
            java.lang.String r0 = A05(r4)     // Catch:{ EOFException -> 0x0632, IOException | UnsupportedOperationException -> 0x0646 }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ EOFException -> 0x0632, IOException | UnsupportedOperationException -> 0x0646 }
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ EOFException -> 0x0632, IOException | UnsupportedOperationException -> 0x0646 }
        L_0x0631:
            throw r0     // Catch:{ EOFException -> 0x0632, IOException | UnsupportedOperationException -> 0x0646 }
        L_0x0632:
            java.lang.String r0 = "Encountered corrupt WebP file."
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
            goto L_0x063d
        L_0x0639:
            r0 = move-exception
            r5.close()     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
        L_0x063d:
            throw r0     // Catch:{ IOException | UnsupportedOperationException -> 0x0646 }
        L_0x063e:
            r2.A0J()
            boolean r0 = A0U
            if (r0 == 0) goto L_0x065a
            goto L_0x0657
        L_0x0646:
            r4 = move-exception
            boolean r3 = A0U     // Catch:{ all -> 0x065b }
            if (r3 == 0) goto L_0x0652
            java.lang.String r1 = "ExifInterface"
            java.lang.String r0 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r1, r0, r4)     // Catch:{ all -> 0x065b }
        L_0x0652:
            r2.A0J()
            if (r3 == 0) goto L_0x065a
        L_0x0657:
            r2.A0K()
        L_0x065a:
            return
        L_0x065b:
            r1 = move-exception
            r2.A0J()
            boolean r0 = A0U
            if (r0 == 0) goto L_0x0666
            r2.A0K()
        L_0x0666:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0YU.A0W(java.io.InputStream):void");
    }

    public final void A0Y(String str) {
        for (int i = 0; i < A17.length; i++) {
            this.A0I[i].remove(str);
        }
    }

    public static int A00(AnonymousClass0XT r3, AnonymousClass0YU r4) {
        Object A052 = r3.A05(r4.A0B);
        if (A052 == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        } else if (A052 instanceof String) {
            return Integer.parseInt((String) A052);
        } else {
            if (A052 instanceof long[]) {
                long[] jArr = (long[]) A052;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (A052 instanceof int[]) {
                int[] iArr = (int[]) A052;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a integer value");
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:63|64|65) */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        java.lang.Double.parseDouble(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x012b, code lost:
        return new android.util.Pair(12, -1);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x011d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair A01(java.lang.String r13) {
        /*
            java.lang.String r1 = ","
            boolean r0 = r13.contains(r1)
            r9 = 0
            r6 = 1
            r8 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r4 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            if (r0 == 0) goto L_0x008d
            java.lang.String[] r7 = r13.split(r1, r4)
            r0 = r7[r9]
            android.util.Pair r2 = A01(r0)
            java.lang.Object r0 = r2.first
            int r0 = X.AnonymousClass001.A0K(r0)
            if (r0 != r8) goto L_0x0027
        L_0x0026:
            return r2
        L_0x0027:
            int r0 = r7.length
            if (r6 >= r0) goto L_0x0026
            r0 = r7[r6]
            android.util.Pair r9 = A01(r0)
            java.lang.Object r10 = r9.first
            java.lang.Object r0 = r2.first
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0086
            java.lang.Object r1 = r9.second
            java.lang.Object r0 = r2.first
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0086
            r8 = -1
        L_0x0045:
            java.lang.Object r0 = r2.second
            int r0 = X.AnonymousClass001.A0K(r0)
            if (r0 == r4) goto L_0x0084
            java.lang.Object r0 = r2.second
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x005f
            java.lang.Object r1 = r9.second
            java.lang.Object r0 = r2.second
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0084
        L_0x005f:
            java.lang.Object r0 = r2.second
            int r0 = X.AnonymousClass001.A0K(r0)
        L_0x0065:
            if (r8 != r4) goto L_0x006f
            if (r0 != r4) goto L_0x006f
            android.util.Pair r1 = new android.util.Pair
            r1.<init>(r5, r3)
            return r1
        L_0x006f:
            if (r8 != r4) goto L_0x007d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0075:
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r0, r3)
        L_0x007a:
            int r6 = r6 + 1
            goto L_0x0027
        L_0x007d:
            if (r0 != r4) goto L_0x007a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            goto L_0x0075
        L_0x0084:
            r0 = -1
            goto L_0x0065
        L_0x0086:
            java.lang.Object r0 = r2.first
            int r8 = X.AnonymousClass001.A0K(r0)
            goto L_0x0045
        L_0x008d:
            java.lang.String r1 = "/"
            boolean r0 = r13.contains(r1)
            r11 = 0
            if (r0 == 0) goto L_0x00e4
            java.lang.String[] r2 = r13.split(r1, r4)
            int r0 = r2.length
            if (r0 != r8) goto L_0x012c
            r0 = r2[r9]     // Catch:{ NumberFormatException -> 0x012c }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x012c }
            long r7 = (long) r0     // Catch:{ NumberFormatException -> 0x012c }
            r0 = r2[r6]     // Catch:{ NumberFormatException -> 0x012c }
            double r9 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x012c }
            long r1 = (long) r9     // Catch:{ NumberFormatException -> 0x012c }
            r6 = 10
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x00da
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x00da
            r4 = 5
            r9 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x00d0
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x00d0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ NumberFormatException -> 0x012c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x012c }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x012c }
            r2.<init>(r1, r0)     // Catch:{ NumberFormatException -> 0x012c }
            return r2
        L_0x00d0:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x012c }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x012c }
            r1.<init>(r0, r3)     // Catch:{ NumberFormatException -> 0x012c }
            return r1
        L_0x00da:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ NumberFormatException -> 0x012c }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x012c }
            r2.<init>(r0, r3)     // Catch:{ NumberFormatException -> 0x012c }
            return r2
        L_0x00e4:
            long r6 = java.lang.Long.parseLong(r13)     // Catch:{ NumberFormatException -> 0x011d }
            r4 = 4
            int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x0103
            r1 = 65535(0xffff, double:3.23786E-319)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0103
            r0 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x011d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x011d }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x011d }
            r2.<init>(r1, r0)     // Catch:{ NumberFormatException -> 0x011d }
            return r2
        L_0x0103:
            int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x0113
            r0 = 9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x011d }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x011d }
            r2.<init>(r0, r3)     // Catch:{ NumberFormatException -> 0x011d }
            return r2
        L_0x0113:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x011d }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x011d }
            r2.<init>(r0, r3)     // Catch:{ NumberFormatException -> 0x011d }
            return r2
        L_0x011d:
            java.lang.Double.parseDouble(r13)     // Catch:{ NumberFormatException -> 0x012c }
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x012c }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x012c }
            r1.<init>(r0, r3)     // Catch:{ NumberFormatException -> 0x012c }
            return r1
        L_0x012c:
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r5, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0YU.A01(java.lang.String):android.util.Pair");
    }

    public static AnonymousClass0TF A04(String str, int i, int i2) {
        return new AnonymousClass0TF(str, i, i2);
    }

    public static void A09(AnonymousClass0YU r1, byte[] bArr, int i, int i2) {
        r1.A01 = i;
        C009207f r0 = new C009207f(bArr);
        r1.A0O(r0);
        r1.A0U(r0, i2);
    }

    public static void A0A(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static void A0B(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[DefaultCrypto.BUFFER_SIZE];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static void A0C(InputStream inputStream, OutputStream outputStream, int i) {
        byte[] bArr = new byte[DefaultCrypto.BUFFER_SIZE];
        while (i > 0) {
            int min = Math.min(i, DefaultCrypto.BUFFER_SIZE);
            int read = inputStream.read(bArr, 0, min);
            if (read == min) {
                i -= read;
                outputStream.write(bArr, 0, read);
            } else {
                throw AnonymousClass002.A0C("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
        }
    }

    public static void A0D(Object obj, AbstractMap abstractMap, AnonymousClass0TF[] r3, int i) {
        abstractMap.put(Integer.valueOf(r3[i].A00), obj);
    }

    public static void A0E(String str, Object[] objArr, int i, int i2) {
        objArr[i] = new AnonymousClass0TF(str, i, i2);
    }

    public static void A0F(String str, Object[] objArr, int i, int i2, int i3) {
        objArr[i3] = new AnonymousClass0TF(str, i, i2);
    }

    public int A0G(int i) {
        int i2 = 0;
        while (i2 < A17.length) {
            AnonymousClass0XT A032 = A03("Orientation", this.A0I[i2]);
            if (A032 != null) {
                try {
                    return A00(A032, this);
                } catch (NumberFormatException unused) {
                    return i;
                }
            } else {
                i2++;
            }
        }
        return i;
    }

    public String A0H(String str) {
        AnonymousClass0XT r1;
        NumberFormatException numberFormatException;
        double d;
        StringBuilder A0o2;
        if (str != null) {
            String str2 = str;
            if ("ISOSpeedRatings".equals(str)) {
                if (A0U) {
                    Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
                }
                str2 = "PhotographicSensitivity";
            }
            int i = 0;
            while (true) {
                if (i >= A17.length) {
                    r1 = null;
                    break;
                }
                r1 = A03(str2, this.A0I[i]);
                if (r1 != null) {
                    break;
                }
                i++;
            }
            if (r1 != null) {
                if (!A0N.contains(str)) {
                    return r1.A06(this.A0B);
                }
                if (str.equals("GPSTimeStamp")) {
                    int i2 = r1.A00;
                    if (i2 == 5 || i2 == 10) {
                        AnonymousClass0NB[] r6 = (AnonymousClass0NB[]) r1.A05(this.A0B);
                        if (r6 == null || r6.length != 3) {
                            A0o2 = AnonymousClass001.A0o();
                            A0o2.append("Invalid GPS Timestamp array. array=");
                            A0o2.append(Arrays.toString(r6));
                        } else {
                            Object[] objArr = new Object[3];
                            AnonymousClass0NB r2 = r6[0];
                            AnonymousClass000.A1P(objArr, (int) (((float) r2.A01) / ((float) r2.A00)), 0);
                            AnonymousClass0NB r22 = r6[1];
                            AnonymousClass000.A1P(objArr, (int) (((float) r22.A01) / ((float) r22.A00)), 1);
                            AnonymousClass0NB r23 = r6[2];
                            AnonymousClass000.A1P(objArr, (int) (((float) r23.A01) / ((float) r23.A00)), 2);
                            return String.format("%02d:%02d:%02d", objArr);
                        }
                    } else {
                        A0o2 = AnonymousClass001.A0o();
                        A0o2.append("GPS Timestamp format is not rational. format=");
                        A0o2.append(i2);
                    }
                    Log.w("ExifInterface", A0o2.toString());
                    return null;
                }
                try {
                    Object A052 = r1.A05(this.A0B);
                    if (A052 != null) {
                        if (A052 instanceof String) {
                            d = Double.parseDouble((String) A052);
                        } else if (A052 instanceof long[]) {
                            long[] jArr = (long[]) A052;
                            if (jArr.length == 1) {
                                d = (double) jArr[0];
                            } else {
                                numberFormatException = new NumberFormatException("There are more than one component");
                            }
                        } else if (A052 instanceof int[]) {
                            int[] iArr = (int[]) A052;
                            if (iArr.length == 1) {
                                d = (double) iArr[0];
                            } else {
                                numberFormatException = new NumberFormatException("There are more than one component");
                            }
                        } else if (A052 instanceof double[]) {
                            double[] dArr = (double[]) A052;
                            if (dArr.length == 1) {
                                d = dArr[0];
                            } else {
                                numberFormatException = new NumberFormatException("There are more than one component");
                            }
                        } else if (A052 instanceof AnonymousClass0NB[]) {
                            AnonymousClass0NB[] r4 = (AnonymousClass0NB[]) A052;
                            if (r4.length == 1) {
                                AnonymousClass0NB r24 = r4[0];
                                d = ((double) r24.A01) / ((double) r24.A00);
                            } else {
                                numberFormatException = new NumberFormatException("There are more than one component");
                            }
                        } else {
                            numberFormatException = new NumberFormatException("Couldn't find a double value");
                        }
                        return Double.toString(d);
                    }
                    numberFormatException = new NumberFormatException("NULL can't be converted to a double value");
                    throw numberFormatException;
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        throw AnonymousClass001.A0g("tag shouldn't be null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04a1, code lost:
        r10 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x04a2, code lost:
        r4 = null;
        r25 = r1;
        r5 = null;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x04a8, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x04a9, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x04b1, code lost:
        r10 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x04b2, code lost:
        r5 = null;
        r4 = null;
        r25 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x04c3, code lost:
        X.AnonymousClass0V3.A02(r7.A09, android.system.OsConstants.SEEK_SET, 0);
        r0 = new java.io.FileOutputStream(r7.A09);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x04d8, code lost:
        r0 = new java.io.FileOutputStream(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0526, code lost:
        r24.delete();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x04a8 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:43:0x0083] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x04c3 A[Catch:{ Exception -> 0x04f0, all -> 0x04ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x04d8 A[Catch:{ Exception -> 0x04f0, all -> 0x04ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0526  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:213:0x0473=Splitter:B:213:0x0473, B:130:0x0268=Splitter:B:130:0x0268} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0I() {
        /*
            r27 = this;
            r7 = r27
            int r1 = r7.A00
            r0 = 4
            if (r1 == r0) goto L_0x001b
            r0 = 13
            if (r1 == r0) goto L_0x001b
            r0 = 14
            if (r1 == r0) goto L_0x001b
            r0 = 3
            if (r1 == r0) goto L_0x001b
            if (r1 == 0) goto L_0x001b
            java.lang.String r0 = "ExifInterface only supports saving attributes for JPEG, PNG, WebP, and DNG formats."
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)
            throw r0
        L_0x001b:
            java.io.FileDescriptor r0 = r7.A09
            if (r0 != 0) goto L_0x002a
            java.lang.String r0 = r7.A0A
            if (r0 != 0) goto L_0x002a
            java.lang.String r0 = "ExifInterface does not support saving attributes for the current input."
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)
            throw r0
        L_0x002a:
            boolean r0 = r7.A0E
            if (r0 == 0) goto L_0x003d
            boolean r0 = r7.A0F
            if (r0 == 0) goto L_0x003d
            boolean r0 = r7.A0D
            if (r0 != 0) goto L_0x003d
            java.lang.String r0 = "ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)
            throw r0
        L_0x003d:
            int r1 = r7.A05
            r0 = 6
            if (r1 == r0) goto L_0x004b
            r0 = 7
            if (r1 == r0) goto L_0x004b
            r0 = 0
        L_0x0046:
            r7.A0H = r0
            r25 = 0
            goto L_0x0050
        L_0x004b:
            byte[] r0 = r7.A0b()
            goto L_0x0046
        L_0x0050:
            java.lang.String r1 = "temp"
            java.lang.String r0 = "tmp"
            java.io.File r24 = java.io.File.createTempFile(r1, r0)     // Catch:{ Exception -> 0x053a, all -> 0x0536 }
            java.lang.String r0 = r7.A0A     // Catch:{ Exception -> 0x053a, all -> 0x0536 }
            if (r0 == 0) goto L_0x0062
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x053a, all -> 0x0536 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x053a, all -> 0x0536 }
            goto L_0x0072
        L_0x0062:
            java.io.FileDescriptor r3 = r7.A09     // Catch:{ Exception -> 0x053a, all -> 0x0536 }
            int r2 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x053a, all -> 0x0536 }
            r0 = 0
            X.AnonymousClass0V3.A02(r3, r2, r0)     // Catch:{ Exception -> 0x053a, all -> 0x0536 }
            java.io.FileDescriptor r0 = r7.A09     // Catch:{ Exception -> 0x053a, all -> 0x0536 }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x053a, all -> 0x0536 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x053a, all -> 0x0536 }
        L_0x0072:
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x052e, all -> 0x052a }
            r0 = r24
            r3.<init>(r0)     // Catch:{ Exception -> 0x052e, all -> 0x052a }
            A0B(r1, r3)     // Catch:{ Exception -> 0x0532, all -> 0x0547 }
            A0A(r1)
            A0A(r3)
            r8 = 0
            java.io.FileInputStream r23 = new java.io.FileInputStream     // Catch:{ Exception -> 0x04ac, all -> 0x04a8 }
            r1 = r23
            r1.<init>(r0)     // Catch:{ Exception -> 0x04ac, all -> 0x04a8 }
            java.lang.String r0 = r7.A0A     // Catch:{ Exception -> 0x04b1, all -> 0x04a8 }
            if (r0 == 0) goto L_0x0094
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x04b1, all -> 0x04a8 }
            r6.<init>(r0)     // Catch:{ Exception -> 0x04b1, all -> 0x04a8 }
            goto L_0x00a4
        L_0x0094:
            java.io.FileDescriptor r3 = r7.A09     // Catch:{ Exception -> 0x04b1, all -> 0x04a8 }
            int r2 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x04b1, all -> 0x04a8 }
            r0 = 0
            X.AnonymousClass0V3.A02(r3, r2, r0)     // Catch:{ Exception -> 0x04b1, all -> 0x04a8 }
            java.io.FileDescriptor r0 = r7.A09     // Catch:{ Exception -> 0x04b1, all -> 0x04a8 }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x04b1, all -> 0x04a8 }
            r6.<init>(r0)     // Catch:{ Exception -> 0x04b1, all -> 0x04a8 }
        L_0x00a4:
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x04a1, all -> 0x04a8 }
            r0 = r23
            r5.<init>(r0)     // Catch:{ Exception -> 0x04a1, all -> 0x04a8 }
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x0499, all -> 0x0519 }
            r4.<init>(r6)     // Catch:{ Exception -> 0x0499, all -> 0x0519 }
            int r1 = r7.A00     // Catch:{ Exception -> 0x049d }
            r0 = 4
            if (r1 != r0) goto L_0x01d5
            boolean r0 = A0U     // Catch:{ Exception -> 0x049d }
            if (r0 == 0) goto L_0x00d6
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x049d }
            java.lang.String r0 = "saveJpegAttributes starting with (inputStream: "
            r1.append(r0)     // Catch:{ Exception -> 0x049d }
            r1.append(r5)     // Catch:{ Exception -> 0x049d }
            java.lang.String r0 = ", outputStream: "
            r1.append(r0)     // Catch:{ Exception -> 0x049d }
            r1.append(r4)     // Catch:{ Exception -> 0x049d }
            java.lang.String r1 = X.AnonymousClass000.A0e(r1)     // Catch:{ Exception -> 0x049d }
            java.lang.String r0 = "ExifInterface"
            android.util.Log.d(r0, r1)     // Catch:{ Exception -> 0x049d }
        L_0x00d6:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ Exception -> 0x049d }
            X.0FE r13 = new X.0FE     // Catch:{ Exception -> 0x049d }
            r13.<init>(r5, r0)     // Catch:{ Exception -> 0x049d }
            X.0FB r12 = new X.0FB     // Catch:{ Exception -> 0x049d }
            r12.<init>(r4, r0)     // Catch:{ Exception -> 0x049d }
            byte r0 = r13.readByte()     // Catch:{ Exception -> 0x049d }
            java.lang.String r16 = "Invalid marker"
            r11 = -1
            if (r0 != r11) goto L_0x01cf
            java.io.OutputStream r10 = r12.A01     // Catch:{ Exception -> 0x049d }
            r10.write(r11)     // Catch:{ Exception -> 0x049d }
            byte r1 = r13.readByte()     // Catch:{ Exception -> 0x049d }
            r0 = -40
            if (r1 != r0) goto L_0x01c9
            r10.write(r0)     // Catch:{ Exception -> 0x049d }
            java.lang.String r2 = "Xmp"
            java.lang.String r0 = r7.A0H(r2)     // Catch:{ Exception -> 0x049d }
            if (r0 == 0) goto L_0x011b
            boolean r0 = r7.A0G     // Catch:{ Exception -> 0x049d }
            if (r0 == 0) goto L_0x011b
            java.util.HashMap[] r0 = r7.A0I     // Catch:{ Exception -> 0x049d }
            r0 = r0[r8]     // Catch:{ Exception -> 0x049d }
            java.lang.Object r1 = r0.remove(r2)     // Catch:{ Exception -> 0x049d }
        L_0x010f:
            r10.write(r11)     // Catch:{ Exception -> 0x049d }
            r9 = -31
            r10.write(r9)     // Catch:{ Exception -> 0x049d }
            r7.A0S(r12)     // Catch:{ Exception -> 0x049d }
            goto L_0x011d
        L_0x011b:
            r1 = 0
            goto L_0x010f
        L_0x011d:
            if (r1 == 0) goto L_0x0126
            java.util.HashMap[] r0 = r7.A0I     // Catch:{ Exception -> 0x049d }
            r0 = r0[r8]     // Catch:{ Exception -> 0x049d }
            r0.put(r2, r1)     // Catch:{ Exception -> 0x049d }
        L_0x0126:
            r3 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r3]     // Catch:{ Exception -> 0x049d }
        L_0x012a:
            byte r0 = r13.readByte()     // Catch:{ Exception -> 0x049d }
            if (r0 != r11) goto L_0x01c3
            byte r1 = r13.readByte()     // Catch:{ Exception -> 0x049d }
            r0 = -39
            if (r1 == r0) goto L_0x01b8
            r0 = -38
            if (r1 == r0) goto L_0x01b8
            java.lang.String r14 = "Invalid length"
            if (r1 == r9) goto L_0x0165
            r10.write(r11)     // Catch:{ Exception -> 0x049d }
            r10.write(r1)     // Catch:{ Exception -> 0x049d }
            int r1 = r13.readUnsignedShort()     // Catch:{ Exception -> 0x049d }
            short r0 = (short) r1     // Catch:{ Exception -> 0x049d }
            r12.A01(r0)     // Catch:{ Exception -> 0x049d }
            int r1 = r1 + -2
            if (r1 >= 0) goto L_0x0154
            goto L_0x0477
        L_0x0154:
            if (r1 <= 0) goto L_0x012a
            int r0 = java.lang.Math.min(r1, r3)     // Catch:{ Exception -> 0x049d }
            int r0 = r13.read(r2, r8, r0)     // Catch:{ Exception -> 0x049d }
            if (r0 < 0) goto L_0x012a
            r12.write(r2, r8, r0)     // Catch:{ Exception -> 0x049d }
            int r1 = r1 - r0
            goto L_0x0154
        L_0x0165:
            int r0 = r13.readUnsignedShort()     // Catch:{ Exception -> 0x049d }
            int r1 = r0 + -2
            if (r1 < 0) goto L_0x01b2
            r15 = 6
            byte[] r14 = new byte[r15]     // Catch:{ Exception -> 0x049d }
            if (r1 < r15) goto L_0x0186
            int r0 = r13.read(r14)     // Catch:{ Exception -> 0x049d }
            if (r0 != r15) goto L_0x01aa
            byte[] r0 = A0Z     // Catch:{ Exception -> 0x049d }
            boolean r0 = java.util.Arrays.equals(r14, r0)     // Catch:{ Exception -> 0x049d }
            if (r0 == 0) goto L_0x0186
            int r0 = r1 + -6
            r13.A00(r0)     // Catch:{ Exception -> 0x049d }
            goto L_0x012a
        L_0x0186:
            r10.write(r11)     // Catch:{ Exception -> 0x049d }
            r10.write(r9)     // Catch:{ Exception -> 0x049d }
            int r0 = r1 + 2
            short r0 = (short) r0     // Catch:{ Exception -> 0x049d }
            r12.A01(r0)     // Catch:{ Exception -> 0x049d }
            if (r1 < r15) goto L_0x0199
            int r1 = r1 + -6
            r12.write(r14)     // Catch:{ Exception -> 0x049d }
        L_0x0199:
            if (r1 <= 0) goto L_0x012a
            int r0 = java.lang.Math.min(r1, r3)     // Catch:{ Exception -> 0x049d }
            int r0 = r13.read(r2, r8, r0)     // Catch:{ Exception -> 0x049d }
            if (r0 < 0) goto L_0x012a
            r12.write(r2, r8, r0)     // Catch:{ Exception -> 0x049d }
            int r1 = r1 - r0
            goto L_0x0199
        L_0x01aa:
            java.lang.String r0 = "Invalid exif"
            java.io.IOException r1 = X.AnonymousClass002.A0C(r0)     // Catch:{ Exception -> 0x049d }
            goto L_0x047b
        L_0x01b2:
            java.io.IOException r1 = X.AnonymousClass002.A0C(r14)     // Catch:{ Exception -> 0x049d }
            goto L_0x047b
        L_0x01b8:
            r10.write(r11)     // Catch:{ Exception -> 0x049d }
            r10.write(r1)     // Catch:{ Exception -> 0x049d }
            A0B(r13, r12)     // Catch:{ Exception -> 0x049d }
            goto L_0x048b
        L_0x01c3:
            java.io.IOException r1 = X.AnonymousClass002.A0C(r16)     // Catch:{ Exception -> 0x049d }
            goto L_0x047b
        L_0x01c9:
            java.io.IOException r1 = X.AnonymousClass002.A0C(r16)     // Catch:{ Exception -> 0x049d }
            goto L_0x047b
        L_0x01cf:
            java.io.IOException r1 = X.AnonymousClass002.A0C(r16)     // Catch:{ Exception -> 0x049d }
            goto L_0x047b
        L_0x01d5:
            r0 = 13
            if (r1 != r0) goto L_0x026d
            boolean r0 = A0U     // Catch:{ Exception -> 0x049d }
            if (r0 == 0) goto L_0x01fa
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x049d }
            java.lang.String r0 = "savePngAttributes starting with (inputStream: "
            r1.append(r0)     // Catch:{ Exception -> 0x049d }
            r1.append(r5)     // Catch:{ Exception -> 0x049d }
            java.lang.String r0 = ", outputStream: "
            r1.append(r0)     // Catch:{ Exception -> 0x049d }
            r1.append(r4)     // Catch:{ Exception -> 0x049d }
            java.lang.String r1 = X.AnonymousClass000.A0e(r1)     // Catch:{ Exception -> 0x049d }
            java.lang.String r0 = "ExifInterface"
            android.util.Log.d(r0, r1)     // Catch:{ Exception -> 0x049d }
        L_0x01fa:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ Exception -> 0x049d }
            X.0FE r10 = new X.0FE     // Catch:{ Exception -> 0x049d }
            r10.<init>(r5, r1)     // Catch:{ Exception -> 0x049d }
            X.0FB r9 = new X.0FB     // Catch:{ Exception -> 0x049d }
            r9.<init>(r4, r1)     // Catch:{ Exception -> 0x049d }
            byte[] r0 = A0h     // Catch:{ Exception -> 0x049d }
            int r2 = r0.length     // Catch:{ Exception -> 0x049d }
            A0C(r10, r9, r2)     // Catch:{ Exception -> 0x049d }
            int r0 = r7.A01     // Catch:{ Exception -> 0x049d }
            r11 = 4
            if (r0 != 0) goto L_0x0220
            int r0 = r10.readInt()     // Catch:{ Exception -> 0x049d }
            r9.A00(r0)     // Catch:{ Exception -> 0x049d }
            int r0 = r0 + 4
            int r0 = r0 + 4
            A0C(r10, r9, r0)     // Catch:{ Exception -> 0x049d }
            goto L_0x0231
        L_0x0220:
            int r0 = r0 - r2
            int r0 = r0 - r11
            int r0 = r0 - r11
            A0C(r10, r9, r0)     // Catch:{ Exception -> 0x049d }
            int r0 = r10.readInt()     // Catch:{ Exception -> 0x049d }
            int r0 = r0 + 4
            int r0 = r0 + 4
            r10.A00(r0)     // Catch:{ Exception -> 0x049d }
        L_0x0231:
            r0 = 0
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0267 }
            r3.<init>()     // Catch:{ all -> 0x0267 }
            X.0FB r0 = new X.0FB     // Catch:{ all -> 0x0264 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x0264 }
            r7.A0S(r0)     // Catch:{ all -> 0x0264 }
            java.io.OutputStream r0 = r0.A01     // Catch:{ all -> 0x0264 }
            java.io.ByteArrayOutputStream r0 = (java.io.ByteArrayOutputStream) r0     // Catch:{ all -> 0x0264 }
            byte[] r2 = r0.toByteArray()     // Catch:{ all -> 0x0264 }
            r9.write(r2)     // Catch:{ all -> 0x0264 }
            java.util.zip.CRC32 r1 = new java.util.zip.CRC32     // Catch:{ all -> 0x0264 }
            r1.<init>()     // Catch:{ all -> 0x0264 }
            int r0 = r2.length     // Catch:{ all -> 0x0264 }
            int r0 = r0 - r11
            r1.update(r2, r11, r0)     // Catch:{ all -> 0x0264 }
            long r0 = r1.getValue()     // Catch:{ all -> 0x0264 }
            int r2 = (int) r0     // Catch:{ all -> 0x0264 }
            r9.A00(r2)     // Catch:{ all -> 0x0264 }
            A0A(r3)     // Catch:{ Exception -> 0x049d }
            A0B(r10, r9)     // Catch:{ Exception -> 0x049d }
            goto L_0x048b
        L_0x0264:
            r1 = move-exception
            r0 = r3
            goto L_0x0268
        L_0x0267:
            r1 = move-exception
        L_0x0268:
            A0A(r0)     // Catch:{ Exception -> 0x049d }
            goto L_0x047b
        L_0x026d:
            r0 = 14
            if (r1 != r0) goto L_0x047c
            boolean r0 = A0U     // Catch:{ Exception -> 0x049d }
            if (r0 == 0) goto L_0x0292
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x049d }
            java.lang.String r0 = "saveWebpAttributes starting with (inputStream: "
            r1.append(r0)     // Catch:{ Exception -> 0x049d }
            r1.append(r5)     // Catch:{ Exception -> 0x049d }
            java.lang.String r0 = ", outputStream: "
            r1.append(r0)     // Catch:{ Exception -> 0x049d }
            r1.append(r4)     // Catch:{ Exception -> 0x049d }
            java.lang.String r1 = X.AnonymousClass000.A0e(r1)     // Catch:{ Exception -> 0x049d }
            java.lang.String r0 = "ExifInterface"
            android.util.Log.d(r0, r1)     // Catch:{ Exception -> 0x049d }
        L_0x0292:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ Exception -> 0x049d }
            X.0FE r11 = new X.0FE     // Catch:{ Exception -> 0x049d }
            r11.<init>(r5, r1)     // Catch:{ Exception -> 0x049d }
            X.0FB r10 = new X.0FB     // Catch:{ Exception -> 0x049d }
            r10.<init>(r4, r1)     // Catch:{ Exception -> 0x049d }
            byte[] r0 = A0o     // Catch:{ Exception -> 0x049d }
            int r2 = r0.length     // Catch:{ Exception -> 0x049d }
            A0C(r11, r10, r2)     // Catch:{ Exception -> 0x049d }
            byte[] r22 = A0p     // Catch:{ Exception -> 0x049d }
            r0 = r22
            int r0 = r0.length     // Catch:{ Exception -> 0x049d }
            r21 = r0
            r3 = 4
            int r0 = r0 + 4
            r11.A00(r0)     // Catch:{ Exception -> 0x049d }
            r9 = 0
            java.io.ByteArrayOutputStream r20 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0469 }
            r20.<init>()     // Catch:{ Exception -> 0x0469 }
            X.0FB r9 = new X.0FB     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            r0 = r20
            r9.<init>(r0, r1)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            int r1 = r7.A01     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            if (r1 == 0) goto L_0x02f1
            int r0 = r2 + 4
            int r0 = r0 + r21
            int r1 = r1 - r0
            int r1 = r1 - r3
            int r1 = r1 - r3
            A0C(r11, r9, r1)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            r11.A00(r3)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            int r0 = r11.readInt()     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            r11.A00(r0)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
        L_0x02d6:
            r7.A0S(r9)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
        L_0x02d9:
            A0B(r11, r9)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            int r0 = r20.size()     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            int r0 = r0 + r21
            r10.A00(r0)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            r0 = r22
            r10.write(r0)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            r0 = r20
            r0.writeTo(r10)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            goto L_0x0448
        L_0x02f1:
            byte[] r12 = new byte[r3]     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            int r0 = r11.read(r12)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            if (r0 != r3) goto L_0x0453
            byte[] r1 = A0n     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            boolean r0 = java.util.Arrays.equals(r12, r1)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            r14 = 8
            r15 = 0
            r2 = 1
            if (r0 == 0) goto L_0x035d
            int r13 = r11.readInt()     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            int r12 = r13 % 2
            r0 = r13
            if (r12 != r2) goto L_0x0310
            int r0 = r13 + 1
        L_0x0310:
            byte[] r12 = new byte[r0]     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            r11.read(r12)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            byte r0 = r12[r8]     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            r14 = r14 | r0
            byte r0 = (byte) r14     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            r12[r8] = r0     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            int r0 = r0 >> r2
            r0 = r0 & 1
            if (r0 != r2) goto L_0x0321
            r15 = 1
        L_0x0321:
            r9.write(r1)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            r9.A00(r13)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            r9.write(r12)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            if (r15 == 0) goto L_0x0354
            byte[] r1 = A0i     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            r0 = r25
            r7.A0R(r11, r9, r1, r0)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
        L_0x0333:
            byte[] r12 = new byte[r3]     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            r5.read(r12)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            byte[] r0 = A0j     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            boolean r0 = java.util.Arrays.equals(r12, r0)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            if (r0 == 0) goto L_0x02d6
            int r1 = r11.readInt()     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            r9.write(r12)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            r9.A00(r1)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            int r0 = r1 % 2
            if (r0 != r2) goto L_0x0350
            int r1 = r1 + 1
        L_0x0350:
            A0C(r11, r9, r1)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            goto L_0x0333
        L_0x0354:
            byte[] r1 = A0l     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            byte[] r0 = A0m     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            r7.A0R(r11, r9, r1, r0)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            goto L_0x02d6
        L_0x035d:
            byte[] r19 = A0l     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            r0 = r19
            boolean r0 = java.util.Arrays.equals(r12, r0)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            if (r0 != 0) goto L_0x036f
            byte[] r0 = A0m     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            boolean r0 = java.util.Arrays.equals(r12, r0)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            if (r0 == 0) goto L_0x02d9
        L_0x036f:
            int r14 = r11.readInt()     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            int r0 = r14 % 2
            r3 = r14
            if (r0 != r2) goto L_0x037a
            int r3 = r14 + 1
        L_0x037a:
            r2 = 3
            byte[] r0 = new byte[r2]     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            r26 = r0
            r0 = r19
            boolean r0 = java.util.Arrays.equals(r12, r0)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            r13 = 47
            if (r0 == 0) goto L_0x03ae
            r0 = r26
            r11.read(r0)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            byte[] r13 = new byte[r2]     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            int r0 = r11.read(r13)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            if (r0 != r2) goto L_0x044c
            byte[] r0 = A0q     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            boolean r0 = java.util.Arrays.equals(r0, r13)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            if (r0 == 0) goto L_0x044c
            int r13 = r11.readInt()     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            int r0 = r13 << 18
            int r18 = r0 >> 18
            int r0 = r13 << 2
            int r17 = r0 >> 18
            int r3 = r3 + -10
            goto L_0x0446
        L_0x03ae:
            byte[] r0 = A0m     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            boolean r0 = java.util.Arrays.equals(r12, r0)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            if (r0 == 0) goto L_0x0441
            byte r0 = r11.readByte()     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            if (r0 != r13) goto L_0x045a
            int r13 = r11.readInt()     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            int r0 = r13 << 18
            int r0 = r0 >> 18
            int r18 = r0 + 1
            int r0 = r13 << 4
            int r0 = r0 >> 18
            int r17 = r0 + 1
            r2 = r13 & 8
            int r3 = r3 + -5
        L_0x03d0:
            r9.write(r1)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            r0 = 10
            r9.A00(r0)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            byte[] r15 = new byte[r0]     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            byte r0 = r15[r8]     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            r0 = r0 | 8
            byte r1 = (byte) r0     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            r15[r8] = r1     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            r16 = 4
            int r0 = r2 << 4
            r1 = r1 | r0
            byte r0 = (byte) r1     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            r15[r8] = r0     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            int r2 = r18 + -1
            int r1 = r17 + -1
            byte r0 = (byte) r2     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            r15[r16] = r0     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            int r0 = r2 >> 8
            byte r0 = (byte) r0     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            r16 = r0
            r0 = 5
            r15[r0] = r16     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            int r0 = r2 >> 16
            byte r2 = (byte) r0     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            r0 = 6
            r15[r0] = r2     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            r2 = 7
            byte r0 = (byte) r1     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            r15[r2] = r0     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            int r0 = r1 >> 8
            byte r2 = (byte) r0     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            r0 = 8
            r15[r0] = r2     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            int r0 = r1 >> 16
            byte r1 = (byte) r0     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            r0 = 9
            r15[r0] = r1     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            r9.write(r15)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            r9.write(r12)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            r9.A00(r14)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            r0 = r19
            boolean r0 = java.util.Arrays.equals(r12, r0)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            if (r0 == 0) goto L_0x0433
            r0 = r26
            r9.write(r0)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            byte[] r0 = A0q     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            r9.write(r0)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
        L_0x042b:
            r9.A00(r13)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
        L_0x042e:
            A0C(r11, r9, r3)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            goto L_0x02d6
        L_0x0433:
            byte[] r0 = A0m     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            boolean r0 = java.util.Arrays.equals(r12, r0)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            if (r0 == 0) goto L_0x042e
            r0 = 47
            r9.write(r0)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            goto L_0x042b
        L_0x0441:
            r13 = 0
            r18 = 0
            r17 = 0
        L_0x0446:
            r2 = 0
            goto L_0x03d0
        L_0x0448:
            A0A(r20)     // Catch:{ Exception -> 0x049d }
            goto L_0x048b
        L_0x044c:
            java.lang.String r0 = "Encountered error while checking VP8 signature"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            goto L_0x0460
        L_0x0453:
            java.lang.String r0 = "Encountered invalid length while parsing WebP chunk type"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
            goto L_0x0460
        L_0x045a:
            java.lang.String r0 = "Encountered error while checking VP8L signature"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
        L_0x0460:
            throw r0     // Catch:{ Exception -> 0x0465, all -> 0x0461 }
        L_0x0461:
            r1 = move-exception
            r9 = r20
            goto L_0x0473
        L_0x0465:
            r2 = move-exception
            r9 = r20
            goto L_0x046a
        L_0x0469:
            r2 = move-exception
        L_0x046a:
            java.lang.String r1 = "Failed to save WebP file"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0472 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0472 }
            throw r0     // Catch:{ all -> 0x0472 }
        L_0x0472:
            r1 = move-exception
        L_0x0473:
            A0A(r9)     // Catch:{ Exception -> 0x049d }
            goto L_0x047b
        L_0x0477:
            java.io.IOException r1 = X.AnonymousClass002.A0C(r14)     // Catch:{ Exception -> 0x049d }
        L_0x047b:
            throw r1     // Catch:{ Exception -> 0x049d }
        L_0x047c:
            r0 = 3
            if (r1 == r0) goto L_0x0481
            if (r1 != 0) goto L_0x048b
        L_0x0481:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ Exception -> 0x049d }
            X.0FB r0 = new X.0FB     // Catch:{ Exception -> 0x049d }
            r0.<init>(r4, r1)     // Catch:{ Exception -> 0x049d }
            r7.A0S(r0)     // Catch:{ Exception -> 0x049d }
        L_0x048b:
            A0A(r5)
            A0A(r4)
            r24.delete()
            r0 = r25
            r7.A0H = r0
            return
        L_0x0499:
            r10 = move-exception
            r4 = r25
            goto L_0x049e
        L_0x049d:
            r10 = move-exception
        L_0x049e:
            r25 = r23
            goto L_0x04b8
        L_0x04a1:
            r10 = move-exception
            r4 = r25
            r25 = r23
            r5 = r4
            goto L_0x04b8
        L_0x04a8:
            r0 = move-exception
            r4 = r25
            goto L_0x051e
        L_0x04ac:
            r10 = move-exception
            r5 = r25
            r4 = r5
            goto L_0x04b7
        L_0x04b1:
            r10 = move-exception
            r5 = r25
            r4 = r5
            r25 = r23
        L_0x04b7:
            r6 = r5
        L_0x04b8:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch:{ Exception -> 0x04f4, all -> 0x04f2 }
            r0 = r24
            r9.<init>(r0)     // Catch:{ Exception -> 0x04f4, all -> 0x04f2 }
            java.lang.String r1 = r7.A0A     // Catch:{ Exception -> 0x04f0, all -> 0x04ec }
            if (r1 != 0) goto L_0x04d8
            java.io.FileDescriptor r3 = r7.A09     // Catch:{ Exception -> 0x04f0, all -> 0x04ec }
            int r2 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x04f0, all -> 0x04ec }
            r0 = 0
            X.AnonymousClass0V3.A02(r3, r2, r0)     // Catch:{ Exception -> 0x04f0, all -> 0x04ec }
            java.io.FileDescriptor r1 = r7.A09     // Catch:{ Exception -> 0x04f0, all -> 0x04ec }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x04f0, all -> 0x04ec }
            r0.<init>(r1)     // Catch:{ Exception -> 0x04f0, all -> 0x04ec }
        L_0x04d3:
            r6 = r0
            A0B(r9, r0)     // Catch:{ Exception -> 0x04f0, all -> 0x04ec }
            goto L_0x04de
        L_0x04d8:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x04f0, all -> 0x04ec }
            r0.<init>(r1)     // Catch:{ Exception -> 0x04f0, all -> 0x04ec }
            goto L_0x04d3
        L_0x04de:
            A0A(r9)     // Catch:{ all -> 0x0517 }
            A0A(r0)     // Catch:{ all -> 0x0517 }
            java.lang.String r0 = "Failed to save new file"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0517 }
            r1.<init>(r0, r10)     // Catch:{ all -> 0x0517 }
            goto L_0x0516
        L_0x04ec:
            r1 = move-exception
            r25 = r9
            goto L_0x0510
        L_0x04f0:
            r3 = move-exception
            goto L_0x04f7
        L_0x04f2:
            r1 = move-exception
            goto L_0x0510
        L_0x04f4:
            r3 = move-exception
            r9 = r25
        L_0x04f7:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x050c }
            java.lang.String r1 = "Failed to save new file. Original file is stored in "
            r0 = r24
            X.AnonymousClass000.A10(r0, r1, r2)     // Catch:{ all -> 0x050c }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x050c }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x050c }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x050c }
            throw r0     // Catch:{ all -> 0x050c }
        L_0x050c:
            r1 = move-exception
            r25 = r9
            r8 = 1
        L_0x0510:
            A0A(r25)     // Catch:{ all -> 0x0517 }
            A0A(r6)     // Catch:{ all -> 0x0517 }
        L_0x0516:
            throw r1     // Catch:{ all -> 0x0517 }
        L_0x0517:
            r0 = move-exception
            goto L_0x051c
        L_0x0519:
            r0 = move-exception
            r4 = r25
        L_0x051c:
            r25 = r5
        L_0x051e:
            A0A(r25)
            A0A(r4)
            if (r8 != 0) goto L_0x0529
            r24.delete()
        L_0x0529:
            throw r0
        L_0x052a:
            r0 = move-exception
            r3 = r25
            goto L_0x0548
        L_0x052e:
            r2 = move-exception
            r3 = r25
            goto L_0x0533
        L_0x0532:
            r2 = move-exception
        L_0x0533:
            r25 = r1
            goto L_0x053d
        L_0x0536:
            r0 = move-exception
            r3 = r25
            goto L_0x054a
        L_0x053a:
            r2 = move-exception
            r3 = r25
        L_0x053d:
            java.lang.String r1 = "Failed to copy original file to temp file"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0545 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0545 }
            throw r0     // Catch:{ all -> 0x0545 }
        L_0x0545:
            r0 = move-exception
            goto L_0x054a
        L_0x0547:
            r0 = move-exception
        L_0x0548:
            r25 = r1
        L_0x054a:
            A0A(r25)
            A0A(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0YU.A0I():void");
    }

    public final void A0J() {
        String A0H2 = A0H("DateTimeOriginal");
        if (A0H2 != null && A0H("DateTime") == null) {
            this.A0I[0].put("DateTime", AnonymousClass0XT.A00(A0H2));
        }
        A08(this, "ImageWidth");
        A08(this, "ImageLength");
        A08(this, "Orientation");
        if (A0H("LightSource") == null) {
            A07(this, "LightSource", this.A0I[1]);
        }
    }

    public final void A0M(int i, int i2) {
        String str;
        HashMap[] hashMapArr = this.A0I;
        HashMap hashMap = hashMapArr[i];
        if (!hashMap.isEmpty() && !hashMapArr[i2].isEmpty()) {
            AnonymousClass0XT A032 = A03("ImageLength", hashMap);
            AnonymousClass0XT A033 = A03("ImageWidth", hashMapArr[i]);
            AnonymousClass0XT A034 = A03("ImageLength", hashMapArr[i2]);
            AnonymousClass0XT A035 = A03("ImageWidth", hashMapArr[i2]);
            if (A032 == null || A033 == null) {
                if (A0U) {
                    str = "First image does not contain valid size information";
                } else {
                    return;
                }
            } else if (A034 != null && A035 != null) {
                int A002 = A00(A032, this);
                int A003 = A00(A033, this);
                int A004 = A00(A034, this);
                int A005 = A00(A035, this);
                if (A002 < A004 && A003 < A005) {
                    HashMap hashMap2 = hashMapArr[i];
                    hashMapArr[i] = hashMapArr[i2];
                    hashMapArr[i2] = hashMap2;
                    return;
                }
                return;
            } else if (A0U) {
                str = "Second image does not contain valid size information";
            } else {
                return;
            }
        } else if (A0U) {
            str = "Cannot perform swap since only one image data exists";
        } else {
            return;
        }
        Log.d("ExifInterface", str);
    }

    public final void A0N(int i, String str, String str2) {
        HashMap[] hashMapArr = this.A0I;
        HashMap hashMap = hashMapArr[i];
        if (!hashMap.isEmpty() && hashMap.get(str) != null) {
            HashMap hashMap2 = hashMapArr[i];
            hashMap2.put(str2, hashMap2.get(str));
            hashMapArr[i].remove(str);
        }
    }

    public final void A0P(AnonymousClass0FE r21) {
        long[] jArr;
        long[] jArr2;
        String str;
        int length;
        int length2;
        String str2;
        StringBuilder A0o2;
        long[] jArr3;
        long[] jArr4;
        AnonymousClass0XT A032;
        int A002;
        HashMap hashMap = this.A0I[4];
        AnonymousClass0XT A033 = A03("Compression", hashMap);
        AnonymousClass0FE r10 = r21;
        if (A033 != null) {
            int A003 = A00(A033, this);
            this.A05 = A003;
            if (A003 != 1) {
                if (A003 != 6) {
                    if (A003 != 7) {
                        return;
                    }
                }
            }
            AnonymousClass0XT A034 = A03("BitsPerSample", hashMap);
            if (A034 != null) {
                int[] iArr = (int[]) A034.A05(this.A0B);
                int[] iArr2 = A0s;
                if (Arrays.equals(iArr2, iArr) || (this.A00 == 3 && (A032 = A03("PhotometricInterpretation", hashMap)) != null && ((A002 = A00(A032, this)) != 1 ? !(A002 != 6 || !Arrays.equals(iArr, iArr2)) : Arrays.equals(iArr, A0r)))) {
                    AnonymousClass0XT A035 = A03("StripOffsets", hashMap);
                    AnonymousClass0XT A036 = A03("StripByteCounts", hashMap);
                    if (A035 != null && A036 != null) {
                        Object A052 = A035.A05(this.A0B);
                        if (A052 instanceof int[]) {
                            int[] iArr3 = (int[]) A052;
                            int length3 = iArr3.length;
                            jArr = new long[length3];
                            for (int i = 0; i < length3; i++) {
                                jArr[i] = (long) iArr3[i];
                            }
                        } else {
                            if (A052 instanceof long[]) {
                                jArr4 = (long[]) A052;
                            } else {
                                jArr4 = null;
                            }
                            jArr = jArr4;
                        }
                        Object A053 = A036.A05(this.A0B);
                        if (A053 instanceof int[]) {
                            int[] iArr4 = (int[]) A053;
                            int length4 = iArr4.length;
                            jArr2 = new long[length4];
                            for (int i2 = 0; i2 < length4; i2++) {
                                jArr2[i2] = (long) iArr4[i2];
                            }
                        } else {
                            if (A053 instanceof long[]) {
                                jArr3 = (long[]) A053;
                            } else {
                                jArr3 = null;
                            }
                            jArr2 = jArr3;
                        }
                        if (jArr == null || (length = jArr.length) == 0) {
                            str = "stripOffsets should not be null or have zero length.";
                        } else if (jArr2 == null || (length2 = jArr2.length) == 0) {
                            str = "stripByteCounts should not be null or have zero length.";
                        } else if (length != length2) {
                            str = "stripOffsets and stripByteCounts should have same length.";
                        } else {
                            long j = 0;
                            int i3 = 0;
                            do {
                                j += jArr2[i3];
                                i3++;
                            } while (i3 < length2);
                            int i4 = (int) j;
                            byte[] bArr = new byte[i4];
                            int i5 = 1;
                            this.A0D = true;
                            this.A0F = true;
                            this.A0E = true;
                            int i6 = 0;
                            int i7 = 0;
                            int i8 = 0;
                            do {
                                int i9 = (int) jArr[i6];
                                int i10 = (int) jArr2[i6];
                                if (i6 < length - i5 && ((long) (i9 + i10)) != jArr[i6 + 1]) {
                                    this.A0D = false;
                                }
                                int i11 = i9 - i7;
                                if (i11 < 0) {
                                    str2 = "Invalid strip offset value";
                                } else {
                                    long j2 = (long) i11;
                                    if (r10.skip(j2) != j2) {
                                        A0o2 = AnonymousClass001.A0o();
                                        A0o2.append("Failed to skip ");
                                        A0o2.append(i11);
                                    } else {
                                        int i12 = i7 + i11;
                                        byte[] bArr2 = new byte[i10];
                                        if (r10.read(bArr2) != i10) {
                                            A0o2 = AnonymousClass001.A0o();
                                            A0o2.append("Failed to read ");
                                            A0o2.append(i10);
                                        } else {
                                            i7 = i12 + i10;
                                            System.arraycopy(bArr2, 0, bArr, i8, i10);
                                            i8 += i10;
                                            i6++;
                                            i5 = 1;
                                        }
                                    }
                                    str2 = AnonymousClass000.A0X(" bytes.", A0o2);
                                }
                                Log.d("ExifInterface", str2);
                                return;
                            } while (i6 < length);
                            this.A0H = bArr;
                            if (this.A0D) {
                                this.A07 = (int) jArr[0];
                                this.A06 = i4;
                                return;
                            }
                            return;
                        }
                        Log.w("ExifInterface", str);
                        return;
                    }
                    return;
                }
            }
            if (A0U) {
                Log.d("ExifInterface", "Unsupported data type value");
                return;
            }
            return;
        }
        this.A05 = 6;
        AnonymousClass0XT A037 = A03("JPEGInterchangeFormat", hashMap);
        AnonymousClass0XT A038 = A03("JPEGInterchangeFormatLength", hashMap);
        if (A037 != null && A038 != null) {
            int A004 = A00(A037, this);
            int A005 = A00(A038, this);
            if (this.A00 == 7) {
                A004 += this.A02;
            }
            if (A004 > 0 && A005 > 0) {
                this.A0E = true;
                if (this.A0A == null && this.A08 == null && this.A09 == null) {
                    byte[] bArr3 = new byte[A005];
                    r10.skip((long) A004);
                    r10.read(bArr3);
                    this.A0H = bArr3;
                }
                this.A07 = A004;
                this.A06 = A005;
            }
            if (A0U) {
                StringBuilder A0o3 = AnonymousClass001.A0o();
                A0o3.append("Setting thumbnail attributes with offset: ");
                A0o3.append(A004);
                Log.d("ExifInterface", AnonymousClass000.A0Y(", length: ", A0o3, A005));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00dd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x009b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0Q(X.AnonymousClass0FE r25, int r26, int r27) {
        /*
            r24 = this;
            boolean r17 = A0U
            java.lang.String r6 = "ExifInterface"
            r7 = r25
            if (r17 == 0) goto L_0x0011
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "getJpegAttributes starting with: "
            X.AnonymousClass000.A19(r7, r0, r6, r1)
        L_0x0011:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r7.A01 = r0
            byte r0 = r7.readByte()
            java.lang.String r2 = "Invalid marker: "
            r5 = -1
            if (r0 != r5) goto L_0x01b2
            byte r1 = r7.readByte()
            r0 = -40
            if (r1 != r0) goto L_0x019f
            r10 = 2
            r8 = 2
        L_0x0028:
            byte r2 = r7.readByte()
            if (r2 != r5) goto L_0x0187
            r9 = 1
            int r3 = r8 + 1
            byte r1 = r7.readByte()
            if (r17 == 0) goto L_0x004d
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Found JPEG segment indicator: "
            r2.append(r0)
            r0 = r1 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r2)
            android.util.Log.d(r6, r0)
        L_0x004d:
            int r4 = r3 + 1
            r0 = -39
            r2 = r24
            if (r1 == r0) goto L_0x0182
            r0 = -38
            if (r1 == r0) goto L_0x0182
            int r3 = r7.readUnsignedShort()
            int r3 = r3 - r10
            int r8 = r4 + 2
            if (r17 == 0) goto L_0x0081
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "JPEG segment: "
            r4.append(r0)
            r0 = r1 & 255(0xff, float:3.57E-43)
            X.AnonymousClass001.A1N(r4, r0)
            java.lang.String r0 = " (length: "
            r4.append(r0)
            int r0 = r3 + 2
            r4.append(r0)
            java.lang.String r0 = X.AnonymousClass000.A0e(r4)
            android.util.Log.d(r6, r0)
        L_0x0081:
            java.lang.String r16 = "Invalid length"
            if (r3 < 0) goto L_0x017d
            r0 = -31
            r15 = 0
            r10 = r27
            if (r1 == r0) goto L_0x010b
            r0 = -2
            if (r1 == r0) goto L_0x00e8
            switch(r1) {
                case -64: goto L_0x00a1;
                case -63: goto L_0x00a1;
                case -62: goto L_0x00a1;
                case -61: goto L_0x00a1;
                default: goto L_0x0092;
            }
        L_0x0092:
            switch(r1) {
                case -59: goto L_0x00a1;
                case -58: goto L_0x00a1;
                case -57: goto L_0x00a1;
                default: goto L_0x0095;
            }
        L_0x0095:
            switch(r1) {
                case -55: goto L_0x00a1;
                case -54: goto L_0x00a1;
                case -53: goto L_0x00a1;
                default: goto L_0x0098;
            }
        L_0x0098:
            switch(r1) {
                case -51: goto L_0x00a1;
                case -50: goto L_0x00a1;
                case -49: goto L_0x00a1;
                default: goto L_0x009b;
            }
        L_0x009b:
            r7.A00(r3)
            int r8 = r8 + r3
            r10 = 2
            goto L_0x0028
        L_0x00a1:
            r7.A00(r9)
            java.util.HashMap[] r13 = r2.A0I
            r12 = r13[r27]
            r11 = 4
            if (r10 == r11) goto L_0x00e5
            java.lang.String r9 = "ImageLength"
        L_0x00ad:
            int r0 = r7.readUnsignedShort()
            long r0 = (long) r0
            java.nio.ByteOrder r14 = r2.A0B
            r4 = 1
            long[] r4 = new long[r4]
            r4[r15] = r0
            X.0XT r0 = X.AnonymousClass0XT.A03(r14, r4)
            r12.put(r9, r0)
            r9 = r13[r27]
            if (r10 == r11) goto L_0x00e2
            java.lang.String r10 = "ImageWidth"
        L_0x00c6:
            int r0 = r7.readUnsignedShort()
            long r0 = (long) r0
            java.nio.ByteOrder r4 = r2.A0B
            r2 = 1
            long[] r2 = new long[r2]
            r2[r15] = r0
            X.0XT r0 = X.AnonymousClass0XT.A03(r4, r2)
            r9.put(r10, r0)
            int r3 = r3 + -5
            if (r3 >= 0) goto L_0x009b
            java.io.IOException r0 = X.AnonymousClass002.A0C(r16)
            throw r0
        L_0x00e2:
            java.lang.String r10 = "ThumbnailImageWidth"
            goto L_0x00c6
        L_0x00e5:
            java.lang.String r9 = "ThumbnailImageLength"
            goto L_0x00ad
        L_0x00e8:
            byte[] r4 = new byte[r3]
            int r0 = r7.read(r4)
            if (r0 != r3) goto L_0x0176
            java.lang.String r3 = "UserComment"
            java.lang.String r0 = r2.A0H(r3)
            if (r0 != 0) goto L_0x0173
            java.util.HashMap[] r0 = r2.A0I
            r2 = r0[r9]
            java.nio.charset.Charset r1 = A0L
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r1)
            X.0XT r0 = X.AnonymousClass0XT.A00(r0)
            r2.put(r3, r0)
            goto L_0x0173
        L_0x010b:
            byte[] r12 = new byte[r3]
            r7.readFully(r12)
            int r14 = r8 + r3
            byte[] r13 = A0Z
            if (r13 == 0) goto L_0x0125
            int r11 = r13.length
            if (r3 < r11) goto L_0x0125
            r4 = 0
        L_0x011a:
            if (r4 >= r11) goto L_0x0160
            byte r1 = r12[r4]
            byte r0 = r13[r4]
            if (r1 != r0) goto L_0x0125
            int r4 = r4 + 1
            goto L_0x011a
        L_0x0125:
            byte[] r11 = A0a
            if (r11 == 0) goto L_0x0172
            int r10 = r11.length
            if (r3 < r10) goto L_0x0172
            r4 = 0
        L_0x012d:
            if (r4 >= r10) goto L_0x0138
            byte r1 = r12[r4]
            byte r0 = r11[r4]
            if (r1 != r0) goto L_0x0172
            int r4 = r4 + 1
            goto L_0x012d
        L_0x0138:
            int r8 = r8 + r10
            byte[] r12 = java.util.Arrays.copyOfRange(r12, r10, r3)
            java.lang.String r11 = "Xmp"
            java.lang.String r0 = r2.A0H(r11)
            if (r0 != 0) goto L_0x0172
            java.util.HashMap[] r0 = r2.A0I
            r10 = r0[r15]
            int r4 = r12.length
            long r0 = (long) r8
            X.0XT r3 = new X.0XT
            r18 = r3
            r19 = r0
            r21 = r12
            r22 = r9
            r23 = r4
            r18.<init>(r19, r21, r22, r23)
            r10.put(r11, r3)
            r2.A0G = r9
            goto L_0x0172
        L_0x0160:
            byte[] r1 = java.util.Arrays.copyOfRange(r12, r11, r3)
            int r0 = r26 + r8
            int r0 = r0 + r11
            A09(r2, r1, r0, r10)
            X.0FE r0 = new X.0FE
            r0.<init>(r1)
            r2.A0P(r0)
        L_0x0172:
            r8 = r14
        L_0x0173:
            r3 = 0
            goto L_0x009b
        L_0x0176:
            java.lang.String r0 = "Invalid exif"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)
            throw r0
        L_0x017d:
            java.io.IOException r0 = X.AnonymousClass002.A0C(r16)
            throw r0
        L_0x0182:
            java.nio.ByteOrder r0 = r2.A0B
            r7.A01 = r0
            return
        L_0x0187:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid marker:"
            r1.append(r0)
            r0 = r2 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)
            throw r0
        L_0x019f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r2)
            r0 = 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)
            throw r0
        L_0x01b2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r2)
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0YU.A0Q(X.0FE, int, int):void");
    }

    public final void A0S(AnonymousClass0FB r20) {
        byte[] bArr;
        long j;
        int length = A17.length;
        int[] iArr = new int[length];
        int[] iArr2 = new int[length];
        AnonymousClass0TF[] r10 = A0u;
        int length2 = r10.length;
        int i = 0;
        while (true) {
            if (i >= length2) {
                break;
            }
            A0Y(r10[i].A03);
            i++;
        }
        if (this.A0E) {
            if (this.A0F) {
                A0Y("StripOffsets");
                A0Y("StripByteCounts");
            } else {
                A0Y("JPEGInterchangeFormat");
                A0Y("JPEGInterchangeFormatLength");
            }
        }
        for (int i2 = 0; i2 < length; i2++) {
            HashMap[] hashMapArr = this.A0I;
            for (Object obj : hashMapArr[i2].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    hashMapArr[i2].remove(entry.getKey());
                }
            }
        }
        HashMap[] hashMapArr2 = this.A0I;
        if (!hashMapArr2[1].isEmpty()) {
            A07(this, r10[1].A03, hashMapArr2[0]);
        }
        if (!hashMapArr2[2].isEmpty()) {
            A07(this, r10[2].A03, hashMapArr2[0]);
        }
        if (!hashMapArr2[3].isEmpty()) {
            A07(this, r10[3].A03, hashMapArr2[1]);
        }
        if (this.A0E) {
            boolean z = this.A0F;
            HashMap hashMap = hashMapArr2[4];
            if (z) {
                hashMap.put("StripOffsets", AnonymousClass0XT.A02(this.A0B, new int[]{0}));
                hashMapArr2[4].put("StripByteCounts", AnonymousClass0XT.A02(this.A0B, new int[]{this.A06}));
            } else {
                A07(this, "JPEGInterchangeFormat", hashMap);
                hashMapArr2[4].put("JPEGInterchangeFormatLength", AnonymousClass0XT.A03(this.A0B, new long[]{(long) this.A06}));
            }
        }
        for (int i3 = 0; i3 < length; i3++) {
            Iterator A0u2 = AnonymousClass001.A0u(hashMapArr2[i3]);
            int i4 = 0;
            while (A0u2.hasNext()) {
                AnonymousClass0XT r14 = (AnonymousClass0XT) AnonymousClass001.A0w(A0u2).getValue();
                int i5 = A0t[r14.A00] * r14.A01;
                if (i5 > 4) {
                    i4 += i5;
                }
            }
            iArr2[i3] = iArr2[i3] + i4;
        }
        int i6 = 8;
        for (int i7 = 0; i7 < length; i7++) {
            if (!hashMapArr2[i7].isEmpty()) {
                iArr[i7] = i6;
                i6 += (hashMapArr2[i7].size() * 12) + 2 + 4 + iArr2[i7];
            }
        }
        if (this.A0E) {
            boolean z2 = this.A0F;
            HashMap hashMap2 = hashMapArr2[4];
            if (z2) {
                hashMap2.put("StripOffsets", AnonymousClass0XT.A02(this.A0B, new int[]{i6}));
            } else {
                hashMap2.put("JPEGInterchangeFormat", AnonymousClass0XT.A03(this.A0B, new long[]{(long) i6}));
            }
            this.A07 = i6;
            i6 += this.A06;
        }
        if (this.A00 == 4) {
            i6 += 8;
        }
        if (A0U) {
            for (int i8 = 0; i8 < length; i8++) {
                Object[] objArr = new Object[5];
                AnonymousClass000.A1P(objArr, i8, 0);
                AnonymousClass000.A1P(objArr, iArr[i8], 1);
                AnonymousClass000.A1P(objArr, hashMapArr2[i8].size(), 2);
                AnonymousClass000.A1O(objArr, iArr2[i8]);
                AnonymousClass000.A1P(objArr, i6, 4);
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", objArr));
            }
        }
        if (!hashMapArr2[1].isEmpty()) {
            hashMapArr2[0].put(r10[1].A03, AnonymousClass0XT.A03(this.A0B, new long[]{(long) iArr[1]}));
        }
        if (!hashMapArr2[2].isEmpty()) {
            hashMapArr2[0].put(r10[2].A03, AnonymousClass0XT.A03(this.A0B, new long[]{(long) iArr[2]}));
        }
        if (!hashMapArr2[3].isEmpty()) {
            hashMapArr2[1].put(r10[3].A03, AnonymousClass0XT.A03(this.A0B, new long[]{(long) iArr[3]}));
        }
        int i9 = this.A00;
        AnonymousClass0FB r102 = r20;
        if (i9 == 4) {
            r102.A01((short) i6);
            bArr = A0Z;
            r102.write(bArr);
        } else if (i9 == 13) {
            r102.A00(i6);
            bArr = A0e;
            r102.write(bArr);
        } else if (i9 == 14) {
            r102.write(A0k);
            r102.A00(i6);
        }
        ByteOrder byteOrder = this.A0B;
        ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
        short s = 18761;
        if (byteOrder == byteOrder2) {
            s = 19789;
        }
        r102.A01(s);
        r102.A00 = this.A0B;
        r102.A01((short) 42);
        r102.A00((int) 8);
        for (int i10 = 0; i10 < length; i10++) {
            if (!hashMapArr2[i10].isEmpty()) {
                r102.A01((short) hashMapArr2[i10].size());
                HashMap hashMap3 = hashMapArr2[i10];
                int size = iArr[i10] + 2 + (hashMap3.size() * 12) + 4;
                Iterator A0u3 = AnonymousClass001.A0u(hashMap3);
                while (A0u3.hasNext()) {
                    Map.Entry A0w2 = AnonymousClass001.A0w(A0u3);
                    int i11 = ((AnonymousClass0TF) A16[i10].get(A0w2.getKey())).A00;
                    AnonymousClass0XT r15 = (AnonymousClass0XT) A0w2.getValue();
                    int[] iArr3 = A0t;
                    int i12 = r15.A00;
                    int i13 = iArr3[i12];
                    int i14 = r15.A01;
                    int i15 = i13 * i14;
                    r102.A01((short) i11);
                    r102.A01((short) i12);
                    r102.A00(i14);
                    if (i15 > 4) {
                        r102.A00((int) ((long) size));
                        size += i15;
                    } else {
                        r102.write(r15.A03);
                        while (i15 < 4) {
                            r102.A01.write(0);
                            i15++;
                        }
                    }
                }
                if (i10 != 0 || hashMapArr2[4].isEmpty()) {
                    j = 0;
                } else {
                    j = (long) iArr[4];
                }
                r102.A00((int) j);
                Iterator A0u4 = AnonymousClass001.A0u(hashMapArr2[i10]);
                while (A0u4.hasNext()) {
                    byte[] bArr2 = ((AnonymousClass0XT) AnonymousClass001.A0w(A0u4).getValue()).A03;
                    int length3 = bArr2.length;
                    if (length3 > 4) {
                        r102.write(bArr2, 0, length3);
                    }
                }
            }
        }
        if (this.A0E) {
            r102.write(A0b());
        }
        if (this.A00 == 14 && i6 % 2 == 1) {
            r102.A01.write(0);
        }
        r102.A00 = byteOrder2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ee, code lost:
        if (r10 == 7) goto L_0x01f0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0U(X.C009207f r32, int r33) {
        /*
            r31 = this;
            r8 = r31
            java.util.Set r0 = r8.A0C
            r30 = r0
            r9 = r32
            int r0 = r9.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = r30
            r0.add(r1)
            short r23 = r9.readShort()
            boolean r22 = A0U
            java.lang.String r7 = "ExifInterface"
            if (r22 == 0) goto L_0x002c
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "numberOfDirectoryEntry: "
            r0 = r23
            java.lang.String r0 = X.AnonymousClass000.A0Y(r1, r2, r0)
            android.util.Log.d(r7, r0)
        L_0x002c:
            if (r23 <= 0) goto L_0x032c
            r5 = 0
            r21 = 0
        L_0x0031:
            r4 = 5
            r1 = r21
            r0 = r23
            if (r1 >= r0) goto L_0x02cd
            int r0 = r9.readUnsignedShort()
            int r10 = r9.readUnsignedShort()
            int r15 = r9.readInt()
            int r1 = r9.A00
            long r2 = (long) r1
            r16 = 4
            long r2 = r2 + r16
            java.util.HashMap[] r1 = A15
            r1 = r1[r33]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            java.lang.Object r6 = r1.get(r11)
            X.0TF r6 = (X.AnonymousClass0TF) r6
            r12 = 3
            if (r22 == 0) goto L_0x0080
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r1 = r33
            X.AnonymousClass000.A1P(r4, r1, r5)
            r1 = 1
            r4[r1] = r11
            if (r6 == 0) goto L_0x02ca
            java.lang.String r5 = r6.A03
        L_0x006a:
            r1 = 2
            r4[r1] = r5
            X.AnonymousClass000.A1P(r4, r10, r12)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r15)
            r1 = 4
            r4[r1] = r5
            java.lang.String r1 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"
            java.lang.String r1 = java.lang.String.format(r1, r4)
            android.util.Log.d(r7, r1)
        L_0x0080:
            r13 = 7
            if (r6 != 0) goto L_0x00a2
            if (r22 == 0) goto L_0x0098
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "Skip the tag entry since tag number is not defined: "
            r1.append(r4)
            r1.append(r0)
        L_0x0091:
            java.lang.String r0 = r1.toString()
        L_0x0095:
            android.util.Log.d(r7, r0)
        L_0x0098:
            r9.A01(r2)
        L_0x009b:
            int r0 = r21 + 1
            short r0 = (short) r0
            r21 = r0
            r5 = 0
            goto L_0x0031
        L_0x00a2:
            if (r10 <= 0) goto L_0x02ba
            int[] r1 = A0t
            int r0 = r1.length
            if (r10 >= r0) goto L_0x02ba
            int r5 = r6.A01
            if (r5 == r13) goto L_0x01ee
            if (r10 == r13) goto L_0x01f0
            if (r5 == r10) goto L_0x01ee
            int r4 = r6.A02
            if (r4 == r10) goto L_0x01ee
            r0 = 4
            if (r5 == r0) goto L_0x00ba
            if (r4 != r0) goto L_0x01e2
        L_0x00ba:
            if (r10 != r12) goto L_0x01e2
        L_0x00bc:
            long r4 = (long) r15
            r0 = r1[r10]
            long r0 = (long) r0
            long r4 = r4 * r0
            r12 = 0
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x028c
            r12 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x028c
            java.lang.String r20 = "Compression"
            int r0 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00fc
            int r12 = r9.readInt()
            if (r22 == 0) goto L_0x00e7
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "seek to data offset: "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r12)
            android.util.Log.d(r7, r0)
        L_0x00e7:
            int r1 = r8.A00
            r0 = 7
            if (r1 != r0) goto L_0x00f8
            java.lang.String r1 = r6.A03
            java.lang.String r0 = "MakerNote"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0187
            r8.A02 = r12
        L_0x00f8:
            long r0 = (long) r12
            r9.A01(r0)
        L_0x00fc:
            java.util.HashMap r0 = A0M
            java.lang.Object r12 = r0.get(r11)
            java.lang.Number r12 = (java.lang.Number) r12
            if (r22 == 0) goto L_0x011b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "nextIfdType: "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = " byteCount: "
            java.lang.String r0 = X.AnonymousClass000.A0Z(r0, r1, r4)
            android.util.Log.d(r7, r0)
        L_0x011b:
            r11 = 8
            if (r12 == 0) goto L_0x0223
            r0 = 3
            if (r10 == r0) goto L_0x017c
            r0 = 4
            if (r10 == r0) goto L_0x0170
            if (r10 == r11) goto L_0x016b
            r0 = 9
            if (r10 == r0) goto L_0x0181
            r0 = 13
            if (r10 == r0) goto L_0x0181
            r0 = -1
        L_0x0131:
            if (r22 == 0) goto L_0x014c
            java.lang.Object[] r10 = X.AnonymousClass002.A0M()
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            r4 = 0
            r10[r4] = r5
            java.lang.String r5 = r6.A03
            r4 = 1
            r10[r4] = r5
            java.lang.String r4 = "Offset: %d, tagName: %s"
            java.lang.String r4 = java.lang.String.format(r4, r10)
            android.util.Log.d(r7, r4)
        L_0x014c:
            r5 = 0
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x020f
            int r4 = (int) r0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r4 = r30
            boolean r4 = r4.contains(r5)
            if (r4 != 0) goto L_0x01f3
            r9.A01(r0)
            int r0 = r12.intValue()
            r8.A0U(r9, r0)
            goto L_0x0098
        L_0x016b:
            short r0 = r9.readShort()
            goto L_0x0185
        L_0x0170:
            int r0 = r9.readInt()
            long r0 = (long) r0
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r4
            goto L_0x0131
        L_0x017c:
            int r0 = r9.readUnsignedShort()
            goto L_0x0185
        L_0x0181:
            int r0 = r9.readInt()
        L_0x0185:
            long r0 = (long) r0
            goto L_0x0131
        L_0x0187:
            r13 = 6
            r0 = r33
            if (r0 != r13) goto L_0x00f8
            java.lang.String r0 = "ThumbnailImage"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00f8
            r8.A04 = r12
            r8.A03 = r15
            java.nio.ByteOrder r1 = r8.A0B
            r0 = 1
            int[] r0 = new int[r0]
            r16 = 0
            r0[r16] = r13
            X.0XT r19 = X.AnonymousClass0XT.A02(r1, r0)
            int r0 = r8.A04
            long r0 = (long) r0
            java.nio.ByteOrder r14 = r8.A0B
            r13 = 1
            long[] r13 = new long[r13]
            r13[r16] = r0
            X.0XT r18 = X.AnonymousClass0XT.A03(r14, r13)
            int r0 = r8.A03
            long r0 = (long) r0
            java.nio.ByteOrder r14 = r8.A0B
            r13 = 1
            long[] r13 = new long[r13]
            r13[r16] = r0
            X.0XT r17 = X.AnonymousClass0XT.A03(r14, r13)
            java.util.HashMap[] r13 = r8.A0I
            r16 = 4
            r14 = r13[r16]
            r1 = r20
            r0 = r19
            r14.put(r1, r0)
            r14 = r13[r16]
            java.lang.String r1 = "JPEGInterchangeFormat"
            r0 = r18
            r14.put(r1, r0)
            r13 = r13[r16]
            java.lang.String r1 = "JPEGInterchangeFormatLength"
            r0 = r17
            r13.put(r1, r0)
            goto L_0x00f8
        L_0x01e2:
            r0 = 9
            if (r5 == r0) goto L_0x01e8
            if (r4 != r0) goto L_0x029c
        L_0x01e8:
            r0 = 8
            if (r10 != r0) goto L_0x029c
            goto L_0x00bc
        L_0x01ee:
            if (r10 != r13) goto L_0x00bc
        L_0x01f0:
            r10 = r5
            goto L_0x00bc
        L_0x01f3:
            if (r22 == 0) goto L_0x0098
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "Skip jump into the IFD since it has already been read: IfdType "
            r5.append(r4)
            r5.append(r12)
            java.lang.String r4 = " (at "
            r5.append(r4)
            r5.append(r0)
            java.lang.String r0 = ")"
            r5.append(r0)
            goto L_0x021d
        L_0x020f:
            if (r22 == 0) goto L_0x0098
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "Skip jump into the IFD since its offset is invalid: "
            r5.append(r4)
            r5.append(r0)
        L_0x021d:
            java.lang.String r0 = r5.toString()
            goto L_0x0095
        L_0x0223:
            int r1 = r9.A00
            int r0 = r8.A01
            int r1 = r1 + r0
            int r0 = (int) r4
            byte[] r5 = new byte[r0]
            r9.readFully(r5)
            long r0 = (long) r1
            X.0XT r4 = new X.0XT
            r24 = r4
            r25 = r0
            r27 = r5
            r28 = r10
            r29 = r15
            r24.<init>(r25, r27, r28, r29)
            java.util.HashMap[] r0 = r8.A0I
            r0 = r0[r33]
            java.lang.String r5 = r6.A03
            r0.put(r5, r4)
            java.lang.String r0 = "DNGVersion"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0252
            r0 = 3
            r8.A00 = r0
        L_0x0252:
            java.lang.String r0 = "Make"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0262
            java.lang.String r0 = "Model"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0270
        L_0x0262:
            java.nio.ByteOrder r0 = r8.A0B
            java.lang.String r1 = r4.A06(r0)
            java.lang.String r0 = "PENTAX"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0281
        L_0x0270:
            r0 = r20
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0283
            int r1 = A00(r4, r8)
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r1 != r0) goto L_0x0283
        L_0x0281:
            r8.A00 = r11
        L_0x0283:
            int r0 = r9.A00
            long r0 = (long) r0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x009b
            goto L_0x0098
        L_0x028c:
            if (r22 == 0) goto L_0x0098
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Skip the tag entry since the number of components is invalid: "
            r1.append(r0)
            r1.append(r15)
            goto L_0x0091
        L_0x029c:
            if (r22 == 0) goto L_0x0098
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Skip the tag entry since data format ("
            r1.append(r0)
            java.lang.String[] r0 = A14
            r0 = r0[r10]
            r1.append(r0)
            java.lang.String r0 = ") is unexpected for tag: "
            r1.append(r0)
            java.lang.String r0 = r6.A03
            r1.append(r0)
            goto L_0x0091
        L_0x02ba:
            if (r22 == 0) goto L_0x0098
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Skip the tag entry since data format is invalid: "
            r1.append(r0)
            r1.append(r10)
            goto L_0x0091
        L_0x02ca:
            r5 = 0
            goto L_0x006a
        L_0x02cd:
            int r10 = r9.readInt()
            if (r22 == 0) goto L_0x02e3
            java.lang.Object[] r1 = X.AnonymousClass002.A0L()
            X.AnonymousClass000.A1P(r1, r10, r5)
            java.lang.String r0 = "nextIfdOffset: %d"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            android.util.Log.d(r7, r0)
        L_0x02e3:
            long r1 = (long) r10
            r5 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x031d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r0 = r30
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L_0x0314
            r9.A01(r1)
            java.util.HashMap[] r2 = r8.A0I
            r1 = 4
            r0 = r2[r1]
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0308
            r8.A0U(r9, r1)
            return
        L_0x0308:
            r0 = r2[r4]
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x032c
            r8.A0U(r9, r4)
            return
        L_0x0314:
            if (r22 == 0) goto L_0x032c
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            goto L_0x0325
        L_0x031d:
            if (r22 == 0) goto L_0x032c
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Stop reading file since a wrong offset may cause an infinite loop: "
        L_0x0325:
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r10)
            android.util.Log.d(r7, r0)
        L_0x032c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0YU.A0U(X.07f, int):void");
    }

    public final void A0V(C009207f r13, int i) {
        StringBuilder sb;
        String str;
        AnonymousClass0XT A022;
        AnonymousClass0XT A023;
        HashMap[] hashMapArr = this.A0I;
        AnonymousClass0XT A032 = A03("DefaultCropSize", hashMapArr[i]);
        AnonymousClass0XT A033 = A03("SensorTopBorder", hashMapArr[i]);
        AnonymousClass0XT A034 = A03("SensorLeftBorder", hashMapArr[i]);
        AnonymousClass0XT A035 = A03("SensorBottomBorder", hashMapArr[i]);
        AnonymousClass0XT A036 = A03("SensorRightBorder", hashMapArr[i]);
        if (A032 != null) {
            int i2 = A032.A00;
            Object A052 = A032.A05(this.A0B);
            if (i2 == 5) {
                AnonymousClass0NB[] r8 = (AnonymousClass0NB[]) A052;
                if (r8 == null || r8.length != 2) {
                    sb = AnonymousClass000.A0l("Invalid crop size values. cropSize=");
                    str = Arrays.toString(r8);
                    AnonymousClass000.A1F(str, "ExifInterface", sb);
                    return;
                }
                AnonymousClass0NB r2 = r8[0];
                A022 = AnonymousClass0XT.A04(this.A0B, new AnonymousClass0NB[]{r2});
                AnonymousClass0NB r22 = r8[1];
                A023 = AnonymousClass0XT.A04(this.A0B, new AnonymousClass0NB[]{r22});
            } else {
                int[] iArr = (int[]) A052;
                if (iArr == null || iArr.length != 2) {
                    sb = AnonymousClass000.A0l("Invalid crop size values. cropSize=");
                    str = Arrays.toString(iArr);
                    AnonymousClass000.A1F(str, "ExifInterface", sb);
                    return;
                }
                int i3 = iArr[0];
                A022 = AnonymousClass0XT.A02(this.A0B, new int[]{i3});
                int i4 = iArr[1];
                A023 = AnonymousClass0XT.A02(this.A0B, new int[]{i4});
            }
            hashMapArr[i].put("ImageWidth", A022);
            hashMapArr[i].put("ImageLength", A023);
        } else if (A033 == null || A034 == null || A035 == null || A036 == null) {
            Object obj = hashMapArr[i].get("ImageLength");
            Object obj2 = hashMapArr[i].get("ImageWidth");
            if (obj == null || obj2 == null) {
                AnonymousClass0XT A037 = A03("JPEGInterchangeFormat", hashMapArr[i]);
                Object obj3 = hashMapArr[i].get("JPEGInterchangeFormatLength");
                if (A037 != null && obj3 != null) {
                    int A002 = A00(A037, this);
                    int A003 = A00(A037, this);
                    r13.A01((long) A002);
                    byte[] bArr = new byte[A003];
                    r13.read(bArr);
                    A0Q(new AnonymousClass0FE(bArr), A002, i);
                }
            }
        } else {
            int A004 = A00(A033, this);
            int A005 = A00(A035, this);
            int A006 = A00(A036, this);
            int A007 = A00(A034, this);
            if (A005 > A004 && A006 > A007) {
                AnonymousClass0XT A024 = AnonymousClass0XT.A02(this.A0B, new int[]{A005 - A004});
                AnonymousClass0XT A025 = A02(this, A006 - A007);
                hashMapArr[i].put("ImageLength", A024);
                hashMapArr[i].put("ImageWidth", A025);
            }
        }
    }

    public final void A0X(String str) {
        if (str != null) {
            FileInputStream fileInputStream = null;
            this.A08 = null;
            this.A0A = str;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    AnonymousClass0V3.A02(fileInputStream2.getFD(), OsConstants.SEEK_CUR, 0);
                    this.A09 = fileInputStream2.getFD();
                } catch (Exception unused) {
                    if (A0U) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                    this.A09 = null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    A0A(fileInputStream);
                    throw th;
                }
                A0W(fileInputStream2);
                A0A(fileInputStream2);
            } catch (Throwable th2) {
                th = th2;
                A0A(fileInputStream);
                throw th;
            }
        } else {
            throw AnonymousClass001.A0g("filename cannot be null");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02db, code lost:
        r3.put(r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        if (r2 == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        if (r2 != false) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0Z(java.lang.String r18, java.lang.String r19) {
        /*
            r17 = this;
            r8 = r18
            r7 = r19
            if (r18 == 0) goto L_0x0304
            java.lang.String r0 = "DateTime"
            boolean r0 = r0.equals(r8)
            java.lang.String r6 = " : "
            java.lang.String r10 = "Invalid value for "
            java.lang.String r15 = "ExifInterface"
            if (r0 != 0) goto L_0x0024
            java.lang.String r0 = "DateTimeOriginal"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x0024
            java.lang.String r0 = "DateTimeDigitized"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x005c
        L_0x0024:
            if (r19 == 0) goto L_0x005c
            java.util.regex.Pattern r0 = A0Q
            java.util.regex.Matcher r0 = r0.matcher(r7)
            boolean r3 = r0.find()
            java.util.regex.Pattern r0 = A0R
            java.util.regex.Matcher r0 = r0.matcher(r7)
            boolean r2 = r0.find()
            int r1 = r7.length()
            r0 = 19
            if (r1 != r0) goto L_0x0046
            if (r3 != 0) goto L_0x0052
            if (r2 != 0) goto L_0x0054
        L_0x0046:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r10)
            java.lang.String r0 = X.AnonymousClass000.A0U(r8, r6, r7, r0)
            android.util.Log.w(r15, r0)
        L_0x0051:
            return
        L_0x0052:
            if (r2 == 0) goto L_0x005c
        L_0x0054:
            java.lang.String r1 = "-"
            java.lang.String r0 = ":"
            java.lang.String r7 = r7.replaceAll(r1, r0)
        L_0x005c:
            java.lang.String r0 = "ISOSpeedRatings"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x006f
            boolean r0 = A0U
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY."
            android.util.Log.d(r15, r0)
        L_0x006d:
            java.lang.String r8 = "PhotographicSensitivity"
        L_0x006f:
            r9 = 2
            r2 = 1
            if (r7 == 0) goto L_0x00c3
            java.util.HashSet r0 = A0N
            boolean r0 = r0.contains(r8)
            if (r0 == 0) goto L_0x00c3
            java.lang.String r0 = "GPSTimeStamp"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x02e0
            java.util.regex.Pattern r0 = A0S
            java.util.regex.Matcher r4 = r0.matcher(r7)
            boolean r0 = r4.find()
            if (r0 == 0) goto L_0x0046
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = r4.group(r2)
            int r0 = java.lang.Integer.parseInt(r0)
            r3.append(r0)
            java.lang.String r1 = "/1,"
            r3.append(r1)
            java.lang.String r0 = r4.group(r9)
            int r0 = java.lang.Integer.parseInt(r0)
            r3.append(r0)
            r3.append(r1)
            r0 = 3
            java.lang.String r0 = r4.group(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            r3.append(r0)
            java.lang.String r0 = "/1"
            java.lang.String r7 = X.AnonymousClass000.A0X(r0, r3)
        L_0x00c3:
            r1 = 0
            r6 = 0
        L_0x00c5:
            X.0TF[][] r0 = A17
            int r0 = r0.length
            if (r6 >= r0) goto L_0x0051
            r0 = 4
            r13 = r17
            if (r6 != r0) goto L_0x00d9
            boolean r0 = r13.A0E
            if (r0 != 0) goto L_0x00d9
        L_0x00d3:
            int r6 = r6 + 1
            r9 = 2
            r1 = 0
            r2 = 1
            goto L_0x00c5
        L_0x00d9:
            java.util.HashMap[] r0 = A16
            r0 = r0[r6]
            java.lang.Object r11 = r0.get(r8)
            X.0TF r11 = (X.AnonymousClass0TF) r11
            if (r11 == 0) goto L_0x00d3
            if (r7 != 0) goto L_0x00ef
            java.util.HashMap[] r0 = r13.A0I
            r0 = r0[r6]
            r0.remove(r8)
            goto L_0x00d3
        L_0x00ef:
            android.util.Pair r12 = A01(r7)
            int r0 = r11.A01
            r10 = r0
            java.lang.Object r3 = r12.first
            int r4 = X.AnonymousClass001.A0K(r3)
            r5 = -1
            if (r0 == r4) goto L_0x010f
            java.lang.Object r3 = r12.second
            int r3 = X.AnonymousClass001.A0K(r3)
            if (r0 == r3) goto L_0x010f
            int r0 = r11.A02
            if (r0 == r5) goto L_0x0128
            if (r0 == r4) goto L_0x010f
            if (r0 != r3) goto L_0x0128
        L_0x010f:
            java.lang.String r16 = "/"
            java.lang.String r3 = ","
            switch(r0) {
                case 1: goto L_0x0180;
                case 2: goto L_0x01c3;
                case 3: goto L_0x01cd;
                case 4: goto L_0x01ed;
                case 5: goto L_0x020e;
                case 6: goto L_0x0116;
                case 7: goto L_0x01c3;
                case 8: goto L_0x0116;
                case 9: goto L_0x0247;
                case 10: goto L_0x0281;
                default: goto L_0x0116;
            }
        L_0x0116:
            boolean r1 = A0U
            if (r1 == 0) goto L_0x00d3
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "Data format isn't one of expected formats: "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r1, r2, r0)
        L_0x0124:
            android.util.Log.d(r15, r0)
            goto L_0x00d3
        L_0x0128:
            if (r10 == r2) goto L_0x017e
            r11 = 7
            if (r10 == r11) goto L_0x017e
            if (r10 == r9) goto L_0x017e
            boolean r1 = A0U
            if (r1 == 0) goto L_0x00d3
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "Given tag ("
            r9.append(r1)
            r9.append(r8)
            java.lang.String r1 = ") value didn't match with one of expected formats: "
            r9.append(r1)
            java.lang.String[] r11 = A14
            r1 = r11[r10]
            r9.append(r1)
            java.lang.String r10 = ""
            java.lang.String r2 = ", "
            if (r0 != r5) goto L_0x0173
            r0 = r10
        L_0x0152:
            r9.append(r0)
            java.lang.String r0 = " (guess: "
            r9.append(r0)
            r0 = r11[r4]
            r9.append(r0)
            if (r3 == r5) goto L_0x016b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r2)
            r0 = r11[r3]
            java.lang.String r10 = X.AnonymousClass000.A0X(r0, r1)
        L_0x016b:
            r9.append(r10)
            java.lang.String r0 = X.AnonymousClass000.A0e(r9)
            goto L_0x0124
        L_0x0173:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r2)
            r0 = r11[r0]
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            goto L_0x0152
        L_0x017e:
            r0 = r10
            goto L_0x010f
        L_0x0180:
            java.util.HashMap[] r0 = r13.A0I
            r3 = r0[r6]
            int r0 = r7.length()
            if (r0 != r2) goto L_0x01b0
            char r0 = r7.charAt(r1)
            r5 = 48
            if (r0 < r5) goto L_0x01b0
            char r4 = r7.charAt(r1)
            r0 = 49
            if (r4 > r0) goto L_0x01b0
            byte[] r4 = new byte[r2]
            char r0 = r7.charAt(r1)
            int r0 = r0 - r5
            byte r0 = (byte) r0
            r4[r1] = r0
            r10 = -1
            X.0XT r9 = new X.0XT
            r14 = r2
            r12 = r4
            r13 = r2
            r9.<init>(r10, r12, r13, r14)
            goto L_0x02db
        L_0x01b0:
            java.nio.charset.Charset r0 = A0L
            byte[] r1 = r7.getBytes(r0)
            int r0 = r1.length
            r10 = -1
            X.0XT r9 = new X.0XT
            r12 = r1
            r13 = r2
            r14 = r0
            r9.<init>(r10, r12, r13, r14)
            goto L_0x02db
        L_0x01c3:
            java.util.HashMap[] r0 = r13.A0I
            r3 = r0[r6]
            X.0XT r9 = X.AnonymousClass0XT.A00(r7)
            goto L_0x02db
        L_0x01cd:
            java.lang.String[] r4 = r7.split(r3, r5)
            int r3 = r4.length
            int[] r2 = new int[r3]
        L_0x01d4:
            if (r1 >= r3) goto L_0x01e1
            r0 = r4[r1]
            int r0 = java.lang.Integer.parseInt(r0)
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x01d4
        L_0x01e1:
            java.util.HashMap[] r0 = r13.A0I
            r3 = r0[r6]
            java.nio.ByteOrder r0 = r13.A0B
            X.0XT r9 = X.AnonymousClass0XT.A02(r0, r2)
            goto L_0x02db
        L_0x01ed:
            java.lang.String[] r5 = r7.split(r3, r5)
            int r3 = r5.length
            long[] r4 = new long[r3]
            r2 = 0
        L_0x01f5:
            if (r2 >= r3) goto L_0x0202
            r0 = r5[r2]
            long r0 = java.lang.Long.parseLong(r0)
            r4[r2] = r0
            int r2 = r2 + 1
            goto L_0x01f5
        L_0x0202:
            java.util.HashMap[] r0 = r13.A0I
            r3 = r0[r6]
            java.nio.ByteOrder r0 = r13.A0B
            X.0XT r9 = X.AnonymousClass0XT.A03(r0, r4)
            goto L_0x02db
        L_0x020e:
            java.lang.String[] r12 = r7.split(r3, r5)
            int r11 = r12.length
            X.0NB[] r10 = new X.AnonymousClass0NB[r11]
            r9 = 0
        L_0x0216:
            if (r9 >= r11) goto L_0x023b
            r1 = r12[r9]
            r0 = r16
            java.lang.String[] r2 = r1.split(r0, r5)
            r0 = 0
            r0 = r2[r0]
            double r0 = java.lang.Double.parseDouble(r0)
            long r4 = (long) r0
            r0 = 1
            r0 = r2[r0]
            double r2 = java.lang.Double.parseDouble(r0)
            long r0 = (long) r2
            X.0NB r2 = new X.0NB
            r2.<init>(r4, r0)
            r10[r9] = r2
            int r9 = r9 + 1
            r5 = -1
            goto L_0x0216
        L_0x023b:
            java.util.HashMap[] r0 = r13.A0I
            r3 = r0[r6]
            java.nio.ByteOrder r0 = r13.A0B
            X.0XT r9 = X.AnonymousClass0XT.A04(r0, r10)
            goto L_0x02db
        L_0x0247:
            java.lang.String[] r2 = r7.split(r3, r5)
            int r9 = r2.length
            int[] r5 = new int[r9]
        L_0x024e:
            if (r1 >= r9) goto L_0x025b
            r0 = r2[r1]
            int r0 = java.lang.Integer.parseInt(r0)
            r5[r1] = r0
            int r1 = r1 + 1
            goto L_0x024e
        L_0x025b:
            java.util.HashMap[] r0 = r13.A0I
            r3 = r0[r6]
            java.nio.ByteOrder r1 = r13.A0B
            int[] r0 = A0t
            r4 = 9
            r0 = r0[r4]
            int r0 = r0 * r9
            byte[] r0 = new byte[r0]
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r0)
            r2.order(r1)
            r1 = 0
        L_0x0272:
            if (r1 >= r9) goto L_0x027c
            r0 = r5[r1]
            r2.putInt(r0)
            int r1 = r1 + 1
            goto L_0x0272
        L_0x027c:
            X.0XT r9 = X.AnonymousClass0XT.A01(r2, r4, r9)
            goto L_0x02db
        L_0x0281:
            java.lang.String[] r10 = r7.split(r3, r5)
            int r9 = r10.length
            X.0NB[] r14 = new X.AnonymousClass0NB[r9]
            r4 = 0
        L_0x0289:
            if (r4 >= r9) goto L_0x02ad
            r3 = r10[r4]
            r0 = r16
            java.lang.String[] r3 = r3.split(r0, r5)
            r0 = r3[r1]
            double r0 = java.lang.Double.parseDouble(r0)
            long r11 = (long) r0
            r0 = r3[r2]
            double r2 = java.lang.Double.parseDouble(r0)
            long r0 = (long) r2
            X.0NB r2 = new X.0NB
            r2.<init>(r11, r0)
            r14[r4] = r2
            int r4 = r4 + 1
            r1 = 0
            r2 = 1
            goto L_0x0289
        L_0x02ad:
            java.util.HashMap[] r0 = r13.A0I
            r3 = r0[r6]
            java.nio.ByteOrder r1 = r13.A0B
            int[] r0 = A0t
            r10 = 10
            r0 = r0[r10]
            int r0 = r0 * r9
            byte[] r0 = new byte[r0]
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r0)
            r5.order(r1)
            r4 = 0
        L_0x02c4:
            if (r4 >= r9) goto L_0x02d7
            r11 = r14[r4]
            long r0 = r11.A01
            int r2 = (int) r0
            r5.putInt(r2)
            long r0 = r11.A00
            int r2 = (int) r0
            r5.putInt(r2)
            int r4 = r4 + 1
            goto L_0x02c4
        L_0x02d7:
            X.0XT r9 = X.AnonymousClass0XT.A01(r5, r10, r9)
        L_0x02db:
            r3.put(r8, r9)
            goto L_0x00d3
        L_0x02e0:
            double r0 = java.lang.Double.parseDouble(r7)     // Catch:{ NumberFormatException -> 0x02f8 }
            r3 = 4666723172467343360(0x40c3880000000000, double:10000.0)
            double r0 = r0 * r3
            long r3 = (long) r0     // Catch:{ NumberFormatException -> 0x02f8 }
            r0 = 10000(0x2710, double:4.9407E-320)
            X.0NB r5 = new X.0NB     // Catch:{ NumberFormatException -> 0x02f8 }
            r5.<init>(r3, r0)     // Catch:{ NumberFormatException -> 0x02f8 }
            java.lang.String r7 = r5.toString()     // Catch:{ NumberFormatException -> 0x02f8 }
            goto L_0x00c3
        L_0x02f8:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r10)
            java.lang.String r0 = X.AnonymousClass000.A0U(r8, r6, r7, r0)
            android.util.Log.w(r15, r0)
            return
        L_0x0304:
            java.lang.String r0 = "tag shouldn't be null"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0YU.A0Z(java.lang.String, java.lang.String):void");
    }

    public final boolean A0a(HashMap hashMap) {
        AnonymousClass0XT A032 = A03("ImageLength", hashMap);
        AnonymousClass0XT A033 = A03("ImageWidth", hashMap);
        if (!(A032 == null || A033 == null)) {
            int A002 = A00(A032, this);
            int A003 = A00(A033, this);
            if (A002 > 512 || A003 > 512) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x005a A[SYNTHETIC, Splitter:B:30:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007e A[Catch:{ Exception -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x009a A[SYNTHETIC, Splitter:B:60:0x009a] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00b0 A[SYNTHETIC, Splitter:B:72:0x00b0] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A0b() {
        /*
            r10 = this;
            java.lang.String r6 = "ExifInterface"
            boolean r0 = r10.A0E
            r9 = 0
            if (r0 != 0) goto L_0x0008
            return r9
        L_0x0008:
            byte[] r0 = r10.A0H
            if (r0 == 0) goto L_0x000d
            return r0
        L_0x000d:
            android.content.res.AssetManager$AssetInputStream r5 = r10.A08     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            if (r5 == 0) goto L_0x0027
            boolean r0 = r5.markSupported()     // Catch:{ Exception -> 0x0024, all -> 0x00a8 }
            if (r0 == 0) goto L_0x001b
            r5.reset()     // Catch:{ Exception -> 0x0024, all -> 0x00a8 }
            goto L_0x0030
        L_0x001b:
            java.lang.String r0 = "Cannot read thumbnail from inputstream without mark/reset support"
            android.util.Log.d(r6, r0)     // Catch:{ Exception -> 0x0024, all -> 0x00a8 }
            A0A(r5)
            return r9
        L_0x0024:
            r1 = move-exception
            r4 = r9
            goto L_0x0090
        L_0x0027:
            java.lang.String r0 = r10.A0A     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            if (r0 == 0) goto L_0x0032
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            r5.<init>(r0)     // Catch:{ Exception -> 0x008d, all -> 0x008a }
        L_0x0030:
            r4 = r9
            goto L_0x0044
        L_0x0032:
            java.io.FileDescriptor r0 = r10.A09     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            java.io.FileDescriptor r4 = X.AnonymousClass0V3.A00(r0)     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            int r2 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
            r0 = 0
            X.AnonymousClass0V3.A02(r4, r2, r0)     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
        L_0x0044:
            int r1 = r10.A07     // Catch:{ Exception -> 0x0083 }
            int r0 = r10.A01     // Catch:{ Exception -> 0x0083 }
            int r1 = r1 + r0
            long r0 = (long) r1     // Catch:{ Exception -> 0x0083 }
            long r7 = r5.skip(r0)     // Catch:{ Exception -> 0x0083 }
            int r1 = r10.A07     // Catch:{ Exception -> 0x0083 }
            int r0 = r10.A01     // Catch:{ Exception -> 0x0083 }
            int r1 = r1 + r0
            long r1 = (long) r1
            java.lang.String r3 = "Corrupted image"
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x007e
            int r0 = r10.A06     // Catch:{ Exception -> 0x0083 }
            byte[] r2 = new byte[r0]     // Catch:{ Exception -> 0x0083 }
            int r1 = r5.read(r2)     // Catch:{ Exception -> 0x0083 }
            int r0 = r10.A06     // Catch:{ Exception -> 0x0083 }
            if (r1 != r0) goto L_0x0079
            r10.A0H = r2     // Catch:{ Exception -> 0x0083 }
            A0A(r5)
            if (r4 == 0) goto L_0x0078
            X.AnonymousClass0V3.A01(r4)     // Catch:{ Exception -> 0x0071 }
            return r2
        L_0x0071:
            java.lang.String r1 = "ExifInterfaceUtils"
            java.lang.String r0 = "Error closing fd."
            android.util.Log.e(r1, r0)
        L_0x0078:
            return r2
        L_0x0079:
            java.io.IOException r0 = X.AnonymousClass002.A0C(r3)     // Catch:{ Exception -> 0x0083 }
            throw r0     // Catch:{ Exception -> 0x0083 }
        L_0x007e:
            java.io.IOException r0 = X.AnonymousClass002.A0C(r3)     // Catch:{ Exception -> 0x0083 }
            throw r0     // Catch:{ Exception -> 0x0083 }
        L_0x0083:
            r1 = move-exception
            goto L_0x0090
        L_0x0085:
            r2 = move-exception
            goto L_0x00ab
        L_0x0087:
            r1 = move-exception
            r5 = r9
            goto L_0x0090
        L_0x008a:
            r2 = move-exception
            r4 = r9
            goto L_0x00ab
        L_0x008d:
            r1 = move-exception
            r5 = r9
            r4 = r9
        L_0x0090:
            java.lang.String r0 = "Encountered exception while getting thumbnail"
            android.util.Log.d(r6, r0, r1)     // Catch:{ all -> 0x00a6 }
            A0A(r5)
            if (r4 == 0) goto L_0x00a5
            X.AnonymousClass0V3.A01(r4)     // Catch:{ Exception -> 0x009e }
            return r9
        L_0x009e:
            java.lang.String r1 = "ExifInterfaceUtils"
            java.lang.String r0 = "Error closing fd."
            android.util.Log.e(r1, r0)
        L_0x00a5:
            return r9
        L_0x00a6:
            r2 = move-exception
            goto L_0x00aa
        L_0x00a8:
            r2 = move-exception
            r4 = r9
        L_0x00aa:
            r9 = r5
        L_0x00ab:
            A0A(r9)
            if (r4 == 0) goto L_0x00bb
            X.AnonymousClass0V3.A01(r4)     // Catch:{ Exception -> 0x00b4 }
            throw r2
        L_0x00b4:
            java.lang.String r1 = "ExifInterfaceUtils"
            java.lang.String r0 = "Error closing fd."
            android.util.Log.e(r1, r0)
        L_0x00bb:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0YU.A0b():byte[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0064 A[SYNTHETIC, Splitter:B:32:0x0064] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0YU(java.io.FileDescriptor r5) {
        /*
            r4 = this;
            r4.<init>()
            X.0TF[][] r0 = A17
            int r1 = r0.length
            java.util.HashMap[] r0 = new java.util.HashMap[r1]
            r4.A0I = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r1)
            r4.A0C = r0
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r4.A0B = r0
            if (r5 == 0) goto L_0x0070
            r3 = 0
            r4.A08 = r3
            r4.A0A = r3
            int r2 = android.system.OsConstants.SEEK_CUR     // Catch:{ Exception -> 0x0034 }
            r0 = 0
            X.AnonymousClass0V3.A02(r5, r2, r0)     // Catch:{ Exception -> 0x0034 }
            r4.A09 = r5
            java.io.FileDescriptor r5 = X.AnonymousClass0V3.A00(r5)     // Catch:{ Exception -> 0x002b }
            r1 = 1
            goto L_0x0042
        L_0x002b:
            r2 = move-exception
            java.lang.String r1 = "Failed to duplicate file descriptor"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1, r2)
            throw r0
        L_0x0034:
            boolean r0 = A0U
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = "ExifInterface"
            java.lang.String r0 = "The file descriptor for the given input is not seekable"
            android.util.Log.d(r1, r0)
        L_0x003f:
            r4.A09 = r3
            r1 = 0
        L_0x0042:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ all -> 0x005b }
            r0.<init>(r5)     // Catch:{ all -> 0x005b }
            r4.A0W(r0)     // Catch:{ all -> 0x005e }
            A0A(r0)
            if (r1 == 0) goto L_0x005a
            X.AnonymousClass0V3.A01(r5)     // Catch:{ Exception -> 0x0053 }
            return
        L_0x0053:
            java.lang.String r1 = "ExifInterfaceUtils"
            java.lang.String r0 = "Error closing fd."
            android.util.Log.e(r1, r0)
        L_0x005a:
            return
        L_0x005b:
            r2 = move-exception
            r0 = r3
            goto L_0x005f
        L_0x005e:
            r2 = move-exception
        L_0x005f:
            A0A(r0)
            if (r1 == 0) goto L_0x0076
            X.AnonymousClass0V3.A01(r5)     // Catch:{ Exception -> 0x0068 }
            throw r2
        L_0x0068:
            java.lang.String r1 = "ExifInterfaceUtils"
            java.lang.String r0 = "Error closing fd."
            android.util.Log.e(r1, r0)
            throw r2
        L_0x0070:
            java.lang.String r0 = "fileDescriptor cannot be null"
            java.lang.NullPointerException r2 = X.AnonymousClass001.A0g(r0)
        L_0x0076:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0YU.<init>(java.io.FileDescriptor):void");
    }

    public static AnonymousClass0XT A03(Object obj, AbstractMap abstractMap) {
        return (AnonymousClass0XT) abstractMap.get(obj);
    }

    public static final ByteOrder A06(AnonymousClass0FE r2) {
        short readShort = r2.readShort();
        if (readShort == 18761) {
            if (A0U) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        } else if (readShort == 19789) {
            if (A0U) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        } else {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            AnonymousClass000.A1G("Invalid byte order: ", A0o2, readShort);
            throw AnonymousClass002.A0C(A0o2.toString());
        }
    }

    public final void A0O(AnonymousClass0FE r4) {
        ByteOrder A062 = A06(r4);
        this.A0B = A062;
        r4.A01 = A062;
        int readUnsignedShort = r4.readUnsignedShort();
        int i = this.A00;
        if (i == 7 || i == 10 || readUnsignedShort == 42) {
            int readInt = r4.readInt();
            if (readInt >= 8) {
                int i2 = readInt - 8;
                if (i2 > 0) {
                    r4.A00(i2);
                    return;
                }
                return;
            }
            throw AnonymousClass002.A0C(AnonymousClass000.A0Y("Invalid first Ifd offset: ", AnonymousClass001.A0o(), readInt));
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        AnonymousClass000.A1G("Invalid start code: ", A0o2, readUnsignedShort);
        throw AnonymousClass002.A0C(A0o2.toString());
    }

    public final void A0T(C009207f r6) {
        A0O(r6);
        A0U(r6, 0);
        A0V(r6, 0);
        A0V(r6, 5);
        A0V(r6, 4);
        A0L();
        if (this.A00 == 8) {
            HashMap[] hashMapArr = this.A0I;
            AnonymousClass0XT A032 = A03("MakerNote", hashMapArr[1]);
            if (A032 != null) {
                C009207f r1 = new C009207f(A032.A03);
                r1.A01 = this.A0B;
                r1.A00(6);
                A0U(r1, 9);
                Object obj = hashMapArr[9].get("ColorSpace");
                if (obj != null) {
                    hashMapArr[1].put("ColorSpace", obj);
                }
            }
        }
    }

    static {
        Integer[] numArr = new Integer[4];
        numArr[0] = 1;
        AnonymousClass000.A1P(numArr, 6, 1);
        numArr[2] = 3;
        numArr[3] = 8;
        A0P = Arrays.asList(numArr);
        Integer[] numArr2 = new Integer[4];
        numArr2[0] = 2;
        numArr2[1] = 7;
        AnonymousClass000.A1P(numArr2, 4, 2);
        numArr2[3] = 5;
        A0O = Arrays.asList(numArr2);
        AnonymousClass0TF[] r6 = new AnonymousClass0TF[42];
        A0F("NewSubfileType", r6, 254, 4, 0);
        A0F("SubfileType", r6, 255, 4, 1);
        r6[2] = new AnonymousClass0TF(256, 3, "ImageWidth", 4);
        r6[3] = new AnonymousClass0TF(257, 3, "ImageLength", 4);
        A0F("BitsPerSample", r6, 258, 3, 4);
        A0F("Compression", r6, 259, 3, 5);
        r6[6] = A04("PhotometricInterpretation", 262, 3);
        r6[7] = A04("ImageDescription", 270, 2);
        r6[8] = A04("Make", 271, 2);
        r6[9] = A04("Model", 272, 2);
        r6[10] = new AnonymousClass0TF(273, 3, "StripOffsets", 4);
        r6[11] = A04("Orientation", 274, 3);
        r6[12] = A04("SamplesPerPixel", 277, 3);
        r6[13] = new AnonymousClass0TF(278, 3, "RowsPerStrip", 4);
        r6[14] = new AnonymousClass0TF(279, 3, "StripByteCounts", 4);
        r6[15] = A04("XResolution", 282, 5);
        r6[16] = A04("YResolution", 283, 5);
        r6[17] = A04("PlanarConfiguration", 284, 3);
        r6[18] = A04("ResolutionUnit", 296, 3);
        r6[19] = A04("TransferFunction", 301, 3);
        r6[20] = A04("Software", 305, 2);
        r6[21] = A04("DateTime", 306, 2);
        r6[22] = A04("Artist", 315, 2);
        r6[23] = A04("WhitePoint", 318, 5);
        r6[24] = A04("PrimaryChromaticities", 319, 5);
        r6[25] = A04("SubIFDPointer", 330, 4);
        r6[26] = A04("JPEGInterchangeFormat", 513, 4);
        r6[27] = A04("JPEGInterchangeFormatLength", 514, 4);
        r6[28] = A04("YCbCrCoefficients", 529, 5);
        r6[29] = A04("YCbCrSubSampling", 530, 3);
        r6[30] = A04("YCbCrPositioning", 531, 3);
        r6[31] = A04("ReferenceBlackWhite", 532, 5);
        r6[32] = A04("Copyright", 33432, 2);
        r6[33] = A04("ExifIFDPointer", 34665, 4);
        r6[34] = A04("GPSInfoIFDPointer", 34853, 4);
        r6[35] = new AnonymousClass0TF("SensorTopBorder", 4, 4);
        r6[36] = A04("SensorLeftBorder", 5, 4);
        r6[37] = A04("SensorBottomBorder", 6, 4);
        r6[38] = A04("SensorRightBorder", 7, 4);
        r6[39] = A04("ISO", 23, 3);
        r6[40] = A04("JpgFromRaw", 46, 7);
        r6[41] = A04("Xmp", 700, 1);
        A0z = r6;
        AnonymousClass0TF[] r5 = new AnonymousClass0TF[74];
        r5[0] = A04("ExposureTime", 33434, 5);
        A0F("FNumber", r5, 33437, 5, 1);
        A0F("ExposureProgram", r5, 34850, 3, 2);
        A0F("SpectralSensitivity", r5, 34852, 2, 3);
        A0F("PhotographicSensitivity", r5, 34855, 3, 4);
        A0F("OECF", r5, 34856, 7, 5);
        r5[6] = A04("SensitivityType", 34864, 3);
        A0F("StandardOutputSensitivity", r5, 34865, 4, 7);
        r5[8] = A04("RecommendedExposureIndex", 34866, 4);
        r5[9] = A04("ISOSpeed", 34867, 4);
        r5[10] = A04("ISOSpeedLatitudeyyy", 34868, 4);
        r5[11] = A04("ISOSpeedLatitudezzz", 34869, 4);
        r5[12] = A04("ExifVersion", 36864, 2);
        r5[13] = A04("DateTimeOriginal", 36867, 2);
        r5[14] = A04("DateTimeDigitized", 36868, 2);
        r5[15] = A04("OffsetTime", 36880, 2);
        r5[16] = A04("OffsetTimeOriginal", 36881, 2);
        r5[17] = A04("OffsetTimeDigitized", 36882, 2);
        r5[18] = A04("ComponentsConfiguration", 37121, 7);
        r5[19] = A04("CompressedBitsPerPixel", 37122, 5);
        r5[20] = A04("ShutterSpeedValue", 37377, 10);
        r5[21] = A04("ApertureValue", 37378, 5);
        r5[22] = A04("BrightnessValue", 37379, 10);
        r5[23] = A04("ExposureBiasValue", 37380, 10);
        r5[24] = A04("MaxApertureValue", 37381, 5);
        r5[25] = A04("SubjectDistance", 37382, 5);
        r5[26] = A04("MeteringMode", 37383, 3);
        r5[27] = A04("LightSource", 37384, 3);
        r5[28] = A04("Flash", 37385, 3);
        r5[29] = A04("FocalLength", 37386, 5);
        r5[30] = A04("SubjectArea", 37396, 3);
        r5[31] = A04("MakerNote", 37500, 7);
        r5[32] = A04("UserComment", 37510, 7);
        r5[33] = A04("SubSecTime", 37520, 2);
        r5[34] = A04("SubSecTimeOriginal", 37521, 2);
        r5[35] = A04("SubSecTimeDigitized", 37522, 2);
        r5[36] = A04("FlashpixVersion", 40960, 7);
        r5[37] = A04("ColorSpace", 40961, 3);
        r5[38] = new AnonymousClass0TF(40962, 3, "PixelXDimension", 4);
        r5[39] = new AnonymousClass0TF(40963, 3, "PixelYDimension", 4);
        r5[40] = A04("RelatedSoundFile", 40964, 2);
        r5[41] = A04("InteroperabilityIFDPointer", 40965, 4);
        r5[42] = A04("FlashEnergy", 41483, 5);
        r5[43] = A04("SpatialFrequencyResponse", 41484, 7);
        r5[44] = A04("FocalPlaneXResolution", 41486, 5);
        r5[45] = A04("FocalPlaneYResolution", 41487, 5);
        r5[46] = A04("FocalPlaneResolutionUnit", 41488, 3);
        r5[47] = A04("SubjectLocation", 41492, 3);
        r5[48] = A04("ExposureIndex", 41493, 5);
        r5[49] = A04("SensingMethod", 41495, 3);
        r5[50] = A04("FileSource", 41728, 7);
        r5[51] = A04("SceneType", 41729, 7);
        r5[52] = A04("CFAPattern", 41730, 7);
        r5[53] = A04("CustomRendered", 41985, 3);
        r5[54] = A04("ExposureMode", 41986, 3);
        r5[55] = A04("WhiteBalance", 41987, 3);
        r5[56] = A04("DigitalZoomRatio", 41988, 5);
        r5[57] = A04("FocalLengthIn35mmFilm", 41989, 3);
        r5[58] = A04("SceneCaptureType", 41990, 3);
        r5[59] = A04("GainControl", 41991, 3);
        r5[60] = A04("Contrast", 41992, 3);
        r5[61] = A04("Saturation", 41993, 3);
        r5[62] = A04("Sharpness", 41994, 3);
        r5[63] = A04("DeviceSettingDescription", 41995, 7);
        r5[64] = A04("SubjectDistanceRange", 41996, 3);
        r5[65] = A04("ImageUniqueID", 42016, 2);
        r5[66] = A04("CameraOwnerName", 42032, 2);
        r5[67] = A04("BodySerialNumber", 42033, 2);
        r5[68] = A04("LensSpecification", 42034, 5);
        r5[69] = A04("LensMake", 42035, 2);
        r5[70] = A04("LensModel", 42036, 2);
        r5[71] = A04("Gamma", 42240, 5);
        r5[72] = A04("DNGVersion", 50706, 1);
        r5[73] = new AnonymousClass0TF(50720, 3, "DefaultCropSize", 4);
        A0v = r5;
        AnonymousClass0TF[] r4 = new AnonymousClass0TF[32];
        A0E("GPSVersionID", r4, 0, 1);
        A0E("GPSLatitudeRef", r4, 1, 2);
        r4[2] = new AnonymousClass0TF(2, 5, "GPSLatitude", 10);
        A0E("GPSLongitudeRef", r4, 3, 2);
        r4[4] = new AnonymousClass0TF(4, 5, "GPSLongitude", 10);
        A0E("GPSAltitudeRef", r4, 5, 1);
        A0E("GPSAltitude", r4, 6, 5);
        A0E("GPSTimeStamp", r4, 7, 5);
        A0E("GPSSatellites", r4, 8, 2);
        A0E("GPSStatus", r4, 9, 2);
        A0E("GPSMeasureMode", r4, 10, 2);
        A0E("GPSDOP", r4, 11, 5);
        A0E("GPSSpeedRef", r4, 12, 2);
        A0E("GPSSpeed", r4, 13, 5);
        A0E("GPSTrackRef", r4, 14, 2);
        A0E("GPSTrack", r4, 15, 5);
        A0E("GPSImgDirectionRef", r4, 16, 2);
        A0E("GPSImgDirection", r4, 17, 5);
        A0E("GPSMapDatum", r4, 18, 2);
        A0E("GPSDestLatitudeRef", r4, 19, 2);
        A0E("GPSDestLatitude", r4, 20, 5);
        A0E("GPSDestLongitudeRef", r4, 21, 2);
        A0E("GPSDestLongitude", r4, 22, 5);
        A0E("GPSDestBearingRef", r4, 23, 2);
        A0E("GPSDestBearing", r4, 24, 5);
        A0E("GPSDestDistanceRef", r4, 25, 2);
        A0E("GPSDestDistance", r4, 26, 5);
        A0E("GPSProcessingMethod", r4, 27, 7);
        A0E("GPSAreaInformation", r4, 28, 7);
        A0E("GPSDateStamp", r4, 29, 2);
        A0E("GPSDifferential", r4, 30, 3);
        A0E("GPSHPositioningError", r4, 31, 5);
        A0w = r4;
        AnonymousClass0TF[] r2 = {A04("InteroperabilityIndex", 1, 2)};
        A0x = r2;
        AnonymousClass0TF[] r1 = new AnonymousClass0TF[38];
        A0F("NewSubfileType", r1, 254, 4, 0);
        r1[1] = A04("SubfileType", 255, 4);
        r1[2] = new AnonymousClass0TF(256, 3, "ThumbnailImageWidth", 4);
        r1[3] = new AnonymousClass0TF(257, 3, "ThumbnailImageLength", 4);
        A0F("BitsPerSample", r1, 258, 3, 4);
        r1[5] = A04("Compression", 259, 3);
        r1[6] = A04("PhotometricInterpretation", 262, 3);
        r1[7] = A04("ImageDescription", 270, 2);
        r1[8] = A04("Make", 271, 2);
        r1[9] = A04("Model", 272, 2);
        r1[10] = new AnonymousClass0TF(273, 3, "StripOffsets", 4);
        r1[11] = A04("ThumbnailOrientation", 274, 3);
        r1[12] = A04("SamplesPerPixel", 277, 3);
        r1[13] = new AnonymousClass0TF(278, 3, "RowsPerStrip", 4);
        r1[14] = new AnonymousClass0TF(279, 3, "StripByteCounts", 4);
        r1[15] = A04("XResolution", 282, 5);
        r1[16] = A04("YResolution", 283, 5);
        r1[17] = A04("PlanarConfiguration", 284, 3);
        r1[18] = A04("ResolutionUnit", 296, 3);
        r1[19] = A04("TransferFunction", 301, 3);
        r1[20] = A04("Software", 305, 2);
        r1[21] = A04("DateTime", 306, 2);
        r1[22] = A04("Artist", 315, 2);
        r1[23] = A04("WhitePoint", 318, 5);
        r1[24] = A04("PrimaryChromaticities", 319, 5);
        r1[25] = A04("SubIFDPointer", 330, 4);
        r1[26] = A04("JPEGInterchangeFormat", 513, 4);
        r1[27] = A04("JPEGInterchangeFormatLength", 514, 4);
        r1[28] = A04("YCbCrCoefficients", 529, 5);
        r1[29] = A04("YCbCrSubSampling", 530, 3);
        r1[30] = A04("YCbCrPositioning", 531, 3);
        r1[31] = A04("ReferenceBlackWhite", 532, 5);
        r1[32] = A04("Xmp", 700, 1);
        r1[33] = A04("Copyright", 33432, 2);
        r1[34] = A04("ExifIFDPointer", 34665, 4);
        r1[35] = A04("GPSInfoIFDPointer", 34853, 4);
        r1[36] = A04("DNGVersion", 50706, 1);
        r1[37] = new AnonymousClass0TF(50720, 3, "DefaultCropSize", 4);
        A0y = r1;
        AnonymousClass0TF[] r13 = new AnonymousClass0TF[3];
        A0F("ThumbnailImage", r13, 256, 7, 0);
        r13[1] = A04("CameraSettingsIFDPointer", 8224, 4);
        r13[2] = A04("ImageProcessingIFDPointer", 8256, 4);
        A12 = r13;
        AnonymousClass0TF[] r11 = new AnonymousClass0TF[2];
        A0F("PreviewImageStart", r11, 257, 4, 0);
        r11[1] = A04("PreviewImageLength", 258, 4);
        A10 = r11;
        AnonymousClass0TF[] r10 = {A04("AspectFrame", 4371, 3)};
        A11 = r10;
        AnonymousClass0TF[] r14 = new AnonymousClass0TF[1];
        A0F("ColorSpace", r14, 55, 3, 0);
        A13 = r14;
        A17 = new AnonymousClass0TF[][]{r6, r5, r4, r2, r1, r6, r13, r11, r10, r14};
        AnonymousClass0TF[] r3 = new AnonymousClass0TF[6];
        A0F("SubIFDPointer", r3, 330, 4, 0);
        A0F("ExifIFDPointer", r3, 34665, 4, 1);
        r3[2] = A04("GPSInfoIFDPointer", 34853, 4);
        A0F("InteroperabilityIFDPointer", r3, 40965, 4, 3);
        A0F("CameraSettingsIFDPointer", r3, 8224, 1, 4);
        r3[5] = A04("ImageProcessingIFDPointer", 8256, 1);
        A0u = r3;
        Charset forName = Charset.forName("US-ASCII");
        A0L = forName;
        A0Z = "Exif\u0000\u0000".getBytes(forName);
        A0a = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        A0J = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        A0K = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            AnonymousClass0TF[][] r32 = A17;
            if (i < r32.length) {
                A15[i] = AnonymousClass001.A0t();
                A16[i] = AnonymousClass001.A0t();
                for (AnonymousClass0TF r33 : r32[i]) {
                    A15[i].put(Integer.valueOf(r33.A00), r33);
                    A16[i].put(r33.A03, r33);
                }
                i++;
            } else {
                HashMap hashMap = A0M;
                AnonymousClass0TF[] r22 = A0u;
                A0D(5, hashMap, r22, 0);
                A0D(1, hashMap, r22, 1);
                A0D(2, hashMap, r22, 2);
                A0D(3, hashMap, r22, 3);
                A0D(7, hashMap, r22, 4);
                A0D(8, hashMap, r22, 5);
                return;
            }
        }
    }

    public AnonymousClass0YU(InputStream inputStream) {
        int length = A17.length;
        this.A0I = new HashMap[length];
        this.A0C = new HashSet(length);
        this.A0B = ByteOrder.BIG_ENDIAN;
        this.A0A = null;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.A08 = (AssetManager.AssetInputStream) inputStream;
            this.A09 = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    AnonymousClass0V3.A02(fileInputStream.getFD(), OsConstants.SEEK_CUR, 0);
                    this.A08 = null;
                    this.A09 = fileInputStream.getFD();
                } catch (Exception unused) {
                    if (A0U) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                }
            }
            this.A08 = null;
            this.A09 = null;
        }
        A0W(inputStream);
    }

    public AnonymousClass0YU(String str) {
        int length = A17.length;
        this.A0I = new HashMap[length];
        this.A0C = new HashSet(length);
        this.A0B = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            A0X(str);
            return;
        }
        throw AnonymousClass001.A0g("filename cannot be null");
    }

    public AnonymousClass0YU(File file) {
        int length = A17.length;
        this.A0I = new HashMap[length];
        this.A0C = new HashSet(length);
        this.A0B = ByteOrder.BIG_ENDIAN;
        A0X(file.getAbsolutePath());
    }
}
