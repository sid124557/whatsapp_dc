package X;

import java.util.List;

/* renamed from: X.8Yh  reason: invalid class name and case insensitive filesystem */
public final class C175418Yh extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass4GQ $handler;
    public final /* synthetic */ String $parentCategoryId;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175418Yh(String str, AnonymousClass4GQ r3) {
        super(1);
        this.$parentCategoryId = str;
        this.$handler = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass7DP r5 = (AnonymousClass7DP) obj;
        C162457s7.A0J(r5, 0);
        if (r5.A00) {
            AnonymousClass6gH r52 = (AnonymousClass6gH) r5;
            this.$handler.invoke(new AnonymousClass6gG((List) C73813g7.A07(r52.A01, this.$parentCategoryId), r52.A00));
        } else {
            this.$handler.invoke(r5);
        }
        return C59022wD.A00;
    }
}
