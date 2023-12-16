package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.6Ys  reason: invalid class name and case insensitive filesystem */
public class C128996Ys extends AnonymousClass4SH {
    public final C1891690g A00 = new C1891690g((Object) this, 10);
    public final AnonymousClass4GQ A01;

    public C128996Ys(Context context, AnonymousClass4GQ r4, int i) {
        super(context, i);
        this.A01 = r4;
    }

    public void onCreate(Bundle bundle) {
        View findViewById;
        super.onCreate(bundle);
        if (this.A01 != null && (findViewById = findViewById(R.id.design_bottom_sheet)) != null) {
            findViewById.addOnLayoutChangeListener(this.A00);
        }
    }
}
