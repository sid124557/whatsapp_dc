package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.6JJ  reason: invalid class name */
public abstract class AnonymousClass6JJ extends ViewPager implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: X.6h4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.whatsapp.status.playback.widget.StatusPlaybackPager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: X.6h4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: X.6h4} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0O() {
        /*
            r2 = this;
            boolean r0 = r2 instanceof com.whatsapp.status.playback.widget.StatusPlaybackPager
            if (r0 == 0) goto L_0x0012
            r1 = r2
            com.whatsapp.status.playback.widget.StatusPlaybackPager r1 = (com.whatsapp.status.playback.widget.StatusPlaybackPager) r1
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x0011
            r0 = 1
            r1.A00 = r0
        L_0x000e:
            r1.generatedComponent()
        L_0x0011:
            return
        L_0x0012:
            boolean r0 = r2 instanceof X.AnonymousClass6h4
            if (r0 == 0) goto L_0x0021
            r1 = r2
            X.6h4 r1 = (X.AnonymousClass6h4) r1
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x0011
            r0 = 1
            r1.A00 = r0
            goto L_0x000e
        L_0x0021:
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x0011
            r0 = 1
            r2.A01 = r0
            r2.generatedComponent()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6JJ.A0O():void");
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass6JJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0O();
    }
}
