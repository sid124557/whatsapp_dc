package X;

import com.whatsapp.util.Log;

/* renamed from: X.5qT  reason: invalid class name and case insensitive filesystem */
public class C116555qT implements C183338ps {
    public final AnonymousClass2z0 A00;
    public final /* synthetic */ C116505qO A01;

    public C116555qT(AnonymousClass2z0 r1, C116505qO r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void Bc9(AnonymousClass5YG r7) {
        AnonymousClass2z0 r1 = this.A00;
        C116505qO r5 = this.A01;
        if (r1 != r5.A0A || r5.A0E == null) {
            Log.d("InlineVideoPlaybackImplHandler/startInlinePlayback onStart squashed, incorrect rowKey");
            return;
        }
        AnonymousClass563 r12 = (AnonymousClass563) r5.A0C;
        AnonymousClass5YG r0 = r12.A0I;
        if (r0 != null) {
            r12.A0x.setText(AnonymousClass5VT.A01(r12.A15, r12.A16, (long) r0.A06()));
        }
        AnonymousClass563 r2 = (AnonymousClass563) r5.A0C;
        r2.A0X.setVisibility(8);
        r2.A0Y.setVisibility(8);
        r5.A0C.A03();
        AnonymousClass563 r22 = (AnonymousClass563) r5.A0C;
        r22.A0o.setVisibility(0);
        if (r22.A0N && r22.A0e.getVisibility() != 0) {
            r22.A0p.setVisibility(0);
        }
        r5.A08.requestFocus();
        C150197Pr r13 = r5.A0Z;
        r13.A04 = true;
        r13.A08.A00();
        r13.A07.A01();
        r13.A09.A02();
    }
}
