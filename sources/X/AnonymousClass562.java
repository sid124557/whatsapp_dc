package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.562  reason: invalid class name */
public abstract class AnonymousClass562 extends AnonymousClass6FT {
    public int A00 = -1;
    public C53302ms A01;
    public AnonymousClass561 A02;
    public AnonymousClass8K7 A03;
    public String A04;
    public boolean A05 = false;
    public final View A06;
    public final View A07;
    public final AspectRatioFrameLayout A08;
    public final boolean A09;

    public void setController(AnonymousClass561 r2) {
        A01(r2, true);
    }

    public void A01(AnonymousClass561 r2, boolean z) {
        Log.d("WAExoPlayerView/setController=");
        this.A02 = r2;
        if (r2 != null && z) {
            r2.A06 = this.A03;
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        AnonymousClass561 r0 = this.A02;
        if (r0 != null) {
            return r0.dispatchKeyEvent(keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public Bitmap getCurrentFrame() {
        try {
            View view = this.A07;
            int width = view.getWidth() / 4;
            int height = view.getHeight() / 4;
            if (!this.A09) {
                return ((TextureView) view).getBitmap(width, height);
            }
            boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
            if (!isDrawingCacheEnabled) {
                view.setDrawingCacheEnabled(true);
            }
            view.buildDrawingCache(true);
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(view.getDrawingCache(), width, height, true);
            if (!isDrawingCacheEnabled) {
                view.setDrawingCacheEnabled(false);
            }
            view.destroyDrawingCache();
            return createScaledBitmap;
        } catch (OutOfMemoryError e) {
            Log.e("ExoPlayerView/getCurrentFrame/", e);
            return null;
        }
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        AnonymousClass561 r0 = this.A02;
        if (r0 == null) {
            return false;
        }
        r0.A05();
        return true;
    }

    public void setLayoutResizeMode(int i) {
        this.A08.setResizeMode(i);
    }

    public AnonymousClass562(Context context, boolean z) {
        super(context);
        View r0;
        LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.video_frame);
        this.A08 = aspectRatioFrameLayout;
        this.A06 = findViewById(R.id.shutter);
        this.A09 = z;
        if (z) {
            r0 = new SurfaceView(context);
        } else {
            r0 = new AnonymousClass6EZ(context);
        }
        this.A07 = r0;
        C86624Kv.A0v(r0, -1);
        aspectRatioFrameLayout.addView(r0, 0);
        this.A03 = new AnonymousClass8K7(this);
    }

    public void setExoPlayerErrorActionsController(C53302ms r1) {
        this.A01 = r1;
    }
}
