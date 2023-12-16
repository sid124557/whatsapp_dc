package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.HomeActivity;

/* renamed from: X.4NM  reason: invalid class name */
public class AnonymousClass4NM extends View {
    public final /* synthetic */ HomeActivity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4NM(Context context, HomeActivity homeActivity) {
        super(context);
        this.A00 = homeActivity;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, C86664Kz.A05(this.A00.A7J()));
    }
}
