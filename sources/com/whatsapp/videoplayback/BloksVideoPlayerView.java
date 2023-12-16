package com.whatsapp.videoplayback;

import X.AnonymousClass1VX;
import X.AnonymousClass4GJ;
import X.C116855qy;
import X.C138386qG;
import X.C152437Yw;
import X.C153407bG;
import X.C162457s7;
import X.C18270x1;
import X.C18290x4;
import X.C54292oU;
import X.C55682qk;
import X.C620633i;
import X.C64333Db;
import X.C69263Wi;
import X.C88864av;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.whatsapp.Mp4Ops;
import com.whatsapp.R;

public final class BloksVideoPlayerView extends FrameLayout implements AnonymousClass4GJ {
    public ViewTreeObserver.OnScrollChangedListener A00;
    public C55682qk A01;
    public C69263Wi A02;
    public Mp4Ops A03;
    public C153407bG A04;
    public C620633i A05;
    public C54292oU A06;
    public AnonymousClass1VX A07;
    public ExoPlayerErrorFrame A08;
    public C138386qG A09;
    public C152437Yw A0A;
    public C116855qy A0B;
    public boolean A0C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BloksVideoPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        A00();
        this.A0A = new C152437Yw(false, false, false);
        A01();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(android.app.Activity r12, X.C152507Zd r13) {
        /*
            r11 = this;
            r1 = 0
            android.net.Uri r0 = r13.A01
            if (r0 != 0) goto L_0x0009
            android.net.Uri r0 = r13.A00
            if (r0 == 0) goto L_0x0094
        L_0x0009:
            X.6qG r2 = r11.A09
            if (r2 != 0) goto L_0x0095
            X.1VX r9 = r11.getAbProps()
            X.3Wi r4 = r11.getGlobalUI()
            X.33i r7 = r11.getSystemServices()
            android.content.Context r2 = r11.getContext()
            X.2oU r8 = r11.getWaContext()
            com.whatsapp.Mp4Ops r5 = r11.getMp4Ops()
            X.2qk r3 = r11.getCrashLogs()
            X.7bG r6 = r11.getWamediaWamLogger()
            java.lang.String r10 = r0.toString()
            X.5YG r2 = X.AnonymousClass5VT.A00(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.videoplayback.ExoPlayerVideoPlayer"
            X.C162457s7.A0K(r2, r0)
            X.6qG r2 = (X.C138386qG) r2
            r11.A09 = r2
            if (r2 != 0) goto L_0x0095
            r2 = 0
        L_0x0041:
            android.widget.FrameLayout$LayoutParams r0 = X.C86664Kz.A0q()
            r11.addView(r2, r1, r0)
            boolean r3 = r13.A02
            if (r3 == 0) goto L_0x005b
            r0 = 1
            X.90n r2 = new X.90n
            r2.<init>(r11, r0)
            android.view.ViewTreeObserver r0 = r11.getViewTreeObserver()
            r0.addOnScrollChangedListener(r2)
            r11.A00 = r2
        L_0x005b:
            X.6qG r2 = r11.A09
            if (r2 == 0) goto L_0x0068
            boolean r0 = r13.A03
            r2.A0C = r0
            boolean r0 = r13.A04
            r2.A0Z(r0)
        L_0x0068:
            X.6qG r0 = r11.A09
            if (r0 == 0) goto L_0x006f
            r0.A0Q(r1)
        L_0x006f:
            X.6qG r0 = r11.A09
            if (r0 == 0) goto L_0x0076
            r0.A0J()
        L_0x0076:
            X.7Yw r0 = r11.A0A
            r2 = 1
            boolean r1 = r0.A02
            X.7Yw r0 = new X.7Yw
            r0.<init>(r3, r1, r2)
            r11.A0A = r0
            r11.A02()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 <= r0) goto L_0x0094
            r1 = 2
            X.92H r0 = new X.92H
            r0.<init>(r11, r1)
            r12.registerActivityLifecycleCallbacks(r0)
        L_0x0094:
            return
        L_0x0095:
            android.view.View r2 = r2.A09()
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.videoplayback.BloksVideoPlayerView.A03(android.app.Activity, X.7Zd):void");
    }

    public final void setAbProps(AnonymousClass1VX r2) {
        C162457s7.A0J(r2, 0);
        this.A07 = r2;
    }

    public final void setCrashLogs(C55682qk r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    public final void setExoPlayerErrorElements(ExoPlayerErrorFrame exoPlayerErrorFrame) {
        C162457s7.A0J(exoPlayerErrorFrame, 0);
        this.A08 = exoPlayerErrorFrame;
    }

    public final void setGlobalUI(C69263Wi r2) {
        C162457s7.A0J(r2, 0);
        this.A02 = r2;
    }

    public final void setMp4Ops(Mp4Ops mp4Ops) {
        C162457s7.A0J(mp4Ops, 0);
        this.A03 = mp4Ops;
    }

    public final void setSystemServices(C620633i r2) {
        C162457s7.A0J(r2, 0);
        this.A05 = r2;
    }

    public final void setWaContext(C54292oU r2) {
        C162457s7.A0J(r2, 0);
        this.A06 = r2;
    }

    public final void setWamediaWamLogger(C153407bG r2) {
        C162457s7.A0J(r2, 0);
        this.A04 = r2;
    }

    public void A00() {
        if (!this.A0C) {
            this.A0C = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A02 = C64333Db.A04(A002);
            this.A05 = C64333Db.A2o(A002);
            this.A06 = C64333Db.A2q(A002);
            this.A03 = (Mp4Ops) A002.AN5.get();
            this.A07 = C64333Db.A4B(A002);
            this.A01 = C64333Db.A01(A002);
            this.A04 = (C153407bG) A002.AbG.get();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r0 == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r2 = this;
            X.7Yw r1 = r2.A0A
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x000f
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x000f
            boolean r0 = r1.A02
            r1 = 1
            if (r0 != 0) goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            X.6qG r0 = r2.A09
            if (r1 == 0) goto L_0x001a
            if (r0 == 0) goto L_0x0019
            r0.A0F()
        L_0x0019:
            return
        L_0x001a:
            if (r0 == 0) goto L_0x0019
            r0.A0C()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.videoplayback.BloksVideoPlayerView.A02():void");
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0B;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0B = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1VX getAbProps() {
        AnonymousClass1VX r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0R();
    }

    public final C55682qk getCrashLogs() {
        C55682qk r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("crashLogs");
    }

    public final ExoPlayerErrorFrame getExoPlayerErrorElements() {
        ExoPlayerErrorFrame exoPlayerErrorFrame = this.A08;
        if (exoPlayerErrorFrame != null) {
            return exoPlayerErrorFrame;
        }
        throw C18270x1.A0S("exoPlayerErrorElements");
    }

    public final C69263Wi getGlobalUI() {
        C69263Wi r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("globalUI");
    }

    public final Mp4Ops getMp4Ops() {
        Mp4Ops mp4Ops = this.A03;
        if (mp4Ops != null) {
            return mp4Ops;
        }
        throw C18270x1.A0S("mp4Ops");
    }

    public final C620633i getSystemServices() {
        C620633i r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("systemServices");
    }

    public final C54292oU getWaContext() {
        C54292oU r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("waContext");
    }

    public final C153407bG getWamediaWamLogger() {
        C153407bG r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("wamediaWamLogger");
    }

    public final void A01() {
        setExoPlayerErrorElements((ExoPlayerErrorFrame) C18290x4.A0M(View.inflate(getContext(), R.layout.f8nameremoved, this), R.id.exoplayer_error_elements));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BloksVideoPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        A00();
        this.A0A = new C152437Yw(false, false, false);
        A01();
    }

    public BloksVideoPlayerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A00();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BloksVideoPlayerView(Context context) {
        super(context);
        C162457s7.A0J(context, 1);
        A00();
        this.A0A = new C152437Yw(false, false, false);
        A01();
    }
}
