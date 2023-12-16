package com.facebook.video.heroplayer.service;

import X.AnonymousClass708;
import X.AnonymousClass7OP;
import X.AnonymousClass85L;
import X.AnonymousClass8LG;
import X.C1444371o;
import X.C1444471p;
import X.C146557As;
import X.C150157Pl;
import X.C152777a6;
import X.C161787qS;
import X.C162457s7;
import X.C166427yf;
import X.C166537yr;
import X.C166637z1;
import X.C177658gE;
import X.C177918gf;
import X.C177928gg;
import X.C18260x0;
import X.C184768sU;

public final class LiveLatencyManager {
    public static final C1444471p Companion = new C1444471p();
    public final C177918gf debugEventLogger;
    public final C161787qS exoPlayer;
    public final C150157Pl heroDependencies;
    public final AnonymousClass8LG heroPlayerSetting;
    public final C146557As liveJumpRateLimiter;
    public final AnonymousClass708 liveLatencySelector;
    public final AnonymousClass7OP liveLowLatencyDecisions;
    public final C152777a6 request;
    public final C1444371o rewindableVideoMode;
    public final C177928gg traceLogger;

    public final String getCurrentLatencyConfigName() {
        return null;
    }

    public final String getLiveVideoCommentQuality() {
        return null;
    }

    public final int getStreamLatencyToggleState() {
        return -1;
    }

    public final C184768sU getTransferListener() {
        return null;
    }

    public final boolean isBufferingStartedBySeek() {
        return false;
    }

    public final boolean isBufferingStoppedBySeekAndClear() {
        return false;
    }

    public final void maybeChangePlaybackSpeed(long j) {
    }

    public final boolean maybeSetDynamicLoadCursorPosition() {
        return false;
    }

    public final void maybeUpdateStreamLatencyModePIDValues() {
    }

    public final void notifyLiveStateChanged(C166427yf r1) {
    }

    public final void notifyPaused(C166537yr r1) {
    }

    public final void onDownstreamFormatChange(C166637z1 r1) {
    }

    public final void refreshPlayerState(C166537yr r1) {
    }

    public final void setBandwidthMeter(C177658gE r1) {
    }

    public final void setLiveLowLatencyOptimization(boolean z) {
    }

    public final void setPlaybackSpeed(float f) {
    }

    public final void setStreamLatencyMode(int i) {
    }

    public final boolean useToggleOverride() {
        return false;
    }

    public LiveLatencyManager(AnonymousClass8LG r2, C161787qS r3, C1444371o r4, C152777a6 r5, AnonymousClass7OP r6, C146557As r7, C150157Pl r8, AnonymousClass85L r9, AnonymousClass708 r10, C177928gg r11, C177918gf r12) {
        C18260x0.A0f(r2, r3, r4, r5, r6);
        C18260x0.A0U(r7, r8);
        C162457s7.A0J(r10, 9);
        C162457s7.A0J(r12, 11);
        this.heroPlayerSetting = r2;
        this.exoPlayer = r3;
        this.rewindableVideoMode = r4;
        this.request = r5;
        this.liveLowLatencyDecisions = r6;
        this.liveJumpRateLimiter = r7;
        this.heroDependencies = r8;
        this.liveLatencySelector = r10;
        this.traceLogger = r11;
        this.debugEventLogger = r12;
    }

    public final void notifyBufferingStarted(C166537yr r1, C166427yf r2, boolean z) {
    }

    public final void notifyBufferingStopped(C166537yr r1, C166427yf r2, boolean z) {
    }
}
