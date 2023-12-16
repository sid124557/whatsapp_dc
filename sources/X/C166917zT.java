package X;

import android.view.View;
import com.whatsapp.mediacomposer.doodle.textentry.TextEntryView;

/* renamed from: X.7zT  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C166917zT implements View.OnLongClickListener {
    public final /* synthetic */ C114835ng A00;
    public final /* synthetic */ C149797Nx A01;
    public final /* synthetic */ TextEntryView A02;

    public final boolean onLongClick(View view) {
        TextEntryView textEntryView = this.A02;
        C114835ng r2 = this.A00;
        C149797Nx r1 = this.A01;
        r2.A00((r2.A04.A02 - 1) % 4);
        textEntryView.A03(r1);
        return true;
    }

    public /* synthetic */ C166917zT(C114835ng r1, C149797Nx r2, TextEntryView textEntryView) {
        this.A02 = textEntryView;
        this.A00 = r1;
        this.A01 = r2;
    }
}
