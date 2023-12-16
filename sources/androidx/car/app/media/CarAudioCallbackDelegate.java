package androidx.car.app.media;

import X.AnonymousClass001;
import X.C14620pz;
import androidx.car.app.media.ICarAudioCallback;
import java.util.Objects;

public class CarAudioCallbackDelegate {
    public final ICarAudioCallback mCallback = null;

    public class CarAudioCallbackStub extends ICarAudioCallback.Stub {
        public final C14620pz mCarAudioCallback;

        public void onStopRecording() {
            Objects.requireNonNull((Object) null);
            throw AnonymousClass001.A0g("onStopRecording");
        }

        public CarAudioCallbackStub(C14620pz r1) {
            this.mCarAudioCallback = r1;
        }

        public CarAudioCallbackStub() {
            this.mCarAudioCallback = null;
        }
    }
}
