package X;

import com.whatsapp.expressionstray.gifs.GifExpressionsSearchViewModel;

/* renamed from: X.3OY  reason: invalid class name */
public final class AnonymousClass3OY implements AnonymousClass4AL {
    public final /* synthetic */ GifExpressionsSearchViewModel A00;

    public AnonymousClass3OY(GifExpressionsSearchViewModel gifExpressionsSearchViewModel) {
        this.A00 = gifExpressionsSearchViewModel;
    }

    public void BaV(C49872hE r3) {
        GifExpressionsSearchViewModel gifExpressionsSearchViewModel;
        Object obj;
        int size = r3.A04.size();
        boolean z = r3.A01;
        if (size == 0) {
            gifExpressionsSearchViewModel = this.A00;
            if (!z) {
                obj = C133866i4.A00;
            } else {
                obj = C133896i7.A00;
            }
        } else if (!z) {
            gifExpressionsSearchViewModel = this.A00;
            obj = C133876i5.A00;
        } else {
            return;
        }
        gifExpressionsSearchViewModel.A02.A0H(obj);
    }
}
