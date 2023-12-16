package com.whatsapp.email;

import X.AnonymousClass0x2;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.AnonymousClass5UY;
import X.C107695bk;
import X.C111095hX;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18320x8;
import X.C48072eI;
import X.C57002su;
import X.C633839a;
import X.C64333Db;
import X.C69983Zk;
import X.C89644eZ;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;

public final class EmailVerificationActivity extends C89644eZ {
    public int A00;
    public LinearLayout A01;
    public WaTextView A02;
    public WaTextView A03;
    public C48072eI A04;
    public String A05;
    public boolean A06;

    public void A5r() {
        if (!this.A06) {
            this.A06 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A04 = (C48072eI) r0.A3t.get();
        }
    }

    public void onBackPressed() {
        C48072eI r3 = this.A04;
        if (r3 != null) {
            r3.A01(this.A05, this.A00, 19);
            C111095hX r32 = this.A00;
            Intent A07 = C18320x8.A07();
            A07.setClassName(getPackageName(), "com.whatsapp.settings.SettingsAccount");
            A07.putExtra("is_companion", false);
            r32.A0A(this, A07.addFlags(67108864));
            finish();
            return;
        }
        throw C18270x1.A0S("emailVerificationLogger");
    }

    public EmailVerificationActivity(int i) {
        this.A06 = false;
        AnonymousClass4HY.A00(this, 57);
    }

    public void onCreate(Bundle bundle) {
        AnonymousClass5UY A0M;
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        setTitle(R.string.f11nameremoved);
        AnonymousClass1Hf.A2E(this);
        this.A02 = (WaTextView) C18280x3.A0E(this.A00, R.id.email_verification_description);
        this.A01 = (LinearLayout) C18280x3.A0E(this.A00, R.id.email_row_layout);
        this.A03 = (WaTextView) C18280x3.A0E(this.A00, R.id.email_row);
        View A0E = C18280x3.A0E(this.A00, R.id.email_row_icon);
        float f = 0.0f;
        if (this.A00.A05().A06) {
            f = 180.0f;
        }
        A0E.setRotation(f);
        this.A00 = C18320x8.A01(getIntent(), "source");
        this.A05 = getIntent().getStringExtra("session_id");
        LinearLayout linearLayout = this.A01;
        if (linearLayout == null) {
            throw C18270x1.A0S("emailRowButton");
        }
        C633839a.A00(linearLayout, this, 6);
        WaTextView waTextView = this.A02;
        if (waTextView == null) {
            throw C18270x1.A0S("description");
        }
        waTextView.setText(R.string.f11nameremoved);
        if (C18280x3.A0Z(AnonymousClass0x2.A0F(this.A09), "settings_verification_email_address") != null) {
            WaTextView waTextView2 = this.A03;
            if (waTextView2 == null) {
                throw C18270x1.A0S("emailAddressText");
            }
            waTextView2.setText(C18280x3.A0Z(AnonymousClass0x2.A0F(this.A09), "settings_verification_email_address"));
            boolean z = AnonymousClass1Hf.A27(this).getBoolean("settings_verification_email_address_verified", false);
            View view = this.A00;
            if (z) {
                A0M = AnonymousClass0x2.A0M(view, R.id.verified_state_view_stub);
            } else {
                A0M = AnonymousClass0x2.A0M(view, R.id.unverified_state_view_stub);
                TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C18290x4.A0M(A0M.A04(), R.id.email_verification_text);
                AnonymousClass0x2.A14(this.A0D, textEmojiLabel);
                textEmojiLabel.setText(C57002su.A01(C69983Zk.A00(this, 43), C18290x4.A0l(this, R.string.f11nameremoved), "verify-email"));
            }
            A0M.A06(0);
            return;
        }
        throw C18290x4.A0Y();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C18290x4.A04(menuItem) != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public EmailVerificationActivity() {
        this(0);
    }
}
