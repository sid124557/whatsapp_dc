package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.406  reason: invalid class name */
public final class AnonymousClass406 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AnonymousClass48X $batchStickerDownloadListener;
    public final /* synthetic */ AtomicInteger $downloadedStickerCount;
    public final /* synthetic */ C50612iT $stickerPack;
    public final /* synthetic */ int $totalStickerCount;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass406(C50612iT r2, AnonymousClass48X r3, AtomicInteger atomicInteger, int i) {
        super(0);
        this.$downloadedStickerCount = atomicInteger;
        this.$totalStickerCount = i;
        this.$batchStickerDownloadListener = r3;
        this.$stickerPack = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass48X r1 = this.$batchStickerDownloadListener;
        String str = this.$stickerPack.A0G;
        C34011u5 r2 = ((C68783Um) r1).A00;
        Object[] A1a = C18310x6.A1a(str);
        AnonymousClass000.A1P(A1a, (int) (((double) (((float) this.$downloadedStickerCount.getAndIncrement()) / ((float) this.$totalStickerCount))) * 100.0d), 1);
        r2.A0F(A1a);
        return C59022wD.A00;
    }
}
