package com.whatsapp.biz.product.view.activity;

import X.AnonymousClass0x7;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.C08270df;
import X.C107695bk;
import X.C18280x3;
import X.C18290x4;
import X.C626936e;
import X.C64333Db;
import X.C89644eZ;
import android.os.Build;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.biz.product.view.fragment.ProductBottomSheet;
import com.whatsapp.jid.Jid;

public final class ProductBottomSheetTransparentActivity extends C89644eZ {
    public boolean A00;

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
        }
    }

    public ProductBottomSheetTransparentActivity(int i) {
        this.A00 = false;
        AnonymousClass4HY.A00(this, 17);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        getWindow().setStatusBarColor(0);
        int i = 1;
        if (Build.VERSION.SDK_INT == 26) {
            i = -1;
        }
        setRequestedOrientation(i);
        String stringExtra = getIntent().getStringExtra("extra_product_id");
        C626936e.A06(stringExtra);
        C18280x3.A12(stringExtra);
        Bundle A0F = AnonymousClass0x7.A0F("extra_product_id", stringExtra);
        A0F.putString("extra_product_owner_jid", C18290x4.A0n((Jid) getIntent().getParcelableExtra("extra_product_owner_id")));
        ProductBottomSheet productBottomSheet = new ProductBottomSheet();
        productBottomSheet.A0u(A0F);
        C08270df supportFragmentManager = getSupportFragmentManager();
        C626936e.A06(supportFragmentManager);
        productBottomSheet.A1O(supportFragmentManager, "product_bottom_sheet_tag");
    }

    public ProductBottomSheetTransparentActivity() {
        this(0);
    }
}
