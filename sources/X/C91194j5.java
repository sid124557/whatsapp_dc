package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;

/* renamed from: X.4j5  reason: invalid class name and case insensitive filesystem */
public class C91194j5 extends C91224j8 {
    public final TextView A00;
    public final TextView A01;
    public final C15930sC A02 = AnonymousClass6C6.A00(this, 60);

    public void A0A(int i) {
        C105175Tw r0;
        int i2 = this.A02;
        super.A0A(i);
        if (i2 != this.A02 && (r0 = this.A07) != null) {
            A0G(r0);
        }
    }

    public C91194j5(View view, AnonymousClass64J r3, AnonymousClass30B r4, AnonymousClass7D2 r5, CallGridViewModel callGridViewModel, AnonymousClass5UX r7, AnonymousClass5ZU r8, C620733j r9, AnonymousClass1VX r10) {
        super(view, r3, r4, r5, callGridViewModel, r7, r8, r9, r10);
        this.A02 = -1;
        this.A01 = C18300x5.A0G(view, R.id.audio_call_status);
        this.A00 = C18300x5.A0G(view, R.id.audio_call_duration);
    }

    public void A08() {
        super.A08();
        this.A07 = null;
        CallGridViewModel callGridViewModel = this.A06;
        if (callGridViewModel != null) {
            callGridViewModel.A0F.A0F(this.A02);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r2.A0K != false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0G(X.C105175Tw r6) {
        /*
            r5 = this;
            super.A0G(r6)
            X.5Tw r2 = r5.A07
            if (r2 == 0) goto L_0x0011
            int r1 = r5.A02
            r0 = 4
            if (r1 != r0) goto L_0x0011
            boolean r1 = r2.A0K
            r0 = 1
            if (r1 == 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            r3 = 0
            r2 = 8
            if (r0 == 0) goto L_0x004d
            X.7Qw r4 = r6.A09
            if (r4 == 0) goto L_0x0047
            android.widget.TextView r1 = r5.A01
            android.content.Context r0 = r1.getContext()
            java.lang.CharSequence r0 = r4.A00(r0)
            r1.setVisibility(r3)
            r1.setText(r0)
        L_0x002b:
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r5.A06
            if (r0 == 0) goto L_0x0036
            X.08M r1 = r0.A0F
            X.0sC r0 = r5.A02
            r1.A0E(r0)
        L_0x0036:
            android.widget.TextView r1 = r5.A00
            boolean r0 = r6.A0R
            if (r0 != 0) goto L_0x003e
            r3 = 8
        L_0x003e:
            r1.setVisibility(r3)
            com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave r0 = r5.A0M
        L_0x0043:
            r0.setVisibility(r2)
            return
        L_0x0047:
            android.widget.TextView r0 = r5.A01
            r0.setVisibility(r2)
            goto L_0x002b
        L_0x004d:
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r5.A06
            if (r0 == 0) goto L_0x0058
            X.08M r1 = r0.A0F
            X.0sC r0 = r5.A02
            r1.A0F(r0)
        L_0x0058:
            com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave r0 = r5.A0M
            r0.setVisibility(r3)
            android.widget.TextView r0 = r5.A01
            r0.setVisibility(r2)
            android.widget.TextView r0 = r5.A00
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91194j5.A0G(X.5Tw):void");
    }
}
