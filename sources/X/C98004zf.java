package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.4zf  reason: invalid class name and case insensitive filesystem */
public class C98004zf extends C98104zp {
    public C97924zW A00;
    public boolean A01;

    public /* bridge */ /* synthetic */ void A06(AnonymousClass3ZH r7, AnonymousClass3ZH r8, C624134x r9, List list) {
        C30721mu r5 = (C30721mu) r9;
        super.A06(r7, r8, r5, list);
        setContentDescription(AnonymousClass5YN.A01(getContext(), this.A02, this.A03, this.A05, this.A06, r5));
    }

    public C98004zf(Context context, C103445Mz r2) {
        super(context, r2);
        A02();
    }

    /* renamed from: A09 */
    public void A07(C30721mu r2, List list) {
        super.A07(r2, list);
        this.A00.setAudioMessage(r2);
    }

    public void setVoiceNoteAttachmentView(C97924zW r1) {
        this.A00 = r1;
    }
}
