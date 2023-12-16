package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.85y  reason: invalid class name and case insensitive filesystem */
public final class C1685785y implements C186488vR, C186238uy, C186248uz, C180748lZ, C180698lU, TextureView.SurfaceTextureListener, SurfaceHolder.Callback, C177938gh, C177948gi, C178028gq {
    public final /* synthetic */ AnonymousClass6OD A00;

    public C1685785y(AnonymousClass6OD r1) {
        this.A00 = r1;
    }

    public void BMm(long j, String str, long j2) {
        this.A00.A0R.BMm(j, str, j2);
    }

    public void BMn(String str) {
        this.A00.A0R.BMn(str);
    }

    public void BMo(C150277Pz r3) {
        AnonymousClass6OD r1 = this.A00;
        r1.A0R.BMo(r3);
        r1.A07 = null;
        r1.A0A = null;
    }

    public void BMp(C150277Pz r2) {
        AnonymousClass6OD r0 = this.A00;
        r0.A0A = r2;
        r0.A0R.BMp(r2);
    }

    public void BMq(C166527yp r2, C151887Wr r3) {
        AnonymousClass6OD r0 = this.A00;
        r0.A07 = r2;
        r0.A0R.BMq(r2, r3);
    }

    public void BMs(long j) {
        this.A00.A0R.BMs(j);
    }

    public void BMt(Exception exc) {
        this.A00.A0R.BMt(exc);
    }

    public void BMu(int i, long j, long j2) {
        this.A00.A0R.BMu(i, j, j2);
    }

    public void BQU(List list) {
        AnonymousClass6OD r0 = this.A00;
        r0.A0D = list;
        Iterator it = r0.A0V.iterator();
        while (it.hasNext()) {
            ((C180748lZ) it.next()).BQU(list);
        }
    }

    public void BRh(int i, long j) {
        this.A00.A0R.BRh(i, j);
    }

    public void BSZ(boolean z) {
        AnonymousClass6OD.A00(this.A00);
    }

    public void BUm(boolean z) {
    }

    public /* synthetic */ void BUn(boolean z) {
    }

    public void BWk(C166547ys r6) {
        AnonymousClass6OD r4 = this.A00;
        C1685685x r3 = r4.A0R;
        AnonymousClass7XD A01 = C158187jZ.A01(r3);
        r3.A03(A01, new C1895291q(r6, 2, A01), 1007);
        Iterator it = r4.A0U.iterator();
        while (it.hasNext()) {
            ((C180698lU) it.next()).BWk(r6);
        }
    }

    public void BYA(boolean z, int i) {
        AnonymousClass6OD.A00(this.A00);
    }

    public /* synthetic */ void BYE(C158477k2 r1) {
    }

    public void BYI(int i) {
        AnonymousClass6OD.A00(this.A00);
    }

    public /* synthetic */ void BYJ(int i) {
    }

    public /* synthetic */ void BYK(C143886zd r1) {
    }

    public /* synthetic */ void BYS(int i) {
    }

    public void BZt(Surface surface) {
        AnonymousClass6OD r1 = this.A00;
        r1.A0R.BZt(surface);
        if (r1.A04 == surface) {
            Iterator it = r1.A0W.iterator();
            while (it.hasNext()) {
                ((C110945hI) ((C178308hK) it.next())).A00.A06.setVisibility(8);
            }
        }
    }

    public /* synthetic */ void Bb4() {
    }

    public void Bbk(boolean z) {
        AnonymousClass6OD r1 = this.A00;
        if (r1.A0H != z) {
            r1.A0H = z;
            r1.A0R.Bbk(z);
            Iterator it = r1.A0S.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass001.A0g("onSkipSilenceEnabledChanged");
            }
        }
    }

    public /* synthetic */ void BcO(List list) {
    }

    public void BfH(long j, String str, long j2) {
        this.A00.A0R.BfH(j, str, j2);
    }

    public void BfI(String str) {
        this.A00.A0R.BfI(str);
    }

    public void BfJ(C150277Pz r3) {
        AnonymousClass6OD r1 = this.A00;
        r1.A0R.BfJ(r3);
        r1.A08 = null;
        r1.A0B = null;
    }

    public void BfK(C150277Pz r2) {
        AnonymousClass6OD r0 = this.A00;
        r0.A0B = r2;
        r0.A0R.BfK(r2);
    }

    public void BfM(long j, int i) {
        this.A00.A0R.BfM(j, i);
    }

    public void BfN(C166527yp r2, C151887Wr r3) {
        AnonymousClass6OD r0 = this.A00;
        r0.A08 = r2;
        r0.A0R.BfN(r2, r3);
    }

    public void BfR(float f, int i, int i2, int i3) {
        AspectRatioFrameLayout aspectRatioFrameLayout;
        float f2;
        float f3;
        AnonymousClass6OD r1 = this.A00;
        r1.A0R.BfR(f, i, i2, i3);
        Iterator it = r1.A0W.iterator();
        while (it.hasNext()) {
            C18260x0.A0y("WAExoPlayerView/onVideoSizeChanged/unappliedRotationDegrees=", AnonymousClass001.A0o(), i3);
            C138426qL r2 = ((C110945hI) ((C178308hK) it.next())).A00;
            float f4 = 1.0f;
            if (!r2.A09) {
                ((AnonymousClass6EZ) r2.A07).setRotationAngle(i3);
                if (i3 == 90 || i3 == 270) {
                    aspectRatioFrameLayout = r2.A08;
                    if (i2 != 0) {
                        f2 = (float) i2;
                        f3 = ((float) i) * f;
                        f4 = f2 / f3;
                        aspectRatioFrameLayout.setAspectRatio(f4);
                    } else {
                        aspectRatioFrameLayout.setAspectRatio(f4);
                    }
                }
            }
            aspectRatioFrameLayout = r2.A08;
            if (i2 != 0) {
                f2 = ((float) i) * f;
                f3 = (float) i2;
                f4 = f2 / f3;
                aspectRatioFrameLayout.setAspectRatio(f4);
            } else {
                aspectRatioFrameLayout.setAspectRatio(f4);
            }
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        AnonymousClass6OD r2 = this.A00;
        r2.A07(new Surface(surfaceTexture), true);
        r2.A05(i, i2);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        AnonymousClass6OD r2 = this.A00;
        r2.A07((Surface) null, true);
        r2.A05(0, 0);
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A00.A05(i, i2);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.A00.A05(i2, i3);
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.A00.A07(surfaceHolder.getSurface(), false);
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        AnonymousClass6OD r2 = this.A00;
        r2.A07((Surface) null, false);
        r2.A05(0, 0);
    }

    public /* synthetic */ void BW7(C151877Wq r1, int i) {
    }

    public /* synthetic */ void BYM(boolean z, int i) {
    }

    public /* synthetic */ void Be5(Timeline timeline, int i) {
        AnonymousClass727.A00(this, timeline, i);
    }

    public /* synthetic */ void BeS(C166387yb r1, C151537Ve r2) {
    }

    public /* synthetic */ void Be6(Timeline timeline, Object obj, int i) {
    }
}
