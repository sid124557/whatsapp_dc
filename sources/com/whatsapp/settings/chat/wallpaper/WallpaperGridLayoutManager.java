package com.whatsapp.settings.chat.wallpaper;

import X.AnonymousClass0R6;
import X.C188808zW;
import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;

public class WallpaperGridLayoutManager extends GridLayoutManager {
    public Context A00;
    public final AnonymousClass0R6 A01;

    public WallpaperGridLayoutManager(Context context, AnonymousClass0R6 r4) {
        super(4);
        this.A00 = context;
        this.A01 = r4;
        this.A01 = new C188808zW(this, 0);
    }
}
