package com.whatsapp.search.views.itemviews;

import X.AnonymousClass4FS;
import X.AnonymousClass4GJ;
import X.AnonymousClass8JY;
import X.C111685iW;
import X.C116855qy;
import X.C154337d0;
import X.C166407yd;
import X.C179648jU;
import X.C1894591j;
import X.C1898592x;
import X.C31961pA;
import X.C64333Db;
import X.C71283br;
import X.C88864av;
import X.C98204zz;
import android.content.Context;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;

public class MessageGifVideoPlayer extends TextureView implements AnonymousClass4GJ {
    public MediaPlayer.OnErrorListener A00;
    public MediaPlayer.OnPreparedListener A01;
    public MediaPlayer A02;
    public Surface A03;
    public C166407yd A04;
    public C31961pA A05;
    public C179648jU A06;
    public AnonymousClass4FS A07;
    public C116855qy A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final TextureView.SurfaceTextureListener A0G;

    public final void A03() {
        this.A0C = false;
        if (this.A0E) {
            this.A0A = true;
        } else if (!this.A0F) {
            this.A09 = true;
        } else {
            setSurfaceTextureListener(this.A0G);
            this.A07.BkM(new C71283br((Object) this, 34));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r3 < r2) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        if (r4 > r6) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        r1 = r3 / r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0050, code lost:
        r2 = 1.0f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A00(com.whatsapp.search.views.itemviews.MessageGifVideoPlayer r8) {
        /*
            X.7yd r1 = r8.A04
            if (r1 == 0) goto L_0x003c
            int r0 = r1.A02
            float r7 = (float) r0
            int r0 = r1.A01
            float r6 = (float) r0
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x003c
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x003c
            float r5 = X.AnonymousClass4L0.A00(r8)
            float r4 = X.C86664Kz.A02(r8)
            float r3 = r7 / r6
            float r2 = r5 / r4
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x003d
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x003d
        L_0x0029:
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x004e
        L_0x002d:
            float r2 = r2 / r3
        L_0x002e:
            r0 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r0
            float r4 = r4 / r0
            android.graphics.Matrix r0 = X.AnonymousClass002.A05()
            r0.setScale(r1, r2, r5, r4)
            r8.setTransform(r0)
        L_0x003c:
            return
        L_0x003d:
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0046
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0046
            goto L_0x0029
        L_0x0046:
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x002d
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0050
        L_0x004e:
            float r3 = r3 / r2
            r1 = r3
        L_0x0050:
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.views.itemviews.MessageGifVideoPlayer.A00(com.whatsapp.search.views.itemviews.MessageGifVideoPlayer):void");
    }

    public void A01() {
        if (!this.A0B) {
            this.A0B = true;
            this.A07 = C64333Db.A8y(((C88864av) ((C111685iW) generatedComponent())).A0K);
        }
    }

    public final void A02() {
        if (this.A0F && this.A02 != null && this.A0C) {
            C179648jU r0 = this.A06;
            if (r0 != null) {
                C98204zz.A00(((AnonymousClass8JY) r0).A00, false);
            }
            setVisibility(0);
            this.A02.start();
            this.A0D = true;
        }
    }

    public final void A04() {
        MediaPlayer mediaPlayer;
        setVisibility(8);
        C179648jU r0 = this.A06;
        if (r0 != null) {
            C98204zz.A00(((AnonymousClass8JY) r0).A00, true);
        }
        if (this.A0D && (mediaPlayer = this.A02) != null) {
            mediaPlayer.pause();
            this.A02.seekTo(0);
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A08;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A08 = r0;
        }
        return r0.generatedComponent();
    }

    public void setMessage(C31961pA r2) {
        if ((this.A05 != r2 || this.A02 == null) && r2.A01 != null) {
            this.A05 = r2;
            A03();
        }
    }

    public void setScrolling(boolean z) {
        this.A0E = z;
        if (!z && this.A0A) {
            this.A0A = false;
            A03();
        }
    }

    public void setShouldPlay(boolean z) {
        if (this.A0F != z) {
            this.A0F = z;
            if (!z) {
                if (this.A0D && this.A02 != null) {
                    A04();
                }
            } else if (this.A09) {
                A03();
            } else if (this.A0C) {
                A02();
            }
        }
    }

    public MessageGifVideoPlayer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A01();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        A02();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A04();
    }

    public void setPlayingListener(C179648jU r1) {
        this.A06 = r1;
    }

    public MessageGifVideoPlayer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        this.A0F = false;
        this.A0E = false;
        this.A0G = new C154337d0(this, 1);
        this.A01 = new C1898592x(this, 0);
        this.A00 = new C1894591j(1);
    }

    public MessageGifVideoPlayer(Context context) {
        super(context);
        A01();
        this.A0F = false;
        this.A0E = false;
        this.A0G = new C154337d0(this, 1);
        this.A01 = new C1898592x(this, 0);
        this.A00 = new C1894591j(1);
    }
}
