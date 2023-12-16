package X;

import android.app.Activity;
import android.content.Intent;

/* renamed from: X.90o  reason: invalid class name and case insensitive filesystem */
public class C1892490o implements C181548mw {
    public Object A00;
    public final int A01;

    public C1892490o(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BP1() {
        C97654yv r1;
        boolean z;
        switch (this.A01) {
            case 0:
                Activity activity = (Activity) this.A00;
                activity.setResult(0);
                Intent intent = new Intent();
                intent.putExtra("get_collection_error_code", 404);
                activity.setIntent(intent);
                activity.finish();
                return;
            case 1:
                ((C61022zZ) this.A00).A01();
                return;
            case 2:
                r1 = (C97654yv) this.A00;
                z = true;
                break;
            case 3:
                ((Activity) this.A00).finish();
                return;
            default:
                r1 = (C97654yv) this.A00;
                z = false;
                break;
        }
        r1.A77(z);
    }
}
