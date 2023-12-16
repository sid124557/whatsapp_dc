package X;

import android.os.Bundle;
import com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel;
import com.whatsapp.util.Log;
import java.util.Objects;

/* renamed from: X.0ha  reason: invalid class name and case insensitive filesystem */
public class C10220ha implements C17110ua {
    public int A00;
    public long A01 = -1;
    public long A02 = -1;
    public final C69263Wi A03;
    public final C10230hb A04;
    public final SettingsGoogleDriveViewModel A05;
    public final C29441ip A06;
    public final AnonymousClass33p A07;

    public static void A00(C10220ha r3) {
        r3.A04((AnonymousClass0JM) null, 2, -1);
    }

    public final void A03(AnonymousClass0JM r7, int i, int i2) {
        A05(r7, i, i2, true, false);
    }

    public final void A04(AnonymousClass0JM r7, int i, int i2) {
        A05(r7, i, i2, false, false);
    }

    public static void A01(C10220ha r2, int i, int i2) {
        r2.A03(new C02050Ec(i), 3, i2);
    }

    public final void A02() {
        C69263Wi r2 = this.A03;
        SettingsGoogleDriveViewModel settingsGoogleDriveViewModel = this.A05;
        Objects.requireNonNull(settingsGoogleDriveViewModel);
        r2.A0S(new C11750k9(settingsGoogleDriveViewModel));
    }

    public final void A05(AnonymousClass0JM r6, int i, int i2, boolean z, boolean z2) {
        SettingsGoogleDriveViewModel settingsGoogleDriveViewModel;
        if (i != this.A00 && i == 4) {
            Log.i("settings-gdrive/set-message/show-indeterminate");
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("settings-gdrive/progress-bar-state-change ");
            A0o.append(this.A00);
            Log.d(AnonymousClass000.A0Y(" -> ", A0o, 4));
        }
        this.A00 = i;
        if (i == 1) {
            Log.i("settings-gdrive/set-message/show-nothing");
            SettingsGoogleDriveViewModel settingsGoogleDriveViewModel2 = this.A05;
            settingsGoogleDriveViewModel2.A0m(false);
            settingsGoogleDriveViewModel2.A0r(false);
            settingsGoogleDriveViewModel2.A0n(false);
            settingsGoogleDriveViewModel2.A0s(false);
            settingsGoogleDriveViewModel2.A0o(false);
            settingsGoogleDriveViewModel2.A0l(false);
            settingsGoogleDriveViewModel2.A0j((AnonymousClass0JM) null);
        } else if (i != 2) {
            if (i != 3) {
                C626936e.A06(r6);
                settingsGoogleDriveViewModel = this.A05;
                settingsGoogleDriveViewModel.A0m(false);
                settingsGoogleDriveViewModel.A0s(false);
                settingsGoogleDriveViewModel.A0r(true);
                settingsGoogleDriveViewModel.A0q(true);
                settingsGoogleDriveViewModel.A0n(z);
                settingsGoogleDriveViewModel.A0l(true);
                Log.i(AnonymousClass000.A0P(r6, "settings-gdrive/set-message ", AnonymousClass001.A0o()));
                settingsGoogleDriveViewModel.A0j(r6);
            } else {
                C626936e.A06(r6);
                Log.i("settings-gdrive/set-message/show-determinate");
                settingsGoogleDriveViewModel = this.A05;
                settingsGoogleDriveViewModel.A0m(false);
                settingsGoogleDriveViewModel.A0r(true);
                settingsGoogleDriveViewModel.A0q(false);
                settingsGoogleDriveViewModel.A0n(z);
                settingsGoogleDriveViewModel.A0l(true);
                settingsGoogleDriveViewModel.A0h(i2);
                settingsGoogleDriveViewModel.A0j(r6);
                settingsGoogleDriveViewModel.A0s(z2);
            }
            settingsGoogleDriveViewModel.A0o(false);
        } else {
            Log.i("settings-gdrive/set-message/show-backup-button");
            SettingsGoogleDriveViewModel settingsGoogleDriveViewModel3 = this.A05;
            settingsGoogleDriveViewModel3.A0m(true);
            settingsGoogleDriveViewModel3.A0r(false);
            settingsGoogleDriveViewModel3.A0n(false);
            settingsGoogleDriveViewModel3.A0s(false);
            settingsGoogleDriveViewModel3.A0o(true);
            settingsGoogleDriveViewModel3.A0l(false);
            settingsGoogleDriveViewModel3.A0k(true);
            settingsGoogleDriveViewModel3.A0j((AnonymousClass0JM) null);
            A02();
            if (r6 != null) {
                throw AnonymousClass001.A0c("message should be null when button has to be displayed.");
            }
        }
    }

    public void BLu(boolean z) {
        Log.e("settings-gdrive-observer/account-deletion-end/unexpected-state");
    }

    public void BNI() {
        Log.i("settings-gdrive-observer/backup-cancelled");
        A00(this);
    }

    public void BNK(long j, long j2) {
        Log.i("settings-gdrive-observer/backup-paused/no-data-connection");
        A01(this, 8, AnonymousClass000.A01(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2));
    }

    public void BNL(long j, long j2) {
        Log.i("settings-gdrive-observer/backup-paused/low-battery");
        A01(this, 9, AnonymousClass000.A01(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2));
    }

    public void BNM(long j, long j2) {
        Log.i("settings-gdrive-observer/backup-paused/sdcard-missing");
        A01(this, 11, AnonymousClass000.A01(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2));
    }

    public void BNN(long j, long j2) {
        Log.i("settings-gdrive-observer/backup-paused/sdcard-unmounted");
        A01(this, 10, AnonymousClass000.A01(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2));
    }

    public void BNO(long j, long j2) {
        Log.i("settings-gdrive-observer/backup-paused/no-wifi");
        int A012 = AnonymousClass000.A01(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2);
        int i = 7;
        if (this.A06.A08(true) == 2) {
            i = 6;
        }
        A01(this, i, A012);
    }

    public void BNP(int i) {
        if (i >= 0) {
            C626936e.A00();
            A03(new AnonymousClass0Ea(i), 4, i);
        }
    }

    public void BNQ() {
        Log.i("settings-gdrive-observer/backup-prep-start");
        A03(new C02050Ec(5), 4, -1);
    }

    public void BNR(long j, long j2) {
        if (j2 <= 0) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("settings-gdrive-observer/backup-progress incorrect invocation: ");
            A0o.append(j);
            Log.e(AnonymousClass000.A0Z("/", A0o, j2));
            return;
        }
        long j3 = this.A02;
        int i = (int) ((100 * j) / j2);
        if (((int) ((j3 * 100) / j2)) != i || j != j3) {
            this.A02 = j;
            A03(new C02060Ed(j, j2), 3, i);
        }
    }

    public void BNS() {
        Log.i("settings-gdrive-observer/backup-start");
        this.A02 = -1;
        BNP(0);
    }

    public void BRt() {
        AnonymousClass33p r1 = this.A07;
        if (r1.A0G(r1.A0X()) == 2) {
            A02();
        }
    }

    public void BSQ(int i, Bundle bundle) {
        if (i != 10) {
            A00(this);
        }
        this.A05.A0g(i);
    }

    public void BSR(int i, Bundle bundle) {
        if (i != 10) {
            A04((AnonymousClass0JM) null, 1, -1);
        }
        this.A05.A0i(i, bundle);
    }

    public void BSS(int i, Bundle bundle) {
        Log.e("settings-gdrive-observer/msgstore-download-error/unexpected-state");
    }

    public void BWB() {
        Log.i("settings-gdrive-observer/restore-cancelled");
        this.A05.A0d();
        A00(this);
        this.A01 = -1;
        this.A02 = -1;
    }

    public void BWD(long j, long j2) {
        Log.i("settings-gdrive-observer/restore-paused/no-data-connection");
        A04(new C02050Ec(1), 3, AnonymousClass000.A01(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2));
    }

    public void BWE(long j, long j2) {
        Log.i("settings-gdrive-observer/restore-paused/low-battery");
        int A012 = AnonymousClass000.A01(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2);
        this.A05.A0u(true);
        A05(new C02050Ec(2), 3, A012, false, true);
    }

    public void BWF(long j, long j2) {
        Log.i("settings-gdrive-observer/restore-paused/sdcard-missing");
        A04(new C02050Ec(4), 3, AnonymousClass000.A01(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2));
    }

    public void BWG(long j, long j2) {
        Log.i("settings-gdrive-observer/restore-paused/sdcard-unmounted");
        A04(new C02050Ec(3), 3, AnonymousClass000.A01(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2));
    }

    public void BWH(long j, long j2) {
        Log.i("settings-gdrive-observer/restore-paused/no-wifi");
        int A012 = AnonymousClass000.A01(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2);
        this.A05.A0u(false);
        if (this.A06.A08(true) == 2) {
            Log.i("settings-gdrive-observer/restore-paused/cellular-available");
            A05(new C02050Ec(0), 3, A012, false, true);
            return;
        }
        A04(new C02050Ec(0), 3, A012);
    }

    public void BWI(int i) {
        if (i >= 0) {
            A04(new C02040Eb(i), 4, i);
        }
    }

    public void BWJ() {
        Log.i("settings-gdrive-observer/restore-start");
        A04(new C02050Ec(13), 4, -1);
    }

    public void BWK(long j, long j2) {
        if (j != this.A01) {
            this.A01 = j;
            A04(new C02070Ee(j, j2), 3, (int) ((j * 100) / j2));
        }
    }

    public void BWb(boolean z) {
        Log.e("settings-gdrive-observer/msgstore-download-end/unexpected-state");
    }

    public void BWc(long j, long j2) {
        Log.e("settings-gdrive-observer/msgstore-download-progress/unexpected-state");
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("settings-gdrive-observer/msgstore-download-progress/downloaded: ");
        A0o.append(j);
        Log.i(AnonymousClass000.A0Z(" total: ", A0o, j2));
    }

    public void BWd() {
        Log.e("settings-gdrive-observer/msgstore-download-start/unexpected-state");
    }

    public void Bax() {
        Log.i("settings-gdrive-observer/post-backup-scrub-start");
        A03(new C02050Ec(12), 4, -1);
    }

    public C10220ha(C69263Wi r3, C10230hb r4, SettingsGoogleDriveViewModel settingsGoogleDriveViewModel, C29441ip r6, AnonymousClass33p r7) {
        this.A03 = r3;
        this.A07 = r7;
        this.A06 = r6;
        this.A04 = r4;
        this.A05 = settingsGoogleDriveViewModel;
    }

    public void BNJ(boolean z) {
        Log.i(AnonymousClass000.A0b("settings-gdrive-observer/backup-end ", AnonymousClass001.A0o(), z));
        A00(this);
        if (z && this.A05.A0v()) {
            this.A04.A0F();
        }
    }

    public void BWC(long j, boolean z) {
        Log.i(AnonymousClass000.A0b("settings-gdrive-observer/restore-end ", AnonymousClass001.A0o(), z));
        A00(this);
        this.A01 = -1;
        this.A02 = -1;
        if (z && this.A05.A0v()) {
            this.A04.A0F();
        }
    }

    public void Bew() {
        A02();
    }
}
