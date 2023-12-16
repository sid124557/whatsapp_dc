package com.whatsapp.biz.compliance.view;

import X.AnonymousClass08M;
import X.AnonymousClass0R8;
import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.C06270Wx;
import X.C107695bk;
import X.C18290x4;
import X.C1897492m;
import X.C64333Db;
import X.C89644eZ;
import X.C989453v;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.biz.compliance.viewmodel.BusinessComplianceViewModel;

public class BusinessComplianceDetailActivity extends C89644eZ {
    public LinearLayout A00;
    public ProgressBar A01;
    public CardView A02;
    public RecyclerView A03;
    public BusinessComplianceViewModel A04;
    public boolean A05;

    public void A5r() {
        if (!this.A05) {
            this.A05 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
        }
    }

    public final void A74() {
        if (this.A07.A0F()) {
            BusinessComplianceViewModel businessComplianceViewModel = this.A04;
            Parcelable parcelableExtra = getIntent().getParcelableExtra("EXTRA_CACHE_JID");
            AnonymousClass08M r1 = businessComplianceViewModel.A01;
            C06270Wx.A03(r1, 0);
            if (businessComplianceViewModel.A00.A07() != null) {
                C06270Wx.A03(r1, 1);
            } else {
                C18290x4.A1M(businessComplianceViewModel.A03, businessComplianceViewModel, parcelableExtra, 1);
            }
        } else {
            this.A01.setVisibility(8);
            this.A00.setVisibility(0);
            this.A02.setVisibility(8);
        }
    }

    public BusinessComplianceDetailActivity(int i) {
        this.A05 = false;
        AnonymousClass4HY.A00(this, 15);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0N(true);
            supportActionBar.A0B(R.string.f11nameremoved);
        }
        this.A04 = (BusinessComplianceViewModel) AnonymousClass0x9.A0H(this).A01(BusinessComplianceViewModel.class);
        this.A01 = (ProgressBar) findViewById(R.id.business_compliance_progress);
        this.A00 = (LinearLayout) findViewById(R.id.business_compliance_network_error_layout);
        this.A02 = (CardView) findViewById(R.id.business_compliance_wrapper_card);
        this.A03 = (RecyclerView) findViewById(R.id.business_compliance_recyclerview);
        findViewById(R.id.business_compliance_network_error_retry).setOnClickListener(new C989453v(this, 20));
        A74();
        this.A04.A00.A0B(this, new C1897492m(this, 33));
        AnonymousClass1Ha.A21(this, this.A04.A01, 4);
    }

    public BusinessComplianceDetailActivity() {
        this(0);
    }
}
