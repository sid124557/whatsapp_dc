package X;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;

/* renamed from: X.7ZX  reason: invalid class name */
public final class AnonymousClass7ZX {
    public float A00 = 1.0f;
    public int A01;
    public C177948gi A02;
    public final AudioManager A03;
    public final C162877su A04;

    public final void A00() {
        if (this.A01 != 0) {
            if (C162387ry.A01 < 26) {
                this.A03.abandonAudioFocus(this.A04);
            }
            A02(0);
        }
    }

    public final void A01(int i) {
        C177948gi r0 = this.A02;
        if (r0 != null) {
            AnonymousClass6OD r2 = ((C1685785y) r0).A00;
            boolean BBP = r2.BBP();
            int i2 = 1;
            if (BBP && i != 1) {
                i2 = 2;
            }
            r2.A06(i, i2, BBP);
        }
    }

    public final void A02(int i) {
        if (this.A01 != i) {
            this.A01 = i;
            float f = 1.0f;
            if (i == 3) {
                f = 0.2f;
            }
            if (this.A00 != f) {
                this.A00 = f;
                C177948gi r0 = this.A02;
                if (r0 != null) {
                    AnonymousClass6OD r3 = ((C1685785y) r0).A00;
                    r3.A09(Float.valueOf(r3.A00 * r3.A0L.A00), 1, 2);
                }
            }
        }
    }

    public AnonymousClass7ZX(Context context, Handler handler, C177948gi r5) {
        Object systemService = context.getApplicationContext().getSystemService("audio");
        systemService.getClass();
        this.A03 = (AudioManager) systemService;
        this.A02 = r5;
        this.A04 = new C162877su(handler, this);
        this.A01 = 0;
    }
}
