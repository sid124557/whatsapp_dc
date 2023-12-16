package com.whatsapp.backup.google;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass00M;
import X.AnonymousClass0DD;
import X.AnonymousClass0EB;
import X.AnonymousClass0Ea;
import X.AnonymousClass0JL;
import X.AnonymousClass0JM;
import X.AnonymousClass0JN;
import X.AnonymousClass0QJ;
import X.AnonymousClass0R8;
import X.AnonymousClass0U8;
import X.AnonymousClass0WN;
import X.AnonymousClass0XL;
import X.AnonymousClass0XM;
import X.AnonymousClass0XR;
import X.AnonymousClass0Y8;
import X.AnonymousClass0YV;
import X.AnonymousClass0w4;
import X.AnonymousClass1VX;
import X.AnonymousClass1Y2;
import X.AnonymousClass29R;
import X.AnonymousClass33M;
import X.AnonymousClass33p;
import X.AnonymousClass34K;
import X.AnonymousClass35V;
import X.AnonymousClass3DW;
import X.AnonymousClass4EE;
import X.AnonymousClass4FS;
import X.AnonymousClass4FV;
import X.AnonymousClass5RU;
import X.AnonymousClass5UF;
import X.AnonymousClass5X8;
import X.AnonymousClass5ZR;
import X.C003203q;
import X.C005205m;
import X.C02040Eb;
import X.C02050Ec;
import X.C02060Ed;
import X.C02070Ee;
import X.C02080Ef;
import X.C02090Eg;
import X.C02100Eh;
import X.C03650La;
import X.C04610Pv;
import X.C06260Ww;
import X.C06270Wx;
import X.C06310Xb;
import X.C06390Xm;
import X.C06520Ya;
import X.C06540Yd;
import X.C06550Ye;
import X.C06560Yg;
import X.C08240dc;
import X.C08310eF;
import X.C10230hb;
import X.C10240hc;
import X.C10270hf;
import X.C10280hg;
import X.C10360ho;
import X.C107335b8;
import X.C107405bG;
import X.C107565bW;
import X.C107575bX;
import X.C111095hX;
import X.C11640jy;
import X.C11650jz;
import X.C11660k0;
import X.C11670k1;
import X.C11680k2;
import X.C11690k3;
import X.C116985rC;
import X.C12360lQ;
import X.C12370lR;
import X.C12380lS;
import X.C12390lT;
import X.C12400lU;
import X.C12410lV;
import X.C12420lW;
import X.C12430lX;
import X.C126936Px;
import X.C12840mD;
import X.C12850mE;
import X.C12860mF;
import X.C12870mG;
import X.C12880mH;
import X.C12890mI;
import X.C143906zf;
import X.C159787mS;
import X.C162297re;
import X.C16840u3;
import X.C17760wC;
import X.C17780wE;
import X.C183538qC;
import X.C18390xG;
import X.C24971Zl;
import X.C34171uL;
import X.C44772Xk;
import X.C54292oU;
import X.C56282rj;
import X.C56512s6;
import X.C61072zf;
import X.C614930z;
import X.C620733j;
import X.C621433s;
import X.C625635p;
import X.C625835r;
import X.C626936e;
import X.C627736r;
import X.C69263Wi;
import X.C836649h;
import X.C85014Ep;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.DialogFragment;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaLinearLayout;
import com.whatsapp.WaTextView;
import com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class SettingsGoogleDrive extends AnonymousClass0DD implements C16840u3, AnonymousClass4EE {
    public View.OnClickListener A00;
    public View.OnClickListener A01;
    public View.OnClickListener A02;
    public View.OnClickListener A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public Button A0A;
    public ImageView A0B;
    public ImageView A0C;
    public ProgressBar A0D;
    public TextView A0E;
    public TextView A0F;
    public TextView A0G;
    public TextView A0H;
    public TextView A0I;
    public TextView A0J;
    public TextView A0K;
    public TextView A0L;
    public TextView A0M;
    public SwitchCompat A0N;
    public SwitchCompat A0O;
    public C116985rC A0P;
    public WaLinearLayout A0Q;
    public WaTextView A0R;
    public WaTextView A0S;
    public WaTextView A0T;
    public AnonymousClass0XM A0U;
    public AnonymousClass0U8 A0V;
    public AnonymousClass0WN A0W;
    public AnonymousClass0XR A0X;
    public C10240hc A0Y;
    public C06260Ww A0Z;
    public AnonymousClass0QJ A0a;
    public C10230hb A0b;
    public SettingsGoogleDriveViewModel A0c;
    public C44772Xk A0d;
    public C836649h A0e;
    public C56512s6 A0f;
    public C54292oU A0g;
    public AnonymousClass5ZR A0h;
    public AnonymousClass3DW A0i;
    public C625835r A0j;
    public AnonymousClass4FV A0k;
    public AnonymousClass5RU A0l;
    public C34171uL A0m;
    public C183538qC A0n;
    public boolean A0o;
    public String[] A0p;
    public final ConditionVariable A0q = new ConditionVariable(false);
    public final C85014Ep A0r = new C10270hf(this);
    public volatile boolean A0s;

    public static final int A0C(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = SettingsGoogleDriveViewModel.A0b;
            if (i2 >= iArr.length) {
                Log.e(AnonymousClass000.A0Y("settings-gdrive/get-backup-freq-index/", AnonymousClass001.A0o(), i));
                return 0;
            } else if (iArr[i2] == i) {
                return i2;
            } else {
                i2++;
            }
        }
    }

    public final void A7B() {
        C56512s6 r0 = this.A0f;
        C85014Ep r1 = this.A0r;
        if (r0.A08(r1) && this.A0f.A07(r1)) {
            this.A0Z.A0C(10);
            this.A0c.A0k(false);
            this.A0c.A0o(false);
            C24971Zl r2 = new C24971Zl();
            r2.A05 = Long.valueOf(System.currentTimeMillis());
            r2.A04 = 0;
            r2.A02 = AnonymousClass001.A0f();
            AnonymousClass3DW r10 = this.A0i;
            C61072zf r9 = this.A07;
            C06390Xm.A05(this, this, this.A0U, this.A0h, this.A00, r9, r10, new C10360ho(this, r2));
        }
    }

    public final void A7C() {
        AnonymousClass1Y2 r1 = new AnonymousClass1Y2();
        r1.A02 = String.valueOf(1);
        r1.A00 = 2;
        r1.A01 = 53;
        this.A0k.BhB(r1);
    }

    public final void A7I() {
        this.A04.BkM(new C12870mG(AccountManager.get(this).addAccount("com.google", (String) null, (String[]) null, (Bundle) null, this, (AccountManagerCallback) null, (Handler) null), new AuthRequestDialogFragment(), this));
    }

    public final void A7g(Integer num) {
        int i = 0;
        if (num == null) {
            num = 0;
        }
        int intValue = num.intValue();
        WaTextView waTextView = this.A0S;
        if (intValue != 1) {
            i = 8;
        } else {
            waTextView.setText(R.string.f11nameremoved);
            waTextView = this.A0S;
        }
        waTextView.setVisibility(i);
    }

    public void onDestroy() {
        this.A0o = true;
        this.A0c.A0t(false);
        unbindService(this.A0c.A0E());
        super.onDestroy();
    }

    public class AuthRequestDialogFragment extends Hilt_SettingsGoogleDrive_AuthRequestDialogFragment {
        /* access modifiers changed from: private */
        public /* synthetic */ void A00() {
            C003203q A0Q = A0Q();
            C626936e.A06(A0Q);
            ((SettingsGoogleDrive) A0Q).A0s = true;
        }

        public Dialog A1J(Bundle bundle) {
            C18390xG r3 = new C18390xG(A1D());
            r3.setTitle(R.string.f11nameremoved);
            r3.setIndeterminate(true);
            r3.setMessage(C08310eF.A09(this).getString(R.string.f11nameremoved));
            r3.setCancelable(true);
            r3.setOnCancelListener(new C17780wE(this, 6));
            return r3;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A0Y() {
        boolean A0a2 = this.A0j.A0a();
        boolean A2E = this.A09.A2E();
        if (A0a2) {
            if (!A2E) {
                C06550Ye.A0J(this.A05);
                A7D();
            }
        } else if (A2E) {
            this.A05.A0S(new C11650jz(this));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A0Z() {
        Log.i("settings-gdrive/gps-unavailable-and-user-declined-install");
        this.A0q.open();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A0b() {
        this.A0c.A01.block();
        if (C06520Ya.A0F(this.A09) || this.A09.A07() == 12) {
            this.A0Z.A0C(10);
            if (!C06540Yd.A0K(this.A09)) {
                A7J();
                return;
            }
        }
        this.A0Y.A0N();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A0c() {
        this.A04.BkM(new C12380lS(new AuthRequestDialogFragment(), this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A0d() {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30) {
            i = R.string.f11nameremoved;
        } else {
            i = R.string.f11nameremoved;
            if (i2 < 33) {
                i = R.string.f11nameremoved;
            }
        }
        RequestPermissionActivity.A0b(this, i, R.string.f11nameremoved);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A0e() {
        if (this.A09.A2E()) {
            C56282rj r1 = new C56282rj(18);
            r1.A06(getString(R.string.f11nameremoved));
            r1.A02(getString(R.string.f11nameremoved));
            r1.A07(false);
            r1.A05(getString(R.string.f11nameremoved));
            r1.A03(getString(R.string.f11nameremoved));
            AnonymousClass00M.A06(r1.A00(), this);
            return;
        }
        A77();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A0f() {
        C56282rj r1 = new C56282rj(12);
        r1.A02(getString(R.string.f11nameremoved));
        r1.A05(getString(R.string.f11nameremoved));
        r1.A03(getString(R.string.f11nameremoved));
        AnonymousClass00M.A06(r1.A00(), this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A0g() {
        if (this.A09.A05() == 0 || !C06520Ya.A0F(this.A09)) {
            A7B();
        } else {
            A7F();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A0h(AccountManagerFuture accountManagerFuture, AuthRequestDialogFragment authRequestDialogFragment) {
        try {
            Log.i("settings-gdrive/show-accounts/waiting-for-add-account-activity-to-return");
            BaseBundle baseBundle = (BaseBundle) accountManagerFuture.getResult();
            if (!baseBundle.containsKey("authAccount")) {
                Log.e("settings-gdrive/error-during-add-account/account-manager-returned-with-no-account-name");
            } else {
                A7Q(authRequestDialogFragment, String.valueOf(baseBundle.get("authAccount")));
            }
        } catch (OperationCanceledException e) {
            Log.i("settings-gdrive/user-canceled-add-account-operation", e);
        } catch (AuthenticatorException | IOException e2) {
            Log.e("settings-gdrive/error-during-add-account", e2);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A0j(Intent intent) {
        AnonymousClass29R.A00(this.A0g.A06(), intent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A0l(View view) {
        int i;
        if (view == this.A04) {
            A7H();
            return;
        }
        if (view == this.A09) {
            Log.i("settings-gdrive/toggle-network-pref");
            if (!C06540Yd.A0J(this.A09)) {
                if (C06540Yd.A0K(this.A09)) {
                    i = R.string.f11nameremoved;
                } else {
                    this.A0O.toggle();
                    this.A04.BkM(new C12370lR(this, this.A0O.isChecked() ? 1 : 0));
                    return;
                }
            }
            i = R.string.f11nameremoved;
        } else if (view == this.A07) {
            Log.i("settings-gdrive/show-freq-pref");
            SingleChoiceListDialogFragment singleChoiceListDialogFragment = new SingleChoiceListDialogFragment();
            Bundle A082 = AnonymousClass002.A08();
            A082.putInt("dialog_id", 10);
            A082.putString("title", getString(R.string.f11nameremoved));
            A082.putStringArray("items", this.A0p);
            A082.putInt("selected_item_index", A0C(this.A09.A05()));
            singleChoiceListDialogFragment.A0u(A082);
            if (!A7j()) {
                AnonymousClass00M.A06(singleChoiceListDialogFragment, this);
                return;
            }
            return;
        } else if (view == this.A08) {
            if (!C06540Yd.A0J(this.A09)) {
                if (C06540Yd.A0K(this.A09)) {
                    Bot(R.string.f11nameremoved);
                } else {
                    this.A0N.toggle();
                }
                this.A0c.A0p(this.A0N.isChecked());
                return;
            }
            i = R.string.f11nameremoved;
        } else {
            throw AnonymousClass001.A0c("Can't handle the click event for the pref view");
        }
        Bot(i);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A0q(AuthRequestDialogFragment authRequestDialogFragment) {
        A7Q(authRequestDialogFragment, this.A09.A0X());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A0y(AuthRequestDialogFragment authRequestDialogFragment, String str) {
        C69263Wi r1;
        Runnable runnable;
        try {
            Log.i(AnonymousClass0YV.A0B("settings-gdrive/auth-request asking GoogleAuthUtil for token for ", str, AnonymousClass001.A0o()));
            String A032 = C162297re.A03(new Account(str, "com.google"), this);
            StringBuilder A0o2 = AnonymousClass001.A0o();
            AnonymousClass0YV.A0E("settings-gdrive/auth-request for account ", str, A0o2);
            Log.i(AnonymousClass000.A0X(", token has been received.", A0o2));
            if (!this.A0s) {
                this.A05.A0S(new C12890mI(this, A032, str));
            } else {
                Log.i(AnonymousClass0YV.A0B("settings-gdrive/auth-request/received-token-but-user-cancelled-the-request/", str, AnonymousClass001.A0o()));
            }
            this.A0q.open();
        } catch (C126936Px e) {
            if (this.A0s) {
                this.A0q.open();
            } else {
                this.A05.A0S(new C12410lV(authRequestDialogFragment, this));
            }
            Log.e("settings-gdrive/gps-unavailable", e);
        } catch (UserRecoverableAuthException e2) {
            boolean z = this.A0s;
            ConditionVariable conditionVariable = this.A0q;
            if (z) {
                conditionVariable.open();
                return;
            }
            conditionVariable.close();
            r1 = this.A05;
            runnable = new C12420lW(e2, this);
            r1.A0S(runnable);
        } catch (IOException e3) {
            Log.e("settings-gdrive/auth-request", e3);
            this.A0q.open();
            if (!this.A0s) {
                this.A05.A0S(new C11690k3(this));
                return;
            }
            Log.i("settings-gdrive/auth-request/user-cancelled");
        } catch (C143906zf | SecurityException e4) {
            Log.e("settings-gdrive/auth-request", e4);
            this.A0q.open();
            if (!this.A0s) {
                r1 = this.A05;
                runnable = new C12430lX(this, str);
                r1.A0S(runnable);
            }
            Log.i("settings-gdrive/auth-request/user-cancelled");
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A0z(AuthRequestDialogFragment authRequestDialogFragment, String str) {
        boolean z;
        String A0V2;
        Account[] accountsByType = AccountManager.get(this).getAccountsByType("com.google");
        int length = accountsByType.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else if (TextUtils.equals(accountsByType[i].name, str)) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        C626936e.A06(str);
        if (z) {
            A7Q(authRequestDialogFragment, str);
            return;
        }
        try {
            BaseBundle result = AccountManager.get(this).addAccount("com.google", (String) null, (String[]) null, (Bundle) null, this, (AccountManagerCallback) null, (Handler) null).getResult();
            if (!result.containsKey("authAccount")) {
                A0V2 = "settings-gdrive/error-during-media-restore/account-manager-returned-with-no-account-name";
            } else if (!str.equals(result.get("authAccount"))) {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("settings-gdrive/error-during-media-restore/account-manager user added ");
                A0o2.append(result.get("authAccount"));
                A0V2 = AnonymousClass000.A0V(" instead of ", str, A0o2);
            } else {
                A7O(A75(false), (String) null, (String) null);
                A7Q(authRequestDialogFragment, str);
                return;
            }
            Log.e(A0V2);
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            Log.e("settings-gdrive/error-during-media-restore", e);
        }
    }

    public static /* synthetic */ void A11(SettingsGoogleDrive settingsGoogleDrive) {
        settingsGoogleDrive.A0Z.A0C(10);
        settingsGoogleDrive.A0Y.A0N();
    }

    public static /* synthetic */ void A13(SettingsGoogleDrive settingsGoogleDrive) {
        if (settingsGoogleDrive.A0c.A0w()) {
            if (settingsGoogleDrive.A0c.A0v()) {
                settingsGoogleDrive.A0b.A0F();
            }
            settingsGoogleDrive.A0Y.A0D();
            return;
        }
        settingsGoogleDrive.onNewIntent(new Intent("action_perform_media_restore_over_cellular"));
    }

    public static /* synthetic */ void A1Z(SettingsGoogleDrive settingsGoogleDrive, String str) {
        if (str == null) {
            settingsGoogleDrive.A0E.setText(R.string.f11nameremoved);
        } else {
            settingsGoogleDrive.A0E.setText(str);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A1c(C03650La r6) {
        long A022 = this.A07.A02();
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("settings-gdrive/display-media-restore-error/");
        A0o2.append(r6.A00);
        Log.i(AnonymousClass000.A0Z(" freeSpace:", A0o2, A022));
        if (A022 > 0) {
            A7E();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A1d(C24971Zl r4, int i) {
        boolean z;
        this.A0c.A0k(true);
        this.A0c.A0o(true);
        if (i == 0) {
            this.A0c.A0b();
            if (this.A09.A05() != 0) {
                z = A7k();
                r4.A03 = Integer.valueOf(C06550Ye.A00(i));
                r4.A01 = Integer.valueOf(C06540Yd.A00(this.A09, true));
                r4.A00 = Boolean.valueOf(z);
                this.A0k.BhD(r4);
            }
        }
        z = false;
        r4.A03 = Integer.valueOf(C06550Ye.A00(i));
        r4.A01 = Integer.valueOf(C06540Yd.A00(this.A09, true));
        r4.A00 = Boolean.valueOf(z);
        this.A0k.BhD(r4);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A1g(String str) {
        this.A04.BkM(new C12850mE(new AuthRequestDialogFragment(), this, str));
    }

    public final int A75(boolean z) {
        if (z) {
            return 1;
        }
        AnonymousClass1VX r2 = this.A0D;
        if (AnonymousClass0XR.A03(this.A0V, this.A09, r2)) {
            return 2;
        }
        if (!((C614930z) this.A0n.get()).A06() || this.A09.A29()) {
            return 0;
        }
        return 3;
    }

    public final String A76(long j) {
        int i;
        if (j == 0) {
            i = R.string.f11nameremoved;
        } else if (j != -1) {
            return C107565bW.A08(this.A00, j);
        } else {
            i = R.string.f11nameremoved;
        }
        return getString(i);
    }

    public final void A77() {
        Log.i("settings-gdrive/cancel-backup");
        this.A0c.A0n(false);
        this.A0Z.A09();
        if (C06540Yd.A0Q(this.A0D)) {
            try {
                for (C04610Pv r0 : (List) ((C06310Xb) this.A0m.get()).A04("com.whatsapp.backup.google.google-backup-worker").get()) {
                    if (!r0.A03.A00()) {
                        ((C06310Xb) this.A0m.get()).A0B("com.whatsapp.backup.google.google-backup-worker");
                        return;
                    }
                }
            } catch (InterruptedException | ExecutionException unused) {
                Log.e("settings-gdrive/cancel-backup couldn't get work info for BackupWorker.");
            }
        }
    }

    public final void A7A() {
        try {
            startActivity(Intent.makeMainSelectorActivity("android.intent.action.MAIN", "android.intent.category.APP_BROWSER").setData(Uri.parse("https://one.google.com/storage/whatsapp?utm_source=whatsapp&utm_medium=android&utm_campaign=whatsapp_oos_banner")));
        } catch (ActivityNotFoundException | SecurityException unused) {
            Intent data = new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.fromParts("http", "", (String) null));
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse("https://one.google.com/storage/whatsapp?utm_source=whatsapp&utm_medium=android&utm_campaign=whatsapp_oos_banner"));
            intent.setSelector(data);
            try {
                startActivity(intent);
            } catch (ActivityNotFoundException | SecurityException unused2) {
                this.A00.A0A(this, new Intent("android.intent.action.VIEW", Uri.parse("https://one.google.com/storage/whatsapp?utm_source=whatsapp&utm_medium=android&utm_campaign=whatsapp_oos_banner")));
            }
        }
    }

    public final void A7D() {
        this.A05.A0S(new C11660k0(this));
    }

    public final void A7E() {
        this.A04.BkM(new C11680k2(this));
    }

    public final void A7F() {
        String A0X2 = this.A09.A0X();
        if (A0X2 == null) {
            A7H();
            return;
        }
        this.A04.BkM(new C12840mD(new AuthRequestDialogFragment(), this, A0X2));
    }

    public final void A7G() {
        int i;
        boolean A0G2 = this.A0W.A0G();
        int A052 = this.A09.A05();
        WaTextView waTextView = this.A0T;
        if (A052 != 0) {
            i = R.string.f11nameremoved;
            if (A0G2) {
                i = R.string.f11nameremoved;
            }
        } else {
            i = R.string.f11nameremoved;
            if (A0G2) {
                i = R.string.f11nameremoved;
            }
        }
        waTextView.setText(i);
    }

    public final void A7J() {
        this.A0Z.A0C(10);
        Intent A0t = C627736r.A0t(this, "action_backup");
        A0t.putExtra("backup_mode", "user_initiated");
        AnonymousClass29R.A00(this, A0t);
    }

    public final void A7K(int i) {
        String str;
        int[] iArr = SettingsGoogleDriveViewModel.A0b;
        int length = iArr.length;
        StringBuilder A0o2 = AnonymousClass001.A0o();
        if (i > length) {
            str = AnonymousClass000.A0Y("settings-gdrive/change-freq/unexpected-choice/", A0o2, i);
        } else {
            A0o2.append("settings-gdrive/change-freq/index:");
            A0o2.append(i);
            A0o2.append("/value:");
            Log.i(AnonymousClass000.A0h(A0o2, iArr[i]));
            int A052 = this.A09.A05();
            int i2 = iArr[i];
            if (!this.A0c.A0x(i2)) {
                str = "settings-gdrive/change-freq failed to set the new frequency.";
            } else {
                if (i2 == 0) {
                    this.A09.A15(10);
                    A7M(10);
                    A7O(0, (String) null, (String) null);
                    if (this.A09.A0M() < System.currentTimeMillis() + 2592000000L) {
                        this.A09.A1F(System.currentTimeMillis() + 2592000000L);
                    }
                } else if (A052 == 0) {
                    if (this.A05.getVisibility() != 0) {
                        int A072 = this.A09.A07();
                        A7O(A75(AnonymousClass001.A1X(A072, 10)), (String) null, (String) null);
                        A7M(A072);
                    }
                    if (!C06540Yd.A0J(this.A09) && !C06540Yd.A0K(this.A09)) {
                        this.A04.performClick();
                    }
                }
                A7G();
                return;
            }
        }
        Log.e(str);
    }

    public final void A7M(int i) {
        TextView textView = this.A0J;
        int i2 = 8;
        if (i == 13) {
            textView.setText(R.string.f11nameremoved);
            textView = this.A0J;
            i2 = 0;
        }
        textView.setVisibility(i2);
    }

    public final void A7N(int i, int i2, int i3, int i4, int i5) {
        this.A05.setBackgroundColor(getResources().getColor(AnonymousClass34K.A02(this, i, i2)));
        ImageView imageView = (ImageView) C06560Yg.A02(this.A05, R.id.banner_icon);
        C06560Yg.A0C(AnonymousClass0Y8.A07(this, i3), imageView);
        imageView.setImageDrawable(C107335b8.A02(this, i4));
        C107335b8.A0E(imageView, AnonymousClass0Y8.A04(this, i5));
        C005205m.A00(this, R.id.banner_title).setVisibility(8);
        this.A05.setVisibility(0);
    }

    public final void A7O(int i, String str, String str2) {
        if (i == 1) {
            A7N(R.attr.f3nameremoved, R.color.f5nameremoved, R.color.f5nameremoved, R.drawable.ic_warning, R.color.f5nameremoved);
            TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C06560Yg.A02(this.A05, R.id.banner_description);
            textEmojiLabel.setClickable(AnonymousClass000.A1W(this.A02));
            textEmojiLabel.setOnClickListener(this.A02);
            String str3 = str2;
            if (!TextUtils.isEmpty(str3)) {
                textEmojiLabel.A0I(C107575bX.A02(str3, new Object[0]));
            } else {
                Object[] objArr = new Object[1];
                AnonymousClass00M.A04(this, R.string.f11nameremoved, 0, objArr);
                AnonymousClass001.A0y(this, textEmojiLabel, objArr, R.string.f11nameremoved);
            }
            TextEmojiLabel textEmojiLabel2 = (TextEmojiLabel) C005205m.A00(this, R.id.banner_title);
            String str4 = str;
            if (!TextUtils.isEmpty(str4)) {
                textEmojiLabel2.A0I(C107575bX.A02(str4, new Object[0]));
                textEmojiLabel2.setVisibility(0);
            } else {
                textEmojiLabel2.setVisibility(8);
            }
            C17760wC.A00(C06560Yg.A02(this.A05, R.id.close), this, 32);
        } else if (i == 2) {
            A7N(R.attr.f3nameremoved, R.color.f5nameremoved, R.color.f5nameremoved, R.drawable.ic_backup_small, R.color.f5nameremoved);
            AnonymousClass0XR r0 = this.A0X;
            if (r0 == null) {
                AnonymousClass1VX r6 = this.A0D;
                AnonymousClass4FV r7 = this.A0k;
                C111095hX r2 = this.A00;
                AnonymousClass5X8 r3 = this.A03;
                AnonymousClass33p r5 = this.A09;
                r0 = new AnonymousClass0XR(this.A05, r2, r3, this.A0V, r5, r6, r7);
                this.A0X = r0;
            }
            r0.A04();
        } else if (i != 3) {
            this.A05.setVisibility(8);
        } else {
            A7N(R.attr.f3nameremoved, R.color.f5nameremoved, R.color.f5nameremoved, R.drawable.ic_backup_small, R.color.f5nameremoved);
            C183538qC r22 = this.A0n;
            AnonymousClass0JL.A00(this, this.A05, this.A09, r22);
        }
    }

    public final void A7P(long j) {
        long j2;
        String A032 = C06390Xm.A03(this, this.A00, j);
        String A0X2 = this.A09.A0X();
        long A0R2 = this.A09.A0R(A0X2);
        String A76 = A76(A0R2);
        if (A0X2 != null) {
            j2 = this.A09.A0S(A0X2);
        } else {
            j2 = -1;
        }
        if (A0R2 == 0 || this.A09.A05() == 0) {
            AnonymousClass001.A0y(this, this.A0L, new Object[]{A032}, R.string.f11nameremoved);
            this.A0L.setVisibility(0);
        } else {
            this.A0L.setVisibility(8);
        }
        AnonymousClass001.A0y(this, this.A0K, new Object[]{A76}, R.string.f11nameremoved);
        int i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        TextView textView = this.A0I;
        if (i > 0) {
            textView.setVisibility(0);
            AnonymousClass001.A0y(this, this.A0I, new Object[]{AnonymousClass35V.A04(this.A00, j2)}, R.string.f11nameremoved);
        } else {
            textView.setVisibility(8);
        }
        if (!this.A09.A2N(A0X2) || this.A09.A0G(A0X2) != 2 || i <= 0) {
            this.A0Q.setVisibility(8);
        } else {
            this.A0Q.setVisibility(0);
        }
    }

    public void A7R(AnonymousClass0JM r14) {
        String A0F2;
        TextView textView;
        String A0F3;
        int i;
        if (r14 == null) {
            textView = this.A0G;
            A0F3 = "";
        } else if (r14 instanceof C02050Ec) {
            switch (((C02050Ec) r14).A00) {
                case 0:
                    i = R.string.f11nameremoved;
                    break;
                case 1:
                    i = R.string.f11nameremoved;
                    break;
                case 2:
                    i = R.string.f11nameremoved;
                    break;
                case 3:
                    i = R.string.f11nameremoved;
                    break;
                case 4:
                    i = R.string.f11nameremoved;
                    break;
                case 5:
                    i = R.string.f11nameremoved;
                    break;
                case 6:
                    i = R.string.f11nameremoved;
                    break;
                case 7:
                    i = R.string.f11nameremoved;
                    break;
                case 8:
                    i = R.string.f11nameremoved;
                    break;
                case 9:
                    i = R.string.f11nameremoved;
                    break;
                case 10:
                    i = R.string.f11nameremoved;
                    break;
                case 11:
                    i = R.string.f11nameremoved;
                    break;
                case 12:
                    i = R.string.f11nameremoved;
                    break;
                default:
                    i = R.string.f11nameremoved;
                    break;
            }
            this.A0G.setText(i);
            return;
        } else if (r14 instanceof AnonymousClass0Ea) {
            textView = this.A0G;
            A0F3 = AnonymousClass002.A0F(this, this.A00.A0N().format(((double) ((AnonymousClass0Ea) r14).A00) / 100.0d), new Object[1], 0, R.string.f11nameremoved);
        } else {
            if (r14 instanceof C02060Ed) {
                C02060Ed r142 = (C02060Ed) r14;
                C620733j r2 = this.A00;
                long j = r142.A01;
                String A042 = AnonymousClass35V.A04(r2, j);
                long j2 = r142.A00;
                Object[] objArr = new Object[3];
                objArr[0] = A042;
                objArr[1] = AnonymousClass35V.A04(this.A00, j2);
                A0F2 = AnonymousClass002.A0F(this, this.A00.A0N().format(((double) ((int) ((j * 100) / j2))) / 100.0d), objArr, 2, R.string.f11nameremoved);
            } else if (r14 instanceof C02040Eb) {
                A0F2 = AnonymousClass002.A0F(this, this.A00.A0N().format(((double) ((C02040Eb) r14).A00) / 100.0d), new Object[1], 0, R.string.f11nameremoved);
            } else if (r14 instanceof C02070Ee) {
                C02070Ee r143 = (C02070Ee) r14;
                C620733j r22 = this.A00;
                long j3 = r143.A00;
                Object[] objArr2 = new Object[3];
                objArr2[0] = AnonymousClass35V.A04(r22, j3);
                C620733j r23 = this.A00;
                long j4 = r143.A01;
                objArr2[1] = AnonymousClass35V.A04(r23, j4);
                A0F2 = AnonymousClass002.A0F(this, this.A00.A0N().format(((double) j3) / ((double) j4)), objArr2, 2, R.string.f11nameremoved);
            } else {
                throw AnonymousClass000.A0E(r14, "Unexpected message ", AnonymousClass001.A0o());
            }
            this.A0G.setText(A0F2);
            return;
        }
        textView.setText(A0F3);
    }

    public void A7T(AnonymousClass0JN r5) {
        C620733j r3;
        int i;
        long j;
        String A022;
        TextView textView = this.A0M;
        if (r5 == null) {
            textView.setVisibility(8);
            return;
        }
        AnonymousClass001.A18(textView, 0);
        if (r5 instanceof C02080Ef) {
            A022 = getString(R.string.f11nameremoved);
        } else {
            if (r5 instanceof C02100Eh) {
                r3 = this.A00;
                i = R.plurals.f9nameremoved;
                j = ((C02100Eh) r5).A00;
            } else if (r5 instanceof C02090Eg) {
                r3 = this.A00;
                i = R.plurals.f9nameremoved;
                j = ((C02090Eg) r5).A00;
            } else {
                throw AnonymousClass000.A0E(r5, "Unexpected state ", AnonymousClass001.A0o());
            }
            A022 = AnonymousClass35V.A02(r3, i, j);
        }
        this.A0M.setText(A022);
    }

    public void A7U(Boolean bool) {
        boolean A1Y = AnonymousClass000.A1Y(bool, Boolean.TRUE);
        if (A1Y != this.A0A.isClickable()) {
            this.A0A.setClickable(A1Y);
        }
    }

    public void A7V(Boolean bool) {
        Boolean bool2 = Boolean.TRUE;
        TextView textView = this.A0G;
        int i = 0;
        if (bool != bool2) {
            i = 8;
        }
        AnonymousClass001.A18(textView, i);
    }

    public void A7W(Boolean bool) {
        Boolean bool2 = Boolean.TRUE;
        Button button = this.A0A;
        int i = 0;
        if (bool != bool2) {
            i = 8;
        }
        AnonymousClass001.A18(button, i);
    }

    public void A7X(Boolean bool) {
        Boolean bool2 = Boolean.TRUE;
        ImageView imageView = this.A0B;
        int i = 0;
        if (bool != bool2) {
            i = 8;
        }
        AnonymousClass001.A18(imageView, i);
    }

    public void A7Y(Boolean bool) {
        Boolean bool2 = Boolean.TRUE;
        WaTextView waTextView = this.A0R;
        int i = R.string.f11nameremoved;
        if (bool == bool2) {
            i = R.string.f11nameremoved;
        }
        waTextView.setText(i);
    }

    public void A7Z(Boolean bool) {
        boolean A1Y = AnonymousClass000.A1Y(bool, Boolean.TRUE);
        if (A1Y != this.A06.isClickable()) {
            this.A06.setClickable(A1Y);
        }
    }

    public void A7a(Boolean bool) {
        A7O(A75(AnonymousClass000.A1Y(bool, Boolean.TRUE)), (String) null, (String) null);
    }

    public void A7b(Boolean bool) {
        boolean A1Y = AnonymousClass000.A1Y(bool, Boolean.TRUE);
        if (A1Y != this.A0D.isIndeterminate()) {
            this.A0D.setIndeterminate(A1Y);
        }
    }

    public void A7c(Boolean bool) {
        Boolean bool2 = Boolean.TRUE;
        ProgressBar progressBar = this.A0D;
        int i = 0;
        if (bool != bool2) {
            i = 8;
        }
        AnonymousClass001.A18(progressBar, i);
    }

    public void A7d(Boolean bool) {
        Boolean bool2 = Boolean.TRUE;
        ImageView imageView = this.A0C;
        int i = 0;
        if (bool != bool2) {
            i = 8;
        }
        AnonymousClass001.A18(imageView, i);
    }

    public void A7e(Integer num) {
        int intValue;
        if (num != null && (intValue = num.intValue()) >= 0) {
            this.A0D.setProgress(intValue);
        }
    }

    public final void A7f(Integer num) {
        DialogFragment dialogFragment;
        if (num != null && num.intValue() == 1 && (dialogFragment = (DialogFragment) AnonymousClass00M.A01(this).A0D(String.valueOf(13))) != null && dialogFragment.A19()) {
            Log.i("settings-gdrive-observer/wifi-connected user is waiting on \"backup on cellular\" prompt  and Wi-Fi is connected, start backup");
            A7J();
            dialogFragment.A1L();
        }
    }

    public final void A7i(String str, String str2) {
        this.A0q.open();
        AnonymousClass00M.A08(this);
        if (str != null && this.A0c.A0y(str2)) {
            Intent A0t = C627736r.A0t(this, "action_fetch_backup_info");
            A0t.putExtra("account_name", str2);
            AnonymousClass29R.A00(this, A0t);
        }
        this.A04.BkM(new C11670k1(this));
    }

    public void Bbg(String[] strArr, int i, int i2) {
        if (i == 10) {
            A7K(i2);
        } else if (i != 17) {
            throw AnonymousClass00M.A02(i);
        } else if (strArr[i2].equals(getString(R.string.f11nameremoved))) {
            A7I();
        } else {
            A7h(strArr[i2]);
        }
    }

    public Dialog onCreateDialog(int i) {
        if (i == 600) {
            return C06390Xm.A00(this);
        }
        if (i != 602) {
            return super.onCreateDialog(i);
        }
        return C06390Xm.A01(this);
    }

    public void onPause() {
        this.A0f.A05(this.A0e);
        super.onPause();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A0a() {
        Bot(R.string.f11nameremoved);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A0n(UserRecoverableAuthException userRecoverableAuthException) {
        BpY(userRecoverableAuthException.A00(), 1);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A0p(AuthRequestDialogFragment authRequestDialogFragment) {
        Dialog A012 = C06540Yd.A01(this, new C17780wE(this, 5), C159787mS.A00(this), 0, true);
        if (A012 == null) {
            Log.e("settings-gdrive/gps-unavailable no way to install.");
            this.A0q.open();
        } else if (!A7j()) {
            Log.i("settings-gdrive/gps-unavailable/prompting-user-to-fix");
            authRequestDialogFragment.A1L();
            A012.show();
        }
    }

    public static /* synthetic */ void A0r(AuthRequestDialogFragment authRequestDialogFragment, SettingsGoogleDrive settingsGoogleDrive) {
        if (!settingsGoogleDrive.A7j()) {
            C08240dc r1 = new C08240dc(AnonymousClass00M.A01(settingsGoogleDrive));
            r1.A0C(authRequestDialogFragment, "auth_request_dialog");
            r1.A00(true);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A1e(AnonymousClass33M r6) {
        long A072 = r6.A07();
        if (A072 < 500) {
            SystemClock.sleep(500 - A072);
        }
        AnonymousClass00M.A08(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A1f(String str) {
        Log.e(AnonymousClass000.A0V("settings-gdrive/auth-request unable to access ", str, AnonymousClass001.A0o()));
        Bot(R.string.f11nameremoved);
        this.A0c.A0x(0);
    }

    public int A74() {
        boolean A012 = C61072zf.A01();
        C116985rC r1 = this.A0P;
        boolean A072 = r1.A07();
        if (A012) {
            if (!A072) {
                return R.string.f11nameremoved;
            }
            r1.A04();
            throw AnonymousClass001.A0g("getSmbSettingsGDriveBackupGeneralInfoSDCardStringId");
        } else if (!A072) {
            return R.string.f11nameremoved;
        } else {
            r1.A04();
            throw AnonymousClass001.A0g("getSmbSettingsGDriveBackupGeneralInfoSharedStorageStringId");
        }
    }

    public final void A78() {
        AnonymousClass4FS r1;
        Runnable r0;
        A7G();
        this.A0c.A0e();
        String A0X2 = this.A09.A0X();
        if (A0X2 == null || this.A09.A0S(A0X2) == -1) {
            r1 = this.A04;
            r0 = new C11640jy(this);
        } else if (this.A09.A2N(A0X2) && !this.A09.A2E()) {
            PhoneUserJid A0J2 = this.A01.A0J();
            if (A0J2 != null) {
                this.A0a.A01(new AnonymousClass0EB(this));
                Intent A0t = C627736r.A0t(this, "action_delete");
                A0t.putExtra("account_name", this.A09.A0X());
                A0t.putExtra("jid_user", A0J2.getUser());
                r1 = this.A04;
                r0 = new C12360lQ(A0t, this);
            } else {
                return;
            }
        } else if (!this.A09.A2N(A0X2) && this.A09.A2E()) {
            A7B();
            return;
        } else {
            return;
        }
        r1.BkM(r0);
    }

    public final void A79() {
        setTitle(R.string.f11nameremoved);
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        C626936e.A06(supportActionBar);
        supportActionBar.A0N(true);
        this.A05 = C005205m.A00(this, R.id.backup_banner_view);
        this.A04 = findViewById(R.id.settings_gdrive_change_account_view);
        this.A0E = C005205m.A01(this, R.id.settings_gdrive_account_name_summary);
        this.A0A = (Button) findViewById(R.id.google_drive_backup_now_btn);
        this.A0G = (TextView) findViewById(R.id.google_drive_backup_now_btn_info);
        this.A0H = C005205m.A01(this, R.id.gdrive_backup_general_info);
        this.A0D = (ProgressBar) findViewById(R.id.google_drive_progress);
        AnonymousClass0Y8.A04(this, AnonymousClass34K.A01(this, R.attr.f3nameremoved));
        this.A0B = (ImageView) findViewById(R.id.cancel_download);
        this.A0C = (ImageView) findViewById(R.id.resume_download);
        this.A07 = findViewById(R.id.settings_gdrive_change_frequency_view);
        this.A0F = (TextView) findViewById(R.id.settings_gdrive_backup_options_summary);
        this.A09 = findViewById(R.id.settings_gdrive_network_settings_view);
        this.A0O = (SwitchCompat) findViewById(R.id.gdrive_network_setting);
        this.A08 = findViewById(R.id.settings_gdrive_backup_include_video);
        this.A06 = findViewById(R.id.settings_gdrive_password_protect_backups);
        this.A0R = (WaTextView) findViewById(R.id.settings_gdrive_password_protect_backups_value);
        this.A0T = (WaTextView) findViewById(R.id.settings_gdrive_backup_encryption_info);
        this.A0S = (WaTextView) findViewById(R.id.settings_encrypted_backup_info);
        this.A0Q = (WaLinearLayout) findViewById(R.id.gdrive_backup_e2e_encrypted);
        this.A0N = (SwitchCompat) findViewById(R.id.include_video_setting);
        this.A0M = C005205m.A01(this, R.id.include_video_settings_summary);
        this.A0L = C005205m.A01(this, R.id.local_backup_time);
        this.A0K = C005205m.A01(this, R.id.gdrive_backup_time);
        this.A0I = C005205m.A01(this, R.id.gdrive_backup_size);
        this.A0J = C005205m.A01(this, R.id.gdrive_backup_status);
        A7M(this.A09.A07());
        int A002 = C107405bG.A00(this, R.attr.f3nameremoved, R.color.f5nameremoved);
        C107335b8.A0E((ImageView) findViewById(R.id.last_backup_icon), A002);
        C107335b8.A0E((ImageView) findViewById(R.id.gdrive_icon), A002);
        C107335b8.A0E((ImageView) findViewById(R.id.backup_settings_icon), A002);
        int[] iArr = SettingsGoogleDriveViewModel.A0a;
        int length = iArr.length;
        this.A0p = new String[length];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            if (i2 == R.string.f11nameremoved) {
                String[] strArr = this.A0p;
                Object[] objArr = new Object[1];
                AnonymousClass00M.A04(this, R.string.f11nameremoved, 0, objArr);
                strArr[i] = getString(R.string.f11nameremoved, objArr);
            } else {
                AnonymousClass00M.A04(this, i2, i, this.A0p);
            }
        }
        this.A06.setOnClickListener(new AnonymousClass0w4(this, 15));
    }

    public final void A7H() {
        int i;
        C626936e.A01();
        if (!A7j()) {
            if (C06540Yd.A0J(this.A09)) {
                Log.i("settings-gdrive/account-selector/backup/running");
                i = R.string.f11nameremoved;
            } else if (C06540Yd.A0K(this.A09)) {
                Log.i("settings-gdrive/account-selector/restore/running");
                i = R.string.f11nameremoved;
            } else if (this.A0h.A02("android.permission.GET_ACCOUNTS") != 0 || !this.A0d.A00()) {
                AnonymousClass5UF A1F = C627736r.A1F(this);
                A1F.A03();
                A1F.A06(new String[]{"android.permission.GET_ACCOUNTS", "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"});
                A1F.A04();
                A1F.A05();
                BpY(A1F.A02(), 150);
                return;
            } else {
                String A0X2 = this.A09.A0X();
                Account[] accountsByType = AccountManager.get(this).getAccountsByType("com.google");
                int length = accountsByType.length;
                if (length > 0) {
                    Log.i(AnonymousClass000.A0Y("settings-gdrive/account-selector/starting-account-picker/num-accounts/", AnonymousClass001.A0o(), length));
                    int i2 = length + 1;
                    String[] strArr = new String[i2];
                    int i3 = -1;
                    int i4 = 0;
                    do {
                        String str = accountsByType[i4].name;
                        strArr[i4] = str;
                        if (A0X2 != null && A0X2.equals(str)) {
                            i3 = i4;
                        }
                        i4++;
                    } while (i4 < length);
                    AnonymousClass00M.A04(this, R.string.f11nameremoved, i2 - 1, strArr);
                    SingleChoiceListDialogFragment singleChoiceListDialogFragment = new SingleChoiceListDialogFragment();
                    Bundle A002 = AnonymousClass00M.A00(this);
                    A002.putInt("selected_item_index", i3);
                    A002.putStringArray("multi_line_list_items_key", strArr);
                    singleChoiceListDialogFragment.A0u(A002);
                    if (AnonymousClass00M.A01(this).A0D("account-picker") == null) {
                        AnonymousClass00M.A07(singleChoiceListDialogFragment, this, "account-picker");
                        return;
                    }
                    return;
                }
                Log.i("settings-gdrive/account-selector/no-account-found/start-add-account-activity");
                A7I();
                return;
            }
            Bot(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004a, code lost:
        if (r8.A09.A05() == 0) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004c, code lost:
        A7O(A75(false), (java.lang.String) null, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0057, code lost:
        if (r9 == 10) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0059, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("settings-gdrive/display-backup-error failed to display error ");
        r1.append(X.AnonymousClass0YV.A02(r9));
        com.whatsapp.util.Log.e(X.AnonymousClass000.A0X(" since Activity is about to finish.", r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0072, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0086, code lost:
        r1 = new X.C17760wC(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00bb, code lost:
        r2 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00be, code lost:
        r1 = new java.lang.Object[1];
        X.AnonymousClass00M.A04(r8, com.whatsapp.R.string.f11nameremoved, 0, r1);
        r2 = getString(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e9, code lost:
        r2 = getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ed, code lost:
        r1 = r8.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ef, code lost:
        r8.A02 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f1, code lost:
        r6 = r3;
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0028, code lost:
        if (A7j() != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002a, code lost:
        com.whatsapp.util.Log.i(X.AnonymousClass0YV.A0C("settings-gdrive/display-backup-error/", X.AnonymousClass001.A0o(), r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0037, code lost:
        if (r3 == null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0039, code lost:
        A7O(A75(true), r6, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0040, code lost:
        A7M(r9);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7L(int r9) {
        /*
            r8 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "settings-gdrive/backup-error/"
            java.lang.String r0 = X.AnonymousClass0YV.A0C(r0, r1, r9)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.C626936e.A01()
            r5 = 0
            r4 = 1
            r3 = 0
            switch(r9) {
                case 10: goto L_0x0023;
                case 11: goto L_0x0073;
                case 12: goto L_0x007d;
                case 13: goto L_0x008c;
                case 14: goto L_0x00bb;
                case 15: goto L_0x00cb;
                case 16: goto L_0x00b2;
                case 17: goto L_0x00b6;
                case 18: goto L_0x00bb;
                case 19: goto L_0x00de;
                case 20: goto L_0x00bb;
                case 21: goto L_0x0073;
                case 22: goto L_0x00b6;
                case 23: goto L_0x00e2;
                case 24: goto L_0x00f5;
                case 25: goto L_0x00e6;
                case 26: goto L_0x0016;
                case 27: goto L_0x00b2;
                case 28: goto L_0x0073;
                case 29: goto L_0x0073;
                case 30: goto L_0x0073;
                case 31: goto L_0x0073;
                default: goto L_0x0016;
            }
        L_0x0016:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "settings-gdrive/display-backup-error/unhandled-error/"
            java.lang.String r0 = X.AnonymousClass0YV.A0C(r0, r1, r9)
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0023:
            r6 = r3
        L_0x0024:
            boolean r0 = r8.A7j()
            if (r0 != 0) goto L_0x0055
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "settings-gdrive/display-backup-error/"
            java.lang.String r0 = X.AnonymousClass0YV.A0C(r0, r1, r9)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r3 == 0) goto L_0x0044
            int r0 = r8.A75(r4)
            r8.A7O(r0, r6, r3)
        L_0x0040:
            r8.A7M(r9)
        L_0x0043:
            return
        L_0x0044:
            X.33p r0 = r8.A09
            int r0 = r0.A05()
            if (r0 == 0) goto L_0x0040
            int r1 = r8.A75(r5)
            r0 = 0
            r8.A7O(r1, r0, r0)
            goto L_0x0040
        L_0x0055:
            r0 = 10
            if (r9 == r0) goto L_0x0043
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "settings-gdrive/display-backup-error failed to display error "
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass0YV.A02(r9)
            r1.append(r0)
            java.lang.String r0 = " since Activity is about to finish."
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0073:
            r0 = 2131889552(0x7f120d90, float:1.941377E38)
            java.lang.String r2 = r8.getString(r0)
            r0 = 31
            goto L_0x0086
        L_0x007d:
            r0 = 2131889551(0x7f120d8f, float:1.9413769E38)
            java.lang.String r2 = r8.getString(r0)
            r0 = 30
        L_0x0086:
            X.0wC r1 = new X.0wC
            r1.<init>(r8, r0)
            goto L_0x00ef
        L_0x008c:
            r0 = 2131889562(0x7f120d9a, float:1.9413791E38)
            java.lang.String r3 = r8.getString(r0)
            r1 = 2130968626(0x7f040032, float:1.754591E38)
            r0 = 2131099690(0x7f06002a, float:1.781174E38)
            int r0 = X.AnonymousClass34K.A02(r8, r1, r0)
            r2 = 2131886608(0x7f120210, float:1.94078E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = X.C107575bX.A04(r8, r0)
            java.lang.String r2 = X.AnonymousClass002.A0F(r8, r0, r1, r5, r2)
            r0 = 14
            X.0w4 r1 = new X.0w4
            r1.<init>(r8, r0)
            goto L_0x00ef
        L_0x00b2:
            r2 = 2131889576(0x7f120da8, float:1.941382E38)
            goto L_0x00be
        L_0x00b6:
            java.lang.String r0 = "settings-gdrive/display-backup-error/unexpected-error/file-not-found"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x00bb:
            r2 = 2131889556(0x7f120d94, float:1.9413779E38)
        L_0x00be:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 2131886568(0x7f1201e8, float:1.9407719E38)
            X.AnonymousClass00M.A04(r8, r0, r5, r1)
            java.lang.String r2 = r8.getString(r2, r1)
            goto L_0x00ed
        L_0x00cb:
            r7 = 2131889555(0x7f120d93, float:1.9413777E38)
            java.lang.Object[] r6 = new java.lang.Object[r4]
            X.33j r2 = r8.A00
            r0 = 1000000(0xf4240, double:4.940656E-318)
            java.lang.String r0 = X.AnonymousClass35V.A04(r2, r0)
            java.lang.String r2 = X.AnonymousClass002.A0F(r8, r0, r6, r5, r7)
            goto L_0x00f1
        L_0x00de:
            r0 = 2131889554(0x7f120d92, float:1.9413775E38)
            goto L_0x00e9
        L_0x00e2:
            r0 = 2131889558(0x7f120d96, float:1.9413783E38)
            goto L_0x00e9
        L_0x00e6:
            r0 = 2131889553(0x7f120d91, float:1.9413773E38)
        L_0x00e9:
            java.lang.String r2 = r8.getString(r0)
        L_0x00ed:
            android.view.View$OnClickListener r1 = r8.A03
        L_0x00ef:
            r8.A02 = r1
        L_0x00f1:
            r6 = r3
            r3 = r2
            goto L_0x0024
        L_0x00f5:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unexpected error during Google Drive backup: "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r9)
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.SettingsGoogleDrive.A7L(int):void");
    }

    public final void A7Q(AuthRequestDialogFragment authRequestDialogFragment, String str) {
        C626936e.A00();
        Log.i(AnonymousClass0YV.A0B("settings-gdrive/auth-request account being used is ", str, AnonymousClass001.A0o()));
        this.A0s = false;
        this.A05.A0S(new C12390lT(authRequestDialogFragment, this));
        ConditionVariable conditionVariable = this.A0q;
        conditionVariable.close();
        this.A04.BkM(new C12860mF(authRequestDialogFragment, this, str));
        Log.i("settings-gdrive/auth-request blocking on tokenReceived");
        AnonymousClass33M r2 = new AnonymousClass33M("settings-gdrive/fetch-auth-token");
        conditionVariable.block(C625635p.A0L);
        this.A05.A0S(new C12400lU(this, r2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005a, code lost:
        if (r1 == null) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005c, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005d, code lost:
        r0.setClickable(r9);
        r0.setText(r2);
        X.C005205m.A00(r14, com.whatsapp.R.id.close).setOnClickListener(r14.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0076, code lost:
        if (r14.A09.A05() == 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0078, code lost:
        A7O(A75(false), (java.lang.String) null, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x010f, code lost:
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0112, code lost:
        r2 = getString(r0);
        r0 = 29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0122, code lost:
        r1 = new X.C17760wC(r14, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0129, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("settings-gdrive/display-media-restore-error failed to display error ");
        r1.append(X.AnonymousClass0YV.A02(r8));
        com.whatsapp.util.Log.i(X.AnonymousClass000.A0X(" since Activity is about to finish.", r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0142, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002d, code lost:
        com.whatsapp.util.Log.e(X.AnonymousClass0YV.A0C(r0, r1, r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003a, code lost:
        if (A7j() != false) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003c, code lost:
        com.whatsapp.util.Log.i(X.AnonymousClass0YV.A0C("settings-gdrive/display-media-restore-error/", X.AnonymousClass001.A0o(), r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0047, code lost:
        if (r2 == null) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0049, code lost:
        A7O(A75(true), (java.lang.String) null, r2);
        r0 = X.C005205m.A01(r14, com.whatsapp.R.id.banner_description);
        r0.setOnClickListener(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7S(X.C03650La r15) {
        /*
            r14 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "settings-gdrive/media-restore-error/"
            r1.append(r0)
            int r8 = r15.A00
            java.lang.String r0 = X.AnonymousClass0YV.A02(r8)
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.C626936e.A01()
            X.33p r0 = r14.A09
            java.lang.String r3 = r0.A0X()
            java.lang.String r10 = "settings-gdrive/display-media-restore-error/"
            r9 = 0
            r7 = 1
            r6 = 0
            switch(r8) {
                case 10: goto L_0x0034;
                case 11: goto L_0x0085;
                case 12: goto L_0x0090;
                case 13: goto L_0x00a0;
                case 14: goto L_0x00a7;
                case 15: goto L_0x00ab;
                case 16: goto L_0x0034;
                case 17: goto L_0x0034;
                case 18: goto L_0x010f;
                case 19: goto L_0x010f;
                case 20: goto L_0x010a;
                case 21: goto L_0x0085;
                case 22: goto L_0x0143;
                case 23: goto L_0x0119;
                case 24: goto L_0x0027;
                case 25: goto L_0x0080;
                case 26: goto L_0x0027;
                case 27: goto L_0x0027;
                case 28: goto L_0x0085;
                case 29: goto L_0x0085;
                case 30: goto L_0x0085;
                case 31: goto L_0x0085;
                default: goto L_0x0027;
            }
        L_0x0027:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "settings-gdrive/display-media-restore-error/unhandled-error/"
        L_0x002d:
            java.lang.String r0 = X.AnonymousClass0YV.A0C(r0, r1, r8)
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0034:
            r2 = r6
            r1 = r6
        L_0x0036:
            boolean r0 = r14.A7j()
            if (r0 != 0) goto L_0x0129
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            java.lang.String r0 = X.AnonymousClass0YV.A0C(r10, r0, r8)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r2 == 0) goto L_0x0070
            int r0 = r14.A75(r7)
            r14.A7O(r0, r6, r2)
            r0 = 2131427902(0x7f0b023e, float:1.8477433E38)
            android.widget.TextView r0 = X.C005205m.A01(r14, r0)
            r0.setOnClickListener(r1)
            if (r1 == 0) goto L_0x005d
            r9 = 1
        L_0x005d:
            r0.setClickable(r9)
            r0.setText(r2)
            r0 = 2131428787(0x7f0b05b3, float:1.8479228E38)
            android.view.View r1 = X.C005205m.A00(r14, r0)
            android.view.View$OnClickListener r0 = r14.A01
            r1.setOnClickListener(r0)
        L_0x006f:
            return
        L_0x0070:
            X.33p r0 = r14.A09
            int r0 = r0.A05()
            if (r0 == 0) goto L_0x006f
            int r0 = r14.A75(r9)
            r14.A7O(r0, r6, r6)
            return
        L_0x0080:
            r0 = 2131889583(0x7f120daf, float:1.9413834E38)
            goto L_0x0112
        L_0x0085:
            r0 = 2131889582(0x7f120dae, float:1.9413832E38)
            java.lang.String r2 = r14.getString(r0)
            r0 = 21
            goto L_0x0122
        L_0x0090:
            r1 = 2131889581(0x7f120dad, float:1.941383E38)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r2 = X.AnonymousClass002.A0F(r14, r3, r0, r9, r1)
            r0 = 2
            X.0wI r1 = new X.0wI
            r1.<init>(r0, r3, r14)
            goto L_0x0036
        L_0x00a0:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "settings-gdrive/display-media-restore-error/unexpected/"
            goto L_0x002d
        L_0x00a7:
            r0 = 2131889587(0x7f120db3, float:1.9413842E38)
            goto L_0x0112
        L_0x00ab:
            android.os.Bundle r1 = r15.A01
            r4 = -1
            if (r1 == 0) goto L_0x00e0
            java.lang.String r0 = "total_bytes_to_be_downloaded"
            long r2 = r1.getLong(r0, r4)
            java.lang.String r0 = "total_bytes_downloaded"
            long r4 = r1.getLong(r0, r4)
            long r0 = r2 - r4
            r12 = 0
            int r11 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r11 < 0) goto L_0x00e2
            int r11 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x00e2
            r4 = 2131889585(0x7f120db1, float:1.9413838E38)
            java.lang.Object[] r3 = new java.lang.Object[r7]
            X.33j r2 = r14.A00
            java.lang.String r0 = X.AnonymousClass35V.A04(r2, r0)
            java.lang.String r2 = X.AnonymousClass002.A0F(r14, r0, r3, r9, r4)
        L_0x00d8:
            r0 = 5
            X.0wH r1 = new X.0wH
            r1.<init>(r15, r0, r14)
            goto L_0x0036
        L_0x00e0:
            r2 = -1
        L_0x00e2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r10)
            r1.append(r8)
            java.lang.String r0 = " total: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " download: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " downloaded cannot be more than total."
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 2131889586(0x7f120db2, float:1.941384E38)
            java.lang.String r2 = r14.getString(r0)
            goto L_0x00d8
        L_0x010a:
            java.lang.String r0 = "settings-gdrive/display-media-restore-error/unexpected-error/failed-to-authenticate-with-whatsapp-servers"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x010f:
            r0 = 2131889584(0x7f120db0, float:1.9413836E38)
        L_0x0112:
            java.lang.String r2 = r14.getString(r0)
            r0 = 29
            goto L_0x0122
        L_0x0119:
            r0 = 2131889588(0x7f120db4, float:1.9413844E38)
            java.lang.String r2 = r14.getString(r0)
            r0 = 22
        L_0x0122:
            X.0wC r1 = new X.0wC
            r1.<init>(r14, r0)
            goto L_0x0036
        L_0x0129:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "settings-gdrive/display-media-restore-error failed to display error "
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass0YV.A02(r8)
            r1.append(r0)
            java.lang.String r0 = " since Activity is about to finish."
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0143:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unexpected error: "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r8)
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.SettingsGoogleDrive.A7S(X.0La):void");
    }

    public final void A7h(String str) {
        Log.i(AnonymousClass0YV.A0B("setting-gdrive/activity-result/account-picker accountName is ", str, AnonymousClass001.A0o()));
        if (str != null) {
            this.A04.BkM(new C12880mH(new AuthRequestDialogFragment(), this, str));
        } else if (this.A09.A0X() == null) {
            Log.i("setting-gdrive/activity-result/account-picker accountName is null");
            this.A0c.A0x(0);
        }
    }

    public final boolean A7j() {
        if (C621433s.A03(this) || this.A0o) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d4, code lost:
        if (r2 == 2) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d6, code lost:
        if (r1 == 1) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00fc, code lost:
        com.whatsapp.util.Log.e(X.AnonymousClass000.A0Y("settings-gdrive/perform-backup/unknown-network-type/", X.AnonymousClass001.A0o(), r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0109, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A7k() {
        /*
            r6 = this;
            X.C626936e.A01()
            X.2oU r0 = r6.A0g
            android.content.Context r0 = r0.A06()
            boolean r0 = X.AnonymousClass0YV.A0F(r0)
            r5 = 0
            if (r0 == 0) goto L_0x0023
            X.33p r0 = r6.A09
            java.lang.String r0 = r0.A0X()
            if (r0 != 0) goto L_0x0024
            java.lang.String r0 = "settings-gdrive/perform-backup/account/null"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 2131886570(0x7f1201ea, float:1.9407723E38)
        L_0x0020:
            r6.Bot(r0)
        L_0x0023:
            return r5
        L_0x0024:
            X.33p r0 = r6.A09
            boolean r0 = X.C06540Yd.A0J(r0)
            if (r0 == 0) goto L_0x0050
            java.lang.String r0 = "settings-gdrive/perform-backup/backup/pending"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r6.A0c
            boolean r0 = r0.A0v()
            if (r0 == 0) goto L_0x0043
            X.33p r0 = r6.A09
            int r1 = r0.A07()
            r0 = 10
            if (r1 == r0) goto L_0x004c
        L_0x0043:
            android.view.View$OnClickListener r1 = r6.A02
            if (r1 == 0) goto L_0x004c
            r0 = 0
            r1.onClick(r0)
            return r5
        L_0x004c:
            r0 = 2131893619(0x7f121d73, float:1.942202E38)
            goto L_0x0020
        L_0x0050:
            X.33p r0 = r6.A09
            boolean r0 = X.C06540Yd.A0K(r0)
            if (r0 == 0) goto L_0x0061
            java.lang.String r0 = "settings-gdrive/perform-backup/restore-media/running"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 2131893667(0x7f121da3, float:1.9422117E38)
            goto L_0x0020
        L_0x0061:
            X.33p r0 = r6.A09
            int r1 = r0.A06()
            X.1ip r0 = r6.A07
            r3 = 1
            int r2 = r0.A08(r3)
            if (r2 != 0) goto L_0x0081
            r0 = 2131893651(0x7f121d93, float:1.9422085E38)
            if (r1 != 0) goto L_0x0078
            r0 = 2131893652(0x7f121d94, float:1.9422087E38)
        L_0x0078:
            r6.Bot(r0)
            java.lang.String r0 = "settings-gdrive/perform-backup/no-data-connection"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r5
        L_0x0081:
            r0 = 3
            if (r2 != r0) goto L_0x0093
            r0 = 2131889564(0x7f120d9c, float:1.9413795E38)
            if (r1 != 0) goto L_0x008c
            r0 = 2131889566(0x7f120d9e, float:1.94138E38)
        L_0x008c:
            r6.Bot(r0)
        L_0x008f:
            r6.A7J()
            return r3
        L_0x0093:
            r0 = 2
            if (r2 != r0) goto L_0x00d2
            if (r1 != 0) goto L_0x00d6
            r4 = 13
            X.2rj r1 = new X.2rj
            r1.<init>(r4)
            r0 = 2131895587(0x7f122523, float:1.9426011E38)
            java.lang.String r0 = r6.getString(r0)
            r1.A06(r0)
            r0 = 2131889565(0x7f120d9d, float:1.9413797E38)
            java.lang.String r0 = r6.getString(r0)
            r1.A02(r0)
            r0 = 2131895731(0x7f1225b3, float:1.9426303E38)
            java.lang.String r0 = r6.getString(r0)
            r1.A03(r0)
            r0 = 2131886568(0x7f1201e8, float:1.9407719E38)
            java.lang.String r0 = r6.getString(r0)
            r1.A05(r0)
            com.whatsapp.dialogs.PromptDialogFragment r2 = r1.A00()
            boolean r0 = r6.A7j()
            if (r0 != 0) goto L_0x0023
            goto L_0x00de
        L_0x00d2:
            if (r2 == r3) goto L_0x00d8
            if (r2 != r0) goto L_0x00fc
        L_0x00d6:
            if (r1 != r3) goto L_0x00fc
        L_0x00d8:
            java.lang.String r0 = "settings-gdrive/perform-backup/start-gdrive-backup"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x008f
        L_0x00de:
            X.0df r0 = X.AnonymousClass00M.A01(r6)     // Catch:{ IllegalStateException -> 0x00f2 }
            X.0dc r1 = new X.0dc     // Catch:{ IllegalStateException -> 0x00f2 }
            r1.<init>(r0)     // Catch:{ IllegalStateException -> 0x00f2 }
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ IllegalStateException -> 0x00f2 }
            r1.A0C(r2, r0)     // Catch:{ IllegalStateException -> 0x00f2 }
            r1.A00(r3)     // Catch:{ IllegalStateException -> 0x00f2 }
            return r5
        L_0x00f2:
            r1 = move-exception
            java.lang.String r0 = "settings-gdrive/perform-backup"
            com.whatsapp.util.Log.e(r0, r1)
            r6.A7J()
            return r3
        L_0x00fc:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "settings-gdrive/perform-backup/unknown-network-type/"
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r2)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.SettingsGoogleDrive.A7k():boolean");
    }

    public void BR8(int i) {
        String str;
        switch (i) {
            case 12:
                str = "settings-gdrive/cancel-media-restore-dialog/user-decided-not-to-cancel";
                break;
            case 13:
                str = "settings-gdrive/perform-backup user declined to perform Google Drive backup over cellular (when the settings say Wi-Fi only)";
                break;
            case 15:
                str = "settings-gdrive/user-declined-to-restore-media-over-cellular";
                break;
            case 16:
                str = "settings-gdrive/user-declined-to-backup-over-cellular";
                break;
            case 18:
                str = "settings-gdrive/user-declined-to-cancel-encrypted-backup";
                break;
            default:
                throw AnonymousClass00M.A02(i);
        }
        Log.i(str);
    }

    public void BR9(int i) {
        throw AnonymousClass00M.A02(i);
    }

    public void BRA(int i) {
        switch (i) {
            case 12:
                this.A0Z.A09();
                return;
            case 13:
                Log.i("settings-gdrive/perform-backup user decided to perform Google Drive backup over cellular (when the settings say Wi-Fi only)");
                this.A0Y.A0A();
                A7J();
                return;
            case 14:
                Log.i("settings-gdrive/google-play-services-is-broken");
                this.A0c.A0x(0);
                return;
            case 15:
                Log.i("settings-gdrive/user-confirmed-media-restore-over-cellular");
                this.A0Y.A0C();
                return;
            case 16:
                Log.i("settings-gdrive/user-confirmed-backup-over-cellular");
                this.A0Y.A0A();
                return;
            case 18:
                Log.i("settings-gdrive/user-confirmed-cancel-encrypted-backup");
                A77();
                return;
            default:
                throw AnonymousClass00M.A02(i);
        }
    }

    public void BRI(int i) {
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("settings-gdrive/dialogId-");
        A0o2.append(i);
        Log.i(AnonymousClass000.A0X("-dismissed", A0o2));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("settings-gdrive/activity-result request: ");
        A0o2.append(i);
        Log.i(AnonymousClass000.A0Y(" result: ", A0o2, i2));
        super.onActivityResult(i, i2, intent);
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    String str2 = null;
                    if (intent != null) {
                        str = intent.getStringExtra("authAccount");
                    } else {
                        str = null;
                    }
                    if (i2 == -1) {
                        str2 = str;
                    }
                    A7h(str2);
                } else if (i != 150) {
                    if (i == 151 && i2 == -1) {
                        if (this.A09.A07() == 23) {
                            this.A0Z.A0C(10);
                        }
                        if (C06540Yd.A0K(this.A09) || C06540Yd.A0J(this.A09)) {
                            this.A0Y.A0O();
                        } else {
                            A7B();
                        }
                    }
                } else if (i2 == -1) {
                    A7H();
                }
            } else if (i2 == -1) {
                C626936e.A06(intent);
                A7i(intent.getStringExtra("authtoken"), intent.getStringExtra("authAccount"));
            } else {
                AnonymousClass00M.A08(this);
            }
        } else if (i2 == -1) {
            A78();
        }
    }

    public void onBackPressed() {
        if (isTaskRoot()) {
            startActivity(C627736r.A03(this));
        }
        finish();
    }

    public void onCreate(Bundle bundle) {
        Intent intent;
        super.onCreate(bundle);
        this.A0c = (SettingsGoogleDriveViewModel) new AnonymousClass0XL(this).A01(SettingsGoogleDriveViewModel.class);
        this.A0e = new C10280hg(this);
        A79();
        C06270Wx.A02(this, this.A0c.A0T(), 24);
        C06270Wx.A02(this, this.A0c.A0Z(), 34);
        C06270Wx.A02(this, this.A0c.A0U(), 35);
        C06270Wx.A02(this, this.A0c.A0S(), 25);
        C06270Wx.A02(this, this.A0c.A0F(), 26);
        C06270Wx.A02(this, this.A0c.A0H(), 27);
        C06270Wx.A02(this, this.A0c.A0X(), 28);
        C06270Wx.A02(this, this.A0c.A0V(), 29);
        C06270Wx.A02(this, this.A0c.A0W(), 30);
        C06270Wx.A02(this, this.A0c.A0M(), 31);
        C06270Wx.A02(this, this.A0c.A0Y(), 32);
        C06270Wx.A02(this, this.A0c.A0O(), 33);
        C06270Wx.A02(this, this.A0c.A0J(), 36);
        C06270Wx.A02(this, this.A0c.A0K(), 37);
        C06270Wx.A02(this, this.A0c.A0I(), 38);
        C06270Wx.A02(this, this.A0c.A0L(), 39);
        C06270Wx.A02(this, this.A0c.A0Q(), 40);
        C06270Wx.A02(this, this.A0c.A0R(), 41);
        C06270Wx.A02(this, this.A0c.A0P(), 42);
        C06270Wx.A02(this, this.A0c.A0N(), 43);
        this.A0O.setChecked(AnonymousClass000.A1U(this.A09.A06(), 1));
        this.A0H.setText(A74());
        A7G();
        this.A0c.A0e();
        this.A03 = new C17760wC(this, 23);
        this.A00 = new C17760wC(this, 24);
        this.A01 = new C17760wC(this, 25);
        C17760wC.A00(this.A0A, this, 26);
        C17760wC r4 = new C17760wC(this, 27);
        this.A0B.setOnClickListener(this.A00);
        C17760wC.A00(this.A0C, this, 28);
        this.A04.setOnClickListener(r4);
        this.A0c.A0b();
        this.A09.setOnClickListener(r4);
        this.A07.setOnClickListener(r4);
        this.A08.setOnClickListener(r4);
        C06270Wx.A02(this, this.A0c.A0G(), 23);
        bindService(new C627736r().A1J(this), this.A0c.A0E(), 1);
        if (!AnonymousClass0YV.A0F(this.A0g.A06())) {
            Log.i("settings-gdrive/create google drive access not allowed.");
            finish();
        }
        if (!((bundle != null && bundle.getBoolean("intent_already_parsed", false)) || (intent = getIntent()) == null || intent.getAction() == null)) {
            onNewIntent(intent);
        }
        this.A0l.A02(getContentView(), "chat_backup", getIntent().getStringExtra("search_result_key"));
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public void onNewIntent(Intent intent) {
        C56282rj r1;
        int i;
        super.onNewIntent(intent);
        String action = intent.getAction();
        Log.i(AnonymousClass000.A0V("settings-gdrive/new-intent/action/", action, AnonymousClass001.A0o()));
        if (action != null) {
            String str = "action_perform_backup_over_cellular";
            if (!action.equals(str)) {
                str = "action_perform_media_restore_over_cellular";
                if (!action.equals(str)) {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("settings-gdrive/new-intent/unexpected-action/");
                    Log.e(AnonymousClass000.A0X(intent.getAction(), A0o2));
                    return;
                }
                r1 = new C56282rj(15);
                i = R.string.f11nameremoved;
            } else {
                r1 = new C56282rj(16);
                i = R.string.f11nameremoved;
            }
            r1.A02(getString(i));
            r1.A07(false);
            r1.A05(getString(R.string.f11nameremoved));
            r1.A03(getString(R.string.f11nameremoved));
            AnonymousClass00M.A07(r1.A00(), this, str);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        onBackPressed();
        return true;
    }

    public void onResume() {
        super.onResume();
        this.A0f.A04(this.A0e);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("intent_already_parsed", true);
    }
}
