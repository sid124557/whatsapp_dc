package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.stickers.store.ConfirmPackDeleteDialogFragment;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;

/* renamed from: X.4I0  reason: invalid class name */
public class AnonymousClass4I0 implements DialogInterface.OnClickListener {
    public Object A00;
    public String A01;
    public final int A02;

    public AnonymousClass4I0(int i, String str, Object obj) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass48Y r2;
        switch (this.A02) {
            case 0:
                ((C08310eF) this.A00).A0m(new Intent("android.intent.action.VIEW", Uri.parse(this.A01)));
                return;
            case 1:
                C08310eF r4 = (C08310eF) this.A00;
                String str = this.A01;
                Context A1D = r4.A1D();
                Intent A07 = C18320x8.A07();
                A07.setClassName(A1D.getPackageName(), "com.whatsapp.identity.IdentityVerificationActivity");
                A07.putExtra("jid", str);
                r4.A0m(A07);
                return;
            default:
                ConfirmPackDeleteDialogFragment confirmPackDeleteDialogFragment = (ConfirmPackDeleteDialogFragment) this.A00;
                String str2 = this.A01;
                if (i == -1) {
                    try {
                        r2 = (AnonymousClass48Y) confirmPackDeleteDialogFragment.A0Q();
                        if (r2 != null) {
                            StickerStorePackPreviewActivity stickerStorePackPreviewActivity = (StickerStorePackPreviewActivity) r2;
                            stickerStorePackPreviewActivity.A0Y = true;
                            stickerStorePackPreviewActivity.A74();
                        }
                    } catch (ClassCastException unused) {
                        r2 = null;
                    }
                    confirmPackDeleteDialogFragment.A00.A0D(new C68763Uk(AnonymousClass0x9.A14(r2)), str2);
                    confirmPackDeleteDialogFragment.A1K();
                    return;
                }
                return;
        }
    }
}
