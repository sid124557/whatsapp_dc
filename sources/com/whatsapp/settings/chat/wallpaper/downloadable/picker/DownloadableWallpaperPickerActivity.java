package com.whatsapp.settings.chat.wallpaper.downloadable.picker;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0PJ;
import X.AnonymousClass0x9;
import X.AnonymousClass4SG;
import X.AnonymousClass508;
import X.AnonymousClass5ZM;
import X.AnonymousClass7EW;
import X.C005205m;
import X.C100635Br;
import X.C107405bG;
import X.C107695bk;
import X.C125286Hf;
import X.C18270x1;
import X.C58802vq;
import X.C620733j;
import X.C634339f;
import X.C64333Db;
import X.C71293bs;
import X.C86604Kt;
import X.C86654Ky;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DownloadableWallpaperPickerActivity extends AnonymousClass508 {
    public View A00;
    public View A01;
    public AnonymousClass0PJ A02;
    public RecyclerView A03;
    public C620733j A04;
    public C58802vq A05;
    public C125286Hf A06;
    public List A07;
    public boolean A08;

    public void A5r() {
        if (!this.A08) {
            this.A08 = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
            this.A04 = C64333Db.A2t(A2Y);
            this.A05 = (C58802vq) r1.A3j.get();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 111) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            setResult(i2, intent);
            finish();
        }
    }

    public DownloadableWallpaperPickerActivity(int i) {
        this.A08 = false;
        C86604Kt.A1K(this, 99);
    }

    public void onCreate(Bundle bundle) {
        int identifier;
        super.onCreate(bundle);
        boolean booleanExtra = getIntent().getBooleanExtra("IS_BRIGHT_KEY", true);
        int i = R.string.f11nameremoved;
        if (booleanExtra) {
            i = R.string.f11nameremoved;
        }
        setTitle(getString(i));
        Resources resources = null;
        try {
            resources = getPackageManager().getResourcesForApplication("com.whatsapp.wallpaper");
            ArrayList A0s = AnonymousClass001.A0s();
            ArrayList A0s2 = AnonymousClass001.A0s();
            try {
                int identifier2 = resources.getIdentifier("wallpapers", "array", "com.whatsapp.wallpaper");
                if (identifier2 != 0) {
                    for (String str : resources.getStringArray(identifier2)) {
                        int identifier3 = resources.getIdentifier(str, "drawable", "com.whatsapp.wallpaper");
                        if (!(identifier3 == 0 || (identifier = resources.getIdentifier(AnonymousClass000.A0X("_small", AnonymousClass000.A0l(str)), "drawable", "com.whatsapp.wallpaper")) == 0)) {
                            C18270x1.A1K(A0s, identifier);
                            C18270x1.A1K(A0s2, identifier3);
                        }
                    }
                }
            } catch (Resources.NotFoundException e) {
                Log.e("WallpaperUtils/resource not found", e);
            }
            this.A02 = AnonymousClass0x9.A0G(A0s, A0s2);
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("WallpaperCurrentPreviewActivity/com.whatsapp.wallpaper could not be found.", e2);
        }
        this.A01 = C005205m.A00(this, R.id.wallpaper_thumbnails_progress_container);
        this.A00 = C005205m.A00(this, R.id.wallpaper_thumbnail_error_container);
        this.A03 = (RecyclerView) C005205m.A00(this, R.id.wallpaper_thumbnail_recyclerview);
        C125286Hf r2 = new C125286Hf(resources, new AnonymousClass7EW(this), this.A04);
        this.A06 = r2;
        this.A03.setLayoutManager(new DownloadableWallpaperGridLayoutManager(r2));
        C86654Ky.A1I(this.A03, this.A04, getResources().getDimensionPixelOffset(R.dimen.f6nameremoved));
        this.A03.setAdapter(this.A06);
        if (this.A05.A00.A07() == null) {
            C58802vq r3 = this.A05;
            r3.A04.execute(new C71293bs((Object) r3, 22));
        }
        C107405bG.A05(this);
        View A002 = C005205m.A00(this, R.id.wallpaper_thumbnail_reload_button);
        A002.setOnClickListener(new C634339f(this, 48, A002));
        this.A05.A00.A0B(this, new C100635Br(A002, this, 2, booleanExtra));
    }

    public void onDestroy() {
        super.onDestroy();
        Iterator A0v = AnonymousClass001.A0v(this.A06.A04);
        while (A0v.hasNext()) {
            ((AnonymousClass5ZM) A0v.next()).A0D(true);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        setResult(0, (Intent) null);
        finish();
        return true;
    }

    public DownloadableWallpaperPickerActivity() {
        this(0);
        this.A07 = AnonymousClass001.A0s();
    }
}
