package com.whatsapp.mediaview;

import X.AnonymousClass001;
import X.AnonymousClass2z0;
import X.AnonymousClass30V;
import X.AnonymousClass4SG;
import X.AnonymousClass5YG;
import X.AnonymousClass5ZC;
import X.C08240dc;
import X.C08270df;
import X.C106405Yw;
import X.C107395bF;
import X.C107695bk;
import X.C116985rC;
import X.C185918uS;
import X.C47122ck;
import X.C58152un;
import X.C64333Db;
import X.C86604Kt;
import X.C86664Kz;
import X.C88744aj;
import X.C89644eZ;
import X.C95814uZ;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public class MediaViewActivity extends C89644eZ implements C185918uS {
    public C116985rC A00;
    public MediaViewFragment A01;
    public AnonymousClass30V A02;
    public boolean A03;

    public void A5r() {
        if (!this.A03) {
            this.A03 = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
            this.A02 = C86604Kt.A0f(A2Y);
            this.A00 = C88744aj.A00;
        }
    }

    public void A66() {
        this.A02.A03((C95814uZ) null, 12);
    }

    public boolean A6C() {
        return true;
    }

    public AnonymousClass5ZC BCP() {
        return C58152un.A01;
    }

    public void BRO() {
    }

    public void Bdm() {
    }

    public boolean Boc() {
        return true;
    }

    public void onBackPressed() {
        MediaViewFragment mediaViewFragment = this.A01;
        if (mediaViewFragment != null) {
            mediaViewFragment.A1Q();
        } else {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        MediaViewBaseFragment.A00(this);
        this.A06 = false;
        super.onCreate(bundle);
        A61("on_activity_create");
        setContentView((int) R.layout.f8nameremoved);
        C08270df supportFragmentManager = getSupportFragmentManager();
        MediaViewFragment mediaViewFragment = (MediaViewFragment) supportFragmentManager.A0D("media_view_fragment");
        this.A01 = mediaViewFragment;
        if (mediaViewFragment == null) {
            Intent intent = getIntent();
            AnonymousClass2z0 A022 = C107395bF.A02(intent);
            if (A022 == null) {
                Log.e("mediaview/message key parameter is missing");
                finish();
                return;
            }
            C95814uZ A012 = C106405Yw.A01(intent, "jid");
            boolean booleanExtra = intent.getBooleanExtra("gallery", false);
            boolean booleanExtra2 = intent.getBooleanExtra("nogallery", false);
            int intExtra = intent.getIntExtra("video_play_origin", 5);
            long longExtra = intent.getLongExtra("start_t", 0);
            Bundle bundleExtra = intent.getBundleExtra("animation_bundle");
            int intExtra2 = intent.getIntExtra("menu_style", 1);
            boolean booleanExtra3 = intent.getBooleanExtra("menu_set_wallpaper", false);
            boolean booleanExtra4 = intent.getBooleanExtra("is_premium_message_insight", false);
            intent.getParcelableExtra("temp_fmessage_media_info");
            int A07 = C86664Kz.A07(intent, "message_card_index");
            C116985rC r0 = this.A00;
            if (!r0.A07() || !booleanExtra4) {
                this.A01 = MediaViewFragment.A02(bundleExtra, A012, A022, intExtra, intExtra2, 1, A07, longExtra, booleanExtra, booleanExtra2, booleanExtra3);
            } else {
                r0.A04();
                throw AnonymousClass001.A0g("createFragment");
            }
        }
        C08240dc r4 = new C08240dc(supportFragmentManager);
        r4.A0E(this.A01, "media_view_fragment", R.id.media_view_fragment_container);
        r4.A01();
        A60("on_activity_create");
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        MediaViewFragment mediaViewFragment = this.A01;
        if (mediaViewFragment == null || i != 62) {
            return super.onKeyUp(i, keyEvent);
        }
        AnonymousClass5YG r0 = mediaViewFragment.A1n;
        if (r0 == null) {
            return true;
        }
        boolean A0a = r0.A0a();
        AnonymousClass5YG r02 = mediaViewFragment.A1n;
        if (A0a) {
            r02.A0C();
            return true;
        }
        r02.A0N();
        return true;
    }

    public MediaViewActivity(int i) {
        this.A03 = false;
        C86604Kt.A1K(this, 62);
    }

    public C47122ck A5u() {
        C47122ck A5u = super.A5u();
        A5u.A05 = true;
        return A5u;
    }

    public void finish() {
        super.finish();
        MediaViewFragment mediaViewFragment = this.A01;
        if (mediaViewFragment != null) {
            mediaViewFragment.A0B.A0B();
        }
    }

    public void onStop() {
        super.onStop();
        AnonymousClass001.A0Q(this).setSystemUiVisibility(3840);
    }

    public int A5t() {
        return 703923716;
    }

    public void BWN() {
        finish();
    }

    public void BWO() {
        BZs();
    }

    public MediaViewActivity() {
        this(0);
    }
}
