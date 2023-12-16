package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass0R8;
import X.AnonymousClass0Y8;
import X.AnonymousClass0x2;
import X.AnonymousClass3DZ;
import X.AnonymousClass487;
import X.AnonymousClass5UX;
import X.AnonymousClass5V0;
import X.AnonymousClass9U5;
import X.C107695bk;
import X.C160757oG;
import X.C166557yt;
import X.C18310x6;
import X.C1899593h;
import X.C19340zH;
import X.C194619Tt;
import X.C195909Zz;
import X.C196619bI;
import X.C204019og;
import X.C204219p0;
import X.C621433s;
import X.C64333Db;
import X.C86614Ku;
import X.C86654Ky;
import X.C89654ea;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.CopyableTextView;
import com.whatsapp.R;

public class IndiaUpiVpaContactInfoActivity extends C89654ea implements View.OnClickListener {
    public View A00;
    public LinearLayout A01;
    public AnonymousClass5UX A02;
    public C166557yt A03;
    public C166557yt A04;
    public C194619Tt A05;
    public C195909Zz A06;
    public AnonymousClass9U5 A07;
    public String A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public final C160757oG A0D;

    public Dialog onCreateDialog(int i) {
        if (i != 1) {
            return super.onCreateDialog(i);
        }
        C19340zH A002 = AnonymousClass5V0.A00(this);
        A002.A0g(C86614Ku.A0s(this, C1899593h.A0X(this.A04), new Object[1], R.string.f11nameremoved));
        C204219p0.A01(A002, this, 79, R.string.f11nameremoved);
        A002.A0W((DialogInterface.OnClickListener) null, R.string.f11nameremoved);
        return A002.create();
    }

    public void A5r() {
        if (!this.A0B) {
            this.A0B = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            C1899593h.A15(A002, this);
            C107695bk r1 = A002.A00;
            this.A0B = (AnonymousClass487) r1.A9c.get();
            this.A02 = C86614Ku.A0Q(A002);
            this.A07 = C1899593h.A0F(A002);
            this.A06 = C1899593h.A0D(r1);
            this.A05 = (C194619Tt) r1.A6K.get();
        }
    }

    public final Intent A6j() {
        Intent A012 = this.A06.A01(this, false, true);
        A012.putExtra("referral_screen", this.A09);
        A012.putExtra("extra_payment_handle", this.A03);
        A012.putExtra("extra_payment_handle_id", this.A0A);
        A012.putExtra("extra_payee_name", this.A04);
        A012.putExtra("extra_merchant_code", this.A08);
        return A012;
    }

    public final void A6k(boolean z) {
        int i;
        this.A0C = z;
        ImageView A0M = C86654Ky.A0M(this, R.id.block_vpa_icon);
        TextView A0L = C18310x6.A0L(this, R.id.block_vpa_text);
        int i2 = 8;
        this.A00.setVisibility(C86614Ku.A01(z ? 1 : 0));
        LinearLayout linearLayout = this.A01;
        if (!z) {
            i2 = 0;
        }
        linearLayout.setVisibility(i2);
        if (z) {
            A0M.setColorFilter(AnonymousClass0Y8.A04(this, R.color.f5nameremoved));
            AnonymousClass0x2.A0q(this, A0L, R.color.f5nameremoved);
            i = R.string.f11nameremoved;
        } else {
            A0M.setColorFilter(AnonymousClass0Y8.A04(this, R.color.f5nameremoved));
            AnonymousClass0x2.A0q(this, A0L, R.color.f5nameremoved);
            i = R.string.f11nameremoved;
        }
        A0L.setText(i);
    }

    public IndiaUpiVpaContactInfoActivity(int i) {
        this.A0B = false;
        C204019og.A00(this, 94);
    }

    public void onClick(View view) {
        Intent A6j;
        String str;
        int i;
        if (view.getId() == R.id.send_payment_container) {
            C160757oG r2 = this.A0D;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("send payment to vpa: ");
            C1899593h.A1I(r2, this.A03, A0o);
            A6j = A6j();
            str = "extra_transfer_direction";
            i = 0;
        } else if (view.getId() == R.id.request_payment_container) {
            C160757oG r22 = this.A0D;
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("request payment from vpa: ");
            C1899593h.A1I(r22, this.A03, A0o2);
            A6j = A6j();
            str = "extra_transfer_direction";
            i = 1;
        } else if (view.getId() == R.id.block_vpa_btn) {
            boolean z = this.A0C;
            C160757oG r23 = this.A0D;
            StringBuilder A0o3 = AnonymousClass001.A0o();
            if (z) {
                A0o3.append("unblock vpa: ");
                C1899593h.A1I(r23, this.A03, A0o3);
                this.A05.A02(this, new C196619bI(this, false), this.A07, (String) C1899593h.A0X(this.A03), false);
                return;
            }
            A0o3.append("block vpa: ");
            C1899593h.A1I(r23, this.A03, A0o3);
            C621433s.A01(this, 1);
            return;
        } else {
            return;
        }
        A6j.putExtra(str, i);
        startActivity(A6j);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0N(true);
            supportActionBar.A0B(R.string.f11nameremoved);
        }
        this.A03 = (C166557yt) getIntent().getParcelableExtra("extra_payment_handle");
        this.A0A = getIntent().getStringExtra("extra_payment_handle_id");
        this.A04 = (C166557yt) getIntent().getParcelableExtra("extra_payee_name");
        this.A09 = C1899593h.A0a(this);
        this.A08 = getIntent().getStringExtra("extra_merchant_code");
        this.A00 = findViewById(R.id.payment_separator);
        findViewById(R.id.send_payment_container).setOnClickListener(this);
        findViewById(R.id.request_payment_container).setOnClickListener(this);
        this.A01 = (LinearLayout) findViewById(R.id.send_and_request_payment_container);
        CopyableTextView copyableTextView = (CopyableTextView) findViewById(R.id.account_id_handle);
        AnonymousClass001.A0y(this, copyableTextView, new Object[]{C1899593h.A0X(this.A03)}, R.string.f11nameremoved);
        copyableTextView.A02 = (String) C1899593h.A0X(this.A03);
        C18310x6.A0L(this, R.id.vpa_name).setText((CharSequence) C1899593h.A0X(this.A04));
        this.A02.A06(C86654Ky.A0M(this, R.id.avatar), R.drawable.avatar_contact);
        View findViewById = findViewById(R.id.block_vpa_btn);
        findViewById.setVisibility(0);
        findViewById.setOnClickListener(this);
        A6k(this.A05.A07(this.A03));
    }

    public IndiaUpiVpaContactInfoActivity() {
        this(0);
        this.A0D = C160757oG.A00("IndiaUpiVpaContactInfoActivity", "payment-settings", "IN");
    }
}
