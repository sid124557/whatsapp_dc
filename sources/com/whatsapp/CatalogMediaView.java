package com.whatsapp;

import X.AnonymousClass002;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.C08240dc;
import X.C08270df;
import X.C08310eF;
import X.C107695bk;
import X.C18310x6;
import X.C185918uS;
import X.C64333Db;
import X.C89644eZ;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.biz.catalog.CatalogMediaViewFragment;
import com.whatsapp.mediaview.MediaViewBaseFragment;

public class CatalogMediaView extends C89644eZ implements C185918uS {
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

    public CatalogMediaView(int i) {
        this.A00 = false;
        AnonymousClass4HY.A00(this, 0);
    }

    public void BRO() {
    }

    public void BWN() {
        finish();
    }

    public void BWO() {
    }

    public void Bdm() {
    }

    public boolean Boc() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        MediaViewBaseFragment.A00(this);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            setContentView((int) R.layout.f8nameremoved);
            C08270df supportFragmentManager = getSupportFragmentManager();
            C08310eF A0D = supportFragmentManager.A0D("catalog_media_view_fragment");
            if (A0D == null) {
                A0D = new CatalogMediaViewFragment();
            }
            Bundle A08 = AnonymousClass002.A08();
            A08.putParcelable("product", intent.getParcelableExtra("product"));
            A08.putInt("target_image_index", intent.getIntExtra("target_image_index", 0));
            C18310x6.A0z(intent, A08, "cached_jid");
            A08.putBundle("animation_bundle", intent.getBundleExtra("animation_bundle"));
            A0D.A0u(A08);
            C08240dc r1 = new C08240dc(supportFragmentManager);
            r1.A0E(A0D, "catalog_media_view_fragment", R.id.media_view_fragment_container);
            r1.A01();
        }
    }

    public void onStop() {
        super.onStop();
        getWindow().getDecorView().setSystemUiVisibility(3840);
    }

    public CatalogMediaView() {
        this(0);
    }
}
