package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/* renamed from: X.8Ez  reason: invalid class name and case insensitive filesystem */
public final class C170908Ez implements AnonymousClass49H {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass7TX A02;
    public final /* synthetic */ C186558vY A03;

    public C170908Ez(Activity activity, Context context, AnonymousClass7TX r3, C186558vY r4) {
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = context;
        this.A00 = activity;
    }

    public final void BaR(boolean z) {
        if (!z) {
            this.A02.A00(C141756w5.NO_PERMISSION);
            return;
        }
        C186558vY r6 = this.A03;
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1B(UUID.randomUUID(), A0o);
        File B7V = r6.B7V(AnonymousClass000.A0X(".jpg", A0o));
        Context context = this.A01;
        AnonymousClass7TX r4 = this.A02;
        Activity activity = this.A00;
        try {
            Uri A012 = C627536m.A01(context, B7V);
            Intent A09 = AnonymousClass0x9.A09("android.media.action.IMAGE_CAPTURE");
            A09.putExtra("output", A012);
            r6.BpX(activity, A09, new AnonymousClass7SE(r4, B7V), 1);
        } catch (IOException unused) {
            r4.A00(C141756w5.INTERNAL_ERROR);
            B7V.delete();
        }
    }
}
