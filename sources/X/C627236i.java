package X;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.whatsapp.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.GeneralSecurityException;
import java.security.InvalidParameterException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.36i  reason: invalid class name and case insensitive filesystem */
public class C627236i {
    public static Boolean A00;
    public static Boolean A01;
    public static Boolean A02;
    public static String A03;
    public static final C183538qC A04 = C72333dY.A03(6);
    public static final byte[] A05 = {0, 2};

    public static String A03(String str) {
        String str2 = "";
        try {
            String[] A1Z = AnonymousClass0x9.A1Z();
            A1Z[0] = "/system/bin/getprop";
            A1Z[1] = str;
            Process start = new ProcessBuilder(A1Z).redirectErrorStream(true).start();
            BufferedReader A0Z = C18310x6.A0Z(start.getInputStream());
            while (true) {
                String readLine = A0Z.readLine();
                if (readLine != null) {
                    str2 = readLine;
                } else {
                    start.destroy();
                    return str2;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return str2;
        }
    }

    public static String A04(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            return A07(instance.digest());
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static String A06(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[(r6 * 2)];
        int i = 0;
        for (byte b : bArr) {
            byte b2 = b & 255;
            int i2 = i + 1;
            cArr2[i] = cArr[b2 >>> 4];
            i = i2 + 1;
            cArr2[i2] = cArr[b2 & 15];
        }
        return new String(cArr2);
    }

    public static SecretKey A08(String str, byte[] bArr, char[] cArr, int i, int i2) {
        try {
            try {
                return SecretKeyFactory.getInstance(str).generateSecret(new PBEKeySpec(cArr, bArr, i, i2));
            } catch (InvalidKeySpecException e) {
                throw AnonymousClass0x9.A0i(e);
            }
        } catch (NoSuchAlgorithmException e2) {
            throw AnonymousClass0x9.A0i(e2);
        }
    }

    public static SecretKey A09(byte[] bArr, byte[] bArr2, int i, int i2) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i3 = 0; i3 < length; i3++) {
            cArr[i3] = (char) bArr[i3];
        }
        return A08("PBKDF2WithHmacSHA512", bArr2, cArr, i, i2);
    }

    public static boolean A0C() {
        String str = A03;
        if (str == null) {
            String str2 = Build.MANUFACTURER;
            str = "";
            if (str2 == null) {
                str2 = str;
            }
            String str3 = Build.VERSION.RELEASE;
            if (str3 == null) {
                str3 = str;
            }
            String str4 = Build.DISPLAY;
            if (str4 == null) {
                str4 = str;
            }
            String str5 = Build.MODEL;
            if (str5 == null) {
                str5 = str;
            }
            String A002 = A00();
            C18260x0.A0q("manufacturer ", str2, AnonymousClass001.A0o());
            C18260x0.A0q("release ", str3, AnonymousClass001.A0o());
            C18260x0.A0q("display ", str4, AnonymousClass001.A0o());
            C18260x0.A0q("model ", str5, AnonymousClass001.A0o());
            C18260x0.A0q("kernel_version ", A002, AnonymousClass001.A0o());
            Locale locale = Locale.US;
            String str6 = "cyanogen";
            if (!A002.toLowerCase(locale).contains(str6)) {
                str6 = "debug";
                if (!str2.toLowerCase(locale).contains(str6) && !str3.toLowerCase(locale).contains(str6) && !str4.toLowerCase(locale).contains(str6) && !str5.toLowerCase(locale).contains(str6) && !A002.toLowerCase(locale).contains(str6)) {
                    if (str4.startsWith("Darky")) {
                        str = "darky";
                    } else if (str2.startsWith("XDAndroid")) {
                        str = "xdandroid";
                    } else if (str3.startsWith("FroydVillain")) {
                        str = "froydvillain";
                    } else if (str3.startsWith("VillainROM") || str4.startsWith("VillainROM")) {
                        str = "villainrom";
                    } else if (str3.startsWith("WildPuzzle")) {
                        str = "wildpuzzle";
                    } else if (str4.startsWith("MIUI")) {
                        str = "miui";
                    } else if (str4.startsWith("ITFUNZ")) {
                        str = "itfunz";
                    } else if (str4.startsWith("DebusROM")) {
                        str = "debus";
                    } else if (str4.startsWith("FreeX10")) {
                        str = "freex10";
                    } else if (str4.startsWith("Perception Build")) {
                        str = "perception";
                    } else if (str4.startsWith("Bionix")) {
                        str = "bionix";
                    } else if (str4.startsWith("Lite'ning Rom")) {
                        str = "litening";
                    } else if (str4.startsWith("GINGERVillain")) {
                        str = "gingervillian";
                    } else if (str4.startsWith("GingerReal")) {
                        str = "gingerreal";
                    } else if (str4.startsWith("R.U.R.1920")) {
                        str = "rur1920";
                    } else if (str5.startsWith("MoDaCo")) {
                        str = "modaco";
                    } else if (str4.startsWith("CriskeloROM")) {
                        str = "criskelorom";
                    } else if (str4.startsWith("LeeDrOiD")) {
                        str = "leedroid";
                    } else if (str4.startsWith("Dexter's FolioMod")) {
                        str = "foliomod";
                    } else if (str4.startsWith("Andro-ID")) {
                        str = "andro-id";
                    } else if (str4.startsWith("FroyoPlus")) {
                        str = "froyoplus";
                    } else if (str4.startsWith("PilotxRom")) {
                        str = "pilotx";
                    } else if (str4.startsWith("Achotjan")) {
                        str = "achotjan";
                    } else if (A002.contains("FuguMod")) {
                        str = "fugu";
                    } else if (A002.contains("fakeShmoo")) {
                        str = "fakeshmoo";
                    } else if (A002.contains("LorDmodNCTeam")) {
                        str = "lordmod";
                    } else if (A002.contains("-RCMIX")) {
                        str = "rcmix";
                    } else if (str4.contains("DamianGTO")) {
                        str = "damiangto";
                    }
                    C18260x0.A0s("app/custom-rom ", str, AnonymousClass001.A0o());
                    A03 = str;
                }
            }
            str = str6;
            C18260x0.A0s("app/custom-rom ", str, AnonymousClass001.A0o());
            A03 = str;
        }
        return AnonymousClass000.A1S(str.length());
    }

    public static boolean A0D(Context context, String str, byte[] bArr) {
        new String(bArr);
        File A0A = AnonymousClass002.A0A(context.getFilesDir(), "rc2");
        String A0V = AnonymousClass000.A0V(C58172up.A0T, str, AnonymousClass001.A0o());
        byte[] bArr2 = A05;
        try {
            byte[] A012 = AnonymousClass29O.A01(4);
            byte[] A013 = AnonymousClass29O.A01(16);
            byte[] A1Y = C18310x6.A1Y(new SecretKeySpec(A0L(A012, A0V), "AES/OFB/NoPadding"), C18330xA.A0D(A013), Cipher.getInstance("AES/OFB/NoPadding"), bArr, 1);
            byte[] bArr3 = new byte[(bArr2.length + A012.length + A013.length + A1Y.length)];
            byte[][] bArr4 = new byte[4][];
            bArr4[0] = bArr2;
            bArr4[1] = A012;
            AnonymousClass001.A1H(A013, A1Y, bArr4);
            int i = 0;
            int i2 = 0;
            do {
                byte[] bArr5 = bArr4[i];
                System.arraycopy(bArr5, 0, bArr3, i2, bArr5.length);
                i2 += bArr5.length;
                i++;
            } while (i < 4);
            A0B(A0A, bArr3);
            return Arrays.equals(bArr3, A0K(A0A));
        } catch (Exception e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            C18260x0.A15(C18300x5.A0k(A0A, "unable to write ", A0o), A0o, e);
            return false;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:65|66) */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        X.AnonymousClass0x9.A0g(r7).close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0121, code lost:
        r0 = false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0118 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0E(X.C620633i r9) {
        /*
            java.lang.Boolean r0 = A02
            if (r0 != 0) goto L_0x0018
            java.lang.String r1 = android.os.Build.TAGS
            if (r1 == 0) goto L_0x001d
            java.lang.String r0 = "test-keys"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x001d
        L_0x0011:
            r0 = 1
        L_0x0012:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            A02 = r0
        L_0x0018:
            boolean r0 = r0.booleanValue()
            return r0
        L_0x001d:
            java.lang.String r0 = "/system/app/Superuser.apk"
            java.io.File r0 = X.AnonymousClass002.A0B(r0)     // Catch:{ Exception -> 0x002a }
            boolean r0 = r0.exists()     // Catch:{ Exception -> 0x002a }
            if (r0 == 0) goto L_0x002a
            goto L_0x0011
        L_0x002a:
            java.lang.String r0 = "/system/bin/su"
            java.io.File r8 = X.AnonymousClass002.A0B(r0)
            java.lang.String r0 = "/system/xbin/su"
            java.io.File r7 = X.AnonymousClass002.A0B(r0)
            r3 = 2
            boolean r0 = r8.canExecute()     // Catch:{ Exception -> 0x0047, NoSuchMethodError -> 0x0044 }
            boolean r2 = X.AnonymousClass000.A1S(r0)
            boolean r3 = r7.canExecute()     // Catch:{ Exception -> 0x005c, NoSuchMethodError -> 0x0049 }
            goto L_0x005c
        L_0x0044:
            r4 = move-exception
            r2 = 2
            goto L_0x004a
        L_0x0047:
            r2 = 2
            goto L_0x005c
        L_0x0049:
            r4 = move-exception
        L_0x004a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "app/check/nomethod "
            r1.append(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)
            com.whatsapp.util.Log.i(r0, r4)
        L_0x005c:
            java.lang.String r1 = android.os.Build.PRODUCT
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r6 = 1
            if (r0 != 0) goto L_0x00b5
            java.util.Locale r5 = java.util.Locale.US
            java.lang.String r0 = r1.toLowerCase(r5)
            java.lang.String r4 = "sdk"
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L_0x00b5
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00b5
            java.lang.String r0 = r1.toLowerCase(r5)
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L_0x00b5
            java.lang.String r1 = android.os.Build.MANUFACTURER
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00b5
            java.lang.String r0 = r1.toLowerCase(r5)
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L_0x00b5
            android.net.ConnectivityManager r0 = r9.A0H()
            if (r0 == 0) goto L_0x00b5
            X.5UR r0 = r9.A0R()
            if (r0 == 0) goto L_0x00b5
            java.lang.String r0 = A01(r0)     // Catch:{ NullPointerException -> 0x00b5 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00b5
            android.telephony.TelephonyManager r0 = r9.A0N()
            if (r0 == 0) goto L_0x00b5
            r6 = 0
        L_0x00b5:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "app/dly "
            r5.append(r1)
            boolean r0 = r8.exists()
            r5.append(r0)
            boolean r0 = r8.canRead()
            r5.append(r0)
            boolean r0 = r8.canWrite()
            r5.append(r0)
            r5.append(r2)
            java.lang.String r4 = ".0"
            java.lang.String r2 = ""
            r0 = r2
            if (r6 == 0) goto L_0x00de
            r0 = r4
        L_0x00de:
            X.C18260x0.A1L(r5, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r1)
            boolean r0 = r7.exists()
            r1.append(r0)
            boolean r0 = r7.canRead()
            r1.append(r0)
            boolean r0 = r7.canWrite()
            r1.append(r0)
            r1.append(r3)
            if (r6 != 0) goto L_0x0100
            r4 = r2
        L_0x0100:
            X.C18260x0.A1L(r1, r4)
            boolean r0 = r8.exists()
            if (r0 != 0) goto L_0x0011
            boolean r0 = r7.exists()
            if (r0 != 0) goto L_0x0011
            java.io.FileInputStream r0 = X.AnonymousClass0x9.A0g(r8)     // Catch:{ Exception -> 0x0118 }
            r0.close()     // Catch:{ Exception -> 0x0118 }
            goto L_0x0011
        L_0x0118:
            java.io.FileInputStream r0 = X.AnonymousClass0x9.A0g(r7)     // Catch:{ Exception -> 0x0121 }
            r0.close()     // Catch:{ Exception -> 0x0121 }
            goto L_0x0011
        L_0x0121:
            r0 = 0
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C627236i.A0E(X.33i):boolean");
    }

    public static byte[] A0F() {
        return AnonymousClass29O.A01(12);
    }

    public static byte[] A0G() {
        return AnonymousClass29O.A01(16);
    }

    public static byte[] A0H() {
        try {
            KeyGenerator instance = KeyGenerator.getInstance("AES");
            instance.init(160, AnonymousClass29O.A00());
            return instance.generateKey().getEncoded();
        } catch (Exception e) {
            throw C18330xA.A09(e);
        }
    }

    public static byte[] A0M(byte[] bArr, byte[]... bArr2) {
        try {
            Mac A0k = AnonymousClass0x2.A0k("HmacSHA1", bArr);
            for (byte[] update : bArr2) {
                A0k.update(update);
            }
            return A0k.doFinal();
        } catch (GeneralSecurityException e) {
            throw C18330xA.A09(e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0022 A[SYNTHETIC, Splitter:B:11:0x0022] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004d A[SYNTHETIC, Splitter:B:27:0x004d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00() {
        /*
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            r3 = 0
            java.lang.String r1 = "/proc/sys/kernel/osrelease"
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ all -> 0x001e }
            r0.<init>(r1)     // Catch:{ all -> 0x001e }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x001e }
            r2.<init>(r0)     // Catch:{ all -> 0x001e }
            java.lang.String r0 = r2.readLine()     // Catch:{ all -> 0x001c }
            r4.append(r0)     // Catch:{ all -> 0x001c }
            r2.close()     // Catch:{ IOException -> 0x0026 }
            goto L_0x002b
        L_0x001c:
            r0 = move-exception
            goto L_0x0020
        L_0x001e:
            r0 = move-exception
            r2 = r3
        L_0x0020:
            if (r2 == 0) goto L_0x0025
            r2.close()     // Catch:{ IOException -> 0x0026 }
        L_0x0025:
            throw r0     // Catch:{ IOException -> 0x0026 }
        L_0x0026:
            java.lang.String r0 = "Unknown release"
            r4.append(r0)
        L_0x002b:
            java.lang.String r1 = "/proc/sys/kernel/version"
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ all -> 0x0049 }
            r0.<init>(r1)     // Catch:{ all -> 0x0049 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x0049 }
            r1.<init>(r0)     // Catch:{ all -> 0x0049 }
            r0 = 32
            r4.append(r0)     // Catch:{ all -> 0x0047 }
            java.lang.String r0 = r1.readLine()     // Catch:{ all -> 0x0047 }
            r4.append(r0)     // Catch:{ all -> 0x0047 }
            r1.close()     // Catch:{ IOException -> 0x0051 }
            goto L_0x0056
        L_0x0047:
            r0 = move-exception
            goto L_0x004b
        L_0x0049:
            r0 = move-exception
            r1 = r2
        L_0x004b:
            if (r1 == 0) goto L_0x0050
            r1.close()     // Catch:{ IOException -> 0x0051 }
        L_0x0050:
            throw r0     // Catch:{ IOException -> 0x0051 }
        L_0x0051:
            java.lang.String r0 = " unknown version"
            r4.append(r0)
        L_0x0056:
            java.lang.String r0 = r4.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C627236i.A00():java.lang.String");
    }

    public static String A01(AnonymousClass5UR r1) {
        C626936e.A06(r1);
        return Settings.Secure.getString(r1.A00, "android_id");
    }

    public static String A02(String str) {
        try {
            FileInputStream A0g = AnonymousClass0x9.A0g(AnonymousClass002.A0B(str));
            MessageDigest A0t = AnonymousClass0x7.A0t();
            byte[] bArr = new byte[65536];
            while (true) {
                int read = A0g.read(bArr);
                if (read > 0) {
                    A0t.update(bArr, 0, read);
                } else {
                    A0g.close();
                    return A06(A0t.digest());
                }
            }
        } catch (Exception e) {
            Log.e("app/sha/bytes/error ", e);
            return "";
        }
    }

    public static String A05(String str) {
        try {
            MessageDigest A0t = AnonymousClass0x7.A0t();
            A0t.update(str.getBytes());
            return A07(A0t.digest());
        } catch (NoSuchAlgorithmException e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }

    public static String A07(byte[] bArr) {
        StringBuilder A0o = AnonymousClass001.A0o();
        for (byte b : bArr) {
            A0o.append(Character.forDigit((b >>> 4) & 15, 16));
            A0o.append(Character.forDigit(b & 15, 16));
        }
        return A0o.toString();
    }

    public static void A0A(Context context) {
        C18310x6.A1F(context.getFilesDir(), "rc2");
    }

    public static void A0B(File file, byte[] bArr) {
        ObjectOutputStream objectOutputStream;
        FileOutputStream A0h = AnonymousClass0x9.A0h(file);
        try {
            objectOutputStream = new ObjectOutputStream(A0h);
            objectOutputStream.writeObject(bArr);
            objectOutputStream.close();
            A0h.close();
            return;
        } catch (Throwable th) {
            try {
                A0h.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public static byte[] A0I(int i) {
        return AnonymousClass29O.A01(i);
    }

    public static byte[] A0J(Context context, String str) {
        File A0A;
        Throwable th;
        try {
            A0A = AnonymousClass002.A0A(context.getFilesDir(), "rc2");
            String A0V = AnonymousClass000.A0V(C58172up.A0T, str, AnonymousClass001.A0o());
            byte[] bArr = A05;
            byte[] A0K = A0K(A0A);
            if (A0K == null) {
                return null;
            }
            int length = A0K.length;
            int length2 = bArr.length;
            int i = length2 + 4;
            int i2 = i + 16;
            if (length >= i2 + 20) {
                byte[] bArr2 = new byte[length2];
                System.arraycopy(A0K, 0, bArr2, 0, length2);
                if (Arrays.equals(bArr2, bArr)) {
                    byte[] bArr3 = new byte[4];
                    System.arraycopy(A0K, length2, bArr3, 0, 4);
                    byte[] bArr4 = new byte[16];
                    System.arraycopy(A0K, i, bArr4, 0, 16);
                    SecretKeySpec secretKeySpec = new SecretKeySpec(A0L(bArr3, A0V), "AES/OFB/NoPadding");
                    Cipher instance = Cipher.getInstance("AES/OFB/NoPadding");
                    C18290x4.A1S(secretKeySpec, instance, bArr4);
                    return instance.doFinal(A0K, i2, length - i2);
                }
                th = new C377423v();
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                AnonymousClass000.A1B(A0A, A0o);
                th = new InvalidParameterException(AnonymousClass000.A0X(" size mismatch", A0o));
            }
            throw th;
        } catch (Exception e) {
            A0A.delete();
            if (e instanceof C377423v) {
                throw e;
            }
            throw C18330xA.A09(e);
        } catch (C377423v e2) {
            Log.w("recovery token header mismatch", e2);
            return null;
        }
    }

    public static byte[] A0K(File file) {
        ObjectInputStream objectInputStream;
        if (!file.exists() || file.length() <= 0) {
            return null;
        }
        try {
            FileInputStream A0g = AnonymousClass0x9.A0g(file);
            try {
                objectInputStream = new ObjectInputStream(A0g);
                byte[] bArr = (byte[]) objectInputStream.readObject();
                objectInputStream.close();
                A0g.close();
                return bArr;
            } catch (Throwable th) {
                A0g.close();
                throw th;
            }
        } catch (Exception e) {
            Log.w("get byte array", e);
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public static byte[] A0L(byte[] bArr, String str) {
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = (char) bytes[i];
        }
        return C18300x5.A0y(A08("PBKDF2WithHmacSHA1And8BIT", bArr, cArr, 16, 128).getEncoded()).getEncoded();
    }
}
