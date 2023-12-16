package X;

import android.text.TextUtils;
import com.whatsapp.backup.encryptedbackup.EncBackupViewModel;
import com.whatsapp.jobqueue.job.DeleteAccountFromHsmServerJob;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Random;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* renamed from: X.0WN  reason: invalid class name */
public class AnonymousClass0WN {
    public static final byte[] A08 = "backup encryption".getBytes();
    public static final byte[] A09 = "metadata authentication".getBytes();
    public static final byte[] A0A = "metadata encryption".getBytes();
    public final C49712gy A00;
    public final C04860Qy A01;
    public final C56512s6 A02;
    public final AnonymousClass33p A03;
    public final C161767qP A04;
    public final C60902zM A05 = new C60902zM(new Random(), 3, 200);
    public final AnonymousClass4FS A06;
    public final JniBridge A07;

    public static /* synthetic */ void A00(C16830u2 r4, AnonymousClass0WN r5, String str, byte[] bArr, boolean z) {
        C16830u2 r3 = r4;
        try {
            r5.A01.A08(bArr);
            AnonymousClass33p r1 = r5.A03;
            r1.A1u(true);
            r1.A1v(z);
            if (!z && str != null) {
                r5.A0E(str);
            }
            C18170wr r12 = (C18170wr) r3;
            if (r12.A01 != 0) {
                ((EncBackupViewModel) r12.A00).A0V(0);
            } else {
                ((EncBackupViewModel) r12.A00).A0W(0, -1, 0);
            }
        } catch (IOException unused) {
            r3.BSH("Failed to store root key", 6, 4, -1, -1);
        }
    }

    public void A08(C16830u2 r9, String str) {
        C16830u2 r1 = r9;
        new C02000Dg(r1, this, this.A04, this.A05, this.A06, this.A07, str).A05();
    }

    public void A0A(C16830u2 r8, String str, byte[] bArr, boolean z) {
        this.A06.BkM(new C13110me(r8, this, str, bArr, z));
    }

    public void A0C(C03590Ku r10, String str) {
        JniBridge jniBridge = this.A07;
        C03590Ku r2 = r10;
        new C02010Dh(this, r2, this.A03, this.A04, this.A05, this.A06, jniBridge, str).A05();
    }

    public String A01() {
        try {
            C04860Qy r1 = this.A01;
            byte[] A092 = r1.A09();
            if (A092 == null) {
                A092 = AnonymousClass0YS.A08();
                r1.A08(A092);
            }
            String A0E = C107575bX.A0E(A092);
            C626936e.A0B(AnonymousClass000.A1U(A0E.length(), 64));
            return A0E;
        } catch (IOException e) {
            Log.e("encb/EncBackupManager/getAndSaveRootKey/failed to get and save root key", e);
            return null;
        }
    }

    public void A04() {
        this.A00.A02(DeleteAccountFromHsmServerJob.A00());
    }

    public void A05() {
        this.A06.BkM(new C11310jR(this));
        if (!this.A03.A2F()) {
            A04();
        }
    }

    public void A06() {
        AnonymousClass33p r1 = this.A03;
        r1.A1u(false);
        r1.A1v(false);
        r1.A1B(0);
        r1.A1w(false);
        this.A01.A06();
        Log.i("encb/EncBackupManager/encrypted backup has been disabled");
    }

    public void A07() {
        AnonymousClass33p r1 = this.A03;
        r1.A1u(true);
        r1.A1v(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0062, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        com.whatsapp.util.Log.w("encb/EncBackupManager/encrypt media failed", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0066, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0067, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0068, code lost:
        com.whatsapp.util.Log.w("encb/EncBackupManager/encrypt media failed", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0067 A[ExcHandler: InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException (r0v4 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:3:0x0021] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(java.io.File r8, java.io.File r9, byte[] r10) {
        /*
            r7 = this;
            java.lang.String r3 = "encb/EncBackupManager/encrypt media failed"
            X.0Qy r0 = r7.A01
            byte[] r1 = r0.A09()
            r6 = 0
            if (r1 == 0) goto L_0x006b
            r0 = 48
            byte[] r4 = X.AnonymousClass31Q.A00(r1, r10, r0)
            r2 = 32
            byte[] r1 = new byte[r2]
            java.lang.System.arraycopy(r4, r6, r1, r6, r2)
            r0 = 16
            byte[] r5 = new byte[r0]
            java.lang.System.arraycopy(r4, r2, r5, r6, r0)
            java.lang.String r0 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r4 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0067 }
            java.lang.String r0 = "AES"
            javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0067 }
            r2.<init>(r1, r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0067 }
            javax.crypto.spec.IvParameterSpec r1 = new javax.crypto.spec.IvParameterSpec     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0067 }
            r1.<init>(r5)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0067 }
            r0 = 1
            r4.init(r0, r2, r1)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0067 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0062, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0067, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0067, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0067 }
            r2.<init>(r8)     // Catch:{ IOException -> 0x0062, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0067, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0067, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0067 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x0058 }
            r1.<init>(r9)     // Catch:{ all -> 0x0058 }
            javax.crypto.CipherOutputStream r0 = new javax.crypto.CipherOutputStream     // Catch:{ all -> 0x0058 }
            r0.<init>(r1, r4)     // Catch:{ all -> 0x0058 }
            X.C627536m.A0I(r2, r0)     // Catch:{ all -> 0x004e }
            r0.close()     // Catch:{ all -> 0x0058 }
            r2.close()     // Catch:{ IOException -> 0x0062, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0067, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0067, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0067 }
            return
        L_0x004e:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0053 }
            goto L_0x0057
        L_0x0053:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0058 }
        L_0x0057:
            throw r1     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x005d }
            goto L_0x0061
        L_0x005d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0062, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0067, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0067, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0067 }
        L_0x0061:
            throw r1     // Catch:{ IOException -> 0x0062, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0067, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0067, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0067 }
        L_0x0062:
            r0 = move-exception
            com.whatsapp.util.Log.w(r3, r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0067 }
            return
        L_0x0067:
            r0 = move-exception
            com.whatsapp.util.Log.w(r3, r0)
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0WN.A0D(java.io.File, java.io.File, byte[]):void");
    }

    public boolean A0G() {
        return this.A03.A2E();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005d, code lost:
        com.whatsapp.util.Log.w("encb/EncBackupManager/decrypt media failed", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005c A[ExcHandler: InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException (r0v3 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:3:0x001f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0I(java.io.File r8, java.io.File r9, byte[] r10) {
        /*
            r7 = this;
            java.lang.String r4 = "encb/EncBackupManager/decrypt media failed"
            X.0Qy r0 = r7.A01
            byte[] r1 = r0.A09()
            r3 = 0
            if (r1 == 0) goto L_0x0060
            r0 = 48
            byte[] r6 = X.AnonymousClass31Q.A00(r1, r10, r0)
            r5 = 32
            byte[] r2 = new byte[r5]
            java.lang.System.arraycopy(r6, r3, r2, r3, r5)
            r1 = 16
            byte[] r0 = new byte[r1]
            java.lang.System.arraycopy(r6, r5, r0, r3, r1)
            javax.crypto.Cipher r1 = X.AnonymousClass001.A0x(r2, r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x005c }
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0057, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x005c, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x005c, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x005c }
            r0.<init>(r8)     // Catch:{ IOException -> 0x0057, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x005c, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x005c, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x005c }
            javax.crypto.CipherInputStream r2 = new javax.crypto.CipherInputStream     // Catch:{ IOException -> 0x0057, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x005c, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x005c, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x005c }
            r2.<init>(r0, r1)     // Catch:{ IOException -> 0x0057, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x005c, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x005c, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x005c }
            X.2s6 r0 = r7.A02     // Catch:{ all -> 0x004d }
            X.2gw r1 = r0.A00()     // Catch:{ all -> 0x004d }
            X.202 r0 = new X.202     // Catch:{ all -> 0x004d }
            r0.<init>(r1, r9)     // Catch:{ all -> 0x004d }
            X.C627536m.A0I(r2, r0)     // Catch:{ all -> 0x0043 }
            r0.close()     // Catch:{ all -> 0x004d }
            r2.close()     // Catch:{ IOException -> 0x0057, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x005c, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x005c, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x005c }
            r0 = 1
            return r0
        L_0x0043:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0048 }
            goto L_0x004c
        L_0x0048:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x004d }
        L_0x004c:
            throw r1     // Catch:{ all -> 0x004d }
        L_0x004d:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0052 }
            goto L_0x0056
        L_0x0052:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0057, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x005c, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x005c, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x005c }
        L_0x0056:
            throw r1     // Catch:{ IOException -> 0x0057, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x005c, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x005c, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x005c }
        L_0x0057:
            r0 = move-exception
            com.whatsapp.util.Log.w(r4, r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x005c }
            return r3
        L_0x005c:
            r0 = move-exception
            com.whatsapp.util.Log.w(r4, r0)
        L_0x0060:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0WN.A0I(java.io.File, java.io.File, byte[]):boolean");
    }

    public byte[] A0L() {
        byte[] A092 = this.A01.A09();
        if (A092 != null) {
            return AnonymousClass31Q.A00(A092, A08, 32);
        }
        return null;
    }

    public byte[] A0M() {
        byte[] A092 = this.A01.A09();
        C626936e.A0F(AnonymousClass000.A1W(A092), "root key is not defined");
        return AnonymousClass31Q.A00(A092, A09, 32);
    }

    public byte[] A0N() {
        byte[] A092 = this.A01.A09();
        C626936e.A0F(AnonymousClass000.A1W(A092), "root key is not defined");
        return AnonymousClass31Q.A00(A092, A0A, 32);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        com.whatsapp.util.Log.e("encb/EncBackupManager/getMediaDecryptionHash failed", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038 A[ExcHandler: InvalidKeyException | NoSuchAlgorithmException (r1v1 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0008] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A0O(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r3 = "HmacSHA256"
            X.0Qy r0 = r4.A01
            byte[] r1 = r0.A09()
            javax.crypto.Mac r2 = javax.crypto.Mac.getInstance(r3)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x0038 }
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x0038 }
            r0.<init>(r1, r3)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x0038 }
            r2.init(r0)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x0038 }
            byte[] r1 = r5.getBytes()     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x0038 }
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0031, InvalidKeyException | NoSuchAlgorithmException -> 0x0038 }
            r0.update(r1)     // Catch:{ NoSuchAlgorithmException -> 0x0031, InvalidKeyException | NoSuchAlgorithmException -> 0x0038 }
            byte[] r0 = r0.digest()     // Catch:{ NoSuchAlgorithmException -> 0x0031, InvalidKeyException | NoSuchAlgorithmException -> 0x0038 }
            r2.update(r0)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x0038 }
            byte[] r0 = X.C107575bX.A0H(r6)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x0038 }
            byte[] r0 = r2.doFinal(r0)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x0038 }
            return r0
        L_0x0031:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x0038 }
            r0.<init>(r1)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x0038 }
            throw r0     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x0038 }
        L_0x0038:
            r1 = move-exception
            java.lang.String r0 = "encb/EncBackupManager/getMediaDecryptionHash failed"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0WN.A0O(java.lang.String, java.lang.String):byte[]");
    }

    public AnonymousClass0WN(C49712gy r6, C04860Qy r7, C56512s6 r8, AnonymousClass33p r9, C161767qP r10, AnonymousClass4FS r11, JniBridge jniBridge) {
        this.A06 = r11;
        this.A07 = jniBridge;
        this.A00 = r6;
        this.A02 = r8;
        this.A01 = r7;
        this.A03 = r9;
        this.A04 = r10;
    }

    public String A02(String str) {
        if (!TextUtils.isEmpty(str) && A0G()) {
            try {
                return AnonymousClass0YS.A03(str, A0N(), A0M());
            } catch (SecurityException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
                Log.e("encb/EncBackupManager/failed to decrypt backup metadata", e);
            }
        }
        return null;
    }

    public String A03(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!A0G()) {
            return str;
        }
        try {
            return AnonymousClass0YS.A04(str, A0N(), A0M(), C06550Ye.A0S());
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            Log.e("encb/EncBackupManager/failed to encrypt backup metadata", e);
            return null;
        }
    }

    public void A09(C16830u2 r4, String str) {
        C626936e.A0B(AnonymousClass000.A1U(str.length(), 64));
        A0A(r4, (String) null, C107575bX.A0H(str), true);
    }

    public void A0B(C03580Kt r6, String str) {
        byte[] bytes = str.getBytes();
        C03880Lx A002 = this.A01.A00();
        C626936e.A06(A002);
        r6.A00.A0a(MessageDigest.isEqual(C627236i.A09(bytes, A002.A02, A002.A00, 512).getEncoded(), A002.A01));
    }

    public void A0E(String str) {
        byte[] bytes = str.getBytes();
        byte[] A0I = C627236i.A0I(64);
        try {
            this.A01.A07(new C03880Lx(C627236i.A09(bytes, A0I, 100000, 512).getEncoded(), A0I, 100000));
            this.A03.A1C(5);
        } catch (IOException e) {
            Log.e("encb/EncBackupManager/storePasswordHash failed", e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r3 = r4.A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0F(boolean r5) {
        /*
            r4 = this;
            boolean r0 = r4.A0G()
            if (r0 == 0) goto L_0x001a
            X.33p r3 = r4.A03
            java.lang.String r2 = r3.A0X()
            if (r2 == 0) goto L_0x001a
            if (r5 != 0) goto L_0x001b
            int r1 = r3.A0G(r2)
            r0 = 1
            if (r1 == r0) goto L_0x001a
        L_0x0017:
            r3.A1a(r2, r0)
        L_0x001a:
            return
        L_0x001b:
            r0 = 2
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0WN.A0F(boolean):void");
    }

    public boolean A0H() {
        if (!A0G()) {
            return false;
        }
        AnonymousClass33p r2 = this.A03;
        if (r2.A05() == 0 || r2.A05() == 1 || !A0J(r2.A0X())) {
            return false;
        }
        return true;
    }

    public boolean A0J(String str) {
        if (!A0G() || TextUtils.isEmpty(str) || this.A03.A0G(str) != 1) {
            return false;
        }
        return true;
    }

    public boolean A0K(String str) {
        if (str.length() != 64) {
            return false;
        }
        try {
            return Arrays.equals(C107575bX.A0H(str), this.A01.A09());
        } catch (IllegalArgumentException e) {
            Log.e("encb/EncBackupManager/verifyRootKeyStr/key contains invalid hex characters", e);
            return false;
        }
    }
}
