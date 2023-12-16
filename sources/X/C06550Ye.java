package X;

import android.content.Context;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.security.InvalidParameterException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0Ye  reason: invalid class name and case insensitive filesystem */
public class C06550Ye {
    public static final byte[] A00 = {0, 1};
    public static final byte[] A01 = {0, 1};
    public static final byte[] A02 = {0, 2};

    public static int A00(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 6;
        }
        if (i == 2) {
            return 7;
        }
        if (i == 3) {
            return 6;
        }
        if (i == 4) {
            return 5;
        }
        if (i == 5) {
            return 8;
        }
        throw AnonymousClass001.A0e(AnonymousClass000.A0Y("Unexpected backup result value: ", AnonymousClass001.A0o(), i));
    }

    public static void A0D(Context context, AnonymousClass0XM r7, C48772fR r8) {
        String str;
        int i;
        r8.A00();
        r8.A01("CoreBackupUtils/sendCreateBackupKeyIfNeeded/started", 2);
        if (AnonymousClass002.A0A(context.getFilesDir(), "key").exists()) {
            String str2 = null;
            try {
                AnonymousClass0NX A05 = A05(context);
                if (A05 != null) {
                    str2 = A05.A00.A00;
                }
            } catch (C377423v | InvalidParameterException unused) {
            }
            if (!TextUtils.isEmpty(str2)) {
                return;
            }
        }
        byte[] A0P = A0P();
        byte[] A0T = A0T(A0P);
        if (A0T != null) {
            ConditionVariable conditionVariable = new ConditionVariable(false);
            r7.A05(new C11300jQ(conditionVariable), A0T, A0P, 1);
            r8.A01("CoreBackupUtils/backup/waiting-for-the-key", 2);
            if (!conditionVariable.block(32000)) {
                str = "CoreBackupUtils/backup/backup-key-not-received";
                i = 4;
            } else {
                r8.A01("CoreBackupUtils/backup/key-received", 2);
                return;
            }
        } else {
            str = "CoreBackupUtils/backup/backup-key/null/account-hash/null";
            i = 3;
        }
        r8.A01(str, i);
    }

    public static void A0G(C55682qk r3, byte[] bArr) {
        int length = bArr.length;
        if (length != 32) {
            r3.A0A("crypto-iq-incorrect-account-hash-size", true, AnonymousClass000.A0Y("", AnonymousClass001.A0o(), length));
        }
    }

    public static void A0H(C55682qk r3, byte[] bArr) {
        int length = bArr.length;
        if (length != 16) {
            r3.A0A("crypto-iq-incorrect-account-salt-size", true, AnonymousClass000.A0Y("", AnonymousClass001.A0o(), length));
        }
    }

    public static void A0I(C55682qk r3, byte[] bArr) {
        int length = bArr.length;
        if (length != 32) {
            r3.A0A("crypto-iq-incorrect-server-salt-size", true, AnonymousClass000.A0Y("", AnonymousClass001.A0o(), length));
        }
    }

    public static long A02(AnonymousClass1VX r3) {
        return TimeUnit.MINUTES.toMillis((long) r3.A0N(955));
    }

    public static long A03(AnonymousClass1VX r6, boolean z) {
        if (z) {
            return -1;
        }
        Calendar instance = Calendar.getInstance();
        instance.set(14, 0);
        instance.set(13, 0);
        instance.set(12, 0);
        instance.set(11, r6.A0N(954) + 2);
        return Math.max(instance.getTimeInMillis(), System.currentTimeMillis() + A02(r6));
    }

    public static C04260Nl A04(InputStream inputStream) {
        int length = A00.length;
        byte[] bArr = new byte[length];
        byte[] bArr2 = new byte[32];
        byte[] bArr3 = new byte[16];
        byte[] bArr4 = new byte[16];
        int i = length + 1;
        byte[] bArr5 = new byte[(i + 32 + 16 + 16)];
        inputStream.read(bArr5);
        System.arraycopy(bArr5, 0, bArr, 0, length);
        if (Arrays.equals(bArr, A02) || Arrays.equals(bArr, A01)) {
            String valueOf = String.valueOf(bArr5[length]);
            byte[][] bArr6 = {bArr2, bArr3, bArr4};
            int i2 = 0;
            do {
                byte[] bArr7 = bArr6[i2];
                System.arraycopy(bArr5, i, bArr7, 0, bArr7.length);
                i += bArr7.length;
                i2++;
            } while (i2 < 3);
            return new C04260Nl(valueOf, bArr, bArr2, bArr3, bArr4);
        }
        throw new C377423v();
    }

    public static C130766cV A06(File file) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(file);
            C130766cV A07 = A07(fileInputStream);
            fileInputStream.close();
            return A07;
        } catch (IOException e) {
            Log.w("readProtobufBackupMetadata/failed", e);
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static ArrayList A09(File file, List list) {
        File[] listFiles;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        ArrayList A0s = AnonymousClass001.A0s();
        String pattern = simpleDateFormat.toPattern();
        String A012 = AnonymousClass342.A01(file.getName());
        String name = file.getName();
        String A0T = AnonymousClass000.A0T(name.substring(name.indexOf(46)), "");
        List list2 = list;
        int size = list2.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            String name2 = file.getName();
            strArr[i] = AnonymousClass000.A0T(name2.substring(name2.indexOf(46)), AnonymousClass001.A0n(list2, i));
        }
        File parentFile = file.getParentFile();
        if (!(parentFile == null || (listFiles = parentFile.listFiles()) == null)) {
            for (File file2 : listFiles) {
                String name3 = file2.getName();
                if (name3.startsWith(A012)) {
                    boolean endsWith = name3.endsWith(A0T);
                    int i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            String str = strArr[i2];
                            if (endsWith) {
                                break;
                            }
                            endsWith = name3.endsWith(str);
                            i2++;
                        } else if (!endsWith) {
                        }
                    }
                    if (name3.length() > A012.length() + pattern.length()) {
                        A0s.add(file2);
                    }
                }
            }
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            File A0B = AnonymousClass002.A0B(AnonymousClass000.A0V(file.getPath(), AnonymousClass001.A0m(it), AnonymousClass001.A0o()));
            if (A0B.exists()) {
                A0s.add(A0B);
            }
        }
        Collections.sort(A0s, new C13440nB(A012, simpleDateFormat));
        return A0s;
    }

    public static void A0K(AnonymousClass4BZ r14, FileChannel fileChannel, WritableByteChannel writableByteChannel, int i, int i2) {
        long j = 0;
        long j2 = 0;
        while (true) {
            FileChannel fileChannel2 = fileChannel;
            if (j < fileChannel.size()) {
                j2 += fileChannel2.transferTo(j, Math.min(131072, fileChannel.size() - j), writableByteChannel);
                AnonymousClass4BZ r2 = r14;
                if (r14 != null) {
                    int i3 = i2;
                    if (i2 > 0) {
                        r2.Bez(i, i3, j2, fileChannel.size());
                    }
                }
                j += 131072;
            } else {
                return;
            }
        }
    }

    public static void A0L(File file) {
        if (file.exists()) {
            try {
                file.renameTo(AnonymousClass002.A0A(file.getParentFile(), AnonymousClass342.A00(file, "", new Date())));
            } catch (SecurityException unused) {
            }
        }
    }

    public static void A0M(File file, ArrayList arrayList) {
        Collections.sort(arrayList, new C13440nB(AnonymousClass342.A01(file.getName()), new SimpleDateFormat("yyyy-MM-dd", Locale.US)));
    }

    public static void A0N(File[] fileArr) {
        if (fileArr != null) {
            for (File A0O : fileArr) {
                C627536m.A0O(A0O);
            }
        }
    }

    public static byte[] A0P() {
        return C627236i.A0I(16);
    }

    public static int A01(String str, String str2) {
        if (str2.equals(str)) {
            return 0;
        }
        if (str.endsWith(".crypt")) {
            return 1;
        }
        String[] split = str.split(".crypt");
        if (split.length != 2) {
            Log.e(AnonymousClass000.A0T("msgstore/get-version/unexpected-filename ", str));
            return -1;
        }
        try {
            return Integer.parseInt(split[1]);
        } catch (NumberFormatException e) {
            Log.e(AnonymousClass000.A0T("msgstore/get-version/unexpected-filename ", str), e);
            return -1;
        }
    }

    public static AnonymousClass0NX A05(Context context) {
        File A0A = AnonymousClass002.A0A(context.getFilesDir(), "key");
        if (!A0A.exists()) {
            Log.w("backupkey/getinfo/does-not-exist");
        } else {
            byte[] A0K = C627236i.A0K(A0A);
            if (A0K != null) {
                int length = A0K.length;
                byte[] bArr = A00;
                int length2 = bArr.length;
                int i = length2 + 1;
                int i2 = i + 32;
                int i3 = i2 + 16;
                int i4 = i3 + 32 + 16;
                if (length >= i4 + 32) {
                    byte[] bArr2 = new byte[length2];
                    System.arraycopy(A0K, 0, bArr2, 0, length2);
                    if (Arrays.equals(bArr2, bArr)) {
                        String valueOf = String.valueOf(A0K[length2]);
                        byte[] bArr3 = new byte[32];
                        System.arraycopy(A0K, i, bArr3, 0, 32);
                        byte[] bArr4 = new byte[16];
                        System.arraycopy(A0K, i2, bArr4, 0, 16);
                        byte[] bArr5 = new byte[32];
                        System.arraycopy(A0K, i3, bArr5, 0, 32);
                        byte[] A0Q = A0Q();
                        byte[] bArr6 = new byte[32];
                        System.arraycopy(A0K, i4, bArr6, 0, 32);
                        return new AnonymousClass0NX(valueOf, bArr2, bArr3, bArr4, bArr5, A0Q, bArr6);
                    }
                    throw new C377423v();
                }
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append(A0A);
                throw new InvalidParameterException(AnonymousClass000.A0X(" size mismatch", A0o));
            }
        }
        return null;
    }

    public static C130766cV A07(InputStream inputStream) {
        C130756cU A002 = C130756cU.A00(inputStream);
        if (A002.A0Q()) {
            return A002.A0M();
        }
        return null;
    }

    public static String A08(AnonymousClass22O r2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(".crypt");
        return AnonymousClass000.A0h(A0o, r2.A05());
    }

    public static List A0A(AnonymousClass22O r1) {
        List A0B = A0B(r1, AnonymousClass22O.A00());
        A0B.add(A08(AnonymousClass22O.UNENCRYPTED));
        return A0B;
    }

    public static List A0B(AnonymousClass22O r3, AnonymousClass22O r4) {
        if (r3.A05() <= r4.A05()) {
            ArrayList A0I = AnonymousClass002.A0I(r3);
            for (AnonymousClass22O A08 : AnonymousClass22O.A04(r3, r4)) {
                A0I.add(A08(A08));
            }
            return A0I;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("msgstore/get-db-crypt-extension-range/illegal-range [");
        A0o.append(r3);
        AnonymousClass001.A1M(A0o);
        A0o.append(r4);
        throw AnonymousClass000.A0F(")", A0o);
    }

    public static void A0C(Context context) {
        AnonymousClass002.A0A(context.getFilesDir(), "key").delete();
    }

    public static void A0E(Context context, String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        String str2 = str;
        Log.i(AnonymousClass000.A0V("backupkey/set/v=", str2, AnonymousClass001.A0o()));
        byte[] bArr5 = bArr;
        Arrays.toString(bArr5);
        byte[] bArr6 = bArr2;
        Arrays.toString(bArr6);
        File A0A = AnonymousClass002.A0A(context.getFilesDir(), "key");
        byte[] bArr7 = new byte[16];
        Arrays.toString(bArr7);
        byte[] bArr8 = {Byte.parseByte(str2)};
        byte[] bArr9 = A00;
        byte[] bArr10 = bArr4;
        byte[] bArr11 = new byte[(bArr9.length + 1 + bArr5.length + bArr10.length + bArr3.length + 16 + bArr6.length)];
        byte[][] bArr12 = new byte[7][];
        bArr12[0] = bArr9;
        bArr12[1] = bArr8;
        AnonymousClass001.A1H(bArr5, bArr10, bArr12);
        bArr12[4] = bArr3;
        bArr12[5] = bArr7;
        bArr12[6] = bArr2;
        int i = 0;
        int i2 = 0;
        do {
            byte[] bArr13 = bArr12[i];
            System.arraycopy(bArr13, 0, bArr11, i2, bArr13.length);
            i2 += bArr13.length;
            i++;
        } while (i < 7);
        Arrays.toString(bArr11);
        try {
            C627236i.A0B(A0A, bArr11);
            byte[] A0K = C627236i.A0K(A0A);
            A05(context);
            Arrays.equals(bArr11, A0K);
        } catch (Exception e) {
            Log.e("backupkey/set/unable-to-write ", e);
        }
    }

    public static void A0F(C55682qk r2, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                if (Byte.parseByte(str) >= 0) {
                    return;
                }
            } catch (NumberFormatException unused) {
            }
        }
        r2.A0A("crypto-iq-incorrect-key-version", true, str);
    }

    public static void A0J(AnonymousClass310 r3) {
        A0N(r3.A03().listFiles(new C18030wd(0)));
        A0N(r3.A02().listFiles());
    }

    public static boolean A0O(C130756cU r2, String str) {
        if (r2.A0Q() && r2.A0M().A0v()) {
            String A0N = r2.A0M().A0N();
            if (!TextUtils.isEmpty(A0N) && !str.endsWith(A0N)) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("EncBackupUtils/has-jid-user-mismatch/expected-jid-user-ends-with: ");
                A0o.append(A0N);
                Log.e(AnonymousClass000.A0V("  actual-jid-user: ", str, A0o));
                return true;
            }
        }
        return false;
    }

    public static byte[] A0Q() {
        return C627236i.A0G();
    }

    public static byte[] A0R() {
        return C627236i.A0F();
    }

    public static byte[] A0S() {
        return C627236i.A0G();
    }

    public static byte[] A0T(byte[] bArr) {
        MessageDigest messageDigest;
        Arrays.toString(bArr);
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            Log.e("calculateahash/digester ", e);
            messageDigest = null;
        }
        if (messageDigest == null) {
            Log.e("calculateahash/digester is null");
            return null;
        }
        messageDigest.reset();
        messageDigest.update(bArr);
        return messageDigest.digest();
    }
}
