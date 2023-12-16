package X;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.tasks.Task;
import com.whatsapp.R;
import com.whatsapp.registration.ChangeNumber;
import com.whatsapp.registration.RegisterPhone;
import com.whatsapp.registration.report.BanReportViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.4z3  reason: invalid class name and case insensitive filesystem */
public abstract class C97674z3 extends C131836eG implements C185128t8 {
    public static int A0a = 7;
    public static int A0b = -1;
    public static int A0c;
    public static int A0d;
    public static int A0e;
    public static long A0f;
    public static String A0g;
    public static String A0h;
    public static String A0i;
    public int A00;
    public C116985rC A01;
    public C53962nx A02;
    public C106175Xx A03;
    public AnonymousClass5XU A04;
    public AnonymousClass5WY A05;
    public C50382i5 A06;
    public C614930z A07;
    public C53602nM A08;
    public C54292oU A09;
    public AnonymousClass5ZR A0A;
    public C50102hd A0B;
    public AnonymousClass1VW A0C;
    public C56142rU A0D;
    public AnonymousClass4FV A0E;
    public C53652nR A0F;
    public C53202mi A0G;
    public C108565dC A0H;
    public C102735Kb A0I;
    public C28861ht A0J;
    public C105005Te A0K;
    public C56912sl A0L;
    public AnonymousClass317 A0M;
    public AnonymousClass2P0 A0N;
    public C153017aX A0O;
    public C56502s5 A0P;
    public C102305Ii A0Q;
    public BanReportViewModel A0R;
    public C106675Zy A0S;
    public C106715a2 A0T;
    public String A0U;
    public boolean A0V = true;
    public boolean A0W = false;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;

    public static long A0C(String str) {
        return (AnonymousClass36l.A01(str, 0) * 1000) + System.currentTimeMillis();
    }

    public void A74() {
        if (this instanceof RegisterPhone) {
            RegisterPhone registerPhone = (RegisterPhone) this;
            registerPhone.A03 = registerPhone.A06.A0H();
            return;
        }
        ((ChangeNumber) this).A0M.run();
    }

    public final void A75() {
        String str;
        C86624Kv.A1L(this.A04, this, 27);
        if (AnonymousClass36l.A0S(this.A09, false)) {
            Log.i("EnterPhoneNumber/attempt to create autoconf verifier");
            AnonymousClass4FS r2 = this.A04;
            String str2 = A0g;
            String str3 = A0h;
            if (this.A09.A01() == 3) {
                str = "2";
            } else {
                str = "1";
            }
            r2.BkL(new C138206pw(this.A09, this.A0L, this.A0O, str2, str3, str, false), new String[0]);
            return;
        }
        Log.i("EnterPhoneNumber/should not create autoconf verifier");
    }

    public void A76(int i) {
        if (this instanceof RegisterPhone) {
            A0a = i;
            SharedPreferences.Editor edit = ((RegisterPhone) this).getPreferences(0).edit();
            edit.putInt("com.whatsapp.registration.RegisterPhone.verification_state", A0a);
            if (!edit.commit()) {
                Log.w("RegisterPhone/savestate/commit failed");
            }
        }
    }

    public final void A77(AnonymousClass5WM r17) {
        int i;
        Log.i("EnterPhoneNumber/new-installation");
        AnonymousClass36l.A0O(this.A09, AnonymousClass36l.A00);
        A76(15);
        A74();
        AnonymousClass5WM r1 = r17;
        C626936e.A06(r1);
        this.A0X = r1.A0O;
        String str = r1.A0J;
        String str2 = r1.A0K;
        String str3 = r1.A0L;
        String str4 = r1.A0F;
        if (this instanceof RegisterPhone) {
            RegisterPhone registerPhone = (RegisterPhone) this;
            registerPhone.A04 = (AnonymousClass36l.A01(str, 0) * 1000) + System.currentTimeMillis();
            registerPhone.A05 = A0C(str2);
            registerPhone.A06 = A0C(str3);
            registerPhone.A02 = A0C(str4);
            C116985rC r12 = registerPhone.A0B;
            if (r12.A07()) {
                r12.A04();
                throw AnonymousClass001.A0g("smbSaveBusinessNameForRegistration");
            } else if (!registerPhone.A0K.A02) {
                C621433s.A01(registerPhone, 21);
            }
        } else {
            ChangeNumber changeNumber = (ChangeNumber) this;
            AnonymousClass33X r0 = changeNumber.A0E;
            r0.A03();
            r0.A06();
            changeNumber.A0D.A00();
            changeNumber.A0C.A0F(false, 14);
            changeNumber.A01.A0M();
            AnonymousClass002.A0A(changeNumber.getFilesDir(), "me").delete();
            changeNumber.A0M.A0D(A0g, A0h, (String) null);
            int i2 = A0e;
            boolean z = true;
            if (!(i2 == 1 || i2 == 3)) {
                z = false;
            }
            AnonymousClass317 r13 = changeNumber.A0M;
            int i3 = 4;
            if (z) {
                i3 = 15;
            }
            r13.A0B(i3, true);
            changeNumber.A03 = (AnonymousClass36l.A01(str, 0) * 1000) + System.currentTimeMillis();
            changeNumber.A04 = A0C(str2);
            changeNumber.A05 = A0C(str3);
            changeNumber.A02 = A0C(str4);
            if (!((A0i != null && changeNumber.A0C.A0X(4031)) || (i = A0e) == 1 || i == 3 || A0b == 1)) {
                if (C100535Bh.A00(changeNumber.A08, changeNumber.A0C, A0c)) {
                    changeNumber.A6T(C627736r.A0C(changeNumber, A0c, changeNumber.A03, changeNumber.A04, true), true);
                    return;
                } else if (changeNumber.A0A.A02("android.permission.RECEIVE_SMS") != 0) {
                    if (AnonymousClass000.A1T(C159787mS.A00(changeNumber))) {
                        Task A042 = new C127006Qg((Activity) changeNumber).A04();
                        A042.addOnSuccessListener(new AnonymousClass93X(changeNumber, 3));
                        A042.addOnFailureListener(new C123886Ad(changeNumber, 0));
                        return;
                    }
                    Log.i("ChangeNumber/proceedWithoutSmsRetriever/requesting RECEIVE_SMS permission");
                    AnonymousClass36l.A0L(changeNumber, 2);
                    return;
                }
            }
            changeNumber.A7C(false);
        }
    }

    public void A79(String str, String str2, String str3) {
        Log.i("EnterPhoneNumber/registrationHasBeenVerified");
        this.A0M.A0D(str, str2, str3);
        A75();
        this.A0J.A08(false);
    }

    public boolean A7A(String str, String str2, boolean z) {
        if (this.A07.A06()) {
            String A032 = this.A07.A03(str, str2);
            if (!TextUtils.isEmpty(A032)) {
                C19340zH A002 = AnonymousClass5V0.A00(this);
                A002.A0g(C107575bX.A00(this, new Object[]{AnonymousClass4SG.A2v(this.A00, str, str2)}, R.string.f11nameremoved));
                A002.A0d(this, new C110515ga(this, A032, z), R.string.f11nameremoved);
                A002.A0c(this, (C15930sC) null, R.string.f11nameremoved);
                C18280x3.A0q(A002);
                return true;
            }
        }
        return false;
    }

    public void BFd() {
        C621433s.A00(this, 9);
        if (this instanceof RegisterPhone) {
            ((RegisterPhone) this).A0U = null;
        }
    }

    public void Bp8() {
        C621433s.A01(this, 9);
    }

    public Dialog onCreateDialog(int i) {
        ProgressDialog progressDialog;
        int i2;
        int i3 = i;
        if (i3 == 9) {
            return AnonymousClass36l.A06(this, getString(R.string.f11nameremoved));
        }
        if (i3 == 22) {
            Log.w("EnterPhoneNumber/dialog/unrecoverable-error");
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("register-phone2 +");
            A0o.append(A0g);
            String A0X2 = AnonymousClass000.A0X(A0h, A0o);
            C19340zH A002 = AnonymousClass5V0.A00(this);
            A002.A0T(R.string.f11nameremoved);
            A002.A0Y(new AnonymousClass69K(2, A0X2, this), R.string.f11nameremoved);
            C1235268t.A04(A002, this, 86, R.string.f11nameremoved);
            return A002.create();
        } else if (i3 == 109) {
            AnonymousClass4FS r0 = this.A04;
            return AnonymousClass36l.A02(this, this.A05, this.A07, this.A08, this.A0A, this.A0G, this.A0L, r0);
        } else if (i3 != 114) {
            switch (i) {
                case 124:
                    return AnonymousClass36l.A03(this, this.A05, this.A00, this.A0G, (Runnable) null, A0g, A0h);
                case 125:
                    return AnonymousClass36l.A04(this, this.A05, this.A0G, A0g, A0h);
                case 126:
                    AnonymousClass5WY r11 = this.A05;
                    C620733j r12 = this.A00;
                    C53202mi r13 = this.A0G;
                    String str = A0g;
                    String str2 = A0h;
                    return AnonymousClass36l.A08(this.A00, this, this.A05, r11, r12, r13, this.A0H, (Runnable) null, str, str2);
                case 127:
                    progressDialog = new ProgressDialog(this);
                    i2 = R.string.f11nameremoved;
                    break;
                case 128:
                    return AnonymousClass36l.A05(this, (Runnable) null, new C70033Zp(this, 25), new C70033Zp(this, 26));
                case 129:
                    progressDialog = new ProgressDialog(this);
                    i2 = R.string.f11nameremoved;
                    break;
                case 130:
                    C620733j r4 = this.A00;
                    String str3 = A0g;
                    String str4 = A0h;
                    C70033Zp r5 = new C70033Zp(this, 24);
                    int A003 = C385828g.A00(this.A0H.A04);
                    String A2v = AnonymousClass4SG.A2v(r4, str3, str4);
                    StringBuilder A0l = AnonymousClass000.A0l(A2v);
                    A0l.append("\n\n");
                    AnonymousClass0x2.A0s(this, A0l, A003);
                    SpannableString A0A2 = AnonymousClass4L0.A0A(A0l.toString());
                    A0A2.setSpan(new StyleSpan(1), 0, A2v.length() + 2, 33);
                    View inflate = LayoutInflater.from(this).inflate(R.layout.f8nameremoved, (ViewGroup) null);
                    C19340zH A004 = AnonymousClass5V0.A00(this);
                    A004.A0g(A0A2);
                    A004.A0a(inflate);
                    A004.A0i(false);
                    TextView A0G2 = C18300x5.A0G(inflate, R.id.button3);
                    TextView A0G3 = C18300x5.A0G(inflate, R.id.button1);
                    TextView A0G4 = C18300x5.A0G(inflate, R.id.button2);
                    A0G2.setVisibility(0);
                    A0G2.setText(R.string.f11nameremoved);
                    A0G3.setVisibility(0);
                    A0G3.setText(R.string.f11nameremoved);
                    A0G4.setVisibility(0);
                    A0G4.setText(R.string.f11nameremoved);
                    C634339f.A00(A0G2, this, (Object) null, 16);
                    AnonymousClass0x2.A0y(A0G3, this, 29);
                    A0G4.setOnClickListener(new C109525el(this, r5, (Object) null, 5));
                    return A004.create();
                default:
                    return super.onCreateDialog(i3);
            }
            C18320x8.A0w(progressDialog, this, i2);
            progressDialog.setIndeterminate(true);
            progressDialog.setCancelable(false);
            return progressDialog;
        } else {
            C56612sH r15 = this.A06;
            AnonymousClass1VX r2 = this.A0D;
            C50382i5 r122 = this.A06;
            AnonymousClass4FV r1 = this.A0E;
            AnonymousClass5XU r112 = this.A04;
            return C105435Ux.A00(this, this.A00, r112, r122, this.A08, this.A08, r15, this.A00, r2, r1);
        }
    }

    public final void A78(AnonymousClass5WM r3, int i) {
        C18260x0.A0y("EnterPhoneNumber/onStatusNeedsAccountDefenceVerification accountDefenceFlowTypeToStart=", AnonymousClass001.A0o(), i);
        this.A0Y = true;
        this.A00 = i;
        A77(r3);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C107405bG.A05(this);
        C18270x1.A0j(C18270x1.A03(this.A09), "pref_autoconf_status", (String) null);
        this.A09.A1R((String) null);
        C18270x1.A0j(C18270x1.A03(this.A09), "pref_primary_flash_call_status", (String) null);
        C18270x1.A0j(C18270x1.A03(this.A09), "pref_secondary_flash_call_status", (String) null);
        this.A09.A1Z((String) null);
        this.A09.A1Q((String) null);
        this.A09.A1X((String) null);
        C18270x1.A0h(C18270x1.A03(this.A09), "pref_autoconf_verification_status", -1);
        C18270x1.A0l(C18270x1.A03(this.A09), "silent_auth_verification_status", false);
        C18270x1.A0l(C18270x1.A03(this.A09), "pref_flash_call_education_screen_displayed", false);
        C18270x1.A0l(C18270x1.A03(this.A09), "pref_prefer_sms_over_flash", false);
        this.A0K = new C105005Te(this, this.A09);
        C102305Ii r2 = this.A0Q;
        Log.i("ProfileCheckpointUtils/clearing-profile-data");
        C86644Kx.A1Q(r2.A02, r2, 46);
        BanReportViewModel banReportViewModel = (BanReportViewModel) AnonymousClass0x9.A0H(this).A01(BanReportViewModel.class);
        this.A0R = banReportViewModel;
        C86654Ky.A1G(this, banReportViewModel.A01, 182);
        AnonymousClass6C6.A01(this, this.A0R.A02, 283);
    }

    public void onPause() {
        super.onPause();
        C105005Te r1 = this.A0K;
        r1.A02 = true;
        AnonymousClass36l.A0O(r1.A04, AnonymousClass36l.A00);
    }

    public void onResume() {
        super.onResume();
        this.A0K.A00();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0437  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BSY(X.AnonymousClass5WM r24, java.lang.String r25, java.lang.String r26, int r27, long r28) {
        /*
            r23 = this;
            r6 = 21
            r12 = 0
            r8 = 3
            r3 = 1
            r11 = r23
            r2 = r24
            r7 = r27
            if (r24 == 0) goto L_0x009d
            int r4 = r2.A07
            A0e = r4
            java.lang.String r4 = r2.A0I
            A0i = r4
            int r4 = r2.A03
            A0c = r4
            X.33p r4 = r11.A09
            java.lang.String r9 = r2.A0E
            android.content.SharedPreferences$Editor r5 = X.C18270x1.A03(r4)
            java.lang.String r4 = "email_address"
            X.C18270x1.A0j(r5, r4, r9)
            int r9 = r2.A02
            A0b = r9
            X.33p r4 = r11.A09
            android.content.SharedPreferences$Editor r5 = X.C18270x1.A03(r4)
            java.lang.String r4 = "pref_email_otp_eligibility"
            X.C18270x1.A0h(r5, r4, r9)
            int r4 = A0b
            if (r4 != r3) goto L_0x0443
            X.33p r5 = r11.A09
            java.lang.String r4 = "email_otp_eligible"
        L_0x003d:
            r5.A1R(r4)
        L_0x0040:
            int r4 = A0e
            if (r4 == r3) goto L_0x043a
            if (r4 == r8) goto L_0x043a
            int r4 = r2.A07
            if (r4 != 0) goto L_0x004f
            X.33p r4 = r11.A09
            r4.A1Z(r12)
        L_0x004f:
            X.33p r5 = r11.A09
            int r4 = A0e
            boolean r9 = X.AnonymousClass000.A1U(r4, r8)
            android.content.SharedPreferences$Editor r5 = X.C18270x1.A03(r5)
            java.lang.String r4 = "pref_wa_old_for_uc"
            X.C18270x1.A0l(r5, r4, r9)
            int r4 = r2.A04
            A0d = r4
            if (r4 != r3) goto L_0x006d
            X.33p r5 = r11.A09
            java.lang.String r4 = "silent_auth_eligible"
            r5.A1X(r4)
        L_0x006d:
            X.33p r4 = r11.A09
            int r9 = r2.A00
            android.content.SharedPreferences$Editor r5 = X.C18270x1.A03(r4)
            java.lang.String r4 = "autoconf_cf_type"
            X.C18270x1.A0h(r5, r4, r9)
            X.33p r5 = r11.A09
            if (r7 != r6) goto L_0x0437
            java.lang.String r4 = "captcha_eligible"
        L_0x0080:
            r5.A1Q(r4)
            int r9 = r2.A06
            if (r9 <= 0) goto L_0x0090
            android.content.SharedPreferences$Editor r5 = X.AnonymousClass4SG.A2P(r11)
            java.lang.String r4 = "registration_voice_code_length"
            X.C18270x1.A0h(r5, r4, r9)
        L_0x0090:
            int r9 = r2.A05
            if (r9 <= 0) goto L_0x009d
            android.content.SharedPreferences$Editor r5 = X.AnonymousClass4SG.A2P(r11)
            java.lang.String r4 = "registration_sms_code_length"
            X.C18270x1.A0h(r5, r4, r9)
        L_0x009d:
            r10 = 4
            if (r7 == r10) goto L_0x0426
            if (r7 == r8) goto L_0x046f
            r11.A0U = r12
            r5 = r25
            r4 = r26
            if (r7 != r3) goto L_0x00db
            java.lang.String r0 = "EnterPhoneNumber/reinstalled"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r11.A74()
            X.C626936e.A06(r2)
            X.317 r0 = r11.A0M
            java.lang.String r3 = r2.A0T
            r0.A0D(r5, r4, r3)
            X.33p r1 = r11.A09
            boolean r0 = r2.A0W
            r1.A1t(r0)
            X.33p r1 = r11.A09
            boolean r0 = r2.A0V
            r1.A1s(r0)
            X.33p r0 = r11.A09
            boolean r2 = r2.A0U
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "first_party_migration_initiated"
            X.C18270x1.A0l(r1, r0, r2)
            r11.A79(r5, r4, r3)
        L_0x00da:
            return
        L_0x00db:
            r15 = 2
            if (r7 == r15) goto L_0x0422
            r9 = 22
            if (r7 != r9) goto L_0x00ed
            java.lang.String r0 = "EnterPhoneNumber/onExistCheckResponse/wamsys initialization fails"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.3Wi r0 = r11.A05
            X.C386328l.A00(r0)
            return
        L_0x00ed:
            r9 = 5
            if (r7 != r9) goto L_0x01ed
            java.lang.String r0 = "EnterPhoneNumber/blocked"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            if (r24 == 0) goto L_0x0103
            X.5dC r0 = r2.A0B
            if (r0 == 0) goto L_0x0103
            r11.A0H = r0
            com.whatsapp.registration.report.BanReportViewModel r1 = r11.A0R
            java.lang.String r0 = r0.A01
            r1.A00 = r0
        L_0x0103:
            A0g = r25
            A0h = r26
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "+"
            java.lang.String r0 = X.AnonymousClass000.A0U(r0, r5, r4, r1)
            r11.A0U = r0
            if (r24 == 0) goto L_0x03bd
            X.2nZ r0 = r2.A0C
            if (r0 == 0) goto L_0x0129
            X.C626936e.A06(r2)
            X.2nZ r0 = r2.A0C
            android.content.Intent r0 = X.C627736r.A0n(r11, r0)
        L_0x0122:
            r11.startActivity(r0)
        L_0x0125:
            r11.finish()
            return
        L_0x0129:
            boolean r4 = r11 instanceof com.whatsapp.registration.RegisterPhone
            if (r4 == 0) goto L_0x01ae
            r10 = r11
            com.whatsapp.registration.RegisterPhone r10 = (com.whatsapp.registration.RegisterPhone) r10
            java.lang.String r0 = "RegisterPhone/isWfBanFlowAllowedForUnderageUser"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.8qC r0 = r10.A0X
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x01ae
            X.1VW r1 = r10.A0C
            r0 = 5356(0x14ec, float:7.505E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x01ae
            X.5dC r0 = r10.A0H
            if (r0 == 0) goto L_0x01ae
            java.lang.String r0 = r0.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01ae
            X.5dC r0 = r10.A0H
            java.lang.String r1 = r0.A03
            java.lang.String r0 = "u13_checkpoint"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01ae
            java.lang.String r0 = "EnterPhoneNumber/onStatusUserBlocked wfac ban"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "RegisterPhone/startWfBanFlowForUnderageUser"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.317 r0 = r10.A0M
            r0.A0B(r6, r3)
            X.8qC r0 = r10.A0X
            java.lang.Object r0 = r0.get()
            X.C626936e.A06(r0)
            r13 = 14
            X.5dC r0 = r10.A0H
            java.lang.String r11 = r0.A03
            int r14 = r0.A00
            android.content.Intent r3 = X.AnonymousClass32N.A00(r10, r11, r12, r13, r14, r15)
            X.8qC r0 = r10.A0X
            r0.get()
            X.5dC r0 = r10.A0H
            int r2 = r0.A00
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "WfacManager/startWfacBanLogging launchSource {"
            r1.append(r0)
            r1.append(r15)
            java.lang.String r0 = "} vs {"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.AnonymousClass000.A0d(r1)
            X.AnonymousClass356.A01(r0)
            r10.startActivity(r3)
            r10.finish()
            return
        L_0x01ae:
            boolean r0 = r2.A0P
            if (r0 == 0) goto L_0x03bd
            if (r4 == 0) goto L_0x03bd
            com.whatsapp.registration.RegisterPhone r11 = (com.whatsapp.registration.RegisterPhone) r11
            X.5dC r0 = r11.A0H
            if (r0 == 0) goto L_0x03b1
            java.lang.String r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x03b1
            X.5dC r0 = r11.A0H
            java.lang.String r0 = r0.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x03b1
            X.5dC r0 = r11.A0H
            java.lang.String r0 = r0.A04
            boolean r0 = android.text.TextUtils.isDigitsOnly(r0)
            if (r0 == 0) goto L_0x03b1
            X.317 r1 = r11.A0M
            r0 = 10
            r1.A0B(r0, r3)
            X.5dC r0 = r11.A0H
            java.lang.String r1 = r0.A01
            java.lang.String r0 = r0.A04
            int r0 = java.lang.Integer.parseInt(r0)
            android.content.Intent r0 = X.C627736r.A0w(r11, r1, r0, r15)
            goto L_0x0122
        L_0x01ed:
            if (r7 == r10) goto L_0x0426
            if (r7 == r8) goto L_0x046f
            r9 = 6
            if (r7 != r9) goto L_0x021e
            java.lang.String r0 = "EnterPhoneNumber/phone-number-too-long"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5Kb r4 = r11.A0I
            android.widget.TextView r0 = r4.A04
            if (r0 != 0) goto L_0x0219
            X.5Zy r2 = r11.A0S
            X.33j r1 = r11.A00
            java.lang.String r0 = r4.A06
            java.lang.String r4 = r2.A02(r1, r0)
        L_0x0209:
            X.5Te r5 = r11.A0K
            r2 = 2131892891(0x7f121a9b, float:1.9420543E38)
        L_0x020e:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r0 = 0
            r1[r0] = r4
        L_0x0213:
            java.lang.String r0 = r11.getString(r2, r1)
            goto L_0x047d
        L_0x0219:
            java.lang.String r4 = X.C86614Ku.A0u(r0)
            goto L_0x0209
        L_0x021e:
            r9 = 7
            if (r7 != r9) goto L_0x0241
            java.lang.String r0 = "EnterPhoneNumber/phone-number-too-short"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5Kb r4 = r11.A0I
            android.widget.TextView r0 = r4.A04
            if (r0 != 0) goto L_0x023c
            X.5Zy r2 = r11.A0S
            X.33j r1 = r11.A00
            java.lang.String r0 = r4.A06
            java.lang.String r4 = r2.A02(r1, r0)
        L_0x0236:
            X.5Te r5 = r11.A0K
            r2 = 2131892892(0x7f121a9c, float:1.9420545E38)
            goto L_0x020e
        L_0x023c:
            java.lang.String r4 = X.C86614Ku.A0u(r0)
            goto L_0x0236
        L_0x0241:
            r9 = 8
            if (r7 != r9) goto L_0x0295
            java.lang.String r0 = "EnterPhoneNumber/phone-number-bad-format"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5Kb r3 = r11.A0I
            android.widget.TextView r0 = r3.A04
            if (r0 != 0) goto L_0x0290
            X.5Zy r2 = r11.A0S
            X.33j r1 = r11.A00
            java.lang.String r0 = r3.A06
            java.lang.String r3 = r2.A02(r1, r0)
        L_0x025a:
            X.33j r2 = r11.A00
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "+"
            r1.append(r0)
            X.5Kb r0 = r11.A0I
            android.widget.EditText r0 = r0.A02
            android.text.Editable r0 = r0.getText()
            r1.append(r0)
            java.lang.String r0 = X.C58152un.A09
            r1.append(r0)
            X.5Kb r0 = r11.A0I
            android.widget.EditText r0 = r0.A03
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = X.AnonymousClass000.A0R(r0, r1)
            java.lang.String r0 = r2.A0I(r0)
            X.5Te r5 = r11.A0K
            r2 = 2131892888(0x7f121a98, float:1.9420537E38)
            java.lang.Object[] r1 = new java.lang.Object[r15]
            X.AnonymousClass001.A1I(r0, r3, r1)
            goto L_0x0213
        L_0x0290:
            java.lang.String r3 = X.C86614Ku.A0u(r0)
            goto L_0x025a
        L_0x0295:
            r9 = 9
            if (r7 != r9) goto L_0x02dd
            java.lang.String r0 = "EnterPhoneNumber/temporarily-unavailable"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.C626936e.A06(r2)
            java.lang.String r0 = r2.A0H
            if (r0 != 0) goto L_0x02ae
            X.5Te r1 = r11.A0K
            r0 = 2131892945(0x7f121ad1, float:1.9420653E38)
        L_0x02aa:
            r1.A02(r0)
            return
        L_0x02ae:
            long r4 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x02d7 }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r0
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ NumberFormatException -> 0x02d7 }
            long r0 = r0 + r4
            A0f = r0     // Catch:{ NumberFormatException -> 0x02d7 }
            X.317 r0 = r11.A0M     // Catch:{ NumberFormatException -> 0x02d7 }
            r0.A0C(r4)     // Catch:{ NumberFormatException -> 0x02d7 }
            X.5Te r6 = r11.A0K     // Catch:{ NumberFormatException -> 0x02d7 }
            r2 = 2131892946(0x7f121ad2, float:1.9420655E38)
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ NumberFormatException -> 0x02d7 }
            X.33j r0 = r11.A00     // Catch:{ NumberFormatException -> 0x02d7 }
            java.lang.String r0 = X.C107565bW.A0D(r0, r4)     // Catch:{ NumberFormatException -> 0x02d7 }
            java.lang.String r0 = X.C86614Ku.A0s(r11, r0, r1, r2)     // Catch:{ NumberFormatException -> 0x02d7 }
            r6.A03(r0)     // Catch:{ NumberFormatException -> 0x02d7 }
            goto L_0x044b
        L_0x02d7:
            X.5Te r1 = r11.A0K
            r0 = 2131892945(0x7f121ad1, float:1.9420653E38)
            goto L_0x02aa
        L_0x02dd:
            r9 = 12
            if (r7 != r9) goto L_0x02f9
            X.C626936e.A06(r2)
            X.5T0 r2 = r2.A0D
            java.lang.String r0 = "EnterPhoneNumber/old-version"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r2 != 0) goto L_0x03e0
            X.5XU r0 = r11.A04
            r0.A01 = r3
            X.5Te r1 = r11.A0K
            r0 = 114(0x72, float:1.6E-43)
            r1.A01(r0)
            return
        L_0x02f9:
            r9 = 14
            if (r7 == r9) goto L_0x044d
            r9 = 15
            if (r7 == r9) goto L_0x044d
            r9 = 11
            if (r7 != r9) goto L_0x034d
            java.lang.String r2 = "EnterPhoneNumber/too-recent"
            com.whatsapp.util.Log.w((java.lang.String) r2)
            r4 = 0
            java.lang.String r6 = "EnterPhoneNumber/too-recent/time-not-int"
            int r2 = (r28 > r4 ? 1 : (r28 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0343
            r4 = 1000(0x3e8, double:4.94E-321)
            long r0 = r28 * r4
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ NumberFormatException -> 0x0338 }
            long r4 = r4 + r0
            A0f = r4     // Catch:{ NumberFormatException -> 0x0338 }
            X.317 r2 = r11.A0M     // Catch:{ NumberFormatException -> 0x0338 }
            r2.A0C(r0)     // Catch:{ NumberFormatException -> 0x0338 }
            X.5Te r5 = r11.A0K     // Catch:{ NumberFormatException -> 0x0338 }
            r4 = 2131892948(0x7f121ad4, float:1.9420659E38)
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ NumberFormatException -> 0x0338 }
            X.33j r2 = r11.A00     // Catch:{ NumberFormatException -> 0x0338 }
            java.lang.String r0 = X.C107565bW.A0D(r2, r0)     // Catch:{ NumberFormatException -> 0x0338 }
            java.lang.String r0 = X.C86614Ku.A0s(r11, r0, r3, r4)     // Catch:{ NumberFormatException -> 0x0338 }
            r5.A03(r0)     // Catch:{ NumberFormatException -> 0x0338 }
            goto L_0x044c
        L_0x0338:
            r0 = move-exception
            com.whatsapp.util.Log.w(r6, r0)
            X.5Te r1 = r11.A0K
            r0 = 2131892949(0x7f121ad5, float:1.942066E38)
            goto L_0x02aa
        L_0x0343:
            com.whatsapp.util.Log.w((java.lang.String) r6)
            X.5Te r1 = r11.A0K
            r0 = 2131892949(0x7f121ad5, float:1.942066E38)
            goto L_0x02aa
        L_0x034d:
            r0 = 16
            if (r7 != r0) goto L_0x0401
            java.lang.String r0 = "EnterPhoneNumber/onStatusNeedsTwoFa"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r11.A74()
            X.C626936e.A06(r2)
            X.33p r12 = r11.A09
            java.lang.String r13 = r2.A0N
            java.lang.String r14 = r2.A0M
            long r15 = r2.A0A
            r17 = -1
            X.2sH r0 = r11.A06
            long r21 = r0.A0H()
            r19 = r17
            r12.A1k(r13, r14, r15, r17, r19, r21)
            A0g = r25
            A0h = r26
            X.33p r0 = r11.A09
            r0.A1j(r5, r4)
            r11.A75()
            X.2s5 r4 = r11.A0P
            java.lang.String r1 = "enter_number"
            java.lang.String r0 = "successful"
            r4.A04(r1, r0)
            java.lang.String r1 = "sms"
            java.lang.String r0 = r2.A0G
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x03ad
            long r1 = r2.A0A
            int r0 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r0 != 0) goto L_0x03ad
            X.317 r1 = r11.A0M
            r0 = 18
        L_0x039a:
            r1.A0B(r0, r3)
            X.2nx r0 = r11.A02
            boolean r0 = r0.A01()
            android.content.Intent r1 = X.C627736r.A1D(r11, r0)
            r0 = 0
            r11.A6T(r1, r0)
            goto L_0x0125
        L_0x03ad:
            X.317 r1 = r11.A0M
            r0 = 7
            goto L_0x039a
        L_0x03b1:
            X.5Te r0 = r11.A0K
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x00da
            r11.A0i = r3
            X.C621433s.A01(r11, r6)
            return
        L_0x03bd:
            r3 = 124(0x7c, float:1.74E-43)
            X.5Te r0 = r11.A0K
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x00da
            android.content.SharedPreferences r1 = X.AnonymousClass1Hf.A27(r11)
            java.lang.String r0 = "underage_account_banned"
            boolean r2 = X.C18280x3.A1W(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "wa-shared-prefs/getUnderageAccountBanned "
            X.C18260x0.A1D(r0, r1, r2)
            if (r2 == 0) goto L_0x03dc
            r3 = 125(0x7d, float:1.75E-43)
        L_0x03dc:
            X.C621433s.A01(r11, r3)
            return
        L_0x03e0:
            boolean r0 = X.C621433s.A03(r11)
            if (r0 != 0) goto L_0x00da
            X.2sH r14 = r11.A06
            X.33i r13 = r11.A08
            X.33j r15 = r11.A00
            X.1VX r1 = r11.A0D
            X.5a2 r0 = r11.A0T
            X.5hX r12 = r11.A00
            X.4bJ r10 = new X.4bJ
            r16 = r1
            r17 = r2
            r18 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            r10.show()
            return
        L_0x0401:
            r0 = 20
            if (r7 != r0) goto L_0x0409
            r11.A78(r2, r3)
            return
        L_0x0409:
            r0 = 19
            if (r7 != r0) goto L_0x0411
            r11.A78(r2, r15)
            return
        L_0x0411:
            if (r7 != r6) goto L_0x0417
            r11.A78(r2, r8)
            return
        L_0x0417:
            r0 = 23
            if (r7 != r0) goto L_0x00da
            java.lang.String r0 = "EnterPhoneNumber/onStatusProfileCheckpoint"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r11.A0Z = r3
        L_0x0422:
            r11.A77(r2)
            return
        L_0x0426:
            java.lang.String r0 = "EnterPhoneNumber/error-unspecified"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5Te r0 = r11.A0K
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x00da
            r0 = 109(0x6d, float:1.53E-43)
            X.C621433s.A01(r11, r0)
            return
        L_0x0437:
            r4 = r12
            goto L_0x0080
        L_0x043a:
            X.33p r5 = r11.A09
            java.lang.String r4 = "wa_old_eligible"
            r5.A1Z(r4)
            goto L_0x004f
        L_0x0443:
            if (r4 != 0) goto L_0x0040
            X.33p r5 = r11.A09
            java.lang.String r4 = "email_otp_not_eligible"
            goto L_0x003d
        L_0x044b:
            return
        L_0x044c:
            return
        L_0x044d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "EnterPhoneNumber"
            r1.append(r0)
            r0 = 14
            if (r7 != r0) goto L_0x046c
            java.lang.String r0 = "/bad-token"
        L_0x045c:
            X.C18260x0.A1L(r1, r0)
            r0 = 2131892936(0x7f121ac8, float:1.9420634E38)
            java.lang.String r1 = r11.getString(r0)
            X.5Te r0 = r11.A0K
            r0.A03(r1)
            return
        L_0x046c:
            java.lang.String r0 = "/invalid-skey"
            goto L_0x045c
        L_0x046f:
            java.lang.String r0 = "EnterPhoneNumber/error-connectivity"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5Te r5 = r11.A0K
            r0 = 2131892894(0x7f121a9e, float:1.942055E38)
            java.lang.String r0 = X.C86604Kt.A0l(r11, r0)
        L_0x047d:
            r5.A03(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97674z3.BSY(X.5WM, java.lang.String, java.lang.String, int, long):void");
    }
}
