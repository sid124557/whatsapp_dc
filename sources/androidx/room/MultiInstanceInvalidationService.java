package androidx.room;

import X.AnonymousClass01V;
import X.AnonymousClass022;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import java.util.LinkedHashMap;
import java.util.Map;

public final class MultiInstanceInvalidationService extends Service {
    public int A00;
    public final RemoteCallbackList A01 = new AnonymousClass022(this);
    public final AnonymousClass01V A02 = new AnonymousClass01V(this);
    public final Map A03 = new LinkedHashMap();

    public IBinder onBind(Intent intent) {
        return this.A02;
    }
}
