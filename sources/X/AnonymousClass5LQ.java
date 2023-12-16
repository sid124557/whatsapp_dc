package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.mediacomposer.MediaComposerActivity;

/* renamed from: X.5LQ  reason: invalid class name */
public class AnonymousClass5LQ {
    public float A00;
    public float A01;
    public Drawable A02;
    public Drawable A03;
    public Uri A04;
    public View A05;
    public View A06;
    public ViewGroup A07;
    public ViewGroup A08;
    public ImageView A09;
    public TextView A0A;
    public boolean A0B;
    public final Handler A0C = AnonymousClass000.A0A();
    public final Runnable A0D = new C71533cG((Object) this, 37);
    public final int[] A0E = C86664Kz.A1Z();
    public final /* synthetic */ MediaComposerActivity A0F;

    public AnonymousClass5LQ(Activity activity, MediaComposerActivity mediaComposerActivity) {
        this.A0F = mediaComposerActivity;
        this.A03 = AnonymousClass0RP.A00(activity, R.drawable.ic_remove_white);
        this.A02 = AnonymousClass0RP.A00(activity, R.drawable.ic_remove_red);
        this.A08 = (ViewGroup) activity.findViewById(R.id.remove_frame);
        this.A0A = (TextView) activity.findViewById(R.id.drag_remove);
        this.A05 = activity.findViewById(R.id.drag_remove_padding);
        this.A07 = (ViewGroup) activity.findViewById(R.id.drag_frame);
        AnonymousClass4SU r1 = new AnonymousClass4SU(activity, this);
        this.A09 = r1;
        r1.setSelected(true);
        C86644Kx.A1A(this.A09);
        this.A07.addView(this.A09);
    }
}
