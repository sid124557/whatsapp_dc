package X;

import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.4wb  reason: invalid class name and case insensitive filesystem */
public class C96584wb extends AnonymousClass6mM {
    public final WaImageView A00;
    public final WaTextView A01;

    public /* bridge */ /* synthetic */ void A09(Object obj) {
        throw AnonymousClass001.A0g(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME);
    }

    public C96584wb(View view) {
        super(view);
        this.A01 = AnonymousClass0x7.A0L(view, R.id.category_name);
        this.A00 = AnonymousClass0x9.A0L(view, R.id.category_icon);
    }
}
