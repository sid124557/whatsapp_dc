package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.msys.mci.DefaultCrypto;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;

/* renamed from: X.7rK  reason: invalid class name and case insensitive filesystem */
public final class C162137rK {
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0082, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0083, code lost:
        if (r8 != null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0089, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        X.C1457076y.A00.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008f, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0092, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x009d, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C151587Vj A00(android.content.Context r11, X.C151587Vj r12, boolean r13) {
        /*
            java.lang.String r5 = "FirebaseInstanceId"
            r7 = 3
            boolean r0 = android.util.Log.isLoggable(r5, r7)
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = "Writing ID to properties file"
            android.util.Log.d(r5, r0)
        L_0x000e:
            java.util.Properties r9 = new java.util.Properties
            r9.<init>()
            java.lang.String r1 = r12.A01
            java.lang.String r0 = "id"
            r9.setProperty(r0, r1)
            long r0 = r12.A00
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "cre"
            r9.setProperty(r0, r1)
            java.io.File r1 = A04(r11)
            r4 = 0
            r1.createNewFile()     // Catch:{ IOException -> 0x009e }
            java.lang.String r0 = "rw"
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x009e }
            r6.<init>(r1, r0)     // Catch:{ IOException -> 0x009e }
            java.nio.channels.FileChannel r8 = r6.getChannel()     // Catch:{ all -> 0x0090 }
            r8.lock()     // Catch:{ all -> 0x0080 }
            r0 = 0
            if (r13 == 0) goto L_0x006f
            long r10 = r8.size()     // Catch:{ all -> 0x0080 }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x006f
            r8.position(r0)     // Catch:{ 6zI | IOException -> 0x0055 }
            X.7Vj r12 = A03(r8)     // Catch:{ 6zI | IOException -> 0x0055 }
            r8.close()     // Catch:{ all -> 0x0090 }
            r6.close()     // Catch:{ IOException -> 0x009e }
            return r12
        L_0x0055:
            r3 = move-exception
            boolean r2 = android.util.Log.isLoggable(r5, r7)     // Catch:{ all -> 0x0080 }
            if (r2 == 0) goto L_0x006f
            java.lang.String r7 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0080 }
            int r2 = r7.length()     // Catch:{ all -> 0x0080 }
            int r2 = r2 + 58
            java.lang.StringBuilder r3 = X.AnonymousClass6CA.A0Y(r2)     // Catch:{ all -> 0x0080 }
            java.lang.String r2 = "Tried reading ID before writing new one, but failed with: "
            X.AnonymousClass6C7.A1G(r2, r7, r5, r3)     // Catch:{ all -> 0x0080 }
        L_0x006f:
            r8.truncate(r0)     // Catch:{ all -> 0x0080 }
            java.io.OutputStream r0 = java.nio.channels.Channels.newOutputStream(r8)     // Catch:{ all -> 0x0080 }
            r9.store(r0, r4)     // Catch:{ all -> 0x0080 }
            r8.close()     // Catch:{ all -> 0x0090 }
            r6.close()     // Catch:{ IOException -> 0x009e }
            return r12
        L_0x0080:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0082 }
        L_0x0082:
            r2 = move-exception
            if (r8 == 0) goto L_0x008f
            r8.close()     // Catch:{ all -> 0x0089 }
            goto L_0x008f
        L_0x0089:
            r1 = move-exception
            X.7Qh r0 = X.C1457076y.A00     // Catch:{ all -> 0x0090 }
            r0.A00(r3, r1)     // Catch:{ all -> 0x0090 }
        L_0x008f:
            throw r2     // Catch:{ all -> 0x0090 }
        L_0x0090:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0092 }
        L_0x0092:
            r2 = move-exception
            r6.close()     // Catch:{ all -> 0x0097 }
            goto L_0x009d
        L_0x0097:
            r1 = move-exception
            X.7Qh r0 = X.C1457076y.A00     // Catch:{ IOException -> 0x009e }
            r0.A00(r3, r1)     // Catch:{ IOException -> 0x009e }
        L_0x009d:
            throw r2     // Catch:{ IOException -> 0x009e }
        L_0x009e:
            r0 = move-exception
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r0 = r2.length()
            int r0 = r0 + 21
            java.lang.StringBuilder r1 = X.AnonymousClass6CA.A0Y(r0)
            java.lang.String r0 = "Failed to write key: "
            X.AnonymousClass6C7.A1F(r0, r2, r5, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162137rK.A00(android.content.Context, X.7Vj, boolean):X.7Vj");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C151587Vj A01(android.content.SharedPreferences r5) {
        /*
            java.lang.String r0 = "cre"
            java.lang.String r0 = X.C160237nI.A00(r0)
            r4 = 0
            java.lang.String r0 = r5.getString(r0, r4)
            if (r0 == 0) goto L_0x0012
            long r1 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0012 }
            goto L_0x0014
        L_0x0012:
            r1 = 0
        L_0x0014:
            java.lang.String r0 = "id"
            java.lang.String r0 = X.C160237nI.A00(r0)
            java.lang.String r3 = r5.getString(r0, r4)
            if (r3 != 0) goto L_0x0035
            java.lang.String r0 = "|P|"
            java.lang.String r0 = X.C160237nI.A00(r0)
            java.lang.String r0 = r5.getString(r0, r4)
            if (r0 != 0) goto L_0x002d
            return r4
        L_0x002d:
            java.security.PublicKey r0 = A05(r0)
            java.lang.String r3 = X.C160637o2.A01(r0)
        L_0x0035:
            X.7Vj r0 = new X.7Vj
            r0.<init>(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162137rK.A01(android.content.SharedPreferences):X.7Vj");
    }

    public static C151587Vj A03(FileChannel fileChannel) {
        Properties properties = new Properties();
        properties.load(Channels.newInputStream(fileChannel));
        try {
            long parseLong = Long.parseLong(properties.getProperty("cre"));
            String property = properties.getProperty(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            if (property == null) {
                String property2 = properties.getProperty("pub");
                if (property2 != null) {
                    property = C160637o2.A01(A05(property2));
                } else {
                    throw new C143676zI();
                }
            }
            return new C151587Vj(property, parseLong);
        } catch (NumberFormatException e) {
            throw new C143676zI(e);
        }
    }

    public static File A04(Context context) {
        String A0X;
        if (TextUtils.isEmpty("")) {
            A0X = "com.google.InstanceId.properties";
        } else {
            try {
                String encodeToString = Base64.encodeToString("".getBytes(DefaultCrypto.UTF_8), 11);
                StringBuilder A0Y = AnonymousClass6CA.A0Y(AnonymousClass6C7.A06(encodeToString) + 33);
                A0Y.append("com.google.InstanceId_");
                A0Y.append(encodeToString);
                A0X = AnonymousClass000.A0X(".properties", A0Y);
            } catch (UnsupportedEncodingException e) {
                throw AnonymousClass0x9.A0i(e);
            }
        }
        File A01 = AnonymousClass0RP.A01(context);
        if (A01 == null || !A01.isDirectory()) {
            Log.w("FirebaseInstanceId", "noBackupFilesDir doesn't exist, using regular files directory instead");
            A01 = context.getFilesDir();
        }
        return AnonymousClass002.A0A(A01, A0X);
    }

    public static PublicKey A05(String str) {
        try {
            try {
                return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                String valueOf = String.valueOf(e);
                Log.w("FirebaseInstanceId", AnonymousClass000.A0V("Invalid key stored ", valueOf, AnonymousClass6CA.A0Y(valueOf.length() + 19)));
                throw new C143676zI(e);
            }
        } catch (IllegalArgumentException e2) {
            throw new C143676zI(e2);
        }
    }

    public static final void A06(Context context, C151587Vj r4) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (r4.equals(A01(sharedPreferences))) {
                return;
            }
        } catch (C143676zI unused) {
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Writing key to shared preferences");
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(C160237nI.A00(PublicKeyCredentialControllerUtility.JSON_KEY_ID), r4.A01);
        edit.putString(C160237nI.A00("cre"), String.valueOf(r4.A00));
        edit.commit();
    }

    public final C151587Vj A07(Context context) {
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA");
            instance.initialize(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
            C151587Vj r4 = new C151587Vj(C160637o2.A01(instance.generateKeyPair().getPublic()), System.currentTimeMillis());
            C151587Vj A00 = A00(context, r4, true);
            if (A00 == null || A00.equals(r4)) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", "Generated new key");
                }
                A06(context, r4);
                return r4;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Loaded key after generating new one, using loaded one");
            }
            return A00;
        } catch (NoSuchAlgorithmException e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        if (r5 != null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.C1457076y.A00.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002d, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0030, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0034, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0035, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0036, code lost:
        X.C1457076y.A00.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x003b, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C151587Vj A02(java.io.File r10) {
        /*
            java.io.FileInputStream r4 = X.AnonymousClass0x9.A0g(r10)
            java.nio.channels.FileChannel r5 = r4.getChannel()     // Catch:{ all -> 0x002e }
            r6 = 0
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 1
            r5.lock(r6, r8, r10)     // Catch:{ all -> 0x001e }
            X.7Vj r0 = A03(r5)     // Catch:{ all -> 0x001e }
            r5.close()     // Catch:{ all -> 0x002e }
            r4.close()
            return r0
        L_0x001e:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0020 }
        L_0x0020:
            r2 = move-exception
            if (r5 == 0) goto L_0x002d
            r5.close()     // Catch:{ all -> 0x0027 }
            goto L_0x002d
        L_0x0027:
            r1 = move-exception
            X.7Qh r0 = X.C1457076y.A00     // Catch:{ all -> 0x002e }
            r0.A00(r3, r1)     // Catch:{ all -> 0x002e }
        L_0x002d:
            throw r2     // Catch:{ all -> 0x002e }
        L_0x002e:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0030 }
        L_0x0030:
            r2 = move-exception
            r4.close()     // Catch:{ all -> 0x0035 }
            throw r2
        L_0x0035:
            r1 = move-exception
            X.7Qh r0 = X.C1457076y.A00
            r0.A00(r3, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162137rK.A02(java.io.File):X.7Vj");
    }
}
