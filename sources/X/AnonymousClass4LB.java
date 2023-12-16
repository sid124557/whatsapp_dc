package X;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.whatsapp.R;

/* renamed from: X.4LB  reason: invalid class name */
public class AnonymousClass4LB extends Dialog {
    public final int A00;
    public final Activity A01;
    public final C620633i A02;
    public final C56612sH A03;
    public final C620733j A04;

    public void onCreate(Bundle bundle) {
        C107555bV.A08(getWindow(), this.A04);
        super.onCreate(bundle);
        setContentView(C86604Kt.A0F(this.A01.getLayoutInflater(), this.A00));
        getWindow().setLayout(-1, -1);
    }

    public AnonymousClass4LB(Activity activity, C620633i r3, C56612sH r4, C620733j r5, int i) {
        super(activity, R.style.f12nameremoved);
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = activity;
        this.A00 = i;
        this.A02 = r3;
    }

    public static void A00(Dialog dialog) {
        C107405bG.A02(AnonymousClass34K.A01(dialog.getContext(), R.attr.f3nameremoved), dialog);
        dialog.getWindow().setFormat(1);
        dialog.getWindow().addFlags(ZipDecompressor.UNZIP_BUFFER_SIZE);
        dialog.getWindow().setSoftInputMode(3);
    }

    public static void A01(Dialog dialog, View view, int i) {
        view.setVisibility(i);
        AnonymousClass0HG.A00(dialog, R.id.photo_progress).setVisibility(i);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }
}
