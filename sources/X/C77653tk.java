package X;

import com.whatsapp.conversation.CustomStickerConfirmationDialog;

/* renamed from: X.3tk  reason: invalid class name and case insensitive filesystem */
public final class C77653tk extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ CustomStickerConfirmationDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77653tk(CustomStickerConfirmationDialog customStickerConfirmationDialog) {
        super(0);
        this.this$0 = customStickerConfirmationDialog;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        CustomStickerConfirmationDialog customStickerConfirmationDialog = this.this$0;
        C39642Ct r3 = customStickerConfirmationDialog.A01;
        if (r3 != null) {
            Object value = customStickerConfirmationDialog.A04.getValue();
            C162457s7.A0J(value, 1);
            return new AnonymousClass0XL((C17190ui) new AnonymousClass4J4(value, 2, r3), (C15940sD) customStickerConfirmationDialog).A01(C194410o.class);
        }
        throw C18270x1.A0S("customStickerViewModelFactory");
    }
}
