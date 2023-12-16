package X;

import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* renamed from: X.32y  reason: invalid class name and case insensitive filesystem */
public class C619632y {
    public final C04860Qy A00;
    public final C620633i A01;
    public final C54292oU A02;
    public final AnonymousClass33p A03;
    public final C48092eK A04;

    public static final Uri A00(String str, String str2, String str3) {
        Uri.Builder appendPath = new Uri.Builder().scheme("content").authority("com.whatsapp.provider.MigrationContentProvider").appendPath(str);
        if (str2 != null) {
            appendPath.appendQueryParameter("query_param_country_code", str2);
        }
        if (str3 != null) {
            appendPath.appendQueryParameter("query_param_phone_number", str3);
        }
        return appendPath.build();
    }

    public final int A02(File file, FileDescriptor fileDescriptor) {
        FileInputStream fileInputStream;
        Log.i("MigrateFileDirectlyHelper/replaceFile");
        try {
            AnonymousClass202 r3 = new AnonymousClass202(this.A04.A00, file);
            try {
                fileInputStream = new FileInputStream(fileDescriptor);
                C627536m.A0J(fileInputStream.getChannel(), Channels.newChannel(r3));
                r3.close();
                fileInputStream.close();
                r3.close();
                return 19;
            } catch (Throwable th) {
                r3.close();
                throw th;
            }
            throw th;
        } catch (Exception e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            C18270x1.A1H(A0o, "MigrateFileDirectlyHelper/replaceFile/error while moving file. File to replace is ", file);
            C18260x0.A1Q(A0o, " error message is: ", e);
            if (e.getMessage() == null || !e.getMessage().contains("No space")) {
                return 15;
            }
            return 5;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public int A03(File file, String str) {
        ParcelFileDescriptor A05;
        try {
            AnonymousClass5UR A0R = this.A01.A0R();
            AnonymousClass33p r0 = this.A03;
            A05 = A0R.A05(A00(str, r0.A0Z(), r0.A0b()), "r");
            if (A05 != null) {
                if (A05.getFileDescriptor() != null) {
                    int A022 = A02(file, A05.getFileDescriptor());
                    A05.close();
                    return A022;
                }
            }
            Log.i("MigrateFileDirectlyHelper/migrateFile/consumer file is null");
            if (A05 == null) {
                return 15;
            }
            A05.close();
            return 15;
        } catch (IOException | SecurityException e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("MigrateFileDirectlyHelper/migrateFile/error while fetching internal file: ");
            A0o.append(str);
            C18260x0.A1Q(A0o, " from consumer app. error message is: ", e);
            return 15;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public C619632y(C04860Qy r1, C620633i r2, C54292oU r3, AnonymousClass33p r4, C48092eK r5) {
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = r1;
        this.A04 = r5;
    }

    public static final byte[] A01(Bundle bundle, String str, byte[] bArr) {
        byte[] byteArray = bundle.getByteArray(str);
        if (byteArray == null) {
            Log.e("MigrateFileDirectlyHelper/getEncryptedData erk is null");
            return null;
        }
        try {
            PrivateKey generatePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(bArr));
            Cipher instance = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
            instance.init(2, generatePrivate);
            return instance.doFinal(byteArray);
        } catch (InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused) {
            Log.e("MigrateFileDirectlyHelper/getEncryptedData failed to decrypt erk");
            return null;
        }
    }
}
