package X;

import com.whatsapp.util.Log;

/* renamed from: X.2ls  reason: invalid class name and case insensitive filesystem */
public class C52682ls {
    public final C29441ip A00;
    public final C56612sH A01;
    public final AnonymousClass33p A02;

    public void A00() {
        AnonymousClass33p r4 = this.A02;
        C18270x1.A0h(C18270x1.A03(r4), "sticker_store_backoff_attempt", 0);
        C18270x1.A0i(C18270x1.A03(r4), "sticker_store_backoff_time", 0);
        C18270x1.A0i(C18270x1.A03(r4), "sticker_store_last_fetch_time", System.currentTimeMillis());
        Log.i("StickerRequestBackoffManager/clearAttempts");
    }

    public void A01() {
        AnonymousClass33p r8 = this.A02;
        int A022 = C18280x3.A02(AnonymousClass0x2.A0F(r8), "sticker_store_backoff_attempt") + 1;
        C54832pM r4 = new C54832pM(1, 720);
        r4.A03((long) A022);
        long A012 = r4.A01();
        C18260x0.A0L(r8, "sticker_store_backoff_attempt", A022);
        C18270x1.A0i(C18270x1.A03(r8), "sticker_store_backoff_time", (60 * A012 * 1000) + System.currentTimeMillis());
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("StickerRequestBackoffManager/incrementAttempt/Backing off for ");
        A0o.append(A012);
        C18260x0.A1K(A0o, " minutes.");
    }

    public C52682ls(C29441ip r1, C56612sH r2, AnonymousClass33p r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
