package X;

import com.whatsapp.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.1Om  reason: invalid class name */
public class AnonymousClass1Om extends C56822sc {
    public final C56972sr A00;
    public final C55262q4 A01;
    public final C56612sH A02;
    public final AnonymousClass1VX A03;
    public final C183538qC A04;

    public final void A0D(AnonymousClass39M r5) {
        C72183dJ r3 = new C72183dJ();
        AnonymousClass0x9.A0a(this.A04).A0G(new C68693Ud(r3), r5);
        try {
            r3.get(10, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.e("RemoveRecentStickerHandler/removeStickerFromRecentBlocking ", e);
        }
    }

    public AnonymousClass1Om(C56972sr r1, C55262q4 r2, C56612sH r3, C623934v r4, AnonymousClass1VX r5, C183538qC r6) {
        super(r4);
        this.A02 = r3;
        this.A03 = r5;
        this.A00 = r1;
        this.A04 = r6;
        this.A01 = r2;
    }
}
