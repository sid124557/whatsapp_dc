package X;

import android.content.Context;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: X.0DJ  reason: invalid class name */
public abstract class AnonymousClass0DJ extends AnonymousClass0UR {
    public C56292rk A00;
    public final C56972sr A01;
    public final AnonymousClass0WN A02;
    public final C48502f0 A03;
    public final C48772fR A04;

    public AnonymousClass0DJ(C56972sr r7, C06430Xr r8, AnonymousClass0WN r9, C56512s6 r10, C48502f0 r11, C48092eK r12, C48772fR r13, C622634i r14, File file) {
        super(r8, r10, r12, r14, file);
        this.A01 = r7;
        this.A03 = r11;
        this.A02 = r9;
        this.A04 = r13;
    }

    public abstract int A0A();

    public abstract AnonymousClass0NK A0B(AnonymousClass0W0 r1, String str);

    public abstract AnonymousClass0W0 A0D(InputStream inputStream);

    public abstract AnonymousClass0W0 A0E(byte[] bArr);

    public abstract AnonymousClass22O A0H();

    public static void A01(AnonymousClass0W0 r6, OutputStream outputStream) {
        if (r6 != null) {
            byte[] bArr = r6.A01;
            int i = 0;
            for (byte[] bArr2 : bArr == null ? new byte[][]{r6.A00} : new byte[][]{r6.A00, bArr}) {
                Arrays.toString(bArr2);
                i += bArr2.length;
                outputStream.write(bArr2);
            }
            Log.i(AnonymousClass000.A0Y("BackupFile/write-backup-footer/size=", AnonymousClass001.A0o(), i));
        }
    }

    public AnonymousClass0NK A04(C54292oU r15, AnonymousClass4BZ r16, File file, int i, int i2, boolean z) {
        InputStream A0I;
        AnonymousClass202 A002 = this.A02.A00(file);
        try {
            A0I = A0I();
            C56292rk A0G = A0G(A0I, true);
            this.A00 = A0G;
            if (A0G == null) {
                AnonymousClass0NK r0 = new AnonymousClass0NK(5, (String) null);
                A0I.close();
                A002.close();
                return r0;
            }
            AnonymousClass0NK A032 = A03();
            if (A032.A00 == 1) {
                Log.i("BackupFile/restoreSingleFileBackup/file-integrity-check/success");
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("BackupFile/restoreSingleFileBackup/key ");
                AnonymousClass22O A0H = A0H();
                Log.i(AnonymousClass000.A0R(A0H, A0o));
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("BackupFile/restoreSingleFileBackup/decrypting file: ");
                File file2 = this.A04;
                A0o2.append(file2);
                Log.d(AnonymousClass000.A0N(file2, " length: ", A0o2));
                C622634i r3 = this.A03;
                long length = file2.length();
                C56292rk r02 = this.A00;
                r3.A05(A0H, r16, A0I, A002, r02.A07(), r02.A05(), i, i2, length);
                A002.flush();
                if (z) {
                    this.A00.A02(r15);
                }
            }
            A0I.close();
            A002.close();
            return A032;
        } catch (Throwable th) {
            try {
                A002.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A06(C16370su r7, File file) {
        OutputStream A012;
        C626936e.A0F(AnonymousClass000.A1W(this.A00), "prefix has not been initialized");
        OutputStream A0J = A0J();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                this.A00.A03(A0J);
                C622634i r4 = this.A03;
                AnonymousClass22O A0H = A0H();
                C56292rk r0 = this.A00;
                A012 = r4.A01(A0H, A0J, r0.A07(), r0.A05());
                AnonymousClass0UR.A02(r7, fileInputStream, A012, file.length());
                A012.close();
                fileInputStream.close();
                A0J.close();
                return;
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                A0J.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public boolean A08(C16380sv r12, boolean z) {
        ZipInputStream A022;
        AnonymousClass202 A002;
        File file = this.A04;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        try {
            C56292rk A0G = A0G(bufferedInputStream, true);
            this.A00 = A0G;
            if (A0G == null) {
                Log.e("EncryptedBackupFile/restore-multi-file-backup/restore/failed to read prefix");
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("EncryptedBackupFile/restore-multi-file-backup/restore/decrypting file: ");
                A0o.append(file);
                Log.d(AnonymousClass000.A0N(file, " length: ", A0o));
                AtomicLong atomicLong = new AtomicLong();
                C622634i r5 = this.A03;
                AnonymousClass22O A0H = A0H();
                C56292rk r0 = this.A00;
                A022 = r5.A02(A0H, bufferedInputStream, atomicLong, r0.A07(), r0.A05());
                try {
                    for (ZipEntry nextEntry = A022.getNextEntry(); nextEntry != null; nextEntry = A022.getNextEntry()) {
                        File file2 = (File) r12.apply(nextEntry.getName());
                        if (file2 != null) {
                            A002 = this.A02.A00(file2);
                            C627536m.A0I(A022, A002);
                            A002.close();
                        }
                        A022.closeEntry();
                    }
                    A022.close();
                    bufferedInputStream.close();
                    return true;
                } catch (Exception e) {
                    Log.e("EncryptedBackupFile/restore-multi-file-backup/restore", e);
                    A022.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
            bufferedInputStream.close();
            return false;
            throw th;
            throw th;
        } catch (Throwable th2) {
            try {
                bufferedInputStream.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public boolean A09(String str) {
        InputStream A0I;
        if (this.A00 == null) {
            try {
                A0I = A0I();
                C56292rk A0G = A0G(A0I, false);
                if (A0G == null) {
                    throw AnonymousClass002.A0C("No prefix found");
                } else if (A0G.A04(str)) {
                    A0I.close();
                    return true;
                } else {
                    A0I.close();
                }
            } catch (C377423v e) {
                throw new IOException("failed to read prefix", e);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        AnonymousClass0W0 A0C = A0C();
        if (A0C != null) {
            return A0C.A03(str);
        }
        return false;
        throw th;
    }

    public final AnonymousClass0W0 A0C() {
        File file = this.A04;
        long length = file.length() - ((long) A0A());
        FileInputStream fileInputStream = new FileInputStream(file);
        if (length >= 0) {
            try {
                C624535b.A04(fileInputStream, length);
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
        AnonymousClass0W0 A0D = A0D(fileInputStream);
        fileInputStream.close();
        return A0D;
    }

    public C56292rk A0F(Context context) {
        C626936e.A0C(!this.A02.A0G());
        try {
            AnonymousClass0NX A05 = C06550Ye.A05(context);
            if (A05 == null) {
                this.A04.A01("msgstore/backupDatabase/key is null", 3);
                return null;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("msgstore/backupDatabase/createPrefix v=");
            C04260Nl r4 = A05.A00;
            Log.i(AnonymousClass000.A0X(r4.A00, A0o));
            return new C22251Iq(r4, A05.A02, A05.A01, r4.A01);
        } catch (Exception e) {
            Log.w("msgstore/backupDatabase/key/error", e);
            return null;
        }
    }

    public InputStream A0I() {
        File file = this.A04;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        long length = file.length();
        int A0A = A0A();
        long j = length - ((long) A0A);
        Locale locale = Locale.ENGLISH;
        Object[] A0M = AnonymousClass002.A0M();
        AnonymousClass000.A1Q(A0M, 0, j);
        AnonymousClass000.A1M(A0M, A0A);
        String.format(locale, "BackupFile/get-input-stream size-without-footer:%d footer-size:%d", A0M);
        return new C140706uL(bufferedInputStream, j);
    }

    public OutputStream A0J() {
        File A022 = this.A01.A02();
        FileOutputStream fileOutputStream = new FileOutputStream(A022);
        MessageDigest instance = MessageDigest.getInstance("MD5");
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BackupFile/get-output-stream/initial digest = ");
        Log.i(AnonymousClass000.A0X(C627236i.A07(instance.digest()), A0o));
        instance.reset();
        return new C13950o0(this, A022, fileOutputStream, instance);
    }

    public final String A0K() {
        AnonymousClass33M r6 = new AnonymousClass33M("BackupFile/getFileDigestWithoutFooter/calculating-actual-digest");
        MessageDigest instance = MessageDigest.getInstance("MD5");
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BackupFile/getFileDigestWithoutFooter/initial digest = ");
        Log.i(AnonymousClass000.A0X(C627236i.A07(instance.digest()), A0o));
        File file = this.A04;
        String A07 = C627536m.A07(file, instance, file.length() - ((long) A0A()));
        r6.A07();
        Log.i(AnonymousClass000.A0V("msgstore-integrity-checker/verify-integrity/actual-digest/  ", A07, AnonymousClass001.A0o()));
        return A07;
    }

    public final String A0L() {
        String str;
        C56972sr r2 = this.A01;
        if (r2.A0F() == null) {
            str = "backup/BackupFileCrypt12/getUserJid MeManager.me is null";
        } else {
            PhoneUserJid A0J = r2.A0J();
            if (A0J != null) {
                return A0J.getUser();
            }
            str = "backup/BackupFileCrypt12/getUserJid MeManager.getMyJidObject() is null";
        }
        Log.e(str);
        return null;
    }

    public AnonymousClass0NK A03() {
        C56292rk r0;
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("EncryptedBackupFile/verifyIntegrity/");
        AnonymousClass22O A0H = A0H();
        Log.i(AnonymousClass000.A0R(A0H, A0o));
        String A0K = A0K();
        AnonymousClass0W0 A0C = A0C();
        C48772fR r6 = this.A04;
        StringBuilder A0k = AnonymousClass000.A0k(A0H, "EncryptedBackupFile/verifyIntegrity/");
        AnonymousClass001.A1L(A0k);
        File file = this.A04;
        A0k.append(file);
        A0k.append(" size=");
        A0k.append(file.length());
        A0k.append(" modification time = ");
        A0k.append(file.lastModified());
        A0k.append("footer: ");
        A0k.append(A0C);
        r6.A01(AnonymousClass000.A0V("actualDigest: ", A0K, A0k), 2);
        if (A0C == null) {
            str = null;
        } else if (A0K == null) {
            byte[] bArr = A0C.A01;
            if (bArr != null) {
                str = Arrays.toString(bArr);
            } else {
                str = "null";
            }
        } else {
            String A0L = A0L();
            if (A0L == null || (r0 = this.A00) == null || !r0.A04(A0L)) {
                return A0B(A0C, A0K);
            }
            return new AnonymousClass0NK(4, this.A00.A01());
        }
        return new AnonymousClass0NK(2, str);
    }

    public C17410vU A05(Context context) {
        if (A07(context)) {
            return new C10150hT(this);
        }
        Log.e("EncryptedBackupFile/failed to prepare for backup");
        return null;
    }

    public boolean A07(Context context) {
        C56292rk A0F = A0F(context);
        this.A00 = A0F;
        return AnonymousClass000.A1W(A0F);
    }

    public C56292rk A0G(InputStream inputStream, boolean z) {
        byte[] bArr;
        C04260Nl A042 = C06550Ye.A04(inputStream);
        AnonymousClass2ZX A012 = this.A03.A01(A042);
        byte[] bArr2 = null;
        if (z) {
            if (A012 == null) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("msgstore/restore/cipher result is null for ");
                Log.e(AnonymousClass000.A0R(A0H(), A0o));
                return null;
            }
            bArr = A012.A02;
        } else {
            if (A012 == null) {
                bArr = null;
            }
            bArr = A012.A02;
        }
        Arrays.toString(bArr);
        if (A012 != null) {
            bArr2 = A012.A01;
        }
        return new C22251Iq(A042, bArr2, bArr, A042.A01);
    }
}
