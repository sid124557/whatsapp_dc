package X;

import android.os.Bundle;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.0UH  reason: invalid class name */
public class AnonymousClass0UH {
    public long A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final long A04;
    public final String A05;

    public synchronized Bundle A01() {
        Bundle A08;
        A08 = AnonymousClass002.A08();
        A08.putString("account_name", this.A05);
        A08.putLong("total_backup_size", this.A00);
        A08.putLong("last_modified", this.A04);
        A08.putBoolean("overwrite_local_files", this.A03);
        A08.putBoolean("is_download_size_zero", this.A01);
        A08.putBoolean("is_encrypted_backup", this.A02);
        return A08;
    }

    public synchronized String toString() {
        Locale locale;
        Object[] objArr;
        locale = Locale.ENGLISH;
        objArr = new Object[6];
        objArr[0] = AnonymousClass0YV.A0A(this.A05);
        AnonymousClass000.A1R(objArr, this.A03);
        AnonymousClass001.A1S(objArr, this.A01);
        objArr[3] = Long.valueOf(this.A04);
        objArr[4] = Long.valueOf(this.A00);
        objArr[5] = Boolean.valueOf(this.A02);
        return String.format(locale, "Account:%s overwriteLocalFile:%b isDownloadSizeZero:%b lastModified:%s totalBackupSize: %d isPasswordProtected: %b", objArr);
    }

    public static AnonymousClass0UH A00(Bundle bundle) {
        if (bundle.containsKey("account_name")) {
            String string = bundle.getString("account_name");
            C626936e.A06(string);
            AnonymousClass0UH r2 = new AnonymousClass0UH(string, bundle.getLong("last_modified", -1), bundle.getLong("total_backup_size", -1), bundle.getBoolean("overwrite_local_files"), bundle.getBoolean("is_download_size_zero"), bundle.getBoolean("is_encrypted_backup", false));
            Log.i(AnonymousClass000.A0P(r2, "gdrive-activity/create-restore-data-from-bundle/ ", AnonymousClass001.A0o()));
            return r2;
        }
        throw AnonymousClass001.A0e("account_name cannot be null.");
    }

    public boolean A03() {
        return false;
    }

    public AnonymousClass0UH(String str, long j, long j2, boolean z, boolean z2, boolean z3) {
        this.A05 = str;
        this.A04 = j;
        this.A00 = j2;
        this.A03 = z;
        this.A01 = z2;
        this.A02 = z3;
    }

    public Set A02() {
        return Collections.emptySet();
    }
}
