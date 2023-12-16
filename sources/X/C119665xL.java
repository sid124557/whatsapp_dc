package X;

import android.content.Intent;
import android.provider.MediaStore;

/* renamed from: X.5xL  reason: invalid class name and case insensitive filesystem */
public final class C119665xL extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ int $mediaType;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119665xL(int i) {
        super(0);
        this.$mediaType = i;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        Intent intent = new Intent("android.intent.action.PICK", MediaStore.Video.Media.INTERNAL_CONTENT_URI);
        int i = this.$mediaType;
        if (i == 2) {
            str = "image/gif";
        } else if (i != 4) {
            str = "image/*";
        } else {
            str = "video/*";
        }
        intent.setType(str);
        return intent;
    }
}
