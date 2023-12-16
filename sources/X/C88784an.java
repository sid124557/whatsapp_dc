package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.whatsapp.util.Log;

/* renamed from: X.4an  reason: invalid class name and case insensitive filesystem */
public class C88784an extends C167047zg {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ C113245l7 A03;
    public final /* synthetic */ boolean A04;

    public C88784an(View view, ViewGroup viewGroup, C113245l7 r3, int i, boolean z) {
        this.A03 = r3;
        this.A02 = viewGroup;
        this.A01 = view;
        this.A04 = z;
        this.A00 = i;
    }

    public void onAnimationEnd(Animation animation) {
        Log.i("conversation/hideinputextension/end");
        ViewGroup viewGroup = this.A02;
        viewGroup.setVisibility(8);
        C113245l7 r4 = this.A03;
        AnonymousClass5KV r3 = r4.A2c;
        C86644Kx.A12(r3.A02, new AnonymousClass92L(r3, 1, new AnonymousClass6BH(this.A01, viewGroup, this, this.A04)));
        r4.A1a.setClipChildren(true);
        r4.A2f.setTranscriptMode(this.A00);
    }
}
