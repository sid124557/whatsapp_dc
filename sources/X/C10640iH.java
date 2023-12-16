package X;

import android.text.TextUtils;

/* renamed from: X.0iH  reason: invalid class name and case insensitive filesystem */
public class C10640iH implements Runnable {
    public final /* synthetic */ C004805c A00;

    public C10640iH(C004805c r1) {
        this.A00 = r1;
    }

    public void run() {
        try {
            C10640iH.super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        }
    }
}
