package com.whatsapp.email;

import X.AnonymousClass002;
import X.AnonymousClass0R8;
import X.AnonymousClass0x2;
import X.AnonymousClass36l;
import X.AnonymousClass4SG;
import X.AnonymousClass5TX;
import X.AnonymousClass68W;
import X.AnonymousClass6AO;
import X.C107565bW;
import X.C107695bk;
import X.C124316Bu;
import X.C124326Bv;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C18320x8;
import X.C48072eI;
import X.C57002su;
import X.C620733j;
import X.C621433s;
import X.C627736r;
import X.C633839a;
import X.C64333Db;
import X.C69253Wh;
import X.C69983Zk;
import X.C86604Kt;
import X.C86614Ku;
import X.C89644eZ;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ProgressBar;
import com.whatsapp.CodeInputField;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.concurrent.TimeUnit;

public final class VerifyEmailActivity extends C89644eZ {
    public int A00;
    public long A01;
    public ProgressBar A02;
    public CodeInputField A03;
    public TextEmojiLabel A04;
    public WaTextView A05;
    public WaTextView A06;
    public C48072eI A07;
    public AnonymousClass5TX A08;
    public C69253Wh A09;
    public WDSButton A0A;
    public String A0B;
    public boolean A0C;

    public final void A76() {
        C621433s.A01(this, 3);
        AnonymousClass5TX r3 = this.A08;
        if (r3 != null) {
            C620733j r2 = this.A00;
            C162457s7.A0C(r2);
            r3.A01(r2, new C124316Bu(this, 0));
            return;
        }
        throw C18270x1.A0S("emailVerificationXmppMethods");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0060, code lost:
        r2.A0T(r0);
        r2.A0i(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b6, code lost:
        X.C1235268t.A03(r2, r4, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bd, code lost:
        return r2.create();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog onCreateDialog(int r5) {
        /*
            r4 = this;
            r3 = 0
            switch(r5) {
                case 1: goto L_0x0067;
                case 2: goto L_0x0059;
                case 3: goto L_0x0051;
                case 4: goto L_0x0041;
                case 5: goto L_0x0077;
                case 6: goto L_0x002b;
                case 7: goto L_0x001a;
                case 8: goto L_0x0009;
                default: goto L_0x0004;
            }
        L_0x0004:
            android.app.Dialog r0 = super.onCreateDialog(r5)
            return r0
        L_0x0009:
            X.0zH r2 = X.AnonymousClass5V0.A00(r4)
            r0 = 2131888839(0x7f120ac7, float:1.9412325E38)
            r2.A0T(r0)
            r1 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r0 = 62
            goto L_0x00b6
        L_0x001a:
            X.0zH r2 = X.AnonymousClass5V0.A00(r4)
            r0 = 2131888837(0x7f120ac5, float:1.941232E38)
            r2.A0T(r0)
            r1 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r0 = 61
            goto L_0x00b6
        L_0x002b:
            X.0zH r2 = X.AnonymousClass5V0.A00(r4)
            r0 = 2131888854(0x7f120ad6, float:1.9412355E38)
            r2.A0U(r0)
            r0 = 2131888853(0x7f120ad5, float:1.9412353E38)
            r2.A0T(r0)
            r1 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r0 = 60
            goto L_0x00b6
        L_0x0041:
            X.0zH r2 = X.AnonymousClass5V0.A00(r4)
            r0 = 2131888843(0x7f120acb, float:1.9412333E38)
            r2.A0T(r0)
            r1 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r0 = 63
            goto L_0x00b6
        L_0x0051:
            X.0zH r2 = X.AnonymousClass5V0.A00(r4)
            r0 = 2131888866(0x7f120ae2, float:1.941238E38)
            goto L_0x0060
        L_0x0059:
            X.0zH r2 = X.AnonymousClass5V0.A00(r4)
            r0 = 2131888869(0x7f120ae5, float:1.9412386E38)
        L_0x0060:
            r2.A0T(r0)
            r2.A0i(r3)
            goto L_0x00b9
        L_0x0067:
            X.0zH r2 = X.AnonymousClass5V0.A00(r4)
            r0 = 2131888834(0x7f120ac2, float:1.9412315E38)
            r2.A0T(r0)
            r1 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r0 = 58
            goto L_0x00b6
        L_0x0077:
            com.whatsapp.CodeInputField r2 = r4.A03
            java.lang.String r1 = "codeInputField"
            if (r2 != 0) goto L_0x0082
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r1)
            throw r0
        L_0x0082:
            java.lang.String r0 = ""
            r2.setCode(r0)
            com.whatsapp.CodeInputField r0 = r4.A03
            if (r0 != 0) goto L_0x0090
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r1)
            throw r0
        L_0x0090:
            r0.setEnabled(r3)
            com.whatsapp.wds.components.button.WDSButton r0 = r4.A0A
            if (r0 != 0) goto L_0x009e
            java.lang.String r0 = "verifyBtn"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x009e:
            r0.setEnabled(r3)
            X.0zH r2 = X.AnonymousClass5V0.A00(r4)
            r0 = 2131888845(0x7f120acd, float:1.9412337E38)
            r2.A0U(r0)
            r0 = 2131888844(0x7f120acc, float:1.9412335E38)
            r2.A0T(r0)
            r1 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r0 = 59
        L_0x00b6:
            X.C1235268t.A03(r2, r4, r0, r1)
        L_0x00b9:
            X.043 r0 = r2.create()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.email.VerifyEmailActivity.onCreateDialog(int):android.app.Dialog");
    }

    public static final /* synthetic */ void A0C(VerifyEmailActivity verifyEmailActivity, Integer num, Long l) {
        int i;
        int i2;
        int i3;
        if (num != null) {
            int intValue = num.intValue();
            i = 1;
            if (intValue != 536) {
                i = 5;
                if (intValue != 403) {
                    if (intValue == 535) {
                        i2 = R.string.f11nameremoved;
                        i3 = 6;
                    } else if (intValue == 537) {
                        i2 = R.string.f11nameremoved;
                        i3 = 7;
                    } else if (intValue == 534) {
                        i2 = R.string.f11nameremoved;
                        i3 = 8;
                    }
                    if (l != null) {
                        long longValue = l.longValue();
                        if (longValue > 0) {
                            verifyEmailActivity.Bou(C86614Ku.A0s(verifyEmailActivity, C107565bW.A0D(verifyEmailActivity.A00, TimeUnit.SECONDS.toMillis(longValue)), AnonymousClass002.A0L(), i2));
                            return;
                        }
                    }
                    C621433s.A01(verifyEmailActivity, i3);
                    return;
                }
            }
            C621433s.A01(verifyEmailActivity, i);
        }
        i = 4;
        C621433s.A01(verifyEmailActivity, i);
    }

    public static final /* synthetic */ void A0L(VerifyEmailActivity verifyEmailActivity, Long l) {
        if (l != null) {
            long longValue = l.longValue();
            if (longValue != 0) {
                WDSButton wDSButton = verifyEmailActivity.A0A;
                if (wDSButton == null) {
                    throw C18270x1.A0S("verifyBtn");
                }
                wDSButton.setEnabled(false);
                C69253Wh A75 = verifyEmailActivity.A75();
                A75.A00.postDelayed(new C69983Zk(verifyEmailActivity, 47), TimeUnit.SECONDS.toMillis(longValue));
            }
        }
    }

    public void A5r() {
        if (!this.A0C) {
            this.A0C = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
            this.A09 = (C69253Wh) A2Y.AJO.get();
            this.A07 = (C48072eI) r1.A3t.get();
            this.A08 = A2Y.AkQ();
        }
    }

    public final C48072eI A74() {
        C48072eI r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("emailVerificationLogger");
    }

    public final C69253Wh A75() {
        C69253Wh r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("mainThreadHandler");
    }

    public VerifyEmailActivity(int i) {
        this.A0C = false;
        AnonymousClass68W.A00(this, 55);
    }

    public final void A77(String str) {
        if (str.length() != 6) {
            Log.e("VerifyEmailActivity/executeVerifyEmailOtpRequest/invalid otp length");
            Bot(R.string.f11nameremoved);
        }
        C621433s.A01(this, 2);
        AnonymousClass5TX r2 = this.A08;
        if (r2 != null) {
            r2.A04(new C124326Bv(this, 0), str);
            return;
        }
        throw C18270x1.A0S("emailVerificationXmppMethods");
    }

    public void onBackPressed() {
        A74().A01(this.A0B, this.A00, 16);
        this.A00.A0A(this, C627736r.A0v(this, this.A0B, this.A00));
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        setTitle(R.string.f11nameremoved);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0N(true);
        }
        this.A06 = C86604Kt.A0O(this.A00, R.id.verify_email_title);
        this.A0A = C86614Ku.A0p(this.A00, R.id.email_code_submit);
        this.A02 = (ProgressBar) C18280x3.A0E(this.A00, R.id.progress_bar_code_input_blocked);
        this.A03 = (CodeInputField) C18280x3.A0E(this.A00, R.id.verify_email_code_input);
        this.A05 = C86604Kt.A0O(this.A00, R.id.resend_code_text);
        this.A04 = C86614Ku.A0M(this.A00, R.id.verify_email_description);
        WDSButton wDSButton = this.A0A;
        if (wDSButton == null) {
            throw C18270x1.A0S("verifyBtn");
        }
        C633839a.A00(wDSButton, this, 8);
        ProgressBar progressBar = this.A02;
        if (progressBar == null) {
            throw C18270x1.A0S("progressBar");
        }
        progressBar.setProgress(100);
        this.A00 = C18320x8.A01(getIntent(), "source");
        this.A0B = getIntent().getStringExtra("session_id");
        A74().A01(this.A0B, this.A00, 14);
        WaTextView waTextView = this.A06;
        if (waTextView == null) {
            throw C18270x1.A0S("title");
        }
        waTextView.setText(R.string.f11nameremoved);
        CodeInputField codeInputField = this.A03;
        if (codeInputField == null) {
            throw C18270x1.A0S("codeInputField");
        }
        codeInputField.A0A(new AnonymousClass6AO(this, 0), 6);
        CodeInputField codeInputField2 = this.A03;
        if (codeInputField2 == null) {
            throw C18270x1.A0S("codeInputField");
        }
        codeInputField2.setCode("");
        if (!AnonymousClass36l.A0P(getResources())) {
            CodeInputField codeInputField3 = this.A03;
            if (codeInputField3 == null) {
                throw C18270x1.A0S("codeInputField");
            }
            codeInputField3.A07(false);
        }
        WaTextView waTextView2 = this.A05;
        if (waTextView2 == null) {
            throw C18270x1.A0S("resendCodeText");
        }
        waTextView2.setClickable(true);
        WaTextView waTextView3 = this.A05;
        if (waTextView3 == null) {
            throw C18270x1.A0S("resendCodeText");
        }
        C633839a.A00(waTextView3, this, 9);
        String stringExtra = getIntent().getStringExtra("email");
        TextEmojiLabel textEmojiLabel = this.A04;
        if (textEmojiLabel == null) {
            throw C18270x1.A0S("verifyEmailDescription");
        }
        AnonymousClass0x2.A14(this.A0D, textEmojiLabel);
        TextEmojiLabel textEmojiLabel2 = this.A04;
        if (textEmojiLabel2 == null) {
            throw C18270x1.A0S("verifyEmailDescription");
        }
        textEmojiLabel2.setText(C57002su.A01(new C69983Zk(this, 46), C18300x5.A0e(this, stringExtra, AnonymousClass002.A0L(), 0, R.string.f11nameremoved), "edit-email"));
        String stringExtra2 = getIntent().getStringExtra("email_otp");
        if (stringExtra2 == null || stringExtra2.length() == 0) {
            A76();
            return;
        }
        Log.i("VerifyEmailActivity/onCreate/verify email deeplink");
        A77(stringExtra2);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C18290x4.A04(menuItem) != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public VerifyEmailActivity() {
        this(0);
    }
}
