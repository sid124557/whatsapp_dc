package X;

import com.whatsapp.conversation.ui.AudioPlayerMetadataView;

/* renamed from: X.6AA  reason: invalid class name */
public class AnonymousClass6AA implements C182298oB {
    public Object A00;
    public final int A01;

    public AnonymousClass6AA(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BRk(int i) {
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
}
