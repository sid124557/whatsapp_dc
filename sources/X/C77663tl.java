package X;

import android.net.Uri;
import com.whatsapp.conversation.CustomStickerConfirmationDialog;

/* renamed from: X.3tl  reason: invalid class name and case insensitive filesystem */
public final class C77663tl extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ CustomStickerConfirmationDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77663tl(CustomStickerConfirmationDialog customStickerConfirmationDialog) {
        super(0);
        this.this$0 = customStickerConfirmationDialog;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String string = this.this$0.A0H().getString("URI");
        if (string != null) {
            Uri parse = Uri.parse(string);
            C162457s7.A0D(parse);
            return parse;
        }
        throw AnonymousClass001.A0e("Could not retrieve uri from arguments bundle.");
    }
}
