package com.whatsapp.inappsupportbloks.components;

import X.AnonymousClass001;
import X.AnonymousClass4FS;
import X.AnonymousClass4GJ;
import X.AnonymousClass64L;
import X.AnonymousClass7PC;
import X.AnonymousClass8E8;
import X.C107235av;
import X.C111095hX;
import X.C116855qy;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18310x6;
import X.C29441ip;
import X.C60132y3;
import X.C64333Db;
import X.C69263Wi;
import X.C70083Zv;
import X.C71513cE;
import X.C88864av;
import X.C89644eZ;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;
import java.util.Formatter;
import java.util.Locale;

public final class BloksSupportVideoView extends ConstraintLayout implements AnonymousClass4GJ {
    public int A00;
    public C69263Wi A01;
    public WaImageView A02;
    public WaImageView A03;
    public WaTextView A04;
    public AnonymousClass64L A05;
    public C29441ip A06;
    public AnonymousClass7PC A07;
    public AnonymousClass4FS A08;
    public C116855qy A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public boolean A0E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BloksSupportVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        A05();
        this.A05 = new AnonymousClass8E8(this);
        A06();
    }

    public static final void setVideoThumbnail$lambda$4$lambda$3(BloksSupportVideoView bloksSupportVideoView, Bitmap bitmap) {
        C162457s7.A0J(bloksSupportVideoView, 0);
        WaImageView waImageView = bloksSupportVideoView.A03;
        if (waImageView == null) {
            throw C18270x1.A0S("videoThumbnail");
        }
        waImageView.setImageBitmap(bitmap);
    }

    public final void A07(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        long j;
        C162457s7.A0J(str, 0);
        if (str2 != null) {
            int A002 = C60132y3.A00(getConnectivityStateProvider().A0A());
            if (A002 == 2 || A002 == 3 || A002 == 4) {
                Log.i("BloksSupportVideoView/getVideoUrlByNetworkType: use hdVideoUrl");
            } else {
                Log.i("BloksSupportVideoView/getVideoUrlByNetworkType: use sdVideoUrl");
                str = str2;
            }
        }
        this.A0D = str;
        this.A0A = str3;
        this.A0B = str4;
        this.A0C = str5;
        if (num != null) {
            j = (long) num.intValue();
        } else {
            j = 1000;
        }
        setVideoInformation(j);
        AnonymousClass7PC supportVideoLogger = getSupportVideoLogger();
        supportVideoLogger.A01 = C18280x3.A0Y();
        supportVideoLogger.A02 = str6;
        supportVideoLogger.A04 = str7;
        supportVideoLogger.A03 = str5;
        supportVideoLogger.A00 = str4;
    }

    public final void setConnectivityStateProvider(C29441ip r2) {
        C162457s7.A0J(r2, 0);
        this.A06 = r2;
    }

    public final void setGlobalUI(C69263Wi r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    public final void setSupportVideoLogger(AnonymousClass7PC r2) {
        C162457s7.A0J(r2, 0);
        this.A07 = r2;
    }

    public final void setWaWorkers(AnonymousClass4FS r2) {
        C162457s7.A0J(r2, 0);
        this.A08 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        if (r5 == null) goto L_0x000a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(com.whatsapp.inappsupportbloks.components.BloksSupportVideoView r6, long r7) {
        /*
            java.lang.String r4 = r6.A0D
            if (r4 != 0) goto L_0x000b
            java.lang.String r0 = "videoUrl"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
        L_0x000a:
            throw r0
        L_0x000b:
            r5 = 0
            r2 = 0
            X.6DM r1 = new X.6DM     // Catch:{ Exception -> 0x002d }
            r1.<init>()     // Catch:{ Exception -> 0x002d }
            java.util.HashMap r0 = X.AnonymousClass001.A0t()     // Catch:{ Exception -> 0x002d }
            r1.setDataSource(r4, r0)     // Catch:{ Exception -> 0x002d }
            r0 = 9
            java.lang.String r0 = r1.extractMetadata(r0)     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            if (r0 == 0) goto L_0x003f
            long r2 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            goto L_0x003f
        L_0x0027:
            r0 = move-exception
            r5 = r1
            goto L_0x003b
        L_0x002a:
            r4 = move-exception
            r5 = r1
            goto L_0x002e
        L_0x002d:
            r4 = move-exception
        L_0x002e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0038 }
            java.lang.String r0 = "BloksSupportVideoView/retrieveVideoDuration: "
            X.C18260x0.A16(r0, r1, r4)     // Catch:{ all -> 0x0038 }
            goto L_0x0043
        L_0x0038:
            r0 = move-exception
            if (r5 == 0) goto L_0x000a
        L_0x003b:
            r5.release()
            throw r0
        L_0x003f:
            r1.release()
            goto L_0x0048
        L_0x0043:
            if (r5 == 0) goto L_0x0048
            r5.release()
        L_0x0048:
            r4 = 0
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0055
            r6.setVideoThumbnail(r4)
        L_0x0051:
            r6.setVideoDuration(r2)
            return
        L_0x0055:
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x005d
            r0 = 2
            long r7 = r2 / r0
        L_0x005d:
            r6.setVideoThumbnail(r7)
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.inappsupportbloks.components.BloksSupportVideoView.A00(com.whatsapp.inappsupportbloks.components.BloksSupportVideoView, long):void");
    }

    public void A05() {
        if (!this.A0E) {
            this.A0E = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A01 = C64333Db.A04(A002);
            this.A08 = C64333Db.A8y(A002);
            this.A06 = C64333Db.A24(A002);
            this.A07 = (AnonymousClass7PC) A002.A00.ABX.get();
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A09;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A09 = r0;
        }
        return r0.generatedComponent();
    }

    public final C29441ip getConnectivityStateProvider() {
        C29441ip r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("connectivityStateProvider");
    }

    public final C69263Wi getGlobalUI() {
        C69263Wi r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("globalUI");
    }

    public final AnonymousClass7PC getSupportVideoLogger() {
        AnonymousClass7PC r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("supportVideoLogger");
    }

    public final AnonymousClass4FS getWaWorkers() {
        AnonymousClass4FS r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("waWorkers");
    }

    private final void setVideoDuration(long j) {
        getGlobalUI().A0S(new C71513cE(this, AnonymousClass001.A0o(), new Formatter(AnonymousClass001.A0o(), Locale.getDefault()), 6, j));
    }

    private final void setVideoInformation(long j) {
        getWaWorkers().BkM(new C70083Zv(this, j, 14));
    }

    private final void setVideoThumbnail(long j) {
        getWaWorkers().BkM(new C70083Zv(this, j, 15));
    }

    public final void A06() {
        View inflate = View.inflate(getContext(), R.layout.f8nameremoved, this);
        C107235av.A03(inflate.findViewById(R.id.rootView), getResources().getDimension(R.dimen.f6nameremoved));
        this.A03 = (WaImageView) C18290x4.A0M(inflate, R.id.video_thumbnail);
        this.A02 = (WaImageView) C18290x4.A0M(inflate, R.id.play_button);
        C89644eZ r2 = (C89644eZ) C111095hX.A04(this);
        r2.A6w(this.A05);
        WaImageView waImageView = this.A02;
        if (waImageView == null) {
            throw C18270x1.A0S("playButton");
        }
        C18310x6.A19(waImageView, r2, this, 23);
        this.A04 = (WaTextView) C18290x4.A0M(inflate, R.id.duration_text);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BloksSupportVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        A05();
        this.A05 = new AnonymousClass8E8(this);
        A06();
    }

    public BloksSupportVideoView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A05();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BloksSupportVideoView(Context context) {
        super(context);
        C162457s7.A0J(context, 1);
        A05();
        this.A05 = new AnonymousClass8E8(this);
        A06();
    }
}
