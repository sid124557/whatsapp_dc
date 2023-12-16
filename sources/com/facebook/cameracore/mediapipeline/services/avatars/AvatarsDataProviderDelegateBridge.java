package com.facebook.cameracore.mediapipeline.services.avatars;

import X.AnonymousClass646;
import X.AnonymousClass7IN;
import X.C115785pE;
import X.C45102Yr;
import X.C57682u2;
import X.C90954if;
import com.whatsapp.util.Log;

public class AvatarsDataProviderDelegateBridge {
    public final AnonymousClass7IN mDelegate;

    public void onLoadFailure(String str) {
        AnonymousClass7IN r2 = this.mDelegate;
        C45102Yr r1 = r2.A01.A0B;
        Log.d("SparkRetryHandler/onResponseFromSpark Spark responded, cleaning up");
        r1.A00();
        AnonymousClass646 r12 = r2.A00;
        if (r12 != null) {
            Log.d("voip/InitializeAvatarEffectUseCase/onLoadFailure");
            ((C115785pE) r12).A04.BkD(C57682u2.A00(C90954if.A00));
        }
        r2.A00 = null;
    }

    public void onLoadSuccess(String str) {
        AnonymousClass7IN r2 = this.mDelegate;
        C45102Yr r1 = r2.A01.A0B;
        Log.d("SparkRetryHandler/onResponseFromSpark Spark responded, cleaning up");
        r1.A00();
        AnonymousClass646 r12 = r2.A00;
        if (r12 != null) {
            Log.d("voip/InitializeAvatarEffectUseCase/onLoadSuccess");
            ((C115785pE) r12).A01 = true;
        }
        r2.A00 = null;
    }

    public AvatarsDataProviderDelegateBridge(AnonymousClass7IN r1) {
        this.mDelegate = r1;
    }

    public void sendAvatarFrame(String str, byte[] bArr) {
    }

    public void sendAvatarRampUpdateEvent(String str, String str2) {
    }

    public String getPersonalAvatarUriOverride() {
        return null;
    }

    public void onInitialAvatarColorizationApplied() {
    }

    public String getDefaultAvatarResourcePath(String str) {
        return null;
    }

    public void sendAvatarMemoryCreationSuccess(String str) {
    }

    public void sendAvatarMemoryLoadResult(String str, String str2, boolean z, String str3) {
    }
}
