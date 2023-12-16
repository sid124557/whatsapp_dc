package com.whatsapp.account.delete;

import X.AnonymousClass002;
import X.AnonymousClass08M;
import X.AnonymousClass0YV;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass317;
import X.AnonymousClass33S;
import X.AnonymousClass4DY;
import X.AnonymousClass4FN;
import X.AnonymousClass4HY;
import X.AnonymousClass5UP;
import X.C08310eF;
import X.C116985rC;
import X.C18270x1;
import X.C18280x3;
import X.C18300x5;
import X.C18310x6;
import X.C18320x8;
import X.C1907099n;
import X.C44572Wo;
import X.C626936e;
import X.C86314Jq;
import X.C88834as;
import X.C89644eZ;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.phonematching.ConnectionProgressDialogFragment;
import com.whatsapp.phonematching.ConnectionUnavailableDialogFragment;

public class DeleteAccountActivity extends C89644eZ implements AnonymousClass4FN {
    public C116985rC A00;
    public AnonymousClass33S A01;
    public AnonymousClass5UP A02;
    public C1907099n A03;
    public C44572Wo A04;
    public AnonymousClass317 A05;
    public boolean A06;
    public final AnonymousClass08M A07;
    public final AnonymousClass4DY A08;

    public void A5r() {
        if (!this.A06) {
            this.A06 = true;
            ((C88834as) AnonymousClass0x9.A0K(this)).ADU(this);
        }
    }

    public void BW5() {
        A6T(AnonymousClass0x9.A08(this, DeleteAccountFeedback.class), true);
    }

    public void Big(C44572Wo r3) {
        AnonymousClass317 r0 = this.A05;
        r0.A12.add(this.A08);
        this.A04 = r3;
    }

    public boolean BlR(String str, String str2) {
        return this.A01.A06(str, str2);
    }

    public void BrP(C44572Wo r3) {
        AnonymousClass317 r0 = this.A05;
        r0.A12.remove(this.A08);
        this.A04 = null;
    }

    public DeleteAccountActivity(int i) {
        this.A06 = false;
        AnonymousClass4HY.A00(this, 6);
    }

    public void B1s() {
        DialogFragment dialogFragment = (DialogFragment) getSupportFragmentManager().A0D("PROGRESS");
        if (dialogFragment != null) {
            dialogFragment.A1L();
        }
    }

    public void BPo() {
        Bundle A082 = AnonymousClass002.A08();
        ConnectionUnavailableDialogFragment connectionUnavailableDialogFragment = new ConnectionUnavailableDialogFragment();
        connectionUnavailableDialogFragment.A0u(A082);
        connectionUnavailableDialogFragment.A1O(getSupportFragmentManager(), "CONNECTION ERROR");
    }

    public void BWl() {
        Bot(R.string.f11nameremoved);
    }

    public void Bp6() {
        Bundle A082 = AnonymousClass002.A08();
        ConnectionProgressDialogFragment connectionProgressDialogFragment = new ConnectionProgressDialogFragment();
        connectionProgressDialogFragment.A0u(A082);
        connectionProgressDialogFragment.A1O(getSupportFragmentManager(), "PROGRESS");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        setTitle(R.string.f11nameremoved);
        AnonymousClass1Hf.A2E(this);
        ImageView imageView = (ImageView) findViewById(R.id.change_number_icon);
        C18270x1.A0d(this, imageView, this.A00, R.drawable.ic_settings_change_number);
        AnonymousClass0x7.A14(this, imageView);
        C18310x6.A0L(this, R.id.delete_account_instructions).setText(R.string.f11nameremoved);
        C18280x3.A0p(findViewById(R.id.delete_account_change_number_option), this, 26);
        AnonymousClass1Ha.A1v(this, C18310x6.A0L(this, R.id.delete_whatsapp_account_warning_text), getString(R.string.f11nameremoved));
        AnonymousClass1Ha.A1v(this, C18310x6.A0L(this, R.id.delete_message_history_warning_text), getString(R.string.f11nameremoved));
        AnonymousClass1Ha.A1v(this, C18310x6.A0L(this, R.id.delete_whatsapp_group_warning_text), getString(R.string.f11nameremoved));
        AnonymousClass1Ha.A1v(this, C18310x6.A0L(this, R.id.delete_google_drive_warning_text), getString(R.string.f11nameremoved));
        AnonymousClass1Ha.A1v(this, C18310x6.A0L(this, R.id.delete_payments_account_warning_text), getString(R.string.f11nameremoved));
        if (!AnonymousClass0YV.A0F(getApplicationContext()) || this.A09.A0X() == null) {
            C18280x3.A0r(this, R.id.delete_google_drive_warning_text, 8);
        }
        if (!this.A03.A02() && !this.A03.A01()) {
            C18280x3.A0r(this, R.id.delete_payments_account_warning_text, 8);
        } else if (this.A03.A01()) {
            AnonymousClass1Ha.A1v(this, C18310x6.A0L(this, R.id.delete_payments_account_warning_text), getString(R.string.f11nameremoved));
        }
        boolean A1S = C18300x5.A1S(this.A02);
        View findViewById = findViewById(R.id.delete_channels_warning_text);
        if (A1S) {
            AnonymousClass1Ha.A1v(this, (TextView) findViewById, getString(R.string.f11nameremoved));
        } else {
            findViewById.setVisibility(8);
        }
        C08310eF A0B = getSupportFragmentManager().A0B(R.id.delete_account_match_phone_number_fragment);
        C626936e.A06(A0B);
        C18320x8.A16(findViewById(R.id.delete_account_submit), A0B, this, 5);
    }

    public DeleteAccountActivity() {
        this(0);
        this.A07 = AnonymousClass08M.A01();
        this.A08 = new C86314Jq(this, 0);
    }
}
