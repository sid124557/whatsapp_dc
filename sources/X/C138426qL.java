package X;

import android.content.Context;
import com.google.android.exoplayer2.ui.SubtitleView;
import com.whatsapp.R;

/* renamed from: X.6qL  reason: invalid class name and case insensitive filesystem */
public final class C138426qL extends AnonymousClass562 {
    public AnonymousClass6OD A00;
    public boolean A01;
    public final SubtitleView A02;
    public final C110945hI A03 = new C110945hI(this);

    public void A00() {
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public void setCaptionsEnabled(boolean z) {
        this.A02.setVisibility(AnonymousClass001.A08(z ? 1 : 0));
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setPlayer(X.AnonymousClass6OD r7) {
        /*
            r6 = this;
            X.6OD r0 = r6.A00
            if (r0 == 0) goto L_0x0027
            X.5hI r1 = r6.A03
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A0V
            r0.remove(r1)
            X.6OD r0 = r6.A00
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A0W
            r0.remove(r1)
            X.6OD r0 = r6.A00
            r0.BjC(r1)
            X.6OD r2 = r6.A00
            r1 = 0
            r2.A03()
            r2.A02()
            r0 = 0
            r2.A07(r1, r0)
            r2.A05(r0, r0)
        L_0x0027:
            r6.A00 = r7
            r2 = 0
            if (r7 == 0) goto L_0x00eb
            boolean r0 = r6.A09
            android.view.View r5 = r6.A07
            if (r0 == 0) goto L_0x0099
            android.view.SurfaceView r5 = (android.view.SurfaceView) r5
            r7.A03()
            if (r5 != 0) goto L_0x0094
            r4 = 0
        L_0x003a:
            r7.A03()
            r7.A02()
            r3 = 0
            if (r4 == 0) goto L_0x0049
            r1 = 2
            r0 = 8
            r7.A09(r3, r1, r0)
        L_0x0049:
            r7.A05 = r4
            if (r4 != 0) goto L_0x006f
            r7.A07(r3, r2)
        L_0x0050:
            r7.A05(r2, r2)
        L_0x0053:
            X.5hI r1 = r6.A03
            r1.getClass()
            java.util.concurrent.CopyOnWriteArraySet r0 = r7.A0W
            r0.add(r1)
            r7.AwU(r1)
            java.util.concurrent.CopyOnWriteArraySet r0 = r7.A0V
            r0.add(r1)
            X.561 r0 = r6.A02
            if (r0 == 0) goto L_0x006c
            r0.setPlayer(r7)
        L_0x006c:
            r6.A05 = r2
            return
        L_0x006f:
            X.85y r0 = r7.A0N
            r4.addCallback(r0)
            android.view.Surface r1 = r4.getSurface()
            if (r1 == 0) goto L_0x0090
            boolean r0 = r1.isValid()
            if (r0 == 0) goto L_0x0090
            r7.A07(r1, r2)
            android.graphics.Rect r0 = r4.getSurfaceFrame()
            int r1 = r0.width()
            int r0 = r0.height()
            goto L_0x00e1
        L_0x0090:
            r7.A07(r3, r2)
            goto L_0x0050
        L_0x0094:
            android.view.SurfaceHolder r4 = r5.getHolder()
            goto L_0x003a
        L_0x0099:
            android.view.TextureView r5 = (android.view.TextureView) r5
            r7.A03()
            r7.A02()
            r4 = 0
            if (r5 == 0) goto L_0x00aa
            r1 = 2
            r0 = 8
            r7.A09(r4, r1, r0)
        L_0x00aa:
            r7.A06 = r5
            r3 = 1
            if (r5 != 0) goto L_0x00b3
            r7.A07(r4, r3)
            goto L_0x0050
        L_0x00b3:
            android.view.TextureView$SurfaceTextureListener r0 = r5.getSurfaceTextureListener()
            if (r0 == 0) goto L_0x00c0
            java.lang.String r1 = "SimpleExoPlayer"
            java.lang.String r0 = "Replacing existing SurfaceTextureListener."
            android.util.Log.w(r1, r0)
        L_0x00c0:
            X.85y r0 = r7.A0N
            r5.setSurfaceTextureListener(r0)
            boolean r0 = r5.isAvailable()
            if (r0 == 0) goto L_0x00e6
            android.graphics.SurfaceTexture r1 = r5.getSurfaceTexture()
            if (r1 == 0) goto L_0x00e6
            android.view.Surface r0 = new android.view.Surface
            r0.<init>(r1)
            r7.A07(r0, r3)
            int r1 = r5.getWidth()
            int r0 = r5.getHeight()
        L_0x00e1:
            r7.A05(r1, r0)
            goto L_0x0053
        L_0x00e6:
            r7.A07(r4, r3)
            goto L_0x0050
        L_0x00eb:
            android.view.View r0 = r6.A06
            r0.setVisibility(r2)
            goto L_0x006c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C138426qL.setPlayer(X.6OD):void");
    }

    public C138426qL(Context context, boolean z) {
        super(context, z);
        A00();
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.subtitles);
        this.A02 = subtitleView;
        subtitleView.A00();
        subtitleView.A01();
    }

    public void A01(AnonymousClass561 r3, boolean z) {
        AnonymousClass6OD r0;
        super.A01(r3, z);
        AnonymousClass561 r1 = this.A02;
        if (r1 != null && (r0 = this.A00) != null) {
            r1.setPlayer(r0);
        }
    }
}
