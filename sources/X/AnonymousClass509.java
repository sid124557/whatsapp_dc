package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.whatsapp.R;
import com.whatsapp.settings.chat.wallpaper.WallpaperImagePreview;
import com.whatsapp.settings.chat.wallpaper.WallpaperMockChatView;

/* renamed from: X.509  reason: invalid class name */
public class AnonymousClass509 extends AnonymousClass6FO {
    public Resources A00;
    public Button A01;
    public FrameLayout A02;
    public ProgressBar A03;
    public WallpaperImagePreview A04 = ((WallpaperImagePreview) C06560Yg.A02(this, R.id.wallpaper_preview_background));
    public WallpaperImagePreview A05 = ((WallpaperImagePreview) C06560Yg.A02(this, R.id.wallpaper_preview_background_doodle));
    public WallpaperImagePreview A06;

    public AnonymousClass509(Context context, Resources resources, String str, String str2) {
        super(context);
        this.A00 = resources;
        View.inflate(context, R.layout.f8nameremoved, this);
        WallpaperImagePreview wallpaperImagePreview = (WallpaperImagePreview) C06560Yg.A02(this, R.id.wallpaper_preview_blur);
        this.A06 = wallpaperImagePreview;
        wallpaperImagePreview.setImageDrawable((Drawable) null);
        ((WallpaperMockChatView) C06560Yg.A02(this, R.id.wallpaper_preview_mock_chat)).setMessages(str, str2, (AnonymousClass677) null);
        this.A02 = C86654Ky.A0L(this, R.id.wallpaper_preview_download_container);
        this.A03 = (ProgressBar) C06560Yg.A02(this, R.id.wallpaper_preview_progress_bar);
        this.A01 = (Button) C06560Yg.A02(this, R.id.wallpaper_preview_download_btn);
    }

    public void setBackgroundColor(int i) {
        this.A06.setVisibility(8);
        WallpaperImagePreview wallpaperImagePreview = this.A04;
        wallpaperImagePreview.setImageDrawable((Drawable) null);
        wallpaperImagePreview.setBackgroundColor(i);
    }

    public void setDownloadClickListener(View.OnClickListener onClickListener) {
        this.A01.setOnClickListener(onClickListener);
    }

    public void setWallpaper(Bitmap bitmap) {
        this.A06.setVisibility(8);
        this.A04.setImageBitmap(bitmap);
    }

    public void setWallpaper(Drawable drawable) {
        this.A06.setVisibility(8);
        this.A04.setImageDrawable(drawable);
    }
}
