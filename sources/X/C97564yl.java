package X;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.4yl  reason: invalid class name and case insensitive filesystem */
public class C97564yl extends C131826eF {
    public View A00;
    public ImageView A01;
    public TextView A02;
    public AnonymousClass30B A03;
    public C64773Ex A04;
    public AnonymousClass5ZU A05;
    public C56332ro A06;
    public C56512s6 A07;
    public AnonymousClass5ZR A08;
    public AnonymousClass3ZH A09;
    public AnonymousClass3LP A0A;
    public PhotoView A0B;
    public C105025Tg A0C;
    public boolean A0D;
    public boolean A0E;

    public final void A77(boolean z, String str) {
        C162457s7.A0J(str, 1);
        if (z) {
            A76().setVisibility(4);
            A74().setVisibility(0);
            AnonymousClass0YZ.A0F(A74(), str);
            return;
        }
        A74().setVisibility(8);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        C162457s7.A0J(bundle, 0);
        super.onRestoreInstanceState(bundle);
        this.A0E = bundle.getBoolean("photo_change_requested_externally");
        this.A0D = bundle.getBoolean("photo_change_requested_by_phone");
    }

    public void onSaveInstanceState(Bundle bundle) {
        C162457s7.A0J(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("photo_change_requested_externally", this.A0E);
        bundle.putBoolean("photo_change_requested_by_phone", this.A0D);
    }

    public final void setProgressView(View view) {
        C162457s7.A0J(view, 0);
        this.A00 = view;
    }

    public final ImageView A74() {
        ImageView imageView = this.A01;
        if (imageView != null) {
            return imageView;
        }
        throw C18270x1.A0S("animationView");
    }

    public final AnonymousClass3ZH A75() {
        AnonymousClass3ZH r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("contact");
    }

    public final PhotoView A76() {
        PhotoView photoView = this.A0B;
        if (photoView != null) {
            return photoView;
        }
        throw C18270x1.A0S("pictureView");
    }

    public AnonymousClass5ZC BCP() {
        AnonymousClass5ZC r0 = C58152un.A02;
        C162457s7.A0F(r0);
        return r0;
    }
}
