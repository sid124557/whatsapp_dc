package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.shops.ShopsProductPreviewFragment;
import java.util.LinkedList;

/* renamed from: X.9hE  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C199779hE implements Runnable {
    public final /* synthetic */ ShopsProductPreviewFragment A00;

    public final void run() {
        ShopsProductPreviewFragment shopsProductPreviewFragment = this.A00;
        int width = shopsProductPreviewFragment.A00.getWidth();
        int height = shopsProductPreviewFragment.A00.getHeight();
        Context A0G = shopsProductPreviewFragment.A0G();
        int A04 = AnonymousClass5YI.A04(A0G, 8.0f);
        LinkedList A18 = AnonymousClass0x9.A18();
        int i = A04 * 2;
        int min = Math.min((width - i) / 3, height - i);
        int i2 = 0;
        int i3 = 0;
        do {
            View view = new View(A0G);
            view.setBackgroundResource(R.drawable.rounded_grey_box);
            view.setId(AnonymousClass0YH.A00());
            shopsProductPreviewFragment.A00.addView(view);
            A18.add(view);
            i3++;
        } while (i3 < 3);
        do {
            int id = ((View) A18.get(i2)).getId();
            AnonymousClass0XZ r3 = new AnonymousClass0XZ();
            r3.A04(id).A02.A0c = min;
            r3.A04(id).A02.A0a = min;
            r3.A08(id, 3, R.id.placeholder_container, 3);
            r3.A08(id, 4, R.id.placeholder_container, 4);
            if (i2 == 0) {
                r3.A08(id, 6, R.id.placeholder_container, 6);
                r3.A08(id, 7, ((View) A18.get(1)).getId(), 6);
                r3.A04(id).A02.A0U = 1;
            } else if (i2 == 2) {
                r3.A08(id, 6, ((View) A18.get(1)).getId(), 7);
                r3.A08(id, 7, R.id.placeholder_container, 7);
            } else {
                r3.A08(id, 6, ((View) A18.get(i2 - 1)).getId(), 7);
                r3.A08(id, 7, ((View) A18.get(i2 + 1)).getId(), 6);
            }
            r3.A09(shopsProductPreviewFragment.A00);
            i2++;
        } while (i2 < 3);
        shopsProductPreviewFragment.A01.A02();
    }

    public /* synthetic */ C199779hE(ShopsProductPreviewFragment shopsProductPreviewFragment) {
        this.A00 = shopsProductPreviewFragment;
    }
}
