package X;

import android.widget.SeekBar;
import com.whatsapp.conversation.ui.AudioPlayerMetadataView;

/* renamed from: X.68F  reason: invalid class name */
public class AnonymousClass68F extends C167197zv {
    public Object A00;
    public final int A01;

    public AnonymousClass68F(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A00(int i) {
        AudioPlayerMetadataView audioPlayerMetadataView;
        C620733j whatsAppLocale;
        switch (this.A01) {
            case 0:
                C93074nr r3 = (C93074nr) this.A00;
                r3.setDuration(C107565bW.A0A(r3.A0M, (long) i));
                return;
            case 1:
                AnonymousClass4zV r0 = (AnonymousClass4zV) this.A00;
                r0.A00.setDuration(C107565bW.A0A(r0.A02, (long) i));
                return;
            case 2:
                AnonymousClass4zX r02 = (AnonymousClass4zX) this.A00;
                audioPlayerMetadataView = r02.A04;
                if (audioPlayerMetadataView != null) {
                    whatsAppLocale = r02.getWhatsAppLocale();
                    break;
                } else {
                    throw C18270x1.A0S("audioPlayerMetadataView");
                }
            default:
                C97924zW r03 = (C97924zW) this.A00;
                audioPlayerMetadataView = r03.A04;
                whatsAppLocale = r03.A05;
                break;
        }
        audioPlayerMetadataView.setDescription(C107565bW.A0A(whatsAppLocale, (long) i));
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (this.A01 != 0) {
            super.onProgressChanged(seekBar, i, z);
            return;
        }
        C93074nr r0 = (C93074nr) this.A00;
        int progress = r0.A08.A07.getProgress();
        AnonymousClass0x2.A1I(((C30721mu) ((C30471mV) r0.A0S)).A1J, C116095pj.A13, progress);
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        C116095pj A002;
        if (this.A01 != 0) {
            super.onStopTrackingTouch(seekBar);
            return;
        }
        C93074nr r4 = (C93074nr) this.A00;
        C30721mu r3 = (C30721mu) ((C30471mV) r4.A0S);
        AnonymousClass0x2.A1I(r3.A1J, C116095pj.A13, r4.A08.A07.getProgress());
        C113895mA r1 = r4.A06.A03;
        if (r1.A0D(r3) && (A002 = r1.A00()) != null) {
            A002.A08++;
        }
    }
}
