package X;

import android.text.style.UnderlineSpan;
import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.ui.media.MediaCaptionTextView;

/* renamed from: X.4N4  reason: invalid class name */
public final class AnonymousClass4N4 extends UnderlineSpan implements AnonymousClass4CF {
    public final AnonymousClass64E A00;
    public final String A01;
    public final /* synthetic */ MediaCaptionTextView A02;

    public AnonymousClass4N4(AnonymousClass64E r2, MediaCaptionTextView mediaCaptionTextView, String str) {
        C162457s7.A0J(str, 2);
        this.A02 = mediaCaptionTextView;
        this.A01 = str;
        this.A00 = r2;
    }

    public void BP4(MotionEvent motionEvent, View view) {
        this.A00.BV7(motionEvent, view, this.A01);
    }

    public void BVw(MotionEvent motionEvent, View view) {
        AnonymousClass64E r0 = this.A00;
        String str = this.A01;
        AnonymousClass51x r02 = ((C111275hp) r0).A00;
        C620633i r1 = r02.A0G;
        C106595Zp.A01(r02.A0D, r1, str);
        C106755a7.A03(r1);
    }
}
