package X;

import android.os.Bundle;
import com.whatsapp.gallery.GalleryRecentsFragment;

/* renamed from: X.5xR  reason: invalid class name and case insensitive filesystem */
public final class C119725xR extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C87484Tc this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119725xR(C87484Tc r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        GalleryRecentsFragment galleryRecentsFragment = new GalleryRecentsFragment();
        C87484Tc r3 = this.this$0;
        Bundle A08 = AnonymousClass002.A08();
        A08.putString("jid", r3.A0H);
        A08.putInt("include", r3.A00);
        A08.putBoolean("is_coming_from_chat", r3.A0L);
        Boolean bool = r3.A06;
        if (bool != null) {
            A08.putBoolean("is_send_as_document", bool.booleanValue());
        }
        galleryRecentsFragment.A0u(A08);
        galleryRecentsFragment.A03 = r3.A03;
        galleryRecentsFragment.A01 = r3.A02;
        return galleryRecentsFragment;
    }
}
