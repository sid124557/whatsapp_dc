package com.whatsapp.registration;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass043;
import X.AnonymousClass0x2;
import X.AnonymousClass1Hf;
import X.AnonymousClass1VW;
import X.AnonymousClass1VX;
import X.AnonymousClass2AT;
import X.AnonymousClass317;
import X.AnonymousClass33T;
import X.AnonymousClass33p;
import X.AnonymousClass36l;
import X.AnonymousClass49Y;
import X.AnonymousClass4FS;
import X.AnonymousClass4SG;
import X.AnonymousClass559;
import X.AnonymousClass5LR;
import X.AnonymousClass5V0;
import X.AnonymousClass5VN;
import X.AnonymousClass5WY;
import X.AnonymousClass5ZR;
import X.AnonymousClass67Q;
import X.AnonymousClass6AO;
import X.C003203q;
import X.C06560Yg;
import X.C105005Te;
import X.C107565bW;
import X.C107695bk;
import X.C112695k9;
import X.C116985rC;
import X.C18260x0;
import X.C18270x1;
import X.C18290x4;
import X.C182968pH;
import X.C18300x5;
import X.C18310x6;
import X.C18320x8;
import X.C183538qC;
import X.C184578sA;
import X.C19340zH;
import X.C28861ht;
import X.C50152hi;
import X.C53202mi;
import X.C53962nx;
import X.C54292oU;
import X.C55092pm;
import X.C56502s5;
import X.C56912sl;
import X.C57002su;
import X.C613130e;
import X.C614930z;
import X.C620733j;
import X.C626936e;
import X.C627736r;
import X.C64333Db;
import X.C70483aZ;
import X.C71543cH;
import X.C72343dZ;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86654Ky;
import X.C86664Kz;
import X.C88834as;
import X.C89644eZ;
import X.C993155g;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.CodeInputField;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;

public class VerifyTwoFactorAuth extends C89644eZ implements C184578sA, C182968pH {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public CountDownTimer A06;
    public ProgressBar A07;
    public TextView A08;
    public AnonymousClass043 A09;
    public C116985rC A0A;
    public C53962nx A0B;
    public CodeInputField A0C;
    public AnonymousClass5WY A0D;
    public C614930z A0E;
    public C54292oU A0F;
    public AnonymousClass33T A0G;
    public AnonymousClass5ZR A0H;
    public AnonymousClass1VW A0I;
    public C53202mi A0J;
    public C28861ht A0K;
    public C105005Te A0L;
    public C50152hi A0M;
    public C56912sl A0N;
    public AnonymousClass317 A0O;
    public C55092pm A0P;
    public AnonymousClass559 A0Q;
    public C56502s5 A0R;
    public C993155g A0S;
    public C613130e A0T;
    public C183538qC A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public final Handler A0f;
    public final AnonymousClass49Y A0g;
    public final Runnable A0h;

    public class forgotPinDialog extends Hilt_VerifyTwoFactorAuth_forgotPinDialog {
        public Dialog A1J(Bundle bundle) {
            int millis;
            C620733j r1;
            int i;
            Bundle bundle2 = this.A06;
            int i2 = bundle2.getInt("wipeStatus");
            long j = bundle2.getLong("timeToWaitInMillis");
            C19340zH A0H = C18320x8.A0H(this);
            C89644eZ r5 = (C89644eZ) A0Q();
            if (r5 != null) {
                Log.i("VerifyTwoFactorAuth/forgotPinDialog/onCreateDialog");
                View A0H2 = C18310x6.A0H(LayoutInflater.from(A1D()), R.layout.f8nameremoved);
                TextView A0G = C18300x5.A0G(A0H2, R.id.two_fa_help_dialog_text);
                TextView A0G2 = C18300x5.A0G(A0H2, R.id.positive_button);
                View A02 = C06560Yg.A02(A0H2, R.id.cancel_button);
                View A022 = C06560Yg.A02(A0H2, R.id.reset_account_button);
                int A00 = r5.A09.A00();
                int i3 = R.string.f11nameremoved;
                if (A00 == 18) {
                    i3 = R.string.f11nameremoved;
                }
                A0G2.setText(i3);
                AnonymousClass0x2.A10(A0G2, r5, 0);
                AnonymousClass0x2.A10(A02, this, 1);
                if (i2 == 0) {
                    A0G.setText(R.string.f11nameremoved);
                } else if (i2 == 1) {
                    long millis2 = TimeUnit.DAYS.toMillis(1);
                    if (j > millis2) {
                        millis = (int) (j / millis2);
                        r1 = this.A01;
                        i = 3;
                    } else {
                        long millis3 = TimeUnit.HOURS.toMillis(1);
                        if (j > millis3) {
                            millis = (int) (j / millis3);
                            r1 = this.A01;
                            i = 2;
                        } else {
                            long millis4 = TimeUnit.MINUTES.toMillis(1);
                            if (j > millis4) {
                                millis = (int) (j / millis4);
                                r1 = this.A01;
                                i = 1;
                            } else {
                                millis = (int) (j / TimeUnit.SECONDS.toMillis(1));
                                r1 = this.A01;
                                i = 0;
                            }
                        }
                    }
                    A0G.setText(C18310x6.A0m(this, C107565bW.A05(r1, millis, i), R.string.f11nameremoved));
                } else if (i2 == 2 || i2 == 3) {
                    A0G.setText(R.string.f11nameremoved);
                    AnonymousClass0x2.A10(A022, r5, 2);
                    A022.setVisibility(0);
                    A0H2.findViewById(R.id.spacer).setVisibility(0);
                }
                A0H.setView(A0H2);
            }
            return A0H.create();
        }
    }

    public class resetAccountDialog extends Hilt_VerifyTwoFactorAuth_resetAccountDialog {
        public Dialog A1J(Bundle bundle) {
            int i;
            int i2 = this.A06.getInt("wipeStatus");
            C003203q A0Q = A0Q();
            C19340zH A00 = AnonymousClass5V0.A00(A0Q);
            C19340zH.A08(A00, A0Q, 85, R.string.f11nameremoved);
            C19340zH.A05(A00);
            if (i2 == 1 || i2 == 2) {
                i = R.string.f11nameremoved;
            } else {
                if (i2 == 3) {
                    i = R.string.f11nameremoved;
                }
                return A00.create();
            }
            A00.A0A(i);
            return A00.create();
        }
    }

    public final void A76(int i, String str, boolean z) {
        int i2 = i;
        this.A01 = i2;
        String str2 = str;
        this.A0X = str2;
        this.A0d = z;
        int i3 = 33;
        if (i2 != 1) {
            i3 = 34;
            if (i2 != 2) {
                i3 = 31;
            }
        }
        this.A00 = i3;
        AnonymousClass4FS r2 = this.A04;
        String str3 = this.A0Y;
        String str4 = this.A0V;
        String str5 = this.A0W;
        C183538qC r9 = this.A0U;
        AnonymousClass1VX r6 = this.A0D;
        AnonymousClass33p r5 = this.A09;
        C56912sl r7 = this.A0N;
        C116985rC r1 = this.A0A;
        if (r1.A07()) {
            r1.A04();
            throw AnonymousClass001.A0g("getVNameCertForVerifyTwoFactorAuth");
        }
        C993155g r3 = new C993155g(this, r5, r6, r7, this, r9, str3, str4, str5, str2, i2);
        this.A0S = r3;
        r2.BkL(r3, new String[0]);
    }

    public void Bpy() {
        A7A(true);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        if (i == 1) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("VerifyTwoFactorAuth/onActivityResult/REQUEST_CODE_SMS_PERMISSIONS/");
            if (i2 == -1) {
                str = "granted";
            } else {
                str = "denied";
            }
            C18260x0.A1L(A0o, str);
            A7A(false);
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public void A5r() {
        if (!this.A0b) {
            this.A0b = true;
            C88834as A2W = AnonymousClass4SG.A2W(this);
            C64333Db r2 = A2W.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r1, this, AnonymousClass4SG.A2t(r2, r1, this));
            this.A0F = C64333Db.A2q(r2);
            this.A0K = (C28861ht) r2.AJH.get();
            this.A0R = AnonymousClass4SG.A2q(r1);
            this.A0D = (AnonymousClass5WY) r2.AUS.get();
            this.A0J = C86654Ky.A0Z(r2);
            this.A0M = A2W.AD3();
            this.A0B = (C53962nx) r2.A4i.get();
            this.A0O = C86614Ku.A0i(r2);
            this.A0H = C64333Db.A2r(r2);
            this.A0I = C86624Kv.A0S(r2);
            this.A0T = (C613130e) r1.ABh.get();
            this.A0P = AnonymousClass4SG.A2o(r2);
            this.A0G = (AnonymousClass33T) r2.Aaf.get();
            this.A0A = (C116985rC) r2.AOl.get();
            this.A0N = (C56912sl) r2.ATe.get();
            this.A0E = C86614Ku.A0O(r2);
            this.A0U = C72343dZ.A00(r1.ACF);
        }
    }

    public final void A77(long j) {
        CountDownTimer start;
        long j2 = j;
        if (j < 1000) {
            C18270x1.A0g(getPreferences(0).edit(), "code_retry_time");
            CountDownTimer countDownTimer = this.A06;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                start = null;
            } else {
                return;
            }
        } else {
            C18270x1.A0i(getPreferences(0).edit(), "code_retry_time", this.A06.A0H() + j);
            this.A0B.A02(this.A0C);
            this.A0C.setEnabled(false);
            this.A07.setProgress(0);
            this.A08.setText(R.string.f11nameremoved);
            this.A08.setVisibility(0);
            start = new AnonymousClass67Q(this, 2, j2, j).start();
        }
        this.A06 = start;
    }

    public void A78(AnonymousClass5LR r12) {
        this.A0Z = r12.A0A;
        this.A0Y = r12.A09;
        this.A05 = r12.A02;
        this.A02 = r12.A01;
        this.A04 = r12.A00;
        this.A03 = this.A06.A0H();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("VerifyTwoFactorAuth/update-wipe-info type=");
        A0o.append(this.A0Z);
        A0o.append(" token=");
        A0o.append(this.A0Y);
        A0o.append(" wait=");
        A0o.append(this.A05);
        A0o.append(" expire=");
        A0o.append(this.A02);
        A0o.append(" servertime=");
        A0o.append(this.A04);
        AnonymousClass0x2.A18(A0o);
        this.A09.A1k(this.A0Z, this.A0Y, this.A05, this.A02, this.A04, this.A03);
    }

    public void A79(String str, String str2) {
        C116985rC r1 = this.A0A;
        if (r1.A07()) {
            r1.A04();
            throw AnonymousClass001.A0g("setVNameCertSetInRegistration");
        }
        this.A0O.A0D(this.A0V, this.A0W, str2);
        C613130e r2 = this.A0T;
        r2.A0C.BkP(new C70483aZ(r2, str, (String) null, 5, 1));
        this.A0R.A04("2fa", "successful");
        this.A0K.A08(false);
        if (this.A0L.A02) {
            AnonymousClass36l.A0I(this, this.A0G, this.A0O, false);
        } else if (!this.A0a) {
            Log.i("VerifyTwoFactorAuth/removeProgressDialog/");
            this.A0O.A0B(2, true);
            Intent A072 = C18320x8.A07();
            A072.setClassName(getPackageName(), "com.whatsapp.registration.RegisterName");
            A6T(A072, true);
            return;
        } else {
            this.A0O.A0E();
        }
        finish();
    }

    public final void A7A(boolean z) {
        Log.i("VerifyTwoFactorAuth/startOtpVerification");
        this.A09.A01(19);
        C18270x1.A0h(C18270x1.A03(this.A09), "flash_call_eligible", -1);
        AnonymousClass5VN.A00();
        C18260x0.A1P(AnonymousClass001.A0o(), "TestFrameworkIdentifier/Is Jest E2E test? ", C18320x8.A0U());
        A6T(C627736r.A0y(this, (String) null, -1, 0, 0, -1, -1, -1, -1, z, true, this.A0B.A01(), false, false), false);
        finish();
    }

    public final void A7B(boolean z) {
        Log.d("VerifyTwoFactorAuth/stop-checking-if-exists");
        C18290x4.A1L(this.A0Q);
        if (z) {
            this.A02 = -1;
            this.A09.A1k(this.A0Z, this.A0Y, this.A05, -1, this.A04, this.A03);
        }
        this.A0f.removeCallbacks(this.A0h);
    }

    public void BhU() {
        if (this.A0H.A02("android.permission.RECEIVE_SMS") == 0) {
            Log.i("VerifyTwoFactorAuth/proceedWithoutSmsRetriever/NOT requesting RECEIVE_SMS permission");
            A7A(false);
            return;
        }
        Log.i("VerifyTwoFactorAuth/proceedWithoutSmsRetriever/requesting RECEIVE_SMS permission");
        AnonymousClass36l.A0L(this, 1);
    }

    public void Blx(boolean z) {
        this.A0C.setEnabled(z);
        ProgressBar progressBar = this.A07;
        int i = 0;
        if (z) {
            i = 100;
        }
        progressBar.setProgress(i);
    }

    public void onBackPressed() {
        if (this.A0E.A0B(this.A0a)) {
            Log.i("VerifyTwoFactorAuth/onBackPressed/is adding new account");
            AnonymousClass36l.A0D(this, this.A0E, this.A09, this.A0A);
            return;
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        getWindow().addFlags(DefaultCrypto.BUFFER_SIZE);
        setTitle(R.string.f11nameremoved);
        this.A0L = new C105005Te(this, this.A09);
        Intent intent = getIntent();
        if (intent.getExtras() != null && intent.getBooleanExtra("changenumber", false)) {
            Log.d("VerifyTwoFactorAuth/on-create/changenumber");
            this.A0a = true;
        }
        this.A0c = this.A0E.A0B(this.A0a);
        setContentView((int) R.layout.f8nameremoved);
        this.A0R.A01("2fa");
        this.A09.A00();
        AnonymousClass36l.A0K(this.A00, this, this.A00, R.id.title_toolbar, false, false, this.A0c);
        AnonymousClass36l.A0M(this, this.A0I, R.id.title);
        this.A0C = (CodeInputField) C06560Yg.A02(this.A00, R.id.code);
        this.A07 = (ProgressBar) C06560Yg.A02(this.A00, R.id.progress_bar_code_input_blocked);
        this.A08 = C18300x5.A0G(this.A00, R.id.description_bottom);
        Object[] objArr = new Object[1];
        AnonymousClass000.A1P(objArr, 6, 0);
        this.A0C.A0C(new AnonymousClass6AO(this, 3), new AnonymousClass2AT(this, 1), (String) null, getString(R.string.f11nameremoved, objArr), '*', '*', 6);
        this.A0C.setPasswordTransformationEnabled(true);
        Blx(true);
        View findViewById = findViewById(R.id.pin_text);
        View findViewById2 = findViewById(R.id.forgot_pin_text);
        View findViewById3 = findViewById(R.id.two_fa_lock_image);
        if (this.A0I.A0X(5732)) {
            C86654Ky.A16(findViewById3, findViewById, findViewById2, 8, 0);
            AnonymousClass0x2.A0y(findViewById2, this, 49);
        } else {
            C86654Ky.A16(findViewById3, findViewById, findViewById2, 0, 8);
        }
        this.A0V = this.A09.A0Z();
        this.A0W = this.A09.A0b();
        this.A0Z = AnonymousClass1Hf.A27(this).getString("registration_wipe_type", (String) null);
        this.A0Y = AnonymousClass1Hf.A27(this).getString("registration_wipe_token", (String) null);
        this.A05 = AnonymousClass1Hf.A27(this).getLong("registration_wipe_wait", -1);
        this.A02 = AnonymousClass1Hf.A27(this).getLong("registration_wipe_expiry", -1);
        this.A04 = AnonymousClass1Hf.A27(this).getLong("registration_wipe_server_time", -1);
        this.A03 = AnonymousClass0x2.A0A(AnonymousClass0x2.A0F(this.A09), "registration_wipe_info_timestamp");
        if (this.A02 > 0) {
            A7B(false);
            Log.d("VerifyTwoFactorAuth/do-check-if-exists");
            this.A0f.postDelayed(this.A0h, 0);
        }
        if (bundle != null && !bundle2.getBoolean("shouldShowTheForgetPinDialog", false)) {
            A6c("forgotPinDialogTag");
        }
    }

    public Dialog onCreateDialog(int i) {
        if (i == 109) {
            AnonymousClass4FS r11 = this.A04;
            return AnonymousClass36l.A02(this, this.A0D, this.A07, this.A08, this.A0H, this.A0J, this.A0N, r11);
        } else if (i == 124) {
            return AnonymousClass36l.A03(this, this.A0D, this.A00, this.A0J, new C71543cH(this, 24), this.A0V, this.A0W);
        } else if (i == 125) {
            return AnonymousClass36l.A04(this, this.A0D, this.A0J, this.A0V, this.A0W);
        } else {
            switch (i) {
                case 31:
                    ProgressDialog progressDialog = new ProgressDialog(this);
                    C86604Kt.A0y(progressDialog, getString(R.string.f11nameremoved));
                    return progressDialog;
                case 32:
                    C19340zH A002 = AnonymousClass5V0.A00(this);
                    A002.A0g(C86604Kt.A0l(this, R.string.f11nameremoved));
                    C86614Ku.A1O(A002, this, 78, R.string.f11nameremoved);
                    return A002.create();
                case 33:
                    ProgressDialog progressDialog2 = new ProgressDialog(this);
                    C86604Kt.A0y(progressDialog2, getString(R.string.f11nameremoved));
                    return progressDialog2;
                case 34:
                    ProgressDialog progressDialog3 = new ProgressDialog(this);
                    C86604Kt.A0y(progressDialog3, getString(R.string.f11nameremoved));
                    return progressDialog3;
                default:
                    return super.onCreateDialog(i);
            }
        }
    }

    public void onDestroy() {
        C18290x4.A1L(this.A0S);
        A7B(false);
        CountDownTimer countDownTimer = this.A06;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.A06 = null;
        }
        this.A0e = false;
        this.A07.A07(this.A0g);
        this.A0M.A00();
        super.onDestroy();
    }

    public VerifyTwoFactorAuth(int i) {
        this.A0b = false;
        C86604Kt.A1K(this, 87);
    }

    public void A6O(int i) {
        if (i == R.string.f11nameremoved) {
            if (this.A0C.isEnabled()) {
                InputMethodManager A0Q2 = this.A08.A0Q();
                C626936e.A06(A0Q2);
                A0Q2.toggleSoftInput(1, 0);
            }
        } else if (i == R.string.f11nameremoved || i == R.string.f11nameremoved || i == R.string.f11nameremoved) {
            this.A0O.A09();
            startActivity(C627736r.A04(this));
            finish();
        }
    }

    public final int A74() {
        if (AnonymousClass4SG.A2K(this) == 18) {
            return 0;
        }
        if ((this.A03 + (this.A05 * 1000)) - this.A06.A0H() <= 0) {
            String str = this.A0Z;
            if ("offline".equals(str)) {
                return 2;
            }
            if ("full".equals(str)) {
                return 3;
            }
        }
        return 1;
    }

    public final void A75() {
        int A74 = A74();
        long A0H2 = (this.A03 + (this.A05 * 1000)) - this.A06.A0H();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("VerifyTwoFactorAuth/clickForgotPin/resetMode=");
        A0o.append(this.A01);
        A0o.append("/wipeStatus=");
        A0o.append(A74);
        C18260x0.A12("/timeToWaitInMillis=", A0o, A0H2);
        forgotPinDialog forgotpindialog = new forgotPinDialog();
        Bundle A082 = AnonymousClass002.A08();
        A082.putInt("wipeStatus", A74);
        A082.putLong("timeToWaitInMillis", A0H2);
        forgotpindialog.A0u(A082);
        Bon(forgotpindialog, "forgotPinDialogTag");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, R.string.f11nameremoved);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("register-2fa +");
        A0o.append(this.A0V);
        String A0X2 = AnonymousClass000.A0X(this.A0W, A0o);
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            this.A0P.A02("verify-2fa");
            this.A0M.A01(this, this.A0P, A0X2);
            return true;
        } else if (itemId != 1) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            this.A0O.A09();
            AnonymousClass4SG.A35(this);
            return true;
        }
    }

    public void onResume() {
        super.onResume();
        if (this.A06 == null) {
            long j = getPreferences(0).getLong("code_retry_time", -1);
            if (j != -1) {
                A77(j - this.A06.A0H());
            }
        }
        this.A0C.requestFocus();
        TextEmojiLabel A0z = C86664Kz.A0z(this, R.id.description);
        AnonymousClass0x2.A14(this.A0D, A0z);
        AnonymousClass0x2.A12(A0z, this.A08);
        if (this.A0I.A0X(5732)) {
            A0z.setText(R.string.f11nameremoved);
            return;
        }
        int A2K = AnonymousClass4SG.A2K(this);
        int i = R.string.f11nameremoved;
        if (A2K == 18) {
            i = R.string.f11nameremoved;
        }
        A0z.setText(C57002su.A01(new C71543cH(this, 23), getString(i), "forgot-pin"));
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("shouldShowTheForgetPinDialog", AnonymousClass000.A1W(getSupportFragmentManager().A0D("forgotPinDialogTag")));
        super.onSaveInstanceState(bundle);
    }

    public void onStart() {
        super.onStart();
        if (this.A0e) {
            this.A0e = true;
            try {
                this.A07.A06(this.A0g);
            } catch (IllegalStateException unused) {
                Log.d("VerifyTwoFactorAuth/register-connectivity-observer already registered");
            }
        }
    }

    public void onStop() {
        super.onStop();
        Log.i("VerifyTwoFactorAuth/removeProgressDialog/");
        AnonymousClass043 r0 = this.A09;
        if (r0 != null) {
            r0.dismiss();
            this.A09 = null;
        }
        this.A0e = true;
        this.A07.A07(this.A0g);
    }

    public VerifyTwoFactorAuth() {
        this(0);
        this.A0c = false;
        this.A0f = AnonymousClass000.A0A();
        this.A0h = new C71543cH(this, 25);
        this.A0g = new C112695k9(this);
    }
}
