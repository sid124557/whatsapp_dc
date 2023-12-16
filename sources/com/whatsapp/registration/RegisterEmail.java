package com.whatsapp.registration;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass1VW;
import X.AnonymousClass36l;
import X.AnonymousClass4SG;
import X.AnonymousClass5TX;
import X.AnonymousClass5UY;
import X.AnonymousClass5V0;
import X.AnonymousClass68W;
import X.AnonymousClass6C1;
import X.C107405bG;
import X.C107695bk;
import X.C1235268t;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C19340zH;
import X.C48072eI;
import X.C50152hi;
import X.C55092pm;
import X.C614930z;
import X.C64333Db;
import X.C69253Wh;
import X.C86614Ku;
import X.C86624Kv;
import X.C88834as;
import X.C89644eZ;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;

public final class RegisterEmail extends C89644eZ {
    public int A00;
    public WaEditText A01;
    public C614930z A02;
    public C48072eI A03;
    public AnonymousClass5TX A04;
    public AnonymousClass1VW A05;
    public C50152hi A06;
    public C55092pm A07;
    public C69253Wh A08;
    public AnonymousClass5UY A09;
    public WDSButton A0A;
    public WDSButton A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public boolean A0F;
    public boolean A0G;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C107405bG.A05(this);
        setContentView((int) R.layout.f8nameremoved);
        this.A0A = C86614Ku.A0p(this.A00, R.id.register_email_submit);
        this.A01 = (WaEditText) C18280x3.A0E(this.A00, R.id.register_email_text_input);
        this.A0B = C86614Ku.A0p(this.A00, R.id.register_email_skip);
        this.A09 = AnonymousClass0x2.A0M(this.A00, R.id.invalid_email_sub_text_view_stub);
        AnonymousClass1VW r0 = this.A05;
        if (r0 != null) {
            AnonymousClass36l.A0M(this, r0, R.id.register_email_title_toolbar_text);
            WDSButton wDSButton = this.A0A;
            if (wDSButton == null) {
                throw C18270x1.A0S("nextButton");
            }
            AnonymousClass0x2.A0y(wDSButton, this, 25);
            if (!AnonymousClass36l.A0P(getResources())) {
                WaEditText waEditText = this.A01;
                if (waEditText == null) {
                    throw C18270x1.A0S("emailInput");
                }
                waEditText.A07(false);
            }
            WaEditText waEditText2 = this.A01;
            if (waEditText2 == null) {
                throw C18270x1.A0S("emailInput");
            }
            waEditText2.addTextChangedListener(new AnonymousClass6C1(this, 1));
            WDSButton wDSButton2 = this.A0B;
            if (wDSButton2 == null) {
                throw C18270x1.A0S("notNowButton");
            }
            AnonymousClass0x2.A0y(wDSButton2, this, 24);
            C614930z r02 = this.A02;
            if (r02 != null) {
                boolean A0B2 = r02.A0B(false);
                this.A0G = A0B2;
                AnonymousClass36l.A0K(this.A00, this, this.A00, R.id.register_email_title_toolbar, false, false, A0B2);
                this.A00 = getIntent().getIntExtra("source", 0);
                this.A0E = getIntent().getStringExtra("session_id");
                A74().A01(this.A0E, this.A00, 4);
                String A0Z = this.A09.A0Z();
                C162457s7.A0D(A0Z);
                this.A0C = A0Z;
                String A0b = this.A09.A0b();
                C162457s7.A0D(A0b);
                this.A0D = A0b;
                return;
            }
            throw C18270x1.A0S("accountSwitcher");
        }
        throw C18270x1.A0S("abPreChatdProps");
    }

    public Dialog onCreateDialog(int i) {
        C19340zH r2;
        int i2;
        int i3;
        if (i != 1) {
            if (i == 2) {
                r2 = AnonymousClass5V0.A00(this);
                r2.A0T(R.string.f11nameremoved);
                i2 = R.string.f11nameremoved;
                i3 = 88;
            } else if (i != 3) {
                return super.onCreateDialog(i);
            } else {
                WaEditText waEditText = this.A01;
                if (waEditText == null) {
                    throw C18270x1.A0S("emailInput");
                }
                waEditText.setEnabled(false);
                WDSButton wDSButton = this.A0A;
                if (wDSButton == null) {
                    throw C18270x1.A0S("nextButton");
                }
                wDSButton.setEnabled(false);
                r2 = AnonymousClass5V0.A00(this);
                r2.A0U(R.string.f11nameremoved);
                r2.A0T(R.string.f11nameremoved);
                i2 = R.string.f11nameremoved;
                i3 = 87;
            }
            C1235268t.A03(r2, this, i3, i2);
        } else {
            r2 = AnonymousClass5V0.A00(this);
            r2.A0T(R.string.f11nameremoved);
            r2.A0i(false);
        }
        return r2.create();
    }

    public void A5r() {
        if (!this.A0F) {
            this.A0F = true;
            C88834as A2W = AnonymousClass4SG.A2W(this);
            C64333Db r2 = A2W.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r1, this, AnonymousClass4SG.A2t(r2, r1, this));
            this.A05 = C86624Kv.A0S(r2);
            this.A02 = C86614Ku.A0O(r2);
            this.A08 = (C69253Wh) r2.AJO.get();
            this.A06 = A2W.AD3();
            this.A07 = AnonymousClass4SG.A2o(r2);
            this.A03 = (C48072eI) r1.A3t.get();
            this.A04 = r2.AkQ();
        }
    }

    public final C48072eI A74() {
        C48072eI r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("emailVerificationLogger");
    }

    public void onBackPressed() {
        if (this.A0G) {
            Log.i("RegisterEmail/onBackPressed/is adding new account");
            AnonymousClass36l.A0E(this, this.A09, this.A0A);
        }
    }

    public RegisterEmail(int i) {
        this.A0F = false;
        AnonymousClass68W.A00(this, 83);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        AnonymousClass4SG.A39(menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int A042 = C18290x4.A04(menuItem);
        if (A042 == 1) {
            C50152hi r3 = this.A06;
            if (r3 != null) {
                C55092pm r2 = this.A07;
                if (r2 != null) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("register-email +");
                    String str = this.A0C;
                    if (str == null) {
                        throw C18270x1.A0S("countryCode");
                    }
                    A0o.append(str);
                    String str2 = this.A0D;
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

    public RegisterEmail() {
        this(0);
    }
}
