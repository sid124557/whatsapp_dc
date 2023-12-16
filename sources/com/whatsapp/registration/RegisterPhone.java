package com.whatsapp.registration;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass043;
import X.AnonymousClass0Y8;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1Hf;
import X.AnonymousClass2QW;
import X.AnonymousClass314;
import X.AnonymousClass317;
import X.AnonymousClass33K;
import X.AnonymousClass33T;
import X.AnonymousClass33p;
import X.AnonymousClass36l;
import X.AnonymousClass3ZV;
import X.AnonymousClass4FS;
import X.AnonymousClass4SG;
import X.AnonymousClass5EC;
import X.AnonymousClass5J0;
import X.AnonymousClass5M6;
import X.AnonymousClass5OP;
import X.AnonymousClass5V0;
import X.AnonymousClass5VN;
import X.AnonymousClass5X8;
import X.AnonymousClass67R;
import X.AnonymousClass6BO;
import X.AnonymousClass758;
import X.C005205m;
import X.C100525Bg;
import X.C100535Bh;
import X.C102735Kb;
import X.C102805Ki;
import X.C103365Mp;
import X.C105005Te;
import X.C105265Uf;
import X.C106175Xx;
import X.C107195ar;
import X.C107385bE;
import X.C107445bK;
import X.C107695bk;
import X.C108685dO;
import X.C115475oj;
import X.C115505om;
import X.C116985rC;
import X.C118165t6;
import X.C1232467r;
import X.C1233267z;
import X.C1235268t;
import X.C153017aX;
import X.C158857kf;
import X.C159707mK;
import X.C162167rN;
import X.C179628jS;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C18310x6;
import X.C18320x8;
import X.C18330xA;
import X.C183538qC;
import X.C184578sA;
import X.C19340zH;
import X.C386028i;
import X.C43172Rb;
import X.C50152hi;
import X.C52282lE;
import X.C53282mq;
import X.C54292oU;
import X.C55092pm;
import X.C56502s5;
import X.C56912sl;
import X.C57002su;
import X.C57612tv;
import X.C60152y5;
import X.C613630k;
import X.C619933b;
import X.C621333r;
import X.C621433s;
import X.C621533t;
import X.C626936e;
import X.C627236i;
import X.C627736r;
import X.C64333Db;
import X.C66523Lt;
import X.C69263Wi;
import X.C70033Zp;
import X.C70123Zz;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86654Ky;
import X.C86664Kz;
import X.C89234c8;
import X.C97664yy;
import X.C97674z3;
import X.C97694z5;
import X.C989653x;
import X.C993255h;
import X.C994055p;
import X.C997558b;
import X.C997658c;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ScrollView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaEditText;
import com.whatsapp.components.PhoneNumberEntry;
import com.whatsapp.registration.flashcall.FlashCallConsentBottomSheetFragment;
import com.whatsapp.registration.passkeys.PasskeyAndroidApiImpl;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RegisterPhone extends C97664yy implements C184578sA, C179628jS {
    public static boolean A0n;
    public static boolean A0o;
    public int A00 = 30;
    public int A01;
    public long A02 = 0;
    public long A03 = 0;
    public long A04 = 0;
    public long A05 = 0;
    public long A06 = 0;
    public Dialog A07;
    public ScrollView A08;
    public TextView A09;
    public C116985rC A0A;
    public C116985rC A0B;
    public AnonymousClass5M6 A0C;
    public AnonymousClass5EC A0D;
    public TextEmojiLabel A0E;
    public C52282lE A0F;
    public AnonymousClass314 A0G;
    public AnonymousClass33T A0H;
    public AnonymousClass33K A0I;
    public C158857kf A0J;
    public C66523Lt A0K;
    public C619933b A0L;
    public C60152y5 A0M;
    public C50152hi A0N;
    public C55092pm A0O;
    public AnonymousClass2QW A0P;
    public C53282mq A0Q;
    public C115475oj A0R;
    public C115505om A0S;
    public C105265Uf A0T;
    public C993255h A0U;
    public C183538qC A0V;
    public C183538qC A0W;
    public C183538qC A0X;
    public C183538qC A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public boolean A0c;
    public boolean A0d = false;
    public boolean A0e;
    public boolean A0f = false;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j = false;
    public boolean A0k;
    public final C162167rN A0l = C162167rN.A00();
    public final AnonymousClass5OP A0m = new AnonymousClass5OP();

    public final C115475oj A7B() {
        C115475oj r0 = this.A0R;
        if (r0 != null) {
            return r0;
        }
        C115475oj A002 = this.A0C.A00(this, 3, C97674z3.A0c, this.A04, this.A05, this.A0C.A0X(3902));
        this.A0R = A002;
        return A002;
    }

    public void A7D() {
        this.A0e = false;
        this.A00 = 30;
        if (this.A09.getVisibility() == 0) {
            AlphaAnimation A0G2 = C86604Kt.A0G();
            A0G2.setDuration(150);
            this.A09.startAnimation(A0G2);
            C1232467r.A00(A0G2, this, 9);
            return;
        }
        this.A09.setVisibility(8);
    }

    public void A7F() {
        A0n = false;
        String A0T2 = C18270x1.A0T(this.A0I.A02.getText());
        String A0T3 = C18270x1.A0T(this.A0I.A03.getText());
        if (A0T2 == null || A0T3 == null || A0T2.equals("") || AnonymousClass36l.A0B(this.A03, A0T3, A0T2, this.A0Z) == null) {
            A7D();
        } else {
            new AnonymousClass67R(this).start();
        }
    }

    public final void A7J() {
        AnonymousClass317 r2;
        int i;
        Intent A0y;
        A76(0);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("RegisterPhone/startVerificationScreen/useSmsRetriever=");
        A0o2.append(this.A0j);
        A0o2.append("/shouldStartBanAppealFlowForBlockedUser=");
        C18260x0.A1V(A0o2, this.A0i);
        if (this.A0Z) {
            Log.i("RegisterPhone/profile-checkpoint/starting RequestName");
            Intent A072 = C18320x8.A07();
            A072.setClassName(getPackageName(), "com.whatsapp.registration.profilecheckpoint.RequestName");
            startActivityForResult(A072, 4);
            return;
        }
        if (C97674z3.A0i != null) {
            this.A0M.A0B(12, true);
            String str = C97674z3.A0i;
            int i2 = C97674z3.A0c;
            long j = this.A04;
            long j2 = this.A05;
            long j3 = this.A06;
            boolean z = this.A0j;
            A0y = C627736r.A0y(this, str, i2, C97674z3.A0e, C97674z3.A0d, j, j2, j3, -1, z, false, false, false, AnonymousClass000.A1U(this.A00, 3));
        } else if (C97674z3.A0b == 1) {
            this.A0M.A0B(17, true);
            int i3 = C97674z3.A0c;
            long j4 = this.A04;
            long j5 = this.A05;
            long j6 = this.A06;
            long j7 = this.A02;
            boolean z2 = this.A0j;
            AnonymousClass5VN.A00();
            A0y = C627736r.A0y(this, (String) null, i3, C97674z3.A0e, C97674z3.A0d, j4, j5, j6, j7, z2, true, false, false, false);
        } else if (this.A0i) {
            this.A0M.A0B(9, true);
            A0y = C627736r.A0A(this, 0, 3, this.A04, this.A05, 0, false, this.A0j);
        } else if (this.A0Y) {
            int i4 = this.A00;
            AnonymousClass317 r22 = this.A0M;
            if (i4 == 1) {
                r22.A0B(14, true);
                A0y = C627736r.A0E(this, this.A04, this.A05, false, this.A0j);
            } else if (i4 == 3) {
                r22.A0B(16, true);
                A0y = C627736r.A1C(this, false);
            } else {
                r22.A0B(13, true);
                A0y = C627736r.A0A(this, 0, 1, this.A04, this.A05, 0, false, this.A0j);
            }
        } else {
            int i5 = C97674z3.A0e;
            if (i5 == 4) {
                this.A0M.A0B(4, true);
                A0y = C627736r.A0B(this, C97674z3.A0c, this.A04, this.A05, this.A06, -1, false);
            } else {
                if (i5 == 1 || i5 == 3) {
                    r2 = this.A0M;
                    i = 15;
                } else {
                    int i6 = C97674z3.A0d;
                    r2 = this.A0M;
                    if (i6 == 1) {
                        i = 23;
                    } else {
                        r2.A0B(4, true);
                        int i7 = C97674z3.A0c;
                        long j8 = this.A04;
                        long j9 = this.A05;
                        long j10 = this.A06;
                        boolean z3 = this.A0j;
                        AnonymousClass5VN.A00();
                        C18260x0.A1P(AnonymousClass001.A0o(), "TestFrameworkIdentifier/Is Jest E2E test? ", C18320x8.A0U());
                        A0y = C627736r.A0y(this, (String) null, i7, C97674z3.A0e, C97674z3.A0d, j8, j9, j10, -1, z3, true, false, false, false);
                    }
                }
                r2.A0B(i, true);
                int i72 = C97674z3.A0c;
                long j82 = this.A04;
                long j92 = this.A05;
                long j102 = this.A06;
                boolean z32 = this.A0j;
                AnonymousClass5VN.A00();
                C18260x0.A1P(AnonymousClass001.A0o(), "TestFrameworkIdentifier/Is Jest E2E test? ", C18320x8.A0U());
                A0y = C627736r.A0y(this, (String) null, i72, C97674z3.A0e, C97674z3.A0d, j82, j92, j102, -1, z32, true, false, false, false);
            }
        }
        startActivity(A0y);
        finish();
    }

    public void Bpy() {
        this.A0j = true;
        A7J();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0084, code lost:
        if (X.C97674z3.A0a == 16) goto L_0x0086;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r7, int r8, android.content.Intent r9) {
        /*
            r6 = this;
            r3 = 0
            r2 = -1
            if (r7 != 0) goto L_0x006d
            if (r8 != r2) goto L_0x0065
            java.lang.String r0 = "cc"
            java.lang.String r0 = r9.getStringExtra(r0)
            X.C97674z3.A0g = r0
            java.lang.String r0 = "iso"
            java.lang.String r5 = r9.getStringExtra(r0)
            java.lang.String r0 = "country_name"
            java.lang.String r4 = r9.getStringExtra(r0)
            X.5Kb r0 = r6.A0I
            android.widget.EditText r1 = r0.A02
            java.lang.String r0 = X.C97674z3.A0g
            r1.setText(r0)
            X.5Kb r0 = r6.A0I
            android.widget.TextView r0 = r0.A04
            r0.setText(r4)
            X.5Kb r0 = r6.A0I
            com.whatsapp.components.PhoneNumberEntry r0 = r0.A05
            r0.A03(r5)
            android.content.SharedPreferences r5 = r6.getPreferences(r3)
            android.content.SharedPreferences$Editor r4 = r5.edit()
            java.lang.String r1 = "com.whatsapp.registration.RegisterPhone.input_country_code"
            java.lang.String r0 = X.C97674z3.A0g
            r4.putString(r1, r0)
            java.lang.String r1 = "com.whatsapp.registration.RegisterPhone.country_code"
            java.lang.String r0 = X.C97674z3.A0g
            r4.putString(r1, r0)
            java.lang.String r1 = "com.whatsapp.registration.RegisterPhone.phone_number_position"
            int r0 = r5.getInt(r1, r2)
            if (r0 != r2) goto L_0x0055
            r0 = 2147483647(0x7fffffff, float:NaN)
            r4.putInt(r1, r0)
        L_0x0055:
            java.lang.String r0 = "com.whatsapp.registration.RegisterPhone.country_code_position"
            r4.putInt(r0, r2)
            boolean r0 = r4.commit()
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = "RegisterPhone/actresult/commit failed"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0065:
            r6.A0h = r3
            java.lang.String r0 = "RegisterPhone/countrypicker/pickingcountry/false"
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x006c:
            return
        L_0x006d:
            r0 = 1
            if (r7 != r0) goto L_0x008f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "RegisterPhone/sms permission "
            r1.append(r0)
            if (r8 != r2) goto L_0x008c
            java.lang.String r0 = "granted"
        L_0x007d:
            X.C18260x0.A1L(r1, r0)
            int r1 = X.C97674z3.A0a
            r0 = 16
            if (r1 != r0) goto L_0x00bf
        L_0x0086:
            X.5oj r0 = r6.A0R
            r0.A05(r7, r8)
            return
        L_0x008c:
            java.lang.String r0 = "denied"
            goto L_0x007d
        L_0x008f:
            r0 = 155(0x9b, float:2.17E-43)
            if (r7 != r0) goto L_0x00a5
            if (r8 != r2) goto L_0x006c
            X.2oU r2 = r6.A09
            X.33i r1 = r6.A08
            X.5ZR r0 = r6.A0A
            java.lang.String r0 = X.C621333r.A01(r1, r2, r0)
            r6.A0Z = r0
            r6.A7H()
            return
        L_0x00a5:
            r0 = 3
            if (r7 == r0) goto L_0x0086
            r0 = 4
            if (r7 != r0) goto L_0x00c3
            r6.A0Z = r3
            if (r8 != r2) goto L_0x006c
            X.33i r2 = r6.A08
            X.1VW r1 = r6.A0C
            int r0 = X.C97674z3.A0c
            boolean r0 = X.C100535Bh.A00(r2, r1, r0)
            if (r0 == 0) goto L_0x00bf
            r6.A7I()
            return
        L_0x00bf:
            r6.A7J()
            return
        L_0x00c3:
            super.onActivityResult(r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.RegisterPhone.onActivityResult(int, int, android.content.Intent):void");
    }

    public boolean A6C() {
        return this.A0d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005d, code lost:
        if (r8 == 30) goto L_0x005f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A7C(java.lang.String r6, java.lang.String r7, int r8) {
        /*
            r5 = this;
            X.5ZR r0 = r5.A0A
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = "7"
            return r0
        L_0x000b:
            X.5Xx r1 = r5.A03
            java.lang.String r0 = r5.A0Z
            java.lang.String r0 = X.AnonymousClass36l.A0B(r1, r7, r6, r0)
            r4 = 1
            boolean r3 = X.AnonymousClass000.A1W(r0)
            java.lang.String r1 = r5.A0Z
            if (r1 == 0) goto L_0x002a
            boolean r0 = A0o
            if (r0 != 0) goto L_0x002d
            boolean r0 = A0n
            if (r0 != 0) goto L_0x002d
            if (r3 != 0) goto L_0x002d
            boolean r0 = r5.A0k
            if (r0 != 0) goto L_0x002d
        L_0x002a:
            java.lang.String r0 = "6"
            return r0
        L_0x002d:
            java.lang.String r2 = "\\D"
            java.lang.String r0 = ""
            java.lang.String r1 = r1.replaceAll(r2, r0)
            java.lang.String r0 = r7.replaceAll(r2, r0)
            if (r3 != 0) goto L_0x0052
            int r0 = X.AnonymousClass36l.A00(r0, r1)
            if (r0 != 0) goto L_0x0052
        L_0x0041:
            r0 = 30
            if (r8 != r0) goto L_0x005d
            boolean r0 = r5.A0g
            if (r0 == 0) goto L_0x005f
            boolean r0 = r5.A0k
            if (r0 == 0) goto L_0x0054
            if (r4 == 0) goto L_0x007c
            java.lang.String r0 = "0"
            return r0
        L_0x0052:
            r4 = 0
            goto L_0x0041
        L_0x0054:
            if (r4 == 0) goto L_0x007c
            boolean r0 = A0o
            if (r0 == 0) goto L_0x007c
            java.lang.String r0 = "3"
            return r0
        L_0x005d:
            if (r8 != r0) goto L_0x0064
        L_0x005f:
            if (r3 == 0) goto L_0x0064
            java.lang.String r0 = "4"
            return r0
        L_0x0064:
            r0 = 31
            java.lang.String r2 = "2"
            java.lang.String r1 = "1"
            if (r8 != r0) goto L_0x0071
            boolean r0 = r5.A0k
            if (r0 != 0) goto L_0x007b
        L_0x0070:
            return r2
        L_0x0071:
            r0 = 32
            if (r8 != r0) goto L_0x007c
            if (r4 != 0) goto L_0x007c
            boolean r0 = r5.A0k
            if (r0 == 0) goto L_0x0070
        L_0x007b:
            return r1
        L_0x007c:
            java.lang.String r0 = "5"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.RegisterPhone.A7C(java.lang.String, java.lang.String, int):java.lang.String");
    }

    public final void A7G() {
        Log.i("RegisterPhone/reset-state");
        this.A0i = false;
        A76(7);
        AnonymousClass36l.A0O(this.A09, "");
        C97674z3.A0f = 0;
        this.A09.A1U((String) null);
        this.A0M.A0D((String) null, (String) null, (String) null);
        this.A0M.A0B(0, true);
    }

    public final void A7H() {
        C69263Wi r1;
        int i;
        Log.i("RegisterPhone/whats-my-number/permission-granted");
        AnonymousClass5OP r8 = this.A0m;
        r8.A01 = AnonymousClass001.A0f();
        TelephonyManager A0N2 = this.A08.A0N();
        boolean z = false;
        if (A0N2 != null) {
            z = C18310x6.A1W(A0N2.getSimState());
        }
        if (z) {
            Log.i("RegisterPhone/whats-my-number/no-sim");
            r8.A04 = AnonymousClass0x7.A0f();
            r1 = this.A05;
            i = R.string.f11nameremoved;
        } else {
            List<C108685dO> A032 = C621333r.A03(this.A0l, this.A08, this.A0A);
            int size = A032.size();
            C106175Xx r5 = this.A03;
            ArrayList A0s = AnonymousClass001.A0s();
            for (C108685dO r2 : A032) {
                if (C107195ar.A00(r5, r2.A00, r2.A02) == 1) {
                    A0s.add(r2);
                }
            }
            int size2 = A0s.size();
            r8.A03 = Integer.valueOf(AnonymousClass001.A1X(size, size2) ? 1 : 0);
            r8.A04 = Integer.valueOf(size2);
            if (size2 == 0) {
                Log.i("RegisterPhone/whats-my-number/unable-to-get-phone-number-from-sim");
                r1 = this.A05;
                i = R.string.f11nameremoved;
            } else {
                Log.i("RegisterPhone/whats-my-number/show-select-phone-number-dialog");
                this.A0B.A02(this.A0I.A03);
                ArrayList A0J2 = AnonymousClass002.A0J(A0s);
                SelectPhoneNumberDialog selectPhoneNumberDialog = new SelectPhoneNumberDialog();
                Bundle A082 = AnonymousClass002.A08();
                A082.putParcelableArrayList("deviceSimInfoList", A0J2);
                selectPhoneNumberDialog.A0u(A082);
                Bon(selectPhoneNumberDialog, (String) null);
                return;
            }
        }
        r1.A0H(i, 1);
    }

    public final void A7I() {
        int i = C97674z3.A0c;
        if (!this.A0C.A0X(6080) || !(i == 4 || i == 5)) {
            A76(0);
            A6T(C627736r.A0C(this, C97674z3.A0c, this.A04, this.A05, false), true);
            return;
        }
        A76(16);
        Boo(new FlashCallConsentBottomSheetFragment());
        getSupportFragmentManager().A0j(new C107445bK(this, 10), this, "FLASH_CALL_CONSENT_BOTTOM_SHEET_FRAGMENT_RESULT");
    }

    public final void A7K(boolean z) {
        String str;
        String str2;
        Log.i("RegisterPhone/continueToNextScreen");
        C621433s.A00(this, 21);
        this.A09.A1j(C97674z3.A0g, C97674z3.A0h);
        if (!C18280x3.A1W(AnonymousClass1Hf.A27(this), "is_ita_broadcasted") && this.A0C.A0X(5864)) {
            C43172Rb r4 = (C43172Rb) this.A0W.get();
            r4.A04.BkM(new C70123Zz(r4, 42, this));
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("RegisterPhone/continueToNextScreen/autoconf serverStartMessage is ");
        if (C97674z3.A0i != null) {
            str = "valid";
        } else {
            str = "null";
        }
        A0o2.append(str);
        A0o2.append(", waOldEligible: ");
        A0o2.append(C97674z3.A0e);
        A0o2.append(", emailOtpEligible: ");
        A0o2.append(C97674z3.A0b);
        A0o2.append(", shouldStartBanAppealFlowForBlockedUser: ");
        A0o2.append(this.A0i);
        A0o2.append(", passkeyEligibility: ");
        A0o2.append(this.A0T.A02());
        A0o2.append(", flashType :");
        C18260x0.A1G(A0o2, C97674z3.A0c);
        if (C97674z3.A0i != null) {
            str2 = "RegisterPhone/continueToNextScreen/autoconf";
        } else {
            if (!z) {
                this.A0P.A05("enter_number", "passkey_eligibility_check", (String) null, (String) null);
                C997658c A022 = this.A0T.A02();
                C18260x0.A1R(AnonymousClass001.A0o(), "RegisterPhone/isPasskeyEnabled/eligibility=", A022);
                if (A022 == C997658c.ENABLED) {
                    Log.i("RegisterPhone/continueToNextScreen/passkey");
                    A76(17);
                    AnonymousClass5EC r0 = this.A0D;
                    WeakReference A14 = AnonymousClass0x9.A14(this);
                    C118165t6 r5 = new C118165t6(this);
                    C64333Db r42 = r0.A00.A03;
                    C54292oU A2q = C64333Db.A2q(r42);
                    AnonymousClass4FS A8y = C64333Db.A8y(r42);
                    C107695bk r6 = r42.A00;
                    C115505om r9 = new C115505om(C64333Db.A2o(r42), A2q, C64333Db.A2s(r42), (C56912sl) r42.ATe.get(), (C153017aX) r6.A0h.get(), AnonymousClass4SG.A2q(r6), C107695bk.A3S(new PasskeyAndroidApiImpl(r6.ANk())), A8y, A14, r5);
                    this.A0S = r9;
                    Log.i("PasskeyVerification/passkeyLoginEvent/passkey_start_login");
                    C56502s5 r43 = r9.A05;
                    r43.A05("enter_number", "passkey_start_login", (String) null, (String) null);
                    AnonymousClass33p r52 = r9.A02;
                    if (C159707mK.A00(r52.A0Z()) || C159707mK.A00(r52.A0b())) {
                        Log.i("PasskeyVerification/passkeyLoginEvent/passkey_start_login/error=null_or_empty_phone_number");
                        r43.A05("enter_number", "passkey_start_login_error", "null_or_empty_phone_number", (String) null);
                        r9.A09.invoke(C997558b.CODE_REQUEST_FAILURE, (Object) null);
                        return;
                    }
                    AnonymousClass4FS r1 = r9.A07;
                    String A0Z2 = r52.A0Z();
                    String A0b2 = r52.A0b();
                    int A042 = r52.A04();
                    C183538qC r44 = r52.A01;
                    int i = C18300x5.A0B(r44).getInt("pref_flash_call_manage_call_permission_granted", -1);
                    int i2 = C18300x5.A0B(r44).getInt("pref_flash_call_call_log_permission_granted", -1);
                    r1.BkL(new C994055p(r9.A00, r9.A01, r52, r9.A03, r9.A04, new C97694z5(r52.A0F()), r9, A0Z2, A0b2, "passkey", (String) null, (String) null, (String) null, A042, i, i2, true, false), new String[0]);
                    return;
                }
                this.A0P.A05("enter_number", "passkey_eligibility_check_failed", A022.toString(), (String) null);
            }
            if (C97674z3.A0b == 1) {
                str2 = "RegisterPhone/continueToNextScreen/email_otp";
            } else if (this.A0i) {
                str2 = "RegisterPhone/continueToNextScreen/ban_appeal_flow";
            } else {
                int i3 = C97674z3.A0e;
                if (i3 == 1 || i3 == 3 || i3 == 4) {
                    str2 = "RegisterPhone/continueToNextScreen/device_switching";
                } else {
                    if (C97674z3.A0d != 1) {
                        if (!C100535Bh.A00(this.A08, this.A0C, C97674z3.A0c)) {
                            str2 = "RegisterPhone/continueToNextScreen/sms_or_voice";
                        } else if (this.A0Z) {
                            Log.i("RegisterPhone/profile-checkpoint/starting RequestName");
                            Intent A072 = C18320x8.A07();
                            A072.setClassName(getPackageName(), "com.whatsapp.registration.profilecheckpoint.RequestName");
                            startActivityForResult(A072, 4);
                            return;
                        } else {
                            Log.i("RegisterPhone/continueToNextScreen/flash_call");
                            A7I();
                            return;
                        }
                    }
                    C100525Bg.A00(this.A09, this.A09, this, this.A0C.A0X(3902));
                }
            }
        }
        Log.i(str2);
        C100525Bg.A00(this.A09, this.A09, this, this.A0C.A0X(3902));
    }

    public void BhU() {
        int i = C97674z3.A0e;
        if (i == 1 || i == 3 || C97674z3.A0b == 1 || i == 4 || C97674z3.A0d == 1 || this.A0A.A02("android.permission.RECEIVE_SMS") == 0) {
            Log.i("RegisterPhone/proceedWithoutSmsRetriever/NOT requesting RECEIVE_SMS permission");
            this.A0j = false;
            A7J();
            return;
        }
        Log.i("RegisterPhone/proceedWithoutSmsRetriever/requesting RECEIVE_SMS permission");
        AnonymousClass36l.A0L(this, 1);
    }

    public SharedPreferences getPreferences(int i) {
        return this.A0M.A03(getLocalClassName());
    }

    public void onBackPressed() {
        if (this.A0d) {
            Log.i("RegisterPhone/onBackPressed/is adding new account");
            AnonymousClass36l.A0D(this, this.A07, this.A09, this.A0A);
            return;
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        String str;
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        C86624Kv.A1L(this.A04, this, 38);
        setContentView((int) R.layout.f8nameremoved);
        A7E();
        AnonymousClass758.A00(getApplicationContext(), this.A09);
        this.A0Z = C621333r.A01(this.A08, this.A09, this.A0A);
        if (bundle != null) {
            this.A0i = bundle2.getBoolean("shouldStartBanAppealForBlockedUser");
        }
        if (AnonymousClass4SG.A2K(this) != 1) {
            Log.e("RegisterPhone/create/wrong-state bounce to main");
            AnonymousClass4SG.A36(this);
            return;
        }
        boolean A0B2 = this.A07.A0B(this.A02.A01());
        this.A0d = A0B2;
        int i = 0;
        AnonymousClass36l.A0K(this.A00, this, this.A00, R.id.title_toolbar, false, false, A0B2);
        TextView A0L2 = C18310x6.A0L(this, R.id.register_phone_toolbar_title);
        A0L2.setText(R.string.f11nameremoved);
        if (this.A0F.A02(5920)) {
            AnonymousClass0x2.A0q(this, A0L2, R.color.f5nameremoved);
        }
        Intent intent = getIntent();
        if (intent.getExtras() != null) {
            if (intent.getBooleanExtra("com.whatsapp.registration.RegisterPhone.show_underage_account_ban_dialog", false)) {
                C621433s.A01(this, 125);
            }
            if (intent.getBooleanExtra("com.whatsapp.registration.RegisterPhone.resetstate", false)) {
                A7G();
            }
            this.A0c = intent.getBooleanExtra("com.whatsapp.registration.RegisterPhone.clear_phone_number", false);
            if (!(intent.getStringExtra("com.whatsapp.registration.RegisterPhone.country_code") == null || intent.getStringExtra("com.whatsapp.registration.RegisterPhone.phone_number") == null)) {
                C18270x1.A0j(getPreferences(0).edit().putString("com.whatsapp.registration.RegisterPhone.input_phone_number", intent.getStringExtra("com.whatsapp.registration.RegisterPhone.phone_number")), "com.whatsapp.registration.RegisterPhone.input_country_code", intent.getStringExtra("com.whatsapp.registration.RegisterPhone.country_code"));
            }
            if (intent.getBooleanExtra("com.whatsapp.registration.RegisterPhone.tapped_sms_link", false)) {
                Log.i("RegisterPhone/link/instructions/dialog");
                Bou(AnonymousClass002.A0F(this, getString(R.string.f11nameremoved), new Object[1], 0, R.string.f11nameremoved));
            }
        } else {
            this.A0c = false;
        }
        C102735Kb r1 = new C102735Kb();
        this.A0I = r1;
        r1.A05 = (PhoneNumberEntry) findViewById(R.id.registration_fields);
        C102735Kb r2 = this.A0I;
        PhoneNumberEntry phoneNumberEntry = r2.A05;
        phoneNumberEntry.A04 = new C1233267z(this, 1);
        r2.A02 = phoneNumberEntry.A02;
        r2.A04 = C18310x6.A0L(this, R.id.registration_country);
        this.A0I.A04.setBackground(AnonymousClass0x7.A0J(this, this.A00, R.drawable.abc_spinner_textfield_background_material));
        C102735Kb r22 = this.A0I;
        WaEditText waEditText = r22.A05.A03;
        r22.A03 = waEditText;
        waEditText.setTextDirection(3);
        if (C102805Ki.A00(this.A00)) {
            C86634Kw.A1B(this.A0I.A05, this.A0I.A05, getResources().getDimensionPixelSize(R.dimen.f6nameremoved), this.A0I.A05.getPaddingTop(), this.A0I.A05.getPaddingRight());
        }
        this.A08 = (ScrollView) findViewById(R.id.scroll_view);
        TextEmojiLabel A0z = C86664Kz.A0z(this, R.id.registration_info);
        this.A0E = A0z;
        AnonymousClass0x2.A14(this.A0D, A0z);
        AnonymousClass0x2.A12(this.A0E, this.A08);
        TextEmojiLabel textEmojiLabel = this.A0E;
        AnonymousClass5X8 r7 = this.A03;
        String string = getString(R.string.f11nameremoved);
        SpannableStringBuilder A002 = C18330xA.A00(Html.fromHtml(string));
        URLSpan[] uRLSpanArr = (URLSpan[]) A002.getSpans(0, string.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                A002.setSpan(new C89234c8(this, this, r7.A00, r7.A01, r7, r7.A02, uRLSpan.getURL()), A002.getSpanStart(uRLSpan), A002.getSpanEnd(uRLSpan), A002.getSpanFlags(uRLSpan));
            }
            for (URLSpan removeSpan : uRLSpanArr) {
                A002.removeSpan(removeSpan);
            }
        }
        textEmojiLabel.setText(A002);
        this.A0E.setVisibility(8);
        TextView A0L3 = C18310x6.A0L(this, R.id.mistyped_undercard_text);
        this.A09 = A0L3;
        A0L3.setVisibility(8);
        if (C18280x3.A0Z(getPreferences(0), "com.whatsapp.registration.RegisterPhone.input_country_code") == null) {
            TelephonyManager A0N2 = this.A08.A0N();
            if (A0N2 == null) {
                str = "RegisterPhone/tm=null";
            } else {
                String simCountryIso = A0N2.getSimCountryIso();
                if (simCountryIso != null) {
                    try {
                        String A042 = this.A03.A04(simCountryIso);
                        if (A042 != null) {
                            SharedPreferences.Editor edit = getPreferences(0).edit();
                            edit.putString("com.whatsapp.registration.RegisterPhone.input_country_code", A042);
                            if (!edit.commit()) {
                                str = "RegisterPhone/input_cc/commit failed";
                            }
                        }
                    } catch (IOException e) {
                        C18260x0.A15(" failed to lookupCallingCode from CountryPhoneInfo", AnonymousClass000.A0m("RegisterPhone/iso: ", simCountryIso), e);
                    }
                }
            }
            Log.w(str);
        }
        C989653x.A00(this.A0I.A04, this, 27);
        this.A0I.A03.requestFocus();
        this.A0I.A03.setCursorVisible(true);
        String str2 = C97674z3.A0g;
        if (str2 != null) {
            this.A0I.A02.setText(str2);
        }
        String A0u = C86614Ku.A0u(this.A0I.A04);
        if (A0u.length() > 0) {
            this.A0I.A05.A03(A0u);
        }
        if (AnonymousClass36l.A0P(getResources())) {
            getWindow().setSoftInputMode(3);
        }
        if (this.A04.A03()) {
            Log.w("RegisterPhone/clock-wrong");
            C621533t.A02(this, this.A0K, this.A0L);
        } else if (this.A04.A02()) {
            Log.w("RegisterPhone/sw-expired");
            C621533t.A03(this, this.A0K, this.A0L);
        }
        View A003 = C005205m.A00(this, R.id.registration_submit);
        View A004 = C005205m.A00(this, R.id.nta_continue);
        View A005 = C005205m.A00(this, R.id.text_or);
        ViewGroup.LayoutParams layoutParams = A003.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = A004.getLayoutParams();
        int i2 = -2;
        if (this.A0F.A02(6245)) {
            i2 = -1;
        }
        layoutParams.width = i2;
        layoutParams2.width = i2;
        C989653x.A00(A003, this, 28);
        AnonymousClass5J0 A012 = ((C103365Mp) this.A0Y.get()).A01();
        C626936e.A06(A012);
        if (A012.A00 && this.A0F.A02(6840)) {
            A005.setVisibility(0);
            A004.setVisibility(0);
        }
        this.A08.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass6BO((Object) this, 1, (Object) A003));
        Log.i("RegisterPhone/whats-my-number/enabled");
        TextEmojiLabel A0z2 = C86664Kz.A0z(this, R.id.description);
        AnonymousClass0x2.A14(this.A0D, A0z2);
        AnonymousClass0x2.A12(A0z2, this.A08);
        String string2 = getString(R.string.f11nameremoved);
        if (this.A0F.A02(5920)) {
            i = C18300x5.A03(this, R.attr.f3nameremoved, R.color.f5nameremoved);
        }
        C70033Zp r12 = new C70033Zp(this, 43);
        HashMap A0t = AnonymousClass001.A0t();
        A0t.put("whats-my-number", r12);
        A0z2.setText(C57002su.A00((TextAppearanceSpan) null, string2, A0t, i, false));
        A0z2.setLinkTextColor(AnonymousClass0Y8.A04(this, C18290x4.A00(this)));
        C18280x3.A0r(this, R.id.carrier_charge_warning, 0);
        this.A0P.A02("enter_number");
        this.A04.BkP(new C70033Zp(this, 39));
    }

    public Dialog onCreateDialog(int i) {
        C19340zH A002;
        AnonymousClass043 create;
        if (i != 21) {
            return super.onCreateDialog(i);
        }
        Log.i("RegisterPhone/dialog/num_confirm");
        if (this.A0X) {
            boolean booleanValue = Boolean.valueOf(this.A0F.A02(6367)).booleanValue();
            int i2 = R.string.f11nameremoved;
            if (booleanValue) {
                i2 = R.string.f11nameremoved;
            }
            String A0F2 = AnonymousClass002.A0F(this, AnonymousClass4SG.A2v(this.A00, C97674z3.A0g, C97674z3.A0h), AnonymousClass002.A0L(), 0, i2);
            int i3 = R.string.f11nameremoved;
            int i4 = R.string.f11nameremoved;
            if (booleanValue) {
                i3 = R.string.f11nameremoved;
                i4 = R.string.f11nameremoved;
            }
            C19340zH A003 = AnonymousClass5V0.A00(this);
            A003.A0g(AnonymousClass0x9.A0B(A0F2));
            A003.A0i(false);
            C86614Ku.A1O(A003, this, 58, i3);
            A003.A0X(C1235268t.A00(this, 91), i4);
            create = A003.create();
        } else {
            if (this.A0C.A0X(3847)) {
                View A0H2 = C18310x6.A0H(LayoutInflater.from(this), R.layout.f8nameremoved);
                C18300x5.A0G(A0H2, R.id.confirm_phone_number_text_view).setText(AnonymousClass4SG.A2v(this.A00, C97674z3.A0g, C97674z3.A0h));
                A002 = AnonymousClass5V0.A02(this, A0H2);
                A002.A0i(false);
                C1235268t.A03(A002, this, 90, R.string.f11nameremoved);
                C1235268t.A04(A002, this, 91, R.string.f11nameremoved);
            } else {
                String A0F3 = AnonymousClass002.A0F(this, AnonymousClass4SG.A2v(this.A00, C97674z3.A0g, C97674z3.A0h), AnonymousClass002.A0L(), 0, R.string.f11nameremoved);
                A002 = AnonymousClass5V0.A00(this);
                A002.A0g(AnonymousClass0x9.A0B(A0F3));
                A002.A0i(false);
                C1235268t.A03(A002, this, 90, R.string.f11nameremoved);
                A002.A0X(C1235268t.A00(this, 91), R.string.f11nameremoved);
            }
            create = A002.create();
        }
        C86654Ky.A0u(create, this, 7);
        this.A07 = create;
        return create;
    }

    public void onDestroy() {
        if (this.A0U != null) {
            Log.i("RegisterPhone/destroy canceling task");
            this.A0U.A0D(true);
            this.A0U = null;
        }
        this.A0N.A00();
        super.onDestroy();
    }

    public void A66() {
        super.A66();
        if (this.A0d) {
            boolean z = ((C613630k) this.A0V.get()).A02().A02;
            this.A0f = z;
            C18260x0.A1E("RegisterPhone/onActivityStartAsync/isMultiAccountCompanionModeEnabled:", AnonymousClass001.A0o(), z);
            if (this.A0f) {
                this.A05.A0S(new C70033Zp(this, 41));
            }
        }
    }

    public void A79(String str, String str2, String str3) {
        super.A79(str, str2, str3);
        A76(7);
        this.A0P.A04("enter_number", "successful");
        boolean z = this.A0K.A02;
        AnonymousClass317 r2 = this.A0M;
        if (z) {
            AnonymousClass36l.A0I(this, this.A0H, r2, false);
        } else {
            r2.A0B(2, true);
            Intent A072 = C18320x8.A07();
            A072.setClassName(getPackageName(), "com.whatsapp.registration.RegisterName");
            startActivity(A072);
        }
        finish();
    }

    public void A7E() {
        boolean booleanExtra = getIntent().getBooleanExtra("should_show_notif", true);
        if (C107385bE.A0A() && booleanExtra) {
            String[] strArr = {"android.permission.POST_NOTIFICATIONS"};
            RequestPermissionActivity.A0l(this.A09, strArr);
            C005205m.A02(this, strArr, 2);
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent.getBooleanExtra("com.whatsapp.registration.RegisterPhone.tapped_sms_link", false)) {
            Log.i("RegisterPhone/newintent/link/instructions/dialog");
            Bou(AnonymousClass002.A0F(this, getString(R.string.f11nameremoved), AnonymousClass002.A0L(), 0, R.string.f11nameremoved));
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String obj;
        String str;
        String str2;
        Intent intent;
        switch (menuItem.getItemId()) {
            case 0:
                this.A0M.A09();
                AnonymousClass4SG.A35(this);
                return true;
            case 1:
                C627236i.A0D(this, C386028i.A00(AnonymousClass000.A0T(C18290x4.A0m(this.A0I.A02).replaceAll("\\D", ""), C18290x4.A0m(this.A0I.A03).replaceAll("\\D", ""))), C627236i.A0H());
                return true;
            case 2:
                C627236i.A0A(this);
                return true;
            case 3:
                C86624Kv.A1L(this.A04, this, 42);
                return true;
            case 4:
                byte[] A0J2 = C627236i.A0J(this, C386028i.A00(AnonymousClass000.A0T(C18290x4.A0m(this.A0I.A02).replaceAll("\\D", ""), C18290x4.A0m(this.A0I.A03).replaceAll("\\D", ""))));
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("RegisterPhone/rc=");
                if (A0J2 == null) {
                    obj = "(null)";
                } else {
                    StringBuilder A0o3 = AnonymousClass001.A0o();
                    for (byte A1T : A0J2) {
                        Object[] objArr = new Object[1];
                        C18310x6.A1T(objArr, A1T, 0);
                        A0o3.append(String.format("%02X", objArr));
                    }
                    obj = A0o3.toString();
                }
                C18260x0.A1L(A0o2, obj);
                return true;
            case 5:
                C55092pm r1 = this.A0O;
                if (this.A0W) {
                    str = "validNumber";
                } else {
                    str = "notValidNumber";
                }
                r1.A03(str);
                C55092pm r12 = this.A0O;
                if (this.A0V) {
                    str2 = "emptyNumber";
                } else {
                    str2 = "notEmptyNumber";
                }
                r12.A03(str2);
                this.A0O.A02("register-phone");
                this.A0N.A01(this, this.A0O, "register-phone");
                return true;
            case 6:
                startActivity(C18320x8.A07().setClassName(this, "com.whatsapp.DebugToolsActivity"));
                return true;
            case 7:
                this.A0F.A01(2);
                this.A0P.A04("enter_number", "tapped");
                Context context = this.A09.A00;
                intent = C18320x8.A07();
                intent.setClassName(context.getPackageName(), "com.whatsapp.companionmode.registration.RegisterAsCompanionActivity");
                intent.putExtra("entry_point", "entry_phone_reg");
                break;
            case 8:
                C103365Mp.A00(this.A0Y);
                intent = C18320x8.A07();
                intent.setClassName(getPackageName(), "com.whatsapp.bridge.wfs.ui.LinkedUsersActivity");
                break;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
        startActivity(intent);
        finish();
        return true;
    }

    public void onPause() {
        super.onPause();
        C105005Te r1 = this.A0K;
        r1.A02 = true;
        AnonymousClass36l.A0O(r1.A04, AnonymousClass36l.A00);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("RegisterPhone/pause ");
        C18260x0.A1G(A0o2, C97674z3.A0a);
        SharedPreferences.Editor edit = getPreferences(0).edit();
        edit.putString("com.whatsapp.registration.RegisterPhone.country_code", C97674z3.A0g);
        edit.putString("com.whatsapp.registration.RegisterPhone.phone_number", C97674z3.A0h);
        edit.putInt("com.whatsapp.registration.RegisterPhone.verification_state", C97674z3.A0a);
        edit.putString("com.whatsapp.registration.RegisterPhone.input_phone_number", C18290x4.A0m(this.A0I.A03));
        edit.putString("com.whatsapp.registration.RegisterPhone.input_country_code", C18290x4.A0m(this.A0I.A02));
        edit.putInt("com.whatsapp.registration.RegisterPhone.country_code_position", C57612tv.A00(this.A0I.A02));
        edit.putInt("com.whatsapp.registration.RegisterPhone.phone_number_position", C57612tv.A00(this.A0I.A03));
        if (!edit.commit()) {
            Log.w("RegisterPhone/pause/commit failed");
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.clear();
        if (!this.A0d || this.A0f) {
            menu.add(0, 7, 0, R.string.f11nameremoved);
        }
        menu.add(0, 5, 0, R.string.f11nameremoved);
        return super.onPrepareOptionsMenu(menu);
    }

    public void onResume() {
        super.onResume();
        this.A0K.A00();
        SharedPreferences preferences = getPreferences(0);
        C97674z3.A0g = preferences.getString("com.whatsapp.registration.RegisterPhone.country_code", (String) null);
        C97674z3.A0h = preferences.getString("com.whatsapp.registration.RegisterPhone.phone_number", (String) null);
        C97674z3.A0a = preferences.getInt("com.whatsapp.registration.RegisterPhone.verification_state", 7);
        if (this.A0c) {
            this.A0c = false;
            C86634Kw.A1I(this.A0I.A03);
        } else {
            String string = preferences.getString("com.whatsapp.registration.RegisterPhone.input_phone_number", (String) null);
            this.A0I.A03.setText(string);
            if (!TextUtils.isEmpty(string)) {
                this.A0V = false;
                this.A0W = true;
            }
        }
        this.A0I.A02.setText(preferences.getString("com.whatsapp.registration.RegisterPhone.input_country_code", (String) null));
        if (C86634Kw.A1X(this.A0I.A02)) {
            this.A0I.A02.requestFocus();
        }
        C57612tv.A01(this.A0I.A03, preferences.getInt("com.whatsapp.registration.RegisterPhone.phone_number_position", -1));
        C57612tv.A01(this.A0I.A02, preferences.getInt("com.whatsapp.registration.RegisterPhone.country_code_position", -1));
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("RegisterPhone/resume ");
        C18260x0.A1G(A0o2, C97674z3.A0a);
        if (C97674z3.A0a == 15) {
            if (C97674z3.A0g == null || C97674z3.A0h == null) {
                Log.i("RegisterPhone/reset-state");
                A76(7);
            } else {
                C621433s.A01(this, 21);
            }
        }
        this.A0H.A05(1, "RegisterPhone1");
        this.A0M.A0B(1, true);
        AnonymousClass314 r1 = this.A0G;
        r1.A02.A0G();
        AnonymousClass3ZV r12 = r1.A01;
        synchronized (r12) {
            if (r12.A00) {
                r12.A03.clear();
            }
            r12.A01.clear();
        }
        this.A0L.A0E(false);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("shouldStartBanAppealForBlockedUser", this.A0i);
    }
}
