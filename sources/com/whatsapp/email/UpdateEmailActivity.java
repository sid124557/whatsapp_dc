package com.whatsapp.email;

import X.AnonymousClass0R8;
import X.AnonymousClass0x2;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass36l;
import X.AnonymousClass3DZ;
import X.AnonymousClass3M5;
import X.AnonymousClass4HY;
import X.AnonymousClass5TX;
import X.AnonymousClass5UY;
import X.AnonymousClass5V0;
import X.C107695bk;
import X.C111095hX;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18320x8;
import X.C19340zH;
import X.C48072eI;
import X.C621433s;
import X.C627736r;
import X.C633839a;
import X.C64333Db;
import X.C69253Wh;
import X.C85984Ij;
import X.C86384Jx;
import X.C89644eZ;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;

public final class UpdateEmailActivity extends C89644eZ {
    public int A00;
    public int A01;
    public View A02;
    public WaEditText A03;
    public WaTextView A04;
    public C48072eI A05;
    public AnonymousClass5TX A06;
    public C69253Wh A07;
    public AnonymousClass5UY A08;
    public AnonymousClass5UY A09;
    public AnonymousClass5UY A0A;
    public WDSButton A0B;
    public String A0C;
    public boolean A0D;

    public Dialog onCreateDialog(int i) {
        C19340zH r2;
        int i2;
        int i3;
        if (i == 1) {
            r2 = AnonymousClass5V0.A00(this);
            r2.A0T(R.string.f11nameremoved);
            r2.A0i(false);
        } else if (i != 2) {
            if (i == 3) {
                r2 = AnonymousClass5V0.A00(this);
                r2.A0T(R.string.f11nameremoved);
                i2 = R.string.f11nameremoved;
                i3 = 62;
            } else if (i != 4) {
                return super.onCreateDialog(i);
            } else {
                A74();
                r2 = AnonymousClass5V0.A00(this);
                r2.A0U(R.string.f11nameremoved);
                r2.A0T(R.string.f11nameremoved);
                i2 = R.string.f11nameremoved;
                i3 = 61;
            }
            C19340zH.A08(r2, this, i3, i2);
        } else {
            r2 = AnonymousClass5V0.A00(this);
            r2.A0U(R.string.f11nameremoved);
            r2.A0T(R.string.f11nameremoved);
            C19340zH.A08(r2, this, 59, R.string.f11nameremoved);
            C19340zH.A07(r2, this, 60, R.string.f11nameremoved);
        }
        return r2.create();
    }

    public static final /* synthetic */ void A0C(UpdateEmailActivity updateEmailActivity) {
        AnonymousClass5UY r1 = updateEmailActivity.A0A;
        if (r1 == null) {
            throw C18270x1.A0S("updateEmailShimmerViewStub");
        }
        r1.A06(8);
        View view = updateEmailActivity.A02;
        if (view == null) {
            throw C18270x1.A0S("updateEmailLayout");
        }
        view.setVisibility(0);
        updateEmailActivity.A75();
    }

    public void A5r() {
        if (!this.A0D) {
            this.A0D = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r1 = A002.A00;
            AnonymousClass1Ha.A23(A002, r1, r1, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A07 = (C69253Wh) A002.AJO.get();
            this.A05 = (C48072eI) r1.A3t.get();
            this.A06 = A002.AkQ();
        }
    }

    public final void A74() {
        WaEditText waEditText = this.A03;
        if (waEditText == null) {
            throw C18270x1.A0S("emailInput");
        }
        waEditText.setEnabled(false);
        WDSButton wDSButton = this.A0B;
        if (wDSButton == null) {
            throw C18270x1.A0S("nextButton");
        }
        wDSButton.setEnabled(false);
    }

    public final void A75() {
        String A0Z;
        if (!(this.A01 == 0 || (A0Z = C18280x3.A0Z(AnonymousClass0x2.A0F(this.A09), "settings_verification_email_address")) == null || A0Z.length() == 0)) {
            WaEditText waEditText = this.A03;
            if (waEditText == null) {
                throw C18270x1.A0S("emailInput");
            }
            waEditText.setText(C18280x3.A0Z(AnonymousClass0x2.A0F(this.A09), "settings_verification_email_address"));
            WDSButton wDSButton = this.A0B;
            if (wDSButton == null) {
                throw C18270x1.A0S("nextButton");
            }
            wDSButton.setEnabled(true);
        }
        if (!AnonymousClass36l.A0P(getResources())) {
            WaEditText waEditText2 = this.A03;
            if (waEditText2 == null) {
                throw C18270x1.A0S("emailInput");
            }
            waEditText2.A06();
        }
        WaEditText waEditText3 = this.A03;
        if (waEditText3 == null) {
            throw C18270x1.A0S("emailInput");
        }
        waEditText3.addTextChangedListener(new C86384Jx(this, 0));
    }

    public final void A76() {
        AnonymousClass5UY r0 = this.A09;
        if (r0 == null) {
            throw C18270x1.A0S("invalidEmailViewStub");
        }
        View A042 = r0.A04();
        C162457s7.A0D(A042);
        ((TextView) A042).setText(R.string.f11nameremoved);
        AnonymousClass5UY r1 = this.A09;
        if (r1 == null) {
            throw C18270x1.A0S("invalidEmailViewStub");
        }
        r1.A06(0);
    }

    public void onBackPressed() {
        Intent addFlags;
        C48072eI r4 = this.A05;
        if (r4 != null) {
            r4.A00(this.A00, this.A01, this.A0C, 0);
            int i = this.A01;
            C111095hX r3 = this.A00;
            if (i == 1) {
                addFlags = C627736r.A0v(this, this.A0C, this.A00);
            } else {
                Intent A072 = C18320x8.A07();
                A072.setClassName(getPackageName(), "com.whatsapp.settings.SettingsAccount");
                A072.putExtra("is_companion", false);
                addFlags = A072.addFlags(67108864);
            }
            r3.A0A(this, addFlags);
            finish();
            return;
        }
        throw C18270x1.A0S("emailVerificationLogger");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.A01 == 1 && menu != null) {
            menu.add(0, 1, 0, R.string.f11nameremoved);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public UpdateEmailActivity(int i) {
        this.A0D = false;
        AnonymousClass4HY.A00(this, 58);
    }

    public final void A77(String str) {
        if (str.length() > 0) {
            if (!C18280x3.A1X(str, Patterns.EMAIL_ADDRESS)) {
                Log.i("UpdateEmailActivity/executeSetEmailRequest/invalid email");
                A76();
                C48072eI r4 = this.A05;
                if (r4 != null) {
                    r4.A00(this.A00, this.A01, this.A0C, 2);
                    return;
                }
                throw C18270x1.A0S("emailVerificationLogger");
            } else if (str.equals(C18280x3.A0Z(AnonymousClass0x2.A0F(this.A09), "settings_verification_email_address"))) {
                Log.i("UpdateEmailActivity/executeSetEmailRequest/same email");
                AnonymousClass5UY r0 = this.A09;
                if (r0 == null) {
                    throw C18270x1.A0S("invalidEmailViewStub");
                }
                View A042 = r0.A04();
                C162457s7.A0D(A042);
                ((TextView) A042).setText(R.string.f11nameremoved);
                AnonymousClass5UY r1 = this.A09;
                if (r1 == null) {
                    throw C18270x1.A0S("invalidEmailViewStub");
                }
                r1.A06(0);
                return;
            }
        }
        C621433s.A01(this, 1);
        AnonymousClass5TX r12 = this.A06;
        if (r12 != null) {
            r12.A03(new AnonymousClass3M5(this, str), str);
            return;
        }
        throw C18270x1.A0S("emailVerificationXmppMethods");
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass0R8 A1l = AnonymousClass1Ha.A1l(this, R.string.f11nameremoved);
        if (A1l != null) {
            A1l.A0N(true);
        }
        this.A04 = (WaTextView) C18280x3.A0E(this.A00, R.id.update_email_title);
        this.A0B = (WDSButton) C18280x3.A0E(this.A00, R.id.update_email_submit);
        this.A03 = (WaEditText) C18280x3.A0E(this.A00, R.id.update_email_text_input);
        this.A02 = C18280x3.A0E(this.A00, R.id.update_email_layout);
        this.A08 = AnonymousClass0x2.A0M(this.A00, R.id.update_email_description_view_stub);
        this.A09 = AnonymousClass0x2.A0M(this.A00, R.id.invalid_email_sub_text_view_stub);
        this.A0A = AnonymousClass0x2.A0M(this.A00, R.id.update_email_shimmer_view_stub);
        this.A01 = getIntent().getIntExtra("state", 0);
        this.A00 = getIntent().getIntExtra("source", 0);
        this.A0C = getIntent().getStringExtra("session_id");
        if (this.A01 != 1) {
            AnonymousClass5UY r0 = this.A08;
            if (r0 == null) {
                throw C18270x1.A0S("descriptionViewStub");
            }
            r0.A06(0);
            AnonymousClass5UY r02 = this.A08;
            if (r02 == null) {
                throw C18270x1.A0S("descriptionViewStub");
            }
            View A042 = r02.A04();
            C162457s7.A0D(A042);
            ((TextView) A042).setText(R.string.f11nameremoved);
        }
        C48072eI r3 = this.A05;
        if (r3 != null) {
            r3.A00(this.A00, this.A01, this.A0C, 1);
            int i2 = this.A01;
            WaTextView waTextView = this.A04;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (waTextView == null) {
                        throw C18270x1.A0S("title");
                    }
                    i = R.string.f11nameremoved;
                } else if (waTextView == null) {
                    throw C18270x1.A0S("title");
                } else {
                    i = R.string.f11nameremoved;
                }
            } else if (waTextView == null) {
                throw C18270x1.A0S("title");
            } else {
                i = R.string.f11nameremoved;
            }
            waTextView.setText(i);
            A75();
            WDSButton wDSButton = this.A0B;
            if (wDSButton == null) {
                throw C18270x1.A0S("nextButton");
            }
            C633839a.A00(wDSButton, this, 7);
            if (this.A01 == 0) {
                AnonymousClass5UY r2 = this.A0A;
                if (r2 == null) {
                    throw C18270x1.A0S("updateEmailShimmerViewStub");
                }
                r2.A06(0);
                AnonymousClass5UY r03 = this.A0A;
                if (r03 == null) {
                    throw C18270x1.A0S("updateEmailShimmerViewStub");
                }
                ((ShimmerFrameLayout) r03.A04()).A02();
                View view = this.A02;
                if (view == null) {
                    throw C18270x1.A0S("updateEmailLayout");
                }
                view.setVisibility(8);
                AnonymousClass5TX r22 = this.A06;
                if (r22 != null) {
                    r22.A02(new C85984Ij(this, 0));
                    return;
                }
                throw C18270x1.A0S("emailVerificationXmppMethods");
            }
            return;
        }
        throw C18270x1.A0S("emailVerificationLogger");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int A042 = C18290x4.A04(menuItem);
        if (A042 == 1) {
            C48072eI r3 = this.A05;
            if (r3 != null) {
                r3.A01(this.A0C, this.A00, 10);
                C621433s.A01(this, 2);
                return true;
            }
            throw C18270x1.A0S("emailVerificationLogger");
        } else if (A042 != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            onBackPressed();
            return true;
        }
    }

    public UpdateEmailActivity() {
        this(0);
    }
}
