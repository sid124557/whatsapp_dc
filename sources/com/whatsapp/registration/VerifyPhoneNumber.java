package com.whatsapp.registration;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass043;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1Hf;
import X.AnonymousClass1VW;
import X.AnonymousClass1VX;
import X.AnonymousClass317;
import X.AnonymousClass33K;
import X.AnonymousClass33T;
import X.AnonymousClass33p;
import X.AnonymousClass34d;
import X.AnonymousClass36l;
import X.AnonymousClass49Y;
import X.AnonymousClass4FS;
import X.AnonymousClass4FV;
import X.AnonymousClass4L0;
import X.AnonymousClass4LR;
import X.AnonymousClass4LS;
import X.AnonymousClass4ME;
import X.AnonymousClass4SG;
import X.AnonymousClass5LZ;
import X.AnonymousClass5T0;
import X.AnonymousClass5UC;
import X.AnonymousClass5UQ;
import X.AnonymousClass5UY;
import X.AnonymousClass5V0;
import X.AnonymousClass5VK;
import X.AnonymousClass5WY;
import X.AnonymousClass5X2;
import X.AnonymousClass5XU;
import X.AnonymousClass5ZR;
import X.AnonymousClass67Q;
import X.AnonymousClass91E;
import X.C05680Um;
import X.C06200Wq;
import X.C06560Yg;
import X.C100525Bg;
import X.C100535Bh;
import X.C103155Lt;
import X.C103715Od;
import X.C104005Pg;
import X.C105005Te;
import X.C106175Xx;
import X.C106715a2;
import X.C107565bW;
import X.C107635bd;
import X.C107695bk;
import X.C108935do;
import X.C115465oi;
import X.C116985rC;
import X.C117245rc;
import X.C138206pw;
import X.C153017aX;
import X.C158857kf;
import X.C161687qF;
import X.C162167rN;
import X.C162457s7;
import X.C175728Zm;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18300x5;
import X.C18310x6;
import X.C18320x8;
import X.C184588sB;
import X.C185138t9;
import X.C19340zH;
import X.C28861ht;
import X.C47912e2;
import X.C50092hc;
import X.C50102hd;
import X.C50152hi;
import X.C50232hq;
import X.C50382i5;
import X.C53202mi;
import X.C53602nM;
import X.C53732nZ;
import X.C54292oU;
import X.C55092pm;
import X.C56492s4;
import X.C56502s5;
import X.C56612sH;
import X.C56912sl;
import X.C57002su;
import X.C58172up;
import X.C60152y5;
import X.C614930z;
import X.C620733j;
import X.C621433s;
import X.C626936e;
import X.C627736r;
import X.C634339f;
import X.C64333Db;
import X.C69263Wi;
import X.C70143a1;
import X.C70253aC;
import X.C71403c3;
import X.C71543cH;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86654Ky;
import X.C86854Mc;
import X.C88744aj;
import X.C88834as;
import X.C88944b3;
import X.C88994bJ;
import X.C89644eZ;
import X.C97684z4;
import X.C97694z5;
import X.C992555a;
import X.C994055p;
import X.C998658m;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Network;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.telephony.TelephonyManager;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.whatsapp.CodeInputField;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.registration.passkeys.PasskeyAndroidApiImpl;
import com.whatsapp.registration.report.BanReportViewModel;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class VerifyPhoneNumber extends C89644eZ implements C185138t9, C184588sB {
    public static int A1b = 6;
    public static int A1c = 6;
    public static int A1d;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public long A0C;
    public long A0D;
    public ProgressDialog A0E;
    public CountDownTimer A0F;
    public CountDownTimer A0G;
    public Handler A0H;
    public ViewStub A0I;
    public ImageButton A0J;
    public ProgressBar A0K;
    public RelativeLayout A0L;
    public TextView A0M;
    public AnonymousClass043 A0N;
    public C116985rC A0O;
    public C116985rC A0P;
    public CodeInputField A0Q;
    public C106175Xx A0R;
    public C103155Lt A0S;
    public AnonymousClass5XU A0T;
    public AnonymousClass5WY A0U;
    public C56492s4 A0V;
    public TextEmojiLabel A0W;
    public C50382i5 A0X;
    public WaTextView A0Y;
    public WaTextView A0Z;
    public WaTextView A0a;
    public WaTextView A0b;
    public C614930z A0c;
    public C53602nM A0d;
    public C47912e2 A0e;
    public C54292oU A0f;
    public AnonymousClass33T A0g;
    public AnonymousClass5ZR A0h;
    public C50102hd A0i;
    public AnonymousClass1VW A0j;
    public AnonymousClass4FV A0k;
    public AnonymousClass33K A0l;
    public C53202mi A0m;
    public C158857kf A0n;
    public C60152y5 A0o;
    public AnonymousClass5X2 A0p;
    public AnonymousClass5UC A0q;
    public C28861ht A0r;
    public C105005Te A0s;
    public AnonymousClass4LR A0t;
    public C50152hi A0u;
    public C56912sl A0v;
    public AnonymousClass317 A0w;
    public C86854Mc A0x;
    public AnonymousClass4LS A0y;
    public C55092pm A0z;
    public AnonymousClass5UQ A10;
    public C153017aX A11;
    public C97684z4 A12;
    public C103715Od A13;
    public C56502s5 A14;
    public PasskeyAndroidApiImpl A15;
    public BanReportViewModel A16;
    public C106715a2 A17;
    public AnonymousClass5UY A18;
    public AnonymousClass5UY A19;
    public String A1A;
    public String A1B;
    public String A1C;
    public String A1D;
    public String A1E;
    public String A1F;
    public boolean A1G;
    public boolean A1H;
    public boolean A1I;
    public boolean A1J;
    public boolean A1K;
    public boolean A1L;
    public boolean A1M;
    public boolean A1N;
    public boolean A1O;
    public boolean A1P;
    public boolean A1Q;
    public boolean A1R;
    public boolean A1S;
    public boolean A1T;
    public boolean A1U;
    public boolean A1V;
    public boolean A1W;
    public final C162167rN A1X;
    public final AnonymousClass49Y A1Y;
    public final HashMap A1Z;
    public final HashMap A1a;

    public static final String A0C(Intent intent) {
        String str;
        Uri data;
        String path;
        C162457s7.A0J(intent, 0);
        if (SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME.equals(intent.getScheme())) {
            Uri data2 = intent.getData();
            if (data2 != null && AnonymousClass0x9.A1O(data2, "r")) {
                str = data2.getQueryParameter("c");
            }
            str = null;
        } else {
            if (("http".equals(intent.getScheme()) || "https".equals(intent.getScheme())) && (data = intent.getData()) != null && AnonymousClass0x9.A1O(data, "v.whatsapp.com") && (path = data.getPath()) != null) {
                str = path.substring(C175728Zm.A0F(path, "/", path.length() - 1) + 1);
                C162457s7.A0D(str);
            }
            str = null;
        }
        C18260x0.A0s("VerifyPhoneNumberUtils/getCodeFromVerificationLink/code/", str, AnonymousClass001.A0o());
        return str;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005a, code lost:
        r0 = X.C18320x8.A0b(r10, r15, new java.lang.Object[r3], 0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007c, code lost:
        r15 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x003d, code lost:
        if (r0 == -1) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003f, code lost:
        r0 = r0 - java.lang.System.currentTimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0048, code lost:
        if (r0 <= 0) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004a, code lost:
        r2 = new java.lang.Object[2];
        r2[0] = r15;
        r0 = X.C18320x8.A0b(r10, X.C107565bW.A0D(r12, r0), r2, r3, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0056, code lost:
        X.C162457s7.A0H(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0059, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A0X(android.content.res.Resources r10, X.C56612sH r11, X.C620733j r12, X.AnonymousClass5UQ r13, java.lang.String r14, java.lang.String r15) {
        /*
            r4 = 0
            boolean r3 = X.AnonymousClass0x2.A1Y(r10, r12)
            r5 = 2
            X.C18260x0.A0b(r13, r15, r11, r5)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VerifyPhoneNumberUtils/getRequestCodeTooManyTriesErrorMsg/method="
            X.C18260x0.A0s(r0, r14, r1)
            r0 = 2131894986(0x7f1222ca, float:1.9424792E38)
            java.lang.String r7 = X.C86624Kv.A0a(r10, r0)
            java.lang.String r0 = "sms"
            long r0 = r13.A00(r0)
            int r2 = r14.hashCode()
            java.lang.String r6 = "voice"
            switch(r2) {
                case -795576526: goto L_0x0070;
                case 112386354: goto L_0x007e;
                case 2120743944: goto L_0x0061;
                default: goto L_0x0028;
            }
        L_0x0028:
            long r0 = r13.A00(r6)
            r2 = 2131894997(0x7f1222d5, float:1.9424815E38)
            java.lang.String r15 = X.C86624Kv.A0a(r10, r2)
            r9 = 2131892926(0x7f121abe, float:1.9420614E38)
            r8 = 2131892927(0x7f121abf, float:1.9420616E38)
        L_0x0039:
            r6 = -1
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x005a
            long r6 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r6
            r6 = 0
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x005a
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r4] = r15
            java.lang.String r0 = X.C107565bW.A0D(r12, r0)
            java.lang.String r0 = X.C18320x8.A0b(r10, r0, r2, r3, r8)
        L_0x0056:
            X.C162457s7.A0H(r0)
            return r0
        L_0x005a:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r0 = X.C18320x8.A0b(r10, r15, r0, r4, r9)
            goto L_0x0056
        L_0x0061:
            java.lang.String r2 = "email_otp"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x0028
            r9 = 2131893142(0x7f121b96, float:1.9421052E38)
            r8 = 2131893143(0x7f121b97, float:1.9421054E38)
            goto L_0x007c
        L_0x0070:
            boolean r2 = X.AnonymousClass4L0.A0S(r14)
            if (r2 == 0) goto L_0x0028
            r9 = 2131892934(0x7f121ac6, float:1.942063E38)
            r8 = 2131892935(0x7f121ac7, float:1.9420632E38)
        L_0x007c:
            r15 = r7
            goto L_0x0039
        L_0x007e:
            boolean r2 = r14.equals(r6)
            if (r2 == 0) goto L_0x0028
            r9 = 2131892930(0x7f121ac2, float:1.9420622E38)
            r8 = 2131892931(0x7f121ac3, float:1.9420624E38)
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.VerifyPhoneNumber.A0X(android.content.res.Resources, X.2sH, X.33j, X.5UQ, java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [boolean] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A7A() {
        /*
            r13 = this;
            r6 = r13
            boolean r0 = r13.A8C()
            if (r0 == 0) goto L_0x0042
            X.33p r1 = r13.A09
            java.lang.String r0 = "email_otp_choose_flash_or_voice_instead"
            r1.A1R(r0)
            java.lang.String r0 = "VerifyPhoneNumber/requestSecondaryFlashOrVoiceCall/opt out of email verification"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "VerifyPhoneNumber/restartActivityWithVoiceVerification"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            r13.A7Z(r0)
            X.317 r2 = r13.A0w
            r1 = 5
            r0 = 1
            r2.A0B(r1, r0)
            X.5UQ r1 = r13.A10
            java.lang.String r0 = "sms"
            long r7 = r1.A00(r0)
            X.5UQ r1 = r13.A10
            java.lang.String r0 = "voice"
            long r9 = r1.A00(r0)
            boolean r11 = r13.A1W
            boolean r12 = r13.A1G
            android.content.Intent r0 = X.C627736r.A0F(r6, r7, r9, r11, r12)
            r13.finish()
            r13.startActivity(r0)
            return
        L_0x0042:
            boolean r0 = X.AnonymousClass4SG.A4D(r13)
            if (r0 == 0) goto L_0x004c
            r0 = 2
            r13.A7T(r0)
        L_0x004c:
            X.33p r4 = r13.A09
            X.33i r1 = r13.A08
            boolean r3 = X.C18270x1.A1U(r4, r1)
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            r5 = 0
            if (r2 >= r0) goto L_0x009f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FlashCallManager/isEligibleForSecondaryFlashCall/api="
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r2)
        L_0x0065:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0068:
            java.lang.String r2 = "/phoneNumber="
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            if (r5 == 0) goto L_0x00db
            java.lang.String r0 = "VerifyPhoneNumber/requestSecondaryFlashOrVoiceCall/flash/cc="
            r1.append(r0)
            java.lang.String r0 = r13.A1B
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r13.A1E
            X.C18260x0.A1L(r1, r0)
            X.33p r0 = r13.A09
            java.lang.String r2 = "secondary_eligible"
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "pref_secondary_flash_call_status"
            X.C18270x1.A0j(r1, r0, r2)
            X.33p r0 = r13.A09
            r2 = 0
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "is_first_flash_call_request"
            X.C18270x1.A0l(r1, r0, r2)
            r13.A8B(r2)
            return
        L_0x009f:
            android.telephony.TelephonyManager r0 = r1.A0N()
            if (r0 == 0) goto L_0x00ae
            int r0 = r0.getSimState()
            if (r0 != r3) goto L_0x00ae
            java.lang.String r0 = "FlashCallManager/isEligibleForSecondaryFlashCall/sim absent"
            goto L_0x0065
        L_0x00ae:
            X.8qC r2 = r4.A01
            android.content.SharedPreferences r1 = X.C18300x5.A0B(r2)
            java.lang.String r0 = "is_first_flash_call_request"
            boolean r4 = r1.getBoolean(r0, r3)
            android.content.SharedPreferences r1 = X.C18300x5.A0B(r2)
            java.lang.String r0 = "flash_call_eligible"
            int r2 = r1.getInt(r0, r5)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FlashCallManager/isEligibleForSecondaryFlashCall/isFirstSecondaryFlashCallRequest="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "/flashCallEligible="
            X.C18260x0.A0y(r0, r1, r2)
            if (r4 == 0) goto L_0x0068
            if (r2 < r3) goto L_0x0068
            r5 = 1
            goto L_0x0068
        L_0x00db:
            java.lang.String r0 = "VerifyPhoneNumber/requestSecondaryFlashOrVoiceCall/voice/cc="
            r1.append(r0)
            java.lang.String r0 = r13.A1B
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r13.A1E
            X.C18260x0.A1L(r1, r0)
            X.4z5 r2 = X.AnonymousClass4SG.A2p(r13)
            X.33i r0 = r13.A08
            android.telephony.TelephonyManager r0 = r0.A0N()
            r1 = 0
            if (r0 == 0) goto L_0x0101
            int r0 = r0.getSimState()
            if (r0 != r3) goto L_0x0101
            r1 = 1
        L_0x0101:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r2.A01 = r0
            X.33p r0 = r13.A09
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "migrate_from_consumer_app_directly"
            boolean r0 = X.C18280x3.A1W(r1, r0)
            if (r0 == 0) goto L_0x011b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r2.A02 = r0
        L_0x011b:
            r13.A7s(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.VerifyPhoneNumber.A7A():void");
    }

    public final void A7W(int i) {
        AnonymousClass33p r0;
        int i2 = 1;
        AnonymousClass33p r02 = this.A09;
        if (i == 1) {
            C18270x1.A0j(C18270x1.A03(r02), "pref_autoconf_status", "autoconf_authentication_successful");
            r0 = this.A09;
        } else {
            C18270x1.A0j(C18270x1.A03(r02), "pref_autoconf_status", "autoconf_authentication_failed");
            r0 = this.A09;
            i2 = 0;
        }
        C18270x1.A0h(C18270x1.A03(r0), "pref_autoconf_verification_status", i2);
    }

    public final void A7a(long j) {
        A7B();
        long j2 = j;
        if (j < 1000) {
            this.A10.A02();
            return;
        }
        this.A1H = true;
        SharedPreferences.Editor edit = this.A10.A00.edit();
        edit.putLong("com.whatsapp.registration.VerifyPhoneNumber.code_verification_retry_time", System.currentTimeMillis() + j);
        if (!edit.commit()) {
            Log.e("VerifyPhoneNumberPrefs/saveEnterCodeRetryTime/error");
        }
        if (this.A0q.A04()) {
            this.A0q.A03(false);
        } else {
            this.A0Q.setEnabled(false);
        }
        this.A0K.setProgress(0);
        this.A0K.setVisibility(0);
        this.A0M.setText(R.string.f11nameremoved);
        this.A0F = new AnonymousClass67Q(this, 1, j2, j).start();
    }

    public final void A7s(C97694z5 r9, boolean z) {
        A7r(r9, this.A1B, this.A1E, "voice", (String) null, (String) null, z);
    }

    public final void A7v(AnonymousClass5T0 r10) {
        this.A0w.A09();
        A7K();
        if (!C621433s.A03(this)) {
            C56612sH r4 = this.A06;
            new C88994bJ(this, this.A00, this.A08, r4, this.A00, this.A0D, r10, this.A17).show();
        }
    }

    public void A7y(String str) {
        this.A1P = true;
        this.A10.A06(str, this.A1B, this.A1E);
        this.A01 = 0;
        String A0Z2 = this.A09.A0Z();
        String A0b2 = this.A09.A0b();
        AnonymousClass5VK.A00(this.A0O);
        A7t(this.A12, str, A0Z2, A0b2, "sms", (String) null, 2);
    }

    public void A7z(String str) {
        int length;
        int i;
        String str2;
        String str3 = str;
        if (str != null && (length = str.length()) == (i = A1c)) {
            if (length == i) {
                int i2 = 0;
                while (i2 < length) {
                    if (Character.isDigit(str.charAt(i2))) {
                        i2++;
                    }
                }
                String str4 = this.A1B;
                String str5 = this.A1E;
                C626936e.A06(str5);
                if (A8E()) {
                    str2 = "wa_old";
                } else if (A8C()) {
                    str2 = "email_otp";
                } else {
                    str2 = "voice";
                }
                AnonymousClass5VK.A00(this.A0O);
                A7t(this.A12, str3, str4, str5, str2, (String) null, 1);
                return;
            }
            C621433s.A01(this, 29);
        }
    }

    public void A87(boolean z) {
        this.A09.A1R("email_otp_requested");
        this.A09.A1U((String) null);
        String str = this.A1B;
        C626936e.A06(str);
        String str2 = this.A1E;
        C626936e.A06(str2);
        A7r(AnonymousClass4SG.A2p(this), str, str2, "email_otp", (String) null, AnonymousClass4SG.A2w(this), z);
    }

    public void A89(boolean z) {
        this.A09.A1U((String) null);
        String str = this.A1B;
        C626936e.A06(str);
        String str2 = this.A1E;
        C626936e.A06(str2);
        A7r(AnonymousClass4SG.A2p(this), str, str2, "wa_old", (String) null, AnonymousClass4SG.A2w(this), z);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A0L(android.content.res.Resources r12, X.C56612sH r13, X.C620733j r14, X.AnonymousClass5UQ r15, java.lang.String r16, java.lang.String r17) {
        /*
            r6 = r17
            r5 = 0
            boolean r4 = X.AnonymousClass0x2.A1Y(r12, r14)
            r3 = 2
            X.C18260x0.A0b(r15, r6, r13, r3)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VerifyPhoneNumberUtils/getRequestCodeNextMethodErrorMsg/method="
            r9 = r16
            X.C18260x0.A0s(r0, r9, r1)
            r0 = 2131894986(0x7f1222ca, float:1.9424792E38)
            java.lang.String r11 = X.C86624Kv.A0a(r12, r0)
            java.lang.String r8 = "sms"
            long r1 = r15.A00(r8)
            int r0 = r9.hashCode()
            java.lang.String r7 = "voice"
            switch(r0) {
                case -795576526: goto L_0x0067;
                case 114009: goto L_0x0075;
                case 2120743944: goto L_0x005a;
                default: goto L_0x002c;
            }
        L_0x002c:
            r10 = 2131892928(0x7f121ac0, float:1.9420618E38)
            r9 = 2131892929(0x7f121ac1, float:1.942062E38)
        L_0x0032:
            r7 = -1
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0053
            long r7 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r7
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0053
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r5] = r6
            java.lang.String r0 = X.C107565bW.A0D(r14, r1)
            java.lang.String r0 = X.C18320x8.A0b(r12, r0, r3, r4, r9)
        L_0x004f:
            X.C162457s7.A0H(r0)
            return r0
        L_0x0053:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r0 = X.C18320x8.A0b(r12, r6, r0, r5, r10)
            goto L_0x004f
        L_0x005a:
            java.lang.String r0 = "email_otp"
            boolean r0 = r9.equals(r0)
            r10 = 2131893134(0x7f121b8e, float:1.9421036E38)
            r9 = 2131893135(0x7f121b8f, float:1.9421038E38)
            goto L_0x0071
        L_0x0067:
            boolean r0 = X.AnonymousClass4L0.A0S(r9)
            r10 = 2131892932(0x7f121ac4, float:1.9420626E38)
            r9 = 2131892933(0x7f121ac5, float:1.9420628E38)
        L_0x0071:
            if (r0 == 0) goto L_0x002c
            r6 = r11
            goto L_0x0032
        L_0x0075:
            boolean r0 = r9.equals(r8)
            if (r0 == 0) goto L_0x002c
            long r1 = r15.A00(r7)
            r10 = 2131892924(0x7f121abc, float:1.942061E38)
            r9 = 2131892925(0x7f121abd, float:1.9420612E38)
            r0 = 2131894997(0x7f1222d5, float:1.9424815E38)
            java.lang.String r6 = X.C86624Kv.A0a(r12, r0)
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.VerifyPhoneNumber.A0L(android.content.res.Resources, X.2sH, X.33j, X.5UQ, java.lang.String, java.lang.String):java.lang.String");
    }

    public void A5r() {
        if (!this.A1L) {
            this.A1L = true;
            C88834as A2X = AnonymousClass4SG.A2X(this);
            C64333Db r2 = A2X.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r3 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r3, this, AnonymousClass4SG.A2t(r2, r3, this));
            this.A0X = (C50382i5) r2.AZG.get();
            this.A0f = C64333Db.A2q(r2);
            this.A17 = C18280x3.A0Q(r3);
            this.A0k = C64333Db.A4H(r2);
            this.A0T = AnonymousClass4SG.A2d(r2);
            this.A0V = C64333Db.A07(r2);
            this.A0P = C88744aj.A00;
            this.A14 = AnonymousClass4SG.A2q(r3);
            this.A0r = (C28861ht) r2.AJH.get();
            this.A0U = (AnonymousClass5WY) r2.AUS.get();
            this.A0l = C86654Ky.A0Y(r2);
            this.A0j = C86624Kv.A0S(r2);
            this.A0c = C86614Ku.A0O(r2);
            this.A11 = (C153017aX) r3.A0h.get();
            this.A0R = C86604Kt.A0N(r2);
            this.A13 = (C103715Od) r3.A5E.get();
            this.A15 = C107695bk.A3S(new PasskeyAndroidApiImpl(r3.ANk()));
            this.A0e = (C47912e2) r2.AYH.get();
            this.A0m = C86654Ky.A0Z(r2);
            this.A0u = A2X.AD3();
            this.A0i = (C50102hd) r3.A50.get();
            this.A0w = C86614Ku.A0i(r2);
            this.A0h = C64333Db.A2r(r2);
            this.A0n = (C158857kf) r2.AGE.get();
            this.A0z = AnonymousClass4SG.A2o(r2);
            this.A0g = (AnonymousClass33T) r2.Aaf.get();
            this.A0d = C18280x3.A0L(r3);
            this.A0O = (C116985rC) r2.AOl.get();
            this.A0v = (C56912sl) r2.ATe.get();
            this.A0o = C64333Db.A74(r2);
            this.A0S = (C103155Lt) A2X.A0e.get();
            this.A0p = A2X.AD2();
        }
    }

    public int A74() {
        int i = this.A02;
        if (i == 3) {
            return 9;
        }
        if (i == 2) {
            return 14;
        }
        if (i == 1) {
            return 13;
        }
        return 4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0066, code lost:
        if (r0.isNetworkRoaming() != true) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A75() {
        /*
            r9 = this;
            X.1VW r1 = r9.A0j
            r0 = 3977(0xf89, float:5.573E-42)
            boolean r8 = r1.A0X(r0)
            X.1VW r1 = r9.A0j
            r0 = 4056(0xfd8, float:5.684E-42)
            boolean r7 = r1.A0X(r0)
            X.1VW r1 = r9.A0j
            r0 = 4057(0xfd9, float:5.685E-42)
            boolean r6 = r1.A0X(r0)
            X.1VW r1 = r9.A0j
            r0 = 4058(0xfda, float:5.686E-42)
            boolean r5 = r1.A0X(r0)
            X.1VW r1 = r9.A0j
            r0 = 4678(0x1246, float:6.555E-42)
            int r4 = r1.A0N(r0)
            X.33i r3 = r9.A08
            X.2oU r0 = r9.A0f
            android.content.Context r1 = r0.A00
            r2 = 1
            if (r8 == 0) goto L_0x0041
            android.telephony.TelephonyManager r0 = r3.A0N()
            if (r0 == 0) goto L_0x0041
            int r0 = r0.getSimState()
            if (r0 != r2) goto L_0x0041
            r1 = 1
        L_0x003e:
            r9.A03 = r1
            return r1
        L_0x0041:
            if (r7 == 0) goto L_0x004b
            boolean r0 = X.C29441ip.A02(r1)
            if (r0 != r2) goto L_0x004b
            r1 = 2
            goto L_0x003e
        L_0x004b:
            if (r6 == 0) goto L_0x0059
            int r0 = X.C386128j.A00(r3)
            if (r0 != 0) goto L_0x0055
            r1 = 3
            goto L_0x003e
        L_0x0055:
            if (r0 >= r4) goto L_0x0059
            r1 = 4
            goto L_0x003e
        L_0x0059:
            if (r5 == 0) goto L_0x0068
            android.telephony.TelephonyManager r0 = r3.A0N()
            if (r0 == 0) goto L_0x0068
            boolean r0 = r0.isNetworkRoaming()
            r1 = 5
            if (r0 == r2) goto L_0x003e
        L_0x0068:
            r1 = 0
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.VerifyPhoneNumber.A75():int");
    }

    public final long A76(String str) {
        Object obj = this.A1Z.get(str);
        Long A0T2 = AnonymousClass0x2.A0T();
        if (obj == null) {
            obj = A0T2;
        }
        return C18310x6.A0B(obj);
    }

    public final SpannableStringBuilder A77(Runnable runnable, String str, boolean z) {
        int i;
        if (this.A0j.A0X(6290)) {
            i = C18300x5.A03(this, R.attr.f3nameremoved, R.color.f5nameremoved);
        } else {
            i = 0;
        }
        C70143a1 r1 = new C70143a1(this, 11, runnable);
        HashMap A0t2 = AnonymousClass001.A0t();
        A0t2.put("edit-number", r1);
        return C57002su.A00((TextAppearanceSpan) null, str, A0t2, i, z);
    }

    public final void A7B() {
        if (this.A0F != null) {
            Log.i("VerifyPhoneNumber/cancelEnterCodeTimer");
            this.A0F.cancel();
            this.A0F = null;
        }
    }

    public final void A7C() {
        if (this.A0G != null) {
            Log.i("VerifyPhoneNumber/cancel-primary-flash-call-timer");
            this.A0G.cancel();
            this.A0G = null;
        }
    }

    public final void A7D() {
        int i;
        this.A0e.A00();
        C50092hc A0A2 = this.A07.A0A();
        C18260x0.A1R(AnonymousClass001.A0o(), "VerifyPhoneNumber/network/active ", A0A2);
        if (A0A2 == null) {
            i = -1;
        } else if (A0A2.A04) {
            i = 0;
        } else {
            i = 99;
            if (A0A2.A06) {
                i = 1;
            }
        }
        int i2 = this.A05;
        if (i != i2) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("VerifyPhoneNumber/network/switch old=");
            A0o2.append(i2);
            C18260x0.A0y(" new=", A0o2, i);
            this.A05 = i;
            if (i != -1 && this.A0x.hasMessages(1)) {
                Log.i("VerifyPhoneNumber/network/switch/has-retry-pending");
                this.A0x.removeMessages(1);
                this.A01 = 0;
                String A012 = this.A10.A01(this.A1B, this.A1E);
                if (A012 != null) {
                    this.A0x.sendMessage(this.A0x.obtainMessage(1, A012));
                    return;
                }
                Log.e("VerifyPhoneNumber/network/switch/no-saved-code");
            }
        }
    }

    public final void A7E() {
        if (this.A0q.A04()) {
            this.A0q.A01();
        } else {
            C86634Kw.A1I(this.A0Q);
        }
    }

    public final void A7F() {
        AnonymousClass043 r0 = this.A0N;
        if (r0 != null && r0.isShowing()) {
            this.A0N.dismiss();
        }
        this.A0N = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f6 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7G() {
        /*
            r18 = this;
            r6 = r18
            X.33i r1 = r6.A08
            X.5ZR r0 = r6.A0h
            X.7rN r7 = r6.A1X
            java.util.List r0 = X.C621333r.A03(r7, r1, r0)
            X.5Xx r5 = r6.A0R
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.Iterator r3 = r0.iterator()
        L_0x0016:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0031
            java.lang.Object r2 = r3.next()
            X.5dO r2 = (X.C108685dO) r2
            java.lang.String r1 = r2.A00
            java.lang.String r0 = r2.A02
            int r1 = X.C107195ar.A00(r5, r1, r0)
            r0 = 1
            if (r1 != r0) goto L_0x0016
            r4.add(r2)
            goto L_0x0016
        L_0x0031:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = r6.A1B
            r1.append(r0)
            java.lang.String r0 = r6.A1E
            java.lang.String r9 = X.AnonymousClass000.A0X(r0, r1)
            int r0 = r4.size()
            if (r0 != 0) goto L_0x0088
            r0 = -1
        L_0x0047:
            X.4z5 r7 = X.AnonymousClass4SG.A2p(r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.A03 = r0
            X.33p r0 = r6.A09
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "migrate_from_consumer_app_directly"
            boolean r0 = X.C18280x3.A1W(r1, r0)
            r13 = 1
            if (r0 == 0) goto L_0x0066
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)
            r7.A02 = r0
        L_0x0066:
            boolean r0 = r6.A8D()
            if (r0 != 0) goto L_0x00f9
            android.content.SharedPreferences r2 = X.AnonymousClass1Hf.A27(r6)
            java.lang.String r0 = "flash_call_eligible"
            r1 = 0
            int r0 = r2.getInt(r0, r1)
            if (r0 >= r13) goto L_0x00f9
            java.lang.String r0 = "VerifyPhoneNumber/maybeAttemptFlashCall/should not request flash call"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)
            r7.A00 = r0
            r6.A7s(r7, r1)
            return
        L_0x0088:
            java.util.Iterator r3 = r4.iterator()
        L_0x008c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00f6
            java.lang.Object r2 = r3.next()
            X.5dO r2 = (X.C108685dO) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = r2.A00
            r1.append(r0)
            java.lang.String r0 = r2.A02
            java.lang.String r14 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r2 = "ZZ"
            X.8LC r0 = r7.A0F(r9, r2)     // Catch:{ 6zC -> 0x00b2 }
            X.6ug r1 = r7.A0A(r0, r14)     // Catch:{ 6zC -> 0x00b2 }
            goto L_0x00e7
        L_0x00b2:
            r0 = move-exception
            X.6wL r0 = r0.errorType
            X.6wL r1 = X.C141916wL.INVALID_COUNTRY_CODE
            if (r0 != r1) goto L_0x00e5
            X.8LC r0 = r7.A0F(r14, r2)     // Catch:{ 6zC -> 0x00c2 }
            X.6ug r1 = r7.A0A(r0, r9)     // Catch:{ 6zC -> 0x00c2 }
            goto L_0x00e7
        L_0x00c2:
            r0 = move-exception
            X.6wL r0 = r0.errorType
            if (r0 != r1) goto L_0x00e5
            X.8LC r8 = new X.8LC     // Catch:{ 6zC -> 0x00e5 }
            r8.<init>()     // Catch:{ 6zC -> 0x00e5 }
            X.8LC r13 = new X.8LC     // Catch:{ 6zC -> 0x00e5 }
            r13.<init>()     // Catch:{ 6zC -> 0x00e5 }
            r10 = 0
            r11 = 0
            r12 = r11
            r7.A0I(r8, r9, r10, r11, r12)     // Catch:{ 6zC -> 0x00e5 }
            r17 = r11
            r12 = r7
            r15 = r10
            r16 = r11
            r12.A0I(r13, r14, r15, r16, r17)     // Catch:{ 6zC -> 0x00e5 }
            X.6ug r1 = r7.A09(r8, r13)     // Catch:{ 6zC -> 0x00e5 }
            goto L_0x00e7
        L_0x00e5:
            X.6ug r1 = X.C140886ug.NOT_A_NUMBER
        L_0x00e7:
            X.6ug r0 = X.C140886ug.EXACT_MATCH
            if (r1 == r0) goto L_0x00f3
            X.6ug r0 = X.C140886ug.SHORT_NSN_MATCH
            if (r1 == r0) goto L_0x00f3
            X.6ug r0 = X.C140886ug.NSN_MATCH
            if (r1 != r0) goto L_0x008c
        L_0x00f3:
            r0 = 1
            goto L_0x0047
        L_0x00f6:
            r0 = 0
            goto L_0x0047
        L_0x00f9:
            java.lang.String r0 = "VerifyPhoneNumber/maybeAttemptFlashCall/should request flash call"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r8 = r6.A1B
            java.lang.String r9 = r6.A1E
            X.C626936e.A06(r9)
            java.lang.String r10 = "flash"
            r11 = 0
            r12 = r11
            r6.A7r(r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.VerifyPhoneNumber.A7G():void");
    }

    public final void A7H() {
        if (this.A0s.A02 || BHW()) {
            AnonymousClass36l.A0H(this, this.A0g, -1);
        }
    }

    public final void A7I() {
        Boo(RequestOtpCodeBottomSheetFragment.A00(A79(), A76("sms"), A76("voice"), A76("wa_old"), A76("email_otp"), A8E(), A8C()));
    }

    public final void A7J() {
        Log.i("VerifyPhoneNumber/removeProgressDialog");
        ProgressDialog progressDialog = this.A0E;
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        this.A0E = null;
    }

    public final void A7K() {
        Log.i("VerifyPhoneNumber/resetAllVerificationState");
        A7Z(0);
        C86854Mc r0 = this.A0x;
        if (r0 != null && r0.hasMessages(1)) {
            this.A0x.removeMessages(1);
        }
        this.A10.A04("voice");
        this.A10.A04("sms");
        this.A10.A04("wa_old");
        this.A10.A04("email_otp");
        this.A10.A02();
        this.A0p.A02.A00();
    }

    public final void A7N() {
        if (this.A0F != null) {
            A7B();
            this.A10.A02();
            this.A0K.setProgress(100);
            TextView textView = this.A0M;
            Object[] objArr = new Object[1];
            boolean A1Y2 = C18300x5.A1Y(objArr, A1b);
            AnonymousClass001.A0y(this, textView, objArr, R.string.f11nameremoved);
            this.A1H = A1Y2;
            if (this.A0q.A04()) {
                this.A0q.A03(true);
            } else {
                this.A0Q.setEnabled(true);
            }
        }
    }

    public final void A7O() {
        if (this.A1W) {
            if (this.A1V) {
                unregisterReceiver(this.A0y);
                this.A1V = false;
            }
        } else if (this.A1Q) {
            unregisterReceiver(this.A0t);
            this.A1Q = false;
        }
    }

    public final void A7Q() {
        Intent A032;
        if (this.A1G) {
            Log.i("VerifyPhoneNumber/updateUiOnVerificationComplete/change number");
            if (!this.A0w.A0E()) {
                Log.i("VerifyPhoneNumber/updateUiOnVerificationComplete/error completing change number");
                finish();
            }
        }
        if (this.A0s.A02) {
            Log.i("VerifyPhoneNumber/updateUiOnVerificationComplete/notify user to come back and finish registration");
            AnonymousClass36l.A0I(this, this.A0g, this.A0w, this.A1G);
        } else if (this.A1G) {
            Log.i("VerifyPhoneNumber/updateUiOnVerificationComplete/complete change number");
            A032 = C627736r.A03(this);
            startActivity(A032);
            A7J();
            finish();
        }
        Log.i("VerifyPhoneNumber/updateUiOnVerificationComplete/proceed to register name");
        A032 = C18320x8.A07();
        A032.setClassName(getPackageName(), "com.whatsapp.registration.RegisterName");
        startActivity(A032);
        A7J();
        finish();
    }

    public final void A7R() {
        long A002 = this.A10.A00("voice");
        if (A002 != -1) {
            long currentTimeMillis = A002 - System.currentTimeMillis();
            if (currentTimeMillis > 0) {
                A7d(currentTimeMillis, "voice");
            } else {
                this.A10.A04("voice");
            }
        }
    }

    public final void A7S() {
        String str;
        Log.i("VerifyPhoneNumber/saveBackupToken");
        this.A04.BkM(new C71543cH(this, 20));
        if (AnonymousClass36l.A0S(this.A09, this.A1P)) {
            Log.i("VerifyPhoneNumber/attempt to create autoconf verifier");
            A7F();
            AnonymousClass4FS r3 = this.A04;
            boolean z = this.A1P;
            String str2 = this.A1B;
            String str3 = this.A1E;
            if (this.A09.A01() == 3) {
                str = "2";
            } else {
                str = "1";
            }
            r3.BkL(new C138206pw(this.A09, this.A0v, this.A11, str2, str3, str, z), new String[0]);
            return;
        }
        Log.i("VerifyPhoneNumber/should not create autoconf verifier");
    }

    public void A7T(int i) {
        this.A00 = i;
        C104005Pg r2 = this.A0p.A02.A06;
        C18260x0.A0y("AccountDefenceLocalDataRepository/save-acct-defence-state/", AnonymousClass001.A0o(), i);
        SharedPreferences.Editor A002 = C60152y5.A00(r2.A01, "AccountDefenceLocalDataRepository_prefs");
        A002.putInt("com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.account_defence_verification_state", i);
        if (!A002.commit()) {
            Log.e("AccountDefenceLocalDataRepository/save-acct-defence-state/error");
        }
        this.A0W.setText(this.A0p.A00(this, AnonymousClass4SG.A2v(this.A00, this.A1B, this.A1E), this.A00));
    }

    public final void A7U(int i) {
        String str;
        long A2N;
        long A2N2;
        long A2N3;
        long A2N4;
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        boolean z4;
        int i3;
        Intent A0B2;
        int i4;
        int i5 = i;
        A7J();
        BFh();
        boolean A1T2 = AnonymousClass001.A1T(C18280x3.A02(AnonymousClass1Hf.A27(this), "pref_email_otp_eligibility"));
        if ((AnonymousClass000.A1U(AnonymousClass4SG.A2K(this), 12) || AnonymousClass000.A1U(AnonymousClass4SG.A2K(this), 20)) && A1T2) {
            Log.i("VerifyPhoneNumber/maybeTransitionToRelevantRegMethod/fall back to email otp");
            Log.i("VerifyPhoneNumber/restartActivityWithEmailVerification");
            A7Z(0);
            this.A0w.A0B(17, true);
            str = null;
            i5 = this.A04;
            A2N = this.A10.A00("sms");
            A2N2 = this.A10.A00("voice");
            A2N3 = this.A10.A00("wa_old");
            A2N4 = this.A10.A00("email_otp");
            z = this.A1W;
            z2 = this.A1G;
            z3 = false;
            z4 = true;
            i3 = 0;
        } else if ((AnonymousClass000.A1U(AnonymousClass4SG.A2K(this), 12) || AnonymousClass000.A1U(AnonymousClass4SG.A2K(this), 20)) && ((i4 = this.A0B) == 1 || i4 == 3)) {
            Log.i("VerifyPhoneNumber/maybeTransitionToRelevantRegMethod/fall back to device switching");
            A7Z(0);
            this.A0w.A0B(15, true);
            str = null;
            i5 = -1;
            A2N = AnonymousClass4SG.A2N(this, "sms");
            A2N2 = AnonymousClass4SG.A2N(this, "voice");
            A2N3 = AnonymousClass4SG.A2N(this, "wa_old");
            A2N4 = AnonymousClass4SG.A2N(this, "email_otp");
            z = this.A1W;
            z4 = false;
            z2 = this.A1G;
            i3 = this.A0B;
            z3 = false;
        } else if ((AnonymousClass000.A1U(AnonymousClass4SG.A2K(this), 12) || AnonymousClass000.A1U(AnonymousClass4SG.A2K(this), 20)) && this.A0B == 4) {
            Log.i("VerifyPhoneNumber/maybeTransitionToRelevantRegMethod/fall back to device switching self serve");
            A0B2 = C627736r.A0B(this, i5, AnonymousClass4SG.A2N(this, "sms"), AnonymousClass4SG.A2N(this, "voice"), AnonymousClass4SG.A2N(this, "wa_old"), AnonymousClass4SG.A2N(this, "email_otp"), this.A1G);
            finish();
            startActivity(A0B2);
        } else if ((AnonymousClass000.A1U(AnonymousClass4SG.A2K(this), 12) || AnonymousClass000.A1U(AnonymousClass4SG.A2K(this), 20)) && this.A0A == 1) {
            Log.i("VerifyPhoneNumber/maybeTransitionToRelevantRegMethod/fall back to silent auth");
            this.A0w.A0B(23, true);
            str = null;
            A2N = AnonymousClass4SG.A2N(this, "sms");
            A2N2 = AnonymousClass4SG.A2N(this, "voice");
            A2N3 = AnonymousClass4SG.A2N(this, "wa_old");
            A2N4 = AnonymousClass4SG.A2N(this, "email_otp");
            z = this.A1W;
            z2 = this.A1G;
            z3 = false;
            i2 = this.A0A;
            z4 = true;
            i3 = 0;
            A0B2 = C627736r.A0y(this, str, i5, i3, i2, A2N, A2N2, A2N3, A2N4, z, z4, z2, z3, z3);
            finish();
            startActivity(A0B2);
        } else if ((AnonymousClass000.A1U(AnonymousClass4SG.A2K(this), 12) || AnonymousClass000.A1U(AnonymousClass4SG.A2K(this), 20) || AnonymousClass000.A1U(AnonymousClass4SG.A2K(this), 23)) && C100535Bh.A00(this.A08, this.A0j, i5)) {
            Log.i("VerifyPhoneNumber/maybeTransitionToRelevantRegMethod/fall back to flash call");
            A6T(C627736r.A0C(this, i5, AnonymousClass4SG.A2N(this, "sms"), AnonymousClass4SG.A2N(this, "voice"), this.A1G), true);
            return;
        } else if (AnonymousClass000.A1U(AnonymousClass4SG.A2K(this), 12) || AnonymousClass000.A1U(AnonymousClass4SG.A2K(this), 20) || AnonymousClass000.A1U(AnonymousClass4SG.A2K(this), 23) || A8D()) {
            Log.i("VerifyPhoneNumber/maybeTransitionToRelevantRegMethod/fall back to sms");
            A7c(AnonymousClass4SG.A2N(this, "sms"), AnonymousClass4SG.A2N(this, "voice"));
            return;
        } else {
            return;
        }
        i2 = 0;
        A0B2 = C627736r.A0y(this, str, i5, i3, i2, A2N, A2N2, A2N3, A2N4, z, z4, z2, z3, z3);
        finish();
        startActivity(A0B2);
    }

    public final void A7Z(int i) {
        A1d = i;
        SharedPreferences.Editor edit = getPreferences(0).edit();
        edit.putInt("com.whatsapp.registration.VerifyPhoneNumber.verification_state", A1d);
        if (!edit.commit()) {
            Log.w("VerifyPhoneNumber/savestate/commit failed");
        }
    }

    public final void A7c(long j, long j2) {
        long j3;
        Log.i("VerifyPhoneNumber/restartActivityWithSmsVerification");
        A7Z(0);
        if (A8D()) {
            C18270x1.A0j(C18270x1.A03(this.A09), "pref_primary_flash_call_status", "primary_failed");
        }
        if (!A8C()) {
            C621433s.A01(this, 43);
        }
        C69263Wi r2 = this.A05;
        C70253aC r3 = new C70253aC(this, 2, j, j2);
        if (A8C()) {
            j3 = 0;
        } else {
            j3 = 1500;
        }
        r2.A0T(r3, j3);
    }

    public final void A7d(long j, String str) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i > 0) {
            if (j < 3000) {
                return;
            }
        } else if (i < 0) {
            AnonymousClass0x2.A1J(str, this.A1Z, -1000);
            return;
        }
        HashMap hashMap = this.A1a;
        if (hashMap.get(str) != null) {
            ((CountDownTimer) hashMap.get(str)).cancel();
            AnonymousClass0x2.A1J(str, this.A1Z, 0);
        }
        C18260x0.A0s("VerifyPhoneNumber/getRequestCodeCountdownTimer/codeMethod=", str, AnonymousClass001.A0o());
        hashMap.put(str, new AnonymousClass4ME(this, str, j));
        ((CountDownTimer) hashMap.get(str)).start();
    }

    public final void A7f(long j, String str, boolean z, long j2) {
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("VerifyPhoneNumber/");
        A0o2.append(str);
        A0o2.append("/launchAccountDefenceFlow deviceConfirmationFlow: ");
        boolean z2 = z;
        A0o2.append(z2);
        A0o2.append(", smsWait: ");
        A0o2.append(j);
        C18260x0.A12(", voiceWait: ", A0o2, j2);
        this.A14.A04(A78(), "successful");
        AnonymousClass317 r4 = this.A0w;
        int i = 13;
        if (z) {
            i = 14;
        }
        r4.A0B(i, true);
        A7Z(0);
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = j * 1000;
        long j4 = j2 * 1000;
        long j5 = j3 + currentTimeMillis;
        long j6 = j4 + currentTimeMillis;
        AnonymousClass5UQ r42 = this.A10;
        long min = Math.min(j5, j6);
        SharedPreferences.Editor edit = r42.A00.edit();
        edit.putLong("com.whatsapp.registration.VerifyPhoneNumber.code_verification_retry_time", min);
        if (!edit.commit()) {
            Log.e("VerifyPhoneNumberPrefs/saveEnterCodeRetryTime/error");
        }
        this.A0p.A01(j3, j4);
        A7M();
        C621433s.A01(this, 44);
        this.A05.A0T(new C117245rc(this, j5, j6, z2), 1500);
    }

    public final void A7g(Network network) {
        String str;
        String str2;
        TelephonyManager A0N2;
        Log.i("VerifyPhoneNumber/executeSilentAuthCoverageRequest");
        if (this.A0j.A0X(6386)) {
            str = C58172up.A0N;
        } else {
            str = C58172up.A0O;
        }
        String str3 = "";
        if (!this.A0j.A0X(6655) || (A0N2 = this.A08.A0N()) == null) {
            str2 = str3;
        } else {
            AnonymousClass34d A002 = AnonymousClass34d.A00(A0N2.getSimOperator());
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("&mcc=");
            A0o2.append(A002.A00);
            A0o2.append("&");
            A0o2.append("mnc");
            A0o2.append("=");
            str2 = AnonymousClass000.A0X(A002.A01, A0o2);
        }
        StringBuilder A0m2 = AnonymousClass000.A0m(str, "&");
        A0m2.append("phone");
        A0m2.append("=");
        A0m2.append(this.A1B);
        A0m2.append(this.A1E);
        if (!TextUtils.isEmpty(str2)) {
            str3 = str2;
        }
        C71403c3.A00(this.A04, this, network, AnonymousClass000.A0X(str3, A0m2), 12);
    }

    public final void A7r(C97694z5 r23, String str, String str2, String str3, String str4, String str5, boolean z) {
        String str6;
        if (!AnonymousClass4SG.A4D(this)) {
            Log.d("VerifyPhoneNumber/shouldRequestCodeBeAllowed/returning true since we're not in AD");
        } else {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("VerifyPhoneNumber/shouldRequestCodeBeAllowed/accountDefenceVerificationState ");
            C18260x0.A1F(A0o2, this.A00);
            int i = this.A00;
            if (!(i == 2 || i == 3)) {
                Log.w("VerifyPhoneNumber/executeRequestCodeTask should not request code yet, returning");
                return;
            }
        }
        AnonymousClass4FS r2 = this.A04;
        int A042 = this.A09.A04();
        int i2 = AnonymousClass1Hf.A27(this).getInt("pref_flash_call_manage_call_permission_granted", -1);
        int i3 = AnonymousClass1Hf.A27(this).getInt("pref_flash_call_call_log_permission_granted", -1);
        C54292oU r5 = this.A0f;
        boolean A1U2 = AnonymousClass000.A1U(this.A02, 3);
        if (AnonymousClass000.A1U(AnonymousClass4SG.A2K(this), 19)) {
            str6 = "twofac_reset";
        } else {
            int i4 = this.A02;
            if (i4 == 2 || i4 == 1) {
                str6 = "account_defence";
            } else if (i4 == 3) {
                str6 = "ban_appeal";
            } else {
                str6 = null;
            }
        }
        r2.BkL(new C994055p(this.A08, r5, this.A09, this.A0v, this.A11, r23, this, str, str2, str3, str4, str5, str6, A042, i2, i3, z, A1U2), new String[0]);
    }

    public void A7t(C97684z4 r18, String str, String str2, String str3, String str4, String str5, int i) {
        String str6;
        AnonymousClass4FS r2 = this.A04;
        AnonymousClass33p r5 = this.A09;
        C56912sl r6 = this.A0v;
        C153017aX r7 = this.A11;
        boolean A1U2 = AnonymousClass000.A1U(this.A02, 3);
        if (AnonymousClass000.A1U(AnonymousClass4SG.A2K(this), 19)) {
            str6 = "twofac_reset";
        } else {
            int i2 = this.A02;
            if (i2 == 2 || i2 == 1) {
                str6 = "account_defence";
            } else if (i2 == 3) {
                str6 = "ban_appeal";
            } else {
                str6 = null;
            }
        }
        r2.BkL(new C992555a(r5, r6, r7, r18, this, str2, str3, str4, str6, str5, i, A1U2), str);
    }

    public final void A7u(C53732nZ r3) {
        if (r3 == null) {
            this.A0M.setText(R.string.f11nameremoved);
            this.A0W.setVisibility(8);
            this.A0L.setVisibility(8);
            C621433s.A01(this, 124);
            return;
        }
        this.A0w.A09();
        A7K();
        startActivity(C627736r.A0n(this, r3));
        finish();
    }

    public final void A7w(Runnable runnable) {
        if (this.A0N == null) {
            View A0G2 = C86654Ky.A0G(this, R.layout.f8nameremoved);
            C19340zH A022 = AnonymousClass5V0.A02(this, A0G2);
            A022.A0i(false);
            this.A0N = A022.create();
            C18300x5.A0G(A0G2, R.id.dialog_title).setText(R.string.f11nameremoved);
            TextEmojiLabel A0K2 = AnonymousClass0x7.A0K(A0G2, R.id.dialog_message);
            A0K2.setText(R.string.f11nameremoved);
            HashMap A0t2 = AnonymousClass001.A0t();
            A0t2.put("learn-more", this.A03.A00("https://faq.whatsapp.com/729321962119902/"));
            Context context = A0G2.getContext();
            AnonymousClass1VX r10 = this.A0D;
            C107635bd.A0G(context, this.A00, this.A05, A0K2, this.A08, r10, C86624Kv.A0b(A0G2, R.string.f11nameremoved), A0t2);
            SpannableString A0A2 = AnonymousClass4L0.A0A(A0K2.getText());
            ((C88944b3[]) A0A2.getSpans(0, A0A2.length(), C88944b3.class))[0].A02 = new C161687qF(this, 0);
            if (this.A0N.getWindow() != null) {
                C18310x6.A0x(this, this.A0N.getWindow(), R.color.f5nameremoved);
            }
            C634339f.A00(C06560Yg.A02(A0G2, R.id.continue_button), this, runnable, 20);
            this.A0N.show();
        }
    }

    public final void A7x(Runnable runnable, String str, boolean z) {
        if ((!str.equals("autoconf") || !this.A0j.A0X(3131)) && !str.equals("silent_auth")) {
            if (z) {
                Log.i("VerifyPhoneNumber/showVerifiedCompleteDialog/go to 2FA screen");
            } else {
                Log.i("VerifyPhoneNumber/showVerifiedCompleteDialog/show old verification complete dialog");
                AnonymousClass043 A072 = AnonymousClass36l.A07(this);
                this.A0N = A072;
                if (A072 != null) {
                    A072.show();
                    this.A05.A0T(runnable, 1000);
                    return;
                }
            }
            runnable.run();
            return;
        }
        Log.i("VerifyPhoneNumber/showVerifiedCompleteDialog/show new verification complete dialog");
        this.A14.A03("verification_complete_dialog", "successful");
        A7w(runnable);
    }

    public final void A83(String str) {
        if (A1d == 12) {
            this.A0L.setVisibility(8);
            return;
        }
        if (!str.equals("flash")) {
            this.A0L.setVisibility(0);
        }
        A7R();
    }

    public final void A85(String str, String str2, String str3, long j, boolean z, boolean z2) {
        AnonymousClass317 r2;
        int i;
        Log.i("VerifyPhoneNumber/updateStateOn2FARequired");
        if (z) {
            A7S();
        }
        long j2 = j;
        if (z2) {
            this.A09.A1k(str2, str3, j2, -1, -1, this.A06.A0H());
        }
        this.A14.A04(A78(), "successful");
        if (!"sms".equals(str) || j != -1) {
            r2 = this.A0w;
            i = 7;
        } else {
            r2 = this.A0w;
            i = 18;
        }
        r2.A0B(i, true);
    }

    public final void A86(String str, String str2, String str3, String str4, int i, boolean z, boolean z2, boolean z3) {
        Log.i("VerifyPhoneNumber/updateStateOnVerificationComplete");
        A7S();
        A7Z(0);
        this.A0x.removeMessages(1);
        this.A10.A03();
        this.A14.A04(A78(), "successful");
        if (this.A02 == 3) {
            Log.i("VerifyPhoneNumber/updateStateOnVerificationComplete/ban appeals");
            this.A0w.A0B(10, true);
            startActivity(C627736r.A0w(this, str4, i, 2));
            finish();
            return;
        }
        this.A09.A1t(z);
        this.A09.A1s(z2);
        C18270x1.A0l(C18270x1.A03(this.A09), "first_party_migration_initiated", z3);
        C116985rC r1 = this.A0O;
        if (r1.A07()) {
            r1.A04();
            throw AnonymousClass001.A0g("setVNameCertSetInRegistration");
        }
        this.A0w.A0D(str, str2, str3);
        this.A0w.A04();
        this.A0w.A0B(2, true);
        C18270x1.A0g(C18270x1.A03(this.A09).remove("flash_call_eligible").remove("is_first_flash_call_request").remove("pref_flash_call_education_link_clicked").remove("pref_flash_call_manage_call_permission_granted").remove("pref_flash_call_call_log_permission_granted").remove("pref_flash_call_education_screen_displayed"), "pref_prefer_sms_over_flash");
        this.A13.A00();
        this.A0r.A08(false);
    }

    public void A88(boolean z) {
        String str;
        Log.i("VerifyPhoneNumber/requestSmsCode");
        if (A8C()) {
            this.A09.A1R("email_otp_choose_sms_instead");
        }
        TelephonyManager A0N2 = this.A08.A0N();
        if (A0N2 != null) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("VerifyPhoneNumber/requestSmsCode/network=");
            C18260x0.A1J(A0o2, A0N2.getNetworkOperator());
            StringBuilder A0o3 = AnonymousClass001.A0o();
            A0o3.append("VerifyPhoneNumber/requestSmsCode/network/name=");
            C18260x0.A1J(A0o3, A0N2.getNetworkOperatorName());
            StringBuilder A0o4 = AnonymousClass001.A0o();
            A0o4.append("VerifyPhoneNumber/requestSmsCode/sim=");
            A0o4.append(A0N2.getSimOperator());
            A0o4.append(", name=");
            C18260x0.A1J(A0o4, A0N2.getSimOperatorName());
            StringBuilder A0o5 = AnonymousClass001.A0o();
            A0o5.append("VerifyPhoneNumber/requestSmsCode/verification_state=");
            str = AnonymousClass000.A0h(A0o5, A1d);
        } else {
            str = "VerifyPhoneNumber/requestSmsCode/tm=null";
        }
        Log.d(str);
        this.A09.A1U((String) null);
        if (A8E() || A8C()) {
            Log.i("VerifyPhoneNumber/requestSmsCode/maybeUseSmsRetriever");
            C115465oi r4 = new C115465oi(this);
            C100525Bg.A00(this.A0f, this.A09, r4, this.A0j.A0X(3902));
            return;
        }
        C97694z5 A2p = AnonymousClass4SG.A2p(this);
        if (C18280x3.A1W(AnonymousClass0x2.A0F(this.A09), "migrate_from_consumer_app_directly")) {
            A2p.A02 = true;
        }
        String str2 = this.A1B;
        C626936e.A06(str2);
        String str3 = this.A1E;
        C626936e.A06(str3);
        A7r(A2p, str2, str3, "sms", (String) null, AnonymousClass4SG.A2w(this), z);
    }

    public final void A8A(boolean z) {
        int i;
        int i2;
        this.A0J.setVisibility(C86634Kw.A01(z ? 1 : 0));
        if (this.A0q.A04()) {
            RelativeLayout relativeLayout = this.A0L;
            int i3 = 16;
            if (z) {
                i3 = 1;
            }
            relativeLayout.setGravity(i3);
            AnonymousClass5UC r4 = this.A0q;
            boolean z2 = !z;
            Iterator it = r4.A0C.iterator();
            while (it.hasNext()) {
                TextView textView = (TextView) it.next();
                if (!z2) {
                    i = r4.A08;
                } else {
                    i = r4.A07;
                }
                textView.setWidth(i);
                if (!z2) {
                    i2 = r4.A03;
                } else {
                    i2 = r4.A02;
                }
                textView.setHeight(i2);
            }
            if (z) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0J.getLayoutParams();
                layoutParams.setMargins(this.A06, this.A08, this.A07, 0);
                int i4 = this.A09;
                layoutParams.width = i4;
                layoutParams.height = i4;
                this.A0J.setLayoutParams(layoutParams);
            }
        }
    }

    public final void A8B(boolean z) {
        Log.i("VerifyPhoneNumber/request-flash");
        if (!this.A0h.A0B()) {
            Log.i("VerifyPhoneNumber/request-flash/request-permission");
            RequestPermissionActivity.A0h(this, this.A0h, 700, z);
            return;
        }
        Log.i("VerifyPhoneNumber/request-flash/has-permission");
        A7G();
    }

    public void BFe(boolean z, String str) {
        int i;
        if (z) {
            switch (str.hashCode()) {
                case -795576526:
                    if (AnonymousClass4L0.A0S(str)) {
                        i = 46;
                        break;
                    } else {
                        return;
                    }
                case 114009:
                    if (str.equals("sms")) {
                        i = 52;
                        break;
                    } else {
                        return;
                    }
                case 112386354:
                    if (str.equals("voice")) {
                        A7J();
                        return;
                    }
                    return;
                case 2120743944:
                    if (str.equals("email_otp")) {
                        i = 51;
                        break;
                    } else {
                        return;
                    }
                default:
                    return;
            }
            C621433s.A00(this, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        if (r5.equals("flash") == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        A7Z(16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        if (r4 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        r1 = X.AnonymousClass000.A1U(X.AnonymousClass4SG.A2K(r3), 19);
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        if (r1 == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        A7Y(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009f, code lost:
        X.C621433s.A01(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        if (r0 == false) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BpC(boolean r4, java.lang.String r5) {
        /*
            r3 = this;
            X.5Od r0 = r3.A13
            r0.A00()
            int r0 = r5.hashCode()
            java.lang.String r2 = "flash"
            r1 = 0
            switch(r0) {
                case -795576526: goto L_0x008d;
                case 114009: goto L_0x0055;
                case 97513456: goto L_0x002c;
                case 112386354: goto L_0x0025;
                case 2120743944: goto L_0x0010;
                default: goto L_0x000f;
            }
        L_0x000f:
            return
        L_0x0010:
            java.lang.String r0 = "email_otp"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000f
            r3.A7Z(r1)
            X.317 r0 = r3.A0w
            r0.A04()
            if (r4 == 0) goto L_0x000f
            r0 = 51
            goto L_0x009f
        L_0x0025:
            java.lang.String r0 = "voice"
            boolean r0 = r5.equals(r0)
            goto L_0x0030
        L_0x002c:
            boolean r0 = r5.equals(r2)
        L_0x0030:
            if (r0 == 0) goto L_0x000f
            boolean r0 = r5.equals(r2)
            if (r0 == 0) goto L_0x003d
            r0 = 16
            r3.A7Z(r0)
        L_0x003d:
            if (r4 == 0) goto L_0x000f
            int r1 = X.AnonymousClass4SG.A2K(r3)
            r0 = 19
            boolean r1 = X.AnonymousClass000.A1U(r1, r0)
            r0 = 2131892987(0x7f121afb, float:1.9420738E38)
            if (r1 == 0) goto L_0x0051
            r0 = 2131893541(0x7f121d25, float:1.9421861E38)
        L_0x0051:
            r3.A7Y(r0)
            return
        L_0x0055:
            java.lang.String r0 = "sms"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000f
            r3.A7Z(r1)
            boolean r0 = r3.A1W
            r2 = 1
            if (r0 == 0) goto L_0x0078
            r3.A1V = r2
            X.4LS r1 = r3.A0y
            java.lang.String r0 = "com.google.android.gms.auth.api.phone.SMS_RETRIEVED"
            X.C18320x8.A0x(r1, r3, r0, r2)
        L_0x006e:
            X.317 r0 = r3.A0w
            r0.A04()
            if (r4 == 0) goto L_0x000f
            r0 = 52
            goto L_0x009f
        L_0x0078:
            java.lang.String r0 = "android.provider.Telephony.SMS_RECEIVED"
            android.content.IntentFilter r1 = new android.content.IntentFilter
            r1.<init>(r0)
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.setPriority(r0)
            X.4LR r0 = r3.A0t
            X.C154317cy.A01(r0, r3, r1, r2)
            r3.A1Q = r2
            goto L_0x006e
        L_0x008d:
            boolean r0 = X.AnonymousClass4L0.A0S(r5)
            if (r0 == 0) goto L_0x000f
            r3.A7Z(r1)
            X.317 r0 = r3.A0w
            r0.A04()
            if (r4 == 0) goto L_0x000f
            r0 = 46
        L_0x009f:
            X.C621433s.A01(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.VerifyPhoneNumber.BpC(boolean, java.lang.String):void");
    }

    public SharedPreferences getPreferences(int i) {
        return this.A0o.A03(getLocalClassName());
    }

    public void onBackPressed() {
        this.A14.A04(A78(), "back");
        if (this.A1N) {
            Log.i("VerifyPhoneNumber/onBackPressed/is adding new account");
            AnonymousClass36l.A0D(this, this.A0c, this.A09, this.A0A);
        } else if (A8E() || A8C()) {
            A7L();
        } else if (AnonymousClass000.A1U(AnonymousClass4SG.A2K(this), 19)) {
            Log.i("VerifyPhoneNumber/returnTo2Fac");
            this.A09.A01(18);
            A6T(C627736r.A1D(this, this.A1G), false);
            finish();
        } else if (this.A02 == 2) {
            super.onBackPressed();
        } else {
            Log.i("VerifyPhoneNumber/onBackPressed/wrong registration state, do not allow go back");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x04d1, code lost:
        if (X.AnonymousClass000.A1U(X.AnonymousClass4SG.A2K(r0), 19) == false) goto L_0x04d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x08c9, code lost:
        if (r0.A0h.A02("android.permission.RECEIVE_SMS") == 0) goto L_0x08cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0210, code lost:
        if (r1.getBooleanExtra("use_sms_retriever", false) != false) goto L_0x0212;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0438  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0901  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0325  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r21) {
        /*
            r20 = this;
            r0 = r20
            r11 = r21
            super.onCreate(r11)
            X.4FS r3 = r0.A04
            r2 = 14
            X.3cH r1 = new X.3cH
            r1.<init>((com.whatsapp.registration.VerifyPhoneNumber) r0, (int) r2)
            r3.BkM(r1)
            int r13 = X.AnonymousClass4SG.A2K(r0)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "VerifyPhoneNumber/onCreate/registrationState="
            X.C18260x0.A0y(r1, r2, r13)
            r4 = 1
            r3 = 0
            boolean r1 = X.AnonymousClass000.A1W(r11)
            r0.A1J = r1
            android.os.Bundle r1 = X.C86614Ku.A0D(r0)
            if (r1 == 0) goto L_0x00df
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "code_verification_mode"
            int r5 = r2.getIntExtra(r1, r3)
            r0.A02 = r5
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "VerifyPhoneNumber/onCreate/codeVerificationMode is "
            X.C18260x0.A0y(r1, r2, r5)
            X.1VW r2 = r0.A0j
            r1 = 4464(0x1170, float:6.255E-42)
            boolean r1 = r2.A0X(r1)
            if (r1 == 0) goto L_0x0059
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "EXTRA_IS_APP_RESTARTED"
            boolean r1 = r2.getBooleanExtra(r1, r3)
            r0.A1O = r1
        L_0x0059:
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "changenumber"
            boolean r1 = r2.getBooleanExtra(r1, r3)
            r0.A1G = r1
            java.lang.String r1 = "VerifyPhoneNumber/onCreate/changenumber"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "passkey_solved_challenge"
            java.lang.String r1 = r2.getStringExtra(r1)
            r0.A1D = r1
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "EXTRA_SHOULD_REQUEST_VOICE_CALL"
            boolean r1 = r2.getBooleanExtra(r1, r3)
            r0.A1S = r1
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "server_start_message"
            java.lang.String r1 = r2.getStringExtra(r1)
            r0.A1F = r1
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "flash_type"
            int r1 = X.C86664Kz.A07(r2, r1)
            r0.A04 = r1
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "fraud_eligible"
            boolean r1 = r2.getBooleanExtra(r1, r3)
            r0.A1I = r1
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "wa_old_eligible"
            int r5 = r2.getIntExtra(r1, r3)
            r0.A0B = r5
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "VerifyPhoneNumber/onCreate/waOldEligible : "
            X.C18260x0.A0y(r1, r2, r5)
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "silent_auth_eligible"
            int r1 = r2.getIntExtra(r1, r3)
            r0.A0A = r1
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "show_request_code_progress_dialog"
            boolean r1 = r2.getBooleanExtra(r1, r3)
            r0.A1U = r1
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "has_retried_flash_call"
            boolean r1 = r2.getBooleanExtra(r1, r3)
            r0.A1K = r1
        L_0x00df:
            X.2sH r5 = r0.A06
            android.content.SharedPreferences r2 = r0.getPreferences(r3)
            X.5UQ r1 = new X.5UQ
            r1.<init>(r2, r5)
            r0.A10 = r1
            android.content.SharedPreferences r2 = X.AnonymousClass1Hf.A27(r0)
            java.lang.String r1 = "email_address"
            r6 = 0
            java.lang.String r1 = r2.getString(r1, r6)
            r0.A1C = r1
            X.1VW r2 = r0.A0j
            r1 = 2964(0xb94, float:4.153E-42)
            boolean r1 = r2.A0X(r1)
            r0.A1T = r1
            X.33p r2 = r0.A09
            X.5Te r1 = new X.5Te
            r1.<init>(r0, r2)
            r0.A0s = r1
            boolean r1 = r0.A8E()
            if (r1 == 0) goto L_0x0119
            X.33p r2 = r0.A09
            java.lang.String r1 = "wa_old_entered"
            r2.A1Z(r1)
        L_0x0119:
            X.30z r2 = r0.A0c
            boolean r1 = r0.A1G
            boolean r1 = r2.A0B(r1)
            r0.A1N = r1
            android.content.Intent r5 = r0.getIntent()
            java.lang.String r2 = r5.getScheme()
            java.lang.String r1 = "whatsapp"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0942
            java.lang.String r2 = "http"
            java.lang.String r1 = r5.getScheme()
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0942
            java.lang.String r2 = "https"
            java.lang.String r1 = r5.getScheme()
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0942
            r0.A1A = r6
        L_0x014d:
            int r1 = r0.A74()
            if (r13 == r1) goto L_0x01b0
            boolean r1 = r0.A8C()
            if (r1 != 0) goto L_0x01b0
            int r2 = X.AnonymousClass4SG.A2K(r0)
            r1 = 19
            boolean r1 = X.AnonymousClass000.A1U(r2, r1)
            if (r1 != 0) goto L_0x01b0
            boolean r1 = r0.A8D()
            if (r1 != 0) goto L_0x01b0
            int r2 = X.AnonymousClass4SG.A2K(r0)
            r1 = 12
            boolean r1 = X.AnonymousClass000.A1U(r2, r1)
            if (r1 != 0) goto L_0x01b0
            int r2 = X.AnonymousClass4SG.A2K(r0)
            r1 = 20
            boolean r1 = X.AnonymousClass000.A1U(r2, r1)
            if (r1 != 0) goto L_0x01b0
            boolean r1 = r0.A8E()
            if (r1 != 0) goto L_0x01b0
            int r2 = X.AnonymousClass4SG.A2K(r0)
            r1 = 5
            if (r2 == r1) goto L_0x01b0
            int r2 = X.AnonymousClass4SG.A2K(r0)
            r1 = 23
            boolean r1 = X.AnonymousClass000.A1U(r2, r1)
            if (r1 != 0) goto L_0x01b0
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "VerifyPhoneNumber/onCreate/wrong-state bounce to main "
            X.C18260x0.A0x(r1, r2, r13)
            android.content.Intent r3 = X.C627736r.A03(r0)
        L_0x01a9:
            r0.startActivity(r3)
            r0.finish()
        L_0x01af:
            return
        L_0x01b0:
            X.1VW r2 = r0.A0j
            r1 = 3902(0xf3e, float:5.468E-42)
            boolean r18 = r2.A0X(r1)
            android.os.Bundle r1 = X.C86614Ku.A0D(r0)
            java.lang.String r9 = "voice"
            java.lang.String r10 = "sms"
            if (r1 == 0) goto L_0x0371
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "should_request_flash_call"
            boolean r17 = r2.getBooleanExtra(r1, r3)
            boolean r1 = r0.A8E()
            if (r1 != 0) goto L_0x01f0
            boolean r1 = r0.A8C()
            if (r1 != 0) goto L_0x01f0
            int r2 = X.AnonymousClass4SG.A2K(r0)
            r1 = 20
            boolean r1 = X.AnonymousClass000.A1U(r2, r1)
            if (r1 != 0) goto L_0x01f0
            int r2 = X.AnonymousClass4SG.A2K(r0)
            r1 = 23
            boolean r1 = X.AnonymousClass000.A1U(r2, r1)
            if (r1 == 0) goto L_0x01fd
        L_0x01f0:
            X.33p r1 = r0.A09
            int r5 = r0.A04
            android.content.SharedPreferences$Editor r2 = X.C18270x1.A03(r1)
            java.lang.String r1 = "flash_call_eligible"
            X.C18270x1.A0h(r2, r1, r5)
        L_0x01fd:
            java.lang.String r1 = "VerifyPhoneNumber/onCreate/ssend"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.lang.String r2 = "use_sms_retriever"
            if (r21 != 0) goto L_0x035f
            android.content.Intent r1 = r0.getIntent()
            if (r18 == 0) goto L_0x0359
            boolean r1 = r1.getBooleanExtra(r2, r3)
            if (r1 == 0) goto L_0x0214
        L_0x0212:
            r0.A1W = r4
        L_0x0214:
            android.content.Intent r4 = r0.getIntent()
            java.lang.String r16 = "sms_retry_time"
            r1 = 0
            r3 = r16
            long r7 = r4.getLongExtra(r3, r1)
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r12 = "voice_retry_time"
            long r5 = r3.getLongExtra(r12, r1)
            android.content.Intent r4 = r0.getIntent()
            java.lang.String r3 = "wa_old_retry_time"
            long r3 = r4.getLongExtra(r3, r1)
            android.content.Intent r14 = r0.getIntent()
            java.lang.String r15 = "email_otp_retry_time"
            long r1 = r14.getLongExtra(r15, r1)
            java.lang.StringBuilder r15 = X.AnonymousClass001.A0o()
            java.lang.String r14 = "VerifyPhoneNumber/onCreate/sms_retry="
            r15.append(r14)
            r15.append(r7)
            java.lang.String r14 = ", voice-retry="
            r15.append(r14)
            r15.append(r5)
            java.lang.String r14 = ", wa-old-retry="
            r15.append(r14)
            r15.append(r3)
            java.lang.String r14 = ", email-otp-retry="
            X.C18260x0.A10(r14, r15, r1)
            r14 = 13
            if (r13 == r14) goto L_0x0337
            r14 = 14
            if (r13 == r14) goto L_0x0337
            X.5UQ r12 = r0.A10
            r12.A05(r10, r7)
            X.5UQ r7 = r0.A10
            r7.A05(r9, r5)
            X.5UQ r6 = r0.A10
            java.lang.String r5 = "wa_old"
            r6.A05(r5, r3)
            X.5UQ r4 = r0.A10
            java.lang.String r3 = "email_otp"
            r4.A05(r3, r1)
        L_0x0281:
            if (r18 == 0) goto L_0x0299
            android.content.SharedPreferences r1 = X.AnonymousClass1Hf.A27(r0)
            java.lang.String r2 = "registration_use_sms_retriever"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x0299
            android.content.SharedPreferences r1 = X.AnonymousClass1Hf.A27(r0)
            boolean r1 = X.C18280x3.A1W(r1, r2)
            r0.A1W = r1
        L_0x0299:
            int r2 = X.AnonymousClass4SG.A2K(r0)
            r1 = 12
            boolean r1 = X.AnonymousClass000.A1U(r2, r1)
            if (r1 == 0) goto L_0x032b
            java.lang.String r1 = r0.A1F
            if (r1 != 0) goto L_0x032b
            java.lang.String r1 = "VerifyPhoneNumber/onCreate/app got killed during autoconf authentication during changeNumber"
        L_0x02ab:
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.317 r3 = r0.A0w
            int r2 = r0.A74()
            r1 = 1
            r3.A0B(r2, r1)
            r1 = 0
            r0.A7Z(r1)
        L_0x02bc:
            X.33p r1 = r0.A09
            java.lang.String r1 = r1.A0Z()
            r0.A1B = r1
            X.33p r1 = r0.A09
            java.lang.String r1 = r1.A0b()
            r0.A1E = r1
            android.content.SharedPreferences r2 = X.AnonymousClass1Hf.A27(r0)
            java.lang.String r1 = "reg_attempts_verify_code"
            r3 = 0
            int r2 = r2.getInt(r1, r3)
            X.4z4 r1 = new X.4z4
            r1.<init>(r2)
            r0.A12 = r1
            java.lang.String r5 = r0.A1B
            java.lang.String r4 = r0.A1E
            android.os.Looper r13 = android.os.Looper.getMainLooper()
            X.5rC r2 = r0.A0O
            X.4z4 r1 = r0.A12
            X.4Mc r12 = new X.4Mc
            r14 = r2
            r15 = r0
            r16 = r1
            r17 = r5
            r18 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r0.A0x = r12
            X.1ip r2 = r0.A07
            X.49Y r1 = r0.A1Y
            r2.A06(r1)
            java.lang.String r1 = r0.A1B
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0325
            java.lang.String r1 = r0.A1E
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0325
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "return_to_phone_number"
            boolean r1 = r2.getBooleanExtra(r1, r3)
            if (r1 == 0) goto L_0x0375
            java.lang.String r1 = "VerifyPhoneNumber/return to enter phone number based on intent extra"
            com.whatsapp.util.Log.i((java.lang.String) r1)
        L_0x0321:
            r0.A7L()
            return
        L_0x0325:
            java.lang.String r1 = "VerifyPhoneNumber/create/cc or num is missing, bounce to regphone"
            com.whatsapp.util.Log.w((java.lang.String) r1)
            goto L_0x0321
        L_0x032b:
            boolean r1 = r0.A8D()
            if (r1 == 0) goto L_0x02bc
            if (r17 != 0) goto L_0x02bc
            java.lang.String r1 = "VerifyPhoneNumber/onCreate/app got killed during flash call verification, reset reg state to SMS"
            goto L_0x02ab
        L_0x0337:
            android.content.Intent r2 = r0.getIntent()
            r1 = r16
            boolean r3 = r2.hasExtra(r1)
            android.content.Intent r1 = r0.getIntent()
            boolean r2 = r1.hasExtra(r12)
            if (r3 == 0) goto L_0x0350
            X.5UQ r1 = r0.A10
            r1.A05(r10, r7)
        L_0x0350:
            if (r2 == 0) goto L_0x0281
            X.5UQ r1 = r0.A10
            r1.A05(r9, r5)
            goto L_0x0281
        L_0x0359:
            boolean r4 = r1.getBooleanExtra(r2, r3)
            goto L_0x0212
        L_0x035f:
            if (r18 != 0) goto L_0x0367
            boolean r1 = r11.getBoolean(r2, r3)
            r0.A1W = r1
        L_0x0367:
            java.lang.String r1 = "has_retried_flash_call"
            boolean r1 = r11.getBoolean(r1, r3)
            r0.A1K = r1
            goto L_0x0281
        L_0x0371:
            r17 = 0
            goto L_0x0281
        L_0x0375:
            X.33p r2 = r0.A09
            X.4LR r1 = new X.4LR
            r1.<init>(r2, r0)
            r0.A0t = r1
            X.33p r2 = r0.A09
            X.4LS r1 = new X.4LS
            r1.<init>(r2, r0)
            r0.A0y = r1
            X.5X2 r7 = r0.A0p
            long r3 = X.AnonymousClass4SG.A2N(r0, r10)
            long r1 = X.AnonymousClass4SG.A2N(r0, r9)
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()
            java.lang.String r5 = "AccountDefenceSecondCodeViewPresenter/determine-current-account-defence-verification-state "
            r6.append(r5)
            r6.append(r3)
            java.lang.String r5 = ", "
            X.C18260x0.A12(r5, r6, r1)
            X.2hq r5 = r7.A02
            X.5Pg r7 = r5.A06
            X.2y5 r6 = r7.A01
            java.lang.String r5 = "AccountDefenceLocalDataRepository_prefs"
            android.content.SharedPreferences r8 = r6.A03(r5)
            java.lang.String r6 = "com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.account_defence_verification_state"
            int r8 = X.C18280x3.A02(r8, r6)
            java.lang.StringBuilder r12 = X.AnonymousClass001.A0o()
            java.lang.String r6 = "AccountDefenceLocalDataRepository/getSecondCodeVerificationState/"
            X.C18260x0.A0y(r6, r12, r8)
            if (r8 != 0) goto L_0x0907
            long r18 = java.lang.System.currentTimeMillis()
            long r16 = r7.A00()
            long r14 = r7.A01()
            r12 = 0
            int r6 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r6 == 0) goto L_0x03e1
            int r7 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r7 == 0) goto L_0x03e1
            if (r6 <= 0) goto L_0x03db
            int r6 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r6 < 0) goto L_0x03e1
        L_0x03db:
            if (r7 <= 0) goto L_0x0907
            int r3 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r3 >= 0) goto L_0x0907
        L_0x03e1:
            java.lang.String r1 = "AccountDefenceSecondCodeViewPresenter/determine-current-account-defence-verification-state return enabled"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r8 = 1
        L_0x03e7:
            r0.A00 = r8
            X.5X2 r1 = r0.A0p
            X.2hq r1 = r1.A02
            X.5Pg r1 = r1.A06
            X.2y5 r1 = r1.A01
            android.content.SharedPreferences r2 = r1.A03(r5)
            java.lang.String r1 = "com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.account_defence_sms_requested_once"
            boolean r3 = X.C18280x3.A1W(r2, r1)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "AccountDefenceLocalDataRepository/isSecondSmsRequestedOnce/"
            X.C18260x0.A1E(r1, r2, r3)
            r0.A1M = r3
            r0.A7D()
            android.os.Handler r1 = new android.os.Handler
            r1.<init>()
            r0.A0H = r1
            X.C107405bG.A05(r0)
            X.2oU r1 = r0.A0f
            android.content.res.Resources r2 = X.C54292oU.A00(r1)
            r1 = 2131168015(0x7f070b0f, float:1.795032E38)
            int r1 = r2.getDimensionPixelSize(r1)
            r0.A09 = r1
            X.2oU r1 = r0.A0f
            android.content.res.Resources r2 = X.C54292oU.A00(r1)
            r1 = 2131168012(0x7f070b0c, float:1.7950314E38)
            int r2 = r2.getDimensionPixelSize(r1)
            X.33j r1 = r0.A00
            boolean r1 = X.C620733j.A04(r1)
            r6 = 0
            if (r1 == 0) goto L_0x0901
            r0.A06 = r2
            r0.A07 = r6
        L_0x043c:
            X.2oU r1 = r0.A0f
            android.content.res.Resources r2 = X.C54292oU.A00(r1)
            r1 = 2131168013(0x7f070b0d, float:1.7950316E38)
            int r1 = r2.getDimensionPixelSize(r1)
            r0.A08 = r1
            r1 = 2131896262(0x7f1227c6, float:1.942738E38)
            r0.setTitle(r1)
            r1 = 2131626251(0x7f0e090b, float:1.8879733E38)
            r0.setContentView((int) r1)
            X.0XL r2 = X.AnonymousClass0x9.A0H(r0)
            java.lang.Class<com.whatsapp.registration.report.BanReportViewModel> r1 = com.whatsapp.registration.report.BanReportViewModel.class
            X.0Ty r1 = r2.A01(r1)
            com.whatsapp.registration.report.BanReportViewModel r1 = (com.whatsapp.registration.report.BanReportViewModel) r1
            r0.A16 = r1
            X.08M r2 = r1.A01
            r1 = 183(0xb7, float:2.56E-43)
            X.C86654Ky.A1G(r0, r2, r1)
            com.whatsapp.registration.report.BanReportViewModel r1 = r0.A16
            X.08M r2 = r1.A02
            r1 = 284(0x11c, float:3.98E-43)
            X.AnonymousClass6C6.A01(r0, r2, r1)
            r2 = 2131434320(0x7f0b1b50, float:1.849045E38)
            android.view.View r1 = X.C005205m.A00(r0, r2)
            com.whatsapp.WaTextView r1 = (com.whatsapp.WaTextView) r1
            r0.A0Y = r1
            r1 = 2131428813(0x7f0b05cd, float:1.8479281E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r0.A0L = r1
            r1 = 2131429834(0x7f0b09ca, float:1.8481352E38)
            android.widget.TextView r1 = X.C18310x6.A0L(r0, r1)
            r0.A0M = r1
            r1 = 2131433514(0x7f0b182a, float:1.8488816E38)
            com.whatsapp.TextEmojiLabel r1 = X.C86664Kz.A0z(r0, r1)
            r0.A0W = r1
            r1 = 2131434650(0x7f0b1c9a, float:1.849112E38)
            android.view.ViewStub r1 = X.C86664Kz.A0o(r0, r1)
            r0.A0I = r1
            X.1VW r1 = r0.A0j
            X.AnonymousClass36l.A0M(r0, r1, r2)
            X.33j r7 = r0.A00
            android.view.View r3 = r0.A00
            r15 = 2131434319(0x7f0b1b4f, float:1.8490449E38)
            int r1 = r0.A02
            r4 = 2
            boolean r16 = X.AnonymousClass000.A1U(r1, r4)
            boolean r1 = r0.A8E()
            if (r1 != 0) goto L_0x04d3
            boolean r1 = r0.A8C()
            if (r1 != 0) goto L_0x04d3
            int r2 = X.AnonymousClass4SG.A2K(r0)
            r1 = 19
            boolean r1 = X.AnonymousClass000.A1U(r2, r1)
            r17 = 0
            if (r1 == 0) goto L_0x04d5
        L_0x04d3:
            r17 = 1
        L_0x04d5:
            boolean r1 = r0.A1N
            r12 = r3
            r13 = r0
            r14 = r7
            r18 = r1
            X.AnonymousClass36l.A0K(r12, r13, r14, r15, r16, r17, r18)
            X.1ip r1 = r0.A07
            X.2xD r1 = r1.A0B()
            if (r1 == 0) goto L_0x0508
            boolean r1 = r1.A02
            if (r1 == 0) goto L_0x0508
            boolean r1 = r0.A8E()
            if (r1 != 0) goto L_0x0508
            int r2 = X.AnonymousClass4SG.A2K(r0)
            r1 = 20
            boolean r1 = X.AnonymousClass000.A1U(r2, r1)
            if (r1 != 0) goto L_0x0508
            java.lang.String r1 = "VerifyPhoneNumber/onCreate/display-roaming"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r1 = 2131433175(0x7f0b16d7, float:1.8488128E38)
            X.C18280x3.A0r(r0, r1, r6)
        L_0x0508:
            r1 = 2131432723(0x7f0b1513, float:1.8487212E38)
            android.view.View r2 = r0.findViewById(r1)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            r0.A0K = r2
            r1 = 100
            r2.setProgress(r1)
            r1 = 2131434648(0x7f0b1c98, float:1.8491116E38)
            android.view.View r1 = r0.findViewById(r1)
            com.whatsapp.CodeInputField r1 = (com.whatsapp.CodeInputField) r1
            r0.A0Q = r1
            X.5Lt r2 = r0.A0S
            r1 = 0
            X.5UC r1 = r2.A00(r1)
            r0.A0q = r1
            boolean r1 = r1.A04()
            if (r1 == 0) goto L_0x08ef
            android.view.View r2 = r0.A00
            r1 = 2131434647(0x7f0b1c97, float:1.8491114E38)
            android.widget.LinearLayout r7 = X.C86654Ky.A0N(r2, r1)
            X.5UC r3 = r0.A0q
            X.8JR r2 = new X.8JR
            r2.<init>(r0)
            int r1 = A1b
            r3.A02(r7, r2, r1)
            com.whatsapp.CodeInputField r1 = r0.A0Q
            r2 = 8
            r1.setVisibility(r2)
            android.widget.ProgressBar r1 = r0.A0K
            r1.setVisibility(r2)
            r7.setVisibility(r6)
        L_0x0556:
            r1 = 2131434649(0x7f0b1c99, float:1.8491118E38)
            android.view.View r3 = r0.findViewById(r1)
            android.widget.ImageButton r3 = (android.widget.ImageButton) r3
            r0.A0J = r3
            X.33j r2 = r0.A00
            r1 = 2131231713(0x7f0803e1, float:1.8079515E38)
            X.C18270x1.A0d(r0, r3, r2, r1)
            android.widget.ImageButton r2 = r0.A0J
            r1 = 47
            X.AnonymousClass0x2.A0y(r2, r0, r1)
            r0.A8A(r6)
            com.whatsapp.TextEmojiLabel r1 = r0.A0W
            r1.setVisibility(r6)
            android.widget.RelativeLayout r1 = r0.A0L
            r1.setVisibility(r6)
            android.widget.TextView r7 = r0.A0M
            r3 = 2131894954(0x7f1222aa, float:1.9424727E38)
            r8 = 1
            java.lang.Object[] r2 = new java.lang.Object[r8]
            int r1 = A1b
            X.AnonymousClass000.A1P(r2, r1, r6)
            X.AnonymousClass001.A0y(r0, r7, r2, r3)
            com.whatsapp.WaTextView r2 = r0.A0Y
            r1 = 2131894993(0x7f1222d1, float:1.9424806E38)
            r2.setText(r1)
            java.lang.String r2 = r0.A1E
            if (r2 == 0) goto L_0x08ec
            java.lang.String r1 = r0.A1B
            if (r1 == 0) goto L_0x08ec
            X.33j r7 = r0.A00
            java.lang.String r3 = X.AnonymousClass36l.A0C(r1, r2)
            r2 = 32
            r1 = 160(0xa0, float:2.24E-43)
            java.lang.String r1 = r3.replace(r2, r1)
            java.lang.String r7 = r7.A0I(r1)
        L_0x05af:
            int r2 = X.AnonymousClass4SG.A2K(r0)
            r1 = 20
            boolean r1 = X.AnonymousClass000.A1U(r2, r1)
            r3 = 8
            if (r1 == 0) goto L_0x0728
            android.widget.RelativeLayout r1 = r0.A0L
            r1.setVisibility(r3)
            android.widget.TextView r1 = r0.A0M
            r1.setVisibility(r3)
            com.whatsapp.WaTextView r2 = r0.A0Y
            r1 = 2131891675(0x7f1215db, float:1.9418077E38)
            r2.setText(r1)
            r9 = 2131891674(0x7f1215da, float:1.9418075E38)
            java.lang.String r1 = X.AnonymousClass0x2.A0X(r0, r7, r8, r9)
            android.text.SpannableString r6 = X.AnonymousClass4L0.A0A(r1)
            android.text.style.StyleSpan r5 = new android.text.style.StyleSpan
            r5.<init>(r8)
            java.lang.String r1 = r0.getString(r9)
            java.lang.String r2 = "%s"
            int r3 = r1.indexOf(r2)
            java.lang.String r1 = r0.getString(r9)
            int r2 = r1.indexOf(r2)
            int r1 = r7.length()
            int r2 = r2 + r1
            r1 = 33
            r6.setSpan(r5, r3, r2, r1)
            com.whatsapp.TextEmojiLabel r1 = r0.A0W
            r1.setText(r6)
        L_0x0600:
            java.lang.String r1 = "VerifyPhoneNumber/initializeBottomSheetEntryText/hide request code buttons in bottom sheet"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r1 = 2131430086(0x7f0b0ac6, float:1.8481863E38)
            android.view.View r1 = X.C005205m.A00(r0, r1)
            com.whatsapp.WaTextView r1 = (com.whatsapp.WaTextView) r1
            r0.A0Z = r1
            int r2 = X.AnonymousClass4SG.A2K(r0)
            r1 = 20
            boolean r1 = X.AnonymousClass000.A1U(r2, r1)
            if (r1 != 0) goto L_0x071f
            int r2 = X.AnonymousClass4SG.A2K(r0)
            r1 = 23
            boolean r1 = X.AnonymousClass000.A1U(r2, r1)
            if (r1 != 0) goto L_0x071f
            boolean r1 = r0.A8E()
            if (r1 == 0) goto L_0x0636
            com.whatsapp.WaTextView r2 = r0.A0Z
            r1 = 2131895432(0x7f122488, float:1.9425697E38)
            r2.setText(r1)
        L_0x0636:
            com.whatsapp.WaTextView r2 = r0.A0Z
            r1 = 48
            X.AnonymousClass0x2.A0y(r2, r0, r1)
        L_0x063d:
            r1 = 2131433742(0x7f0b190e, float:1.8489278E38)
            X.5UY r1 = X.AnonymousClass1Ha.A1p(r0, r1)
            r0.A19 = r1
            r1 = 2131429444(0x7f0b0844, float:1.848056E38)
            X.5UY r1 = X.AnonymousClass1Ha.A1p(r0, r1)
            r0.A18 = r1
            android.content.res.Resources r1 = r0.getResources()
            boolean r1 = X.AnonymousClass36l.A0P(r1)
            if (r1 == 0) goto L_0x0660
            android.view.Window r1 = r0.getWindow()
            r1.setSoftInputMode(r4)
        L_0x0660:
            X.5UQ r3 = r0.A10
            java.lang.String r2 = r0.A1B
            java.lang.String r1 = r0.A1E
            java.lang.String r4 = r3.A01(r2, r1)
            if (r4 == 0) goto L_0x0695
            boolean r1 = r0.A8D()
            if (r1 != 0) goto L_0x0695
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "VerifyPhoneNumber/create/savedcode "
            X.C18260x0.A0s(r1, r4, r2)
            java.lang.String r3 = r0.A1B
            java.lang.String r2 = r0.A1E
            r19 = 4
            X.5rC r1 = r0.A0O
            X.AnonymousClass5VK.A00(r1)
            X.4z4 r1 = r0.A12
            r18 = 0
            r12 = r0
            r13 = r1
            r14 = r4
            r15 = r3
            r16 = r2
            r17 = r10
            r12.A7t(r13, r14, r15, r16, r17, r18, r19)
        L_0x0695:
            boolean r1 = r0.A8D()
            if (r1 != 0) goto L_0x06ea
            android.os.Bundle r1 = X.C86614Ku.A0D(r0)
            if (r1 == 0) goto L_0x06ea
            if (r21 != 0) goto L_0x06db
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "request_code_method"
            java.lang.String r5 = r2.getStringExtra(r1)
            android.content.Intent r1 = r0.getIntent()
            java.lang.String r4 = "request_code_status"
            r3 = -1
            int r1 = r1.getIntExtra(r4, r3)
            if (r1 < 0) goto L_0x071d
            X.58p[] r2 = X.C998958p.values()
            android.content.Intent r1 = r0.getIntent()
            int r1 = r1.getIntExtra(r4, r3)
            r3 = r2[r1]
        L_0x06c8:
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "request_code_result"
            android.os.Parcelable r1 = r2.getParcelableExtra(r1)
            X.5do r1 = (X.C108935do) r1
            if (r5 == 0) goto L_0x06db
            if (r3 == 0) goto L_0x06db
            r0.BPK(r3, r1, r5)
        L_0x06db:
            r1 = 0
            r3 = 0
            r7 = r3
            r9 = r1
            r10 = r1
            r2 = r1
            r5 = r3
            android.content.Intent r1 = X.C627736r.A0A(r0, r1, r2, r3, r5, r7, r9, r10)
            r0.setIntent(r1)
        L_0x06ea:
            X.2s5 r2 = r0.A14
            java.lang.String r1 = r0.A78()
            r2.A01(r1)
            java.lang.String r1 = r0.A1F
            if (r1 == 0) goto L_0x0912
            java.lang.String r1 = "VerifyPhoneNumber/onCreate/attempt autoconf verification"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            boolean r1 = r0.A8D()
            if (r1 != 0) goto L_0x0707
            r1 = 23
            X.C621433s.A01(r0, r1)
        L_0x0707:
            r11 = 0
            java.lang.String r3 = r0.A1B
            java.lang.String r2 = r0.A1E
            java.lang.String r8 = "autoconf"
            java.lang.String r1 = r0.A1F
            r10 = 0
            X.4z5 r5 = X.AnonymousClass4SG.A2p(r0)
            r4 = r0
            r6 = r3
            r7 = r2
            r9 = r1
            r4.A7r(r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x071d:
            r3 = 0
            goto L_0x06c8
        L_0x071f:
            com.whatsapp.WaTextView r2 = r0.A0Z
            r1 = 8
            r2.setVisibility(r1)
            goto L_0x063d
        L_0x0728:
            int r2 = X.AnonymousClass4SG.A2K(r0)
            r1 = 23
            boolean r1 = X.AnonymousClass000.A1U(r2, r1)
            if (r1 == 0) goto L_0x0748
            android.widget.RelativeLayout r1 = r0.A0L
            r1.setVisibility(r3)
            android.widget.TextView r1 = r0.A0M
            r1.setVisibility(r3)
            com.whatsapp.TextEmojiLabel r2 = r0.A0W
            r1 = 2131893853(0x7f121e5d, float:1.9422494E38)
            r2.setText(r1)
            goto L_0x0600
        L_0x0748:
            boolean r1 = r0.A8D()
            if (r1 == 0) goto L_0x076b
            com.whatsapp.TextEmojiLabel r5 = r0.A0W
            r1 = 2131894958(0x7f1222ae, float:1.9424735E38)
            java.lang.String r2 = X.AnonymousClass0x2.A0X(r0, r7, r8, r1)
            r1 = 0
            android.text.SpannableStringBuilder r1 = r0.A77(r1, r2, r6)
            r5.setText(r1)
            android.widget.RelativeLayout r1 = r0.A0L
            r1.setVisibility(r3)
            android.widget.TextView r1 = r0.A0M
        L_0x0766:
            r1.setVisibility(r3)
            goto L_0x0600
        L_0x076b:
            boolean r1 = r0.A8C()
            if (r1 == 0) goto L_0x079c
            com.whatsapp.WaTextView r2 = r0.A0Y
            r1 = 2131887762(0x7f120692, float:1.941014E38)
            r2.setText(r1)
            java.lang.String r5 = r0.A1C
            if (r5 == 0) goto L_0x0793
            com.whatsapp.TextEmojiLabel r3 = r0.A0W
            r2 = 2131887806(0x7f1206be, float:1.941023E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r6] = r5
            X.AnonymousClass001.A0y(r0, r3, r1, r2)
        L_0x0789:
            com.whatsapp.TextEmojiLabel r2 = r0.A0W
            r1 = 2131887807(0x7f1206bf, float:1.9410232E38)
            X.C18300x5.A13(r0, r2, r1)
            goto L_0x0600
        L_0x0793:
            com.whatsapp.TextEmojiLabel r2 = r0.A0W
            r1 = 2131887807(0x7f1206bf, float:1.9410232E38)
            r2.setText(r1)
            goto L_0x0789
        L_0x079c:
            boolean r1 = r0.A8E()
            if (r1 == 0) goto L_0x082a
            com.whatsapp.WaTextView r1 = r0.A0a
            if (r1 != 0) goto L_0x07e9
            android.view.ViewStub r1 = r0.A0I
            android.view.View r2 = r1.inflate()
            r1 = 2131434652(0x7f0b1c9c, float:1.8491124E38)
            com.whatsapp.WaTextView r1 = X.AnonymousClass0x7.A0L(r2, r1)
            r0.A0b = r1
            r1 = 2131434651(0x7f0b1c9b, float:1.8491122E38)
            com.whatsapp.WaTextView r1 = X.AnonymousClass0x7.A0L(r2, r1)
            r0.A0a = r1
            X.1VW r2 = r0.A0j
            r1 = 4250(0x109a, float:5.956E-42)
            boolean r12 = r2.A0X(r1)
            android.content.SharedPreferences r2 = X.AnonymousClass1Hf.A27(r0)
            java.lang.String r1 = "pref_wa_old_for_uc"
            boolean r1 = r2.getBoolean(r1, r6)
            if (r1 == 0) goto L_0x07f9
            com.whatsapp.WaTextView r2 = r0.A0b
            r1 = 2131895006(0x7f1222de, float:1.9424833E38)
            r2.setText(r1)
            com.whatsapp.WaTextView r9 = r0.A0a
            r5 = 2131895005(0x7f1222dd, float:1.942483E38)
        L_0x07df:
            java.lang.Object[] r2 = new java.lang.Object[r8]
            int r1 = A1b
            X.AnonymousClass000.A1P(r2, r1, r6)
            X.AnonymousClass001.A0y(r0, r9, r2, r5)
        L_0x07e9:
            com.whatsapp.WaTextView r5 = r0.A0Y
            r2 = 2131895002(0x7f1222da, float:1.9424825E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r6] = r7
            X.AnonymousClass001.A0y(r0, r5, r1, r2)
            com.whatsapp.TextEmojiLabel r1 = r0.A0W
            goto L_0x0766
        L_0x07f9:
            boolean r1 = r0.A1N
            com.whatsapp.WaTextView r2 = r0.A0b
            if (r1 == 0) goto L_0x0810
            r1 = 2131886284(0x7f1200cc, float:1.9407142E38)
            r2.setText(r1)
            com.whatsapp.WaTextView r9 = r0.A0a
            r5 = 2131886282(0x7f1200ca, float:1.9407138E38)
            if (r12 == 0) goto L_0x07df
            r5 = 2131886283(0x7f1200cb, float:1.940714E38)
            goto L_0x07df
        L_0x0810:
            if (r12 == 0) goto L_0x081e
            r1 = 2131895001(0x7f1222d9, float:1.9424823E38)
            r2.setText(r1)
            com.whatsapp.WaTextView r9 = r0.A0a
            r5 = 2131894999(0x7f1222d7, float:1.9424819E38)
            goto L_0x07df
        L_0x081e:
            r1 = 2131895000(0x7f1222d8, float:1.942482E38)
            r2.setText(r1)
            com.whatsapp.WaTextView r9 = r0.A0a
            r5 = 2131894998(0x7f1222d6, float:1.9424817E38)
            goto L_0x07df
        L_0x082a:
            boolean r1 = X.AnonymousClass4SG.A4D(r0)
            if (r1 == 0) goto L_0x0881
            X.5X2 r1 = r0.A0p
            X.2hq r1 = r1.A02
            X.5Pg r2 = r1.A06
            long r8 = r2.A00()
            long r6 = r2.A01()
            java.lang.String r1 = "AccountDefenceLocalDataRepository/clear-original-wait-time-diffs"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.2y5 r1 = r2.A01
            android.content.SharedPreferences$Editor r5 = X.C60152y5.A00(r1, r5)
            r2 = 0
            int r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0854
            java.lang.String r1 = "com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.account_defence_original_sms_wait_time"
            r5.remove(r1)
        L_0x0854:
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x085d
            java.lang.String r1 = "com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.account_defence_original_voice_wait_time"
            r5.remove(r1)
        L_0x085d:
            boolean r1 = r5.commit()
            if (r1 != 0) goto L_0x0868
            java.lang.String r1 = "AccountDefenceLocalDataRepository/clear-original-wait-time-diffs/error"
            com.whatsapp.util.Log.e((java.lang.String) r1)
        L_0x0868:
            com.whatsapp.TextEmojiLabel r7 = r0.A0W
            X.5X2 r6 = r0.A0p
            int r5 = r0.A00
            X.33j r3 = r0.A00
            java.lang.String r2 = r0.A1B
            java.lang.String r1 = r0.A1E
            java.lang.String r1 = X.AnonymousClass4SG.A2v(r3, r2, r1)
            java.lang.CharSequence r1 = r6.A00(r0, r1, r5)
            r7.setText(r1)
            goto L_0x0600
        L_0x0881:
            long r12 = java.lang.System.currentTimeMillis()
            com.whatsapp.TextEmojiLabel r2 = r0.A0W
            X.1VX r1 = r0.A0D
            X.AnonymousClass0x2.A14(r1, r2)
            com.whatsapp.TextEmojiLabel r2 = r0.A0W
            X.33i r1 = r0.A08
            X.AnonymousClass0x2.A12(r2, r1)
            long r2 = X.AnonymousClass4SG.A2N(r0, r10)
            int r1 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r1 <= 0) goto L_0x08bc
            long r14 = X.AnonymousClass4SG.A2N(r0, r9)
            long r14 = r14 - r12
            r12 = 5000(0x1388, double:2.4703E-320)
            int r2 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            com.whatsapp.TextEmojiLabel r5 = r0.A0W
            r1 = 2131894992(0x7f1222d0, float:1.9424804E38)
            if (r2 >= 0) goto L_0x08ae
            r1 = 2131894988(0x7f1222cc, float:1.9424796E38)
        L_0x08ae:
            java.lang.String r2 = X.AnonymousClass0x2.A0X(r0, r7, r8, r1)
            r1 = 0
            android.text.SpannableStringBuilder r1 = r0.A77(r1, r2, r6)
            r5.setText(r1)
            goto L_0x0600
        L_0x08bc:
            boolean r1 = r0.A1W
            if (r1 != 0) goto L_0x08cb
            X.5ZR r2 = r0.A0h
            java.lang.String r1 = "android.permission.RECEIVE_SMS"
            int r1 = r2.A02(r1)
            r3 = 0
            if (r1 != 0) goto L_0x08cc
        L_0x08cb:
            r3 = 1
        L_0x08cc:
            int r2 = X.AnonymousClass4SG.A2K(r0)
            r1 = 19
            boolean r1 = X.AnonymousClass000.A1U(r2, r1)
            com.whatsapp.TextEmojiLabel r5 = r0.A0W
            if (r1 == 0) goto L_0x08e3
            r1 = 2131894990(0x7f1222ce, float:1.94248E38)
            if (r3 == 0) goto L_0x08ae
            r1 = 2131894991(0x7f1222cf, float:1.9424802E38)
            goto L_0x08ae
        L_0x08e3:
            r1 = 2131894989(0x7f1222cd, float:1.9424798E38)
            if (r3 == 0) goto L_0x08ae
            r1 = 2131894987(0x7f1222cb, float:1.9424794E38)
            goto L_0x08ae
        L_0x08ec:
            r7 = 0
            goto L_0x05af
        L_0x08ef:
            com.whatsapp.CodeInputField r1 = r0.A0Q
            r1.setVisibility(r6)
            com.whatsapp.CodeInputField r3 = r0.A0Q
            X.8Dz r2 = new X.8Dz
            r2.<init>(r0)
            r1 = 6
            r3.A0A(r2, r1)
            goto L_0x0556
        L_0x0901:
            r0.A06 = r6
            r0.A07 = r2
            goto L_0x043c
        L_0x0907:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "AccountDefenceSecondCodeViewPresenter/determine-current-account-defence-verification-state return code:"
            X.C18260x0.A0y(r1, r2, r8)
            goto L_0x03e7
        L_0x0912:
            int r2 = X.AnonymousClass4SG.A2K(r0)
            r1 = 20
            boolean r1 = X.AnonymousClass000.A1U(r2, r1)
            if (r1 == 0) goto L_0x01af
            java.lang.String r1 = "VerifyPhoneNumber/passkeyEvent/passkey_start_login"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.lang.String r4 = r0.A1D
            if (r4 == 0) goto L_0x01af
            java.lang.String r3 = r0.A1B
            java.lang.String r2 = r0.A1E
            X.C626936e.A06(r2)
            java.lang.String r10 = "passkey"
            r12 = 5
            X.5rC r1 = r0.A0O
            X.AnonymousClass5VK.A00(r1)
            X.4z4 r1 = r0.A12
            r11 = 0
            r5 = r0
            r6 = r1
            r7 = r4
            r8 = r3
            r9 = r2
            r5.A7t(r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x0942:
            if (r13 != r4) goto L_0x0958
            android.content.Intent r3 = X.C18320x8.A07()
            java.lang.String r2 = r0.getPackageName()
            java.lang.String r1 = "com.whatsapp.registration.RegisterPhone"
            r3.setClassName(r2, r1)
            java.lang.String r1 = "com.whatsapp.registration.RegisterPhone.tapped_sms_link"
            r3.putExtra(r1, r4)
            goto L_0x01a9
        L_0x0958:
            java.lang.String r5 = A0C(r5)
            r0.A1A = r5
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "VerifyPhoneNumber/onCreate/code "
            X.C18260x0.A0s(r1, r5, r2)
            goto L_0x014d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.VerifyPhoneNumber.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0414, code lost:
        r1 = new X.C1891190b(r11, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0419, code lost:
        r0.A0Y(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x044a, code lost:
        r1 = new X.C1891190b(r11, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0483, code lost:
        r0 = X.AnonymousClass5V0.A00(r11);
        X.C86624Kv.A0i(r11, r0, new java.lang.Object[]{X.C107565bW.A0D(r11.A00, r11.A0D)}, r7);
        r0.A0i(false);
        r0.A0Y(new X.AnonymousClass69W(r11, r4, 2), com.whatsapp.R.string.f11nameremoved);
        r3 = com.whatsapp.R.string.f11nameremoved;
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x04a9, code lost:
        r1 = new X.AnonymousClass913(r11, r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x04ae, code lost:
        r0.A0W(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x04b5, code lost:
        return r0.create();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008e, code lost:
        X.C18320x8.A0w(r1, r11, r0);
        r1.setIndeterminate(true);
        r1.setCancelable(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0097, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x02dc, code lost:
        return X.AnonymousClass36l.A03(r11, r11.A0U, r11.A00, r11.A0m, new X.C71543cH(r11, 15), r11.A1B, r11.A1E);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0331, code lost:
        return X.AnonymousClass36l.A06(r11, getString(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x038f, code lost:
        X.C86614Ku.A1O(r0, r11, r1, r2);
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog onCreateDialog(int r22) {
        /*
            r21 = this;
            r0 = 109(0x6d, float:1.53E-43)
            r11 = r21
            r4 = r22
            if (r4 == r0) goto L_0x04ed
            r0 = 500(0x1f4, float:7.0E-43)
            r5 = 0
            if (r4 == r0) goto L_0x0021
            r0 = 604(0x25c, float:8.46E-43)
            if (r4 == r0) goto L_0x04b6
            r6 = 1
            switch(r22) {
                case 21: goto L_0x02dd;
                case 22: goto L_0x02f9;
                case 23: goto L_0x0322;
                case 24: goto L_0x0332;
                case 25: goto L_0x0332;
                case 26: goto L_0x0351;
                case 27: goto L_0x0394;
                case 28: goto L_0x03b9;
                case 29: goto L_0x03d4;
                case 30: goto L_0x03ec;
                case 31: goto L_0x041e;
                case 32: goto L_0x047c;
                case 33: goto L_0x0478;
                case 34: goto L_0x045d;
                default: goto L_0x0015;
            }
        L_0x0015:
            r2 = 0
            switch(r22) {
                case 36: goto L_0x009f;
                case 37: goto L_0x0158;
                case 38: goto L_0x017a;
                case 39: goto L_0x019c;
                case 40: goto L_0x01be;
                case 41: goto L_0x00c1;
                case 42: goto L_0x02c3;
                case 43: goto L_0x00e0;
                case 44: goto L_0x01e0;
                case 45: goto L_0x0202;
                case 46: goto L_0x0220;
                case 47: goto L_0x0225;
                case 48: goto L_0x029d;
                case 49: goto L_0x0372;
                case 50: goto L_0x0480;
                case 51: goto L_0x02bf;
                case 52: goto L_0x0326;
                case 53: goto L_0x00e5;
                case 54: goto L_0x03fc;
                default: goto L_0x0019;
            }
        L_0x0019:
            switch(r22) {
                case 124: goto L_0x02c3;
                case 125: goto L_0x0034;
                case 126: goto L_0x0041;
                case 127: goto L_0x0063;
                case 128: goto L_0x006c;
                case 129: goto L_0x0086;
                case 130: goto L_0x0098;
                default: goto L_0x001c;
            }
        L_0x001c:
            android.app.Dialog r1 = super.onCreateDialog(r4)
        L_0x0020:
            return r1
        L_0x0021:
            android.app.Dialog r1 = super.onCreateDialog(r4)
            if (r1 == 0) goto L_0x0020
            boolean r0 = r11.A1R
            if (r0 == 0) goto L_0x0020
            r1.setCancelable(r5)
            r0 = 8
            X.C86654Ky.A0u(r1, r11, r0)
            return r1
        L_0x0034:
            X.5WY r3 = r11.A0U
            X.2mi r2 = r11.A0m
            java.lang.String r1 = r11.A1B
            java.lang.String r0 = r11.A1E
            android.app.Dialog r1 = X.AnonymousClass36l.A04(r11, r3, r2, r1, r0)
            return r1
        L_0x0041:
            X.5WY r13 = r11.A0U
            X.33j r14 = r11.A00
            X.2mi r15 = r11.A0m
            java.lang.String r4 = r11.A1B
            java.lang.String r3 = r11.A1E
            r1 = 15
            X.3cH r0 = new X.3cH
            r0.<init>((com.whatsapp.registration.VerifyPhoneNumber) r11, (int) r1)
            X.5hX r10 = r11.A00
            X.3Wi r12 = r11.A05
            r16 = r2
            r17 = r0
            r18 = r4
            r19 = r3
            X.043 r1 = X.AnonymousClass36l.A08(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r1
        L_0x0063:
            android.app.ProgressDialog r1 = new android.app.ProgressDialog
            r1.<init>(r11)
            r0 = 2131892953(0x7f121ad9, float:1.9420669E38)
            goto L_0x008e
        L_0x006c:
            r0 = 15
            X.3cH r3 = new X.3cH
            r3.<init>((com.whatsapp.registration.VerifyPhoneNumber) r11, (int) r0)
            r0 = 18
            X.3cH r2 = new X.3cH
            r2.<init>((com.whatsapp.registration.VerifyPhoneNumber) r11, (int) r0)
            r1 = 19
            X.3cH r0 = new X.3cH
            r0.<init>((com.whatsapp.registration.VerifyPhoneNumber) r11, (int) r1)
            android.app.Dialog r1 = X.AnonymousClass36l.A05(r11, r3, r2, r0)
            return r1
        L_0x0086:
            android.app.ProgressDialog r1 = new android.app.ProgressDialog
            r1.<init>(r11)
            r0 = 2131892974(0x7f121aee, float:1.9420711E38)
        L_0x008e:
            X.C18320x8.A0w(r1, r11, r0)
            r1.setIndeterminate(r6)
            r1.setCancelable(r5)
            return r1
        L_0x0098:
            java.lang.String r0 = "violationType"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x009f:
            X.0zH r0 = X.AnonymousClass5V0.A00(r11)
            android.content.res.Resources r1 = r11.getResources()
            X.33j r3 = r11.A00
            X.5UQ r4 = r11.A10
            java.lang.String r5 = "sms"
            java.lang.String r6 = r11.A79()
            X.2sH r2 = r11.A06
            java.lang.String r1 = A0L(r1, r2, r3, r4, r5, r6)
            r0.A0g(r1)
            r2 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r1 = 63
            goto L_0x038f
        L_0x00c1:
            r0 = 2131892936(0x7f121ac8, float:1.9420634E38)
            java.lang.String r2 = r11.getString(r0)
            X.0zH r0 = X.AnonymousClass5V0.A00(r11)
            r1 = 2131892893(0x7f121a9d, float:1.9420547E38)
            java.lang.String r1 = X.AnonymousClass0x2.A0X(r11, r2, r6, r1)
            r0.A0g(r1)
            r0.A0i(r5)
            r3 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r2 = 71
            goto L_0x0414
        L_0x00e0:
            r0 = 2131893160(0x7f121ba8, float:1.9421089E38)
            goto L_0x0329
        L_0x00e5:
            X.0zH r0 = X.AnonymousClass5V0.A00(r11)
            int r4 = r11.A03
            X.2oU r1 = r11.A0f
            android.content.Context r3 = r1.A00
            X.C162457s7.A0J(r3, r6)
            r2 = 2131888632(0x7f1209f8, float:1.9411905E38)
            if (r4 == r6) goto L_0x0153
            r1 = 2
            r2 = 2131888618(0x7f1209ea, float:1.9411876E38)
            if (r4 == r1) goto L_0x0153
            r1 = 3
            r2 = 2131888626(0x7f1209f2, float:1.9411893E38)
            if (r4 == r1) goto L_0x0153
            r1 = 4
            r2 = 2131888623(0x7f1209ef, float:1.9411887E38)
            if (r4 == r1) goto L_0x0153
            r1 = 5
            if (r4 == r1) goto L_0x0150
            java.lang.String r1 = ""
        L_0x010e:
            r0.A0h(r1)
            int r4 = r11.A03
            X.2oU r1 = r11.A0f
            android.content.Context r3 = r1.A00
            X.C162457s7.A0J(r3, r6)
            r2 = 2131888631(0x7f1209f7, float:1.9411903E38)
            if (r4 == r6) goto L_0x014b
            r1 = 2
            r2 = 2131888617(0x7f1209e9, float:1.9411874E38)
            if (r4 == r1) goto L_0x014b
            r1 = 3
            r2 = 2131888625(0x7f1209f1, float:1.941189E38)
            if (r4 == r1) goto L_0x014b
            r1 = 4
            r2 = 2131888622(0x7f1209ee, float:1.9411885E38)
            if (r4 == r1) goto L_0x014b
            r1 = 5
            if (r4 == r1) goto L_0x0148
            java.lang.String r1 = ""
        L_0x0136:
            r0.A0g(r1)
            r2 = 2131888620(0x7f1209ec, float:1.941188E38)
            r1 = 72
            X.C86614Ku.A1O(r0, r11, r1, r2)
            r3 = 2131888621(0x7f1209ed, float:1.9411882E38)
            r2 = 73
            goto L_0x044a
        L_0x0148:
            r2 = 2131888628(0x7f1209f4, float:1.9411897E38)
        L_0x014b:
            java.lang.String r1 = X.C18290x4.A0l(r3, r2)
            goto L_0x0136
        L_0x0150:
            r2 = 2131888629(0x7f1209f5, float:1.9411899E38)
        L_0x0153:
            java.lang.String r1 = X.C18290x4.A0l(r3, r2)
            goto L_0x010e
        L_0x0158:
            X.0zH r0 = X.AnonymousClass5V0.A00(r11)
            android.content.res.Resources r1 = r11.getResources()
            X.33j r3 = r11.A00
            X.5UQ r4 = r11.A10
            java.lang.String r5 = "voice"
            java.lang.String r6 = r11.A79()
            X.2sH r2 = r11.A06
            java.lang.String r1 = A0L(r1, r2, r3, r4, r5, r6)
            r0.A0g(r1)
            r2 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r1 = 62
            goto L_0x038f
        L_0x017a:
            X.0zH r0 = X.AnonymousClass5V0.A00(r11)
            android.content.res.Resources r1 = r11.getResources()
            X.33j r3 = r11.A00
            X.5UQ r4 = r11.A10
            java.lang.String r5 = "wa_old"
            java.lang.String r6 = r11.A79()
            X.2sH r2 = r11.A06
            java.lang.String r1 = A0L(r1, r2, r3, r4, r5, r6)
            r0.A0g(r1)
            r2 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r1 = 64
            goto L_0x038f
        L_0x019c:
            X.0zH r0 = X.AnonymousClass5V0.A00(r11)
            android.content.res.Resources r1 = r11.getResources()
            X.33j r3 = r11.A00
            X.5UQ r4 = r11.A10
            java.lang.String r5 = "sms"
            java.lang.String r6 = r11.A79()
            X.2sH r2 = r11.A06
            java.lang.String r1 = A0X(r1, r2, r3, r4, r5, r6)
            r0.A0g(r1)
            r2 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r1 = 77
            goto L_0x038f
        L_0x01be:
            X.0zH r0 = X.AnonymousClass5V0.A00(r11)
            android.content.res.Resources r1 = r11.getResources()
            X.33j r3 = r11.A00
            X.5UQ r4 = r11.A10
            java.lang.String r5 = "wa_old"
            java.lang.String r6 = r11.A79()
            X.2sH r2 = r11.A06
            java.lang.String r1 = A0X(r1, r2, r3, r4, r5, r6)
            r0.A0g(r1)
            r2 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r1 = 60
            goto L_0x038f
        L_0x01e0:
            r0 = 2131624767(0x7f0e033f, float:1.8876723E38)
            android.view.View r3 = android.view.View.inflate(r11, r0, r2)
            X.0zH r2 = X.AnonymousClass5V0.A00(r11)
            r0 = 2131434620(0x7f0b1c7c, float:1.849106E38)
            android.widget.TextView r1 = X.AnonymousClass002.A09(r3, r0)
            if (r1 == 0) goto L_0x01fa
            r0 = 2131886210(0x7f120082, float:1.9406992E38)
            r1.setText(r0)
        L_0x01fa:
            r2.setView(r3)
            X.043 r1 = r2.create()
            return r1
        L_0x0202:
            X.0zH r0 = X.AnonymousClass5V0.A00(r11)
            r1 = 2131892998(0x7f121b06, float:1.942076E38)
            r0.A0U(r1)
            r1 = 2131892997(0x7f121b05, float:1.9420758E38)
            r0.A0T(r1)
            r0.A0i(r5)
            r3 = 2131891394(0x7f1214c2, float:1.9417507E38)
            r1 = 116(0x74, float:1.63E-43)
            X.68t r1 = X.C1235268t.A00(r11, r1)
            goto L_0x0419
        L_0x0220:
            r0 = 2131893132(0x7f121b8c, float:1.9421032E38)
            goto L_0x0329
        L_0x0225:
            r0 = 16
            X.3cH r8 = new X.3cH
            r8.<init>((com.whatsapp.registration.VerifyPhoneNumber) r11, (int) r0)
            r0 = 2131624931(0x7f0e03e3, float:1.8877056E38)
            android.view.View r4 = android.view.View.inflate(r11, r0, r2)
            r0 = 2131429449(0x7f0b0849, float:1.8480571E38)
            android.widget.TextView r7 = X.C18300x5.A0G(r4, r0)
            X.C86654Ky.A1E(r7)
            r10 = 2131893144(0x7f121b98, float:1.9421056E38)
            java.lang.Object[] r9 = new java.lang.Object[r6]
            java.lang.String r1 = r11.A1E
            if (r1 == 0) goto L_0x029b
            java.lang.String r0 = r11.A1B
            if (r0 == 0) goto L_0x029b
            X.33j r3 = r11.A00
            java.lang.String r2 = X.AnonymousClass36l.A0C(r0, r1)
            r1 = 32
            r0 = 160(0xa0, float:2.24E-43)
            java.lang.String r0 = r2.replace(r1, r0)
            java.lang.String r0 = r3.A0I(r0)
        L_0x025c:
            java.lang.String r0 = X.AnonymousClass002.A0F(r11, r0, r9, r5, r10)
            android.text.SpannableStringBuilder r0 = r11.A77(r8, r0, r6)
            r7.setText(r0)
            r1 = 2
            X.67b r0 = new X.67b
            r0.<init>(r8, r1, r11)
            X.C06560Yg.A0O(r7, r0)
            r0 = 2131434454(0x7f0b1bd6, float:1.8490722E38)
            android.view.View r2 = X.C06560Yg.A02(r4, r0)
            r1 = 14
            X.5f2 r0 = new X.5f2
            r0.<init>(r11, r1)
            r2.setOnClickListener(r0)
            r0 = 2131434653(0x7f0b1c9d, float:1.8491126E38)
            android.view.View r2 = X.C06560Yg.A02(r4, r0)
            r1 = 15
            X.5f2 r0 = new X.5f2
            r0.<init>(r11, r1)
            r2.setOnClickListener(r0)
            X.0zH r0 = X.AnonymousClass5V0.A02(r11, r4)
            r0.A0i(r5)
            goto L_0x04b1
        L_0x029b:
            r0 = 0
            goto L_0x025c
        L_0x029d:
            X.0zH r0 = X.AnonymousClass5V0.A00(r11)
            android.content.res.Resources r1 = r11.getResources()
            X.33j r3 = r11.A00
            X.5UQ r4 = r11.A10
            java.lang.String r5 = "email_otp"
            java.lang.String r6 = r11.A79()
            X.2sH r2 = r11.A06
            java.lang.String r1 = A0X(r1, r2, r3, r4, r5, r6)
            r0.A0g(r1)
            r2 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r1 = 61
            goto L_0x038f
        L_0x02bf:
            r0 = 2131893539(0x7f121d23, float:1.9421857E38)
            goto L_0x0329
        L_0x02c3:
            X.5WY r12 = r11.A0U
            X.33j r13 = r11.A00
            X.2mi r14 = r11.A0m
            java.lang.String r2 = r11.A1B
            java.lang.String r1 = r11.A1E
            r0 = 15
            X.3cH r15 = new X.3cH
            r15.<init>((com.whatsapp.registration.VerifyPhoneNumber) r11, (int) r0)
            r16 = r2
            r17 = r1
            android.app.Dialog r1 = X.AnonymousClass36l.A03(r11, r12, r13, r14, r15, r16, r17)
            return r1
        L_0x02dd:
            X.0zH r0 = X.AnonymousClass5V0.A00(r11)
            r3 = 2131892895(0x7f121a9f, float:1.9420551E38)
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r1 = 2131888105(0x7f1207e9, float:1.9410836E38)
            java.lang.String r1 = r11.getString(r1)
            r2[r5] = r1
            X.C86624Kv.A0i(r11, r0, r2, r3)
            r3 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r2 = 59
            goto L_0x0414
        L_0x02f9:
            r11.A7Z(r5)
            X.317 r0 = r11.A0w
            r0.A0B(r6, r6)
            X.2sH r4 = r11.A06
            X.1VX r3 = r11.A0D
            X.2i5 r14 = r11.A0X
            X.4FV r2 = r11.A0k
            X.5XU r13 = r11.A0T
            X.5hX r12 = r11.A00
            X.33i r1 = r11.A08
            X.33j r0 = r11.A00
            X.2nM r15 = r11.A0d
            r16 = r1
            r17 = r4
            r18 = r0
            r19 = r3
            r20 = r2
            android.app.Dialog r1 = X.C105435Ux.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r1
        L_0x0322:
            r0 = 2131892980(0x7f121af4, float:1.9420724E38)
            goto L_0x0329
        L_0x0326:
            r0 = 2131893541(0x7f121d25, float:1.9421861E38)
        L_0x0329:
            java.lang.String r0 = r11.getString(r0)
            android.app.ProgressDialog r1 = X.AnonymousClass36l.A06(r11, r0)
            return r1
        L_0x0332:
            X.0zH r0 = X.AnonymousClass5V0.A00(r11)
            r1 = 2131892950(0x7f121ad6, float:1.9420663E38)
            r0.A0T(r1)
            r0.A0i(r5)
            r3 = 2131892900(0x7f121aa4, float:1.9420561E38)
            r2 = 3
            X.69W r1 = new X.69W
            r1.<init>(r11, r4, r2)
            r0.A0Y(r1, r3)
            r3 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r2 = 2
            goto L_0x04a9
        L_0x0351:
            X.0zH r0 = X.AnonymousClass5V0.A00(r11)
            android.content.res.Resources r1 = r11.getResources()
            X.33j r3 = r11.A00
            X.5UQ r4 = r11.A10
            java.lang.String r5 = "voice"
            java.lang.String r6 = r11.A79()
            X.2sH r2 = r11.A06
            java.lang.String r1 = A0X(r1, r2, r3, r4, r5, r6)
            r0.A0g(r1)
            r2 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r1 = 76
            goto L_0x038f
        L_0x0372:
            X.0zH r0 = X.AnonymousClass5V0.A00(r11)
            android.content.res.Resources r1 = r11.getResources()
            X.33j r3 = r11.A00
            X.5UQ r4 = r11.A10
            java.lang.String r5 = "email_otp"
            r6 = 0
            X.2sH r2 = r11.A06
            java.lang.String r1 = A0L(r1, r2, r3, r4, r5, r6)
            r0.A0g(r1)
            r2 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r1 = 65
        L_0x038f:
            X.C86614Ku.A1O(r0, r11, r1, r2)
            goto L_0x04b1
        L_0x0394:
            X.0zH r0 = X.AnonymousClass5V0.A00(r11)
            boolean r2 = r11.A8C()
            r1 = 2131892923(0x7f121abb, float:1.9420608E38)
            if (r2 == 0) goto L_0x03a4
            r1 = 2131893140(0x7f121b94, float:1.9421048E38)
        L_0x03a4:
            r0.A0T(r1)
            r0.A0i(r5)
            r2 = 2131892900(0x7f121aa4, float:1.9420561E38)
            r1 = 113(0x71, float:1.58E-43)
            X.C1235268t.A03(r0, r11, r1, r2)
            r3 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r2 = 66
            goto L_0x044a
        L_0x03b9:
            X.0zH r0 = X.AnonymousClass5V0.A00(r11)
            r1 = 2131893908(0x7f121e94, float:1.9422606E38)
            r0.A0T(r1)
            r0.A0i(r5)
            r2 = 2131892900(0x7f121aa4, float:1.9420561E38)
            r1 = 115(0x73, float:1.61E-43)
            X.C1235268t.A03(r0, r11, r1, r2)
            r3 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r2 = 69
            goto L_0x044a
        L_0x03d4:
            X.0zH r0 = X.AnonymousClass5V0.A00(r11)
            X.33j r3 = r11.A00
            r2 = 2131755292(0x7f10011c, float:1.914146E38)
            int r1 = A1c
            java.lang.String r1 = X.C86604Kt.A0q(r3, r1, r5, r2)
            r0.A0g(r1)
            r3 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r2 = 70
            goto L_0x0414
        L_0x03ec:
            X.0zH r0 = X.AnonymousClass5V0.A00(r11)
            r1 = 2131892979(0x7f121af3, float:1.9420722E38)
            r0.A0T(r1)
            r3 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r2 = 68
            goto L_0x0414
        L_0x03fc:
            X.0zH r0 = X.AnonymousClass5V0.A00(r11)
            r1 = 2131891669(0x7f1215d5, float:1.9418065E38)
            r0.A0U(r1)
            r1 = 2131891670(0x7f1215d6, float:1.9418067E38)
            r0.A0T(r1)
            r0.A0i(r5)
            r3 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r2 = 74
        L_0x0414:
            X.90b r1 = new X.90b
            r1.<init>(r11, r2)
        L_0x0419:
            r0.A0Y(r1, r3)
            goto L_0x04b1
        L_0x041e:
            X.0zH r0 = X.AnonymousClass5V0.A00(r11)
            boolean r1 = r11.A8E()
            if (r1 == 0) goto L_0x0450
            r7 = 2131892991(0x7f121aff, float:1.9420746E38)
        L_0x042b:
            java.lang.Object[] r4 = new java.lang.Object[r6]
            X.33j r3 = r11.A00
            long r1 = r11.A0D
            java.lang.String r1 = X.C107565bW.A0D(r3, r1)
            r4[r5] = r1
            X.C86624Kv.A0i(r11, r0, r4, r7)
            r0.A0i(r5)
            r2 = 2131895973(0x7f1226a5, float:1.9426794E38)
            r1 = 114(0x72, float:1.6E-43)
            X.C1235268t.A03(r0, r11, r1, r2)
            r3 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r2 = 67
        L_0x044a:
            X.90b r1 = new X.90b
            r1.<init>(r11, r2)
            goto L_0x04ae
        L_0x0450:
            boolean r1 = r11.A8C()
            r7 = 2131892921(0x7f121ab9, float:1.9420604E38)
            if (r1 == 0) goto L_0x042b
            r7 = 2131893141(0x7f121b95, float:1.942105E38)
            goto L_0x042b
        L_0x045d:
            X.0zH r0 = X.AnonymousClass5V0.A00(r11)
            r1 = 2131892889(0x7f121a99, float:1.942054E38)
            r0.A0T(r1)
            r0.A0i(r5)
            r3 = 2131891394(0x7f1214c2, float:1.9417507E38)
            r2 = 75
            X.90b r1 = new X.90b
            r1.<init>(r11, r2)
            r0.A0X(r1, r3)
            goto L_0x04b1
        L_0x0478:
            r7 = 2131892988(0x7f121afc, float:1.942074E38)
            goto L_0x0483
        L_0x047c:
            r7 = 2131893909(0x7f121e95, float:1.9422608E38)
            goto L_0x0483
        L_0x0480:
            r7 = 2131888842(0x7f120aca, float:1.941233E38)
        L_0x0483:
            X.0zH r0 = X.AnonymousClass5V0.A00(r11)
            java.lang.Object[] r6 = new java.lang.Object[r6]
            X.33j r3 = r11.A00
            long r1 = r11.A0D
            java.lang.String r1 = X.C107565bW.A0D(r3, r1)
            r6[r5] = r1
            X.C86624Kv.A0i(r11, r0, r6, r7)
            r0.A0i(r5)
            r3 = 2131895973(0x7f1226a5, float:1.9426794E38)
            r2 = 2
            X.69W r1 = new X.69W
            r1.<init>(r11, r4, r2)
            r0.A0Y(r1, r3)
            r3 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r2 = 1
        L_0x04a9:
            X.913 r1 = new X.913
            r1.<init>(r11, r4, r2)
        L_0x04ae:
            r0.A0W(r1, r3)
        L_0x04b1:
            X.043 r1 = r0.create()
            return r1
        L_0x04b6:
            X.33j r2 = r11.A00
            java.lang.String r1 = r11.A1B
            java.lang.String r0 = r11.A1E
            java.lang.String r4 = X.AnonymousClass4SG.A2v(r2, r1, r0)
            X.0zH r3 = X.AnonymousClass5V0.A00(r11)
            r2 = 2131886202(0x7f12007a, float:1.9406976E38)
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r0[r5] = r4
            android.text.Spanned r0 = X.C107575bX.A00(r11, r0, r2)
            r3.A0g(r0)
            r3.A0i(r1)
            r0 = 2131891394(0x7f1214c2, float:1.9417507E38)
            java.lang.String r2 = r11.getString(r0)
            r0 = 95
            X.68t r1 = X.C1235268t.A00(r11, r0)
            X.0Uj r0 = r3.A00
            r0.A0I(r1, r2)
            X.043 r1 = r3.create()
            return r1
        L_0x04ed:
            X.4FS r2 = r11.A04
            X.5WY r12 = r11.A0U
            X.33i r14 = r11.A08
            X.2mi r1 = r11.A0m
            X.1ip r13 = r11.A07
            X.5ZR r15 = r11.A0h
            X.2sl r0 = r11.A0v
            r16 = r1
            r17 = r0
            r18 = r2
            android.app.Dialog r1 = X.AnonymousClass36l.A02(r11, r12, r13, r14, r15, r16, r17, r18)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.VerifyPhoneNumber.onCreateDialog(int):android.app.Dialog");
    }

    public void onDestroy() {
        Log.i("VerifyPhoneNumber/ondestroy");
        A7O();
        this.A13.A00();
        HashMap hashMap = this.A1a;
        Iterator A0u2 = AnonymousClass001.A0u(hashMap);
        while (A0u2.hasNext()) {
            Map.Entry A0w2 = AnonymousClass001.A0w(A0u2);
            if (A0w2.getValue() != null) {
                ((CountDownTimer) A0w2.getValue()).cancel();
                hashMap.put(A0w2.getKey(), (Object) null);
            }
        }
        hashMap.clear();
        A7B();
        A7C();
        this.A07.A07(this.A1Y);
        this.A0u.A00();
        super.onDestroy();
    }

    public void onNewIntent(Intent intent) {
        Log.i("VerifyPhoneNumber/intent");
        super.onNewIntent(intent);
        String A0C2 = A0C(intent);
        if (A0C2 == null) {
            int A012 = C18320x8.A01(intent, "com.whatsapp.verifynumber.dialog");
            int i = 21;
            if (A012 != 21) {
                i = 22;
                if (A012 != 22) {
                    C18260x0.A0y("VerifyPhoneNumber/intent/unknown ", AnonymousClass001.A0o(), A012);
                    return;
                }
            }
            C621433s.A01(this, i);
        } else if (this.A1J) {
            A80(A0C2);
        } else {
            C18260x0.A0s("VerifyPhoneNumber/intent/defer-code/", A0C2, AnonymousClass001.A0o());
            this.A1A = A0C2;
        }
    }

    public void onPrepareDialog(int i, Dialog dialog) {
        AnonymousClass043 r8;
        String str;
        AnonymousClass5UQ r3;
        C620733j r2;
        Resources resources;
        String A0X2;
        AnonymousClass043 r82;
        Resources resources2;
        C620733j r22;
        AnonymousClass5UQ r32;
        String str2;
        if (i == 26) {
            r82 = (AnonymousClass043) dialog;
            resources = getResources();
            r2 = this.A00;
            r3 = this.A10;
            str = "voice";
            A0X2 = A0X(resources, this.A06, r2, r3, str, A79());
        } else if (i != 39) {
            if (i == 36) {
                r8 = (AnonymousClass043) dialog;
                resources2 = getResources();
                r22 = this.A00;
                r32 = this.A10;
                str2 = "sms";
            } else if (i == 37) {
                r8 = (AnonymousClass043) dialog;
                resources2 = getResources();
                r22 = this.A00;
                r32 = this.A10;
                str2 = "voice";
            } else {
                return;
            }
            A0X2 = A0L(resources2, this.A06, r22, r32, str2, A79());
        } else {
            r82 = (AnonymousClass043) dialog;
            resources = getResources();
            r2 = this.A00;
            r3 = this.A10;
            str = "sms";
            A0X2 = A0X(resources, this.A06, r2, r3, str, A79());
        }
        C06200Wq r0 = r8.A00;
        r0.A0Q = A0X2;
        TextView textView = r0.A0K;
        if (textView != null) {
            textView.setText(A0X2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0128, code lost:
        if (A8D() != false) goto L_0x012a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r22 = this;
            r14 = r22
            super.onResume()
            X.5Te r0 = r14.A0s
            r0.A00()
            java.lang.String r0 = r14.A1B
            if (r0 == 0) goto L_0x033a
            java.lang.String r0 = r14.A1E
            if (r0 == 0) goto L_0x033a
            int r1 = X.AnonymousClass4SG.A2K(r14)
            r0 = 12
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            if (r0 != 0) goto L_0x005f
            int r1 = X.AnonymousClass4SG.A2K(r14)
            r0 = 20
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            if (r0 != 0) goto L_0x005f
            android.content.SharedPreferences r2 = X.AnonymousClass1Hf.A27(r14)
            java.lang.String r1 = "pref_autoconf_verification_status"
            r0 = -1
            int r0 = r2.getInt(r1, r0)
            r6 = 1
            if (r0 != r6) goto L_0x0042
            X.1VW r1 = r14.A0j
            r0 = 3131(0xc3b, float:4.387E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 != 0) goto L_0x004e
        L_0x0042:
            android.content.SharedPreferences r1 = X.AnonymousClass1Hf.A27(r14)
            java.lang.String r0 = "silent_auth_verification_status"
            boolean r0 = X.C18280x3.A1W(r1, r0)
            if (r0 == 0) goto L_0x006a
        L_0x004e:
            int r1 = X.AnonymousClass4SG.A2K(r14)
            r0 = 2
            if (r1 != r0) goto L_0x0060
            r1 = 21
        L_0x0057:
            X.3cH r0 = new X.3cH
            r0.<init>((com.whatsapp.registration.VerifyPhoneNumber) r14, (int) r1)
            r14.A7w(r0)
        L_0x005f:
            return
        L_0x0060:
            int r1 = X.AnonymousClass4SG.A2K(r14)
            r0 = 7
            if (r1 != r0) goto L_0x006a
            r1 = 11
            goto L_0x0057
        L_0x006a:
            android.content.SharedPreferences r1 = X.AnonymousClass1Hf.A27(r14)
            java.lang.String r0 = "registration_sms_code_length"
            r2 = 6
            int r0 = r1.getInt(r0, r2)
            A1b = r0
            android.content.SharedPreferences r1 = X.AnonymousClass1Hf.A27(r14)
            java.lang.String r0 = "registration_voice_code_length"
            int r0 = r1.getInt(r0, r2)
            A1c = r0
            X.5UC r0 = r14.A0q
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x0091
            com.whatsapp.CodeInputField r1 = r14.A0Q
            int r0 = A1c
            r1.A02 = r0
        L_0x0091:
            boolean r0 = X.AnonymousClass4SG.A4D(r14)
            if (r0 == 0) goto L_0x0336
            java.lang.String r1 = "verify-second-sms"
        L_0x0099:
            X.2pm r0 = r14.A0z
            r0.A02(r1)
            r2 = 0
            android.content.SharedPreferences r1 = r14.getPreferences(r2)
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.verification_state"
            int r2 = r1.getInt(r0, r2)
            A1d = r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VerifyPhoneNumber/resume verification_state="
            X.C18260x0.A0y(r0, r1, r2)
            int r2 = A1d
            r1 = 4
            r0 = 21
            if (r2 == r1) goto L_0x0331
            r0 = 8
            if (r2 == r0) goto L_0x032f
            r1 = 12
            X.5UQ r0 = r14.A10
            if (r2 == r1) goto L_0x02dd
            java.lang.String r8 = "sms"
            long r2 = r0.A00(r8)
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            X.5UQ r0 = r14.A10
            java.lang.String r7 = "voice"
            long r20 = r0.A00(r7)
            long r0 = java.lang.System.currentTimeMillis()
            long r20 = r20 - r0
            X.5UQ r0 = r14.A10
            java.lang.String r10 = "wa_old"
            long r4 = r0.A00(r10)
            long r0 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r0
            X.5UQ r0 = r14.A10
            java.lang.String r9 = "email_otp"
            long r0 = r0.A00(r9)
            long r11 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r11
            boolean r13 = r14.A8E()
            r11 = 0
            if (r13 == 0) goto L_0x026a
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x0107
            r14.A7d(r4, r10)
        L_0x0107:
            X.5UQ r0 = r14.A10
            r0.A04(r10)
            boolean r0 = r14.A1J
            if (r0 != 0) goto L_0x0119
            boolean r0 = r14.A1O
            if (r0 != 0) goto L_0x0119
            boolean r0 = r14.A1U
            r14.A89(r0)
        L_0x0119:
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x0207
            r14.A7d(r2, r8)
            boolean r0 = r14.A1J
            if (r0 != 0) goto L_0x012d
            boolean r0 = r14.A8D()
            if (r0 == 0) goto L_0x012d
        L_0x012a:
            r14.A8B(r6)
        L_0x012d:
            r14.A7R()
            boolean r0 = r14.A8C()
            if (r0 != 0) goto L_0x018e
            boolean r0 = r14.A8D()
            if (r0 != 0) goto L_0x018e
            boolean r0 = r14.A8E()
            if (r0 != 0) goto L_0x018e
            int r1 = X.AnonymousClass4SG.A2K(r14)
            r0 = 12
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            if (r0 != 0) goto L_0x018e
            int r1 = X.AnonymousClass4SG.A2K(r14)
            r0 = 20
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            if (r0 != 0) goto L_0x018e
            X.1VW r1 = r14.A0j
            r0 = 3977(0xf89, float:5.573E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 != 0) goto L_0x0182
            X.1VW r1 = r14.A0j
            r0 = 4056(0xfd8, float:5.684E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 != 0) goto L_0x0182
            X.1VW r1 = r14.A0j
            r0 = 4057(0xfd9, float:5.685E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 != 0) goto L_0x0182
            X.1VW r1 = r14.A0j
            r0 = 4058(0xfda, float:5.686E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x018e
        L_0x0182:
            r0 = 22
            X.3cH r1 = new X.3cH
            r1.<init>((com.whatsapp.registration.VerifyPhoneNumber) r14, (int) r0)
            android.os.Handler r0 = r14.A0H
            r0.post(r1)
        L_0x018e:
            android.os.CountDownTimer r0 = r14.A0F
            if (r0 != 0) goto L_0x01a7
            X.5UQ r0 = r14.A10
            android.content.SharedPreferences r1 = r0.A00
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.code_verification_retry_time"
            long r2 = X.AnonymousClass0x2.A0A(r1, r0)
            java.lang.System.currentTimeMillis()
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            r14.A7a(r2)
        L_0x01a7:
            int r1 = r14.A74()
            r0 = 14
            if (r1 != r0) goto L_0x01d0
            X.5X2 r5 = r14.A0p
            java.lang.String r4 = r14.A1B
            X.C626936e.A06(r4)
            java.lang.String r3 = r14.A1E
            X.C626936e.A06(r3)
            r0 = 0
            X.6Bj r2 = new X.6Bj
            r2.<init>(r14, r0)
            java.lang.String r0 = "AccountDefenceSecondCodeViewPresenter/startFetchingDeviceConfirmationStatus"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.2hq r1 = r5.A02
            X.5ok r0 = new X.5ok
            r0.<init>(r5, r2)
            r1.A01(r0, r4, r3)
        L_0x01d0:
            android.content.res.Resources r0 = r14.getResources()
            boolean r0 = X.AnonymousClass36l.A0P(r0)
            if (r0 != 0) goto L_0x01e8
            com.whatsapp.CodeInputField r0 = r14.A0Q
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x01e8
            com.whatsapp.CodeInputField r1 = r14.A0Q
            r0 = 0
            r1.A07(r0)
        L_0x01e8:
            X.33T r1 = r14.A0g
            java.lang.String r0 = "VerifySms1"
            r1.A05(r6, r0)
            java.lang.String r2 = r14.A1A
            if (r2 == 0) goto L_0x0204
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VerifyPhoneNumber/resume/scheme/code "
            X.C18260x0.A0s(r0, r2, r1)
            java.lang.String r0 = r14.A1A
            r14.A80(r0)
            r0 = 0
            r14.A1A = r0
        L_0x0204:
            r14.A1J = r6
            return
        L_0x0207:
            X.5UQ r0 = r14.A10
            r0.A04(r8)
            boolean r0 = X.AnonymousClass4SG.A4D(r14)
            if (r0 == 0) goto L_0x0234
            X.5X2 r0 = r14.A0p
            X.2hq r0 = r0.A02
            X.5Pg r0 = r0.A06
            long r15 = r0.A00()
            r18 = r2
            r17 = r8
            r14.A7e(r15, r17, r18)
            X.5X2 r0 = r14.A0p
            X.2hq r0 = r0.A02
            X.5Pg r0 = r0.A06
            long r17 = r0.A01()
            r16 = r14
            r19 = r7
            r16.A7e(r17, r19, r20)
        L_0x0234:
            boolean r0 = r14.A1J
            if (r0 != 0) goto L_0x012d
            boolean r0 = r14.A1O
            if (r0 != 0) goto L_0x012d
            boolean r0 = r14.A8D()
            if (r0 != 0) goto L_0x012a
            boolean r0 = r14.A8E()
            if (r0 != 0) goto L_0x012d
            boolean r0 = r14.A8C()
            if (r0 != 0) goto L_0x012d
            int r1 = X.AnonymousClass4SG.A2K(r14)
            r0 = 23
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            if (r0 != 0) goto L_0x012d
            boolean r0 = r14.A1S
            if (r0 == 0) goto L_0x0263
            r14.A7A()
            goto L_0x012d
        L_0x0263:
            boolean r0 = r14.A1U
            r14.A88(r0)
            goto L_0x012d
        L_0x026a:
            boolean r4 = r14.A8C()
            if (r4 == 0) goto L_0x028b
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x0277
            r14.A7d(r0, r9)
        L_0x0277:
            X.5UQ r0 = r14.A10
            r0.A04(r9)
            boolean r0 = r14.A1J
            if (r0 != 0) goto L_0x0119
            boolean r0 = r14.A1O
            if (r0 != 0) goto L_0x0119
            boolean r0 = r14.A1U
            r14.A87(r0)
            goto L_0x0119
        L_0x028b:
            int r0 = X.AnonymousClass4SG.A2K(r14)
            r4 = 23
            boolean r0 = X.AnonymousClass000.A1U(r0, r4)
            if (r0 == 0) goto L_0x0119
            boolean r0 = r14.A1J
            if (r0 != 0) goto L_0x0119
            boolean r0 = r14.A1O
            if (r0 != 0) goto L_0x0119
            X.33p r1 = r14.A09
            java.lang.String r0 = "silent_auth_entered"
            r1.A1X(r0)
            boolean r0 = r14.A8D()
            if (r0 != 0) goto L_0x02af
            X.C621433s.A01(r14, r4)
        L_0x02af:
            X.1ip r0 = r14.A07
            int r0 = r0.A08(r6)
            if (r0 != r6) goto L_0x02c7
            X.2oU r5 = r14.A0f
            X.1VW r4 = r14.A0j
            X.33p r1 = r14.A09
            X.5og r0 = new X.5og
            r0.<init>(r14)
            X.AnonymousClass36l.A0N(r5, r1, r4, r0)
            goto L_0x0119
        L_0x02c7:
            if (r0 != 0) goto L_0x02d7
            X.33p r1 = r14.A09
            java.lang.String r0 = "silent_auth_no_internet"
            r1.A1X(r0)
            int r0 = r14.A04
            r14.A7U(r0)
            goto L_0x0119
        L_0x02d7:
            r0 = 0
            r14.A7g(r0)
            goto L_0x0119
        L_0x02dd:
            android.content.SharedPreferences r8 = r0.A00
            java.lang.String r7 = "com.whatsapp.registration.VerifyPhoneNumber.appeal_token"
            boolean r0 = r8.contains(r7)
            java.lang.String r5 = "com.whatsapp.registration.VerifyPhoneNumber.is_eu_smb"
            java.lang.String r4 = "com.whatsapp.registration.VerifyPhoneNumber.violation_type"
            java.lang.String r1 = "com.whatsapp.registration.VerifyPhoneNumber.violated_policy"
            r3 = 0
            if (r0 == 0) goto L_0x0318
            boolean r0 = r8.contains(r1)
            if (r0 == 0) goto L_0x0318
            boolean r0 = r8.contains(r4)
            if (r0 == 0) goto L_0x0318
            boolean r0 = r8.contains(r5)
            if (r0 == 0) goto L_0x0318
            r2 = 0
            r8.getString(r4, r2)
            r8.getString(r1, r2)
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.violation_reason"
            r8.getString(r0, r2)
            java.lang.String r1 = "com.whatsapp.registration.VerifyPhoneNumber.violation_source"
            r0 = -1
            r8.getInt(r1, r0)
            r8.getBoolean(r5, r3)
            r8.getString(r7, r2)
        L_0x0318:
            android.widget.TextView r1 = r14.A0M
            r0 = 2131892951(0x7f121ad7, float:1.9420665E38)
            r1.setText(r0)
            com.whatsapp.TextEmojiLabel r0 = r14.A0W
            r1 = 8
            r0.setVisibility(r1)
            android.widget.RelativeLayout r0 = r14.A0L
            r0.setVisibility(r1)
            r0 = 124(0x7c, float:1.74E-43)
            goto L_0x0331
        L_0x032f:
            r0 = 22
        L_0x0331:
            X.C621433s.A01(r14, r0)
            goto L_0x01e8
        L_0x0336:
            java.lang.String r1 = "verify-sms"
            goto L_0x0099
        L_0x033a:
            java.lang.String r0 = "VerifyPhoneNumber/resume/cc or num is missing, bounce to regphone"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r14.A7L()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.VerifyPhoneNumber.onResume():void");
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("use_sms_retriever", this.A1W);
        bundle.putBoolean("has_retried_flash_call", this.A1K);
        super.onSaveInstanceState(bundle);
    }

    public VerifyPhoneNumber(int i) {
        this.A1L = false;
        C86604Kt.A1K(this, 86);
    }

    public final String A78() {
        if (AnonymousClass000.A1U(AnonymousClass4SG.A2K(this), 20)) {
            return "verify_passkey";
        }
        if (A8C()) {
            return "verify_email_otp";
        }
        if (A8E()) {
            return "verify_wa_old";
        }
        if (AnonymousClass000.A1U(AnonymousClass4SG.A2K(this), 23)) {
            return "verify_silent_auth";
        }
        if (AnonymousClass4SG.A4D(this)) {
            return "verify_second_sms";
        }
        return "verify_sms";
    }

    public final String A79() {
        int i;
        int A2K;
        if (A8E() || A8C() || (((A2K = AnonymousClass4SG.A2K(this)) == 13 || A2K == 14) && !this.A1M)) {
            i = R.string.f11nameremoved;
        } else {
            i = R.string.f11nameremoved;
        }
        return getString(i);
    }

    public final void A7L() {
        Intent A042;
        A7K();
        if (this.A1G) {
            Log.i("VerifyPhoneNumber/returnToEnterPhoneNumber/change numberflow");
            this.A0w.A0B(3, true);
            if (!this.A0w.A0F()) {
                finish();
            }
            A042 = C18320x8.A07();
            A042.setClassName(getPackageName(), "com.whatsapp.registration.ChangeNumber");
        } else {
            Log.i("VerifyPhoneNumber/returnToEnterPhoneNumber/reg flow");
            this.A0w.A0B(1, true);
            A042 = C627736r.A04(this);
            A042.putExtra("com.whatsapp.registration.RegisterPhone.clear_phone_number", true);
        }
        startActivity(A042);
        finish();
    }

    public final void A7M() {
        String str;
        if (!A8D()) {
            boolean A8E = A8E();
            AnonymousClass5UQ r1 = this.A10;
            if (A8E) {
                str = "wa_old";
            } else {
                str = "sms";
            }
            long A002 = r1.A00(str);
            long currentTimeMillis = System.currentTimeMillis();
            long j = -1;
            if (A002 != -1) {
                j = A002 - currentTimeMillis;
            }
            if (A002 > currentTimeMillis) {
                this.A0w.A0C(j);
            }
        }
    }

    public final void A7P() {
        boolean A8D = A8D();
        AnonymousClass33p r0 = this.A09;
        if (A8D) {
            C18270x1.A0j(C18270x1.A03(r0), "pref_primary_flash_call_status", "primary_successful");
        } else {
            C18270x1.A0j(C18270x1.A03(r0), "pref_secondary_flash_call_status", "secondary_successful");
        }
    }

    public final void A7V(int i) {
        C18260x0.A0w("VerifyPhoneNumber/notify/dialog ", AnonymousClass001.A0o(), i);
        if (this.A0s.A02 || BHW()) {
            AnonymousClass36l.A0H(this, this.A0g, i);
        } else {
            C621433s.A01(this, i);
        }
    }

    public final void A7X(int i) {
        if (!AnonymousClass000.A1U(AnonymousClass4SG.A2K(this), 12) && !AnonymousClass000.A1U(AnonymousClass4SG.A2K(this), 20) && !A8D()) {
            this.A0s.A01(i);
        }
    }

    public final void A7Y(int i) {
        String string = getString(i);
        C18260x0.A0s("VerifyPhoneNumber/showProgressDialog/", string, AnonymousClass001.A0o());
        ProgressDialog progressDialog = new ProgressDialog(this);
        C86604Kt.A0y(progressDialog, string);
        progressDialog.show();
        this.A0E = progressDialog;
    }

    public final void A7b(long j) {
        if (!AnonymousClass000.A1U(AnonymousClass4SG.A2K(this), 12) && !AnonymousClass000.A1U(AnonymousClass4SG.A2K(this), 20) && !A8D()) {
            this.A0w.A0C(j);
        }
    }

    public final void A7e(long j, String str, long j2) {
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("VerifyPhoneNumber/updateRequestCodeTimerPerMethod/method=");
        A0o2.append(str);
        A0o2.append("/serverWaitTime=");
        A0o2.append(j);
        C18260x0.A12("/remainingWaitTime=", A0o2, j2);
        if (j2 > 0) {
            A7d(j2, str);
            AnonymousClass4SG.A3u(this.A10, str, j2);
            return;
        }
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            AnonymousClass0x2.A1J(str, this.A1Z, j);
        } else if (i == 0) {
            this.A0Z.setClickable(true);
            if (this.A1T) {
                this.A19.A06(8);
            }
            this.A10.A04(str);
            if ((str.equals("sms") || str.equals("voice")) && AnonymousClass4SG.A4D(this) && this.A00 == 0) {
                A7T(1);
            }
        }
    }

    public final void A7h(AnonymousClass5LZ r10, String str) {
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("VerifyPhoneNumber/");
        String str2 = str;
        A0o2.append(str);
        A0o2.append("/onAccountDefenceChecksRequired status ");
        C998658m r1 = r10.A06;
        C18260x0.A0o(r1, A0o2);
        if (str.equals("flash")) {
            A7P();
        }
        A7f(r10.A02, str2, AnonymousClass000.A1Y(r1, C998658m.DEVICE_CONFIRM_OR_SECOND_OTP), r10.A03);
    }

    public final void A7i(AnonymousClass5LZ r11, String str) {
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("VerifyPhoneNumber/method=");
        A0o2.append(str);
        C18260x0.A1L(A0o2, "/onRegisterEntrypoint2FARequired");
        if (str.equals("email_otp")) {
            this.A09.A1R("email_otp_verified");
        }
        if (str.equals("flash")) {
            A7P();
        }
        A85(r11.A0B, r11.A0E, r11.A0D, r11.A04, true, true);
        A7x(new C71543cH(this, 11), str, true);
    }

    public final void A7j(AnonymousClass5LZ r12, String str) {
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("VerifyPhoneNumber/method=");
        A0o2.append(str);
        C18260x0.A1L(A0o2, "/onRegisterEntrypointVerified");
        A86(this.A1B, this.A1E, r12.A0A, r12.A09, r12.A01, r12.A0H, r12.A0G, r12.A0F);
        if (str.equals("flash")) {
            A7P();
        }
        A7x(new C71543cH(this, 21), str, false);
    }

    public final void A7k(AnonymousClass5LZ r6, String str) {
        String str2;
        StringBuilder A0o2 = AnonymousClass001.A0o();
        AnonymousClass4SG.A3y("VerifyPhoneNumber/onVerifyCodeErrorMismatch/method=", str, A0o2);
        C18260x0.A1L(A0o2, r6.A0C);
        A7E();
        if (str.equals("sms") || AnonymousClass4L0.A0S(str) || str.equals("email_otp")) {
            AnonymousClass36l.A0O(this.A09, "server-send-mismatch");
            this.A10.A03();
        }
        String str3 = r6.A0C;
        long j = 60000;
        if (str3 != null) {
            try {
                j = 1000 * Long.parseLong(str3);
                if (j <= 0) {
                    str2 = getString(R.string.f11nameremoved);
                    A82(str2);
                    A7a(j);
                }
            } catch (NumberFormatException e) {
                Log.w(AnonymousClass000.A0Z("VerifyPhoneNumber/onVerifyCodeErrorMismatch/fail to parse retryAfter/use default wait time ", AnonymousClass001.A0o(), 60000), e);
            }
        }
        str2 = C86614Ku.A0s(this, C107565bW.A0D(this.A00, j), AnonymousClass002.A0L(), R.string.f11nameremoved);
        A82(str2);
        A7a(j);
    }

    public final void A7l(C108935do r11, String str) {
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("VerifyPhoneNumber/method=");
        A0o2.append(str);
        C18260x0.A1L(A0o2, "/onCodeEntrypoint2FARequired/go to 2FA screen");
        if (str.equals("email_otp")) {
            this.A09.A1R("email_otp_verified");
        }
        A85(r11.A0K, r11.A0S, r11.A0R, r11.A05, true, true);
        Log.i("VerifyPhoneNumber/updateUiOn2FARequired");
        A6T(C627736r.A1D(this, this.A1G), false);
        finish();
    }

    public final void A7m(C108935do r12, String str) {
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("VerifyPhoneNumber/method=");
        A0o2.append(str);
        C18260x0.A1L(A0o2, "/onCodeEntrypointVerified");
        this.A09.A1t(r12.A0U);
        this.A09.A1s(r12.A0T);
        A86(this.A1B, this.A1E, r12.A0H, (String) null, -1, r12.A0U, r12.A0T, false);
        A7Q();
    }

    public final void A7n(C108935do r26, String str) {
        String str2;
        String str3 = str;
        C18260x0.A0s("VerifyPhoneNumber/updateRequestCodeTimers/method=", str3, AnonymousClass001.A0o());
        C108935do r4 = r26;
        long A012 = AnonymousClass36l.A01(r4.A0N, -1) * 1000;
        long A013 = AnonymousClass36l.A01(r4.A0P, -1) * 1000;
        long A014 = AnonymousClass36l.A01(r4.A0Q, -1) * 1000;
        long A015 = AnonymousClass36l.A01(r4.A0E, -1) * 1000;
        switch (str3.hashCode()) {
            case -795576526:
                if (AnonymousClass4L0.A0S(str3)) {
                    String str4 = r4.A0Q;
                    if (str4 == null) {
                        str4 = r4.A0L;
                    }
                    A014 = AnonymousClass36l.A01(str4, -1) * 1000;
                    break;
                }
                break;
            case 114009:
                if (str3.equals("sms")) {
                    String str5 = r4.A0N;
                    if (str5 == null) {
                        str5 = r4.A0L;
                    }
                    A012 = AnonymousClass36l.A01(str5, -1) * 1000;
                    break;
                }
                break;
            case 97513456:
                str2 = "flash";
                break;
            case 112386354:
                str2 = "voice";
                break;
            case 2120743944:
                if (str3.equals("email_otp")) {
                    String str6 = r4.A0E;
                    if (str6 == null) {
                        str6 = r4.A0L;
                    }
                    A015 = AnonymousClass36l.A01(str6, -1) * 1000;
                    break;
                }
                break;
        }
        if (str3.equals(str2)) {
            String str7 = r4.A0P;
            if (str7 == null) {
                str7 = r4.A0L;
            }
            A013 = AnonymousClass36l.A01(str7, -1) * 1000;
            if (A012 < 0 && A013 < 0 && ((!A8E() || A014 < 0) && (!A8C() || A015 < 0))) {
                Log.i("VerifyPhoneNumber/updateRequestCodeTimers/all attempts exhausted");
                this.A0Z.setClickable(false);
                C18320x8.A11(getResources(), this.A0Z, R.color.f5nameremoved);
                if (this.A1T) {
                    this.A19.A06(8);
                }
            }
            if (AnonymousClass4SG.A4D(this)) {
                this.A0p.A01(A012, A013);
            }
            A7e(A012, "sms", A012);
            A7e(A013, "voice", A013);
            if (A8E()) {
                A7e(A014, "wa_old", A014);
                return;
            } else if (A8C()) {
                A7e(A015, "email_otp", A015);
                return;
            } else {
                return;
            }
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("VerifyPhoneNumber/updateRequestCodeTimers/Invalid method: ");
        throw AnonymousClass000.A0F(str3, A0o2);
    }

    public final void A7o(C108935do r3, String str, String str2) {
        StringBuilder A2y = AnonymousClass4SG.A2y(str);
        A2y.append("/bad-parameter/");
        C18260x0.A1K(A2y, r3.A0J);
        AnonymousClass36l.A0O(this.A09, str2);
        if ("number".equals(r3.A0J)) {
            A7X(34);
            return;
        }
        A7X(24);
        if (str.equals("sms") || AnonymousClass4L0.A0S(str) || str.equals("email_otp")) {
            A7H();
        }
    }

    public final void A7p(C108935do r7, String str, String str2, int i, int i2) {
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("VerifyPhoneNumber/verify");
        A0o2.append(str);
        A0o2.append("/request/");
        A0o2.append(str);
        C18260x0.A1K(A0o2, "/provider-unroutable");
        AnonymousClass36l.A0O(this.A09, str2);
        if (!AnonymousClass5VK.A01(r7.A0L)) {
            A82(getString(i));
            return;
        }
        try {
            long A2M = AnonymousClass4SG.A2M(r7);
            A7b(A2M);
            AnonymousClass4SG.A3s(this, i2, A2M);
            AnonymousClass4SG.A3u(this.A10, "voice", A2M);
            A7d(A2M, str);
        } catch (NumberFormatException e) {
            StringBuilder A0o3 = AnonymousClass001.A0o();
            AnonymousClass001.A1K("VerifyPhoneNumber/verify", str, "/request/", A0o3);
            A0o3.append(str);
            C18260x0.A14("/unroutable/time-not-int", A0o3, e);
            A82(getString(i));
        }
    }

    public final void A7q(C108935do r7, String str, String str2, String str3, int i, int i2) {
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("VerifyPhoneNumber/verify");
        A0o2.append(str);
        A0o2.append("/request/");
        A0o2.append(str);
        C18260x0.A1M(A0o2, "/no-routes");
        AnonymousClass36l.A0O(this.A09, str2);
        if (!AnonymousClass5VK.A01(r7.A0L)) {
            A82(getString(i));
            this.A0z.A03(str3);
            return;
        }
        try {
            long A2M = AnonymousClass4SG.A2M(r7);
            A7b(A2M);
            AnonymousClass4SG.A3s(this, i2, A2M);
            AnonymousClass4SG.A3u(this.A10, "voice", A2M);
            A7d(A2M, str);
            this.A0z.A03(str3);
        } catch (NumberFormatException e) {
            StringBuilder A0o3 = AnonymousClass001.A0o();
            AnonymousClass001.A1K("VerifyPhoneNumber/verify", str, "/request/", A0o3);
            A0o3.append(str);
            C18260x0.A14("/no-routes/time-not-int", A0o3, e);
            A82(getString(i));
        }
    }

    public final void A80(String str) {
        if (A8C()) {
            this.A14.A04(A78(), "click_email_otp_deep_link");
            this.A14.A01(A78());
        }
        if (this.A1H) {
            Log.i("VerifyPhoneNumber/verificationlink/voice/code-entry-blocked-retry-later");
            this.A10.A06(str, this.A1B, this.A1E);
            return;
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("VerifyPhoneNumber/verificationlink/voice/state ");
        C18260x0.A1G(A0o2, A1d);
        if (this.A0q.A04()) {
            AnonymousClass5UC r4 = this.A0q;
            if (TextUtils.isEmpty(str)) {
                r4.A01();
                return;
            }
            int i = 0;
            while (true) {
                ArrayList arrayList = r4.A0C;
                if (i < arrayList.size()) {
                    C626936e.A06(str);
                    ((TextView) arrayList.get(i)).setText(String.valueOf(str.charAt(i)));
                    i++;
                } else {
                    return;
                }
            }
        } else {
            this.A0Q.setText(str);
        }
    }

    public final void A81(String str) {
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("VerifyPhoneNumber/verify/");
        A0o2.append(str);
        C18260x0.A1K(A0o2, "/registration-not-allowed-error");
        AnonymousClass36l.A0O(this.A09, "not-allowed");
        this.A0s.A01(45);
    }

    public final void A82(String str) {
        if (!AnonymousClass000.A1U(AnonymousClass4SG.A2K(this), 12) && !AnonymousClass000.A1U(AnonymousClass4SG.A2K(this), 20) && !A8D()) {
            this.A0s.A03(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        A7X(r1);
        A7M();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (r0 == false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A84(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass4SG.A2y(r3)
            java.lang.String r0 = "/next-method"
            X.C18260x0.A1M(r1, r0)
            X.33p r0 = r2.A09
            X.AnonymousClass36l.A0O(r0, r4)
            int r0 = r3.hashCode()
            switch(r0) {
                case 114009: goto L_0x0027;
                case 112386354: goto L_0x0030;
                case 2120743944: goto L_0x001e;
                default: goto L_0x0015;
            }
        L_0x0015:
            r1 = 38
        L_0x0017:
            r2.A7X(r1)
            r2.A7M()
            return
        L_0x001e:
            java.lang.String r0 = "email_otp"
            boolean r0 = r3.equals(r0)
            r1 = 49
            goto L_0x0038
        L_0x0027:
            java.lang.String r0 = "sms"
            boolean r0 = r3.equals(r0)
            r1 = 36
            goto L_0x0038
        L_0x0030:
            java.lang.String r0 = "voice"
            boolean r0 = r3.equals(r0)
            r1 = 37
        L_0x0038:
            if (r0 != 0) goto L_0x0017
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.VerifyPhoneNumber.A84(java.lang.String, java.lang.String):void");
    }

    public final boolean A8C() {
        return AnonymousClass000.A1U(AnonymousClass4SG.A2K(this), 17);
    }

    public final boolean A8D() {
        return AnonymousClass000.A1U(AnonymousClass4SG.A2K(this), 8);
    }

    public final boolean A8E() {
        return AnonymousClass000.A1U(AnonymousClass4SG.A2K(this), 15);
    }

    public void BFh() {
        if (A8D()) {
            Log.i("VerifyPhoneNumber/hide-automatically-verifying-progress-dialog");
            A7J();
            return;
        }
        Log.i("VerifyPhoneNumber/hide-verifying-progress-dialog");
        C621433s.A00(this, 23);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        if (i == 700) {
            if (i2 == -1) {
                Log.i("VerifyPhoneNumber/activity-result/permission-accepted/request-flash");
                A7G();
                return;
            }
            Log.i("VerifyPhoneNumber/activity-result/permission-declined/request-voice");
            C97694z5 A2p = AnonymousClass4SG.A2p(this);
            if (C18280x3.A1W(AnonymousClass0x2.A0F(this.A09), "migrate_from_consumer_app_directly")) {
                A2p.A02 = true;
            }
            A2p.A00 = false;
            A7s(A2p, true);
        } else if (i == 701) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("VerifyPhoneNumber/activity-result/request-sms-permissions/");
            if (i2 == -1) {
                str = "granted";
            } else {
                str = "denied";
            }
            C18260x0.A1L(A0o2, str);
            this.A1W = false;
            A7c(A76("sms"), A76("voice"));
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, R.string.f11nameremoved);
        if (!this.A1G && AnonymousClass4SG.A4D(this)) {
            menu.add(0, 2, 0, R.string.f11nameremoved);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Intent intent;
        int itemId = menuItem.getItemId();
        if (itemId != 0) {
            if (itemId == 1) {
                this.A0w.A09();
                A7K();
                intent = C627736r.A01(this);
            } else if (itemId == 2) {
                this.A0w.A09();
                A7K();
                intent = C627736r.A05(this);
            } else if (itemId != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            } else {
                if (this.A02 == 2) {
                    this.A14.A04(A78(), "back");
                }
                finish();
                return true;
            }
            startActivity(intent);
            C05680Um.A00(this);
            return true;
        } else if (A8E()) {
            this.A0d.A01(this, "verify-number-about-changing-phones");
            return true;
        } else {
            C50152hi r3 = this.A0u;
            C55092pm r2 = this.A0z;
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("verify-sms +");
            A0o2.append(this.A1B);
            r3.A01(this, r2, AnonymousClass000.A0X(this.A1E, A0o2));
            return true;
        }
    }

    public void onPause() {
        String code;
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("VerifyPhoneNumber/pause ");
        C18260x0.A1G(A0o2, A1d);
        super.onPause();
        C105005Te r1 = this.A0s;
        r1.A02 = true;
        AnonymousClass36l.A0O(r1.A04, AnonymousClass36l.A00);
        SharedPreferences.Editor edit = getPreferences(0).edit();
        edit.putInt("com.whatsapp.registration.VerifyPhoneNumber.verification_state", A1d);
        if (!edit.commit()) {
            Log.w("VerifyPhoneNumber/pause/commit failed");
        }
        if (this.A0q.A04()) {
            code = this.A0q.A00();
        } else {
            code = this.A0Q.getCode();
        }
        if (!TextUtils.isEmpty(code)) {
            this.A09.A1U(code);
        }
        if (A74() == 14) {
            AnonymousClass5X2 r12 = this.A0p;
            Log.d("AccountDefenceSecondCodeViewPresenter/stopFetchingDeviceConfirmationStatus");
            C50232hq r13 = r12.A02;
            Log.i("AccountDefenceDataManager/stopFetchingDeviceConfirmation");
            r13.A05.A00();
        }
        this.A0H.removeCallbacksAndMessages((Object) null);
    }

    public void onStop() {
        super.onStop();
        A7F();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02a5, code lost:
        if (r4 != X.C998958p.A0U) goto L_0x038e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02a7, code lost:
        X.C626936e.A06(r0);
        A7l(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02af, code lost:
        r2 = X.AnonymousClass4SG.A2y(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02b5, code lost:
        if (r4 != r5) goto L_0x02c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02b7, code lost:
        r0 = "/bad-token";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02b9, code lost:
        X.C18260x0.A1K(r2, r0);
        X.AnonymousClass36l.A0O(r12.A09, "voice-bad-token");
        r0 = 41;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02c5, code lost:
        r0 = "/invalid-skey";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
        r2 = X.AnonymousClass4SG.A2M(r0);
        A7b(r2);
        X.AnonymousClass4SG.A3s(r12, com.whatsapp.R.string.f11nameremoved, r2);
        X.AnonymousClass4SG.A3u(r12.A10, "voice", r2);
        A7d(r2, "voice");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02df, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0048, code lost:
        if (r1.equals("flash") == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02e0, code lost:
        X.C18260x0.A14("/too-recent/time-not-int", X.AnonymousClass4SG.A2z(r1), r3);
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        r2 = X.AnonymousClass4SG.A2M(r0);
        A7b(r2);
        X.AnonymousClass4SG.A3s(r12, com.whatsapp.R.string.f11nameremoved, r2);
        X.AnonymousClass4SG.A3u(r12.A10, "voice", r2);
        A7d(r2, "voice");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0305, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0306, code lost:
        X.C18260x0.A14("/too-recent/time-not-int", X.AnonymousClass000.A0m("VerifyPhoneNumber/verifyvoice/request/", r1), r3);
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
        r2 = X.AnonymousClass4SG.A2M(r0);
        r12.A0D = r2;
        A7b(r2);
        A82(X.C86614Ku.A0s(r12, X.C107565bW.A0D(r12.A00, r12.A0D), X.AnonymousClass002.A0L(), com.whatsapp.R.string.f11nameremoved));
        X.AnonymousClass4SG.A3t(r12, "voice");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0338, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0339, code lost:
        X.C18260x0.A14("/triedtoomanytimesallmethods/time-not-int", X.AnonymousClass4SG.A2z(r1), r3);
        A7X(26);
        A7M();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
        r2 = X.AnonymousClass4SG.A2M(r0);
        r12.A0D = r2;
        A7b(r2);
        A7X(31);
        X.AnonymousClass4SG.A3t(r12, "voice");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x035d, code lost:
        A7V(22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:?, code lost:
        r2 = X.AnonymousClass4SG.A2M(r0);
        r12.A0D = r2;
        A7b(r2);
        A7X(32);
        X.AnonymousClass4SG.A3t(r12, "voice");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0377, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0378, code lost:
        r2 = X.AnonymousClass4SG.A2z(r1);
        r0 = "/too-many-guesses/time-not-int";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x037f, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0380, code lost:
        r2 = X.AnonymousClass4SG.A2z(r1);
        r0 = "/triedtoomanytimesallmethods/time-not-int";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0386, code lost:
        X.C18260x0.A14(r0, r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0389, code lost:
        A7X(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004c, code lost:
        if (r4 == X.C998958p.A09) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x038e, code lost:
        r6 = X.C998958p.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0390, code lost:
        if (r4 == r6) goto L_0x03ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0394, code lost:
        if (r4 == X.C998958p.A0K) goto L_0x03ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x039c, code lost:
        if (r1.equals("flash") == false) goto L_0x03cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x03a0, code lost:
        if (r4 != X.C998958p.A09) goto L_0x03cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x03a2, code lost:
        com.whatsapp.util.Log.i("VerifyPhoneNumber/onRequestFlashErrorDisabled/fall back to voice");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x03ab, code lost:
        if (A8D() != false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004e, code lost:
        A7n(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x03ad, code lost:
        r3 = X.AnonymousClass4SG.A2p(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x03bd, code lost:
        if (X.C18280x3.A1W(X.AnonymousClass0x2.A0F(r12.A09), "migrate_from_consumer_app_directly") == false) goto L_0x03c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x03bf, code lost:
        r3.A02 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x03c6, code lost:
        A7s(r3, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03ce, code lost:
        if (r4 != X.C998958p.A0E) goto L_0x03d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03d0, code lost:
        A81(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03d7, code lost:
        if (r4 != X.C998958p.A05) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03d9, code lost:
        r12.A0w.A0B(16, true);
        A6T(X.C627736r.A1C(r12, r12.A1G), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x03ec, code lost:
        X.C626936e.A06(r0);
        r15 = r1;
        A7f(X.AnonymousClass36l.A01(r0.A0N, 0), r15, X.AnonymousClass000.A1Y(r4, r6), X.AnonymousClass36l.A01(r0.A0P, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0407, code lost:
        r4 = X.C18290x4.A0u(r0);
        r4.append("VerifyPhoneNumber/verifyvoice/request/");
        r4.append(r1);
        X.C18260x0.A1L(r4, "/requested");
        r8 = r1.equals("flash");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0420, code lost:
        if (r8 == false) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0422, code lost:
        r3 = r0.A0F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0424, code lost:
        if (r3 == null) goto L_0x042d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0426, code lost:
        r12.A0C = java.lang.Long.parseLong(r3) * 1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x042d, code lost:
        r13 = r12.A0C;
        com.whatsapp.util.Log.i("VerifyPhoneNumber/start-primary-flash-call-timer");
        A7C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0439, code lost:
        if (r13 >= 1000) goto L_0x043d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x043b, code lost:
        r13 = X.C625635p.A0L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x043d, code lost:
        r12.A0G = new X.AnonymousClass4MF(r12, r13, r13 / 2).start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (r4 != X.C998958p.A0T) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x044c, code lost:
        r3 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x044e, code lost:
        if (r3 <= 0) goto L_0x0471;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0450, code lost:
        if (r8 != false) goto L_0x0471;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0452, code lost:
        A1c = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x045a, code lost:
        if (r12.A0q.A04() != false) goto L_0x0464;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x045c, code lost:
        r4 = r12.A0Q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x045e, code lost:
        if (r4 == null) goto L_0x0464;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0460, code lost:
        r4.A02 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0464, code lost:
        r3 = r12.A09;
        X.C18270x1.A0h(X.C18270x1.A03(r3), "registration_voice_code_length", r0.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0471, code lost:
        r4 = r0.A0I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        X.C626936e.A06(r0);
        A7m(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0477, code lost:
        if (android.text.TextUtils.isEmpty(r4) != false) goto L_0x0483;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0479, code lost:
        r12.A0w.A0C(java.lang.Long.parseLong(r4) * 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0483, code lost:
        if (r8 == false) goto L_0x04cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0485, code lost:
        r4 = r12.A13;
        r15 = r12.A1B;
        r3 = r12.A1E;
        X.C626936e.A06(r3);
        r14 = r0.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0490, code lost:
        if (r14 != null) goto L_0x0494;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0492, code lost:
        r14 = "(.*)xyz(.*)";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0494, code lost:
        r11 = r12.A12;
        X.C162457s7.A0J(r15, 0);
        X.C18270x1.A11(r3, 1, r11);
        r5 = r4.A02.A00;
        X.C162457s7.A0D(r5);
        r6 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04a7, code lost:
        if (r6 != null) goto L_0x04bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04a9, code lost:
        r13 = r4.A06;
        r7 = r4.A01;
        r8 = r4.A03;
        r9 = r4.A04;
        r10 = r4.A05;
        X.C626936e.A06(r3);
        r6 = new X.AnonymousClass4LU(r7, r8, r9, r10, r11, r12, r13, r14, r15, r3);
        r4.A00 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04bf, code lost:
        X.C154317cy.A00(r6, r5, new android.content.IntentFilter("android.intent.action.PHONE_STATE"), (android.os.Handler) null, X.C58152un.A0C, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
        A83(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x04cf, code lost:
        r3 = X.AnonymousClass4SG.A2K(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x04d5, code lost:
        if (r3 == 13) goto L_0x04db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x04d9, code lost:
        if (r3 != 14) goto L_0x04f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x04e1, code lost:
        if ("voice".equals(r1) == false) goto L_0x04f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x04e3, code lost:
        r2 = X.AnonymousClass000.A0m("VerifyPhoneNumber/verifyvoice/request/", r1);
        r2.append("/update acct defence stat:");
        X.C18260x0.A1G(r2, 3);
        A7T(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x04f3, code lost:
        A7N();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x04f8, code lost:
        com.whatsapp.util.Log.w("VerifyPhoneNumber/onRequestVoiceOrFlashCodeResponse/response is null");
        A7d(300000, "sms");
        A7d(300000, "voice");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x050e, code lost:
        if (A8E() == false) goto L_0x0517;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0510, code lost:
        r5 = "wa_old";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0512, code lost:
        A7d(300000, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x051b, code lost:
        if (A8C() == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x051d, code lost:
        r5 = "email_otp";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0529, code lost:
        if (r1.equals(r2) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x052f, code lost:
        if (isFinishing() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0531, code lost:
        r2 = X.AnonymousClass001.A0o();
        r2.append("VerifyPhoneNumber/onRequestGenericCodeResponse/method=");
        r2.append(r1);
        X.C18260x0.A1R(r2, "/status=", r4);
        X.AnonymousClass36l.A00 = "";
        r3 = X.AnonymousClass000.A0l("VerifyPhoneNumber/onRequestGenericCodeResponse/method=");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x054a, code lost:
        if (r22 == null) goto L_0x0565;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x054c, code lost:
        r3.append(r1);
        X.AnonymousClass4SG.A3q(r0, r3);
        X.C18260x0.A1J(r3, r0.A0L);
        A7n(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x055c, code lost:
        if (r4 != X.C998958p.A0T) goto L_0x058f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x055e, code lost:
        X.C626936e.A06(r0);
        A7m(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0564, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0565, code lost:
        r3.append(r1);
        X.C18260x0.A1M(r3, "/response is null");
        A7d(300000, "sms");
        A7d(300000, "voice");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x057e, code lost:
        if (A8E() == false) goto L_0x0586;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0061, code lost:
        if (r4 == X.C998958p.A0V) goto L_0x0407;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0580, code lost:
        r5 = "wa_old";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0582, code lost:
        A7d(300000, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x058a, code lost:
        if (A8C() == false) goto L_0x055a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x058c, code lost:
        r5 = "email_otp";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0591, code lost:
        if (r4 != X.C998958p.A0V) goto L_0x061a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0593, code lost:
        X.C626936e.A06(r0);
        com.whatsapp.util.Log.i("VerifyPhoneNumber/onGenericCodeSent");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x059f, code lost:
        if (A8C() == false) goto L_0x05a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x05a1, code lost:
        r12.A09.A1R("email_sent");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
        r3 = X.AnonymousClass001.A0o();
        r3.append("VerifyPhoneNumber/onVoiceOrFlashCodeRequestError/method=");
        r3.append(r1);
        X.C18260x0.A1R(r3, "/status=", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x05a8, code lost:
        r2 = X.AnonymousClass4SG.A2K(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x05ae, code lost:
        if (r2 == 13) goto L_0x05b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x05b2, code lost:
        if (r2 != 14) goto L_0x05e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x05b4, code lost:
        A7T(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x05ba, code lost:
        if (r12.A1M != false) goto L_0x05e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x05bc, code lost:
        r3 = r12.A0p.A02.A06;
        X.C18260x0.A1E("AccountDefenceLocalDataRepository/saveSecondSmsRequestedOnce/", X.AnonymousClass001.A0o(), true);
        r2 = X.C60152y5.A00(r3.A01, "AccountDefenceLocalDataRepository_prefs");
        r2.putBoolean("com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.account_defence_sms_requested_once", true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x05dd, code lost:
        if (r2.commit() != false) goto L_0x05e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x05df, code lost:
        com.whatsapp.util.Log.e("AccountDefenceLocalDataRepository/saveSecondSmsRequestedOnce/error");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x05e4, code lost:
        r12.A1M = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0074, code lost:
        if (r4 != X.C998958p.A08) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x05e6, code lost:
        r3 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x05e8, code lost:
        if (r3 <= 0) goto L_0x05f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x05ea, code lost:
        A1b = r3;
        X.C18270x1.A0h(X.AnonymousClass4SG.A2P(r12), "registration_sms_code_length", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x05f5, code lost:
        r1 = r0.A0I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x05fb, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x0609;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x05fd, code lost:
        r12.A0w.A0C(java.lang.Long.parseLong(r1) * 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0609, code lost:
        A7N();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x060c, code lost:
        r0 = r12.A09;
        X.C18270x1.A0h(X.C18270x1.A03(r0), "flash_call_eligible", r12.A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0619, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x061a, code lost:
        A7O();
        r3 = X.AnonymousClass001.A0o();
        r3.append("VerifyPhoneNumber/onRequestGenericCodeError/method=");
        r3.append(r1);
        X.C18260x0.A1R(r3, "/status=", r4);
        r7 = r1.equals("email_otp");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0076, code lost:
        X.C621433s.A00(r12, 52);
        X.C386328l.A00(r12.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0632, code lost:
        if (r7 == false) goto L_0x0643;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x063a, code lost:
        if (r4.equals(X.C998958p.A0U) != false) goto L_0x0643;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x063c, code lost:
        r12.A09.A1R("email_otp_request_failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0645, code lost:
        if (r4 != X.C998958p.A08) goto L_0x0652;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0647, code lost:
        X.C621433s.A00(r12, 52);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x064c, code lost:
        X.C386328l.A00(r12.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0651, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0654, code lost:
        if (r4 != X.C998958p.A0M) goto L_0x06a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0656, code lost:
        X.C626936e.A06(r0);
        com.whatsapp.util.Log.w("VerifyPhoneNumber/onRequestGenericCodeErrorTempUnavailable");
        X.AnonymousClass36l.A0O(r12.A09, "server-send-request-temp-unavailable");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x066b, code lost:
        if (X.AnonymousClass5VK.A01(r0.A0L) != false) goto L_0x0679;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x066d, code lost:
        r1 = r12.A0s;
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0672, code lost:
        r1.A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0675, code lost:
        A7H();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0678, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:?, code lost:
        r3 = X.AnonymousClass4SG.A2M(r0);
        r12.A0w.A0C(r3);
        r12.A0s.A03(X.C86614Ku.A0s(r12, X.C107565bW.A0D(r12.A00, r3), X.AnonymousClass002.A0L(), com.whatsapp.R.string.f11nameremoved));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0699, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x069a, code lost:
        com.whatsapp.util.Log.w("VerifyPhoneNumber/request/sms/temporarily-unavailable/unable-to-parse-retryAfter", r1);
        r1 = r12.A0s;
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x06a7, code lost:
        if (r4 != X.C998958p.A0R) goto L_0x06bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x06a9, code lost:
        X.C18260x0.A1M(X.AnonymousClass4SG.A2y(r1), "/unspecified");
        X.AnonymousClass36l.A0O(r12.A09, "server-send-request-error-unspecified");
        r0 = 109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x06bb, code lost:
        A7X(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x06c1, code lost:
        if (r4 != X.C998958p.A0N) goto L_0x06f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x06c3, code lost:
        X.C626936e.A06(r0);
        X.C18260x0.A0t("VerifyPhoneNumber/onRequestGenericCodeErrorTooMany/method=", r1, X.AnonymousClass001.A0o());
        r3 = r1.equals("wa_old");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x06d7, code lost:
        if (r3 == false) goto L_0x06ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x06d9, code lost:
        r6 = 40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x06e3, code lost:
        if (X.AnonymousClass4SG.A47(r12.A09, r0, r12, "server-send-request-too-many-tries") != false) goto L_0x0a49;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x06e5, code lost:
        r12.A0s.A01(r6);
        A7M();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x06ed, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x06ee, code lost:
        r6 = 39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x06f0, code lost:
        if (r7 == false) goto L_0x06db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x06f2, code lost:
        r6 = 48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x06f7, code lost:
        if (r4 != X.C998958p.A0O) goto L_0x070f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x06f9, code lost:
        X.C626936e.A06(r0);
        com.whatsapp.util.Log.w("VerifyPhoneNumber/onRequestGenericCodeErrorTooManyAllMethods");
        r4 = 27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x070b, code lost:
        if (X.AnonymousClass4SG.A47(r12.A09, r0, r12, "server-send-request-too-many-tries-all-methods") == false) goto L_0x0882;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0711, code lost:
        if (r4 != X.C998958p.A06) goto L_0x0726;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0713, code lost:
        X.AnonymousClass36l.A0O(r12.A09, "server-send-request-error-connectivity");
        r0 = X.C86604Kt.A0l(r12, com.whatsapp.R.string.f11nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0721, code lost:
        A82(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0728, code lost:
        if (r4 != X.C998958p.A02) goto L_0x0733;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x072a, code lost:
        X.C626936e.A06(r0);
        A7o(r0, r1, "server-send-request-bad-param");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0732, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008e, code lost:
        X.C18270x1.A0j(X.C18270x1.A03(r12.A09), "pref_secondary_flash_call_status", "secondary_failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0735, code lost:
        if (r4 != X.C998958p.A0C) goto L_0x074b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0737, code lost:
        X.C18260x0.A1K(X.AnonymousClass4SG.A2y(r1), "/missing-parameter");
        X.AnonymousClass36l.A0O(r12.A09, "server-send-request-missing-param");
        r0 = 25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x074d, code lost:
        if (r4 != X.C998958p.A0G) goto L_0x075f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x074f, code lost:
        X.C626936e.A06(r0);
        r1 = r0.A09;
        com.whatsapp.util.Log.w("VerifyPhoneNumber/onRequestGenericCodeErrorTooOld");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0759, code lost:
        if (r1 == null) goto L_0x0a9b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x075b, code lost:
        A7v(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x075e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0761, code lost:
        if (r4 != X.C998958p.A0Q) goto L_0x078c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009b, code lost:
        A7U(-1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0763, code lost:
        r2 = X.C18290x4.A0u(r0);
        r2.append("VerifyPhoneNumber/onRequestGenericCodeErrorTooRecent/retryAfter=");
        r2.append(r0.A0L);
        X.C18260x0.A1M(r2, " seconds");
        X.AnonymousClass36l.A0O(r12.A09, "server-send-request-too-recent");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0783, code lost:
        if (X.AnonymousClass5VK.A01(r0.A0L) != false) goto L_0x0826;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0785, code lost:
        r1 = r12.A0s;
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x078e, code lost:
        if (r4 != X.C998958p.A04) goto L_0x07ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0790, code lost:
        r3 = r0.A08;
        X.C18260x0.A1K(X.AnonymousClass4SG.A2y(r1), "/blocked");
        A7Z(12);
        X.AnonymousClass36l.A0O(r12.A09, "server-send-request-user-blocked");
        A7u(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x07ae, code lost:
        if (r4 != X.C998958p.A0D) goto L_0x07b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x07b0, code lost:
        X.C626936e.A06(r0);
        A84(r1, "server-send-request-next-method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x07b8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x07bb, code lost:
        if (r4 != X.C998958p.A0P) goto L_0x07da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x07bd, code lost:
        X.C626936e.A06(r0);
        com.whatsapp.util.Log.w("VerifyPhoneNumber/onRequestGenericCodeErrorTooManyGuesses");
        X.AnonymousClass36l.A0O(r12.A09, "server-send-request-too-many-guesses");
        X.AnonymousClass4SG.A3r(r12);
        r4 = 28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x07d7, code lost:
        if (X.AnonymousClass5VK.A01(r0.A0L) == false) goto L_0x0882;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x07dc, code lost:
        if (r4 != X.C998958p.A0I) goto L_0x08bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x07de, code lost:
        X.C626936e.A06(r0);
        r4 = X.AnonymousClass4L0.A0S(r1);
        com.whatsapp.util.Log.e("VerifyPhoneNumber/onRequestGenericCodeErrorProviderTimeout");
        X.AnonymousClass36l.A0O(r12.A09, "server-send-request-provider-timeout");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x07f3, code lost:
        if (r4 == false) goto L_0x0806;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x07f5, code lost:
        r3 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a2, code lost:
        if (r4 != X.C998958p.A0M) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x07fe, code lost:
        if (X.AnonymousClass5VK.A01(r0.A0L) != false) goto L_0x0889;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0800, code lost:
        r0 = getString(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0806, code lost:
        r3 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0809, code lost:
        if (r7 == false) goto L_0x07f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x080b, code lost:
        r3 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:?, code lost:
        r1 = X.AnonymousClass4SG.A2M(r0);
        r12.A0D = r1;
        r12.A0w.A0C(r1);
        r12.A1R = true;
        r12.A0s.A01(31);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:?, code lost:
        r3 = X.AnonymousClass4SG.A2M(r0);
        r12.A0w.A0C(r3);
        r12.A0s.A03(X.C86614Ku.A0s(r12, X.C107565bW.A0D(r12.A00, r3), X.AnonymousClass002.A0L(), com.whatsapp.R.string.f11nameremoved));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0847, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a4, code lost:
        X.C626936e.A06(r0);
        r3 = X.AnonymousClass001.A0o();
        X.AnonymousClass4SG.A3y("VerifyPhoneNumber/onRequestVoiceOrFlashErrorTempUnavailable/method=", r1, r3);
        X.C18260x0.A1L(r3, r0.A0L);
        X.AnonymousClass36l.A0O(r12.A09, "voice-temp-unavail");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0848, code lost:
        com.whatsapp.util.Log.w("VerifyPhoneNumber/request/sms/too-recent/time-not-int", r1);
        r1 = r12.A0s;
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:?, code lost:
        r2 = X.AnonymousClass4SG.A2M(r0);
        r12.A0D = r2;
        r12.A0w.A0C(r2);
        r12.A1R = true;
        r2 = r12.A0s;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0868, code lost:
        if (X.AnonymousClass4L0.A0S(r1) == false) goto L_0x086d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x086a, code lost:
        r0 = 33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x086d, code lost:
        r0 = 32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x086f, code lost:
        if (r7 == false) goto L_0x0873;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x0871, code lost:
        r0 = 50;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0873, code lost:
        r2.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0878, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c4, code lost:
        if (X.AnonymousClass5VK.A01(r0.A0L) != false) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0879, code lost:
        r0 = "VerifyPhoneNumber/request/sms/too-many-guesses/time-not-int";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x087c, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x087d, code lost:
        r0 = "VerifyPhoneNumber/request/sms/triedtoomanytimesallmethods/time-not-int";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x087f, code lost:
        com.whatsapp.util.Log.w(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0882, code lost:
        r12.A0s.A01(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:?, code lost:
        r1 = X.AnonymousClass4SG.A2M(r0);
        r12.A0w.A0C(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x0892, code lost:
        if (r4 == false) goto L_0x0898;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0894, code lost:
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0898, code lost:
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c6, code lost:
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x089b, code lost:
        if (r7 == false) goto L_0x08a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x089d, code lost:
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x08a0, code lost:
        X.AnonymousClass4SG.A3s(r12, r0, r1);
        X.AnonymousClass4SG.A3u(r12.A10, "sms", r1);
        A7d(r1, "sms");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x08ad, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x08ae, code lost:
        com.whatsapp.util.Log.w("VerifyPhoneNumber/request/sms/too-recent/time-not-int", r1);
        A82(getString(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x08be, code lost:
        if (r4 != X.C998958p.A0J) goto L_0x08de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x08c0, code lost:
        r2 = A8C();
        X.C626936e.A06(r0);
        r6 = com.whatsapp.R.string.f11nameremoved;
        r7 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x08cf, code lost:
        if (r2 == false) goto L_0x08d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x08d1, code lost:
        r6 = com.whatsapp.R.string.f11nameremoved;
        r7 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c9, code lost:
        r0 = getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x08d7, code lost:
        A7p(r0, r1, "server-send-request-provider-unroutable", r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x08dd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x08e0, code lost:
        if (r4 != X.C998958p.A0F) goto L_0x0902;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x08e2, code lost:
        r2 = A8C();
        X.C626936e.A06(r0);
        r7 = com.whatsapp.R.string.f11nameremoved;
        r8 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x08f1, code lost:
        if (r2 == false) goto L_0x08f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x08f3, code lost:
        r7 = com.whatsapp.R.string.f11nameremoved;
        r8 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x08f9, code lost:
        A7q(r0, r1, "server-send-request-no-routes", "noRouteSms", r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0901, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0902, code lost:
        r3 = X.C998958p.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cd, code lost:
        A82(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0904, code lost:
        if (r4 == r3) goto L_0x0ad5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0908, code lost:
        if (r4 == X.C998958p.A0A) goto L_0x0ad5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x090c, code lost:
        if (r4 != X.C998958p.A0U) goto L_0x0915;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x090e, code lost:
        X.C626936e.A06(r0);
        A7l(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0914, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0915, code lost:
        r5 = X.C998958p.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0917, code lost:
        if (r4 == r5) goto L_0x0aba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x091b, code lost:
        if (r4 == X.C998958p.A0K) goto L_0x0aba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x091f, code lost:
        if (r4 != X.C998958p.A0E) goto L_0x0925;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0921, code lost:
        A81(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x0924, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0927, code lost:
        if (r4 == X.C998958p.A05) goto L_0x0961;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x092b, code lost:
        if (r4 != X.C998958p.A0H) goto L_0x0a11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x092d, code lost:
        com.whatsapp.util.Log.i("VerifyPhoneNumber/transitionToRegisterPhone(ERROR_PROFILE_CHECKPOINT)");
        r1 = true;
        r12.A0w.A0B(1, true);
        r0 = X.C627736r.A04(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r2 = X.AnonymousClass4SG.A2M(r0);
        A7b(r2);
        X.AnonymousClass4SG.A3s(r12, com.whatsapp.R.string.f11nameremoved, r2);
        X.AnonymousClass4SG.A3u(r12.A10, "voice", r2);
        A7d(r2, "voice");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x093c, code lost:
        A6T(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x093f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e7, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0961, code lost:
        r1 = true;
        r12.A0w.A0B(16, true);
        r0 = X.C627736r.A1C(r12, r12.A1G);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e8, code lost:
        X.C18260x0.A14("/temporarily-unavailable/unable-to-parse-retryAfter", X.AnonymousClass4SG.A2z(r1), r3);
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x09b6, code lost:
        BFh();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x09da, code lost:
        A7U(r12.A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x09df, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f7, code lost:
        if (r4 != X.C998958p.A0R) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x0a13, code lost:
        if (r4 == X.C998958p.A0L) goto L_0x0a19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x0a17, code lost:
        if (r4 != X.C998958p.A0S) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x0a19, code lost:
        if (r22 == null) goto L_0x0aab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x0a21, code lost:
        if (android.text.TextUtils.isEmpty(r0.A0M) != false) goto L_0x0aab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x0a23, code lost:
        r4 = r0.A0M;
        com.whatsapp.util.Log.i("VerifyPhoneNumber/transitionToSendSmsToWa");
        r3 = r12.A1G;
        r1 = X.C18320x8.A07().setClassName(getPackageName(), "com.whatsapp.registration.SendSmsToWa");
        r1.putExtra("sendSmsNumber", r4);
        r1.putExtra("changeNumber", r3);
        A6T(r1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x0a48, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f9, code lost:
        X.C18260x0.A1M(X.AnonymousClass4SG.A2y(r1), "/unspecified");
        X.AnonymousClass36l.A0O(r12.A09, "voice-error");
        r0 = 109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:?, code lost:
        r0 = X.AnonymousClass4SG.A2M(r0);
        r12.A0D = r0;
        r12.A0w.A0C(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x0a56, code lost:
        if (r3 == false) goto L_0x0a72;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x0a58, code lost:
        r12.A0s.A03(X.AnonymousClass002.A0F(r12, X.C107565bW.A0D(r12.A00, r12.A0D), new java.lang.Object[1], 0, com.whatsapp.R.string.f11nameremoved));
        X.AnonymousClass4SG.A3t(r12, "wa_old");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x0a71, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x0a72, code lost:
        r12.A0s.A03(X.AnonymousClass002.A0F(r12, X.C107565bW.A0D(r12.A00, r12.A0D), new java.lang.Object[1], 0, com.whatsapp.R.string.f11nameremoved));
        X.AnonymousClass4SG.A3t(r12, "sms");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x0a8b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x0a8c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x0a8d, code lost:
        com.whatsapp.util.Log.w("VerifyPhoneNumber/request/sms/triedtoomanytimesallmethods/time-not-int", r1);
        r12.A0s.A01(r6);
        A7M();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x0a9a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x010b, code lost:
        A7X(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x0a9b, code lost:
        r12.A0T.A01 = true;
        A7Z(8);
        A7V(22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x0aaa, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x0aab, code lost:
        com.whatsapp.util.Log.e("VerifyPhoneNumber/send sms number is empty");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:0x0ab0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x0aba, code lost:
        X.C626936e.A06(r0);
        A7f(X.AnonymousClass36l.A01(r0.A0N, 0), "sms", X.AnonymousClass000.A1Y(r4, r5), X.AnonymousClass36l.A01(r0.A0P, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x0ad4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x0ad5, code lost:
        r1 = X.AnonymousClass4SG.A2y(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x0adb, code lost:
        if (r4 != r3) goto L_0x0aed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x0add, code lost:
        r0 = "/bad-token";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x0adf, code lost:
        X.C18260x0.A1K(r1, r0);
        X.AnonymousClass36l.A0O(r12.A09, "server-send-request-bad-token");
        A7X(41);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0aec, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x0aed, code lost:
        r0 = "/invalid-skey";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0112, code lost:
        if (r4 != X.C998958p.A0N) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0114, code lost:
        X.C626936e.A06(r0);
        X.C18260x0.A0s("VerifyPhoneNumber/onRequestVoiceOrFlashErrorTooMany/method=", r1, X.AnonymousClass001.A0o());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x012c, code lost:
        if (X.AnonymousClass4SG.A47(r12.A09, r0, r12, "voice-error-too-many-tries") != false) goto L_0x0314;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x012e, code lost:
        A7X(26);
        A7M();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0138, code lost:
        if (r4 != X.C998958p.A0O) goto L_0x015b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013a, code lost:
        X.C626936e.A06(r0);
        r3 = X.AnonymousClass001.A0o();
        X.AnonymousClass4SG.A3y("VerifyPhoneNumber/onRequestVoiceOrFlashErrorTooManyAllMethods/method=", r1, r3);
        X.C18260x0.A1L(r3, r0.A0L);
        r5 = 27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0157, code lost:
        if (X.AnonymousClass4SG.A47(r12.A09, r0, r12, "voice-error-too-many-tries-all-methods") == false) goto L_0x0389;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x015d, code lost:
        if (r4 != X.C998958p.A06) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x015f, code lost:
        r0 = X.C86604Kt.A0l(r12, com.whatsapp.R.string.f11nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x016a, code lost:
        if (r4 != X.C998958p.A02) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x016c, code lost:
        X.C626936e.A06(r0);
        A7o(r0, r1, "voice-bad-param");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0178, code lost:
        if (r4 != X.C998958p.A0C) goto L_0x018e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x017a, code lost:
        X.C18260x0.A1K(X.AnonymousClass4SG.A2y(r1), "/missing-parameter");
        X.AnonymousClass36l.A0O(r12.A09, "voice-missing-param");
        r0 = 25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0190, code lost:
        if (r4 != X.C998958p.A0G) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0192, code lost:
        X.C626936e.A06(r0);
        r3 = r0.A09;
        X.C18260x0.A0s("VerifyPhoneNumber/onRequestVoiceOrFlashErrorTooOld/method=", r1, X.AnonymousClass001.A0o());
        X.AnonymousClass36l.A0O(r12.A09, "voice-version-too-old");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01ab, code lost:
        if (A8D() != false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01ad, code lost:
        if (r3 == null) goto L_0x035d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01af, code lost:
        A7v(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        if (r1.equals(r2) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01b6, code lost:
        if (r4 != X.C998958p.A0Q) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01b8, code lost:
        X.C626936e.A06(r0);
        r3 = X.AnonymousClass001.A0o();
        X.AnonymousClass4SG.A3y("VerifyPhoneNumber/onRequestVoiceOrFlashErrorTooRecent/method=", r1, r3);
        X.C18260x0.A1L(r3, r0.A0L);
        X.AnonymousClass36l.A0O(r12.A09, "voice-too-recent");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01d8, code lost:
        if (X.AnonymousClass5VK.A01(r0.A0L) != false) goto L_0x02c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01da, code lost:
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01e1, code lost:
        if (r4 != X.C998958p.A04) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01e3, code lost:
        X.C626936e.A06(r0);
        r4 = r0.A08;
        X.C18260x0.A1K(X.AnonymousClass4SG.A2y(r1), "/blocked");
        A7Z(12);
        X.AnonymousClass36l.A0O(r12.A09, "voice-blocked");
        A7u(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0204, code lost:
        if (r4 != X.C998958p.A0D) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0206, code lost:
        X.C626936e.A06(r0);
        A84(r1, "voice-next-method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        r2 = X.AnonymousClass001.A0o();
        r2.append("VerifyPhoneNumber/onRequestVoiceOrFlashCodeResponse/method=");
        r2.append(r1);
        X.C18260x0.A1R(r2, "/status=", r4);
        X.AnonymousClass36l.A00 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0212, code lost:
        if (r4 != X.C998958p.A0P) goto L_0x023d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0214, code lost:
        X.C626936e.A06(r0);
        r3 = X.AnonymousClass001.A0o();
        X.AnonymousClass4SG.A3y("VerifyPhoneNumber/onRequestVoiceOrFlashErrorTooManyGuesses/method=", r1, r3);
        X.C18260x0.A1L(r3, r0.A0L);
        X.AnonymousClass36l.A0O(r12.A09, "voice-too-many-guesses");
        X.AnonymousClass4SG.A3r(r12);
        r5 = 28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0239, code lost:
        if (X.AnonymousClass5VK.A01(r0.A0L) == false) goto L_0x0389;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x023f, code lost:
        if (r4 != X.C998958p.A0I) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0241, code lost:
        X.C626936e.A06(r0);
        r3 = X.AnonymousClass001.A0o();
        r3.append("VerifyPhoneNumber/verifyvoice/request/");
        r3.append(r1);
        X.C18260x0.A1K(r3, "/provider-timeout");
        X.AnonymousClass36l.A0O(r12.A09, "voice-provider-timeout");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0264, code lost:
        if (X.AnonymousClass5VK.A01(r0.A0L) != false) goto L_0x02ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0266, code lost:
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0034, code lost:
        if (r22 == null) goto L_0x04f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x026d, code lost:
        if (r4 != X.C998958p.A0J) goto L_0x0282;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x026f, code lost:
        X.C626936e.A06(r0);
        A7p(r0, r1, "voice-provider-unroutable", com.whatsapp.R.string.f11nameremoved, com.whatsapp.R.string.f11nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0284, code lost:
        if (r4 != X.C998958p.A0F) goto L_0x029b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0286, code lost:
        X.C626936e.A06(r0);
        A7q(r0, r1, "voice-no-routes", "noRouteVoice", com.whatsapp.R.string.f11nameremoved, com.whatsapp.R.string.f11nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x029b, code lost:
        r5 = X.C998958p.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x029d, code lost:
        if (r4 == r5) goto L_0x02af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02a1, code lost:
        if (r4 == X.C998958p.A0A) goto L_0x02af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        r3 = X.AnonymousClass000.A0m("VerifyPhoneNumber/onRequestVoiceOrFlashCodeResponse/method=", r1);
        X.AnonymousClass4SG.A3q(r0, r3);
        X.C18260x0.A1J(r3, r0.A0L);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BPK(X.C998958p r21, X.C108935do r22, java.lang.String r23) {
        /*
            r20 = this;
            r1 = r23
            int r2 = r1.hashCode()
            r12 = r20
            r4 = r21
            r0 = r22
            switch(r2) {
                case -795576526: goto L_0x0523;
                case 114009: goto L_0x0520;
                case 97513456: goto L_0x0017;
                case 112386354: goto L_0x0014;
                case 601452370: goto L_0x09bb;
                case 1439178067: goto L_0x0940;
                case 2120743944: goto L_0x0010;
                default: goto L_0x000f;
            }
        L_0x000f:
            return
        L_0x0010:
            java.lang.String r2 = "email_otp"
            goto L_0x0525
        L_0x0014:
            java.lang.String r2 = "voice"
            goto L_0x0019
        L_0x0017:
            java.lang.String r2 = "flash"
        L_0x0019:
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x000f
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r3 = "VerifyPhoneNumber/onRequestVoiceOrFlashCodeResponse/method="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r6 = "/status="
            X.C18260x0.A1R(r2, r6, r4)
            java.lang.String r2 = ""
            X.AnonymousClass36l.A00 = r2
            if (r22 == 0) goto L_0x04f8
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0m(r3, r1)
            X.AnonymousClass4SG.A3q(r0, r3)
            java.lang.String r2 = r0.A0L
            X.C18260x0.A1J(r3, r2)
            java.lang.String r2 = "flash"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x004e
            X.58p r2 = X.C998958p.ERROR_FLASH_CALL_DISABLED
            if (r4 == r2) goto L_0x0051
        L_0x004e:
            r12.A7n(r0, r1)
        L_0x0051:
            X.58p r2 = X.C998958p.OK
            if (r4 != r2) goto L_0x005f
            X.C626936e.A06(r0)
            r12.A7m(r0, r1)
        L_0x005b:
            r12.A83(r1)
            return
        L_0x005f:
            X.58p r2 = X.C998958p.YES
            if (r4 == r2) goto L_0x0407
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "VerifyPhoneNumber/onVoiceOrFlashCodeRequestError/method="
            r3.append(r2)
            r3.append(r1)
            X.C18260x0.A1R(r3, r6, r4)
            X.58p r2 = X.C998958p.ERROR_FAIL_TO_INITIALIZE_WAMSYS
            if (r4 != r2) goto L_0x00a0
            r0 = 52
            X.C621433s.A00(r12, r0)
            X.3Wi r0 = r12.A05
            X.C386328l.A00(r0)
        L_0x0080:
            java.lang.String r0 = "flash"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x009b
            boolean r0 = r12.A8D()
            if (r0 != 0) goto L_0x009b
            X.33p r0 = r12.A09
            java.lang.String r3 = "secondary_failed"
            android.content.SharedPreferences$Editor r2 = X.C18270x1.A03(r0)
            java.lang.String r0 = "pref_secondary_flash_call_status"
            X.C18270x1.A0j(r2, r0, r3)
        L_0x009b:
            r0 = -1
            r12.A7U(r0)
            goto L_0x005b
        L_0x00a0:
            X.58p r2 = X.C998958p.ERROR_TEMPORARILY_UNAVAILABLE
            if (r4 != r2) goto L_0x00f5
            X.C626936e.A06(r0)
            java.lang.String r4 = "voice"
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "VerifyPhoneNumber/onRequestVoiceOrFlashErrorTempUnavailable/method="
            X.AnonymousClass4SG.A3y(r2, r1, r3)
            java.lang.String r2 = r0.A0L
            X.C18260x0.A1L(r3, r2)
            X.33p r3 = r12.A09
            java.lang.String r2 = "voice-temp-unavail"
            X.AnonymousClass36l.A0O(r3, r2)
            java.lang.String r2 = r0.A0L
            boolean r2 = X.AnonymousClass5VK.A01(r2)
            if (r2 != 0) goto L_0x00d1
            r0 = 2131892945(0x7f121ad1, float:1.9420653E38)
        L_0x00c9:
            java.lang.String r0 = r12.getString(r0)
        L_0x00cd:
            r12.A82(r0)
            goto L_0x0080
        L_0x00d1:
            long r2 = X.AnonymousClass4SG.A2M(r0)     // Catch:{ NumberFormatException -> 0x00e7 }
            r12.A7b(r2)     // Catch:{ NumberFormatException -> 0x00e7 }
            r0 = 2131892946(0x7f121ad2, float:1.9420655E38)
            X.AnonymousClass4SG.A3s(r12, r0, r2)     // Catch:{ NumberFormatException -> 0x00e7 }
            X.5UQ r0 = r12.A10     // Catch:{ NumberFormatException -> 0x00e7 }
            X.AnonymousClass4SG.A3u(r0, r4, r2)     // Catch:{ NumberFormatException -> 0x00e7 }
            r12.A7d(r2, r4)     // Catch:{ NumberFormatException -> 0x00e7 }
            goto L_0x0080
        L_0x00e7:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass4SG.A2z(r1)
            java.lang.String r0 = "/temporarily-unavailable/unable-to-parse-retryAfter"
            X.C18260x0.A14(r0, r2, r3)
            r0 = 2131892945(0x7f121ad1, float:1.9420653E38)
            goto L_0x00c9
        L_0x00f5:
            X.58p r2 = X.C998958p.ERROR_UNSPECIFIED
            if (r4 != r2) goto L_0x0110
            java.lang.String r3 = "voice-error"
            java.lang.StringBuilder r2 = X.AnonymousClass4SG.A2y(r1)
            java.lang.String r0 = "/unspecified"
            X.C18260x0.A1M(r2, r0)
            X.33p r0 = r12.A09
            X.AnonymousClass36l.A0O(r0, r3)
            r0 = 109(0x6d, float:1.53E-43)
        L_0x010b:
            r12.A7X(r0)
            goto L_0x0080
        L_0x0110:
            X.58p r2 = X.C998958p.ERROR_TOO_MANY
            if (r4 != r2) goto L_0x0136
            X.C626936e.A06(r0)
            java.lang.String r7 = "voice"
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "VerifyPhoneNumber/onRequestVoiceOrFlashErrorTooMany/method="
            X.C18260x0.A0s(r2, r1, r3)
            X.33p r3 = r12.A09
            java.lang.String r2 = "voice-error-too-many-tries"
            boolean r2 = X.AnonymousClass4SG.A47(r3, r0, r12, r2)
            r6 = 26
            if (r2 != 0) goto L_0x0314
            r12.A7X(r6)
            r12.A7M()
            goto L_0x0080
        L_0x0136:
            X.58p r2 = X.C998958p.ERROR_TOO_MANY_ALL_METHODS
            if (r4 != r2) goto L_0x015b
            X.C626936e.A06(r0)
            java.lang.String r4 = "voice"
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "VerifyPhoneNumber/onRequestVoiceOrFlashErrorTooManyAllMethods/method="
            X.AnonymousClass4SG.A3y(r2, r1, r3)
            java.lang.String r2 = r0.A0L
            X.C18260x0.A1L(r3, r2)
            X.33p r3 = r12.A09
            java.lang.String r2 = "voice-error-too-many-tries-all-methods"
            boolean r2 = X.AnonymousClass4SG.A47(r3, r0, r12, r2)
            r5 = 27
            if (r2 == 0) goto L_0x0389
            goto L_0x034a
        L_0x015b:
            X.58p r2 = X.C998958p.ERROR_CONNECTIVITY
            if (r4 != r2) goto L_0x0168
            r0 = 2131892894(0x7f121a9e, float:1.942055E38)
            java.lang.String r0 = X.C86604Kt.A0l(r12, r0)
            goto L_0x00cd
        L_0x0168:
            X.58p r2 = X.C998958p.ERROR_BAD_PARAMETER
            if (r4 != r2) goto L_0x0176
            X.C626936e.A06(r0)
            java.lang.String r2 = "voice-bad-param"
            r12.A7o(r0, r1, r2)
            goto L_0x0080
        L_0x0176:
            X.58p r2 = X.C998958p.ERROR_MISSING_PARAMETER
            if (r4 != r2) goto L_0x018e
            java.lang.String r3 = "voice-missing-param"
            java.lang.StringBuilder r2 = X.AnonymousClass4SG.A2y(r1)
            java.lang.String r0 = "/missing-parameter"
            X.C18260x0.A1K(r2, r0)
            X.33p r0 = r12.A09
            X.AnonymousClass36l.A0O(r0, r3)
            r0 = 25
            goto L_0x010b
        L_0x018e:
            X.58p r2 = X.C998958p.ERROR_OLD_VERSION
            if (r4 != r2) goto L_0x01b4
            X.C626936e.A06(r0)
            X.5T0 r3 = r0.A09
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VerifyPhoneNumber/onRequestVoiceOrFlashErrorTooOld/method="
            X.C18260x0.A0s(r0, r1, r2)
            X.33p r2 = r12.A09
            java.lang.String r0 = "voice-version-too-old"
            X.AnonymousClass36l.A0O(r2, r0)
            boolean r0 = r12.A8D()
            if (r0 != 0) goto L_0x0080
            if (r3 == 0) goto L_0x035d
            r12.A7v(r3)
            goto L_0x0080
        L_0x01b4:
            X.58p r2 = X.C998958p.ERROR_TOO_RECENT
            if (r4 != r2) goto L_0x01df
            X.C626936e.A06(r0)
            java.lang.String r4 = "voice"
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "VerifyPhoneNumber/onRequestVoiceOrFlashErrorTooRecent/method="
            X.AnonymousClass4SG.A3y(r2, r1, r3)
            java.lang.String r2 = r0.A0L
            X.C18260x0.A1L(r3, r2)
            X.33p r3 = r12.A09
            java.lang.String r2 = "voice-too-recent"
            X.AnonymousClass36l.A0O(r3, r2)
            java.lang.String r2 = r0.A0L
            boolean r2 = X.AnonymousClass5VK.A01(r2)
            if (r2 != 0) goto L_0x02c8
            r0 = 2131892949(0x7f121ad5, float:1.942066E38)
            goto L_0x00c9
        L_0x01df:
            X.58p r2 = X.C998958p.ERROR_BLOCKED
            if (r4 != r2) goto L_0x0202
            X.C626936e.A06(r0)
            X.2nZ r4 = r0.A08
            java.lang.String r3 = "voice-blocked"
            java.lang.StringBuilder r2 = X.AnonymousClass4SG.A2y(r1)
            java.lang.String r0 = "/blocked"
            X.C18260x0.A1K(r2, r0)
            r0 = 12
            r12.A7Z(r0)
            X.33p r0 = r12.A09
            X.AnonymousClass36l.A0O(r0, r3)
            r12.A7u(r4)
            goto L_0x0080
        L_0x0202:
            X.58p r2 = X.C998958p.ERROR_NEXT_METHOD
            if (r4 != r2) goto L_0x0210
            X.C626936e.A06(r0)
            java.lang.String r0 = "voice-next-method"
            r12.A84(r1, r0)
            goto L_0x0080
        L_0x0210:
            X.58p r2 = X.C998958p.ERROR_TOO_MANY_GUESSES
            if (r4 != r2) goto L_0x023d
            X.C626936e.A06(r0)
            java.lang.String r4 = "voice"
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "VerifyPhoneNumber/onRequestVoiceOrFlashErrorTooManyGuesses/method="
            X.AnonymousClass4SG.A3y(r2, r1, r3)
            java.lang.String r2 = r0.A0L
            X.C18260x0.A1L(r3, r2)
            X.33p r3 = r12.A09
            java.lang.String r2 = "voice-too-many-guesses"
            X.AnonymousClass36l.A0O(r3, r2)
            X.AnonymousClass4SG.A3r(r12)
            java.lang.String r2 = r0.A0L
            boolean r2 = X.AnonymousClass5VK.A01(r2)
            r5 = 28
            if (r2 == 0) goto L_0x0389
            goto L_0x0364
        L_0x023d:
            X.58p r2 = X.C998958p.ERROR_PROVIDER_TIMEOUT
            if (r4 != r2) goto L_0x026b
            X.C626936e.A06(r0)
            java.lang.String r5 = "voice"
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "VerifyPhoneNumber/verifyvoice/request/"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r2 = "/provider-timeout"
            X.C18260x0.A1K(r3, r2)
            X.33p r3 = r12.A09
            java.lang.String r2 = "voice-provider-timeout"
            X.AnonymousClass36l.A0O(r3, r2)
            java.lang.String r2 = r0.A0L
            boolean r2 = X.AnonymousClass5VK.A01(r2)
            if (r2 != 0) goto L_0x02ee
            r0 = 2131892984(0x7f121af8, float:1.9420732E38)
            goto L_0x00c9
        L_0x026b:
            X.58p r2 = X.C998958p.ERROR_PROVIDER_UNROUTABLE
            if (r4 != r2) goto L_0x0282
            X.C626936e.A06(r0)
            java.lang.String r5 = "voice-provider-unroutable"
            r6 = 2131892986(0x7f121afa, float:1.9420736E38)
            r7 = 2131892985(0x7f121af9, float:1.9420734E38)
            r2 = r12
            r3 = r0
            r4 = r1
            r2.A7p(r3, r4, r5, r6, r7)
            goto L_0x0080
        L_0x0282:
            X.58p r2 = X.C998958p.ERROR_NO_ROUTES
            if (r4 != r2) goto L_0x029b
            X.C626936e.A06(r0)
            java.lang.String r5 = "voice-no-routes"
            r7 = 2131892986(0x7f121afa, float:1.9420736E38)
            r8 = 2131892985(0x7f121af9, float:1.9420734E38)
            java.lang.String r6 = "noRouteVoice"
            r2 = r12
            r3 = r0
            r4 = r1
            r2.A7q(r3, r4, r5, r6, r7, r8)
            goto L_0x0080
        L_0x029b:
            X.58p r5 = X.C998958p.ERROR_BAD_TOKEN
            if (r4 == r5) goto L_0x02af
            X.58p r2 = X.C998958p.ERROR_INVALID_SKEY_SIGNATURE
            if (r4 == r2) goto L_0x02af
            X.58p r2 = X.C998958p.SECURITY_CODE
            if (r4 != r2) goto L_0x038e
            X.C626936e.A06(r0)
            r12.A7l(r0, r1)
            goto L_0x0080
        L_0x02af:
            java.lang.String r3 = "voice-bad-token"
            java.lang.StringBuilder r2 = X.AnonymousClass4SG.A2y(r1)
            if (r4 != r5) goto L_0x02c5
            java.lang.String r0 = "/bad-token"
        L_0x02b9:
            X.C18260x0.A1K(r2, r0)
            X.33p r0 = r12.A09
            X.AnonymousClass36l.A0O(r0, r3)
            r0 = 41
            goto L_0x010b
        L_0x02c5:
            java.lang.String r0 = "/invalid-skey"
            goto L_0x02b9
        L_0x02c8:
            long r2 = X.AnonymousClass4SG.A2M(r0)     // Catch:{ NumberFormatException -> 0x02df }
            r12.A7b(r2)     // Catch:{ NumberFormatException -> 0x02df }
            r0 = 2131892948(0x7f121ad4, float:1.9420659E38)
            X.AnonymousClass4SG.A3s(r12, r0, r2)     // Catch:{ NumberFormatException -> 0x02df }
            X.5UQ r0 = r12.A10     // Catch:{ NumberFormatException -> 0x02df }
            X.AnonymousClass4SG.A3u(r0, r4, r2)     // Catch:{ NumberFormatException -> 0x02df }
            r12.A7d(r2, r4)     // Catch:{ NumberFormatException -> 0x02df }
            goto L_0x0080
        L_0x02df:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass4SG.A2z(r1)
            java.lang.String r0 = "/too-recent/time-not-int"
            X.C18260x0.A14(r0, r2, r3)
            r0 = 2131892949(0x7f121ad5, float:1.942066E38)
            goto L_0x00c9
        L_0x02ee:
            long r2 = X.AnonymousClass4SG.A2M(r0)     // Catch:{ NumberFormatException -> 0x0305 }
            r12.A7b(r2)     // Catch:{ NumberFormatException -> 0x0305 }
            r0 = 2131892983(0x7f121af7, float:1.942073E38)
            X.AnonymousClass4SG.A3s(r12, r0, r2)     // Catch:{ NumberFormatException -> 0x0305 }
            X.5UQ r0 = r12.A10     // Catch:{ NumberFormatException -> 0x0305 }
            X.AnonymousClass4SG.A3u(r0, r5, r2)     // Catch:{ NumberFormatException -> 0x0305 }
            r12.A7d(r2, r5)     // Catch:{ NumberFormatException -> 0x0305 }
            goto L_0x0080
        L_0x0305:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0m(r4, r1)
            java.lang.String r0 = "/too-recent/time-not-int"
            X.C18260x0.A14(r0, r2, r3)
            r0 = 2131892984(0x7f121af8, float:1.9420732E38)
            goto L_0x00c9
        L_0x0314:
            long r2 = X.AnonymousClass4SG.A2M(r0)     // Catch:{ NumberFormatException -> 0x0338 }
            r12.A0D = r2     // Catch:{ NumberFormatException -> 0x0338 }
            r12.A7b(r2)     // Catch:{ NumberFormatException -> 0x0338 }
            r5 = 2131893909(0x7f121e95, float:1.9422608E38)
            java.lang.Object[] r4 = X.AnonymousClass002.A0L()     // Catch:{ NumberFormatException -> 0x0338 }
            X.33j r0 = r12.A00     // Catch:{ NumberFormatException -> 0x0338 }
            long r2 = r12.A0D     // Catch:{ NumberFormatException -> 0x0338 }
            java.lang.String r0 = X.C107565bW.A0D(r0, r2)     // Catch:{ NumberFormatException -> 0x0338 }
            java.lang.String r0 = X.C86614Ku.A0s(r12, r0, r4, r5)     // Catch:{ NumberFormatException -> 0x0338 }
            r12.A82(r0)     // Catch:{ NumberFormatException -> 0x0338 }
            X.AnonymousClass4SG.A3t(r12, r7)     // Catch:{ NumberFormatException -> 0x0338 }
            goto L_0x0080
        L_0x0338:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass4SG.A2z(r1)
            java.lang.String r0 = "/triedtoomanytimesallmethods/time-not-int"
            X.C18260x0.A14(r0, r2, r3)
            r12.A7X(r6)
            r12.A7M()
            goto L_0x0080
        L_0x034a:
            long r2 = X.AnonymousClass4SG.A2M(r0)     // Catch:{ NumberFormatException -> 0x037f }
            r12.A0D = r2     // Catch:{ NumberFormatException -> 0x037f }
            r12.A7b(r2)     // Catch:{ NumberFormatException -> 0x037f }
            r0 = 31
            r12.A7X(r0)     // Catch:{ NumberFormatException -> 0x037f }
            X.AnonymousClass4SG.A3t(r12, r4)     // Catch:{ NumberFormatException -> 0x037f }
            goto L_0x0080
        L_0x035d:
            r0 = 22
            r12.A7V(r0)
            goto L_0x0080
        L_0x0364:
            long r2 = X.AnonymousClass4SG.A2M(r0)     // Catch:{ NumberFormatException -> 0x0377 }
            r12.A0D = r2     // Catch:{ NumberFormatException -> 0x0377 }
            r12.A7b(r2)     // Catch:{ NumberFormatException -> 0x0377 }
            r0 = 32
            r12.A7X(r0)     // Catch:{ NumberFormatException -> 0x0377 }
            X.AnonymousClass4SG.A3t(r12, r4)     // Catch:{ NumberFormatException -> 0x0377 }
            goto L_0x0080
        L_0x0377:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass4SG.A2z(r1)
            java.lang.String r0 = "/too-many-guesses/time-not-int"
            goto L_0x0386
        L_0x037f:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass4SG.A2z(r1)
            java.lang.String r0 = "/triedtoomanytimesallmethods/time-not-int"
        L_0x0386:
            X.C18260x0.A14(r0, r2, r3)
        L_0x0389:
            r12.A7X(r5)
            goto L_0x0080
        L_0x038e:
            X.58p r6 = X.C998958p.ERROR_DEVICE_CONFIRM_OR_SECOND_OTP
            if (r4 == r6) goto L_0x03ec
            X.58p r2 = X.C998958p.ERROR_SECOND_OTP
            if (r4 == r2) goto L_0x03ec
            java.lang.String r0 = "flash"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x03cc
            X.58p r0 = X.C998958p.ERROR_FLASH_CALL_DISABLED
            if (r4 != r0) goto L_0x03cc
            java.lang.String r0 = "VerifyPhoneNumber/onRequestFlashErrorDisabled/fall back to voice"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r12.A8D()
            if (r0 != 0) goto L_0x0080
            X.4z5 r3 = X.AnonymousClass4SG.A2p(r12)
            X.33p r0 = r12.A09
            android.content.SharedPreferences r2 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "migrate_from_consumer_app_directly"
            boolean r0 = X.C18280x3.A1W(r2, r0)
            if (r0 == 0) goto L_0x03c6
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A02 = r0
        L_0x03c6:
            r0 = 0
            r12.A7s(r3, r0)
            goto L_0x0080
        L_0x03cc:
            X.58p r0 = X.C998958p.ERROR_NOT_ALLOWED
            if (r4 != r0) goto L_0x03d5
            r12.A81(r1)
            goto L_0x0080
        L_0x03d5:
            X.58p r0 = X.C998958p.ERROR_CODE_CHECKPOINT
            if (r4 != r0) goto L_0x0080
            X.317 r3 = r12.A0w
            r0 = 16
            r2 = 1
            r3.A0B(r0, r2)
            boolean r0 = r12.A1G
            android.content.Intent r0 = X.C627736r.A1C(r12, r0)
            r12.A6T(r0, r2)
            goto L_0x0080
        L_0x03ec:
            X.C626936e.A06(r0)
            java.lang.String r5 = r0.A0N
            r2 = 0
            long r13 = X.AnonymousClass36l.A01(r5, r2)
            java.lang.String r0 = r0.A0P
            long r17 = X.AnonymousClass36l.A01(r0, r2)
            boolean r16 = X.AnonymousClass000.A1Y(r4, r6)
            r15 = r1
            r12.A7f(r13, r15, r16, r17)
            goto L_0x0080
        L_0x0407:
            java.lang.StringBuilder r4 = X.C18290x4.A0u(r0)
            java.lang.String r2 = "VerifyPhoneNumber/verifyvoice/request/"
            r4.append(r2)
            r4.append(r1)
            java.lang.String r3 = "/requested"
            X.C18260x0.A1L(r4, r3)
            java.lang.String r3 = "flash"
            boolean r8 = r1.equals(r3)
            r6 = 1000(0x3e8, double:4.94E-321)
            if (r8 == 0) goto L_0x044c
            java.lang.String r3 = r0.A0F
            if (r3 == 0) goto L_0x042d
            long r3 = java.lang.Long.parseLong(r3)
            long r3 = r3 * r6
            r12.A0C = r3
        L_0x042d:
            long r13 = r12.A0C
            java.lang.String r3 = "VerifyPhoneNumber/start-primary-flash-call-timer"
            com.whatsapp.util.Log.i((java.lang.String) r3)
            r12.A7C()
            int r3 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x043d
            r13 = 30000(0x7530, double:1.4822E-319)
        L_0x043d:
            r3 = 2
            long r15 = r13 / r3
            X.4MF r11 = new X.4MF
            r11.<init>(r12, r13, r15)
            android.os.CountDownTimer r3 = r11.start()
            r12.A0G = r3
        L_0x044c:
            int r3 = r0.A02
            if (r3 <= 0) goto L_0x0471
            if (r8 != 0) goto L_0x0471
            A1c = r3
            X.5UC r3 = r12.A0q
            boolean r3 = r3.A04()
            if (r3 != 0) goto L_0x0464
            com.whatsapp.CodeInputField r4 = r12.A0Q
            if (r4 == 0) goto L_0x0464
            int r3 = r0.A02
            r4.A02 = r3
        L_0x0464:
            X.33p r3 = r12.A09
            int r5 = r0.A02
            android.content.SharedPreferences$Editor r4 = X.C18270x1.A03(r3)
            java.lang.String r3 = "registration_voice_code_length"
            X.C18270x1.A0h(r4, r3, r5)
        L_0x0471:
            java.lang.String r4 = r0.A0I
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 != 0) goto L_0x0483
            long r3 = java.lang.Long.parseLong(r4)
            long r3 = r3 * r6
            X.317 r5 = r12.A0w
            r5.A0C(r3)
        L_0x0483:
            if (r8 == 0) goto L_0x04cf
            X.5Od r4 = r12.A13
            java.lang.String r15 = r12.A1B
            java.lang.String r3 = r12.A1E
            X.C626936e.A06(r3)
            java.lang.String r14 = r0.A0C
            if (r14 != 0) goto L_0x0494
            java.lang.String r14 = "(.*)xyz(.*)"
        L_0x0494:
            X.4z4 r11 = r12.A12
            r0 = 0
            X.C162457s7.A0J(r15, r0)
            r0 = 1
            X.C18270x1.A11(r3, r0, r11)
            X.2oU r5 = r4.A02
            android.content.Context r5 = r5.A00
            X.C162457s7.A0D(r5)
            X.4LU r6 = r4.A00
            if (r6 != 0) goto L_0x04bf
            X.4FS r13 = r4.A06
            X.33i r7 = r4.A01
            X.5ZR r8 = r4.A03
            X.33p r9 = r4.A04
            X.2sl r10 = r4.A05
            X.C626936e.A06(r3)
            X.4LU r6 = new X.4LU
            r16 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r4.A00 = r6
        L_0x04bf:
            java.lang.String r4 = "android.intent.action.PHONE_STATE"
            android.content.IntentFilter r3 = new android.content.IntentFilter
            r3.<init>(r4)
            java.lang.String r8 = X.C58152un.A0C
            r7 = 0
            r4 = r6
            r6 = r3
            r9 = r0
            X.C154317cy.A00(r4, r5, r6, r7, r8, r9)
        L_0x04cf:
            int r3 = X.AnonymousClass4SG.A2K(r12)
            r0 = 13
            if (r3 == r0) goto L_0x04db
            r0 = 14
            if (r3 != r0) goto L_0x04f3
        L_0x04db:
            java.lang.String r0 = "voice"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x04f3
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0m(r2, r1)
            java.lang.String r0 = "/update acct defence stat:"
            r2.append(r0)
            r0 = 3
            X.C18260x0.A1G(r2, r0)
            r12.A7T(r0)
        L_0x04f3:
            r12.A7N()
            goto L_0x005b
        L_0x04f8:
            java.lang.String r2 = "VerifyPhoneNumber/onRequestVoiceOrFlashCodeResponse/response is null"
            com.whatsapp.util.Log.w((java.lang.String) r2)
            r2 = 300000(0x493e0, double:1.482197E-318)
            java.lang.String r5 = "sms"
            r12.A7d(r2, r5)
            java.lang.String r5 = "voice"
            r12.A7d(r2, r5)
            boolean r5 = r12.A8E()
            if (r5 == 0) goto L_0x0517
            java.lang.String r5 = "wa_old"
        L_0x0512:
            r12.A7d(r2, r5)
            goto L_0x0051
        L_0x0517:
            boolean r5 = r12.A8C()
            if (r5 == 0) goto L_0x0051
            java.lang.String r5 = "email_otp"
            goto L_0x0512
        L_0x0520:
            java.lang.String r2 = "sms"
            goto L_0x0525
        L_0x0523:
            java.lang.String r2 = "wa_old"
        L_0x0525:
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x000f
            boolean r2 = r12.isFinishing()
            if (r2 != 0) goto L_0x000f
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r3 = "VerifyPhoneNumber/onRequestGenericCodeResponse/method="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r6 = "/status="
            X.C18260x0.A1R(r2, r6, r4)
            java.lang.String r2 = ""
            X.AnonymousClass36l.A00 = r2
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0l(r3)
            if (r22 == 0) goto L_0x0565
            r3.append(r1)
            X.AnonymousClass4SG.A3q(r0, r3)
            java.lang.String r2 = r0.A0L
            X.C18260x0.A1J(r3, r2)
            r12.A7n(r0, r1)
        L_0x055a:
            X.58p r2 = X.C998958p.OK
            if (r4 != r2) goto L_0x058f
            X.C626936e.A06(r0)
            r12.A7m(r0, r1)
            return
        L_0x0565:
            r3.append(r1)
            java.lang.String r2 = "/response is null"
            X.C18260x0.A1M(r3, r2)
            r2 = 300000(0x493e0, double:1.482197E-318)
            java.lang.String r5 = "sms"
            r12.A7d(r2, r5)
            java.lang.String r5 = "voice"
            r12.A7d(r2, r5)
            boolean r5 = r12.A8E()
            if (r5 == 0) goto L_0x0586
            java.lang.String r5 = "wa_old"
        L_0x0582:
            r12.A7d(r2, r5)
            goto L_0x055a
        L_0x0586:
            boolean r5 = r12.A8C()
            if (r5 == 0) goto L_0x055a
            java.lang.String r5 = "email_otp"
            goto L_0x0582
        L_0x058f:
            X.58p r2 = X.C998958p.YES
            if (r4 != r2) goto L_0x061a
            X.C626936e.A06(r0)
            java.lang.String r1 = "VerifyPhoneNumber/onGenericCodeSent"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            boolean r1 = r12.A8C()
            if (r1 == 0) goto L_0x05a8
            X.33p r2 = r12.A09
            java.lang.String r1 = "email_sent"
            r2.A1R(r1)
        L_0x05a8:
            int r2 = X.AnonymousClass4SG.A2K(r12)
            r1 = 13
            if (r2 == r1) goto L_0x05b4
            r1 = 14
            if (r2 != r1) goto L_0x05e6
        L_0x05b4:
            r1 = 3
            r12.A7T(r1)
            boolean r1 = r12.A1M
            if (r1 != 0) goto L_0x05e6
            X.5X2 r1 = r12.A0p
            r4 = 1
            X.2hq r1 = r1.A02
            X.5Pg r3 = r1.A06
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "AccountDefenceLocalDataRepository/saveSecondSmsRequestedOnce/"
            X.C18260x0.A1E(r1, r2, r4)
            X.2y5 r2 = r3.A01
            java.lang.String r1 = "AccountDefenceLocalDataRepository_prefs"
            android.content.SharedPreferences$Editor r2 = X.C60152y5.A00(r2, r1)
            java.lang.String r1 = "com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.account_defence_sms_requested_once"
            r2.putBoolean(r1, r4)
            boolean r1 = r2.commit()
            if (r1 != 0) goto L_0x05e4
            java.lang.String r1 = "AccountDefenceLocalDataRepository/saveSecondSmsRequestedOnce/error"
            com.whatsapp.util.Log.e((java.lang.String) r1)
        L_0x05e4:
            r12.A1M = r4
        L_0x05e6:
            int r3 = r0.A02
            if (r3 <= 0) goto L_0x05f5
            A1b = r3
            android.content.SharedPreferences$Editor r2 = X.AnonymousClass4SG.A2P(r12)
            java.lang.String r1 = "registration_sms_code_length"
            X.C18270x1.A0h(r2, r1, r3)
        L_0x05f5:
            java.lang.String r1 = r0.A0I
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0609
            long r2 = java.lang.Long.parseLong(r1)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            X.317 r0 = r12.A0w
            r0.A0C(r2)
        L_0x0609:
            r12.A7N()
        L_0x060c:
            X.33p r0 = r12.A09
            int r2 = r12.A04
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "flash_call_eligible"
            X.C18270x1.A0h(r1, r0, r2)
            return
        L_0x061a:
            r12.A7O()
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "VerifyPhoneNumber/onRequestGenericCodeError/method="
            r3.append(r2)
            r3.append(r1)
            X.C18260x0.A1R(r3, r6, r4)
            java.lang.String r2 = "email_otp"
            boolean r7 = r1.equals(r2)
            if (r7 == 0) goto L_0x0643
            X.58p r2 = X.C998958p.SECURITY_CODE
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x0643
            X.33p r3 = r12.A09
            java.lang.String r2 = "email_otp_request_failed"
            r3.A1R(r2)
        L_0x0643:
            X.58p r2 = X.C998958p.ERROR_FAIL_TO_INITIALIZE_WAMSYS
            if (r4 != r2) goto L_0x0652
            r0 = 52
            X.C621433s.A00(r12, r0)
        L_0x064c:
            X.3Wi r0 = r12.A05
            X.C386328l.A00(r0)
            return
        L_0x0652:
            X.58p r2 = X.C998958p.ERROR_TEMPORARILY_UNAVAILABLE
            if (r4 != r2) goto L_0x06a5
            X.C626936e.A06(r0)
            java.lang.String r1 = "VerifyPhoneNumber/onRequestGenericCodeErrorTempUnavailable"
            com.whatsapp.util.Log.w((java.lang.String) r1)
            X.33p r2 = r12.A09
            java.lang.String r1 = "server-send-request-temp-unavailable"
            X.AnonymousClass36l.A0O(r2, r1)
            java.lang.String r1 = r0.A0L
            boolean r1 = X.AnonymousClass5VK.A01(r1)
            if (r1 != 0) goto L_0x0679
            X.5Te r1 = r12.A0s
            r0 = 2131892945(0x7f121ad1, float:1.9420653E38)
        L_0x0672:
            r1.A02(r0)
        L_0x0675:
            r12.A7H()
            return
        L_0x0679:
            long r3 = X.AnonymousClass4SG.A2M(r0)     // Catch:{ NumberFormatException -> 0x0699 }
            X.317 r0 = r12.A0w     // Catch:{ NumberFormatException -> 0x0699 }
            r0.A0C(r3)     // Catch:{ NumberFormatException -> 0x0699 }
            X.5Te r5 = r12.A0s     // Catch:{ NumberFormatException -> 0x0699 }
            r2 = 2131892946(0x7f121ad2, float:1.9420655E38)
            java.lang.Object[] r1 = X.AnonymousClass002.A0L()     // Catch:{ NumberFormatException -> 0x0699 }
            X.33j r0 = r12.A00     // Catch:{ NumberFormatException -> 0x0699 }
            java.lang.String r0 = X.C107565bW.A0D(r0, r3)     // Catch:{ NumberFormatException -> 0x0699 }
            java.lang.String r0 = X.C86614Ku.A0s(r12, r0, r1, r2)     // Catch:{ NumberFormatException -> 0x0699 }
            r5.A03(r0)     // Catch:{ NumberFormatException -> 0x0699 }
            goto L_0x0675
        L_0x0699:
            r1 = move-exception
            java.lang.String r0 = "VerifyPhoneNumber/request/sms/temporarily-unavailable/unable-to-parse-retryAfter"
            com.whatsapp.util.Log.w(r0, r1)
            X.5Te r1 = r12.A0s
            r0 = 2131892945(0x7f121ad1, float:1.9420653E38)
            goto L_0x0672
        L_0x06a5:
            X.58p r2 = X.C998958p.ERROR_UNSPECIFIED
            if (r4 != r2) goto L_0x06bf
            java.lang.String r2 = "server-send-request-error-unspecified"
            java.lang.StringBuilder r1 = X.AnonymousClass4SG.A2y(r1)
            java.lang.String r0 = "/unspecified"
            X.C18260x0.A1M(r1, r0)
            X.33p r0 = r12.A09
            X.AnonymousClass36l.A0O(r0, r2)
            r0 = 109(0x6d, float:1.53E-43)
        L_0x06bb:
            r12.A7X(r0)
            goto L_0x0675
        L_0x06bf:
            X.58p r2 = X.C998958p.ERROR_TOO_MANY
            if (r4 != r2) goto L_0x06f5
            X.C626936e.A06(r0)
            java.lang.String r9 = "sms"
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "VerifyPhoneNumber/onRequestGenericCodeErrorTooMany/method="
            X.C18260x0.A0t(r2, r1, r3)
            java.lang.String r8 = "wa_old"
            boolean r3 = r1.equals(r8)
            if (r3 == 0) goto L_0x06ee
            r6 = 40
        L_0x06db:
            X.33p r2 = r12.A09
            java.lang.String r1 = "server-send-request-too-many-tries"
            boolean r1 = X.AnonymousClass4SG.A47(r2, r0, r12, r1)
            if (r1 != 0) goto L_0x0a49
            X.5Te r0 = r12.A0s
            r0.A01(r6)
            r12.A7M()
            return
        L_0x06ee:
            r6 = 39
            if (r7 == 0) goto L_0x06db
            r6 = 48
            goto L_0x06db
        L_0x06f5:
            X.58p r2 = X.C998958p.ERROR_TOO_MANY_ALL_METHODS
            if (r4 != r2) goto L_0x070f
            X.C626936e.A06(r0)
            java.lang.String r1 = "VerifyPhoneNumber/onRequestGenericCodeErrorTooManyAllMethods"
            com.whatsapp.util.Log.w((java.lang.String) r1)
            X.33p r2 = r12.A09
            java.lang.String r1 = "server-send-request-too-many-tries-all-methods"
            boolean r1 = X.AnonymousClass4SG.A47(r2, r0, r12, r1)
            r4 = 27
            if (r1 == 0) goto L_0x0882
            goto L_0x080f
        L_0x070f:
            X.58p r2 = X.C998958p.ERROR_CONNECTIVITY
            if (r4 != r2) goto L_0x0726
            X.33p r1 = r12.A09
            java.lang.String r0 = "server-send-request-error-connectivity"
            X.AnonymousClass36l.A0O(r1, r0)
            r0 = 2131892894(0x7f121a9e, float:1.942055E38)
            java.lang.String r0 = X.C86604Kt.A0l(r12, r0)
        L_0x0721:
            r12.A82(r0)
            goto L_0x0675
        L_0x0726:
            X.58p r2 = X.C998958p.ERROR_BAD_PARAMETER
            if (r4 != r2) goto L_0x0733
            X.C626936e.A06(r0)
            java.lang.String r2 = "server-send-request-bad-param"
            r12.A7o(r0, r1, r2)
            return
        L_0x0733:
            X.58p r2 = X.C998958p.ERROR_MISSING_PARAMETER
            if (r4 != r2) goto L_0x074b
            java.lang.String r2 = "server-send-request-missing-param"
            java.lang.StringBuilder r1 = X.AnonymousClass4SG.A2y(r1)
            java.lang.String r0 = "/missing-parameter"
            X.C18260x0.A1K(r1, r0)
            X.33p r0 = r12.A09
            X.AnonymousClass36l.A0O(r0, r2)
            r0 = 25
            goto L_0x06bb
        L_0x074b:
            X.58p r2 = X.C998958p.ERROR_OLD_VERSION
            if (r4 != r2) goto L_0x075f
            X.C626936e.A06(r0)
            X.5T0 r1 = r0.A09
            java.lang.String r0 = "VerifyPhoneNumber/onRequestGenericCodeErrorTooOld"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            if (r1 == 0) goto L_0x0a9b
            r12.A7v(r1)
            return
        L_0x075f:
            X.58p r2 = X.C998958p.ERROR_TOO_RECENT
            if (r4 != r2) goto L_0x078c
            java.lang.StringBuilder r2 = X.C18290x4.A0u(r0)
            java.lang.String r1 = "VerifyPhoneNumber/onRequestGenericCodeErrorTooRecent/retryAfter="
            r2.append(r1)
            java.lang.String r1 = r0.A0L
            r2.append(r1)
            java.lang.String r1 = " seconds"
            X.C18260x0.A1M(r2, r1)
            X.33p r2 = r12.A09
            java.lang.String r1 = "server-send-request-too-recent"
            X.AnonymousClass36l.A0O(r2, r1)
            java.lang.String r1 = r0.A0L
            boolean r1 = X.AnonymousClass5VK.A01(r1)
            if (r1 != 0) goto L_0x0826
            X.5Te r1 = r12.A0s
            r0 = 2131892949(0x7f121ad5, float:1.942066E38)
            goto L_0x0672
        L_0x078c:
            X.58p r2 = X.C998958p.ERROR_BLOCKED
            if (r4 != r2) goto L_0x07ac
            X.2nZ r3 = r0.A08
            java.lang.String r2 = "server-send-request-user-blocked"
            java.lang.StringBuilder r1 = X.AnonymousClass4SG.A2y(r1)
            java.lang.String r0 = "/blocked"
            X.C18260x0.A1K(r1, r0)
            r0 = 12
            r12.A7Z(r0)
            X.33p r0 = r12.A09
            X.AnonymousClass36l.A0O(r0, r2)
            r12.A7u(r3)
            goto L_0x0675
        L_0x07ac:
            X.58p r2 = X.C998958p.ERROR_NEXT_METHOD
            if (r4 != r2) goto L_0x07b9
            X.C626936e.A06(r0)
            java.lang.String r0 = "server-send-request-next-method"
            r12.A84(r1, r0)
            return
        L_0x07b9:
            X.58p r2 = X.C998958p.ERROR_TOO_MANY_GUESSES
            if (r4 != r2) goto L_0x07da
            X.C626936e.A06(r0)
            java.lang.String r2 = "VerifyPhoneNumber/onRequestGenericCodeErrorTooManyGuesses"
            com.whatsapp.util.Log.w((java.lang.String) r2)
            X.33p r3 = r12.A09
            java.lang.String r2 = "server-send-request-too-many-guesses"
            X.AnonymousClass36l.A0O(r3, r2)
            X.AnonymousClass4SG.A3r(r12)
            java.lang.String r2 = r0.A0L
            boolean r2 = X.AnonymousClass5VK.A01(r2)
            r4 = 28
            if (r2 == 0) goto L_0x0882
            goto L_0x0854
        L_0x07da:
            X.58p r2 = X.C998958p.ERROR_PROVIDER_TIMEOUT
            if (r4 != r2) goto L_0x08bc
            X.C626936e.A06(r0)
            java.lang.String r5 = "sms"
            boolean r4 = X.AnonymousClass4L0.A0S(r1)
            java.lang.String r1 = "VerifyPhoneNumber/onRequestGenericCodeErrorProviderTimeout"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            X.33p r2 = r12.A09
            java.lang.String r1 = "server-send-request-provider-timeout"
            X.AnonymousClass36l.A0O(r2, r1)
            if (r4 == 0) goto L_0x0806
            r3 = 2131892990(0x7f121afe, float:1.9420744E38)
        L_0x07f8:
            java.lang.String r1 = r0.A0L
            boolean r1 = X.AnonymousClass5VK.A01(r1)
            if (r1 != 0) goto L_0x0889
            java.lang.String r0 = r12.getString(r3)
            goto L_0x0721
        L_0x0806:
            r3 = 2131892939(0x7f121acb, float:1.942064E38)
            if (r7 == 0) goto L_0x07f8
            r3 = 2131893136(0x7f121b90, float:1.942104E38)
            goto L_0x07f8
        L_0x080f:
            long r1 = X.AnonymousClass4SG.A2M(r0)     // Catch:{ NumberFormatException -> 0x087c }
            r12.A0D = r1     // Catch:{ NumberFormatException -> 0x087c }
            X.317 r0 = r12.A0w     // Catch:{ NumberFormatException -> 0x087c }
            r0.A0C(r1)     // Catch:{ NumberFormatException -> 0x087c }
            r0 = 1
            r12.A1R = r0     // Catch:{ NumberFormatException -> 0x087c }
            X.5Te r1 = r12.A0s     // Catch:{ NumberFormatException -> 0x087c }
            r0 = 31
            r1.A01(r0)     // Catch:{ NumberFormatException -> 0x087c }
            goto L_0x0675
        L_0x0826:
            long r3 = X.AnonymousClass4SG.A2M(r0)     // Catch:{ NumberFormatException -> 0x0847 }
            X.317 r0 = r12.A0w     // Catch:{ NumberFormatException -> 0x0847 }
            r0.A0C(r3)     // Catch:{ NumberFormatException -> 0x0847 }
            X.5Te r5 = r12.A0s     // Catch:{ NumberFormatException -> 0x0847 }
            r2 = 2131892948(0x7f121ad4, float:1.9420659E38)
            java.lang.Object[] r1 = X.AnonymousClass002.A0L()     // Catch:{ NumberFormatException -> 0x0847 }
            X.33j r0 = r12.A00     // Catch:{ NumberFormatException -> 0x0847 }
            java.lang.String r0 = X.C107565bW.A0D(r0, r3)     // Catch:{ NumberFormatException -> 0x0847 }
            java.lang.String r0 = X.C86614Ku.A0s(r12, r0, r1, r2)     // Catch:{ NumberFormatException -> 0x0847 }
            r5.A03(r0)     // Catch:{ NumberFormatException -> 0x0847 }
            goto L_0x0675
        L_0x0847:
            r1 = move-exception
            java.lang.String r0 = "VerifyPhoneNumber/request/sms/too-recent/time-not-int"
            com.whatsapp.util.Log.w(r0, r1)
            X.5Te r1 = r12.A0s
            r0 = 2131892949(0x7f121ad5, float:1.942066E38)
            goto L_0x0672
        L_0x0854:
            long r2 = X.AnonymousClass4SG.A2M(r0)     // Catch:{ NumberFormatException -> 0x0878 }
            r12.A0D = r2     // Catch:{ NumberFormatException -> 0x0878 }
            X.317 r0 = r12.A0w     // Catch:{ NumberFormatException -> 0x0878 }
            r0.A0C(r2)     // Catch:{ NumberFormatException -> 0x0878 }
            r0 = 1
            r12.A1R = r0     // Catch:{ NumberFormatException -> 0x0878 }
            X.5Te r2 = r12.A0s     // Catch:{ NumberFormatException -> 0x0878 }
            boolean r0 = X.AnonymousClass4L0.A0S(r1)     // Catch:{ NumberFormatException -> 0x0878 }
            if (r0 == 0) goto L_0x086d
            r0 = 33
            goto L_0x0873
        L_0x086d:
            r0 = 32
            if (r7 == 0) goto L_0x0873
            r0 = 50
        L_0x0873:
            r2.A01(r0)     // Catch:{ NumberFormatException -> 0x0878 }
            goto L_0x0675
        L_0x0878:
            r1 = move-exception
            java.lang.String r0 = "VerifyPhoneNumber/request/sms/too-many-guesses/time-not-int"
            goto L_0x087f
        L_0x087c:
            r1 = move-exception
            java.lang.String r0 = "VerifyPhoneNumber/request/sms/triedtoomanytimesallmethods/time-not-int"
        L_0x087f:
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0882:
            X.5Te r0 = r12.A0s
            r0.A01(r4)
            goto L_0x0675
        L_0x0889:
            long r1 = X.AnonymousClass4SG.A2M(r0)     // Catch:{ NumberFormatException -> 0x08ad }
            X.317 r0 = r12.A0w     // Catch:{ NumberFormatException -> 0x08ad }
            r0.A0C(r1)     // Catch:{ NumberFormatException -> 0x08ad }
            if (r4 == 0) goto L_0x0898
            r0 = 2131892989(0x7f121afd, float:1.9420742E38)
            goto L_0x08a0
        L_0x0898:
            r0 = 2131892938(0x7f121aca, float:1.9420638E38)
            if (r7 == 0) goto L_0x08a0
            r0 = 2131893137(0x7f121b91, float:1.9421042E38)
        L_0x08a0:
            X.AnonymousClass4SG.A3s(r12, r0, r1)     // Catch:{ NumberFormatException -> 0x08ad }
            X.5UQ r0 = r12.A10     // Catch:{ NumberFormatException -> 0x08ad }
            X.AnonymousClass4SG.A3u(r0, r5, r1)     // Catch:{ NumberFormatException -> 0x08ad }
            r12.A7d(r1, r5)     // Catch:{ NumberFormatException -> 0x08ad }
            goto L_0x0675
        L_0x08ad:
            r1 = move-exception
            java.lang.String r0 = "VerifyPhoneNumber/request/sms/too-recent/time-not-int"
            com.whatsapp.util.Log.w(r0, r1)
            java.lang.String r0 = r12.getString(r3)
            r12.A82(r0)
            goto L_0x0675
        L_0x08bc:
            X.58p r2 = X.C998958p.ERROR_PROVIDER_UNROUTABLE
            if (r4 != r2) goto L_0x08de
            boolean r2 = r12.A8C()
            X.C626936e.A06(r0)
            java.lang.String r5 = "server-send-request-provider-unroutable"
            r6 = 2131892941(0x7f121acd, float:1.9420644E38)
            r7 = 2131892940(0x7f121acc, float:1.9420642E38)
            if (r2 == 0) goto L_0x08d7
            r6 = 2131893138(0x7f121b92, float:1.9421044E38)
            r7 = 2131893139(0x7f121b93, float:1.9421046E38)
        L_0x08d7:
            r2 = r12
            r3 = r0
            r4 = r1
            r2.A7p(r3, r4, r5, r6, r7)
            return
        L_0x08de:
            X.58p r2 = X.C998958p.ERROR_NO_ROUTES
            if (r4 != r2) goto L_0x0902
            boolean r2 = r12.A8C()
            X.C626936e.A06(r0)
            java.lang.String r5 = "server-send-request-no-routes"
            r7 = 2131892941(0x7f121acd, float:1.9420644E38)
            r8 = 2131892940(0x7f121acc, float:1.9420642E38)
            if (r2 == 0) goto L_0x08f9
            r7 = 2131893138(0x7f121b92, float:1.9421044E38)
            r8 = 2131893139(0x7f121b93, float:1.9421046E38)
        L_0x08f9:
            java.lang.String r6 = "noRouteSms"
            r2 = r12
            r3 = r0
            r4 = r1
            r2.A7q(r3, r4, r5, r6, r7, r8)
            return
        L_0x0902:
            X.58p r3 = X.C998958p.ERROR_BAD_TOKEN
            if (r4 == r3) goto L_0x0ad5
            X.58p r2 = X.C998958p.ERROR_INVALID_SKEY_SIGNATURE
            if (r4 == r2) goto L_0x0ad5
            X.58p r2 = X.C998958p.SECURITY_CODE
            if (r4 != r2) goto L_0x0915
            X.C626936e.A06(r0)
            r12.A7l(r0, r1)
            return
        L_0x0915:
            X.58p r5 = X.C998958p.ERROR_DEVICE_CONFIRM_OR_SECOND_OTP
            if (r4 == r5) goto L_0x0aba
            X.58p r2 = X.C998958p.ERROR_SECOND_OTP
            if (r4 == r2) goto L_0x0aba
            X.58p r2 = X.C998958p.ERROR_NOT_ALLOWED
            if (r4 != r2) goto L_0x0925
            r12.A81(r1)
            return
        L_0x0925:
            X.58p r1 = X.C998958p.ERROR_CODE_CHECKPOINT
            if (r4 == r1) goto L_0x0961
            X.58p r1 = X.C998958p.ERROR_PROFILE_CHECKPONT
            if (r4 != r1) goto L_0x0a11
            java.lang.String r0 = "VerifyPhoneNumber/transitionToRegisterPhone(ERROR_PROFILE_CHECKPOINT)"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.317 r0 = r12.A0w
            r1 = 1
            r0.A0B(r1, r1)
            android.content.Intent r0 = X.C627736r.A04(r12)
        L_0x093c:
            r12.A6T(r0, r1)
            return
        L_0x0940:
            java.lang.String r14 = "autoconf"
            boolean r1 = r1.equals(r14)
            if (r1 == 0) goto L_0x000f
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "VerifyPhoneNumber/onRequestAutoConfCodeResponse/status="
            X.C18260x0.A1R(r2, r1, r4)
            java.lang.String r2 = "VerifyPhoneNumber/onRequestAutoConfCodeResponse/fraud eligible"
            if (r22 != 0) goto L_0x0970
            java.lang.String r0 = "VerifyPhoneNumber/onRequestAutoConfCodeResponse/result is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x095a:
            boolean r0 = r12.A1I
            if (r0 == 0) goto L_0x09da
            com.whatsapp.util.Log.i((java.lang.String) r2)
        L_0x0961:
            X.317 r2 = r12.A0w
            r0 = 16
            r1 = 1
            r2.A0B(r0, r1)
            boolean r0 = r12.A1G
            android.content.Intent r0 = X.C627736r.A1C(r12, r0)
            goto L_0x093c
        L_0x0970:
            X.58p r1 = X.C998958p.YES
            if (r4 != r1) goto L_0x0996
            java.lang.String r1 = "VerifyPhoneNumber/onAutoconfCodeSent/attempt to verify authResponse"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.lang.String r15 = r12.A1B
            java.lang.String r2 = r12.A1E
            X.C626936e.A06(r2)
            r19 = 2
            X.5rC r1 = r12.A0O
            X.AnonymousClass5VK.A00(r1)
            X.4z4 r13 = r12.A12
            java.lang.String r0 = r0.A0B
            r17 = r14
            r18 = r0
            r16 = r2
            r12.A7t(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x060c
        L_0x0996:
            X.58p r1 = X.C998958p.ERROR_FAIL_TO_INITIALIZE_WAMSYS
            r0 = 0
            if (r4 == r1) goto L_0x09b6
            r12.A7W(r0)
            X.33p r1 = r12.A09
            java.lang.String r0 = r4.name()
            X.AnonymousClass36l.A0O(r1, r0)
            goto L_0x095a
        L_0x09a8:
            X.58p r0 = X.C998958p.ERROR_FAIL_TO_INITIALIZE_WAMSYS
            if (r4 != r0) goto L_0x09d5
            java.lang.String r0 = "VerifyPhoneNumber/onRequestSilentAuthCodeResponse"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.33p r0 = r12.A09
            r0.A1X(r2)
        L_0x09b6:
            r12.BFh()
            goto L_0x064c
        L_0x09bb:
            java.lang.String r2 = "silent_auth"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x000f
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "VerifyPhoneNumber/onRequestSilentAuthCodeResponse/status="
            X.C18260x0.A1R(r2, r1, r4)
            java.lang.String r2 = "silent_auth_request_code_failed"
            if (r22 != 0) goto L_0x09e0
            java.lang.String r0 = "VerifyPhoneNumber/onRequestSilentAuthCodeResponse/result is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x09d5:
            X.33p r0 = r12.A09
        L_0x09d7:
            r0.A1X(r2)
        L_0x09da:
            int r0 = r12.A04
            r12.A7U(r0)
            return
        L_0x09e0:
            X.58p r1 = X.C998958p.YES
            if (r4 != r1) goto L_0x09a8
            java.lang.String r4 = r0.A0O
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x09f2
            java.lang.String r0 = "VerifyPhoneNumber/onSilentAuthCodeSent/uri is null or empty"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x09d5
        L_0x09f2:
            X.1ip r0 = r12.A07
            r1 = 1
            int r0 = r0.A08(r1)
            if (r0 != r1) goto L_0x0a0a
            X.2oU r3 = r12.A0f
            X.1VW r2 = r12.A0j
            X.33p r1 = r12.A09
            X.5oh r0 = new X.5oh
            r0.<init>(r12, r4)
            X.AnonymousClass36l.A0N(r3, r1, r2, r0)
            return
        L_0x0a0a:
            if (r0 != 0) goto L_0x0ab1
            X.33p r0 = r12.A09
            java.lang.String r2 = "silent_auth_no_internet"
            goto L_0x09d7
        L_0x0a11:
            X.58p r1 = X.C998958p.ERROR_SEND_SMS_TO_WA
            if (r4 == r1) goto L_0x0a19
            X.58p r1 = X.C998958p.ERROR_WAITING_FOR_SMS
            if (r4 != r1) goto L_0x000f
        L_0x0a19:
            if (r22 == 0) goto L_0x0aab
            java.lang.String r1 = r0.A0M
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0aab
            java.lang.String r4 = r0.A0M
            java.lang.String r0 = "VerifyPhoneNumber/transitionToSendSmsToWa"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r3 = r12.A1G
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r12.getPackageName()
            java.lang.String r0 = "com.whatsapp.registration.SendSmsToWa"
            android.content.Intent r1 = r2.setClassName(r1, r0)
            java.lang.String r0 = "sendSmsNumber"
            r1.putExtra(r0, r4)
            java.lang.String r0 = "changeNumber"
            r1.putExtra(r0, r3)
            r0 = 1
            r12.A6T(r1, r0)
            return
        L_0x0a49:
            long r0 = X.AnonymousClass4SG.A2M(r0)     // Catch:{ NumberFormatException -> 0x0a8c }
            r12.A0D = r0     // Catch:{ NumberFormatException -> 0x0a8c }
            X.317 r2 = r12.A0w     // Catch:{ NumberFormatException -> 0x0a8c }
            r2.A0C(r0)     // Catch:{ NumberFormatException -> 0x0a8c }
            r7 = 0
            r0 = 1
            if (r3 == 0) goto L_0x0a72
            X.5Te r5 = r12.A0s     // Catch:{ NumberFormatException -> 0x0a8c }
            r4 = 2131892988(0x7f121afc, float:1.942074E38)
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ NumberFormatException -> 0x0a8c }
            X.33j r2 = r12.A00     // Catch:{ NumberFormatException -> 0x0a8c }
            long r0 = r12.A0D     // Catch:{ NumberFormatException -> 0x0a8c }
            java.lang.String r0 = X.C107565bW.A0D(r2, r0)     // Catch:{ NumberFormatException -> 0x0a8c }
            java.lang.String r0 = X.AnonymousClass002.A0F(r12, r0, r3, r7, r4)     // Catch:{ NumberFormatException -> 0x0a8c }
            r5.A03(r0)     // Catch:{ NumberFormatException -> 0x0a8c }
            X.AnonymousClass4SG.A3t(r12, r8)     // Catch:{ NumberFormatException -> 0x0a8c }
            return
        L_0x0a72:
            X.5Te r5 = r12.A0s     // Catch:{ NumberFormatException -> 0x0a8c }
            r4 = 2131893909(0x7f121e95, float:1.9422608E38)
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ NumberFormatException -> 0x0a8c }
            X.33j r2 = r12.A00     // Catch:{ NumberFormatException -> 0x0a8c }
            long r0 = r12.A0D     // Catch:{ NumberFormatException -> 0x0a8c }
            java.lang.String r0 = X.C107565bW.A0D(r2, r0)     // Catch:{ NumberFormatException -> 0x0a8c }
            java.lang.String r0 = X.AnonymousClass002.A0F(r12, r0, r3, r7, r4)     // Catch:{ NumberFormatException -> 0x0a8c }
            r5.A03(r0)     // Catch:{ NumberFormatException -> 0x0a8c }
            X.AnonymousClass4SG.A3t(r12, r9)     // Catch:{ NumberFormatException -> 0x0a8c }
            return
        L_0x0a8c:
            r1 = move-exception
            java.lang.String r0 = "VerifyPhoneNumber/request/sms/triedtoomanytimesallmethods/time-not-int"
            com.whatsapp.util.Log.w(r0, r1)
            X.5Te r0 = r12.A0s
            r0.A01(r6)
            r12.A7M()
            return
        L_0x0a9b:
            X.5XU r1 = r12.A0T
            r0 = 1
            r1.A01 = r0
            r0 = 8
            r12.A7Z(r0)
            r0 = 22
            r12.A7V(r0)
            return
        L_0x0aab:
            java.lang.String r0 = "VerifyPhoneNumber/send sms number is empty"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0ab1:
            r2 = 0
            X.4FS r1 = r12.A04
            r0 = 13
            X.C71403c3.A00(r1, r12, r2, r4, r0)
            return
        L_0x0aba:
            X.C626936e.A06(r0)
            java.lang.String r3 = r0.A0N
            r1 = 0
            long r13 = X.AnonymousClass36l.A01(r3, r1)
            java.lang.String r0 = r0.A0P
            long r17 = X.AnonymousClass36l.A01(r0, r1)
            java.lang.String r15 = "sms"
            boolean r16 = X.AnonymousClass000.A1Y(r4, r5)
            r12.A7f(r13, r15, r16, r17)
            return
        L_0x0ad5:
            java.lang.String r2 = "server-send-request-bad-token"
            java.lang.StringBuilder r1 = X.AnonymousClass4SG.A2y(r1)
            if (r4 != r3) goto L_0x0aed
            java.lang.String r0 = "/bad-token"
        L_0x0adf:
            X.C18260x0.A1K(r1, r0)
            X.33p r0 = r12.A09
            X.AnonymousClass36l.A0O(r0, r2)
            r0 = 41
            r12.A7X(r0)
            return
        L_0x0aed:
            java.lang.String r0 = "/invalid-skey"
            goto L_0x0adf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.VerifyPhoneNumber.BPK(X.58p, X.5do, java.lang.String):void");
    }

    public VerifyPhoneNumber() {
        this(0);
        this.A00 = 0;
        this.A05 = -2;
        this.A1N = false;
        this.A0D = 0;
        this.A0C = -1;
        this.A1Z = AnonymousClass001.A0t();
        this.A1a = AnonymousClass001.A0t();
        this.A1X = C162167rN.A00();
        this.A1Y = new AnonymousClass91E(this, 0);
    }
}
