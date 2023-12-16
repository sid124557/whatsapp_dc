package X;

import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* renamed from: X.9e1  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C197879e1 implements C84114Bb {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ C198109eO A01;
    public final /* synthetic */ WeakReference A02;

    public final void BSV(Object obj) {
        C198109eO r5 = this.A01;
        WeakReference weakReference = this.A02;
        Intent intent = this.A00;
        Context context = (Context) weakReference.get();
        if (context != null) {
            C18270x1.A0h(((AnonymousClass33p) ((C198119eP) ((C1227565p) r5.A01.get())).A01.get()).A0U(), "shops_privacy_notice", -1);
            r5.A00(context, intent);
        }
    }

    public /* synthetic */ C197879e1(Intent intent, C198109eO r2, WeakReference weakReference) {
        this.A01 = r2;
        this.A02 = weakReference;
        this.A00 = intent;
    }
}
