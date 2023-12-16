package com.whatsapp.calling.screenshare;

import X.AnonymousClass002;
import X.C162457s7;
import X.C170948Fd;
import X.C179168ii;
import android.media.projection.MediaProjection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public final class ScreenShareResourceManager {
    public final Set listeners;
    public final AtomicReference mediaProjectionHandle = new AtomicReference((Object) null);

    public final void registerListener(C179168ii r2) {
        C162457s7.A0J(r2, 0);
        this.listeners.add(r2);
    }

    public final void setMediaProjectionHandle(MediaProjection mediaProjection) {
        C162457s7.A0J(mediaProjection, 0);
        this.mediaProjectionHandle.set(mediaProjection);
        notifyListenersOfMediaProjectionEnabled();
    }

    public final void unregisterListener(C179168ii r2) {
        C162457s7.A0J(r2, 0);
        this.listeners.remove(r2);
    }

    private final void notifyListenersOfMediaProjectionDisabled() {
        for (C179168ii r0 : this.listeners) {
            ((C170948Fd) r0).A00.mediaProjectionState.set(0);
        }
    }

    private final void notifyListenersOfMediaProjectionEnabled() {
        for (C179168ii r0 : this.listeners) {
            ((C170948Fd) r0).A00.mediaProjectionState.set(1);
        }
    }

    public final void clearMediaProjectionHandle() {
        this.mediaProjectionHandle.set((Object) null);
        notifyListenersOfMediaProjectionDisabled();
    }

    public final MediaProjection getMediaProjectionHandle() {
        return (MediaProjection) this.mediaProjectionHandle.get();
    }

    public ScreenShareResourceManager() {
        Set synchronizedSet = Collections.synchronizedSet(AnonymousClass002.A0K());
        C162457s7.A0D(synchronizedSet);
        this.listeners = synchronizedSet;
    }
}
