package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* renamed from: X.5mq  reason: invalid class name and case insensitive filesystem */
public final class C114315mq implements C185708u7 {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ Toolbar A01;
    public final /* synthetic */ C89654ea A02;
    public final /* synthetic */ AnonymousClass7ZM A03;
    public final /* synthetic */ boolean A04;

    public void Bbl(View view, float f) {
        float f2;
        float f3 = ((float) 1) - f;
        if (f3 < 0.8f) {
            f2 = 0.0f;
        } else {
            f2 = (f3 - 0.8f) / 0.19999999f;
        }
        this.A00.setAlpha((int) (((float) 255) * f2));
        this.A01.setAlpha(f2);
        AnonymousClass7ZM r4 = this.A03;
        int i = r4.A01;
        if (i != 0) {
            C89654ea r3 = this.A02;
            r3.getWindow().setStatusBarColor(AnonymousClass0YI.A03(f2, i, -16777216));
            r3.getWindow().setNavigationBarColor(AnonymousClass0YI.A03(f2, r4.A00, -16777216));
        }
    }

    public C114315mq(Drawable drawable, Toolbar toolbar, C89654ea r3, AnonymousClass7ZM r4, boolean z) {
        this.A04 = z;
        this.A02 = r3;
        this.A00 = drawable;
        this.A01 = toolbar;
        this.A03 = r4;
    }

    public void BRJ(View view) {
        boolean z = this.A04;
        C89654ea r0 = this.A02;
        if (z) {
            r0.onBackPressed();
        } else {
            C86624Kv.A0f(r0);
        }
    }

    public /* synthetic */ boolean BHS(View view) {
        return true;
    }

    public void BRe(int i) {
    }

    public void BbQ(View view) {
    }
}
