package androidx.car.app.utils;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0O9;
import X.AnonymousClass0VH;
import X.AnonymousClass0WP;
import X.C06790Zf;
import X.C12560lk;
import X.C14600px;
import X.C18060wg;
import X.C18070wh;
import X.C18090wj;
import android.graphics.Rect;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.ISurfaceCallback;

public class RemoteUtils$SurfaceCallbackStub extends ISurfaceCallback.Stub {
    public final AnonymousClass0O9 mLifecycle;
    public final C14600px mSurfaceCallback;

    public static /* synthetic */ Object $r8$lambda$R9wGpjT6l2l3YCIS8YoCZAVNEAE(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, float f, float f2) {
        throw AnonymousClass001.A0g("onFling");
    }

    public static /* synthetic */ Object $r8$lambda$YhFFBzu8_sntFxFnrwrbCiRiqaQ(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, float f, float f2) {
        throw AnonymousClass001.A0g("onClick");
    }

    public static /* synthetic */ Object $r8$lambda$r4G3KDS1mW6dVVN5X2VGoyvWBMU(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, float f, float f2, float f3) {
        throw AnonymousClass001.A0g("onScale");
    }

    /* renamed from: $r8$lambda$yKsu_zMb-h4L5DkmqvskzvGJj-A  reason: not valid java name */
    public static /* synthetic */ Object m6$r8$lambda$yKsu_zMbh4L5DkmqvskzvGJjA(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, float f, float f2) {
        throw AnonymousClass001.A0g("onScroll");
    }

    private /* synthetic */ Object lambda$onClick$7(float f, float f2) {
        throw AnonymousClass001.A0g("onClick");
    }

    private /* synthetic */ Object lambda$onFling$5(float f, float f2) {
        throw AnonymousClass001.A0g("onFling");
    }

    private /* synthetic */ Object lambda$onScale$6(float f, float f2, float f3) {
        throw AnonymousClass001.A0g("onScale");
    }

    private /* synthetic */ Object lambda$onScroll$4(float f, float f2) {
        throw AnonymousClass001.A0g("onScroll");
    }

    private /* synthetic */ Object lambda$onStableAreaChanged$2(Rect rect) {
        throw AnonymousClass001.A0g("onStableAreaChanged");
    }

    private /* synthetic */ Object lambda$onVisibleAreaChanged$1(Rect rect) {
        throw AnonymousClass001.A0g("onVisibleAreaChanged");
    }

    public void onClick(float f, float f2) {
        AnonymousClass0VH.A01(new C12560lk(new C18060wg(this, f, f2, 2), this.mLifecycle, "onClick"));
    }

    public void onFling(float f, float f2) {
        AnonymousClass0VH.A01(new C12560lk(new C18060wg(this, f, f2, 1), this.mLifecycle, "onFling"));
    }

    public void onScale(float f, float f2, float f3) {
        AnonymousClass0VH.A01(new C12560lk(new C18090wj(this, 8), this.mLifecycle, "onScale"));
    }

    public void onScroll(float f, float f2) {
        AnonymousClass0VH.A01(new C12560lk(new C18060wg(this, f, f2, 0), this.mLifecycle, "onScroll"));
    }

    public void onStableAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
        AnonymousClass0WP.A00(iOnDoneCallback, new C18070wh(rect, 4, this), this.mLifecycle, "onStableAreaChanged");
    }

    public void onSurfaceAvailable(C06790Zf r4, IOnDoneCallback iOnDoneCallback) {
        AnonymousClass0WP.A00(iOnDoneCallback, new C18070wh(r4, 5, this), this.mLifecycle, "onSurfaceAvailable");
    }

    public void onSurfaceDestroyed(C06790Zf r4, IOnDoneCallback iOnDoneCallback) {
        AnonymousClass0WP.A00(iOnDoneCallback, new C18070wh(r4, 3, this), this.mLifecycle, "onSurfaceDestroyed");
    }

    public void onVisibleAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
        AnonymousClass0WP.A00(iOnDoneCallback, new C18070wh(rect, 2, this), this.mLifecycle, "onVisibleAreaChanged");
    }

    public static /* synthetic */ Object $r8$lambda$OZtEIqNp19Tbq1qCTePWz81Lfjw(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, C06790Zf r1) {
        remoteUtils$SurfaceCallbackStub.lambda$onSurfaceDestroyed$3(r1);
        throw AnonymousClass000.A0L();
    }

    public static /* synthetic */ Object $r8$lambda$RGBhsjx_1J8NWgBb4N8Ae6NrbZk(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, C06790Zf r1) {
        remoteUtils$SurfaceCallbackStub.lambda$onSurfaceAvailable$0(r1);
        throw AnonymousClass000.A0L();
    }

    /* renamed from: $r8$lambda$U-s3aqspNPssoqTo05TqqsVHIzE  reason: not valid java name */
    public static /* synthetic */ Object m5$r8$lambda$Us3aqspNPssoqTo05TqqsVHIzE(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, Rect rect) {
        remoteUtils$SurfaceCallbackStub.lambda$onVisibleAreaChanged$1(rect);
        throw AnonymousClass000.A0L();
    }

    public static /* synthetic */ Object $r8$lambda$agkemRv7pRP3C6NQN9BVj2kcidA(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, Rect rect) {
        remoteUtils$SurfaceCallbackStub.lambda$onStableAreaChanged$2(rect);
        throw AnonymousClass000.A0L();
    }

    public RemoteUtils$SurfaceCallbackStub(AnonymousClass0O9 r1, C14600px r2) {
        this.mLifecycle = r1;
        this.mSurfaceCallback = r2;
    }

    private /* synthetic */ Object lambda$onSurfaceAvailable$0(C06790Zf r2) {
        r2.A00();
        throw AnonymousClass001.A0g("onSurfaceAvailable");
    }

    private /* synthetic */ Object lambda$onSurfaceDestroyed$3(C06790Zf r2) {
        r2.A00();
        throw AnonymousClass001.A0g("onSurfaceDestroyed");
    }
}
