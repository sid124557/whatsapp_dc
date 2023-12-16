package com.whatsapp.settings.chat.wallpaper.downloadable.picker;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass4FS;
import X.AnonymousClass4SG;
import X.AnonymousClass50B;
import X.AnonymousClass5Yj;
import X.AnonymousClass5ZM;
import X.AnonymousClass7IM;
import X.C005205m;
import X.C107695bk;
import X.C18320x8;
import X.C1892690q;
import X.C32511r1;
import X.C57562tq;
import X.C58802vq;
import X.C626936e;
import X.C627336j;
import X.C64333Db;
import X.C86604Kt;
import X.C95814uZ;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.collections.MarginCorrectedViewPager;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DownloadableWallpaperPreviewActivity extends C32511r1 {
    public Resources A00;
    public MarginCorrectedViewPager A01;
    public C58802vq A02;
    public AnonymousClass50B A03;
    public AnonymousClass7IM A04;
    public List A05;
    public List A06;
    public boolean A07;
    public final Set A08;

    public void onBackPressed() {
        setResult(0, (Intent) null);
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C86604Kt.A0z(this, C005205m.A00(this, R.id.container), AnonymousClass5Yj.A01(this));
        this.A00.setEnabled(false);
        try {
            this.A00 = getPackageManager().getResourcesForApplication("com.whatsapp.wallpaper");
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("DownloadableWallpaperPreviewActivity/com.whatsapp.wallpaper could not be found.", e);
        }
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("THUMBNAIL_URIS_KEY");
        C626936e.A06(parcelableArrayListExtra);
        this.A05 = parcelableArrayListExtra;
        ArrayList<Integer> integerArrayListExtra = getIntent().getIntegerArrayListExtra("WHATSAPP_THUMBNAIL_RES_KEY");
        this.A06 = getIntent().getIntegerArrayListExtra("WHATSAPP_FULL_RES_KEY");
        this.A01 = (MarginCorrectedViewPager) C005205m.A00(this, R.id.wallpaper_preview);
        AnonymousClass4FS r9 = this.A04;
        C58802vq r7 = this.A02;
        AnonymousClass50B r3 = new AnonymousClass50B(this, this.A00, this.A00, r7, this.A04, r9, this.A05, integerArrayListExtra, this.A06, this.A01);
        this.A03 = r3;
        this.A01.setAdapter(r3);
        this.A01.setPageMargin(getResources().getDimensionPixelOffset(R.dimen.f6nameremoved));
        this.A01.A0G(new C1892690q(this, 2));
        this.A01.setCurrentItem(getIntent().getIntExtra("STARTING_POSITION_KEY", 0));
    }

    public void A5r() {
        if (!this.A07) {
            this.A07 = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
            C57562tq.A00(C64333Db.A26(A2Y), this);
            C57562tq.A01(C64333Db.A28(A2Y), this);
            this.A02 = (C58802vq) r1.A3j.get();
        }
    }

    public void onDestroy() {
        Iterator A0v = AnonymousClass001.A0v(this.A03.A07);
        while (A0v.hasNext()) {
            ((AnonymousClass5ZM) A0v.next()).A0D(true);
        }
        super.onDestroy();
    }

    public DownloadableWallpaperPreviewActivity(int i) {
        this.A07 = false;
        C86604Kt.A1K(this, 100);
    }

    public void A76(C95814uZ r5) {
        Intent A072 = C18320x8.A07();
        int currentItem = this.A01.getCurrentItem();
        if (currentItem < this.A05.size()) {
            C58802vq r3 = this.A02;
            String path = ((Uri) this.A05.get(this.A01.getCurrentItem())).getPath();
            C626936e.A06(path);
            File A012 = r3.A02.A01(AnonymousClass002.A0B(path).getName().split("\\.")[0]);
            C626936e.A06(A012);
            A072.setData(Uri.fromFile(A012));
            A072.putExtra("FROM_INTERNAL_DOWNLOADS_KEY", true);
        } else {
            A072.putExtra("selected_res_id", (Serializable) this.A06.get(currentItem - this.A05.size()));
        }
        C627336j.A0D(A072, r5, "chat_jid");
        AnonymousClass0x2.A0m(this, A072);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        setResult(0, (Intent) null);
        finish();
        return true;
    }

    public DownloadableWallpaperPreviewActivity() {
        this(0);
        this.A08 = AnonymousClass002.A0K();
        this.A04 = new AnonymousClass7IM(this);
    }
}
