package kotlinx.coroutines.android;

import X.AnonymousClass001;
import X.AnonymousClass46A;
import X.C155447et;
import X.C831346g;
import android.os.Looper;
import java.util.List;

public final class AndroidDispatcherFactory {
    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    public AnonymousClass46A createDispatcher(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new C831346g(C155447et.A00(mainLooper), false);
        }
        throw AnonymousClass001.A0e("The main looper is not available");
    }

    public int getLoadPriority() {
        return 1073741823;
    }
}
