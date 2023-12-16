package X;

import android.view.View;
import java.util.ArrayList;

/* renamed from: X.6mM  reason: invalid class name */
public class AnonymousClass6mM extends C125666Ix {
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = (X.C136236mG) r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08() {
        /*
            r2 = this;
            boolean r0 = r2 instanceof X.C136236mG
            if (r0 == 0) goto L_0x0010
            r0 = r2
            X.6mG r0 = (X.C136236mG) r0
            X.4wK r1 = r0.A00
            if (r1 == 0) goto L_0x0010
            X.5UV r0 = r0.A01
            r0.A07(r1)
        L_0x0010:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6mM.A08():void");
    }

    public void A09(Object obj) {
        if (this instanceof AnonymousClass6mL) {
            ((AnonymousClass6mL) this).A0A((C135846lL) obj);
        } else if (this instanceof AnonymousClass6mD) {
            throw AnonymousClass001.A0g("onClickListener");
        } else if (this instanceof AnonymousClass6mC) {
            throw AnonymousClass001.A0g("onClickListener");
        } else if (this instanceof C136226mF) {
            C136226mF r4 = (C136226mF) this;
            ArrayList A0s = AnonymousClass001.A0s();
            int i = 8;
            if (r4.A03.A02()) {
                i = 6;
            }
            int i2 = 0;
            do {
                A0s.add(new AnonymousClass740());
                i2++;
            } while (i2 < i);
            AnonymousClass6HY r1 = r4.A02;
            r1.A00 = A0s;
            r1.A05();
            r4.A01.setAdapter(r1);
        } else if (this instanceof AnonymousClass6m6) {
            this.A0H.setOnClickListener(((AnonymousClass6lY) obj).A00);
        } else if (this instanceof C136236mG) {
            C136236mG r0 = (C136236mG) this;
            C96414wK r6 = (C96414wK) obj;
            r0.A00 = r6;
            r0.A01.A06(r6);
        }
    }

    public AnonymousClass6mM(View view) {
        super(view);
    }
}
