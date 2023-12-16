package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview;
import java.util.Map;

/* renamed from: X.50A  reason: invalid class name */
public class AnonymousClass50A extends AnonymousClass6JE {
    public boolean A00 = false;
    public final Map A01 = AnonymousClass001.A0t();
    public final /* synthetic */ SolidColorWallpaperPreview A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass50A(Context context, SolidColorWallpaperPreview solidColorWallpaperPreview) {
        super(context, (Resources) null);
        this.A02 = solidColorWallpaperPreview;
    }

    public int A02(Object obj) {
        if (obj instanceof AnonymousClass509) {
            Object tag = ((View) obj).getTag();
            if (tag instanceof Integer) {
                Map map = this.A01;
                if (!map.containsKey(tag) || Boolean.valueOf(this.A00).equals(map.get(tag))) {
                    return -1;
                }
                return -2;
            }
        }
        return -1;
    }

    public int A0C() {
        return this.A02.A0D.length;
    }

    public Pair A0G(int i) {
        int i2;
        SolidColorWallpaperPreview solidColorWallpaperPreview = this.A02;
        if (i == 0) {
            i2 = R.string.f11nameremoved;
        } else {
            int length = solidColorWallpaperPreview.A0D.length - 1;
            i2 = R.string.f11nameremoved;
            if (i < length) {
                i2 = R.string.f11nameremoved;
            }
        }
        return Pair.create(solidColorWallpaperPreview.getString(i2), solidColorWallpaperPreview.A75());
    }

    public void A0H(AnonymousClass509 r4, int i) {
        r4.setBackgroundColor(this.A02.A0D[i]);
        if (this.A00) {
            Context context = r4.getContext();
            r4.A05.setImageDrawable(C107335b8.A0B(C18310x6.A0G(context, R.drawable.whatsapp_doodle), context.getResources().getIntArray(R.array.f2nameremoved)[i]));
        } else {
            r4.A05.setImageDrawable((Drawable) null);
        }
        Map map = this.A01;
        Integer valueOf = Integer.valueOf(i);
        map.put(valueOf, Boolean.valueOf(this.A00));
        r4.setTag(valueOf);
    }

    public boolean A0F(View view, Object obj) {
        return AnonymousClass000.A1Y(view, obj);
    }
}
