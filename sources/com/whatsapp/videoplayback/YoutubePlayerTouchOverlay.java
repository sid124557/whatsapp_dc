package com.whatsapp.videoplayback;

import X.AnonymousClass4GJ;
import X.AnonymousClass563;
import X.C116855qy;
import X.C86644Kx;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

public class YoutubePlayerTouchOverlay extends RelativeLayout implements AnonymousClass4GJ {
    public int A00;
    public AnonymousClass563 A01;
    public C116855qy A02;
    public boolean A03;

    public final void A00() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams.setMargins(0, 0, 0, 0);
        setLayoutParams(layoutParams);
        requestLayout();
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A02;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public YoutubePlayerTouchOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        this.A00 = 400;
        A00();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 2) {
            setLayoutParams(new RelativeLayout.LayoutParams(-2, -1));
        } else {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A00);
            layoutParams.addRule(13);
            setLayoutParams(layoutParams);
        }
        requestLayout();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        View A0G = C86644Kx.A0G(this);
        if (A0G == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (action == 3) {
            motionEvent.setAction(1);
            A0G.onTouchEvent(motionEvent);
        } else if (action != 2) {
            A0G.onTouchEvent(motionEvent);
            AnonymousClass563 r0 = this.A01;
            if (r0 != null) {
                r0.A03();
                return true;
            }
        }
        return true;
    }

    public void setInlineVideoPlaybackControlView(AnonymousClass563 r1) {
        this.A01 = r1;
    }

    public void setVideoHeight(int i) {
        this.A00 = i;
    }

    public YoutubePlayerTouchOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        this.A00 = 400;
        A00();
    }

    public YoutubePlayerTouchOverlay(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
    }

    public YoutubePlayerTouchOverlay(Context context) {
        super(context);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        this.A00 = 400;
        A00();
    }
}
