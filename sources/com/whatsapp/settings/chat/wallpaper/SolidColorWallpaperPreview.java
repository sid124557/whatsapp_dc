package com.whatsapp.settings.chat.wallpaper;

import X.AnonymousClass0x9;
import X.AnonymousClass4SG;
import X.AnonymousClass50A;
import X.C005205m;
import X.C107695bk;
import X.C110105fh;
import X.C18310x6;
import X.C18320x8;
import X.C188668zI;
import X.C1891890i;
import X.C32511r1;
import X.C57562tq;
import X.C627336j;
import X.C634139d;
import X.C64333Db;
import X.C86604Kt;
import X.C86654Ky;
import X.C86664Kz;
import X.C95814uZ;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.CheckBox;
import com.whatsapp.R;
import com.whatsapp.collections.MarginCorrectedViewPager;

public class SolidColorWallpaperPreview extends C32511r1 {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public CheckBox A08;
    public MarginCorrectedViewPager A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public int[] A0D;
    public int[] A0E;

    public void onBackPressed() {
        setResult(0, (Intent) null);
        A78(this.A09.getCurrentItem());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A05 = C005205m.A00(this, R.id.container);
        this.A04 = C005205m.A00(this, R.id.appbar);
        this.A07 = C005205m.A00(this, R.id.transition_view);
        int[] intArray = getResources().getIntArray(R.array.f2nameremoved);
        int length = intArray.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = i;
        }
        Pair A0C2 = AnonymousClass0x9.A0C(intArray, iArr);
        this.A0D = (int[]) A0C2.first;
        this.A0E = (int[]) A0C2.second;
        MarginCorrectedViewPager marginCorrectedViewPager = (MarginCorrectedViewPager) C005205m.A00(this, R.id.wallpaper_preview);
        this.A09 = marginCorrectedViewPager;
        marginCorrectedViewPager.setSaveEnabled(false);
        CheckBox checkBox = (CheckBox) C005205m.A00(this, R.id.color_wallpaper_add_doodles);
        this.A08 = checkBox;
        checkBox.setVisibility(0);
        this.A08.setText(R.string.f11nameremoved);
        AnonymousClass50A r4 = new AnonymousClass50A(this, this);
        r4.A00 = this.A08.isChecked();
        this.A08.setOnCheckedChangeListener(new C1891890i(r4, 2));
        this.A09.setAdapter(r4);
        this.A09.setPageMargin((int) (C86604Kt.A00(this) * 15.0f));
        View A002 = C005205m.A00(this, R.id.control_holder);
        this.A06 = A002;
        A002.setBackground(C18310x6.A0G(this, R.drawable.wallpaper_color_confirmation_background));
        C634139d.A00(C005205m.A00(this, R.id.cancel_button), this, 36);
        A77(getIntent().getIntExtra("scw_preview_color", 0));
        this.A0C = false;
        boolean booleanExtra = getIntent().getBooleanExtra("wallpaper_preview_intent_extra_animate", false);
        this.A0A = booleanExtra;
        if (booleanExtra) {
            overridePendingTransition(0, 0);
            Intent intent = getIntent();
            this.A0C = true;
            this.A09.setScrollEnabled(false);
            this.A07.getViewTreeObserver().addOnPreDrawListener(new C110105fh(this, intent.getIntExtra("wallpaper_preview_intent_extra_x", 0), intent.getIntExtra("wallpaper_preview_intent_extra_y", 0), intent.getIntExtra("wallpaper_preview_intent_extra_width", 0), intent.getIntExtra("wallpaper_preview_intent_extra_height", 0)));
        }
    }

    public void A5r() {
        if (!this.A0B) {
            this.A0B = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
            C57562tq.A00(C64333Db.A26(A2Y), this);
            C57562tq.A01(C64333Db.A28(A2Y), this);
        }
    }

    public final void A78(int i) {
        int i2;
        int i3;
        if (this.A0A) {
            this.A0C = true;
            this.A09.setScrollEnabled(false);
            DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
            if (i != C86664Kz.A07(getIntent(), "scw_preview_color")) {
                this.A02 = 0;
                this.A03 = 0;
                i2 = C86664Kz.A0B(this.A09);
                i3 = C86664Kz.A0B(this.A09);
            } else {
                i2 = 0;
                i3 = 0;
            }
            this.A09.setPivotX((float) i2);
            this.A09.setPivotY((float) i3);
            this.A05.setBackgroundColor(0);
            this.A09.animate().setDuration(250).alpha(0.0f).scaleX(this.A00).scaleY(this.A01).translationX((float) this.A02).translationY((float) this.A03).setInterpolator(decelerateInterpolator).setListener(new C188668zI(this, 25));
            C86654Ky.A0I(this.A04, 250).alpha(0.0f).setInterpolator(decelerateInterpolator);
            C86654Ky.A0I(this.A06, 250).alpha(0.0f).setInterpolator(decelerateInterpolator);
            return;
        }
        finish();
    }

    public SolidColorWallpaperPreview(int i) {
        this.A0B = false;
        C86604Kt.A1K(this, 96);
    }

    public void A76(C95814uZ r4) {
        Intent A072 = C18320x8.A07();
        A072.putExtra("wallpaper_color_file", this.A0E[this.A09.getCurrentItem()]);
        A072.putExtra("wallpaper_doodle_overlay", this.A08.isChecked());
        C627336j.A0D(A072, r4, "chat_jid");
        setResult(-1, A072);
        finish();
    }

    public final void A77(int i) {
        int i2 = getResources().getIntArray(R.array.f2nameremoved)[i];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = this.A0D;
            if (i4 >= iArr.length) {
                break;
            } else if (iArr[i4] == i2) {
                i3 = i4;
                break;
            } else {
                i4++;
            }
        }
        this.A09.setCurrentItem(i3);
    }

    public void finish() {
        super.finish();
        if (this.A0A && this.A0C) {
            overridePendingTransition(0, 0);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        setResult(0, (Intent) null);
        A78(this.A09.getCurrentItem());
        return true;
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        A77(bundle.getInt("selected_index"));
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("selected_index", this.A0E[this.A09.getCurrentItem()]);
    }

    public SolidColorWallpaperPreview() {
        this(0);
        this.A0C = false;
        this.A0A = false;
    }
}
