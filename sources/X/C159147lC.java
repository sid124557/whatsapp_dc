package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.widget.FrameLayout;
import com.facebook.avatar.autogen.view.AESelfieViewProvider$decreaseBrightness$1;

/* renamed from: X.7lC  reason: invalid class name and case insensitive filesystem */
public final class C159147lC {
    public FrameLayout A00;
    public AnonymousClass82E A01;
    public AnonymousClass4NO A02;
    public C203699oA A03;
    public C202289li A04;
    public boolean A05;
    public final Context A06;
    public final C166367yZ A07;
    public final AnonymousClass7H4 A08;
    public final AnonymousClass7RY A09;

    public C159147lC(Context context, C166367yZ r3, AnonymousClass7H4 r4, AnonymousClass7RY r5) {
        C18270x1.A11(r4, 3, r5);
        this.A06 = context;
        this.A07 = r3;
        this.A08 = r4;
        this.A09 = r5;
    }

    public void A02(C142566xP r5) {
        C162457s7.A0J(r5, 0);
        AnonymousClass7H4 r0 = this.A08;
        String str = r5.key;
        C162457s7.A0J(str, 0);
        C154237cq.A00(r0.A00, r0.A01, str, 38);
    }

    public static void A00(C159147lC r5) {
        Activity A012 = r5.A01(r5.A06);
        if (r5.A07.A02) {
            C616131n.A02((C85494Gl) null, new AESelfieViewProvider$decreaseBrightness$1(A012, (C84814Du) null), AnonymousClass349.A02(AnonymousClass788.A00), (AnonymousClass20D) null, 3);
        }
    }

    public final Activity A01(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        C162457s7.A0D(baseContext);
        return A01(baseContext);
    }
}
