package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.36Q  reason: invalid class name */
public class AnonymousClass36Q {
    public static final Object A00 = AnonymousClass002.A0D();
    public static final byte[] A01 = {0, 2};

    public static C174218Tk A00(byte[] bArr) {
        ObjectInputStream objectInputStream;
        if (bArr != null) {
            try {
                objectInputStream = new ObjectInputStream(AnonymousClass0x9.A0d(bArr));
                C174218Tk r0 = (C174218Tk) objectInputStream.readObject();
                objectInputStream.close();
                return r0;
            } catch (IOException | ClassNotFoundException e) {
                Log.e("BackupTokenUtils/convertByteArrayToLRUCache/failed with exception:", e);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return new C174218Tk(5);
        throw th;
    }

    public static void A02(Context context, AnonymousClass33p r9, String str) {
        byte[] bArr;
        String str2;
        String str3;
        int[] iArr = {1, 2};
        int i = 0;
        do {
            int i2 = iArr[i];
            C174218Tk A002 = A00(A05(context, i2));
            String A05 = C627236i.A05(str);
            if (!TextUtils.isEmpty(A05)) {
                A002.remove(A05);
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            C18260x0.A1G(A0o, AnonymousClass0x7.A0A("BackupTokenUtils/deleteBackupToken/updated LRUCache size is ", A0o, A002));
            if (A002.size() == 0) {
                synchronized (A00) {
                    File filesDir = context.getFilesDir();
                    if (i2 == 2) {
                        str2 = "foa_backup_token";
                    } else {
                        str2 = "backup_token";
                    }
                    AnonymousClass002.A0A(filesDir, str2).delete();
                }
                SharedPreferences.Editor A03 = C18270x1.A03(r9);
                if (i2 == 2) {
                    str3 = "backup_token_foa_file_timestamp";
                } else {
                    C18270x1.A0g(A03, "backup_token_file_timestamp");
                    A03 = C18270x1.A03(r9);
                    str3 = "backup_token_source";
                }
                C18270x1.A0g(A03, str3);
            } else {
                try {
                    ByteArrayOutputStream A0e = AnonymousClass0x9.A0e();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(A0e);
                    objectOutputStream.writeObject(A002);
                    objectOutputStream.flush();
                    bArr = A0e.toByteArray();
                } catch (IOException e) {
                    Log.e("BackupTokenUtils/deleteBackupToken/write token byte array failed/IOException:", e);
                    bArr = null;
                }
                A03(context, (AnonymousClass2I1) null, bArr, i2);
            }
            i++;
        } while (i < 2);
    }

    public static void A03(Context context, AnonymousClass2I1 r7, byte[] bArr, int i) {
        String str;
        Log.i("BackupTokenUtils/saveEncryptedBackupToken/update block store");
        if (i == 1) {
            C127036Qj r5 = new C127036Qj(context);
            AnonymousClass7GI r4 = new AnonymousClass7GI();
            C157487iN r3 = new C157487iN((AnonymousClass70D) null);
            r3.A03 = new C127806Tj[]{C1461979a.A04};
            r3.A01 = new AnonymousClass89O(r5);
            r3.A02 = false;
            r3.A00 = 1651;
            Task A02 = r5.A02(r3.A00(), 0);
            A02.addOnSuccessListener(new AnonymousClass3B1(r5, r4, r7, bArr));
            A02.addOnFailureListener(new C1896191z(r7, 2));
        }
        synchronized (A00) {
            try {
                File filesDir = context.getFilesDir();
                if (i == 2) {
                    str = "foa_backup_token";
                } else {
                    str = "backup_token";
                }
                C627236i.A0B(AnonymousClass002.A0A(filesDir, str), bArr);
                Log.i("BackupTokenUtils/saveEncryptedBackupToken/successfully write to backup_token file");
            } catch (IOException e) {
                Log.e("BackupTokenUtils/saveEncryptedBackupToken/unable to write to backup_token file:", e);
            }
        }
    }

    public static void A04(AnonymousClass33p r3, Exception exc, int i) {
        String str;
        if (exc != null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(AnonymousClass000.A0O(exc));
            str = AnonymousClass000.A0a(" | ", A0o, exc);
        } else if (i == 0) {
            str = "null_token";
        } else {
            str = "success";
        }
        C18260x0.A0s("BackupTokenUtils/saveBackupTokenRetrievalErrorMessage/Block Store token error message: ", str, AnonymousClass001.A0o());
        if (str.length() > 256) {
            str = AnonymousClass0x7.A0r(str, 256);
        }
        C18270x1.A0j(C18270x1.A03(r3), "backup_token_retrieval_error", str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0066, code lost:
        if (r8.length == 0) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0085, code lost:
        if (r8.length == 0) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r8.length == 0) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A06(android.content.Context r10, X.AnonymousClass33p r11, java.lang.String r12, int r13) {
        /*
            java.lang.String r0 = "BackupTokenUtils/getTokenByPhoneNumber"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r3 = r13
            byte[] r8 = A05(r10, r13)
            if (r8 == 0) goto L_0x0010
            int r1 = r8.length
            r0 = 1
            if (r1 != 0) goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            r13 = 0
            if (r0 != 0) goto L_0x001a
            java.lang.String r0 = "BackupTokenUtils/getTokenByPhoneNumber/no data read from backup_token file"
        L_0x0016:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0019:
            return r13
        L_0x001a:
            int r1 = r8.length
            r0 = 42
            if (r1 > r0) goto L_0x0047
            java.lang.String r0 = "BackupTokenUtils/getTokenByPhoneNumber/single token found"
        L_0x0021:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = X.C58172up.A0T
            r2.append(r0)
            int r0 = r12.length()
            int r1 = r0 + -4
            r0 = 0
            int r0 = java.lang.Math.max(r1, r0)
            java.lang.String r0 = r12.substring(r0)
            java.lang.String r12 = X.AnonymousClass000.A0X(r0, r2)
            byte[] r11 = A01
            java.lang.String r10 = "AES/OFB/NoPadding"
            if (r8 == 0) goto L_0x0019
            goto L_0x0090
        L_0x0047:
            X.8Tk r2 = A00(r8)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "BackupTokenUtils/getTokenByPhoneNumber/LRUCache size is "
            int r0 = X.AnonymousClass0x7.A0A(r0, r1, r2)
            X.C18260x0.A1G(r1, r0)
            java.lang.String r0 = X.C627236i.A05(r12)
            java.lang.Object r8 = r2.get(r0)
            byte[] r8 = (byte[]) r8
            if (r8 == 0) goto L_0x0068
            int r1 = r8.length
            r0 = 1
            if (r1 != 0) goto L_0x0069
        L_0x0068:
            r0 = 0
        L_0x0069:
            if (r0 == 0) goto L_0x006e
            java.lang.String r0 = "BackupTokenUtils/getTokenByPhoneNumber/decrypt token from LRUCache"
            goto L_0x0021
        L_0x006e:
            r0 = 1
            if (r3 != r0) goto L_0x008d
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r11)
            java.lang.String r0 = "token_used_during_reg"
            java.lang.String r1 = X.AnonymousClass0x9.A0v(r1, r0)
            r0 = 3
            byte[] r8 = android.util.Base64.decode(r1, r0)
            if (r8 == 0) goto L_0x0087
            int r1 = r8.length
            r0 = 1
            if (r1 != 0) goto L_0x0088
        L_0x0087:
            r0 = 0
        L_0x0088:
            if (r0 == 0) goto L_0x008d
            java.lang.String r0 = "BackupTokenUtils/getTokenByPhoneNumber/decrypt token from shared preferences"
            goto L_0x0021
        L_0x008d:
            java.lang.String r0 = "BackupTokenUtils/getTokenByPhoneNumber/no token saved for this phone number"
            goto L_0x0016
        L_0x0090:
            int r9 = r11.length     // Catch:{ Exception -> 0x00e8 }
            r7 = 4
            int r6 = r9 + 4
            r5 = 16
            int r4 = r6 + 16
            int r2 = r4 + 20
            int r3 = r8.length     // Catch:{ Exception -> 0x00e8 }
            if (r3 < r2) goto L_0x00c9
            byte[] r0 = new byte[r9]     // Catch:{ Exception -> 0x00e8 }
            r1 = 0
            java.lang.System.arraycopy(r8, r1, r0, r1, r9)     // Catch:{ Exception -> 0x00e8 }
            boolean r0 = java.util.Arrays.equals(r0, r11)     // Catch:{ Exception -> 0x00e8 }
            if (r0 == 0) goto L_0x00e2
            byte[] r0 = new byte[r7]     // Catch:{ Exception -> 0x00e8 }
            java.lang.System.arraycopy(r8, r9, r0, r1, r7)     // Catch:{ Exception -> 0x00e8 }
            byte[] r2 = new byte[r5]     // Catch:{ Exception -> 0x00e8 }
            java.lang.System.arraycopy(r8, r6, r2, r1, r5)     // Catch:{ Exception -> 0x00e8 }
            byte[] r0 = A07(r0, r12)     // Catch:{ Exception -> 0x00e8 }
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec     // Catch:{ Exception -> 0x00e8 }
            r1.<init>(r0, r10)     // Catch:{ Exception -> 0x00e8 }
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r10)     // Catch:{ Exception -> 0x00e8 }
            X.C18290x4.A1S(r1, r0, r2)     // Catch:{ Exception -> 0x00e8 }
            int r3 = r3 - r4
            byte[] r13 = r0.doFinal(r8, r4, r3)     // Catch:{ Exception -> 0x00e8 }
            return r13
        L_0x00c9:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r0 = "size mismatch expected length:"
            r1.append(r0)     // Catch:{ Exception -> 0x00e8 }
            r1.append(r2)     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r0 = ", actual length:"
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r3)     // Catch:{ Exception -> 0x00e8 }
            java.security.InvalidParameterException r1 = new java.security.InvalidParameterException     // Catch:{ Exception -> 0x00e8 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00e8 }
            goto L_0x00e7
        L_0x00e2:
            X.23v r1 = new X.23v     // Catch:{ Exception -> 0x00e8 }
            r1.<init>()     // Catch:{ Exception -> 0x00e8 }
        L_0x00e7:
            throw r1     // Catch:{ Exception -> 0x00e8 }
        L_0x00e8:
            r1 = move-exception
            java.lang.String r0 = "BackupTokenUtils/decrypt/unable to decrypt"
            com.whatsapp.util.Log.e(r0, r1)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36Q.A06(android.content.Context, X.33p, java.lang.String, int):byte[]");
    }

    public static void A01(Context context, C56612sH r11, AnonymousClass33p r12, AnonymousClass2I1 r13, String str, byte[] bArr, int i) {
        byte[] bArr2;
        String str2;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(C58172up.A0T);
        String A0X = AnonymousClass000.A0X(str.substring(Math.max(str.length() - 4, 0)), A0o);
        byte[] bArr3 = A01;
        try {
            byte[] A012 = AnonymousClass29O.A01(4);
            byte[] A013 = AnonymousClass29O.A01(16);
            byte[] A1Y = C18310x6.A1Y(new SecretKeySpec(A07(A012, A0X), "AES/OFB/NoPadding"), C18330xA.A0D(A013), Cipher.getInstance("AES/OFB/NoPadding"), bArr, 1);
            bArr2 = new byte[(bArr3.length + A012.length + A013.length + A1Y.length)];
            byte[][] bArr4 = new byte[4][];
            bArr4[0] = bArr3;
            bArr4[1] = A012;
            AnonymousClass001.A1H(A013, A1Y, bArr4);
            int i2 = 0;
            int i3 = 0;
            while (true) {
                byte[] bArr5 = bArr4[i2];
                System.arraycopy(bArr5, 0, bArr2, i3, bArr5.length);
                i3 += bArr5.length;
                i2++;
                if (i2 >= 4) {
                    break;
                }
            }
        } catch (Exception e) {
            Log.e("BackupTokenUtils/encrypt/unable to encrypt", e);
            bArr2 = null;
        }
        Log.i("BackupTokenUtils/encryptAndSaveToken/save token to LRUCache");
        int i4 = i;
        C174218Tk A002 = A00(A05(context, i4));
        String A05 = C627236i.A05(str);
        if (!(TextUtils.isEmpty(A05) || bArr2 == null || bArr2.length == 0)) {
            A002.put(A05, bArr2);
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        C18260x0.A1G(A0o2, AnonymousClass0x7.A0A("BackupTokenUtils/encryptAndSaveToken/updated LRUCache size is ", A0o2, A002));
        ByteArrayOutputStream A0e = AnonymousClass0x9.A0e();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(A0e);
        objectOutputStream.writeObject(A002);
        objectOutputStream.flush();
        byte[] byteArray = A0e.toByteArray();
        if (!(byteArray == null || byteArray.length == 0)) {
            A03(context, r13, byteArray, i4);
        }
        long A0H = r11.A0H();
        if (i4 == 2) {
            str2 = "backup_token_foa_file_timestamp";
        } else {
            str2 = "backup_token_file_timestamp";
        }
        C18260x0.A0M(r12, str2, A0H);
    }

    public static byte[] A05(Context context, int i) {
        String str;
        byte[] A0K;
        File filesDir = context.getFilesDir();
        if (i == 2) {
            str = "foa_backup_token";
        } else {
            str = "backup_token";
        }
        File A0A = AnonymousClass002.A0A(filesDir, str);
        if (!A0A.exists()) {
            Log.i("BackupTokenUtils/getBackupTokenFromLocalFile/no content found");
            return null;
        }
        synchronized (A00) {
            A0K = C627236i.A0K(A0A);
        }
        return A0K;
    }

    public static byte[] A07(byte[] bArr, String str) {
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = (char) bytes[i];
        }
        return C18300x5.A0y(C627236i.A08("PBKDF2WithHmacSHA1And8BIT", bArr, cArr, 16, 128).getEncoded()).getEncoded();
    }
}
