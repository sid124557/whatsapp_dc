package com.whatsapp.biz.linkedaccounts;

import X.AnonymousClass002;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.AnonymousClass5MG;
import X.C08240dc;
import X.C08270df;
import X.C08310eF;
import X.C107275b2;
import X.C107695bk;
import X.C108915dl;
import X.C18320x8;
import X.C185918uS;
import X.C64333Db;
import X.C89644eZ;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import java.util.ArrayList;

public class LinkedAccountMediaView extends C89644eZ implements C185918uS {
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

    public LinkedAccountMediaView(int i) {
        this.A00 = false;
        AnonymousClass4HY.A00(this, 16);
    }

    public static void A0C(Context context, View view, C108915dl r5, UserJid userJid, String str, ArrayList arrayList, int i, int i2, int i3, boolean z) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.biz.linkedaccounts.LinkedAccountMediaView");
        A07.putExtra("extra_business_jid", userJid);
        A07.putExtra("extra_target_post_index", i);
        A07.putExtra("extra_account_type", i2);
        A07.putExtra("extra_is_v2_5_enabled", z);
        A07.putParcelableArrayListExtra("extra_post_list", arrayList);
        A07.putExtra("extra_common_fields_for_analytics", r5);
        A07.putExtra("extra_entry_point", i3);
        C107275b2.A09(context, A07, view, new AnonymousClass5MG(context), str);
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
            C08310eF A0D = supportFragmentManager.A0D("linked_account_media_view_fragment");
            if (A0D == null) {
                A0D = new LinkedAccountMediaViewFragment();
            }
            Bundle A08 = AnonymousClass002.A08();
            A08.putParcelable("extra_business_jid", intent.getParcelableExtra("extra_business_jid"));
            A08.putParcelableArrayList("extra_post_list", intent.getParcelableArrayListExtra("extra_post_list"));
            A08.putInt("extra_account_type", intent.getIntExtra("extra_account_type", 0));
            A08.putInt("extra_target_post_index", intent.getIntExtra("extra_target_post_index", 0));
            A08.putBoolean("extra_is_v2_5_enabled", intent.getBooleanExtra("extra_is_v2_5_enabled", false));
            A08.putBundle("animation_bundle", intent.getBundleExtra("animation_bundle"));
            A08.putParcelable("extra_common_fields_for_analytics", intent.getParcelableExtra("extra_common_fields_for_analytics"));
            A08.putInt("extra_entry_point", intent.getIntExtra("extra_entry_point", 0));
            A0D.A0u(A08);
            C08240dc r1 = new C08240dc(supportFragmentManager);
            r1.A0E(A0D, "linked_account_media_view_fragment", R.id.media_view_fragment_container);
            r1.A01();
        }
    }

    public LinkedAccountMediaView() {
        this(0);
    }
}
