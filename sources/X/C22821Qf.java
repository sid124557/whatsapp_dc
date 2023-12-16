package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.1Qf  reason: invalid class name and case insensitive filesystem */
public final class C22821Qf extends C22831Qg {
    public final C40262Fd A00;
    public final C50862it A01;
    public final C620633i A02;
    public final C56612sH A03;
    public final C54292oU A04;
    public final C55602qc A05;
    public final C48202eW A06;
    public final C50032hW A07;

    public void A00(Context context, Intent intent) {
        C48202eW r2 = this.A06;
        if (r2.A00 == 1) {
            Log.d("app/presenceavailable/timeout/still-foreground");
        } else {
            this.A05.A01();
            this.A07.A01();
            this.A00.A00.clear();
        }
        C18260x0.A1R(AnonymousClass001.A0o(), "app/presenceavailable/timeout/foreground ", r2);
    }

    public C22821Qf(C40262Fd r1, C50862it r2, C620633i r3, C56612sH r4, C54292oU r5, C55602qc r6, C48202eW r7, C50032hW r8) {
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = r5;
        this.A02 = r3;
        this.A06 = r7;
        this.A05 = r6;
        this.A07 = r8;
        this.A00 = r1;
    }
}
