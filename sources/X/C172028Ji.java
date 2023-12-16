package X;

import android.util.ArrayMap;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.8Ji  reason: invalid class name and case insensitive filesystem */
public final class C172028Ji implements C183218pg {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass4UW A01;

    public C172028Ji(AnonymousClass4UW r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public void BPD(View view, C149947On r4) {
        if (view != null && view.getTag(R.id.loaded_image_url) != null) {
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put(Integer.valueOf(this.A00), view);
            this.A01.A07.A0G(arrayMap);
        }
    }
}
