package X;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.6CO  reason: invalid class name */
public final class AnonymousClass6CO extends Fragment implements C185368tX {
    public static final WeakHashMap A03 = new WeakHashMap();
    public int A00 = 0;
    public Bundle A01;
    public final Map A02 = Collections.synchronizedMap(new AnonymousClass05C());

    public final void AwP(LifecycleCallback lifecycleCallback, String str) {
        Map map = this.A02;
        if (!map.containsKey("ConnectionlessLifecycleHelper")) {
            map.put("ConnectionlessLifecycleHelper", lifecycleCallback);
            if (this.A00 > 0) {
                new C124816Dz(Looper.getMainLooper()).post(new C117715sN(lifecycleCallback, this));
                return;
            }
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("LifecycleCallback with tag ");
        A0o.append("ConnectionlessLifecycleHelper");
        throw AnonymousClass000.A0F(" already added to this fragment.", A0o);
    }

    public final LifecycleCallback B5A(Class cls, String str) {
        return AnonymousClass6R3.class.cast(this.A02.get("ConnectionlessLifecycleHelper"));
    }

    public final Activity B96() {
        return getActivity();
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator A0v = AnonymousClass001.A0v(this.A02);
        while (A0v.hasNext()) {
            A0v.next();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator A0v = AnonymousClass001.A0v(this.A02);
        while (A0v.hasNext()) {
            ((LifecycleCallback) A0v.next()).A03(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        this.A00 = 1;
        this.A01 = bundle;
        Iterator A0q = AnonymousClass000.A0q(this.A02);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            LifecycleCallback lifecycleCallback = (LifecycleCallback) A0w.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle(C18310x6.A0q(A0w));
            } else {
                bundle2 = null;
            }
            lifecycleCallback.A04(bundle2);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.A00 = 5;
        Iterator A0v = AnonymousClass001.A0v(this.A02);
        while (A0v.hasNext()) {
            A0v.next();
        }
    }

    public final void onResume() {
        super.onResume();
        this.A00 = 3;
        Iterator A0v = AnonymousClass001.A0v(this.A02);
        while (A0v.hasNext()) {
            ((LifecycleCallback) A0v.next()).A00();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            Iterator A0q = AnonymousClass000.A0q(this.A02);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                Bundle A08 = AnonymousClass002.A08();
                ((LifecycleCallback) A0w.getValue()).A05(A08);
                bundle.putBundle(C18310x6.A0q(A0w), A08);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.A00 = 2;
        Iterator A0v = AnonymousClass001.A0v(this.A02);
        while (A0v.hasNext()) {
            ((LifecycleCallback) A0v.next()).A01();
        }
    }

    public final void onStop() {
        super.onStop();
        this.A00 = 4;
        Iterator A0v = AnonymousClass001.A0v(this.A02);
        while (A0v.hasNext()) {
            ((LifecycleCallback) A0v.next()).A02();
        }
    }
}
