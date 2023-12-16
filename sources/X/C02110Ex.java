package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.crypto.NoSuchPaddingException;
import org.json.JSONObject;

/* renamed from: X.0Ex  reason: invalid class name and case insensitive filesystem */
public class C02110Ex extends C56772sX {
    public final C56972sr A00;
    public final C56512s6 A01;
    public final C54292oU A02;
    public final AnonymousClass33p A03;
    public final C48502f0 A04;
    public final C48772fR A05;
    public final C622634i A06;

    public synchronized C60882zK A06(AnonymousClass22O r20) {
        C60882zK r12;
        OutputStreamWriter outputStreamWriter;
        synchronized (this) {
            C48092eK r9 = this.A04;
            File A012 = r9.A01("backup_settings.json");
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(A012);
                try {
                    outputStreamWriter = new OutputStreamWriter(fileOutputStream, C58152un.A0B);
                    outputStreamWriter.write(A0H().toString(2));
                    outputStreamWriter.close();
                    fileOutputStream.close();
                    Log.d(AnonymousClass000.A0P(A012, "backup_settings/backup/successfully wrote to temp offsets file", AnonymousClass001.A0o()));
                    AnonymousClass22O r11 = r20;
                    try {
                        File A0G = A0G(r11);
                        Log.i(AnonymousClass000.A0P(A0G, "backup_settings/backup/to ", AnonymousClass001.A0o()));
                        C622634i r122 = this.A06;
                        AnonymousClass0UR A013 = AnonymousClass0S7.A01(this.A00, this.A01, this.A01, this.A04, r9, this.A05, r11, r122, A0G);
                        if (!A013.A07(this.A02.A06())) {
                            Log.w("backup_settings/backup/prepare for backup failed");
                            r12 = new C60882zK("backup-settings");
                        } else {
                            A013.A06((C16370su) null, A012);
                            r12 = new C60882zK(A0G, (Long) null, "backup-settings", A04(A07(r11)), true);
                        }
                    } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
                        Log.e("backup_settings/backup failed", e);
                        r12 = new C60882zK("backup-settings");
                    }
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (Exception e2) {
                Log.e(AnonymousClass000.A0P(A012, "backup_settings/backup/exception while writing to temp file", AnonymousClass001.A0o()), e2);
                r12 = new C60882zK("backup-settings");
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        return r12;
        throw th;
    }

    public String A08() {
        return "backup-settings";
    }

    public ArrayList A09(File file) {
        Log.d("backup_settings/getbackupfiles");
        List A0A = C06550Ye.A0A(AnonymousClass22O.CRYPT14);
        File A0A2 = AnonymousClass002.A0A(file, "backup_settings.json");
        ArrayList A09 = C06550Ye.A09(A0A2, A0A);
        C06550Ye.A0M(A0A2, A09);
        return A09;
    }

    public synchronized boolean A0F(Context context, File file) {
        FileInputStream fileInputStream;
        int i;
        int i2;
        synchronized (this) {
            try {
                C48092eK r6 = this.A04;
                File A012 = r6.A01("backup_settings.json");
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("backup_settings/restore/decrypting file: ");
                File file2 = file;
                A0o.append(file2);
                Log.d(AnonymousClass000.A0N(file2, " length: ", A0o));
                AnonymousClass22O A002 = A00(file2);
                C622634i r9 = this.A06;
                AnonymousClass0S7.A01(this.A00, this.A01, this.A01, this.A04, r6, this.A05, A002, r9, file2).A04(this.A02, (AnonymousClass4BZ) null, A012, 0, 0, false);
                Log.d(AnonymousClass000.A0P(A012, "backup_settings/backup/successfully restored ", AnonymousClass001.A0o()));
                try {
                    fileInputStream = new FileInputStream(A012);
                    JSONObject A022 = C624535b.A02(fileInputStream);
                    if (A022 == null) {
                        Log.w("backup_settings/restore/could not read JSON metadata from the backup file");
                        fileInputStream.close();
                    } else {
                        if (A022.has("backupFrequency") && (i2 = A022.getInt("backupFrequency")) >= 0) {
                            this.A03.A2L(i2);
                        }
                        if (A022.has("backupNetworkSettings") && (i = A022.getInt("backupNetworkSettings")) >= 0) {
                            this.A03.A14(i);
                        }
                        if (A022.has("includeVideosInBackup")) {
                            this.A03.A1r(A022.getBoolean("includeVideosInBackup"));
                        }
                        if (A022.has("localSettings")) {
                            JSONObject jSONObject = A022.getJSONObject("localSettings");
                            if (jSONObject != null) {
                                this.A03.A1m(jSONObject);
                            } else {
                                Log.i("backup_settings/restore/settings/local-settings-object-is-null");
                            }
                        }
                        fileInputStream.close();
                        return true;
                    }
                } catch (Exception e) {
                    Log.e("backup_settingsbackup/exception while reading temp JSON file", e);
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } catch (Exception e2) {
                Log.w("backup_settings/restore/error", e2);
            }
        }
        return false;
        throw th;
    }

    public C02110Ex(C56972sr r1, C56512s6 r2, C54292oU r3, AnonymousClass33p r4, C48502f0 r5, C42822Pq r6, C48772fR r7, C622634i r8) {
        super(r6);
        this.A02 = r3;
        this.A06 = r8;
        this.A00 = r1;
        this.A04 = r5;
        this.A01 = r2;
        this.A03 = r4;
        this.A05 = r7;
    }

    public static final AnonymousClass22O A00(File file) {
        AnonymousClass22O A022;
        int A012 = C06550Ye.A01(file.getName(), "backup_settings.json");
        if (A012 <= 0 || (A022 = AnonymousClass22O.A02(A012)) == null) {
            return AnonymousClass22O.UNENCRYPTED;
        }
        return A022;
    }

    public void A0C(C26041bU r2, double d) {
        r2.A0E = Double.valueOf(d);
    }

    public void A0D(C26041bU r2, double d) {
        r2.A0D = Double.valueOf(d);
    }

    public File A0G(AnonymousClass22O r3) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("backup_settings.json.crypt");
        return AnonymousClass002.A0A(A07(r3), AnonymousClass000.A0h(A0o, r3.A05()));
    }

    public final JSONObject A0H() {
        HashMap A0t = AnonymousClass001.A0t();
        AnonymousClass33p r2 = this.A03;
        A0t.put("backupFrequency", Integer.valueOf(r2.A05()));
        A0t.put("backupNetworkSettings", Integer.valueOf(r2.A06()));
        A0t.put("includeVideosInBackup", Boolean.valueOf(r2.A27()));
        A0t.put("localSettings", r2.A0d());
        return new JSONObject(A0t);
    }
}
