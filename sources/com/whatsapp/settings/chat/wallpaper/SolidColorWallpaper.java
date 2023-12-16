package com.whatsapp.settings.chat.wallpaper;

import X.AnonymousClass0x9;
import X.AnonymousClass127;
import X.AnonymousClass1Hf;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.C005205m;
import X.C620733j;
import X.C64333Db;
import X.C87914Wp;
import X.C89654ea;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.MenuItem;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.collections.AutoFitGridLayoutManager;

public class SolidColorWallpaper extends C89654ea {
    public static final int[] A04 = {R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved};
    public C620733j A00;
    public boolean A01;
    public int[] A02;
    public int[] A03;

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1) {
            if (intent == null || !intent.hasExtra("wallpaper_color_file")) {
                setResult(0, (Intent) null);
            } else {
                setResult(-1, intent);
            }
            finish();
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public void A5r() {
        if (!this.A01) {
            this.A01 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            AnonymousClass1Hf.A2F(A002, this);
            this.A00 = C64333Db.A2t(A002);
        }
    }

    public SolidColorWallpaper(int i) {
        this.A01 = false;
        AnonymousClass4HY.A00(this, 117);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass1Hf.A2A(this);
        setTitle(R.string.f11nameremoved);
        setContentView((int) R.layout.f8nameremoved);
        setSupportActionBar(AnonymousClass1Hf.A28(this));
        boolean A2I = AnonymousClass1Hf.A2I(this);
        C005205m.A00(this, R.id.separator).setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) C005205m.A00(this, R.id.color_grid);
        recyclerView.A0o(new AnonymousClass127(this.A00, getResources().getDimensionPixelOffset(R.dimen.f6nameremoved)));
        int[] intArray = getResources().getIntArray(R.array.f2nameremoved);
        int length = intArray.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = i;
        }
        Pair A0C = AnonymousClass0x9.A0C(intArray, iArr);
        int[] iArr2 = (int[]) A0C.first;
        this.A02 = iArr2;
        this.A03 = (int[]) A0C.second;
        recyclerView.setAdapter(new C87914Wp(this, this, iArr2));
        recyclerView.A0h = A2I;
        recyclerView.setLayoutManager(new AutoFitGridLayoutManager(this, getResources().getDimensionPixelSize(R.dimen.f6nameremoved)));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        setResult(0, (Intent) null);
        finish();
        return true;
    }

    public SolidColorWallpaper() {
        this(0);
    }
}
