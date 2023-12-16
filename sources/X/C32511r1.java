package X;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import com.whatsapp.R;
import com.whatsapp.settings.chat.wallpaper.DefaultWallpaperPreview;
import com.whatsapp.settings.chat.wallpaper.GalleryWallpaperPreview;

/* renamed from: X.1r1  reason: invalid class name and case insensitive filesystem */
public abstract class C32511r1 extends C137666p4 implements AnonymousClass64I {
    public Button A00;
    public C64773Ex A01;
    public AnonymousClass5ZU A02;

    public int A74() {
        if (!(this instanceof GalleryWallpaperPreview) && (this instanceof DefaultWallpaperPreview)) {
            return R.layout.f8nameremoved;
        }
        return R.layout.f8nameremoved;
    }

    public String A75() {
        int i;
        if (this.A00 == null) {
            boolean A0D = C107405bG.A0D(this);
            i = R.string.f11nameremoved;
            if (A0D) {
                i = R.string.f11nameremoved;
            }
        } else {
            boolean z = this.A01;
            i = R.string.f11nameremoved;
            if (z) {
                i = R.string.f11nameremoved;
            }
        }
        return getString(i);
    }

    public void A76(C95814uZ r5) {
        if (this instanceof GalleryWallpaperPreview) {
            GalleryWallpaperPreview galleryWallpaperPreview = (GalleryWallpaperPreview) this;
            if (galleryWallpaperPreview.A0D.A0Y(C58422vE.A02, 6788)) {
                galleryWallpaperPreview.A04.BkM(new C70143a1(galleryWallpaperPreview, 41, r5));
            } else {
                galleryWallpaperPreview.A77(r5);
            }
        } else {
            Intent A07 = C18320x8.A07();
            C627336j.A0D(A07, r5, "chat_jid");
            A07.putExtra("is_default", true);
            AnonymousClass0x2.A0m(this, A07);
        }
    }

    public void Bbh(int i, int i2) {
        C95814uZ r0;
        if (i == 100) {
            if (i2 == 0) {
                r0 = this.A00;
            } else {
                r0 = null;
            }
            A76(r0);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
        Button button = (Button) C005205m.A00(this, R.id.set_wallpaper_button);
        this.A00 = button;
        C634139d.A00(button, this, 34);
    }
}
