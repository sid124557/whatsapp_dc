package X;

import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.4xf  reason: invalid class name and case insensitive filesystem */
public class C97124xf extends C29451iq {
    public void A08() {
        Log.i("voicenote/voicenotestopped");
        Iterator A03 = C61102zi.A03(this);
        while (A03.hasNext()) {
            AnonymousClass5UH r1 = (AnonymousClass5UH) A03.next();
            if (r1 instanceof AnonymousClass56C) {
                C113245l7 r12 = ((AnonymousClass56C) r1).A00;
                r12.A2z.invalidateOptionsMenu();
                C92244mK r0 = (C92244mK) r12.A2b.A00.A00(C92244mK.class);
                if (r0 != null) {
                    r0.A0B = false;
                }
            }
        }
    }
}
