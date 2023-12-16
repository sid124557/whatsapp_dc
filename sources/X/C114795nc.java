package X;

import com.whatsapp.mediacomposer.doodle.ColorPickerView;

/* renamed from: X.5nc  reason: invalid class name and case insensitive filesystem */
public class C114795nc implements C184468rs {
    public final /* synthetic */ AnonymousClass5GV A00;
    public final /* synthetic */ C114825nf A01;
    public final /* synthetic */ C105305Uj A02;

    public C114795nc(AnonymousClass5GV r1, C114825nf r2, C105305Uj r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r0.A0R() == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BPM(float r5, int r6) {
        /*
            r4 = this;
            X.5GV r0 = r4.A00
            r0.A00 = r6
            X.5nf r1 = r4.A01
            X.5US r0 = r1.A0T
            X.5Uw r0 = r0.A01
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.A0R()
            r3 = 1
            if (r0 != 0) goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            X.5Uj r2 = r4.A02
            com.whatsapp.mediacomposer.doodle.ColorPickerComponent r0 = r1.A0J
            com.whatsapp.mediacomposer.doodle.ColorPickerView r0 = r0.A05
            float r1 = r0.A00
            boolean r0 = r0.A0B
            r2.A06(r1, r6, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114795nc.BPM(float, int):void");
    }

    public void Bev() {
        AnonymousClass5GV r5 = this.A00;
        C114825nf r2 = this.A01;
        ColorPickerView colorPickerView = r2.A0J.A05;
        r5.A00 = colorPickerView.A02;
        r2.A06();
        this.A02.A06(colorPickerView.A00, r5.A00, colorPickerView.A0B, false);
    }
}
