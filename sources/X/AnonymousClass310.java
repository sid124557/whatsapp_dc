package X;

import android.os.Build;
import android.os.Environment;
import android.os.UserManager;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.310  reason: invalid class name */
public class AnonymousClass310 {
    public final C54292oU A00;
    public final AnonymousClass5ZR A01;
    public final AnonymousClass33p A02;
    public final C183538qC A03 = C72333dY.A05(this, 11);

    public static File A00(AnonymousClass310 r0) {
        return (File) r0.A03.get();
    }

    public static boolean A01() {
        int i = Build.VERSION.SDK_INT;
        if (i < 29) {
            return false;
        }
        if (!UserManager.supportsMultipleUsers() || Build.VERSION.PREVIEW_SDK_INT > 0 || i >= 30) {
            return true;
        }
        return false;
    }

    public File A06(File file) {
        String substring;
        if (file == null) {
            return null;
        }
        if (!file.isAbsolute()) {
            substring = file.getPath();
        } else {
            int indexOf = file.getAbsolutePath().indexOf("Media/WhatsApp ");
            if (A0C(file) || indexOf <= 0) {
                return file;
            }
            substring = file.getAbsolutePath().substring(indexOf);
        }
        return AnonymousClass002.A0A(A00(this), substring);
    }

    public boolean A0B() {
        return "scoped".equals(C18280x3.A0Z(AnonymousClass0x2.A0F(this.A02), "external_storage_type"));
    }

    public AnonymousClass310(C54292oU r2, AnonymousClass5ZR r3, AnonymousClass33p r4) {
        this.A00 = r2;
        this.A02 = r4;
        this.A01 = r3;
    }

    public File A02() {
        return AnonymousClass002.A0A(A00(this), "Backups");
    }

    public File A03() {
        return AnonymousClass002.A0A(A00(this), "Databases");
    }

    public File A04() {
        File[] externalMediaDirs;
        File file;
        if (!A01() || (externalMediaDirs = this.A00.A00.getExternalMediaDirs()) == null || externalMediaDirs.length <= 0 || (file = externalMediaDirs[0]) == null) {
            return null;
        }
        return AnonymousClass002.A0A(file, "WhatsApp");
    }

    public final File A05() {
        String str;
        File A0A = AnonymousClass002.A0A(Environment.getExternalStorageDirectory(), "WhatsApp");
        if (A01()) {
            String A0Z = C18280x3.A0Z(AnonymousClass0x2.A0F(this.A02), "external_storage_type");
            C18260x0.A0s("externaldir/saved storage is ", A0Z, AnonymousClass001.A0o());
            File A04 = A04();
            if (A04 == null) {
                Log.w("externaldir/scoped dir is supported, but isn't provided by the system");
                return A0A;
            }
            if (!"scoped".equals(A0Z)) {
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && !C380525h.A00()) {
                    str = "externaldir/switching to scoped since os disabled legacy storage";
                } else if (this.A01.A0E() && !A0A.exists()) {
                    str = "externaldir/no legacy root so switching to scoped";
                } else if (i >= 30 && A0Z == null) {
                    str = "externaldir/it is a new installation so switching to scoped";
                }
                Log.w(str);
                A0A("scoped");
            }
            return A04;
        }
        A0A("legacy");
        return A0A;
    }

    public File A07(String str) {
        return AnonymousClass002.A0A(A00(this), str);
    }

    public String A08(File file) {
        if (file.isAbsolute()) {
            return A09(file.getAbsolutePath());
        }
        return file.getPath();
    }

    public String A09(String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(A00(this).getAbsolutePath());
        return str.replace(AnonymousClass000.A0X("/", A0o), "");
    }

    public void A0A(String str) {
        C18260x0.A0q("externaldir/set storage to ", str, AnonymousClass001.A0o());
        C18270x1.A03(this.A02).putString("external_storage_type", str).commit();
    }

    public boolean A0C(File file) {
        return file.getAbsolutePath().startsWith(A00(this).getAbsolutePath());
    }
}
