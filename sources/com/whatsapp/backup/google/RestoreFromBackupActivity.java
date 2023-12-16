package com.whatsapp.backup.google;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass00M;
import X.AnonymousClass02D;
import X.AnonymousClass08M;
import X.AnonymousClass0D9;
import X.AnonymousClass0ED;
import X.AnonymousClass0F4;
import X.AnonymousClass0QJ;
import X.AnonymousClass0QR;
import X.AnonymousClass0R8;
import X.AnonymousClass0S8;
import X.AnonymousClass0U8;
import X.AnonymousClass0UH;
import X.AnonymousClass0WN;
import X.AnonymousClass0X8;
import X.AnonymousClass0XL;
import X.AnonymousClass0Y8;
import X.AnonymousClass0YV;
import X.AnonymousClass0Z4;
import X.AnonymousClass0w3;
import X.AnonymousClass1VW;
import X.AnonymousClass1VX;
import X.AnonymousClass1WE;
import X.AnonymousClass29R;
import X.AnonymousClass306;
import X.AnonymousClass310;
import X.AnonymousClass317;
import X.AnonymousClass33p;
import X.AnonymousClass34K;
import X.AnonymousClass35V;
import X.AnonymousClass36P;
import X.AnonymousClass36l;
import X.AnonymousClass3DM;
import X.AnonymousClass3FI;
import X.AnonymousClass4EE;
import X.AnonymousClass4FS;
import X.AnonymousClass4FV;
import X.AnonymousClass5VS;
import X.AnonymousClass5Z5;
import X.AnonymousClass5ZR;
import X.C005205m;
import X.C04710Qi;
import X.C06260Ww;
import X.C06270Wx;
import X.C06320Xc;
import X.C06390Xm;
import X.C06520Ya;
import X.C06540Yd;
import X.C07020aC;
import X.C08240dc;
import X.C08310eF;
import X.C10240hc;
import X.C107035aa;
import X.C107385bE;
import X.C107405bG;
import X.C107565bW;
import X.C107635bd;
import X.C111095hX;
import X.C11540jo;
import X.C11550jp;
import X.C11560jq;
import X.C11570jr;
import X.C11580js;
import X.C11590jt;
import X.C11600ju;
import X.C11610jv;
import X.C11620jw;
import X.C116985rC;
import X.C12280lI;
import X.C12290lJ;
import X.C12300lK;
import X.C12310lL;
import X.C12320lM;
import X.C12330lN;
import X.C12340lO;
import X.C126936Px;
import X.C12810mA;
import X.C12820mB;
import X.C13020mV;
import X.C143906zf;
import X.C159787mS;
import X.C162297re;
import X.C16840u3;
import X.C17110ua;
import X.C17760wC;
import X.C17780wE;
import X.C183538qC;
import X.C44772Xk;
import X.C47322d4;
import X.C48602fA;
import X.C50102hd;
import X.C50152hi;
import X.C50382i5;
import X.C53602nM;
import X.C54292oU;
import X.C55092pm;
import X.C55682qk;
import X.C56282rj;
import X.C56492s4;
import X.C56502s5;
import X.C59852xb;
import X.C60152y5;
import X.C61072zf;
import X.C614930z;
import X.C615631i;
import X.C621433s;
import X.C625835r;
import X.C626936e;
import X.C627736r;
import X.C64393Dh;
import X.C66543Lv;
import X.C69263Wi;
import X.C72303dV;
import X.C72333dY;
import X.C88944b3;
import X.C95814uZ;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Dialog;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.backup.google.viewmodel.RestoreFromBackupViewModel;
import com.whatsapp.dialogs.PromptDialogFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public final class RestoreFromBackupActivity extends AnonymousClass0D9 implements C16840u3, AnonymousClass4EE {
    public int A00;
    public long A01;
    public long A02;
    public View A03;
    public Button A04;
    public ProgressBar A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public C116985rC A09;
    public C56492s4 A0A;
    public C50382i5 A0B;
    public C614930z A0C;
    public AnonymousClass0U8 A0D;
    public AnonymousClass0WN A0E;
    public AnonymousClass0F4 A0F;
    public AnonymousClass0UH A0G;
    public C10240hc A0H;
    public C06260Ww A0I;
    public AnonymousClass0QJ A0J;
    public GoogleDriveRestoreAnimationView A0K;
    public AnonymousClass0QR A0L;
    public RestoreFromBackupViewModel A0M;
    public C44772Xk A0N;
    public C53602nM A0O;
    public C54292oU A0P;
    public AnonymousClass5ZR A0Q;
    public AnonymousClass3DM A0R;
    public C66543Lv A0S;
    public C625835r A0T;
    public C59852xb A0U;
    public C72303dV A0V;
    public C47322d4 A0W;
    public C48602fA A0X;
    public C50102hd A0Y;
    public AnonymousClass1VW A0Z;
    public AnonymousClass4FV A0a;
    public C60152y5 A0b;
    public C50152hi A0c;
    public AnonymousClass317 A0d;
    public C55092pm A0e;
    public C56502s5 A0f;
    public AnonymousClass306 A0g;
    public AnonymousClass3FI A0h;
    public String A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public final ServiceConnection A0m = new AnonymousClass0Z4(this);
    public final ConditionVariable A0n = new ConditionVariable(false);
    public final ConditionVariable A0o = new ConditionVariable(false);
    public final ConditionVariable A0p = new ConditionVariable(false);
    public final C17110ua A0q = new AnonymousClass0ED(this);
    public final C04710Qi A0r = new AnonymousClass0w3(this, 3);
    public final List A0s = AnonymousClass001.A0s();
    public final Set A0t = Collections.newSetFromMap(new ConcurrentHashMap());
    public final AtomicBoolean A0u = new AtomicBoolean(false);
    public final AtomicBoolean A0v = new AtomicBoolean(false);
    public final AtomicBoolean A0w = new AtomicBoolean();
    public final AtomicBoolean A0x = new AtomicBoolean(true);

    public RestoreFromBackupActivity() {
        super(true, false);
    }

    public static /* synthetic */ void A1P(RestoreFromBackupActivity restoreFromBackupActivity, String str) {
        if (restoreFromBackupActivity.A84(str, 1)) {
            restoreFromBackupActivity.A7e();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A1Z(String str) {
        String A0B2;
        for (Account account : C159787mS.A02(this.A0P.A06())) {
            if (TextUtils.equals(account.name, str)) {
                A84(str, 1);
                return;
            }
        }
        try {
            String string = AccountManager.get(this).addAccount("com.google", (String) null, (String[]) null, (Bundle) null, this, (AccountManagerCallback) null, (Handler) null).getResult().getString("authAccount");
            if (string == null) {
                A0B2 = "restore>RestoreFromBackupActivity/error-during-msgstore-download/account-manager-returned-with-no-account-name";
            } else if (!string.equals(str)) {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                AnonymousClass0YV.A0E("restore>RestoreFromBackupActivity/error-during-msgstore-download/account-manager user added ", string, A0o2);
                A0B2 = AnonymousClass0YV.A0B(" instead of ", str, A0o2);
            } else {
                this.A05.A0S(new C11570jr(this));
                A84(str, 1);
                return;
            }
            Log.e(A0B2);
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            Log.e("restore>RestoreFromBackupActivity/error-during-msgstore-download", e);
        }
    }

    public final AnonymousClass0F4 A7B(Account[] accountArr) {
        C69263Wi r1 = this.A05;
        C54292oU r6 = this.A0P;
        AnonymousClass310 r5 = this.A05;
        AnonymousClass1VW r9 = this.A0Z;
        Set set = this.A0t;
        AtomicBoolean atomicBoolean = this.A0x;
        C625835r r8 = this.A0T;
        AnonymousClass33p r7 = this.A09;
        C06320Xc A7C = A7C();
        AtomicBoolean atomicBoolean2 = this.A0v;
        return new AnonymousClass0F4(r1, this.A0H, this, A7C, r5, r6, r7, r8, r9, set, atomicBoolean, atomicBoolean2, accountArr);
    }

    public final String A7E(Set set) {
        int i;
        Object[] objArr;
        String[] strArr = (String[]) set.toArray(new String[0]);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("restore>RestoreFromBackupActivity/get-jid-mismatch-message for ");
        Log.i(AnonymousClass000.A0X(Arrays.toString(strArr), A0o2));
        int length = strArr.length;
        if (length == 0) {
            return getString(R.string.f11nameremoved);
        }
        if (length == 1) {
            i = R.string.f11nameremoved;
            objArr = new Object[]{AnonymousClass36P.A08(this.A09.A0a()), strArr[0]};
        } else {
            Arrays.sort(strArr);
            int i2 = length - 1;
            String[] strArr2 = new String[i2];
            String str = strArr[i2];
            System.arraycopy(strArr, 0, strArr2, 0, i2);
            i = R.string.f11nameremoved;
            objArr = new Object[]{AnonymousClass36P.A08(this.A09.A0a()), AnonymousClass5VS.A01(this.A00, strArr2), str};
        }
        return getString(i, objArr);
    }

    public void A7G() {
        A7f(2);
        startActivityForResult(C627736r.A09(this, 2), 0);
    }

    public final void A7U() {
        A1Y(this.A0T, 4);
        A7a();
        A78(false);
    }

    public final void A7g(int i) {
        boolean A082 = this.A0Q.A08();
        int i2 = R.string.f11nameremoved;
        if (A082) {
            i2 = R.string.f11nameremoved;
        }
        RequestPermissionActivity.A0o(this, "google_backup", new int[]{R.drawable.vec_ic_baseline_cloud_upload_48}, i, R.string.f11nameremoved, i2, R.string.f11nameremoved, this.A0Q.A0H(), !this.A0N.A00());
    }

    public void A7m(Bundle bundle) {
        Bundle bundle2;
        if (bundle == null) {
            A7Z();
        } else {
            A7R();
        }
        AnonymousClass36l.A0K(getContentView(), this, this.A00, R.id.title_toolbar, false, false, this.A0C.A0B(false));
        if (this.A0M.A00 == 24 && !this.A0H.A0h()) {
            Log.i("restore>RestoreFromBackupActivity/update-state/it looks like restoring from gdrive has been completed but we missed it, let's try again");
            A7q(this.A0U, 22);
        }
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = bundle.getBundle("restore_account_data");
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("restore>RestoreFromBackupActivity/update-state/");
        Log.i(AnonymousClass000.A0X(A0g(this.A0M.A00), A0o2));
        int i = this.A0M.A00;
        switch (i) {
            case 21:
                Intent intent = getIntent();
                if (intent.getAction() == null) {
                    Log.e("restore>RestoreFromBackupActivity/update-state/new state but no action provided. Finishing.");
                    finish();
                    return;
                }
                onNewIntent(intent);
                return;
            case 22:
                if (bundle2 != null) {
                    this.A0G = AnonymousClass0UH.A00(bundle2);
                    A7q((C59852xb) null, 22);
                    A7o(this.A0G);
                    this.A04.BkM(new C12310lL(bundle, this));
                    return;
                }
                throw AnonymousClass001.A0e("restore_account_data cannot be null");
            case 23:
                A7q((C59852xb) null, 23);
                A7I();
                return;
            case 24:
                if (bundle2 != null) {
                    this.A0G = AnonymousClass0UH.A00(bundle2);
                    A7q((C59852xb) null, 22);
                    A7o(this.A0G);
                    A7q((C59852xb) null, 24);
                    A7H();
                    if (!C06540Yd.A0L(this.A09)) {
                        Log.i("restore>RestoreFromBackupActivity/update-state/gdrive-msgstore-download-not-pending");
                        A7s(true);
                        return;
                    }
                    Log.i("restore>RestoreFromBackupActivity/update-state/gdrive-msgstore-download-pending");
                    return;
                }
                throw AnonymousClass001.A0e("restore_account_data cannot be null");
            case 25:
                if (bundle2 != null) {
                    this.A0G = AnonymousClass0UH.A00(bundle2);
                    return;
                }
                return;
            case 26:
                C59852xb r2 = this.A0U;
                if (bundle2 != null) {
                    this.A0G = AnonymousClass0UH.A00(bundle2);
                    A7q((C59852xb) null, 22);
                    A7o(this.A0G);
                } else {
                    A7q((C59852xb) null, 23);
                    A7I();
                }
                A7H();
                Log.i(AnonymousClass000.A0P(r2, "restore>RestoreFromBackupActivity/update-state/msgstore-init-status/", AnonymousClass001.A0o()));
                A77(r2);
                return;
            case 27:
                A7q((C59852xb) null, 23);
                A7I();
                A7H();
                A7s(true);
                A7q((C59852xb) null, 27);
                return;
            default:
                throw AnonymousClass001.A0e(AnonymousClass000.A0Y("Unknown state: ", AnonymousClass001.A0o(), i));
        }
    }

    public final void A7p(AnonymousClass0UH r8) {
        A7H();
        this.A04.BkM(new C13020mV(r8, this, r8.A05, r8.A00));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        AnonymousClass4FS r1;
        Runnable r0;
        if (i == 5) {
            Log.i(AnonymousClass000.A0Y("restore>RestoreFromBackupActivity/request-permissions/result/", AnonymousClass001.A0o(), i2));
        } else if (i == 6) {
            Log.i(AnonymousClass000.A0Y("restore>RestoreFromBackupActivity/request-permissions-storage-and-contact/result/", AnonymousClass001.A0o(), i2));
            A7u(false);
            return;
        } else if (i == 2) {
            Log.i(AnonymousClass000.A0Y("restore>RestoreFromBackupActivity/request-to-fix-google-play-services/result/", AnonymousClass001.A0o(), i2));
            A7t(false);
            return;
        } else {
            if (i == 1) {
                if (i2 == -1) {
                    C626936e.A06(intent);
                    this.A0i = intent.getStringExtra("authtoken");
                    this.A0p.open();
                    r1 = this.A04;
                    r0 = new C11580js(this);
                } else {
                    return;
                }
            } else if (i == 3) {
                if (i2 == -1) {
                    C626936e.A06(intent);
                    C626936e.A06(intent.getExtras());
                    String string = intent.getExtras().getString("authAccount");
                    Log.d(AnonymousClass0YV.A0B("restore>RestoreFromBackupActivity/activity-result/account-picker/accountName is ", string, AnonymousClass001.A0o()));
                    if (string == null) {
                        Log.e("restore>RestoreFromBackupActivity/activity-result/account-picker/no account was provided");
                        return;
                    } else {
                        r1 = this.A04;
                        r0 = new C12300lK(this, string);
                    }
                } else {
                    Log.e(AnonymousClass000.A0Y("restore>RestoreFromBackupActivity/activity-result/account-picker-request/", AnonymousClass001.A0o(), i2));
                    A7a();
                    A78(false);
                    return;
                }
            } else if (i == 4) {
                Log.i(AnonymousClass000.A0Y("restore>RestoreFromBackupActivity/activity-result/account-added-request/", AnonymousClass001.A0o(), i2));
                Intent className = new Intent().setClassName(getPackageName(), "com.whatsapp.backup.google.RestoreFromBackupActivity");
                className.setAction("action_show_restore_one_time_setup");
                startActivity(className);
                return;
            } else if (i == 0) {
                Log.i(AnonymousClass000.A0Y("restore>RestoreFromBackupActivity/activity-result/password-input-activity/", AnonymousClass001.A0o(), i2));
                if (i2 == -1) {
                    A7f(7);
                    if (this.A0M.A00 == 23) {
                        A7q((C59852xb) null, 27);
                        A7H();
                        A7s(true);
                        return;
                    }
                    A7p(this.A0G);
                    return;
                }
                return;
            } else if (i == 7) {
                A7v(true);
                return;
            } else if (i == 8) {
                if (this.A0Q.A0H()) {
                    A7Q();
                    return;
                }
            } else if (i == 25) {
                if (i2 == 1) {
                    this.A05.A0S(new C11600ju(this));
                    return;
                } else if (i2 == 2) {
                    startActivityForResult(C627736r.A18(this, (String) null, false, true), 26);
                    return;
                } else if (i2 == 3) {
                    A7K();
                    return;
                } else {
                    return;
                }
            } else if (i != 26) {
                super.onActivityResult(i, i2, intent);
                return;
            } else if (i2 == -1) {
                setResult(5);
                finish();
                return;
            } else if (i2 == 0 && this.A0M.A00 == 21) {
                A7c();
                setResult(1);
                return;
            } else {
                return;
            }
            r1.BkM(r0);
            return;
        }
        A7t(true);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, R.string.f11nameremoved);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        this.A0j = true;
        if (this.A0w.compareAndSet(true, false)) {
            this.A0J.A02(this.A0q);
        }
        if (this.A0k) {
            getApplicationContext().unbindService(this.A0m);
        }
        this.A0c.A00();
        super.onDestroy();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A0i() {
        this.A0S.A0O((C95814uZ) null, (UserJid) null);
        this.A0S.A0H();
        this.A0S.A0I();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A0j() {
        long A022 = this.A07.A02();
        Locale locale = Locale.ENGLISH;
        Object[] A0M2 = AnonymousClass002.A0M();
        AnonymousClass000.A1P(A0M2, 15, 0);
        AnonymousClass000.A1Q(A0M2, 1, A022);
        Log.i(String.format(locale, "restore>RestoreFromBackupActivity/display-msgstore-download-error/%d free space:%d", A0M2));
        if (A022 > 0) {
            this.A0I.A0C(10);
            A7e();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A0k() {
        startActivity(new Intent("android.intent.action.VIEW", AnonymousClass5Z5.A00(this.A0B)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A0l() {
        Log.i("restore>RestoreFromBackupActivity/show-skip-gdrive-restore-dialog/user clicked skip restore, showing confirm skip dialog");
        A7h(11);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A0m() {
        Log.i("restore>RestoreFromBackupActivity/google-play-services-unavailable/user declined to install Google Play Services.");
        this.A0p.open();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A0n() {
        Dialog A012 = C06540Yd.A01(this, new C17780wE(this, 4), C159787mS.A00(this.A0P.A06()), 0, true);
        if (A012 == null) {
            Log.e("restore>RestoreFromBackupActivity/google-play-services-unavailable/ no way to install.");
        } else if (!A80()) {
            Log.i("restore>RestoreFromBackupActivity/google-play-services-unavailable/prompting-user-to-fix");
            A012.show();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A0p() {
        this.A0n.block();
        if (C06520Ya.A0F(this.A09) || this.A09.A07() == 12) {
            this.A0I.A0C(10);
            A7e();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A0q() {
        Log.w("restore>RestoreFromBackupActivity/google-play-services-error-dialog/user declined to install Google Play Services.");
        A7u(true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A0r() {
        Log.i("restore>RestoreFromBackupActivity/show-restore-ui-for-google-backup/user clicked skip restore, showing confirm skip dialog");
        A7h(11);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A0s() {
        Log.i("restore>RestoreFromBackupActivity/show-restore-ui-for-local-backup/user clicked skip restore, showing confirm skip dialog");
        A7h(10);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A0t(AccountManagerFuture accountManagerFuture) {
        try {
            BaseBundle baseBundle = (BaseBundle) accountManagerFuture.getResult();
            if (!baseBundle.containsKey("authAccount")) {
                Log.e("restore>RestoreFromBackupActivity/error-during-add-account/account-manager-returned-with-no-account-name");
            } else {
                A84(String.valueOf(baseBundle.get("authAccount")), 4);
            }
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            Log.e("restore>RestoreFromBackupActivity/error-during-add-account", e);
            this.A05.A0S(new C11590jt(this));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A10(AnonymousClass0UH r4, String str, long j) {
        this.A0n.block();
        A7q((C59852xb) null, 24);
        this.A09.A1S(str);
        if (j > 0) {
            this.A09.A1d(str, j);
        }
        Set A022 = r4.A02();
        if (!A022.isEmpty()) {
            Log.i("restore>RestoreFromBackupActivity/create-media-placeholders/before message restore");
            this.A0M.A0F(A022);
        }
        A7e();
    }

    public static /* synthetic */ void A11(RestoreFromBackupActivity restoreFromBackupActivity) {
        if (restoreFromBackupActivity.A0K == null) {
            restoreFromBackupActivity.A0K = (GoogleDriveRestoreAnimationView) restoreFromBackupActivity.findViewById(R.id.google_drive_restore_animation_view);
        }
        C005205m.A00(restoreFromBackupActivity, R.id.google_drive_backup_error_info_view).setVisibility(8);
        AnonymousClass00M.A03(restoreFromBackupActivity, R.id.restore_actions_view, 8);
        restoreFromBackupActivity.A0K.setVisibility(0);
        restoreFromBackupActivity.A05.setVisibility(0);
        restoreFromBackupActivity.A08.setVisibility(0);
        restoreFromBackupActivity.A0K.A05();
        restoreFromBackupActivity.A08.setText(R.string.f11nameremoved);
    }

    public static /* synthetic */ void A14(RestoreFromBackupActivity restoreFromBackupActivity) {
        restoreFromBackupActivity.A0I.A0C(10);
        restoreFromBackupActivity.A7e();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A1a(String str) {
        this.A04.BkM(new C12320lM(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A1b(String str) {
        this.A04.BkM(new C12280lI(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A1d(String str, int i) {
        C69263Wi r2;
        Runnable runnable;
        try {
            Log.i(AnonymousClass0YV.A0B("restore>RestoreFromBackupActivity/auth-request/asking GoogleAuthUtil for token for ", str, AnonymousClass001.A0o()));
            this.A0i = C162297re.A03(new Account(str, "com.google"), this);
            StringBuilder A0o2 = AnonymousClass001.A0o();
            AnonymousClass0YV.A0E("restore>RestoreFromBackupActivity/auth-request/for account ", str, A0o2);
            Log.i(AnonymousClass000.A0X(", token has been received.", A0o2));
            Intent intent = new Intent();
            intent.putExtra("authtoken", this.A0i);
            intent.putExtra("authAccount", str);
            onActivityResult(i, -1, intent);
            this.A0p.open();
        } catch (C126936Px e) {
            this.A05.A0S(new C11610jv(this));
            Log.e("restore>RestoreFromBackupActivity/google-play-services-unavailable", e);
            this.A0i = null;
        } catch (UserRecoverableAuthException e2) {
            this.A0p.close();
            this.A0i = null;
            A7q((C59852xb) null, 25);
            r2 = this.A05;
            runnable = new C12820mB(e2, this, i);
            r2.A0S(runnable);
        } catch (IOException e3) {
            Log.e("restore>RestoreFromBackupActivity/auth-request", e3);
            this.A0i = null;
            this.A0p.open();
            r2 = this.A05;
            runnable = new C11620jw(this);
            r2.A0S(runnable);
        } catch (C143906zf | SecurityException e4) {
            Log.e("restore>RestoreFromBackupActivity/auth-request", e4);
            this.A0i = null;
            this.A0p.open();
            r2 = this.A05;
            runnable = new C12330lN(this, str);
            r2.A0S(runnable);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A1e(boolean z, boolean z2) {
        String str;
        String str2;
        C56502s5 r2 = this.A0f;
        if (z) {
            str = "restore_successful";
        } else {
            str = "restore_unsuccessful";
        }
        r2.A04(str, "next");
        if (!z2) {
            C06540Yd.A0C(this.A09);
            this.A09.A0f();
            str2 = "restore>RestoreFromBackupActivity/msgstore-download-finish/no media to restore, setting result of Google Drive activity to BACKUP_FOUND_AND_RESTORED.";
        } else if (this.A07.A08(true) != 1) {
            Log.i("restore>RestoreFromBackupActivity/msgstore-download-finish/Wi-Fi not available, show dialog to restore on cellular.");
            C56282rj r1 = new C56282rj(12);
            r1.A02(getString(R.string.f11nameremoved));
            r1.A07(false);
            r1.A05(getString(R.string.f11nameremoved));
            r1.A03(getString(R.string.f11nameremoved));
            r1.A00().A1O(AnonymousClass00M.A01(this), (String) null);
            return;
        } else {
            Log.i("restore>RestoreFromBackupActivity/msgstore-download-finish/Wi-Fi available, starting media restore.");
            A7d();
            str2 = "restore>RestoreFromBackupActivity/msgstore-download-finish/setting result of Google Drive activity to BACKUP_FOUND_AND_RESTORED.";
        }
        Log.i(str2);
        setResult(3);
        finish();
    }

    public C183538qC A74() {
        return C72333dY.A04(this.A0d);
    }

    public void A76(int i) {
        TextView textView;
        int i2;
        if (i - this.A00 > 0) {
            this.A00 = i;
            if (i % 10 == 0) {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("restore>RestoreFromBackupActivity/msgstore-restore-progress:");
                A0o2.append(i);
                Log.i(AnonymousClass000.A0X("%", A0o2));
            }
            if (i <= 100) {
                if (i < 80) {
                    textView = this.A08;
                    i2 = R.string.f11nameremoved;
                } else if (i < 90) {
                    textView = this.A08;
                    i2 = R.string.f11nameremoved;
                } else {
                    if (i < 100) {
                        textView = this.A08;
                        i2 = R.string.f11nameremoved;
                    }
                    this.A05.setIndeterminate(true);
                }
                AnonymousClass001.A0y(this, textView, new Object[]{this.A00.A0N().format(((double) i) / 100.0d)}, i2);
                this.A05.setIndeterminate(true);
            }
        }
    }

    public final long A79() {
        Object obj;
        long A0D2 = this.A0T.A0D();
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("restore>RestoreFromBackupActivity/lastbackup/fromfiles/set to ");
        if (A0D2 != -1) {
            obj = Long.valueOf(A0D2);
        } else {
            obj = "unknown";
        }
        Log.d(AnonymousClass000.A0R(obj, A0o2));
        return A0D2;
    }

    public final Spannable A7A(String str, String str2) {
        HashMap A0t2 = AnonymousClass001.A0t();
        A0t2.put(str2, new C88944b3(this, this.A00, this.A05, this.A08, this.A03.A00("https://faq.whatsapp.com/android/chats/how-to-restore-your-chat-history").toString()));
        return C107635bd.A02(str, A0t2);
    }

    public final C06320Xc A7C() {
        C54292oU r21 = this.A0P;
        AnonymousClass1VX r20 = this.A0D;
        C55682qk r39 = this.A03;
        AnonymousClass3FI r19 = this.A0h;
        AnonymousClass4FS r18 = this.A04;
        C64393Dh r17 = this.A04;
        C56492s4 r15 = this.A0A;
        AnonymousClass310 r13 = this.A05;
        AnonymousClass1VW r12 = this.A0Z;
        AnonymousClass0WN r11 = this.A0E;
        C48602fA r10 = this.A0X;
        C625835r r9 = this.A0T;
        AnonymousClass0QR r8 = this.A0L;
        AnonymousClass5ZR r7 = this.A0Q;
        AnonymousClass33p r6 = this.A09;
        AnonymousClass306 r5 = this.A0g;
        AnonymousClass0U8 r4 = this.A0D;
        AtomicBoolean atomicBoolean = this.A0x;
        AtomicBoolean atomicBoolean2 = this.A0u;
        C04710Qi r1 = this.A0r;
        C54292oU r27 = r21;
        C64393Dh r182 = r17;
        return new C06320Xc(r39, r182, r15, r4, r11, this, r8, r1, this.A07, r13, r27, r7, r6, r9, r10, r12, r20, r5, r19, r18, atomicBoolean, atomicBoolean2);
    }

    public final String A7D() {
        StringBuilder A0l2;
        String str;
        StringBuilder A0l3;
        String str2;
        C59852xb r0 = this.A0U;
        String str3 = "one-time-restore";
        if (r0 != null) {
            int A012 = r0.A01();
            if (A012 == 3) {
                A0l3 = AnonymousClass000.A0l(str3);
                str2 = "-jid-mismatch";
            } else if (A012 == 4) {
                A0l3 = AnonymousClass000.A0l(str3);
                str2 = "-integrity-check-failed";
            }
            str3 = AnonymousClass000.A0X(str2, A0l3);
        }
        int A002 = C159787mS.A00(this.A0P.A06());
        if (A002 == 0) {
            return str3;
        }
        if (A002 == 1) {
            A0l2 = AnonymousClass000.A0l(str3);
            str = "-no-gs";
        } else if (A002 != 2) {
            A0l2 = AnonymousClass001.A0o();
            if (A002 != 3) {
                A0l2.append(str3);
                str = "-gs-invalid";
            } else {
                A0l2.append(str3);
                str = "-gs-disabled";
            }
        } else {
            A0l2 = AnonymousClass000.A0l(str3);
            str = "-update-gs";
        }
        return AnonymousClass000.A0X(str, A0l2);
    }

    public void A7F() {
        AnonymousClass0UH r0 = this.A0G;
        if (r0 != null && r0.A03) {
            ArrayList A0s2 = AnonymousClass001.A0s();
            C06540Yd.A0I(this.A0H, this.A05.A02(), A0s2);
            try {
                if (AnonymousClass0S8.A00(this.A0Z)) {
                    A0s2.addAll(this.A0T.A0R());
                } else {
                    File A0K2 = this.A0T.A0K();
                    if (A0K2 != null) {
                        A0s2.add(A0K2);
                    }
                }
            } catch (IOException unused) {
                Log.e("restore>RestoreFromBackupActivity/after-msgstore-verified/handle-failure/unable to get last backup file for cleanup");
            }
            Iterator it = A0s2.iterator();
            while (it.hasNext()) {
                ((File) it.next()).delete();
            }
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("restore>RestoreFromBackupActivity/after-msgstore-verified/handle-failure/clean up downloaded files for");
            Log.i(AnonymousClass000.A0X(AnonymousClass0YV.A0A(this.A0G.A05), A0o2));
        }
    }

    public void A7I() {
        Log.i("restore>RestoreFromBackupActivity/show-restore-ui-for-local-backup");
        C005205m.A00(this, R.id.google_drive_looking_for_backup_view).setVisibility(8);
        C005205m.A00(this, R.id.google_drive_restore_view).setVisibility(0);
        this.A0o.open();
        setTitle(R.string.f11nameremoved);
        AnonymousClass00M.A03(this, R.id.calculating_progress_view, 8);
        AnonymousClass00M.A03(this, R.id.gdrive_restore_size_info, 8);
        AnonymousClass00M.A03(this, R.id.calculating_transfer_size_progress_bar, 8);
        String charSequence = C107565bW.A03(this.A00, A79()).toString();
        TextView A012 = C005205m.A01(this, R.id.gdrive_restore_info);
        Object[] A0L2 = AnonymousClass002.A0L();
        A0L2[0] = charSequence;
        AnonymousClass001.A0y(this, A012, A0L2, R.string.f11nameremoved);
        C06270Wx.A02(this, this.A0M.A01, 20);
        this.A0M.A0D();
        boolean A0a2 = this.A0T.A0a();
        A7y(A0a2);
        if (this.A0K == null) {
            this.A0K = (GoogleDriveRestoreAnimationView) findViewById(R.id.google_drive_restore_animation_view);
        }
        TextView A013 = C005205m.A01(this, R.id.restore_general_info);
        boolean A014 = C61072zf.A01();
        int i = R.string.f11nameremoved;
        if (A014) {
            i = R.string.f11nameremoved;
        }
        A013.setText(i);
        C17760wC.A00(C005205m.A00(this, R.id.dont_restore), this, 14);
        this.A04.setOnClickListener(new C07020aC(this, A0a2));
        A7L();
    }

    public final void A7L() {
        this.A0f.A01("backup_found");
    }

    public final void A7M() {
        this.A0f.A04("backup_found", "restore");
    }

    public final void A7R() {
        C59852xb r0;
        Log.d("restore>RestoreFromBackupActivity/loading state");
        Pair A0V2 = this.A09.A0V();
        RestoreFromBackupViewModel restoreFromBackupViewModel = this.A0M;
        int A0K2 = AnonymousClass001.A0K(A0V2.first);
        if (A0K2 == -1) {
            A0K2 = 21;
        }
        restoreFromBackupViewModel.A00 = A0K2;
        if (A0K2 == 26) {
            int A0K3 = AnonymousClass001.A0K(A0V2.second);
            if (A0K3 == -1) {
                A0K3 = 0;
            }
            r0 = C59852xb.A00(A0K3);
        } else {
            r0 = null;
        }
        this.A0U = r0;
    }

    public final void A7S() {
        String str;
        AnonymousClass0UH r1 = this.A0G;
        if (r1 == null || !r1.A03) {
            this.A0x.set(false);
            str = "restore>RestoreFromBackupActivity/after-msgstore-verified/failed/local backup is unrestorable";
        } else {
            this.A0t.add(new Account(r1.A05, "com.google"));
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("restore>RestoreFromBackupActivity/after-msgstore-verified/failed/google drive backup is unrestorable for ");
            str = AnonymousClass000.A0X(AnonymousClass0YV.A0A(this.A0G.A05), A0o2);
        }
        Log.i(str);
    }

    public final void A7X() {
        String str;
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 26) {
            z = true;
        }
        if (z) {
            str = "android.os.storage.action.MANAGE_STORAGE";
        } else {
            str = "android.settings.INTERNAL_STORAGE_SETTINGS";
        }
        startActivityForResult(new Intent(str), 7);
    }

    public final void A7Y() {
        AnonymousClass36l.A0J(this, this.A0b);
        this.A0d.A09();
        Intent A032 = C627736r.A03(this);
        A032.setFlags(268435456);
        startActivity(A032);
        this.A0R.A03("RestoreFromBackupActivity");
    }

    public final void A7Z() {
        Log.d("restore>RestoreFromBackupActivity/resetting state");
        this.A0M.A00 = 21;
        this.A0U = null;
        this.A09.A0p();
    }

    public final void A7a() {
        Log.i("restore>RestoreFromBackupActivity/skip restore");
        this.A0l = true;
        setResult(2);
    }

    public final void A7b() {
        C56282rj r1 = new C56282rj(16);
        r1.A02(getString(R.string.f11nameremoved));
        r1.A07(false);
        r1.A05(getString(R.string.f11nameremoved));
        r1.A03(getString(R.string.f11nameremoved));
        PromptDialogFragment A002 = r1.A00();
        if (!A80()) {
            C08240dc r12 = new C08240dc(AnonymousClass00M.A01(this));
            r12.A0C(A002, "one-time-setup-taking-too-long");
            r12.A00(true);
        }
    }

    public final void A7c() {
        Log.i("restore>RestoreFromBackupActivity/skip-restore-and-prepare-empty-message-store/show-new-user-settings");
        A7a();
        A78(false);
        this.A09.A1F(System.currentTimeMillis() + 604800000);
    }

    public final void A7d() {
        Log.i("restore>RestoreFromBackupActivity/start to restore media");
        AnonymousClass29R.A00(this, C627736r.A0t(this, "action_restore_media"));
    }

    public final void A7e() {
        Log.i("restore>RestoreFromBackupActivity/start to download message store");
        AnonymousClass0UH r0 = this.A0G;
        if (r0 == null || !r0.A01) {
            AnonymousClass29R.A00(this, C627736r.A0t(this, "action_restore"));
        } else {
            this.A0q.BWb(true);
        }
        this.A05.A0S(new C11540jo(this));
    }

    public final void A7f(int i) {
        AnonymousClass1WE r1 = new AnonymousClass1WE();
        r1.A00 = Integer.valueOf(i);
        this.A0a.BhD(r1);
    }

    public final void A7h(int i) {
        C56282rj r1 = new C56282rj(i);
        r1.A02(getString(R.string.f11nameremoved));
        r1.A07(true);
        r1.A05(getString(R.string.f11nameremoved));
        r1.A03(getString(R.string.f11nameremoved));
        PromptDialogFragment A002 = r1.A00();
        if (!A80()) {
            AnonymousClass00M.A06(A002, this);
        }
    }

    public final void A7j(long j) {
        this.A06.setText(C06390Xm.A03(this, this.A00, j));
    }

    public final void A7k(long j) {
        String charSequence = C107565bW.A03(this.A00, A79()).toString();
        String A042 = AnonymousClass35V.A04(this.A00, j);
        AnonymousClass001.A0y(this, C005205m.A01(this, R.id.gdrive_restore_info), new Object[]{null, charSequence, A042}, R.string.f11nameremoved);
    }

    public void A7q(C59852xb r4, int i) {
        Integer num;
        this.A0M.A00 = i;
        this.A0U = r4;
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("restore>RestoreFromBackupActivity/state ");
        A0o2.append(A0g(i));
        AnonymousClass001.A1L(A0o2);
        Object obj = r4;
        if (r4 == null) {
            obj = "";
        }
        Log.i(AnonymousClass000.A0R(obj, A0o2));
        AnonymousClass33p r2 = this.A09;
        int i2 = this.A0M.A00;
        C59852xb r0 = this.A0U;
        if (r0 != null) {
            num = Integer.valueOf(r0.A01());
        } else {
            num = null;
        }
        r2.A1D(i2, num);
    }

    public void A7r(String str) {
        Intent className = new Intent().setClassName(getPackageName(), "com.whatsapp.backup.google.RestoreTransferSelectorActivity");
        className.putExtra("backup_time", str);
        startActivityForResult(className, 25);
    }

    public final void A7s(boolean z) {
        String str;
        AnonymousClass0UH r0;
        if (z && (r0 = this.A0G) != null && r0.A02) {
            A7f(8);
        }
        setTitle(R.string.f11nameremoved);
        boolean A25 = this.A09.A25();
        StringBuilder A0o2 = AnonymousClass001.A0o();
        if (A25) {
            str = "restore>RestoreFromBackupActivity/msgstore-download/finished with success: ";
        } else {
            str = "restore>RestoreFromBackupActivity/msgstore-download/not performed since we are using local backup, success: ";
        }
        A0o2.append(str);
        A0o2.append(z);
        Log.i(AnonymousClass000.A0X(", starting to restore it.", A0o2));
        super.A78(z);
    }

    public final void A7u(boolean z) {
        if (this.A0Q.A0H()) {
            if (z) {
                A7g(6);
                return;
            }
        } else if (this.A0T.A0B() > 0) {
            A1Y(this.A0T, 3);
            A7q((C59852xb) null, 23);
            A7I();
            return;
        }
        A7U();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r0.A01 != false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7w(boolean r11) {
        /*
            r10 = this;
            X.2s5 r1 = r10.A0f
            if (r11 == 0) goto L_0x00e0
            java.lang.String r0 = "restore_successful"
        L_0x0006:
            r1.A01(r0)
            X.C626936e.A01()
            X.0UH r0 = r10.A0G
            r8 = 1
            r7 = 0
            if (r0 == 0) goto L_0x0017
            boolean r0 = r0.A01
            r6 = 1
            if (r0 == 0) goto L_0x0018
        L_0x0017:
            r6 = 0
        L_0x0018:
            com.whatsapp.backup.google.GoogleDriveRestoreAnimationView r0 = r10.A0K
            if (r0 != 0) goto L_0x0027
            r0 = 2131430392(0x7f0b0bf8, float:1.8482484E38)
            android.view.View r0 = X.C005205m.A00(r10, r0)
            com.whatsapp.backup.google.GoogleDriveRestoreAnimationView r0 = (com.whatsapp.backup.google.GoogleDriveRestoreAnimationView) r0
            r10.A0K = r0
        L_0x0027:
            r0.A08(r7)
            r0 = 2131433108(0x7f0b1694, float:1.8487992E38)
            android.view.View r0 = X.C005205m.A00(r10, r0)
            r1 = 8
            r0.setVisibility(r1)
            android.widget.ProgressBar r0 = r10.A05
            r0.setVisibility(r1)
            android.widget.TextView r0 = r10.A08
            r0.setVisibility(r1)
            android.widget.TextView r0 = r10.A07
            if (r0 != 0) goto L_0x004d
            r0 = 2131430388(0x7f0b0bf4, float:1.8482476E38)
            android.widget.TextView r0 = X.C005205m.A01(r10, r0)
            r10.A07 = r0
        L_0x004d:
            r0.setVisibility(r1)
            if (r11 == 0) goto L_0x0061
            r0 = 2131427538(0x7f0b00d2, float:1.8476695E38)
            android.view.View r1 = r10.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131890881(0x7f1212c1, float:1.9416466E38)
            r1.setText(r0)
        L_0x0061:
            r0 = 2131431590(0x7f0b10a6, float:1.8484914E38)
            android.widget.TextView r5 = X.C005205m.A01(r10, r0)
            r5.setVisibility(r7)
            if (r6 == 0) goto L_0x00c4
            X.33p r0 = r10.A09
            X.C06540Yd.A0D(r0)
            X.33j r9 = r10.A00
            r4 = 2131755127(0x7f100077, float:1.9141124E38)
            X.3dV r0 = r10.A0V
            int r0 = r0.A02()
            long r0 = (long) r0
            java.lang.Object[] r3 = new java.lang.Object[r8]
            X.3dV r2 = r10.A0V
            int r2 = r2.A02()
            X.AnonymousClass000.A1P(r3, r2, r7)
            java.lang.String r2 = r9.A0L(r3, r4, r0)
        L_0x008d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "restore>RestoreFromBackupActivity/after-msgstore-verified/restore-media/ "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r2, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r5.setText(r2)
            r0 = 2131431812(0x7f0b1184, float:1.8485364E38)
            android.view.View r1 = X.C005205m.A00(r10, r0)
            r1.setVisibility(r7)
            X.33i r0 = r10.A08
            android.view.accessibility.AccessibilityManager r0 = r0.A0P()
            if (r0 == 0) goto L_0x00bb
            boolean r0 = r0.isTouchExplorationEnabled()
            if (r0 == 0) goto L_0x00bb
            r1.setFocusableInTouchMode(r8)
            r1.requestFocus()
        L_0x00bb:
            X.0aE r0 = new X.0aE
            r0.<init>(r10, r11, r6)
            r1.setOnClickListener(r0)
            return
        L_0x00c4:
            X.33j r9 = r10.A00
            r4 = 2131755128(0x7f100078, float:1.9141127E38)
            X.3dV r0 = r10.A0V
            int r0 = r0.A02()
            long r1 = (long) r0
            java.lang.Object[] r3 = new java.lang.Object[r8]
            X.3dV r0 = r10.A0V
            int r0 = r0.A02()
            X.AnonymousClass000.A1P(r3, r0, r7)
            java.lang.String r2 = r9.A0L(r3, r4, r1)
            goto L_0x008d
        L_0x00e0:
            java.lang.String r0 = "restore_unsuccessful"
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.RestoreFromBackupActivity.A7w(boolean):void");
    }

    public final void A7x(boolean z) {
        if (z) {
            A7G();
            return;
        }
        A7q((C59852xb) null, 27);
        A7H();
        A7s(true);
    }

    public final void A7y(boolean z) {
        View view = this.A03;
        if (z) {
            view.setVisibility(0);
            A7f(1);
            return;
        }
        view.setVisibility(8);
    }

    public final boolean A81() {
        if (this.A0t.size() < this.A0s.size() || this.A0x.get()) {
            return true;
        }
        return false;
    }

    public final boolean A82() {
        if (!this.A0Q.A0H() || !RequestPermissionActivity.A0t(this.A09, C107035aa.A05())) {
            return false;
        }
        A7g(8);
        return true;
    }

    public void BR8(int i) {
        String str;
        String str2;
        if (i == 10 || i == 11) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("restore>RestoreFromBackupActivity/user clicked skip restore for");
            if (i == 11) {
                str = "google";
            } else {
                str = "local";
            }
            A0o2.append(str);
            Log.i(AnonymousClass000.A0X("backup", A0o2));
        } else if (i == 12) {
            Log.i("restore>RestoreFromBackupActivity/restore-media-on-cellular-dialog/Wi-Fi unavailable and user agreed to restore media on cellular.");
            this.A09.A0x();
            A7d();
            Log.i("restore>RestoreFromBackupActivity/msgstore-download-finish/setting result of Google Drive activity to BACKUP_FOUND_AND_RESTORED.");
            setResult(3);
            finish();
        } else if (i == 14) {
            Log.i("restore>RestoreFromBackupActivity/no-local-or-gdrive-backup-found-dialog/no google drive backups found and user is not interested in adding an account for that either.");
            if (A83()) {
                A7r((String) null);
                return;
            }
            A7c();
            setResult(1);
        } else if (i == 16) {
            Log.i("restore>RestoreFromBackupActivity/one-time-setup-is-taking-too-long/user decided to cancel looking for backups");
            AnonymousClass0X8.A03();
            this.A0v.set(true);
            if (this.A0T.A0B() > 0) {
                A7q((C59852xb) null, 23);
                A7I();
                return;
            }
            A7a();
            A78(false);
        } else {
            if (i == 18) {
                Log.i("restore>RestoreFromBackupActivity/failed-to-restore-messages-from-selected-backup/user decided to continue without restore");
                A7a();
            } else {
                if (i == 19) {
                    str2 = "restore>RestoreFromBackupActivity/failed-to-restore-messages/internal-storage-out-of-free-space/user clicked ok";
                } else if (i == 20) {
                    if (A81()) {
                        str2 = "restore>RestoreFromBackupActivity/msgstore-jid-mismatch/restore-from-older";
                    } else {
                        Log.i("restore>RestoreFromBackupActivity/msgstore-jid-mismatch/skip");
                    }
                } else if (i == 22) {
                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://faq.whatsapp.com/android/chats/how-to-restore-your-chat-history")));
                    return;
                } else if (i == 23) {
                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://faq.whatsapp.com/android/chats/how-to-restore-your-chat-history")));
                    A7v(true);
                    return;
                } else if (i == 24) {
                    A7X();
                    return;
                } else {
                    throw AnonymousClass00M.A02(i);
                }
                Log.i(str2);
                A7v(true);
                return;
            }
            A78(false);
            A7w(false);
        }
    }

    public void BR9(int i) {
        if (i == 13) {
            Log.i("restore>RestoreFromBackupActivity/insufficient-space-dialog/neutral-click");
            return;
        }
        throw AnonymousClass00M.A02(i);
    }

    public void BRA(int i) {
        if (i == 10) {
            Log.i("restore>RestoreFromBackupActivity/show-restore/user declined to restore from local backup");
            setResult(2);
            A7c();
        } else if (i == 11) {
            Log.i("restore>RestoreFromBackupActivity/user confirmed to skip restore");
            if (this.A0T.A0B() <= 0 || !this.A0x.get()) {
                A7K();
                return;
            }
            A7q((C59852xb) null, 23);
            A7I();
        } else {
            if (i == 12) {
                Log.i("restore>RestoreFromBackupActivity/restore-media-on-cellular-dialog/Wi-Fi unavailable and user declined to restore media on cellular.");
                setResult(3);
            } else {
                if (i == 13) {
                    Log.i("restore>RestoreFromBackupActivity/insufficient-storage-for-restore/user-decided-to-visit-storage-settings");
                } else if (i == 14) {
                    Log.i("restore>RestoreFromBackupActivity/one-time-setup/no google drive backups found and user decided to add an account or give permission to an existing one.");
                    Account[] accountsByType = AccountManager.get(this).getAccountsByType("com.google");
                    int length = accountsByType.length;
                    int i2 = length + 1;
                    String[] strArr = new String[i2];
                    for (int i3 = 0; i3 < length; i3++) {
                        strArr[i3] = accountsByType[i3].name;
                    }
                    int i4 = i2 - 1;
                    AnonymousClass00M.A04(this, R.string.f11nameremoved, i4, strArr);
                    String[] strArr2 = new String[i2];
                    boolean[] zArr = new boolean[i2];
                    List list = this.A0s;
                    list.clear();
                    for (int i5 = 0; i5 < length; i5++) {
                        list.add(accountsByType[i5]);
                        if (this.A0t.contains(accountsByType[i5])) {
                            AnonymousClass00M.A04(this, R.string.f11nameremoved, i5, strArr2);
                            zArr[i5] = false;
                        } else {
                            strArr2[i5] = null;
                            zArr[i5] = true;
                        }
                    }
                    zArr[i4] = true;
                    SingleChoiceListDialogFragment singleChoiceListDialogFragment = new SingleChoiceListDialogFragment();
                    Bundle A002 = AnonymousClass00M.A00(this);
                    A002.putStringArray("multi_line_list_items_key", strArr);
                    A002.putStringArray("multi_line_list_item_values_key", strArr2);
                    A002.putBooleanArray("list_item_enabled_key", zArr);
                    A002.putString("disabled_item_toast_key", getString(R.string.f11nameremoved));
                    singleChoiceListDialogFragment.A0u(A002);
                    if (!A80()) {
                        singleChoiceListDialogFragment.A1O(AnonymousClass00M.A01(this), (String) null);
                        return;
                    }
                    return;
                } else if (i == 15) {
                    Log.i("restore>RestoreFromBackupActivity/google-play-services-is-broken/user decided to skip restore");
                    setResult(1);
                } else if (i == 16) {
                    Log.i("restore>RestoreFromBackupActivity/one-time-setup-taking-too-long/user decided to wait for restore");
                    return;
                } else {
                    if (i == 18) {
                        Log.i("restore>RestoreFromBackupActivity/failed-to-restore-from-selected-backup/restoring from an older backup");
                    } else if (i != 19) {
                        if (i == 20) {
                            Log.i("restore>RestoreFromBackupActivity/msgstore-jid-mistmatch/user decided to re-register");
                            A7Y();
                            return;
                        } else if (i == 21) {
                            Log.i("restore>RestoreFromBackupActivity/failed-to-restore-from-selected-backup/re-enter-encryption-key");
                            A7v(false);
                            return;
                        } else if (i == 22) {
                            return;
                        } else {
                            if (!(i == 23 || i == 24)) {
                                throw AnonymousClass001.A0e(AnonymousClass000.A0Y("restore>RestoreFromBackupActivity/unexpected dialog box: ", AnonymousClass001.A0o(), i));
                            }
                        }
                    }
                    A7v(true);
                    return;
                }
                A7X();
                return;
            }
            finish();
        }
    }

    public void BRI(int i) {
        if (i == 17) {
            Log.i("restore>RestoreFromBackupActivity/account-selector-dialog/user dismissed the dialog");
            A7t(true);
            return;
        }
        throw AnonymousClass001.A0e(AnonymousClass000.A0Y("Unexpected dialog id:", AnonymousClass001.A0o(), i));
    }

    public void Bbg(String[] strArr, int i, int i2) {
        if (i != 17) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("Unexpected dialogId: ");
            A0o2.append(i);
            throw AnonymousClass001.A0e(AnonymousClass000.A0Y(" index:", A0o2, i2));
        } else if (strArr[i2].equals(getString(R.string.f11nameremoved))) {
            C06540Yd.A00.execute(new C12290lJ(AccountManager.get(this).addAccount("com.google", (String) null, (String[]) null, (Bundle) null, this, (AccountManagerCallback) null, (Handler) null), this));
            Log.i("restore>RestoreFromBackupActivity/show-accounts/waiting-for-add-account-activity-to-return");
        } else {
            Intent intent = new Intent();
            intent.putExtra("authAccount", strArr[i2]);
            onActivityResult(3, -1, intent);
        }
    }

    public void onBackPressed() {
        if (this.A0C.A0B(false)) {
            Log.i("restore>RestoreFromBackupActivity/onBackPressed/is adding new account");
            AnonymousClass36l.A0G(this, (Runnable) null, (String) null, this.A0A.A02(), this.A09.A0C());
            return;
        }
        C111095hX.A06(this);
    }

    public void onNewIntent(Intent intent) {
        Intent intent2 = intent;
        super.onNewIntent(intent2);
        if (intent2.getAction() == null) {
            Log.e("restore>RestoreFromBackupActivity/new-intent action is null");
        } else if (!intent2.getAction().equals("action_show_restore_one_time_setup")) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("restore>RestoreFromBackupActivity/new-intent/unexpected action: ");
            Log.e(AnonymousClass000.A0X(intent2.getAction(), A0o2));
            finish();
        } else {
            Dialog A012 = C06540Yd.A01(this, new C17780wE(this, 3), C159787mS.A00(this.A0P.A06()), 2, false);
            if (A012 != null && !A80() && !C06540Yd.A0M(this.A09)) {
                Log.i("restore>RestoreFromBackupActivity/new-intent/existing user with unavailable google play services");
                A012.show();
            } else if (this.A09.A0X() == null) {
                A7t(false);
            } else if (C06540Yd.A0L(this.A09)) {
                Log.i("restore>RestoreFromBackupActivity/new-intent/continue-msgstore-download");
                AnonymousClass00M.A03(this, R.id.google_drive_looking_for_backup_view, 8);
                AnonymousClass00M.A03(this, R.id.google_drive_restore_view, 0);
                A7H();
                String A0X2 = this.A09.A0X();
                C626936e.A06(A0X2);
                long A0S2 = this.A09.A0S(A0X2);
                long A0R2 = this.A09.A0R(A0X2);
                String string = getString(R.string.f11nameremoved);
                if (A0R2 > 0) {
                    string = C107565bW.A03(this.A00, A0R2).toString();
                }
                if (!this.A09.A25()) {
                    string = C107565bW.A03(this.A00, A79()).toString();
                }
                String A042 = AnonymousClass35V.A04(this.A00, A0S2);
                if (this.A0G == null) {
                    this.A0G = new AnonymousClass0UH(A0X2, A0R2, A0S2, this.A09.A25(), false, this.A09.A26());
                }
                AnonymousClass001.A0y(this, C005205m.A01(this, R.id.gdrive_restore_info), new Object[]{A0X2, string, A042}, R.string.f11nameremoved);
                A7y(this.A0G.A02);
                A7e();
            } else if (this.A09.A05() != 0) {
                Log.i("restore>RestoreFromBackupActivity/new-intent/msgstore-download-already-finished, restoring");
                AnonymousClass00M.A03(this, R.id.google_drive_looking_for_backup_view, 8);
                AnonymousClass00M.A03(this, R.id.google_drive_restore_view, 0);
                AnonymousClass08M r1 = this.A0M.A02;
                C06270Wx.A02(this, r1, 19);
                Number number = (Number) r1.A07();
                if (number != null) {
                    A7j(number.longValue());
                }
                this.A0M.A0E();
                A7y(this.A09.A26());
                A7H();
                A7s(true);
            } else {
                A7c();
                setResult(2);
            }
        }
    }

    public static String A0g(int i) {
        switch (i) {
            case 21:
                return "new";
            case 22:
                return "restore-from-gdrive";
            case 23:
                return "restore-from-local";
            case 24:
                return "restoring-from-gdrive";
            case 25:
                return "return-from-auth";
            case 26:
                return "msgstore-restored";
            case 27:
                return "restoring-from-local";
            default:
                throw AnonymousClass001.A0e(AnonymousClass000.A0Y("Unknown state: ", AnonymousClass001.A0o(), i));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A0o() {
        Bot(R.string.f11nameremoved);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A0x(UserRecoverableAuthException userRecoverableAuthException, int i) {
        BpY(userRecoverableAuthException.A00(), i);
    }

    public static /* synthetic */ void A1I(RestoreFromBackupActivity restoreFromBackupActivity) {
        if (!restoreFromBackupActivity.A80()) {
            C005205m.A00(restoreFromBackupActivity, R.id.google_drive_backup_error_info_view).setVisibility(8);
        }
    }

    public static /* synthetic */ void A1S(RestoreFromBackupActivity restoreFromBackupActivity, String str) {
        TextView A012 = C005205m.A01(restoreFromBackupActivity, R.id.gdrive_restore_size_info);
        View A002 = C005205m.A00(restoreFromBackupActivity, R.id.calculating_transfer_size_progress_bar);
        if (!restoreFromBackupActivity.A80()) {
            A012.setText(str);
            A002.setVisibility(8);
        }
    }

    public static /* synthetic */ void A1V(RestoreFromBackupActivity restoreFromBackupActivity, boolean z) {
        restoreFromBackupActivity.A7M();
        if (!restoreFromBackupActivity.A82()) {
            restoreFromBackupActivity.A7x(z);
        }
    }

    public static void A1Y(C625835r r0, int i) {
        r0.A0X(i);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A1c(String str) {
        Log.e(AnonymousClass0YV.A0B("restore>RestoreFromBackupActivity/auth-request/unable to access ", str, AnonymousClass001.A0o()));
        Bot(R.string.f11nameremoved);
    }

    public void A77(C59852xb r7) {
        C626936e.A01();
        if (this.A0l) {
            finish();
            return;
        }
        int i = this.A0M.A00;
        StringBuilder A0o2 = AnonymousClass001.A0o();
        if (i == 26) {
            Log.i(AnonymousClass000.A0P(r7, "restore>RestoreFromBackupActivity/after-msgstore-verified/state-is-msgstore-restored/call-ignored ", A0o2));
            return;
        }
        Log.i(AnonymousClass000.A0P(r7, "restore>RestoreFromBackupActivity/after-msgstore-verified/status:", A0o2));
        A7q(r7, 26);
        int A012 = r7.A01();
        boolean A1X = AnonymousClass001.A1X(A012, 2);
        StringBuilder A0o3 = AnonymousClass001.A0o();
        A0o3.append(A012);
        C626936e.A0D(A1X, AnonymousClass000.A0X(" is unexpected here", A0o3));
        if (A012 == 1) {
            this.A04.BkM(new C11550jp(this));
            A7w(true);
        } else if (A012 == 5) {
            A7P();
        } else if (A7z()) {
            A7S();
            if (A012 == 3) {
                A7N();
                return;
            }
            if (A012 == 0) {
                A7F();
            }
            TextUtils.join(",", this.A0s);
            TextUtils.join(",", this.A0t);
            if (this.A09.A2F()) {
                A7V();
            } else if (A81()) {
                A7W();
            } else {
                A78(false);
                A7w(false);
                this.A05.A0N(this, R.string.f11nameremoved);
            }
        }
    }

    public void A7H() {
        C626936e.A01();
        Log.i("restore>RestoreFromBackupActivity/show-msgstore-downloading-view");
        C005205m.A00(this, R.id.restore_actions_view).setVisibility(8);
        AnonymousClass00M.A03(this, R.id.restore_general_info, 8);
        AnonymousClass00M.A03(this, R.id.calculating_progress_view, 8);
        C005205m.A00(this, R.id.google_drive_restore_animation_view).setVisibility(0);
        this.A05.setVisibility(0);
        this.A05.setIndeterminate(true);
        AnonymousClass0Y8.A04(this, AnonymousClass34K.A01(this, R.attr.f3nameremoved));
        this.A08.setVisibility(0);
        this.A07 = (TextView) findViewById(R.id.google_drive_media_will_be_downloaded_later_notice);
        long j = this.A02;
        if (j == 0) {
            j = this.A09.A0H();
            this.A02 = j;
        }
        if (j > 0) {
            String A042 = AnonymousClass35V.A04(this.A00, j);
            AnonymousClass001.A0y(this, this.A07, new Object[]{A042}, R.string.f11nameremoved);
            this.A07.setVisibility(0);
        }
    }

    public void A7J() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Html.fromHtml(getString(R.string.f11nameremoved)));
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                if ("skip-looking-for-backups".equals(uRLSpan.getURL())) {
                    Log.w("restore>RestoreFromBackupActivity/one-time-setup/taking-too-long/allow-user-to-skip-looking-for-backups");
                    int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                    int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                    int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new AnonymousClass02D(this), spanStart, spanEnd, spanFlags);
                }
            }
        }
        TextView A012 = C005205m.A01(this, R.id.gdrive_lookup_for_backups_view);
        A012.setText(spannableStringBuilder);
        A012.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void A7K() {
        String A0A2;
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("restore>RestoreFromBackupActivity/skip-restore/user declined to restore backup from ");
        AnonymousClass0UH r0 = this.A0G;
        if (r0 == null) {
            A0A2 = "<unset account>";
        } else {
            A0A2 = AnonymousClass0YV.A0A(r0.A05);
        }
        Log.i(AnonymousClass000.A0X(A0A2, A0o2));
        Log.i("restore>RestoreFromBackupActivity/skip-restore/stopping-approx-transfer-size-calc-thread");
        AnonymousClass0UH r02 = this.A0G;
        if (r02 != null && r02.A02) {
            A7f(6);
        }
        this.A0u.set(true);
        C06540Yd.A0C(this.A09);
        this.A09.A0f();
        this.A09.A2L(0);
        this.A09.A1r(false);
        C11560jq r1 = new C11560jq(this);
        if (C615631i.A02()) {
            this.A04.BkM(r1);
        } else {
            r1.run();
        }
        this.A0I.A0C(10);
        String A0X2 = this.A09.A0X();
        if (A0X2 != null) {
            Intent A0t2 = C627736r.A0t(this, "action_remove_backup_info");
            A0t2.putExtra("account_name", A0X2);
            A0t2.putExtra("remove_account_name", true);
            AnonymousClass29R.A00(this, A0t2);
        }
        setResult(2);
        A7c();
    }

    public final void A7N() {
        C626936e.A01();
        if (!A80()) {
            Spannable A7A = A7A(A7E(this.A0T.A0U()), "restore-failure-jid-mismatch-learn-more");
            C56282rj r2 = new C56282rj(20);
            r2.A06(getString(R.string.f11nameremoved));
            r2.A02(A7A);
            r2.A01();
            r2.A07(false);
            r2.A05(getString(R.string.f11nameremoved));
            boolean A81 = A81();
            int i = R.string.f11nameremoved;
            if (A81) {
                i = R.string.f11nameremoved;
            }
            r2.A03(getString(i));
            AnonymousClass00M.A06(r2.A00(), this);
        }
    }

    public final void A7O() {
        C626936e.A01();
        if (!A80()) {
            C56282rj r1 = new C56282rj(23);
            r1.A06(getString(R.string.f11nameremoved));
            r1.A02(getString(R.string.f11nameremoved));
            r1.A07(false);
            r1.A05(getString(R.string.f11nameremoved));
            r1.A03(getString(R.string.f11nameremoved));
            AnonymousClass00M.A06(r1.A00(), this);
        }
    }

    public final void A7P() {
        C626936e.A01();
        if (!A80()) {
            Spannable A7A = A7A(getString(R.string.f11nameremoved), "restore-failure-low-on-storage-learn-more");
            C56282rj r3 = new C56282rj(19);
            r3.A06(getString(R.string.f11nameremoved));
            r3.A02(A7A);
            r3.A01();
            r3.A07(false);
            String string = getString(R.string.f11nameremoved);
            if (Build.VERSION.SDK_INT >= 26) {
                string = getString(R.string.f11nameremoved);
            }
            r3.A05(string);
            r3.A03(getString(R.string.f11nameremoved));
            AnonymousClass00M.A06(r3.A00(), this);
        }
    }

    public final void A7Q() {
        C626936e.A01();
        if (!A80()) {
            C56282rj r1 = new C56282rj(22);
            r1.A06(getString(R.string.f11nameremoved));
            r1.A02(getString(R.string.f11nameremoved));
            r1.A07(false);
            r1.A05(getString(R.string.f11nameremoved));
            r1.A03(getString(R.string.f11nameremoved));
            AnonymousClass00M.A06(r1.A00(), this);
        }
    }

    public final void A7T() {
        A7M();
        if (A82()) {
            return;
        }
        if (this.A07.A02() < this.A01) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("restore>RestoreFromBackupActivity/perform-restore-initiated/show-restore insufficient storage, available: ");
            A0o2.append(this.A07.A02());
            A0o2.append(" required: ");
            Log.i(AnonymousClass001.A0k(A0o2, this.A01));
            boolean A012 = C61072zf.A01();
            int i = R.string.f11nameremoved;
            if (A012) {
                i = R.string.f11nameremoved;
            }
            String A0F2 = AnonymousClass002.A0F(this, AnonymousClass35V.A04(this.A00, this.A01), new Object[1], 0, i);
            C56282rj r3 = new C56282rj(13);
            r3.A06(getString(R.string.f11nameremoved));
            r3.A02(A0F2);
            String string = getString(R.string.f11nameremoved);
            if (Build.VERSION.SDK_INT >= 26) {
                string = getString(R.string.f11nameremoved);
            }
            r3.A05(string);
            r3.A04(getString(R.string.f11nameremoved));
            r3.A00().A1O(AnonymousClass00M.A01(this), (String) null);
            return;
        }
        StringBuilder A0o3 = AnonymousClass001.A0o();
        A0o3.append("restore>RestoreFromBackupActivity/perform-restore-initiated/show-restore starting restore from ");
        Log.i(AnonymousClass000.A0X(AnonymousClass0YV.A0A(this.A0G.A05), A0o3));
        Log.i("restore>RestoreFromBackupActivity/perform-restore-initiated/show-restore/stopping-approx-transfer-size-calc-thread");
        this.A0u.set(true);
        AnonymousClass0UH r1 = this.A0G;
        if (r1.A02) {
            A7G();
        } else {
            A7p(r1);
        }
    }

    public final void A7V() {
        C626936e.A01();
        if (!A80()) {
            C56282rj r1 = new C56282rj(21);
            r1.A02(getString(R.string.f11nameremoved));
            r1.A07(false);
            r1.A05(getString(R.string.f11nameremoved));
            AnonymousClass00M.A06(r1.A00(), this);
        }
    }

    public final void A7W() {
        C626936e.A01();
        if (!A80()) {
            C56282rj r1 = new C56282rj(18);
            r1.A02(getString(R.string.f11nameremoved));
            r1.A07(false);
            r1.A05(getString(R.string.f11nameremoved));
            r1.A03(getString(R.string.f11nameremoved));
            AnonymousClass00M.A06(r1.A00(), this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004e, code lost:
        r0 = (com.whatsapp.backup.google.GoogleDriveRestoreAnimationView) X.C005205m.A00(r12, com.whatsapp.R.id.google_drive_restore_animation_view);
        r12.A0K = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0059, code lost:
        r0.A04();
        r0 = X.C005205m.A00(r12, com.whatsapp.R.id.google_drive_backup_error_info_view);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0065, code lost:
        if (r3 == null) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0067, code lost:
        r0.setVisibility(0);
        X.C005205m.A01(r12, com.whatsapp.R.id.google_drive_backup_error_info).setText(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0074, code lost:
        X.AnonymousClass00M.A03(r12, com.whatsapp.R.id.gdrive_restore_info, 0);
        A7y(r12.A09.A26());
        X.AnonymousClass00M.A03(r12, com.whatsapp.R.id.restore_actions_view, 0);
        X.AnonymousClass00M.A03(r12, com.whatsapp.R.id.google_drive_media_will_be_downloaded_later_notice, 8);
        r12.A0K.setVisibility(8);
        r12.A05.setVisibility(8);
        r12.A08.setVisibility(8);
        X.C17760wC.A00(X.C005205m.A00(r12, com.whatsapp.R.id.dont_restore), r12, 13);
        r12.A04.setText(r7);
        r12.A04.setOnClickListener(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00b5, code lost:
        r0.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x012f, code lost:
        r2 = new X.C17760wC(r12, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0168, code lost:
        com.whatsapp.util.Log.e(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0173, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("restore>RestoreFromBackupActivity/display-msgstore-download-error failed to display error ");
        r1.append(r13);
        com.whatsapp.util.Log.e(X.AnonymousClass000.A0X(" since Activity is about to finish.", r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0188, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003b, code lost:
        if (A80() != false) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003d, code lost:
        r12.A05.setIndeterminate(false);
        r12.A08.setText(com.whatsapp.R.string.f11nameremoved);
        r0 = r12.A0K;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004c, code lost:
        if (r0 != null) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7i(int r13, android.os.Bundle r14) {
        /*
            r12 = this;
            X.C626936e.A01()
            r0 = 10
            if (r13 == r0) goto L_0x0014
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "restore>RestoreFromBackupActivity/observer/display-msgstore-download-error/"
            java.lang.String r0 = X.AnonymousClass0YV.A0C(r0, r1, r13)
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0014:
            r7 = 2131893203(0x7f121bd3, float:1.9421176E38)
            X.33p r0 = r12.A09
            java.lang.String r4 = r0.A0X()
            X.C626936e.A06(r4)
            r11 = 2
            r6 = 1
            r5 = 0
            switch(r13) {
                case 10: goto L_0x00b4;
                case 11: goto L_0x0026;
                case 12: goto L_0x0143;
                case 13: goto L_0x0136;
                case 14: goto L_0x0121;
                case 15: goto L_0x00d4;
                case 16: goto L_0x0189;
                case 17: goto L_0x0121;
                case 18: goto L_0x0121;
                case 19: goto L_0x0121;
                case 20: goto L_0x0189;
                case 21: goto L_0x0026;
                case 22: goto L_0x0121;
                case 23: goto L_0x016f;
                case 24: goto L_0x00b9;
                case 25: goto L_0x0121;
                case 26: goto L_0x0158;
                case 27: goto L_0x0158;
                default: goto L_0x0026;
            }
        L_0x0026:
            r1 = 2131889612(0x7f120dcc, float:1.9413892E38)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            X.AnonymousClass00M.A04(r12, r7, r5, r0)
            java.lang.String r3 = r12.getString(r1, r0)
            X.0wI r2 = new X.0wI
            r2.<init>(r6, r4, r12)
        L_0x0037:
            boolean r0 = r12.A80()
            if (r0 != 0) goto L_0x0173
            android.widget.ProgressBar r0 = r12.A05
            r0.setIndeterminate(r5)
            android.widget.TextView r1 = r12.A08
            r0 = 2131886307(0x7f1200e3, float:1.940719E38)
            r1.setText(r0)
            com.whatsapp.backup.google.GoogleDriveRestoreAnimationView r0 = r12.A0K
            if (r0 != 0) goto L_0x0059
            r0 = 2131430392(0x7f0b0bf8, float:1.8482484E38)
            android.view.View r0 = X.C005205m.A00(r12, r0)
            com.whatsapp.backup.google.GoogleDriveRestoreAnimationView r0 = (com.whatsapp.backup.google.GoogleDriveRestoreAnimationView) r0
            r12.A0K = r0
        L_0x0059:
            r0.A04()
            r0 = 2131430379(0x7f0b0beb, float:1.8482457E38)
            android.view.View r0 = X.C005205m.A00(r12, r0)
            r1 = 8
            if (r3 == 0) goto L_0x00b5
            r0.setVisibility(r5)
            r0 = 2131430378(0x7f0b0bea, float:1.8482455E38)
            android.widget.TextView r0 = X.C005205m.A01(r12, r0)
            r0.setText(r3)
        L_0x0074:
            r0 = 2131430325(0x7f0b0bb5, float:1.8482348E38)
            X.AnonymousClass00M.A03(r12, r0, r5)
            X.33p r0 = r12.A09
            boolean r0 = r0.A26()
            r12.A7y(r0)
            r0 = 2131433108(0x7f0b1694, float:1.8487992E38)
            X.AnonymousClass00M.A03(r12, r0, r5)
            r0 = 2131430388(0x7f0b0bf4, float:1.8482476E38)
            X.AnonymousClass00M.A03(r12, r0, r1)
            com.whatsapp.backup.google.GoogleDriveRestoreAnimationView r0 = r12.A0K
            r0.setVisibility(r1)
            android.widget.ProgressBar r0 = r12.A05
            r0.setVisibility(r1)
            android.widget.TextView r0 = r12.A08
            r0.setVisibility(r1)
            r0 = 2131429549(0x7f0b08ad, float:1.8480774E38)
            android.view.View r1 = X.C005205m.A00(r12, r0)
            r0 = 13
            X.C17760wC.A00(r1, r12, r0)
            android.widget.Button r0 = r12.A04
            r0.setText(r7)
            android.widget.Button r0 = r12.A04
            r0.setOnClickListener(r2)
        L_0x00b4:
            return
        L_0x00b5:
            r0.setVisibility(r1)
            goto L_0x0074
        L_0x00b9:
            r2 = 2131889617(0x7f120dd1, float:1.9413903E38)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r0 = 2131889616(0x7f120dd0, float:1.94139E38)
            X.AnonymousClass00M.A04(r12, r0, r5, r1)
            java.lang.String r3 = r12.getString(r2, r1)
            r0 = 12
            X.0wC r2 = new X.0wC
            r2.<init>(r12, r0)
            r7 = 2131894663(0x7f122187, float:1.9424137E38)
            goto L_0x0037
        L_0x00d4:
            r0 = -1
            java.lang.String r2 = "msgstore_bytes_to_be_downloaded"
            long r2 = r14.getLong(r2, r0)
            java.lang.String r10 = r12.getString(r7)
            r8 = 0
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x0111
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "restore>RestoreFromBackupActivity/display-msgstore-download-error/"
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = " message store download size: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " is invalid"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r4 = 2131889614(0x7f120dce, float:1.9413897E38)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r5] = r10
        L_0x010a:
            java.lang.String r3 = r12.getString(r4, r1)
            r0 = 18
            goto L_0x012f
        L_0x0111:
            r4 = 2131889613(0x7f120dcd, float:1.9413895E38)
            java.lang.Object[] r1 = new java.lang.Object[r11]
            X.33j r0 = r12.A00
            java.lang.String r0 = X.AnonymousClass35V.A04(r0, r2)
            r1[r5] = r0
            r1[r6] = r10
            goto L_0x010a
        L_0x0121:
            r1 = 2131889615(0x7f120dcf, float:1.9413899E38)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            X.AnonymousClass00M.A04(r12, r7, r5, r0)
            java.lang.String r3 = r12.getString(r1, r0)
            r0 = 17
        L_0x012f:
            X.0wC r2 = new X.0wC
            r2.<init>(r12, r0)
            goto L_0x0037
        L_0x0136:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "restore>RestoreFromBackupActivity/display-msgstore-download-error/unexpected/"
            r1.append(r0)
            r1.append(r13)
            goto L_0x0168
        L_0x0143:
            r1 = 2131889611(0x7f120dcb, float:1.941389E38)
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r5] = r4
            X.AnonymousClass00M.A04(r12, r7, r6, r0)
            java.lang.String r3 = r12.getString(r1, r0)
            X.0wI r2 = new X.0wI
            r2.<init>(r5, r4, r12)
            goto L_0x0037
        L_0x0158:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "restore>RestoreFromBackupActivity/display-msgstore-download-error/unhandled-error/"
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass0YV.A02(r13)
            r1.append(r0)
        L_0x0168:
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x016f:
            r3 = 0
            r2 = r3
            goto L_0x0037
        L_0x0173:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "restore>RestoreFromBackupActivity/display-msgstore-download-error failed to display error "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = " since Activity is about to finish."
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0189:
            java.lang.String r0 = "Unexpected error"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.RestoreFromBackupActivity.A7i(int, android.os.Bundle):void");
    }

    public void A7l(long j, long j2) {
        String A0F2;
        C626936e.A00();
        this.A01 = j;
        this.A02 = j2;
        this.A09.A1E(j2);
        if (j <= 0) {
            A0F2 = getString(R.string.f11nameremoved);
        } else {
            A0F2 = AnonymousClass002.A0F(this, AnonymousClass35V.A04(this.A00, j), AnonymousClass002.A0L(), 0, R.string.f11nameremoved);
        }
        this.A0o.block();
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("restore>RestoreFromBackupActivity/update-restore-info/ total download size: ");
        A0o2.append(j);
        Log.i(AnonymousClass000.A0Z(" media download size: ", A0o2, j2));
        this.A05.A0S(new C12340lO(this, A0F2));
    }

    public void A7n(AnonymousClass0UH r4) {
        C626936e.A01();
        C08310eF A0D2 = AnonymousClass00M.A01(this).A0D("one-time-setup-taking-too-long");
        if (A0D2 != null) {
            ((DialogFragment) A0D2).A1L();
        }
        if (A80()) {
            Log.i(AnonymousClass000.A0P(r4, "restore>RestoreFromBackupActivity/one-time-setup background task finished but parent activity has already exited, therefore, stopping the task. Data: ", AnonymousClass001.A0o()));
            return;
        }
        this.A0G = r4;
        if (r4 != null) {
            A7q((C59852xb) null, 22);
            A7o(r4);
            return;
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("restore>RestoreFromBackupActivity/one-time-setup/num-of-local-backup-files/");
        Log.i(AnonymousClass000.A0h(A0o2, this.A0T.A0B()));
        if (this.A0T.A0B() > 0 && this.A0x.get()) {
            Log.i("restore>RestoreFromBackupActivity/one-time-setup no google drive backups found but local backup exists.");
            A1Y(this.A0T, 3);
            A7q((C59852xb) null, 23);
            A7I();
        } else if (C06540Yd.A0M(this.A09)) {
            A7c();
            setResult(1);
        } else {
            Log.i("restore>RestoreFromBackupActivity/one-time-setup user is an existing user but has no google drive backups found and no local backups exist either, warn the user.");
            A1Y(this.A0T, 4);
            C56282rj r1 = new C56282rj(14);
            r1.A02(getString(R.string.f11nameremoved));
            r1.A07(false);
            r1.A05(getString(R.string.f11nameremoved));
            r1.A03(getString(R.string.f11nameremoved));
            PromptDialogFragment A002 = r1.A00();
            if (!A80()) {
                AnonymousClass00M.A07(A002, this, (String) null);
            }
        }
    }

    public final void A7o(AnonymousClass0UH r12) {
        int i;
        long j;
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("restore>RestoreFromBackupActivity/show-restore-ui-for-google-backup/");
        String str = r12.A05;
        Log.i(AnonymousClass000.A0X(AnonymousClass0YV.A0A(str), A0o2));
        long j2 = r12.A04;
        long j3 = r12.A00;
        C005205m.A00(this, R.id.google_drive_looking_for_backup_view).setVisibility(8);
        C005205m.A00(this, R.id.google_drive_restore_view).setVisibility(0);
        this.A0o.open();
        setTitle(R.string.f11nameremoved);
        if (this.A0K == null) {
            this.A0K = (GoogleDriveRestoreAnimationView) findViewById(R.id.google_drive_restore_animation_view);
        }
        boolean z = r12.A01;
        TextView A012 = C005205m.A01(this, R.id.restore_general_info);
        if (z) {
            boolean A013 = C61072zf.A01();
            i = R.string.f11nameremoved;
            if (A013) {
                i = R.string.f11nameremoved;
            }
        } else {
            i = R.string.f11nameremoved;
        }
        A012.setText(i);
        StringBuilder sb = new StringBuilder(getString(R.string.f11nameremoved));
        StringBuilder A0o3 = AnonymousClass001.A0o();
        if (j2 > 0) {
            sb.setLength(0);
            sb.append(C107565bW.A03(this.A00, j2));
        }
        if (r12.A01) {
            j = 0;
        } else {
            j = j3;
        }
        this.A01 = j;
        if (j3 >= 0) {
            A0o3.setLength(0);
            A0o3.append(AnonymousClass35V.A04(this.A00, j3));
        }
        if (!r12.A03) {
            sb.setLength(0);
            sb.append(C107565bW.A03(this.A00, A79()));
            Log.i("restore>RestoreFromBackupActivity/show-restore-ui-for-google-backup/local backup is newer than google drive backup, showing local backup timestamp.");
        }
        TextView A014 = C005205m.A01(this, R.id.gdrive_restore_info);
        boolean z2 = r12.A01;
        int i2 = R.string.f11nameremoved;
        if (z2) {
            i2 = R.string.f11nameremoved;
        }
        AnonymousClass001.A0y(this, A014, new Object[]{str, sb.toString(), A0o3.toString()}, i2);
        A7y(r12.A02);
        C17760wC.A00(C005205m.A00(this, R.id.dont_restore), this, 15);
        C17760wC.A00(this.A04, this, 16);
        A7L();
        if (A83()) {
            A7r(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (r4.A0N.A00() == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7t(boolean r5) {
        /*
            r4 = this;
            X.C626936e.A01()
            java.lang.String r0 = "restore>RestoreFromBackupActivity/perform-one-time-setup"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r3 = 0
            X.5ZR r1 = r4.A0Q
            java.lang.String r0 = "android.permission.GET_ACCOUNTS"
            int r0 = r1.A02(r0)
            r2 = 1
            if (r0 != 0) goto L_0x001d
            X.2Xk r0 = r4.A0N
            boolean r0 = r0.A00()
            r1 = 0
            if (r0 != 0) goto L_0x001e
        L_0x001d:
            r1 = 1
        L_0x001e:
            X.5ZR r0 = r4.A0Q
            boolean r0 = r0.A08()
            if (r0 == 0) goto L_0x003f
            X.2Xk r0 = r4.A0N
            boolean r0 = r0.A00()
        L_0x002c:
            boolean r0 = X.AnonymousClass000.A1T(r0)
            if (r1 != 0) goto L_0x0034
            if (r0 == 0) goto L_0x0054
        L_0x0034:
            if (r5 == 0) goto L_0x0046
            if (r0 == 0) goto L_0x004b
            r4.setResult(r2)
            r4.finish()
            return
        L_0x003f:
            X.5ZR r0 = r4.A0Q
            boolean r0 = r0.A0E()
            goto L_0x002c
        L_0x0046:
            r0 = 5
            r4.A7g(r0)
            return
        L_0x004b:
            r1 = 23
            r0 = 0
            r4.A7q(r0, r1)
            r4.A7I()
        L_0x0054:
            X.2oU r0 = r4.A0P
            android.content.Context r0 = r0.A06()
            android.accounts.Account[] r1 = X.C159787mS.A02(r0)
            java.util.List r0 = r4.A0s
            r0.clear()
            java.util.Collections.addAll(r0, r1)
            X.0F4 r2 = r4.A7B(r1)
            r4.A0F = r2
            X.4FS r1 = r4.A04
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r1.BkL(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.RestoreFromBackupActivity.A7t(boolean):void");
    }

    public final void A7v(boolean z) {
        C626936e.A01();
        C005205m.A00(this, R.id.restore_actions_view).setVisibility(0);
        AnonymousClass00M.A03(this, R.id.restore_general_info, 0);
        AnonymousClass00M.A03(this, R.id.calculating_progress_view, 0);
        AnonymousClass00M.A03(this, R.id.google_drive_looking_for_backup_view, 0);
        C005205m.A00(this, R.id.google_drive_restore_animation_view).setVisibility(8);
        AnonymousClass00M.A03(this, R.id.google_drive_progress, 8);
        AnonymousClass00M.A03(this, R.id.google_drive_progress_info, 8);
        AnonymousClass00M.A03(this, R.id.google_drive_restore_view, 8);
        AnonymousClass00M.A03(this, R.id.google_drive_media_will_be_downloaded_later_notice, 8);
        AnonymousClass00M.A03(this, R.id.msgrestore_result_box, 8);
        AnonymousClass00M.A03(this, R.id.nextBtn, 8);
        File databasePath = getDatabasePath("msgstore.db");
        if (databasePath.exists()) {
            boolean delete = databasePath.delete();
            StringBuilder A0l2 = AnonymousClass000.A0l("restore>RestoreFromBackupActivity/show-msgstore-downloading-view/restore-failed ");
            if (!delete) {
                A0l2.append(databasePath);
                Log.w(AnonymousClass000.A0X(" exists but cannot be deleted, message restore might fail", A0l2));
            } else {
                A0l2.append(databasePath);
                Log.i(AnonymousClass000.A0X(" deleted", A0l2));
            }
        }
        this.A0W.A00();
        A7t(!z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if ("mounted_ro".equals(r3) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A7z() {
        /*
            r4 = this;
            java.lang.String r3 = android.os.Environment.getExternalStorageState()
            java.lang.String r0 = "mounted"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0015
            java.lang.String r0 = "mounted_ro"
            boolean r1 = r0.equals(r3)
            r0 = 0
            if (r1 == 0) goto L_0x0016
        L_0x0015:
            r0 = 1
        L_0x0016:
            r2 = 0
            if (r0 != 0) goto L_0x002a
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "restore>RestoreFromBackupActivity/storage-state/error-external-storage-unavailable/state="
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r3, r1)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r4.A7O()
            return r2
        L_0x002a:
            X.5ZR r0 = r4.A0Q
            boolean r0 = r0.A08()
            r1 = 1
            if (r0 != 0) goto L_0x0047
            X.5ZR r0 = r4.A0Q
            boolean r0 = r0.A07()
            if (r0 != 0) goto L_0x0047
            java.lang.String r0 = "restore>RestoreFromBackupActivity/storage-state/error-permission-unavailable"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r4.A7v(r1)
            r4.A82()
            return r2
        L_0x0047:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.RestoreFromBackupActivity.A7z():boolean");
    }

    public final boolean A80() {
        if (C621433s.A03(this) || this.A0j) {
            return true;
        }
        return false;
    }

    public final boolean A83() {
        if (!C107385bE.A02() || this.A09.A2A() || !this.A0Z.A0X(4485)) {
            return false;
        }
        return true;
    }

    public final boolean A84(String str, int i) {
        C626936e.A00();
        Log.i(AnonymousClass0YV.A0B("restore>RestoreFromBackupActivity/auth-request/ account being used is ", str, AnonymousClass001.A0o()));
        this.A04.BkM(new C12810mA(this, str, i));
        Log.i("restore>RestoreFromBackupActivity/auth-request/blocking on tokenReceived");
        this.A0p.block(100000);
        return AnonymousClass000.A1W(this.A0i);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C107405bG.A08(this, AnonymousClass34K.A01(this, R.attr.f3nameremoved));
        this.A0M = (RestoreFromBackupViewModel) new AnonymousClass0XL(this).A01(RestoreFromBackupViewModel.class);
        if (!AnonymousClass0YV.A0F(this.A0P.A06())) {
            Log.w("restore>RestoreFromBackupActivity/google drive access is not possible");
            setResult(0);
            finish();
            return;
        }
        setContentView((int) R.layout.f8nameremoved);
        Toolbar toolbar = (Toolbar) findViewById(R.id.title_toolbar);
        if (!ViewConfiguration.get(getApplicationContext()).hasPermanentMenuKey()) {
            setSupportActionBar(toolbar);
            AnonymousClass0R8 supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.A0N(false);
                supportActionBar.A0Q(false);
            }
        }
        setTitle(R.string.f11nameremoved);
        findViewById(R.id.gdrive_looking_for_backup_progress_bar);
        AnonymousClass0Y8.A04(this, AnonymousClass34K.A02(this, R.attr.f3nameremoved, R.color.f5nameremoved));
        findViewById(R.id.calculating_transfer_size_progress_bar);
        AnonymousClass0Y8.A04(this, AnonymousClass34K.A02(this, R.attr.f3nameremoved, R.color.f5nameremoved));
        this.A05 = (ProgressBar) C005205m.A00(this, R.id.google_drive_progress);
        this.A08 = C005205m.A01(this, R.id.google_drive_progress_info);
        this.A03 = C005205m.A00(this, R.id.gdrive_restore_encrypted_backup);
        this.A04 = (Button) C005205m.A00(this, R.id.perform_restore);
        this.A06 = C005205m.A01(this, R.id.gdrive_restore_info);
        C06270Wx.A02(this, this.A0M.A02, 19);
        this.A0k = getApplicationContext().bindService(new C627736r().A1J(getApplicationContext()), this.A0m, 1);
        A7m(bundle);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 0) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.A0e.A02("one-time-restore");
        this.A0c.A01(this, this.A0e, A7D());
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        AnonymousClass0UH r0 = this.A0G;
        if (r0 != null) {
            bundle.putBundle("restore_account_data", r0.A01());
        }
        bundle.putLong("total_download_size", this.A01);
        bundle.putLong("media_download_size", this.A02);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("restore>RestoreFromBackupActivity/save-state/total-download-size:");
        A0o2.append(this.A01);
        A0o2.append(", media-download-size:");
        A0o2.append(this.A02);
        A0o2.append(", restore-account-data:");
        Log.i(AnonymousClass000.A0R(this.A0G, A0o2));
    }

    public void setTitle(int i) {
        C005205m.A01(this, R.id.title_toolbar_text).setText(i);
        AnonymousClass36l.A0M(this, this.A0Z, R.id.title_toolbar_text);
    }
}
