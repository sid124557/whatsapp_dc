package X;

import android.content.Context;
import android.view.Surface;
import android.view.TextureView;

/* renamed from: X.5TM  reason: invalid class name */
public final class AnonymousClass5TM {
    public long A00;
    public Surface A01;
    public C162997t6 A02;
    public C160117n4 A03 = new C160117n4();
    public C159117l9 A04;
    public C147447Ei A05;
    public String A06 = "";
    public String A07;
    public boolean A08;
    public final int A09;
    public final TextureView A0A;
    public final C69263Wi A0B;

    public AnonymousClass5TM(Context context, C69263Wi r4, AnonymousClass5NV r5, AnonymousClass4FS r6, int i) {
        this.A0B = r4;
        this.A09 = i;
        this.A0A = new TextureView(context);
        C18260x0.A0w("TransitionHeroPlayer - init() - playerId: ", AnonymousClass001.A0o(), i);
        r6.BkM(new C70363aN(this, r5, context, 28));
    }

    public final void A00() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("TransitionHeroPlayer - play() - playerId: ");
        C18260x0.A1F(A0o, this.A09);
        C162997t6 r0 = this.A02;
        if (r0 != null) {
            r0.A07();
        }
    }

    public final void A01() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("TransitionHeroPlayer - stop() - playerId: ");
        C18260x0.A1F(A0o, this.A09);
        C162997t6 r0 = this.A02;
        if (r0 != null) {
            r0.A0A();
        }
    }

    public final void A02(C152777a6 r5, boolean z) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("TransitionHeroPlayer - setVideo() - playerId: ");
        A0o.append(this.A09);
        A0o.append(" - videoId: ");
        C166577yv r2 = r5.A0F;
        String str = r2.A0H;
        A0o.append(str);
        A0o.append(", shouldPlayWhenReady: ");
        A0o.append(z);
        A0o.append(", URL: ");
        C18260x0.A0m(r2.A05, A0o);
        this.A08 = z;
        C162997t6 r0 = this.A02;
        if (r0 != null) {
            r0.A0H(r5);
        }
        this.A07 = str;
        String str2 = r5.A08;
        if (str2 == null) {
            str2 = "";
        }
        this.A06 = str2;
        this.A00 = 0;
        this.A03 = null;
    }
}
