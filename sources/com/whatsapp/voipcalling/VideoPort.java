package com.whatsapp.voipcalling;

import X.AnonymousClass7X0;
import X.C179818jl;
import X.C179828jm;
import android.content.Context;
import android.graphics.Point;
import android.view.SurfaceHolder;

public interface VideoPort {
    public static final int ERROR_CREATE_EGL = -5;
    public static final int ERROR_CREATE_RENDERER = -2;
    public static final int ERROR_NO_EGL = -6;
    public static final int ERROR_NO_SURFACE = -1;
    public static final int ERROR_POST_TO_LOOPER = -100;
    public static final int ERROR_STALE_TEXTURE = -7;
    public static final int ERROR_SWAP_BUFFERS = -3;
    public static final int ERROR_UPDATE_WINDOW_SIZE = -4;
    public static final int SUCCESS = 0;

    AnonymousClass7X0 createSurfaceTexture();

    @Deprecated
    Context getContext();

    @Deprecated
    SurfaceHolder getSurfaceHolder();

    @Deprecated
    Point getWindowSize();

    void release();

    void releaseSurfaceTexture(AnonymousClass7X0 r1);

    int renderNativeFrame(long j, int i, int i2, int i3, int i4, int i5);

    void renderTexture(AnonymousClass7X0 r1, int i, int i2);

    int resetBlackScreen();

    void setCornerRadius(float f);

    void setListener(C179828jm r1);

    void setPassthroughVideoPortCallback(C179818jl r1);

    int setScaleType(int i);
}
