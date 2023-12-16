package com.whatsapp.videoplayback;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass6EX;
import X.AnonymousClass91N;
import X.C162927sz;
import X.C18260x0;
import X.C1892790r;
import X.C1894291g;
import X.C1898592x;
import X.C626936e;
import X.C627536m;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.MediaController;
import com.whatsapp.GifHelper;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map;

public class VideoSurfaceView extends AnonymousClass6EX implements MediaController.MediaPlayerControl {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public MediaPlayer.OnCompletionListener A09;
    public MediaPlayer.OnErrorListener A0A;
    public MediaPlayer.OnPreparedListener A0B;
    public MediaPlayer A0C;
    public Uri A0D;
    public SurfaceHolder A0E;
    public Map A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final MediaPlayer.OnBufferingUpdateListener A0L = new C162927sz(this);
    public final MediaPlayer.OnCompletionListener A0M = new C1892790r(this, 2);
    public final MediaPlayer.OnErrorListener A0N = new C1894291g(this, 2);
    public final MediaPlayer.OnPreparedListener A0O = new C1898592x(this, 1);
    public final MediaPlayer.OnVideoSizeChangedListener A0P = AnonymousClass6EX.A00(this);
    public final SurfaceHolder.Callback A0Q = new AnonymousClass91N(this, 2);

    public final void A01() {
        this.A08 = 0;
        this.A07 = 0;
        getHolder().addCallback(this.A0Q);
        getHolder().setType(3);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.A02 = 0;
        this.A06 = 0;
    }

    public void A00() {
        MediaPlayer mediaPlayer = this.A0C;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.A0C.release();
            this.A0C = null;
            this.A02 = 0;
            this.A06 = 0;
        }
    }

    public final void A02() {
        Uri uri = this.A0D;
        if (uri != null && this.A0E != null) {
            File A042 = C627536m.A04(uri);
            if (A042 == null || !A042.exists() || !GifHelper.A01(A042)) {
                Intent A092 = AnonymousClass0x9.A09("com.android.music.musicservicecommand");
                A092.putExtra("command", "pause");
                getContext().sendBroadcast(A092);
            }
            MediaPlayer mediaPlayer = this.A0C;
            if (mediaPlayer != null) {
                mediaPlayer.reset();
                this.A0C.release();
                this.A0C = null;
                this.A02 = 0;
            }
            try {
                MediaPlayer mediaPlayer2 = new MediaPlayer();
                this.A0C = mediaPlayer2;
                int i = this.A00;
                if (i != 0) {
                    mediaPlayer2.setAudioSessionId(i);
                } else {
                    this.A00 = mediaPlayer2.getAudioSessionId();
                }
                if (this.A0K) {
                    this.A0C.setVolume(0.0f, 0.0f);
                }
                if (this.A0J) {
                    this.A0C.setLooping(true);
                }
                this.A0C.setOnPreparedListener(this.A0O);
                this.A0C.setOnVideoSizeChangedListener(this.A0P);
                this.A0C.setOnCompletionListener(this.A0M);
                this.A0C.setOnErrorListener(this.A0N);
                this.A0C.setOnBufferingUpdateListener(this.A0L);
                this.A01 = 0;
                this.A0C.setDataSource(getContext(), this.A0D, this.A0F);
                this.A0C.setDisplay(this.A0E);
                this.A0C.setAudioStreamType(3);
                this.A0C.setScreenOnWhilePlaying(true);
                this.A0C.prepareAsync();
                this.A02 = 1;
            } catch (IOException | IllegalArgumentException e) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("videoview/ Unable to open content: ");
                Log.w(AnonymousClass000.A0R(this.A0D, A0o), e);
                this.A02 = -1;
                this.A06 = -1;
                this.A0N.onError(this.A0C, 1, 0);
            }
        }
    }

    public boolean A04() {
        int i;
        if (this.A0C == null || (i = this.A02) == -1 || i == 0 || i == 1) {
            return false;
        }
        return true;
    }

    public boolean canPause() {
        return this.A0G;
    }

    public boolean canSeekBackward() {
        return this.A0H;
    }

    public boolean canSeekForward() {
        return this.A0I;
    }

    public int getAudioSessionId() {
        if (this.A00 == 0) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.A00 = mediaPlayer.getAudioSessionId();
            mediaPlayer.release();
        }
        return this.A00;
    }

    public int getBufferPercentage() {
        if (this.A0C != null) {
            return this.A01;
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007b, code lost:
        if (r2 > r5) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            int r0 = r7.A08
            int r5 = android.view.View.getDefaultSize(r0, r8)
            int r0 = r7.A07
            int r4 = android.view.View.getDefaultSize(r0, r9)
            int r0 = r7.A08
            if (r0 <= 0) goto L_0x003d
            int r0 = r7.A07
            if (r0 <= 0) goto L_0x003d
            int r6 = android.view.View.MeasureSpec.getMode(r8)
            int r5 = android.view.View.MeasureSpec.getSize(r8)
            int r2 = android.view.View.MeasureSpec.getMode(r9)
            int r4 = android.view.View.MeasureSpec.getSize(r9)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r6 != r0) goto L_0x0060
            if (r2 != r0) goto L_0x0060
            int r1 = r7.A08
            int r1 = r1 * r4
            int r0 = r7.A07
            int r0 = r0 * r5
            if (r1 >= r0) goto L_0x0052
            java.lang.String r0 = "videoview/ image too wide, correcting"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            int r5 = r7.A08
            int r5 = r5 * r4
            int r0 = r7.A07
            int r5 = r5 / r0
        L_0x003d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "videoview/setMeasuredDimension: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "x"
            X.C18260x0.A0y(r0, r1, r4)
            r7.setMeasuredDimension(r5, r4)
            return
        L_0x0052:
            if (r1 <= r0) goto L_0x003d
            java.lang.String r0 = "videoview/ image too tall, correcting"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            int r4 = r7.A07
            int r4 = r4 * r5
            int r0 = r7.A08
            int r4 = r4 / r0
            goto L_0x003d
        L_0x0060:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 != r0) goto L_0x0071
            int r1 = r7.A07
            int r1 = r1 * r5
            int r0 = r7.A08
            int r1 = r1 / r0
            if (r2 != r3) goto L_0x006f
            if (r1 <= r4) goto L_0x006f
            goto L_0x003d
        L_0x006f:
            r4 = r1
            goto L_0x003d
        L_0x0071:
            if (r2 != r0) goto L_0x007e
            int r2 = r7.A08
            int r2 = r2 * r4
            int r0 = r7.A07
            int r2 = r2 / r0
            if (r6 != r3) goto L_0x0094
            if (r2 <= r5) goto L_0x0094
            goto L_0x003d
        L_0x007e:
            int r1 = r7.A08
            int r0 = r7.A07
            if (r2 != r3) goto L_0x0091
            if (r0 <= r4) goto L_0x0091
            int r2 = r4 * r1
            int r2 = r2 / r0
        L_0x0089:
            if (r6 != r3) goto L_0x0094
            if (r2 <= r5) goto L_0x0094
            int r0 = r0 * r5
            int r4 = r0 / r1
            goto L_0x003d
        L_0x0091:
            r2 = r1
            r4 = r0
            goto L_0x0089
        L_0x0094:
            r5 = r2
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.videoplayback.VideoSurfaceView.onMeasure(int, int):void");
    }

    public void setLooping(boolean z) {
        this.A0J = z;
        MediaPlayer mediaPlayer = this.A0C;
        if (mediaPlayer != null) {
            mediaPlayer.setLooping(z);
        }
    }

    public void setMute(boolean z) {
        this.A0K = z;
        MediaPlayer mediaPlayer = this.A0C;
        if (mediaPlayer != null) {
            float f = 1.0f;
            if (z) {
                f = 0.0f;
            }
            mediaPlayer.setVolume(f, f);
        }
    }

    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        this.A09 = onCompletionListener;
    }

    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
        this.A0A = onErrorListener;
    }

    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        this.A0B = onPreparedListener;
    }

    public void setVideoURI(Uri uri, Map map) {
        this.A0D = uri;
        this.A0F = map;
        this.A03 = -1;
        A02();
        requestLayout();
        invalidate();
    }

    public VideoSurfaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
    }

    public void A03(int i, int i2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("videoview/setVideoDimensions: ");
        A0o.append(i);
        C18260x0.A0y("x", A0o, i2);
        this.A08 = i;
        this.A07 = i2;
    }

    public int getCurrentPosition() {
        if (!A04()) {
            return 0;
        }
        MediaPlayer mediaPlayer = this.A0C;
        C626936e.A06(mediaPlayer);
        return mediaPlayer.getCurrentPosition();
    }

    public int getDuration() {
        if (!A04()) {
            return -1;
        }
        MediaPlayer mediaPlayer = this.A0C;
        C626936e.A06(mediaPlayer);
        return mediaPlayer.getDuration();
    }

    public boolean isPlaying() {
        if (A04()) {
            MediaPlayer mediaPlayer = this.A0C;
            C626936e.A06(mediaPlayer);
            if (!mediaPlayer.isPlaying()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(VideoSurfaceView.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(VideoSurfaceView.class.getName());
    }

    public void pause() {
        if (A04()) {
            MediaPlayer mediaPlayer = this.A0C;
            C626936e.A06(mediaPlayer);
            if (mediaPlayer.isPlaying()) {
                this.A0C.pause();
                this.A02 = 4;
            }
        }
        this.A06 = 4;
    }

    public void seekTo(int i) {
        if (A04()) {
            MediaPlayer mediaPlayer = this.A0C;
            C626936e.A06(mediaPlayer);
            mediaPlayer.seekTo(i);
            i = -1;
        }
        this.A03 = i;
    }

    public void setVideoPath(String str) {
        setVideoURI(Uri.parse(str), (Map) null);
    }

    public void start() {
        if (A04()) {
            MediaPlayer mediaPlayer = this.A0C;
            C626936e.A06(mediaPlayer);
            mediaPlayer.start();
            this.A02 = 3;
        }
        this.A06 = 3;
    }

    public VideoSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }

    public void setVideoURI(Uri uri) {
        setVideoURI(uri, (Map) null);
    }

    public VideoSurfaceView(Context context) {
        super(context);
        A01();
    }
}
