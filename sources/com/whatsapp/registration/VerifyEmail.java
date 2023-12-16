package com.whatsapp.registration;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass1VW;
import X.AnonymousClass36l;
import X.AnonymousClass4SG;
import X.AnonymousClass5TX;
import X.AnonymousClass68W;
import X.AnonymousClass6AO;
import X.C107405bG;
import X.C107565bW;
import X.C107695bk;
import X.C124316Bu;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C48072eI;
import X.C50152hi;
import X.C55092pm;
import X.C57002su;
import X.C614930z;
import X.C620733j;
import X.C621433s;
import X.C64333Db;
import X.C69253Wh;
import X.C71543cH;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C88834as;
import X.C89644eZ;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ProgressBar;
import com.whatsapp.CodeInputField;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.concurrent.TimeUnit;

public final class VerifyEmail extends C89644eZ {
    public int A00;
    public long A01;
    public ProgressBar A02;
    public CodeInputField A03;
    public TextEmojiLabel A04;
    public WaTextView A05;
    public C614930z A06;
    public C48072eI A07;
    public AnonymousClass5TX A08;
    public AnonymousClass1VW A09;
    public C50152hi A0A;
    public C55092pm A0B;
    public C69253Wh A0C;
    public WDSButton A0D;
    public WDSButton A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public boolean A0I;
    public boolean A0J;

    public final void A76() {
        C621433s.A01(this, 3);
        AnonymousClass5TX r3 = this.A08;
        if (r3 != null) {
            C620733j r2 = this.A00;
            C162457s7.A0C(r2);
            r3.A01(r2, new C124316Bu(this, 1));
            return;
        }
        throw C18270x1.A0S("emailVerificationXmppMethods");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C107405bG.A05(this);
        setContentView((int) R.layout.f8nameremoved);
        this.A0D = C86614Ku.A0p(this.A00, R.id.verify_email_submit);
        this.A02 = (ProgressBar) C18280x3.A0E(this.A00, R.id.progress_bar_code_input_blocked);
        this.A0E = C86614Ku.A0p(this.A00, R.id.verify_email_skip);
        this.A03 = (CodeInputField) C18280x3.A0E(this.A00, R.id.verify_email_code_input);
        this.A05 = C86604Kt.A0O(this.A00, R.id.resend_code_text);
        this.A04 = C86614Ku.A0M(this.A00, R.id.verify_email_description);
        AnonymousClass1VW r0 = this.A09;
        if (r0 != null) {
            AnonymousClass36l.A0M(this, r0, R.id.verify_email_title_toolbar_text);
            WDSButton wDSButton = this.A0D;
            if (wDSButton == null) {
                throw C18270x1.A0S("nextButton");
            }
            AnonymousClass0x2.A0y(wDSButton, this, 44);
            ProgressBar progressBar = this.A02;
            if (progressBar == null) {
                throw C18270x1.A0S("progressBar");
            }
            progressBar.setProgress(100);
            WDSButton wDSButton2 = this.A0E;
            if (wDSButton2 == null) {
                throw C18270x1.A0S("notNowButton");
            }
            AnonymousClass0x2.A0y(wDSButton2, this, 46);
            CodeInputField codeInputField = this.A03;
            if (codeInputField == null) {
                throw C18270x1.A0S("codeInputField");
            }
            codeInputField.A0A(new AnonymousClass6AO(this, 2), 6);
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
            WaTextView waTextView = this.A05;
            if (waTextView == null) {
                throw C18270x1.A0S("resendCodeText");
            }
            waTextView.setClickable(true);
            WaTextView waTextView2 = this.A05;
            if (waTextView2 == null) {
                throw C18270x1.A0S("resendCodeText");
            }
            AnonymousClass0x2.A0y(waTextView2, this, 45);
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
            String A0m = C86604Kt.A0m(this, stringExtra, R.string.f11nameremoved);
            C162457s7.A0D(A0m);
            textEmojiLabel2.setText(C57002su.A01(new C71543cH((Object) this, 6), A0m, "edit-email"));
            C614930z r02 = this.A06;
            if (r02 != null) {
                boolean A0B2 = r02.A0B(false);
                this.A0J = A0B2;
                AnonymousClass36l.A0K(this.A00, this, this.A00, R.id.verify_email_title_toolbar, false, false, A0B2);
                this.A00 = getIntent().getIntExtra("source", 0);
                this.A0H = getIntent().getStringExtra("session_id");
                A74().A01(this.A0H, this.A00, 11);
                String A0Z = this.A09.A0Z();
                C162457s7.A0D(A0Z);
                this.A0F = A0Z;
                String A0b = this.A09.A0b();
                C162457s7.A0D(A0b);
                this.A0G = A0b;
                if (bundle == null) {
                    A76();
                    return;
                }
                return;
            }
            throw C18270x1.A0S("accountSwitcher");
        }
        throw C18270x1.A0S("abPreChatdProps");
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
            r0 = 111(0x6f, float:1.56E-43)
            goto L_0x00b6
        L_0x001a:
            X.0zH r2 = X.AnonymousClass5V0.A00(r4)
            r0 = 2131888837(0x7f120ac5, float:1.941232E38)
            r2.A0T(r0)
            r1 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r0 = 110(0x6e, float:1.54E-43)
            goto L_0x00b6
        L_0x002b:
            X.0zH r2 = X.AnonymousClass5V0.A00(r4)
            r0 = 2131888854(0x7f120ad6, float:1.9412355E38)
            r2.A0U(r0)
            r0 = 2131888853(0x7f120ad5, float:1.9412353E38)
            r2.A0T(r0)
            r1 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r0 = 109(0x6d, float:1.53E-43)
            goto L_0x00b6
        L_0x0041:
            X.0zH r2 = X.AnonymousClass5V0.A00(r4)
            r0 = 2131888843(0x7f120acb, float:1.9412333E38)
            r2.A0T(r0)
            r1 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r0 = 112(0x70, float:1.57E-43)
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
            r0 = 107(0x6b, float:1.5E-43)
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
            com.whatsapp.wds.components.button.WDSButton r0 = r4.A0D
            if (r0 != 0) goto L_0x009e
            java.lang.String r0 = "nextButton"
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
            r0 = 108(0x6c, float:1.51E-43)
        L_0x00b6:
            X.C1235268t.A03(r2, r4, r0, r1)
        L_0x00b9:
            X.043 r0 = r2.create()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.VerifyEmail.onCreateDialog(int):android.app.Dialog");
    }

    public static final /* synthetic */ void A0C(VerifyEmail verifyEmail, Integer num, Long l) {
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
                            verifyEmail.Bou(C86614Ku.A0s(verifyEmail, C107565bW.A0D(verifyEmail.A00, TimeUnit.SECONDS.toMillis(longValue)), AnonymousClass002.A0L(), i2));
                            return;
                        }
                    }
                    C621433s.A01(verifyEmail, i3);
                    return;
                }
            }
            C621433s.A01(verifyEmail, i);
        }
        i = 4;
        C621433s.A01(verifyEmail, i);
    }

    public static final /* synthetic */ void A0L(VerifyEmail verifyEmail, Long l) {
        if (l != null) {
            long longValue = l.longValue();
            if (longValue != 0) {
                WDSButton wDSButton = verifyEmail.A0D;
                if (wDSButton == null) {
                    throw C18270x1.A0S("nextButton");
                }
                wDSButton.setEnabled(false);
                C69253Wh A75 = verifyEmail.A75();
                A75.A00.postDelayed(new C71543cH((Object) verifyEmail, 9), TimeUnit.SECONDS.toMillis(longValue));
            }
        }
    }

    public void A5r() {
        if (!this.A0I) {
            this.A0I = true;
            C88834as A2W = AnonymousClass4SG.A2W(this);
            C64333Db r2 = A2W.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r1, this, AnonymousClass4SG.A2t(r2, r1, this));
            this.A09 = C86624Kv.A0S(r2);
            this.A06 = C86614Ku.A0O(r2);
            this.A0C = (C69253Wh) r2.AJO.get();
            this.A0A = A2W.AD3();
            this.A0B = AnonymousClass4SG.A2o(r2);
            this.A07 = (C48072eI) r1.A3t.get();
            this.A08 = r2.AkQ();
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
        C69253Wh r0 = this.A0C;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("mainThreadHandler");
    }

    public void onBackPressed() {
        if (this.A0J) {
            Log.i("VerifyEmail/onBackPressed/is adding new account");
            AnonymousClass36l.A0E(this, this.A09, this.A0A);
        }
    }

    public VerifyEmail(int i) {
        this.A0I = false;
        AnonymousClass68W.A00(this, 87);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        AnonymousClass4SG.A39(menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int A042 = C18290x4.A04(menuItem);
        if (A042 == 1) {
            C50152hi r3 = this.A0A;
            if (r3 != null) {
                C55092pm r2 = this.A0B;
                if (r2 != null) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("verify-email +");
                    String str = this.A0F;
                    if (str == null) {
                        throw C18270x1.A0S("countryCode");
                    }
                    A0o.append(str);
                    String str2 = this.A0G;
                    if (str2 == null) {
                        throw C18270x1.A0S("phoneNumber");
                    }
                    r3.A01(this, r2, AnonymousClass000.A0X(str2, A0o));
                } else {
                    throw C18270x1.A0S("verificationFlowState");
                }
            } else {
                throw C18270x1.A0S("registrationHelper");
            }
        } else if (A042 == 2) {
            AnonymousClass4SG.A35(this);
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public VerifyEmail() {
        this(0);
    }
}
