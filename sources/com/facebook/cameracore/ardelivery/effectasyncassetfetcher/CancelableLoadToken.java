package com.facebook.cameracore.ardelivery.effectasyncassetfetcher;

import X.C202249ld;
import com.facebook.cameracore.ardelivery.listener.CancelableToken;

public class CancelableLoadToken implements CancelableToken {
    public C202249ld mLoadToken;

    public boolean cancel() {
        C202249ld r0 = this.mLoadToken;
        if (r0 != null) {
            return r0.cancel();
        }
        return false;
    }

    public CancelableLoadToken(C202249ld r1) {
        this.mLoadToken = r1;
    }
}
