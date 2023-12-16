package X;

import com.whatsapp.picker.search.StickerSearchTabFragment;

/* renamed from: X.8Ym  reason: invalid class name and case insensitive filesystem */
public final class C175468Ym extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ int $stickerCategoryTab;
    public final /* synthetic */ StickerSearchTabFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175468Ym(StickerSearchTabFragment stickerSearchTabFragment, int i) {
        super(1);
        this.this$0 = stickerSearchTabFragment;
        this.$stickerCategoryTab = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        StickerSearchTabFragment stickerSearchTabFragment = this.this$0;
        C125306Hh r2 = stickerSearchTabFragment.A03;
        if (r2 != null) {
            r2.A0K(stickerSearchTabFragment.A1I().A1V(this.$stickerCategoryTab));
            r2.A05();
        }
        return C59022wD.A00;
    }
}
