package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Dialog;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.backup.google.BaseNewUserSetupActivity$AuthRequestDialogFragment;
import com.whatsapp.backup.google.SingleChoiceListDialogFragment;
import com.whatsapp.backup.google.viewmodel.GoogleDriveNewUserSetupViewModel;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0E2  reason: invalid class name */
public abstract class AnonymousClass0E2 extends AnonymousClass0DA implements C16840u3, AnonymousClass4EE {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public ImageView A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public SwitchCompat A0A;
    public SwitchCompat A0B;
    public WaTextView A0C;
    public WaTextView A0D;
    public AnonymousClass0WN A0E;
    public C10240hc A0F;
    public C06260Ww A0G;
    public C10230hb A0H;
    public GoogleDriveNewUserSetupViewModel A0I;
    public C44772Xk A0J;
    public C54292oU A0K;
    public AnonymousClass5ZR A0L;
    public C34171uL A0M;
    public C183538qC A0N;
    public boolean A0O;
    public String[] A0P;
    public final ServiceConnection A0Q = new AnonymousClass0Z3(this);
    public final ConditionVariable A0R = new ConditionVariable(false);
    public final ConditionVariable A0S = new ConditionVariable(false);
    public final AtomicBoolean A0T = new AtomicBoolean();
    public volatile boolean A0U;

    public static final int A0c(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = GoogleDriveNewUserSetupViewModel.A07;
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

    public abstract int A74();

    public final void A7A() {
        this.A04.BkM(new C12780m7(AccountManager.get(this).addAccount("com.google", (String) null, (String[]) null, (Bundle) null, this, (AccountManagerCallback) null, (Handler) null), new BaseNewUserSetupActivity$AuthRequestDialogFragment(), this));
    }

    public void onDestroy() {
        this.A0O = true;
        this.A0T.set(false);
        unbindService(this.A0Q);
        super.onDestroy();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A0g() {
        Log.i("settings-gdrive/gps-unavailable-and-user-declined-install");
        this.A0S.open();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A0i() {
        this.A0R.block();
        if (C06520Ya.A0F(this.A09) || this.A09.A07() == 12) {
            this.A0G.A0C(10);
            if (!C06540Yd.A0K(this.A09)) {
                A7B();
                return;
            }
        }
        this.A0F.A0N();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A0j(AccountManagerFuture accountManagerFuture, BaseNewUserSetupActivity$AuthRequestDialogFragment baseNewUserSetupActivity$AuthRequestDialogFragment) {
        try {
            Log.i("settings-gdrive/show-accounts/waiting-for-add-account-activity-to-return");
            BaseBundle baseBundle = (BaseBundle) accountManagerFuture.getResult();
            if (!baseBundle.containsKey("authAccount")) {
                Log.e("settings-gdrive/error-during-add-account/account-manager-returned-with-no-account-name");
            } else {
                A7E(baseNewUserSetupActivity$AuthRequestDialogFragment, String.valueOf(baseBundle.get("authAccount")));
            }
        } catch (OperationCanceledException e) {
            Log.i("settings-gdrive/user-canceled-add-account-operation", e);
        } catch (AuthenticatorException | IOException e2) {
            Log.e("settings-gdrive/error-during-add-account", e2);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A0l(View view) {
        if (view == this.A00) {
            A76();
        } else if (view == this.A05) {
            Log.i("settings-gdrive/toggle-network-pref");
            this.A04.BkM(new C12220lC(this, this.A0B.isChecked() ? 1 : 0));
        } else if (view == this.A03) {
            Log.i("settings-gdrive/show-freq-pref");
            SingleChoiceListDialogFragment singleChoiceListDialogFragment = new SingleChoiceListDialogFragment();
            Bundle A082 = AnonymousClass002.A08();
            A082.putInt("dialog_id", 10);
            A082.putString("title", getString(R.string.f11nameremoved));
            A082.putStringArray("items", this.A0P);
            A082.putInt("selected_item_index", A0c(this.A09.A05()));
            singleChoiceListDialogFragment.A0u(A082);
            if (!A7H()) {
                AnonymousClass00M.A06(singleChoiceListDialogFragment, this);
            }
        } else if (view != this.A04) {
            throw AnonymousClass001.A0c("Can't handle the click event for the pref view");
        } else if (C06540Yd.A0J(this.A09)) {
            Bot(R.string.f11nameremoved);
        } else {
            if (C06540Yd.A0K(this.A09)) {
                Bot(R.string.f11nameremoved);
            } else {
                this.A0A.toggle();
            }
            this.A0I.A0E(this.A0A.isChecked());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A0u(BaseNewUserSetupActivity$AuthRequestDialogFragment baseNewUserSetupActivity$AuthRequestDialogFragment, String str) {
        C69263Wi r1;
        Runnable runnable;
        try {
            Log.i(AnonymousClass0YV.A0B("settings-gdrive/auth-request asking GoogleAuthUtil for token for ", str, AnonymousClass001.A0o()));
            String A032 = C162297re.A03(new Account(str, "com.google"), this);
            StringBuilder A0o = AnonymousClass001.A0o();
            AnonymousClass0YV.A0E("settings-gdrive/auth-request for account ", str, A0o);
            Log.i(AnonymousClass000.A0X(", token has been received.", A0o));
            if (!this.A0U) {
                this.A05.A0S(new C12800m9(this, A032, str));
            } else {
                Log.i(AnonymousClass0YV.A0B("settings-gdrive/auth-request/received-token-but-user-cancelled-the-request/", str, AnonymousClass001.A0o()));
            }
            this.A0S.open();
        } catch (C126936Px e) {
            if (this.A0U) {
                this.A0S.open();
            } else {
                this.A05.A0S(new C12230lD(baseNewUserSetupActivity$AuthRequestDialogFragment, this));
            }
            Log.e("settings-gdrive/gps-unavailable", e);
        } catch (UserRecoverableAuthException e2) {
            boolean z = this.A0U;
            ConditionVariable conditionVariable = this.A0S;
            if (z) {
                conditionVariable.open();
                return;
            }
            conditionVariable.close();
            r1 = this.A05;
            runnable = new C12240lE(e2, this);
            r1.A0S(runnable);
        } catch (IOException e3) {
            Log.e("settings-gdrive/auth-request", e3);
            this.A0S.open();
            if (!this.A0U) {
                this.A05.A0S(new C11400ja(this));
                return;
            }
            Log.i("settings-gdrive/auth-request/user-cancelled");
        } catch (C143906zf | SecurityException e4) {
            Log.e("settings-gdrive/auth-request", e4);
            this.A0S.open();
            if (!this.A0U) {
                r1 = this.A05;
                runnable = new C12250lF(this, str);
                r1.A0S(runnable);
            }
            Log.i("settings-gdrive/auth-request/user-cancelled");
        }
    }

    public static /* synthetic */ void A14(AnonymousClass0E2 r0, String str) {
        if (str == null) {
            r0.A07.setText(R.string.f11nameremoved);
        } else {
            r0.A07.setText(str);
        }
    }

    public void A75() {
        this.A0I.A0F(0);
    }

    public final void A77() {
        Log.i("settings-gdrive/cancel-backup");
        this.A06.setVisibility(8);
        this.A0G.A09();
        if (C06540Yd.A0Q(this.A0D)) {
            try {
                for (C04610Pv r0 : (List) ((C06310Xb) this.A0M.get()).A04("com.whatsapp.backup.google.google-backup-worker").get()) {
                    if (!r0.A03.A00()) {
                        ((C06310Xb) this.A0M.get()).A0B("com.whatsapp.backup.google.google-backup-worker");
                        return;
                    }
                }
            } catch (InterruptedException | ExecutionException unused) {
                Log.e("settings-gdrive/cancel-backup couldn't get work info for BackupWorker.");
            }
        }
    }

    public final void A79() {
        int i;
        boolean A0G2 = this.A0E.A0G();
        int A052 = this.A09.A05();
        WaTextView waTextView = this.A0D;
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

    public final void A7B() {
        this.A0G.A0C(10);
        Intent A0t = C627736r.A0t(this, "action_backup");
        A0t.putExtra("backup_mode", "user_initiated");
        AnonymousClass29R.A00(this, A0t);
    }

    public final void A7D(int i) {
        String str;
        int[] iArr = GoogleDriveNewUserSetupViewModel.A07;
        int length = iArr.length;
        StringBuilder A0o = AnonymousClass001.A0o();
        if (i > length) {
            str = AnonymousClass000.A0Y("settings-gdrive/change-freq/unexpected-choice/", A0o, i);
        } else {
            A0o.append("settings-gdrive/change-freq/index:");
            A0o.append(i);
            A0o.append("/value:");
            Log.i(AnonymousClass000.A0h(A0o, iArr[i]));
            int A052 = this.A09.A05();
            int i2 = iArr[i];
            if (!this.A0I.A0F(i2)) {
                str = "settings-gdrive/change-freq failed to set the new frequency.";
            } else {
                View view = this.A01;
                if (i2 != 0) {
                    view.setVisibility(8);
                    if (A052 == 0 && !C06540Yd.A0J(this.A09) && !C06540Yd.A0K(this.A09)) {
                        this.A00.performClick();
                    }
                } else {
                    view.setVisibility(8);
                    if (this.A09.A0M() < System.currentTimeMillis() + 2592000000L) {
                        this.A09.A1F(System.currentTimeMillis() + 2592000000L);
                    }
                }
                A79();
                return;
            }
        }
        Log.e(str);
    }

    public final void A7G(String str, String str2) {
        this.A0S.open();
        AnonymousClass00M.A08(this);
        if (str != null && this.A0I.A0G(str2)) {
            Intent A0t = C627736r.A0t(this, "action_fetch_backup_info");
            A0t.putExtra("account_name", str2);
            AnonymousClass29R.A00(this, A0t);
        }
        this.A04.BkM(new C11390jZ(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0011  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bbg(java.lang.String[] r4, int r5, int r6) {
        /*
            r3 = this;
            X.33p r0 = r3.A09
            int r2 = r0.A05()
            if (r6 < 0) goto L_0x002c
            int[] r1 = com.whatsapp.backup.google.viewmodel.GoogleDriveNewUserSetupViewModel.A07
            int r0 = r1.length
            if (r6 >= r0) goto L_0x002c
            r0 = r1[r6]
        L_0x000f:
            if (r0 == 0) goto L_0x0024
            if (r2 != 0) goto L_0x001c
            X.8qC r2 = r3.A0N
            X.33p r1 = r3.A09
            android.view.View r0 = r3.A01
            X.AnonymousClass0JL.A00(r3, r0, r1, r2)
        L_0x001c:
            r0 = 10
            if (r5 != r0) goto L_0x002e
            r3.A7D(r6)
            return
        L_0x0024:
            android.view.View r1 = r3.A01
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x001c
        L_0x002c:
            r0 = r2
            goto L_0x000f
        L_0x002e:
            r0 = 17
            if (r5 != r0) goto L_0x004b
            r1 = r4[r6]
            r0 = 2131889678(0x7f120e0e, float:1.9414026E38)
            java.lang.String r0 = r3.getString(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0045
            r3.A7A()
            return
        L_0x0045:
            r0 = r4[r6]
            r3.A7F(r0)
            return
        L_0x004b:
            java.lang.IllegalStateException r0 = X.AnonymousClass00M.A02(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0E2.Bbg(java.lang.String[], int, int):void");
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

    /* access modifiers changed from: private */
    public /* synthetic */ void A0h() {
        Bot(R.string.f11nameremoved);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A0n(UserRecoverableAuthException userRecoverableAuthException) {
        BpY(userRecoverableAuthException.A00(), 1);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A0p(BaseNewUserSetupActivity$AuthRequestDialogFragment baseNewUserSetupActivity$AuthRequestDialogFragment) {
        Dialog A012 = C06540Yd.A01(this, new C17780wE(this, 1), C159787mS.A00(this), 0, true);
        if (A012 == null) {
            Log.e("settings-gdrive/gps-unavailable no way to install.");
            this.A0S.open();
        } else if (!A7H()) {
            Log.i("settings-gdrive/gps-unavailable/prompting-user-to-fix");
            baseNewUserSetupActivity$AuthRequestDialogFragment.A1L();
            A012.show();
        }
    }

    public static /* synthetic */ void A0q(BaseNewUserSetupActivity$AuthRequestDialogFragment baseNewUserSetupActivity$AuthRequestDialogFragment, AnonymousClass0E2 r3) {
        if (!r3.A7H()) {
            C08240dc r1 = new C08240dc(AnonymousClass00M.A01(r3));
            r1.A0C(baseNewUserSetupActivity$AuthRequestDialogFragment, "auth_request_dialog");
            r1.A00(true);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A16(AnonymousClass33M r6) {
        long A072 = r6.A07();
        if (A072 < 500) {
            SystemClock.sleep(500 - A072);
        }
        AnonymousClass00M.A08(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A17(String str) {
        Log.e(AnonymousClass000.A0V("settings-gdrive/auth-request unable to access ", str, AnonymousClass001.A0o()));
        Bot(R.string.f11nameremoved);
        this.A0I.A0F(0);
    }

    public void A76() {
        int i;
        C626936e.A01();
        if (!A7H()) {
            if (C06540Yd.A0J(this.A09)) {
                Log.i("settings-gdrive/account-selector/backup/running");
                i = R.string.f11nameremoved;
            } else if (C06540Yd.A0K(this.A09)) {
                Log.i("settings-gdrive/account-selector/restore/running");
                i = R.string.f11nameremoved;
            } else if (this.A0L.A02("android.permission.GET_ACCOUNTS") != 0 || !this.A0J.A00()) {
                AnonymousClass5UF A1F = C627736r.A1F(this);
                A1F.A03();
                A1F.A06(new String[]{"android.permission.GET_ACCOUNTS", "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"});
                A1F.A04();
                A1F.A05();
                BpY(A1F.A02(), 150);
                return;
            } else {
                String A0X = this.A09.A0X();
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
                        if (A0X != null && A0X.equals(str)) {
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
                A7A();
                return;
            }
            Bot(i);
        }
    }

    public final void A78() {
        setTitle(R.string.f11nameremoved);
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        C626936e.A06(supportActionBar);
        supportActionBar.A0N(true);
        this.A01 = C005205m.A00(this, R.id.backup_banner_view);
        this.A00 = findViewById(R.id.settings_gdrive_change_account_view);
        this.A07 = C005205m.A01(this, R.id.settings_gdrive_account_name_summary);
        this.A09 = C005205m.A01(this, R.id.gdrive_backup_general_info);
        this.A06 = (ImageView) findViewById(R.id.cancel_download);
        this.A03 = findViewById(R.id.settings_gdrive_change_frequency_view);
        this.A08 = (TextView) findViewById(R.id.settings_gdrive_backup_options_summary);
        this.A05 = findViewById(R.id.settings_gdrive_network_settings_view);
        this.A0B = (SwitchCompat) findViewById(R.id.gdrive_network_setting);
        this.A04 = findViewById(R.id.settings_gdrive_backup_include_video);
        this.A02 = findViewById(R.id.settings_gdrive_password_protect_backups);
        this.A0C = (WaTextView) findViewById(R.id.settings_gdrive_password_protect_backups_value);
        this.A0D = (WaTextView) findViewById(R.id.settings_gdrive_backup_encryption_info);
        this.A0A = (SwitchCompat) findViewById(R.id.include_video_setting);
        int A002 = C107405bG.A00(this, R.attr.f3nameremoved, R.color.f5nameremoved);
        C107335b8.A0E((ImageView) findViewById(R.id.last_backup_icon), A002);
        C107335b8.A0E((ImageView) findViewById(R.id.gdrive_icon), A002);
        C107335b8.A0E((ImageView) findViewById(R.id.backup_settings_icon), A002);
        int[] iArr = GoogleDriveNewUserSetupViewModel.A06;
        int length = iArr.length;
        this.A0P = new String[length];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            if (i2 == R.string.f11nameremoved) {
                String[] strArr = this.A0P;
                Object[] objArr = new Object[1];
                AnonymousClass00M.A04(this, R.string.f11nameremoved, 0, objArr);
                strArr[i] = getString(R.string.f11nameremoved, objArr);
            } else {
                AnonymousClass00M.A04(this, i2, i, this.A0P);
            }
        }
        this.A02.setOnClickListener(new AnonymousClass0w4(this, 13));
    }

    public final void A7C() {
        A79();
        boolean A0G2 = this.A0E.A0G();
        WaTextView waTextView = this.A0C;
        int i = R.string.f11nameremoved;
        if (A0G2) {
            i = R.string.f11nameremoved;
        }
        waTextView.setText(i);
    }

    public final void A7E(BaseNewUserSetupActivity$AuthRequestDialogFragment baseNewUserSetupActivity$AuthRequestDialogFragment, String str) {
        C626936e.A00();
        Log.i(AnonymousClass0YV.A0B("settings-gdrive/auth-request account being used is ", str, AnonymousClass001.A0o()));
        this.A0U = false;
        this.A05.A0S(new C12200lA(baseNewUserSetupActivity$AuthRequestDialogFragment, this));
        ConditionVariable conditionVariable = this.A0S;
        conditionVariable.close();
        this.A04.BkM(new C12770m6(baseNewUserSetupActivity$AuthRequestDialogFragment, this, str));
        Log.i("settings-gdrive/auth-request blocking on tokenReceived");
        AnonymousClass33M r2 = new AnonymousClass33M("settings-gdrive/fetch-auth-token");
        conditionVariable.block(C625635p.A0L);
        this.A05.A0S(new C12210lB(this, r2));
    }

    public final void A7F(String str) {
        Log.i(AnonymousClass0YV.A0B("setting-gdrive/activity-result/account-picker accountName is ", str, AnonymousClass001.A0o()));
        if (str != null) {
            this.A04.BkM(new C12790m8(new BaseNewUserSetupActivity$AuthRequestDialogFragment(), this, str));
        } else if (this.A09.A0X() == null) {
            Log.i("setting-gdrive/activity-result/account-picker accountName is null");
            A75();
        }
    }

    public final boolean A7H() {
        if (C621433s.A03(this) || this.A0O) {
            return true;
        }
        return false;
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
                this.A0G.A09();
                return;
            case 13:
                Log.i("settings-gdrive/perform-backup user decided to perform Google Drive backup over cellular (when the settings say Wi-Fi only)");
                this.A0F.A0A();
                A7B();
                return;
            case 14:
                Log.i("settings-gdrive/google-play-services-is-broken");
                this.A0I.A0F(0);
                return;
            case 15:
                Log.i("settings-gdrive/user-confirmed-media-restore-over-cellular");
                this.A0F.A0C();
                return;
            case 16:
                Log.i("settings-gdrive/user-confirmed-backup-over-cellular");
                this.A0F.A0A();
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
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("settings-gdrive/dialogId-");
        A0o.append(i);
        Log.i(AnonymousClass000.A0X("-dismissed", A0o));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("settings-gdrive/activity-result request: ");
        A0o.append(i);
        Log.i(AnonymousClass000.A0Y(" result: ", A0o, i2));
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
                    A7F(str2);
                } else if (i == 150 && i2 == -1) {
                    A76();
                }
            } else if (i2 == -1) {
                C626936e.A06(intent);
                A7G(intent.getStringExtra("authtoken"), intent.getStringExtra("authAccount"));
            } else {
                AnonymousClass00M.A08(this);
            }
        } else if (i2 == -1) {
            A7C();
        }
    }

    public void onCreate(Bundle bundle) {
        Intent intent;
        super.onCreate(bundle);
        this.A0I = (GoogleDriveNewUserSetupViewModel) new AnonymousClass0XL(this).A01(GoogleDriveNewUserSetupViewModel.class);
        A78();
        C06270Wx.A02(this, this.A0I.A02, 17);
        C06270Wx.A02(this, this.A0I.A00, 18);
        C06270Wx.A02(this, this.A0I.A01, 16);
        this.A09.setText(A74());
        A7C();
        C17760wC r1 = new C17760wC(this, 10);
        this.A00.setOnClickListener(r1);
        this.A05.setOnClickListener(r1);
        this.A03.setOnClickListener(r1);
        this.A04.setOnClickListener(r1);
        bindService(new C627736r().A1J(this), this.A0Q, 1);
        if (!AnonymousClass0YV.A0F(this.A0K.A06())) {
            Log.i("settings-gdrive/create google drive access not allowed.");
            finish();
        }
        if ((bundle == null || !bundle.getBoolean("intent_already_parsed", false)) && (intent = getIntent()) != null && intent.getAction() != null) {
            onNewIntent(intent);
        }
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
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("settings-gdrive/new-intent/unexpected-action/");
                    Log.e(AnonymousClass000.A0X(intent.getAction(), A0o));
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

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("intent_already_parsed", true);
    }
}
