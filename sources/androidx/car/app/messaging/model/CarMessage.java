package androidx.car.app.messaging.model;

import X.AnonymousClass001;
import X.C03910Ma;
import X.C04440Of;
import android.os.Bundle;
import androidx.car.app.model.CarText;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CarMessage {
    public final CarText mBody;
    public final boolean mIsRead = false;
    public final long mReceivedTimeEpochMillis = 0;
    public final Bundle mSender;

    public CarMessage() {
        C03910Ma r1 = new C03910Ma();
        r1.A01 = "";
        this.mSender = new C04440Of(r1).A01();
        ArrayList A0s = AnonymousClass001.A0s();
        Objects.requireNonNull("");
        this.mBody = new CarText((List) A0s);
    }
}
