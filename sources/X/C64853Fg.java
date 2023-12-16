package X;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3Fg  reason: invalid class name and case insensitive filesystem */
public final class C64853Fg implements AnonymousClass4E8 {
    public final C56972sr A00;
    public final C56612sH A01;
    public final C54292oU A02;
    public final AnonymousClass33p A03;
    public final C620733j A04;
    public final C51072jE A05;
    public final C59772xS A06;

    public final void A00(int i) {
        String str;
        String str2;
        Context context = this.A02.A00;
        C56612sH r1 = this.A01;
        C56972sr r0 = this.A00;
        AnonymousClass33p r2 = this.A03;
        if (!r0.A0Y()) {
            long A0H = r1.A0H();
            if (i == 2) {
                str = "backup_token_foa_file_timestamp";
            } else {
                str = "backup_token_file_timestamp";
            }
            long A0A = AnonymousClass0x2.A0A(AnonymousClass0x2.A0F(r2), str);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("BackupTokenUtils/shouldUpdateBackupToken/current time is ");
            A0o.append(A0H);
            C18260x0.A12(", token last update time is ", A0o, A0A);
            File filesDir = context.getFilesDir();
            if (i == 2) {
                str2 = "foa_backup_token";
            } else {
                str2 = "backup_token";
            }
            if (!AnonymousClass002.A0A(filesDir, str2).exists() || A0H - A0A > TimeUnit.DAYS.toMillis(14)) {
                C18260x0.A0y("RegistrationDailyCron/shouldUpdateBackupToken/backupTokenType:", AnonymousClass001.A0o(), i);
                this.A06.A01(i);
            }
        }
    }

    public void BQW() {
        if (this.A05.A02()) {
            A00(1);
            A00(2);
        }
        C620733j r3 = this.A04;
        C54412og r2 = r3.A08;
        String A022 = r2.A02();
        if (!TextUtils.isEmpty(A022) && r3.A05.toLanguageTag().equals(A022)) {
            C18270x1.A0g(C54412og.A00(r2), "forced_language");
        }
    }

    public C64853Fg(C56972sr r2, C56612sH r3, C54292oU r4, AnonymousClass33p r5, C620733j r6, C51072jE r7, C59772xS r8) {
        C18260x0.A0f(r3, r2, r4, r6, r5);
        C162457s7.A0J(r7, 6);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
        this.A04 = r6;
        this.A03 = r5;
        this.A05 = r7;
        this.A06 = r8;
    }

    public String BDW() {
        return "RegistrationDailyCron";
    }

    public /* synthetic */ void BQX() {
    }
}
