package X;

import com.whatsapp.mediacomposer.doodle.textentry.TextEntryView;

/* renamed from: X.5nb  reason: invalid class name and case insensitive filesystem */
public class C114785nb implements C184468rs {
    public final /* synthetic */ C149797Nx A00;
    public final /* synthetic */ TextEntryView A01;

    public C114785nb(C149797Nx r1, TextEntryView textEntryView) {
        this.A01 = textEntryView;
        this.A00 = r1;
    }

    public void BPM(float f, int i) {
        C149797Nx r2 = this.A00;
        AnonymousClass5X6 r1 = r2.A03;
        r1.A03 = i;
        r1.A01(i, r1.A02);
        TextEntryView textEntryView = this.A01;
        textEntryView.A01.setTextColor(i);
        textEntryView.A05.A01(i);
        textEntryView.A01.setFontStyle(r2.A02);
    }

    public void Bev() {
    }
}
