package X;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.6Eh  reason: invalid class name and case insensitive filesystem */
public class C124896Eh extends View {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ C15790rw A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C124896Eh(Context context, ViewGroup viewGroup, C15790rw r3) {
        super(context);
        this.A01 = r3;
        this.A00 = viewGroup;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A01.AwB(configuration);
    }
}
